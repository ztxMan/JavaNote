package www.ztxbibibi.com.Annotation;

import com.google.auto.service.AutoService;

import javax.annotation.processing.*;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;
//ָ��ע�⴦�������ĵ�ע�⴦����

@SupportedAnnotationTypes("com.ztxbibibi.com.Annotation.AndroidSdkVersion")
@AutoService(Processor.class)
public class MyAnnotationProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        Messager messager = processingEnv.getMessager();
        messager.printMessage(Diagnostic.Kind.NOTE,"MyAnnotationProcessor------process");
        return false;
    }
}
