
import { combineReducers } from "redux";
import CustomerReducer from "./CustomerReducer";
import errorReducer from "./errorReducer";
export default combineReducers({
    errors:errorReducer,
    customers: CustomerReducer,
})
