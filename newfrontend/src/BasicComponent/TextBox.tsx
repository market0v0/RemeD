import * as React from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { createTheme } from '@mui/material';

type ValueType = {
    textLabel:String;
    textID:String;
    textType:String;
    
}

export default function RemeDTextFeild(prop:ValueType) {
  return (
    <Box
      component="form"
      sx={{
        '& .MuiTextField-root': { m: 1, width: '25ch' },
      }}
      noValidate
      autoComplete="off"
    >
      <div>
        <TextField
          id={prop.textID+""}
          label={prop.textLabel+""}
          type={prop.textType+""}
          autoComplete="current-password"
        />
       
      </div>
    </Box>
  );
}

const theme = createTheme({
    palette: {
      primary: {
        main: '#d32f2f',
      },
      secondary: {
        main: '#ff1744',
      },
    },
  });