package www.ztxbibibi.com.DesignMode.agency;

import sun.misc.ProxyGenerator;
import www.ztxbibibi.com.DesignMode.agency.dynamic.DynamicHttpRequestProxy;
import www.ztxbibibi.com.DesignMode.agency.statics.IHttpRequest;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

public class App {

    public static void main(String[] args) {


        DynamicHttpRequestProxy.getInstance().create(IHttpRequest.class).get();
        try {
            proxy();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 动态代理 在内存中生成的class文件 输出到lib文件夹下
     * @throws Exception
     */
    static void proxy() throws Exception{
        String name = IHttpRequest.class.getName() +"$Proxy()";
        byte[] bytes = ProxyGenerator.generateProxyClass(name, new Class[]{IHttpRequest.class});
        FileOutputStream fos  =new FileOutputStream("lib/"+name+".class");
        fos.write(bytes);
        fos.close();

    }
}
