import React from 'react';
import logo from './logo.svg';
import './App.css';
import MainScreen from './Components/MainScreen';
import Patient from './RemePages/Patient';
import RemeDLogin from './RemePages/Login';
import UserIdContext from './Context/UserIdContext';



function App() {

 
  return (
    <div>
      {/* 
      <Patient/>
      */}
      <UserIdContext>
      <RemeDLogin/>
      </UserIdContext>
    </div>
  );
}

export default App;
