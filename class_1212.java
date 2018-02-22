
// $FF: renamed from: nl
public class class_1212 extends bhr {

   // $FF: renamed from: b bix[]
   private bix[] field_6294;
   // $FF: renamed from: c bix[]
   private bix[] field_6295;
   // $FF: renamed from: d java.lang.String
   private static final String field_6296 = "CL_00000867";


   // $FF: renamed from: <init> () void
   public void method_6510() {
      super.method_6510();
      this.field_6264 = 64;
      this.field_6265 = 64;
      this.field_6294 = new bix[3];
      bix[] var10000 = this.field_6294;
      bix var10002 = new bix;
      var10002.method_6639(this, 0, 16);
      var10000[0] = var10002;
      this.field_6294[0].method_6643(-10.0F, 3.9F, -0.5F, 20, 3, 3);
      var10000 = this.field_6294;
      var10002 = new bix;
      var10002.method_6638(this);
      var10000[1] = var10002.method_6650(this.field_6264, this.field_6265);
      this.field_6294[1].method_6645(-2.0F, 6.9F, -0.5F);
      this.field_6294[1].method_6641(0, 22).method_6643(0.0F, 0.0F, 0.0F, 3, 10, 3);
      this.field_6294[1].method_6641(24, 22).method_6643(-4.0F, 1.5F, 0.5F, 11, 2, 2);
      this.field_6294[1].method_6641(24, 22).method_6643(-4.0F, 4.0F, 0.5F, 11, 2, 2);
      this.field_6294[1].method_6641(24, 22).method_6643(-4.0F, 6.5F, 0.5F, 11, 2, 2);
      var10000 = this.field_6294;
      var10002 = new bix;
      var10002.method_6639(this, 12, 22);
      var10000[2] = var10002;
      this.field_6294[2].method_6643(0.0F, 0.0F, 0.0F, 3, 6, 3);
      this.field_6295 = new bix[3];
      var10000 = this.field_6295;
      var10002 = new bix;
      var10002.method_6639(this, 0, 0);
      var10000[0] = var10002;
      this.field_6295[0].method_6643(-4.0F, -4.0F, -4.0F, 8, 8, 8);
      var10000 = this.field_6295;
      var10002 = new bix;
      var10002.method_6639(this, 32, 0);
      var10000[1] = var10002;
      this.field_6295[1].method_6643(-4.0F, -4.0F, -4.0F, 6, 6, 6);
      this.field_6295[1].field_6545 = -8.0F;
      this.field_6295[1].field_6546 = 4.0F;
      var10000 = this.field_6295;
      var10002 = new bix;
      var10002.method_6639(this, 32, 0);
      var10000[2] = var10002;
      this.field_6295[2].method_6643(-4.0F, -4.0F, -4.0F, 6, 6, 6);
      this.field_6295[2].field_6545 = 10.0F;
      this.field_6295[2].field_6546 = 4.0F;
   }

   // $FF: renamed from: b () int
   public int method_6523() {
      return 32;
   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method_6512(var2, var3, var4, var5, var6, var7, var1);
      bix[] var9 = this.field_6295;
      String[] var10000 = class_752.method_4253();
      int var10 = var9.length;
      String[] var8 = var10000;
      int var11 = 0;

      bix var12;
      while(true) {
         if(var11 < var10) {
            var12 = var9[var11];
            var12.method_6646(var7);
            ++var11;
            if(var8 == null) {
               break;
            }

            if(var8 != null) {
               continue;
            }
         }

         var9 = this.field_6294;
         var10 = var9.length;
         break;
      }

      var11 = 0;

      while(var11 < var10) {
         var12 = var9[var11];
         var12.method_6646(var7);
         ++var11;
         if(var8 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      float var8 = class_1715.method_9556(var3 * 0.1F);
      this.field_6294[1].field_6548 = (0.065F + 0.05F * var8) * 3.1415927F;
      this.field_6294[2].method_6645(-2.0F, 6.9F + class_1715.method_9556(this.field_6294[1].field_6548) * 10.0F, -0.5F + class_1715.method_9555(this.field_6294[1].field_6548) * 10.0F);
      this.field_6294[2].field_6548 = (0.265F + 0.1F * var8) * 3.1415927F;
      this.field_6295[0].field_6549 = var4 / 57.295776F;
      this.field_6295[0].field_6548 = var5 / 57.295776F;
   }

   // $FF: renamed from: a (sv, float, float, float) void
   public void method_6513(class_752 var1, float var2, float var3, float var4) {
      String[] var10000 = class_752.method_4253();
      class_791 var6 = (class_791)var1;
      String[] var5 = var10000;
      int var7 = 1;

      while(var7 < 3) {
         this.field_6295[var7].field_6549 = (var6.method_4547(var7 - 1) - var1.field_3330) / 57.295776F;
         this.field_6295[var7].field_6548 = var6.method_4548(var7 - 1) / 57.295776F;
         ++var7;
         if(var5 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_6524() {
      boolean var10000 = true;
      char[] var10003 = "Ôl½æ4-§ãº".toCharArray();
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
            field_6296 = (new String((char[])var4)).intern();
            String var2 = field_6296;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 36;
            break;
         case 1:
            var10009 = 147;
            break;
         case 2:
            var10009 = 102;
            break;
         case 3:
            var10009 = 62;
            break;
         case 4:
            var10009 = 101;
            break;
         case 5:
            var10009 = 183;
            break;
         default:
            var10009 = 174;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
