
import * as React from 'react';
import RemeDTextFeild from '../BasicComponent/TextBox';
import styled from '@emotion/styled';
import { Button } from '@mui/material';


export default function RemeDLogin() {
    const [texMessage, setMessage] = React.useState('');

    const handleChange = (event: { target: { value: React.SetStateAction<string>; }; }) => {
        setMessage(event.target.value);
        console.log(event.target.value);
    };
    return (
        <div>
            <div>
                <RemeDLoginLogo>
                    <img src={'/images/RemeDLogin.png'} alt="Image" style={{ maxHeight: '300px', minHeight: '300px' }} />
                </RemeDLoginLogo>

       
                    <TextDisplay>
                        <p> Discover Top Doctors</p>
                    </TextDisplay>
                    <UserTextField >
                        <RemeDTextFeild textLabel={"Username"} textID={"outlined-password-input"} textType={""} />
                    </UserTextField>

                    <PassTextField>
                        <RemeDTextFeild textLabel={"Password"} textID={"outlined-password-input"} textType={"password"} />
                    </PassTextField>
                    <LoginButton>
                    <Button variant='contained' sx={{ background: 'red', color: 'white' }}>Log in</Button>
                </LoginButton>
          

            </div>




        </div>
    );
}
const UserTextField = styled.div`
position: absolute;
width: 260px;
height: 45px;
left: 750px;
top: 370px;

`;
const PassTextField = styled.div`
position: absolute;
width: 260px;
height: 45px;
left: 750px;
top: 450px;

`;

const TextDisplay = styled.div`
  position: absolute;
  width: 741px;
  height: 591px;
  left: 500px;
  top: 30px;
  
  font-family: 'Raleway';
  font-style: normal;
  font-weight: 700;
  font-size: 100px;
  line-height: 100px;
  /* or 100% */
  
  text-align: center;
  letter-spacing: -1px;
  
  color: #F31717;
`;


const LoginButton = styled.div`
position: absolute;
width: 163px;
height: 43px;
left: 825px;
top: 530px;

`;

const RemeDLoginLogo = styled.div`
position: absolute;
width: 225px;
height: 205px;
left: 100px;
`;


const RemeDEllipse2 = styled.div`
position: absolute;
width: 2056px;
height: 2470px;
left: 425px;
top: -324px;
border-radius: 50%;
background: linear-gradient(39.19deg, #F8EEEE 18.57%, rgba(255, 255, 255, 0) 78.28%);

`;
const RemeDEllipse1 = styled.div`
position: onframe;
width: 2056px;
height: 2470px;
left: 400px;
top: -700px;
border-radius: 70%;
background: red;

`;

