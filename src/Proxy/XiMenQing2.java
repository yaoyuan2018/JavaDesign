package Proxy;

/**
 * @Author: Y_uan
 * @Date: 2018/11/21 15:22
 * @mail: yy494818027@163.com
 */
public class XiMenQing2 {
    public static void main(String[] args) {
        JiaShi jiaShi = new JiaShi();
        WangPo wangPo = new WangPo(jiaShi);

        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();
    }
}

//代理模式主要使用了Java的多肽，干活的是被代理类，代理类主要是接活
