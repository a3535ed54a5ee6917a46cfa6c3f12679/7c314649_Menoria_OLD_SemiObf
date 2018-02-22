import java.util.List;
import java.util.Random;

// $FF: renamed from: ix
public class class_1134 extends class_1131 {

   // $FF: renamed from: d vD[]
   private static final class_1652[] field_5863;
   // $FF: renamed from: g boolean
   private boolean field_5864;
   // $FF: renamed from: h java.lang.String
   private static final String field_5865;
   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_5866;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6312(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5753 = var4;
      this.field_5851 = this.method_6303(var2);
      this.field_5752 = var3;
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      String[] var10001 = field_5866;
      var1.initGui4("Chest", this.field_5864);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      String[] var10002 = field_5866;
      this.field_5864 = var1.method_8690("Chest");
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      this.method_6304((class_1138)var1, var2, var3, 1, 1);
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) ix
   public static class_1134 method_6313(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      class_1206 var7 = class_1206.method_6479(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      class_1134 var10000;
      if(method_6307(var7) && class_1094.method_6201(var0, var7) == null) {
         var10000 = new class_1134;
         var10000.method_6312(var6, var1, var7, var5);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      byte var10000 = this.method_6203(var1, var3);
      if(var4 != null) {
         if(var10000 != 0) {
            return false;
         }

         this.method_6213(var1, var3, 0, 0, 0, 4, 4, 6, true, var2, class_1252.method_6598());
         this.method_6302(var1, var2, var3, this.field_5851, 1, 1, 0);
         this.method_6302(var1, var2, var3, class_98.field_71, 1, 1, 6);
         this.method_6211(var1, var3, 3, 1, 2, 3, 1, 4, class_1192.field_6123, class_1192.field_6123, false);
         this.method_6208(var1, class_1192.field_6071, 5, 3, 1, 1, var3);
         this.method_6208(var1, class_1192.field_6071, 5, 3, 1, 5, var3);
         this.method_6208(var1, class_1192.field_6071, 5, 3, 2, 2, var3);
         this.method_6208(var1, class_1192.field_6071, 5, 3, 2, 4, var3);
         var10000 = 2;
      }

      int var5 = var10000;

      boolean var8;
      while(true) {
         if(var5 <= 4) {
            this.method_6208(var1, class_1192.field_6071, 5, 2, 1, var5, var3);
            ++var5;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var8 = this.field_5864;
         if(var4 == null) {
            return var8;
         }

         if(!this.field_5864) {
            var5 = this.method_6205(2);
            int var6 = this.method_6204(3, 3);
            int var7 = this.method_6206(3, 3);
            var8 = var3.method_6487(var6, var5, var7);
            if(var4 == null) {
               return var8;
            }

            if(var8) {
               this.field_5864 = true;
               this.method_6219(var1, var3, var2, 3, 2, 3, class_1652.method_9098(field_5863, new class_1652[]{class_1010.field_5259.getBlock06(var2)}), 2 + var2.nextInt(2));
            }
         }
         break;
      }

      var8 = true;
      return var8;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "S\fæ¨b+øw¥O¢";
      int var4 = "S\fæ¨b+øw¥O¢".length();
      char var1 = 11;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         class_1652 var10004 = var10003.length;
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
                  field_5866 = var5;
                  String[] var10 = field_5866;
                  field_5865 = "CL_00000487";
                  class_1652[] var7 = new class_1652[18];
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5225, 0, 1, 1, 10);
                  var7[0] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5122, 0, 1, 3, 3);
                  var7[1] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5123, 0, 1, 5, 10);
                  var7[2] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5124, 0, 1, 3, 5);
                  var7[3] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5189, 0, 4, 9, 5);
                  var7[4] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5155, 0, 1, 3, 15);
                  var7[5] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5118, 0, 1, 3, 15);
                  var7[6] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5115, 0, 1, 1, 5);
                  var7[7] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5125, 0, 1, 1, 5);
                  var7[8] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5165, 0, 1, 1, 5);
                  var7[9] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5164, 0, 1, 1, 5);
                  var7[10] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5166, 0, 1, 1, 5);
                  var7[11] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5167, 0, 1, 1, 5);
                  var7[12] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5180, 0, 1, 1, 1);
                  var7[13] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5187, 0, 1, 1, 1);
                  var7[14] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5265, 0, 1, 1, 1);
                  var7[15] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5266, 0, 1, 1, 1);
                  var7[16] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5267, 0, 1, 1, 1);
                  var7[17] = var10004;
                  field_5863 = var7;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 206;
               break;
            case 1:
               var10009 = 131;
               break;
            case 2:
               var10009 = 92;
               break;
            case 3:
               var10009 = 160;
               break;
            case 4:
               var10009 = 74;
               break;
            case 5:
               var10009 = 171;
               break;
            default:
               var10009 = 4;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
