import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import javax.imageio.ImageIO;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;

public class Config {

   public static final String OF_NAME;
   public static final String MC_VERSION;
   public static final String OF_EDITION;
   public static final String OF_RELEASE;
   public static final String VERSION;
   private static String newRelease;
   private static bbj gameSettings;
   private static bao minecraft;
   private static boolean initialized;
   private static Thread minecraftThread;
   private static DisplayMode desktopDisplayMode;
   private static int antialiasingLevel;
   private static int availableProcessors;
   public static boolean zoomMode;
   private static int texturePackClouds;
   public static boolean waterOpacityChanged;
   private static boolean fullscreenModeChecked;
   private static boolean desktopModeChecked;
   private static PrintStream systemOut;
   public static final Boolean DEF_FOG_FANCY;
   public static final Float DEF_FOG_START;
   public static final Boolean DEF_OPTIMIZE_RENDER_DISTANCE;
   public static final Boolean DEF_OCCLUSION_ENABLED;
   public static final Integer DEF_MIPMAP_LEVEL;
   public static final Integer DEF_MIPMAP_TYPE;
   public static final Float DEF_ALPHA_FUNC_LEVEL;
   public static final Boolean DEF_LOAD_CHUNKS_FAR;
   public static final Integer DEF_PRELOADED_CHUNKS;
   public static final Integer DEF_CHUNKS_LIMIT;
   public static final Integer DEF_UPDATES_PER_FRAME;
   public static final Boolean DEF_DYNAMIC_UPDATES;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2752;


   // $FF: renamed from: <init> () void
   private void method_3485() {
      super();
   }

   public static String getVersion() {
      String[] var10000 = field_2752;
      return "OptiFine_1.7.10_HD_U_A4";
   }

   public static void initGameSettings(bbj var0) {
      gameSettings = var0;
      minecraft = bao.method_5273();
      desktopDisplayMode = Display.getDesktopDisplayMode();
      updateAvailableProcessors();
   }

   public static void initDisplay() {
      checkInitialized();
      antialiasingLevel = gameSettings.ofAaLevel;
      checkDisplaySettings();
      checkDisplayMode();
      minecraftThread = Thread.currentThread();
      updateThreadPriorities();
   }

   public static void checkInitialized() {
      String[] var0 = class_752.method_4253();

      boolean var10000;
      label39: {
         try {
            var10000 = initialized;
            if(var0 == null) {
               break label39;
            }

            if(initialized) {
               return;
            }
         } catch (NumberFormatException var2) {
            throw method_3487(var2);
         }

         var10000 = Display.isCreated();
      }

      label29: {
         try {
            if(var0 == null) {
               break label29;
            }

            if(!var10000) {
               return;
            }
         } catch (NumberFormatException var1) {
            throw method_3487(var1);
         }

         var10000 = true;
      }

      initialized = var10000;
      checkOpenGlCaps();
      startVersionCheckThread();
   }

   private static void checkOpenGlCaps() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isFancyFogAvailable() {
      return GLContext.getCapabilities().GL_NV_fog_distance;
   }

   public static boolean isOcclusionAvailable() {
      return GLContext.getCapabilities().GL_ARB_occlusion_query;
   }

   private static int getOpenGlVersion() {
      // $FF: Couldn't be decompiled
   }

   public static void updateThreadPriorities() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isMinecraftThread() {
      boolean var10000;
      try {
         if(Thread.currentThread() == minecraftThread) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var0) {
         throw method_3487(var0);
      }

      var10000 = false;
      return var10000;
   }

   private static void startVersionCheckThread() {
      VersionCheckThread var10000 = new VersionCheckThread;
      var10000.method_1440();
      VersionCheckThread var0 = var10000;
      var0.start();
   }

   public static int getMipmapType() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isUseAlphaFunc() {
      String[] var10000 = class_752.method_4253();
      float var1 = getAlphaFuncLevel();
      String[] var0 = var10000;

      int var3;
      label32: {
         try {
            float var4;
            var3 = (var4 = var1 - (DEF_ALPHA_FUNC_LEVEL.floatValue() + 1.0E-5F)) == 0.0F?0:(var4 < 0.0F?-1:1);
            if(var0 == null) {
               return (boolean)var3;
            }

            if(var3 > 0) {
               break label32;
            }
         } catch (NumberFormatException var2) {
            throw method_3487(var2);
         }

         var3 = 0;
         return (boolean)var3;
      }

      var3 = 1;
      return (boolean)var3;
   }

   public static float getAlphaFuncLevel() {
      return DEF_ALPHA_FUNC_LEVEL.floatValue();
   }

   public static boolean isFogFancy() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isFogFast() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isFogOff() {
      // $FF: Couldn't be decompiled
   }

   public static float getFogStart() {
      return gameSettings.ofFogStart;
   }

   public static boolean isOcclusionEnabled() {
      return gameSettings.field_4490;
   }

   public static boolean isOcclusionFancy() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isLoadChunksFar() {
      return gameSettings.ofLoadFar;
   }

   public static int getPreloadedChunks() {
      return gameSettings.ofPreloadedChunks;
   }

   public static void dbg(String var0) {
      String[] var10001 = field_2752;
      systemOut.print("[OptiFine] ");
      systemOut.println(var0);
   }

   public static void warn(String var0) {
      String[] var10001 = field_2752;
      systemOut.print("[OptiFine] [WARN] ");
      systemOut.println(var0);
   }

   public static void error(String var0) {
      String[] var10001 = field_2752;
      systemOut.print("[OptiFine] [ERROR] ");
      systemOut.println(var0);
   }

   public static void log(String var0) {
      dbg(var0);
   }

   public static int getUpdatesPerFrame() {
      return gameSettings.ofChunkUpdates;
   }

   public static boolean isDynamicUpdates() {
      return gameSettings.ofChunkUpdatesDynamic;
   }

   public static boolean isRainFancy() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isWaterFancy() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isRainOff() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isCloudsFancy() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isCloudsOff() {
      // $FF: Couldn't be decompiled
   }

   public static void updateTexturePackClouds() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isTreesFancy() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isGrassFancy() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isDroppedItemsFancy() {
      // $FF: Couldn't be decompiled
   }

   public static int limit(int param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public static float limit(float param0, float param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   public static float limitTo1(float param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean isAnimatedWater() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isGeneratedWater() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isAnimatedPortal() {
      return gameSettings.ofAnimatedPortal;
   }

   public static boolean isAnimatedLava() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isGeneratedLava() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isAnimatedFire() {
      return gameSettings.ofAnimatedFire;
   }

   public static boolean isAnimatedRedstone() {
      return gameSettings.ofAnimatedRedstone;
   }

   public static boolean isAnimatedExplosion() {
      return gameSettings.ofAnimatedExplosion;
   }

   public static boolean isAnimatedFlame() {
      return gameSettings.ofAnimatedFlame;
   }

   public static boolean isAnimatedSmoke() {
      return gameSettings.ofAnimatedSmoke;
   }

   public static boolean isVoidParticles() {
      return gameSettings.ofVoidParticles;
   }

   public static boolean isWaterParticles() {
      return gameSettings.ofWaterParticles;
   }

   public static boolean isRainSplash() {
      return gameSettings.ofRainSplash;
   }

   public static boolean isPortalParticles() {
      return gameSettings.ofPortalParticles;
   }

   public static boolean isPotionParticles() {
      return gameSettings.ofPotionParticles;
   }

   public static boolean isDepthFog() {
      return gameSettings.ofDepthFog;
   }

   public static float getAmbientOcclusionLevel() {
      return gameSettings.ofAoLevel;
   }

   private static Method getMethod(Class param0, String param1, Object[] param2) {
      // $FF: Couldn't be decompiled
   }

   public static String arrayToString(Object[] var0) {
      try {
         if(var0 == null) {
            return "";
         }
      } catch (NumberFormatException var5) {
         throw method_3487(var5);
      }

      StringBuffer var1 = new StringBuffer(var0.length * 5);

      for(int var2 = 0; var2 < var0.length; ++var2) {
         Object var3 = var0[var2];

         try {
            if(var2 > 0) {
               String[] var10001 = field_2752;
               var1.append(", ");
            }
         } catch (NumberFormatException var4) {
            throw method_3487(var4);
         }

         var1.append(String.valueOf(var3));
      }

      return var1.toString();
   }

   public static String arrayToString(int[] param0) {
      // $FF: Couldn't be decompiled
   }

   public static bao getMinecraft() {
      return minecraft;
   }

   public static bqf getTextureManager() {
      return minecraft.method_5288();
   }

   public static bqy getResourceManager() {
      return minecraft.method_5289();
   }

   public static InputStream getResourceStream(bqx var0) {
      return getResourceStream(minecraft.method_5289(), var0);
   }

   public static InputStream getResourceStream(bqy param0, bqx param1) {
      // $FF: Couldn't be decompiled
   }

   public static bqw getResource(bqx var0) {
      return minecraft.method_5289().method_224(var0);
   }

   public static boolean hasResource(bqx var0) {
      try {
         bqw var1 = getResource(var0);

         boolean var10000;
         try {
            if(var1 != null) {
               var10000 = true;
               return var10000;
            }
         } catch (IOException var2) {
            throw method_3487(var2);
         }

         var10000 = false;
         return var10000;
      } catch (IOException var3) {
         return false;
      }
   }

   public static boolean hasResource(bqy var0, bqx var1) {
      try {
         bqw var2 = var0.method_224(var1);

         boolean var10000;
         try {
            if(var2 != null) {
               var10000 = true;
               return var10000;
            }
         } catch (IOException var3) {
            throw method_3487(var3);
         }

         var10000 = false;
         return var10000;
      } catch (IOException var4) {
         return false;
      }
   }

   public static class_56[] getResourcePacks() {
      class_1511 var1 = minecraft.method_5290();
      List var2 = var1.method_8200();
      String[] var10000 = class_752.method_4253();
      ArrayList var3 = new ArrayList();
      String[] var0 = var10000;
      Iterator var4 = var2.iterator();

      ArrayList var7;
      while(true) {
         if(var4.hasNext()) {
            class_1514 var5 = (class_1514)var4.next();

            try {
               var7 = var3;
               if(var0 == null) {
                  break;
               }

               var3.add(var5.method_8220());
               if(var0 != null) {
                  continue;
               }
            } catch (NumberFormatException var6) {
               throw method_3487(var6);
            }
         }

         var7 = var3;
         break;
      }

      class_56[] var8 = (class_56[])((class_56[])var7.toArray(new class_56[var3.size()]));
      return var8;
   }

   public static String getResourcePackNames() {
      // $FF: Couldn't be decompiled
   }

   public static class_56 getDefaultResourcePack() {
      return minecraft.method_5290().field_7954;
   }

   public static boolean isFromDefaultResourcePack(bqx var0) {
      class_56 var1 = getDefiningResourcePack(var0);

      boolean var10000;
      try {
         if(var1 == getDefaultResourcePack()) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var2) {
         throw method_3487(var2);
      }

      var10000 = false;
      return var10000;
   }

   public static class_56 getDefiningResourcePack(bqx param0) {
      // $FF: Couldn't be decompiled
   }

   public static bma getRenderGlobal() {
      // $FF: Couldn't be decompiled
   }

   public static int getMaxDynamicTileWidth() {
      return 64;
   }

   public static class_73 getSideGrassTexture(ahl param0, int param1, int param2, int param3, int param4, class_73 param5) {
      // $FF: Couldn't be decompiled
   }

   public static class_73 getSideSnowGrassTexture(ahl param0, int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public static boolean isBetterGrass() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isBetterGrassFancy() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isWeatherEnabled() {
      return gameSettings.ofWeather;
   }

   public static boolean isSkyEnabled() {
      return gameSettings.ofSky;
   }

   public static boolean isSunMoonEnabled() {
      return gameSettings.ofSunMoon;
   }

   public static boolean isStarsEnabled() {
      return gameSettings.ofStars;
   }

   public static void sleep(long var0) {
      try {
         Thread.currentThread();
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
         var3.printStackTrace();
      }

   }

   public static boolean isTimeDayOnly() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isTimeDefault() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isTimeNightOnly() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isClearWater() {
      return gameSettings.ofClearWater;
   }

   public static int getAntialiasingLevel() {
      return antialiasingLevel;
   }

   public static boolean between(int param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public static boolean isMultiTexture() {
      return false;
   }

   public static boolean isDrippingWaterLava() {
      return gameSettings.ofDrippingWaterLava;
   }

   public static boolean isBetterSnow() {
      return gameSettings.ofBetterSnow;
   }

   public static Dimension getFullscreenDimension() {
      // $FF: Couldn't be decompiled
   }

   public static int parseInt(String var0, int var1) {
      String[] var2 = class_752.method_4253();

      try {
         String var10000;
         try {
            var10000 = var0;
            if(var2 == null) {
               return Integer.parseInt(var10000);
            }

            if(var0 == null) {
               return var1;
            }
         } catch (NumberFormatException var4) {
            throw method_3487(var4);
         }

         var10000 = var0;
         return Integer.parseInt(var10000);
      } catch (NumberFormatException var5) {
         return var1;
      }
   }

   public static float parseFloat(String var0, float var1) {
      String[] var2 = class_752.method_4253();

      try {
         String var10000;
         try {
            var10000 = var0;
            if(var2 == null) {
               return Float.parseFloat(var10000);
            }

            if(var0 == null) {
               return var1;
            }
         } catch (NumberFormatException var4) {
            throw method_3487(var4);
         }

         var10000 = var0;
         return Float.parseFloat(var10000);
      } catch (NumberFormatException var5) {
         return var1;
      }
   }

   public static String[] tokenize(String var0, String var1) {
      String[] var10000 = class_752.method_4253();
      StringTokenizer var3 = new StringTokenizer(var0, var1);
      ArrayList var4 = new ArrayList();
      String[] var2 = var10000;

      ArrayList var8;
      while(true) {
         if(var3.hasMoreTokens()) {
            String var5 = var3.nextToken();

            try {
               var8 = var4;
               if(var2 == null) {
                  break;
               }

               var4.add(var5);
               if(var2 != null) {
                  continue;
               }
            } catch (NumberFormatException var6) {
               throw method_3487(var6);
            }
         }

         var8 = var4;
         break;
      }

      String[] var7 = (String[])((String[])var8.toArray(new String[var4.size()]));
      return var7;
   }

   public static DisplayMode getDesktopDisplayMode() {
      return desktopDisplayMode;
   }

   public static DisplayMode[] getFullscreenDisplayModes() {
      // $FF: Couldn't be decompiled
   }

   public static String[] getFullscreenModes() {
      DisplayMode[] var1 = getFullscreenDisplayModes();
      String[] var10000 = class_752.method_4253();
      String[] var2 = new String[var1.length];
      String[] var0 = var10000;
      int var3 = 0;

      while(true) {
         if(var3 < var1.length) {
            DisplayMode var4 = var1[var3];
            String var5 = "" + var4.getWidth() + "x" + var4.getHeight();

            try {
               var10000 = var2;
               if(var0 == null) {
                  break;
               }

               var2[var3] = var5;
               ++var3;
               if(var0 != null) {
                  continue;
               }
            } catch (NumberFormatException var6) {
               throw method_3487(var6);
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   public static DisplayMode getDisplayMode(Dimension param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean isAnimatedTerrain() {
      return gameSettings.ofAnimatedTerrain;
   }

   public static boolean isAnimatedItems() {
      return gameSettings.ofAnimatedItems;
   }

   public static boolean isAnimatedTextures() {
      return gameSettings.ofAnimatedTextures;
   }

   public static boolean isSwampColors() {
      return gameSettings.ofSwampColors;
   }

   public static boolean isRandomMobs() {
      return gameSettings.ofRandomMobs;
   }

   public static void checkGlError(String var0) {
      String[] var10000 = class_752.method_4253();
      int var2 = GL11.glGetError();
      String[] var1 = var10000;

      int var6;
      label20: {
         try {
            var6 = var2;
            if(var1 == null) {
               break label20;
            }

            if(var2 == 0) {
               return;
            }
         } catch (NumberFormatException var5) {
            throw method_3487(var5);
         }

         var6 = var2;
      }

      String var3 = GLU.gluErrorString(var6);
      StringBuilder var7 = new StringBuilder();
      String[] var4 = field_2752;
      dbg(var7.append("OpenGlError: ").append(var2).append(" (").append(var3).append("), at: ").append(var0).toString());
   }

   public static boolean isSmoothBiomes() {
      return gameSettings.ofSmoothBiomes;
   }

   public static boolean isCustomColors() {
      return gameSettings.ofCustomColors;
   }

   public static boolean isCustomSky() {
      return gameSettings.ofCustomSky;
   }

   public static boolean isCustomFonts() {
      return gameSettings.ofCustomFonts;
   }

   public static boolean isShowCapes() {
      return gameSettings.ofShowCapes;
   }

   public static boolean isConnectedTextures() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isNaturalTextures() {
      return gameSettings.ofNaturalTextures;
   }

   public static boolean isConnectedTexturesFancy() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isFastRender() {
      return gameSettings.ofFastRender;
   }

   public static boolean isTranslucentBlocksFancy() {
      // $FF: Couldn't be decompiled
   }

   public static String[] readLines(File param0) {
      // $FF: Couldn't be decompiled
   }

   public static String readFile(File var0) {
      FileInputStream var1 = new FileInputStream(var0);
      String[] var10001 = field_2752;
      return readInputStream(var1, "ASCII");
   }

   public static String readInputStream(InputStream var0) {
      String[] var10001 = field_2752;
      return readInputStream(var0, "ASCII");
   }

   public static String readInputStream(InputStream param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   public static bbj getGameSettings() {
      return gameSettings;
   }

   public static String getNewRelease() {
      return newRelease;
   }

   public static void setNewRelease(String var0) {
      newRelease = var0;
   }

   public static int compareRelease(String param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   private static String[] splitRelease(String param0) {
      // $FF: Couldn't be decompiled
   }

   public static int intHash(int var0) {
      var0 = var0 ^ 61 ^ var0 >> 16;
      var0 += var0 << 3;
      var0 ^= var0 >> 4;
      var0 *= 668265261;
      var0 ^= var0 >> 15;
      return var0;
   }

   public static int getRandom(int var0, int var1, int var2, int var3) {
      int var4 = intHash(var3 + 37);
      var4 = intHash(var4 + var0);
      var4 = intHash(var4 + var2);
      var4 = intHash(var4 + var1);
      return var4;
   }

   public static class_354 getWorldServer() {
      // $FF: Couldn't be decompiled
   }

   public static int getAvailableProcessors() {
      return availableProcessors;
   }

   public static void updateAvailableProcessors() {
      availableProcessors = Runtime.getRuntime().availableProcessors();
   }

   public static boolean isSingleProcessor() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isSmoothWorld() {
      // $FF: Couldn't be decompiled
   }

   public static boolean isLazyChunkLoading() {
      // $FF: Couldn't be decompiled
   }

   public static int getChunkViewDistance() {
      // $FF: Couldn't be decompiled
   }

   public static boolean equals(Object param0, Object param1) {
      // $FF: Couldn't be decompiled
   }

   public static void checkDisplaySettings() {
      String[] var0 = class_752.method_4253();

      int var10000;
      label46: {
         try {
            var10000 = getAntialiasingLevel();
            if(var0 == null) {
               break label46;
            }

            if(var10000 <= 0) {
               return;
            }
         } catch (LWJGLException var12) {
            throw method_3487(var12);
         }

         var10000 = getAntialiasingLevel();
      }

      int var1 = var10000;
      DisplayMode var2 = Display.getDisplayMode();
      StringBuilder var13 = new StringBuilder();
      String[] var7 = field_2752;
      dbg(var13.append("FSAA Samples: ").append(var1).toString());

      try {
         Display.destroy();
         Display.setDisplayMode(var2);
         Display.create((new PixelFormat()).withDepthBits(24).withSamples(var1));
      } catch (LWJGLException var11) {
         var13 = new StringBuilder();
         var7 = field_2752;
         warn(var13.append("Error setting FSAA: ").append(var1).append("x").toString());
         var11.printStackTrace();

         try {
            Display.setDisplayMode(var2);
            Display.create((new PixelFormat()).withDepthBits(24));
         } catch (LWJGLException var10) {
            var10.printStackTrace();

            try {
               Display.setDisplayMode(var2);
               Display.create();
            } catch (LWJGLException var9) {
               var9.printStackTrace();
            }
         }
      }

      if(class_1847.method_9989() != class_929.field_4724) {
         try {
            File var14 = new File(minecraft.canLoseFocus9, "assets");
            var7 = field_2752;
            File var3 = var14;
            ByteBuffer var4 = readIconImage(new File(var3, "/icons/icon_16x16.png"));
            ByteBuffer var5 = readIconImage(new File(var3, "/icons/icon_32x32.png"));
            ByteBuffer[] var6 = new ByteBuffer[]{var4, var5};
            Display.setIcon(var6);
         } catch (IOException var8) {
            var13 = (new StringBuilder()).append(var8.getClass().getName());
            String[] var10001 = field_2752;
            dbg(var13.append(": ").append(var8.getMessage()).toString());
         }
      }

   }

   private static ByteBuffer readIconImage(File var0) {
      BufferedImage var2 = ImageIO.read(var0);
      String[] var10000 = class_752.method_4253();
      int[] var3 = var2.getRGB(0, 0, var2.getWidth(), var2.getHeight(), (int[])null, 0, var2.getWidth());
      ByteBuffer var4 = ByteBuffer.allocate(4 * var3.length);
      String[] var1 = var10000;
      int[] var5 = var3;
      int var6 = var3.length;
      int var7 = 0;

      while(true) {
         if(var7 < var6) {
            int var8 = var5[var7];

            try {
               var4.putInt(var8 << 8 | var8 >> 24 & 255);
               ++var7;
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  continue;
               }
            } catch (NumberFormatException var9) {
               throw method_3487(var9);
            }
         }

         var4.flip();
         break;
      }

      return var4;
   }

   public static void checkDisplayMode() {
      // $FF: Couldn't be decompiled
   }

   private static void updateFramebufferSize() {
      // $FF: Couldn't be decompiled
   }

   public static Object[] addObjectToArray(Object[] param0, Object param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_3486() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_3487(Throwable var0) {
      return var0;
   }
}
