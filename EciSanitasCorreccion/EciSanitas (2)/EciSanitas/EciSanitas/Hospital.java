import java.util.ArrayList;
import java.time.*;
/**
* contains information about hospital
*/ 
public class Hospital {
    private String name;
    private String address;
    private ArrayList<Office> offices;
    private ArrayList<Doctor> doctors;
    private Location location;
    private ArrayList<Treatment> treatments;
    /**
     * create an appointment for and add to a doctor
     * 
     * @param p                   Name of the Patient.
     * @param requestedSpeciality Specialty for the appointment.
     * @param date                Date of the appointment.
     * @param timeSlot            Time slot for the appointment.
     * 
     */ 
    public void createAppointment(Patient p,String requestedSpeciality, LocalDate date,int timeSlot){
        for(Doctor d:doctors){
            String ds = d.getSpeciality();
            boolean ia = d.isAvailable(date,timeSlot);
            if (ds.equals(requestedSpeciality) && ia) {
                generateAppointment(p, d, date, timeSlot);
            }
        }
    }
    
    /**
     * creates the appointment "ticket"
     * 
     * @param p                   Name of the patient.
     * @param d                   Name of the Doctor.
     * @param date                Date of the appointment.
     * @param timeSlot            Time slot for the appointment.
     * 
     */ 
    public void generateAppointment(Patient p,Doctor d,LocalDate date,int timeSlot){
        Office o = d.getOffice();
        Appointment a =  new Appointment(d,o,date,timeSlot);
        p.addAppointment(a);
    }
}
