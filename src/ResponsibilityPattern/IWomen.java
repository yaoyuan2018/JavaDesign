package ResponsibilityPattern;

/**
 * @Author:Y_uan
 * @Date:2018/11/2923:11
 * @Mail:yy494818027@163.com
 * 古代悲哀女性的总称
 */
public interface IWomen {

    //获得个人状况
    public int getType();

    //获得个人请示，你要干什么？出去逛街？约会？还是看电影
    public String getRequest();
}
