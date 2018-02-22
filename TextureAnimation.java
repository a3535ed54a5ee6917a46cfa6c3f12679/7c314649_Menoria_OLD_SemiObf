import java.nio.ByteBuffer;
import java.util.Properties;
import org.lwjgl.opengl.GL11;

public class TextureAnimation {

   private String srcTex;
   private String dstTex;
   private int dstTextId;
   private int dstX;
   private int dstY;
   private int frameWidth;
   private int frameHeight;
   private CustomAnimationFrame[] frames;
   private int activeFrame;
   private ByteBuffer imageData;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_9463;


   // $FF: renamed from: <init> (java.lang.String, byte[], java.lang.String, int, int, int, int, int, java.util.Properties, int) void
   public void method_10043(String var1, byte[] var2, String var3, int var4, int var5, int var6, int var7, int var8, Properties var9, int var10) {
      super();
      this.srcTex = null;
      this.dstTex = null;
      this.dstTextId = -1;
      this.dstX = 0;
      this.dstY = 0;
      this.frameWidth = 0;
      String[] var10000 = class_752.method_4253();
      this.frameHeight = 0;
      this.frames = null;
      this.activeFrame = 0;
      String[] var11 = var10000;
      this.imageData = null;
      this.srcTex = var1;
      this.dstTex = var3;
      this.dstTextId = var4;
      this.dstX = var5;
      this.dstY = var6;
      this.frameWidth = var7;
      this.frameHeight = var8;
      int var12 = var7 * var8 * 4;
      int var24 = var2.length % var12;
      String[] var22;
      if(var11 != null) {
         if(var24 != 0) {
            StringBuilder var25 = new StringBuilder();
            var22 = field_9463;
            Config.warn(var25.append("Invalid animated texture length: ").append(var2.length).append(", frameWidth: ").append(var8).append(", frameHeight: ").append(var8).toString());
         }

         this.imageData = ban.method_5198(var2.length);
         this.imageData.put(var2);
         var24 = var2.length / var12;
      }

      int var13 = var24;
      var22 = field_9463;
      Object var26 = var9.get("tile.0");
      StringBuilder var10001;
      if(var11 != null) {
         if(var26 != null) {
            int var14 = 0;

            do {
               var10001 = new StringBuilder();
               var22 = field_9463;
               if(var9.get(var10001.append("tile.").append(var14).toString()) == null) {
                  break;
               }

               var13 = var14 + 1;
               ++var14;
            } while(var11 != null);
         }

         var22 = field_9463;
         var26 = var9.get("duration");
      }

      String var23 = (String)var26;
      int var15 = Config.parseInt(var23, var10);
      this.frames = new CustomAnimationFrame[var13];
      int var16 = 0;

      while(var16 < this.frames.length) {
         var10001 = new StringBuilder();
         var22 = field_9463;
         String var17 = (String)var9.get(var10001.append("tile.").append(var16).toString());
         int var18 = Config.parseInt(var17, var16);
         String var19 = (String)var9.get("duration." + var16);
         int var20 = Config.parseInt(var19, var15);
         CustomAnimationFrame var27 = new CustomAnimationFrame;
         var27.getBlock83(var18, var20);
         CustomAnimationFrame var21 = var27;
         this.frames[var16] = var21;
         ++var16;
         if(var11 == null) {
            break;
         }
      }

   }

   public boolean nextFrame() {
      int var10000;
      String[] var1;
      TextureAnimation var3;
      label42: {
         var1 = class_752.method_4253();
         var10000 = this.frames.length;
         if(var1 != null) {
            if(var10000 <= 0) {
               return false;
            }

            var3 = this;
            if(var1 == null) {
               break label42;
            }

            var10000 = this.activeFrame;
         }

         if(var10000 >= this.frames.length) {
            this.activeFrame = 0;
         }

         var3 = this;
      }

      CustomAnimationFrame var2 = var3.frames[this.activeFrame];
      ++var2.counter;
      var10000 = var2.counter;
      int var10001 = var2.duration;
      if(var1 != null) {
         if(var2.counter < var2.duration) {
            return false;
         }

         var2.counter = 0;
         ++this.activeFrame;
         var10000 = this.activeFrame;
         if(var1 == null) {
            return (boolean)var10000;
         }

         var10001 = this.frames.length;
      }

      if(var10000 >= var10001) {
         this.activeFrame = 0;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   public int getActiveFrameIndex() {
      TextureAnimation var3;
      label23: {
         String[] var1 = class_752.method_4253();
         int var10000 = this.frames.length;
         if(var1 != null) {
            if(var10000 <= 0) {
               return 0;
            }

            var3 = this;
            if(var1 == null) {
               break label23;
            }

            var10000 = this.activeFrame;
         }

         if(var10000 >= this.frames.length) {
            this.activeFrame = 0;
         }

         var3 = this;
      }

      CustomAnimationFrame var2 = var3.frames[this.activeFrame];
      return var2.index;
   }

   public int getFrameCount() {
      return this.frames.length;
   }

   public boolean updateTexture() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.nextFrame();
      if(var1 != null) {
         if(var10000 == 0) {
            return false;
         }

         var10000 = this.frameWidth * this.frameHeight * 4;
      }

      int var2 = var10000;
      int var3 = this.getActiveFrameIndex();
      int var4 = var2 * var3;
      var10000 = var4 + var2;
      int var10001 = this.imageData.capacity();
      if(var1 != null) {
         if(var10000 > var10001) {
            return false;
         }

         this.imageData.position(var4);
         GL11.glBindTexture(3553, this.dstTextId);
         var10000 = 3553;
         var10001 = 0;
      }

      GL11.glTexSubImage2D(var10000, var10001, this.dstX, this.dstY, this.frameWidth, this.frameHeight, 6408, 5121, this.imageData);
      return true;
   }

   public String getSrcTex() {
      return this.srcTex;
   }

   public String getDstTex() {
      return this.dstTex;
   }

   public int getDstTextId() {
      return this.dstTextId;
   }

   // $FF: renamed from: <clinit> () void
   static void method_10044() {
      // $FF: Couldn't be decompiled
   }
}
