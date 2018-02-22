package ca.diiza.l;

import ca.diiza.l.class_862;

// $FF: renamed from: ca.diiza.l.c
public class class_155 extends bcb {

   // $FF: renamed from: <init> (int, int, int, int, int, java.lang.String) void
   public void method_748(int var1, int var2, int var3, int var4, int var5, String var6) {
      super.method_748(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: a (bao, int, int) void
   public void method_750(bao var1, int var2, int var3) {
      int var4 = class_862.method_5031();
      if(this.field_452) {
         FontRenderer var5;
         int var10000;
         label67: {
            label72: {
               var5 = var1.enableBackgroundDrawing4;
               var10000 = var2;
               int var10001 = this.field_447;
               if(var4 == 0) {
                  if(var2 < this.field_447) {
                     break label72;
                  }

                  var10000 = var3;
                  var10001 = this.field_448;
               }

               if(var4 == 0) {
                  if(var10000 < var10001) {
                     break label72;
                  }

                  var10000 = var2;
                  var10001 = this.field_447 + this.field_445;
               }

               if(var4 == 0) {
                  if(var10000 >= var10001) {
                     break label72;
                  }

                  var10000 = var3;
                  if(var4 != 0) {
                     break label67;
                  }

                  var10001 = this.field_448 + this.field_446;
               }

               if(var10000 < var10001) {
                  var10000 = 1;
                  break label67;
               }
            }

            var10000 = 0;
         }

         label46: {
            label74: {
               int var6 = var10000;
               var10000 = var6;
               if(var4 == 0) {
                  if(var6 == 0) {
                     break label74;
                  }

                  var10000 = this.field_451;
               }

               if(var4 != 0) {
                  break label46;
               }

               if(var10000 != 0) {
                  var10000 = -932813210;
                  break label46;
               }
            }

            var10000 = -1610612736;
         }

         int var7 = var10000;
         drawRect(this.field_447, this.field_448, this.field_447 + this.field_445, this.field_448 + this.field_446, var7);
         int var10003 = this.field_447 + this.field_445 / 2;
         int var10004 = this.field_448 + (this.field_446 - 8) / 2;
         int var10005 = this.field_451;
         if(var4 == 0) {
            var10005 = this.field_451?-1:-8355712;
         }

         this.drawCenteredString(var5, this.field_449, var10003, var10004, var10005);
      }

   }
}
