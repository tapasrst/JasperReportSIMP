/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jasperreportfill;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class DataBeanList {
    public ArrayList<DataBean> getDataBeanList(){
        ArrayList<DataBean> dataBeanList=new ArrayList<DataBean>();
        dataBeanList.add(produce("E001","TAPAS","Developer"));
        dataBeanList.add(produce("E002","Someone","Developer"));
        return dataBeanList;
    }
    
    private DataBean produce(String empId,String name,String desig){
        DataBean dataBean=new DataBean();
        dataBean.setEmpId(empId);
        dataBean.setName(name);
        dataBean.setDesig(desig);
        return dataBean;
    }
    public static void main(String args[]){
        DataBeanList dataBeanList=new DataBeanList();
        dataBeanList.getDataBeanList();
    }
}
