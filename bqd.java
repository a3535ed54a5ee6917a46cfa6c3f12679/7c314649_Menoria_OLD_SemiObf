import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.nio.IntBuffer;
import java.util.List;

public class bqd implements IIcon {

   // $FF: renamed from: i java.lang.String
   private final String field_7866;
   // $FF: renamed from: a java.util.List
   protected List field_7867;
   // $FF: renamed from: j bsa
   private bsa field_7868;
   // $FF: renamed from: b boolean
   protected boolean field_7869;
   // $FF: renamed from: k boolean
   private boolean field_7870;
   // $FF: renamed from: c int
   protected int field_7871;
   // $FF: renamed from: d int
   protected int field_7872;
   // $FF: renamed from: e int
   protected int field_7873;
   // $FF: renamed from: f int
   protected int field_7874;
   // $FF: renamed from: l float
   private float field_7875;
   // $FF: renamed from: m float
   private float field_7876;
   // $FF: renamed from: n float
   private float field_7877;
   // $FF: renamed from: o float
   private float field_7878;
   // $FF: renamed from: g int
   protected int field_7879;
   // $FF: renamed from: h int
   protected int field_7880;
   private int indexInMap;
   public float baseU;
   public float baseV;
   public int sheetWidth;
   public int sheetHeight;
   private boolean mipmapActive;
   public int glOwnTextureId;
   private int uploadedFrameIndex;
   private int uploadedOwnFrameIndex;
   public IntBuffer[] frameBuffers;
   public Mipmaps[] frameMipmaps;
   private static final String __OBFID;
   // $FF: renamed from: p java.lang.String[]
   private static final String[] field_7881;


   // $FF: renamed from: <init> (java.lang.String) void
   protected void method_8076(String var1) {
      super();
      this.field_7867 = Lists.newArrayList();
      this.indexInMap = -1;
      this.mipmapActive = false;
      this.glOwnTextureId = -1;
      this.uploadedFrameIndex = -1;
      this.uploadedOwnFrameIndex = -1;
      this.field_7866 = var1;
   }

   // $FF: renamed from: a (int, int, int, int, boolean) void
   public void method_8077(int var1, int var2, int var3, int var4, boolean var5) {
      String[] var10000 = class_752.method_4253();
      this.field_7871 = var3;
      this.field_7872 = var4;
      String[] var6 = var10000;
      this.field_7869 = var5;
      float var7 = (float)(0.009999999776482582D / (double)var1);
      float var8 = (float)(0.009999999776482582D / (double)var2);

      bqd var12;
      label21: {
         label20: {
            try {
               this.field_7875 = (float)var3 / (float)((double)var1) + var7;
               this.field_7876 = (float)(var3 + this.field_7873) / (float)((double)var1) - var7;
               this.field_7877 = (float)var4 / (float)var2 + var8;
               this.field_7878 = (float)(var4 + this.field_7874) / (float)var2 - var8;
               var12 = this;
               if(var6 == null) {
                  break label21;
               }

               if(!this.field_7870) {
                  break label20;
               }
            } catch (RuntimeException var11) {
               throw method_8096(var11);
            }

            float var9 = 8.0F / (float)var1;
            float var10 = 8.0F / (float)var2;
            this.field_7875 += var9;
            this.field_7876 -= var9;
            this.field_7877 += var10;
            this.field_7878 -= var10;
         }

         this.baseU = Math.min(this.field_7875, this.field_7876);
         var12 = this;
      }

      var12.baseV = Math.min(this.field_7877, this.field_7878);
   }

   // $FF: renamed from: a (bqd) void
   public void method_8078(bqd var1) {
      this.field_7871 = var1.field_7871;
      this.field_7872 = var1.field_7872;
      this.field_7873 = var1.field_7873;
      this.field_7874 = var1.field_7874;
      this.field_7869 = var1.field_7869;
      this.field_7875 = var1.field_7875;
      this.field_7876 = var1.field_7876;
      this.field_7877 = var1.field_7877;
      this.field_7878 = var1.field_7878;
      this.baseU = Math.min(this.field_7875, this.field_7876);
      this.baseV = Math.min(this.field_7877, this.field_7878);
   }

   // $FF: renamed from: h () int
   public int method_8079() {
      return this.field_7871;
   }

   // $FF: renamed from: i () int
   public int method_8080() {
      return this.field_7872;
   }

   // $FF: renamed from: a () int
   public int method_366() {
      return this.field_7873;
   }

   // $FF: renamed from: b () int
   public int method_367() {
      return this.field_7874;
   }

   // $FF: renamed from: c () float
   public float method_368() {
      return this.field_7875;
   }

   // $FF: renamed from: d () float
   public float method_369() {
      return this.field_7876;
   }

   // $FF: renamed from: a (double) float
   public float method_370(double var1) {
      float var3 = this.field_7876 - this.field_7875;
      return this.field_7875 + var3 * (float)var1 / 16.0F;
   }

   // $FF: renamed from: e () float
   public float method_371() {
      return this.field_7877;
   }

   // $FF: renamed from: f () float
   public float method_372() {
      return this.field_7878;
   }

   // $FF: renamed from: b (double) float
   public float method_373(double var1) {
      float var3 = this.field_7878 - this.field_7877;
      return this.field_7877 + var3 * ((float)var1 / 16.0F);
   }

   // $FF: renamed from: g () java.lang.String
   public String method_374() {
      return this.field_7866;
   }

   // $FF: renamed from: j () void
   public void method_8081() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int) int[][]
   public int[][] method_8082(int var1) {
      return (int[][])((int[][])((int[][])((int[][])this.field_7867.get(var1))));
   }

   // $FF: renamed from: k () int
   public int method_8083() {
      return this.field_7867.size();
   }

   // $FF: renamed from: b (int) void
   public void method_8084(int var1) {
      this.field_7873 = var1;
   }

   // $FF: renamed from: c (int) void
   public void method_8085(int var1) {
      this.field_7874 = var1;
   }

   // $FF: renamed from: a (java.awt.image.BufferedImage[], bsa, boolean) void
   public void method_8086(BufferedImage[] param1, bsa param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d (int) void
   public void method_8087(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int[][]) void
   private void method_8088(int[][] param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int[][], int, int) int[][]
   private int[][] method_8089(int[][] param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e (int) void
   private void method_8090(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int[][], int, int, int) int[][]
   private static int[][] method_8091(int[][] param0, int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: l () void
   public void method_8092() {
      this.field_7867.clear();
   }

   // $FF: renamed from: m () boolean
   public boolean method_8093() {
      boolean var10000;
      try {
         if(this.field_7868 != null) {
            var10000 = true;
            return var10000;
         }
      } catch (RuntimeException var1) {
         throw method_8096(var1);
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: a (java.util.List) void
   public void method_8094(List param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: n () void
   private void method_8095() {
      this.field_7868 = null;
      this.method_8094(Lists.newArrayList());
      this.field_7879 = 0;
      this.field_7880 = 0;
      this.deleteOwnTexture();
      this.uploadedFrameIndex = -1;
      this.uploadedOwnFrameIndex = -1;
      this.frameBuffers = null;
      this.frameMipmaps = null;
   }

   public String toString() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_7881;
      return var10000.append("TextureAtlasSprite{name=\'").append(this.field_7866).append('\'').append(", frameCount=").append(this.field_7867.size()).append(", rotated=").append(this.field_7869).append(", x=").append(this.field_7871).append(", y=").append(this.field_7872).append(", height=").append(this.field_7874).append(", width=").append(this.field_7873).append(", u0=").append(this.field_7875).append(", u1=").append(this.field_7876).append(", v0=").append(this.field_7877).append(", v1=").append(this.field_7878).append('}').toString();
   }

   public int getWidth() {
      return this.field_7873;
   }

   public int getHeight() {
      return this.field_7874;
   }

   public int getIndexInMap() {
      return this.indexInMap;
   }

   public void setIndexInMap(int var1) {
      this.indexInMap = var1;
   }

   public void setMipmapActive(boolean var1) {
      this.mipmapActive = var1;
      this.frameMipmaps = null;
   }

   public void uploadFrameTexture() {
      this.uploadFrameTexture(this.field_7879, this.field_7871, this.field_7872);
   }

   public void uploadFrameTexture(int var1, int var2, int var3) {}

   private void uploadFrameMipmaps(int var1, int var2, int var3) {}

   public void bindOwnTexture() {}

   public void bindUploadOwnTexture() {
      this.bindOwnTexture();
      this.uploadFrameTexture(this.field_7879, 0, 0);
   }

   public void uploadOwnAnimation() {
      // $FF: Couldn't be decompiled
   }

   public void deleteOwnTexture() {
      // $FF: Couldn't be decompiled
   }

   private void fixTransparentColor(int[] param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean hasCustomLoader(bqy var1, bqx var2) {
      return false;
   }

   public boolean load(bqy var1, bqx var2) {
      return true;
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_8096(Throwable var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8097() {
      // $FF: Couldn't be decompiled
   }
}
