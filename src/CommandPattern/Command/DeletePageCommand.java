package CommandPattern.Command;

/**
 * @Author:Y_uan
 * @Date:2018/11/2521:54
 * @Mail:yy494818027@163.com
 * 删除一个页面的命令
 */
public class DeletePageCommand extends Command{
    //执行删除一个页面的命令
    @Override
    public void execute() {
        //找到美工组
        super.pg.find();
        //删除一个页面
        super.pg.delete();
        //给出计划
        super.pg.plan();
    }
}
