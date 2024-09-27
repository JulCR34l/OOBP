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
     */ 
    public void createAppointment(Patient p,String requestedSpeciality, 
    LocalDate date,int timeSlot){
        for(Doctor d:doctors){
            String ds = d.getSpeciality();
            boolean ia = d.isAvailable(date,timeSlot);
            if((ds.equals(requestedSpeciality)) && ia){
                generateAppointment(p,d,date,timeSlot);
            }
        }
    }
    
    /**
     * creates the appointment "ticket"
     */ 
    public void generateAppointment(Patient p,Doctor d,LocalDate date,
    int timeSlot){
        Office o = d.getOffice();
        //Appointment a =  new appointment(Doctor d, Office o, LocalDate date, int timeSlot);
        Appointment a =  new Appointment();
        p.addAppointment(a);
    }
}
