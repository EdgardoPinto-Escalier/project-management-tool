import React, { Component } from 'react';
import { getProject } from '../../actions/projectActions';
import PropTypes from 'prop-types';
import { connect } from 'react-redux';
import classnames from 'classnames';
import { MdSync, MdDateRange } from 'react-icons/md';

class UpdateProject extends Component {

  componentDidMount() {
    const {id} = this.props.match.params;
    this.props.getProject(id, this.props.history);
  }

  render() {
    return (
      <div className="register">
        <div className="container">
          <div className="row">
            <div className="col-md-8 m-auto">
              <h1 className="text-center pt-2"><MdSync className="mb-2 mr-2"/> UPDATE PROJECT FORM</h1>
              <hr />
              <form>
                <div className="form-group">
                  <input type="text" className="form-control form-control-lg " placeholder="Project Name" />
                </div>
                <div className="form-group">
                  <input type="text" className="form-control form-control-lg" placeholder="Unique Project ID"
                    disabled />
                </div>
                
                        <div className="form-group">
                  <textarea className="form-control form-control-lg" placeholder="Project Description"></textarea>
                </div>
                <h5><MdDateRange className="md-icon-calender" /> START DATE</h5>
                <div className="form-group">
                  <input type="date" className="form-control form-control-lg" name="start_date" />
                </div>
                <h5><MdDateRange classNameName="md-icon-calender"/> ESTIMATED END DATE</h5>
                <div className="form-group">
                  <input type="date" className="form-control form-control-lg" name="end_date" />
                </div>

                <button type="submit" className="btn btn-lg btn-dark btn-block mt-4"><MdSync className="mb-1 mr-2"/> UPDATE</button>
              </form>
            </div>
          </div>
        </div>
      </div>
    )
  }
}

UpdateProject.propTypes = {
  getProject: PropTypes.func.isRequired,
  project: PropTypes.object.isRequired
};

const mapStateToProps = state => ({
  project: state.project.project
});

export default connect(mapStateToProps, {getProject})(UpdateProject);
