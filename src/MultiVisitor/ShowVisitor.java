package MultiVisitor;

/**
 * @Author: Y_uan
 * @Date: 2018/12/7 11:23
 * @mail: yy494818027@163.com
 * 展示报表，该访问者的工作就是看到什么数据展示什么数据
 */
public class ShowVisitor implements IShowVisitor {

    private String info ="";

    //打印出报表
    @Override
    public void reprot() {
        System.out.println(this.info);
    }

    //访问普通员工，组装信息
    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.info = this.info + this.getBasicInfo(commonEmployee)+"工作："+commonEmployee.getJob()+"\t\n";
    }

    @Override
    public void visit(Manager manager) {
        this.info = this.info + this.getBasicInfo(manager)+"业绩："+manager.getPerformance()+"\t\n";
    }

    private String getBasicInfo(Employee employee){
        String info = "姓名："+employee.getName();
        info = info + "性别："+(employee.getSex()==Employee.FEMALE?"女":"男")+"\t";
        info = info + "薪水："+employee.getSalary();
        return info;
    }
}
