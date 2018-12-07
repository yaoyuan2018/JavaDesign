package VisitorPattern2;

import VisitorPattern2.CommonEmployee;
import VisitorPattern2.Employee;
import VisitorPattern2.Manager;

/**
 * @Author: Y_uan
 * @Date: 2018/12/6 16:27
 * @mail: yy494818027@163.com
 */
public class Visitor implements IVisitor {
    //部门经理的工资系数是5
    private final static int MANAGER_COEFFICIENT = 5;

    //员工的工资系数是2
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;

    //普通员工的工资总和
    private int commonTotalSalary = 0;

    //部门经理的工资总和
    private int managerTotalSalary = 0;

    //访问普通员工，打印出报表
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
        //计算普通员工的薪水总和
        this.calCommonSalary(commonEmployee.getSalary());
    }

    //访问部门经理，打印出报表
    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
        //计算部门经理的工资总和
        this.calManagerSalary(manager.getSalary());
    }

    //获得所有员工工资总和
    @Override
    public int getTotalSalary() {
        return this.commonTotalSalary + this.managerTotalSalary;
    }

    //组装出基本信息
    private String getBasicInfo(Employee employee){
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别：" + (employee.getSex() == Employee.FEMALE?"女":"男") + "\t";
        info = info + "薪水：" + employee.getSalary() + "\t";

        return info;
    }

    //组装出部门经理的信息
    private String getManagerInfo(Manager manager){
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "业绩："+manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }

    //组装出普通员工信息
    private String getCommonEmployee(CommonEmployee commonEmployee){
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "工作：" + commonEmployee.getJob() + "\t";
        return basicInfo + otherInfo;
    }

    //计算普通员工的工资总和
    private void calCommonSalary(int salary){
        this.commonTotalSalary = this.commonTotalSalary + salary*COMMONEMPLOYEE_COEFFICIENT;
    }

    //计算部门经理的工资总和
    private void calManagerSalary(int salary){
        this.managerTotalSalary = this.managerTotalSalary + salary*MANAGER_COEFFICIENT;
    }

}
