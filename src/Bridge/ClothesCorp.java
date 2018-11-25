package Bridge;

/**
 * @Author:Y_uan
 * @Date:2018/11/2520:49
 * @Mail:yy494818027@163.com
 */
public class ClothesCorp extends Corp {
    /**
     * 构造函数，由子类定义传递具体的产品进来
     *
     * @param product
     */
    public ClothesCorp(Product product) {
        super(product);
    }
//    //服装公司生产衣服
//    @Override
//    protected void produce() {
//        System.out.println("服装公司生产衣服……");
//    }
//
//    @Override
//    protected void sell() {
//        System.out.println("服装公司卖衣服……");
//    }

    //服装公司不景气，但怎么说也是赚钱行业
    public void makeMoney(){
        super.makeMoney();
        System.out.println("服装公司赚小钱……");
    }
}
