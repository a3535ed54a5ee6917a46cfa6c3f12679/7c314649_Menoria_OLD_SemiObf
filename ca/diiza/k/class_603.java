package ca.diiza.k;

import ca.diiza.k.class_602;

// $FF: renamed from: ca.diiza.k.c
public class class_603 {

   // $FF: renamed from: a boolean
   public static boolean field_2616;


   // $FF: renamed from: <init> () void
   public void method_3277() {
      super();
   }

   // $FF: renamed from: a (int, int, int) boolean
   public static boolean method_3278(int var0, int var1, int var2) {
      String var3;
      int var9;
      label50: {
         label53: {
            String var10000 = class_602.method_3276();
            int var5 = Math.min(class_602.method_3252().method_3262(), class_602.method_3252().method_3264());
            var3 = var10000;
            int var6 = Math.min(class_602.method_3252().method_3268(), class_602.method_3252().method_3270());
            int var7 = Math.max(class_602.method_3252().method_3262(), class_602.method_3252().method_3264());
            int var8 = Math.max(class_602.method_3252().method_3268(), class_602.method_3252().method_3270());
            var9 = var0;
            int var10001 = var5;
            if(var3 == null) {
               if(var0 < var5) {
                  break label53;
               }

               var9 = var0;
               var10001 = var7;
            }

            if(var3 == null) {
               if(var9 > var10001) {
                  break label53;
               }

               var9 = var2;
               var10001 = var6;
            }

            if(var3 == null) {
               if(var9 < var10001) {
                  break label53;
               }

               var9 = var2;
               var10001 = var8;
            }

            if(var3 == null) {
               if(var9 > var10001) {
                  break label53;
               }

               var9 = var1;
               if(var3 != null) {
                  break label50;
               }

               var10001 = class_602.method_3252().method_3260();
            }

            if(var9 >= var10001) {
               var9 = 1;
               break label50;
            }
         }

         var9 = 0;
      }

      if(var3 != null) {
         int var4 = class_689.method_3977();
         ++var4;
         class_689.method_3975(var4);
      }

      return (boolean)var9;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3279() {
      field_2616 = false;
   }
}
