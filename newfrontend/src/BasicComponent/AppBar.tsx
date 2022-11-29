import '../CSS/ComponentsCSS.css';
import * as React from 'react';
import Box from '@mui/material/Box';
import Tab from '@mui/material/Tab';
import TabContext from '@mui/lab/TabContext';
import TabList from '@mui/lab/TabList';
import TabPanel from '@mui/lab/TabPanel';
import { useState } from 'react';
import { Tabs } from '@mui/material';
import AccountMenu from '../Components/DropMenu';

type Features = {
  components: React.ReactNode[];
  label: String[];
}


export default function LabTabs(props: Features) {
  const [value, setValue] = useState("1");
  const [featuresContent, setFeaturesContent] = useState(props.components);
  const [featureName, setFeatureName] = useState(props.label)

  console.log(featureName)
  const handleChange = (event: React.SyntheticEvent, newValue: string) => {
    setValue(newValue);
  };

  return (
    <Box sx={{ typography: 'body1', bgcolor: 'background.paper', }}>

      <TabContext value={value} >
        <Box sx={{ backgroundColor: "#FF4B4B", color: "#ffffff", height: "70px" }} >
          <img src={'/images/remedlogo.png'} alt="REMED Logo" width={80} height={70} style={{ float: "left" }} />
          <div className='DropMenu'>
            <AccountMenu />
          </div>
          
          <TabList onChange={handleChange} sx={{
            display: 'inline-block',
            paddingLeft: '0px',
            "& button.Mui-selected": {
              backgroundColor: "#AF2C0C",
              color: "white",
              fontWeight: "bold"
            }
          }} >


            {
              featureName.map((item, i) =>
                <Tab key={i} label={item} value={i + 1 + ""}
                  sx={{
                    color: "#ffffff", padding: "15px 30px",
                    fontFamily: 'Sarala, sans-serif',
                    textTransform: 'capitalize',
                    fontSize: '15px',
                  }} />
              )
            }


          </TabList>

        </Box>
        <div>
          {
            featuresContent.map((item, i) =>
              <TabPanel key={i} value={i + 1 + ""}>{item}</TabPanel>
            )
          }
        </div>
      </TabContext>
    </Box>
  );
}