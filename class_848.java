import org.lwjgl.opengl.GL11;

// $FF: renamed from: oF
public class class_848 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3910;
   // $FF: renamed from: k bqx
   private static final bqx field_3911;
   // $FF: renamed from: l bqx
   private static final bqx field_3912;
   // $FF: renamed from: m bqx
   private static final bqx field_3913;


   // $FF: renamed from: <init> (bhr, float) void
   public void method_4798(bhr var1, float var2) {
      super.method_4798(var1, var2);
   }

   // $FF: renamed from: b (wM, double, double, double, float, float) void
   public void method_4906(class_778 var1, double var2, double var4, double var6, float var8, float var9) {
      super.method_4830(var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: b (wM) bqx
   protected bqx method_4907(class_778 var1) {
      switch(var1.method_4499()) {
      case 0:
      default:
         return field_3911;
      case 1:
         return field_3910;
      case 2:
         return field_3912;
      case 3:
         return field_3913;
      }
   }

   // $FF: renamed from: b (wM, float) void
   protected void method_4908(class_778 var1, float var2) {
      super.method_4814(var1, var2);
      if(var1.method_4476()) {
         GL11.glScalef(0.8F, 0.8F, 0.8F);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      // $FF: Couldn't be decompiled
   }
}
