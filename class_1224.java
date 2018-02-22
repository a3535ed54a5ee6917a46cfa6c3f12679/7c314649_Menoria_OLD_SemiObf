
// $FF: renamed from: mV
public class class_1224 extends bhr {

   // $FF: renamed from: b bix
   public bix field_6352;
   // $FF: renamed from: c bix
   public bix field_6353;
   // $FF: renamed from: d bix
   public bix field_6354;
   // $FF: renamed from: e bix
   public bix field_6355;
   // $FF: renamed from: f bix
   public bix field_6356;
   // $FF: renamed from: g bix
   public bix field_6357;
   // $FF: renamed from: h bix
   public bix field_6358;
   // $FF: renamed from: i java.lang.String
   private static final String field_6359 = "CL_00000837";


   // $FF: renamed from: <init> () void
   public void method_6510() {
      this.drawRect0(0.0F);
   }

   // $FF: renamed from: <init> (float) void
   public void drawRect0(float var1) {
      super.method_6510();
      byte var2 = 4;
      bix var10001 = new bix;
      var10001.method_6639(this, 0, 0);
      this.field_6352 = var10001;
      this.field_6352.method_6644(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.field_6352.method_6645(0.0F, (float)var2, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 32, 0);
      this.field_6353 = var10001;
      this.field_6353.method_6644(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.field_6353.method_6645(0.0F, (float)var2, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 16, 16);
      this.field_6354 = var10001;
      this.field_6354.method_6644(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.field_6354.method_6645(0.0F, (float)var2, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6355 = var10001;
      this.field_6355.method_6644(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.field_6355.method_6645(-2.0F, (float)(12 + var2), 4.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6356 = var10001;
      this.field_6356.method_6644(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.field_6356.method_6645(2.0F, (float)(12 + var2), 4.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6357 = var10001;
      this.field_6357.method_6644(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.field_6357.method_6645(-2.0F, (float)(12 + var2), -4.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6358 = var10001;
      this.field_6358.method_6644(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.field_6358.method_6645(2.0F, (float)(12 + var2), -4.0F);
   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method_6512(var2, var3, var4, var5, var6, var7, var1);
      this.field_6352.method_6646(var7);
      this.field_6354.method_6646(var7);
      this.field_6355.method_6646(var7);
      this.field_6356.method_6646(var7);
      this.field_6357.method_6646(var7);
      this.field_6358.method_6646(var7);
   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      this.field_6352.field_6549 = var4 / 57.295776F;
      this.field_6352.field_6548 = var5 / 57.295776F;
      this.field_6355.field_6548 = class_1715.method_9556(var1 * 0.6662F) * 1.4F * var2;
      this.field_6356.field_6548 = class_1715.method_9556(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.field_6357.field_6548 = class_1715.method_9556(var1 * 0.6662F + 3.1415927F) * 1.4F * var2;
      this.field_6358.field_6548 = class_1715.method_9556(var1 * 0.6662F) * 1.4F * var2;
   }

   // $FF: renamed from: <clinit> () void
   static void drawRect1() {
      boolean var10000 = true;
      char[] var10003 = "áÖØ*0káºß".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_6359 = (new String((char[])var4)).intern();
            String var2 = field_6359;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 199;
            break;
         case 1:
            var10009 = 188;
            break;
         case 2:
            var10009 = 236;
            break;
         case 3:
            var10009 = 141;
            break;
         case 4:
            var10009 = 127;
            break;
         case 5:
            var10009 = 101;
            break;
         default:
            var10009 = 62;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
