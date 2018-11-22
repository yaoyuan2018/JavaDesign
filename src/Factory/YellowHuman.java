package Factory;

/**
 * @Author: Y_uan
 * @Date: 2018/11/22 8:22
 * @mail: yy494818027@163.com
 * 黄色人种
 */
public class YellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄色人种会哭");
    }

    @Override
    public void cry() {
        System.out.println("黄色人种会大笑，幸福呀！");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节");
    }
}
