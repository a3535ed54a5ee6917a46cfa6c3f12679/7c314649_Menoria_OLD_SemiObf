import java.util.Random;

// $FF: renamed from: iv
public class class_1096 extends class_1095 {

   // $FF: renamed from: i boolean
   private boolean field_5762;
   // $FF: renamed from: j java.lang.String
   private static final String field_5763;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_5764;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (java.util.Random, int, int) void
   public void method_6225(Random var1, int var2, int var3) {
      super.method_6223(var1, var2, 64, var3, 7, 5, 9);
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      String[] var10001 = field_5764;
      var1.initGui4("Witch", this.field_5762);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      String[] var10002 = field_5764;
      this.field_5762 = var1.method_8690("Witch");
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.method_6224(var1, var3, 0);
      if(var4 != null) {
         if(var10000 == 0) {
            return false;
         }

         this.method_6212(var1, var3, 1, 1, 1, 5, 1, 7, class_1192.field_6030, 1, class_1192.field_6030, 1, false);
         this.method_6212(var1, var3, 1, 4, 2, 5, 4, 7, class_1192.field_6030, 1, class_1192.field_6030, 1, false);
         this.method_6212(var1, var3, 2, 1, 0, 4, 1, 0, class_1192.field_6030, 1, class_1192.field_6030, 1, false);
         this.method_6212(var1, var3, 2, 2, 2, 3, 3, 2, class_1192.field_6030, 1, class_1192.field_6030, 1, false);
         this.method_6212(var1, var3, 1, 2, 3, 1, 3, 6, class_1192.field_6030, 1, class_1192.field_6030, 1, false);
         this.method_6212(var1, var3, 5, 2, 3, 5, 3, 6, class_1192.field_6030, 1, class_1192.field_6030, 1, false);
         this.method_6212(var1, var3, 2, 2, 7, 4, 3, 7, class_1192.field_6030, 1, class_1192.field_6030, 1, false);
         this.method_6211(var1, var3, 1, 0, 2, 1, 3, 2, class_1192.field_6042, class_1192.field_6042, false);
         this.method_6211(var1, var3, 5, 0, 2, 5, 3, 2, class_1192.field_6042, class_1192.field_6042, false);
         this.method_6211(var1, var3, 1, 0, 7, 1, 3, 7, class_1192.field_6042, class_1192.field_6042, false);
         this.method_6211(var1, var3, 5, 0, 7, 5, 3, 7, class_1192.field_6042, class_1192.field_6042, false);
         this.method_6208(var1, class_1192.field_6111, 0, 2, 3, 2, var3);
         this.method_6208(var1, class_1192.field_6111, 0, 3, 3, 7, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 1, 3, 4, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 5, 3, 4, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 5, 3, 5, var3);
         this.method_6208(var1, class_1192.field_6164, 7, 1, 3, 5, var3);
         this.method_6208(var1, class_1192.field_6085, 0, 3, 2, 6, var3);
         this.method_6208(var1, class_1192.field_6111, 0, 1, 2, 1, var3);
         this.method_6208(var1, class_1192.field_6111, 0, 5, 2, 1, var3);
         var10000 = this.method_6207(class_1192.field_6080, 3);
      }

      int var5 = var10000;
      int var6 = this.method_6207(class_1192.field_6080, 1);
      int var7 = this.method_6207(class_1192.field_6080, 0);
      int var8 = this.method_6207(class_1192.field_6080, 2);
      this.method_6212(var1, var3, 0, 4, 1, 6, 4, 1, class_1192.field_6158, var5, class_1192.field_6158, var5, false);
      this.method_6212(var1, var3, 0, 4, 2, 0, 4, 7, class_1192.field_6158, var7, class_1192.field_6158, var7, false);
      this.method_6212(var1, var3, 6, 4, 2, 6, 4, 7, class_1192.field_6158, var6, class_1192.field_6158, var6, false);
      this.method_6212(var1, var3, 0, 4, 8, 6, 4, 8, class_1192.field_6158, var8, class_1192.field_6158, var8, false);
      int var9 = 2;

      int var10;
      boolean var13;
      while(true) {
         if(var9 <= 7) {
            var13 = true;
            if(var4 == null) {
               break;
            }

            var10 = 1;

            while(true) {
               if(var10 <= 5) {
                  this.method_6218(var1, class_1192.field_6042, 0, var10, -1, var9, var3);
                  var10 += 4;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               var9 += 5;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var13 = this.field_5762;
         break;
      }

      if(var4 != null) {
         if(!var13) {
            var9 = this.method_6204(2, 5);
            var10 = this.method_6205(2);
            int var11 = this.method_6206(2, 5);
            var13 = var3.method_6487(var9, var10, var11);
            if(var4 == null) {
               return var13;
            }

            if(var13) {
               this.field_5762 = true;
               class_783 var14 = new class_783;
               var14.method_3847(var1);
               class_783 var12 = var14;
               var12.method_3887((double)var9 + 0.5D, (double)var10, (double)var11 + 0.5D, 0.0F, 0.0F);
               var12.method_4282((class_83)null);
               var1.method_2089(var12);
            }
         }

         var13 = true;
      }

      return var13;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\fP]£(ã]u¯û";
      int var4 = "\fP]£(ã]u¯û".length();
      char var1 = 11;
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
                  field_5764 = var5;
                  String[] var10 = field_5764;
                  field_5763 = "CL_00000480";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 30;
               break;
            case 1:
               var10009 = 77;
               break;
            case 2:
               var10009 = 138;
               break;
            case 3:
               var10009 = 60;
               break;
            case 4:
               var10009 = 194;
               break;
            case 5:
               var10009 = 116;
               break;
            default:
               var10009 = 96;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
