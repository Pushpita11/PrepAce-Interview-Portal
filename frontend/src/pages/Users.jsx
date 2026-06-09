import { useEffect, useState } from "react";
import Navbar from "../components/Navbar";
import { getUsers } from "../services/userService";

function Users() {

  const [users, setUsers] = useState([]);

  useEffect(() => {

    loadUsers();

  }, []);

  const loadUsers = async () => {

    const data = await getUsers();

    setUsers(data);

  };

  return (
    <>
      <Navbar />

      <div className="container mt-5">

        <h2 className="mb-4">
          Registered Users
        </h2>

        <table className="table table-bordered">

          <thead>
            <tr>
              <th>Name</th>
              <th>Email</th>
            </tr>
          </thead>

          <tbody>

            {users.map((user, index) => (

              <tr key={index}>
                <td>{user.name}</td>
                <td>{user.email}</td>
              </tr>

            ))}

          </tbody>

        </table>

      </div>
    </>
  );
}

export default Users;