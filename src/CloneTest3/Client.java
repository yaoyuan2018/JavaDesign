package CloneTest3;

/**
 * @Author: Y_uan
 * @Date: 2018/12/10 10:19
 * @mail: yy494818027@163.com
 */
public class Client {

    public static void main(String[] args) {
        //产生一个对象
        Thing thing = new Thing();
        //设置一个值
        thing.setValue("张三");

        //拷贝一个对象
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");

        System.out.println(thing.getValue());
    }

}
