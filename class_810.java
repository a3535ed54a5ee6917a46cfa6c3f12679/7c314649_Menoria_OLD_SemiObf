import org.lwjgl.opengl.GL11;

// $FF: renamed from: oo
public class class_810 extends bno {

   // $FF: renamed from: g adb
   private adb field_3798;
   // $FF: renamed from: h int
   private int field_3799;
   // $FF: renamed from: i java.lang.String
   private static final String field_3800;
   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_3801;


   // $FF: renamed from: <init> (adb, int) void
   public void method_4749(adb var1, int var2) {
      super.method_4727();
      this.field_3798 = var1;
      this.field_3799 = var2;
   }

   // $FF: renamed from: <init> (adb) void
   public void method_4750(adb var1) {
      this.method_4749(var1, 0);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      String[] var10000 = class_752.method_4253();
      IIcon var11 = this.field_3798.getIconFromDamage(this.field_3799);
      String[] var10 = var10000;
      if(var10 != null) {
         if(var11 == null) {
            return;
         }

         GL11.glPushMatrix();
         GL11.glTranslatef((float)var2, (float)var4, (float)var6);
         GL11.glEnable('\u803a');
         GL11.glScalef(0.5F, 0.5F, 0.5F);
         this.method_4731(var1);
      }

      bmh var12 = bmh.instance;
      if(var10 != null) {
         String[] var17 = field_3801;
         if(var11 == class_550.getBlock33("bottle_splash")) {
            int var13 = class_1011.method_5760(((class_798)var1).method_4695(), false);
            float var14 = (float)(var13 >> 16 & 255) / 255.0F;
            float var15 = (float)(var13 >> 8 & 255) / 255.0F;
            float var16 = (float)(var13 & 255) / 255.0F;
            GL11.glColor3f(var14, var15, var16);
            GL11.glPushMatrix();
            this.method_4751(var12, class_550.getBlock33("overlay"));
            GL11.glPopMatrix();
            GL11.glColor3f(1.0F, 1.0F, 1.0F);
         }

         this.method_4751(var12, var11);
         GL11.glDisable('\u803a');
      }

      GL11.glPopMatrix();
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return bpz.field_7758;
   }

   // $FF: renamed from: b (bmh, vL) void
   private void method_4751(bmh var1, IIcon var2) {
      float var3 = var2.method_368();
      float var4 = var2.method_369();
      float var5 = var2.method_371();
      float var6 = var2.method_372();
      float var7 = 1.0F;
      float var8 = 0.5F;
      float var9 = 0.25F;
      GL11.glRotatef(180.0F - this.field_3788.field_7428, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-this.field_3788.field_7429, 1.0F, 0.0F, 0.0F);
      var1.setVisible2();
      var1.method_7466(0.0F, 1.0F, 0.0F);
      var1.addVertexWithUV((double)(0.0F - var8), (double)(0.0F - var9), 0.0D, (double)var3, (double)var6);
      var1.addVertexWithUV((double)(var7 - var8), (double)(0.0F - var9), 0.0D, (double)var4, (double)var6);
      var1.addVertexWithUV((double)(var7 - var8), (double)(var7 - var9), 0.0D, (double)var4, (double)var5);
      var1.addVertexWithUV((double)(0.0F - var8), (double)(var7 - var9), 0.0D, (double)var3, (double)var5);
      var1.getVisible8();
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "@Â¼Õ¯*×løó{é\rMÛ­Ó¯.ñ\\ÄµÆ°#";
      int var4 = "@Â¼Õ¯*×løó{é\rMÛ­Ó¯.ñ\\ÄµÆ°#".length();
      char var1 = 7;
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
                  field_3801 = var5;
                  String[] var10 = field_3801;
                  field_3800 = "CL_00001008";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 183;
               break;
            case 1:
               var10009 = 44;
               break;
            case 2:
               var10009 = 65;
               break;
            case 3:
               var10009 = 63;
               break;
            case 4:
               var10009 = 91;
               break;
            case 5:
               var10009 = 211;
               break;
            default:
               var10009 = 54;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
