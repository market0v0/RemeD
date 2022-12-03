
import './App.css';
import Patient from './RemePages/PatientPage';
import RemeDLogin from './RemePages/LoginPage';
import { Route, Routes } from 'react-router-dom';

import { useContext } from 'react';
import { UserIDContext } from './Context/UserIdContext';




let counter = 0
function App() {
 {/** 
  const userid = useContext(UserIDContext );
  let id = Number(CheckLogIn('mark','1234'));
  if(id > 0){
    counter++;

    if(counter === 1){
      console.log(id)
    }
  }

 */}
 
 
 // console.log(userid?.userID)

  return (
    <div>

      <Routes>
      <Route path='/' element={<RemeDLogin/>}/>
      <Route path='/login' element={<RemeDLogin/>}/>
      <Route path='/patient' element={<Patient/>}/>
      </Routes>

    </div>
  );
}

export default App;
