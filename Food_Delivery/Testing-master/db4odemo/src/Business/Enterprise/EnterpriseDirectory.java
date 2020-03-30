/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
  
    
    //Create enterprise
    
    
        public Enterprise searchEnterprise(String enterpriseName){
        for (Enterprise enterprise: enterpriseList) {
            if (enterprise.getName().equals(enterpriseName)) {
                return enterprise;
            }
        }
        return null;
    }
        
    public Enterprise createAndAddEnterprise(String name,String address,Enterprise.EnterpriseType type){
        Enterprise enterprise_dummy=null;
        if(type==Enterprise.EnterpriseType.Restaurant){
            enterprise_dummy=new RestaurantEnterprise(name,address);
            enterpriseList.add(enterprise_dummy);
        }
        return enterprise_dummy;
    }
        
         public void deleteEnterprise(Enterprise enterprise){
        enterpriseList.remove(enterprise); 
    }
}
