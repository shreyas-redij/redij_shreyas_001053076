/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Joy
 */
public class VitalSignHistory {
    
    //Intialize VitalSignHistory arraylist
    
    private ArrayList<VitalSign> VitalSignHistory;
    
    public VitalSignHistory() {
        VitalSignHistory = new ArrayList<VitalSign>();
    }
    
    //Methods to add Vital Signs
    public VitalSign addVitals(){
         VitalSign vs = new VitalSign();
         VitalSignHistory.add(vs);
         return vs;
     }
    
    //Method to return size of the arraylist
    public int getSize(){
        int length = VitalSignHistory.size();
        return length;
    }
    
    //Method to delete Vital Signs
    public void deleteVitals(int index){
         VitalSignHistory.remove(index);
     }
    
    public void deletePatientRecords(VitalSign vs){
        if(VitalSignHistory.contains(vs)){
             VitalSignHistory.remove(vs);
             System.out.println("Success");
        }
       
    }
    
    //Getter Setter for Arraylist
    public ArrayList<VitalSign> getVitalSignHistory() {
        return VitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSign> VitalSignHistory) {
        this.VitalSignHistory = VitalSignHistory;
    }
    
}
