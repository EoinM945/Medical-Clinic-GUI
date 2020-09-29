/*

Author - Eoin McDonald x18103880 NCI Computing
OOP Repeat CA 

 */
package cliniggui;


//imports
import java.io.*;
import java.util.Date;


public class Appointment implements Serializable {
    
    //patient info variables
    private String name;
    private String surname;
    private Doctor doctor;
    private String ppsNumber;
    private int phone;
    private String address;
    private String town;
    private String county;
    private String eirCode;
    private Date date;
    

    //constructor method
    public Appointment(String name, String surname, Doctor doctor, String ppsNumber, int phone, String address, 
                    String town, String county, String eirCode, Date date) {
        this.name = name;
        this.surname = surname;
        this.doctor = doctor;
        this.ppsNumber = ppsNumber;
        this.phone = phone;
        this.address = address;
        this.town = town;
        this.county = county;
        this.eirCode = eirCode;
        this.date = date;
        
        
    }
    
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getPpsNumber() {
        return ppsNumber;
    }

    public void setPpsNumber(String ppsNumber) {
        this.ppsNumber = ppsNumber;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getEirCode() {
        return eirCode;
    }

    public void setEirCode(String eirCode) {
        this.eirCode = eirCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    

    
  

    
    
    
    
   }


