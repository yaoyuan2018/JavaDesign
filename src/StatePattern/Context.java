package StatePattern;

import StatePattern.State.ClosingState;
import StatePattern.State.OpenningState;
import StatePattern.State.RunningState;
import StatePattern.State.StoppingState;

/**
 * @Author:Y_uan
 * @Date:2018/12/923:41
 * @Mail:yy494818027@163.com
 */
public class Context {

    //定义出所有的电梯状态
    public final static OpenningState openningState = new OpenningState();
    public final static ClosingState closingState = new ClosingState();
    public final static RunningState runningState = new RunningState();
    public static final StoppingState stoppingState = new StoppingState();

    //定义一个当前电梯状态
    private LiftState liftState;

    public LiftState getLiftState(){
        return liftState;
    }

    public void setLiftState(LiftState liftState){
        this.liftState = liftState;
        //把当前环境通知到各个实现类中
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }

    public void close(){
        this.liftState.close();
    }

    public void run(){
        this.liftState.run();
    }

    public void stop(){
        this.liftState.stop();
    }

}
