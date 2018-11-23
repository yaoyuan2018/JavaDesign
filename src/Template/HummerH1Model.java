package Template;

/**
 * @Author: Y_uan
 * @Date: 2018/11/23 13:37
 * @mail: yy494818027@163.com
 * 悍马车是每个越野者的最爱，其中H1最接近军用系列
 */
public class HummerH1Model extends HummerModel{

    private boolean alarmFlag = true;   //是否要响喇叭

    @Override
    public void start() {
        System.out.println("悍马H1，启动！");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1，停车！");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1，鸣笛！");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1的引擎声音，和King的心跳声差不多！");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    //要不要响喇叭，是由客户来决定的
    public void setAlarm(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }
}
