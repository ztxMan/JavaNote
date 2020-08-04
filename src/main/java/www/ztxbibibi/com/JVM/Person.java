package www.ztxbibibi.com.JVM;

/**
 * HSDB 虚拟机运行时数据内存分析
 */
public class Person {
    public int work() throws InterruptedException {
        int x= 1;
        int y = 2;
        int z = (x+y)*10;
        return z;
    }


    public static void main(String[] args) throws InterruptedException {
        Person person = new Person();
        person.work();
    }
}
