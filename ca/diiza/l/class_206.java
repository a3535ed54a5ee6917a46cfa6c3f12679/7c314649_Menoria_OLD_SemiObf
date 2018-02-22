package ca.diiza.l;

import ca.diiza.l.class_13;
import ca.diiza.l.class_154;
import ca.diiza.l.class_155;
import ca.diiza.l.class_156;
import ca.diiza.l.class_205;
import ca.diiza.l.class_860;
import ca.diiza.l.class_862;
import java.util.List;
import org.lwjgl.input.Keyboard;

// $FF: renamed from: ca.diiza.l.f
public class class_206 extends bdw implements class_13 {

   // $FF: renamed from: b ca.diiza.l.g
   private class_205 field_957;
   // $FF: renamed from: i ca.diiza.l.n
   private class_862 field_958;
   // $FF: renamed from: r ca.diiza.l.n
   private class_862 field_959;
   // $FF: renamed from: s ca.diiza.l.d
   private class_154 field_960;
   // $FF: renamed from: t ca.diiza.l.d
   private class_154 field_961;
   // $FF: renamed from: u ca.diiza.l.d
   private class_154 field_962;
   // $FF: renamed from: v ca.diiza.l.d
   private class_154 field_963;
   // $FF: renamed from: w ca.diiza.l.b[]
   private class_156[] field_964;
   // $FF: renamed from: x ca.diiza.l.c
   private class_155 field_965;
   // $FF: renamed from: y ca.diiza.l.c
   private class_155 field_966;
   // $FF: renamed from: z java.lang.String[]
   private static final String[] field_967;


   // $FF: renamed from: <init> (bao, ca.diiza.l.n) void
   public void method_1130(bao var1, class_862 var2) {
      int var10000 = class_862.method_5031();
      super.method_651();
      int var3 = var10000;
      this.field_958 = var2;
      class_862 var10001;
      if(var2 == null) {
         var10001 = null;
      } else {
         var10001 = new class_862;
         var10001.method_5025(var2);
      }

      String var4;
      int var5;
      int var6;
      int var7;
      label66: {
         this.field_959 = var10001;
         class_862 var11 = var2;
         if(var3 == 0) {
            if(var2 == null) {
               var4 = "";
               bjk var8 = var1.cursorCounter8;
               var5 = class_1715.method_9561(var8.field_2994);
               var6 = class_1715.method_9561(var8.field_2996);
               var7 = class_1715.method_9561(var8.field_2995) - 1;
               if(var3 == 0) {
                  break label66;
               }
            }

            var11 = var2;
         }

         var4 = var11.field_4144;
         var5 = var2.field_4145;
         var6 = var2.field_4147;
         var7 = var2.field_4146;
      }

      class_154 var13 = new class_154;
      var13.method_792(var4);
      this.field_960 = var13;
      this.field_960.method_798(0);
      this.field_960.method_793();
      var13 = new class_154;
      var13.method_792(Integer.toString(var5));
      this.field_961 = var13;
      this.field_961.method_798(1);
      var13 = new class_154;
      var13.method_792(Integer.toString(var6));
      this.field_963 = var13;
      this.field_963.method_798(1);
      var13 = new class_154;
      var13.method_792(Integer.toString(var7));
      this.field_962 = var13;
      this.field_962.method_798(2);
      this.field_960.method_802(this.field_961);
      this.field_960.method_803(this.field_963);
      this.field_961.method_802(this.field_963);
      this.field_961.method_803(this.field_960);
      this.field_963.method_802(this.field_962);
      this.field_963.method_803(this.field_961);
      this.field_962.method_802(this.field_960);
      this.field_962.method_803(this.field_963);
      this.field_964 = new class_156[3];
      int var10 = 0;

      class_156 var12;
      double var14;
      while(true) {
         if(var10 < 3) {
            var12 = new class_156;
            var12.method_809(0, 0, 0, 118, 10);
            class_156 var9 = var12;
            var9.method_818(0.0F);
            var9.method_816(255.0F);
            var9.method_820(0.0F);
            var9.method_829(10.0F);
            var9.field_525 = 1;
            this.field_964[var10] = var9;
            ++var10;
            if(var3 != 0) {
               break;
            }

            if(var3 == 0) {
               continue;
            }
         }

         label50: {
            var12 = this.field_964[0];
            var10001 = var2;
            if(var3 == 0) {
               if(var2 == null) {
                  var14 = Math.random();
                  break label50;
               }

               var10001 = var2;
            }

            var14 = (double)var10001.field_4149;
         }

         var12.method_814((float)var14 * 255.0F);
         break;
      }

      label44: {
         var12 = this.field_964[1];
         var10001 = var2;
         if(var3 == 0) {
            if(var2 == null) {
               var14 = Math.random();
               break label44;
            }

            var10001 = var2;
         }

         var14 = (double)var10001.field_4150;
      }

      label38: {
         var12.method_814((float)var14 * 255.0F);
         var12 = this.field_964[2];
         var10001 = var2;
         if(var3 == 0) {
            if(var2 == null) {
               var14 = Math.random();
               break label38;
            }

            var10001 = var2;
         }

         var14 = (double)var10001.field_4151;
      }

      var12.method_814((float)var14 * 255.0F);
   }

   // $FF: renamed from: <init> (ca.diiza.l.g, ca.diiza.l.n) void
   public void method_1131(class_205 var1, class_862 var2) {
      this.method_1130(var1.method_1128(), var2);
      this.field_957 = var1;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      int var10000 = class_862.method_5030();
      Keyboard.enableRepeatEvents(true);
      int var1 = var10000;
      int var2 = 0;

      while(true) {
         if(var2 < 3) {
            this.field_964[var2].field_447 = this.width - 150 >> 1;
            this.field_964[var2].field_448 = this.height / 2 + 20 + var2 * 10;
            this.buttonList.add(this.field_964[var2]);
            ++var2;
            if(var1 == 0) {
               break;
            }

            if(var1 != 0) {
               continue;
            }
         }

         this.field_960.method_801(this.width - 150 >> 1, this.height / 2 - 40, 150, 9);
         this.field_961.method_801(this.width - 10 >> 1, this.height / 2 - 20, 80, 9);
         this.field_963.method_801(this.width - 10 >> 1, this.height / 2 - 10, 80, 9);
         this.field_962.method_801(this.width - 10 >> 1, this.height / 2, 80, 9);
         this.buttonList.add(this.field_960);
         this.buttonList.add(this.field_961);
         this.buttonList.add(this.field_963);
         this.buttonList.add(this.field_962);
         class_155 var10001 = new class_155;
         int var10004 = this.width / 2 - 65;
         int var10005 = this.height / 2 + 58;
         String[] var3 = field_967;
         var10001.method_748(0, var10004, var10005, 60, 14, "OK");
         this.field_965 = var10001;
         var10001 = new class_155;
         var10001.method_748(1, this.width / 2 + 5, this.height / 2 + 58, 60, 14, "Annuler");
         this.field_966 = var10001;
         this.buttonList.add(this.field_965);
         this.buttonList.add(this.field_966);
         break;
      }

   }

   // $FF: renamed from: m () void
   public void method_872() {
      Keyboard.enableRepeatEvents(false);
      super.method_872();
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      int var6 = class_1715.method_9561(this.field_557.cursorCounter8.field_2994);
      int var7 = class_1715.method_9561(this.field_557.cursorCounter8.field_2996);
      int var10000 = class_862.method_5030();
      int var8 = class_1715.method_9561(this.field_557.cursorCounter8.field_2995);
      this.field_961.method_807(var6);
      this.field_963.method_807(var7);
      int var4 = var10000;
      this.field_962.method_807(var8);
      String[] var18 = field_967;
      String var9 = "Waypoint Edit";
      int var10 = this.fontRendererObj.getCharWidth(var9);
      int var11 = this.width - var10 >> 1;
      int var12 = this.width + var10 >> 1;
      drawRect(var11 - 2, this.height / 2 - 71, var12 + 2, this.height / 2 - 57, -1610612736);
      this.drawCenteredString(this.fontRendererObj, var9, this.width / 2, this.height / 2 - 70 + 2, -1);
      drawRect((this.width - 150) / 2 - 2, this.height / 2 - 50, (this.width + 150) / 2 + 2, this.height / 2 + 52, -1610612736);
      String var19 = Integer.toString(var6);
      if(var4 != 0) {
         if(var19.equals(this.field_961.field_449)) {
            var19 = "X: (Actuel)";
         } else {
            var18 = field_967;
            var19 = "X:";
         }
      }

      String var13 = var19;
      this.method_657(this.fontRendererObj, var13, (this.width - 150) / 2 + 1, this.height / 2 - 19, -4144960);
      var19 = Integer.toString(var7);
      if(var4 != 0) {
         if(var19.equals(this.field_963.field_449)) {
            var18 = field_967;
            var19 = "Z: (Actuel)";
         } else {
            var18 = field_967;
            var19 = "Z:";
         }
      }

      var13 = var19;
      this.method_657(this.fontRendererObj, var13, (this.width - 150) / 2 + 1, this.height / 2 - 9, -4144960);
      var19 = Integer.toString(var8);
      if(var4 != 0) {
         if(var19.equals(this.field_962.field_449)) {
            var18 = field_967;
            var19 = "Y: (Actuel)";
         } else {
            var18 = field_967;
            var19 = "Y:";
         }
      }

      var13 = var19;
      this.method_657(this.fontRendererObj, var13, (this.width - 150) / 2 + 1, this.height / 2 + 1, -4144960);
      var18 = field_967;
      this.drawCenteredString(this.fontRendererObj, "Nom du Waypoint", this.width >> 1, this.height / 2 - 49, -4144960);
      this.drawCenteredString(this.fontRendererObj, "Coordonnées", this.width >> 1, this.height / 2 - 29, -4144960);
      this.drawCenteredString(this.fontRendererObj, "Couleur", this.width >> 1, this.height / 2 + 11, -4144960);
      class_206 var20 = this;
      if(var4 != 0) {
         if(this.field_958 != null) {
            this.field_958.field_4149 = this.field_964[0].method_815() / 255.0F;
            this.field_958.field_4150 = this.field_964[1].method_815() / 255.0F;
            this.field_958.field_4151 = this.field_964[2].method_815() / 255.0F;
         }

         var20 = this;
      }

      int var14 = (int)var20.field_964[0].method_815() & 255;
      int var15 = (int)this.field_964[1].method_815() & 255;
      int var16 = (int)this.field_964[2].method_815() & 255;
      int var17 = -16777216 | var14 << 16 | var15 << 8 | var16;
      var18 = field_967;
      this.drawCenteredString(this.fontRendererObj, String.format("R: %03d", new Object[]{Integer.valueOf(var14)}), this.width / 2 - 15, this.height / 2 + 21, -2139062144);
      this.drawCenteredString(this.fontRendererObj, String.format("G: %03d", new Object[]{Integer.valueOf(var15)}), this.width / 2 - 15, this.height / 2 + 31, -2139062144);
      this.drawCenteredString(this.fontRendererObj, String.format("B: %03d", new Object[]{Integer.valueOf(var16)}), this.width / 2 - 15, this.height / 2 + 41, -2139062144);
      drawRect(this.width + 90 >> 1, this.height / 2 + 20, this.width + 150 >> 1, this.height / 2 + 50, var17);
      super.drawScreen(var1, var2, var3);
      if(var4 == 0) {
         int var5 = class_689.method_3976();
         ++var5;
         class_689.method_3975(var5);
      }

   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      int var3 = class_862.method_5030();
      int var10000 = var2;
      byte var10001 = 1;
      if(var3 != 0) {
         if(var2 == 1) {
            this.method_1132();
            if(var3 != 0) {
               return;
            }
         }

         var10000 = var2;
         var10001 = 28;
      }

      if(var10000 == var10001) {
         label21: {
            class_154 var4 = class_154.method_806();
            if(var3 != 0) {
               if(var4 != this.field_963) {
                  break label21;
               }

               var4 = this.field_963;
            }

            var4.method_797();
            this.method_1133();
            if(var3 != 0) {
               return;
            }
         }
      }

      class_154.method_794(this.field_557, var1, var2);
   }

   // $FF: renamed from: a () void
   private void method_1132() {
      int var1 = class_862.method_5030();
      class_206 var10000 = this;
      if(var1 != 0) {
         if(this.field_958 != null) {
            this.field_958.method_5026(this.field_959);
         }

         var10000 = this;
      }

      var10000.field_557.method_5236(this.field_957);
   }

   // $FF: renamed from: f () void
   private void method_1133() {
      label27: {
         int var1 = class_862.method_5030();
         class_206 var10000 = this;
         if(var1 != 0) {
            if(this.field_958 != null) {
               this.field_958.field_4144 = this.field_960.field_449;
               this.field_958.field_4145 = method_1134(this.field_961.field_449);
               this.field_958.field_4147 = method_1134(this.field_963.field_449);
               this.field_958.field_4146 = method_1134(this.field_962.field_449);
               this.field_958.field_4149 = this.field_964[0].method_815() / 255.0F;
               this.field_958.field_4150 = this.field_964[1].method_815() / 255.0F;
               this.field_958.field_4151 = this.field_964[2].method_815() / 255.0F;
               this.field_957.method_1124(this.field_958);
               if(var1 != 0) {
                  break label27;
               }
            }

            var10000 = this;
         }

         String var2 = var10000.field_960.field_449;
         int var3 = method_1134(this.field_961.field_449);
         int var4 = method_1134(this.field_963.field_449);
         int var5 = method_1134(this.field_962.field_449);
         float var6 = this.field_964[0].method_815() / 255.0F;
         float var7 = this.field_964[1].method_815() / 255.0F;
         float var8 = this.field_964[2].method_815() / 255.0F;
         class_862 var10001 = new class_862;
         var10001.method_5023(var2, var3, var5, var4, true, var6, var7, var8);
         this.field_958 = var10001;
         class_205 var11 = this.field_957;
         if(var1 != 0) {
            if(this.field_957 == null) {
               class_860 var9 = class_860.field_3998;
               List var10 = var9.method_4980();
               var10.add(this.field_958);
               var9.method_4981();
               if(var1 != 0) {
                  break label27;
               }
            }

            var11 = this.field_957;
         }

         var11.method_1122(this.field_958);
      }

      this.field_557.method_5236(this.field_957);
   }

   // $FF: renamed from: a (java.lang.String) int
   private static int method_1134(String var0) {
      try {
         return Integer.parseInt(var0);
      } catch (Exception var2) {
         return 0;
      }
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      int var2 = class_862.method_5030();
      bcb var10000 = var1;
      class_155 var10001 = this.field_965;
      if(var2 != 0) {
         if(var1 == this.field_965) {
            this.method_1133();
            if(var2 != 0) {
               return;
            }
         }

         var10000 = var1;
         var10001 = this.field_966;
      }

      if(var10000 == var10001) {
         this.method_1132();
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_1135() {
      // $FF: Couldn't be decompiled
   }
}
