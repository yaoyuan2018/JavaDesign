package ResponsibilityPattern;

/**
 * @Author:Y_uan
 * @Date:2018/11/2923:18
 * @Mail:yy494818027@163.com
 * 丈夫类
 */
public class Husband implements IHandler {

    //妻子向丈夫请示
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("妻子的请示是："+women.getRequest());
        System.out.println("丈夫的答复是：同意");
    }
}
