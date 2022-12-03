import * as React from 'react';
import Avatar from '@mui/material/Avatar';
import Button from '@mui/material/Button';
import CssBaseline from '@mui/material/CssBaseline';
import TextField from '@mui/material/TextField';
import FormControlLabel from '@mui/material/FormControlLabel';
import Checkbox from '@mui/material/Checkbox';
import Link from '@mui/material/Link';
import Grid from '@mui/material/Grid';
import Box from '@mui/material/Box';
import LockOutlinedIcon from '@mui/icons-material/LockOutlined';
import Typography from '@mui/material/Typography';
import Container from '@mui/material/Container';
import { createTheme, ThemeProvider } from '@mui/material/styles';
import { Routes, Route } from 'react-router-dom';
import Patient from '../RemePages/PatientPage';
import RemeDLogin from '../RemePages/LoginPage';



const theme = createTheme();

export default function SignUp() {
  return (
    <div className='LogInPane' >
    <Routes>
       <Route path="/patient" element={<Patient />} />
       <Route path="/login" element={<RemeDLogin/>} />
   </Routes>
   <Box sx={{background: 'linear-gradient(0deg, rgba(255,0,0,0.2780462526807598) 0%, rgba(255,255,255,1) 0%, rgba(230,9,9,0.29485297536983546) 0%, rgba(233,0,3,1) 0%, rgba(247,139,147,0.9867297260701156) 0%, rgba(247,143,151,1) 0%, rgba(255,255,255,1) 61%, rgba(255,255,255,0.919502835313813) 70%)'
, padding: "10px", width: "500px", height: "450px"}}>
       <div style={{paddingTop:"80px"}}>
            <Grid container spacing={2}>
              <Grid item xs={12} sm={6}>
                <TextField
                  autoComplete="given-name"
                  name="firstName"
                  required
                  fullWidth
                  id="firstName"
                  label="First Name"
                  autoFocus
                />
              </Grid>
              <Grid item xs={12} sm={6}>
                <TextField
                  required
                  fullWidth
                  id="lastName"
                  label="Last Name"
                  name="lastName"
                  autoComplete="family-name"
                />
              </Grid>
              <Grid item xs={12}>
                <TextField
                  required
                  fullWidth
                  id="email"
                  label="Email Address"
                  name="email"
                  autoComplete="email"
                />
              </Grid>
              <Grid item xs={12}>
                <TextField
                  required
                  fullWidth
                  name="password"
                  label="Password"
                  type="password"
                  id="password"
                  autoComplete="new-password"
                />
              </Grid>
              <Grid item xs={12}>
                <FormControlLabel
                  control={<Checkbox value="allowExtraEmails" color="primary" />}
                  label="I want to receive inspiration, marketing promotions and updates via email."
                />
              </Grid>
            </Grid>
            <Button
              type="submit"
              fullWidth
              variant="contained"
              sx={{ mt: 3, mb: 2 ,background:"red"}}
            >
              Sign Up
            </Button>
            <Grid container justifyContent="flex-end">
              <Grid item>
             
              </Grid>
            </Grid>
         
        </div>
        </Box>
    </div>
  );
}