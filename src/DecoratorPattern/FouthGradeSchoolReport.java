package DecoratorPattern;

/**
 * @Author:Y_uan
 * @Date:2018/11/2621:54
 * @Mail:yy494818027@163.com
 */
public class FouthGradeSchoolReport extends SchoolReport {

    //我的成绩单
    @Override
    public void report() {
        //成绩单的格式是这个样子的
        System.out.println("尊敬的xxx家长：");
        System.out.println("  .......");
        System.out.println("  语文62 数学65 体育98 自然63");
        System.out.println("  .......");
        System.out.println("            家长签名：");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为："+name);
    }
}
