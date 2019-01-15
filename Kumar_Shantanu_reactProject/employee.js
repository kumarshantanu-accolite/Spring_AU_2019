import React, { Component } from "react";


import AddEmployee from "./employee/addemplo";
import ListEmployees from "./employee/listemplo";
import AddDepartment from "./depatment/adddepartment";
import ListDepartment from "./depatment/listdeparment";



class EmployeeComponent extends Component{
    state = {
        employees: [
            {
              name: "raviteja",
              lname: "V",
              age: 21,
              designation: "intern",
              department:"hr",
              location: "Mangalore, Karnataka,India, Asia, World, Earth"
            },
            {
              name: "Devraj",
              lname: "M",
              age: 21,
              designation: "intern",
              department:"hr",
              location: "Bangalore,Karnataka,India, Asia, World, Earth"
            },
            {
              name: "kumar",
              lname: "santanu",
              age: 26,
              designation: "intern",
              department:"hr",
              location: "Patna, Bihar,India, Asia, World, Earth"
            }
          ] , 
          departments: [
            {
              name:"hr"
            },
            {
              name:"IT"
            },
            {
              name:"technical"
            }
          ]  
    }
    
    
  
    onEmpAdded = newEmpData =>{
        console.log("new data",newEmpData);
        let employees = [...this.state.employees];
        employees.push(newEmpData);
        this.setState({employees:employees});
    }

    onDepAdded = newDepData =>{
        console.log("new data",newDepData);
        let departments = [...this.state.departments];
        departments.push(newDepData);
        this.setState({departments:departments});
    }

    render() {
        return(
        <React.Fragment>
            <AddEmployee onEmpAdded={this.onEmpAdded} departments={this.state.departments}/>
            <ListEmployees employees={this.state.employees} departments={this.state.departments}/>
            <AddDepartment onDepAdded={this.onDepAdded}/>
            <ListDepartment departments={this.state.departments} />
        </React.Fragment>
        );
    }
  
}

export default EmployeeComponent;