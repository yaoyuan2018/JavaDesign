package ResponsibilityPattern;

/**
 * @Author:Y_uan
 * @Date:2018/11/2923:17
 * @Mail:yy494818027@163.com
 * 父亲
 */
public class Father implements IHandler {

    //未出嫁女儿来请示父亲
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("女儿的请示是："+women.getRequest());
        System.out.println("父亲的回答是：同意");
    }
}
