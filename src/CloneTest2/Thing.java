package CloneTest2;

import java.util.ArrayList;

/**
 * @Author: Y_uan
 * @Date: 2018/12/10 10:16
 * @mail: yy494818027@163.com
 */
public class Thing implements Cloneable {
    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<String>();

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

    //设置HashMap的值
    public void setValue(String value){
        this.arrayList.add(value);
    }
    //取得arrayList的值
    public ArrayList<String> getValue(){
        return this.arrayList;
    }
}
