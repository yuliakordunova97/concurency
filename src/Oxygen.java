import java.util.concurrent.CyclicBarrier;


public class Oxygen implements Runnable {

    private CyclicBarrier cyclicBarrier;

    public Oxygen(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    public void releaseOxygen() {
        System.out.print("o");
    }

    @Override
    public void run() {
        try {
            cyclicBarrier.await();
            releaseOxygen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
