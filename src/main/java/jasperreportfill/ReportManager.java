/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasperreportfill;
import java.sql.*;
/**
 *
 * @author User
 */
public class ReportManager {
    public static void main(String args[]) throws SQLException{
        Connection conn=null;
        Statement stm=null;
        ResultSet rs=null;
        ReportGeneration rg=new ReportGeneration();
        String query;
        String empId,name,key;
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        conn=DriverManager.getConnection("jdbc:mysql://localhost/simp","root","simp123");
        stm=conn.createStatement();
        rs=stm.executeQuery("select empid,name from employee");
        while(rs.next()){
            empId=rs.getString("empid");
            name=rs.getString("name");
            key=empId+"_"+name;
            query="select * from employee where empid='"+empId+"'";
            rg.getReports(query,key);
        }
    }
}
