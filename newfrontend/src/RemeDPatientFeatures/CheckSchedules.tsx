import '../CSS/ComponentsCSS.css';
import { Button, colors, TextField, ButtonProps, Box, Grid } from "@mui/material";
import { Stack } from "@mui/system";
import { styled } from '@mui/material/styles';
import SimpleAccordion from '../BasicComponent/TableSchedule';
import DateSetter from '../BasicComponent/DatePicker';

const StyledButton = styled(Button)<ButtonProps>(({ theme }) => ({
    
    backgroundColor: '#FF4B4B',
    fontFamily: 'Sarala, sans-serif',
    fontSize: '18px',
    marginTop: '20px',
    width: '260px',
    top: '10px',
    '&:hover': {
        backgroundColor: '#AB8686',
    },
}));


export default function CheckSchedule() {
    return (
        <div style={{ textAlign: "center" }}>
            <h1 className="h1">
                Schedules
            </h1>
            <div  className='Schedulebuttons' style={{ float: "right", padding: "50px" }}>
            <Grid container spacing={1} columns={2} style={{ position:"sticky"}}>
            
            <div > 
            <DateSetter/>
            </div>
            <div>
            <StyledButton variant="contained" >
                Filter by Date
            </StyledButton>
            </div>
            </Grid>
            </div>
            <Stack >
                <Box>
                    records goes here in a table
                    <SimpleAccordion/>
                </Box>
            </Stack>
        </div>
    )
}