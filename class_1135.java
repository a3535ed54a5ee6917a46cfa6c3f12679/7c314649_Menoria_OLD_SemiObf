import java.util.List;
import java.util.Random;

// $FF: renamed from: iJ
public class class_1135 extends class_1131 {

   // $FF: renamed from: d java.lang.String
   private static final String field_5867 = "CL_00000501";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6314(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5753 = var4;
      this.field_5851 = this.method_6303(var2);
      this.field_5752 = var3;
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      this.method_6304((class_1138)var1, var2, var3, 1, 1);
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) iJ
   public static class_1135 method_6315(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      class_1206 var7 = class_1206.method_6479(var2, var3, var4, -1, -7, 0, 5, 11, 8, var5);
      class_1135 var10000;
      if(method_6307(var7) && class_1094.method_6201(var0, var7) == null) {
         var10000 = new class_1135;
         var10000.method_6314(var6, var1, var7, var5);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.method_6203(var1, var3);
      if(var4 != null) {
         if(var10000 != 0) {
            return false;
         }

         this.method_6213(var1, var3, 0, 0, 0, 4, 10, 7, true, var2, class_1252.method_6598());
         this.method_6302(var1, var2, var3, this.field_5851, 1, 7, 0);
         this.method_6302(var1, var2, var3, class_98.field_71, 1, 1, 7);
         var10000 = this.method_6207(class_1192.field_6093, 2);
      }

      int var5 = var10000;
      int var6 = 0;

      while(true) {
         if(var6 < 6) {
            this.method_6208(var1, class_1192.field_6093, var5, 1, 6 - var6, 1 + var6, var3);
            this.method_6208(var1, class_1192.field_6093, var5, 2, 6 - var6, 1 + var6, var3);
            this.method_6208(var1, class_1192.field_6093, var5, 3, 6 - var6, 1 + var6, var3);
            if(var4 != null) {
               var10000 = var6;
               if(var4 == null) {
                  break;
               }

               if(var6 < 5) {
                  this.method_6208(var1, class_1192.field_6123, 0, 1, 5 - var6, 1 + var6, var3);
                  this.method_6208(var1, class_1192.field_6123, 0, 2, 5 - var6, 1 + var6, var3);
                  this.method_6208(var1, class_1192.field_6123, 0, 3, 5 - var6, 1 + var6, var3);
               }

               ++var6;
            }

            if(var4 != null) {
               continue;
            }
         }

         var10000 = 1;
         break;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "_otö}I,{u".toCharArray();
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
            field_5867 = (new String((char[])var4)).intern();
            String var2 = field_5867;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 48;
            break;
         case 1:
            var10009 = 15;
            break;
         case 2:
            var10009 = 103;
            break;
         case 3:
            var10009 = 104;
            break;
         case 4:
            var10009 = 234;
            break;
         case 5:
            var10009 = 97;
            break;
         default:
            var10009 = 85;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
