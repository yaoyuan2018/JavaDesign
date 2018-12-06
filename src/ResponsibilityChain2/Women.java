package ResponsibilityChain2;

/**
 * @Author: Y_uan
 * @Date: 2018/11/29 16:53
 * @mail: yy494818027@163.com
 * 古代女性的总称
 */
public class Women implements IWomen {
    /**
     * 通过一个int类型的参数来描述妇女的个人状况
     * 1---未出嫁
     * 2---出家
     * 3---丧夫
     */
    private int type = 0;

    //妇女的请示
    private String request = "";

    //构造函数传递过来请求
    public Women(int type, String request) {
        this.type = type;

        //为了显示好看点，我在这里做了点处理
        switch (this.type){
            case 1:
                this.request = "女儿的请求是："+request;
                break;
            case 2:
                this.request = "妻子的请求是："+request;
                break;
            case 3:
                this.request = "母亲的请求是："+request;
        }
    }

    //获得自己的状况
    @Override
    public int getType() {
        return this.type;
    }

    //获得自己的请求
    @Override
    public String getRequest() {
        return this.request;
    }
}
