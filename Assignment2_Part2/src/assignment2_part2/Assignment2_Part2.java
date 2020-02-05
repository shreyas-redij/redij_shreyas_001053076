/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_part2;

//Importing packages
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import Business.Patient;
import Business.VitalSign;
import Business.VitalSignHistory;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

/**
 *
 * @author Joy
 */
public class Assignment2_Part2 {

    /**
     * @param args the command line arguments
     */
         
    public static void main(String[] args) {
        // TODO code application logic here
        VitalSignHistory vsh = new VitalSignHistory();
        Patient p = new Patient();
                
        VitalSign vs = new VitalSign();
        System.out.println("#################################################");
        System.out.println("   Vital Sign Diagnosis");
        System.out.println("#################################################\n");
        
        while(true){
            
            System.out.println("Press 1 to add a new Vital Sign\nPress 2 to view the current Vital Signs\nPress 3 to view the Vital Sign History ");
            System.out.println("Press 4 to Delete Vital Sign from Vital Sign History\nPress 5 to remove all Vital Signs of a Patient\nPress 6 to get Vital sign range \nPress 7 to end the application");
            Scanner scanner = new Scanner(System.in);

            int caseVal = Integer.parseInt(scanner.nextLine());
            
            //scanner.close();
            //Switch case to obtain output 
            if(caseVal == 7)
                break;
            
            switch(caseVal){
                //Case to add a new vital sign
                case 1:
                    //Adding previous vital sign to the arraylist
                    if(vs.getBloodPressure() != 0 && vs.getHeartRate() != 0 &&  vs.getRespiratoryRate() != 0 && vs.getWeightKgs() != 0){
                        VitalSign v = vsh.addVitals();
                        v.setName(vs.getName());
                        v.setDateVisited(vs.getDateVisited());
                        v.setBloodPressure(vs.getBloodPressure());
                        v.setHeartRate(vs.getHeartRate());
                        v.setRespiratoryRate(vs.getRespiratoryRate());
                        v.setWeightKgs(vs.getWeightKgs());
                        v.setAge(vs.getAge());
                    }
                                        
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter date of birth in YYYY-MM-DD: ");
                    String date = scanner.nextLine();
                    System.out.print("Enter Respiratory Rate: ");
                    Double respiratoryRate = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter Heart Rate: ");
                    Double heartRate = Double.parseDouble(scanner.nextLine());
                    System.out.print("Systolic Blood Pressure: ");
                    Double bloodPressure = Double.parseDouble(scanner.nextLine());
                    System.out.print("Weight in Kgs: ");
                    Double weight = Double.parseDouble(scanner.nextLine());
        
                    //scanner.close();
                     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                    LocalDateTime now = LocalDateTime.now();  
                    String vistedDate = dtf.format(now).toString();
        
                    Period diff = p.getAge(LocalDate.parse(date));
                    
                    String age = p.calculateAge(diff);
                    
                    vs.setName(name);
                    vs.setBloodPressure(bloodPressure);
                    vs.setHeartRate(heartRate);
                    vs.setRespiratoryRate(respiratoryRate);
                    vs.setWeightKgs(weight);
                    vs.setDateVisited(vistedDate);
                    vs.setAge(age);
                              
                            
                    boolean patientCheck = p.isPatientNormal(diff, vs.getRespiratoryRate(), vs.getHeartRate(), vs.getBloodPressure(), vs.getWeightKgs());
                    if(patientCheck)
                        System.out.println("\n\n The Patient is Normal");
                    
                    else
                        System.out.println("Abnormal Vital Signs have been diagnosed\n\n");
            
                    
                    break;
                //Case to view current vital signs
                case 2:
                    System.out.println("Patient Name | Blood Pressure |  Heart Rate | Respiratory Rate | Weight in Kgs | Age \t\t |    Visited Date");
                    System.out.println(vs.getName()+"\t\t" +vs.getBloodPressure()+"\t\t"+vs.getHeartRate()+"\t\t"+vs.getRespiratoryRate()+"\t\t"+vs.getWeightKgs()+"\t\t"+vs.getAge()+"\t\t"+vs.getDateVisited());
                    break;
                    
                //Case to view vital sign history
                case 3:
                    System.out.println("Patient Name | Blood Pressure |   Heart Rate | Respiratory Rate | Weight in Kgs | Age \t\t |   Visited Date");
                    for(VitalSign o : vsh.getVitalSignHistory()){
                        System.out.println(o.getName()+"\t\t"+o.getBloodPressure()+"\t\t"+o.getHeartRate()+"\t\t"+o.getRespiratoryRate()+"\t\t"+o.getWeightKgs()+"\t\t"+o.getAge()+"\t\t"+vs.getDateVisited());
                    }
                    break;
                
                //Case to delete an element
                case 4:
                    System.out.println("Enter the index to be deleted");
                    int selectedRowIndex = Integer.parseInt(scanner.nextLine());
                    
                    if(selectedRowIndex >= 0 && selectedRowIndex < (vsh.getSize())){
                        
                        vsh.deleteVitals(selectedRowIndex); 
                        System.out.println("Index deleted");
                    }
                    
        
                    else{
                        System.out.println("Enter a valid index");
                    }
                    
                    System.out.println("\nPatient Name | Blood Pressure |   Heart Rate | Respiratory Rate | Weight in Kgs | Age \t\t |   Visited Date");
                    for(VitalSign o : vsh.getVitalSignHistory()){
                        System.out.println(o.getName()+"\t\t"+o.getBloodPressure()+"\t\t"+o.getHeartRate()+"\t\t"+o.getRespiratoryRate()+"\t\t"+o.getWeightKgs()+"\t\t"+o.getAge()+"\t\t"+vs.getDateVisited());
                    }
                    break;
                
                case 5:
                    System.out.println("Enter the Patient Name that needs to be deleted");
                    String patient = scanner.nextLine();
                    VitalSign delVS = new VitalSign();
                    for(VitalSign sign: vsh.getVitalSignHistory()){
                        if(sign.getName().equals(patient)){
                            delVS = sign;
                            vsh.deletePatientRecords(delVS);
                            //System.out.println("Success");
                        }
                        //else System.out.println("Failed");
                    }
                    for (Iterator<VitalSign> iterator = vsh.getVitalSignHistory().iterator(); iterator.hasNext();) {
                        VitalSign sign = iterator.next();
                        if(sign.getName().equals(patient)){
                            delVS = sign;
                            vsh.deletePatientRecords(delVS);
                            System.out.println("Success");
                        }
                        else System.out.println("Failed");
                    }
                    
                    System.out.println("Successfully deleted records for patient "+patient);
                    
                    System.out.println("\nPatient Name | Blood Pressure |   Heart Rate | Respiratory Rate | Weight in Kgs |   Visited Date");
                    for(VitalSign o : vsh.getVitalSignHistory()){
                        System.out.println(o.getName()+"\t\t"+o.getBloodPressure()+"\t\t"+o.getHeartRate()+"\t\t"+o.getRespiratoryRate()+"\t\t"+o.getWeightKgs()+"\t\t"+vs.getDateVisited());
                    }
                    
                    break;
                    
                case 6:
                    System.out.println("Enter the Vital Sign");
                    String vital = scanner.nextLine();
                    
                    System.out.println("Enter date of birth in YYYY-MM-DD: ");
                    String dateVital = scanner.nextLine();
                    
                    System.out.println("Enter the Value");
                    Double value = Double.parseDouble(scanner.nextLine());
                    
                    Period diffVital = p.getAge(LocalDate.parse(dateVital));
                    
                    p.isThisPatientNormal(vital,diffVital,value);
                    break;
                                    
                default:
                    System.out.println("Enter a valid choice");
                    
            }
                       
            
            
        }       
        
    }
    
}
