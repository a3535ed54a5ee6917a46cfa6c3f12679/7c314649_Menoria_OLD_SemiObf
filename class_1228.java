
// $FF: renamed from: mR
public class class_1228 extends bhr {

   // $FF: renamed from: b bix
   public bix field_6372;
   // $FF: renamed from: c bix
   public bix field_6373;
   // $FF: renamed from: d bix
   public bix field_6374;
   // $FF: renamed from: e bix
   public bix field_6375;
   // $FF: renamed from: f bix
   public bix field_6376;
   // $FF: renamed from: g bix
   public bix field_6377;
   // $FF: renamed from: h bix
   public bix field_6378;
   // $FF: renamed from: i java.lang.String
   private static final String field_6379 = "CL_00000833";


   // $FF: renamed from: <init> () void
   public void method_6510() {
      super.method_6510();
      bix var10001 = new bix;
      var10001.method_6638(this);
      this.field_6372 = var10001.method_6641(0, 0).method_6643(-6.0F, -5.0F, 0.0F, 6, 10, 0);
      var10001 = new bix;
      var10001.method_6638(this);
      this.field_6373 = var10001.method_6641(16, 0).method_6643(0.0F, -5.0F, 0.0F, 6, 10, 0);
      var10001 = new bix;
      var10001.method_6638(this);
      this.field_6374 = var10001.method_6641(0, 10).method_6643(0.0F, -4.0F, -0.99F, 5, 8, 1);
      var10001 = new bix;
      var10001.method_6638(this);
      this.field_6375 = var10001.method_6641(12, 10).method_6643(0.0F, -4.0F, -0.01F, 5, 8, 1);
      var10001 = new bix;
      var10001.method_6638(this);
      this.field_6376 = var10001.method_6641(24, 10).method_6643(0.0F, -4.0F, 0.0F, 5, 8, 0);
      var10001 = new bix;
      var10001.method_6638(this);
      this.field_6377 = var10001.method_6641(24, 10).method_6643(0.0F, -4.0F, 0.0F, 5, 8, 0);
      var10001 = new bix;
      var10001.method_6638(this);
      this.field_6378 = var10001.method_6641(12, 0).method_6643(-1.0F, -5.0F, 0.0F, 2, 10, 0);
      this.field_6372.method_6645(0.0F, 0.0F, -1.0F);
      this.field_6373.method_6645(0.0F, 0.0F, 1.0F);
      this.field_6378.field_6549 = 1.5707964F;
   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method_6512(var2, var3, var4, var5, var6, var7, var1);
      this.field_6372.method_6646(var7);
      this.field_6373.method_6646(var7);
      this.field_6378.method_6646(var7);
      this.field_6374.method_6646(var7);
      this.field_6375.method_6646(var7);
      this.field_6376.method_6646(var7);
      this.field_6377.method_6646(var7);
   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      float var8 = (class_1715.method_9555(var1 * 0.02F) * 0.1F + 1.25F) * var4;
      this.field_6372.field_6549 = 3.1415927F + var8;
      this.field_6373.field_6549 = -var8;
      this.field_6374.field_6549 = var8;
      this.field_6375.field_6549 = -var8;
      this.field_6376.field_6549 = var8 - var8 * 2.0F * var2;
      this.field_6377.field_6549 = var8 - var8 * 2.0F * var3;
      this.field_6374.field_6545 = class_1715.method_9555(var8);
      this.field_6375.field_6545 = class_1715.method_9555(var8);
      this.field_6376.field_6545 = class_1715.method_9555(var8);
      this.field_6377.field_6545 = class_1715.method_9555(var8);
   }

   // $FF: renamed from: <clinit> () void
   static void drawRect4() {
      boolean var10000 = true;
      char[] var10003 = ">$>:ãMPn=".toCharArray();
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
            field_6379 = (new String((char[])var4)).intern();
            String var2 = field_6379;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 149;
            break;
         case 1:
            var10009 = 128;
            break;
         case 2:
            var10009 = 181;
            break;
         case 3:
            var10009 = 230;
            break;
         case 4:
            var10009 = 214;
            break;
         case 5:
            var10009 = 226;
            break;
         default:
            var10009 = 59;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
