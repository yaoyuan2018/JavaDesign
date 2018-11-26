package DecoratorPattern;

/**
 * @Author:Y_uan
 * @Date:2018/11/2522:23
 * @Mail:yy494818027@163.com
 * 成绩单的抽象类
 */
public abstract class SchoolReport {
    //成绩单的主要展示就是你的成绩情况
    public abstract void report();

    //成绩单要家长签字，这个是最要命的
    public abstract void sign(String name);
}
