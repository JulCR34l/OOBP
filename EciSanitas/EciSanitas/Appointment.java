import java.time.LocalDate;
import java.util.ArrayList;
import java.time.*;

/**
* contains information about Appointments
*/ 
public class Appointment {
    private String id;
    private LocalDate fecha;
    private int time;
    private String reason;
    private Doctor doctor;
    private Office office;
    private ArrayList<Treatment> patientTreatments;
    private ArrayList<PatientIllness> patientIllnesses;
    
    /**
     * 
     */ 
    public void appointment(Doctor d, Office o, LocalDate date, 
    int timeSlot){
        
        this.doctor = d;
        this.office = o;
        this.fecha = date;
        this.time = timeSlot;
    }
}
