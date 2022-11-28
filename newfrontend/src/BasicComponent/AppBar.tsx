import * as React from 'react';
import Box from '@mui/material/Box';
import Tab from '@mui/material/Tab';
import TabContext from '@mui/lab/TabContext';
import TabList from '@mui/lab/TabList';
import TabPanel from '@mui/lab/TabPanel';
import { useState } from 'react';

type Features = {
    components:React.ReactNode[];
    label:String[];
  }


export default function LabTabs(props:Features) {
  const [value, setValue] = useState("1");
  const [featuresContent, setFeaturesContent] = useState(props.components);
  const [featureName, setFeatureName] = useState(props.label)

  console.log(featureName)
  const handleChange = (event: React.SyntheticEvent, newValue: string) => {
    setValue(newValue);
  };

  return (
    <Box sx={{  typography: 'body1' }}>
     
      <TabContext value={value}>
        <Box sx={{backgroundColor: "#FF4B4B", color: "#ffffff" , height: "50%"}} >
        <img src={'/images/RemeD.png'} alt="REMED Logo" width={40} height={40} style={{float: "left"}} />
          <TabList onChange={handleChange} sx={{  display:'inline-block', paddingLeft: '30px' }} >
            
          
              {
              featureName.map((item,i) =>
              <Tab key = {i} label={item} value={i+1+""} sx={{color: "#ffffff"}}/>         
              )
              }
          

          </TabList>

        </Box>
        <div>
              {
              featuresContent.map((item,i) =>
              <TabPanel key={i} value={i+1+""}>{item}</TabPanel>           
              )
              }
            </div>
      </TabContext>
    </Box>
  );
}