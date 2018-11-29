package ObserverPatternVer2.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: Y_uan
 * @Date: 2018/11/29 15:59
 * @mail: yy494818027@163.com
 * 王斯，观察者2号
 */
public class WangSi implements Observer {

    //王斯，看到韩非子有活动，自己就受不了
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("王斯：观察到韩非子活动，自己也开始活动了……");
        this.cry(arg.toString());
        System.out.println("王斯：真真的哭死了……\n");
    }

    //一看李斯有活动，就哭，痛哭
    private void cry(String context){
        System.out.println("王斯：因为"+context+"，——所以我悲伤啊！");
    }


}
