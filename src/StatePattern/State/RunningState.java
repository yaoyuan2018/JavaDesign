package StatePattern.State;

import StatePattern.Context;
import StatePattern.LiftState;

/**
 * @Author:Y_uan
 * @Date:2018/12/923:42
 * @Mail:yy494818027@163.com
 */
public class RunningState extends LiftState {

    //运行的时候开电梯门？你疯了，电梯不会给你开门的
    @Override
    public void open() {
        //do nothing
    }

    //电梯门关闭？这是肯定了
    @Override
    public void close() {
        //do nothing
    }

    //这是在运行状态下电梯要实现的方法
    @Override
    public void run() {
        System.out.println("电梯上下跑……");
    }

    //这事绝对是合理的，光运行不停止，谁还敢坐这个电梯
    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}
