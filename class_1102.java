import java.util.List;
import java.util.Random;

// $FF: renamed from: ip
public class class_1102 extends class_1099 {

   // $FF: renamed from: f boolean
   private boolean field_5782;
   // $FF: renamed from: g java.lang.String
   private static final String field_5783;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_5784;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6239(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5753 = var4;
      this.field_5752 = var3;
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      String[] var10002 = field_5784;
      this.field_5782 = var1.method_8690("Mob");
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      String[] var10001 = field_5784;
      var1.initGui4("Mob", this.field_5782);
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) ip
   public static class_1102 method_6240(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      class_1206 var7 = class_1206.method_6479(var2, var3, var4, -2, 0, 0, 7, 8, 9, var5);
      class_1102 var10000;
      if(method_6234(var7) && class_1094.method_6201(var0, var7) == null) {
         var10000 = new class_1102;
         var10000.method_6239(var6, var1, var7, var5);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      this.method_6211(var1, var3, 0, 2, 0, 6, 7, 7, class_1192.field_6025, class_1192.field_6025, false);
      this.method_6211(var1, var3, 1, 0, 0, 5, 1, 7, class_1192.field_6137, class_1192.field_6137, false);
      String[] var10000 = class_752.method_4253();
      this.method_6211(var1, var3, 1, 2, 1, 5, 2, 7, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 1, 3, 2, 5, 3, 7, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 1, 4, 3, 5, 4, 7, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 1, 2, 0, 1, 4, 2, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 5, 2, 0, 5, 4, 2, class_1192.field_6137, class_1192.field_6137, false);
      String[] var4 = var10000;
      this.method_6211(var1, var3, 1, 5, 2, 1, 5, 3, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 5, 5, 2, 5, 5, 3, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 0, 5, 3, 0, 5, 8, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 6, 5, 3, 6, 5, 8, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 1, 5, 8, 5, 5, 8, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6208(var1, class_1192.field_6138, 0, 1, 6, 3, var3);
      this.method_6208(var1, class_1192.field_6138, 0, 5, 6, 3, var3);
      this.method_6211(var1, var3, 0, 6, 3, 0, 6, 8, class_1192.field_6138, class_1192.field_6138, false);
      this.method_6211(var1, var3, 6, 6, 3, 6, 6, 8, class_1192.field_6138, class_1192.field_6138, false);
      this.method_6211(var1, var3, 1, 6, 8, 5, 7, 8, class_1192.field_6138, class_1192.field_6138, false);
      this.method_6211(var1, var3, 2, 8, 8, 4, 8, 8, class_1192.field_6138, class_1192.field_6138, false);
      byte var9 = this.field_5782;
      int var5;
      int var6;
      if(var4 != null) {
         label49: {
            if(!this.field_5782) {
               var5 = this.method_6205(5);
               var6 = this.method_6204(3, 5);
               int var7 = this.method_6206(3, 5);
               var9 = var3.method_6487(var6, var5, var7);
               if(var4 == null) {
                  break label49;
               }

               if(var9 != 0) {
                  this.field_5782 = true;
                  var9 = var1.method_2054(var6, var5, var7, class_1192.field_6079, 0, 2);
                  if(var4 == null) {
                     break label49;
                  }

                  class_584 var8 = (class_584)var1.method_31(var6, var5, var7);
                  if(var8 != null) {
                     class_982 var10 = var8.method_3123();
                     String[] var10001 = field_5784;
                     var10.method_5672("Blaze");
                  }
               }
            }

            var9 = 0;
         }
      }

      var5 = var9;

      boolean var11;
      while(true) {
         if(var5 <= 6) {
            var11 = false;
            if(var4 == null) {
               break;
            }

            var6 = 0;

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

         var11 = true;
         break;
      }

      return var11;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "Ýç*Ü+ÙT¢ÿ¯S°QÒ\bä";
      int var4 = "Ýç*Ü+ÙT¢ÿ¯S°QÒ\bä".length();
      char var1 = 5;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_5784 = var5;
                  String[] var10 = field_5784;
                  field_5783 = "CL_00000465";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 210;
               break;
            case 1:
               var10009 = 42;
               break;
            case 2:
               var10009 = 203;
               break;
            case 3:
               var10009 = 41;
               break;
            case 4:
               var10009 = 2;
               break;
            case 5:
               var10009 = 223;
               break;
            default:
               var10009 = 130;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
