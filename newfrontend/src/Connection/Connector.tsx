import axios from 'axios';
import React, { useContext, useState } from 'react';
import { useEffect } from 'react';
import { UserIDContext } from '../Context/UserIdContext';
import reportWebVitals from '../reportWebVitals';
let userID:number;


class LoginService{
  
  login(username: string, password: string) {

    const log_in ='http://localhost:8090/User/login?username='+username+'&password='+password;
    return axios.get(log_in)
    .then((repos) => {
      if(repos.data.accessToken){
        localStorage.setItem("validID", JSON.stringify(repos.data))
      }
      return repos.data
    });
    
  }

  getID(){
    const id = localStorage.getItem("validID")
    return Number(id)
  }


}
export default new LoginService();
