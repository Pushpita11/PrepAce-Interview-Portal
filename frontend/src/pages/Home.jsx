import Navbar from "../components/Navbar";

function Home() {
  return (
    <>
      <Navbar />

      <div className="container">

        {/* Hero Section */}
        <div className="text-center mt-5 mb-5">

          <h1
            className="fw-bold text-primary"
            style={{ fontSize: "4rem" }}
          >
            PrepAce 🚀
          </h1>

          <h2 className="fw-semibold mb-4">
            Crack Your Dream Job With Confidence
          </h2>

          <p className="lead text-muted">
            Practice aptitude, coding, DSA, DBMS, OS, CN and technical
            interview questions all in one platform.
          </p>

          <div className="mt-4">

            <a
              href="/register"
              className="btn btn-primary btn-lg me-3"
            >
              Get Started
            </a>

            <a
              href="/questions"
              className="btn btn-outline-primary btn-lg"
            >
              Practice Now
            </a>

          </div>
        </div>

        {/* Statistics Section */}
        <div className="row text-center mb-5">

          <div className="col-md-3 mb-3">
            <div className="card shadow-sm border-0 p-3">
              <h2 className="text-primary">20+</h2>
              <p>Questions</p>
            </div>
          </div>

          <div className="col-md-3 mb-3">
            <div className="card shadow-sm border-0 p-3">
              <h2 className="text-success">7</h2>
              <p>Categories</p>
            </div>
          </div>

          <div className="col-md-3 mb-3">
            <div className="card shadow-sm border-0 p-3">
              <h2 className="text-danger">10 Min</h2>
              <p>Mock Test Timer</p>
            </div>
          </div>

          <div className="col-md-3 mb-3">
            <div className="card shadow-sm border-0 p-3">
              <h2 className="text-warning">100%</h2>
              <p>Placement Focused</p>
            </div>
          </div>

        </div>

        {/* Features Section */}
        {/* Features Section */}
<div className="row mb-5">

  <div className="col-md-3 mb-4">
    <div
      className="card shadow h-100 text-center p-4"
      style={{ cursor: "pointer" }}
      onClick={() =>
        window.location.href =
          "/questions?category=Aptitude"
      }
    >
      <h1>📘</h1>

      <h3 className="mt-3">
        Aptitude
      </h3>

      <p className="text-muted">
        Practice quantitative aptitude and logical reasoning.
      </p>
    </div>
  </div>

  <div className="col-md-3 mb-4">
    <div
      className="card shadow h-100 text-center p-4"
      style={{ cursor: "pointer" }}
      onClick={() =>
        window.location.href =
          "/questions?category=Java"
      }
    >
      <h1>💻</h1>

      <h3 className="mt-3">
        Technical MCQs
      </h3>

      <p className="text-muted">
        Java, DSA, DBMS, OS and CN questions.
      </p>
    </div>
  </div>

  <div className="col-md-3 mb-4">
    <div
      className="card shadow h-100 text-center p-4"
      style={{ cursor: "pointer" }}
      onClick={() =>
        window.location.href =
          "/questions?mock=true"
      }
    >
      <h1>🎯</h1>

      <h3 className="mt-3">
        Mock Tests
      </h3>

      <p className="text-muted">
        Attempt tests and evaluate your preparation level.
      </p>
    </div>
  </div>

  <div className="col-md-3 mb-4">
    <div
      className="card shadow h-100 text-center p-4"
      style={{ cursor: "pointer" }}
      onClick={() =>
        window.location.href =
          "/dashboard"
      }
    >
      <h1>📊</h1>

      <h3 className="mt-3">
        Analytics
      </h3>

      <p className="text-muted">
        Track performance, accuracy and test history.
      </p>
    </div>
  </div>

</div>
        {/* Footer */}
        <footer className="text-center py-4 border-top mt-5">

          <h5 className="text-primary">
            PrepAce 🚀
          </h5>

          <p className="text-muted">
            Your Placement Preparation Partner
          </p>

          <p className="small text-muted">
            © 2026 PrepAce. All Rights Reserved.
          </p>

        </footer>

      </div>
    </>
  );
}

export default Home;