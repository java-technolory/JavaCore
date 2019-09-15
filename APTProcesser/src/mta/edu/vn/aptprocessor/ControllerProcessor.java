package mta.edu.vn.aptprocessor;

import mta.edu.vn.log.DevLog;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.List;
import java.util.Set;

// Có tác dụng @Controller
@SupportedAnnotationTypes({"mta.edu.vn.ann.Controller"})
@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class ControllerProcessor extends AbstractProcessor {

    private Filer filer;
    private Messager messager;

    // annotation - là các Annotation chịu trách nhiệm của Processor này.
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        this.filer = processingEnv.getFiler();
        this.messager = processingEnv.getMessager();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        DevLog.log("\n\n");
        DevLog.log("=======================================================================");
        DevLog.log("#process(...) in " + this.getClass().getSimpleName());
        DevLog.log("=======================================================================");

        for (TypeElement ann : annotations) {
            DevLog.log("===> TypeElement ann = " + ann);

            //
            List<? extends Element> es = ann.getEnclosedElements();
            DevLog.log("===> ann.getEnclosedElements() count = " + es.size());

            for (Element e : es) {
                DevLog.log("==================> EnclosedElement: " + e);
            }

            Element enclosingElement = ann.getEnclosingElement();

            DevLog.log("===> ann.getEnclosingElement() = " + enclosingElement);

            ElementKind kind = ann.getKind();
            DevLog.log("===> ann.getKind() = " + kind);

            Set<? extends Element> e2s = roundEnv.getElementsAnnotatedWith(ann);

            DevLog.log("===> roundEnv.getElementsAnnotatedWith(ann) count = " + e2s.size());

            for (Element e2 : e2s) {
                DevLog.log("==================> ElementAnnotationWith: " + e2);
                DevLog.log("        - Kind: " + e2.getKind());

                // @Controller chỉ dùng cho class!
                // Thông báo nếu sử dụng sai.
                if (e2.getKind() != ElementKind.CLASS) {
                    DevLog.log("        - Error!!!");
                    messager.printMessage(Diagnostic.Kind.ERROR, "@Controller using for class only ", e2);
                } else {
                    // Tên class sử dụng @Controller
                    String className = e2.getSimpleName().toString();

                    // @Controller chỉ áp dụng cho class có đuôi là Controller.
                    // Thông báo nếu sử dụng sai.
                    if (!className.endsWith("Controller")) {
                        DevLog.log("        - Error!!!");
                        messager.printMessage(Diagnostic.Kind.ERROR, "Class using @Controller must have suffix Controller", e2);
                    }
                }
            }
        }
        return true;
    }
}
