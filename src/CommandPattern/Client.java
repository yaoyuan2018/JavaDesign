package CommandPattern;

import CommandPattern.Command.AddRequirementCommand;
import CommandPattern.Command.Command;
import CommandPattern.Command.Invoker;

/**
 * @Author:Y_uan
 * @Date:2018/11/2521:46
 * @Mail:yy494818027@163.com
 * 客户就是甲方，给我们钱的一方，是老大
 */
public class Client {

    public static void main(String[] args) {
        //定义我们的接头人
        Invoker xiaoSan = new Invoker();//接头人是小三

//        // 首先客户找到需求组说，过来谈需求，并修改
//        System.out.println("----------客户要求增加一个需求----------");
//        Group rg = new RequirementGroup();
//
//        //找到需求组
//        rg.find();
//
//        //增加一个需求
//        rg.add();
//
//        //要求变更计划
//        rg.plan();
        //客户要求增加一项需求
        System.out.println("------------客户要求增加一项需求-----------");
        //客户给我们下命令来
        Command command = new AddRequirementCommand();

        //接头人接收到命令
        xiaoSan.setCommand(command);

        //接头人执行命令
        xiaoSan.action();
    }
}
