package Bridge;

import Bridge.implementor.House;

/**
 * @Author:Y_uan
 * @Date:2018/11/2520:46
 * @Mail:yy494818027@163.com
 * 房地产公司，准确翻译是realty corp
 */
public class HouseCorp extends Corp{
    /**
     * 构造函数，由子类定义传递具体的产品进来
     *
     * @param house
     */
    public HouseCorp(House house) {
        super(house);
    }

    /**
     * 房地产公司很High了，赚钱，计算利润
     */
    public void makeMoney(){
        super.makeMoney();
        System.out.println("房地产公司赚大钱了……");
    }

//    //房地产公司就是盖房子
//    protected void produce(){
//        System.out.println("房地产公司盖房子……");
//    }
//
//    //房地产卖房子，自己住那可不赚钱
//    protected void sell(){
//        System.out.println("房地产公司赚大钱了……");
//    }
//
//    public void makeMoney(){
//        super.makeMoney();
//        System.out.println("房地产公司赚大钱了……");
//    }
}
