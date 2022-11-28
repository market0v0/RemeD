import React from 'react'
import LabTabs from '../BasicComponent/AppBar'
import BookAppointment from '../RemeDPatientFeatures/BookAppointment';
import CheckMedHistory from '../RemeDPatientFeatures/CheckMedHistory';
import ReserveSlot from '../RemeDPatientFeatures/ReserveSlot';


function Patient() {
    const componentArray = [
      <BookAppointment />,
      <CheckMedHistory />,
      <ReserveSlot/>
        ];
      const featureName = ["Book Appointment","Medical History", "Labarotory slot"]
  return (
    <div>
      
        <LabTabs components={componentArray} label={featureName}/>
    </div>
  )
}

export default Patient