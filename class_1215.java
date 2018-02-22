
// $FF: renamed from: ni
public class class_1215 extends bhr {

   // $FF: renamed from: b bix
   public bix field_6308;
   // $FF: renamed from: c bix
   public bix field_6309;
   // $FF: renamed from: d bix
   public bix field_6310;
   // $FF: renamed from: e bix
   public bix field_6311;
   // $FF: renamed from: f bix
   public bix field_6312;
   // $FF: renamed from: g bix
   public bix field_6313;
   // $FF: renamed from: h java.lang.String
   private static final String field_6314 = "CL_00000863";


   // $FF: renamed from: <init> () void
   public void method_6510() {
      this.method_6528(0.0F);
   }

   // $FF: renamed from: <init> (float) void
   public void method_6528(float var1) {
      this.method_6529(var1, -7.0F);
   }

   // $FF: renamed from: <init> (float, float) void
   public void method_6529(float var1, float var2) {
      super.method_6510();
      short var3 = 128;
      short var4 = 128;
      bix var10001 = new bix;
      var10001.method_6638(this);
      this.field_6308 = var10001.method_6650(var3, var4);
      this.field_6308.method_6645(0.0F, 0.0F + var2, -2.0F);
      this.field_6308.method_6641(0, 0).method_6644(-4.0F, -12.0F, -5.5F, 8, 10, 8, var1);
      this.field_6308.method_6641(24, 0).method_6644(-1.0F, -5.0F, -7.5F, 2, 4, 2, var1);
      var10001 = new bix;
      var10001.method_6638(this);
      this.field_6309 = var10001.method_6650(var3, var4);
      this.field_6309.method_6645(0.0F, 0.0F + var2, 0.0F);
      this.field_6309.method_6641(0, 40).method_6644(-9.0F, -2.0F, -6.0F, 18, 12, 11, var1);
      this.field_6309.method_6641(0, 70).method_6644(-4.5F, 10.0F, -3.0F, 9, 5, 6, var1 + 0.5F);
      var10001 = new bix;
      var10001.method_6638(this);
      this.field_6310 = var10001.method_6650(var3, var4);
      this.field_6310.method_6645(0.0F, -7.0F, 0.0F);
      this.field_6310.method_6641(60, 21).method_6644(-13.0F, -2.5F, -3.0F, 4, 30, 6, var1);
      var10001 = new bix;
      var10001.method_6638(this);
      this.field_6311 = var10001.method_6650(var3, var4);
      this.field_6311.method_6645(0.0F, -7.0F, 0.0F);
      this.field_6311.method_6641(60, 58).method_6644(9.0F, -2.5F, -3.0F, 4, 30, 6, var1);
      var10001 = new bix;
      var10001.method_6639(this, 0, 22);
      this.field_6312 = var10001.method_6650(var3, var4);
      this.field_6312.method_6645(-4.0F, 18.0F + var2, 0.0F);
      this.field_6312.method_6641(37, 0).method_6644(-3.5F, -3.0F, -3.0F, 6, 16, 5, var1);
      var10001 = new bix;
      var10001.method_6639(this, 0, 22);
      this.field_6313 = var10001.method_6650(var3, var4);
      this.field_6313.field_6553 = true;
      this.field_6313.method_6641(60, 0).method_6645(5.0F, 18.0F + var2, 0.0F);
      this.field_6313.method_6644(-3.5F, -3.0F, -3.0F, 6, 16, 5, var1);
   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method_6512(var2, var3, var4, var5, var6, var7, var1);
      this.field_6308.method_6646(var7);
      this.field_6309.method_6646(var7);
      this.field_6312.method_6646(var7);
      this.field_6313.method_6646(var7);
      this.field_6310.method_6646(var7);
      this.field_6311.method_6646(var7);
   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      this.field_6308.field_6549 = var4 / 57.295776F;
      this.field_6308.field_6548 = var5 / 57.295776F;
      this.field_6312.field_6548 = -1.5F * this.method_6530(var1, 13.0F) * var2;
      this.field_6313.field_6548 = 1.5F * this.method_6530(var1, 13.0F) * var2;
      this.field_6312.field_6549 = 0.0F;
      this.field_6313.field_6549 = 0.0F;
   }

   // $FF: renamed from: a (sv, float, float, float) void
   public void method_6513(class_752 var1, float var2, float var3, float var4) {
      class_765 var6 = (class_765)var1;
      String[] var5 = class_752.method_4253();
      int var7 = var6.method_4347();
      int var10000 = var7;
      if(var5 != null) {
         if(var7 > 0) {
            this.field_6310.field_6548 = -2.0F + 1.5F * this.method_6530((float)var7 - var4, 10.0F);
            this.field_6311.field_6548 = -2.0F + 1.5F * this.method_6530((float)var7 - var4, 10.0F);
            if(var5 != null) {
               return;
            }
         }

         var10000 = var6.method_4349();
      }

      int var8 = var10000;
      if(var5 != null) {
         if(var8 > 0) {
            this.field_6310.field_6548 = -0.8F + 0.025F * this.method_6530((float)var8, 70.0F);
            this.field_6311.field_6548 = 0.0F;
            if(var5 != null) {
               return;
            }
         }

         this.field_6310.field_6548 = (-0.2F + 1.5F * this.method_6530(var2, 13.0F)) * var3;
      }

      this.field_6311.field_6548 = (-0.2F - 1.5F * this.method_6530(var2, 13.0F)) * var3;
   }

   // $FF: renamed from: b (float, float) float
   private float method_6530(float var1, float var2) {
      return (Math.abs(var1 % var2 - var2 * 0.5F) - var2 * 0.25F) / (var2 * 0.25F);
   }

   // $FF: renamed from: <clinit> () void
   static void method_6531() {
      boolean var10000 = true;
      char[] var10003 = "Õª^ÜÅ¦ôÃ]".toCharArray();
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
            field_6314 = (new String((char[])var4)).intern();
            String var2 = field_6314;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 203;
            break;
         case 1:
            var10009 = 145;
            break;
         case 2:
            var10009 = 168;
            break;
         case 3:
            var10009 = 51;
            break;
         case 4:
            var10009 = 177;
            break;
         case 5:
            var10009 = 111;
            break;
         default:
            var10009 = 168;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
