import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

public class bmh {

   // $FF: renamed from: b java.nio.ByteBuffer
   private ByteBuffer field_7249;
   // $FF: renamed from: c java.nio.IntBuffer
   private IntBuffer field_7250;
   // $FF: renamed from: d java.nio.FloatBuffer
   private FloatBuffer field_7251;
   // $FF: renamed from: e java.nio.ShortBuffer
   private ShortBuffer field_7252;
   // $FF: renamed from: f int[]
   private int[] field_7253;
   // $FF: renamed from: g int
   private int field_7254;
   // $FF: renamed from: h double
   private double field_7255;
   // $FF: renamed from: i double
   private double field_7256;
   // $FF: renamed from: j int
   private int field_7257;
   // $FF: renamed from: k int
   private int field_7258;
   // $FF: renamed from: l boolean
   private boolean field_7259;
   // $FF: renamed from: m boolean
   private boolean field_7260;
   // $FF: renamed from: n boolean
   private boolean field_7261;
   // $FF: renamed from: o boolean
   private boolean field_7262;
   // $FF: renamed from: p int
   private int field_7263;
   // $FF: renamed from: q int
   private int field_7264;
   // $FF: renamed from: r boolean
   private boolean field_7265;
   // $FF: renamed from: s int
   public int field_7266;
   // $FF: renamed from: t double
   public double field_7267;
   // $FF: renamed from: u double
   public double field_7268;
   // $FF: renamed from: v double
   public double field_7269;
   // $FF: renamed from: w int
   private int field_7270;
   // $FF: renamed from: a bmh
   public static bmh instance;
   // $FF: renamed from: x boolean
   public boolean field_7272;
   // $FF: renamed from: y int
   private int field_7273;
   private boolean renderingChunk;
   private static boolean littleEndianByteOrder;
   public static boolean renderingWorldRenderer;
   public boolean defaultTexture;
   public int textureID;
   public boolean autoGrow;
   private VertexData[] vertexDatas;
   private boolean[] drawnIcons;
   private bqd[] vertexQuadIcons;
   private static final String __OBFID;
   // $FF: renamed from: z java.lang.String[]
   private static final String[] field_7274;


   // $FF: renamed from: <init> () void
   public void getVisible6() {
      this.getVisible7(65536);
      this.defaultTexture = false;
   }

   // $FF: renamed from: <init> (int) void
   public void getVisible7(int var1) {
      super();
      this.renderingChunk = false;
      this.defaultTexture = true;
      this.textureID = 0;
      this.autoGrow = true;
      this.vertexDatas = null;
      this.drawnIcons = new boolean[256];
      this.vertexQuadIcons = null;
      this.field_7273 = var1;
      this.field_7249 = ban.method_5198(var1 * 4);
      this.field_7250 = this.field_7249.asIntBuffer();
      this.field_7251 = this.field_7249.asFloatBuffer();
      this.field_7252 = this.field_7249.asShortBuffer();
      this.field_7253 = new int[var1];
      this.vertexDatas = new VertexData[4];
      int var2 = 0;

      try {
         while(var2 < this.vertexDatas.length) {
            VertexData[] var10000 = this.vertexDatas;
            VertexData var10002 = new VertexData;
            var10002.method_2037();
            var10000[var2] = var10002;
            ++var2;
         }

      } catch (IllegalStateException var3) {
         throw method_7470(var3);
      }
   }

   // $FF: renamed from: a () int
   public int getVisible8() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (float, float, float) bmi
   public bmi getVisible9(float param1, float param2, float param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (bmi) void
   public void setVisible0(bmi var1) {
      System.arraycopy(var1.method_7502(), 0, this.field_7253, 0, var1.method_7502().length);
      this.field_7263 = var1.method_7503();
      this.field_7254 = var1.method_7504();
      this.field_7260 = var1.method_7505();
      this.field_7261 = var1.method_7506();
      this.field_7259 = var1.method_7508();
      this.field_7262 = var1.method_7507();
   }

   // $FF: renamed from: d () void
   private void setVisible1() {
      this.field_7254 = 0;
      this.field_7249.clear();
      this.field_7263 = 0;
      this.field_7264 = 0;
   }

   // $FF: renamed from: b () void
   public void setVisible2() {
      this.setVisible3(7);
   }

   // $FF: renamed from: a (int) void
   public void setVisible3(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (double, double) void
   public void setVisible4(double var1, double var3) {
      this.field_7260 = true;
      this.field_7255 = var1;
      this.field_7256 = var3;
   }

   // $FF: renamed from: b (int) void
   public void setVisible5(int var1) {
      this.field_7261 = true;
      this.field_7257 = var1;
   }

   // $FF: renamed from: b (float, float, float) void
   public void setVisible6(float var1, float var2, float var3) {
      this.setVisible8((int)(var1 * 255.0F), (int)(var2 * 255.0F), (int)(var3 * 255.0F));
   }

   // $FF: renamed from: a (float, float, float, float) void
   public void setVisible7(float var1, float var2, float var3, float var4) {
      this.setVisible9((int)(var1 * 255.0F), (int)(var2 * 255.0F), (int)(var3 * 255.0F), (int)(var4 * 255.0F));
   }

   // $FF: renamed from: a (int, int, int) void
   public void setVisible8(int var1, int var2, int var3) {
      this.setVisible9(var1, var2, var3, 255);
   }

   // $FF: renamed from: a (int, int, int, int) void
   public void setVisible9(int param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (byte, byte, byte) void
   public void method_7460(byte var1, byte var2, byte var3) {
      this.setVisible8(var1 & 255, var2 & 255, var3 & 255);
   }

   // $FF: renamed from: a (double, double, double, double, double) void
   public void addVertexWithUV(double var1, double var3, double var5, double var7, double var9) {
      this.setVisible4(var7, var9);
      this.method_7462(var1, var3, var5);
   }

   // $FF: renamed from: a (double, double, double) void
   public void method_7462(double param1, double param3, double param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int) void
   public void method_7463(int var1) {
      int var2 = var1 >> 16 & 255;
      int var3 = var1 >> 8 & 255;
      int var4 = var1 & 255;
      this.setVisible8(var2, var3, var4);
   }

   // $FF: renamed from: a (int, int) void
   public void method_7464(int var1, int var2) {
      int var3 = var1 >> 16 & 255;
      int var4 = var1 >> 8 & 255;
      int var5 = var1 & 255;
      this.setVisible9(var3, var4, var5, var2);
   }

   // $FF: renamed from: c () void
   public void method_7465() {
      this.field_7265 = true;
   }

   // $FF: renamed from: c (float, float, float) void
   public void method_7466(float var1, float var2, float var3) {
      this.field_7262 = true;
      byte var4 = (byte)((int)(var1 * 127.0F));
      byte var5 = (byte)((int)(var2 * 127.0F));
      byte var6 = (byte)((int)(var3 * 127.0F));
      this.field_7270 = var4 & 255 | (var5 & 255) << 8 | (var6 & 255) << 16;
   }

   // $FF: renamed from: b (double, double, double) void
   public void method_7467(double var1, double var3, double var5) {
      this.field_7267 = var1;
      this.field_7268 = var3;
      this.field_7269 = var5;
   }

   // $FF: renamed from: d (float, float, float) void
   public void method_7468(float var1, float var2, float var3) {
      this.field_7267 += (double)var1;
      this.field_7268 += (double)var2;
      this.field_7269 += (double)var3;
   }

   public boolean isRenderingChunk() {
      return this.renderingChunk;
   }

   public void setRenderingChunk(boolean var1) {
      this.renderingChunk = var1;
   }

   private void draw(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private int drawForIcon(bqd param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_7469() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.IllegalStateException) java.lang.IllegalStateException
   private static IllegalStateException method_7470(IllegalStateException var0) {
      return var0;
   }
}
