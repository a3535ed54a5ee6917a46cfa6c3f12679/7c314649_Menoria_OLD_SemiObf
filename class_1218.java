
// $FF: renamed from: nf
public class class_1218 extends bhr {

   // $FF: renamed from: b bix
   public bix field_6330;
   // $FF: renamed from: c bix
   public bix field_6331;
   // $FF: renamed from: d bix
   public bix field_6332;
   // $FF: renamed from: e bix
   public bix field_6333;
   // $FF: renamed from: f bix
   public bix field_6334;
   // $FF: renamed from: g java.lang.String
   private static final String field_6335 = "CL_00000859";


   // $FF: renamed from: <init> () void
   public void method_6510() {
      super.method_6510();
      float var1 = 4.0F;
      float var2 = 0.0F;
      bix var10001 = new bix;
      var10001.method_6639(this, 0, 0);
      this.field_6332 = var10001.method_6650(64, 64);
      this.field_6332.method_6644(-4.0F, -8.0F, -4.0F, 8, 8, 8, var2 - 0.5F);
      this.field_6332.method_6645(0.0F, 0.0F + var1, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 32, 0);
      this.field_6333 = var10001.method_6650(64, 64);
      this.field_6333.method_6644(-1.0F, 0.0F, -1.0F, 12, 2, 2, var2 - 0.5F);
      this.field_6333.method_6645(0.0F, 0.0F + var1 + 9.0F - 7.0F, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 32, 0);
      this.field_6334 = var10001.method_6650(64, 64);
      this.field_6334.method_6644(-1.0F, 0.0F, -1.0F, 12, 2, 2, var2 - 0.5F);
      this.field_6334.method_6645(0.0F, 0.0F + var1 + 9.0F - 7.0F, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6330 = var10001.method_6650(64, 64);
      this.field_6330.method_6644(-5.0F, -10.0F, -5.0F, 10, 10, 10, var2 - 0.5F);
      this.field_6330.method_6645(0.0F, 0.0F + var1 + 9.0F, 0.0F);
      var10001 = new bix;
      var10001.method_6639(this, 0, 36);
      this.field_6331 = var10001.method_6650(64, 64);
      this.field_6331.method_6644(-6.0F, -12.0F, -6.0F, 12, 12, 12, var2 - 0.5F);
      this.field_6331.method_6645(0.0F, 0.0F + var1 + 20.0F, 0.0F);
   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      super.method_6512(var1, var2, var3, var4, var5, var6, var7);
      this.field_6332.field_6549 = var4 / 57.295776F;
      this.field_6332.field_6548 = var5 / 57.295776F;
      this.field_6330.field_6549 = var4 / 57.295776F * 0.25F;
      float var8 = class_1715.method_9555(this.field_6330.field_6549);
      float var9 = class_1715.method_9556(this.field_6330.field_6549);
      this.field_6333.field_6550 = 1.0F;
      this.field_6334.field_6550 = -1.0F;
      this.field_6333.field_6549 = 0.0F + this.field_6330.field_6549;
      this.field_6334.field_6549 = 3.1415927F + this.field_6330.field_6549;
      this.field_6333.field_6545 = var9 * 5.0F;
      this.field_6333.field_6547 = -var8 * 5.0F;
      this.field_6334.field_6545 = -var9 * 5.0F;
      this.field_6334.field_6547 = var8 * 5.0F;
   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method_6512(var2, var3, var4, var5, var6, var7, var1);
      this.field_6330.method_6646(var7);
      this.field_6331.method_6646(var7);
      this.field_6332.method_6646(var7);
      this.field_6333.method_6646(var7);
      this.field_6334.method_6646(var7);
   }

   // $FF: renamed from: <clinit> () void
   static void method_6534() {
      boolean var10000 = true;
      char[] var10003 = "+Þ°r|_ÿ×".toCharArray();
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
            field_6335 = (new String((char[])var4)).intern();
            String var2 = field_6335;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 30;
            break;
         case 1:
            var10009 = 53;
            break;
         case 2:
            var10009 = 152;
            break;
         case 3:
            var10009 = 188;
            break;
         case 4:
            var10009 = 210;
            break;
         case 5:
            var10009 = 118;
            break;
         default:
            var10009 = 16;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
