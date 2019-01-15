import React, { Component } from 'react';

class AddDep extends Component{
    
    data = {};
    state = {
        show : false
    }
    
    onClick = () => {
        this.setState({
            show : true
        });
    }
    
    onCancel = e => {
        e.preventDefault();
        this.setState({
            show : false
        });
    }
    
    add = e =>{
        e.preventDefault();
        //console.log("data",this.data);
        this.props.onDepAdded(this.data);
        this.setState({
            show : false
        });
        this.data = {}
    }

    handleChange = event =>{
        console.log(event.target.value);
        this.data[event.target.id] = event.target.value;
    }


    render(){
        return (
            <div>
                <button onClick={this.onClick}>NEW Department</button>
                {this.state.show && (
                <div>
                    <form>
                        <label>NAME </label><input type="text" id="name" onChange={this.handleChange} /><br />
                       
                        <button onClick={this.add}>ADD</button>
                        <button onClick={this.onCancel}>CANCEL</button>
                    </form>
                </div>
                    )}
            </div>
        );
    }
}

export default AddDep;