
import * as React from 'react';
import RemeDTextFeild from '../BasicComponent/TextBox';
import styled from '@emotion/styled';
import { Button, TextField } from '@mui/material';
import '../CSS/ComponentsCSS.css';

import {
    BrowserRouter as Router,
    Route,
    redirect,
} from "react-router-dom";
import { UserIDContext } from '../Context/UserIdContext';


const StyledTextField = styled(TextField)({
    '& .MuiOutlinedInput-root': {
        "& > fieldset": { borderColor: "#FF4B4B" },
    }
});
let i = 0;
export default function RemeDLogin() {
    const getUserID = React.useContext(UserIDContext);
    const [username, setUsername] = React.useState('');
    const [password, setPassword] = React.useState('');

    const handleChangeUsername = (event: { target: { value: React.SetStateAction<string>; }; }) => {
        setUsername(event.target.value);
        console.log(event.target.value);
    };
    const handleChangePassword = (event: { target: { value: React.SetStateAction<string>; }; }) => {
        setPassword(event.target.value);
        console.log(event.target.value);
    };
    const handlerClickLogin = () => {
        console.log(username, password)
        
        if(username === "mark" && password === "123"){
            
            getUserID?.CatchUserID(1)
            
            console.log(getUserID!.userID)
            if(getUserID!.userID > 0){
                alert("mark")
            }
        };

    }
    return (
        <div>
            <div>
                <div className='LoginLogo'>
                    <img src={'/images/remedlogo.png'} alt="Image"
                        style={{
                            maxHeight: '300px',
                            minHeight: '300px'
                        }} />
                </div>


                <TextDisplay>
                    <p> Discover Top Doctors <br/> {getUserID?.userID}</p>
                </TextDisplay>

                <div className='LogInUsername'>
                    <StyledTextField
                        id="username"
                        label="Username"
                        className='TextField' onChange={handleChangeUsername} value={username} />
                </div>

                <div className='LogInPassword'>
                    <StyledTextField
                        id="password"
                        label="Password"
                        type={"password"}
                        className='TextField' onChange={handleChangePassword} value={password} />
                </div>
                <div style={{ position: "absolute", left: "850px", top: "500px" }}>
                    <Button onClick={handlerClickLogin} variant='contained'
                        sx={{ background: 'red', color: 'white' }}>Log in</Button>
                </div>


            </div>




        </div>
    );
}


const TextDisplay = styled.div`
  position: absolute;
  width: 741px;
  height: 591px;
  left: 500px;
  top: 30px;
  
  font-family: 'Raleway';
  font-style: normal;
  font-weight: 700;
  font-size: 100px;
  line-height: 100px;
  /* or 100% */
  
  text-align: center;
  letter-spacing: -1px;
  
  color: #F31717;
`;




function render() {
    throw new Error('Function not implemented.');
}

