import axios from "axios";
import {GET_ERRORS, GET_USERS, GET_USER, DELETE_USER} from "./Types"
export const createUser=(User,history) => async (dispatch)=>{
    try{
     const res= await axios.post("http://localhost:8080/api/users",user)
     history.push("/dashboard")
    }
    catch(error){
        dispatch({
            type:GET_ERRORS,
            payload:error.response.data,
        })
    }
}

export const getUsers=()=>async (dispatch)=>{
    const res=await axios.get("http://localhost:8080/api/users/all")
    dispatch({
        type:GET_USERS,
        payload:res.data
    })
}

export const getUser=(email,history)=>async (dispatch)=>{
    const res=await axios.get(`http://localhost:8080/api/users/${email}`)
    dispatch({
        type:GET_USER,
        payload:res.data
    })
}

export const deleteUser=id=>async (dispatch)=>{
    if(
        window.confirm("Do you want to delete your data...?"
        )
    ){
    await axios.delete(`http://localhost:8080/api/users/${email}`)
    dispatch({
        type:DELETE_USER,
        payload: email
    })
}
}
