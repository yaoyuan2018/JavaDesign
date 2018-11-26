package DecoratorPattern;

/**
 * @Author:Y_uan
 * @Date:2018/11/2621:47
 * @Mail:yy494818027@163.com
 * 我要把学校最高成绩告诉老爸
 */
public class HighScoreDecorator extends Decorator {
    //构造函数
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    //我要汇报最高成绩
    private void reportHighScore(){
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    //最高成绩我要在老爸看成绩单之前告诉他，否则他一看，就抡起扫帚揍我
    @Override
    public void report(){
        this.reportHighScore();
        super.report();
    }
}
