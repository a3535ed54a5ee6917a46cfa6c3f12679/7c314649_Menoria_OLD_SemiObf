import java.util.List;
import java.util.Random;

// $FF: renamed from: il
public class class_1106 extends class_1099 {

   // $FF: renamed from: f boolean
   private boolean field_5790;
   // $FF: renamed from: g java.lang.String
   private static final String field_5791;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_5792;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6247(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5753 = var4;
      String[] var10000 = class_752.method_4253();
      this.field_5752 = var3;
      String[] var5 = var10000;
      int var10001 = var2.nextInt(3);
      if(var5 != null) {
         var10001 = var10001 == 0?1:0;
      }

      this.field_5790 = (boolean)var10001;
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      String[] var10002 = field_5792;
      this.field_5790 = var1.method_8690("Chest");
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      String[] var10001 = field_5792;
      var1.initGui4("Chest", this.field_5790);
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      this.method_6232((class_1114)var1, var2, var3, 0, 1, true);
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) il
   public static class_1106 method_6248(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      class_1206 var7 = class_1206.method_6479(var2, var3, var4, -1, 0, 0, 5, 7, 5, var5);
      class_1106 var10000;
      if(method_6234(var7) && class_1094.method_6201(var0, var7) == null) {
         var10000 = new class_1106;
         var10000.method_6247(var6, var1, var7, var5);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      this.method_6211(var1, var3, 0, 0, 0, 4, 1, 4, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 0, 2, 0, 4, 5, 4, class_1192.field_6025, class_1192.field_6025, false);
      this.method_6211(var1, var3, 4, 2, 0, 4, 5, 4, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 4, 3, 1, 4, 4, 1, class_1192.field_6138, class_1192.field_6138, false);
      String[] var4 = class_752.method_4253();
      this.method_6211(var1, var3, 4, 3, 3, 4, 4, 3, class_1192.field_6138, class_1192.field_6138, false);
      this.method_6211(var1, var3, 0, 2, 0, 0, 5, 0, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 0, 2, 4, 3, 5, 4, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 1, 3, 4, 1, 4, 4, class_1192.field_6138, class_1192.field_6137, false);
      this.method_6211(var1, var3, 3, 3, 4, 3, 4, 4, class_1192.field_6138, class_1192.field_6137, false);
      byte var10000 = this.field_5790;
      int var5;
      int var6;
      if(var4 != null) {
         label44: {
            if(this.field_5790) {
               var5 = this.method_6205(2);
               var6 = this.method_6204(3, 3);
               int var7 = this.method_6206(3, 3);
               var10000 = var3.method_6487(var6, var5, var7);
               if(var4 == null) {
                  break label44;
               }

               if(var10000 != 0) {
                  this.field_5790 = false;
                  this.method_6219(var1, var3, var2, 3, 2, 3, field_5778, 2 + var2.nextInt(4));
               }
            }

            this.method_6211(var1, var3, 0, 6, 0, 4, 6, 4, class_1192.field_6137, class_1192.field_6137, false);
            var10000 = 0;
         }
      }

      var5 = var10000;

      boolean var8;
      while(true) {
         if(var5 <= 4) {
            var8 = false;
            if(var4 == null) {
               break;
            }

            var6 = 0;

            while(true) {
               if(var6 <= 4) {
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

         var8 = true;
         break;
      }

      return var8;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "*/%»la\rÛrÃym";
      int var4 = "*/%»la\rÛrÃym".length();
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
                  field_5792 = var5;
                  String[] var10 = field_5792;
                  field_5791 = "CL_00000461";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 235;
               break;
            case 1:
               var10009 = 94;
               break;
            case 2:
               var10009 = 230;
               break;
            case 3:
               var10009 = 245;
               break;
            case 4:
               var10009 = 248;
               break;
            case 5:
               var10009 = 148;
               break;
            default:
               var10009 = 66;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
