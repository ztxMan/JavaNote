package www.ztxbibibi.com.DesignMode.agency.dynamic;

import www.ztxbibibi.com.DesignMode.agency.statics.IHttpRequest;
import www.ztxbibibi.com.DesignMode.agency.statics.OkHttpClient;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicHttpRequestProxy {

    static DynamicHttpRequestProxy instance;


   private DynamicHttpRequestProxy(){


   }

   public static DynamicHttpRequestProxy getInstance(){
       if (instance == null) {
           instance = new DynamicHttpRequestProxy();
       }
       return instance;
   }

   public <T>T create(Class<T> service){

       IHttpRequest imp =new OkHttpClient();
       return (T) Proxy.newProxyInstance(DynamicHttpRequestProxy.class.getClassLoader(),
               new Class[]{service}, new InvocationHandler() {
                   @Override
                   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                       return method.invoke(imp,args);
                   }
               });
   }



}
