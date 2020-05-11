import React, { Component } from 'react';
import { MdAssignment, MdCached, MdDelete } from "react-icons/md";

class ProjectItem extends Component {
  render() {
    return (
      <div className="container">
        <div className="card card-body bg-light mb-3">
          <div className="row">
            <div className="col-2">
              <span className="mx-auto">VUE JS</span>
            </div>
            <div className="col-lg-6 col-md-4 col-8">
              <h3>VueJS - C# Project</h3>
              <p>Social media type site that built using VueJS and C#</p>
            </div>
            <div className="col-md-4 d-none d-lg-block">
              <ul className="list-group">
                <a href="#">
                  <li className="list-group-item board">
                    <MdAssignment className="md-icon-board" /> PROJECT BOARD
                  </li>
                </a>
                <a href="#">
                  <li className="list-group-item update">
                    <MdCached className="md-icon-update" /> UPDATE PROJECT INFO
                  </li>
                </a>
                <a href="#">
                  <li className="list-group-item delete">
                    <MdDelete className="md-icon-delete" /> DELETE PROJECT
                  </li>
                </a>
              </ul>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default ProjectItem;
