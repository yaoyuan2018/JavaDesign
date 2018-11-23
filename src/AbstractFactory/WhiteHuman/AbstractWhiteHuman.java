package AbstractFactory.WhiteHuman;

import AbstractFactory.Human;

/**
 * @Author: Y_uan
 * @Date: 2018/11/22 10:12
 * @mail: yy494818027@163.com
 * 白色人种
 * 为了代码整洁，新建一个包，这里是白种人的天下了
 */
public class AbstractWhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("白色人种会大笑，侵略的笑声");
    }

    @Override
    public void cry() {
        System.out.println("白色人种会哭");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话，但是一般都是单字节");
    }

    @Override
    public void sex() {

    }
}
