import { useState } from "react";
import Navbar from "../components/Navbar";

function AIQuestions() {

  const [topic, setTopic] = useState("");
  const [result, setResult] = useState("");

  const generateQuestions = async () => {

    const response = await fetch(
      "http://localhost:8080/ai/generate",
      {
        method: "POST",
        headers: {
          "Content-Type": "application/json"
        },
        body: JSON.stringify({
          topic: topic
        })
      }
    );

    const data = await response.text();

    setResult(data);
  };

  return (
    <>
      <Navbar />

      <div className="container mt-5">

        <h2>🤖 AI Question Generator</h2>

        <input
          className="form-control mb-3"
          placeholder="Java"
          value={topic}
          onChange={(e) =>
            setTopic(e.target.value)
          }
        />

        <button
          className="btn btn-primary"
          onClick={generateQuestions}
        >
          Generate
        </button>

        <div className="mt-4">
          <pre>{result}</pre>
        </div>

      </div>
    </>
  );
}

export default AIQuestions;