import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import PropTypes from 'prop-types';
import { connect } from 'react-redux';
import { deleteProject } from '../../actions/projectActions';
import { MdAssignment, MdCached, MdDelete } from "react-icons/md";

class ProjectItem extends Component {

  onDeleteClick = id => {
    this.props.deleteProject(id);
  }

  render() {
    const { project } = this.props;
    return (
      <div className="container">
        <div className="card card-body bg-light mb-3">
          <div className="row">
            <div className="col-2">
              <span className="mx-auto tag">{project.projectIdentifier}</span>
            </div>
            <div className="col-lg-6 col-md-4 col-8">
              <h3>{project.projectName}</h3>
              <p>{project.description}</p>
            </div>
            <div className="col-md-4 d-none d-lg-block">
              <ul className="list-group">
                <a href="#">
                  <li className="list-group-item board">
                    <MdAssignment className="md-icon-board pboard" /> PROJECT
                    BOARD
                  </li>
                </a>
                <Link to={`/updateProject/${project.projectIdentifier}`}>
                  <li className="list-group-item update">
                    <MdCached className="md-icon-update pupdate" /> UPDATE
                    PROJECT INFO
                  </li>
                </Link>

                <li
                  className="list-group-item delete"
                  onClick={this.onDeleteClick.bind(
                    this,
                    project.projectIdentifier
                  )}
                >
                  <MdDelete className="md-icon-delete pdelete" /> DELETE PROJECT
                </li>
              </ul>
            </div>
          </div>
        </div>
        <div
          class="modal fade"
          tabindex="-1"
          role="dialog"
          aria-labelledby="mySmallModalLabel"
        >
          <div class="modal-dialog modal-sm" role="document">
            <div class="modal-content">...</div>
          </div>
        </div>
      </div>
    );
  }
}

ProjectItem.propTypes = {
  deleteProject: PropTypes.func.isRequired
};

export default connect(null, {deleteProject})(ProjectItem);
