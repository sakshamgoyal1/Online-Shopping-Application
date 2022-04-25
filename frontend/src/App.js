import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css'
import DashBoard from './components/DashBoard';
import Header from './components/common/Header';
import AddCustomer from './components/customers/AddCustomer';
import { Provider } from 'react-redux';
import store from "./store"
import { BrowserRouter as Router, Route } from 'react-router-dom';
import UpdateCustomer from './components/customers/UpdateCustomer';

function App() {
  // const history=createBrowserHistory() 
  return (
    <Provider store={store}>
      <Router>
        <Header />
        <Route exact path="/dashboard" component={DashBoard} />
        <Route exact path="/addCustomer" component={AddCustomer} />
        <Route exact path="/updateCustomer/:id" component={UpdateCustomer} />
      </Router>
    </Provider>
  )
}

export default App;
