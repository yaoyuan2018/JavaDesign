package MultiVisitor;

/**
 * @Author: Y_uan
 * @Date: 2018/12/7 11:21
 * @mail: yy494818027@163.com
 * 负责统计报表的产生
 */
public interface ITotalVisitor extends IVisitor {
    //统计所有员工工资总和
    public void totalSalary();
}
