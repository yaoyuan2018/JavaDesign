package ResponsibilityChain2;

/**
 * @Author: Y_uan
 * @Date: 2018/12/6 10:22
 * @mail: yy494818027@163.com
 * 父亲
 */
public class Father extends Handler {

    public Father() {
        super(1);
    }

    //父亲的答复
    @Override
    public void response(IWomen women) {
        System.out.println("------女儿向父亲请示------");
        System.out.println(women.getRequest());
        System.out.println("父亲的回答是：同意\n");
    }
}
