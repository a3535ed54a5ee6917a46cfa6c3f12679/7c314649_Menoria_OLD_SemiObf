import java.util.List;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: lF
public class class_195 extends bdw implements class_37 {

   // $FF: renamed from: b on
   private static class_811 field_817;
   // $FF: renamed from: i bdw
   protected bdw field_818;
   // $FF: renamed from: r java.lang.String
   protected String field_819;
   // $FF: renamed from: s mn
   private class_965 field_820;
   // $FF: renamed from: t mr
   private class_962 field_821;
   // $FF: renamed from: u mq
   private class_963 field_822;
   // $FF: renamed from: v mo
   private class_964 field_823;
   // $FF: renamed from: w vd
   private class_1699 field_824;
   // $FF: renamed from: x bcm
   private bcm field_825;
   // $FF: renamed from: y boolean
   private boolean field_826;
   // $FF: renamed from: z java.lang.String
   private static final String field_827;
   // $FF: renamed from: A java.lang.String[]
   private static final String[] field_828;


   // $FF: renamed from: <init> (bdw, vd) void
   public void method_1038(bdw var1, class_1699 var2) {
      super.method_651();
      String[] var10001 = field_828;
      this.field_819 = "Select world";
      this.field_826 = true;
      this.field_818 = var1;
      this.field_824 = var2;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      String[] var10001 = field_828;
      this.field_819 = class_1450.method_7896("gui.stats", new Object[0]);
      class_1436 var10000 = this.field_557.method_5267();
      class_276 var1 = new class_276;
      var1.method_1586(class_913.field_4599);
      var10000.method_7821(var1);
   }

   // $FF: renamed from: a () void
   public void method_1039() {
      String[] var10000 = class_752.method_4253();
      List var10001 = this.buttonList;
      bcb var10002 = new bcb;
      int var10005 = this.width / 2 + 4;
      int var10006 = this.height - 28;
      String[] var5 = field_828;
      var10002.method_748(0, var10005, var10006, 150, 20, class_1450.method_7896("gui.done", new Object[0]));
      var10001.add(var10002);
      var10001 = this.buttonList;
      var10002 = new bcb;
      var10002.method_748(1, this.width / 2 - 160, this.height - 52, 80, 20, class_1450.method_7896("stat.generalButton", new Object[0]));
      var10001.add(var10002);
      String[] var1 = var10000;
      List var6 = this.buttonList;
      bcb var8 = new bcb;
      var8.method_748(2, this.width / 2 - 80, this.height - 52, 80, 20, class_1450.method_7896("stat.blocksButton", new Object[0]));
      bcb var2 = var8;
      var6.add(var8);
      var6 = this.buttonList;
      var8 = new bcb;
      var8.method_748(3, this.width / 2, this.height - 52, 80, 20, class_1450.method_7896("stat.itemsButton", new Object[0]));
      bcb var3 = var8;
      var6.add(var8);
      var6 = this.buttonList;
      var8 = new bcb;
      var8.method_748(4, this.width / 2 + 80, this.height - 52, 80, 20, class_1450.method_7896("stat.mobsButton", new Object[0]));
      bcb var4 = var8;
      var6.add(var8);
      int var7 = this.field_822.method_5553();
      if(var1 != null) {
         if(var7 == 0) {
            var2.field_451 = false;
         }

         var7 = this.field_821.method_5553();
      }

      if(var1 != null) {
         if(var7 == 0) {
            var3.field_451 = false;
         }

         var7 = this.field_823.method_5553();
      }

      if(var7 == 0) {
         var4.field_451 = false;
      }

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

      if(var2 != null) {
         if(var10000 == 0) {
            this.field_557.method_5236(this.field_818);
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
      }

      byte var10001 = 1;
      if(var2 != null) {
         if(var10000 == 1) {
            this.field_825 = this.field_820;
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
         var10001 = 3;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_825 = this.field_821;
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
         var10001 = 2;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            this.field_825 = this.field_822;
            if(var2 != null) {
               return;
            }
         }

         var10000 = var1.field_450;
         var10001 = 4;
      }

      if(var10000 == var10001) {
         this.field_825 = this.field_823;
         if(var2 != null) {
            return;
         }
      }

      this.field_825.method_5569(var1);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      String[] var4 = class_752.method_4253();
      class_195 var10000 = this;
      if(var4 != null) {
         if(this.field_826) {
            this.method_873();
            String[] var10002 = field_828;
            this.drawCenteredString(this.fontRendererObj, class_1450.method_7896("multiplayer.downloadingStats", new Object[0]), this.width / 2, this.height / 2, 16777215);
            this.drawCenteredString(this.fontRendererObj, field_7[(int)(bao.method_5283() / 150L % (long)field_7.length)], this.width / 2, this.height / 2 + this.fontRendererObj.FONT_HEIGHT * 2, 16777215);
            if(var4 != null) {
               return;
            }
         }

         this.field_825.method_5570(var1, var2, var3);
         this.drawCenteredString(this.fontRendererObj, this.field_819, this.width / 2, 20, 16777215);
         var10000 = this;
      }

      var10000.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: f () void
   public void method_163() {
      String[] var1 = class_752.method_4253();
      class_195 var10000 = this;
      if(var1 != null) {
         if(!this.field_826) {
            return;
         }

         class_965 var10001 = new class_965;
         var10001.method_5588(this);
         this.field_820 = var10001;
         this.field_820.method_5563(1, 1);
         class_962 var2 = new class_962;
         var2.method_5581(this);
         this.field_821 = var2;
         this.field_821.method_5563(1, 1);
         class_963 var3 = new class_963;
         var3.method_5581(this);
         this.field_822 = var3;
         this.field_822.method_5563(1, 1);
         class_964 var4 = new class_964;
         var4.method_5587(this);
         this.field_823 = var4;
         this.field_823.method_5563(1, 1);
         this.field_825 = this.field_820;
         this.method_1039();
         var10000 = this;
      }

      var10000.field_826 = false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_876() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_826;
      if(var1 != null) {
         var10000 = !this.field_826;
      }

      return var10000;
   }

   // $FF: renamed from: b (int, int, adb) void
   private void method_1040(int var1, int var2, adb var3) {
      this.method_1041(var1 + 1, var2 + 1);
      GL11.glEnable('\u803a');
      bam.method_5216();
      class_811 var10000 = field_817;
      FontRenderer var10001 = this.fontRendererObj;
      bqf var10002 = this.field_557.method_5288();
      add var10003 = new add;
      var10003.method_3726(var3, 1, 0);
      var10000.method_4755(var10001, var10002, var10003, var1 + 2, var2 + 2);
      bam.method_5212();
      GL11.glDisable('\u803a');
   }

   // $FF: renamed from: a (int, int) void
   private void method_1041(int var1, int var2) {
      this.method_1042(var1, var2, 0, 0);
   }

   // $FF: renamed from: a (int, int, int, int) void
   private void method_1042(int var1, int var2, int var3, int var4) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_557.method_5288().bindTexture(field_370);
      float var5 = 0.0078125F;
      float var6 = 0.0078125F;
      boolean var7 = true;
      boolean var8 = true;
      bmh var9 = bmh.instance;
      var9.setVisible2();
      var9.addVertexWithUV((double)(var1 + 0), (double)(var2 + 18), (double)this.field_372, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var9.addVertexWithUV((double)(var1 + 18), (double)(var2 + 18), (double)this.field_372, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var9.addVertexWithUV((double)(var1 + 18), (double)(var2 + 0), (double)this.field_372, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var9.addVertexWithUV((double)(var1 + 0), (double)(var2 + 0), (double)this.field_372, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var9.getVisible8();
   }

   // $FF: renamed from: b (lF, int, int, int, int) void
   static void method_1043(class_195 var0, int var1, int var2, int var3, int var4) {
      var0.method_1042(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (lF) vd
   static class_1699 method_1044(class_195 var0) {
      return var0.field_824;
   }

   // $FF: renamed from: b (lF) kU
   static FontRenderer method_1045(class_195 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: c (lF) kU
   static FontRenderer method_1046(class_195 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: d (lF) kU
   static FontRenderer method_1047(class_195 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: e (lF) kU
   static FontRenderer method_1048(class_195 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: f (lF) kU
   static FontRenderer method_1049(class_195 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: b (lF, int, int, int, int, int, int) void
   static void method_1050(class_195 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var0.drawGradientRect(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: g (lF) kU
   static FontRenderer method_1051(class_195 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: h (lF) kU
   static FontRenderer method_1052(class_195 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: c (lF, int, int, int, int, int, int) void
   static void method_1053(class_195 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      var0.drawGradientRect(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: i (lF) kU
   static FontRenderer method_1054(class_195 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: b (lF, int, int, adb) void
   static void method_1055(class_195 var0, int var1, int var2, adb var3) {
      var0.method_1040(var1, var2, var3);
   }

   // $FF: renamed from: j (lF) kU
   static FontRenderer method_1056(class_195 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: k (lF) kU
   static FontRenderer method_1057(class_195 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: l (lF) kU
   static FontRenderer method_1058(class_195 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: m (lF) kU
   static FontRenderer method_1059(class_195 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: n (lF) kU
   static FontRenderer method_1060(class_195 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: o (lF) kU
   static FontRenderer method_1061(class_195 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: p (lF) kU
   static FontRenderer method_1062(class_195 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: r (lF) kU
   static FontRenderer method_1063(class_195 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: s (lF) kU
   static FontRenderer method_1064(class_195 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: t (lF) kU
   static FontRenderer method_1065(class_195 var0) {
      return var0.fontRendererObj;
   }

   // $FF: renamed from: <clinit> () void
   static void method_164() {
      // $FF: Couldn't be decompiled
   }
}
