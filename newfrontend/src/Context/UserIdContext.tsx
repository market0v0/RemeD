import React, { createContext, useEffect, useState } from 'react'

interface UserID {
  userID: number;
  CatchUserID: (catchID: number) => void;
}
export const UserIDContext = createContext<UserID | null>(null);


function UserIdContext(props: { children: React.ReactNode }) {

  const [userID, setUserID] = useState<number>(0);
  let id = 0;

  const CatchUserID = (catchID: number) => {
    setUserID(catchID);
    console.log(userID);
  }
  return (
    <div>
      <UserIDContext.Provider value={{ userID, CatchUserID }}>
        {props.children}
      </UserIDContext.Provider>
      {userID}
    </div>
  )
}

export default UserIdContext