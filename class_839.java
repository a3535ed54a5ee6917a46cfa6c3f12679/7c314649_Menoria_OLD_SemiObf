import org.lwjgl.opengl.GL11;

// $FF: renamed from: oO
public class class_839 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3885;
   // $FF: renamed from: k bqx
   private static final bqx field_3886;
   // $FF: renamed from: l bqx
   private static final bqx field_3887;
   // $FF: renamed from: m bqx
   private static final bqx field_3888;
   // $FF: renamed from: n bqx
   private static final bqx field_3889;
   // $FF: renamed from: o bqx
   private static final bqx field_3890;
   // $FF: renamed from: p nj
   protected class_1213 field_3891;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      class_1213 var10001 = new class_1213;
      var10001.method_6525(0.0F);
      super.method_4798(var10001, 0.5F);
      this.field_3891 = (class_1213)this.field_3844;
   }

   // $FF: renamed from: b (wU, int, float) int
   protected int method_4872(class_768 var1, int var2, float var3) {
      return -1;
   }

   // $FF: renamed from: b (wU, double, double, double, float, float) void
   public void method_4873(class_768 var1, double var2, double var4, double var6, float var8, float var9) {
      super.method_4830(var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: b (wU) bqx
   protected bqx method_4874(class_768 var1) {
      switch(var1.method_4361()) {
      case 0:
         return field_3886;
      case 1:
         return field_3887;
      case 2:
         return field_3888;
      case 3:
         return field_3889;
      case 4:
         return field_3890;
      default:
         return field_3885;
      }
   }

   // $FF: renamed from: b (wU, float) void
   protected void method_4875(class_768 var1, float var2) {
      super.method_4807(var1, var2);
   }

   // $FF: renamed from: c (wU, float) void
   protected void method_4876(class_768 var1, float var2) {
      float var4;
      label17: {
         label16: {
            String[] var10000 = class_752.method_4253();
            var4 = 0.9375F;
            String[] var3 = var10000;
            if(var3 != null) {
               if(var1.method_4354() >= 0) {
                  break label16;
               }

               var4 = (float)((double)var4 * 0.5D);
               this.field_3790 = 0.25F;
            }

            if(var3 != null) {
               break label17;
            }
         }

         this.field_3790 = 0.5F;
      }

      GL11.glScalef(var4, var4, var4);
   }

   // $FF: renamed from: a (sv, float) void
   // $FF: synthetic method
   protected void method_4814(class_752 var1, float var2) {
      this.method_4876((class_768)var1, var2);
   }

   // $FF: renamed from: c (sv, float) void
   // $FF: synthetic method
   protected void method_4807(class_752 var1, float var2) {
      this.method_4875((class_768)var1, var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      // $FF: Couldn't be decompiled
   }
}
