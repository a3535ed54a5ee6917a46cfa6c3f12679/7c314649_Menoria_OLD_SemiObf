import com.google.common.collect.Maps;
import java.util.Map;

// $FF: renamed from: rb
public class class_1024 extends class_1022 {

   // $FF: renamed from: c java.util.Map
   private Map field_5400;


   // $FF: renamed from: <init> () void
   public void method_5804() {
      super.method_5804();
   }

   // $FF: renamed from: a () java.util.Map
   protected Map method_5805() {
      this.field_5400 = Maps.newHashMap();
      return this.field_5400;
   }

   // $FF: renamed from: b (qk) void
   public void method_5810(class_1539 var1) {
      this.method_189(var1.method_8359(), var1);
   }

   // $FF: renamed from: b () void
   public void method_5811() {
      this.field_5400.clear();
   }
}
