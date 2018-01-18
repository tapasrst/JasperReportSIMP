/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasperreportfill;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author User
 */
public class ReportCompiler {
    public void compile(){
        String sourceFileName="EmployeeDetails.jrxml";
        try{
           JasperCompileManager.compileReportToFile(sourceFileName);
        }catch(JRException je){
            je.printStackTrace();
        }
    }
}
