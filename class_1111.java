import java.util.List;
import java.util.Random;

// $FF: renamed from: ig
public class class_1111 extends class_1099 {

   // $FF: renamed from: f java.lang.String
   private static final String field_5797 = "CL_00000456";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6257(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5753 = var4;
      this.field_5752 = var3;
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      this.method_6231((class_1114)var1, var2, var3, 1, 3, false);
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) ig
   public static class_1111 method_6258(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      class_1206 var7 = class_1206.method_6479(var2, var3, var4, -1, -3, 0, 5, 10, 19, var5);
      class_1111 var10000;
      if(method_6234(var7) && class_1094.method_6201(var0, var7) == null) {
         var10000 = new class_1111;
         var10000.method_6257(var6, var1, var7, var5);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      this.method_6211(var1, var3, 0, 3, 0, 4, 4, 18, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 1, 5, 0, 3, 7, 18, class_1192.field_6025, class_1192.field_6025, false);
      this.method_6211(var1, var3, 0, 5, 0, 0, 5, 18, class_1192.field_6137, class_1192.field_6137, false);
      String[] var10000 = class_752.method_4253();
      this.method_6211(var1, var3, 4, 5, 0, 4, 5, 18, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 0, 2, 0, 4, 2, 5, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 0, 2, 13, 4, 2, 18, class_1192.field_6137, class_1192.field_6137, false);
      String[] var4 = var10000;
      this.method_6211(var1, var3, 0, 0, 0, 4, 1, 3, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 0, 0, 15, 4, 1, 18, class_1192.field_6137, class_1192.field_6137, false);
      int var5 = 0;

      boolean var7;
      while(true) {
         if(var5 <= 4) {
            var7 = false;
            if(var4 == null) {
               break;
            }

            int var6 = 0;

            while(true) {
               if(var6 <= 2) {
                  this.method_6218(var1, class_1192.field_6137, 0, var5, -1, var6, var3);
                  this.method_6218(var1, class_1192.field_6137, 0, var5, -1, 18 - var6, var3);
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

         this.method_6211(var1, var3, 0, 1, 1, 0, 4, 1, class_1192.field_6138, class_1192.field_6138, false);
         this.method_6211(var1, var3, 0, 3, 4, 0, 4, 4, class_1192.field_6138, class_1192.field_6138, false);
         this.method_6211(var1, var3, 0, 3, 14, 0, 4, 14, class_1192.field_6138, class_1192.field_6138, false);
         this.method_6211(var1, var3, 0, 1, 17, 0, 4, 17, class_1192.field_6138, class_1192.field_6138, false);
         this.method_6211(var1, var3, 4, 1, 1, 4, 4, 1, class_1192.field_6138, class_1192.field_6138, false);
         this.method_6211(var1, var3, 4, 3, 4, 4, 4, 4, class_1192.field_6138, class_1192.field_6138, false);
         this.method_6211(var1, var3, 4, 3, 14, 4, 4, 14, class_1192.field_6138, class_1192.field_6138, false);
         this.method_6211(var1, var3, 4, 1, 17, 4, 4, 17, class_1192.field_6138, class_1192.field_6138, false);
         var7 = true;
         break;
      }

      return var7;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "i©3ýµÑYû".toCharArray();
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
            field_5797 = (new String((char[])var4)).intern();
            String var2 = field_5797;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 80;
            break;
         case 1:
            var10009 = 159;
            break;
         case 2:
            var10009 = 22;
            break;
         case 3:
            var10009 = 183;
            break;
         case 4:
            var10009 = 255;
            break;
         case 5:
            var10009 = 53;
            break;
         default:
            var10009 = 86;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
