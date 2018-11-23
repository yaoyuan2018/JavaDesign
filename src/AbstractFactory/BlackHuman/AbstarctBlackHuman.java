package AbstractFactory.BlackHuman;

import AbstractFactory.Human;

/**
 * @Author: Y_uan
 * @Date: 2018/11/22 10:14
 * @mail: yy494818027@163.com
 */
public class AbstarctBlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑人会笑");
    }

    @Override
    public void cry() {
        System.out.println("黑人会哭");
    }

    @Override
    public void talk() {
        System.out.println("黑人可以说话，但一般人听不懂");
    }

    @Override
    public void sex() {

    }
}
