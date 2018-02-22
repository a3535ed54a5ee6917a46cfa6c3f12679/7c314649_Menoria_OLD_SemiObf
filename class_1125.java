import java.util.List;
import java.util.Random;

// $FF: renamed from: iQ
public class class_1125 extends class_1116 {

   // $FF: renamed from: h boolean
   private boolean field_5835;
   // $FF: renamed from: i java.lang.String
   private static final String field_5836;
   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_5837;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (iY, int, java.util.Random, hS, int) void
   public void method_6288(class_1118 var1, int var2, Random var3, class_1206 var4, int var5) {
      super.method_6266(var1, var2);
      this.field_5753 = var5;
      this.field_5752 = var4;
      this.field_5835 = var3.nextBoolean();
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      String[] var10001 = field_5837;
      var1.initGui4("Terrace", this.field_5835);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      String[] var10002 = field_5837;
      this.field_5835 = var1.method_8690("Terrace");
   }

   // $FF: renamed from: b (iY, java.util.List, java.util.Random, int, int, int, int, int) iQ
   public static class_1125 method_6289(class_1118 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      class_1206 var8 = class_1206.method_6479(var3, var4, var5, 0, 0, 0, 5, 6, 5, var6);
      class_1125 var10000;
      if(class_1094.method_6201(var1, var8) != null) {
         var10000 = null;
      } else {
         var10000 = new class_1125;
         var10000.method_6288(var0, var7, var2, var8, var6);
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      class_1125 var10000 = this;
      if(var4 != null) {
         if(this.field_5808 < 0) {
            this.field_5808 = this.method_6269(var1, var3);
            var10000 = this;
            if(var4 != null) {
               if(this.field_5808 < 0) {
                  return true;
               }

               var10000 = this;
            }

            var10000.field_5752.method_6486(0, this.field_5808 - this.field_5752.field_6248 + 6 - 1, 0);
         }

         this.method_6211(var1, var3, 0, 0, 0, 4, 0, 4, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 0, 4, 0, 4, 4, 4, class_1192.field_6042, class_1192.field_6042, false);
         this.method_6211(var1, var3, 1, 4, 1, 3, 4, 3, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6208(var1, class_1192.field_6029, 0, 0, 1, 0, var3);
         this.method_6208(var1, class_1192.field_6029, 0, 0, 2, 0, var3);
         this.method_6208(var1, class_1192.field_6029, 0, 0, 3, 0, var3);
         this.method_6208(var1, class_1192.field_6029, 0, 4, 1, 0, var3);
         this.method_6208(var1, class_1192.field_6029, 0, 4, 2, 0, var3);
         this.method_6208(var1, class_1192.field_6029, 0, 4, 3, 0, var3);
         this.method_6208(var1, class_1192.field_6029, 0, 0, 1, 4, var3);
         this.method_6208(var1, class_1192.field_6029, 0, 0, 2, 4, var3);
         this.method_6208(var1, class_1192.field_6029, 0, 0, 3, 4, var3);
         this.method_6208(var1, class_1192.field_6029, 0, 4, 1, 4, var3);
         this.method_6208(var1, class_1192.field_6029, 0, 4, 2, 4, var3);
         this.method_6208(var1, class_1192.field_6029, 0, 4, 3, 4, var3);
         this.method_6211(var1, var3, 0, 1, 1, 0, 3, 3, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 4, 1, 1, 4, 3, 3, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 1, 1, 4, 3, 3, 4, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6208(var1, class_1192.field_6127, 0, 0, 2, 2, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 2, 2, 4, var3);
         this.method_6208(var1, class_1192.field_6127, 0, 4, 2, 2, var3);
         this.method_6208(var1, class_1192.field_6030, 0, 1, 1, 0, var3);
         this.method_6208(var1, class_1192.field_6030, 0, 1, 2, 0, var3);
         this.method_6208(var1, class_1192.field_6030, 0, 1, 3, 0, var3);
         this.method_6208(var1, class_1192.field_6030, 0, 2, 3, 0, var3);
         this.method_6208(var1, class_1192.field_6030, 0, 3, 3, 0, var3);
         this.method_6208(var1, class_1192.field_6030, 0, 3, 2, 0, var3);
         this.method_6208(var1, class_1192.field_6030, 0, 3, 1, 0, var3);
         var10000 = this;
      }

      ahb var10001 = var1;
      if(var4 != null) {
         label75: {
            if(var10000.method_6209(var1, 2, 0, -1, var3).method_2424() == awt.field_4170) {
               var10000 = this;
               var10001 = var1;
               if(var4 == null) {
                  break label75;
               }

               if(this.method_6209(var1, 2, -1, -1, var3).method_2424() != awt.field_4170) {
                  this.method_6208(var1, class_1192.field_6093, this.method_6207(class_1192.field_6093, 3), 2, 0, -1, var3);
               }
            }

            var10000 = this;
            var10001 = var1;
         }
      }

      var10000.method_6211(var10001, var3, 1, 1, 1, 3, 3, 3, class_1192.field_6025, class_1192.field_6025, false);
      byte var7 = this.field_5835;
      if(var4 != null) {
         if(this.field_5835) {
            this.method_6208(var1, class_1192.field_6111, 0, 0, 5, 0, var3);
            this.method_6208(var1, class_1192.field_6111, 0, 1, 5, 0, var3);
            this.method_6208(var1, class_1192.field_6111, 0, 2, 5, 0, var3);
            this.method_6208(var1, class_1192.field_6111, 0, 3, 5, 0, var3);
            this.method_6208(var1, class_1192.field_6111, 0, 4, 5, 0, var3);
            this.method_6208(var1, class_1192.field_6111, 0, 0, 5, 4, var3);
            this.method_6208(var1, class_1192.field_6111, 0, 1, 5, 4, var3);
            this.method_6208(var1, class_1192.field_6111, 0, 2, 5, 4, var3);
            this.method_6208(var1, class_1192.field_6111, 0, 3, 5, 4, var3);
            this.method_6208(var1, class_1192.field_6111, 0, 4, 5, 4, var3);
            this.method_6208(var1, class_1192.field_6111, 0, 4, 5, 1, var3);
            this.method_6208(var1, class_1192.field_6111, 0, 4, 5, 2, var3);
            this.method_6208(var1, class_1192.field_6111, 0, 4, 5, 3, var3);
            this.method_6208(var1, class_1192.field_6111, 0, 0, 5, 1, var3);
            this.method_6208(var1, class_1192.field_6111, 0, 0, 5, 2, var3);
            this.method_6208(var1, class_1192.field_6111, 0, 0, 5, 3, var3);
         }

         var7 = this.field_5835;
      }

      int var5;
      if(var4 != null) {
         if(var7 != 0) {
            var5 = this.method_6207(class_1192.field_6091, 3);
            this.method_6208(var1, class_1192.field_6091, var5, 3, 1, 3, var3);
            this.method_6208(var1, class_1192.field_6091, var5, 3, 2, 3, var3);
            this.method_6208(var1, class_1192.field_6091, var5, 3, 3, 3, var3);
            this.method_6208(var1, class_1192.field_6091, var5, 3, 4, 3, var3);
         }

         this.method_6208(var1, class_1192.field_6077, 0, 2, 3, 1, var3);
         var7 = 0;
      }

      var5 = var7;

      boolean var8;
      while(true) {
         if(var5 < 5) {
            var8 = false;
            if(var4 == null) {
               break;
            }

            int var6 = 0;

            while(true) {
               if(var6 < 5) {
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

            if(var4 != null) {
               continue;
            }
         }

         this.method_6271(var1, var3, 1, 1, 2, 1);
         var8 = true;
         break;
      }

      return var8;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "»F¾Ø ÍÈã+½¬³küó";
      int var4 = "»F¾Ø ÍÈã+½¬³küó".length();
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
                  field_5837 = var5;
                  String[] var10 = field_5837;
                  field_5836 = "CL_00000523";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 123;
               break;
            case 1:
               var10009 = 85;
               break;
            case 2:
               var10009 = 154;
               break;
            case 3:
               var10009 = 13;
               break;
            case 4:
               var10009 = 107;
               break;
            case 5:
               var10009 = 19;
               break;
            default:
               var10009 = 126;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
