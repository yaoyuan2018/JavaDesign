package strategy;

//锦囊妙计2：求吴国太开绿灯
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯，放行！");
    }
}
