import java.util.List;
import java.util.Random;

// $FF: renamed from: ir
public class class_1100 extends class_1099 {

   // $FF: renamed from: f java.lang.String
   private static final String field_5780 = "CL_00000469";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6235(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5753 = var4;
      this.field_5752 = var3;
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      this.method_6233((class_1114)var1, var2, var3, 6, 2, false);
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) ir
   public static class_1100 method_6236(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      class_1206 var7 = class_1206.method_6479(var2, var3, var4, -2, 0, 0, 7, 11, 7, var5);
      class_1100 var10000;
      if(method_6234(var7) && class_1094.method_6201(var0, var7) == null) {
         var10000 = new class_1100;
         var10000.method_6235(var6, var1, var7, var5);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      this.method_6211(var1, var3, 0, 0, 0, 6, 1, 6, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 0, 2, 0, 6, 10, 6, class_1192.field_6025, class_1192.field_6025, false);
      this.method_6211(var1, var3, 0, 2, 0, 1, 8, 0, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 5, 2, 0, 6, 8, 0, class_1192.field_6137, class_1192.field_6137, false);
      String[] var10000 = class_752.method_4253();
      this.method_6211(var1, var3, 0, 2, 1, 0, 8, 6, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 6, 2, 1, 6, 8, 6, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 1, 2, 6, 5, 8, 6, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 0, 3, 2, 0, 5, 4, class_1192.field_6138, class_1192.field_6138, false);
      this.method_6211(var1, var3, 6, 3, 2, 6, 5, 2, class_1192.field_6138, class_1192.field_6138, false);
      this.method_6211(var1, var3, 6, 3, 4, 6, 5, 4, class_1192.field_6138, class_1192.field_6138, false);
      this.method_6208(var1, class_1192.field_6137, 0, 5, 2, 5, var3);
      this.method_6211(var1, var3, 4, 2, 5, 4, 3, 5, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 3, 2, 5, 3, 4, 5, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 2, 2, 5, 2, 5, 5, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 1, 2, 5, 1, 6, 5, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 1, 7, 1, 5, 7, 4, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 6, 8, 2, 6, 8, 4, class_1192.field_6025, class_1192.field_6025, false);
      this.method_6211(var1, var3, 2, 6, 0, 4, 8, 0, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 2, 5, 0, 4, 5, 0, class_1192.field_6138, class_1192.field_6138, false);
      int var5 = 0;
      String[] var4 = var10000;

      boolean var7;
      while(true) {
         if(var5 <= 6) {
            var7 = false;
            if(var4 == null) {
               break;
            }

            int var6 = 0;

            while(true) {
               if(var6 <= 6) {
                  this.method_6218(var1, class_1192.field_6137, 0, var5, -1, var6, var3);
                  ++var6;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               ++var5;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var7 = true;
         break;
      }

      return var7;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "ê  \r_4X÷\t".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_5780 = (new String((char[])var4)).intern();
            String var2 = field_5780;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 69;
            break;
         case 1:
            var10009 = 128;
            break;
         case 2:
            var10009 = 45;
            break;
         case 3:
            var10009 = 220;
            break;
         case 4:
            var10009 = 209;
            break;
         case 5:
            var10009 = 131;
            break;
         default:
            var10009 = 232;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
