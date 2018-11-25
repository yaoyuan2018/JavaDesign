package Bridge;

import Bridge.implementor.Clothes;
import Bridge.implementor.House;
import Bridge.implementor.IPod;

/**
 * @Author:Y_uan
 * @Date:2018/11/2520:55
 * @Mail:yy494818027@163.com
 * 我要关心我的公司了
 */
public class Client {

    public static void main(String[] args) {
        House house = new House();
        System.out.println("-------房地产公司是这样子运行的-------");
        //先找到我的公司
        HouseCorp houseCorp = new HouseCorp(house);
        //看我怎么挣钱
        houseCorp.makeMoney();
        System.out.println("\n");

//        System.out.println("-------服装公司是这样子运行的-------");
//        ClothesCorp clothesCorp = new ClothesCorp();
//        clothesCorp.makeMoney();

        //山寨公司生产的产品很多，不过我只要指定产品就成了
        System.out.println("-------山寨公司是这样子运行的-------");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
        shanZhaiCorp.makeMoney();
    }
}
