package StatePattern.State;

import StatePattern.Context;
import StatePattern.LiftState;

/**
 * @Author:Y_uan
 * @Date:2018/12/923:42
 * @Mail:yy494818027@163.com
 */
public class ClosingState extends LiftState {
    //电梯门关了再打开，这个允许
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);  //置为门敞状态
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭……");
    }

    //电梯门关了就跑，这是再正常不过了
    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);//设置为运行状态
        super.context.getLiftState().run();
    }

    //电梯门关着，我就不按楼层
    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);  //设置为停止状态
        super.context.getLiftState().stop();
    }
}
