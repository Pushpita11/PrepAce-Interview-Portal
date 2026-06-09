import { BrowserRouter, Routes, Route } from "react-router-dom";
import Users from "./pages/Users";
import Home from "./pages/Home";
import Register from "./pages/Register";
import Questions from "./pages/Questions";
import Results from "./pages/Results";
import Dashboard from "./pages/Dashboard";
import Login from "./pages/Login";
import AIQuestions from "./pages/AIQuestions";
import AIInterview from "./pages/AIInterview";
function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/users" element={<Users />} />
        <Route path="/" element={<Home />} />

        <Route path="/register" element={<Register />} />
        <Route
  path="/ai-questions"
  element={<AIQuestions />}

/>
            <Route
  path="/ai-interview"
  element={<AIInterview />}
/>

        <Route path="/questions" element={<Questions />} />
         <Route path="/login" element={<Login />} />
        <Route path="/results" element={<Results />} />

        <Route path="/dashboard" element={<Dashboard />} />

      </Routes>
    </BrowserRouter>
  );
}

export default App;