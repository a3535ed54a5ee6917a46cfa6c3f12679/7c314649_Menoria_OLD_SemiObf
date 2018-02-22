import java.util.List;
import java.util.Random;

// $FF: renamed from: ih
public class class_1110 extends class_1099 {

   // $FF: renamed from: f java.lang.String
   private static final String field_5796 = "CL_00000457";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6255(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5753 = var4;
      this.field_5752 = var3;
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      this.method_6231((class_1114)var1, var2, var3, 1, 0, true);
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) ih
   public static class_1110 method_6256(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      class_1206 var7 = class_1206.method_6479(var2, var3, var4, -1, -7, 0, 5, 14, 10, var5);
      class_1110 var10000;
      if(method_6234(var7) && class_1094.method_6201(var0, var7) == null) {
         var10000 = new class_1110;
         var10000.method_6255(var6, var1, var7, var5);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = this.method_6207(class_1192.field_6139, 2);
      String[] var4 = var10000;
      int var6 = 0;

      int var11;
      while(true) {
         if(var6 <= 9) {
            int var7 = Math.max(1, 7 - var6);
            int var8 = Math.min(Math.max(var7 + 5, 14 - var6), 13);
            int var9 = var6;
            this.method_6211(var1, var3, 0, 0, var6, 4, var7, var6, class_1192.field_6137, class_1192.field_6137, false);
            this.method_6211(var1, var3, 1, var7 + 1, var6, 3, var8 - 1, var6, class_1192.field_6025, class_1192.field_6025, false);
            var11 = var6;
            if(var4 == null) {
               break;
            }

            byte var10001 = 6;
            if(var4 != null) {
               if(var6 <= 6) {
                  this.method_6208(var1, class_1192.field_6139, var5, 1, var7 + 1, var6, var3);
                  this.method_6208(var1, class_1192.field_6139, var5, 2, var7 + 1, var6, var3);
                  this.method_6208(var1, class_1192.field_6139, var5, 3, var7 + 1, var6, var3);
               }

               this.method_6211(var1, var3, 0, var8, var6, 4, var8, var6, class_1192.field_6137, class_1192.field_6137, false);
               this.method_6211(var1, var3, 0, var7 + 1, var6, 0, var8 - 1, var6, class_1192.field_6137, class_1192.field_6137, false);
               this.method_6211(var1, var3, 4, var7 + 1, var6, 4, var8 - 1, var6, class_1192.field_6137, class_1192.field_6137, false);
               var11 = var6;
               var10001 = 1;
            }

            var11 &= var10001;
            if(var4 != null) {
               if(var11 == 0) {
                  this.method_6211(var1, var3, 0, var7 + 2, var6, 0, var7 + 3, var6, class_1192.field_6138, class_1192.field_6138, false);
                  this.method_6211(var1, var3, 4, var7 + 2, var6, 4, var7 + 3, var6, class_1192.field_6138, class_1192.field_6138, false);
               }

               var11 = 0;
            }

            int var10 = var11;

            while(true) {
               if(var10 <= 4) {
                  this.method_6218(var1, class_1192.field_6137, 0, var10, -1, var9, var3);
                  ++var10;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               ++var6;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var11 = 1;
         break;
      }

      return (boolean)var11;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "_.Û%,Vö".toCharArray();
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
            field_5796 = (new String((char[])var4)).intern();
            String var2 = field_5796;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 214;
            break;
         case 1:
            var10009 = 168;
            break;
         case 2:
            var10009 = 9;
            break;
         case 3:
            var10009 = 111;
            break;
         case 4:
            var10009 = 33;
            break;
         case 5:
            var10009 = 223;
            break;
         default:
            var10009 = 251;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
