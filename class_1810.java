import java.util.List;
import java.util.Random;

// $FF: renamed from: zW
public class class_1810 extends class_1790 {

   // $FF: renamed from: a java.lang.String
   private static final String field_9355;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9356;


   // $FF: renamed from: <init> () void
   public void method_9832() {
      super.method_9832();
   }

   // $FF: renamed from: a () java.lang.String
   public String method_43() {
      String[] var10000 = field_9356;
      return "spreadplayers";
   }

   // $FF: renamed from: b () int
   public int method_9833() {
      return 2;
   }

   // $FF: renamed from: a (bh) java.lang.String
   public String method_44(class_20 var1) {
      String[] var10000 = field_9356;
      return "commands.spreadplayers.usage";
   }

   // $FF: renamed from: a (bh, java.lang.String[]) void
   public void method_46(class_20 param1, String[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (bh, java.util.List, pW, double, double, ahb, boolean) void
   private void method_9896(class_20 param1, List param2, class_1484 param3, double param4, double param6, ahb param8, boolean param9) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.util.List) int
   private int method_9897(List param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (pW, double, ahb, java.util.Random, double, double, double, double, pW[], boolean) int
   private int method_9898(class_1484 param1, double param2, ahb param4, Random param5, double param6, double param8, double param10, double param12, class_1484[] param14, boolean param15) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.util.List, ahb, pW[], boolean) double
   private double method_9899(List param1, ahb param2, class_1484[] param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.util.Random, int, double, double, double, double) pW[]
   private class_1484[] method_9900(Random var1, int var2, double var3, double var5, double var7, double var9) {
      String[] var10000 = class_752.method_4253();
      class_1484[] var12 = new class_1484[var2];
      String[] var11 = var10000;
      int var13 = 0;

      class_1484[] var17;
      while(true) {
         if(var13 < var12.length) {
            class_1484 var16 = new class_1484;
            var16.method_8003();
            class_1484 var14 = var16;

            try {
               var14.method_8012(var1, var3, var5, var7, var9);
               var17 = var12;
               if(var11 == null) {
                  break;
               }

               var12[var13] = var14;
               ++var13;
               if(var11 != null) {
                  continue;
               }
            } catch (class_641 var15) {
               throw method_9901(var15);
            }
         }

         var17 = var12;
         break;
      }

      return var17;
   }

   // $FF: renamed from: b (AD) AD
   private static class_641 method_9901(class_641 var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9862() {
      // $FF: Couldn't be decompiled
   }
}
