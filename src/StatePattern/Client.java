package StatePattern;

import StatePattern.State.ClosingState;

/**
 * @Author:Y_uan
 * @Date:2018/12/923:32
 * @Mail:yy494818027@163.com
 * 模拟电梯的动作
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
