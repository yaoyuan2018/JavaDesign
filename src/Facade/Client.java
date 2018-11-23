package Facade;

/**
 * @Author: Y_uan
 * @Date: 2018/11/23 9:58
 * @mail: yy494818027@163.com
 * 我开始给朋友写信了
 */
public class Client {
    public static void main(String[] args) {
/*        //创建一个处理信件的过程
        LetterProcess letterProcess = new LetterProcessImpl();

        //开始写信
        letterProcess.writeContext("Hello,It's me,do you know who I am? I'm your daddy. I'd like to...");

        //开始写信封
        letterProcess.fillEnvelope("Happy Road NO.6666,God Province,Heaven");

        //把信放到信封里，并封装好
        letterProcess.letterIntoEnvelope();

        //跑到邮局把信塞到邮箱，投递
        letterProcess.sendLetter();*/

        //这个过程与高内聚要求相差甚远，你想，你要知道这四个步骤，而且还要知道这四个步骤的顺序，一旦出错，信就不可能邮寄出去

        //现代化的邮局，有这项服务，邮局名称叫Hell Road
        ModenPostOffice hellRoadPostOffice = new ModenPostOffice();

        //你只要把信的内容和收信人地址给他，他会帮你完成一系列的工作：
        String address = "天堂路666号";
        String context = "儿子，爸爸很想你……";

        hellRoadPostOffice.sendLetter(context, address);
    }
}
