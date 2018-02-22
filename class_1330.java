
// $FF: renamed from: kS
public class class_1330 {

   // $FF: renamed from: b float
   float field_6825;
   // $FF: renamed from: c double
   private double field_6826;
   // $FF: renamed from: d int
   public int field_6827;
   // $FF: renamed from: e float
   public float field_6828;
   // $FF: renamed from: f float
   public float field_6829;
   // $FF: renamed from: g float
   public float field_6830;
   // $FF: renamed from: h long
   private long field_6831;
   // $FF: renamed from: i long
   private long field_6832;
   // $FF: renamed from: j long
   private long field_6833;
   // $FF: renamed from: k double
   private double field_6834;


   // $FF: renamed from: <init> (float) void
   public void method_6990(float var1) {
      super();
      this.field_6829 = 1.0F;
      this.field_6834 = 1.0D;
      this.field_6825 = var1;
      this.field_6831 = bao.method_5283();
      this.field_6832 = System.nanoTime() / 1000000L;
   }

   // $FF: renamed from: b () void
   public void method_6991() {
      String[] var1;
      long var2;
      double var8;
      class_1330 var15;
      int var10000;
      label67: {
         label70: {
            long var6;
            label65: {
               long var4;
               label64: {
                  var2 = bao.method_5283();
                  var4 = var2 - this.field_6831;
                  var6 = System.nanoTime() / 1000000L;
                  var1 = class_752.method_4253();
                  var8 = (double)var6 / 1000.0D;
                  if(var1 != null) {
                     if(var4 <= 1000L) {
                        long var16;
                        var10000 = (var16 = var4 - 0L) == 0L?0:(var16 < 0L?-1:1);
                        if(var1 == null) {
                           break label65;
                        }

                        if(var10000 >= 0) {
                           break label64;
                        }
                     }

                     this.field_6826 = var8;
                  }

                  if(var1 != null) {
                     break label70;
                  }
               }

               this.field_6833 += var4;
               long var17;
               var10000 = (var17 = this.field_6833 - 1000L) == 0L?0:(var17 < 0L?-1:1);
            }

            if(var1 != null) {
               if(var10000 > 0) {
                  long var10 = var6 - this.field_6832;
                  double var12 = (double)this.field_6833 / (double)var10;
                  this.field_6834 += (var12 - this.field_6834) * 0.20000000298023224D;
                  this.field_6832 = var6;
                  this.field_6833 = 0L;
               }

               var15 = this;
               if(var1 == null) {
                  break label67;
               }

               long var18;
               var10000 = (var18 = this.field_6833 - 0L) == 0L?0:(var18 < 0L?-1:1);
            }

            if(var10000 < 0) {
               this.field_6832 = var6;
            }
         }

         var15 = this;
      }

      var15.field_6831 = var2;
      double var14 = (var8 - this.field_6826) * this.field_6834;
      this.field_6826 = var8;
      double var19;
      var10000 = (var19 = var14 - 0.0D) == 0.0D?0:(var19 < 0.0D?-1:1);
      if(var1 != null) {
         if(var10000 < 0) {
            var14 = 0.0D;
         }

         double var20;
         var10000 = (var20 = var14 - 1.0D) == 0.0D?0:(var20 < 0.0D?-1:1);
      }

      label72: {
         if(var1 != null) {
            if(var10000 > 0) {
               var14 = 1.0D;
            }

            this.field_6830 = (float)((double)this.field_6830 + var14 * (double)this.field_6829 * (double)this.field_6825);
            this.field_6827 = (int)this.field_6830;
            this.field_6830 -= (float)this.field_6827;
            var15 = this;
            if(var1 == null) {
               break label72;
            }

            var10000 = this.field_6827;
         }

         if(var10000 > 10) {
            this.field_6827 = 10;
         }

         var15 = this;
      }

      var15.field_6828 = this.field_6830;
   }
}
