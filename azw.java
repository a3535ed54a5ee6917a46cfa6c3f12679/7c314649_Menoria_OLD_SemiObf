
public class azw {

   // $FF: renamed from: a double
   public double field_4220;
   // $FF: renamed from: b double
   public double field_4221;
   // $FF: renamed from: c double
   public double field_4222;
   // $FF: renamed from: h java.lang.String
   private static final String field_4223 = ", ";


   // $FF: renamed from: a (double, double, double) azw
   public static azw method_5086(double var0, double var2, double var4) {
      azw var10000 = new azw;
      var10000.method_5087(var0, var2, var4);
      return var10000;
   }

   // $FF: renamed from: <init> (double, double, double) void
   protected void method_5087(double var1, double var3, double var5) {
      super();
      if(var1 == -0.0D) {
         var1 = 0.0D;
      }

      if(var3 == -0.0D) {
         var3 = 0.0D;
      }

      if(var5 == -0.0D) {
         var5 = 0.0D;
      }

      this.field_4220 = var1;
      this.field_4221 = var3;
      this.field_4222 = var5;
   }

   // $FF: renamed from: b (double, double, double) azw
   protected azw method_5088(double var1, double var3, double var5) {
      this.field_4220 = var1;
      this.field_4221 = var3;
      this.field_4222 = var5;
      return this;
   }

   // $FF: renamed from: a (azw) azw
   public azw method_5089(azw var1) {
      return method_5086(var1.field_4220 - this.field_4220, var1.field_4221 - this.field_4221, var1.field_4222 - this.field_4222);
   }

   // $FF: renamed from: a () azw
   public azw method_5090() {
      double var1 = (double)class_1715.method_9558(this.field_4220 * this.field_4220 + this.field_4221 * this.field_4221 + this.field_4222 * this.field_4222);
      return var1 < 1.0E-4D?method_5086(0.0D, 0.0D, 0.0D):method_5086(this.field_4220 / var1, this.field_4221 / var1, this.field_4222 / var1);
   }

   // $FF: renamed from: b (azw) double
   public double method_5091(azw var1) {
      return this.field_4220 * var1.field_4220 + this.field_4221 * var1.field_4221 + this.field_4222 * var1.field_4222;
   }

   // $FF: renamed from: c (azw) azw
   public azw method_5092(azw var1) {
      return method_5086(this.field_4221 * var1.field_4222 - this.field_4222 * var1.field_4221, this.field_4222 * var1.field_4220 - this.field_4220 * var1.field_4222, this.field_4220 * var1.field_4221 - this.field_4221 * var1.field_4220);
   }

   // $FF: renamed from: c (double, double, double) azw
   public azw method_5093(double var1, double var3, double var5) {
      return method_5086(this.field_4220 + var1, this.field_4221 + var3, this.field_4222 + var5);
   }

   // $FF: renamed from: d (azw) double
   public double method_5094(azw var1) {
      double var2 = var1.field_4220 - this.field_4220;
      double var4 = var1.field_4221 - this.field_4221;
      double var6 = var1.field_4222 - this.field_4222;
      return (double)class_1715.method_9558(var2 * var2 + var4 * var4 + var6 * var6);
   }

   // $FF: renamed from: e (azw) double
   public double method_5095(azw var1) {
      double var2 = var1.field_4220 - this.field_4220;
      double var4 = var1.field_4221 - this.field_4221;
      double var6 = var1.field_4222 - this.field_4222;
      return var2 * var2 + var4 * var4 + var6 * var6;
   }

   // $FF: renamed from: d (double, double, double) double
   public double method_5096(double var1, double var3, double var5) {
      double var7 = var1 - this.field_4220;
      double var9 = var3 - this.field_4221;
      double var11 = var5 - this.field_4222;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   // $FF: renamed from: b () double
   public double method_5097() {
      return (double)class_1715.method_9558(this.field_4220 * this.field_4220 + this.field_4221 * this.field_4221 + this.field_4222 * this.field_4222);
   }

   // $FF: renamed from: b (azw, double) azw
   public azw method_5098(azw var1, double var2) {
      double var5 = var1.field_4220 - this.field_4220;
      String[] var4 = class_752.method_4253();
      double var7 = var1.field_4221 - this.field_4221;
      double var9 = var1.field_4222 - this.field_4222;
      double var10000 = var5 * var5;
      double var10001 = 1.0000000116860974E-7D;
      if(var4 != null) {
         if(var10000 < 1.0000000116860974E-7D) {
            return null;
         }

         var10000 = var2 - this.field_4220;
         var10001 = var5;
      }

      double var11 = var10000 / var10001;
      double var14;
      int var13 = (var14 = var11 - 0.0D) == 0.0D?0:(var14 < 0.0D?-1:1);
      if(var4 != null) {
         if(var13 < 0) {
            return null;
         }

         var10000 = var11;
         var10001 = 1.0D;
         if(var4 == null) {
            return method_5086(var10000, var10001, this.field_4222 + var9 * var11);
         }

         double var15;
         var13 = (var15 = var11 - 1.0D) == 0.0D?0:(var15 < 0.0D?-1:1);
      }

      if(var13 > 0) {
         return null;
      } else {
         var10000 = this.field_4220 + var5 * var11;
         var10001 = this.field_4221 + var7 * var11;
         return method_5086(var10000, var10001, this.field_4222 + var9 * var11);
      }
   }

   // $FF: renamed from: c (azw, double) azw
   public azw method_5099(azw var1, double var2) {
      double var5 = var1.field_4220 - this.field_4220;
      String[] var10000 = class_752.method_4253();
      double var7 = var1.field_4221 - this.field_4221;
      String[] var4 = var10000;
      double var9 = var1.field_4222 - this.field_4222;
      double var13 = var7 * var7;
      double var10001 = 1.0000000116860974E-7D;
      if(var4 != null) {
         if(var13 < 1.0000000116860974E-7D) {
            return null;
         }

         var13 = var2 - this.field_4221;
         var10001 = var7;
      }

      double var11 = var13 / var10001;
      double var15;
      int var14 = (var15 = var11 - 0.0D) == 0.0D?0:(var15 < 0.0D?-1:1);
      if(var4 != null) {
         if(var14 < 0) {
            return null;
         }

         var13 = var11;
         var10001 = 1.0D;
         if(var4 == null) {
            return method_5086(var13, var10001, this.field_4222 + var9 * var11);
         }

         double var16;
         var14 = (var16 = var11 - 1.0D) == 0.0D?0:(var16 < 0.0D?-1:1);
      }

      if(var14 > 0) {
         return null;
      } else {
         var13 = this.field_4220 + var5 * var11;
         var10001 = this.field_4221 + var7 * var11;
         return method_5086(var13, var10001, this.field_4222 + var9 * var11);
      }
   }

   // $FF: renamed from: d (azw, double) azw
   public azw method_5100(azw var1, double var2) {
      String[] var10000 = class_752.method_4253();
      double var5 = var1.field_4220 - this.field_4220;
      String[] var4 = var10000;
      double var7 = var1.field_4221 - this.field_4221;
      double var9 = var1.field_4222 - this.field_4222;
      double var13 = var9 * var9;
      double var10001 = 1.0000000116860974E-7D;
      if(var4 != null) {
         if(var13 < 1.0000000116860974E-7D) {
            return null;
         }

         var13 = var2 - this.field_4222;
         var10001 = var9;
      }

      double var11 = var13 / var10001;
      double var15;
      int var14 = (var15 = var11 - 0.0D) == 0.0D?0:(var15 < 0.0D?-1:1);
      if(var4 != null) {
         if(var14 < 0) {
            return null;
         }

         var13 = var11;
         var10001 = 1.0D;
         if(var4 == null) {
            return method_5086(var13, var10001, this.field_4222 + var9 * var11);
         }

         double var16;
         var14 = (var16 = var11 - 1.0D) == 0.0D?0:(var16 < 0.0D?-1:1);
      }

      if(var14 > 0) {
         return null;
      } else {
         var13 = this.field_4220 + var5 * var11;
         var10001 = this.field_4221 + var7 * var11;
         return method_5086(var13, var10001, this.field_4222 + var9 * var11);
      }
   }

   public String toString() {
      return "(" + this.field_4220 + ", " + this.field_4221 + ", " + this.field_4222 + ")";
   }

   // $FF: renamed from: a (float) void
   public void method_5101(float var1) {
      float var2 = class_1715.method_9556(var1);
      float var3 = class_1715.method_9555(var1);
      double var4 = this.field_4220;
      double var6 = this.field_4221 * (double)var2 + this.field_4222 * (double)var3;
      double var8 = this.field_4222 * (double)var2 - this.field_4221 * (double)var3;
      this.method_5088(var4, var6, var8);
   }

   // $FF: renamed from: b (float) void
   public void method_5102(float var1) {
      float var2 = class_1715.method_9556(var1);
      float var3 = class_1715.method_9555(var1);
      double var4 = this.field_4220 * (double)var2 + this.field_4222 * (double)var3;
      double var6 = this.field_4221;
      double var8 = this.field_4222 * (double)var2 - this.field_4220 * (double)var3;
      this.method_5088(var4, var6, var8);
   }

   // $FF: renamed from: c (float) void
   public void method_5103(float var1) {
      float var2 = class_1715.method_9556(var1);
      float var3 = class_1715.method_9555(var1);
      double var4 = this.field_4220 * (double)var2 + this.field_4221 * (double)var3;
      double var6 = this.field_4221 * (double)var2 - this.field_4220 * (double)var3;
      double var8 = this.field_4222;
      this.method_5088(var4, var6, var8);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5104() {
      boolean var10000 = true;
      char[] var10003 = "ç".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_4223 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 84;
            break;
         case 1:
            var10009 = 171;
            break;
         case 2:
            var10009 = 43;
            break;
         case 3:
            var10009 = 224;
            break;
         case 4:
            var10009 = 111;
            break;
         case 5:
            var10009 = 140;
            break;
         default:
            var10009 = 225;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
