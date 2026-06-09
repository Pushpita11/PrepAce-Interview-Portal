import { useEffect, useState } from "react";
import Navbar from "../components/Navbar";
import { getResults } from "../services/resultService";

function Results() {

  const [results, setResults] = useState([]);

  useEffect(() => {
    loadResults();
  }, []);

  const loadResults = async () => {
    const data = await getResults();
    setResults(data);
  };

  return (
    <>
      <Navbar />

      <div className="container mt-5">

        <h2 className="mb-4">
          Test History 📋
        </h2>

        <table className="table table-bordered">

          <thead>
            <tr>
              <th>User</th>
              <th>Score</th>
              <th>Result</th>
            </tr>
          </thead>

          <tbody>

            {results.map((result, index) => (

              <tr key={index}>
                <td>{result.userName}</td>
                <td>{result.score}</td>
                <td>{result.message}</td>
              </tr>

            ))}

          </tbody>

        </table>

      </div>
    </>
  );
}

export default Results;