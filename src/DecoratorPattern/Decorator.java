package DecoratorPattern;

/**
 * @Author:Y_uan
 * @Date:2018/11/2621:44
 * @Mail:yy494818027@163.com
 * 装饰类，我要把我的成绩单装饰一下
 */
public class Decorator extends SchoolReport {

    //首先我要知道是哪个成绩单
    private SchoolReport sr;

    //构造函数，传成绩单过来
    public Decorator(SchoolReport sr){
        this.sr = sr;
    }

    //成绩单还是要被看到的
    @Override
    public void report() {
        this.sr.report();
    }

    //看完毕还是要签名的
    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }

}
