package Adapter.IUser;

/**
 * @Author: Y_uan
 * @Date: 2018/11/23 10:42
 * @mail: yy494818027@163.com
 * 用户信息对象
 */
public interface IUserInfo {

    //获得用户姓名
    public String getUserName();

    //获得家庭地址
    public String getHomeAddress();

    //手机号码
    public String getMobileNumber();

    //办公电话，一般是座机
    public String getOfficeTelNumber();

    //这个人的职位是啥
    public String getJobPosition();

    //获得家庭电话，这个有点缺德，我是不喜欢打家庭电话讨论工作
    public String getHomeTelNumber();
}
