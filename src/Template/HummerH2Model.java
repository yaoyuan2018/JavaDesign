package Template;

/**
 * @Author: Y_uan
 * @Date: 2018/11/23 13:41
 * @mail: yy494818027@163.com
 * H1和H2有什么差别，还真不知道，真没接触过悍马
 */
public class HummerH2Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马H2，启动！");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2停下来了！");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2，鸣笛！");
    }

    @Override
    public void engineBoom() {
        System.out.println("轰隆隆隆隆……");
    }

    //默认没有喇叭的
    @Override
    protected boolean isAlarm() {
        return false;
    }
}
