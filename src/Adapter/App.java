package Adapter;

import Adapter.IUser.IUserInfo;
import Adapter.IUser.UserInfo;
import Adapter.OuterUser.OuterUserInfo;

/**
 * @Author: Y_uan
 * @Date: 2018/11/23 10:51
 * @mail: yy494818027@163.com
 * 这就是我们具体的应用了，比如老板要查所有的20-30的女性信息
 */
public class App {

    public static void main(String[] args) {
/*        //没有与外系统连接的时候，是这样写的
        IUserInfo youngGirl = new UserInfo();
        //从数据库查到101个
        for (int i=0; i<101; i++){
            youngGirl.getMobileNumber();
        }*/

        //老板一想不对啊，兔子不吃窝边草，还是找人力资源的员工好点
        IUserInfo youngGirl = new OuterUserInfo();
        //从数据库查到101个
        for (int i = 0; i < 101; i++){
            youngGirl.getMobileNumber();
        }
    }
}
