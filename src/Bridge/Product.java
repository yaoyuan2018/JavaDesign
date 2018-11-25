package Bridge;

/**
 * @Author:Y_uan
 * @Date:2018/11/2521:01
 * @Mail:yy494818027@163.com
 * 这是我整个集团公司的产品类
 */
public abstract class Product {

    //甭管是什么产品它总要是能被生产出来
    public abstract void beProducted();

    //生产出来的东西，一定要销售出去，否则亏本呀
    public abstract void beSelled();
}
