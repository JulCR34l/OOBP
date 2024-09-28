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
     * Creates an appointment with a doctor at a specific office on a given date and time slot.
     *
     * @param d        The doctor assigned to the appointment.
     * @param o        The office where the appointment will take place.
     * @param date     The date of the appointment.
     * @param timeSlot The time slot for the appointment.
     */
    public Appointment(Doctor d, Office o, LocalDate date, int timeSlot){
        
        this.doctor = d;
        this.office = o;
        this.fecha = date;
        this.time = timeSlot;
    }
}
