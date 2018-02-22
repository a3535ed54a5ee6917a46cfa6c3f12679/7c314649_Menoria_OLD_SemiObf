import java.util.List;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: ll
public class class_178 extends bdw {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_657;
   // $FF: renamed from: i bqx
   private static final bqx field_658;
   // $FF: renamed from: r java.lang.String
   private static final String field_659;
   // $FF: renamed from: s java.lang.String[]
   private static final String[] field_660;


   // $FF: renamed from: <init> () void
   public void method_651() {
      super.method_651();
   }

   // $FF: renamed from: b () void
   public void initGui() {
      this.buttonList.clear();
      byte var1 = -16;
      List var10000 = this.buttonList;
      bcb var10001 = new bcb;
      int var10004 = this.width / 2 - 116;
      int var10005 = this.height / 2 + 62 + var1;
      String[] var2 = field_660;
      var10001.method_748(1, var10004, var10005, 114, 20, class_1450.method_7896("demo.help.buy", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(2, this.width / 2 + 2, this.height / 2 + 62 + var1, 114, 20, class_1450.method_7896("demo.help.later", new Object[0]));
      var10000.add(var10001);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () void
   public void method_871() {
      super.method_871();
   }

   // $FF: renamed from: c () void
   public void method_873() {
      super.method_873();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_557.method_5288().bindTexture(field_658);
      int var1 = (this.width - 248) / 2;
      int var2 = (this.height - 166) / 2;
      this.method_658(var1, var2, 0, 0, 248, 166);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      int var4 = (this.width - 248) / 2 + 10;
      int var5 = (this.height - 166) / 2 + 8;
      String[] var7 = field_660;
      this.fontRendererObj.method_7020(class_1450.method_7896("demo.help.title", new Object[0]), var4, var5, 2039583);
      var5 += 12;
      bbj var6 = this.field_557.canLoseFocus7;
      this.fontRendererObj.method_7020(class_1450.method_7896("demo.help.movementShort", new Object[]{bbj.method_5347(var6.field_4532.getEnableBackgroundDrawing8()), bbj.method_5347(var6.field_4533.getEnableBackgroundDrawing8()), bbj.method_5347(var6.field_4534.getEnableBackgroundDrawing8()), bbj.method_5347(var6.field_4535.getEnableBackgroundDrawing8())}), var4, var5, 5197647);
      this.fontRendererObj.method_7020(class_1450.method_7896("demo.help.movementMouse", new Object[0]), var4, var5 + 12, 5197647);
      this.fontRendererObj.method_7020(class_1450.method_7896("demo.help.jump", new Object[]{bbj.method_5347(var6.field_4536.getEnableBackgroundDrawing8())}), var4, var5 + 24, 5197647);
      this.fontRendererObj.method_7020(class_1450.method_7896("demo.help.inventory", new Object[]{bbj.method_5347(var6.field_4538.getEnableBackgroundDrawing8())}), var4, var5 + 36, 5197647);
      this.fontRendererObj.drawSplitString(class_1450.method_7896("demo.help.fullWrapped", new Object[0]), var4, var5 + 68, 218, 2039583);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_940() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_941(Throwable var0) {
      return var0;
   }
}
