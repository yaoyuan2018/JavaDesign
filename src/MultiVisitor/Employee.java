package MultiVisitor;

/**
 * @Author: Y_uan
 * @Date: 2018/12/6 16:49
 * @mail: yy494818027@163.com
 * 在一个单位里谁都是员工，不论是部门经理还是小兵
 */
public abstract class Employee {
    public final static int MALE = 0;//0代表是男性
    public final static int FEMALE = 1; //1代表是女性

    //不论是谁都有姓名
    private String name;

    //只要是员工那就有薪水
    private int salary;

    //性别很重要
    private int sex;

    public static int getMALE() {
        return MALE;
    }

    public static int getFEMALE() {
        return FEMALE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    //我允许一个访问者过来访问
    public abstract void accept(IVisitor visitor);
}
