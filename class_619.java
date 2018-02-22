import org.lwjgl.opengl.GL11;

// $FF: renamed from: n9
public class class_619 extends class_614 {

   // $FF: renamed from: <init> () void
   public void method_3391() {
      super.method_3391();
   }

   // $FF: renamed from: b (gw, double, double, double, float) void
   public void method_3407(class_584 var1, double var2, double var4, double var6, float var8) {
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var2 + 0.5F, (float)var4, (float)var6 + 0.5F);
      method_3408(var1.method_3123(), var2, var4, var6, var8);
      GL11.glPopMatrix();
   }

   // $FF: renamed from: b (c_, double, double, double, float) void
   public static void method_3408(class_982 var0, double var1, double var3, double var5, float var7) {
      class_689 var9 = var0.method_5679();
      String[] var8 = class_752.method_4253();
      class_689 var10000 = var9;
      if(var8 != null) {
         if(var9 == null) {
            return;
         }

         var10000 = var9;
      }

      var10000.method_3885(var0.method_5684());
      float var10 = 0.4375F;
      GL11.glTranslatef(0.0F, 0.4F, 0.0F);
      GL11.glRotatef((float)(var0.field_4958 + (var0.field_4957 - var0.field_4958) * (double)var7) * 10.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-30.0F, 1.0F, 0.0F, 0.0F);
      GL11.glTranslatef(0.0F, -0.4F, 0.0F);
      GL11.glScalef(var10, var10, var10);
      var9.method_3887(var1, var3, var5, 0.0F, 0.0F);
      bnn.field_7418.method_7622(var9, 0.0D, 0.0D, 0.0D, 0.0F, var7);
   }
}
