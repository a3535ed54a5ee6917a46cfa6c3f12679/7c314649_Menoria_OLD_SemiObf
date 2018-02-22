import ca.diiza.f.class_209;
import com.google.gson.JsonSyntaxException;
import java.nio.FloatBuffer;
import java.util.Random;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class blt implements class_55 {

   // $FF: renamed from: q org.apache.logging.log4j.Logger
   private static final Logger field_7069;
   // $FF: renamed from: r bqx
   private static final bqx field_7070;
   // $FF: renamed from: s bqx
   private static final bqx field_7071;
   // $FF: renamed from: a boolean
   public static boolean field_7072;
   // $FF: renamed from: b int
   public static int field_7073;
   // $FF: renamed from: t bao
   private bao field_7074;
   // $FF: renamed from: u float
   private float field_7075;
   // $FF: renamed from: c bly
   public bly field_7076;
   // $FF: renamed from: v l5
   private final class_1332 field_7077;
   // $FF: renamed from: w int
   private int field_7078;
   // $FF: renamed from: x sa
   private class_689 field_7079;
   // $FF: renamed from: y vv
   private class_1720 field_7080;
   // $FF: renamed from: z vv
   private class_1720 field_7081;
   // $FF: renamed from: A vv
   private class_1720 field_7082;
   // $FF: renamed from: B vv
   private class_1720 field_7083;
   // $FF: renamed from: C vv
   private class_1720 field_7084;
   // $FF: renamed from: D vv
   private class_1720 field_7085;
   // $FF: renamed from: E float
   private float field_7086;
   // $FF: renamed from: F float
   private float field_7087;
   // $FF: renamed from: G float
   private float field_7088;
   // $FF: renamed from: H float
   private float field_7089;
   // $FF: renamed from: I float
   private float field_7090;
   // $FF: renamed from: J float
   private float field_7091;
   // $FF: renamed from: K float
   private float field_7092;
   // $FF: renamed from: L float
   private float field_7093;
   // $FF: renamed from: M float
   private float field_7094;
   // $FF: renamed from: N float
   private float field_7095;
   // $FF: renamed from: O float
   private float field_7096;
   // $FF: renamed from: P float
   private float field_7097;
   // $FF: renamed from: Q float
   private float field_7098;
   // $FF: renamed from: R float
   private float field_7099;
   // $FF: renamed from: S float
   private float field_7100;
   // $FF: renamed from: T bpq
   private final bpq field_7101;
   // $FF: renamed from: U int[]
   private final int[] field_7102;
   // $FF: renamed from: V bqx
   private final bqx field_7103;
   // $FF: renamed from: W float
   private float field_7104;
   // $FF: renamed from: X float
   private float field_7105;
   // $FF: renamed from: Y float
   private float field_7106;
   // $FF: renamed from: Z float
   private float field_7107;
   // $FF: renamed from: aa float
   private float field_7108;
   // $FF: renamed from: ab boolean
   private boolean field_7109;
   // $FF: renamed from: ac bqy
   private final bqy field_7110;
   // $FF: renamed from: d o5
   public class_1406 field_7111;
   // $FF: renamed from: ad bqx[]
   private static final bqx[] field_7112;
   // $FF: renamed from: e int
   public static final int field_7113;
   // $FF: renamed from: ae int
   private int field_7114;
   // $FF: renamed from: af double
   private double field_7115;
   // $FF: renamed from: ag double
   private double field_7116;
   // $FF: renamed from: ah double
   private double field_7117;
   // $FF: renamed from: ai long
   private long field_7118;
   // $FF: renamed from: aj long
   private long field_7119;
   // $FF: renamed from: ak boolean
   private boolean field_7120;
   // $FF: renamed from: f float
   float field_7121;
   // $FF: renamed from: g float
   float field_7122;
   // $FF: renamed from: h float
   float field_7123;
   // $FF: renamed from: i float
   float field_7124;
   // $FF: renamed from: al java.util.Random
   private Random field_7125;
   // $FF: renamed from: am int
   private int field_7126;
   // $FF: renamed from: j float[]
   float[] field_7127;
   // $FF: renamed from: k float[]
   float[] field_7128;
   // $FF: renamed from: l java.nio.FloatBuffer
   FloatBuffer field_7129;
   // $FF: renamed from: m float
   float field_7130;
   // $FF: renamed from: n float
   float field_7131;
   // $FF: renamed from: o float
   float field_7132;
   // $FF: renamed from: an float
   private float field_7133;
   // $FF: renamed from: ao float
   private float field_7134;
   // $FF: renamed from: p int
   public int field_7135;
   private boolean initialized;
   private ahb updatedWorld;
   private boolean showDebugInfo;
   public boolean fogStandard;
   private long lastServerTime;
   private int lastServerTicks;
   private int serverWaitTime;
   private int serverWaitTimeCurrent;
   private float avgServerTimeDiff;
   private float avgServerTickDiff;
   public long[] frameTimes;
   public long[] tickTimes;
   public long[] chunkTimes;
   public long[] serverTimes;
   public int numRecordedFrameTimes;
   public long prevFrameTimeNano;
   private boolean lastShowDebugInfo;
   private boolean showExtendedDebugInfo;
   private static final String __OBFID;
   // $FF: renamed from: bb java.lang.String[]
   private static final String[] field_7136;


   // $FF: renamed from: <init> (bao, bqy) void
   public void setEnableBackgroundDrawing2(bao var1, bqy var2) {
      super();
      class_1720 var10001 = new class_1720;
      var10001.method_9612();
      this.field_7080 = var10001;
      var10001 = new class_1720;
      var10001.method_9612();
      this.field_7081 = var10001;
      var10001 = new class_1720;
      var10001.method_9612();
      this.field_7082 = var10001;
      var10001 = new class_1720;
      var10001.method_9612();
      this.field_7083 = var10001;
      var10001 = new class_1720;
      var10001.method_9612();
      this.field_7084 = var10001;
      var10001 = new class_1720;
      var10001.method_9612();
      this.field_7085 = var10001;
      this.field_7086 = 4.0F;
      this.field_7087 = 4.0F;
      this.initialized = false;
      this.updatedWorld = null;
      this.showDebugInfo = false;
      this.fogStandard = false;
      this.lastServerTime = 0L;
      this.lastServerTicks = 0;
      this.serverWaitTime = 0;
      this.serverWaitTimeCurrent = 0;
      this.avgServerTimeDiff = 0.0F;
      this.avgServerTickDiff = 0.0F;
      this.frameTimes = new long[512];
      this.tickTimes = new long[512];
      this.chunkTimes = new long[512];
      this.serverTimes = new long[512];
      this.numRecordedFrameTimes = 0;
      this.prevFrameTimeNano = -1L;
      this.lastShowDebugInfo = false;
      this.showExtendedDebugInfo = false;
      this.field_7114 = field_7113;
      this.field_7115 = 1.0D;
      this.field_7118 = bao.method_5283();
      this.field_7125 = new Random();
      this.field_7129 = ban.method_5200(16);
      this.field_7074 = var1;
      this.field_7110 = var2;
      class_1332 var3 = new class_1332;
      var3.method_7000(var1.method_5288());
      this.field_7077 = var3;
      bly var4 = new bly;
      var4.method_3230(var1);
      this.field_7076 = var4;
      bpq var5 = new bpq;
      var5.method_7980(16, 16);
      this.field_7101 = var5;
      bqf var6 = var1.method_5288();
      String[] var10002 = field_7136;
      this.field_7103 = var6.method_8122("lightMap", this.field_7101);
      this.field_7102 = this.field_7101.method_7982();
      this.field_7111 = null;
   }

   // $FF: renamed from: a () boolean
   public boolean setEnableBackgroundDrawing3() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () void
   public void setEnableBackgroundDrawing4() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () void
   public void setEnableBackgroundDrawing5() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (bqy) void
   public void method_221(bqy param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () void
   public void setEnableBackgroundDrawing6() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () o5
   public class_1406 setEnableBackgroundDrawing7() {
      return this.field_7111;
   }

   // $FF: renamed from: a (int, int) void
   public void setEnableBackgroundDrawing8(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (float) void
   public void setEnableBackgroundDrawing9(float param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: j () void
   private void setTextColor0() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (float, boolean) float
   private float setTextColor1(float param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f (float) void
   private void setTextColor2(float var1) {
      String[] var10000 = class_752.method_4253();
      class_752 var3 = this.field_7074.cursorCounter9;
      String[] var2 = var10000;
      float var4 = (float)var3.field_3315 - var1;

      float var5;
      float var9;
      float var10001;
      label41: {
         int var8;
         label35: {
            label34: {
               try {
                  float var10;
                  var8 = (var10 = var3.method_406() - 0.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
                  if(var2 == null) {
                     break label35;
                  }

                  if(var8 > 0) {
                     break label34;
                  }
               } catch (JsonSyntaxException var7) {
                  throw setFocused5(var7);
               }

               var5 = (float)var3.field_3318 + var1;
               GL11.glRotatef(40.0F - 8000.0F / (var5 + 200.0F), 0.0F, 0.0F, 1.0F);
            }

            try {
               var9 = var4;
               var10001 = 0.0F;
               if(var2 == null) {
                  break label41;
               }

               float var11;
               var8 = (var11 = var4 - 0.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
            } catch (JsonSyntaxException var6) {
               throw setFocused5(var6);
            }
         }

         if(var8 < 0) {
            return;
         }

         var4 /= (float)var3.field_3316;
         var9 = var4 * var4 * var4 * var4;
         var10001 = 3.1415927F;
      }

      var4 = class_1715.method_9555(var9 * var10001);
      var5 = var3.field_3317;
      GL11.glRotatef(-var5, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-var4 * 14.0F, 0.0F, 0.0F, 1.0F);
      GL11.glRotatef(var5, 0.0F, 1.0F, 0.0F);
   }

   // $FF: renamed from: g (float) void
   private void setTextColor3(float param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: h (float) void
   private void setTextColor4(float param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (float, int) void
   private void setTextColor5(float param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (float, int) void
   private void setTextColor6(float param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (double) void
   public void setTextColor7(double var1) {
      buu.method_9078(buu.field_8557);
      GL11.glDisable(3553);
      buu.method_9078(buu.field_8556);
   }

   // $FF: renamed from: b (double) void
   public void setTextColor8(double var1) {
      buu.method_9078(buu.field_8557);
      GL11.glMatrixMode(5890);
      GL11.glLoadIdentity();
      float var3 = 0.00390625F;
      GL11.glScalef(var3, var3, var3);
      GL11.glTranslatef(8.0F, 8.0F, 8.0F);
      GL11.glMatrixMode(5888);
      this.field_7074.method_5288().bindTexture(this.field_7103);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10242, 10496);
      GL11.glTexParameteri(3553, 10243, 10496);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable(3553);
      buu.method_9078(buu.field_8556);
   }

   // $FF: renamed from: k () void
   private void setTextColor9() {
      this.field_7122 = (float)((double)this.field_7122 + (Math.random() - Math.random()) * Math.random() * Math.random());
      this.field_7124 = (float)((double)this.field_7124 + (Math.random() - Math.random()) * Math.random() * Math.random());
      this.field_7122 = (float)((double)this.field_7122 * 0.9D);
      this.field_7124 = (float)((double)this.field_7124 * 0.9D);
      this.field_7121 += (this.field_7122 - this.field_7121) * 1.0F;
      this.field_7123 += (this.field_7124 - this.field_7123) * 1.0F;
      this.field_7120 = true;
   }

   // $FF: renamed from: i (float) void
   private void setDisabledTextColour0(float param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (yz, float) float
   private float setDisabledTextColour1(class_792 var1, float var2) {
      int var3 = var1.method_4178(class_1635.field_8506).method_9017();

      float var10000;
      try {
         if(var3 > 200) {
            var10000 = 1.0F;
            return var10000;
         }
      } catch (JsonSyntaxException var4) {
         throw setFocused5(var4);
      }

      var10000 = 0.7F + class_1715.method_9555(((float)var3 - var2) * 3.1415927F * 0.2F) * 0.3F;
      return var10000;
   }

   // $FF: renamed from: b (float) void
   public void setDisabledTextColour2(float param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (float) void
   public void setDisabledTextColour3(float var1) {
      this.setDisabledTextColour8();
      class_1338 var10000 = new class_1338;
      var10000.method_7060(this.field_7074, this.field_7074.cursorCounter2, this.field_7074.cursorCounter3);
      class_1338 var2 = var10000;
      int var3 = var2.method_7061();
      int var4 = var2.method_7062();
      this.field_7074.canLoseFocus4.method_696((float)var3, (float)var4);
   }

   // $FF: renamed from: a (float, long) void
   public void setDisabledTextColour4(float param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (bma, float) void
   private void setDisabledTextColour5(bma param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: l () void
   private void setDisabledTextColour6() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e (float) void
   protected void setDisabledTextColour7(float param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: g () void
   public void setDisabledTextColour8() {
      class_1338 var10000 = new class_1338;
      var10000.method_7060(this.field_7074, this.field_7074.cursorCounter2, this.field_7074.cursorCounter3);
      class_1338 var1 = var10000;
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, var1.method_7063(), var1.method_7064(), 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
   }

   // $FF: renamed from: j (float) void
   private void setDisabledTextColour9(float param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, float) void
   private void setFocused0(int param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (float, float, float, float) java.nio.FloatBuffer
   private FloatBuffer setFocused1(float var1, float var2, float var3, float var4) {
      this.field_7129.clear();
      this.field_7129.put(var1).put(var2).put(var3).put(var4);
      this.field_7129.flip();
      return this.field_7129;
   }

   // $FF: renamed from: i () l5
   public class_1332 setFocused2() {
      return this.field_7077;
   }

   private void waitForServerThread() {
      // $FF: Couldn't be decompiled
   }

   private void showLagometer(long param1, long param3) {
      // $FF: Couldn't be decompiled
   }

   private void updateMainMenu(class_209 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (blt) bao
   static bao setFocused3(blt var0) {
      return var0.field_7074;
   }

   // $FF: renamed from: <clinit> () void
   static void setFocused4() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable setFocused5(Throwable var0) {
      return var0;
   }
}
