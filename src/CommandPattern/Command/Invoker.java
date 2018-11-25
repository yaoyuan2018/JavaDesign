package CommandPattern.Command;

/**
 * @Author:Y_uan
 * @Date:2018/11/2521:56
 * @Mail:yy494818027@163.com
 * 接头人的职责就是接受命令，并执行
 */
public class Invoker {
    //什么命令
    private Command command;

    //客户发出命令
    public void setCommand(Command command){
        this.command = command;
    }

    //执行客户的命令
    public void action(){
        this.command.execute();
    }
}
