/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Joy
 */
public class Patient {
        
     //Intialize variables when contstructor is called   
    public Period getAge(LocalDate d) {
        LocalDate curDate = LocalDate.now();
        Period diff = Period.between(d, curDate);
        return diff;
        
    }
    
    //  This method returns true if all the vital signs of the patient are normal else returns false
    public boolean isPatientNormal(Period diff, Double respiratoryRate, Double heartRate, Double bloodPressure, Double weight){
        
        //Checking Age criteria for a New Born
        if(diff.getYears() == 0 && diff.getMonths() == 0){
            boolean resporatoryCheck, heartCheack, pressureCheck, weightCheck = false;
            System.out.println("\nThe patient is a New Born having age "+diff.getDays()+" days\n");
            
            //Checking Respiratory Rate
            if(respiratoryRate >=30 && respiratoryRate <= 50){
                resporatoryCheck = true;
            }
            else{
                resporatoryCheck = false;
                System.out.println("Patient has abnormal Respiratory Rate: "+respiratoryRate+"\nNormal range is 30-50\n\n");
            }
            //Checking Heart Rate
            if(heartRate >=120 && heartRate <= 160){
                heartCheack = true;
            }
            else{
                heartCheack = false;
                System.out.println("Patient has abnormal Heart Rate: "+heartRate+"\nNormal range is 120-160\n\n");
            }
            //Checking Blood Pressure
            if(bloodPressure >=50 && bloodPressure <= 70){
                pressureCheck = true;
            }
            else{
                pressureCheck = false;
                System.out.println("Patient has abnormal Systolic Blood Pressure: "+bloodPressure+"\nNormal range is 50-70\n\n");
            }
            //Checking weight criteria
            if(weight >=2 && weight <= 3){
                weightCheck = true;
            }
            else{
                weightCheck = false;
                System.out.println("Patient has abnormal weight: "+weight+"\nNormal range is 2-3 Kgs\n\n");
            }
            //Returns true if all vital signs are normal
            if(resporatoryCheck == true && heartCheack == true && pressureCheck == true && weightCheck == true){
                return true;
            }
            else return false;
          
        }
        //Checking Age criteria for Infant  
        else if(diff.getYears() == 0 && diff.getMonths() > 0 ){
            boolean resporatoryCheck, heartCheack, pressureCheck, weightCheck = false;
            System.out.println("\nThe patient is an Infant having age "+diff.getMonths()+" Months and "+diff.getDays()+" Days\n");
            
            //Checking Respiratory rate
            if(respiratoryRate >=20 && respiratoryRate <= 30){
                resporatoryCheck = true;
            }
            else{
                resporatoryCheck = false;
                System.out.println("Patient has abnormal Respiratory Rate: "+respiratoryRate+"\nNormal range is 20-30\n\n");
            }
            //Checking Heart Rate
            if(heartRate >=80 && heartRate <= 140){
                heartCheack = true;
            }
            else{
                heartCheack = false;
                System.out.println("Patient has abnormal Heart Rate: "+heartRate+"\nNormal range is 80-140\n\n");
            }
            //Checking Blood Pressure
            if(bloodPressure >=70 && bloodPressure <= 100){
                pressureCheck = true;
            }
            else{
                pressureCheck = false;
                System.out.println("Patient has abnormal Systolic Blood Pressure: "+bloodPressure+"\nNormal range is 70-100\n\n");
            }
            //Checking weight criteria
            if(weight >=4 && weight <= 10){
                weightCheck = true;
            }
            else{
                weightCheck = false;
                System.out.println("Patient has abnormal weight: "+weight+"\nNormal range is 4-10 Kgs\n\n");
            }
            //Returns true if all vital signs are normal
            if(resporatoryCheck == true && heartCheack == true && pressureCheck == true && weightCheck == true){
                return true;
            }
            else return false;
          
        }
        
        //Checking Age criteria for Toddler
        else if(diff.getYears() >=1 && diff.getYears() <3){
            boolean resporatoryCheck, heartCheack, pressureCheck, weightCheck = false;
            System.out.println("\nThe patient is an Toddler having age "+diff.getYears()+" Years and "+diff.getMonths()+" Months\n");
            //Checking Respiratory rate
            if(respiratoryRate >=20 && respiratoryRate <= 30){
                resporatoryCheck = true;
            }
            else{
                resporatoryCheck = false;
                System.out.println("Patient has abnormal Respiratory Rate: "+respiratoryRate+"\nNormal range is 20-30\n\n");
            }
            //Checking Heart Rate
            if(heartRate >=80 && heartRate <= 130){
                heartCheack = true;
            }
            else{
                heartCheack = false;
                System.out.println("Patient has abnormal Heart Rate: "+heartRate+"\nNormal range is 80-130\n\n");
            }
            //Checking Blood Pressure
            if(bloodPressure >=80 && bloodPressure <= 110){
                pressureCheck = true;
            }
            else{
                pressureCheck = false;
                System.out.println("Patient has abnormal Systolic Blood Pressure: "+bloodPressure+"\nNormal range is 80-110\n\n");
            }
            //Checking weight criteria
            if(weight >=10 && weight <= 14){
                weightCheck = true;
            }
            else{
                weightCheck = false;
                System.out.println("Patient has abnormal weight: "+weight+"\nNormal range is 10-14 Kgs\n\n");
            }
            //Returns true if all vital signs are normal
            if(resporatoryCheck == true && heartCheack == true && pressureCheck == true && weightCheck == true){
                return true;
            }
            else return false;
        }
        
        //Checking Age criteria for Preschool
        else if(diff.getYears() >=3 && diff.getYears() <= 5){
            boolean resporatoryCheck, heartCheack, pressureCheck, weightCheck = false;
            System.out.println("\nThe patient is from Preschooler having age "+diff.getYears()+" Years and "+diff.getMonths()+" Months\n");
            //Checking Respiratory rate
            if(respiratoryRate >=20 && respiratoryRate <= 30){
                resporatoryCheck = true;
            }
            else{
                resporatoryCheck = false;
                System.out.println("Patient has abnormal Respiratory Rate: "+respiratoryRate+"\nNormal range is 20-30\n\n");
            }
            //Checking Heart Rate
            if(heartRate >=80 && heartRate <= 120){
                heartCheack = true;
            }
            else{
                heartCheack = false;
                System.out.println("Patient has abnormal Heart Rate: "+heartRate+"\nNormal range is 80-120\n\n");
            }
            //Checking Blood Pressure
            if(bloodPressure >=80 && bloodPressure <= 110){
                pressureCheck = true;
            }
            else{
                pressureCheck = false;
                System.out.println("Patient has abnormal Systolic Blood Pressure: "+bloodPressure+"\nNormal range is 80-110\n\n");
            }
            //Checking weight criteria
            if(weight >=14 && weight <= 18){
                weightCheck = true;
            }
            else{
                weightCheck = false;
                System.out.println("Patient has abnormal weight: "+weight+"\nNormal range is 14-18 Kgs\n\n");
            }
            //Returns true if all vital signs are normal
            if(resporatoryCheck == true && heartCheack == true && pressureCheck == true && weightCheck == true){
                return true;
            }
            else return false;
        }
        
        //Checking Age criteria for a school student
        else if(diff.getYears() >=6 && diff.getYears() <12){
            boolean resporatoryCheck, heartCheack, pressureCheck, weightCheck = false;
            System.out.println("\nThe patient is from school having age "+diff.getYears()+" Years and "+diff.getMonths()+" Months\n");
            //Checking Respiratory rate
            if(respiratoryRate >=20 && respiratoryRate <= 30){
                resporatoryCheck = true;
            }
            else{
                resporatoryCheck = false;
                System.out.println("Patient has abnormal Respiratory Rate: "+respiratoryRate+"\nNormal range is 20-30\n\n");
            }
            
            //Checking Heart Rate
            if(heartRate >=70 && heartRate <= 110){
                heartCheack = true;
            }
            else{
                heartCheack = false;
                System.out.println("Patient has abnormal Heart Rate: "+heartRate+"\nNormal range is 70-110\n\n");
            }
            //Checking Blood Pressure
            if(bloodPressure >=80 && bloodPressure <= 120){
                pressureCheck = true;
            }
            else{
                pressureCheck = false;
                System.out.println("Patient has abnormal Systolic Blood Pressure: "+bloodPressure+"\nNormal range is 80-120\n\n");
            }
            //Checking weight criteria
            if(weight >=20 && weight <= 42){
                weightCheck = true;
            }
            else{
                weightCheck = false;
                System.out.println("Patient has abnormal weight: "+weight+"\nNormal range is 20-42 Kgs\n\n");
            }
            //Returns true if all vital signs are normal
            if(resporatoryCheck == true && heartCheack == true && pressureCheck == true && weightCheck == true){
                return true;
            }
            else return false;
        }
        //Checking Age criteria for adolescent
        else{
            boolean resporatoryCheck, heartCheack, pressureCheck, weightCheck = false;
            System.out.println("\nThe patient is an Adolescent having age "+diff.getYears()+" Years and "+diff.getMonths()+" Months\n");
            //Checking Respiratory rate
            if(respiratoryRate >=12 && respiratoryRate <= 20){
                resporatoryCheck = true;
            }
            else{
                resporatoryCheck = false;
                System.out.println("Patient has abnormal Respiratory Rate: "+respiratoryRate+"\nNormal range is 12-20\n\n");
            }
            
            //Checking Heart Rate
            if(heartRate >=55 && heartRate <= 105){
                heartCheack = true;
            }
            else{
                heartCheack = false;
                System.out.println("Patient has abnormal Heart Rate: "+heartRate+"\nNormal range is 55-105\n\n");
            }
            //Checking Blood Pressure
            if(bloodPressure >=110 && bloodPressure <= 120){
                pressureCheck = true;
            }
            else{
                pressureCheck = false;
                System.out.println("Patient has abnormal Systolic Blood Pressure: "+bloodPressure+"\nNormal range is 110-120\n\n");
            }
            //Checking weight criteria
            if(weight >=50){
                weightCheck = true;
            }
            else{
                weightCheck = false;
                System.out.println("Patient has abnormal weight: "+weight+"\nNormal range is greater than 50 Kgs\n\n");
            }
            //Returns true if all vital signs are normal
            if(resporatoryCheck == true && heartCheack == true && pressureCheck == true && weightCheck == true){
                return true;
            }
            else return false;
        }
                
    }
    
    public String calculateAge(Period diff){
        String age;
        if(diff.getYears() == 0 && diff.getMonths() == 0){
            age = ""+diff.getDays()+" Days";
        }
        
        else if(diff.getYears() == 0 && diff.getMonths() != 0)
            age = ""+diff.getMonths()+" Months and "+diff.getDays()+" Days";
        
        else {
            age = ""+diff.getYears()+" Years and "+diff.getMonths()+" Months";
        }
        
        return age;
    
    }
    
    public void isThisPatientNormal(String vitalSign, Period diff, double val){
        if(vitalSign.equalsIgnoreCase("Heart Rate")){
            if(diff.getYears() == 0 && diff.getMonths() == 0){
                System.out.println("The patient is a Newborn");
                if(val >=120 && val <= 160){
                    System.out.println("The Heart Rate is Normal\n");
                }
                else{
                    System.out.println("The Heart Rate is not Normal\n");
                    System.out.println("The Normal Range is 120-160\n");
                }
                    
        
            }
        
            else if(diff.getYears() == 0 && diff.getMonths() > 0 ){
                System.out.println("The patient is an Infant");
                if(val >=80 && val <= 140){
                    System.out.println("The Heart Rate is Normal\n");
                }
                else{
                    System.out.println("The Heart Rate is not Normal\n");
                    System.out.println("The Normal Range is 80-140\n");
                }
            }
        
            else if(diff.getYears() >=1 && diff.getYears() <3){
                System.out.println("The patient is a Toddler");
                if(val >=80 && val <= 130){
                    System.out.println("The Heart Rate is Normal\n");
                }
               else{
                    System.out.println("The Heart Rate is not Normal\n");
                    System.out.println("The Normal Range is 80-130\n");
                }
                
           
            }
        
            else if(diff.getYears() >=3 && diff.getYears() <= 5){
                System.out.println("The patient is a Preschooler\n");
                if(val >=80 && val <= 120){
                    System.out.println("The Heart Rate is Normal\n");
                }
                else{
                    System.out.println("The Heart Rate is not Normal\n");
                    System.out.println("The Normal Range is 80-120\n");
                }
            }
       
            else if(diff.getYears() >=6 && diff.getYears() <12){
                System.out.println("The patient is from School Age\n");
                if(val >=70 && val <= 110){
                    System.out.println("The Heart Rate is Normal\n");
                }
                else{
                    System.out.println("The Heart Rate is not Normal\n");
                    System.out.println("The Normal Range is 70-110\n");
                }
            }
       
            else{
                System.out.println("The patient is a Adolescent\n");
                if(val >=55 && val <= 105){
                    System.out.println("The Heart Rate is Normal\n");
                }
                else{
                    System.out.println("The Heart Rate is not Normal\n");
                    System.out.println("The Normal Range is 55-105\n");
                }
            }
        
        } 
        
        
        
        
        else if(vitalSign.equalsIgnoreCase("Blood Pressure")){
            if(diff.getYears() == 0 && diff.getMonths() == 0){
                System.out.println("The patient is a Newborn");
                if(val >=50 && val <= 70){
                    System.out.println("The Blood Pressure is Normal\n");
                }
                
                else{
                    System.out.println("The Blood Pressure is not Normal\n");
                    System.out.println("The Normal Range is 50-70\n");
                }
        
            }
        
            else if(diff.getYears() == 0 && diff.getMonths() > 0 ){
                System.out.println("The patient is an Infant");
                if(val >=70 && val <= 100){
                    System.out.println("The Blood Pressure is Normal\n");
                }
                else{
                    System.out.println("The Blood Pressure is not Normal\n");
                    System.out.println("The Normal Range is 70-100\n");
                }
            }
        
            else if(diff.getYears() >=1 && diff.getYears() <3){
                System.out.println("The patient is a Toddler");
                if(val >=80 && val <= 110){
                    System.out.println("The Blood Pressure is Normal\n");
                }
                else{
                    System.out.println("The Blood Pressure is not Normal\n");
                    System.out.println("The Normal Range is 80-110\n");
                }
                
           
            }
        
            else if(diff.getYears() >=3 && diff.getYears() <= 5){
                System.out.println("The patient is a Preschooler\n");
                if(val >=80 && val <= 110){
                    System.out.println("The Blood Pressure is Normal\n");
                }
                else{
                    System.out.println("The Blood Pressure is not Normal\n");
                    System.out.println("The Normal Range is 80-110\n");
                }
            }
       
            else if(diff.getYears() >=6 && diff.getYears() <12){
                System.out.println("The patient is from School Age\n");
                if(val >=80 && val <= 120){
                    System.out.println("The Blood Pressure is Normal\n");
                }
                else{
                    System.out.println("The Blood Pressure is not Normal\n");
                    System.out.println("The Normal Range is 80-120\n");
                }
            }
       
            else{
                System.out.println("The patient is a Adolescent\n");
                if(val >=120 && val <= 160){
                    System.out.println("The Blood Pressure is Normal\n");
                }
                else{
                    System.out.println("The Blood Pressure is not Normal\n");
                    System.out.println("The Normal Range is 120-160\n");
                }
            }
        
        } 
        
        else if(vitalSign.equalsIgnoreCase("Respiratory Rate")){
            if(diff.getYears() == 0 && diff.getMonths() == 0){
                System.out.println("The Patient is a New Born");
                if(val >=30 && val <= 50){
                    System.out.println("The Respiratory Rate is Normal\n");
                    
                }
                
                else{
                    System.out.println("The Respiratory Rate is not Normal\n");
                    System.out.println("The Normal Range is 30-50\n");
                }
        
            }
        
            else if(diff.getYears() == 0 && diff.getMonths() > 0 ){
                System.out.println("The Patient is an Infant");
                if(val >=20 && val <= 30){
                    System.out.println("The Respiratory Rate is Normal\n");
                    
                }
                else{
                    System.out.println("The Respiratory Rate is not Normal\n");
                    System.out.println("The Normal Range is 20-30\n");
                }
        
            }
        
            else if(diff.getYears() >=1 && diff.getYears() <3){
                System.out.println("The Patient is a Toddler");
                if(val >=20 && val <= 30){
                    System.out.println("The Respiratory Rate is Normal\n");
                    
                }
                else{
                    System.out.println("The Respiratory Rate is not Normal\n");
                    System.out.println("The Normal Range is 20-30\n");
                }
           
            }
        
            else if(diff.getYears() >=3 && diff.getYears() <= 5){
                System.out.println("The Patient is a Preschooler");
                if(val >=20 && val <= 30){
                    System.out.println("The Respiratory Rate is Normal\n");
                }
                else{
                    System.out.println("The Respiratory Rate is not Normal\n");
                    System.out.println("The Normal Range is 20-30\n");
                }
           
            }
       
            else if(diff.getYears() >=6 && diff.getYears() <12){
                System.out.println("The Patient is from School Age");
                if(val >=20 && val <= 30){
                    System.out.println("The Respiratory Rate is Normal\n");
                }
                else{
                    System.out.println("The Respiratory Rate is not Normal\n");
                    System.out.println("The Normal Range is 20-30\n");
                }
       
            }
       
            else{
                System.out.println("The Patient is an Adolescent ");
                if(val >=12 && val <= 20){
                    System.out.println("The Respiratory Rate is Normal\n");
                }
                else{
                    System.out.println("The Respiratory Rate is not Normal\n");
                    System.out.println("The Normal Range is 12-20\n");
                }
            }
        
        } 
        
        else if(vitalSign.equalsIgnoreCase("weight")){
            if(diff.getYears() == 0 && diff.getMonths() == 0){
                System.out.println("The Patient is a New Born");
                if(val >=2 && val <= 3){
                    System.out.println("The Weight is Normal\n");
                    
                }
                
                else{
                    System.out.println("The Weight is not Normal\n");
                    System.out.println("The Normal Range is 2-3\n");
                }
        
            }
        
            else if(diff.getYears() == 0 && diff.getMonths() > 0 ){
                System.out.println("The Patient is an Infant");
                if(val >=4 && val <= 10){
                    System.out.println("The Weight is Normal\n");
                    
                }
                else{
                    System.out.println("The Weight is not Normal\n");
                    System.out.println("The Normal Range is 4-10\n");
                }
            }
        
            else if(diff.getYears() >=1 && diff.getYears() <3){
                System.out.println("The Patient is a Toddler");
                if(val >=11 && val <= 14){
                    System.out.println("The Weight is Normal\n");
                    
                }
                else{
                    System.out.println("The Weight is not Normal\n");
                    System.out.println("The Normal Range is 11-14\n");
                }
           
            }
        
            else if(diff.getYears() >=3 && diff.getYears() <= 5){
                System.out.println("The Patient is a Preschooler");
                if(val >=15 && val <= 18){
                    System.out.println("The Weight is Normal\n");
                }
                else{
                    System.out.println("The Weight is not Normal\n");
                    System.out.println("The Normal Range is 15-18\n");
                }
           
            }
       
            else if(diff.getYears() >=6 && diff.getYears() <12){
                System.out.println("The Patient is from School Age");
                if(val >=20 && val <= 42){
                    System.out.println("The Weight is Normal\n");
                }
                else{
                    System.out.println("The Weight is not Normal\n");
                    System.out.println("The Normal Range is 20-42\n");
                }
       
            }
       
            else{
                System.out.println("The Patient is an Adolescent ");
                if(val > 42){
                    System.out.println("The Weight is Normal\n");
                }
                else{
                    System.out.println("The Weight is not Normal\n");
                    System.out.println("The Normal Range is 42 or more\n");
                }
            }
        
        }
        else{
            System.out.println("Invalid Vital sign input\n\n");
        }
        
        
     
        
       
       
        
    
    }
}
