import { useEffect, useState } from "react";
import Navbar from "../components/Navbar";
import { getDashboard } from "../services/dashboardService";

function Dashboard() {

  const [stats, setStats] = useState({
    totalAttempts: 0,
    correctAnswers: 0,
    wrongAnswers: 0,
    accuracy: 0
  });

  useEffect(() => {
    loadDashboard();
  }, []);

  const loadDashboard = async () => {
    const data = await getDashboard();
    setStats(data);
  };

  return (
    <>
      <Navbar />

      <div className="container mt-5">

        <h2 className="text-center mb-5">
          Performance Dashboard 📊
        </h2>

        <div className="row">

          <div className="col-md-3">
            <div className="card text-center shadow p-3">
              <h5>Total Attempts</h5>
              <h2>{stats.totalAttempts}</h2>
            </div>
          </div>

          <div className="col-md-3">
            <div className="card text-center shadow p-3">
              <h5>Correct Answers</h5>
              <h2>{stats.correctAnswers}</h2>
            </div>
          </div>

          <div className="col-md-3">
            <div className="card text-center shadow p-3">
              <h5>Wrong Answers</h5>
              <h2>{stats.wrongAnswers}</h2>
            </div>
          </div>

          <div className="col-md-3">
            <div className="card text-center shadow p-3">
              <h5>Accuracy</h5>
              <h2>{stats.accuracy.toFixed(2)}%</h2>
            </div>
          </div>

        </div>

      </div>
    </>
  );
}

export default Dashboard;