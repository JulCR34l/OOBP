import java.time.LocalDate;
import java.util.ArrayList;
/**
* contains information about a Patient and add an appointment to all 
* the appointment
*/ 
public class Patient {
    private String idCard;
    private String name;
    private String address;
    private LocalDate birthDate;
    private LocalDate registrationDate;
    private ArrayList<Appointment> appointments;
    private MedicalHistory medicalHistory;
    
    /**
     * 
     * adds apointment to the list
     * 
     */ 
    public void addAppointment(Appointment a){
        appointments.add(a);
    }
}
