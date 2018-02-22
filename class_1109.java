import java.util.List;
import java.util.Random;

// $FF: renamed from: ii
public class class_1109 extends class_1099 {

   // $FF: renamed from: f java.lang.String
   private static final String field_5795 = "CL_00000458";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6253(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5753 = var4;
      this.field_5752 = var3;
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      String[] var4;
      int var5;
      class_1109 var7;
      label37: {
         label36: {
            String[] var10000 = class_752.method_4253();
            var5 = 1;
            var4 = var10000;
            int var6 = this.field_5753;
            if(var4 != null) {
               if(this.field_5753 != 1) {
                  var7 = this;
                  if(var4 == null) {
                     break label37;
                  }

                  if(this.field_5753 != 2) {
                     break label36;
                  }
               }

               var6 = 5;
            }

            var5 = var6;
         }

         var7 = this;
      }

      class_1114 var10001 = (class_1114)var1;
      int var10006 = var3.nextInt(8);
      if(var4 != null) {
         var10006 = var10006 > 0?1:0;
      }

      var7.method_6232(var10001, var2, var3, 0, var5, (boolean)var10006);
      var10001 = (class_1114)var1;
      var10006 = var3.nextInt(8);
      if(var4 != null) {
         var10006 = var10006 > 0?1:0;
      }

      this.method_6233(var10001, var2, var3, 0, var5, (boolean)var10006);
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) ii
   public static class_1109 method_6254(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      class_1206 var7 = class_1206.method_6479(var2, var3, var4, -3, 0, 0, 9, 7, 9, var5);
      class_1109 var10000;
      if(method_6234(var7) && class_1094.method_6201(var0, var7) == null) {
         var10000 = new class_1109;
         var10000.method_6253(var6, var1, var7, var5);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      this.method_6211(var1, var3, 0, 0, 0, 8, 1, 8, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 0, 2, 0, 8, 5, 8, class_1192.field_6025, class_1192.field_6025, false);
      this.method_6211(var1, var3, 0, 6, 0, 8, 6, 5, class_1192.field_6137, class_1192.field_6137, false);
      String[] var10000 = class_752.method_4253();
      this.method_6211(var1, var3, 0, 2, 0, 2, 5, 0, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 6, 2, 0, 8, 5, 0, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 1, 3, 0, 1, 4, 0, class_1192.field_6138, class_1192.field_6138, false);
      this.method_6211(var1, var3, 7, 3, 0, 7, 4, 0, class_1192.field_6138, class_1192.field_6138, false);
      this.method_6211(var1, var3, 0, 2, 4, 8, 2, 8, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 1, 1, 4, 2, 2, 4, class_1192.field_6025, class_1192.field_6025, false);
      this.method_6211(var1, var3, 6, 1, 4, 7, 2, 4, class_1192.field_6025, class_1192.field_6025, false);
      String[] var4 = var10000;
      this.method_6211(var1, var3, 0, 3, 8, 8, 3, 8, class_1192.field_6138, class_1192.field_6138, false);
      this.method_6211(var1, var3, 0, 3, 6, 0, 3, 7, class_1192.field_6138, class_1192.field_6138, false);
      this.method_6211(var1, var3, 8, 3, 6, 8, 3, 7, class_1192.field_6138, class_1192.field_6138, false);
      this.method_6211(var1, var3, 0, 3, 4, 0, 5, 5, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 8, 3, 4, 8, 5, 5, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 1, 3, 5, 2, 5, 5, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 6, 3, 5, 7, 5, 5, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 1, 4, 5, 1, 5, 5, class_1192.field_6138, class_1192.field_6138, false);
      this.method_6211(var1, var3, 7, 4, 5, 7, 5, 5, class_1192.field_6138, class_1192.field_6138, false);
      int var5 = 0;

      boolean var7;
      while(true) {
         if(var5 <= 5) {
            var7 = false;
            if(var4 == null) {
               break;
            }

            int var6 = 0;

            while(true) {
               if(var6 <= 8) {
                  this.method_6218(var1, class_1192.field_6137, 0, var6, -1, var5, var3);
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
      char[] var10003 = "ºî<ûyÐæ".toCharArray();
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
            field_5795 = (new String((char[])var4)).intern();
            String var2 = field_5795;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 116;
            break;
         case 1:
            var10009 = 242;
            break;
         case 2:
            var10009 = 90;
            break;
         case 3:
            var10009 = 97;
            break;
         case 4:
            var10009 = 17;
            break;
         case 5:
            var10009 = 158;
            break;
         default:
            var10009 = 179;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
