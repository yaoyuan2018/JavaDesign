package ResponsibilityPattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author:Y_uan
 * @Date:2018/11/2923:20
 * @Mail:yy494818027@163.com
 * 我们后人来看这样的社会道德
 */
@SuppressWarnings("all")
public class Client {

    public static void main(String[] args) {
        //随机挑选几个女性
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<IWomen>();
        for (int i=0;i<5;i++){
            arrayList.add(new Women(rand.nextInt(4),"我要出去逛街"));
        }

        //定义三个请示对象
        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();

        for (IWomen women:arrayList){
            if (women.getType()==1){
                //未婚少女，请示父亲
                System.out.println("\n-----女儿向父亲请示-----");
                father.HandleMessage(women);
            }else if(women.getType()==2){
                System.out.println("\n-----妻子向丈夫请示-----");
                husband.HandleMessage(women);
            }else if (women.getType()==3){
                System.out.println("\n-----母亲想儿子请示-----");
                son.HandleMessage(women);
            }else{
                //暂时啥也不做
            }
        }
    }
}
