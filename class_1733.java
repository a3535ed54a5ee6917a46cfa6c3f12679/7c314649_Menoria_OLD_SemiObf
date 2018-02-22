
// $FF: renamed from: yt
public class class_1733 extends class_1727 {

   // $FF: renamed from: a wL
   private class_776 field_9055;
   // $FF: renamed from: c sv
   private class_752 field_9056;
   // $FF: renamed from: d ahb
   ahb field_9057;
   // $FF: renamed from: e double
   private double field_9058;
   // $FF: renamed from: f y7
   private class_1783 field_9059;
   // $FF: renamed from: g int
   private int field_9060;
   // $FF: renamed from: h float
   float field_9061;
   // $FF: renamed from: i float
   float field_9062;
   // $FF: renamed from: j boolean
   private boolean field_9063;


   // $FF: renamed from: <init> (wL, double, float, float) void
   public void method_9664(class_776 var1, double var2, float var4, float var5) {
      super.method_9648();
      this.field_9055 = var1;
      this.field_9057 = var1.field_2990;
      this.field_9058 = var2;
      this.field_9059 = var1.method_4257();
      this.field_9062 = var4;
      this.field_9061 = var5;
      this.method_9655(3);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      String[] var10000 = class_752.method_4253();
      class_752 var2 = this.field_9055.method_4481();
      String[] var1 = var10000;
      if(var2 == null) {
         return false;
      } else {
         int var3 = this.field_9055.method_4478();
         if(var1 != null) {
            if(var3 != 0) {
               return false;
            }

            double var4;
            var3 = (var4 = this.field_9055.method_3891(var2) - (double)(this.field_9062 * this.field_9062)) == 0.0D?0:(var4 < 0.0D?-1:1);
         }

         if(var1 != null) {
            if(var3 < 0) {
               return false;
            }

            this.field_9056 = var2;
            var3 = 1;
         }

         return (boolean)var3;
      }
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      int var10000;
      label32: {
         String[] var1 = class_752.method_4253();
         var10000 = this.field_9059.method_9801();
         if(var1 != null) {
            if(var10000 != 0) {
               break label32;
            }

            double var2;
            var10000 = (var2 = this.field_9055.method_3891(this.field_9056) - (double)(this.field_9061 * this.field_9061)) == 0.0D?0:(var2 < 0.0D?-1:1);
         }

         if(var1 != null) {
            if(var10000 <= 0) {
               break label32;
            }

            var10000 = this.field_9055.method_4478();
         }

         if(var1 == null) {
            return (boolean)var10000;
         }

         if(var10000 == 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9060 = 0;
      this.field_9063 = this.field_9055.method_4257().method_9785();
      this.field_9055.method_4257().method_9784(false);
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9056 = null;
      this.field_9059.method_9802();
      this.field_9055.method_4257().method_9784(this.field_9063);
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      String[] var10000 = class_752.method_4253();
      this.field_9055.method_4254().method_9975(this.field_9056, 10.0F, (float)this.field_9055.method_4271());
      String[] var1 = var10000;
      int var8 = this.field_9055.method_4478();
      if(var1 != null) {
         if(var8 != 0) {
            return;
         }

         var8 = --this.field_9060;
      }

      if(var1 != null) {
         if(var8 > 0) {
            return;
         }

         this.field_9060 = 10;
         var8 = this.field_9059.method_9796(this.field_9056, this.field_9058);
      }

      if(var1 != null) {
         if(var8 != 0) {
            return;
         }

         var8 = this.field_9055.method_4299();
      }

      if(var1 != null) {
         if(var8 != 0) {
            return;
         }

         double var9;
         var8 = (var9 = this.field_9055.method_3891(this.field_9056) - 144.0D) == 0.0D?0:(var9 < 0.0D?-1:1);
      }

      if(var1 != null) {
         if(var8 < 0) {
            return;
         }

         var8 = class_1715.method_9561(this.field_9056.field_2994) - 2;
      }

      int var2 = var8;
      int var3 = class_1715.method_9561(this.field_9056.field_2996) - 2;
      int var4 = class_1715.method_9561(this.field_9056.field_3004.field_6910);
      int var5 = 0;

      label122:
      while(true) {
         var8 = var5;
         byte var10001 = 4;

         label120:
         while(true) {
            if(var8 <= var10001) {
               int var6 = 0;

               while(true) {
                  if(var6 <= 4) {
                     label125: {
                        var8 = var5;
                        if(var1 != null) {
                           label126: {
                              var10001 = 1;
                              if(var1 == null) {
                                 continue label120;
                              }

                              if(var5 >= 1) {
                                 var8 = var6;
                                 if(var1 == null) {
                                    break label126;
                                 }

                                 if(var6 >= 1) {
                                    var8 = var5;
                                    if(var1 == null) {
                                       break label126;
                                    }

                                    if(var5 <= 3) {
                                       var8 = var6;
                                       if(var1 == null) {
                                          break label126;
                                       }

                                       if(var6 <= 3 && var1 != null) {
                                          break label125;
                                       }
                                    }
                                 }
                              }

                              var8 = ahb.method_2135(this.field_9057, var2 + var5, var4 - 1, var3 + var6);
                           }
                        }

                        if(var1 != null) {
                           if(var8 == 0) {
                              break label125;
                           }

                           var8 = this.field_9057.getBlock(var2 + var5, var4, var3 + var6).method_2433();
                        }

                        class_1733 var7;
                        label127: {
                           if(var1 != null) {
                              if(var8 != 0) {
                                 break label125;
                              }

                              var7 = this;
                              if(var1 == null) {
                                 break label127;
                              }

                              var8 = this.field_9057.getBlock(var2 + var5, var4 + 1, var3 + var6).method_2433();
                           }

                           if(var8 != 0) {
                              break label125;
                           }

                           this.field_9055.method_3887((double)((float)(var2 + var5) + 0.5F), (double)var4, (double)((float)(var3 + var6) + 0.5F), this.field_9055.field_3000, this.field_9055.field_3001);
                           var7 = this;
                        }

                        var7.field_9059.method_9802();
                        return;
                     }

                     ++var6;
                     if(var1 != null) {
                        continue;
                     }
                  }

                  ++var5;
                  if(var1 != null) {
                     continue label122;
                  }
                  break;
               }
            }

            return;
         }
      }
   }
}
