
// $FF: renamed from: dZ
public class class_1030 extends class_1029 {

   // $FF: renamed from: a hb
   protected class_1151 field_5458;


   // $FF: renamed from: <init> () void
   public void method_5827() {
      super.method_5827();
      class_1179 var10001 = new class_1179;
      var10001.method_6399(class_1192.field_6145);
      this.field_5458 = var10001;
   }

   // $FF: renamed from: b (dz) void
   protected void method_5829(class_985 var1) {
      this.method_5832();
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_5417.nextInt(5);
      if(var2 != null) {
         if(var10000 == 0) {
            int var3 = this.field_5418 + this.field_5417.nextInt(16) + 8;
            int var4 = this.field_5419 + this.field_5417.nextInt(16) + 8;
            int var5 = this.field_5416.method_2108(var3, var4);
            this.field_5458.method_6351(this.field_5416, this.field_5417, var3, var5, var4);
         }

         var10000 = this.field_5418;
      }

      if(var2 != null) {
         if(var10000 != 0) {
            return;
         }

         var10000 = this.field_5419;
      }

      if(var10000 == 0) {
         class_758 var7 = new class_758;
         var7.method_3847(this.field_5416);
         class_758 var6 = var7;
         var6.method_3887(0.0D, 128.0D, 0.0D, this.field_5417.nextFloat() * 360.0F, 0.0F);
         this.field_5416.method_2089(var6);
      }

   }
}
