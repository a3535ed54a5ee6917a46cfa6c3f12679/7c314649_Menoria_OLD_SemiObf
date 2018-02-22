
// $FF: renamed from: m2
public class class_1241 extends bhr {

   // $FF: renamed from: b bix[]
   bix[] field_6458;
   // $FF: renamed from: c bix
   bix field_6459;


   // $FF: renamed from: <init> () void
   public void method_6510() {
      super.method_6510();
      this.field_6458 = new bix[8];

      for(int var1 = 0; var1 < this.field_6458.length; ++var1) {
         byte var2 = 0;
         int var3 = var1;
         if(var1 == 2) {
            var2 = 24;
            var3 = 10;
         } else if(var1 == 3) {
            var2 = 24;
            var3 = 19;
         }

         bix[] var10000 = this.field_6458;
         bix var10002 = new bix;
         var10002.method_6639(this, var2, var3);
         var10000[var1] = var10002;
         this.field_6458[var1].method_6643(-4.0F, (float)(16 + var1), -4.0F, 8, 1, 8);
      }

      bix var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6459 = var10001;
      this.field_6459.method_6643(-2.0F, 18.0F, -2.0F, 4, 4, 4);
   }

   // $FF: renamed from: a (sv, float, float, float) void
   public void method_6513(class_752 var1, float var2, float var3, float var4) {
      class_755 var6 = (class_755)var1;
      String[] var10000 = class_752.method_4253();
      float var7 = var6.field_3390 + (var6.field_3389 - var6.field_3390) * var4;
      String[] var5 = var10000;
      float var10;
      int var9 = (var10 = var7 - 0.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
      if(var5 != null) {
         if(var9 < 0) {
            var7 = 0.0F;
         }

         var9 = 0;
      }

      int var8 = var9;

      while(var8 < this.field_6458.length) {
         this.field_6458[var8].field_6546 = (float)(-(4 - var8)) * var7 * 1.7F;
         ++var8;
         if(var5 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method_6512(var2, var3, var4, var5, var6, var7, var1);
      String[] var10000 = class_752.method_4253();
      this.field_6459.method_6646(var7);
      String[] var8 = var10000;
      int var9 = 0;

      while(var9 < this.field_6458.length) {
         this.field_6458[var9].method_6646(var7);
         ++var9;
         if(var8 == null) {
            break;
         }
      }

   }
}
