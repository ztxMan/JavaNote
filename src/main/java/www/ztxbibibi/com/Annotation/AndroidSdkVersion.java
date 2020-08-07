package www.ztxbibibi.com.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static www.ztxbibibi.com.Annotation.AndroidSdk.L;
import static www.ztxbibibi.com.Annotation.AndroidSdk.O;


@Target({ElementType.TYPE,ElementType.PARAMETER,ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
@IntDef({L, O})
public @interface AndroidSdkVersion {
    int value() default 0;


}
