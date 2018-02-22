
// $FF: renamed from: nh
public class class_1216 extends bhr {

   // $FF: renamed from: b bix
   bix field_6315;
   // $FF: renamed from: c bix[]
   bix[] field_6316;
   // $FF: renamed from: d java.lang.String
   private static final String field_6317 = "CL_00000861";


   // $FF: renamed from: <init> () void
   public void method_6510() {
      super.method_6510();
      this.field_6316 = new bix[8];
      byte var1 = -16;
      bix var10001 = new bix;
      var10001.method_6639(this, 0, 0);
      this.field_6315 = var10001;
      this.field_6315.method_6643(-6.0F, -8.0F, -6.0F, 12, 16, 12);
      this.field_6315.field_6546 += (float)(24 + var1);

      for(int var2 = 0; var2 < this.field_6316.length; ++var2) {
         bix[] var10000 = this.field_6316;
         bix var10002 = new bix;
         var10002.method_6639(this, 48, 0);
         var10000[var2] = var10002;
         double var3 = (double)var2 * 3.141592653589793D * 2.0D / (double)this.field_6316.length;
         float var5 = (float)Math.cos(var3) * 5.0F;
         float var6 = (float)Math.sin(var3) * 5.0F;
         this.field_6316[var2].method_6643(-1.0F, 0.0F, -1.0F, 2, 18, 2);
         this.field_6316[var2].field_6545 = var5;
         this.field_6316[var2].field_6547 = var6;
         this.field_6316[var2].field_6546 = (float)(31 + var1);
         var3 = (double)var2 * 3.141592653589793D * -2.0D / (double)this.field_6316.length + 1.5707963267948966D;
         this.field_6316[var2].field_6549 = (float)var3;
      }

   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      bix[] var9 = this.field_6316;
      String[] var8 = class_752.method_4253();
      int var10 = var9.length;
      int var11 = 0;

      while(var11 < var10) {
         bix var12 = var9[var11];
         var12.field_6548 = var3;
         ++var11;
         if(var8 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method_6512(var2, var3, var4, var5, var6, var7, var1);
      String[] var8 = class_752.method_4253();
      this.field_6315.method_6646(var7);
      int var9 = 0;

      while(var9 < this.field_6316.length) {
         this.field_6316[var9].method_6646(var7);
         ++var9;
         if(var8 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_6532() {
      boolean var10000 = true;
      char[] var10003 = "ÕÝäùÞ½¦ú´å".toCharArray();
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
            field_6317 = (new String((char[])var4)).intern();
            String var2 = field_6317;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         byte var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 30;
            break;
         case 1:
            var10009 = 74;
            break;
         case 2:
            var10009 = 10;
            break;
         case 3:
            var10009 = 92;
            break;
         case 4:
            var10009 = 65;
            break;
         case 5:
            var10009 = 102;
            break;
         default:
            var10009 = 5;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
