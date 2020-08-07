package www.ztxbibibi.com.JVM;


//���ݷ������ԣ������滻��ͬ��������
//�����ջ�Ϸ��䣬����GC���գ����Ч��
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
