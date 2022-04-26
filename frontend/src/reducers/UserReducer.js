import { GET_USERS, GET_USER, DELETE_USER } from "../actions/Types";
const initialState={
    users:[],
    user:{}
}

export default function(state=initialState,action){
    switch(action.type){
        case GET_USERS:
            return{
                ...state,
                users:action.payload,
            }
            case GET_USER:
                return{
                    ...state,
                    user: action.payload,
                }

            case DELETE_USER:
                return{
                    ...state,
                    users:action.payload,
                }
            default:
                return state
    }
}
