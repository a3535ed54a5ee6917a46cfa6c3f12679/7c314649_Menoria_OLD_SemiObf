import java.util.List;
import java.util.Random;

// $FF: renamed from: iT
public class class_1122 extends class_1116 {

   // $FF: renamed from: h vD[]
   private static final class_1652[] field_5827;
   // $FF: renamed from: i boolean
   private boolean field_5828;
   // $FF: renamed from: j java.lang.String
   private static final String field_5829;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_5830;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (iY, int, java.util.Random, hS, int) void
   public void method_6282(class_1118 var1, int var2, Random var3, class_1206 var4, int var5) {
      super.method_6266(var1, var2);
      this.field_5753 = var5;
      this.field_5752 = var4;
   }

   // $FF: renamed from: b (iY, java.util.List, java.util.Random, int, int, int, int, int) iT
   public static class_1122 method_6283(class_1118 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      class_1206 var8 = class_1206.method_6479(var3, var4, var5, 0, 0, 0, 10, 6, 7, var6);
      class_1122 var10000;
      if(method_6270(var8) && class_1094.method_6201(var1, var8) == null) {
         var10000 = new class_1122;
         var10000.method_6282(var0, var7, var2, var8, var6);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      String[] var10001 = field_5830;
      var1.initGui4("Chest", this.field_5828);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      String[] var10002 = field_5830;
      this.field_5828 = var1.method_8690("Chest");
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.field_5808;
      class_1122 var8;
      if(var4 != null) {
         if(this.field_5808 < 0) {
            this.field_5808 = this.method_6269(var1, var3);
            var8 = this;
            if(var4 != null) {
               if(this.field_5808 < 0) {
                  return true;
               }

               var8 = this;
            }

            var8.field_5752.method_6486(0, this.field_5808 - this.field_5752.field_6248 + 6 - 1, 0);
         }

         this.method_6211(var1, var3, 0, 1, 0, 9, 4, 6, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6211(var1, var3, 0, 0, 0, 9, 0, 6, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 0, 4, 0, 9, 4, 6, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 0, 5, 0, 9, 5, 6, class_1192.field_6071, class_1192.field_6071, false);
         this.method_6211(var1, var3, 1, 5, 1, 8, 5, 5, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6211(var1, var3, 1, 1, 0, 2, 3, 0, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 0, 1, 0, 0, 4, 0, class_1192.field_6042, class_1192.field_6042, false);
         this.method_6211(var1, var3, 3, 1, 0, 3, 4, 0, class_1192.field_6042, class_1192.field_6042, false);
         this.method_6211(var1, var3, 0, 1, 6, 0, 4, 6, class_1192.field_6042, class_1192.field_6042, false);
         this.method_6208(var1, class_1192.field_6030, 0, 3, 3, 1, var3);
         this.method_6211(var1, var3, 3, 1, 2, 3, 3, 2, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 4, 1, 3, 5, 3, 3, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 0, 1, 1, 0, 3, 5, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 1, 1, 6, 5, 3, 6, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 5, 1, 0, 5, 3, 0, class_1192.field_6111, class_1192.field_6111, false);
         this.method_6211(var1, var3, 9, 1, 0, 9, 3, 0, class_1192.field_6111, class_1192.field_6111, false);
         this.method_6211(var1, var3, 6, 1, 4, 9, 4, 6, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6208(var1, class_1192.field_6035, 0, 7, 1, 5, var3);
         this.method_6208(var1, class_1192.field_6035, 0, 8, 1, 5, var3);
         this.method_6208(var1, class_1192.field_6126, 0, 9, 2, 5, var3);
         this.method_6208(var1, class_1192.field_6126, 0, 9, 2, 4, var3);
         this.method_6211(var1, var3, 7, 2, 4, 8, 2, 5, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6208(var1, class_1192.field_6029, 0, 6, 1, 3, var3);
         this.method_6208(var1, class_1192.field_6088, 0, 6, 2, 3, var3);
         this.method_6208(var1, class_1192.field_6088, 0, 6, 3, 3, var3);
         this.method_6208(var1, class_1192.field_6070, 0, 8, 1, 1, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 0, 2, 2, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 0, 2, 4, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 2, 2, 6, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 4, 2, 6, var3);
         this.method_6208(var1, class_1192.field_6111, 0, 2, 1, 4, var3);
         this.method_6208(var1, class_1192.field_6098, 0, 2, 2, 4, var3);
         this.method_6208(var1, class_1192.field_6030, 0, 1, 1, 5, var3);
         this.method_6208(var1, class_1192.field_6080, this.method_6207(class_1192.field_6080, 3), 2, 1, 5, var3);
         this.method_6208(var1, class_1192.field_6080, this.method_6207(class_1192.field_6080, 1), 1, 1, 4, var3);
         var10000 = this.field_5828;
      }

      int var5;
      int var6;
      if(var4 != null) {
         label94: {
            if(var10000 == 0) {
               var5 = this.method_6205(1);
               var6 = this.method_6204(5, 5);
               int var7 = this.method_6206(5, 5);
               var10000 = var3.method_6487(var6, var5, var7);
               if(var4 == null) {
                  break label94;
               }

               if(var10000 != 0) {
                  this.field_5828 = true;
                  this.method_6219(var1, var3, var2, 5, 1, 5, field_5827, 3 + var2.nextInt(6));
               }
            }

            var10000 = 6;
         }
      }

      var5 = var10000;

      boolean var11;
      ahb var10001;
      while(true) {
         if(var5 <= 8) {
            var8 = this;
            var10001 = var1;
            if(var4 == null) {
               break;
            }

            label79: {
               label101: {
                  awt var10 = this.method_6209(var1, var5, 0, -1, var3).method_2424();
                  awt var9 = awt.field_4170;
                  if(var4 != null) {
                     if(var10 != awt.field_4170) {
                        break label79;
                     }

                     var8 = this;
                     var10001 = var1;
                     if(var4 == null) {
                        break label101;
                     }

                     var10 = this.method_6209(var1, var5, -1, -1, var3).method_2424();
                     var9 = awt.field_4170;
                  }

                  if(var10 == var9) {
                     break label79;
                  }

                  var8 = this;
                  var10001 = var1;
               }

               var8.method_6208(var10001, class_1192.field_6093, this.method_6207(class_1192.field_6093, 3), var5, 0, -1, var3);
            }

            ++var5;
            if(var4 != null) {
               continue;
            }
         }

         var5 = 0;

         while(var5 < 7) {
            var11 = false;
            if(var4 == null) {
               return var11;
            }

            var6 = 0;

            while(true) {
               if(var6 < 10) {
                  this.method_6217(var1, var6, 6, var5, var3);
                  this.method_6218(var1, class_1192.field_6029, 0, var6, -1, var5, var3);
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

            if(var4 == null) {
               break;
            }
         }

         var8 = this;
         var10001 = var1;
         break;
      }

      var8.method_6271(var10001, var3, 7, 1, 1, 1);
      var11 = true;
      return var11;
   }

   // $FF: renamed from: a (int) int
   protected int method_6272(int var1) {
      return 3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "d©Ü¢eÿÄÚ@V";
      int var4 = "d©Ü¢eÿÄÚ@V".length();
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
                  field_5830 = var5;
                  String[] var10 = field_5830;
                  field_5829 = "CL_00000526";
                  class_1652[] var7 = new class_1652[17];
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5122, 0, 1, 3, 3);
                  var7[0] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5123, 0, 1, 5, 10);
                  var7[1] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5124, 0, 1, 3, 5);
                  var7[2] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5155, 0, 1, 3, 15);
                  var7[3] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5118, 0, 1, 3, 15);
                  var7[4] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5115, 0, 1, 1, 5);
                  var7[5] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5125, 0, 1, 1, 5);
                  var7[6] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5165, 0, 1, 1, 5);
                  var7[7] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5164, 0, 1, 1, 5);
                  var7[8] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5166, 0, 1, 1, 5);
                  var7[9] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5167, 0, 1, 1, 5);
                  var7[10] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(adb.method_2920(class_1192.field_6076), 0, 3, 7, 5);
                  var7[11] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(adb.method_2920(class_1192.field_6031), 0, 3, 7, 5);
                  var7[12] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5187, 0, 1, 1, 3);
                  var7[13] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5265, 0, 1, 1, 1);
                  var7[14] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5266, 0, 1, 1, 1);
                  var7[15] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5267, 0, 1, 1, 1);
                  var7[16] = var10004;
                  field_5827 = var7;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 198;
               break;
            case 1:
               var10009 = 33;
               break;
            case 2:
               var10009 = 255;
               break;
            case 3:
               var10009 = 229;
               break;
            case 4:
               var10009 = 43;
               break;
            case 5:
               var10009 = 155;
               break;
            default:
               var10009 = 92;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
