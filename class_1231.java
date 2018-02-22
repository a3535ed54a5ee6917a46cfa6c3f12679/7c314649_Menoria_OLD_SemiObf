
// $FF: renamed from: mO
public class class_1231 extends bhr {

   // $FF: renamed from: b bix
   private bix field_6385;
   // $FF: renamed from: c bix
   private bix field_6386;
   // $FF: renamed from: d bix
   private bix field_6387;
   // $FF: renamed from: e bix
   private bix field_6388;
   // $FF: renamed from: f bix
   private bix field_6389;
   // $FF: renamed from: g bix
   private bix field_6390;
   // $FF: renamed from: h java.lang.String
   private static final String field_6391 = "CL_00000830";


   // $FF: renamed from: <init> () void
   public void method_6510() {
      super.method_6510();
      this.field_6264 = 64;
      this.field_6265 = 64;
      bix var10001 = new bix;
      var10001.method_6639(this, 0, 0);
      this.field_6385 = var10001;
      this.field_6385.method_6643(-3.0F, -3.0F, -3.0F, 6, 6, 6);
      bix var10000 = new bix;
      var10000.method_6639(this, 24, 0);
      bix var1 = var10000;
      var1.method_6643(-4.0F, -6.0F, -2.0F, 3, 4, 1);
      this.field_6385.method_6640(var1);
      var10000 = new bix;
      var10000.method_6639(this, 24, 0);
      bix var2 = var10000;
      var2.field_6553 = true;
      var2.method_6643(1.0F, -6.0F, -2.0F, 3, 4, 1);
      this.field_6385.method_6640(var2);
      var10001 = new bix;
      var10001.method_6639(this, 0, 16);
      this.field_6386 = var10001;
      this.field_6386.method_6643(-3.0F, 4.0F, -3.0F, 6, 12, 6);
      this.field_6386.method_6641(0, 34).method_6643(-5.0F, 16.0F, 0.0F, 10, 6, 1);
      var10001 = new bix;
      var10001.method_6639(this, 42, 0);
      this.field_6387 = var10001;
      this.field_6387.method_6643(-12.0F, 1.0F, 1.5F, 10, 16, 1);
      var10001 = new bix;
      var10001.method_6639(this, 24, 16);
      this.field_6389 = var10001;
      this.field_6389.method_6645(-12.0F, 1.0F, 1.5F);
      this.field_6389.method_6643(-8.0F, 1.0F, 0.0F, 8, 12, 1);
      var10001 = new bix;
      var10001.method_6639(this, 42, 0);
      this.field_6388 = var10001;
      this.field_6388.field_6553 = true;
      this.field_6388.method_6643(2.0F, 1.0F, 1.5F, 10, 16, 1);
      var10001 = new bix;
      var10001.method_6639(this, 24, 16);
      this.field_6390 = var10001;
      this.field_6390.field_6553 = true;
      this.field_6390.method_6645(12.0F, 1.0F, 1.5F);
      this.field_6390.method_6643(0.0F, 1.0F, 0.0F, 8, 12, 1);
      this.field_6386.method_6640(this.field_6387);
      this.field_6386.method_6640(this.field_6388);
      this.field_6387.method_6640(this.field_6389);
      this.field_6388.method_6640(this.field_6390);
   }

   // $FF: renamed from: b () int
   public int drawRect8() {
      return 36;
   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      label11: {
         String[] var10000 = class_752.method_4253();
         class_757 var9 = (class_757)var1;
         String[] var8 = var10000;
         float var10;
         if(var9.method_4314()) {
            var10 = 57.295776F;
            this.field_6385.field_6548 = var6 / 57.295776F;
            this.field_6385.field_6549 = 3.1415927F - var5 / 57.295776F;
            this.field_6385.field_6550 = 3.1415927F;
            this.field_6385.method_6645(0.0F, -2.0F, 0.0F);
            this.field_6387.method_6645(-3.0F, 0.0F, 3.0F);
            this.field_6388.method_6645(3.0F, 0.0F, 3.0F);
            this.field_6386.field_6548 = 3.1415927F;
            this.field_6387.field_6548 = -0.15707964F;
            this.field_6387.field_6549 = -1.2566371F;
            this.field_6389.field_6549 = -1.7278761F;
            this.field_6388.field_6548 = this.field_6387.field_6548;
            this.field_6388.field_6549 = -this.field_6387.field_6549;
            this.field_6390.field_6549 = -this.field_6389.field_6549;
            if(var8 != null) {
               break label11;
            }
         }

         var10 = 57.295776F;
         this.field_6385.field_6548 = var6 / 57.295776F;
         this.field_6385.field_6549 = var5 / 57.295776F;
         this.field_6385.field_6550 = 0.0F;
         this.field_6385.method_6645(0.0F, 0.0F, 0.0F);
         this.field_6387.method_6645(0.0F, 0.0F, 0.0F);
         this.field_6388.method_6645(0.0F, 0.0F, 0.0F);
         this.field_6386.field_6548 = 0.7853982F + class_1715.method_9556(var4 * 0.1F) * 0.15F;
         this.field_6386.field_6549 = 0.0F;
         this.field_6387.field_6549 = class_1715.method_9556(var4 * 1.3F) * 3.1415927F * 0.25F;
         this.field_6388.field_6549 = -this.field_6387.field_6549;
         this.field_6389.field_6549 = this.field_6387.field_6549 * 0.5F;
         this.field_6390.field_6549 = -this.field_6387.field_6549 * 0.5F;
      }

      this.field_6385.method_6646(var7);
      this.field_6386.method_6646(var7);
   }

   // $FF: renamed from: <clinit> () void
   static void drawRect9() {
      boolean var10000 = true;
      char[] var10003 = "YàÕ`Ð&,*¹`".toCharArray();
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
            field_6391 = (new String((char[])var4)).intern();
            String var2 = field_6391;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 205;
            break;
         case 1:
            var10009 = 123;
            break;
         case 2:
            var10009 = 93;
            break;
         case 3:
            var10009 = 135;
            break;
         case 4:
            var10009 = 55;
            break;
         case 5:
            var10009 = 193;
            break;
         default:
            var10009 = 203;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
