package ca.diiza.f;

import ca.diiza.f.class_209;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: ca.diiza.f.l
public class class_158 extends bcb {

   // $FF: renamed from: <init> (int, int, int) void
   public void method_839(int var1, int var2, int var3) {
      super.method_748(var1, var2, var3, 20, 20, "");
   }

   // $FF: renamed from: a (bao, int, int) void
   public void method_750(bao var1, int var2, int var3) {
      int var4 = class_209.method_1160();
      int var10000 = this.field_452;
      if(var4 == 0) {
         if(!this.field_452) {
            return;
         }

         var1.method_5288().bindTexture(bcb.field_444);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var10000 = var2;
      }

      label52: {
         label61: {
            int var10001 = this.field_447;
            if(var4 == 0) {
               if(var10000 < this.field_447) {
                  break label61;
               }

               var10000 = var3;
               var10001 = this.field_448;
            }

            if(var4 == 0) {
               if(var10000 < var10001) {
                  break label61;
               }

               var10000 = var2;
               var10001 = this.field_447 + this.field_445;
            }

            if(var4 == 0) {
               if(var10000 >= var10001) {
                  break label61;
               }

               var10000 = var3;
               if(var4 != 0) {
                  break label52;
               }

               var10001 = this.field_448 + this.field_446;
            }

            if(var10000 < var10001) {
               var10000 = 1;
               break label52;
            }
         }

         var10000 = 0;
      }

      int var6;
      label31: {
         int var5 = var10000;
         var6 = 146;
         var10000 = var5;
         if(var4 == 0) {
            if(var5 == 0) {
               break label31;
            }

            var10000 = var6 + this.field_446;
         }

         var6 = var10000;
      }

      this.method_658(this.field_447, this.field_448, 0, var6, this.field_445, this.field_446);
   }

   // $FF: renamed from: d () int
   public int method_840() {
      return this.field_448;
   }

   // $FF: renamed from: e () int
   public int method_841() {
      return this.field_446;
   }
}
