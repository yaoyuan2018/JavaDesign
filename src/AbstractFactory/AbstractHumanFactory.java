package AbstractFactory;

/**
 * @Author: Y_uan
 * @Date: 2018/11/22 10:44
 * @mail: yy494818027@163.com
 * 编写一个抽象类，根据enum创建一个人出来
 */
public abstract class AbstractHumanFactory implements HumanFactory {

    /**
     * 给定一个性别人种，创建一个人类出来，专业术语是产生产品等级
     * @return
     */
    protected Human createHuman(HumanEnum humanEnum){
        Human human = null;
        //如果传递进来不是Enum中具体的一个Element的话，则不处理
        if (!humanEnum.getVlaue().equals("")){
            try {
                human = (Human)Class.forName(humanEnum.getVlaue()).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return human;
    }
}
