package IteratorPattern;

import Bridge.Product;

/**
 * @Author:Y_uan
 * @Date:2018/11/2622:21
 * @Mail:yy494818027@163.com
 */
public class Project implements IProject {

    //项目名称
    private String name = "";

    //项目成员数量
    private int num = 0;

    //项目费用
    private int cost = 0;

    //定义一个构造函数，把所有老板需要看到的信息存储起来
    public Project(String name,int num,int cost){
        //赋值到类的成员变量中
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    //得到项目的信息
    @Override
    public String getProjectInfo() {
        String info = "";

        //获得项目的名称
        info = info + "项目的名称是：" + this.name;
        //获得项目人数
        info = info + "\t项目人数：" + this.num;
        //项目费用
        info = info + "\t项目费用：" + this.cost;

        return info;
    }
}
