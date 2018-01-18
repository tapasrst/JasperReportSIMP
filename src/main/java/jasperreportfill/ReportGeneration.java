package jasperreportfill;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.sql.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRXlsExporter;
/**
 *
 * @author User
 */
public class ReportGeneration {
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("unchecked")
   
    public void getReports(String query,String key) throws SQLException{
        String sourceFileName="EmployeeDetails.jasper";
        String printFileName=null;
        Connection conn;
        Statement stm;
        ResultSet rs;
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        conn=DriverManager.getConnection("jdbc:mysql://localhost/simp","root","simp123");
        stm=conn.createStatement();
        rs=stm.executeQuery(query);
        /*ArrayList<EmployeeBean> empBeanList=new ArrayList<EmployeeBean>();
        while(rs.next()){
            empBeanList.add(produce(rs.getInt("empid"),rs.getString("name"),rs.getString("desig"),rs.getString("dept"),rs.getString("phno"),rs.getString("email")));
        }*/
        Map parameters=new HashMap();
        try{
            //JRBeanCollectionDataSource empCollDataSource=new JRBeanCollectionDataSource(rsDataSource);
            JRResultSetDataSource rsDataSource=new JRResultSetDataSource(rs);
            ReportCompiler rc=new ReportCompiler();
            rc.compile();
            printFileName=JasperFillManager.fillReportToFile(sourceFileName, parameters,rsDataSource);
            if(printFileName!=null){
                //JasperPrintManager.printReport(printFileName, true);
                JasperExportManager.exportReportToPdfFile(printFileName,key+".pdf");
            }
        }catch(JRException je){
            je.printStackTrace();
        }
    }
    /*private EmployeeBean produce(int empId,String name,String desig,String dept,String phno,String email){
        EmployeeBean empBean=new EmployeeBean();
        empBean.setEmpId(empId);
        empBean.setName(name);
        empBean.setDesig(desig);
        empBean.setDept(dept);
        empBean.setPhno(phno);
        empBean.setEmail(email);
        return empBean;
    }*/
    
}


