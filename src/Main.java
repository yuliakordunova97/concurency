import sun.awt.windows.ThemeReader;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Main {


    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        System.out.print("String input: ");
        new Thread(new Hydrogen(cyclicBarrier)).start();
        new Thread(new Hydrogen(cyclicBarrier)).start();

        new Thread(new Oxygen(cyclicBarrier)).start();


    }

}
