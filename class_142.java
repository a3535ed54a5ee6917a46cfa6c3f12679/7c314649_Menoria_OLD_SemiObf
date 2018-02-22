import org.lwjgl.opengl.GL11;

// $FF: renamed from: kY
public class class_142 extends bcb {

   // $FF: renamed from: <init> (int, int, int) void
   public void method_762(int var1, int var2, int var3) {
      super.method_748(var1, var2, var3, 20, 20, "");
   }

   // $FF: renamed from: a (bao, int, int) void
   public void method_750(bao var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.field_452;
      if(var4 != null) {
         if(!this.field_452) {
            return;
         }

         var1.method_5288().bindTexture(bcb.field_444);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var10000 = var2;
      }

      label53: {
         label57: {
            int var10001 = this.field_447;
            if(var4 != null) {
               if(var10000 < this.field_447) {
                  break label57;
               }

               var10000 = var3;
               var10001 = this.field_448;
            }

            if(var4 != null) {
               if(var10000 < var10001) {
                  break label57;
               }

               var10000 = var2;
               var10001 = this.field_447 + this.field_445;
            }

            if(var4 != null) {
               if(var10000 >= var10001) {
                  break label57;
               }

               var10000 = var3;
               if(var4 == null) {
                  break label53;
               }

               var10001 = this.field_448 + this.field_446;
            }

            if(var10000 < var10001) {
               var10000 = 1;
               break label53;
            }
         }

         var10000 = 0;
      }

      int var5 = var10000;
      int var6 = 106;
      if(var4 != null) {
         if(var5 != 0) {
            var6 += this.field_446;
         }

         this.method_658(this.field_447, this.field_448, 0, var6, this.field_445, this.field_446);
      }

   }
}
