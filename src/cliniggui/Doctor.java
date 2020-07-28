/*

Author - Eoin McDonald x18103880 NCI Computing
OOP Repeat CA 

 */
package cliniggui;

import java.io.*;


//Doctor Class to store/retrieve information on this object
public class Doctor implements Serializable{
    
    //Neccessary Variables
    private String doctorFName;
    private String doctorSName;
    private String doctorType;
    //Doctor ID is a final as ID should remain constant and un-editable
    private final String doctorID;
    
    
    //Constructor method
    public Doctor(String doctorFName, String doctorSName, String doctorType, String doctorID) {
        this.doctorFName = doctorFName;
        this.doctorSName = doctorSName;
        this.doctorType = doctorType;
        this.doctorID = doctorID;
    }
    
    public boolean equals(Doctor doctor){
        
        return (this.doctorFName.equals(doctor.doctorFName) && this.doctorSName.equals(doctorSName)
                && this.doctorType.equals(doctor.doctorType) && this.doctorID.equals(doctor.doctorID) );
            
       
       
    }

    //Gettera and setters
    public String getDoctorFName() {
        return doctorFName;
    }

    public void setDoctorFName(String doctorFName) {
        this.doctorFName = doctorFName;
    }

    public String getDoctorSName() {
        return doctorSName;
    }

    public void setDoctorSName(String doctorSName) {
        this.doctorSName = doctorSName;
    }

    public String getDoctorType() {
        return doctorType;
    }

    public void setDoctorType(String doctorType) {
        this.doctorType = doctorType;
    }

    
    
    
    
}
