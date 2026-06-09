import { useState } from "react";
import Navbar from "../components/Navbar";
import { registerUser } from "../services/userService";

function Register() {

  const [user, setUser] = useState({
    name: "",
    email: "",
    password: ""
  });

  const handleChange = (e) => {
    setUser({
      ...user,
      [e.target.name]: e.target.value
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await registerUser(user);

      alert("User Registered Successfully!");

      console.log(response);

      setUser({
        name: "",
        email: "",
        password: ""
      });

    } catch (error) {
      console.error(error);
      alert("Registration Failed");
    }
  };

  return (
    <>
      <Navbar />

      <div className="container mt-5">

        <h2 className="text-center mb-4">
          Register User
        </h2>

        <form onSubmit={handleSubmit}>

          <div className="mb-3">
            <input
              type="text"
              name="name"
              className="form-control"
              placeholder="Enter Name"
              value={user.name}
              onChange={handleChange}
            />
          </div>

          <div className="mb-3">
            <input
              type="email"
              name="email"
              className="form-control"
              placeholder="Enter Email"
              value={user.email}
              onChange={handleChange}
            />
          </div>

          <div className="mb-3">
            <input
              type="password"
              name="password"
              className="form-control"
              placeholder="Enter Password"
              value={user.password}
              onChange={handleChange}
            />
          </div>

          <button
            type="submit"
            className="btn btn-primary"
          >
            Register
          </button>

        </form>

      </div>
    </>
  );
}

export default Register;