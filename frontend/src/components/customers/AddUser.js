import React from "react";
import { connect} from "react-redux";
import { createUser } from "../../actions/Useractions";
import PropTypes from"prop-types"
class AddUser extends React.Component {
    constructor(props) {
        super(props)
        this.state = {
            firstName: "",
            lastName: "",
            mobileNumber: "",
            email: "",
            password: ""
        }
    }

    onChange = (event) => {
        this.setState({ [event.target.name]: event.target.value })
    }
    onSubmit = (event) => {
        event.preventDefault()

        const newUser = {

            firstName: this.state.firstName,
            lastName: this.state.lastName,
            mobileNumber: this.state.mobileNumber,
            email: this.state.email,
            password: this.state.streetNo,
           
        }
        this.props.createUser(newUser,this.props.history)
    }
    render() {
        return (    
            <div className="project">
                <div className="container">
                    <div className="row">
                        <div className="col-md-8 m-auto">
                            <h1 className="display-7 text-center">Login & Security</h1>
                            <hr />
                            <form onSubmit={this.onSubmit}>
                                <div className="form-group">
                                    <label for="firstName" className="form-label">First name</label>
                                    <input type="text" className="form-control form-control-sm " placeholder="  "
                                        name="firstName"
                                        value={this.state.firstName}
                                        onChange={this.onChange} />
                                </div>
                                <div className="form-group">
                                    <label for="lastName" className="form-label">Last name</label>
                                    <input type="text" className="form-control form-control-sm" placeholder=""
                                        name="lastName"
                                        value={this.state.lastName}
                                        onChange={this.onChange} />
                                </div>
                                <div className="form-group">
                                    <label for="mobileNumber" className="form-label">Mobile Number</label>
                                    <input type="text" className="form-control form-control-sm" placeholder=""
                                        name="mobileNumber"
                                        value={this.state.mobileNumber}
                                        onChange={this.onChange} />
                                </div>
                                <div className="form-group">
                                    <label for="email" className="form-label">Email</label>
                                    <input type="email" className="form-control form-control-sm" placeholder=""
                                        name="email"
                                        value={this.state.email}
                                        onChange={this.onChange} />
                                </div>
                                <div className="form-group">
                                    <label for="password" className="form-label">Street No</label>
                                    <input type="text" className="form-control form-control-sm " placeholder=""
                                        name="password"
                                        value={this.state.streetNo}
                                        onChange={this.onChange} />
                                </div>
                                <input type="submit" className="btn btn-primary btn-block mt-4 text-white " />
                            </form>

                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

AddUser.propTypes={
    createUser: PropTypes.func.isRequired,
}
export default connect(null,{createUser})(AddUser)
