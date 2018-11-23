package Template;

/**
 * @Author: Y_uan
 * @Date: 2018/11/23 13:48
 * @mail: yy494818027@163.com
 * 客户开始使用这个模型
 */
public class Client {

    public static void main(String[] args) {
        //客户开着H1型号，出去遛弯了
        HummerModel h1 = new HummerH1Model();
        ((HummerH1Model) h1).setAlarm(false);
        h1.run();//汽车跑起来了

        //客户开着H2型号，出去玩了
        HummerModel h2 = new HummerH2Model();
        h2.run();
    }
}
