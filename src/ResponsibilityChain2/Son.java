package ResponsibilityChain2;

/**
 * @Author: Y_uan
 * @Date: 2018/12/6 10:26
 * @mail: yy494818027@163.com
 */
public class Son extends Handler {
    public Son() {
        super(3);
    }

    //儿子的答复
    @Override
    public void response(IWomen women) {
        System.out.println("------母亲向儿子请示------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是：同意\n");
    }
}
