import java.util.List;
import java.util.Random;

// $FF: renamed from: iD
public class class_1141 extends class_1131 {

   // $FF: renamed from: d boolean
   private boolean field_5884;
   // $FF: renamed from: g java.lang.String
   private static final String field_5885;
   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_5886;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6325(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5753 = var4;
      this.field_5752 = var3;
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      String[] var10001 = field_5886;
      var1.initGui4("Mob", this.field_5884);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      String[] var10002 = field_5886;
      this.field_5884 = var1.method_8690("Mob");
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      String[] var4 = class_752.method_4253();
      class_1094 var10000 = var1;
      if(var4 != null) {
         if(var1 == null) {
            return;
         }

         var10000 = var1;
      }

      ((class_1138)var10000).field_5876 = this;
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) iD
   public static class_1141 method_6326(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      class_1206 var7 = class_1206.method_6479(var2, var3, var4, -4, -1, 0, 11, 8, 16, var5);
      class_1141 var10000;
      if(method_6307(var7) && class_1094.method_6201(var0, var7) == null) {
         var10000 = new class_1141;
         var10000.method_6325(var6, var1, var7, var5);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      this.method_6213(var1, var3, 0, 0, 0, 10, 7, 15, false, var2, class_1252.method_6598());
      String[] var10000 = class_752.method_4253();
      this.method_6302(var1, var2, var3, class_98.field_73, 4, 1, 0);
      String[] var4 = var10000;
      byte var5 = 6;
      this.method_6213(var1, var3, 1, var5, 1, 1, var5, 14, false, var2, class_1252.method_6598());
      this.method_6213(var1, var3, 9, var5, 1, 9, var5, 14, false, var2, class_1252.method_6598());
      this.method_6213(var1, var3, 2, var5, 1, 8, var5, 2, false, var2, class_1252.method_6598());
      this.method_6213(var1, var3, 2, var5, 14, 8, var5, 14, false, var2, class_1252.method_6598());
      this.method_6213(var1, var3, 1, 1, 1, 2, 1, 4, false, var2, class_1252.method_6598());
      this.method_6213(var1, var3, 8, 1, 1, 9, 1, 4, false, var2, class_1252.method_6598());
      this.method_6211(var1, var3, 1, 1, 1, 1, 1, 3, class_1192.field_6035, class_1192.field_6035, false);
      this.method_6211(var1, var3, 9, 1, 1, 9, 1, 3, class_1192.field_6035, class_1192.field_6035, false);
      this.method_6213(var1, var3, 3, 1, 8, 7, 1, 12, false, var2, class_1252.method_6598());
      this.method_6211(var1, var3, 4, 1, 9, 6, 1, 11, class_1192.field_6035, class_1192.field_6035, false);
      int var6 = 3;

      while(true) {
         if(var6 < 14) {
            this.method_6211(var1, var3, 0, 3, var6, 0, 4, var6, class_1192.field_6126, class_1192.field_6126, false);
            this.method_6211(var1, var3, 10, 3, var6, 10, 4, var6, class_1192.field_6126, class_1192.field_6126, false);
            var6 += 2;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var6 = 2;
         break;
      }

      while(true) {
         if(var6 < 9) {
            this.method_6211(var1, var3, var6, 3, 15, var6, 4, 15, class_1192.field_6126, class_1192.field_6126, false);
            var6 += 2;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var6 = this.method_6207(class_1192.field_6134, 3);
         this.method_6213(var1, var3, 4, 1, 5, 6, 1, 7, false, var2, class_1252.method_6598());
         this.method_6213(var1, var3, 4, 2, 6, 6, 2, 7, false, var2, class_1252.method_6598());
         this.method_6213(var1, var3, 4, 3, 7, 6, 3, 7, false, var2, class_1252.method_6598());
         break;
      }

      int var7 = 4;

      while(true) {
         if(var7 <= 6) {
            this.method_6208(var1, class_1192.field_6134, var6, var7, 1, 4, var3);
            this.method_6208(var1, class_1192.field_6134, var6, var7, 2, 5, var3);
            this.method_6208(var1, class_1192.field_6134, var6, var7, 3, 6, var3);
            ++var7;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var7 = 2;
         break;
      }

      byte var8;
      byte var9;
      int var10;
      label146: {
         var8 = 0;
         var9 = 3;
         var10 = 1;
         int var15 = this.field_5753;
         if(var4 != null) {
            switch(this.field_5753) {
            case 0:
               var7 = 0;
               var8 = 2;
               if(var4 != null) {
                  break label146;
               }
            case 1:
               var7 = 1;
               var8 = 3;
               var9 = 0;
               var10 = 2;
            case 2:
            default:
               if(var4 != null) {
                  break label146;
               }
            case 3:
               var7 = 3;
               var8 = 1;
               var9 = 0;
               var15 = 2;
            }
         }

         var10 = var15;
      }

      aji var10002 = class_1192.field_6144;
      float var18;
      int var10004 = (var18 = var2.nextFloat() - 0.9F) == 0.0F?0:(var18 < 0.0F?-1:1);
      if(var4 != null) {
         var10004 = var10004 > 0?4:0;
      }

      this.method_6208(var1, var10002, var7 + var10004, 4, 3, 8, var3);
      var10002 = class_1192.field_6144;
      float var19;
      var10004 = (var19 = var2.nextFloat() - 0.9F) == 0.0F?0:(var19 < 0.0F?-1:1);
      if(var4 != null) {
         var10004 = var10004 > 0?4:0;
      }

      this.method_6208(var1, var10002, var7 + var10004, 5, 3, 8, var3);
      var10002 = class_1192.field_6144;
      float var20;
      var10004 = (var20 = var2.nextFloat() - 0.9F) == 0.0F?0:(var20 < 0.0F?-1:1);
      if(var4 != null) {
         var10004 = var10004 > 0?4:0;
      }

      this.method_6208(var1, var10002, var7 + var10004, 6, 3, 8, var3);
      var10002 = class_1192.field_6144;
      float var21;
      var10004 = (var21 = var2.nextFloat() - 0.9F) == 0.0F?0:(var21 < 0.0F?-1:1);
      if(var4 != null) {
         var10004 = var10004 > 0?4:0;
      }

      this.method_6208(var1, var10002, var8 + var10004, 4, 3, 12, var3);
      var10002 = class_1192.field_6144;
      float var22;
      var10004 = (var22 = var2.nextFloat() - 0.9F) == 0.0F?0:(var22 < 0.0F?-1:1);
      if(var4 != null) {
         var10004 = var10004 > 0?4:0;
      }

      this.method_6208(var1, var10002, var8 + var10004, 5, 3, 12, var3);
      var10002 = class_1192.field_6144;
      float var23;
      var10004 = (var23 = var2.nextFloat() - 0.9F) == 0.0F?0:(var23 < 0.0F?-1:1);
      if(var4 != null) {
         var10004 = var10004 > 0?4:0;
      }

      this.method_6208(var1, var10002, var8 + var10004, 6, 3, 12, var3);
      var10002 = class_1192.field_6144;
      float var24;
      var10004 = (var24 = var2.nextFloat() - 0.9F) == 0.0F?0:(var24 < 0.0F?-1:1);
      if(var4 != null) {
         var10004 = var10004 > 0?4:0;
      }

      this.method_6208(var1, var10002, var9 + var10004, 3, 3, 9, var3);
      var10002 = class_1192.field_6144;
      float var25;
      var10004 = (var25 = var2.nextFloat() - 0.9F) == 0.0F?0:(var25 < 0.0F?-1:1);
      if(var4 != null) {
         var10004 = var10004 > 0?4:0;
      }

      this.method_6208(var1, var10002, var9 + var10004, 3, 3, 10, var3);
      var10002 = class_1192.field_6144;
      float var26;
      var10004 = (var26 = var2.nextFloat() - 0.9F) == 0.0F?0:(var26 < 0.0F?-1:1);
      if(var4 != null) {
         var10004 = var10004 > 0?4:0;
      }

      this.method_6208(var1, var10002, var9 + var10004, 3, 3, 11, var3);
      var10002 = class_1192.field_6144;
      float var27;
      var10004 = (var27 = var2.nextFloat() - 0.9F) == 0.0F?0:(var27 < 0.0F?-1:1);
      if(var4 != null) {
         var10004 = var10004 > 0?4:0;
      }

      this.method_6208(var1, var10002, var10 + var10004, 7, 3, 9, var3);
      var10002 = class_1192.field_6144;
      float var28;
      var10004 = (var28 = var2.nextFloat() - 0.9F) == 0.0F?0:(var28 < 0.0F?-1:1);
      if(var4 != null) {
         var10004 = var10004 > 0?4:0;
      }

      this.method_6208(var1, var10002, var10 + var10004, 7, 3, 10, var3);
      var10002 = class_1192.field_6144;
      float var29;
      var10004 = (var29 = var2.nextFloat() - 0.9F) == 0.0F?0:(var29 < 0.0F?-1:1);
      if(var4 != null) {
         var10004 = var10004 > 0?4:0;
      }

      this.method_6208(var1, var10002, var10 + var10004, 7, 3, 11, var3);
      boolean var16 = this.field_5884;
      if(var4 != null) {
         if(!this.field_5884) {
            int var11 = this.method_6205(3);
            int var12 = this.method_6204(5, 6);
            int var13 = this.method_6206(5, 6);
            var16 = var3.method_6487(var12, var11, var13);
            if(var4 == null) {
               return var16;
            }

            if(var16) {
               this.field_5884 = true;
               var16 = var1.method_2054(var12, var11, var13, class_1192.field_6079, 0, 2);
               if(var4 == null) {
                  return var16;
               }

               class_584 var14 = (class_584)var1.method_31(var12, var11, var13);
               if(var14 != null) {
                  class_982 var17 = var14.method_3123();
                  String[] var10001 = field_5886;
                  var17.method_5672("Silverfish");
               }
            }
         }

         var16 = true;
      }

      return var16;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "Áq·\nßw¹ g!Ìåm½ÏRf2c¼*ìe";
      int var4 = "Áq·\nßw¹ g!Ìåm½ÏRf2c¼*ìe".length();
      char var1 = 3;
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
                  field_5886 = var5;
                  String[] var10 = field_5886;
                  field_5885 = "CL_00000493";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 88;
               break;
            case 1:
               var10009 = 202;
               break;
            case 2:
               var10009 = 1;
               break;
            case 3:
               var10009 = 130;
               break;
            case 4:
               var10009 = 214;
               break;
            case 5:
               var10009 = 135;
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
