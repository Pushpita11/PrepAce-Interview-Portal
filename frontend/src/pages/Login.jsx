import { useState } from "react";
import Navbar from "../components/Navbar";

function Login() {

  const [email, setEmail] = useState("");
  const [name, setName] = useState("");

  const handleLogin = () => {

    localStorage.setItem("userName", name);
    localStorage.setItem("userEmail", email);

    alert("Login Successful!");
  };

  return (
    <>
      <Navbar />

      <div className="container mt-5">

        <h2 className="text-center mb-4">
          Login
        </h2>

        <div className="card p-4 shadow">

          <input
            className="form-control mb-3"
            placeholder="Enter Name"
            value={name}
            onChange={(e) => setName(e.target.value)}
          />

          <input
            className="form-control mb-3"
            placeholder="Enter Email"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />

          <button
            className="btn btn-primary"
            onClick={handleLogin}
          >
            Login
          </button>

        </div>

      </div>
    </>
  );
}

export default Login;