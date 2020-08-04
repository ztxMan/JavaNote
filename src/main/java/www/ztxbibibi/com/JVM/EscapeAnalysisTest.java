package www.ztxbibibi.com.JVM;

/**
 * 逃逸分期测试（标量替换，同步消除）
 * 对象的栈上分配，减少GC回收，提高效率
 */

public class EscapeAnalysisTest {


    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < 50000000; i++) {
            allocate();
        }
        System.out.println((System.currentTimeMillis() - start) + "ms");

    }


    static void allocate() {
        MyObject obj = new MyObject(2021, 2222.2);
    }


    static class MyObject {
        int a;
        double b;

        public MyObject(int a, double b) {
            this.a = a;
            this.b = b;
        }
    }

}
