
// $FF: renamed from: gU
public abstract class class_1089 {

   // $FF: renamed from: b float[]
   public static final float[] field_5730;
   // $FF: renamed from: c ahb
   public ahb field_5731;
   // $FF: renamed from: d du
   public class_1046 field_5732;
   // $FF: renamed from: e java.lang.String
   public String field_5733;
   // $FF: renamed from: f d0
   public class_958 field_5734;
   // $FF: renamed from: g boolean
   public boolean field_5735;
   // $FF: renamed from: h boolean
   public boolean field_5736;
   // $FF: renamed from: i float[]
   public float[] field_5737;
   // $FF: renamed from: j int
   public int field_5738;
   // $FF: renamed from: k float[]
   private float[] field_5739;
   // $FF: renamed from: l java.lang.String
   private static final String field_5740 = "CL_00000386";


   // $FF: renamed from: <init> () void
   public void method_6160() {
      super();
      this.field_5737 = new float[16];
      this.field_5739 = new float[4];
   }

   // $FF: renamed from: b (ahb) void
   public final void method_6161(ahb var1) {
      this.field_5731 = var1;
      this.field_5732 = var1.method_2195().method_6868();
      this.field_5733 = var1.method_2195().method_6870();
      this.method_6163();
      this.method_6162();
   }

   // $FF: renamed from: b () void
   protected void method_6162() {
      String[] var10000 = class_752.method_4253();
      float var2 = 0.0F;
      int var3 = 0;
      String[] var1 = var10000;

      while(var3 <= 15) {
         float var4 = 1.0F - (float)var3 / 15.0F;
         this.field_5737[var3] = (1.0F - var4) / (var4 * 3.0F + 1.0F) * (1.0F - var2) + var2;
         ++var3;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c () void
   protected void method_6163() {
      String[] var1 = class_752.method_4253();
      class_1089 var10000 = this;
      if(var1 != null) {
         if(this.field_5731.method_2195().method_6868() == class_1046.field_5528) {
            class_1198 var2 = class_1198.method_6444(this.field_5731.method_2195().method_6870());
            class_959 var10001 = new class_959;
            var10001.method_5548(class_985.method_5725(var2.method_6437()), 0.5F);
            this.field_5734 = var10001;
            if(var1 != null) {
               return;
            }
         }

         var10000 = this;
      }

      class_958 var3 = new class_958;
      var3.method_5535(this.field_5731);
      var10000.field_5734 = var3;
   }

   // $FF: renamed from: d () gG
   public class_25 method_6164() {
      Object var10000;
      if(this.field_5732 == class_1046.field_5528) {
         var10000 = new class_1148;
         ((class_1148)var10000).method_6337(this.field_5731, this.field_5731.method_2183(), this.field_5731.method_2195().method_6865(), this.field_5733);
      } else {
         var10000 = new class_1150;
         ((class_1150)var10000).method_6344(this.field_5731, this.field_5731.method_2183(), this.field_5731.method_2195().method_6865());
      }

      return (class_25)var10000;
   }

   // $FF: renamed from: b (int, int) boolean
   public boolean method_6165(int var1, int var2) {
      return this.field_5731.method_2047(var1, var2) == class_1192.field_6027;
   }

   // $FF: renamed from: b (long, float) float
   public float method_6166(long var1, float var3) {
      float var6;
      float var8;
      label23: {
         int var5 = (int)(var1 % 24000L);
         String[] var4 = class_752.method_4253();
         var6 = ((float)var5 + var3) / 24000.0F - 0.25F;
         float var9;
         int var10000 = (var9 = var6 - 0.0F) == 0.0F?0:(var9 < 0.0F?-1:1);
         if(var4 != null) {
            if(var10000 < 0) {
               ++var6;
            }

            var8 = var6;
            if(var4 == null) {
               break label23;
            }

            float var10;
            var10000 = (var10 = var6 - 1.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
         }

         if(var10000 > 0) {
            --var6;
         }

         var8 = var6;
      }

      float var7 = var8;
      var6 = 1.0F - (float)((Math.cos((double)var6 * 3.141592653589793D) + 1.0D) / 2.0D);
      var6 = var7 + (var6 - var7) / 3.0F;
      return var6;
   }

   // $FF: renamed from: b (long) int
   public int method_6167(long var1) {
      return (int)(var1 / 24000L % 8L + 8L) % 8;
   }

   // $FF: renamed from: e () boolean
   public boolean method_6168() {
      return true;
   }

   // $FF: renamed from: b (float, float) float[]
   public float[] method_6169(float var1, float var2) {
      float var10;
      float var10001;
      label26: {
         float var4 = 0.4F;
         float var5 = class_1715.method_9556(var1 * 3.1415927F * 2.0F) - 0.0F;
         String[] var10000 = class_752.method_4253();
         float var6 = -0.0F;
         String[] var3 = var10000;
         float var11;
         int var9 = (var11 = var5 - (var6 - var4)) == 0.0F?0:(var11 < 0.0F?-1:1);
         if(var3 != null) {
            if(var9 < 0) {
               return null;
            }

            var10 = var5;
            var10001 = var6 + var4;
            if(var3 == null) {
               break label26;
            }

            float var12;
            var9 = (var12 = var5 - var10001) == 0.0F?0:(var12 < 0.0F?-1:1);
         }

         if(var9 > 0) {
            return null;
         }

         var10 = (var5 - var6) / var4 * 0.5F;
         var10001 = 0.5F;
      }

      float var7 = var10 + var10001;
      float var8 = 1.0F - (1.0F - class_1715.method_9555(var7 * 3.1415927F)) * 0.99F;
      var8 *= var8;
      this.field_5739[0] = var7 * 0.3F + 0.7F;
      this.field_5739[1] = var7 * var7 * 0.7F + 0.2F;
      this.field_5739[2] = var7 * var7 * 0.0F + 0.2F;
      this.field_5739[3] = var8;
      return this.field_5739;
   }

   // $FF: renamed from: c (float, float) azw
   public azw method_6170(float var1, float var2) {
      float var4;
      float var9;
      label23: {
         String[] var10000 = class_752.method_4253();
         var4 = class_1715.method_9556(var1 * 3.1415927F * 2.0F) * 2.0F + 0.5F;
         String[] var3 = var10000;
         float var10;
         int var8 = (var10 = var4 - 0.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
         if(var3 != null) {
            if(var8 < 0) {
               var4 = 0.0F;
            }

            var9 = var4;
            if(var3 == null) {
               break label23;
            }

            float var11;
            var8 = (var11 = var4 - 1.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
         }

         if(var8 > 0) {
            var4 = 1.0F;
         }

         var9 = 0.7529412F;
      }

      float var5 = var9;
      float var6 = 0.84705883F;
      float var7 = 1.0F;
      var5 *= var4 * 0.94F + 0.06F;
      var6 *= var4 * 0.94F + 0.06F;
      var7 *= var4 * 0.91F + 0.09F;
      return azw.method_5086((double)var5, (double)var6, (double)var7);
   }

   // $FF: renamed from: f () boolean
   public boolean method_6171() {
      return true;
   }

   // $FF: renamed from: b (int) gU
   public static class_1089 method_6172(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0;
      Object var2;
      if(var1 != null) {
         if(var0 == -1) {
            var2 = new class_1092;
            ((class_1092)var2).method_6160();
            return (class_1089)var2;
         }

         var10000 = var0;
      }

      if(var1 != null) {
         if(var10000 == 0) {
            var2 = new class_1091;
            ((class_1091)var2).method_6160();
            return (class_1089)var2;
         }

         var10000 = var0;
      }

      if(var10000 == 1) {
         var2 = new class_1090;
         ((class_1090)var2).method_6160();
      } else {
         var2 = null;
      }

      return (class_1089)var2;
   }

   // $FF: renamed from: g () float
   public float method_6173() {
      return 128.0F;
   }

   // $FF: renamed from: h () boolean
   public boolean method_6174() {
      return true;
   }

   // $FF: renamed from: i () vF
   public class_1661 method_6175() {
      return null;
   }

   // $FF: renamed from: j () int
   public int method_6176() {
      return this.field_5732 == class_1046.field_5528?4:64;
   }

   // $FF: renamed from: k () boolean
   public boolean method_6177() {
      boolean var2;
      label24: {
         String[] var1 = class_752.method_4253();
         class_1089 var10000 = this;
         if(var1 != null) {
            if(this.field_5732 == class_1046.field_5528) {
               break label24;
            }

            var10000 = this;
         }

         var2 = var10000.field_5736;
         if(var1 == null) {
            return var2;
         }

         if(!var2) {
            var2 = true;
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   // $FF: renamed from: l () double
   public double method_6178() {
      return this.field_5732 == class_1046.field_5528?1.0D:0.03125D;
   }

   // $FF: renamed from: c (int, int) boolean
   public boolean method_6179(int var1, int var2) {
      return false;
   }

   // $FF: renamed from: m () java.lang.String
   public abstract String method_6180();

   // $FF: renamed from: <clinit> () void
   static void method_6181() {
      boolean var10000 = true;
      char[] var10003 = "¬ÅÅßô¢".toCharArray();
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
            field_5740 = (new String((char[])var4)).intern();
            String var2 = field_5740;
            field_5730 = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 178;
            break;
         case 1:
            var10009 = 154;
            break;
         case 2:
            var10009 = 199;
            break;
         case 3:
            var10009 = 118;
            break;
         case 4:
            var10009 = 168;
            break;
         case 5:
            var10009 = 231;
            break;
         default:
            var10009 = 98;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
