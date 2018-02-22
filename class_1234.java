
// $FF: renamed from: m_
public class class_1234 extends class_1232 {

   // $FF: renamed from: k float
   private float field_6402;


   // $FF: renamed from: <init> () void
   public void method_6510() {
      super.drawGradientRect0(12, 0.0F);
      bix var10001 = new bix;
      var10001.method_6639(this, 0, 0);
      this.field_6392 = var10001;
      this.field_6392.method_6644(-3.0F, -4.0F, -4.0F, 6, 6, 6, 0.6F);
      this.field_6392.method_6645(0.0F, 6.0F, -8.0F);
      var10001 = new bix;
      var10001.method_6639(this, 28, 8);
      this.field_6393 = var10001;
      this.field_6393.method_6644(-4.0F, -10.0F, -7.0F, 8, 16, 6, 1.75F);
      this.field_6393.method_6645(0.0F, 5.0F, 2.0F);
      float var1 = 0.5F;
      var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6394 = var10001;
      this.field_6394.method_6644(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.field_6394.method_6645(-3.0F, 12.0F, 7.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6395 = var10001;
      this.field_6395.method_6644(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.field_6395.method_6645(3.0F, 12.0F, 7.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6396 = var10001;
      this.field_6396.method_6644(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.field_6396.method_6645(-3.0F, 12.0F, -5.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6397 = var10001;
      this.field_6397.method_6644(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.field_6397.method_6645(3.0F, 12.0F, -5.0F);
   }

   // $FF: renamed from: a (sv, float, float, float) void
   public void method_6513(class_752 var1, float var2, float var3, float var4) {
      super.method_6513(var1, var2, var3, var4);
      this.field_6392.field_6546 = 6.0F + ((class_770)var1).method_4385(var4) * 9.0F;
      this.field_6402 = ((class_770)var1).method_4386(var4);
   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      super.method_6512(var1, var2, var3, var4, var5, var6, var7);
      this.field_6392.field_6548 = this.field_6402;
   }
}
