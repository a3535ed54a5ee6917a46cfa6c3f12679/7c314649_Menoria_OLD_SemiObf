package ca.diiza.f;

import ca.diiza.f.class_209;
import ca.diiza.k.class_602;
import ca.diiza.v.a.class_1009;
import ca.diiza.v.b.class_135;
import java.util.Random;
import net.minecraft.item.ItemSuperBow;
// $FF: renamed from: ca.diiza.f.r
public class GuiCConnecting extends Gui {

   // $FF: renamed from: b bqx
   private static final bqx field_1004;
   // $FF: renamed from: i long
   private transient long updateCounter;
   // $FF: renamed from: r java.lang.String
   public String field_1006;
   // $FF: renamed from: s java.lang.String
   public String field_1007;
   // $FF: renamed from: t java.lang.String
   public String field_1008;
   // $FF: renamed from: u java.lang.String
   public String field_1009;
   // $FF: renamed from: v int
   public int field_1010;
   // $FF: renamed from: w int
   private int field_1011;
   // $FF: renamed from: x java.lang.String[]
   private static final String[] field_1012;


   // $FF: renamed from: <init> () void
   public void method_651() {
      super.method_651();
      this.updateCounter = 0L;
      String[] var1 = field_1012;
      this.field_1006 = "§6Menoria - Faction";
      this.field_1007 = "§fConnexion à :";
      this.field_1008 = "Connexion en cours...";
      this.field_1009 = "play.menoria.com";
      this.field_1010 = 25565;
      this.field_1011 = (new Random()).nextInt(7) + 1;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      ItemSuperBow.arrowType = class_1009.NORMAL;
      class_602.method_3253((class_602)null);
      class_135.field_358 = null;
      class_135.field_359 = null;
      class_135.field_360 = "";
      class_135.field_361 = 0.0D;
      class_135.field_362 = 0.0D;
      class_135.field_363 = 0L;
   }

   // $FF: renamed from: a () void
   public void method_1164() {
      this.field_557.method_5288().bindTexture(field_1004);
      bmh var1 = bmh.instance;
      var1.setVisible2();
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      var1.setVisible7(1.0F, 1.0F, 1.0F, 1.0F);
      var1.addVertexWithUV(0.0D, 0.0D, (double)this.field_372, 0.0D, 0.0D);
      var1.addVertexWithUV(0.0D, (double)this.height, (double)this.field_372, 0.0D, 1.0D);
      var1.addVertexWithUV((double)this.width, (double)this.height, (double)this.field_372, 1.0D, 1.0D);
      var1.addVertexWithUV((double)this.width, 0.0D, (double)this.field_372, 1.0D, 0.0D);
      var1.getVisible8();
   }

   // $FF: renamed from: e () void
   public void method_871() {
      bao var2;
      GuiCConnecting var3;
      label25: {
         int var10000 = class_209.method_1160();
         super.method_871();
         int var1 = var10000;
         this.updateCounter += 2L;
         long var5;
         var10000 = (var5 = this.updateCounter - 100L) == 0L?0:(var5 < 0L?-1:1);
         if(var1 == 0) {
            if(var10000 == 0) {
               var2 = this.field_557;
               class_182 var10001 = new class_182;
               var10001.method_961(this, this.field_557, this.field_1009, this.field_1010);
               var2.method_5236(var10001);
            }

            var3 = this;
            if(var1 != 0) {
               break label25;
            }

            long var6;
            var10000 = (var6 = this.updateCounter - 101L) == 0L?0:(var6 < 0L?-1:1);
         }

         if(var10000 < 0) {
            return;
         }

         var3 = this;
      }

      var2 = var3.field_557;
      class_209 var4 = new class_209;
      var4.method_651();
      var2.method_5236(var4);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_1164();
      this.method_1165();
      String var4 = this.updateCounter + "%";
      this.drawCenteredString(this.fontRendererObj, var4, this.width / 2, this.height - 25, 16777215);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: f () void
   public void method_1165() {
      int var10000;
      int var10001;
      label73: {
         label75: {
            int var2 = this.height / 4;
            int var3 = this.width / 2 - 120;
            var10000 = class_209.method_1159();
            int var4 = this.width / 2 + 120;
            int var5 = var2 + 116;
            int var6 = var2 + 15;
            drawRect(var3, var6, var4, var5, -1728053248);
            int var1 = var10000;
            String[] var7 = field_1012;
            this.drawCenteredString(this.fontRendererObj, "Saviez-vous que...", this.width / 2, var5 - 97, 16777215);
            var10000 = this.field_1011;
            var10001 = 1;
            if(var1 != 0) {
               if(this.field_1011 == 1) {
                  this.drawCenteredString(this.fontRendererObj, "Les Golems de fer ne prennent pas ", this.width / 2, var5 - 75, 16777215);
                  this.drawCenteredString(this.fontRendererObj, "de dégât de chute.", this.width / 2, var5 - 63, 16777215);
                  if(var1 != 0) {
                     break label75;
                  }
               }

               var10000 = this.field_1011;
               var10001 = 2;
            }

            if(var1 != 0) {
               if(var10000 == var10001) {
                  var7 = field_1012;
                  this.drawCenteredString(this.fontRendererObj, "Il est possible de reproduire des poulets ", this.width / 2, var5 - 75, 16777215);
                  this.drawCenteredString(this.fontRendererObj, "avec de la Nether Wart.", this.width / 2, var5 - 63, 16777215);
                  if(var1 != 0) {
                     break label75;
                  }
               }

               var10000 = this.field_1011;
               var10001 = 3;
            }

            if(var1 != 0) {
               if(var10000 == var10001) {
                  var7 = field_1012;
                  this.drawCenteredString(this.fontRendererObj, "Vous obtiendrez plus facilement des ", this.width / 2, var5 - 75, 16777215);
                  this.drawCenteredString(this.fontRendererObj, "poissons si vous pêchez quand il pleut.", this.width / 2, var5 - 63, 16777215);
                  if(var1 != 0) {
                     break label75;
                  }
               }

               var10000 = this.field_1011;
               var10001 = 4;
            }

            if(var1 != 0) {
               if(var10000 == var10001) {
                  var7 = field_1012;
                  this.drawCenteredString(this.fontRendererObj, "Tuer un blaze prend seulement ", this.width / 2, var5 - 75, 16777215);
                  this.drawCenteredString(this.fontRendererObj, "7 boules de neige.", this.width / 2, var5 - 63, 16777215);
                  if(var1 != 0) {
                     break label75;
                  }
               }

               var10000 = this.field_1011;
               var10001 = 5;
            }

            if(var1 != 0) {
               if(var10000 == var10001) {
                  var7 = field_1012;
                  this.drawCenteredString(this.fontRendererObj, "Placer de la glace sous des blocs ", this.width / 2, var5 - 75, 16777215);
                  this.drawCenteredString(this.fontRendererObj, "de soulsand augmente le ralentissement", this.width / 2, var5 - 63, 16777215);
                  this.drawCenteredString(this.fontRendererObj, "quand on marche dessus.", this.width / 2, var5 - 51, 16777215);
                  if(var1 != 0) {
                     break label75;
                  }
               }

               var10000 = this.field_1011;
               var10001 = 6;
            }

            if(var1 != 0) {
               if(var10000 == var10001) {
                  var7 = field_1012;
                  this.drawCenteredString(this.fontRendererObj, "Un bloc de feuille a 0,5% de chance ", this.width / 2, var5 - 75, 16777215);
                  this.drawCenteredString(this.fontRendererObj, "de faire dropper une pomme.", this.width / 2, var5 - 63, 16777215);
                  if(var1 != 0) {
                     break label75;
                  }
               }

               var10000 = this.field_1011;
               var10001 = 7;
            }

            if(var1 == 0) {
               break label73;
            }

            if(var10000 == var10001) {
               var7 = field_1012;
               this.drawCenteredString(this.fontRendererObj, "Les cris d’Endermen sont enfaite", this.width / 2, var5 - 75, 16777215);
               this.drawCenteredString(this.fontRendererObj, "d’autre sons du jeu, inversé et disordu.", this.width / 2, var5 - 63, 16777215);
            }
         }

         drawRect(this.width / 2 - 101, this.height - 15, this.width / 2 + 100, this.height - 16, -268435456);
         var10000 = this.width / 2 - 101;
         var10001 = this.height - 15;
      }

      drawRect(var10000, var10001, this.width / 2 - 100 + (int)this.updateCounter * 2, this.height - 16, -89128960);
      this.drawCenteredString(this.fontRendererObj, this.field_1008, this.width / 2, this.height - 40, 16777215);
   }

   // $FF: renamed from: a (java.lang.String, float, int, int) void
   protected void method_1166(String var1, float var2, int var3, int var4) {
      float var5 = (float)this.fontRendererObj.getCharWidth(var1) * var2;
      GL11.glTranslatef((float)var3 - var5 / 2.0F, (float)var4, 0.0F);
   }

   // $FF: renamed from: a (bcb) void
   public void method_865(bcb var1) {
      if(var1.field_450 == 0) {
         bao var10000 = this.field_557;
         class_209 var10001 = new class_209;
         var10001.method_651();
         var10000.method_5236(var10001);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_1167() {
      // $FF: Couldn't be decompiled
   }
}
