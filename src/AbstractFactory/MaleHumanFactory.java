package AbstractFactory;

/**
 * @Author: Y_uan
 * @Date: 2018/11/22 13:48
 * @mail: yy494818027@163.com
 * 男性创建工厂
 */
public class MaleHumanFactory extends AbstractHumanFactory {

    //创建一个男性黄种人
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowMaleHuman);
    }

    //创建一个男性白种人
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    //创建一个男性黑种人
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }
}
