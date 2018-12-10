package PrototypePattern;

/**
 * @Author: Y_uan
 * @Date: 2018/12/10 9:27
 * @mail: yy494818027@163.com
 */
public class AdvTemplate {
    //广告信名称
    private String advSubject = "XX银行国庆信用卡抽奖活动";

    //广告信内容
    private String advContext = "国庆抽奖活动通知：只要刷卡就送你一百万！……";

    //取得广告信的名称
    public String getSAdvSubject(){
        return this.advSubject;
    }

    //取得广告信的内容
    public String getAdvContext(){
        return this.advContext;
    }
}