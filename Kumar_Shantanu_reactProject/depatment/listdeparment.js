import React, { Component } from 'react';


class ListDep extends Component{
    render(){
        console.log("Departments",this.props.departments);
        let newEmp = this.props.departments.map((department, i) =>{
            return i;
        });
        return (
        <div>
            <h1>List of Departments</h1>
            <table>
                <tr>
                    <th>Name</th>
                   
                </tr>
            
            {
                this.props.departments && this.props.departments.map((department, i)=>{
                    return(
                    <tr key = {department.name}> 
                        <td>{department.name}</td>
                        
                    </tr>
                );
            })
        }
            </table>
        </div>
        );
    }
}

export default ListDep;