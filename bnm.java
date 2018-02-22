import java.util.Random;
import org.lwjgl.opengl.GL11;

public class bnm extends class_827 {

   // $FF: renamed from: a bqx
   private static final bqx field_3943;
   // $FF: renamed from: f bqx
   private static final bqx field_3944;
   // $FF: renamed from: g mY
   private class_1244 field_3945;
   // $FF: renamed from: h java.util.Random
   private Random field_3946;
   private static final String __OBFID;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      class_1244 var10001 = new class_1244;
      var10001.method_6510();
      super.method_4798(var10001, 0.5F);
      this.field_3946 = new Random();
      this.field_3945 = (class_1244)super.field_3844;
      this.method_4799(this.field_3945);
   }

   // $FF: renamed from: a (ya, double, double, double, float, float) void
   public void method_4939(class_780 var1, double var2, double var4, double var6, float var8, float var9) {
      String[] var10 = class_752.method_4253();
      this.field_3945.field_6475 = var1.method_4507().method_2424() != awt.field_4170;
      this.field_3945.field_6476 = var1.method_4510();
      if(var10 != null) {
         if(var1.method_4510()) {
            double var11 = 0.02D;
            var2 += this.field_3946.nextGaussian() * var11;
            var6 += this.field_3946.nextGaussian() * var11;
         }

         super.method_4830(var1, var2, var4, var6, var8, var9);
      }

   }

   // $FF: renamed from: a (ya) bqx
   protected bqx method_4940(class_780 var1) {
      return field_3944;
   }

   // $FF: renamed from: a (ya, float) void
   protected void method_4941(class_780 var1, float var2) {
      String[] var10000 = class_752.method_4253();
      super.method_4807(var1, var2);
      String[] var3 = var10000;
      if(var3 != null) {
         if(var1.method_4507().method_2424() == awt.field_4170) {
            return;
         }

         GL11.glEnable('\u803a');
         GL11.glPushMatrix();
      }

      float var4 = 0.5F;
      GL11.glTranslatef(0.0F, 0.6875F, -0.75F);
      var4 *= 1.0F;
      GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
      GL11.glScalef(-var4, -var4, var4);
      int var5 = var1.method_3883(var2);
      int var6 = var5 % 65536;
      int var7 = var5 / 65536;
      buu.method_9080(buu.field_8557, (float)var6 / 1.0F, (float)var7 / 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.method_4732(bpz.field_7757);
      this.field_3789.drawTextBox6(var1.method_4507(), var1.method_4509(), 1.0F);
      GL11.glPopMatrix();
      GL11.glDisable('\u803a');
   }

   // $FF: renamed from: a (ya, int, float) int
   protected int method_4942(class_780 var1, int var2, float var3) {
      String[] var4 = class_752.method_4253();
      if(var4 != null) {
         if(var2 != 0) {
            return -1;
         }

         this.method_4732(field_3943);
      }

      float var5;
      label22: {
         var5 = 1.0F;
         GL11.glEnable(3042);
         GL11.glDisable(3008);
         GL11.glBlendFunc(1, 1);
         GL11.glDisable(2896);
         boolean var10000 = var1.method_3942();
         if(var4 != null) {
            if(var10000) {
               GL11.glDepthMask(false);
               if(var4 != null) {
                  break label22;
               }
            }

            var10000 = true;
         }

         GL11.glDepthMask(var10000);
      }

      char var6 = '\uf0f0';
      int var7 = var6 % 65536;
      int var8 = var6 / 65536;
      buu.method_9080(buu.field_8557, (float)var7 / 1.0F, (float)var8 / 1.0F);
      GL11.glEnable(2896);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, var5);
      return 1;
   }

   // $FF: renamed from: a (sw, double, double, double, float, float) void
   public void method_4830(class_753 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4939((class_780)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: a (sv, int, float) int
   protected int method_4810(class_752 var1, int var2, float var3) {
      return this.method_4942((class_780)var1, var2, var3);
   }

   // $FF: renamed from: c (sv, float) void
   protected void method_4807(class_752 var1, float var2) {
      this.method_4941((class_780)var1, var2);
   }

   // $FF: renamed from: a (sv, double, double, double, float, float) void
   public void method_4801(class_752 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4939((class_780)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4940((class_780)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4939((class_780)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var6 = new String[3];
      int var4 = 0;
      String var3 = "§îü¤¿ÍI ¤á¾¾ÖXª¤á¾®Ú^¾êêÿ¯ÑH¶ùé±¤àIªî÷þºÑKÇÛàúã²¼é%§îü¤¿ÍI ¤á¾¾ÖXª¤á¾®Ú^¾êêÿ¯ÑH¶ùé±¤\\½ì";
      int var5 = "§îü¤¿ÍI ¤á¾¾ÖXª¤á¾®Ú^¾êêÿ¯ÑH¶ùé±¤àIªî÷þºÑKÇÛàúã²¼é%§îü¤¿ÍI ¤á¾¾ÖXª¤á¾®Ú^¾êêÿ¯ÑH¶ùé±¤\\½ì".length();
      char var2 = 42;
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
                  __OBFID = "CL_00000989";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/enderman/enderman_eyes.png");
                  field_3943 = var9;
                  var9 = new bqx;
                  var9.method_8227("textures/entity/enderman/enderman.png");
                  field_3944 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 64;
               break;
            case 1:
               var10009 = 24;
               break;
            case 2:
               var10009 = 23;
               break;
            case 3:
               var10009 = 67;
               break;
            case 4:
               var10009 = 89;
               break;
            case 5:
               var10009 = 44;
               break;
            default:
               var10009 = 191;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
