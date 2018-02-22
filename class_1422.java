import java.util.Collections;
import java.util.List;

// $FF: renamed from: p0
public class class_1422 implements class_42 {

   // $FF: renamed from: b boolean
   private final boolean field_7562;
   // $FF: renamed from: c boolean
   private final boolean field_7563;
   // $FF: renamed from: d java.util.List
   private final List field_7564;


   // $FF: renamed from: <init> (boolean, boolean, java.util.List) void
   public void method_7763(boolean var1, boolean var2, List var3) {
      super();
      this.field_7562 = var1;
      this.field_7563 = var2;
      this.field_7564 = var3;
   }

   // $FF: renamed from: b () boolean
   public boolean method_7764() {
      return this.field_7562;
   }

   // $FF: renamed from: c () boolean
   public boolean method_7765() {
      return this.field_7563;
   }

   // $FF: renamed from: d () java.util.List
   public List method_7766() {
      return Collections.unmodifiableList(this.field_7564);
   }
}
