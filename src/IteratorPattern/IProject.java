package IteratorPattern;

/**
 * @Author: Y_uan
 * @Date: 2018/11/27 13:37
 * @mail: yy494818027@163.com
 * 定义一个接口，所有项目都是一个接口
 */
public interface IProject {

    //增加项目
    public void add(String name, int num, int cost);

    //从老板这里看到的就是项目信息
    public String getProjectInfo();

    //获得一个可以被遍历的对象
    public IProjectIterator iterator();
}
