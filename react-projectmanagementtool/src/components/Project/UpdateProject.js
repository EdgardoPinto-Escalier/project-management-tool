import React, { Component } from 'react';
import { MdSync, MdDateRange } from 'react-icons/md';

export default class UpdateProject extends Component {
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
