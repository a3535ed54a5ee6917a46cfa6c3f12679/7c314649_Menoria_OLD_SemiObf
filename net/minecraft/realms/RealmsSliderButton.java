package net.minecraft.realms;

import net.minecraft.realms.RealmsButton;
import net.minecraft.realms.RealmsScreen;
import org.lwjgl.opengl.GL11;

public class RealmsSliderButton extends RealmsButton {

   public float value;
   public boolean sliding;
   private final float minValue;
   private final float maxValue;
   private int steps;


   // $FF: renamed from: <init> (int, int, int, int, int, int) void
   public void getBlock76(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.getBlock77(var1, var2, var3, var4, var6, 0, 1.0F, (float)var5);
   }

   // $FF: renamed from: <init> (int, int, int, int, int, int, float, float) void
   public void getBlock77(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      super.getBlock73(var1, var2, var3, var4, 20, "");
      this.value = 1.0F;
      this.minValue = var7;
      this.maxValue = var8;
      this.value = this.toPct((float)var6);
      this.getProxy().field_449 = this.getMessage();
   }

   public String getMessage() {
      return "";
   }

   public float toPct(float var1) {
      return class_1715.method_9569((this.clamp(var1) - this.minValue) / (this.maxValue - this.minValue), 0.0F, 1.0F);
   }

   public float toValue(float var1) {
      return this.clamp(this.minValue + (this.maxValue - this.minValue) * class_1715.method_9569(var1, 0.0F, 1.0F));
   }

   public float clamp(float var1) {
      var1 = this.clampSteps(var1);
      return class_1715.method_9569(var1, this.minValue, this.maxValue);
   }

   protected float clampSteps(float var1) {
      boolean var2 = RealmsScreen.method_3794();
      int var10000 = this.steps;
      if(!var2) {
         if(this.steps <= 0) {
            return var1;
         }

         var10000 = this.steps * Math.round(var1 / (float)this.steps);
      }

      var1 = (float)var10000;
      return var1;
   }

   public int getYImage(boolean var1) {
      return 0;
   }

   public void renderBg(int var1, int var2) {
      RealmsSliderButton var5;
      label41: {
         boolean var3 = RealmsScreen.method_3793();
         boolean var10000 = this.getProxy().field_452;
         if(var3) {
            if(!var10000) {
               return;
            }

            var5 = this;
            if(!var3) {
               break label41;
            }

            var10000 = this.sliding;
         }

         if(var10000) {
            float var7;
            label43: {
               this.value = (float)(var1 - (this.getProxy().field_447 + 4)) / (float)(this.getProxy().method_757() - 8);
               float var8;
               int var6 = (var8 = this.value - 0.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
               if(var3) {
                  if(var6 < 0) {
                     this.value = 0.0F;
                  }

                  var7 = this.value;
                  if(!var3) {
                     break label43;
                  }

                  float var9;
                  var6 = (var9 = this.value - 1.0F) == 0.0F?0:(var9 < 0.0F?-1:1);
               }

               if(var6 > 0) {
                  this.value = 1.0F;
               }

               var7 = this.toValue(this.value);
            }

            float var4 = var7;
            this.clicked(var4);
            this.value = this.toPct(var4);
            this.getProxy().field_449 = this.getMessage();
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.blit(this.getProxy().field_447 + (int)(this.value * (float)(this.getProxy().method_757() - 8)), this.getProxy().field_448, 0, 66, 4, 20);
         var5 = this;
      }

      var5.blit(this.getProxy().field_447 + (int)(this.value * (float)(this.getProxy().method_757() - 8)) + 4, this.getProxy().field_448, 196, 66, 4, 20);
   }

   public void clicked(int var1, int var2) {
      RealmsSliderButton var4;
      label23: {
         this.value = (float)(var1 - (this.getProxy().field_447 + 4)) / (float)(this.getProxy().method_757() - 8);
         boolean var3 = RealmsScreen.method_3793();
         float var5;
         int var10000 = (var5 = this.value - 0.0F) == 0.0F?0:(var5 < 0.0F?-1:1);
         if(var3) {
            if(var10000 < 0) {
               this.value = 0.0F;
            }

            var4 = this;
            if(!var3) {
               break label23;
            }

            float var6;
            var10000 = (var6 = this.value - 1.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
         }

         if(var10000 > 0) {
            this.value = 1.0F;
         }

         this.clicked(this.toValue(this.value));
         this.getProxy().field_449 = this.getMessage();
         var4 = this;
      }

      var4.sliding = true;
   }

   public void clicked(float var1) {}

   public void released(int var1, int var2) {
      this.sliding = false;
   }
}
