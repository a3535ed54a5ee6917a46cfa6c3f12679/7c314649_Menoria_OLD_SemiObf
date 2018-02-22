import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: n1
public class class_1378 {

   // $FF: renamed from: b int
   public int field_7314;
   // $FF: renamed from: c int
   public int field_7315;
   // $FF: renamed from: d int
   public int field_7316;
   // $FF: renamed from: e double
   private double field_7317;
   // $FF: renamed from: f double
   private double field_7318;
   // $FF: renamed from: g double
   private double field_7319;
   // $FF: renamed from: h java.nio.IntBuffer
   private IntBuffer field_7320;
   // $FF: renamed from: i boolean
   private boolean field_7321;
   // $FF: renamed from: j boolean
   private boolean field_7322;


   // $FF: renamed from: <init> () void
   public void method_7519() {
      super();
      this.field_7320 = ban.method_5199(65536);
   }

   // $FF: renamed from: b (int, int, int, double, double, double) void
   public void method_7520(int var1, int var2, int var3, double var4, double var6, double var8) {
      this.field_7321 = true;
      this.field_7320.clear();
      this.field_7314 = var1;
      this.field_7315 = var2;
      this.field_7316 = var3;
      this.field_7317 = var4;
      this.field_7318 = var6;
      this.field_7319 = var8;
   }

   // $FF: renamed from: b (int, int, int) boolean
   public boolean method_7521(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.field_7321;
      if(var4 != null) {
         if(!this.field_7321) {
            return false;
         }

         var10000 = var1;
      }

      label41: {
         int var10001 = this.field_7314;
         if(var4 != null) {
            if(var10000 != this.field_7314) {
               break label41;
            }

            var10000 = var2;
            var10001 = this.field_7315;
         }

         if(var4 != null) {
            if(var10000 != var10001) {
               break label41;
            }

            var10000 = var3;
            if(var4 == null) {
               return (boolean)var10000;
            }

            var10001 = this.field_7316;
         }

         if(var10000 == var10001) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: b (int) void
   public void method_7522(int var1) {
      String[] var10000 = class_752.method_4253();
      this.field_7320.put(var1);
      String[] var2 = var10000;
      class_1378 var3 = this;
      if(var2 != null) {
         if(this.field_7320.remaining() != 0) {
            return;
         }

         var3 = this;
      }

      var3.method_7523();
   }

   // $FF: renamed from: b () void
   public void method_7523() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_7321;
      if(var1 != null) {
         if(!this.field_7321) {
            return;
         }

         var10000 = this.field_7322;
      }

      if(var1 != null) {
         if(var10000 == 0) {
            this.field_7320.flip();
            this.field_7322 = true;
         }

         var10000 = this.field_7320.remaining();
      }

      if(var1 != null) {
         if(var10000 <= 0) {
            return;
         }

         GL11.glPushMatrix();
         var10000 = this.field_7314;
      }

      GL11.glTranslatef((float)((double)var10000 - this.field_7317), (float)((double)this.field_7315 - this.field_7318), (float)((double)this.field_7316 - this.field_7319));
      GL11.glCallLists(this.field_7320);
      GL11.glPopMatrix();
   }

   // $FF: renamed from: c () void
   public void method_7524() {
      this.field_7321 = false;
      this.field_7322 = false;
   }
}
