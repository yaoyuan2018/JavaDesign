package Facade;

/**
 * @Author: Y_uan
 * @Date: 2018/11/23 10:10
 * @mail: yy494818027@163.com
 */
public class ModenPostOffice {
    private LetterProcess letterProcess = new LetterProcessImpl();
    private Police letterPolice = new Police();

    //写信，封装，投递一体化
    public void sendLetter(String context,String address){

        //帮你写信
        letterProcess.writeContext(context);

        //写好信封
        letterProcess.fillEnvelope(address);

        //警察要检查信件了
        letterPolice.checkLetter(letterProcess);

        //把信放到信封中
        letterProcess.letterIntoEnvelope();

        //邮递信件
        letterProcess.sendLetter();
    }
}
