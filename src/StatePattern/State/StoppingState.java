package StatePattern.State;

import StatePattern.Context;
import StatePattern.LiftState;

/**
 * @Author:Y_uan
 * @Date:2018/12/923:42
 * @Mail:yy494818027@163.com
 */
public class StoppingState extends LiftState {

    //合理，停止的时候电梯门可以打开
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    //停止状态关门？门本来就是关着的！
    @Override
    public void close() {
        //do nothing
    }

    //停止状态再跑起来，正常的很
    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    //停止状态是怎么发生的呢？当然是停止方法执行了
    @Override
    public void stop() {
        System.out.println("电梯停止了……");
    }
}
