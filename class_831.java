import org.lwjgl.opengl.GL11;

// $FF: renamed from: ow
public class class_831 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3864;
   // $FF: renamed from: k bqx
   private static final bqx field_3865;
   // $FF: renamed from: l bhr
   private bhr field_3866;
   // $FF: renamed from: m java.lang.String
   private static final String field_3867;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      class_1224 var10001 = new class_1224;
      var10001.method_6510();
      super.method_4798(var10001, 0.5F);
      var10001 = new class_1224;
      var10001.drawRect0(2.0F);
      this.field_3866 = var10001;
   }

   // $FF: renamed from: b (w3, float) void
   protected void method_4842(class_789 var1, float var2) {
      float var4;
      float var5;
      float var9;
      float var10001;
      label23: {
         String[] var10000 = class_752.method_4253();
         var4 = var1.method_4532(var2);
         String[] var3 = var10000;
         var5 = 1.0F + class_1715.method_9555(var4 * 100.0F) * var4 * 0.01F;
         float var10;
         int var8 = (var10 = var4 - 0.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
         if(var3 != null) {
            if(var8 < 0) {
               var4 = 0.0F;
            }

            var9 = var4;
            var10001 = 1.0F;
            if(var3 == null) {
               break label23;
            }

            float var11;
            var8 = (var11 = var4 - 1.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
         }

         if(var8 > 0) {
            var4 = 1.0F;
         }

         var4 *= var4;
         var4 *= var4;
         var9 = 1.0F + var4 * 0.4F;
         var10001 = var5;
      }

      float var6 = var9 * var10001;
      float var7 = (1.0F + var4 * 0.1F) / var5;
      GL11.glScalef(var6, var7, var6);
   }

   // $FF: renamed from: b (w3, float, float) int
   protected int method_4843(class_789 var1, float var2, float var3) {
      String[] var10000 = class_752.method_4253();
      float var5 = var1.method_4532(var3);
      String[] var4 = var10000;
      int var10 = (int)(var5 * 10.0F) % 2;
      if(var4 != null) {
         if(var10 == 0) {
            return 0;
         }

         var10 = (int)(var5 * 0.2F * 255.0F);
      }

      int var6 = var10;
      var10 = var6;
      if(var4 != null) {
         if(var6 < 0) {
            var6 = 0;
         }

         var10 = var6;
      }

      if(var4 != null) {
         if(var10 > 255) {
            var6 = 255;
         }

         var10 = 255;
      }

      int var7 = var10;
      short var8 = 255;
      short var9 = 255;
      return var6 << 24 | var7 << 16 | var8 << 8 | var9;
   }

   // $FF: renamed from: b (w3, int, float) int
   protected int method_4844(class_789 var1, int var2, float var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var1.method_4531();
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
                  this.method_4732(field_3864);
                  GL11.glMatrixMode(5890);
                  GL11.glLoadIdentity();
                  float var6 = var5 * 0.01F;
                  float var7 = var5 * 0.01F;
                  GL11.glTranslatef(var6, var7, 0.0F);
                  this.method_4799(this.field_3866);
                  GL11.glMatrixMode(5888);
                  GL11.glEnable(3042);
                  float var8 = 0.5F;
                  GL11.glColor4f(var8, var8, var8, 1.0F);
                  GL11.glDisable(2896);
                  GL11.glBlendFunc(1, 1);
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

   // $FF: renamed from: c (w3, int, float) int
   protected int method_4845(class_789 var1, int var2, float var3) {
      return -1;
   }

   // $FF: renamed from: b (w3) bqx
   protected bqx method_4846(class_789 var1) {
      return field_3865;
   }

   // $FF: renamed from: a (sv, float) void
   protected void method_4814(class_752 var1, float var2) {
      this.method_4842((class_789)var1, var2);
   }

   // $FF: renamed from: a (sv, float, float) int
   protected int method_4813(class_752 var1, float var2, float var3) {
      return this.method_4843((class_789)var1, var2, var3);
   }

   // $FF: renamed from: a (sv, int, float) int
   protected int method_4810(class_752 var1, int var2, float var3) {
      return this.method_4844((class_789)var1, var2, var3);
   }

   // $FF: renamed from: b (sv, int, float) int
   protected int method_4809(class_752 var1, int var2, float var3) {
      return this.method_4845((class_789)var1, var2, var3);
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4846((class_789)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var6 = new String[3];
      int var4 = 0;
      String var3 = "ÝL¦=rç®9Á8#êey7¥^í/c6¾Oç/\'²KûrÖn0²^îe#2¹\\)êey7¥^í/c6¾Oç/\'²KûrÖn0²^îeR#¥Vñr×},°";
      int var5 = "ÝL¦=rç®9Á8#êey7¥^í/c6¾Oç/\'²KûrÖn0²^îe#2¹\\)êey7¥^í/c6¾Oç/\'²KûrÖn0²^îeR#¥Vñr×},°".length();
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
                  field_3867 = "CL_00000985";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/creeper/creeper_armor.png");
                  field_3864 = var9;
                  var9 = new bqx;
                  var9.method_8227("textures/entity/creeper/creeper.png");
                  field_3865 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 237;
               break;
            case 1:
               var10009 = 115;
               break;
            case 2:
               var10009 = 138;
               break;
            case 3:
               var10009 = 126;
               break;
            case 4:
               var10009 = 49;
               break;
            case 5:
               var10009 = 164;
               break;
            default:
               var10009 = 72;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
