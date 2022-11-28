import '../CSS/ComponentsCSS.css';
import { Button, colors, TextField, ButtonProps } from "@mui/material";
import { Stack } from "@mui/system";
import {styled } from '@mui/material/styles';



const StyledTextField = styled(TextField)({
  '& .MuiOutlinedInput-root': {
    "& > fieldset": { borderColor: "#FF4B4B" },
  }
});

const StyledButton = styled(Button)<ButtonProps>(({ theme }) => ({
  backgroundColor: '#FF4B4B',
  fontFamily: 'Sarala, sans-serif',
  fontSize: '18px',
  marginTop: '20px',
  '&:hover': {
    backgroundColor: '#AB8686',
  },
}));

export default function BookAppointment() {

    return (
        <div style={{textAlign: "center"}}>
            <h1>
                Book Appointment for In Person Health Consultation
            </h1>

            <Stack className='Stack' sx={{display: "inline-block"}}>
                <h3>
                    Doctor Specialty
                </h3>

                <StyledTextField
                    id="doctor-specialty"
                    className='TextField'
                />
            </Stack> <br />

            <Stack className='Stack' sx={{display: "inline-block"}}>
                <h3>
                    Appointment Date
                </h3>

                <StyledTextField
                    id="appointment-date"
                    className='TextField'
                />

            </Stack> <br />

            <Stack className='Stack' sx={{display: "inline-block"}}>
                <h3>
                    Appointment Time
                </h3>

                <StyledTextField
                    id="appointment-time"
                    className='TextField'
                />

            </Stack > <br />

            <Stack className='Stack' sx={{display: "inline-block"}} >

                <h3>
                    Consultation Purpose
                </h3>

                <StyledTextField
                    id="consultation-purpose"
                    className='TextField'
                />

            </Stack> <br />


            <StyledButton variant="contained" className='Button'>
                Book Appointment
            </StyledButton>

        </div>
    )
}