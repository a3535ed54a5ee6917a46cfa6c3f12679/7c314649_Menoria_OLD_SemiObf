
public class bql extends bqd {

   // $FF: renamed from: i double
   private double field_7884;
   // $FF: renamed from: j double
   private double field_7885;


   // $FF: renamed from: <init> (java.lang.String) void
   public void method_8076(String var1) {
      super.method_8076(var1);
   }

   // $FF: renamed from: j () void
   public void method_8081() {
      String[] var1 = class_752.method_4253();
      if(!this.field_7867.isEmpty()) {
         double var9;
         label90: {
            double var3;
            label94: {
               bao var2 = bao.method_5273();
               var3 = 0.0D;
               bao var10000 = var2;
               if(var1 != null) {
                  if(var2.cursorCounter6 == null) {
                     break label94;
                  }

                  var10000 = var2;
               }

               if(var1 != null) {
                  if(var10000.cursorCounter8 == null) {
                     break label94;
                  }

                  var10000 = var2;
               }

               float var5 = var10000.cursorCounter6.method_2101(1.0F);
               var9 = (double)var5;
               if(var1 == null) {
                  break label90;
               }

               var3 = var9;
               if(!var2.cursorCounter6.field_1820.method_6168()) {
                  var3 = Math.random();
               }
            }

            var9 = var3 - this.field_7884;
         }

         double var8 = var9;

         int var10;
         label74: {
            label95: {
               label72:
               while(true) {
                  if(var8 < -0.5D) {
                     ++var8;
                     if(var1 == null) {
                        break;
                     }

                     if(var1 != null) {
                        continue;
                     }
                  }

                  while(true) {
                     if(var8 < 0.5D) {
                        break label72;
                     }

                     --var8;
                     if(var1 == null) {
                        break label95;
                     }

                     if(var1 == null) {
                        break label72;
                     }
                  }
               }

               double var11;
               var10 = (var11 = var8 - -1.0D) == 0.0D?0:(var11 < 0.0D?-1:1);
               if(var1 == null) {
                  break label74;
               }

               if(var10 < 0) {
                  var8 = -1.0D;
               }
            }

            double var12;
            var10 = (var12 = var8 - 1.0D) == 0.0D?0:(var12 < 0.0D?-1:1);
         }

         if(var1 != null) {
            if(var10 > 0) {
               var8 = 1.0D;
            }

            this.field_7885 += var8 * 0.1D;
            this.field_7885 *= 0.8D;
            this.field_7884 += this.field_7885;
            var10 = (int)((this.field_7884 + 1.0D) * (double)this.field_7867.size()) % this.field_7867.size();
         }

         int var7 = var10;

         while(true) {
            if(var7 < 0) {
               var7 = (var7 + this.field_7867.size()) % this.field_7867.size();
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  continue;
               }
            }

            if(var7 != this.field_7879) {
               this.field_7879 = var7;
               bqi.method_8150((int[][])this.field_7867.get(this.field_7879), this.field_7873, this.field_7874, this.field_7871, this.field_7872, false, false);
            }
            break;
         }

      }
   }
}
