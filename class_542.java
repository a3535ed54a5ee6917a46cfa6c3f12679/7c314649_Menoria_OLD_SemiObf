import com.google.common.collect.Sets;
import java.util.Set;

// $FF: renamed from: bI
public class class_542 extends class_539 {

   // $FF: renamed from: r java.util.Set
   private static final Set field_2398;


   // $FF: renamed from: <init> (y) void
   protected void getBlock17(class_133 var1) {
      super.getBlock12(3.0F, var1, field_2398);
   }

   // $FF: renamed from: a (add, aji) float
   public float method_2927(add var1, aji var2) {
      String[] var3 = class_752.method_4253();
      awt var10000 = var2.method_2424();
      awt var10001 = awt.field_4173;
      if(var3 != null) {
         if(var10000 == awt.field_4173) {
            return this.field_2392;
         }

         var10000 = var2.method_2424();
         var10001 = awt.field_4180;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            return this.field_2392;
         }

         var10000 = var2.method_2424();
         var10001 = awt.field_4181;
      }

      if(var10000 != var10001) {
         return super.method_2927(var1, var2);
      } else {
         return this.field_2392;
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      field_2398 = Sets.newHashSet(new aji[]{class_1192.field_6030, class_1192.field_6074, class_1192.field_6042, class_1192.field_6043, class_1192.field_6081, class_1192.field_6112, class_1192.field_6117});
   }
}
