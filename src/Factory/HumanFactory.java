package Factory;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * @Author: Y_uan
 * @Date: 2018/11/22 8:29
 * @mail: yy494818027@163.com
 * 今天讲女娲造人的故事，这个故事梗概是这样的：
 * 很久很久以前，盘古开辟了天地，用身躯造出日月星辰、山川草木，天地一片繁华
 * One day，女娲下界走了一遭，哎！太寂寞，太孤独了、没个会笑的、会哭的、会说话的东东
 */
@SuppressWarnings("all")
public class HumanFactory {
    //定义一个MAP，初始化过的Human对象都放在这里
    private static HashMap<String,Human> humans = new HashMap<String,Human>();
    //定一个烤箱，泥巴塞进去，人就出来，这个太先进了
    public static Human createHuman(Class c){
        Human human = null; //定义一个类型的人类

        try {
            //如果Map中有，则直接从中取出，不用初始化了
            if (humans.containsKey(c.getSimpleName())){
                human = humans.get(c.getSimpleName());
            } else {
              human = (Human) Class.forName(c.getName()).newInstance();
              //放到MAP中
                humans.put(c.getSimpleName(),human);
            }
        } catch (InstantiationException e) {
            //你要是不说个人种颜色的话，没法烤
            System.out.println("必须指定人种的颜色");
        } catch (IllegalAccessException e) {
            //定义的人种有问题，那就烤不出来了，这是……
            System.out.println("人种定义错误！");
        } catch (ClassNotFoundException e) {
            //你随便说个人种，我到哪里给你制造去？！
            System.out.println("混蛋，你指定的人种找不到");
        }
        return human;
    }

    public static Human createHuman(){
        Human human = null; //定义一个类型的人类

        //首先是获得有多少个实现类，多少个人种
        List<Class> concreateHumanList = ClassUtils.getAllClassByInterface(Human.class);
        //八卦炉自己开始想烧出什么人就什么人
        Random random = new Random();

        int rand = random.nextInt(concreateHumanList.size());

        human = createHuman(concreateHumanList.get(rand));

        return human;
    }
}
