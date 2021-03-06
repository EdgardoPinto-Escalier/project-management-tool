// Actions to be used for this project
import axios from 'axios';
import { GET_ERRORS, GET_PROJECTS, GET_PROJECT, DELETE_PROJECT } from './types';

export const createProject = (project, history) => async dispatch => {
  try {
    const res = await axios.post("/api/project", project)
    history.push("/dashboard");
    dispatch({
      type: GET_ERRORS,
      payload: {}
    });

  } catch(err) {
    dispatch({
      type: GET_ERRORS,
      payload: err.response.data
    });
  }
};

// Here we get all projects at once
export const getProjects = () => async dispatch => {
  const res = await axios.get("/api/project/all-projects");
  dispatch({
    type: GET_PROJECTS,
    payload: res.data
  });
};

// Here we get an speciphic project via the ID
export const getProject = (id, history) => async dispatch => {
  try {
    const res = await axios.get(`/api/project/${id}`);
    dispatch({
      type: GET_PROJECT,
      payload: res.data
    });
  } catch(error) {
    history.push("/dashboard");
  }
};

// Here we delete a project via the ID
export const deleteProject = id => async dispatch => {
  if(window.confirm("Are you sure you wish to delete this project?")) {
    await axios.delete(`/api/project/${id}`);
    dispatch({
      type: DELETE_PROJECT,
      payload: id,
    });
  }
};