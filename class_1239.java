
// $FF: renamed from: m4
public class class_1239 extends bhr {

   // $FF: renamed from: b bix[]
   public bix[] field_6454;
   // $FF: renamed from: c java.lang.String
   private static final String field_6455 = "CL_00000844";


   // $FF: renamed from: <init> () void
   public void method_6510() {
      super.method_6510();
      this.field_6454 = new bix[7];
      bix[] var10000 = this.field_6454;
      bix var10002 = new bix;
      var10002.method_6639(this, 0, 10);
      var10000[0] = var10002;
      var10000 = this.field_6454;
      var10002 = new bix;
      var10002.method_6639(this, 0, 0);
      var10000[1] = var10002;
      var10000 = this.field_6454;
      var10002 = new bix;
      var10002.method_6639(this, 0, 0);
      var10000[2] = var10002;
      var10000 = this.field_6454;
      var10002 = new bix;
      var10002.method_6639(this, 0, 0);
      var10000[3] = var10002;
      var10000 = this.field_6454;
      var10002 = new bix;
      var10002.method_6639(this, 0, 0);
      var10000[4] = var10002;
      var10000 = this.field_6454;
      var10002 = new bix;
      var10002.method_6639(this, 44, 10);
      var10000[5] = var10002;
      byte var1 = 20;
      byte var2 = 8;
      byte var3 = 16;
      byte var4 = 4;
      this.field_6454[0].method_6644((float)(-var1 / 2), (float)(-var3 / 2), -1.0F, var1, var3, 2, 0.0F);
      this.field_6454[0].method_6645(0.0F, (float)var4, 0.0F);
      this.field_6454[5].method_6644((float)(-var1 / 2 + 1), (float)(-var3 / 2 + 1), -1.0F, var1 - 2, var3 - 2, 1, 0.0F);
      this.field_6454[5].method_6645(0.0F, (float)var4, 0.0F);
      this.field_6454[1].method_6644((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_6454[1].method_6645((float)(-var1 / 2 + 1), (float)var4, 0.0F);
      this.field_6454[2].method_6644((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_6454[2].method_6645((float)(var1 / 2 - 1), (float)var4, 0.0F);
      this.field_6454[3].method_6644((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_6454[3].method_6645(0.0F, (float)var4, (float)(-var3 / 2 + 1));
      this.field_6454[4].method_6644((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_6454[4].method_6645(0.0F, (float)var4, (float)(var3 / 2 - 1));
      this.field_6454[0].field_6548 = 1.5707964F;
      this.field_6454[1].field_6549 = 4.712389F;
      this.field_6454[2].field_6549 = 1.5707964F;
      this.field_6454[3].field_6549 = 3.1415927F;
      this.field_6454[5].field_6548 = -1.5707964F;
   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.field_6454[5].field_6546 = 4.0F - var4;
      String[] var8 = class_752.method_4253();
      int var9 = 0;

      while(var9 < 6) {
         this.field_6454[var9].method_6646(var7);
         ++var9;
         if(var8 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void drawGradientRect7() {
      boolean var10000 = true;
      char[] var10003 = "1ê¼:¥ñuZî".toCharArray();
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
            field_6455 = (new String((char[])var4)).intern();
            String var2 = field_6455;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 155;
            break;
         case 1:
            var10009 = 23;
            break;
         case 2:
            var10009 = 52;
            break;
         case 3:
            var10009 = 128;
            break;
         case 4:
            var10009 = 214;
            break;
         case 5:
            var10009 = 80;
            break;
         default:
            var10009 = 207;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
