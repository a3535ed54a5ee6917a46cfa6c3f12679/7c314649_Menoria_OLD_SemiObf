import java.util.List;
import java.util.Random;

// $FF: renamed from: iO
public class class_1127 extends class_1116 {

   // $FF: renamed from: h java.lang.String
   private static final String field_5839 = "CL_00000520";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (iY, int, java.util.Random, hS, int) void
   public void method_6292(class_1118 var1, int var2, Random var3, class_1206 var4, int var5) {
      super.method_6266(var1, var2);
      this.field_5753 = var5;
      this.field_5752 = var4;
   }

   // $FF: renamed from: b (iY, java.util.List, java.util.Random, int, int, int, int) hS
   public static class_1206 method_6293(class_1118 var0, List var1, Random var2, int var3, int var4, int var5, int var6) {
      class_1206 var7 = class_1206.method_6479(var3, var4, var5, 0, 0, 0, 3, 4, 2, var6);
      return class_1094.method_6201(var1, var7) != null?null:var7;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.field_5808;
      if(var4 != null) {
         if(this.field_5808 < 0) {
            this.field_5808 = this.method_6269(var1, var3);
            class_1127 var5 = this;
            if(var4 != null) {
               if(this.field_5808 < 0) {
                  return true;
               }

               var5 = this;
            }

            var5.field_5752.method_6486(0, this.field_5808 - this.field_5752.field_6248 + 4 - 1, 0);
         }

         this.method_6211(var1, var3, 0, 0, 0, 2, 3, 1, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6208(var1, class_1192.field_6111, 0, 1, 0, 0, var3);
         this.method_6208(var1, class_1192.field_6111, 0, 1, 1, 0, var3);
         this.method_6208(var1, class_1192.field_6111, 0, 1, 2, 0, var3);
         this.method_6208(var1, class_1192.field_6062, 15, 1, 3, 0, var3);
         this.method_6208(var1, class_1192.field_6077, 0, 0, 3, 0, var3);
         this.method_6208(var1, class_1192.field_6077, 0, 1, 3, 1, var3);
         this.method_6208(var1, class_1192.field_6077, 0, 2, 3, 0, var3);
         this.method_6208(var1, class_1192.field_6077, 0, 1, 3, -1, var3);
         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "Ù?L³ÕªF!".toCharArray();
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
            field_5839 = (new String((char[])var4)).intern();
            String var2 = field_5839;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 239;
            break;
         case 1:
            var10009 = 6;
            break;
         case 2:
            var10009 = 102;
            break;
         case 3:
            var10009 = 222;
            break;
         case 4:
            var10009 = 246;
            break;
         case 5:
            var10009 = 223;
            break;
         default:
            var10009 = 144;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
