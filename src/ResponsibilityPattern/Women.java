package ResponsibilityPattern;

/**
 * @Author:Y_uan
 * @Date:2018/11/2923:12
 * @Mail:yy494818027@163.com
 * 古代女性的总称
 */
public class Women implements IWomen {
    /**
     * 通过一个int类型的参数来描述妇女的个人状况
     * 1---未出嫁
     * 2---出嫁
     * 3---丧夫
     */
    private int type = 0;

    //妇女的请示
    private String request = "";

    //构造函数传递过来请求

    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }

    //获得自己的状况
    public int getType(){
        return this.type;
    }

    //获得妇女的请求
    public String getRequest(){
        return this.request;
    }
}
