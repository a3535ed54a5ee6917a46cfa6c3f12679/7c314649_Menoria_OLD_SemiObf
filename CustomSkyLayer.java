import java.util.Properties;
import org.lwjgl.opengl.GL11;

public class CustomSkyLayer {

   public String source;
   private int startFadeIn;
   private int endFadeIn;
   private int startFadeOut;
   private int endFadeOut;
   private int blend;
   private boolean rotate;
   private float speed;
   private float[] axis;
   public int textureId;
   public static final int BLEND_ADD = 0;
   public static final int BLEND_SUBSTRACT = 1;
   public static final int BLEND_MULTIPLY = 2;
   public static final int BLEND_DODGE = 3;
   public static final int BLEND_BURN = 4;
   public static final int BLEND_SCREEN = 5;
   public static final int BLEND_REPLACE = 6;
   public static final float[] DEFAULT_AXIS;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2982;


   // $FF: renamed from: <init> (java.util.Properties, java.lang.String) void
   public void method_3843(Properties var1, String var2) {
      super();
      this.source = null;
      this.startFadeIn = -1;
      this.endFadeIn = -1;
      this.startFadeOut = -1;
      this.endFadeOut = -1;
      this.blend = 0;
      this.rotate = false;
      this.speed = 1.0F;
      this.axis = DEFAULT_AXIS;
      this.textureId = -1;
      String[] var3 = field_2982;
      this.source = var1.getProperty("source", var2);
      this.startFadeIn = this.parseTime(var1.getProperty("startFadeIn"));
      this.endFadeIn = this.parseTime(var1.getProperty("endFadeIn"));
      this.startFadeOut = this.parseTime(var1.getProperty("startFadeOut"));
      this.endFadeOut = this.parseTime(var1.getProperty("endFadeOut"));
      this.blend = this.parseBlend(var1.getProperty("blend"));
      this.rotate = this.parseBoolean(var1.getProperty("rotate"), true);
      this.speed = this.parseFloat(var1.getProperty("speed"), 1.0F);
      this.axis = this.parseAxis(var1.getProperty("axis"), DEFAULT_AXIS);
   }

   private int parseTime(String var1) {
      String[] var2 = class_752.method_4253();
      String var10000 = var1;
      if(var2 != null) {
         if(var1 == null) {
            return -1;
         }

         var10000 = var1;
      }

      String[] var3 = Config.tokenize(var10000, ":");
      String[] var10 = var3;
      StringBuilder var12;
      if(var2 != null) {
         if(var3.length != 2) {
            var12 = new StringBuilder();
            String[] var9 = field_2982;
            Config.warn(var12.append("Invalid time: ").append(var1).toString());
            return -1;
         }

         var10 = var3;
      }

      String var4 = var10[0];
      String var5 = var3[1];
      int var6 = Config.parseInt(var4, -1);
      int var7 = Config.parseInt(var5, -1);
      int var11 = var6;
      if(var2 != null) {
         if(var6 >= 0) {
            var11 = var6;
            if(var2 == null) {
               return var11;
            }

            if(var6 <= 23) {
               var11 = var7;
               if(var2 == null) {
                  return var11;
               }

               if(var7 >= 0) {
                  var11 = var7;
                  if(var2 == null) {
                     return var11;
                  }

                  if(var7 <= 59) {
                     var6 -= 6;
                     var11 = var6;
                     if(var2 != null) {
                        if(var6 < 0) {
                           var6 += 24;
                        }

                        var11 = var6 * 1000 + (int)((double)var7 / 60.0D * 1000.0D);
                     }

                     int var8 = var11;
                     return var8;
                  }
               }
            }
         }

         var12 = new StringBuilder();
         String[] var10001 = field_2982;
         Config.warn(var12.append("Invalid time: ").append(var1).toString());
         var11 = -1;
      }

      return var11;
   }

   private int parseBlend(String var1) {
      String[] var2 = class_752.method_4253();
      String var10000 = var1;
      if(var2 != null) {
         if(var1 == null) {
            return 0;
         }

         var10000 = var1;
      }

      String[] var3 = field_2982;
      byte var5 = var10000.equals("add");
      if(var2 != null) {
         if(var5 != 0) {
            return 0;
         }

         var3 = field_2982;
         var5 = var1.equals("subtract");
      }

      if(var2 != null) {
         if(var5 != 0) {
            return 1;
         }

         var3 = field_2982;
         var5 = var1.equals("multiply");
      }

      if(var2 != null) {
         if(var5 != 0) {
            return 2;
         }

         var3 = field_2982;
         var5 = var1.equals("dodge");
      }

      if(var2 != null) {
         if(var5 != 0) {
            return 3;
         }

         var3 = field_2982;
         var5 = var1.equals("burn");
      }

      if(var2 != null) {
         if(var5 != 0) {
            return 4;
         }

         var3 = field_2982;
         var5 = var1.equals("screen");
      }

      if(var2 != null) {
         if(var5 != 0) {
            return 5;
         }

         var3 = field_2982;
         var5 = var1.equals("replace");
      }

      if(var2 != null) {
         if(var5 != 0) {
            return 6;
         }

         StringBuilder var4 = new StringBuilder();
         String[] var10001 = field_2982;
         Config.warn(var4.append("Unknown blend: ").append(var1).toString());
         var5 = 0;
      }

      return var5;
   }

   private boolean parseBoolean(String var1, boolean var2) {
      String[] var3 = class_752.method_4253();
      String var10000 = var1;
      if(var3 != null) {
         if(var1 == null) {
            return var2;
         }

         var10000 = var1.toLowerCase();
      }

      String[] var4 = field_2982;
      boolean var5 = var10000.equals("true");
      if(var3 != null) {
         if(var5) {
            return true;
         }

         var10000 = var1.toLowerCase();
         var4 = field_2982;
         var5 = var10000.equals("false");
      }

      if(var3 != null) {
         if(var5) {
            return false;
         }

         StringBuilder var6 = new StringBuilder();
         String[] var10001 = field_2982;
         Config.warn(var6.append("Unknown boolean: ").append(var1).toString());
         var5 = var2;
      }

      return var5;
   }

   private float parseFloat(String var1, float var2) {
      String[] var3 = class_752.method_4253();
      String var10000 = var1;
      if(var3 != null) {
         if(var1 == null) {
            return var2;
         }

         var10000 = var1;
      }

      float var4 = Config.parseFloat(var10000, Float.MIN_VALUE);
      float var5 = var4;
      if(var3 != null) {
         if(var4 == Float.MIN_VALUE) {
            StringBuilder var6 = new StringBuilder();
            String[] var10001 = field_2982;
            Config.warn(var6.append("Invalid value: ").append(var1).toString());
            return var2;
         }

         var5 = var4;
      }

      return var5;
   }

   private float[] parseAxis(String var1, float[] var2) {
      String[] var3 = class_752.method_4253();
      String var10000 = var1;
      if(var3 != null) {
         if(var1 == null) {
            return var2;
         }

         var10000 = var1;
      }

      String[] var4 = Config.tokenize(var10000, " ");
      int var12 = var4.length;
      String[] var10;
      StringBuilder var15;
      if(var3 != null) {
         if(var12 != 3) {
            var15 = new StringBuilder();
            var10 = field_2982;
            Config.warn(var15.append("Invalid axis: ").append(var1).toString());
            return var2;
         }

         var12 = 3;
      }

      float[] var5 = new float[var12];
      int var6 = 0;

      float var13;
      float[] var14;
      while(true) {
         if(var6 < var4.length) {
            label77: {
               var5[var6] = Config.parseFloat(var4[var6], Float.MIN_VALUE);
               var13 = var5[var6];
               if(var3 == null) {
                  break;
               }

               float var16;
               var12 = (var16 = var13 - Float.MIN_VALUE) == 0.0F?0:(var16 < 0.0F?-1:1);
               if(var3 != null) {
                  if(var12 == 0) {
                     var15 = new StringBuilder();
                     var10 = field_2982;
                     Config.warn(var15.append("Invalid axis: ").append(var1).toString());
                     return var2;
                  }

                  var14 = var5;
                  if(var3 == null) {
                     return var14;
                  }

                  float var17;
                  var12 = (var17 = var5[var6] - -1.0F) == 0.0F?0:(var17 < 0.0F?-1:1);
               }

               if(var12 >= 0) {
                  var14 = var5;
                  if(var3 == null) {
                     return var14;
                  }

                  if(var5[var6] <= 1.0F) {
                     ++var6;
                     if(var3 != null) {
                        continue;
                     }
                     break label77;
                  }
               }

               var15 = new StringBuilder();
               var10 = field_2982;
               Config.warn(var15.append("Invalid axis values: ").append(var1).toString());
               var14 = var2;
               return var14;
            }
         }

         var13 = var5[0];
         break;
      }

      float var11 = var13;
      float var7 = var5[1];
      float var8 = var5[2];
      float var18;
      var12 = (var18 = var11 * var11 + var7 * var7 + var8 * var8 - 1.0E-5F) == 0.0F?0:(var18 < 0.0F?-1:1);
      if(var3 != null) {
         if(var12 < 0) {
            var15 = new StringBuilder();
            String[] var10001 = field_2982;
            Config.warn(var15.append("Invalid axis values: ").append(var1).toString());
            return var2;
         }

         var12 = 3;
      }

      var14 = new float[var12];
      var14[0] = var8;
      var14[1] = var7;
      var14[2] = -var11;
      float[] var9 = var14;
      return var9;
   }

   public boolean isValid(String var1) {
      String[] var2 = class_752.method_4253();
      CustomSkyLayer var10000 = this;
      String[] var8;
      StringBuilder var9;
      if(var2 != null) {
         if(this.source == null) {
            var9 = new StringBuilder();
            var8 = field_2982;
            Config.warn(var9.append("No source texture: ").append(var1).toString());
            return false;
         }

         this.source = TextureUtils.fixResourcePath(this.source, TextureUtils.getBasePath(var1));
         var10000 = this;
      }

      int var10 = var10000.startFadeIn;
      if(var2 != null) {
         if(var10 >= 0) {
            var10 = this.endFadeIn;
            if(var2 == null) {
               return (boolean)var10;
            }

            if(this.endFadeIn >= 0) {
               var10 = this.endFadeOut;
               if(var2 == null) {
                  return (boolean)var10;
               }

               if(this.endFadeOut >= 0) {
                  int var3 = this.normalizeTime(this.endFadeIn - this.startFadeIn);
                  var10 = this.startFadeOut;
                  if(var2 != null) {
                     if(this.startFadeOut < 0) {
                        this.startFadeOut = this.normalizeTime(this.endFadeOut - var3);
                     }

                     var10 = this.normalizeTime(this.startFadeOut - this.endFadeIn);
                  }

                  int var4 = var10;
                  int var5 = this.normalizeTime(this.endFadeOut - this.startFadeOut);
                  int var6 = this.normalizeTime(this.startFadeIn - this.endFadeOut);
                  int var7 = var3 + var4 + var5 + var6;
                  var10 = var7;
                  if(var2 != null) {
                     if(var7 != 24000) {
                        var9 = new StringBuilder();
                        var8 = field_2982;
                        Config.warn(var9.append("Invalid fadeIn/fadeOut times, sum is more than 24h: ").append(var7).toString());
                        return false;
                     }

                     float var12;
                     var10 = (var12 = this.speed - 0.0F) == 0.0F?0:(var12 < 0.0F?-1:1);
                  }

                  if(var2 != null) {
                     if(var10 < 0) {
                        var9 = new StringBuilder();
                        var8 = field_2982;
                        Config.warn(var9.append("Invalid speed: ").append(this.speed).toString());
                        return false;
                     }

                     var10 = 1;
                  }

                  return (boolean)var10;
               }
            }
         }

         String[] var11 = field_2982;
         Config.warn("Invalid times, required are: startFadeIn, endFadeIn and endFadeOut.");
         var10 = 0;
      }

      return (boolean)var10;
   }

   private int normalizeTime(int var1) {
      String[] var2 = class_752.method_4253();

      while(true) {
         if(var1 >= 24000) {
            var1 -= 24000;
            if(var2 == null) {
               return var1;
            }

            if(var2 != null) {
               continue;
            }
         }

         do {
            if(var1 >= 0) {
               return var1;
            }

            var1 += 24000;
         } while(var2 != null);

         return var1;
      }
   }

   public void render(int var1, float var2, float var3) {
      String[] var10000 = class_752.method_4253();
      float var5 = var3 * this.getFadeBrightness(var1);
      String[] var4 = var10000;
      var5 = Config.limit(var5, 0.0F, 1.0F);
      float var8;
      int var7 = (var8 = var5 - 1.0E-4F) == 0.0F?0:(var8 < 0.0F?-1:1);
      if(var4 != null) {
         if(var7 < 0) {
            return;
         }

         GL11.glBindTexture(3553, this.textureId);
         this.setupBlend(var5);
         GL11.glPushMatrix();
         var7 = this.rotate;
      }

      if(var7 != 0) {
         GL11.glRotatef(var2 * 360.0F * this.speed, this.axis[0], this.axis[1], this.axis[2]);
      }

      bmh var6 = bmh.instance;
      GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
      this.renderSide(var6, 4);
      GL11.glPushMatrix();
      GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
      this.renderSide(var6, 1);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
      this.renderSide(var6, 0);
      GL11.glPopMatrix();
      GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
      this.renderSide(var6, 5);
      GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
      this.renderSide(var6, 2);
      GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
      this.renderSide(var6, 3);
      GL11.glPopMatrix();
   }

   private float getFadeBrightness(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.timeBetween(var1, this.startFadeIn, this.endFadeIn);
      int var3;
      int var4;
      if(var2 != null) {
         if(var10000 != 0) {
            var3 = this.normalizeTime(this.endFadeIn - this.startFadeIn);
            var4 = this.normalizeTime(var1 - this.startFadeIn);
            return (float)var4 / (float)var3;
         }

         var10000 = this.timeBetween(var1, this.endFadeIn, this.startFadeOut);
      }

      if(var2 != null) {
         if(var10000 != 0) {
            return 1.0F;
         }

         var10000 = this.timeBetween(var1, this.startFadeOut, this.endFadeOut);
      }

      if(var2 != null) {
         if(var10000 == 0) {
            return 0.0F;
         }

         var10000 = this.normalizeTime(this.endFadeOut - this.startFadeOut);
      }

      var3 = var10000;
      var4 = this.normalizeTime(var1 - this.startFadeOut);
      return 1.0F - (float)var4 / (float)var3;
   }

   private void renderSide(bmh var1, int var2) {
      double var3 = (double)(var2 % 3) / 3.0D;
      double var5 = (double)(var2 / 3) / 2.0D;
      var1.setVisible2();
      var1.addVertexWithUV(-100.0D, -100.0D, -100.0D, var3, var5);
      var1.addVertexWithUV(-100.0D, -100.0D, 100.0D, var3, var5 + 0.5D);
      var1.addVertexWithUV(100.0D, -100.0D, 100.0D, var3 + 0.3333333333333333D, var5 + 0.5D);
      var1.addVertexWithUV(100.0D, -100.0D, -100.0D, var3 + 0.3333333333333333D, var5);
      var1.getVisible8();
   }

   void setupBlend(float var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.blend;
      if(var2 != null) {
         switch(this.blend) {
         case 0:
            GL11.glDisable(3008);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 1);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, var1);
            if(var2 != null) {
               break;
            }
         case 1:
            GL11.glDisable(3008);
            GL11.glEnable(3042);
            GL11.glBlendFunc(775, 0);
            GL11.glColor4f(var1, var1, var1, 1.0F);
            if(var2 != null) {
               break;
            }
         case 2:
            GL11.glDisable(3008);
            GL11.glEnable(3042);
            GL11.glBlendFunc(774, 771);
            GL11.glColor4f(var1, var1, var1, var1);
            if(var2 != null) {
               break;
            }
         case 3:
            GL11.glDisable(3008);
            GL11.glEnable(3042);
            GL11.glBlendFunc(1, 1);
            GL11.glColor4f(var1, var1, var1, 1.0F);
            if(var2 != null) {
               break;
            }
         case 4:
            GL11.glDisable(3008);
            GL11.glEnable(3042);
            GL11.glBlendFunc(0, 769);
            GL11.glColor4f(var1, var1, var1, 1.0F);
            if(var2 != null) {
               break;
            }
         case 5:
            GL11.glDisable(3008);
            GL11.glEnable(3042);
            GL11.glBlendFunc(1, 769);
            GL11.glColor4f(var1, var1, var1, 1.0F);
            if(var2 != null) {
               break;
            }
         case 6:
            GL11.glEnable(3008);
            GL11.glDisable(3042);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, var1);
         }

         var10000 = 3553;
      }

      GL11.glEnable(var10000);
   }

   public boolean isActive(int var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = this.timeBetween(var1, this.endFadeOut, this.startFadeIn);
      if(var2 != null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   private boolean timeBetween(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var2;
      int var10001 = var3;
      if(var4 != null) {
         if(var2 <= var3) {
            var10000 = var1;
            if(var4 != null) {
               if(var1 >= var2) {
                  var10000 = var1;
                  if(var4 == null) {
                     return (boolean)var10000;
                  }

                  if(var1 <= var3) {
                     var10000 = 1;
                     return (boolean)var10000;
                  }
               }

               var10000 = 0;
            }

            return (boolean)var10000;
         }

         var10000 = var1;
         if(var4 == null) {
            return (boolean)var10000;
         }

         var10001 = var2;
      }

      if(var10000 < var10001) {
         var10000 = var1;
         if(var4 == null) {
            return (boolean)var10000;
         }

         if(var1 > var3) {
            var10000 = 0;
            return (boolean)var10000;
         }
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3844() {
      // $FF: Couldn't be decompiled
   }
}
