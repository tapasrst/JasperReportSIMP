/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasperreportfill;

/**
 *
 * @author User
 */
public class DataBean {
    private String empId;
    private String name;
    private String desig;
    
    public void setEmpId(String empId){
    	int i = 0;
        this.empId=empId;
    }
    public String getEmpId(){
        return empId;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setDesig(String desig){
        this.desig=desig;
    }
    public String getDesig(){
        return desig;
    }     
}
