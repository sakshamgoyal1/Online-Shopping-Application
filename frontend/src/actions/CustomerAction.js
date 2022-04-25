import axios from "axios";
import { GET_ERRORS, GET_CUSTOMERS, GET_CUSTOMER, DELETE_CUSTOMER } from "./types"
export const createCustomer = (customer, history) => async (dispatch) => {
    try {
        const res = await axios.post("http://localhost:8080/api/customers", customer)
        history.push("/dashboard")
    }
    catch (error) {
        dispatch({
            type: GET_ERRORS,
            payload: error.response.data
        })
    }
}

export const getCustomers = () => async (dispatch) => {
    const res = await axios.get("http://localhost:8080/api/customers/all")
    dispatch({
        type: GET_CUSTOMERS,
        payload: res.data,
    })
}

export const getCustomer = (id, history) => async (dispatch) => {
    const res = await axios.get(`http://localhost:8080/api/customers/${id}`)
    dispatch({
        type: GET_CUSTOMER,
        payload: res.data,
    })
}

export const deleteCustomer = id => async (dispatch) => {
    if ( window.confirm("Do you want to delete your data...?" )) {
        await axios.delete(`http://localhost:8080/api/customers/${id}`)
        dispatch({
            type: DELETE_CUSTOMER,
            payload: id,
        })
    }
}
