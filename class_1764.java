
// $FF: renamed from: yB
public class class_1764 extends class_1727 {

   // $FF: renamed from: c ahb
   ahb field_9219;
   // $FF: renamed from: d wI
   class_761 field_9220;
   // $FF: renamed from: e int
   int field_9221;
   // $FF: renamed from: f double
   double field_9222;
   // $FF: renamed from: g boolean
   boolean field_9223;
   // $FF: renamed from: h jK
   class_1289 field_9224;
   // $FF: renamed from: i java.lang.Class
   Class field_9225;
   // $FF: renamed from: j int
   private int field_9226;
   // $FF: renamed from: k double
   private double field_9227;
   // $FF: renamed from: l double
   private double field_9228;
   // $FF: renamed from: m double
   private double field_9229;


   // $FF: renamed from: <init> (wI, java.lang.Class, double, boolean) void
   public void method_9726(class_761 var1, Class var2, double var3, boolean var5) {
      this.method_9727(var1, var3, var5);
      this.field_9225 = var2;
   }

   // $FF: renamed from: <init> (wI, double, boolean) void
   public void method_9727(class_761 var1, double var2, boolean var4) {
      super.method_9648();
      this.field_9220 = var1;
      this.field_9219 = var1.field_2990;
      this.field_9222 = var2;
      this.field_9223 = var4;
      this.method_9655(3);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      class_752 var2 = this.field_9220.method_4259();
      String[] var1 = class_752.method_4253();
      class_752 var10000 = var2;
      if(var1 != null) {
         if(var2 == null) {
            return false;
         }

         var10000 = var2;
      }

      boolean var3 = var10000.method_3917();
      if(var1 != null) {
         if(var3) {
            class_1764 var4 = this;
            if(var1 != null) {
               if(this.field_9225 != null) {
                  var4 = this;
                  if(var1 == null) {
                     return var4.field_9224 != null;
                  }

                  if(!this.field_9225.isAssignableFrom(var2.getClass())) {
                     return false;
                  }
               }

               this.field_9224 = this.field_9220.method_4257().method_9795(var2);
               var4 = this;
            }

            return var4.field_9224 != null;
         }

         var3 = false;
      }

      return var3;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var10000 = class_752.method_4253();
      class_752 var2 = this.field_9220.method_4259();
      String[] var1 = var10000;
      class_752 var3 = var2;
      if(var1 != null) {
         if(var2 == null) {
            return false;
         }

         var3 = var2;
      }

      boolean var4 = var3.method_3917();
      if(var1 != null) {
         if(!var4) {
            return false;
         }

         var4 = this.field_9223;
      }

      if(var1 != null) {
         if(!var4) {
            var4 = this.field_9220.method_4257().method_9801();
            if(var1 != null) {
               var4 = !var4;
            }

            return var4;
         }

         var4 = this.field_9220.method_4338(class_1715.method_9561(var2.field_2994), class_1715.method_9561(var2.field_2995), class_1715.method_9561(var2.field_2996));
      }

      if(var1 != null) {
         if(!var4) {
            return false;
         }

         var4 = true;
      }

      return var4;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9220.method_4257().method_9797(this.field_9224, this.field_9222);
      this.field_9226 = 0;
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9220.method_4257().method_9802();
   }

   // $FF: renamed from: g () void
   public void method_9654() {
      String[] var1;
      class_752 var2;
      int var10000;
      label112: {
         double var3;
         double var5;
         label115: {
            var2 = this.field_9220.method_4259();
            this.field_9220.method_4254().method_9975(var2, 30.0F, 30.0F);
            var1 = class_752.method_4253();
            var3 = this.field_9220.method_3889(var2.field_2994, var2.field_3004.field_6910, var2.field_2996);
            var5 = (double)(this.field_9220.field_3014 * 2.0F * this.field_9220.field_3014 * 2.0F + var2.field_3014);
            --this.field_9226;
            var10000 = this.field_9223;
            if(var1 != null) {
               if(!this.field_9223) {
                  var10000 = this.field_9220.method_4258().method_9814(var2);
                  if(var1 == null) {
                     break label112;
                  }

                  if(var10000 == 0) {
                     break label115;
                  }
               }

               var10000 = this.field_9226;
            }

            if(var1 == null) {
               break label112;
            }

            if(var10000 <= 0) {
               label116: {
                  label101: {
                     label117: {
                        double var9;
                        var10000 = (var9 = this.field_9227 - 0.0D) == 0.0D?0:(var9 < 0.0D?-1:1);
                        if(var1 != null) {
                           label98: {
                              if(var10000 == 0) {
                                 double var10;
                                 var10000 = (var10 = this.field_9228 - 0.0D) == 0.0D?0:(var10 < 0.0D?-1:1);
                                 if(var1 == null) {
                                    break label98;
                                 }

                                 if(var10000 == 0) {
                                    double var11;
                                    var10000 = (var11 = this.field_9229 - 0.0D) == 0.0D?0:(var11 < 0.0D?-1:1);
                                    if(var1 == null) {
                                       break label101;
                                    }

                                    if(var10000 == 0) {
                                       break label117;
                                    }
                                 }
                              }

                              double var12;
                              var10000 = (var12 = var2.method_3889(this.field_9227, this.field_9228, this.field_9229) - 1.0D) == 0.0D?0:(var12 < 0.0D?-1:1);
                           }
                        }

                        if(var1 == null) {
                           break label101;
                        }

                        if(var10000 < 0) {
                           float var13;
                           var10000 = (var13 = this.field_9220.method_4165().nextFloat() - 0.05F) == 0.0F?0:(var13 < 0.0F?-1:1);
                           if(var1 == null) {
                              break label112;
                           }

                           if(var10000 >= 0) {
                              break label116;
                           }
                        }
                     }

                     this.field_9227 = var2.field_2994;
                     this.field_9228 = var2.field_3004.field_6910;
                     this.field_9229 = var2.field_2996;
                     this.field_9226 = 4 + this.field_9220.method_4165().nextInt(7);
                     double var14;
                     var10000 = (var14 = var3 - 1024.0D) == 0.0D?0:(var14 < 0.0D?-1:1);
                  }

                  label74: {
                     label118: {
                        if(var1 != null) {
                           if(var10000 > 0) {
                              this.field_9226 += 10;
                              if(var1 != null) {
                                 break label118;
                              }
                           }

                           double var15;
                           var10000 = (var15 = var3 - 256.0D) == 0.0D?0:(var15 < 0.0D?-1:1);
                        }

                        if(var1 == null) {
                           break label74;
                        }

                        if(var10000 > 0) {
                           this.field_9226 += 5;
                        }
                     }

                     var10000 = this.field_9220.method_4257().method_9796(var2, this.field_9222);
                  }

                  if(var1 == null) {
                     break label112;
                  }

                  if(var10000 == 0) {
                     this.field_9226 += 15;
                  }
               }
            }
         }

         this.field_9221 = Math.max(this.field_9221 - 1, 0);
         double var16;
         var10000 = (var16 = var3 - var5) == 0.0D?0:(var16 < 0.0D?-1:1);
      }

      class_1764 var7;
      label120: {
         if(var1 != null) {
            if(var10000 > 0) {
               return;
            }

            var7 = this;
            if(var1 == null) {
               break label120;
            }

            var10000 = this.field_9221;
         }

         if(var10000 > 20) {
            return;
         }

         this.field_9221 = 20;
         var7 = this;
      }

      class_761 var8 = var7.field_9220;
      if(var1 != null) {
         if(var8.method_4214() != null) {
            this.field_9220.method_4209();
         }

         var8 = this.field_9220;
      }

      var8.method_4228(var2);
   }
}
