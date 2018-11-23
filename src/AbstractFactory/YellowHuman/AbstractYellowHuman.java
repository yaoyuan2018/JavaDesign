package AbstractFactory.YellowHuman;

import AbstractFactory.Human;

/**
 * @Author: Y_uan
 * @Date: 2018/11/22 10:10
 * @mail: yy494818027@163.com
 * 为什么要修改成抽象类呢？要定义性别呀
 */
public class AbstractYellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄色人种会大笑，幸福呀！");
    }

    @Override
    public void cry() {
        System.out.println("黄色人种会哭");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节");
    }

    @Override
    public void sex() {

    }
}
