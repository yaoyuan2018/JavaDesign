package CommandPattern.Command;

import CommandPattern.CodeGroup;
import CommandPattern.PageGroup;
import CommandPattern.RequirementGroup;

/**
 * @Author:Y_uan
 * @Date:2018/11/2521:50
 * @Mail:yy494818027@163.com
 * 命令的抽象类，我们把客户发出的命令定义成一个一个的对象
 */
public abstract class Command {

    //把三个组都定义好，子类可以直接使用
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    //只要一个方法，你要我做什么事情
    public abstract void execute();

}
