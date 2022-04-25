
import React from "react";
import { Link } from "react-router-dom";
import { connect } from "react-redux";
import { deleteCustomer } from "../../actions/CustomerActions";
import PropTypes from "prop-types"
class CustomerItem extends React.Component {
    onDeleteClick =id => {
        this.props.deleteCustomer(id)
    }
    render() {
        const { customer } = this.props
        return (
            <div className="container card ">
                <div className="card-body">
                    <p><b><u>Name</u></b>: <i>{customer.firstName} {customer.lastName}</i></p>
                    <p><b><u>Number</u></b>: <i>{customer.mobileNumber}</i></p>
                    <p><b><u>Email</u></b>: <i>{customer.email}</i></p>
                    <p><b><u>Street No</u></b>: <i>{customer.streetNo}</i></p>
                    <p><b><u>Building Name</u></b>: <i>{customer.buildingName}</i></p>
                    <p><b><u>City</u></b>: <i>{customer.city}</i></p>
                    <p><b><u>State</u></b>: <i>{customer.state}</i></p>
                    <p><b><u>Country</u></b>: <i>{customer.country}</i></p>
                    <p><b><u>Pincode</u></b>: <i>{customer.pincode}</i></p>
                    <Link to={`/updateCustomer/${customer.mobileNumber}`}>
                        <li className="list-group-item update">
                            <i className="fa fa-edit pr-1">Edit</i>
                        </li>
                    </Link>
                    <a href="">
                        <li className="list-group-item delete" onClick={this.onDeleteClick.bind(this, customer.mobileNumber)}>

                            <i className="fa fa-trash">Remove Yourself</i>
                        </li>
                    </a>
                    <a href="">
                        <li className="list-group-item cart">
                            <i className="fa fa-shopping-cart">Your Cart</i>
                        </li>
                    </a>
                </div>
            </div>
        )
    }
}
CustomerItem.propTypes = {
    deleteCustomer: PropTypes.func.isRequired,
}
export default connect(null, { deleteCustomer })(CustomerItem)

