import axios from "axios";

const API = axios.create({
  baseURL: "http://localhost:2418/api",
});

export default API;
