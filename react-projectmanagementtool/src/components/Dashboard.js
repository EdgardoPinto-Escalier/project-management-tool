import React, { Component } from 'react';
import ProjectItem from './Project/ProjectItem';
import { MdAdd } from "react-icons/md";

class Dashboard extends Component {
  render() {
    return (
      <div className="projects">
        <div className="container">
          <div className="row">
            <div className="col-md-12">
              <h1 className="display-5 text-center">PROJECTS</h1>
              <br />
              <a href="ProjectForm.html" className="btn btn-lg btn-dark">
                <MdAdd className="md-icon" /> CREATE NEW PROJECT
              </a>
              <br />
              <hr />

              <ProjectItem />

            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default Dashboard;
