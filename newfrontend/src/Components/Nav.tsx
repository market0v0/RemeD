/* export default function Nav (){


    return (
        <div style={{backgroundColor: "#FF4B4B", color: "#ffffff" , width:"1500px", height: "50px"}}>
            
            <img src="images/remedlogo.png" alt="REMED Logo" width={40} height={40} style={{float: "left"}}/>

            <nav style={{fontSize: "20px", wordSpacing: "0px", padding: "10px 0"}}>
                <a href="/Components/BookAppointment.tsx"> Book Appointment </a>  &nbsp; &nbsp;
                Manage Schedules &nbsp;
                Reserve Slot for Medical Laboratory Test&nbsp;
                Check Medical History &nbsp;
                Check Medical Results for Laboratory Test &nbsp;
            </nav>
                
               


        </div>
    )
} */

import './ComponentsCSS.css';
import * as React from 'react';
import {Box, Tab} from '@mui/material';
import {TabContext, TabList, TabPanel} from '@mui/lab';
import BookAppointment from './BookAppointment';
import ReserveSlot from './ReserveSlot';
import CheckMedHistory from './CheckMedHistory';



export default function Nav() {
  const [value, setValue] = React.useState('1');

  const handleChange = (event: React.SyntheticEvent, newValue: string) => {
    setValue(newValue);
  };

  return (
    <Box sx={{ width: '100%', typography: 'body1' }}>
      <TabContext value={value}>
        <Box sx={{backgroundColor: "#FF4B4B", color: "#ffffff" , width:"1500px", height: "50px"}} >
        
          <img src={'images/remedlogo.png'} alt="REMED Logo" width={40} height={40} style={{float: "left"}}/>
         
          <TabList onChange={handleChange} aria-label="lab API tabs example"sx={{  display:'inline-block', paddingLeft: '30px', }} >
            <Tab label="Book Appointment" value="1"/>
            <Tab label="Reserve Slot" value="2"/>
            <Tab label="Check Medical History" value="3" className='Tab'/>
          </TabList>

        </Box>

        <TabPanel value="1">{<BookAppointment/>}</TabPanel>
        <TabPanel value="2">{<ReserveSlot/>}</TabPanel>
        <TabPanel value="3">{<CheckMedHistory/>}</TabPanel>
      </TabContext>
    </Box>
  );
}