package VisitorPattern2;

/**
 * @Author: Y_uan
 * @Date: 2018/12/6 16:52
 * @mail: yy494818027@163.com
 */
public class CommonEmployee extends Employee {

    //工作内容，这个非常重要，以后的职业规划就是靠这个了
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    //我允许访问者过来访问
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
