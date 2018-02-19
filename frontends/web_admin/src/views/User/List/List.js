import React, { Component } from 'react';
import axios from 'axios';

class List extends Component {

  constructor() {
      super();
      this.state={
        users:[]
      };

      axios.get('http://localhost:9090/api/users').then(function (response) {
        console.log(response);
        this.setState({users:response.data})
      }.bind(this))
      .catch(function (error) {
        console.log(error);
      });

  }



  render() {
    console.log(this.state)
    return(
        <div className="animated fadeIn">
          <ul>
            { this.state.users.map(function(user, i){
              return <li key={i}>{user.fullName}-{user.email}</li>
              })
            }
          </ul>
        </div>
   )
}
}
export default List;
