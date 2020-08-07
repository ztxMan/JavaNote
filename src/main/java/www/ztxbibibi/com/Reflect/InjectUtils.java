package www.ztxbibibi.com.Reflect;

import www.ztxbibibi.com.Annotation.AndroidSdkVersion;
import www.ztxbibibi.com.Concurrence.NewThread;

import java.lang.reflect.Field;

public class InjectUtils {

    public static void injectThread(NewThread thread){

        Class<? extends NewThread> clazz = thread.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {

            if (field.isAnnotationPresent(AndroidSdkVersion.class)) {

                AndroidSdkVersion annotation = field.getAnnotation(AndroidSdkVersion.class);
                int id = annotation.value();
//
            }
        }

    }
}
