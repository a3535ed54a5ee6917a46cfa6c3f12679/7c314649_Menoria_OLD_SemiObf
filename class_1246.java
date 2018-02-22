
// $FF: renamed from: m1
public class class_1246 extends class_1245 {

   // $FF: renamed from: <init> () void
   public void method_6510() {
      this.drawCenteredString0(0.0F);
   }

   // $FF: renamed from: <init> (float) void
   public void drawCenteredString0(float var1) {
      super.drawCenteredString1(var1, 0.0F, 64, 32);
      bix var10001 = new bix;
      var10001.method_6639(this, 40, 16);
      this.field_6463 = var10001;
      this.field_6463.method_6644(-1.0F, -2.0F, -1.0F, 2, 12, 2, var1);
      this.field_6463.method_6645(-5.0F, 2.0F, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 40, 16);
      this.field_6464 = var10001;
      this.field_6464.field_6553 = true;
      this.field_6464.method_6644(-1.0F, -2.0F, -1.0F, 2, 12, 2, var1);
      this.field_6464.method_6645(5.0F, 2.0F, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6465 = var10001;
      this.field_6465.method_6644(-1.0F, 0.0F, -1.0F, 2, 12, 2, var1);
      this.field_6465.method_6645(-2.0F, 12.0F, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6466 = var10001;
      this.field_6466.field_6553 = true;
      this.field_6466.method_6644(-1.0F, 0.0F, -1.0F, 2, 12, 2, var1);
      this.field_6466.method_6645(2.0F, 12.0F, 0.0F);
   }

   // $FF: renamed from: a (sv, float, float, float) void
   public void method_6513(class_752 var1, float var2, float var3, float var4) {
      String[] var5 = class_752.method_4253();
      int var10001 = ((class_786)var1).method_4529();
      if(var5 != null) {
         var10001 = var10001 == 1?1:0;
      }

      this.field_6472 = (boolean)var10001;
      super.method_6513(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      super.method_6512(var1, var2, var3, var4, var5, var6, var7);
   }
}
