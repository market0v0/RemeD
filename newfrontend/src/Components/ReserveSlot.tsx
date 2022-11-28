import './ComponentsCSS.css';
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
  /* '&:hover': {
    backgroundColor: purple[700],
  }, */
}));


export default function ReserveSlot (){
    
    return(
        <div style={{textAlign: "center"}}>
            <h1>
                Reserve Slot for Medical Laboratory Examination
            </h1>

            <Stack className='Stack' sx={{display: "inline-block"}}>
                <h3>Medical Laboratory Test</h3>

                <StyledTextField
                    id="labtest-type"
                    border-color="#FF4B4B"
                    variant= "outlined"
                    className='TextField'
                />
            </Stack> <br />

            <Stack className='Stack' sx={{display: "inline-block"}}>
                <h3>Reservation Date</h3>

                <StyledTextField
                    id="reservation-date"
                    className='TextField'
                />
            </Stack> <br />


            <Stack className='Stack' sx={{display: "inline-block"}}>
                <h3>Doctor's Order #</h3>

                <StyledTextField
                    id="doctors-order-no"
                    className='TextField'
                />
            </Stack> <br />


            <StyledButton variant="contained" >
                Reserve Slot
            </StyledButton>
        </div>
    )

}