package ca.diiza.f;

import ca.diiza.f.class_209;
import ca.diiza.f.class_233;
import ca.diiza.f.class_240;
import ca.diiza.m.a;
import ca.diiza.m.class_1664;
import java.util.Comparator;

// $FF: renamed from: ca.diiza.f.z
class class_234 implements Comparator<a> {

   // $FF: renamed from: b ca.diiza.f.e
   final class_240 field_1268;
   // $FF: renamed from: c ca.diiza.f.e
   final class_240 field_1269;


   // $FF: renamed from: <init> (ca.diiza.f.e, ca.diiza.f.e) void
   void method_1280(class_240 var1, class_240 var2) {
      super();
      this.field_1269 = var1;
      this.field_1268 = var2;
   }

   // $FF: renamed from: b (ca.diiza.m.a, ca.diiza.m.a) int
   public int method_1281(class_1664 var1, class_1664 var2) {
      int var3 = class_209.method_1159();
      int var10000 = class_233.field_1267[this.field_1268.ordinal()];
      if(var3 != 0) {
         switch(var10000) {
         case 1:
            return Float.compare((float)var1.method_9179(), (float)var2.method_9179());
         case 2:
            return Float.compare((float)var2.method_9179(), (float)var1.method_9179());
         case 3:
            return Long.compare(var1.method_9177(), var2.method_9177());
         case 4:
            return Long.compare(var2.method_9177(), var1.method_9177());
         default:
            var10000 = 0;
         }
      }

      return var10000;
   }

   // $FF: renamed from: c (ca.diiza.m.a, ca.diiza.m.a) int
   public int method_1282(class_1664 var1, class_1664 var2) {
      return this.method_1281(var1, var2);
   }
}
