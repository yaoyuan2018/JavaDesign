package AbstractFactory;

/**
 * @Author: Y_uan
 * @Date: 2018/11/22 10:27
 * @mail: yy494818027@163.com
 * 世界上有哪些类型的人，列出来
 */
public enum HumanEnum {

    //把世界上所有人类型都定义出来
    YellowMaleHuman("AbstractFactory.YellowHuman.YellowMaleHuman"),
    YellowFemaleHuman("AbstractFactory.YellowHuman.YellowFemaleHuman"),
    WhiteMaleHuman("AbstractFactory.WhiteHuman.WhiteMaleHuman"),
    WhiteFemaleHuman("AbstractFactory.WhiteHuman.WhiteFemaleHuman"),
    BlackFemaleHuman("AbstractFactory.BlackHuman.BlackFemaleHuman"),
    BlackMaleHuman("AbstractFactory.BlackHuman.BlackMaleHuman");

    private String vlaue = "";
    //定义构造函数，目的是Data(value)类型的相匹配
    private HumanEnum(String value){
        this.vlaue = value;
    }

    public String getVlaue(){
        return this.vlaue;
    }
    /**
     * java enum类型尽量简单使用，尽量不要使用多态、继承等方法
     * 毕竟用Class完全可以替代enum
     */

}
