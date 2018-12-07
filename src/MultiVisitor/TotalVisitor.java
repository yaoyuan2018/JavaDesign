package MultiVisitor;

/**
 * @Author: Y_uan
 * @Date: 2018/12/7 11:29
 * @mail: yy494818027@163.com
 * 汇总表，该访问者起汇总作用，把容器中的数据一个一个遍历，然后汇总
 */
public class TotalVisitor implements ITotalVisitor {
    //部门经理的工资系数是5
    private final static int MANAGER_COEFFICIENT = 5;

    //员工的工资系数是2
    private final static int COMMONEMPLOYEE_COEFFICIENT = 2;

    //普通员工的工资总和
    private int commonTotalSalary = 0;

    //部门经理的工资总和
    private int managerTotalSalary = 0;

    @Override
    public void totalSalary() {
        System.out.println("本公司的月工资总额是" + (this.commonTotalSalary + this.managerTotalSalary));
    }

    //访问普通员工，计算工资总额
    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.commonTotalSalary = this.commonTotalSalary + commonEmployee.getSalary()*COMMONEMPLOYEE_COEFFICIENT;
    }

    //访问部门经理，计算工资总额
    @Override
    public void visit(Manager manager) {
        this.managerTotalSalary = this.managerTotalSalary + manager.getSalary()*MANAGER_COEFFICIENT;
    }
}