
// $FF: renamed from: nc
public class class_1221 extends bhr {

   // $FF: renamed from: b bix[]
   private bix[] field_6342;
   // $FF: renamed from: c bix[]
   private bix[] field_6343;
   // $FF: renamed from: d float[]
   private float[] field_6344;
   // $FF: renamed from: e int[][]
   private static final int[][] field_6345;
   // $FF: renamed from: f int[][]
   private static final int[][] field_6346;
   // $FF: renamed from: g java.lang.String
   private static final String field_6347 = "CL_00000855";


   // $FF: renamed from: <init> () void
   public void method_6510() {
      super.method_6510();
      this.field_6342 = new bix[7];
      this.field_6344 = new float[7];
      float var1 = -3.5F;

      bix[] var10000;
      bix var10002;
      for(int var2 = 0; var2 < this.field_6342.length; ++var2) {
         var10000 = this.field_6342;
         var10002 = new bix;
         var10002.method_6639(this, field_6346[var2][0], field_6346[var2][1]);
         var10000[var2] = var10002;
         this.field_6342[var2].method_6643((float)field_6345[var2][0] * -0.5F, 0.0F, (float)field_6345[var2][2] * -0.5F, field_6345[var2][0], field_6345[var2][1], field_6345[var2][2]);
         this.field_6342[var2].method_6645(0.0F, (float)(24 - field_6345[var2][1]), var1);
         this.field_6344[var2] = var1;
         if(var2 < this.field_6342.length - 1) {
            var1 += (float)(field_6345[var2][2] + field_6345[var2 + 1][2]) * 0.5F;
         }
      }

      this.field_6343 = new bix[3];
      var10000 = this.field_6343;
      var10002 = new bix;
      var10002.method_6639(this, 20, 0);
      var10000[0] = var10002;
      this.field_6343[0].method_6643(-5.0F, 0.0F, (float)field_6345[2][2] * -0.5F, 10, 8, field_6345[2][2]);
      this.field_6343[0].method_6645(0.0F, 16.0F, this.field_6344[2]);
      var10000 = this.field_6343;
      var10002 = new bix;
      var10002.method_6639(this, 20, 11);
      var10000[1] = var10002;
      this.field_6343[1].method_6643(-3.0F, 0.0F, (float)field_6345[4][2] * -0.5F, 6, 4, field_6345[4][2]);
      this.field_6343[1].method_6645(0.0F, 20.0F, this.field_6344[4]);
      var10000 = this.field_6343;
      var10002 = new bix;
      var10002.method_6639(this, 20, 18);
      var10000[2] = var10002;
      this.field_6343[2].method_6643(-3.0F, 0.0F, (float)field_6345[4][2] * -0.5F, 6, 5, field_6345[1][2]);
      this.field_6343[2].method_6645(0.0F, 19.0F, this.field_6344[1]);
   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      String[] var10000 = class_752.method_4253();
      this.method_6512(var2, var3, var4, var5, var6, var7, var1);
      String[] var8 = var10000;
      int var9 = 0;

      while(true) {
         if(var9 < this.field_6342.length) {
            this.field_6342[var9].method_6646(var7);
            ++var9;
            if(var8 == null) {
               break;
            }

            if(var8 != null) {
               continue;
            }
         }

         var9 = 0;
         break;
      }

      while(var9 < this.field_6343.length) {
         this.field_6343[var9].method_6646(var7);
         ++var9;
         if(var8 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      String[] var10000 = class_752.method_4253();
      int var9 = 0;
      String[] var8 = var10000;

      while(true) {
         if(var9 < this.field_6342.length) {
            this.field_6342[var9].field_6549 = class_1715.method_9556(var3 * 0.9F + (float)var9 * 0.15F * 3.1415927F) * 3.1415927F * 0.05F * (float)(1 + Math.abs(var9 - 2));
            this.field_6342[var9].field_6545 = class_1715.method_9555(var3 * 0.9F + (float)var9 * 0.15F * 3.1415927F) * 3.1415927F * 0.2F * (float)Math.abs(var9 - 2);
            ++var9;
            if(var8 == null) {
               break;
            }

            if(var8 != null) {
               continue;
            }
         }

         this.field_6343[0].field_6549 = this.field_6342[2].field_6549;
         this.field_6343[1].field_6549 = this.field_6342[4].field_6549;
         this.field_6343[1].field_6545 = this.field_6342[4].field_6545;
         this.field_6343[2].field_6549 = this.field_6342[1].field_6549;
         this.field_6343[2].field_6545 = this.field_6342[1].field_6545;
         break;
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_6538() {
      boolean var10000 = true;
      char[] var10003 = "6wÐ\n§EåÕ".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_6347 = (new String((char[])var3)).intern();
            String var1 = field_6347;
            field_6345 = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
            field_6346 = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 170;
            break;
         case 1:
            var10009 = 2;
            break;
         case 2:
            var10009 = 247;
            break;
         case 3:
            var10009 = 63;
            break;
         case 4:
            var10009 = 120;
            break;
         case 5:
            var10009 = 229;
            break;
         default:
            var10009 = 72;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
