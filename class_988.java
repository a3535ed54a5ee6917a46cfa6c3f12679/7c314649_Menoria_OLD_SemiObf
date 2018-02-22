import java.util.List;
import java.util.Random;

// $FF: renamed from: dS
public class class_988 extends class_985 {

   // $FF: renamed from: aF java.lang.String
   private static final String field_5065 = "CL_00000185";


   // $FF: renamed from: <init> (int) void
   protected void method_5691(int var1) {
      super.method_5691(var1);
      this.field_5043.field_5444 = 2;
      this.field_5043.field_5445 = 1;
      this.field_5043.field_5447 = 1;
      this.field_5043.field_5448 = 8;
      this.field_5043.field_5449 = 10;
      this.field_5043.field_5453 = 1;
      this.field_5043.field_5443 = 4;
      this.field_5043.field_5452 = 0;
      this.field_5043.field_5451 = 0;
      this.field_5043.field_5446 = 5;
      this.field_5042 = 14745518;
      List var10000 = this.field_5044;
      class_1653 var10001 = new class_1653;
      var10001.method_9099(class_754.class, 1, 1, 1);
      var10000.add(var10001);
   }

   // $FF: renamed from: b (java.util.Random) hd
   public class_1162 method_5696(Random var1) {
      return this.field_5053;
   }

   // $FF: renamed from: c (int, int, int) int
   public int method_5715(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      double var5 = field_5029.method_6900((double)var1 * 0.0225D, (double)var3 * 0.0225D);
      String[] var4 = var10000;
      double var8;
      int var7 = (var8 = var5 - -0.1D) == 0.0D?0:(var8 < 0.0D?-1:1);
      if(var4 != null) {
         var7 = var7 < 0?5011004:6975545;
      }

      return var7;
   }

   // $FF: renamed from: d (int, int, int) int
   public int method_5716(int var1, int var2, int var3) {
      return 6975545;
   }

   // $FF: renamed from: b (java.util.Random, int, int, int) java.lang.String
   public String method_5698(Random var1, int var2, int var3, int var4) {
      return class_447.field_2190[1];
   }

   // $FF: renamed from: b (ahb, java.util.Random, aji[], byte[], int, int, double) void
   public void method_5718(ahb var1, Random var2, aji[] var3, byte[] var4, int var5, int var6, double var7) {
      String[] var10000 = class_752.method_4253();
      double var10 = field_5029.method_6900((double)var5 * 0.25D, (double)var6 * 0.25D);
      String[] var9 = var10000;
      if(var9 != null) {
         if(var10 > 0.0D) {
            int var12 = var5 & 15;
            int var13 = var6 & 15;
            int var14 = var3.length / 256;
            int var15 = 255;

            while(var15 >= 0) {
               int var16 = (var13 * 16 + var12) * var14 + var15;
               if(var9 == null) {
                  return;
               }

               label57: {
                  label46: {
                     aji var17 = var3[var16];
                     if(var9 != null) {
                        if(var17 == null) {
                           break label46;
                        }

                        var17 = var3[var16];
                     }

                     if(var17.method_2424() == awt.field_4170) {
                        break label57;
                     }
                  }

                  if(var15 != 62) {
                     break;
                  }

                  aji[] var18 = var3;
                  int var10001 = var16;
                  if(var9 != null) {
                     if(var3[var16] == class_1192.field_6034) {
                        break;
                     }

                     var18 = var3;
                     var10001 = var16;
                  }

                  var18[var10001] = class_1192.field_6034;
                  if(var9 == null) {
                     return;
                  }

                  if(var10 >= 0.12D) {
                     break;
                  }

                  var3[var16 + 1] = class_1192.field_6136;
                  if(var9 != null) {
                     break;
                  }
               }

               --var15;
               if(var9 == null) {
                  break;
               }
            }
         }

         this.method_5719(var1, var2, var3, var4, var5, var6, var7);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_5726() {
      boolean var10000 = true;
      char[] var10003 = "÷aóÇå`ö".toCharArray();
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
            field_5065 = (new String((char[])var4)).intern();
            String var2 = field_5065;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 80;
            break;
         case 1:
            var10009 = 201;
            break;
         case 2:
            var10009 = 188;
            break;
         case 3:
            var10009 = 39;
            break;
         case 4:
            var10009 = 19;
            break;
         case 5:
            var10009 = 206;
            break;
         default:
            var10009 = 49;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
