package ObserverPatternVer2.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: Y_uan
 * @Date: 2018/11/29 15:50
 * @mail: yy494818027@163.com
 * 李斯这个人，是个观察者，只要韩非子有动静，这边就知道
 */
public class LiSi implements Observer {

    //首先李斯是个观察者，一旦韩非子有活动，他就知道，他就要向老板汇报
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯：观察到李斯活动，开始向老板汇报了……");
        this.reportToQinShiHuang(arg.toString());
        System.out.println("李斯：汇报完毕，秦老板赏给他两个萝卜吃吃……\n");
    }

    //汇报给秦始皇
    private void reportToQinShiHuang(String reportContext){
        System.out.println("李斯：报告老板！韩非子有活动了------>"+reportContext);
    }


}
