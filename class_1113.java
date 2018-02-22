import java.util.List;
import java.util.Random;

// $FF: renamed from: ic
public class class_1113 extends class_1099 {

   // $FF: renamed from: f java.lang.String
   private static final String field_5801 = "CL_00000454";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6261(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5753 = var4;
      this.field_5752 = var3;
   }

   // $FF: renamed from: <init> (java.util.Random, int, int) void
   protected void method_6262(Random var1, int var2, int var3) {
      super.method_6192(0);
      String[] var10000 = class_752.method_4253();
      this.field_5753 = var1.nextInt(4);
      String[] var4 = var10000;
      class_1113 var5 = this;
      class_1206 var10001;
      if(var4 != null) {
         switch(this.field_5753) {
         case 0:
         case 2:
            var10001 = new class_1206;
            var10001.method_6481(var2, 64, var3, var2 + 19 - 1, 73, var3 + 19 - 1);
            this.field_5752 = var10001;
            if(var4 != null) {
               return;
            }
         default:
            var5 = this;
         }
      }

      var10001 = new class_1206;
      var10001.method_6481(var2, 64, var3, var2 + 19 - 1, 73, var3 + 19 - 1);
      var5.field_5752 = var10001;
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      this.method_6231((class_1114)var1, var2, var3, 8, 3, false);
      this.method_6232((class_1114)var1, var2, var3, 3, 8, false);
      this.method_6233((class_1114)var1, var2, var3, 3, 8, false);
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) ic
   public static class_1113 method_6263(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      class_1206 var7 = class_1206.method_6479(var2, var3, var4, -8, -3, 0, 19, 10, 19, var5);
      class_1113 var10000;
      if(method_6234(var7) && class_1094.method_6201(var0, var7) == null) {
         var10000 = new class_1113;
         var10000.method_6261(var6, var1, var7, var5);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      this.method_6211(var1, var3, 7, 3, 0, 11, 4, 18, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 0, 3, 7, 18, 4, 11, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 8, 5, 0, 10, 7, 18, class_1192.field_6025, class_1192.field_6025, false);
      this.method_6211(var1, var3, 0, 5, 8, 18, 7, 10, class_1192.field_6025, class_1192.field_6025, false);
      this.method_6211(var1, var3, 7, 5, 0, 7, 5, 7, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 7, 5, 11, 7, 5, 18, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 11, 5, 0, 11, 5, 7, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 11, 5, 11, 11, 5, 18, class_1192.field_6137, class_1192.field_6137, false);
      String[] var10000 = class_752.method_4253();
      this.method_6211(var1, var3, 0, 5, 7, 7, 5, 7, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 11, 5, 7, 18, 5, 7, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 0, 5, 11, 7, 5, 11, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 11, 5, 11, 18, 5, 11, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 7, 2, 0, 11, 2, 5, class_1192.field_6137, class_1192.field_6137, false);
      String[] var4 = var10000;
      this.method_6211(var1, var3, 7, 2, 13, 11, 2, 18, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 7, 0, 0, 11, 1, 3, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 7, 0, 15, 11, 1, 18, class_1192.field_6137, class_1192.field_6137, false);
      int var5 = 7;

      int var6;
      byte var7;
      while(true) {
         if(var5 <= 11) {
            var7 = 0;
            if(var4 == null) {
               break;
            }

            var6 = 0;

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

         this.method_6211(var1, var3, 0, 2, 7, 5, 2, 11, class_1192.field_6137, class_1192.field_6137, false);
         this.method_6211(var1, var3, 13, 2, 7, 18, 2, 11, class_1192.field_6137, class_1192.field_6137, false);
         this.method_6211(var1, var3, 0, 0, 7, 3, 1, 11, class_1192.field_6137, class_1192.field_6137, false);
         this.method_6211(var1, var3, 15, 0, 7, 18, 1, 11, class_1192.field_6137, class_1192.field_6137, false);
         var7 = 0;
         break;
      }

      var5 = var7;

      boolean var8;
      while(true) {
         if(var5 <= 2) {
            var8 = true;
            if(var4 == null) {
               break;
            }

            var6 = 7;

            while(true) {
               if(var6 <= 11) {
                  this.method_6218(var1, class_1192.field_6137, 0, var5, -1, var6, var3);
                  this.method_6218(var1, class_1192.field_6137, 0, 18 - var5, -1, var6, var3);
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

         var8 = true;
         break;
      }

      return var8;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "éÛô\nYzf±ð".toCharArray();
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
            field_5801 = (new String((char[])var4)).intern();
            String var2 = field_5801;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 79;
            break;
         case 1:
            var10009 = 188;
            break;
         case 2:
            var10009 = 157;
            break;
         case 3:
            var10009 = 221;
            break;
         case 4:
            var10009 = 35;
            break;
         case 5:
            var10009 = 112;
            break;
         default:
            var10009 = 83;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
