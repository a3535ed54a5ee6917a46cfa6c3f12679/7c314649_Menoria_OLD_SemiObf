
// $FF: renamed from: yU
public class class_1745 extends class_1727 {

   // $FF: renamed from: c wI
   private class_761 field_9118;
   // $FF: renamed from: d double
   private double field_9119;
   // $FF: renamed from: e double
   private double field_9120;
   // $FF: renamed from: f double
   private double field_9121;
   // $FF: renamed from: g double
   private double field_9122;
   // $FF: renamed from: h double
   private double field_9123;
   // $FF: renamed from: i double
   private double field_9124;
   // $FF: renamed from: j yz
   private class_792 field_9125;
   // $FF: renamed from: k int
   private int field_9126;
   // $FF: renamed from: l boolean
   private boolean field_9127;
   // $FF: renamed from: m adb
   private adb field_9128;
   // $FF: renamed from: n boolean
   private boolean field_9129;
   // $FF: renamed from: o boolean
   private boolean field_9130;


   // $FF: renamed from: <init> (wI, double, adb, boolean) void
   public void method_9691(class_761 var1, double var2, adb var4, boolean var5) {
      super.method_9648();
      this.field_9118 = var1;
      this.field_9119 = var2;
      this.field_9128 = var4;
      this.field_9129 = var5;
      this.method_9655(3);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var1 = class_752.method_4253();
      class_1745 var10000 = this;
      if(var1 != null) {
         if(this.field_9126 > 0) {
            --this.field_9126;
            return false;
         }

         this.field_9125 = this.field_9118.field_2990.method_2174(this.field_9118, 10.0D);
         var10000 = this;
      }

      class_792 var3 = var10000.field_9125;
      if(var1 != null) {
         if(var3 == null) {
            return false;
         }

         var3 = this.field_9125;
      }

      add var2 = var3.method_4593();
      add var4 = var2;
      if(var1 != null) {
         if(var2 == null) {
            return false;
         }

         var4 = var2;
      }

      return var4.method_3730() == this.field_9128;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_9129;
      if(var1 != null) {
         if(this.field_9129) {
            class_1745 var2;
            label42: {
               label41: {
                  var2 = this;
                  if(var1 != null) {
                     if(this.field_9118.method_3891(this.field_9125) < 36.0D) {
                        double var4;
                        int var3 = (var4 = this.field_9125.method_3889(this.field_9120, this.field_9121, this.field_9122) - 0.010000000000000002D) == 0.0D?0:(var4 < 0.0D?-1:1);
                        if(var1 != null) {
                           if(var3 > 0) {
                              return false;
                           }

                           double var5;
                           var3 = (var5 = Math.abs((double)this.field_9125.field_3001 - this.field_9123) - 5.0D) == 0.0D?0:(var5 < 0.0D?-1:1);
                        }

                        if(var1 != null) {
                           if(var3 <= 0) {
                              var2 = this;
                              if(var1 == null) {
                                 break label42;
                              }

                              if(Math.abs((double)this.field_9125.field_3000 - this.field_9124) <= 5.0D) {
                                 break label41;
                              }
                           }

                           var3 = 0;
                        }

                        return (boolean)var3;
                     }

                     this.field_9120 = this.field_9125.field_2994;
                     this.field_9121 = this.field_9125.field_2995;
                     var2 = this;
                  }

                  var2.field_9122 = this.field_9125.field_2996;
               }

               this.field_9123 = (double)this.field_9125.field_3001;
               var2 = this;
            }

            var2.field_9124 = (double)this.field_9125.field_3000;
         }

         var10000 = this.method_9649();
      }

      return var10000;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9120 = this.field_9125.field_2994;
      this.field_9121 = this.field_9125.field_2995;
      this.field_9122 = this.field_9125.field_2996;
      this.field_9127 = true;
      this.field_9130 = this.field_9118.method_4257().method_9785();
      this.field_9118.method_4257().method_9784(false);
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9125 = null;
      this.field_9118.method_4257().method_9802();
      this.field_9126 = 100;
      this.field_9127 = false;
      this.field_9118.method_4257().method_9784(this.field_9130);
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      String[] var10000 = class_752.method_4253();
      this.field_9118.method_4254().method_9975(this.field_9125, 30.0F, (float)this.field_9118.method_4271());
      String[] var1 = var10000;
      double var3;
      int var2 = (var3 = this.field_9118.method_3891(this.field_9125) - 6.25D) == 0.0D?0:(var3 < 0.0D?-1:1);
      if(var1 != null) {
         if(var2 < 0) {
            this.field_9118.method_4257().method_9802();
            if(var1 != null) {
               return;
            }
         }

         this.field_9118.method_4257().method_9796(this.field_9125, this.field_9119);
      }

   }

   // $FF: renamed from: a () boolean
   public boolean method_9692() {
      return this.field_9127;
   }
}
