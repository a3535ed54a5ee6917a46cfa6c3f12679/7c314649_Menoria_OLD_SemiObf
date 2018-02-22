import com.google.common.collect.Sets;
import java.util.Set;

// $FF: renamed from: bK
public class class_540 extends class_539 {

   // $FF: renamed from: r java.util.Set
   private static final Set field_2396;


   // $FF: renamed from: <init> (y) void
   public void getBlock15(class_133 var1) {
      super.getBlock12(1.0F, var1, field_2396);
   }

   // $FF: renamed from: b (aji) boolean
   public boolean method_2939(aji var1) {
      String[] var2 = class_752.method_4253();
      aji var10000 = var1;
      aji var10001 = class_1192.field_6104;
      if(var2 != null) {
         if(var1 == class_1192.field_6104) {
            return true;
         }

         var10000 = var1;
         var10001 = class_1192.field_6106;
      }

      return var10000 == var10001;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      field_2396 = Sets.newHashSet(new aji[]{class_1192.field_6027, class_1192.field_6028, class_1192.field_6037, class_1192.field_6038, class_1192.field_6104, class_1192.field_6106, class_1192.field_6108, class_1192.field_6087, class_1192.field_6114, class_1192.field_6135});
   }
}
