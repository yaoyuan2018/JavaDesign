package CloneTest;

/**
 * @Author: Y_uan
 * @Date: 2018/12/10 10:09
 * @mail: yy494818027@163.com
 */
public class Thing implements Cloneable {
    public Thing(){
        System.out.println("构造函数被执行了……");
    }

    @Override
    public Thing clone(){
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
