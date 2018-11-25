package Bridge;

/**
 * @Author:Y_uan
 * @Date:2018/11/2521:13
 * @Mail:yy494818027@163.com
 */
public class ShanZhaiCorp extends Corp {
    /**
     * 构造函数，由子类定义传递具体的产品进来
     *
     * @param product
     */

    //不知道什么产品，等被调用的才知道
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    //狂赚钱
    public void makeMoney(){
        super.makeMoney();
        System.out.println("我赚钱呀……");
    }
}
