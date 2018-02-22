import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.ImageObserver;

// $FF: renamed from: n0
public class class_1377 implements class_36 {

   // $FF: renamed from: b int[]
   private int[] field_7310;
   // $FF: renamed from: c int
   private int field_7311;
   // $FF: renamed from: d int
   private int field_7312;
   // $FF: renamed from: e java.lang.String
   private static final String field_7313 = "CL_00000956";


   // $FF: renamed from: <init> () void
   public void method_7514() {
      super();
   }

   // $FF: renamed from: b (java.awt.image.BufferedImage) java.awt.image.BufferedImage
   public BufferedImage method_161(BufferedImage var1) {
      String[] var2 = class_752.method_4253();
      BufferedImage var10000 = var1;
      if(var2 != null) {
         if(var1 == null) {
            return null;
         }

         this.field_7311 = 64;
         this.field_7312 = 32;
         var10000 = var1;
      }

      label53: {
         BufferedImage var3 = var10000;
         int var4 = var3.getWidth();
         int var5 = var3.getHeight();
         int var10 = var4;
         int var10001 = 64;
         if(var2 != null) {
            if(var4 == 64) {
               var10 = var5;
               var10001 = 32;
               if(var2 != null) {
                  if(var5 == 32) {
                     break label53;
                  }

                  var10 = var5;
                  var10001 = 64;
               }

               if(var2 != null) {
                  if(var10 == var10001) {
                     break label53;
                  }

                  var10 = this.field_7311;
                  var10001 = var4;
               }
            } else {
               var10 = this.field_7311;
               var10001 = var4;
            }
         }

         while(true) {
            class_1377 var11;
            label40: {
               if(var10 >= var10001) {
                  var11 = this;
                  if(var2 == null || var2 == null) {
                     break label40;
                  }

                  if(this.field_7312 >= var5) {
                     break;
                  }
               }

               this.field_7311 *= 2;
               var11 = this;
            }

            var11.field_7312 *= 2;
            if(var2 == null) {
               break;
            }

            var10 = this.field_7311;
            var10001 = var4;
         }
      }

      BufferedImage var6 = new BufferedImage(this.field_7311, this.field_7312, 2);
      Graphics var7 = var6.getGraphics();
      var7.drawImage(var1, 0, 0, (ImageObserver)null);
      var7.dispose();
      this.field_7310 = ((DataBufferInt)var6.getRaster().getDataBuffer()).getData();
      int var8 = this.field_7311;
      int var9 = this.field_7312;
      this.method_7516(0, 0, var8 / 2, var9 / 2);
      this.method_7515(var8 / 2, 0, var8, var9);
      this.method_7516(0, var9 / 2, var8, var9);
      return var6;
   }

   // $FF: renamed from: b () void
   public void method_162() {}

   // $FF: renamed from: b (int, int, int, int) void
   private void method_7515(int var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = this.method_7517(var1, var2, var3, var4);
      if(var5 != null) {
         if(var10000 != 0) {
            return;
         }

         var10000 = var1;
      }

      int var6 = var10000;

      while(var6 < var3) {
         int var7 = var2;

         while(true) {
            if(var7 < var4) {
               this.field_7310[var6 + var7 * this.field_7311] &= 16777215;
               ++var7;
               if(var5 == null) {
                  break;
               }

               if(var5 != null) {
                  continue;
               }
            }

            ++var6;
            break;
         }

         if(var5 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (int, int, int, int) void
   private void method_7516(int var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1;
      String[] var5 = var10000;

      while(var6 < var3) {
         int var7 = var2;

         while(true) {
            if(var7 < var4) {
               this.field_7310[var6 + var7 * this.field_7311] |= -16777216;
               ++var7;
               if(var5 == null) {
                  break;
               }

               if(var5 != null) {
                  continue;
               }
            }

            ++var6;
            break;
         }

         if(var5 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d (int, int, int, int) boolean
   private boolean method_7517(int var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1;
      String[] var5 = var10000;

      label42:
      while(true) {
         int var9 = var6;
         int var10001 = var3;

         label39:
         while(var9 < var10001) {
            var9 = var2;
            if(var5 == null) {
               return (boolean)var9;
            }

            int var7 = var2;

            while(var7 < var4) {
               int var8 = this.field_7310[var6 + var7 * this.field_7311];
               if(var5 != null) {
                  var9 = var8 >> 24 & 255;
                  var10001 = 128;
                  if(var5 == null) {
                     continue label39;
                  }

                  if(var9 < 128) {
                     return true;
                  }

                  ++var7;
               }

               if(var5 == null) {
                  break;
               }
            }

            ++var6;
            if(var5 != null) {
               continue label42;
            }
            break;
         }

         var9 = 0;
         return (boolean)var9;
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_7518() {
      boolean var10000 = true;
      char[] var10003 = "b<ÁâpV".toCharArray();
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
            field_7313 = (new String((char[])var4)).intern();
            String var2 = field_7313;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 20;
            break;
         case 1:
            var10009 = 122;
            break;
         case 2:
            var10009 = 55;
            break;
         case 3:
            var10009 = 229;
            break;
         case 4:
            var10009 = 165;
            break;
         case 5:
            var10009 = 134;
            break;
         default:
            var10009 = 117;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
