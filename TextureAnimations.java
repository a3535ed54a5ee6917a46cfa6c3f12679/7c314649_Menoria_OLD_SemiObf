import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import javax.imageio.ImageIO;

public class TextureAnimations {

   private static TextureAnimation[] textureAnimations;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2585;


   // $FF: renamed from: <init> () void
   public void method_3215() {
      super();
   }

   public static void reset() {
      textureAnimations = null;
   }

   public static void update() {
      class_56[] var0 = Config.getResourcePacks();
      textureAnimations = getTextureAnimations(var0);
      updateAnimations();
   }

   public static void updateCustomAnimations() {
      if(textureAnimations != null) {
         if(Config.isAnimatedTextures()) {
            updateAnimations();
         }
      }
   }

   public static void updateAnimations() {
      String[] var0 = class_752.method_4253();
      if(textureAnimations != null) {
         int var1 = 0;

         while(var1 < textureAnimations.length) {
            TextureAnimation var2 = textureAnimations[var1];
            var2.updateTexture();
            ++var1;
            if(var0 == null) {
               break;
            }
         }

      }
   }

   public static TextureAnimation[] getTextureAnimations(class_56[] var0) {
      String[] var10000 = class_752.method_4253();
      ArrayList var2 = new ArrayList();
      int var3 = 0;
      String[] var1 = var10000;

      TextureAnimation[] var6;
      while(true) {
         if(var3 < var0.length) {
            class_56 var4 = var0[var3];
            TextureAnimation[] var5 = getTextureAnimations(var4);
            if(var1 != null) {
               var6 = var5;
               if(var1 == null) {
                  break;
               }

               if(var5 != null) {
                  var2.addAll(Arrays.asList(var5));
               }

               ++var3;
            }

            if(var1 != null) {
               continue;
            }
         }

         var6 = (TextureAnimation[])((TextureAnimation[])var2.toArray(new TextureAnimation[var2.size()]));
         break;
      }

      TextureAnimation[] var7 = var6;
      return var7;
   }

   public static TextureAnimation[] getTextureAnimations(class_56 param0) {
      // $FF: Couldn't be decompiled
   }

   public static TextureAnimation makeTextureAnimation(Properties var0, bqx var1) {
      String[] var15 = field_2585;
      String var3 = var0.getProperty("from");
      String[] var2 = class_752.method_4253();
      String var4 = var0.getProperty("to");
      int var5 = Config.parseInt(var0.getProperty("x"), -1);
      int var6 = Config.parseInt(var0.getProperty("y"), -1);
      int var7 = Config.parseInt(var0.getProperty("w"), -1);
      int var8 = Config.parseInt(var0.getProperty("h"), -1);
      String var10000 = var3;
      if(var2 != null) {
         label68: {
            if(var3 != null) {
               var10000 = var4;
               if(var2 == null) {
                  break label68;
               }

               if(var4 != null) {
                  label71: {
                     int var18 = var5;
                     if(var2 != null) {
                        if(var5 < 0) {
                           break label71;
                        }

                        var18 = var6;
                     }

                     if(var2 != null) {
                        if(var18 < 0) {
                           break label71;
                        }

                        var18 = var7;
                     }

                     if(var2 != null) {
                        if(var18 < 0) {
                           break label71;
                        }

                        var18 = var8;
                     }

                     if(var18 >= 0) {
                        String var9 = TextureUtils.getBasePath(var1.method_8228());
                        var3 = TextureUtils.fixResourcePath(var3, var9);
                        var4 = TextureUtils.fixResourcePath(var4, var9);
                        byte[] var10 = getCustomTextureData(var3, var7);
                        if(var2 != null) {
                           StringBuilder var19;
                           if(var10 != null) {
                              bqx var20 = new bqx;
                              var20.method_8227(var4);
                              bqx var11 = var20;
                              var20 = var11;
                              if(var2 != null) {
                                 if(!Config.hasResource(var11)) {
                                    var19 = new StringBuilder();
                                    var15 = field_2585;
                                    Config.warn(var19.append("TextureAnimation: Target texture not found: ").append(var4).toString());
                                    return null;
                                 }

                                 var20 = var11;
                              }

                              bqh var12 = TextureUtils.getTexture(var20);
                              bqh var16 = var12;
                              if(var2 != null) {
                                 if(var12 == null) {
                                    var19 = new StringBuilder();
                                    String[] var10001 = field_2585;
                                    Config.warn(var19.append("TextureAnimation: Target texture not found: ").append(var11).toString());
                                    return null;
                                 }

                                 var16 = var12;
                              }

                              int var13 = var16.method_222();
                              TextureAnimation var17 = new TextureAnimation;
                              var17.method_10043(var3, var10, var4, var13, var5, var6, var7, var8, var0, 1);
                              TextureAnimation var14 = var17;
                              return var14;
                           }

                           var19 = new StringBuilder();
                           var15 = field_2585;
                           Config.warn(var19.append("TextureAnimation: Source texture not found: ").append(var4).toString());
                        }

                        return null;
                     }
                  }

                  var15 = field_2585;
                  Config.warn("TextureAnimation: Invalid coordinates");
                  return null;
               }
            }

            var15 = field_2585;
            var10000 = "TextureAnimation: Source or target texture not specified";
         }
      }

      Config.warn(var10000);
      return null;
   }

   public static String[] getAnimationPropertiesDir(File var0) {
      String[] var1;
      String[] var8;
      boolean var11;
      File var10000;
      label84: {
         var10000 = new File(var0, "anim");
         var8 = field_2585;
         File var2 = var10000;
         var1 = class_752.method_4253();
         var11 = var2.exists();
         if(var1 != null) {
            if(!var11) {
               return null;
            }

            var10000 = var2;
            if(var1 == null) {
               break label84;
            }

            var11 = var2.isDirectory();
         }

         if(!var11) {
            return null;
         }

         var10000 = var2;
      }

      File[] var3 = var10000.listFiles();
      if(var3 == null) {
         return null;
      } else {
         ArrayList var4 = new ArrayList();
         int var5 = 0;

         Object var12;
         while(true) {
            if(var5 < var3.length) {
               var12 = var3;
               if(var1 == null) {
                  break;
               }

               label87: {
                  File var6 = var3[var5];
                  String var7 = var6.getName();
                  var8 = field_2585;
                  var11 = var7.startsWith("custom_");
                  if(var1 != null) {
                     if(var11 && var1 != null) {
                        break label87;
                     }

                     var8 = field_2585;
                     var11 = var7.endsWith(".properties");
                  }

                  if(var1 != null) {
                     if(!var11 && var1 != null) {
                        break label87;
                     }

                     var11 = var6.isFile();
                  }

                  if(var1 != null) {
                     if(!var11 && var1 != null) {
                        break label87;
                     }

                     var11 = var6.canRead();
                  }

                  if(var1 != null && (var11 || var1 == null)) {
                     StringBuilder var9 = new StringBuilder();
                     var8 = field_2585;
                     Config.dbg(var9.append("TextureAnimation: anim/").append(var6.getName()).toString());
                     var4.add("/anim/" + var7);
                  }
               }

               ++var5;
               if(var1 != null) {
                  continue;
               }
            }

            var12 = var4.toArray(new String[var4.size()]);
            break;
         }

         String[] var10 = (String[])((String[])var12);
         return var10;
      }
   }

   public static String[] getAnimationPropertiesZip(File param0) {
      // $FF: Couldn't be decompiled
   }

   public static byte[] getCustomTextureData(String var0, int var1) {
      String[] var10000 = class_752.method_4253();
      byte[] var3 = loadImage(var0, var1);
      String[] var2 = var10000;
      byte[] var4 = var3;
      if(var2 != null) {
         if(var3 == null) {
            StringBuilder var5 = new StringBuilder();
            String[] var10001 = field_2585;
            var3 = loadImage(var5.append("/anim").append(var0).toString(), var1);
         }

         var4 = var3;
      }

      return var4;
   }

   private static byte[] loadImage(String param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static BufferedImage readTextureImage(InputStream var0) {
      BufferedImage var1 = ImageIO.read(var0);
      var0.close();
      return var1;
   }

   public static BufferedImage scaleBufferedImage(BufferedImage var0, int var1, int var2) {
      BufferedImage var3 = new BufferedImage(var1, var2, 2);
      Graphics2D var4 = var3.createGraphics();
      var4.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
      var4.drawImage(var0, 0, 0, var1, var2, (ImageObserver)null);
      return var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3216() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.io.IOException) java.io.IOException
   private static IOException method_3217(IOException var0) {
      return var0;
   }
}
