import React from "react";
import { Link } from "react-router-dom";
class Header extends React.Component{
    render(){
        return(
            <nav className="navbar navbar-expand-sm navbar-dark bg-dark mb-4 ">
        <div className="container">
            <a className="navbar-brand" href="Dashboard.html">
                Shopping Application
            </a>
            <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#mobile-nav">
                <span className="navbar-toggler-icon">
                </span> 
            </button>

            <div className="collapse navbar-collapse font-weight-bold" id="mobile-nav">
                <ul className="navbar-nav mr-auto ">
                    <li className="nav-item">
                        <Link className="nav-link text-white" to="/dashboard">
                            Dashboard
                        </Link>
                    </li>

                    <li className="nav-item">
                        <a className="nav-link text-white" href="cart.html">
                            Cart
                        </a>
                    </li>
                    <li className="nav-item">
                        <a className="nav-link text-white" href="product.html">
                            Product
                        </a>
                    </li>
                   
                </ul>
                <form className="d-flex">
                    <input className="form-control me-2" type="search" placeholder="Search" aria-label="Search"/> &nbsp; &nbsp; 
                    <button className="btn btn-outline-warning" type="submit">Search</button>
                  </form>
            </div>
        </div>
    </nav>

        )
    }
}
export default Header
