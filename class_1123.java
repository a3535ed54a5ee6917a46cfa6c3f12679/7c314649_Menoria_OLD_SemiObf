import java.util.List;
import java.util.Random;

// $FF: renamed from: iS
public class class_1123 extends class_1116 {

   // $FF: renamed from: h java.lang.String
   private static final String field_5831 = "CL_00000525";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (iY, int, java.util.Random, hS, int) void
   public void method_6284(class_1118 var1, int var2, Random var3, class_1206 var4, int var5) {
      super.method_6266(var1, var2);
      this.field_5753 = var5;
      this.field_5752 = var4;
   }

   // $FF: renamed from: b (iY, java.util.List, java.util.Random, int, int, int, int, int) iS
   public static class_1123 method_6285(class_1118 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      class_1206 var8 = class_1206.method_6479(var3, var4, var5, 0, 0, 0, 5, 12, 9, var6);
      class_1123 var10000;
      if(method_6270(var8) && class_1094.method_6201(var1, var8) == null) {
         var10000 = new class_1123;
         var10000.method_6284(var0, var7, var2, var8, var6);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.field_5808;
      class_1123 var8;
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

            var8.field_5752.method_6486(0, this.field_5808 - this.field_5752.field_6248 + 12 - 1, 0);
         }

         this.method_6211(var1, var3, 1, 1, 1, 3, 3, 7, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6211(var1, var3, 1, 5, 1, 3, 9, 3, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6211(var1, var3, 1, 0, 0, 3, 0, 8, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 1, 1, 0, 3, 10, 0, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 0, 1, 1, 0, 10, 3, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 4, 1, 1, 4, 10, 3, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 0, 0, 4, 0, 4, 7, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 4, 0, 4, 4, 4, 7, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 1, 1, 8, 3, 4, 8, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 1, 5, 4, 3, 10, 4, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 1, 5, 5, 3, 5, 7, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 0, 9, 0, 4, 9, 4, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 0, 4, 0, 4, 4, 4, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6208(var1, class_1192.field_6029, 0, 0, 11, 2, var3);
         this.method_6208(var1, class_1192.field_6029, 0, 4, 11, 2, var3);
         this.method_6208(var1, class_1192.field_6029, 0, 2, 11, 0, var3);
         this.method_6208(var1, class_1192.field_6029, 0, 2, 11, 4, var3);
         this.method_6208(var1, class_1192.field_6029, 0, 1, 1, 6, var3);
         this.method_6208(var1, class_1192.field_6029, 0, 1, 1, 7, var3);
         this.method_6208(var1, class_1192.field_6029, 0, 2, 1, 7, var3);
         this.method_6208(var1, class_1192.field_6029, 0, 3, 1, 6, var3);
         this.method_6208(var1, class_1192.field_6029, 0, 3, 1, 7, var3);
         this.method_6208(var1, class_1192.field_6093, this.method_6207(class_1192.field_6093, 3), 1, 1, 5, var3);
         this.method_6208(var1, class_1192.field_6093, this.method_6207(class_1192.field_6093, 3), 2, 1, 6, var3);
         this.method_6208(var1, class_1192.field_6093, this.method_6207(class_1192.field_6093, 3), 3, 1, 5, var3);
         this.method_6208(var1, class_1192.field_6093, this.method_6207(class_1192.field_6093, 1), 1, 2, 7, var3);
         this.method_6208(var1, class_1192.field_6093, this.method_6207(class_1192.field_6093, 0), 3, 2, 7, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 0, 2, 2, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 0, 3, 2, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 4, 2, 2, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 4, 3, 2, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 0, 6, 2, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 0, 7, 2, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 4, 6, 2, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 4, 7, 2, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 2, 6, 0, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 2, 7, 0, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 2, 6, 4, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 2, 7, 4, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 0, 3, 6, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 4, 3, 6, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 2, 3, 8, var3);
         this.method_6208(var1, class_1192.field_6077, 0, 2, 4, 7, var3);
         this.method_6208(var1, class_1192.field_6077, 0, 1, 4, 6, var3);
         this.method_6208(var1, class_1192.field_6077, 0, 3, 4, 6, var3);
         this.method_6208(var1, class_1192.field_6077, 0, 2, 4, 5, var3);
         var10000 = this.method_6207(class_1192.field_6091, 4);
      }

      int var5 = var10000;
      int var6 = 1;

      while(true) {
         if(var6 <= 9) {
            this.method_6208(var1, class_1192.field_6091, var5, 3, var6, 3, var3);
            ++var6;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         this.method_6208(var1, class_1192.field_6025, 0, 2, 1, 0, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 2, 2, 0, var3);
         this.method_6221(var1, var3, var2, 2, 1, 0, this.method_6207(class_1192.field_6090, 1));
         break;
      }

      label71: {
         ahb var9;
         label83: {
            awt var10 = this.method_6209(var1, 2, 0, -1, var3).method_2424();
            awt var10001 = awt.field_4170;
            if(var4 != null) {
               if(var10 != awt.field_4170) {
                  break label71;
               }

               var8 = this;
               var9 = var1;
               if(var4 == null) {
                  break label83;
               }

               var10 = this.method_6209(var1, 2, -1, -1, var3).method_2424();
               var10001 = awt.field_4170;
            }

            if(var10 == var10001) {
               break label71;
            }

            var8 = this;
            var9 = var1;
         }

         var8.method_6208(var9, class_1192.field_6093, this.method_6207(class_1192.field_6093, 3), 2, 0, -1, var3);
      }

      var6 = 0;

      boolean var11;
      while(true) {
         if(var6 < 9) {
            var11 = false;
            if(var4 == null) {
               break;
            }

            int var7 = 0;

            while(true) {
               if(var7 < 5) {
                  this.method_6217(var1, var7, 12, var6, var3);
                  this.method_6218(var1, class_1192.field_6029, 0, var7, -1, var6, var3);
                  ++var7;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               ++var6;
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
      return 2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "ÂügA^±\nD".toCharArray();
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
            field_5831 = (new String((char[])var4)).intern();
            String var2 = field_5831;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 80;
            break;
         case 1:
            var10009 = 97;
            break;
         case 2:
            var10009 = 233;
            break;
         case 3:
            var10009 = 160;
            break;
         case 4:
            var10009 = 191;
            break;
         case 5:
            var10009 = 242;
            break;
         default:
            var10009 = 107;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
