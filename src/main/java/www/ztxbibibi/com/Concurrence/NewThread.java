package www.ztxbibibi.com.Concurrence;

/**
 * 新起线程的方式
 */
public class NewThread {

    /**
     *
     */
    private static class ZtxThread extends Thread{
        @Override
        public void run() {
            super.run();

            System.out.println("i am extends Thread");
        }
    }

    /**
     *
     */
    private static class ZtxRun implements Runnable{

        @Override
        public void run() {
            System.out.println("i am implements Runnable");
        }
    }













}
