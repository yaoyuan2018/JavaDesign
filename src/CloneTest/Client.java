package CloneTest;

/**
 * @Author: Y_uan
 * @Date: 2018/12/10 10:11
 * @mail: yy494818027@163.com
 */
public class Client {
    public static void main(String[] args) {
        //产生一个对象
        Thing thing = new Thing();

        //拷贝一个对象
        Thing cloneThing = thing.clone();
    }
}
