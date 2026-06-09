import axios from "axios";

const API_URL = "http://localhost:8080/users";

export const getUsers = async () => {
  const response = await axios.get(API_URL);
  return response.data;
};

export const registerUser = async (user) => {
  const response = await axios.post(
    `${API_URL}/register`,
    user
  );

  return response.data;
};