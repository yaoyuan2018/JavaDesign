package Factory;

/**
 * @Author: Y_uan
 * @Date: 2018/11/22 8:24
 * @mail: yy494818027@163.com
 * 白色人种
 */
public class WhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("白色人种会大笑，侵略的笑声");
    }

    public void cry(){
        System.out.println("白色人种会哭");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话，但是一般都是单字节");
    }


}
