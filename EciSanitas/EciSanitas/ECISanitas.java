import java.util.Collection;
import java.util.*;
import java.time.*;
/**
*  Creates an Object called ECISanistas that save information about 
*  Hospitals(Clients, Doctors and appointments)
*/
public class ECISanitas {
    
    private Map<String,Hospital> hospitals = new TreeMap<>();
    private Map<String,Patient> patients = new TreeMap<>();
    private Map<String,Illness> illnesses = new TreeMap<>();
    /**
     * add a new appointment in Appointments
     */ 
    public void scheduleAppointment(String patientId, String hospitalName, 
    String requestedSpeciality,LocalDate date, int timeSlot){
        Patient p = getPatient(patientId);
        Hospital h = getHospital(hospitalName);
        if (p!= null && h != null)
        {
            h.createAppointment(p, requestedSpeciality, date, timeSlot);
        }
    }
    
    public Patient getPatient(String patientId){
        return patients.get(patientId);
    }
    
    public Hospital getHospital(String hospitalName){
        return hospitals.get(hospitalName);
    }
}


