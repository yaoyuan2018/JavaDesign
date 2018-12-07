package VisitorPattern2;

/**
 * @Author: Y_uan
 * @Date: 2018/12/6 16:54
 * @mail: yy494818027@163.com
 */
public class Manager extends Employee {

    //这类人物的职责非常明确：业绩
    private String performance;

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    //部门经理允许访问者访问
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
