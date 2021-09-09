import axios from 'axios'

async function GetUsers() {
    axios.get("http://localhost:8084/users")
        .then((res) => res.data)
}

module.exports = GetUsers;