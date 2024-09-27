import java.time.*;
/**
* contains information about a Doctor and give it
*/ 
public class Doctor {
    private String id;
    private String name;
    private String specialty;
    private String phone;
    private Office office;
    private boolean isAvailable = true;
    
    public String getSpeciality(){
        return this.specialty = specialty;
    }
    
    public Office getOffice(){
        return this.office;
    }
    
    /**
     * 
     */ 
    public boolean isAvailable(LocalDate date, int timeSlot){
        return this.isAvailable;
    }
}
