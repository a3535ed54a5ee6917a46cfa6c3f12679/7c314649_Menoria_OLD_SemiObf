package net.minecraft.realms;

import java.util.List;
import net.minecraft.realms.RealmsAnvilLevelStorageSource;
import net.minecraft.realms.RealmsButton;
import net.minecraft.realms.RealmsEditBox;

public class RealmsScreen {

   public static final int SKIN_HEAD_U = 8;
   public static final int SKIN_HEAD_V = 8;
   public static final int SKIN_HEAD_WIDTH = 8;
   public static final int SKIN_HEAD_HEIGHT = 8;
   public static final int SKIN_TEX_WIDTH = 64;
   public static final int SKIN_TEX_HEIGHT = 32;
   public static final int SKIN_HAT_U = 40;
   public static final int SKIN_HAT_V = 8;
   public static final int SKIN_HAT_WIDTH = 8;
   public static final int SKIN_HAT_HEIGHT = 8;
   protected bao minecraft;
   public int width;
   public int height;
   private class_188 proxy;
   // $FF: renamed from: a boolean
   private static boolean field_2965;
   // $FF: renamed from: h java.lang.String
   private static final String field_2966;


   // $FF: renamed from: <init> () void
   public void method_3791() {
      super();
      class_188 var10001 = new class_188;
      var10001.method_988(this);
      this.proxy = var10001;
   }

   public class_188 getProxy() {
      return this.proxy;
   }

   public void init() {}

   public void init(bao var1, int var2, int var3) {}

   public void drawCenteredString(String var1, int var2, int var3, int var4) {
      this.proxy.method_990(var1, var2, var3, var4);
   }

   public void drawString(String var1, int var2, int var3, int var4) {
      this.proxy.method_991(var1, var2, var3, var4);
   }

   public void blit(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.proxy.method_658(var1, var2, var3, var4, var5, var6);
   }

   public static void blit(int var0, int var1, float var2, float var3, int var4, int var5, int var6, int var7, float var8, float var9) {
      Gui.method_661(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public static void blit(int var0, int var1, float var2, float var3, int var4, int var5, float var6, float var7) {
      Gui.method_660(var0, var1, var2, var3, var4, var5, var6, var7);
   }

   public void fillGradient(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.proxy.drawGradientRect(var1, var2, var3, var4, var5, var6);
   }

   public void renderBackground() {
      this.proxy.method_873();
   }

   public boolean isPauseScreen() {
      return this.proxy.method_876();
   }

   public void renderBackground(int var1) {
      this.proxy.method_874(var1);
   }

   public void render(int var1, int var2, float var3) {
      boolean var10000 = method_3793();
      int var5 = 0;
      boolean var4 = var10000;

      while(var5 < this.proxy.method_998().size()) {
         ((RealmsButton)this.proxy.method_998().get(var5)).render(var1, var2);
         ++var5;
         if(!var4) {
            break;
         }
      }

   }

   public void renderTooltip(add var1, int var2, int var3) {
      this.proxy.method_859(var1, var2, var3);
   }

   public void renderTooltip(String var1, int var2, int var3) {
      this.proxy.method_860(var1, var2, var3);
   }

   public void renderTooltip(List var1, int var2, int var3) {
      this.proxy.method_861(var1, var2, var3);
   }

   public static void bindFace(String var0) {
      bqx var2 = class_794.method_4665(var0);
      boolean var1 = method_3794();
      bqx var10000 = var2;
      if(!var1) {
         if(var2 == null) {
            var2 = class_794.method_4665(field_2966);
         }

         var10000 = var2;
      }

      class_794.method_4664(var10000, var0);
      bao.method_5273().method_5288().bindTexture(var2);
   }

   public static void bind(String var0) {
      bqx var10000 = new bqx;
      var10000.method_8227(var0);
      bqx var1 = var10000;
      bao.method_5273().method_5288().bindTexture(var1);
   }

   public void tick() {}

   public int width() {
      return this.proxy.width;
   }

   public int height() {
      return this.proxy.height;
   }

   public int fontLineHeight() {
      return this.proxy.method_992();
   }

   public int fontWidth(String var1) {
      return this.proxy.method_993(var1);
   }

   public void fontDrawShadow(String var1, int var2, int var3, int var4) {
      this.proxy.method_994(var1, var2, var3, var4);
   }

   public List fontSplit(String var1, int var2) {
      return this.proxy.method_995(var1, var2);
   }

   public void buttonClicked(RealmsButton var1) {}

   public static RealmsButton newButton(int var0, int var1, int var2, String var3) {
      RealmsButton var10000 = new RealmsButton;
      var10000.getBlock72(var0, var1, var2, var3);
      return var10000;
   }

   public static RealmsButton newButton(int var0, int var1, int var2, int var3, int var4, String var5) {
      RealmsButton var10000 = new RealmsButton;
      var10000.getBlock73(var0, var1, var2, var3, var4, var5);
      return var10000;
   }

   public void buttonsClear() {
      this.proxy.method_996();
   }

   public void buttonsAdd(RealmsButton var1) {
      this.proxy.method_997(var1);
   }

   public List buttons() {
      return this.proxy.method_998();
   }

   public void buttonsRemove(RealmsButton var1) {
      this.proxy.method_999(var1);
   }

   public RealmsEditBox newEditBox(int var1, int var2, int var3, int var4) {
      RealmsEditBox var10000 = new RealmsEditBox;
      var10000.getBlock69(var1, var2, var3, var4);
      return var10000;
   }

   public void mouseClicked(int var1, int var2, int var3) {}

   public void mouseEvent() {}

   public void keyboardEvent() {}

   public void mouseReleased(int var1, int var2, int var3) {}

   public void mouseDragged(int var1, int var2, int var3, long var4) {}

   public void keyPressed(char var1, int var2) {}

   public void confirmResult(boolean var1, int var2) {}

   public static String getLocalizedString(String var0) {
      return class_1450.method_7896(var0, new Object[0]);
   }

   public static String getLocalizedString(String var0, Object ... var1) {
      return class_1450.method_7896(var0, var1);
   }

   public RealmsAnvilLevelStorageSource getLevelStorageSource() {
      RealmsAnvilLevelStorageSource var10000 = new RealmsAnvilLevelStorageSource;
      var10000.method_10048(bao.method_5273().method_5235());
      return var10000;
   }

   public void removed() {}

   // $FF: renamed from: a (boolean) void
   public static void method_3792(boolean var0) {
      field_2965 = var0;
   }

   // $FF: renamed from: a () boolean
   public static boolean method_3793() {
      return field_2965;
   }

   // $FF: renamed from: b () boolean
   public static boolean method_3794() {
      boolean var0 = method_3793();
      return !var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3795() {
      method_3792(true);
      boolean var10000 = true;
      char[] var10003 = "p±,?".toCharArray();
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
            field_2966 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 89;
            break;
         case 1:
            var10009 = 153;
            break;
         case 2:
            var10009 = 160;
            break;
         case 3:
            var10009 = 60;
            break;
         case 4:
            var10009 = 168;
            break;
         case 5:
            var10009 = 13;
            break;
         default:
            var10009 = 6;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
