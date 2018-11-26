package DecoratorPattern;

/**
 * @Author:Y_uan
 * @Date:2018/11/2522:29
 * @Mail:yy494818027@163.com
 * 老爸看成绩单了
 */
public class Father {
    public static void main(String[] args) {
        //成绩单拿过来
        SchoolReport sr;
        sr = new FouthGradeSchoolReport();//原装的成绩单

        //加了最高分说明的成绩单
        sr = new HighScoreDecorator(sr);

        //又加了成绩排名的说明
        sr = new SortDecorator(sr);

        //看成绩单
        sr.report();

        //然后老爸一看，很开心，就签名了
        sr.sign("老三");
    }
}
