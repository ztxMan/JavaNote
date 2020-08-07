package www.ztxbibibi.com.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AndroidSdk {
    public static final int L = 1;
    static final int O = 2;
    static int X = 3;


    public int getCurVersion() {
        return curVersion;
    }

    public void setCurVersion(@AndroidSdkVersion int curVersion) {
        this.curVersion = curVersion;
    }

  @AndroidSdkVersion  public int curVersion;


    private void init(){
        setCurVersion(777);
    }

}
