package ObserverPatternVer2;

import ObserverPatternVer2.Observer.LiSi;
import ObserverPatternVer2.Observer.LiuSi;
import ObserverPatternVer2.Observer.WangSi;

import java.util.Observer;

/**
 * @Author: Y_uan
 * @Date: 2018/11/29 16:08
 * @mail: yy494818027@163.com
 * 这个Client就是我们，用我们的视角看待这段历史
 */
public class Client {

    public static void main(String[] args) {
        //三个观察者生产出来
        Observer liSi = new LiSi();
        Observer wangSi = new WangSi();
        Observer liuSi = new LiuSi();

        //定义出韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();

        //我们后人根据历史，描述这个场景，有三个人在观察韩非子
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);

        //然后这里我们看看韩非子在干什么
        hanFeiZi.haveBreakfast();
    }
}
