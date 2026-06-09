import React from "react";

function Navbar() {

  const userName = localStorage.getItem("userName");

  const handleLogout = () => {
    localStorage.clear();
    window.location.href = "/login";
  };

  return (
    <nav className="navbar navbar-expand-lg navbar-dark bg-dark">

      <div className="container">

        <a className="navbar-brand fw-bold" href="/">
          PrepAce 🚀
        </a>

        <button
          className="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarNav"
        >
          <span className="navbar-toggler-icon"></span>
        </button>

        <div
          className="collapse navbar-collapse"
          id="navbarNav"
        >

          <ul className="navbar-nav me-auto">

            <li className="nav-item">
              <a className="nav-link" href="/">
                Home
              </a>
            </li>

            <li className="nav-item">
              <a className="nav-link" href="/register">
                Register
              </a>
            </li>

            <li className="nav-item">
              <a className="nav-link" href="/login">
                Login
              </a>
            </li>

            <li className="nav-item">
              <a className="nav-link" href="/questions">
                Questions
              </a>
            </li>

            <li className="nav-item">
              <a className="nav-link" href="/results">
                Results
              </a>
            </li>
              <a className="nav-link" href="/ai-questions">
  AI Questions
</a>
            <li className="nav-item">
              <a className="nav-link" href="/dashboard">
                Dashboard
              </a>
            </li>

            <li className="nav-item">
              <a className="nav-link" href="/users">
                Users
              </a>
            </li>
            <li className="nav-item">
  <a className="nav-link" href="/ai-questions">
    🤖 AI Questions
  </a>
</li>
<li className="nav-item">
  <a className="nav-link" href="/ai-interview">
    🤖 AI Interview
  </a>
</li>

          </ul>

          <div className="d-flex align-items-center">

            <span className="text-warning me-3">
              👤 {userName || "Guest"}
            </span>

            {userName && (
              <button
                className="btn btn-danger btn-sm"
                onClick={handleLogout}
              >
                Logout
              </button>
            )}

          </div>

        </div>

      </div>

    </nav>
  );
}

export default Navbar;