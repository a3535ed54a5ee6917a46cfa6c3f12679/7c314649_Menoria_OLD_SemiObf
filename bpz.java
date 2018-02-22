import com.google.common.collect.Lists;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.Logger;

public class bpz extends bpp implements class_53, class_74 {

   // $FF: renamed from: d org.apache.logging.log4j.Logger
   private static final Logger field_7756;
   // $FF: renamed from: b bqx
   public static final bqx field_7757;
   // $FF: renamed from: c bqx
   public static final bqx field_7758;
   // $FF: renamed from: e java.util.List
   private final List field_7759;
   // $FF: renamed from: f java.util.Map
   private final Map field_7760;
   // $FF: renamed from: g java.util.Map
   private final Map field_7761;
   // $FF: renamed from: h int
   public final int field_7762;
   // $FF: renamed from: i java.lang.String
   public final String field_7763;
   // $FF: renamed from: j int
   private int field_7764;
   // $FF: renamed from: k int
   private int field_7765;
   // $FF: renamed from: l bqd
   private final bqd field_7766;
   private static final String __OBFID;
   public static bpz textureMapBlocks;
   public static bpz textureMapItems;
   private bqd[] iconGrid;
   private int iconGridSize;
   private int iconGridCountX;
   private int iconGridCountY;
   private double iconGridSizeU;
   private double iconGridSizeV;
   // $FF: renamed from: m java.lang.String[]
   private static final String[] field_7767;


   // $FF: renamed from: <init> (int, java.lang.String) void
   public void method_7952(int param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f () void
   private void method_7953() {
      String[] var1 = class_752.method_4253();

      int[] var2;
      label25: {
         label24: {
            label23: {
               try {
                  float var8;
                  int var10000 = (var8 = (float)this.field_7765 - 1.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
                  if(var1 == null) {
                     break label23;
                  }

                  if(var10000 <= 0) {
                     break label24;
                  }
               } catch (RuntimeException var6) {
                  throw method_7963(var6);
               }

               boolean var7 = true;
            }

            boolean var4 = true;
            boolean var5 = true;
            this.field_7766.method_8084(32);
            this.field_7766.method_8085(32);
            var2 = new int[1024];
            System.arraycopy(bqi.field_7929, 0, var2, 0, bqi.field_7929.length);
            bqi.method_8169(var2, 16, 16, 8);
            if(var1 != null) {
               break label25;
            }
         }

         var2 = bqi.field_7929;
         this.field_7766.method_8084(16);
         this.field_7766.method_8085(16);
      }

      int[][] var3 = new int[this.field_7764 + 1][];
      var3[0] = var2;
      this.field_7766.method_8094(Lists.newArrayList(new int[][][]{var3}));
      this.field_7766.setIndexInMap(0);
   }

   // $FF: renamed from: a (bqy) void
   public void method_221(bqy var1) {
      this.method_7953();
      this.method_7951();
      this.method_7954(var1);
   }

   // $FF: renamed from: b (bqy) void
   public void method_7954(bqy param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (bqx, int) bqx
   private bqx method_7955(bqx param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g () void
   private void method_7956() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String) bqd
   public bqd method_7957(String var1) {
      bqd var3 = (bqd)this.field_7761.get(var1);
      String[] var2 = class_752.method_4253();

      bqd var10000;
      label20: {
         try {
            var10000 = var3;
            if(var2 == null) {
               return var10000;
            }

            if(var3 != null) {
               break label20;
            }
         } catch (RuntimeException var4) {
            throw method_7963(var4);
         }

         var3 = this.field_7766;
      }

      var10000 = var3;
      return var10000;
   }

   // $FF: renamed from: d () void
   public void method_7958() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.String) vL
   public IIcon method_375(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () int
   public int method_7959() {
      return this.field_7762;
   }

   // $FF: renamed from: e () void
   public void method_220() {
      this.method_7958();
   }

   // $FF: renamed from: a (int) void
   public void method_7960(int var1) {
      this.field_7764 = var1;
   }

   // $FF: renamed from: b (int) void
   public void method_7961(int var1) {
      this.field_7765 = var1;
   }

   public bqd getTextureExtry(String var1) {
      return (bqd)this.field_7760.get(var1);
   }

   public boolean setTextureEntry(String param1, bqd param2) {
      // $FF: Couldn't be decompiled
   }

   private boolean isAbsoluteLocation(bqx var1) {
      String var2 = var1.method_8228();
      return this.isAbsoluteLocationPath(var2);
   }

   private boolean isAbsoluteLocationPath(String param1) {
      // $FF: Couldn't be decompiled
   }

   public bqd getIconSafe(String var1) {
      return (bqd)this.field_7760.get(var1);
   }

   private int getStandardTileSize(Collection param1) {
      // $FF: Couldn't be decompiled
   }

   private void updateIconGrid(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public bqd getIconByUV(double var1, double var3) {
      String[] var5 = class_752.method_4253();

      try {
         if(this.iconGrid == null) {
            return null;
         }
      } catch (RuntimeException var11) {
         throw method_7963(var11);
      }

      int var6 = (int)(var1 / this.iconGridSizeU);
      int var7 = (int)(var3 / this.iconGridSizeV);
      int var8 = var7 * this.iconGridCountX + var6;

      bqd var12;
      label33: {
         int var10000;
         label32: {
            try {
               var10000 = var8;
               if(var5 == null) {
                  break label32;
               }

               if(var8 < 0) {
                  break label33;
               }
            } catch (RuntimeException var10) {
               throw method_7963(var10);
            }

            var10000 = var8;
         }

         try {
            if(var10000 <= this.iconGrid.length) {
               var12 = this.iconGrid[var8];
               return var12;
            }
         } catch (RuntimeException var9) {
            throw method_7963(var9);
         }
      }

      var12 = null;
      return var12;
   }

   public bqd getMissingSprite() {
      return this.field_7766;
   }

   public int getMaxTextureIndex() {
      return this.field_7760.size();
   }

   private boolean isTerrainAnimationActive(bqd param1) {
      // $FF: Couldn't be decompiled
   }

   public void loadTextureSafe(bqy var1) {
      try {
         this.method_221(var1);
      } catch (IOException var3) {
         StringBuilder var10000 = new StringBuilder();
         String[] var10001 = field_7767;
         Config.warn(var10000.append("Error loading texture map: ").append(this.field_7763).toString());
         var3.printStackTrace();
      }

   }

   private BufferedImage makeDebugImage(int var1, int var2) {
      BufferedImage var3 = new BufferedImage(var1, var2, 2);
      Graphics2D var4 = var3.createGraphics();
      var4.setPaint(new Color(255, 255, 0));
      var4.fillRect(0, 0, var3.getWidth(), var3.getHeight());
      return var3;
   }

   private void addDebugSprite(bqd param1, BufferedImage param2) {
      // $FF: Couldn't be decompiled
   }

   private void writeDebugImage(BufferedImage var1, String var2) {
      try {
         String[] var10001 = field_7767;
         ImageIO.write(var1, "png", new File(Config.getMinecraft().canLoseFocus9, var2));
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_7962() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_7963(Exception var0) {
      return var0;
   }
}
