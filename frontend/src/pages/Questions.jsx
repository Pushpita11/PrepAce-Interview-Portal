import { useEffect, useState } from "react";
import Navbar from "../components/Navbar";
import {
  getQuestions,
  submitAnswer
} from "../services/questionService";
import { useLocation } from "react-router-dom";
function Questions() {

  const userName = localStorage.getItem("userName");

  const [questions, setQuestions] = useState([]);
  const [selectedAnswers, setSelectedAnswers] = useState({});
  const [timeLeft, setTimeLeft] = useState(600);
  const [selectedCategory, setSelectedCategory] = useState("All");
    const location = useLocation();

useEffect(() => {
  const params = new URLSearchParams(location.search);

  const category = params.get("category");

  if (category) {
    setSelectedCategory(category);
  }
}, [location]);
  const [mockStarted, setMockStarted] = useState(false);
  const [mockQuestions, setMockQuestions] = useState([]);
  const [score, setScore] = useState(0);

  useEffect(() => {
    loadQuestions();
  }, []);

  useEffect(() => {

    if (!mockStarted) return;

    if (timeLeft <= 0) {
      alert("⏰ Time is up! Mock Test Finished.");
      return;
    }

    const timer = setInterval(() => {
      setTimeLeft((prev) => prev - 1);
    }, 1000);

    return () => clearInterval(timer);

  }, [timeLeft, mockStarted]);

  const loadQuestions = async () => {
    try {
      const data = await getQuestions();
      setQuestions(data);
    } catch (error) {
      console.error(error);
    }
  };

  const startMockTest = () => {

    const shuffled = [...questions].sort(
      () => Math.random() - 0.5
    );

    const selected = shuffled.slice(0, 10);

    setMockQuestions(selected);
    setMockStarted(true);
    setTimeLeft(600);
    setScore(0);

    alert("🎯 Mock Test Started!");
  };

  const handleOptionChange = (questionId, answer) => {

    setSelectedAnswers({
      ...selectedAnswers,
      [questionId]: answer
    });
  };

  const handleSubmit = async (questionId) => {

    const answer = selectedAnswers[questionId];

    if (!answer) {
      alert("Please select an answer first!");
      return;
    }

    const request = {
      questionId: questionId,
      answer: answer
    };

    try {

      const result = await submitAnswer(request);

      if (result.score === 1) {
        setScore((prev) => prev + 1);
      }

      alert(result.message);

    } catch (error) {

      console.error(error);
      alert("Failed to submit answer");
    }
  };

  const filteredQuestions =
    selectedCategory === "All"
      ? (mockStarted ? mockQuestions : questions)
      : (mockStarted ? mockQuestions : questions).filter(
          (q) => q.category === selectedCategory
        );

  if (!userName) {
    return (
      <div className="container mt-5 text-center">
        <h2>Please Login First 🔒</h2>

        <a
          href="/login"
          className="btn btn-primary mt-3"
        >
          Go To Login
        </a>
      </div>
    );
  }

  return (
    <>
      <Navbar />

      <div className="container mt-5">

        <div className="alert alert-warning text-center shadow-sm">
          <h4>
            ⏱ Time Left : {Math.floor(timeLeft / 60)}:
            {(timeLeft % 60).toString().padStart(2, "0")}
          </h4>
        </div>

        <div className="alert alert-success text-center">
          <h5>
            🎯 Current Score : {score}
          </h5>
        </div>

        <div className="text-center mb-5">

          <h1 className="text-primary fw-bold">
            Interview Questions 🚀
          </h1>

          <p className="lead">
            Welcome {userName}! Practice technical and aptitude questions.
          </p>

          <div className="mb-4">

            <select
              className="form-select"
              value={selectedCategory}
              onChange={(e) =>
                setSelectedCategory(e.target.value)
              }
            >
              <option value="All">All Categories</option>
              <option value="Java">Java</option>
              <option value="DSA">DSA</option>
              <option value="DBMS">DBMS</option>
              <option value="Operating Systems">
                Operating Systems
              </option>
              <option value="Computer Networks">
                Computer Networks
              </option>
              <option value="Aptitude">
                Aptitude
              </option>
              <option value="SQL">SQL</option>
<option value="HR">HR</option>
            </select>

          </div>

          <button
            className="btn btn-primary"
            onClick={startMockTest}
          >
            🎯 Start Mock Test
          </button>

        </div>
        <h5>Selected Category: {selectedCategory}</h5>
<h5>Total Questions: {filteredQuestions.length}</h5>
        {filteredQuestions.map((q) => (

          <div
            className="card mb-4 shadow border-0"
            key={q.id}
          >

            <div className="card-body">

              <h5 className="card-title mb-4">
                {q.question}
              </h5>

              <div className="form-check mb-2">
                <input
                  className="form-check-input"
                  type="radio"
                  name={`question-${q.id}`}
                  onChange={() =>
                    handleOptionChange(q.id, q.optionA)
                  }
                />
                <label className="form-check-label">
                  {q.optionA}
                </label>
              </div>

              <div className="form-check mb-2">
                <input
                  className="form-check-input"
                  type="radio"
                  name={`question-${q.id}`}
                  onChange={() =>
                    handleOptionChange(q.id, q.optionB)
                  }
                />
                <label className="form-check-label">
                  {q.optionB}
                </label>
              </div>

              <div className="form-check mb-2">
                <input
                  className="form-check-input"
                  type="radio"
                  name={`question-${q.id}`}
                  onChange={() =>
                    handleOptionChange(q.id, q.optionC)
                  }
                />
                <label className="form-check-label">
                  {q.optionC}
                </label>
              </div>

              <div className="form-check mb-3">
                <input
                  className="form-check-input"
                  type="radio"
                  name={`question-${q.id}`}
                  onChange={() =>
                    handleOptionChange(q.id, q.optionD)
                  }
                />
                <label className="form-check-label">
                  {q.optionD}
                </label>
              </div>

              <button
                className="btn btn-success"
                onClick={() => handleSubmit(q.id)}
              >
                Submit Answer
              </button>

            </div>

          </div>

        ))}

      </div>
    </>
  );
}

export default Questions;