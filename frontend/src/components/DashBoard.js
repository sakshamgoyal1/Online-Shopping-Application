import React from "react";
import CustomerItem from "./customers/CustomerItem";
import { Link } from "react-router-dom";
import { connect } from "react-redux";
import {getCustomers} from "../actions/CustomerActions"
import PropTypes from "prop-types"
class DashBoard extends React.Component {
    componentDidMount(){
        this.props.getCustomers()
    }
    render() {
        const {customers}=this.props.customers
        return (
            <div className="customers">
                <div className="container">
                    <div className="row">
                        <div className="col-md-12">
                            <h1 className="display-7 text-center">All Customers Logged In</h1>
                            <br />
                            <Link to="/addCustomer" className="btn btn-lg btn-info btn-warning font-weight-bold text-white">
                                <i className="fa fa-user" aria-hidden="true">Create Your Profile</i>
                            </Link>
                            <br />
                            <hr />
                           {
                               customers.map((customer)=>
                               (<CustomerItem key={customer.id} customer={customer}/>))
                           }
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

DashBoard.propTypes={
    getCustomers:PropTypes.func.isRequired,
    customers:PropTypes.object.isRequired
}
const mapStateToProps=(state)=>({
    customers:state.customers,
})
export default connect(mapStateToProps,{getCustomers})(DashBoard)


