import java.util.List;
import java.util.Random;

// $FF: renamed from: iR
public class class_1124 extends class_1116 {

   // $FF: renamed from: h boolean
   private boolean field_5832;
   // $FF: renamed from: i int
   private int field_5833;
   // $FF: renamed from: j java.lang.String
   private static final String field_5834 = "CL_00000524";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (iY, int, java.util.Random, hS, int) void
   public void method_6286(class_1118 var1, int var2, Random var3, class_1206 var4, int var5) {
      super.method_6266(var1, var2);
      this.field_5753 = var5;
      this.field_5752 = var4;
      this.field_5832 = var3.nextBoolean();
      this.field_5833 = var3.nextInt(3);
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      var1.method_8667("T", this.field_5833);
      var1.initGui4("C", this.field_5832);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      this.field_5833 = var1.method_8681("T");
      this.field_5832 = var1.method_8690("C");
   }

   // $FF: renamed from: b (iY, java.util.List, java.util.Random, int, int, int, int, int) iR
   public static class_1124 method_6287(class_1118 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      class_1206 var8 = class_1206.method_6479(var3, var4, var5, 0, 0, 0, 4, 6, 5, var6);
      class_1124 var10000;
      if(method_6270(var8) && class_1094.method_6201(var1, var8) == null) {
         var10000 = new class_1124;
         var10000.method_6286(var0, var7, var2, var8, var6);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4;
      class_1124 var7;
      label88: {
         label91: {
            var4 = class_752.method_4253();
            int var10000 = this.field_5808;
            if(var4 != null) {
               if(this.field_5808 < 0) {
                  this.field_5808 = this.method_6269(var1, var3);
                  var7 = this;
                  if(var4 != null) {
                     if(this.field_5808 < 0) {
                        return true;
                     }

                     var7 = this;
                  }

                  var7.field_5752.method_6486(0, this.field_5808 - this.field_5752.field_6248 + 6 - 1, 0);
               }

               this.method_6211(var1, var3, 1, 1, 1, 3, 5, 4, class_1192.field_6025, class_1192.field_6025, false);
               this.method_6211(var1, var3, 0, 0, 0, 3, 0, 4, class_1192.field_6029, class_1192.field_6029, false);
               this.method_6211(var1, var3, 1, 0, 1, 2, 0, 3, class_1192.field_6028, class_1192.field_6028, false);
               var7 = this;
               if(var4 == null) {
                  break label91;
               }

               var10000 = this.field_5832;
            }

            if(var10000 != 0) {
               this.method_6211(var1, var3, 1, 4, 1, 2, 4, 3, class_1192.field_6042, class_1192.field_6042, false);
               if(var4 != null) {
                  break label88;
               }
            }

            var7 = this;
         }

         var7.method_6211(var1, var3, 1, 5, 1, 2, 5, 3, class_1192.field_6042, class_1192.field_6042, false);
      }

      this.method_6208(var1, class_1192.field_6042, 0, 1, 4, 0, var3);
      this.method_6208(var1, class_1192.field_6042, 0, 2, 4, 0, var3);
      this.method_6208(var1, class_1192.field_6042, 0, 1, 4, 4, var3);
      this.method_6208(var1, class_1192.field_6042, 0, 2, 4, 4, var3);
      this.method_6208(var1, class_1192.field_6042, 0, 0, 4, 1, var3);
      this.method_6208(var1, class_1192.field_6042, 0, 0, 4, 2, var3);
      this.method_6208(var1, class_1192.field_6042, 0, 0, 4, 3, var3);
      this.method_6208(var1, class_1192.field_6042, 0, 3, 4, 1, var3);
      this.method_6208(var1, class_1192.field_6042, 0, 3, 4, 2, var3);
      this.method_6208(var1, class_1192.field_6042, 0, 3, 4, 3, var3);
      this.method_6211(var1, var3, 0, 1, 0, 0, 3, 0, class_1192.field_6042, class_1192.field_6042, false);
      this.method_6211(var1, var3, 3, 1, 0, 3, 3, 0, class_1192.field_6042, class_1192.field_6042, false);
      this.method_6211(var1, var3, 0, 1, 4, 0, 3, 4, class_1192.field_6042, class_1192.field_6042, false);
      this.method_6211(var1, var3, 3, 1, 4, 3, 3, 4, class_1192.field_6042, class_1192.field_6042, false);
      this.method_6211(var1, var3, 0, 1, 1, 0, 3, 3, class_1192.field_6030, class_1192.field_6030, false);
      this.method_6211(var1, var3, 3, 1, 1, 3, 3, 3, class_1192.field_6030, class_1192.field_6030, false);
      this.method_6211(var1, var3, 1, 1, 0, 2, 3, 0, class_1192.field_6030, class_1192.field_6030, false);
      this.method_6211(var1, var3, 1, 1, 4, 2, 3, 4, class_1192.field_6030, class_1192.field_6030, false);
      this.method_6208(var1, class_1192.field_6127, 0, 0, 2, 2, var3);
      this.method_6208(var1, class_1192.field_6127, 0, 3, 2, 2, var3);
      var7 = this;
      if(var4 != null) {
         if(this.field_5833 > 0) {
            this.method_6208(var1, class_1192.field_6111, 0, this.field_5833, 1, 3, var3);
            this.method_6208(var1, class_1192.field_6098, 0, this.field_5833, 2, 3, var3);
         }

         this.method_6208(var1, class_1192.field_6025, 0, 1, 1, 0, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 1, 2, 0, var3);
         this.method_6221(var1, var3, var2, 1, 1, 0, this.method_6207(class_1192.field_6090, 1));
         var7 = this;
      }

      label75: {
         ahb var8;
         label93: {
            awt var9 = var7.method_6209(var1, 1, 0, -1, var3).method_2424();
            awt var10001 = awt.field_4170;
            if(var4 != null) {
               if(var9 != awt.field_4170) {
                  break label75;
               }

               var7 = this;
               var8 = var1;
               if(var4 == null) {
                  break label93;
               }

               var9 = this.method_6209(var1, 1, -1, -1, var3).method_2424();
               var10001 = awt.field_4170;
            }

            if(var9 == var10001) {
               break label75;
            }

            var7 = this;
            var8 = var1;
         }

         var7.method_6208(var8, class_1192.field_6093, this.method_6207(class_1192.field_6093, 3), 1, 0, -1, var3);
      }

      int var5 = 0;

      boolean var10;
      while(true) {
         if(var5 < 5) {
            var10 = false;
            if(var4 == null) {
               break;
            }

            int var6 = 0;

            while(true) {
               if(var6 < 4) {
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
         var10 = true;
         break;
      }

      return var10;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "6¥eº?EfÈ".toCharArray();
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
            field_5834 = (new String((char[])var4)).intern();
            String var2 = field_5834;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 107;
            break;
         case 1:
            var10009 = 77;
            break;
         case 2:
            var10009 = 228;
            break;
         case 3:
            var10009 = 167;
            break;
         case 4:
            var10009 = 75;
            break;
         case 5:
            var10009 = 148;
            break;
         default:
            var10009 = 17;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
