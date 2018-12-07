package MultiVisitor;

/**
 * @Author: Y_uan
 * @Date: 2018/12/7 11:22
 * @mail: yy494818027@163.com
 * 负责展示报表的产生
 */
public interface IShowVisitor extends IVisitor {
    //展示报表
    public void reprot();
}
