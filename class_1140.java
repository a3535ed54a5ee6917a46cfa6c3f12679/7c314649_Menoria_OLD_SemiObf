import java.util.List;
import java.util.Random;

// $FF: renamed from: iE
public class class_1140 extends class_1131 {

   // $FF: renamed from: d java.lang.String
   private static final String field_5883 = "CL_00000494";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6323(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5753 = var4;
      this.field_5851 = this.method_6303(var2);
      this.field_5752 = var3;
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      this.method_6304((class_1138)var1, var2, var3, 1, 1);
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) iE
   public static class_1140 method_6324(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      class_1206 var7 = class_1206.method_6479(var2, var3, var4, -1, -1, 0, 9, 5, 11, var5);
      class_1140 var10000;
      if(method_6307(var7) && class_1094.method_6201(var0, var7) == null) {
         var10000 = new class_1140;
         var10000.method_6323(var6, var1, var7, var5);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      boolean var10000 = this.method_6203(var1, var3);
      if(var4 != null) {
         if(var10000) {
            return false;
         }

         this.method_6213(var1, var3, 0, 0, 0, 8, 4, 10, true, var2, class_1252.method_6598());
         this.method_6302(var1, var2, var3, this.field_5851, 1, 1, 0);
         this.method_6211(var1, var3, 1, 1, 10, 3, 3, 10, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6213(var1, var3, 4, 1, 1, 4, 3, 1, false, var2, class_1252.method_6598());
         this.method_6213(var1, var3, 4, 1, 3, 4, 3, 3, false, var2, class_1252.method_6598());
         this.method_6213(var1, var3, 4, 1, 7, 4, 3, 7, false, var2, class_1252.method_6598());
         this.method_6213(var1, var3, 4, 1, 9, 4, 3, 9, false, var2, class_1252.method_6598());
         this.method_6211(var1, var3, 4, 1, 4, 4, 3, 6, class_1192.field_6126, class_1192.field_6126, false);
         this.method_6211(var1, var3, 5, 1, 5, 7, 3, 5, class_1192.field_6126, class_1192.field_6126, false);
         this.method_6208(var1, class_1192.field_6126, 0, 4, 3, 2, var3);
         this.method_6208(var1, class_1192.field_6126, 0, 4, 3, 8, var3);
         this.method_6208(var1, class_1192.field_6097, this.method_6207(class_1192.field_6097, 3), 4, 1, 2, var3);
         this.method_6208(var1, class_1192.field_6097, this.method_6207(class_1192.field_6097, 3) + 8, 4, 2, 2, var3);
         this.method_6208(var1, class_1192.field_6097, this.method_6207(class_1192.field_6097, 3), 4, 1, 8, var3);
         this.method_6208(var1, class_1192.field_6097, this.method_6207(class_1192.field_6097, 3) + 8, 4, 2, 8, var3);
         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "G\tÐûÒ 4aoÔ".toCharArray();
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
            field_5883 = (new String((char[])var4)).intern();
            String var2 = field_5883;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 134;
            break;
         case 1:
            var10009 = 215;
            break;
         case 2:
            var10009 = 212;
            break;
         case 3:
            var10009 = 98;
            break;
         case 4:
            var10009 = 73;
            break;
         case 5:
            var10009 = 96;
            break;
         default:
            var10009 = 178;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
