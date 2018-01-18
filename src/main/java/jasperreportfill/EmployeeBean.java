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
public class EmployeeBean {
    private int empId;
    private String name;
    private String desig;
    private String dept;
    private String phno;
    private String email;
    public void setEmpId(int empId){
        this.empId=empId;
    }
    public int getEmpId(){
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
    public void setDept(String dept){
        this.dept=dept;
    }
    public String getDept(){
        return dept;
    }
    public void setPhno(String phno){
        this.phno=phno;
    }
    public String getPhno(){
        return phno;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    } 
}
