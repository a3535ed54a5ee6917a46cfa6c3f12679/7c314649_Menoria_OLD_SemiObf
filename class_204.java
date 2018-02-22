import java.util.List;

// $FF: renamed from: l0
public class class_204 extends bdw {

   // $FF: renamed from: b bdw
   private final bdw field_926;
   // $FF: renamed from: i java.lang.String
   private String field_927;
   // $FF: renamed from: r ms
   private class_960 field_928;
   // $FF: renamed from: s java.lang.String
   private static final String field_929;
   // $FF: renamed from: t java.lang.String[]
   private static final String[] field_930;


   // $FF: renamed from: <init> (bdw) void
   public void method_1104(bdw var1) {
      super.method_651();
      this.field_926 = var1;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      String[] var2 = field_930;
      this.field_927 = class_1450.method_7896("options.stream.ingest.title", new Object[0]);
      String[] var10000 = class_752.method_4253();
      class_960 var10002 = new class_960;
      var10002.method_5580(this);
      this.field_928 = var10002;
      String[] var1 = var10000;
      boolean var3 = this.field_557.method_5297().method_208();
      if(var1 != null) {
         if(!var3) {
            this.field_557.method_5297().method_206();
         }

         List var4 = this.buttonList;
         bcb var10001 = new bcb;
         int var10004 = this.width / 2 - 155;
         int var10005 = this.height - 24 - 6;
         var2 = field_930;
         var10001.method_748(1, var10004, var10005, 150, 20, class_1450.method_7896("gui.done", new Object[0]));
         var4.add(var10001);
         var4 = this.buttonList;
         var10001 = new bcb;
         var10001.method_748(2, this.width / 2 + 5, this.height - 24 - 6, 150, 20, class_1450.method_7896("options.stream.ingest.reset", new Object[0]));
         var4.add(var10001);
      }

   }

   // $FF: renamed from: m () void
   public void method_872() {
      String[] var1 = class_752.method_4253();
      class_51 var10000 = this.field_557.method_5297();
      if(var1 != null) {
         if(!var10000.method_208()) {
            return;
         }

         var10000 = this.field_557.method_5297();
      }

      var10000.method_207().method_8561();
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.field_451;
      if(var2 != null) {
         if(!var1.field_451) {
            return;
         }

         var10000 = var1.field_450;
      }

      if(var10000 == 1) {
         this.field_557.method_5236(this.field_926);
         if(var2 != null) {
            return;
         }
      }

      this.field_557.canLoseFocus7.field_4528 = "";
      this.field_557.canLoseFocus7.method_5358();
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_873();
      this.field_928.method_5570(var1, var2, var3);
      this.drawCenteredString(this.fontRendererObj, this.field_927, this.width / 2, 20, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: a (l0) kU
   static FontRenderer method_1105(class_204 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: b (l0) kU
   static FontRenderer method_1106(class_204 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: c (l0) kU
   static FontRenderer method_1107(class_204 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: d (l0) kU
   static FontRenderer method_1108(class_204 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: e (l0) kU
   static FontRenderer method_1109(class_204 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: f (l0) kU
   static FontRenderer method_1110(class_204 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: g (l0) kU
   static FontRenderer method_1111(class_204 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: h (l0) kU
   static FontRenderer method_1112(class_204 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1113() {
      // $FF: Couldn't be decompiled
   }
}
