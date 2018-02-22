package ca.diiza.f;

import ca.diiza.f.class_209;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: ca.diiza.f.o
public class class_212 extends bdw {

   // $FF: renamed from: b int
   public int field_1013;


   // $FF: renamed from: <init> () void
   public void method_651() {
      super.method_651();
   }

   // $FF: renamed from: b () void
   public void initGui() {
      super.initGui();
      this.field_1013 = this.field_557.enableBackgroundDrawing4.FONT_HEIGHT;
   }

   // $FF: renamed from: m () void
   public void method_872() {
      super.method_872();
      Keyboard.enableRepeatEvents(false);
   }

   // $FF: renamed from: e () void
   public void method_871() {
      super.method_871();
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      super.method_856(var1, var2);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      super.method_865(var1);
   }

   // $FF: renamed from: b (bmh, double, double, double, double, float, float, float, float) void
   public void method_1168(bmh var1, double var2, double var4, double var6, double var8, float var10, float var11, float var12, float var13) {
      GL11.glEnable(3042);
      GL11.glDisable(3553);
      var1.setVisible2();
      GL11.glColor4f(var10, var11, var12, var13);
      var1.addVertexWithUV(var2, var8, (double)this.field_372, 0.0D, 1.0D);
      var1.addVertexWithUV(var4, var8, (double)this.field_372, 1.0D, 1.0D);
      var1.addVertexWithUV(var4, var6, (double)this.field_372, 1.0D, 0.0D);
      var1.addVertexWithUV(var2, var6, (double)this.field_372, 0.0D, 0.0D);
      var1.getVisible8();
      GL11.glEnable(3553);
      GL11.glDisable(3042);
   }

   // $FF: renamed from: b (bmh, double, double, double, double, float, float, float, float, float, float, float, float, float) void
   public void method_1169(bmh var1, double var2, double var4, double var6, double var8, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18) {
      this.method_1168(var1, var2 + (double)var14, var4 - (double)var14, var6 + (double)var14, var8 - (double)var14, var10, var11, var12, var13);
      this.method_1168(var1, var2, var4, var6, var6 + (double)var14, var15, var16, var17, var18);
      this.method_1168(var1, var2, var4, var8 - (double)var14, var8, var15, var16, var17, var18);
      this.method_1168(var1, var2, var2 + (double)var14, var6, var8, var15, var16, var17, var18);
      this.method_1168(var1, var4 - (double)var14, var4, var6, var8, var15, var16, var17, var18);
   }

   // $FF: renamed from: c (add, int, int) void
   public void method_1170(add var1, int var2, int var3) {
      GL11.glEnable('\u803a');
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      bam.method_5213();
      bam.method_5216();
      field_556.field_3806 = 200.0F;
      field_556.method_4756(this.fontRendererObj, this.field_557.method_5288(), var1, var2, var3);
      field_556.method_4759(this.fontRendererObj, this.field_557.method_5288(), var1, var2, var3, var1.field_2958 + "");
      bam.method_5212();
      GL11.glDisable('\u803a');
   }

   // $FF: renamed from: d (add, int, int) void
   public void method_1171(add var1, int var2, int var3) {
      GL11.glEnable('\u803a');
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      bam.method_5213();
      bam.method_5216();
      field_556.field_3806 = 200.0F;
      field_556.method_4756(this.fontRendererObj, this.field_557.method_5288(), var1, var2, var3);
      this.field_557.method_5288().bindTexture(bpz.field_7758);
      bam.method_5212();
      GL11.glDisable('\u803a');
   }

   // $FF: renamed from: b (add, int, int, int) void
   public void method_1172(add var1, int var2, int var3, int var4) {
      GL11.glEnable('\u803a');
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      bam.method_5213();
      bam.method_5216();
      field_556.field_3806 = 200.0F;
      field_556.method_4756(this.fontRendererObj, this.field_557.method_5288(), var1, var3, var4);
      field_556.method_4759(this.fontRendererObj, this.field_557.method_5288(), var1, var3, var4, var2 + "");
      bam.method_5212();
      GL11.glDisable('\u803a');
   }

   // $FF: renamed from: b (add, int, int, float) void
   public void method_1173(add var1, int var2, int var3, float var4) {
      GL11.glEnable('\u803a');
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      bam.method_5213();
      bam.method_5216();
      float var5 = field_556.field_3806;
      field_556.field_3806 = var4;
      field_556.method_4756(this.fontRendererObj, this.field_557.method_5288(), var1, var2, var3);
      field_556.method_4759(this.fontRendererObj, this.field_557.method_5288(), var1, var2, var3, var1.field_2958 + "");
      bam.method_5212();
      GL11.glDisable('\u803a');
      field_556.field_3806 = var5;
   }

   // $FF: renamed from: e (add, int, int) void
   protected void method_1174(add var1, int var2, int var3) {
      int var10000 = class_209.method_1160();
      List var5 = var1.method_3774(this.field_557.cursorCounter8, this.field_557.canLoseFocus7.field_4506);
      int var6 = 0;
      int var4 = var10000;

      while(true) {
         if(var6 < var5.size()) {
            var10000 = var6;
            if(var4 != 0) {
               break;
            }

            label101: {
               if(var6 == 0) {
                  var5.set(var6, var1.method_3776().field_354 + (String)var5.get(var6));
                  if(var4 == 0) {
                     break label101;
                  }
               }

               var5.set(var6, class_130.field_283 + (String)var5.get(var6));
            }

            ++var6;
            if(var4 == 0) {
               continue;
            }
         }

         var10000 = var5.isEmpty();
         break;
      }

      if(var4 == 0) {
         if(var10000 != 0) {
            return;
         }

         GL11.glDisable('\u803a');
         bam.method_5212();
         GL11.glDisable(2896);
         GL11.glDisable(2929);
         var10000 = 0;
      }

      var6 = var10000;
      Iterator var7 = var5.iterator();

      int var8;
      int var10001;
      while(true) {
         if(var7.hasNext()) {
            label82: {
               String var9 = (String)var7.next();
               var8 = this.fontRendererObj.getCharWidth(var9);
               var10000 = var8;
               if(var4 == 0) {
                  var10001 = var6;
                  if(var4 != 0) {
                     break;
                  }

                  if(var8 <= var6) {
                     break label82;
                  }

                  var10000 = var8;
               }

               var6 = var10000;
            }

            if(var4 == 0) {
               continue;
            }
         }

         var10000 = var2;
         var10001 = 12;
         break;
      }

      int var16 = var10000 + var10001;
      var8 = var3 - 12;
      int var10 = 8;
      var10000 = var5.size();
      var10001 = 1;
      if(var4 == 0) {
         if(var10000 > 1) {
            var10 += 2 + (var5.size() - 1) * 10;
         }

         var10000 = var16 + var6;
         var10001 = this.width;
      }

      label113: {
         if(var4 == 0) {
            if(var10000 > var10001) {
               var16 -= 28 + var6;
            }

            var10000 = var8 + var10 + 6;
            if(var4 != 0) {
               break label113;
            }

            var10001 = this.height;
         }

         if(var10000 > var10001) {
            var8 = this.height - var10 - 6;
         }

         this.field_372 = 300.0F;
         field_556.field_3806 = 300.0F;
         var10000 = -267386864;
      }

      int var11 = var10000;
      this.drawGradientRect(var16 - 3, var8 - 4, var16 + var6 + 3, var8 - 3, var11, var11);
      this.drawGradientRect(var16 - 3, var8 + var10 + 3, var16 + var6 + 3, var8 + var10 + 4, var11, var11);
      this.drawGradientRect(var16 - 3, var8 - 3, var16 + var6 + 3, var8 + var10 + 3, var11, var11);
      this.drawGradientRect(var16 - 4, var8 - 3, var16 - 3, var8 + var10 + 3, var11, var11);
      this.drawGradientRect(var16 + var6 + 3, var8 - 3, var16 + var6 + 4, var8 + var10 + 3, var11, var11);
      int var12 = 1347420415;
      int var13 = (var12 & 16711422) >> 1 | var12 & -16777216;
      this.drawGradientRect(var16 - 3, var8 - 3 + 1, var16 - 3 + 1, var8 + var10 + 3 - 1, var12, var13);
      this.drawGradientRect(var16 + var6 + 2, var8 - 3 + 1, var16 + var6 + 3, var8 + var10 + 3 - 1, var12, var13);
      this.drawGradientRect(var16 - 3, var8 - 3, var16 + var6 + 3, var8 - 3 + 1, var12, var12);
      this.drawGradientRect(var16 - 3, var8 + var10 + 2, var16 + var6 + 3, var8 + var10 + 3, var13, var13);
      int var14 = 0;

      while(true) {
         if(var14 < var5.size()) {
            String var15 = (String)var5.get(var14);
            this.fontRendererObj.drawStringWithShadow(var15, var16, var8, -1);
            if(var4 != 0) {
               break;
            }

            if(var4 == 0) {
               if(var14 == 0) {
                  var8 += 2;
               }

               var8 += 10;
               ++var14;
            }

            if(var4 == 0) {
               continue;
            }
         }

         this.field_372 = 0.0F;
         break;
      }

      field_556.field_3806 = 0.0F;
   }

   // $FF: renamed from: b (java.lang.String, int, int, int) void
   public void method_1175(String var1, int var2, int var3, int var4) {
      this.drawCenteredString(this.fontRendererObj, var1, var2, var3, var4);
   }
}
