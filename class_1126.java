import java.util.List;
import java.util.Random;

// $FF: renamed from: iP
public class class_1126 extends class_1116 {

   // $FF: renamed from: h java.lang.String
   private static final String field_5838 = "CL_00000522";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (iY, int, java.util.Random, hS, int) void
   public void method_6290(class_1118 var1, int var2, Random var3, class_1206 var4, int var5) {
      super.method_6266(var1, var2);
      this.field_5753 = var5;
      this.field_5752 = var4;
   }

   // $FF: renamed from: b (iY, java.util.List, java.util.Random, int, int, int, int, int) iP
   public static class_1126 method_6291(class_1118 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      class_1206 var8 = class_1206.method_6479(var3, var4, var5, 0, 0, 0, 9, 7, 11, var6);
      class_1126 var10000;
      if(method_6270(var8) && class_1094.method_6201(var1, var8) == null) {
         var10000 = new class_1126;
         var10000.method_6290(var0, var7, var2, var8, var6);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.field_5808;
      class_1126 var9;
      if(var4 != null) {
         if(this.field_5808 < 0) {
            this.field_5808 = this.method_6269(var1, var3);
            var9 = this;
            if(var4 != null) {
               if(this.field_5808 < 0) {
                  return true;
               }

               var9 = this;
            }

            var9.field_5752.method_6486(0, this.field_5808 - this.field_5752.field_6248 + 7 - 1, 0);
         }

         this.method_6211(var1, var3, 1, 1, 1, 7, 4, 4, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6211(var1, var3, 2, 1, 6, 8, 4, 10, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6211(var1, var3, 2, 0, 6, 8, 0, 10, class_1192.field_6028, class_1192.field_6028, false);
         this.method_6208(var1, class_1192.field_6029, 0, 6, 0, 6, var3);
         this.method_6211(var1, var3, 2, 1, 6, 2, 1, 10, class_1192.field_6111, class_1192.field_6111, false);
         this.method_6211(var1, var3, 8, 1, 6, 8, 1, 10, class_1192.field_6111, class_1192.field_6111, false);
         this.method_6211(var1, var3, 3, 1, 10, 7, 1, 10, class_1192.field_6111, class_1192.field_6111, false);
         this.method_6211(var1, var3, 1, 0, 1, 7, 0, 4, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 0, 0, 0, 0, 3, 5, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 8, 0, 0, 8, 3, 5, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 1, 0, 0, 7, 1, 0, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 1, 0, 5, 7, 1, 5, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 1, 2, 0, 7, 3, 0, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 1, 2, 5, 7, 3, 5, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 0, 4, 1, 8, 4, 1, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 0, 4, 4, 8, 4, 4, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 0, 5, 2, 8, 5, 3, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6208(var1, class_1192.field_6030, 0, 0, 4, 2, var3);
         this.method_6208(var1, class_1192.field_6030, 0, 0, 4, 3, var3);
         this.method_6208(var1, class_1192.field_6030, 0, 8, 4, 2, var3);
         this.method_6208(var1, class_1192.field_6030, 0, 8, 4, 3, var3);
         var10000 = this.method_6207(class_1192.field_6080, 3);
      }

      int var5 = var10000;
      int var6 = this.method_6207(class_1192.field_6080, 2);
      int var7 = -1;

      int var8;
      byte var10;
      while(true) {
         if(var7 <= 2) {
            var10 = 0;
            if(var4 == null) {
               break;
            }

            var8 = 0;

            while(true) {
               if(var8 <= 8) {
                  this.method_6208(var1, class_1192.field_6080, var5, var8, 4 + var7, var7, var3);
                  this.method_6208(var1, class_1192.field_6080, var6, var8, 4 + var7, 5 - var7, var3);
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

         this.method_6208(var1, class_1192.field_6042, 0, 0, 2, 1, var3);
         this.method_6208(var1, class_1192.field_6042, 0, 0, 2, 4, var3);
         this.method_6208(var1, class_1192.field_6042, 0, 8, 2, 1, var3);
         this.method_6208(var1, class_1192.field_6042, 0, 8, 2, 4, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 0, 2, 2, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 0, 2, 3, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 8, 2, 2, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 8, 2, 3, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 2, 2, 5, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 3, 2, 5, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 5, 2, 0, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 6, 2, 5, var3);
         this.method_6208(var1, class_1192.field_6111, 0, 2, 1, 3, var3);
         this.method_6208(var1, class_1192.field_6098, 0, 2, 2, 3, var3);
         this.method_6208(var1, class_1192.field_6030, 0, 1, 1, 4, var3);
         this.method_6208(var1, class_1192.field_6080, this.method_6207(class_1192.field_6080, 3), 2, 1, 4, var3);
         this.method_6208(var1, class_1192.field_6080, this.method_6207(class_1192.field_6080, 1), 1, 1, 3, var3);
         this.method_6211(var1, var3, 5, 0, 1, 7, 0, 3, class_1192.field_6070, class_1192.field_6070, false);
         this.method_6208(var1, class_1192.field_6070, 0, 6, 1, 1, var3);
         this.method_6208(var1, class_1192.field_6070, 0, 6, 1, 2, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 2, 1, 0, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 2, 2, 0, var3);
         this.method_6208(var1, class_1192.field_6077, 0, 2, 3, 1, var3);
         this.method_6221(var1, var3, var2, 2, 1, 0, this.method_6207(class_1192.field_6090, 1));
         var9 = this;
         ahb var10001 = var1;
         if(var4 != null) {
            label70: {
               if(this.method_6209(var1, 2, 0, -1, var3).method_2424() == awt.field_4170) {
                  var9 = this;
                  var10001 = var1;
                  if(var4 == null) {
                     break label70;
                  }

                  if(this.method_6209(var1, 2, -1, -1, var3).method_2424() != awt.field_4170) {
                     this.method_6208(var1, class_1192.field_6093, this.method_6207(class_1192.field_6093, 3), 2, 0, -1, var3);
                  }
               }

               this.method_6208(var1, class_1192.field_6025, 0, 6, 1, 5, var3);
               this.method_6208(var1, class_1192.field_6025, 0, 6, 2, 5, var3);
               this.method_6208(var1, class_1192.field_6077, 0, 6, 3, 4, var3);
               var9 = this;
               var10001 = var1;
            }
         }

         var9.method_6221(var10001, var3, var2, 6, 1, 5, this.method_6207(class_1192.field_6090, 1));
         var10 = 0;
         break;
      }

      var7 = var10;

      boolean var11;
      while(true) {
         if(var7 < 5) {
            var11 = false;
            if(var4 == null) {
               break;
            }

            var8 = 0;

            while(true) {
               if(var8 < 9) {
                  this.method_6217(var1, var8, 7, var7, var3);
                  this.method_6218(var1, class_1192.field_6029, 0, var8, -1, var7, var3);
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

         this.method_6271(var1, var3, 4, 1, 2, 2);
         var11 = true;
         break;
      }

      return var11;
   }

   // $FF: renamed from: a (int) int
   protected int method_6272(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         var10000 = var1 == 0?4:0;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "m\rw.x*\\t,".toCharArray();
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
            field_5838 = (new String((char[])var4)).intern();
            String var2 = field_5838;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 219;
            break;
         case 1:
            var10009 = 180;
            break;
         case 2:
            var10009 = 221;
            break;
         case 3:
            var10009 = 235;
            break;
         case 4:
            var10009 = 189;
            break;
         case 5:
            var10009 = 239;
            break;
         default:
            var10009 = 153;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
