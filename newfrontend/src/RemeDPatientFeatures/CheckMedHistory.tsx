import '../CSS/ComponentsCSS.css';
import { Button, colors, TextField, ButtonProps, Box } from "@mui/material";
import { Stack } from "@mui/system";
import {styled } from '@mui/material/styles';

const StyledButton = styled(Button)<ButtonProps>(({ theme }) => ({
    backgroundColor: '#FF4B4B',
    fontFamily: 'Sarala, sans-serif',
    fontSize: '18px',
    marginTop: '20px',
    position:"absolute", 
    right:"150px",
     '&:hover': {
      backgroundColor: '#AB8686',
    },
  }));


export default function CheckMedHistory (){
    return (
        <div style={{textAlign: "center"}}>
            <h1 className="h1">
                Medical Records
            </h1>

            <StyledButton variant="contained" >
                Filter by Date
            </StyledButton>

            <Stack >
                <Box>
                    records goes here in a table
                </Box>
            </Stack>
        </div>
    )
}