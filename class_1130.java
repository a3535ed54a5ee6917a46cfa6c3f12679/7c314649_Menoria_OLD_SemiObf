import java.util.List;
import java.util.Random;

// $FF: renamed from: iL
public class class_1130 extends class_1116 {

   // $FF: renamed from: h java.lang.String
   private static final String field_5850 = "CL_00000517";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (iY, int, java.util.Random, hS, int) void
   public void method_6300(class_1118 var1, int var2, Random var3, class_1206 var4, int var5) {
      super.method_6266(var1, var2);
      this.field_5753 = var5;
      this.field_5752 = var4;
   }

   // $FF: renamed from: b (iY, java.util.List, java.util.Random, int, int, int, int, int) iL
   public static class_1130 method_6301(class_1118 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      class_1206 var8 = class_1206.method_6479(var3, var4, var5, 0, 0, 0, 9, 9, 6, var6);
      class_1130 var10000;
      if(method_6270(var8) && class_1094.method_6201(var1, var8) == null) {
         var10000 = new class_1130;
         var10000.method_6300(var0, var7, var2, var8, var6);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.field_5808;
      class_1130 var10;
      if(var4 != null) {
         if(this.field_5808 < 0) {
            this.field_5808 = this.method_6269(var1, var3);
            var10 = this;
            if(var4 != null) {
               if(this.field_5808 < 0) {
                  return true;
               }

               var10 = this;
            }

            var10.field_5752.method_6486(0, this.field_5808 - this.field_5752.field_6248 + 9 - 1, 0);
         }

         this.method_6211(var1, var3, 1, 1, 1, 7, 5, 4, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6211(var1, var3, 0, 0, 0, 8, 0, 5, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 0, 5, 0, 8, 5, 5, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 0, 6, 1, 8, 6, 4, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 0, 7, 2, 8, 7, 3, class_1192.field_6029, class_1192.field_6029, false);
         var10000 = this.method_6207(class_1192.field_6080, 3);
      }

      int var5 = var10000;
      int var6 = this.method_6207(class_1192.field_6080, 2);
      int var7 = -1;

      int var8;
      while(true) {
         if(var7 <= 2) {
            var10000 = 0;
            if(var4 == null) {
               break;
            }

            var8 = 0;

            while(true) {
               if(var8 <= 8) {
                  this.method_6208(var1, class_1192.field_6080, var5, var8, 6 + var7, var7, var3);
                  this.method_6208(var1, class_1192.field_6080, var6, var8, 6 + var7, 5 - var7, var3);
                  ++var8;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               ++var7;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         this.method_6211(var1, var3, 0, 1, 0, 0, 1, 5, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 1, 1, 5, 8, 1, 5, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 8, 1, 0, 8, 1, 4, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 2, 1, 0, 7, 1, 0, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 0, 2, 0, 0, 4, 0, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 0, 2, 5, 0, 4, 5, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 8, 2, 5, 8, 4, 5, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 8, 2, 0, 8, 4, 0, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 0, 2, 1, 0, 4, 4, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 1, 2, 5, 7, 4, 5, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 8, 2, 1, 8, 4, 4, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 1, 2, 0, 7, 4, 0, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6208(var1, class_1192.field_6127, 0, 4, 2, 0, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 5, 2, 0, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 6, 2, 0, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 4, 3, 0, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 5, 3, 0, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 6, 3, 0, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 0, 2, 2, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 0, 2, 3, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 0, 3, 2, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 0, 3, 3, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 8, 2, 2, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 8, 2, 3, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 8, 3, 2, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 8, 3, 3, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 2, 2, 5, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 3, 2, 5, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 5, 2, 5, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 6, 2, 5, var3);
         this.method_6211(var1, var3, 1, 4, 1, 7, 4, 1, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 1, 4, 4, 7, 4, 4, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 1, 3, 4, 7, 3, 4, class_1192.field_6074, class_1192.field_6074, false);
         this.method_6208(var1, class_1192.field_6030, 0, 7, 1, 4, var3);
         this.method_6208(var1, class_1192.field_6080, this.method_6207(class_1192.field_6080, 0), 7, 1, 3, var3);
         var10000 = this.method_6207(class_1192.field_6080, 3);
         break;
      }

      if(var4 != null) {
         var7 = var10000;
         this.method_6208(var1, class_1192.field_6080, var7, 6, 1, 4, var3);
         this.method_6208(var1, class_1192.field_6080, var7, 5, 1, 4, var3);
         this.method_6208(var1, class_1192.field_6080, var7, 4, 1, 4, var3);
         this.method_6208(var1, class_1192.field_6080, var7, 3, 1, 4, var3);
         this.method_6208(var1, class_1192.field_6111, 0, 6, 1, 3, var3);
         this.method_6208(var1, class_1192.field_6098, 0, 6, 2, 3, var3);
         this.method_6208(var1, class_1192.field_6111, 0, 4, 1, 3, var3);
         this.method_6208(var1, class_1192.field_6098, 0, 4, 2, 3, var3);
         this.method_6208(var1, class_1192.field_6085, 0, 7, 1, 1, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 1, 1, 0, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 1, 2, 0, var3);
         this.method_6221(var1, var3, var2, 1, 1, 0, this.method_6207(class_1192.field_6090, 1));
         if(this.method_6209(var1, 1, 0, -1, var3).method_2424() == awt.field_4170) {
            label70: {
               var10 = this;
               ahb var10001 = var1;
               if(var4 != null) {
                  if(this.method_6209(var1, 1, -1, -1, var3).method_2424() == awt.field_4170) {
                     break label70;
                  }

                  var10 = this;
                  var10001 = var1;
               }

               var10.method_6208(var10001, class_1192.field_6093, this.method_6207(class_1192.field_6093, 3), 1, 0, -1, var3);
            }
         }

         var10000 = 0;
      }

      var8 = var10000;

      boolean var11;
      while(true) {
         if(var8 < 6) {
            var11 = false;
            if(var4 == null) {
               break;
            }

            int var9 = 0;

            while(true) {
               if(var9 < 9) {
                  this.method_6217(var1, var9, 9, var8, var3);
                  this.method_6218(var1, class_1192.field_6029, 0, var9, -1, var8, var3);
                  ++var9;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               ++var8;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         this.method_6271(var1, var3, 2, 1, 2, 1);
         var11 = true;
         break;
      }

      return var11;
   }

   // $FF: renamed from: a (int) int
   protected int method_6272(int var1) {
      return 1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "TS>½`\'i=9".toCharArray();
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
            field_5850 = (new String((char[])var4)).intern();
            String var2 = field_5850;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 238;
            break;
         case 1:
            var10009 = 165;
            break;
         case 2:
            var10009 = 245;
            break;
         case 3:
            var10009 = 247;
            break;
         case 4:
            var10009 = 116;
            break;
         case 5:
            var10009 = 169;
            break;
         default:
            var10009 = 217;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
