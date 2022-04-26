import axios from "axios";
import {GET_ERRORS, GET_ORDERS, GET_ORDER, DELETE_ORDER} from "./Types"
export const createOrder=(order, history) => async (dispatch)=>{
    try{
        const res = await axios.post("http://localhost:8080/api/orders", order) 
        history.push("/dashboard")

    }
    catch(error){
        dispatch(
            {
                type:GET_ERRORS,
                payload:error.response.data,
            }
        )
    }
}

export const getOrders=()=>async (dispatch)=>{
    const res=await axios.get("http://localhost:8080/api/orders/all")
    dispatch(
        {
            type:GET_ORDERS,
            payload:res.data
        }
    )
}

export const getOrder=(id,history)=>async (dispatch)=>{
    const res=await axios.get('http://localhost:8080/api/orders/${id}')
    dispatch(
        {
            type:GET_ORDER,
            payload:res.data
        }
    )
}

export const deleteOrder= id=> async(dispatch)=>{
    if(
        window.confirm("Do you want to delete your data...?")
    ){
        await axios.delete('http://localhost:8080/api/orders/${id}')
        dispatch(
            {
                type:DELETE_ORDER,
                payload: id
            }
        )
    }

}
