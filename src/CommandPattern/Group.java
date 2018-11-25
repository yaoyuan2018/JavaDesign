package CommandPattern;

/**
 * @Author:Y_uan
 * @Date:2018/11/2521:33
 * @Mail:yy494818027@163.com
 * 项目分成了三个组，每个组还是要接受增删改的命令
 */
public abstract class Group {

    //甲乙双方分开办公，你要和哪个组讨论，你首先要找到这个组
    public abstract void find();

    //被要求增加功能
    public abstract void add();

    //被要求删除功能
    public abstract void delete();

    //被要求修改功能
    public abstract void change();

    //被要求给出所有的变更计划
    public abstract void plan();
}
