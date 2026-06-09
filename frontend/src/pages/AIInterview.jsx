import { useState } from "react";
import Navbar from "../components/Navbar";

function AIInterview() {

  const [question, setQuestion] = useState("");
  const [answer, setAnswer] = useState("");
  const [result, setResult] = useState("");

  const evaluate = async () => {

    const response = await fetch(
      "http://localhost:8080/ai/evaluate",
      {
        method: "POST",
        headers: {
          "Content-Type": "application/json"
        },
        body: JSON.stringify({
          question,
          answer
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

        <h2>🤖 AI Interview Evaluator</h2>

        <input
          className="form-control mb-3"
          placeholder="Interview Question"
          value={question}
          onChange={(e) =>
            setQuestion(e.target.value)
          }
        />

        <textarea
          className="form-control mb-3"
          rows="6"
          placeholder="Type your answer..."
          value={answer}
          onChange={(e) =>
            setAnswer(e.target.value)
          }
        />

        <button
          className="btn btn-primary"
          onClick={evaluate}
        >
          Evaluate Answer
        </button>

        <div className="mt-4">
          <pre>{result}</pre>
        </div>

      </div>
    </>
  );
}

export default AIInterview;