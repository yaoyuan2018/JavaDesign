package Factory;

/**
 * @Author: Y_uan
 * @Date: 2018/11/22 8:27
 * @mail: yy494818027@163.com
 */
public class BlackHuman implements Human {
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
}
