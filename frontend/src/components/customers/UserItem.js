import React from "react";
import { Link } from "react-router-dom";
import { connect } from "react-redux";
import { deleteUser } from "../../actions/Useractions";
import PropTypes from "prop-types"
class UserItem extends React.Component {
    onDeleteClick = id => {
        this.props.deleteUser(email)
    }
    render() {
        const { user } = this.props
        return (
            <div class="container">
            <div class="card card-body bg-light mb-3">
                <div class="row">
                    <div class="col-lg-6 col-md-4 col-8">
                        <p>{user.firstName} {user.lastName}</p>
                    </div>
                    <div class="col-md-4 d-none d-lg-block">
                        <ul class="list-group">
                           
                            <a href="#">
                                <li class="list-group-item update">
                                    <i class="fa fa-edit pr-1">Update User Info</i>
                                </li>
                            </a>
                            <a href="">
                                <li class="list-group-trash delete">
                                    <i class="fa fa-minus-circle pr-1">Delete User</i>
                                </li>
                            </a>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
       
        )
    }
}
UserItem.propTypes = {
    deleteUser: PropTypes.func.isRequired,
}
export default connect(null, { deleteUser })(UserItem)
