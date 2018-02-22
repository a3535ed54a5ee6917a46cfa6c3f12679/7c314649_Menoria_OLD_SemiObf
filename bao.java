import com.google.common.collect.Multimap;
import com.google.common.util.concurrent.ListenableFuture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import net.minecraft.client.ClientBrandRetriever;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.Logger;
import org.lwjgl.Sys;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.OpenGLException;
import org.lwjgl.util.glu.GLU;

public class bao implements class_75 {

   // $FF: renamed from: F org.apache.logging.log4j.Logger
   private static final Logger text8;
   // $FF: renamed from: G bqx
   private static final bqx text9;
   // $FF: renamed from: a boolean
   public static final boolean maxStringLength0;
   // $FF: renamed from: b byte[]
   public static byte[] maxStringLength1;
   // $FF: renamed from: H java.util.List
   private static final List maxStringLength2;
   // $FF: renamed from: I java.io.File
   private final File maxStringLength3;
   // $FF: renamed from: J com.google.common.collect.Multimap
   private final Multimap maxStringLength4;
   // $FF: renamed from: K nF
   private class_1386 maxStringLength5;
   // $FF: renamed from: L bqf
   public bqf maxStringLength6;
   private static int tickCount;
   private static long lastCheck;
   private static long attackLastCheck;
   private static int attackCount;
   private boolean checkXrayTexturePack;
   // $FF: renamed from: M bao
   private static bao maxStringLength7;
   // $FF: renamed from: c ny
   public class_1440 maxStringLength8;
   // $FF: renamed from: N boolean
   private boolean maxStringLength9;
   // $FF: renamed from: O boolean
   private boolean cursorCounter0;
   // $FF: renamed from: P kj
   private class_1346 cursorCounter1;
   // $FF: renamed from: d int
   public int cursorCounter2;
   // $FF: renamed from: e int
   public int cursorCounter3;
   // $FF: renamed from: Q kS
   private class_1330 cursorCounter4;
   // $FF: renamed from: R vS
   private class_1683 cursorCounter5;
   // $FF: renamed from: f bjf
   public bjf cursorCounter6;
   // $FF: renamed from: g bma
   public bma cursorCounter7;
   // $FF: renamed from: h bjk
   public bjk cursorCounter8;
   // $FF: renamed from: i sv
   public class_752 cursorCounter9;
   // $FF: renamed from: j sa
   public class_689 enableBackgroundDrawing0;
   // $FF: renamed from: k bkn
   public bkn enableBackgroundDrawing1;
   // $FF: renamed from: S kT
   private final class_1331 enableBackgroundDrawing2;
   // $FF: renamed from: T boolean
   private boolean enableBackgroundDrawing3;
   // $FF: renamed from: l kU
   public FontRenderer enableBackgroundDrawing4;
   // $FF: renamed from: m kU
   public FontRenderer enableBackgroundDrawing5;
   // $FF: renamed from: n bdw
   public bdw enableBackgroundDrawing6;
   // $FF: renamed from: o kQ
   public class_1328 enableBackgroundDrawing7;
   // $FF: renamed from: p blt
   public blt enableBackgroundDrawing8;
   // $FF: renamed from: U int
   private int enableBackgroundDrawing9;
   // $FF: renamed from: V int
   private int canLoseFocus0;
   // $FF: renamed from: W int
   private int canLoseFocus1;
   // $FF: renamed from: X up
   private class_357 canLoseFocus2;
   // $FF: renamed from: q l4
   public class_138 canLoseFocus3;
   // $FF: renamed from: r bbv
   public bbv canLoseFocus4;
   // $FF: renamed from: s boolean
   public boolean canLoseFocus5;
   // $FF: renamed from: t azu
   public azu canLoseFocus6;
   // $FF: renamed from: u bbj
   public bbj canLoseFocus7;
   // $FF: renamed from: v kM
   public class_1324 canLoseFocus8;
   // $FF: renamed from: w java.io.File
   public final File canLoseFocus9;
   // $FF: renamed from: Y java.io.File
   private final File isFocused0;
   // $FF: renamed from: Z java.lang.String
   private final String isFocused1;
   // $FF: renamed from: aa java.net.Proxy
   private final Proxy isFocused2;
   // $FF: renamed from: ab j_
   private class_30 isFocused3;
   // $FF: renamed from: ac int
   private static int isFocused4;
   // $FF: renamed from: ad int
   private int isFocused5;
   // $FF: renamed from: ae boolean
   private boolean isFocused6;
   // $FF: renamed from: af java.lang.String
   private String isFocused7;
   // $FF: renamed from: ag int
   private int isFocused8;
   // $FF: renamed from: x boolean
   public boolean isFocused9;
   // $FF: renamed from: y long
   long isEnabled0;
   // $FF: renamed from: ah int
   private int isEnabled1;
   // $FF: renamed from: ai boolean
   private final boolean isEnabled2;
   // $FF: renamed from: aj boolean
   private final boolean isEnabled3;
   // $FF: renamed from: ak l
   private class_120 isEnabled4;
   // $FF: renamed from: al boolean
   private boolean isEnabled5;
   // $FF: renamed from: z qi
   public final class_1535 isEnabled6;
   // $FF: renamed from: am long
   private long isEnabled7;
   // $FF: renamed from: an pr
   private class_54 isEnabled8;
   // $FF: renamed from: ao pS
   private final class_1479 isEnabled9;
   // $FF: renamed from: ap java.util.List
   private List lineScrollOffset0;
   // $FF: renamed from: aq pn
   private class_1506 lineScrollOffset1;
   // $FF: renamed from: ar pu
   private class_1511 lineScrollOffset2;
   // $FF: renamed from: as pI
   private class_1452 lineScrollOffset3;
   // $FF: renamed from: at qC
   private class_51 lineScrollOffset4;
   // $FF: renamed from: au bmg
   private bmg lineScrollOffset5;
   // $FF: renamed from: av bpz
   private bpz lineScrollOffset6;
   // $FF: renamed from: aw ql
   private class_1541 lineScrollOffset7;
   // $FF: renamed from: ax qf
   private class_1529 lineScrollOffset8;
   // $FF: renamed from: ay bqx
   private bqx lineScrollOffset9;
   // $FF: renamed from: az com.mojang.authlib.minecraft.MinecraftSessionService
   private final MinecraftSessionService cursorPosition0;
   // $FF: renamed from: aA pB
   private class_1444 cursorPosition1;
   // $FF: renamed from: aB java.util.Queue
   private final Queue cursorPosition2;
   // $FF: renamed from: aC java.lang.Thread
   private final Thread cursorPosition3;
   // $FF: renamed from: A boolean
   public volatile boolean cursorPosition4;
   // $FF: renamed from: B java.lang.String
   public String cursorPosition5;
   // $FF: renamed from: C long
   long cursorPosition6;
   // $FF: renamed from: D int
   int cursorPosition7;
   // $FF: renamed from: E long
   long cursorPosition8;
   // $FF: renamed from: aD java.lang.String
   private String cursorPosition9;
   private static final String __OBFID;
   // $FF: renamed from: bb java.lang.String[]
   private static final String[] selectionEnd0;


   // $FF: renamed from: <init> (kT, int, int, boolean, boolean, java.io.File, java.io.File, java.io.File, java.net.Proxy, java.lang.String, com.google.common.collect.Multimap, java.lang.String) void
   public void method_5220(class_1331 param1, int param2, int param3, boolean param4, boolean param5, File param6, File param7, File param8, Proxy param9, String param10, Multimap param11, String param12) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: ae () boolean
   private static boolean method_5221() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () bmg
   public bmg method_5222() {
      return this.lineScrollOffset5;
   }

   // $FF: renamed from: af () void
   private void method_5223() {
      class_644 var10000 = new class_644;
      String[] var10003 = selectionEnd0;
      var10000.method_3527(this, "Timer hack thread");
      class_644 var1 = var10000;
      var1.setDaemon(true);
      var1.start();
   }

   // $FF: renamed from: a (kj) void
   public void method_5224(class_1346 var1) {
      this.cursorCounter0 = true;
      this.cursorCounter1 = var1;
   }

   // $FF: renamed from: c (kj) void
   public void method_5225(class_1346 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.String, int) void
   public void method_5226(String var1, int var2) {
      this.isFocused7 = var1;
      this.isFocused8 = var2;
   }

   // $FF: renamed from: ag () void
   private void method_5227() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () boolean
   public boolean method_5228() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () void
   public void method_5229() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: ah () void
   private void method_5230() {
      this.lineScrollOffset0.add(this.lineScrollOffset1);
   }

   // $FF: renamed from: a (java.io.InputStream) java.nio.ByteBuffer
   private ByteBuffer method_5231(InputStream var1) {
      BufferedImage var3 = ImageIO.read(var1);
      int[] var4 = var3.getRGB(0, 0, var3.getWidth(), var3.getHeight(), (int[])null, 0, var3.getWidth());
      String[] var10000 = class_752.method_4253();
      ByteBuffer var5 = ByteBuffer.allocate(4 * var4.length);
      String[] var2 = var10000;
      int[] var6 = var4;
      int var7 = var4.length;
      int var8 = 0;

      while(true) {
         if(var8 < var7) {
            int var9 = var6[var8];

            try {
               var5.putInt(var9 << 8 | var9 >> 24 & 255);
               ++var8;
               if(var2 == null) {
                  break;
               }

               if(var2 != null) {
                  continue;
               }
            } catch (OpenGLException var10) {
               throw method_5307(var10);
            }
         }

         var5.flip();
         break;
      }

      return var5;
   }

   // $FF: renamed from: ai () void
   private void method_5232() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: aj () void
   private void method_5233() {
      class_1338 var10000 = new class_1338;
      var10000.method_7060(this, this.cursorCounter2, this.cursorCounter3);
      class_1338 var1 = var10000;
      int var2 = var1.method_7065();
      bmg var9 = new bmg;
      var9.method_7484(var1.method_7061() * var2, var1.method_7062() * var2, true);
      bmg var3 = var9;
      var3.method_7492(false);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, (double)var1.method_7061(), (double)var1.method_7062(), 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      GL11.glDisable(2929);
      GL11.glEnable(3553);

      try {
         bqf var11 = this.maxStringLength6;
         String[] var7 = selectionEnd0;
         bpq var10003 = new bpq;
         var10003.method_7979(ImageIO.read(this.lineScrollOffset1.method_228(text9)));
         this.lineScrollOffset9 = var11.method_8122("logo", var10003);
         this.maxStringLength6.bindTexture(this.lineScrollOffset9);
      } catch (IOException var8) {
         Logger var10 = text8;
         StringBuilder var10001 = new StringBuilder();
         String[] var10002 = selectionEnd0;
         var10.error(var10001.append("Unable to load logo: ").append(text9).toString(), var8);
      }

      bmh var4 = bmh.instance;
      var4.setVisible2();
      var4.method_7463(16777215);
      var4.addVertexWithUV(0.0D, (double)this.cursorCounter3, 0.0D, 0.0D, 0.0D);
      var4.addVertexWithUV((double)this.cursorCounter2, (double)this.cursorCounter3, 0.0D, 0.0D, 0.0D);
      var4.addVertexWithUV((double)this.cursorCounter2, 0.0D, 0.0D, 0.0D, 0.0D);
      var4.addVertexWithUV(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
      var4.getVisible8();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      var4.method_7463(16777215);
      short var5 = 256;
      short var6 = 256;
      this.method_5234((var1.method_7061() - var5) / 2, (var1.method_7062() - var6) / 2, 0, 0, var5, var6);
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      var3.method_7493();
      var3.method_7495(var1.method_7061() * var2, var1.method_7062() * var2);
      GL11.glEnable(3008);
      GL11.glAlphaFunc(516, 0.1F);
      GL11.glFlush();
      this.method_5241();
   }

   // $FF: renamed from: a (int, int, int, int, int, int) void
   public void method_5234(int var1, int var2, int var3, int var4, int var5, int var6) {
      float var7 = 0.00390625F;
      float var8 = 0.00390625F;
      bmh var9 = bmh.instance;
      var9.setVisible2();
      var9.addVertexWithUV((double)(var1 + 0), (double)(var2 + var6), 0.0D, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8));
      var9.addVertexWithUV((double)(var1 + var5), (double)(var2 + var6), 0.0D, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8));
      var9.addVertexWithUV((double)(var1 + var5), (double)(var2 + 0), 0.0D, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8));
      var9.addVertexWithUV((double)(var1 + 0), (double)(var2 + 0), 0.0D, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8));
      var9.getVisible8();
   }

   // $FF: renamed from: d () j_
   public class_30 method_5235() {
      return this.isFocused3;
   }

   // $FF: renamed from: a (bdw) void
   public void method_5236(bdw param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String) void
   private void method_5237(String var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = GL11.glGetError();
      String[] var2 = var10000;

      int var7;
      label20: {
         try {
            var7 = var3;
            if(var2 == null) {
               break label20;
            }

            if(var3 == 0) {
               return;
            }
         } catch (OpenGLException var6) {
            throw method_5307(var6);
         }

         var7 = var3;
      }

      String var4 = GLU.gluErrorString(var7);
      String[] var5 = selectionEnd0;
      text8.error("########## GL ERROR ##########");
      text8.error("@ " + var1);
      text8.error(var3 + ": " + var4);
   }

   // $FF: renamed from: e () void
   public void method_5238() {
      String[] var1 = class_752.method_4253();
      boolean var9 = false;

      try {
         var9 = true;
         this.lineScrollOffset4.method_191();
         String[] var10001 = selectionEnd0;
         text8.info("Stopping!");

         try {
            this.method_5259((bjf)null);
         } catch (Throwable var11) {
            ;
         }

         try {
            ban.method_5197();
         } catch (Throwable var10) {
            ;
         }

         this.lineScrollOffset7.method_8371();
         var9 = false;
      } finally {
         if(var9) {
            label96: {
               byte var10000;
               label95: {
                  try {
                     Display.destroy();
                     var10000 = this.cursorCounter0;
                     if(var1 == null) {
                        break label95;
                     }

                     if(this.cursorCounter0) {
                        break label96;
                     }
                  } catch (Throwable var12) {
                     throw method_5307(var12);
                  }

                  var10000 = 0;
               }

               System.exit(var10000);
            }

         }
      }

      Display.destroy();
      if(var1 != null) {
         try {
            if(!this.cursorCounter0) {
               System.exit(0);
            }
         } catch (Throwable var14) {
            throw method_5307(var14);
         }

         System.gc();
      }

   }

   // $FF: renamed from: f () void
   public void method_5239() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: ak () void
   private void method_5240() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g () void
   public void method_5241() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: h () int
   public int method_5242() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: i () boolean
   public boolean method_5243() {
      String[] var1 = class_752.method_4253();

      int var10000;
      label32: {
         try {
            float var3;
            var10000 = (var3 = (float)this.method_5242() - class_101.field_99.method_471()) == 0.0F?0:(var3 < 0.0F?-1:1);
            if(var1 == null) {
               return (boolean)var10000;
            }

            if(var10000 < 0) {
               break label32;
            }
         } catch (OpenGLException var2) {
            throw method_5307(var2);
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   // $FF: renamed from: j () void
   public void method_5244() {
      try {
         maxStringLength1 = new byte[0];
         this.cursorCounter7.setSelectionPos8();
      } catch (Throwable var4) {
         ;
      }

      try {
         System.gc();
      } catch (Throwable var3) {
         ;
      }

      try {
         System.gc();
         this.method_5259((bjf)null);
      } catch (Throwable var2) {
         ;
      }

      System.gc();
   }

   // $FF: renamed from: b (int) void
   private void method_5245(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (long) void
   private void method_5246(long param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: k () void
   public void method_5247() {
      this.cursorPosition4 = false;
   }

   // $FF: renamed from: l () void
   public void method_5248() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: m () void
   public void method_5249() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: n () void
   public void method_5250() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (boolean) void
   private void method_5251(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: al () void
   private void method_5252() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: am () void
   private void method_5253() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: o () void
   public void method_5254() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int) void
   private void method_5255(int var1, int var2) {
      String[] var3 = class_752.method_4253();

      bao var10000;
      int var10001;
      label55: {
         label54: {
            try {
               var10000 = this;
               var10001 = var1;
               if(var3 == null) {
                  break label55;
               }

               if(var1 <= 0) {
                  break label54;
               }
            } catch (OpenGLException var9) {
               throw method_5307(var9);
            }

            var10001 = var1;
            break label55;
         }

         var10001 = 1;
      }

      label46: {
         label45: {
            try {
               var10000.cursorCounter2 = var10001;
               var10000 = this;
               var10001 = var2;
               if(var3 == null) {
                  break label46;
               }

               if(var2 <= 0) {
                  break label45;
               }
            } catch (OpenGLException var8) {
               throw method_5307(var8);
            }

            var10001 = var2;
            break label46;
         }

         var10001 = 1;
      }

      label37: {
         label36: {
            try {
               var10000.cursorCounter3 = var10001;
               var10000 = this;
               if(var3 == null) {
                  break label37;
               }

               if(this.enableBackgroundDrawing6 == null) {
                  break label36;
               }
            } catch (OpenGLException var7) {
               throw method_5307(var7);
            }

            class_1338 var10 = new class_1338;
            var10.method_7060(this, var1, var2);
            class_1338 var4 = var10;
            int var5 = var4.method_7061();
            int var6 = var4.method_7062();
            this.enableBackgroundDrawing6.method_866(this, var5, var6);
         }

         class_1328 var11 = new class_1328;
         var11.method_6980(this);
         this.enableBackgroundDrawing7 = var11;
         var10000 = this;
      }

      var10000.method_5256();
   }

   // $FF: renamed from: an () void
   private void method_5256() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: p () void
   public void method_5257() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, dt) void
   public void method_5258(String param1, String param2, class_1045 param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (bjf) void
   public void method_5259(bjf var1) {
      this.method_5260(var1, "");
   }

   // $FF: renamed from: a (bjf, java.lang.String) void
   public void method_5260(bjf param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: q () java.lang.String
   public String method_5261() {
      return this.cursorCounter7.getSelectionEnd9();
   }

   // $FF: renamed from: r () java.lang.String
   public String method_5262() {
      return this.cursorCounter7.getWidth0();
   }

   // $FF: renamed from: s () java.lang.String
   public String method_5263() {
      return this.cursorCounter6.method_2130();
   }

   // $FF: renamed from: t () java.lang.String
   public String method_5264() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = selectionEnd0;
      return var10000.append("P: ").append(this.enableBackgroundDrawing1.method_6975()).append(". T: ").append(this.cursorCounter6.method_2129()).toString();
   }

   // $FF: renamed from: a (int) void
   public void method_5265(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: u () boolean
   public final boolean method_5266() {
      return this.isEnabled3;
   }

   // $FF: renamed from: v () nv
   public class_1436 method_5267() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: w () boolean
   public static boolean method_5268() {
      String[] var0 = class_752.method_4253();

      boolean var3;
      label47: {
         bao var10000;
         label34: {
            try {
               var10000 = maxStringLength7;
               if(var0 == null) {
                  break label34;
               }

               if(maxStringLength7 == null) {
                  break label47;
               }
            } catch (OpenGLException var2) {
               throw method_5307(var2);
            }

            var10000 = maxStringLength7;
         }

         try {
            var3 = var10000.canLoseFocus7.field_4560;
            if(var0 == null) {
               return var3;
            }

            if(!var3) {
               break label47;
            }
         } catch (OpenGLException var1) {
            throw method_5307(var1);
         }

         var3 = false;
         return var3;
      }

      var3 = true;
      return var3;
   }

   // $FF: renamed from: x () boolean
   public static boolean method_5269() {
      String[] var0 = class_752.method_4253();

      boolean var3;
      label47: {
         bao var10000;
         label34: {
            try {
               var10000 = maxStringLength7;
               if(var0 == null) {
                  break label34;
               }

               if(maxStringLength7 == null) {
                  break label47;
               }
            } catch (OpenGLException var2) {
               throw method_5307(var2);
            }

            var10000 = maxStringLength7;
         }

         try {
            var3 = var10000.canLoseFocus7.field_4493;
            if(var0 == null) {
               return var3;
            }

            if(!var3) {
               break label47;
            }
         } catch (OpenGLException var1) {
            throw method_5307(var1);
         }

         var3 = true;
         return var3;
      }

      var3 = false;
      return var3;
   }

   // $FF: renamed from: y () boolean
   public static boolean method_5270() {
      String[] var0 = class_752.method_4253();

      int var3;
      label47: {
         bao var10000;
         label34: {
            try {
               var10000 = maxStringLength7;
               if(var0 == null) {
                  break label34;
               }

               if(maxStringLength7 == null) {
                  break label47;
               }
            } catch (OpenGLException var2) {
               throw method_5307(var2);
            }

            var10000 = maxStringLength7;
         }

         try {
            var3 = var10000.canLoseFocus7.field_4494;
            if(var0 == null) {
               return (boolean)var3;
            }

            if(var3 == 0) {
               break label47;
            }
         } catch (OpenGLException var1) {
            throw method_5307(var1);
         }

         var3 = 1;
         return (boolean)var3;
      }

      var3 = 0;
      return (boolean)var3;
   }

   // $FF: renamed from: ao () void
   private void method_5271() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (kj) kj
   public class_1346 method_5272(class_1346 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: B () bao
   public static bao method_5273() {
      return maxStringLength7;
   }

   // $FF: renamed from: C () void
   public void method_5274() {
      this.isFocused6 = true;
   }

   // $FF: renamed from: a (vS) void
   public void method_376(class_1683 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (vS) void
   public void method_377(class_1683 var1) {
      String[] var3 = selectionEnd0;
      var1.method_9271("opengl_version", GL11.glGetString(7938));
      var1.method_9271("opengl_vendor", GL11.glGetString(7936));
      var1.method_9271("client_brand", ClientBrandRetriever.getClientModName());
      var1.method_9271("launched_version", this.isFocused1);
      ContextCapabilities var2 = GLContext.getCapabilities();
      var1.method_9271("gl_caps[ARB_arrays_of_arrays]", Boolean.valueOf(var2.GL_ARB_arrays_of_arrays));
      var1.method_9271("gl_caps[ARB_base_instance]", Boolean.valueOf(var2.GL_ARB_base_instance));
      var1.method_9271("gl_caps[ARB_blend_func_extended]", Boolean.valueOf(var2.GL_ARB_blend_func_extended));
      var1.method_9271("gl_caps[ARB_clear_buffer_object]", Boolean.valueOf(var2.GL_ARB_clear_buffer_object));
      var1.method_9271("gl_caps[ARB_color_buffer_float]", Boolean.valueOf(var2.GL_ARB_color_buffer_float));
      var1.method_9271("gl_caps[ARB_compatibility]", Boolean.valueOf(var2.GL_ARB_compatibility));
      var1.method_9271("gl_caps[ARB_compressed_texture_pixel_storage]", Boolean.valueOf(var2.GL_ARB_compressed_texture_pixel_storage));
      var1.method_9271("gl_caps[ARB_compute_shader]", Boolean.valueOf(var2.GL_ARB_compute_shader));
      var1.method_9271("gl_caps[ARB_copy_buffer]", Boolean.valueOf(var2.GL_ARB_copy_buffer));
      var1.method_9271("gl_caps[ARB_copy_image]", Boolean.valueOf(var2.GL_ARB_copy_image));
      var1.method_9271("gl_caps[ARB_depth_buffer_float]", Boolean.valueOf(var2.GL_ARB_depth_buffer_float));
      var1.method_9271("gl_caps[ARB_compute_shader]", Boolean.valueOf(var2.GL_ARB_compute_shader));
      var1.method_9271("gl_caps[ARB_copy_buffer]", Boolean.valueOf(var2.GL_ARB_copy_buffer));
      var1.method_9271("gl_caps[ARB_copy_image]", Boolean.valueOf(var2.GL_ARB_copy_image));
      var1.method_9271("gl_caps[ARB_depth_buffer_float]", Boolean.valueOf(var2.GL_ARB_depth_buffer_float));
      var1.method_9271("gl_caps[ARB_depth_clamp]", Boolean.valueOf(var2.GL_ARB_depth_clamp));
      var1.method_9271("gl_caps[ARB_depth_texture]", Boolean.valueOf(var2.GL_ARB_depth_texture));
      var1.method_9271("gl_caps[ARB_draw_buffers]", Boolean.valueOf(var2.GL_ARB_draw_buffers));
      var1.method_9271("gl_caps[ARB_draw_buffers_blend]", Boolean.valueOf(var2.GL_ARB_draw_buffers_blend));
      var1.method_9271("gl_caps[ARB_draw_elements_base_vertex]", Boolean.valueOf(var2.GL_ARB_draw_elements_base_vertex));
      var1.method_9271("gl_caps[ARB_draw_indirect]", Boolean.valueOf(var2.GL_ARB_draw_indirect));
      var1.method_9271("gl_caps[ARB_draw_instanced]", Boolean.valueOf(var2.GL_ARB_draw_instanced));
      var1.method_9271("gl_caps[ARB_explicit_attrib_location]", Boolean.valueOf(var2.GL_ARB_explicit_attrib_location));
      var1.method_9271("gl_caps[ARB_explicit_uniform_location]", Boolean.valueOf(var2.GL_ARB_explicit_uniform_location));
      var1.method_9271("gl_caps[ARB_fragment_layer_viewport]", Boolean.valueOf(var2.GL_ARB_fragment_layer_viewport));
      var1.method_9271("gl_caps[ARB_fragment_program]", Boolean.valueOf(var2.GL_ARB_fragment_program));
      var1.method_9271("gl_caps[ARB_fragment_shader]", Boolean.valueOf(var2.GL_ARB_fragment_shader));
      var1.method_9271("gl_caps[ARB_fragment_program_shadow]", Boolean.valueOf(var2.GL_ARB_fragment_program_shadow));
      var1.method_9271("gl_caps[ARB_framebuffer_object]", Boolean.valueOf(var2.GL_ARB_framebuffer_object));
      var1.method_9271("gl_caps[ARB_framebuffer_sRGB]", Boolean.valueOf(var2.GL_ARB_framebuffer_sRGB));
      var1.method_9271("gl_caps[ARB_geometry_shader4]", Boolean.valueOf(var2.GL_ARB_geometry_shader4));
      var1.method_9271("gl_caps[ARB_gpu_shader5]", Boolean.valueOf(var2.GL_ARB_gpu_shader5));
      var1.method_9271("gl_caps[ARB_half_float_pixel]", Boolean.valueOf(var2.GL_ARB_half_float_pixel));
      var1.method_9271("gl_caps[ARB_half_float_vertex]", Boolean.valueOf(var2.GL_ARB_half_float_vertex));
      var1.method_9271("gl_caps[ARB_instanced_arrays]", Boolean.valueOf(var2.GL_ARB_instanced_arrays));
      var1.method_9271("gl_caps[ARB_map_buffer_alignment]", Boolean.valueOf(var2.GL_ARB_map_buffer_alignment));
      var1.method_9271("gl_caps[ARB_map_buffer_range]", Boolean.valueOf(var2.GL_ARB_map_buffer_range));
      var1.method_9271("gl_caps[ARB_multisample]", Boolean.valueOf(var2.GL_ARB_multisample));
      var1.method_9271("gl_caps[ARB_multitexture]", Boolean.valueOf(var2.GL_ARB_multitexture));
      var1.method_9271("gl_caps[ARB_occlusion_query2]", Boolean.valueOf(var2.GL_ARB_occlusion_query2));
      var1.method_9271("gl_caps[ARB_pixel_buffer_object]", Boolean.valueOf(var2.GL_ARB_pixel_buffer_object));
      var1.method_9271("gl_caps[ARB_seamless_cube_map]", Boolean.valueOf(var2.GL_ARB_seamless_cube_map));
      var1.method_9271("gl_caps[ARB_shader_objects]", Boolean.valueOf(var2.GL_ARB_shader_objects));
      var1.method_9271("gl_caps[ARB_shader_stencil_export]", Boolean.valueOf(var2.GL_ARB_shader_stencil_export));
      var1.method_9271("gl_caps[ARB_shader_texture_lod]", Boolean.valueOf(var2.GL_ARB_shader_texture_lod));
      var1.method_9271("gl_caps[ARB_shadow]", Boolean.valueOf(var2.GL_ARB_shadow));
      var1.method_9271("gl_caps[ARB_shadow_ambient]", Boolean.valueOf(var2.GL_ARB_shadow_ambient));
      var1.method_9271("gl_caps[ARB_stencil_texturing]", Boolean.valueOf(var2.GL_ARB_stencil_texturing));
      var1.method_9271("gl_caps[ARB_sync]", Boolean.valueOf(var2.GL_ARB_sync));
      var1.method_9271("gl_caps[ARB_tessellation_shader]", Boolean.valueOf(var2.GL_ARB_tessellation_shader));
      var1.method_9271("gl_caps[ARB_texture_border_clamp]", Boolean.valueOf(var2.GL_ARB_texture_border_clamp));
      var1.method_9271("gl_caps[ARB_texture_buffer_object]", Boolean.valueOf(var2.GL_ARB_texture_buffer_object));
      var1.method_9271("gl_caps[ARB_texture_cube_map]", Boolean.valueOf(var2.GL_ARB_texture_cube_map));
      var1.method_9271("gl_caps[ARB_texture_cube_map_array]", Boolean.valueOf(var2.GL_ARB_texture_cube_map_array));
      var1.method_9271("gl_caps[ARB_texture_non_power_of_two]", Boolean.valueOf(var2.GL_ARB_texture_non_power_of_two));
      var1.method_9271("gl_caps[ARB_uniform_buffer_object]", Boolean.valueOf(var2.GL_ARB_uniform_buffer_object));
      var1.method_9271("gl_caps[ARB_vertex_blend]", Boolean.valueOf(var2.GL_ARB_vertex_blend));
      var1.method_9271("gl_caps[ARB_vertex_buffer_object]", Boolean.valueOf(var2.GL_ARB_vertex_buffer_object));
      var1.method_9271("gl_caps[ARB_vertex_program]", Boolean.valueOf(var2.GL_ARB_vertex_program));
      var1.method_9271("gl_caps[ARB_vertex_shader]", Boolean.valueOf(var2.GL_ARB_vertex_shader));
      var1.method_9271("gl_caps[EXT_bindable_uniform]", Boolean.valueOf(var2.GL_EXT_bindable_uniform));
      var1.method_9271("gl_caps[EXT_blend_equation_separate]", Boolean.valueOf(var2.GL_EXT_blend_equation_separate));
      var1.method_9271("gl_caps[EXT_blend_func_separate]", Boolean.valueOf(var2.GL_EXT_blend_func_separate));
      var1.method_9271("gl_caps[EXT_blend_minmax]", Boolean.valueOf(var2.GL_EXT_blend_minmax));
      var1.method_9271("gl_caps[EXT_blend_subtract]", Boolean.valueOf(var2.GL_EXT_blend_subtract));
      var1.method_9271("gl_caps[EXT_draw_instanced]", Boolean.valueOf(var2.GL_EXT_draw_instanced));
      var1.method_9271("gl_caps[EXT_framebuffer_multisample]", Boolean.valueOf(var2.GL_EXT_framebuffer_multisample));
      var1.method_9271("gl_caps[EXT_framebuffer_object]", Boolean.valueOf(var2.GL_EXT_framebuffer_object));
      var1.method_9271("gl_caps[EXT_framebuffer_sRGB]", Boolean.valueOf(var2.GL_EXT_framebuffer_sRGB));
      var1.method_9271("gl_caps[EXT_geometry_shader4]", Boolean.valueOf(var2.GL_EXT_geometry_shader4));
      var1.method_9271("gl_caps[EXT_gpu_program_parameters]", Boolean.valueOf(var2.GL_EXT_gpu_program_parameters));
      var1.method_9271("gl_caps[EXT_gpu_shader4]", Boolean.valueOf(var2.GL_EXT_gpu_shader4));
      var1.method_9271("gl_caps[EXT_multi_draw_arrays]", Boolean.valueOf(var2.GL_EXT_multi_draw_arrays));
      var1.method_9271("gl_caps[EXT_packed_depth_stencil]", Boolean.valueOf(var2.GL_EXT_packed_depth_stencil));
      var1.method_9271("gl_caps[EXT_paletted_texture]", Boolean.valueOf(var2.GL_EXT_paletted_texture));
      var1.method_9271("gl_caps[EXT_rescale_normal]", Boolean.valueOf(var2.GL_EXT_rescale_normal));
      var1.method_9271("gl_caps[EXT_separate_shader_objects]", Boolean.valueOf(var2.GL_EXT_separate_shader_objects));
      var1.method_9271("gl_caps[EXT_shader_image_load_store]", Boolean.valueOf(var2.GL_EXT_shader_image_load_store));
      var1.method_9271("gl_caps[EXT_shadow_funcs]", Boolean.valueOf(var2.GL_EXT_shadow_funcs));
      var1.method_9271("gl_caps[EXT_shared_texture_palette]", Boolean.valueOf(var2.GL_EXT_shared_texture_palette));
      var1.method_9271("gl_caps[EXT_stencil_clear_tag]", Boolean.valueOf(var2.GL_EXT_stencil_clear_tag));
      var1.method_9271("gl_caps[EXT_stencil_two_side]", Boolean.valueOf(var2.GL_EXT_stencil_two_side));
      var1.method_9271("gl_caps[EXT_stencil_wrap]", Boolean.valueOf(var2.GL_EXT_stencil_wrap));
      var1.method_9271("gl_caps[EXT_texture_3d]", Boolean.valueOf(var2.GL_EXT_texture_3d));
      var1.method_9271("gl_caps[EXT_texture_array]", Boolean.valueOf(var2.GL_EXT_texture_array));
      var1.method_9271("gl_caps[EXT_texture_buffer_object]", Boolean.valueOf(var2.GL_EXT_texture_buffer_object));
      var1.method_9271("gl_caps[EXT_texture_filter_anisotropic]", Boolean.valueOf(var2.GL_EXT_texture_filter_anisotropic));
      var1.method_9271("gl_caps[EXT_texture_integer]", Boolean.valueOf(var2.GL_EXT_texture_integer));
      var1.method_9271("gl_caps[EXT_texture_lod_bias]", Boolean.valueOf(var2.GL_EXT_texture_lod_bias));
      var1.method_9271("gl_caps[EXT_texture_sRGB]", Boolean.valueOf(var2.GL_EXT_texture_sRGB));
      var1.method_9271("gl_caps[EXT_vertex_shader]", Boolean.valueOf(var2.GL_EXT_vertex_shader));
      var1.method_9271("gl_caps[EXT_vertex_weighting]", Boolean.valueOf(var2.GL_EXT_vertex_weighting));
      var1.method_9271("gl_caps[gl_max_vertex_uniforms]", Integer.valueOf(GL11.glGetInteger('\u8b4a')));
      GL11.glGetError();
      var1.method_9271("gl_caps[gl_max_fragment_uniforms]", Integer.valueOf(GL11.glGetInteger('\u8b49')));
      GL11.glGetError();
      var1.method_9271("gl_caps[gl_max_vertex_attribs]", Integer.valueOf(GL11.glGetInteger('\u8869')));
      GL11.glGetError();
      var1.method_9271("gl_caps[gl_max_vertex_texture_image_units]", Integer.valueOf(GL11.glGetInteger('\u8b4c')));
      GL11.glGetError();
      var1.method_9271("gl_caps[gl_max_texture_image_units]", Integer.valueOf(GL11.glGetInteger('\u8872')));
      GL11.glGetError();
      var1.method_9271("gl_caps[gl_max_texture_image_units]", Integer.valueOf(GL11.glGetInteger('\u88ff')));
      GL11.glGetError();
      var1.method_9271("gl_max_texture_size", Integer.valueOf(method_5275()));
   }

   // $FF: renamed from: D () int
   public static int method_5275() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: W () boolean
   public boolean method_378() {
      return this.canLoseFocus7.field_4502;
   }

   // $FF: renamed from: a (nF) void
   public void method_5276(class_1386 var1) {
      this.maxStringLength5 = var1;
   }

   // $FF: renamed from: E () nF
   public class_1386 method_5277() {
      return this.maxStringLength5;
   }

   // $FF: renamed from: F () boolean
   public boolean method_5278() {
      return this.isEnabled5;
   }

   // $FF: renamed from: G () boolean
   public boolean method_5279() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: H () up
   public class_357 method_5280() {
      return this.canLoseFocus2;
   }

   // $FF: renamed from: I () void
   public static void method_5281() {
      String[] var0 = class_752.method_4253();

      bao var10000;
      label36: {
         try {
            var10000 = maxStringLength7;
            if(var0 == null) {
               break label36;
            }

            if(maxStringLength7 == null) {
               return;
            }
         } catch (OpenGLException var3) {
            throw method_5307(var3);
         }

         var10000 = maxStringLength7;
      }

      class_357 var1 = var10000.method_5280();

      class_357 var4;
      label27: {
         try {
            var4 = var1;
            if(var0 == null) {
               break label27;
            }

            if(var1 == null) {
               return;
            }
         } catch (OpenGLException var2) {
            throw method_5307(var2);
         }

         var4 = var1;
      }

      var4.method_2327();
   }

   // $FF: renamed from: J () vS
   public class_1683 method_5282() {
      return this.cursorCounter5;
   }

   // $FF: renamed from: K () long
   public static long method_5283() {
      return Sys.getTime() * 1000L / Sys.getTimerResolution();
   }

   // $FF: renamed from: L () boolean
   public boolean method_5284() {
      return this.maxStringLength9;
   }

   // $FF: renamed from: M () kT
   public class_1331 method_5285() {
      return this.enableBackgroundDrawing2;
   }

   // $FF: renamed from: N () com.google.common.collect.Multimap
   public Multimap method_5286() {
      return this.maxStringLength4;
   }

   // $FF: renamed from: O () java.net.Proxy
   public Proxy method_5287() {
      return this.isFocused2;
   }

   // $FF: renamed from: P () bqf
   public bqf method_5288() {
      return this.maxStringLength6;
   }

   // $FF: renamed from: Q () bqy
   public bqy method_5289() {
      return this.isEnabled8;
   }

   // $FF: renamed from: R () pu
   public class_1511 method_5290() {
      return this.lineScrollOffset2;
   }

   // $FF: renamed from: S () pI
   public class_1452 method_5291() {
      return this.lineScrollOffset3;
   }

   // $FF: renamed from: T () bpz
   public bpz method_5292() {
      return this.lineScrollOffset6;
   }

   // $FF: renamed from: U () boolean
   public boolean method_5293() {
      return this.isEnabled2;
   }

   // $FF: renamed from: V () boolean
   public boolean method_5294() {
      return this.enableBackgroundDrawing3;
   }

   // $FF: renamed from: X () ql
   public class_1541 method_5295() {
      return this.lineScrollOffset7;
   }

   // $FF: renamed from: Y () aa
   public class_900 method_5296() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: Z () qC
   public class_51 method_5297() {
      return this.lineScrollOffset4;
   }

   // $FF: renamed from: aa () void
   public void method_5298() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.util.concurrent.Callable) com.google.common.util.concurrent.ListenableFuture
   public ListenableFuture method_5299(Callable param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.Runnable) com.google.common.util.concurrent.ListenableFuture
   public ListenableFuture method_5300(Runnable var1) {
      Validate.notNull(var1);
      return this.method_5299(Executors.callable(var1));
   }

   // $FF: renamed from: ab () boolean
   public boolean method_5301() {
      boolean var10000;
      try {
         if(Thread.currentThread() == this.cursorPosition3) {
            var10000 = true;
            return var10000;
         }
      } catch (OpenGLException var1) {
         throw method_5307(var1);
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: ac () com.mojang.authlib.minecraft.MinecraftSessionService
   public MinecraftSessionService method_5302() {
      return this.cursorPosition0;
   }

   // $FF: renamed from: ad () pB
   public class_1444 method_5303() {
      return this.cursorPosition1;
   }

   public String MD5(String var1) {
      String[] var2 = class_752.method_4253();

      try {
         String[] var10000 = selectionEnd0;
         MessageDigest var3 = MessageDigest.getInstance("MD5");
         byte[] var4 = var3.digest(var1.getBytes());
         StringBuffer var5 = new StringBuffer();
         int var6 = 0;

         StringBuffer var9;
         while(true) {
            if(var6 < var4.length) {
               try {
                  var9 = var5.append(Integer.toHexString(var4[var6] & 255 | 256).substring(1, 3));
                  if(var2 == null) {
                     break;
                  }

                  ++var6;
                  if(var2 != null) {
                     continue;
                  }
               } catch (NoSuchAlgorithmException var7) {
                  throw method_5307(var7);
               }
            }

            var9 = var5;
            break;
         }

         return var9.toString();
      } catch (NoSuchAlgorithmException var8) {
         return null;
      }
   }

   // $FF: renamed from: a (bao) java.lang.String
   static String method_5304(bao var0) {
      return var0.isFocused1;
   }

   // $FF: renamed from: b (bao) pI
   static class_1452 method_5305(bao var0) {
      return var0.lineScrollOffset3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5306() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_5307(Throwable var0) {
      return var0;
   }
}
