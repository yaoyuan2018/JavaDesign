package Factory;

import java.util.List;
import java.util.Random;

/**
 * @Author: Y_uan
 * @Date: 2018/11/22 8:45
 * @mail: yy494818027@163.com
 */
public class NvWa {

    public static void main(String[] args) {
        //女娲第一次造人，试验性质，少造点，火候不足，缺陷产品
        System.out.println("---------造出的第一批人是这样的：白人---------");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.cry();
        whiteHuman.laugh();
        whiteHuman.talk();

        //女娲第二次造人，火候加足点，然后又出了个次品，黑人
        System.out.println("\n\n---------造出的第二批人是这样的：黑人---------");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.talk();

        //第三批人了，这次火候掌握的正好，黄种人
        System.out.println("\n\n---------造出的第二批人是这样的：黄种人---------");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();

        //女娲烦躁了，爱是啥人种就是啥人种，烧吧

        for (int i=0;i<1000;i++){
            System.out.println("\n\n---------随机产生人种了---------");
            Human human = HumanFactory.createHuman();
            human.cry();
            human.laugh();
            human.talk();
        }

    }
}
