
// $FF: renamed from: mQ
public class class_1229 extends bhr {

   // $FF: renamed from: b bix[]
   public bix[] field_6380;
   // $FF: renamed from: c java.lang.String
   private static final String field_6381 = "CL_00000832";


   // $FF: renamed from: <init> () void
   public void method_6510() {
      super.method_6510();
      this.field_6380 = new bix[5];
      bix[] var10000 = this.field_6380;
      bix var10002 = new bix;
      var10002.method_6639(this, 0, 8);
      var10000[0] = var10002;
      var10000 = this.field_6380;
      var10002 = new bix;
      var10002.method_6639(this, 0, 0);
      var10000[1] = var10002;
      var10000 = this.field_6380;
      var10002 = new bix;
      var10002.method_6639(this, 0, 0);
      var10000[2] = var10002;
      var10000 = this.field_6380;
      var10002 = new bix;
      var10002.method_6639(this, 0, 0);
      var10000[3] = var10002;
      var10000 = this.field_6380;
      var10002 = new bix;
      var10002.method_6639(this, 0, 0);
      var10000[4] = var10002;
      byte var1 = 24;
      byte var2 = 6;
      byte var3 = 20;
      byte var4 = 4;
      this.field_6380[0].method_6644((float)(-var1 / 2), (float)(-var3 / 2 + 2), -3.0F, var1, var3 - 4, 4, 0.0F);
      this.field_6380[0].method_6645(0.0F, (float)var4, 0.0F);
      this.field_6380[1].method_6644((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_6380[1].method_6645((float)(-var1 / 2 + 1), (float)var4, 0.0F);
      this.field_6380[2].method_6644((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_6380[2].method_6645((float)(var1 / 2 - 1), (float)var4, 0.0F);
      this.field_6380[3].method_6644((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_6380[3].method_6645(0.0F, (float)var4, (float)(-var3 / 2 + 1));
      this.field_6380[4].method_6644((float)(-var1 / 2 + 2), (float)(-var2 - 1), -1.0F, var1 - 4, var2, 2, 0.0F);
      this.field_6380[4].method_6645(0.0F, (float)var4, (float)(var3 / 2 - 1));
      this.field_6380[0].field_6548 = 1.5707964F;
      this.field_6380[1].field_6549 = 4.712389F;
      this.field_6380[2].field_6549 = 1.5707964F;
      this.field_6380[3].field_6549 = 3.1415927F;
   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      String[] var10000 = class_752.method_4253();
      int var9 = 0;
      String[] var8 = var10000;

      while(var9 < 5) {
         this.field_6380[var9].method_6646(var7);
         ++var9;
         if(var8 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void drawRect5() {
      boolean var10000 = true;
      char[] var10003 = "uÞ¹:¢ý®ªÕ8".toCharArray();
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
            field_6381 = (new String((char[])var4)).intern();
            String var2 = field_6381;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 5;
            break;
         case 1:
            var10009 = 161;
            break;
         case 2:
            var10009 = 213;
            break;
         case 3:
            var10009 = 57;
            break;
         case 4:
            var10009 = 161;
            break;
         case 5:
            var10009 = 254;
            break;
         default:
            var10009 = 173;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
