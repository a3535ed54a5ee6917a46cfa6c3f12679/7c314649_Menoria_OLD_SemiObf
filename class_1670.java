
// $FF: renamed from: vK
public class class_1670 implements IIcon {

   // $FF: renamed from: b vL
   private final IIcon field_8705;
   // $FF: renamed from: c boolean
   private final boolean field_8706;
   // $FF: renamed from: d boolean
   private final boolean field_8707;


   // $FF: renamed from: <init> (vL, boolean, boolean) void
   public void method_9214(IIcon var1, boolean var2, boolean var3) {
      super();
      this.field_8705 = var1;
      this.field_8706 = var2;
      this.field_8707 = var3;
   }

   // $FF: renamed from: a () int
   public int method_366() {
      return this.field_8705.method_366();
   }

   // $FF: renamed from: b () int
   public int method_367() {
      return this.field_8705.method_367();
   }

   // $FF: renamed from: c () float
   public float method_368() {
      String[] var1 = class_752.method_4253();
      Object var10000 = this;
      if(var1 != null) {
         if(this.field_8706) {
            return this.field_8705.method_369();
         }

         var10000 = this.field_8705;
      }

      return ((IIcon)var10000).method_368();
   }

   // $FF: renamed from: d () float
   public float method_369() {
      String[] var1 = class_752.method_4253();
      Object var10000 = this;
      if(var1 != null) {
         if(this.field_8706) {
            return this.field_8705.method_368();
         }

         var10000 = this.field_8705;
      }

      return ((IIcon)var10000).method_369();
   }

   // $FF: renamed from: a (double) float
   public float method_370(double var1) {
      float var3 = this.method_369() - this.method_368();
      return this.method_368() + var3 * ((float)var1 / 16.0F);
   }

   // $FF: renamed from: e () float
   public float method_371() {
      String[] var1 = class_752.method_4253();
      Object var10000 = this;
      if(var1 != null) {
         if(this.field_8707) {
            return this.field_8705.method_371();
         }

         var10000 = this.field_8705;
      }

      return ((IIcon)var10000).method_371();
   }

   // $FF: renamed from: f () float
   public float method_372() {
      String[] var1 = class_752.method_4253();
      Object var10000 = this;
      if(var1 != null) {
         if(this.field_8707) {
            return this.field_8705.method_371();
         }

         var10000 = this.field_8705;
      }

      return ((IIcon)var10000).method_372();
   }

   // $FF: renamed from: b (double) float
   public float method_373(double var1) {
      float var3 = this.method_372() - this.method_371();
      return this.method_371() + var3 * ((float)var1 / 16.0F);
   }

   // $FF: renamed from: g () java.lang.String
   public String method_374() {
      return this.field_8705.method_374();
   }
}
