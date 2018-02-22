
// $FF: renamed from: ne
public class class_1219 extends bhr {

   // $FF: renamed from: b bix
   bix field_6336;
   // $FF: renamed from: c bix
   bix field_6337;
   // $FF: renamed from: d bix
   bix field_6338;
   // $FF: renamed from: e bix
   bix field_6339;


   // $FF: renamed from: <init> (int) void
   public void method_6535(int var1) {
      super.method_6510();
      bix var10001 = new bix;
      var10001.method_6639(this, 0, var1);
      this.field_6336 = var10001;
      this.field_6336.method_6643(-4.0F, 16.0F, -4.0F, 8, 8, 8);
      if(var1 > 0) {
         var10001 = new bix;
         var10001.method_6639(this, 0, var1);
         this.field_6336 = var10001;
         this.field_6336.method_6643(-3.0F, 17.0F, -3.0F, 6, 6, 6);
         var10001 = new bix;
         var10001.method_6639(this, 32, 0);
         this.field_6337 = var10001;
         this.field_6337.method_6643(-3.25F, 18.0F, -3.5F, 2, 2, 2);
         var10001 = new bix;
         var10001.method_6639(this, 32, 4);
         this.field_6338 = var10001;
         this.field_6338.method_6643(1.25F, 18.0F, -3.5F, 2, 2, 2);
         var10001 = new bix;
         var10001.method_6639(this, 32, 8);
         this.field_6339 = var10001;
         this.field_6339.method_6643(0.0F, 21.0F, -3.5F, 1, 1, 1);
      }

   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      String[] var10000 = class_752.method_4253();
      this.method_6512(var2, var3, var4, var5, var6, var7, var1);
      String[] var8 = var10000;
      this.field_6336.method_6646(var7);
      bix var9 = this.field_6337;
      if(var8 != null) {
         if(this.field_6337 == null) {
            return;
         }

         this.field_6337.method_6646(var7);
         this.field_6338.method_6646(var7);
         var9 = this.field_6339;
      }

      var9.method_6646(var7);
   }
}
