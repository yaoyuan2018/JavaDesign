package Bridge;

/**
 * @Author:Y_uan
 * @Date:2018/11/2520:59
 * @Mail:yy494818027@163.com
 */
public class IPodCorp extends Corp {
    /**
     * 构造函数，由子类定义传递具体的产品进来
     *
     * @param product
     */
    public IPodCorp(Product product) {
        super(product);
    }
//    //开始生产iPod了
//    @Override
//    protected void produce() {
//        System.out.println("生产ipod……");
//    }
//
//    @Override
//    protected void sell() {
//        System.out.println("iPod畅销……");
//    }

    //狂赚钱
    public void makeMoney(){
        super.makeMoney();
        System.out.println("我赚钱呀……");
    }
}
