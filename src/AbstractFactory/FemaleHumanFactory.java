package AbstractFactory;

/**
 * @Author: Y_uan
 * @Date: 2018/11/22 13:50
 * @mail: yy494818027@163.com
 * 女性创建工厂
 */
public class FemaleHumanFactory extends AbstractHumanFactory {

    //创建一个女性黄种人
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowFemaleHuman);
    }

    //创建一个女性白种人
    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFemaleHuman);
    }

    //创建一个女性黑种人
    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFemaleHuman);
    }
}
