import java.util.List;
import java.util.Random;

// $FF: renamed from: hT
public class class_1207 {

   // $FF: renamed from: b vD[]
   private static final class_1652[] field_6252;
   // $FF: renamed from: c java.lang.String
   private static final String field_6253;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6254;


   // $FF: renamed from: <init> () void
   public void method_6496() {
      super();
   }

   // $FF: renamed from: b () void
   public static void method_6497() {
      String[] var0 = field_6254;
      class_1093.method_6184(class_1147.class, "MSCorridor");
      class_1093.method_6184(class_1146.class, "MSCrossing");
      class_1093.method_6184(class_1145.class, "MSRoom");
      class_1093.method_6184(class_1115.class, "MSStairs");
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) h7
   private static class_1094 method_6498(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      int var8 = var1.nextInt(100);
      String[] var7 = class_752.method_4253();
      int var10000 = var8;
      byte var10001 = 80;
      class_1206 var9;
      if(var7 != null) {
         if(var8 >= 80) {
            var9 = class_1146.method_6333(var0, var1, var2, var3, var4, var5);
            if(var9 != null) {
               class_1146 var12 = new class_1146;
               var12.method_6332(var6, var1, var9, var5);
               return var12;
            }

            return null;
         }

         var10000 = var8;
         var10001 = 70;
      }

      if(var10000 >= var10001) {
         var9 = class_1115.method_6265(var0, var1, var2, var3, var4, var5);
         if(var9 != null) {
            class_1115 var10 = new class_1115;
            var10.method_6264(var6, var1, var9, var5);
            return var10;
         }
      } else {
         var9 = class_1147.method_6335(var0, var1, var2, var3, var4, var5);
         if(var9 != null) {
            class_1147 var11 = new class_1147;
            var11.method_6334(var6, var1, var9, var5);
            return var11;
         }
      }

      return null;
   }

   // $FF: renamed from: a (h7, java.util.List, java.util.Random, int, int, int, int, int) h7
   private static class_1094 method_6499(class_1094 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      String[] var8 = class_752.method_4253();
      int var10000 = var7;
      byte var10001 = 8;
      if(var8 != null) {
         if(var7 > 8) {
            return null;
         }

         var10000 = Math.abs(var3 - var0.method_6199().field_6244);
         var10001 = 80;
      }

      if(var8 != null) {
         if(var10000 > var10001) {
            return null;
         }

         var10000 = Math.abs(var5 - var0.method_6199().field_6246);
         var10001 = 80;
      }

      if(var10000 <= var10001) {
         class_1094 var9 = method_6498(var1, var2, var3, var4, var5, var6, var7 + 1);
         class_1094 var10 = var9;
         if(var8 != null) {
            if(var9 != null) {
               var1.add(var9);
               var9.method_6197(var0, var1, var2);
            }

            var10 = var9;
         }

         return var10;
      } else {
         return null;
      }
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random, int, int, int, int, int) h7
   static class_1094 method_6500(class_1094 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      return method_6499(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: c () vD[]
   static class_1652[] method_6501() {
      return field_6252;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6502() {
      // $FF: Couldn't be decompiled
   }
}
