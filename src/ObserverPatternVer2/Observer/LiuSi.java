package ObserverPatternVer2.Observer;


import java.util.Observable;
import java.util.Observer;

/**
 * @Author: Y_uan
 * @Date: 2018/11/29 16:05
 * @mail: yy494818027@163.com
 */
public class LiuSi implements Observer {

    //刘斯，观察到韩非子的活动后，自己也做一定的事情
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("刘斯：观察韩非子活动。开始动作了……");
        this.happy(arg.toString());
        System.out.println("刘斯：真被乐死了\n");
    }

    //一看韩非子有变化，他就快乐
    private void happy(String context){
        System.out.println("刘斯：因为"+context+"，——所以我快乐呀！");
    }
}
