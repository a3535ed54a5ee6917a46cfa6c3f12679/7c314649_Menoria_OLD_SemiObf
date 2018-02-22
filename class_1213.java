
// $FF: renamed from: nj
public class class_1213 extends bhr {

   // $FF: renamed from: b bix
   public bix field_6297;
   // $FF: renamed from: c bix
   public bix field_6298;
   // $FF: renamed from: d bix
   public bix field_6299;
   // $FF: renamed from: e bix
   public bix field_6300;
   // $FF: renamed from: f bix
   public bix field_6301;
   // $FF: renamed from: g bix
   public bix field_6302;
   // $FF: renamed from: h java.lang.String
   private static final String field_6303 = "CL_00000864";


   // $FF: renamed from: <init> (float) void
   public void method_6525(float var1) {
      this.method_6526(var1, 0.0F, 64, 64);
   }

   // $FF: renamed from: <init> (float, float, int, int) void
   public void method_6526(float var1, float var2, int var3, int var4) {
      super.method_6510();
      bix var10001 = new bix;
      var10001.method_6638(this);
      this.field_6297 = var10001.method_6650(var3, var4);
      this.field_6297.method_6645(0.0F, 0.0F + var2, 0.0F);
      this.field_6297.method_6641(0, 0).method_6644(-4.0F, -10.0F, -4.0F, 8, 10, 8, var1);
      var10001 = new bix;
      var10001.method_6638(this);
      this.field_6302 = var10001.method_6650(var3, var4);
      this.field_6302.method_6645(0.0F, var2 - 2.0F, 0.0F);
      this.field_6302.method_6641(24, 0).method_6644(-1.0F, -1.0F, -6.0F, 2, 4, 2, var1);
      this.field_6297.method_6640(this.field_6302);
      var10001 = new bix;
      var10001.method_6638(this);
      this.field_6298 = var10001.method_6650(var3, var4);
      this.field_6298.method_6645(0.0F, 0.0F + var2, 0.0F);
      this.field_6298.method_6641(16, 20).method_6644(-4.0F, 0.0F, -3.0F, 8, 12, 6, var1);
      this.field_6298.method_6641(0, 38).method_6644(-4.0F, 0.0F, -3.0F, 8, 18, 6, var1 + 0.5F);
      var10001 = new bix;
      var10001.method_6638(this);
      this.field_6299 = var10001.method_6650(var3, var4);
      this.field_6299.method_6645(0.0F, 0.0F + var2 + 2.0F, 0.0F);
      this.field_6299.method_6641(44, 22).method_6644(-8.0F, -2.0F, -2.0F, 4, 8, 4, var1);
      this.field_6299.method_6641(44, 22).method_6644(4.0F, -2.0F, -2.0F, 4, 8, 4, var1);
      this.field_6299.method_6641(40, 38).method_6644(-4.0F, 2.0F, -2.0F, 8, 4, 4, var1);
      var10001 = new bix;
      var10001.method_6639(this, 0, 22);
      this.field_6300 = var10001.method_6650(var3, var4);
      this.field_6300.method_6645(-2.0F, 12.0F + var2, 0.0F);
      this.field_6300.method_6644(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      var10001 = new bix;
      var10001.method_6639(this, 0, 22);
      this.field_6301 = var10001.method_6650(var3, var4);
      this.field_6301.field_6553 = true;
      this.field_6301.method_6645(2.0F, 12.0F + var2, 0.0F);
      this.field_6301.method_6644(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method_6512(var2, var3, var4, var5, var6, var7, var1);
      this.field_6297.method_6646(var7);
      this.field_6298.method_6646(var7);
      this.field_6300.method_6646(var7);
      this.field_6301.method_6646(var7);
      this.field_6299.method_6646(var7);
   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      this.field_6297.field_6549 = var4 / 57.295776F;
      this.field_6297.field_6548 = var5 / 57.295776F;
      this.field_6299.field_6546 = 3.0F;
      this.field_6299.field_6547 = -1.0F;
      this.field_6299.field_6548 = -0.75F;
      this.field_6300.field_6548 = class_1715.method_9556(var1 * 0.6662F) * 1.4F * var2 * 0.5F;
      this.field_6301.field_6548 = class_1715.method_9556(var1 * 0.6662F + 3.1415927F) * 1.4F * var2 * 0.5F;
      this.field_6300.field_6549 = 0.0F;
      this.field_6301.field_6549 = 0.0F;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6527() {
      boolean var10000 = true;
      char[] var10003 = "ëeï(Ã%ó\fë".toCharArray();
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
            field_6303 = (new String((char[])var4)).intern();
            String var2 = field_6303;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 89;
            break;
         case 1:
            var10009 = 58;
            break;
         case 2:
            var10009 = 203;
            break;
         case 3:
            var10009 = 46;
            break;
         case 4:
            var10009 = 233;
            break;
         case 5:
            var10009 = 2;
            break;
         default:
            var10009 = 228;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
