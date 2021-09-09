const axios = require('axios')






const helloUrl = "http://localhost:8082/users/hello";

async function SayJello() {
    console.log("Calling say hello function");
    axios.get(helloUrl)
        .then(res => res)
}
// SayJello();

// return (
//     <div>
//         <button onClick={SayJello} >Test Hello</button>
//     </div>
// )


exports.SayJello = SayJello
