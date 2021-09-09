const axios = require('axios')

const user = {
    id: 17,
    // firstName: "testFname",
    // lastName: "testLname",
    // email: "test@email",
    // address: "testAddress",
    // telephone: "testTelephone",
    // password: "testPassword"

}

const currentholding = {
    currentUsd: 100.2,
    currentBitcoin: 5.0,
    stockValue: 200.
}

test('Get successful result of the API call', async () => {
    const apiUrl = "http://localhost:8082/users/hello";
    // eslint-disable-next-line jest/valid-expect-in-promise
    axios.get(apiUrl)
        .then(r => {
            const status = r.status
            expect(status).toEqual(200)
            return r
        }
        )
        .catch(err => err)
})

// test('post new record', async () => {
//     const apiUrl = "http://localhost:8082/users/post";
//     // eslint-disable-next-line jest/valid-expect-in-promise
//     await axios(apiUrl, {
//         method: 'post',
//         Accept: 'application/json, text/plain, */*',
//         headers: { 'content-type': 'application/json' },
//         data: {
//             firstName: "munib",
//             lastName: "khan",
//             email: "munib.test@email",
//             address: "123 apple st",
//             telephone: "573-645-8026",
//             currentholding

//         }
//     })
//         .then(res => {
//             const status = res.status
//             expect(status).toEqual(201)
//             return res
//         })
//         .catch(err => console.log(err))
// })

test('post new holdings record', async () => {
    const apiUrl = "http://localhost:8082/holdings/post";
    // eslint-disable-next-line jest/valid-expect-in-promise
    await axios(apiUrl, {
        method: 'post',
        Accept: 'application/json, text/plain, */*',
        headers: { 'content-type': 'application/json' },
        data: {
            currentUsd: 100.20,
            currentBitcoin: 5,
            stockValue: 200,
            user: { id: 18 }
        }
    })
        .then(res => {
            const status = res.status
            expect(status).toEqual(201)
            return res
        })
        .catch(err => console.log(err))
})

