package Facade;

/**
 * @Author: Y_uan
 * @Date: 2018/11/23 9:52
 * @mail: yy494818027@163.com
 * 定义一个写信的过程
 */
public interface LetterProcess {

    //首先要写信的内容
    public void writeContext(String context);

    //其次写信封
    public void fillEnvelope(String address);

    //把信放到信封里
    public void letterIntoEnvelope();

    //然后投递
    public void sendLetter();
}
