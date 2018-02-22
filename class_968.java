import org.lwjgl.opengl.GL11;

// $FF: renamed from: mk
class class_968 extends bcm {

   // $FF: renamed from: w int
   public int field_4903;
   // $FF: renamed from: x java.lang.String
   private static final String field_4904 = "CL_00000706";
   // $FF: renamed from: y lt
   final class_170 field_4905;


   // $FF: renamed from: <init> (lt) void
   public void method_5591(class_170 var1) {
      this.field_4905 = var1;
      super.method_5549(var1.field_557, var1.width, var1.height, 80, var1.height - 37, 24);
      this.field_4903 = -1;
   }

   // $FF: renamed from: b (int, int, adb) void
   private void method_5592(int var1, int var2, adb var3) {
      this.method_5593(var1 + 1, var2 + 1);
      GL11.glEnable('\u803a');
      bam.method_5216();
      class_811 var10000 = class_170.method_917();
      FontRenderer var10001 = this.field_4905.fontRendererObj;
      bqf var10002 = this.field_4905.field_557.method_5288();
      add var10003 = new add;
      var10003.method_3726(var3, 1, 0);
      var10000.method_4755(var10001, var10002, var10003, var1 + 2, var2 + 2);
      bam.method_5212();
      GL11.glDisable('\u803a');
   }

   // $FF: renamed from: f (int, int) void
   private void method_5593(int var1, int var2) {
      this.method_5594(var1, var2, 0, 0);
   }

   // $FF: renamed from: d (int, int, int, int) void
   private void method_5594(int var1, int var2, int var3, int var4) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_4905.field_557.method_5288().bindTexture(Gui.field_370);
      float var5 = 0.0078125F;
      float var6 = 0.0078125F;
      boolean var7 = true;
      boolean var8 = true;
      bmh var9 = bmh.instance;
      var9.setVisible2();
      var9.addVertexWithUV((double)(var1 + 0), (double)(var2 + 18), (double)this.field_4905.field_372, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var9.addVertexWithUV((double)(var1 + 18), (double)(var2 + 18), (double)this.field_4905.field_372, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var9.addVertexWithUV((double)(var1 + 18), (double)(var2 + 0), (double)this.field_4905.field_372, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var9.addVertexWithUV((double)(var1 + 0), (double)(var2 + 0), (double)this.field_4905.field_372, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var9.getVisible8();
   }

   // $FF: renamed from: b () int
   protected int method_5553() {
      return class_170.method_918().size();
   }

   // $FF: renamed from: a (int, boolean, int, int) void
   protected void method_5554(int var1, boolean var2, int var3, int var4) {
      this.field_4903 = var1;
      this.field_4905.method_913();
      class_170.method_920(this.field_4905).writeText(((class_1412)class_170.method_918().get(class_170.method_919(this.field_4905).field_4903)).field_7525);
   }

   // $FF: renamed from: a (int) boolean
   protected boolean method_5555(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         var10000 = var1 == this.field_4903?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a () void
   protected void method_5557() {}

   // $FF: renamed from: a (int, int, int, int, bmh, int, int) void
   protected void method_5558(int var1, int var2, int var3, int var4, bmh var5, int var6, int var7) {
      class_1412 var8 = (class_1412)class_170.method_918().get(var1);
      this.method_5592(var2, var3, var8.field_7523);
      this.field_4905.fontRendererObj.method_7020(var8.field_7524, var2 + 18 + 5, var3 + 6, 16777215);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5579() {
      boolean var10000 = true;
      char[] var10003 = "j%½¯ÓígJ»".toCharArray();
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
            field_4904 = (new String((char[])var4)).intern();
            String var2 = field_4904;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 234;
            break;
         case 1:
            var10009 = 147;
            break;
         case 2:
            var10009 = 185;
            break;
         case 3:
            var10009 = 78;
            break;
         case 4:
            var10009 = 92;
            break;
         case 5:
            var10009 = 32;
            break;
         default:
            var10009 = 30;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
