import axios from "axios";

const API_URL = "http://localhost:8080/questions";

export const getQuestions = async () => {
  const response = await axios.get(API_URL);
  return response.data;
};

export const submitAnswer = async (answerData) => {
  const response = await axios.post(
    `${API_URL}/submit`,
    answerData
  );

  return response.data;
};