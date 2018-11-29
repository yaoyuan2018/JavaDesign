package ResponsibilityPattern;

/**
 * @Author:Y_uan
 * @Date:2018/11/2923:19
 * @Mail:yy494818027@163.com
 * 儿子类
 */
public class Son implements IHandler{

    //目前向儿子请示
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("母亲的请示是："+women.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}
