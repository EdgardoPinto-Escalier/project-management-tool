import React from 'react';
import { Link } from "react-router-dom";
import { MdAdd } from 'react-icons/md';

const CreateProjectButton = () => {
  return (
    <React.Fragment>
      <Link to="/addProject" className="btn btn-lg btn-dark">
        <MdAdd className="md-icon" /> CREATE NEW PROJECT
      </Link>
    </React.Fragment>
  );
}

export default CreateProjectButton;
