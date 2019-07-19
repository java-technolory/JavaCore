package mta.edu.vn.aptprocessor;

import mta.edu.vn.log.DevLog;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

// Có tác dụng với @PublicFinal
@SupportedAnnotationTypes({"mta.edu.vn.ann.PublicFinal"})
@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class PublicFinalProcessor extends AbstractProcessor {

    private Filer filer;
    private Messager messager;

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

        // Annotation ở đây mô tả các annotation
        // Thuộc phạm vi xử lý của Processor này.
        // Vì processor này được định nghĩa chỉ dùng cho @PublicFinal
        // cho nên chắc chắn annotation chỉ có 1 phần tử.
        DevLog.log("annotation count = " + annotations.size());

        // TypeElement mô tả các annotation
        // Thuộc phạm vi Processor này xử lý.
        for (TypeElement ann : annotations) {

            // Các phần tử được chú thích bởi Annotation @PublicFinal
            // Element ở đây mô tả một đối tượng được @PublicFinal chú thích
            Set<? extends Element> e2s = roundEnv.getElementsAnnotatedWith(ann);

            for (Element e2 : e2s) {
                DevLog.log(" - e2 = " + e2);
                Set<Modifier> modifiers = e2.getModifiers();

                // @PublicFinal chỉ áp dụng cho public & final
                // Thông báo nếu sử dụng sai.
                if (!(modifiers.contains(Modifier.FINAL) && modifiers.contains(Modifier.PUBLIC))) {
                    DevLog.log("        - Error!!!");
                    messager.printMessage(Diagnostic.Kind.ERROR, "Method/field wasn't public and final ", e2);
                }
            }
        }

        // Tất cả đã được sử lý bởi Processor này.
        return true;
    }
}
