import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: kU
public class FontRenderer implements class_55 {

   // $FF: renamed from: a bqx[]
   private static final bqx[] field_6846;
   // $FF: renamed from: b float[]
   private float[] charWidth;
   // $FF: renamed from: c int
   public int FONT_HEIGHT;
   // $FF: renamed from: d java.util.Random
   public Random field_6849;
   // $FF: renamed from: f byte[]
   private byte[] field_6850;
   // $FF: renamed from: g int[]
   private int[] field_6851;
   // $FF: renamed from: h bqx
   private bqx locationFontTexture;
   // $FF: renamed from: i bqf
   private final bqf field_6853;
   // $FF: renamed from: j float
   private float posX;
   // $FF: renamed from: k float
   private float posY;
   // $FF: renamed from: l boolean
   private boolean unicodeFlag;
   // $FF: renamed from: m boolean
   private boolean bidiFlag;
   // $FF: renamed from: n float
   private float field_6858;
   // $FF: renamed from: o float
   private float field_6859;
   // $FF: renamed from: p float
   private float field_6860;
   // $FF: renamed from: q float
   private float field_6861;
   // $FF: renamed from: r int
   private int textColor;
   // $FF: renamed from: s boolean
   private boolean field_6863;
   // $FF: renamed from: t boolean
   private boolean field_6864;
   // $FF: renamed from: u boolean
   private boolean field_6865;
   // $FF: renamed from: v boolean
   private boolean field_6866;
   // $FF: renamed from: w boolean
   private boolean field_6867;
   // $FF: renamed from: x bbj
   public bbj field_6868;
   // $FF: renamed from: y bqx
   public bqx field_6869;
   // $FF: renamed from: z boolean
   public boolean field_6870;
   // $FF: renamed from: A float
   public float field_6871;
   // $FF: renamed from: B java.lang.String
   private static final String field_6872;
   // $FF: renamed from: C java.lang.String[]
   private static final String[] field_6873;


   // $FF: renamed from: <init> (bbj, bqx, bqf, boolean) void
   public void method_7011(bbj param1, bqx param2, bqf param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (bqy) void
   public void method_221(bqy var1) {
      String[] var10000 = class_752.method_4253();
      this.locationFontTexture = method_7047(this.field_6869);
      int var3 = 0;
      String[] var2 = var10000;

      while(true) {
         if(var3 < field_6846.length) {
            try {
               field_6846[var3] = null;
               ++var3;
               if(var2 == null) {
                  break;
               }

               if(var2 != null) {
                  continue;
               }
            } catch (RuntimeException var4) {
               throw method_7049(var4);
            }
         }

         this.method_7012();
         break;
      }

   }

   // $FF: renamed from: a () void
   private void method_7012() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () void
   private void method_7013() {
      try {
         bqy var10000 = bao.method_5273().method_5289();
         bqx var10001 = new bqx;
         String[] var10003 = field_6873;
         var10001.method_8227("font/glyph_sizes.bin");
         InputStream var1 = var10000.method_224(var10001).method_234();
         var1.read(this.field_6850);
      } catch (IOException var2) {
         throw new RuntimeException(var2);
      }
   }

   // $FF: renamed from: b (int, char, boolean) float
   private float method_7014(int param1, char param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, boolean) float
   private float renderDefaultChar(int var1, boolean var2) {
      float var3 = (float)(var1 % 16 * 8);
      float var4 = (float)(var1 / 16 * 8);

      float var10000;
      label17: {
         try {
            if(var2) {
               var10000 = 1.0F;
               break label17;
            }
         } catch (RuntimeException var7) {
            throw method_7049(var7);
         }

         var10000 = 0.0F;
      }

      float var5 = var10000;
      this.field_6853.bindTexture(this.locationFontTexture);
      float var6 = 7.99F;
      GL11.glBegin(5);
      GL11.glTexCoord2f(var3 / 128.0F, var4 / 128.0F);
      GL11.glVertex3f(this.posX + var5, this.posY, 0.0F);
      GL11.glTexCoord2f(var3 / 128.0F, (var4 + 7.99F) / 128.0F);
      GL11.glVertex3f(this.posX - var5, this.posY + 7.99F, 0.0F);
      GL11.glTexCoord2f((var3 + var6 - 1.0F) / 128.0F, var4 / 128.0F);
      GL11.glVertex3f(this.posX + var6 - 1.0F + var5, this.posY, 0.0F);
      GL11.glTexCoord2f((var3 + var6 - 1.0F) / 128.0F, (var4 + 7.99F) / 128.0F);
      GL11.glVertex3f(this.posX + var6 - 1.0F - var5, this.posY + 7.99F, 0.0F);
      GL11.glEnd();
      return this.charWidth[var1];
   }

   // $FF: renamed from: b (int) bqx
   private bqx method_7016(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int) void
   private void method_7017(int var1) {
      this.field_6853.bindTexture(this.method_7016(var1));
   }

   // $FF: renamed from: b (char, boolean) float
   private float method_7018(char param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String, int, int, int) int
   public int drawStringWithShadow(String var1, int var2, int var3, int var4) {
      return this.method_7021(var1, var2, var3, var4, true);
   }

   // $FF: renamed from: c (java.lang.String, int, int, int) int
   public int method_7020(String param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String, int, int, int, boolean) int
   public int method_7021(String param1, int param2, int param3, int param4, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   private String method_7022(String var1) {
      try {
         Bidi var2 = new Bidi((new ArabicShaping(8)).shape(var1), 127);
         var2.setReorderingMode(0);
         return var2.writeReordered(2);
      } catch (ArabicShapingException var3) {
         return var1;
      }
   }

   // $FF: renamed from: c () void
   private void resetStyles() {
      this.field_6863 = false;
      this.field_6864 = false;
      this.field_6865 = false;
      this.field_6866 = false;
      this.field_6867 = false;
   }

   // $FF: renamed from: b (java.lang.String, boolean) void
   private void method_7024(String param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String, int, int, int, int, boolean) int
   private int renderStringAligned(String var1, int var2, int var3, int var4, int var5, boolean var6) {
      String[] var7 = class_752.method_4253();

      int var10000;
      label20: {
         try {
            var10000 = this.bidiFlag;
            if(var7 == null) {
               return var10000;
            }

            if(!this.bidiFlag) {
               break label20;
            }
         } catch (RuntimeException var9) {
            throw method_7049(var9);
         }

         int var8 = this.getCharWidth(this.method_7022(var1));
         var2 = var2 + var4 - var8;
      }

      var10000 = this.renderString(var1, var2, var3, var5, var6);
      return var10000;
   }

   // $FF: renamed from: c (java.lang.String, int, int, int, boolean) int
   private int renderString(String var1, int var2, int var3, int var4, boolean var5) {
      String[] var6 = class_752.method_4253();

      try {
         if(var1 == null) {
            return 0;
         }
      } catch (RuntimeException var7) {
         throw method_7049(var7);
      }

      int var10000;
      label60: {
         label59: {
            try {
               var10000 = this.bidiFlag;
               if(var6 == null) {
                  break label60;
               }

               if(!this.bidiFlag) {
                  break label59;
               }
            } catch (RuntimeException var10) {
               throw method_7049(var10);
            }

            var1 = this.method_7022(var1);
         }

         var10000 = var4 & -67108864;
      }

      label51: {
         label50: {
            try {
               if(var6 == null) {
                  break label51;
               }

               if(var10000 != 0) {
                  break label50;
               }
            } catch (RuntimeException var9) {
               throw method_7049(var9);
            }

            var4 |= -16777216;
         }

         var10000 = var5;
      }

      label41: {
         try {
            if(var6 == null) {
               return var10000;
            }

            if(var10000 == 0) {
               break label41;
            }
         } catch (RuntimeException var8) {
            throw method_7049(var8);
         }

         var4 = (var4 & 16579836) >> 2 | var4 & -16777216;
      }

      this.field_6858 = (float)(var4 >> 16 & 255) / 255.0F;
      this.field_6859 = (float)(var4 >> 8 & 255) / 255.0F;
      this.field_6860 = (float)(var4 & 255) / 255.0F;
      this.field_6861 = (float)(var4 >> 24 & 255) / 255.0F;
      GL11.glColor4f(this.field_6858, this.field_6859, this.field_6860, this.field_6861);
      this.posX = (float)var2;
      this.posY = (float)var3;
      this.method_7024(var1, (boolean)var5);
      var10000 = (int)this.posX;
      return var10000;
   }

   // $FF: renamed from: b (java.lang.String) int
   public int getCharWidth(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (char) int
   public int method_7028(char var1) {
      return Math.round(this.method_7029(var1));
   }

   // $FF: renamed from: c (char) float
   private float method_7029(char param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String, int) java.lang.String
   public String trimStringToWidth(String var1, int var2) {
      return this.trimStringToWidth(var1, var2, false);
   }

   // $FF: renamed from: b (java.lang.String, int, boolean) java.lang.String
   public String trimStringToWidth(String param1, int param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d (java.lang.String) java.lang.String
   private String trimStringNewline(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String, int, int, int, int) void
   public void drawSplitString(String var1, int var2, int var3, int var4, int var5) {
      this.resetStyles();
      this.textColor = var5;
      var1 = this.trimStringNewline(var1);
      this.renderSplitString(var1, var2, var3, var4, false);
   }

   // $FF: renamed from: d (java.lang.String, int, int, int, boolean) void
   private void renderSplitString(String var1, int var2, int var3, int var4, boolean var5) {
      List var7 = this.listFormattedStringToWidth(var1, var4);
      String[] var10000 = class_752.method_4253();
      Iterator var8 = var7.iterator();
      String[] var6 = var10000;

      while(var8.hasNext()) {
         String var9 = (String)var8.next();
         this.renderStringAligned(var9, var2, var3, var4, this.textColor, var5);
         var3 += this.FONT_HEIGHT;
         if(var6 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (java.lang.String, int) int
   public int splitStringWidth(String var1, int var2) {
      return this.FONT_HEIGHT * this.listFormattedStringToWidth(var1, var2).size();
   }

   // $FF: renamed from: b (boolean) void
   public void setUnicodeFlag(boolean var1) {
      this.unicodeFlag = var1;
   }

   // $FF: renamed from: d () boolean
   public boolean getUnicodeFlag() {
      return this.unicodeFlag;
   }

   // $FF: renamed from: c (boolean) void
   public void setBidiFlag(boolean var1) {
      this.bidiFlag = var1;
   }

   // $FF: renamed from: d (java.lang.String, int) java.util.List
   public List listFormattedStringToWidth(String var1, int var2) {
      return Arrays.asList(this.wrapFormattedStringToWidth(var1, var2).split("\n"));
   }

   // $FF: renamed from: e (java.lang.String, int) java.lang.String
   String wrapFormattedStringToWidth(String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f (java.lang.String, int) int
   private int sizeStringToWidth(String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d (char) boolean
   private static boolean isFormatColor(char param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e (char) boolean
   private static boolean isFormatSpecial(char param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e (java.lang.String) java.lang.String
   private static String getFormatFromString(String param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () boolean
   public boolean getBidiFlag() {
      return this.bidiFlag;
   }

   // $FF: renamed from: f () void
   private void method_7046() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (bqx) bqx
   private static bqx method_7047(bqx param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_7048() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_7049(Exception var0) {
      return var0;
   }
}
