package ResponsibilityPattern;

/**
 * @Author:Y_uan
 * @Date:2018/11/2923:15
 * @Mail:yy494818027@163.com
 * 父系社会，那就是男性有至高权利，handler控制权
 */
public interface IHandler {

    //一个女性（女儿，妻子或是母亲）要求逛街，你要处理这个请求
    public void HandleMessage(IWomen women);
}
