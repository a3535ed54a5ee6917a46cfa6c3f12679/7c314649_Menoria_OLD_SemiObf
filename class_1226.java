
// $FF: renamed from: mS
public class class_1226 extends bhr {

   // $FF: renamed from: b bix
   public bix field_6369;
   // $FF: renamed from: c bix
   public bix field_6370;
   // $FF: renamed from: d bix
   public bix field_6371;


   // $FF: renamed from: <init> () void
   public void method_6510() {
      super.method_6510();
      bix var10001 = new bix;
      var10001.method_6639(this, 0, 0);
      this.field_6369 = var10001.method_6650(64, 64);
      this.field_6369.method_6644(0.0F, -5.0F, -14.0F, 14, 5, 14, 0.0F);
      this.field_6369.field_6545 = 1.0F;
      this.field_6369.field_6546 = 7.0F;
      this.field_6369.field_6547 = 15.0F;
      var10001 = new bix;
      var10001.method_6639(this, 0, 0);
      this.field_6371 = var10001.method_6650(64, 64);
      this.field_6371.method_6644(-1.0F, -2.0F, -15.0F, 2, 4, 1, 0.0F);
      this.field_6371.field_6545 = 8.0F;
      this.field_6371.field_6546 = 7.0F;
      this.field_6371.field_6547 = 15.0F;
      var10001 = new bix;
      var10001.method_6639(this, 0, 19);
      this.field_6370 = var10001.method_6650(64, 64);
      this.field_6370.method_6644(0.0F, 0.0F, 0.0F, 14, 10, 14, 0.0F);
      this.field_6370.field_6545 = 1.0F;
      this.field_6370.field_6546 = 6.0F;
      this.field_6370.field_6547 = 1.0F;
   }

   // $FF: renamed from: b () void
   public void drawRect3() {
      this.field_6371.field_6548 = this.field_6369.field_6548;
      this.field_6369.method_6646(0.0625F);
      this.field_6371.method_6646(0.0625F);
      this.field_6370.method_6646(0.0625F);
   }
}
