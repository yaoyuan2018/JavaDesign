package ResponsibilityChain2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: Y_uan
 * @Date: 2018/12/6 10:31
 * @mail: yy494818027@163.com
 * 我们后人来看这样的社会道德
 */
@SuppressWarnings("all")
public class Client {

    public static void main(String[] args) {
        //随机挑选几个女性
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i=0;i<5;i++){
            arrayList.add(new Women(random.nextInt(3)+1,"我要去逛街"));
        }

        //定义三个请示对象
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        //设置请示顺序
        father.setNext(husband);
        husband.setNext(son);

        for (IWomen women:arrayList){
            father.HandleMessage(women);
        }
    }
}
