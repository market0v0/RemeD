import React, { createContext, useEffect, useState } from 'react'

interface UserID {
  userID: number;
  CatchUserID: (catchID: number) => void;
}
export const UserIDContext = createContext<UserID | null>(null);


function UserIdContext(props: { children: React.ReactNode }) {

  const [userID, setUserID] = useState<number>(0);
  useEffect(() => { setUserID(userID) }, [])

  const CatchUserID = (catchID: number) => {
    setUserID(catchID);
    console.log(userID);
  }
  return (
    <div>
      <UserIDContext.Provider value={{ userID, CatchUserID }}>
        {props.children}
      </UserIDContext.Provider>
    </div>
  )
}

export default UserIdContext