import org.lwjgl.opengl.GL11;

// $FF: renamed from: oQ
public class class_837 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3878;
   // $FF: renamed from: k bqx
   private static final bqx field_3879;
   // $FF: renamed from: l int
   private int field_3880;
   // $FF: renamed from: m java.lang.String
   private static final String field_3881;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      class_1212 var10001 = new class_1212;
      var10001.method_6510();
      super.method_4798(var10001, 1.0F);
      this.field_3880 = ((class_1212)this.field_3844).method_6523();
   }

   // $FF: renamed from: b (w1, double, double, double, float, float) void
   public void method_4862(class_791 var1, double var2, double var4, double var6, float var8, float var9) {
      GuiTextField9.method_7631(var1, true);
      String[] var10 = class_752.method_4253();
      int var11 = ((class_1212)this.field_3844).method_6523();
      if(var10 != null) {
         if(var11 != this.field_3880) {
            this.field_3880 = var11;
            class_1212 var10001 = new class_1212;
            var10001.method_6510();
            this.field_3844 = var10001;
         }

         super.method_4830(var1, var2, var4, var6, var8, var9);
      }

   }

   // $FF: renamed from: b (w1) bqx
   protected bqx method_4863(class_791 var1) {
      bqx var5;
      label35: {
         String[] var10000 = class_752.method_4253();
         int var3 = var1.method_4549();
         String[] var2 = var10000;
         int var4 = var3;
         if(var2 != null) {
            if(var3 <= 0) {
               break label35;
            }

            var4 = var3;
         }

         label21: {
            byte var10001 = 80;
            if(var2 != null) {
               if(var4 > 80) {
                  break label21;
               }

               var4 = var3 / 5 % 2;
               var10001 = 1;
            }

            if(var4 == var10001) {
               break label35;
            }
         }

         var5 = field_3878;
         return var5;
      }

      var5 = field_3879;
      return var5;
   }

   // $FF: renamed from: b (w1, float) void
   protected void method_4864(class_791 var1, float var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = var1.method_4549();
      String[] var3 = var10000;
      if(var4 > 0) {
         float var5 = 2.0F - ((float)var4 - var2) / 220.0F * 0.5F;
         GL11.glScalef(var5, var5, var5);
         if(var3 != null) {
            return;
         }
      }

      GL11.glScalef(2.0F, 2.0F, 2.0F);
   }

   // $FF: renamed from: b (w1, int, float) int
   protected int method_4865(class_791 var1, int var2, float var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var1.method_4553();
      if(var4 != null) {
         if(var10000 != 0) {
            label27: {
               boolean var9 = var1.method_3942();
               if(var4 != null) {
                  if(var9) {
                     GL11.glDepthMask(false);
                     if(var4 != null) {
                        break label27;
                     }
                  }

                  var9 = true;
               }

               GL11.glDepthMask(var9);
            }

            var10000 = var2;
            byte var10001 = 1;
            if(var4 != null) {
               if(var2 == 1) {
                  float var5 = (float)var1.field_3029 + var3;
                  this.method_4732(field_3878);
                  GL11.glMatrixMode(5890);
                  GL11.glLoadIdentity();
                  float var6 = class_1715.method_9556(var5 * 0.02F) * 3.0F;
                  float var7 = var5 * 0.01F;
                  GL11.glTranslatef(var6, var7, 0.0F);
                  this.method_4799(this.field_3844);
                  GL11.glMatrixMode(5888);
                  GL11.glEnable(3042);
                  float var8 = 0.5F;
                  GL11.glColor4f(var8, var8, var8, 1.0F);
                  GL11.glDisable(2896);
                  GL11.glBlendFunc(1, 1);
                  GL11.glTranslatef(0.0F, -0.01F, 0.0F);
                  GL11.glScalef(1.1F, 1.1F, 1.1F);
                  return 1;
               }

               var10000 = var2;
               if(var4 == null) {
                  return var10000;
               }

               var10001 = 2;
            }

            if(var10000 == var10001) {
               GL11.glMatrixMode(5890);
               GL11.glLoadIdentity();
               GL11.glMatrixMode(5888);
               GL11.glEnable(2896);
               GL11.glDisable(3042);
            }
         }

         var10000 = -1;
      }

      return var10000;
   }

   // $FF: renamed from: c (w1, int, float) int
   protected int method_4866(class_791 var1, int var2, float var3) {
      return -1;
   }

   // $FF: renamed from: a (sw, double, double, double, float, float) void
   public void method_4830(class_753 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4862((class_791)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: a (sv, float) void
   protected void method_4814(class_752 var1, float var2) {
      this.method_4864((class_791)var1, var2);
   }

   // $FF: renamed from: a (sv, int, float) int
   protected int method_4810(class_752 var1, int var2, float var3) {
      return this.method_4865((class_791)var1, var2, var3);
   }

   // $FF: renamed from: b (sv, int, float) int
   protected int method_4809(class_752 var1, int var2, float var3) {
      return this.method_4866((class_791)var1, var2, var3);
   }

   // $FF: renamed from: a (sv, double, double, double, float, float) void
   public void method_4801(class_752 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4862((class_791)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4863((class_791)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4862((class_791)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var6 = new String[3];
      int var4 = 0;
      String var3 = "eÍ²ñ×Æ±Þõ!RäµRU®¯I_®¨HT®¨HT¯¯.RäµRU®¯I_®¨HT®¨HTÞ¯UHä L\bñ¦";
      int var5 = "eÍ²ñ×Æ±Þõ!RäµRU®¯I_®¨HT®¨HT¯¯.RäµRU®¯I_®¨HT®¨HTÞ¯UHä L\bñ¦".length();
      char var2 = 11;
      int var1 = -1;

      while(true) {
         ++var1;
         String var10002 = var3.substring(var1, var1 + var2);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var11 = true;
         char[] var10 = var10003;
         char[] var10001 = (char[])var10004;
         int var7 = 0;

         while(true) {
            var10003 = var10;
            var10 = var10001;
            var10001 = var10003;
            char[] var12 = var10;
            var10 = var10003;
            if(var10003 <= var7) {
               var6[var4++] = (new String((char[])var11)).intern();
               if((var1 += var2) >= var5) {
                  field_3881 = "CL_00001034";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/wither/wither_invulnerable.png");
                  field_3878 = var9;
                  var9 = new bqx;
                  var9.method_8227("textures/entity/wither/wither.png");
                  field_3879 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 24;
               break;
            case 1:
               var10009 = 191;
               break;
            case 2:
               var10009 = 211;
               break;
            case 3:
               var10009 = 255;
               break;
            case 4:
               var10009 = 217;
               break;
            case 5:
               var10009 = 30;
               break;
            default:
               var10009 = 200;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
