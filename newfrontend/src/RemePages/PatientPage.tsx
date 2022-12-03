import React from 'react'
import LabTabs from '../BasicComponent/AppBar'
import BookAppointment from '../RemeDPatientFeatures/BookAppointment';
import CheckMedHistory from '../RemeDPatientFeatures/CheckMedHistory';
import CheckSchedule from '../RemeDPatientFeatures/CheckSchedules';
import ReserveSlot from '../RemeDPatientFeatures/ReserveSlot';


function Patient() {
    const componentArray = [
      <BookAppointment />,
      <CheckMedHistory />,
      <ReserveSlot/>,
      <CheckSchedule/>
        ];
      const featureName = ["Book Appointment for In Person Consultation", "Check Medical History", "Reserve Slot for Medical Laboratory Test","Check Schedule"]
  return (
    <div>
      
        <LabTabs components={componentArray} label={featureName}/>
    </div>
  )
}

export default Patient