package Bridge.implementor;

import Bridge.Product;

/**
 * @Author:Y_uan
 * @Date:2018/11/2521:03
 * @Mail:yy494818027@163.com
 * 这是我集团公司盖的房子
 */
public class House extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的房子是这个样子的……");
    }

    @Override
    public void beSelled() {
        System.out.println("生产的房子卖出去了……");
    }
}
