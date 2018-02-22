import org.lwjgl.opengl.GL11;

public class bmg {

   // $FF: renamed from: a int
   public int field_7285;
   // $FF: renamed from: b int
   public int field_7286;
   // $FF: renamed from: c int
   public int field_7287;
   // $FF: renamed from: d int
   public int field_7288;
   // $FF: renamed from: e boolean
   public boolean field_7289;
   // $FF: renamed from: f int
   public int field_7290;
   // $FF: renamed from: g int
   public int field_7291;
   // $FF: renamed from: h int
   public int field_7292;
   // $FF: renamed from: i float[]
   public float[] field_7293;
   // $FF: renamed from: j int
   public int field_7294;
   private static final String __OBFID;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_7295;


   // $FF: renamed from: <init> (int, int, boolean) void
   public void method_7484(int var1, int var2, boolean var3) {
      super();
      this.field_7289 = var3;
      this.field_7290 = -1;
      this.field_7291 = -1;
      this.field_7292 = -1;
      this.field_7293 = new float[4];
      this.field_7293[0] = 1.0F;
      this.field_7293[1] = 1.0F;
      this.field_7293[2] = 1.0F;
      this.field_7293[3] = 0.0F;
      this.method_7485(var1, var2);
   }

   // $FF: renamed from: a (int, int) void
   public void method_7485(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () void
   public void method_7486() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int) void
   public void method_7487(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int) void
   public void method_7488(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () void
   public void method_7489() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () void
   public void method_7490() {
      String[] var1 = class_752.method_4253();

      short var10000;
      label20: {
         try {
            var10000 = buu.method_9082();
            if(var1 == null) {
               break label20;
            }

            if(var10000 == 0) {
               return;
            }
         } catch (RuntimeException var2) {
            throw method_7497(var2);
         }

         var10000 = 3553;
      }

      GL11.glBindTexture(var10000, this.field_7291);
   }

   // $FF: renamed from: d () void
   public void method_7491() {
      String[] var1 = class_752.method_4253();

      short var10000;
      label20: {
         try {
            var10000 = buu.method_9082();
            if(var1 == null) {
               break label20;
            }

            if(var10000 == 0) {
               return;
            }
         } catch (RuntimeException var2) {
            throw method_7497(var2);
         }

         var10000 = 3553;
      }

      GL11.glBindTexture(var10000, 0);
   }

   // $FF: renamed from: a (boolean) void
   public void method_7492(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () void
   public void method_7493() {
      String[] var1 = class_752.method_4253();

      int var10000;
      label20: {
         try {
            var10000 = buu.method_9082();
            if(var1 == null) {
               break label20;
            }

            if(var10000 == 0) {
               return;
            }
         } catch (RuntimeException var2) {
            throw method_7497(var2);
         }

         var10000 = buu.field_8559;
      }

      buu.method_9068(var10000, 0);
   }

   // $FF: renamed from: a (float, float, float, float) void
   public void method_7494(float var1, float var2, float var3, float var4) {
      this.field_7293[0] = var1;
      this.field_7293[1] = var2;
      this.field_7293[2] = var3;
      this.field_7293[3] = var4;
   }

   // $FF: renamed from: c (int, int) void
   public void method_7495(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f () void
   public void method_7496() {
      String[] var10000 = class_752.method_4253();
      this.method_7492(true);
      GL11.glClearColor(this.field_7293[0], this.field_7293[1], this.field_7293[2], this.field_7293[3]);
      String[] var1 = var10000;
      int var2 = 16384;

      int var4;
      label21: {
         label20: {
            try {
               var4 = this.field_7289;
               if(var1 == null) {
                  break label21;
               }

               if(!this.field_7289) {
                  break label20;
               }
            } catch (RuntimeException var3) {
               throw method_7497(var3);
            }

            GL11.glClearDepth(1.0D);
            var2 |= 256;
         }

         var4 = var2;
      }

      GL11.glClear(var4);
      this.method_7493();
   }

   // $FF: renamed from: b (java.lang.RuntimeException) java.lang.RuntimeException
   private static RuntimeException method_7497(RuntimeException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7498() {
      // $FF: Couldn't be decompiled
   }
}
