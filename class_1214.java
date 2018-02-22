
// $FF: renamed from: nk
public class class_1214 extends class_1213 {

   // $FF: renamed from: i boolean
   public boolean field_6304;
   // $FF: renamed from: j bix
   private bix field_6305;
   // $FF: renamed from: k bix
   private bix field_6306;
   // $FF: renamed from: l java.lang.String
   private static final String field_6307 = "CL_00000866";


   // $FF: renamed from: <init> (float) void
   public void method_6525(float var1) {
      super.method_6526(var1, 0.0F, 64, 128);
      bix var10001 = new bix;
      var10001.method_6638(this);
      this.field_6305 = var10001.method_6650(64, 128);
      this.field_6305.method_6645(0.0F, -2.0F, 0.0F);
      this.field_6305.method_6641(0, 0).method_6644(0.0F, 3.0F, -6.75F, 1, 1, 1, -0.25F);
      this.field_6302.method_6640(this.field_6305);
      var10001 = new bix;
      var10001.method_6638(this);
      this.field_6306 = var10001.method_6650(64, 128);
      this.field_6306.method_6645(-5.0F, -10.03125F, -5.0F);
      this.field_6306.method_6641(0, 64).method_6643(0.0F, 0.0F, 0.0F, 10, 2, 10);
      this.field_6297.method_6640(this.field_6306);
      bix var10000 = new bix;
      var10000.method_6638(this);
      bix var2 = var10000.method_6650(64, 128);
      var2.method_6645(1.75F, -4.0F, 2.0F);
      var2.method_6641(0, 76).method_6643(0.0F, 0.0F, 0.0F, 7, 4, 7);
      var2.field_6548 = -0.05235988F;
      var2.field_6550 = 0.02617994F;
      this.field_6306.method_6640(var2);
      var10000 = new bix;
      var10000.method_6638(this);
      bix var3 = var10000.method_6650(64, 128);
      var3.method_6645(1.75F, -4.0F, 2.0F);
      var3.method_6641(0, 87).method_6643(0.0F, 0.0F, 0.0F, 4, 4, 4);
      var3.field_6548 = -0.10471976F;
      var3.field_6550 = 0.05235988F;
      var2.method_6640(var3);
      var10000 = new bix;
      var10000.method_6638(this);
      bix var4 = var10000.method_6650(64, 128);
      var4.method_6645(1.75F, -2.0F, 2.0F);
      var4.method_6641(0, 95).method_6644(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.25F);
      var4.field_6548 = -0.20943952F;
      var4.field_6550 = 0.10471976F;
      var3.method_6640(var4);
   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      super.method_6512(var1, var2, var3, var4, var5, var6, var7);
      this.field_6302.field_6560 = this.field_6302.field_6561 = this.field_6302.field_6562 = 0.0F;
      String[] var10000 = class_752.method_4253();
      float var9 = 0.01F * (float)(var7.method_3845() % 10);
      this.field_6302.field_6548 = class_1715.method_9555((float)var7.field_3029 * var9) * 4.5F * 3.1415927F / 180.0F;
      this.field_6302.field_6549 = 0.0F;
      String[] var8 = var10000;
      this.field_6302.field_6550 = class_1715.method_9556((float)var7.field_3029 * var9) * 2.5F * 3.1415927F / 180.0F;
      class_1214 var10 = this;
      if(var8 != null) {
         if(!this.field_6304) {
            return;
         }

         this.field_6302.field_6548 = -0.9F;
         this.field_6302.field_6562 = -0.09375F;
         var10 = this;
      }

      var10.field_6302.field_6561 = 0.1875F;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6527() {
      boolean var10000 = true;
      char[] var10003 = "&% \\ÍUQI".toCharArray();
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
            field_6307 = (new String((char[])var4)).intern();
            String var2 = field_6307;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 244;
            break;
         case 1:
            var10009 = 248;
            break;
         case 2:
            var10009 = 238;
            break;
         case 3:
            var10009 = 184;
            break;
         case 4:
            var10009 = 59;
            break;
         case 5:
            var10009 = 253;
            break;
         default:
            var10009 = 108;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
