package Multition;

/**
 * @Author:Y_uan
 * @Date:2018/11/2123:11
 * @Mail:yy494818027@163.com
 * 大臣们太惨了，一个皇帝都伺候不过来了，现在还来了两个皇帝
 * TND，不管了，找到个皇帝，磕头，请安就成了
 */
@SuppressWarnings("all")
public class Minister {
    /**
     *@Author:姚远 on 2018/11/21 23:13
     *@Param:
     *@return:
     *@Description:
     */
    public static void main(String[] args) {
        int ministerNum = 10;   //10个大臣
        for (int i=0; i<ministerNum;i++){
            Emperor emperor = Emperor.getInstance();
            System.out.println("第"+(i+1)+"个大臣参拜的是：");
            emperor.emperorInfo();
        }
    }
}
