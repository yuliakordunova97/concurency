import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Hydrogen implements Runnable {

    private CyclicBarrier cyclicBarrier;

    public Hydrogen(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    public void releaseHydrogen(){
        System.out.print("h");
    }
    @Override
    public void run() {
        try {
            try {
                cyclicBarrier.await();
                releaseHydrogen();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
