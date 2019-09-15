package mta.edu.vn.aptprocessor;

import mta.edu.vn.log.DevLog;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;
import javax.tools.Diagnostic;
import java.util.List;
import java.util.Set;

// Chỉ có tác dụng với @Action
@SupportedAnnotationTypes({"mta.edu.vn.ann.Action"})
@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class ActionProcessor extends AbstractProcessor {

    private Filer filer;
    private Messager messager;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        this.filer = processingEnv.getFiler();
        this.messager = processingEnv.getMessager();
    }

    // annotations - là các Annotation chịu tác dụng của Processor này.
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {

        DevLog.log("\n\n");
        DevLog.log("=======================================================================");
        DevLog.log("#process(...) in " + this.getClass().getSimpleName());
        DevLog.log("=======================================================================");

        for (TypeElement ann : annotations) {
            DevLog.log("===> TypeElement annotation = " + ann);

            // Class chứa Annotation
            List<? extends Element> es = ann.getEnclosedElements();
            DevLog.log("===> ann.getEnclosedElements() count = " + es.size());
            for (Element e : es) {
                DevLog.log("==================> EnclosedElement: " + e);
            }

            Element enclosingElement = ann.getEnclosingElement();
            DevLog.log("===> an.getEnclosingElement() = " + enclosingElement);

            ElementKind kind = ann.getKind();
            DevLog.log("===> an.getKind() = " + kind);

            Set<? extends Element> e2s = roundEnv.getElementsAnnotatedWith(ann);

            DevLog.log("===> roundEnv.getElementsAnnotatedWith(ann) count = " + e2s.size());

            for (Element e2 : e2s) {
                DevLog.log("\"==================> EnclosedElement:  " + e2);
                DevLog.log("        - Kind : " + e2.getKind());

                //@Action chỉ dùng cho method.
                //Thông báo nếu sử dụng sai.
                if (e2.getKind() != ElementKind.METHOD) {
                    DevLog.log("        - Error!!!");
                    messager.printMessage(Diagnostic.Kind.ERROR, "@Action using for method only ", e2);
                } else {
                    // Tên method sử dụng @Action
                    String methodName = e2.getSimpleName().toString();

                    // Biết chắc e2 mô tả method.
                    // (ExecutableElement mô tả cho method, constructor ...)
                    // (ExecutableElement described for method, constructor
                    ExecutableElement method = (ExecutableElement) e2;

                    DevLog.log("        - method: " + method);
                    TypeMirror retType = method.getReturnType();
                    DevLog.log("        - method.getReturnType(): " + retType);

                    // @Action chỉ sử dụng cho method trả về String
                    // Thông báo nếu sử dụng sai
                    if (!String.class.getName().equals(retType.toString())) {
                        DevLog.log("        - Error!!!");
                        messager.printMessage(Diagnostic.Kind.ERROR, "Method using @Action must return String", e2);
                    }

                }
            }
        }

        return true;
    }
}
