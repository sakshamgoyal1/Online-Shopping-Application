
import React from "react";
import { connect} from "react-redux";
import { createCustomer } from "../../actions/CustomerActions";
import PropTypes from"prop-types"
class AddCustomer extends React.Component {
    constructor(props) {
        super(props)
        this.state = {
            firstName: "",
            lastName: "",
            mobileNumber: "",
            email: "",
            streetNo: "",
            buildingName: "",
            city: "",
            state: "",
            country: "",
            pincode: ""
        }
    }

    onChange = (event) => {
        this.setState({ [event.target.name]: event.target.value })
    }
    onSubmit = (event) => {
        event.preventDefault()

        const newCustomer = {

            firstName: this.state.firstName,
            lastName: this.state.lastName,
            mobileNumber: this.state.mobileNumber,
            email: this.state.email,
            streetNo: this.state.streetNo,
            buildingName: this.state.buildingName,
            city: this.state.city,
            state: this.state.state,
            country: this.state.country,
            pincode: this.state.pincode
        }
        this.props.createCustomer(newCustomer,this.props.history)
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
                                    <input type="text" className="form-control form-control-sm" placeholder="It is not updatable please fill it correctly"
                                        name="mobileNumber"
                                        value={this.state.mobileNumber}
                                        onChange={this.onChange} />
                                </div>
                                <div className="form-group">
                                    <label for="email" className="form-label">Email</label>
                                    <input type="email" className="form-control form-control-sm" placeholder="you@example.com"
                                        name="email"
                                        value={this.state.email}
                                        onChange={this.onChange} />
                                </div>
                                <div className="form-group">
                                    <label for="streetNo" className="form-label">Street No</label>
                                    <input type="text" className="form-control form-control-sm " placeholder="123.."
                                        name="streetNo"
                                        value={this.state.streetNo}
                                        onChange={this.onChange} />
                                </div>
                                <div className="form-group">
                                    <label for="buildingName" className="form-label">Building Name</label>
                                    <input type="text" className="form-control form-control-sm " placeholder=""
                                        name="buildingName"
                                        value={this.state.buildingName}
                                        onChange={this.onChange} />
                                </div>
                                <div className="form-group">
                                    <label for="City" className="form-label">City</label>
                                    <input type="text" className="form-control form-control-sm " placeholder=""
                                        name="city"
                                        value={this.state.city}
                                        onChange={this.onChange} />
                                </div>
                                <div className="form-group">
                                    <label for="State" className="form-label">State</label>
                                    <input type="text" className="form-control form-control-sm " placeholder=""
                                        name="state"
                                        value={this.state.state}
                                        onChange={this.onChange} />
                                </div>

                                <div className="form-group">
                                    <label for="country" className="form-label">Country</label>
                                    <input type="text" className="form-control form-control-sm " placeholder=""
                                        name="country"
                                        value={this.state.country}
                                        onChange={this.onChange} />
                                </div>
                                <div className="form-group">
                                    <label for="pincode" className="form-label">Pincode</label>
                                    <input type="text" className="form-control form-control-sm " placeholder=""
                                        name="pincode"
                                        value={this.state.pincode}
                                        onChange={this.onChange} />
                                </div>
                                <input type="submit" className="btn btn-warning btn-block mt-4 text-white font-weight-bold" />
                            </form>

                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

AddCustomer.propTypes={
    createCustomer: PropTypes.func.isRequired
}
export default connect(null,{createCustomer})(AddCustomer)


