package Bridge.implementor;

import Bridge.Product;

/**
 * @Author:Y_uan
 * @Date:2018/11/2521:07
 * @Mail:yy494818027@163.com
 */
public class IPod extends Product {
    @Override
    public void beProducted() {
        System.out.println("生产出的iPod是这个样子的……");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的iPod卖出去了……");
    }
}
