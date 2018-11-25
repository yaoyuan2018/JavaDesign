package Bridge.implementor;

import Bridge.Corp;
import Bridge.Product;

/**
 * @Author:Y_uan
 * @Date:2018/11/2521:05
 * @Mail:yy494818027@163.com
 * 我集团公司产生的衣服
 */
public class Clothes extends Product {

    public void beProducted(){
        System.out.println("生产出的衣服是这个样子的……");
    }

    @Override
    public void beSelled() {
        System.out.println("生产的衣服卖出去了……");
    }
}
