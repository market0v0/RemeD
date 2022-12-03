import { Grid, Button, styled, TextField, Box } from '@mui/material';
import { read } from 'fs';
import React from 'react'
import { Route, Routes } from 'react-router-dom';
import Connector from '../Connection/Connector';
import Patient from '../RemePages/PatientPage';



const StyledTextField = styled(TextField)({
    '& .MuiOutlinedInput-root': {
        "& > fieldset": { borderColor: "#FF4B4B" },
    }
});
let success = "#";
function LoginPane() {

    const [username, setUsername] = React.useState('');
    const [password, setPassword] = React.useState('');
    const [check, setCheck] = React.useState('#');
    const [valid,setValid] = React.useState(false)
    // const [validcolor, setValidcolor] = React.useState('white');


    const handleChangeUsername = (event: { target: { value: React.SetStateAction<string>; }; }) => {
        setUsername(event.target.value);
        console.log(event.target.value);
    };
    const handleChangePassword = (event: { target: { value: React.SetStateAction<string>; }; }) => {
        setPassword(event.target.value);
        console.log(event.target.value);
    };
    const handlerClickLogin = (event: React.MouseEvent) => {
        const p = Connector.login(username, password)
        p.then(value => {
            console.log("value "+value);
           
            if(Number(value)!== 0){
                console.log(Number(value));
                success = "/patient"
                setCheck('/patient')
                setValid(true)
                console.log(success)
            }

          }).catch(err => {
            console.log(err); 
          });
        }
    return (
        <div className='LogInPane'>
             <Routes>
                <Route path="/patient" element={<Patient />} />
            </Routes>
            <Box sx={{background: 'linear-gradient(0deg, rgba(255,0,0,0.2780462526807598) 0%, rgba(255,255,255,1) 0%, rgba(230,9,9,0.29485297536983546) 0%, rgba(233,0,3,1) 0%, rgba(247,139,147,0.9867297260701156) 0%, rgba(247,143,151,1) 0%, rgba(255,255,255,1) 61%, rgba(255,255,255,0.919502835313813) 80%)'
        , padding: "10px", width: "350px", height: "450px"}}>
                <div style={{paddingTop:"70px"}}>
                <Grid container spacing={2} columns={1} sx={{paddingTop: "30px"}}>
                    <Grid item xs={2}>
                        <div>
                            <StyledTextField
                                id="username"
                                label="Username"
                                className='TextField' onChange={handleChangeUsername} value={username} />
                        </div>
                    </Grid>
                    <Grid item xs={2}>
                        <div >
                            <StyledTextField
                                id="password"
                                label="Password"
                                type={"password"}
                                className='TextField' onChange={handleChangePassword} value={password} />
                        </div>
                    </Grid>
                    <Grid item xs={1}>
                        <div className='craeteAccount'>
                            <a href="/patient" style={{ color: "#ff0000" }}>
                                {"Don't have an account? Sign Up"}
                            </a>
                        </div>
                    </Grid>
                    <Grid item xs={1}>
                        <div className='craeteAccount'>
                            <Button onClick={(event) => { handlerClickLogin(event) }} variant='contained'
                                sx={{ background: 'red', color: 'white', alignContent: "center" }}>
                                 <a  href={success+""} style={{ color: "white" }}>{"Log In"}</a>
                            
                                 </Button> 
                        </div>
                    </Grid>
                  

                </Grid>
                </div>
            </Box>
        </div>
    )
}

export default LoginPane