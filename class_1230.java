
// $FF: renamed from: mP
public class class_1230 extends bhr {

   // $FF: renamed from: b bix[]
   private bix[] field_6382;
   // $FF: renamed from: c bix
   private bix field_6383;
   // $FF: renamed from: d java.lang.String
   private static final String field_6384 = "CL_00000831";


   // $FF: renamed from: <init> () void
   public void method_6510() {
      super.method_6510();
      this.field_6382 = new bix[12];

      for(int var1 = 0; var1 < this.field_6382.length; ++var1) {
         bix[] var10000 = this.field_6382;
         bix var10002 = new bix;
         var10002.method_6639(this, 0, 16);
         var10000[var1] = var10002;
         this.field_6382[var1].method_6643(0.0F, 0.0F, 0.0F, 2, 8, 2);
      }

      bix var10001 = new bix;
      var10001.method_6639(this, 0, 0);
      this.field_6383 = var10001;
      this.field_6383.method_6643(-4.0F, -4.0F, -4.0F, 8, 8, 8);
   }

   // $FF: renamed from: b () int
   public int drawRect6() {
      return 8;
   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method_6512(var2, var3, var4, var5, var6, var7, var1);
      String[] var10000 = class_752.method_4253();
      this.field_6383.method_6646(var7);
      String[] var8 = var10000;
      int var9 = 0;

      while(var9 < this.field_6382.length) {
         this.field_6382[var9].method_6646(var7);
         ++var9;
         if(var8 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      String[] var10000 = class_752.method_4253();
      float var9 = var3 * 3.1415927F * -0.1F;
      int var10 = 0;
      String[] var8 = var10000;

      while(true) {
         if(var10 < 4) {
            this.field_6382[var10].field_6546 = -2.0F + class_1715.method_9556(((float)(var10 * 2) + var3) * 0.25F);
            this.field_6382[var10].field_6545 = class_1715.method_9556(var9) * 9.0F;
            this.field_6382[var10].field_6547 = class_1715.method_9555(var9) * 9.0F;
            ++var9;
            ++var10;
            if(var8 == null) {
               break;
            }

            if(var8 != null) {
               continue;
            }
         }

         var9 = 0.7853982F + var3 * 3.1415927F * 0.03F;
         break;
      }

      var10 = 4;

      while(true) {
         if(var10 < 8) {
            this.field_6382[var10].field_6546 = 2.0F + class_1715.method_9556(((float)(var10 * 2) + var3) * 0.25F);
            this.field_6382[var10].field_6545 = class_1715.method_9556(var9) * 7.0F;
            this.field_6382[var10].field_6547 = class_1715.method_9555(var9) * 7.0F;
            ++var9;
            ++var10;
            if(var8 == null) {
               break;
            }

            if(var8 != null) {
               continue;
            }
         }

         var9 = 0.47123894F + var3 * 3.1415927F * -0.05F;
         break;
      }

      var10 = 8;

      while(true) {
         if(var10 < 12) {
            this.field_6382[var10].field_6546 = 11.0F + class_1715.method_9556(((float)var10 * 1.5F + var3) * 0.5F);
            this.field_6382[var10].field_6545 = class_1715.method_9556(var9) * 5.0F;
            this.field_6382[var10].field_6547 = class_1715.method_9555(var9) * 5.0F;
            ++var9;
            ++var10;
            if(var8 == null) {
               break;
            }

            if(var8 != null) {
               continue;
            }
         }

         this.field_6383.field_6549 = var4 / 57.295776F;
         this.field_6383.field_6548 = var5 / 57.295776F;
         break;
      }

   }

   // $FF: renamed from: <clinit> () void
   static void drawRect7() {
      boolean var10000 = true;
      char[] var10003 = "öÁ>½XzóÀ".toCharArray();
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
            field_6384 = (new String((char[])var4)).intern();
            String var2 = field_6384;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 136;
            break;
         case 1:
            var10009 = 127;
            break;
         case 2:
            var10009 = 253;
            break;
         case 3:
            var10009 = 204;
            break;
         case 4:
            var10009 = 51;
            break;
         case 5:
            var10009 = 176;
            break;
         default:
            var10009 = 85;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
