package VisitorPattern2;

import VisitorPattern2.CommonEmployee;
import VisitorPattern2.Manager;

/**
 * @Author: Y_uan
 * @Date: 2018/12/6 16:26
 * @mail: yy494818027@163.com
 * 访问者，我要去访问家人的数据了
 */
public interface IVisitor {
    //首先定义我可以访问普通员工
    public void visit(CommonEmployee commonEmployee);

    //其次定义，我还可以访问部门经理
    public void visit(Manager manager);

    //统计所有员工工资总和
    public int getTotalSalary();
}
