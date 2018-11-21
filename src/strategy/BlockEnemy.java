package strategy;

//锦囊妙计3：孙夫人断后，挡住追兵
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
