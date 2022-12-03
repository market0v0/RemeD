
import * as React from 'react';
import RemeDTextFeild from '../BasicComponent/TextBox';
import styled from '@emotion/styled';
import { AppBar, Box, Button, Fade, FormControlLabel, Grid, IconButton, Paper, Switch, TextField, Theme, Toolbar, Typography } from '@mui/material';
import '../CSS/ComponentsCSS.css';
import { RouteComponentProps } from '@reach/router';
import { BrowserRouter as Router, Route, Link, BrowserRouter, Routes, Navigate, useNavigate } from "react-router-dom";
import { UserIDContext } from '../Context/UserIdContext';
import Patient from './PatientPage';
import LoginPane from '../BasicComponent/LoginPane';
import { useState } from 'react';
import SignUp from '../BasicComponent/SignUpPane';


let interval: string | number | NodeJS.Timer | undefined = undefined;


const login = (
    <div >
        <LoginPane />
    </div>
);
const signup = (
    <div>
        <SignUp/>
    </div>
);



export default function RemeDLogin() {
    const [pane, setPane] = React.useState(login);
    const [loginClick, setLoginClick] = React.useState(false);
    const [signUpClick, setSignupClick] = React.useState(false);
    const [active, setActive] = React.useState(`url("/images/loginBackground.png")`);
    const ShowLogin = () => {
        setLoginClick(true);
        setPane(login)
        setActive(`url("/images/loginActive.png")`)
    };
    const ShowSignUp = () => {
        setLoginClick(true);
        setPane(signup)
        setActive(`url("/images/loginActive.png")`)
    };
    const HideLogin = () => {
        setLoginClick(false);
        setSignupClick(false)
        setActive(`url("/images/loginBackground.png")`)
    };
    {/* 
    const [running, setRunning] = useState(true);
    const [progress, setProgress] = useState(0);
    React.useEffect(() => {
        if (true) {
          interval = setInterval(() => {
            setProgress((prev) => prev + 1);console.log(progress)
          }, 100);
          
        } else {
          clearInterval(interval);
        }
      }, [running]);
    
      React.useEffect(() => {
        if (progress === slide.length) {
          setRunning(true);
          setProgress(0)
        }
      }, [progress]);
      */}
    return (


        <div className='LogInBgtry' style={{ backgroundImage: active }}>
            <Routes>
                <Route path="/login" element={<RemeDLogin />} />
                <Route path='/patient' element={<Patient/>}/>
            </Routes>
            <Box sx={{ height: 180 }}>
                <div  style={{ float: "right", padding: "20px" }}>
                    <nav className='landingbuttons'>
                    <Grid container spacing={2} columns={2} style={{ position:"sticky"}}>
                    <div style={{ padding: "20px" }}>
                            <Button onClick={ShowLogin}
                                sx={{color: 'black', alignContent: "center" }} >
                                <b>About us</b></Button>
                        </div>

                        <div style={{ padding: "20px" }}>
                            <Button onClick={ShowLogin} 
                                sx={{color: 'black', alignContent: "center" }} >
                                <b>Sign In</b></Button>
                        </div>

                        <div style={{ padding: "20px" }}>
                            <Button onClick={ShowSignUp} 

                                sx={{  color: 'black', alignContent: "center" }} >
                                <b>Sign Up</b></Button>
                        </div>

                    </Grid>
                    </nav>
                </div>

                <div style={{ position: "absolute", top: "70px", width: "100%", height: "100%" }} onClick={HideLogin}>
                </div>
                
                    <div>
                        <Box sx={{ display: 'flex' }} style={{ alignContent: "center" }}>
                            
                            <Fade in={loginClick}>{pane}</Fade>
                       
                        </Box>
                    </div>
 {/* <div >
                        <Box sx={{ display: 'flex' }} style={{ alignContent: "center", paddingTop: "10px" }}>
                            <Fade in={signUpClick}>{signup}</Fade>
                        </Box>
                    </div>
                   <div className={`overlay ${!checked ? "" : 'visible'}`} onClick={HideLogin}></div>*/}
              
            </Box>


        </div>

    );

}


