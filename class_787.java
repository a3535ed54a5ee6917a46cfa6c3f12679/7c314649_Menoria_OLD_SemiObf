import org.apache.commons.lang3.tuple.ImmutablePair;

// $FF: renamed from: w5
public class class_787 extends class_779 {

   // $FF: renamed from: bB int
   private int field_3593;
   // $FF: renamed from: hb java.lang.String[]
   private static final String[] field_3594;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.method_3852(0.3F, 0.7F);
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9390).method_390(8.0D);
      this.method_4211(class_1840.field_9393).method_390(0.6000000238418579D);
      this.method_4211(class_1840.field_9394).method_390(1.0D);
   }

   // $FF: renamed from: g_ () boolean
   protected boolean method_3869() {
      return false;
   }

   // $FF: renamed from: bR () sa
   protected class_689 method_4332() {
      double var1 = 8.0D;
      return this.field_2990.method_2176(this, var1);
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String[] var10000 = field_3594;
      return "mob.silverfish.say";
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3594;
      return "mob.silverfish.hit";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3594;
      return "mob.silverfish.kill";
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.method_3961();
      if(var3 != null) {
         if(var10000 != 0) {
            return false;
         }

         var10000 = this.field_3593;
      }

      if(var3 != null) {
         if(var10000 <= 0) {
            label27: {
               label26: {
                  class_1691 var4 = var1;
                  if(var3 != null) {
                     if(var1 instanceof class_1692) {
                        break label26;
                     }

                     var4 = var1;
                  }

                  if(var4 != class_1691.field_8840) {
                     break label27;
                  }
               }

               this.field_3593 = 20;
            }
         }

         var10000 = super.method_3896(var1, var2);
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (sa, float) void
   protected void method_4330(class_689 var1, float var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.field_3319;
      if(var3 != null) {
         if(this.field_3319 > 0) {
            return;
         }

         float var4;
         var10000 = (var4 = var2 - 1.2F) == 0.0F?0:(var4 < 0.0F?-1:1);
      }

      if(var3 != null) {
         if(var10000 >= 0) {
            return;
         }

         double var5;
         var10000 = (var5 = var1.field_3004.field_6913 - this.field_3004.field_6910) == 0.0D?0:(var5 < 0.0D?-1:1);
      }

      if(var3 != null) {
         if(var10000 <= 0) {
            return;
         }

         double var6;
         var10000 = (var6 = var1.field_3004.field_6910 - this.field_3004.field_6913) == 0.0D?0:(var6 < 0.0D?-1:1);
      }

      if(var3 != null && var10000 < 0) {
         this.field_3319 = 20;
         this.method_4228(var1);
      }

   }

   // $FF: renamed from: a (int, int, int, aji) void
   protected void method_3867(int var1, int var2, int var3, aji var4) {
      String[] var10001 = field_3594;
      this.method_3868("mob.silverfish.step", 0.15F, 1.0F);
   }

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      return adb.method_2919(0);
   }

   // $FF: renamed from: h () void
   public void method_3856() {
      this.field_3330 = this.field_3000;
      super.method_3856();
   }

   // $FF: renamed from: bq () void
   protected void method_4236() {
      class_787 var20;
      label228: {
         int var13;
         label229: {
            String[] var1;
            int var2;
            int var3;
            int var4;
            int var7;
            Object var14;
            boolean var19;
            label230: {
               String[] var10000 = class_752.method_4253();
               super.method_4236();
               var1 = var10000;
               var13 = this.field_2990.field_1832;
               if(var1 != null) {
                  if(this.field_2990.field_1832) {
                     return;
                  }

                  var14 = this;
                  if(var1 == null) {
                     break label230;
                  }

                  var13 = this.field_3593;
               }

               if(var13 > 0) {
                  --this.field_3593;
                  var14 = this;
                  if(var1 == null) {
                     break label230;
                  }

                  if(this.field_3593 == 0) {
                     var2 = class_1715.method_9561(this.field_2994);
                     var3 = class_1715.method_9561(this.field_2995);
                     var4 = class_1715.method_9561(this.field_2996);
                     boolean var5 = false;
                     int var6 = 0;

                     while(!var5) {
                        var13 = var6;
                        if(var1 == null) {
                           break label229;
                        }

                        label233: {
                           byte var10001 = 5;
                           if(var1 != null) {
                              if(var6 > 5) {
                                 break;
                              }

                              var13 = var6;
                              if(var1 == null) {
                                 break label233;
                              }

                              var10001 = -5;
                           }

                           if(var13 < var10001) {
                              break;
                           }

                           var13 = 0;
                        }

                        var7 = var13;

                        label168: {
                           int var15;
                           label235: {
                              while(true) {
                                 if(!var5) {
                                    var13 = var7;
                                    if(var1 == null) {
                                       break;
                                    }

                                    var15 = 10;
                                    if(var1 == null) {
                                       break label235;
                                    }

                                    if(var7 <= 10) {
                                       var13 = var7;
                                       if(var1 == null) {
                                          break;
                                       }

                                       if(var7 >= -10) {
                                          int var8 = 0;

                                          label151: {
                                             label238: {
                                                while(true) {
                                                   if(!var5) {
                                                      var13 = var8;
                                                      if(var1 == null) {
                                                         break;
                                                      }

                                                      var15 = 10;
                                                      if(var1 == null) {
                                                         break label238;
                                                      }

                                                      if(var8 <= 10) {
                                                         var13 = var8;
                                                         if(var1 == null) {
                                                            break;
                                                         }

                                                         if(var8 >= -10) {
                                                            label240: {
                                                               label135: {
                                                                  label244: {
                                                                     ahb var17 = this.field_2990;
                                                                     if(var1 != null) {
                                                                        if(this.field_2990.getBlock(var2 + var7, var3 + var6, var4 + var8) != class_1192.field_6122) {
                                                                           break label244;
                                                                        }

                                                                        var17 = this.field_2990;
                                                                     }

                                                                     class_1038 var18 = var17.method_2196();
                                                                     String[] var16 = field_3594;
                                                                     var19 = var18.method_5878("mobGriefing");
                                                                     if(var1 != null) {
                                                                        label120: {
                                                                           if(!var19) {
                                                                              int var9 = this.field_2990.method_33(var2 + var7, var3 + var6, var4 + var8);
                                                                              ImmutablePair var10 = class_364.method_2550(var9);
                                                                              this.field_2990.method_2054(var2 + var7, var3 + var6, var4 + var8, (aji)var10.getLeft(), ((Integer)var10.getRight()).intValue(), 3);
                                                                              if(var1 != null) {
                                                                                 break label120;
                                                                              }
                                                                           }

                                                                           this.field_2990.method_2057(var2 + var7, var3 + var6, var4 + var8, false);
                                                                        }
                                                                     }

                                                                     class_1192.field_6122.method_2458(this.field_2990, var2 + var7, var3 + var6, var4 + var8, 0);
                                                                     var13 = this.field_3028.nextBoolean();
                                                                     if(var1 == null) {
                                                                        break label135;
                                                                     }

                                                                     if(var13 != 0) {
                                                                        var5 = true;
                                                                        if(var1 != null) {
                                                                           break label240;
                                                                        }
                                                                     }
                                                                  }

                                                                  var13 = var8;
                                                               }

                                                               label115: {
                                                                  if(var1 != null) {
                                                                     if(var13 <= 0) {
                                                                        var13 = 1 - var8;
                                                                        break label115;
                                                                     }

                                                                     var13 = 0;
                                                                  }

                                                                  var13 -= var8;
                                                               }

                                                               var8 = var13;
                                                               if(var1 != null) {
                                                                  continue;
                                                               }
                                                            }
                                                         }
                                                      }
                                                   }

                                                   var13 = var7;
                                                   break;
                                                }

                                                if(var1 != null) {
                                                   if(var13 <= 0) {
                                                      var13 = 1 - var7;
                                                      break label151;
                                                   }

                                                   var13 = 0;
                                                }

                                                var15 = var7;
                                             }

                                             var13 -= var15;
                                          }

                                          var7 = var13;
                                          if(var1 != null) {
                                             continue;
                                          }
                                       }
                                    }
                                 }

                                 var13 = var6;
                                 break;
                              }

                              if(var1 != null) {
                                 if(var13 <= 0) {
                                    var13 = 1 - var6;
                                    break label168;
                                 }

                                 var13 = 0;
                              }

                              var15 = var6;
                           }

                           var13 -= var15;
                        }

                        var6 = var13;
                        if(var1 == null) {
                           break;
                        }
                     }
                  }
               }

               var14 = this.field_3433;
            }

            label242: {
               if(var1 != null) {
                  label243: {
                     if(var14 == null) {
                        var14 = this;
                        if(var1 == null) {
                           break label243;
                        }

                        if(!this.method_4333()) {
                           label98: {
                              label97: {
                                 var2 = class_1715.method_9561(this.field_2994);
                                 var3 = class_1715.method_9561(this.field_2995 + 0.5D);
                                 var4 = class_1715.method_9561(this.field_2996);
                                 int var11 = this.field_3028.nextInt(6);
                                 aji var12 = this.field_2990.getBlock(var2 + class_1707.field_8947[var11], var3 + class_1707.field_8948[var11], var4 + class_1707.field_8949[var11]);
                                 var7 = this.field_2990.method_33(var2 + class_1707.field_8947[var11], var3 + class_1707.field_8948[var11], var4 + class_1707.field_8949[var11]);
                                 var19 = class_364.method_2548(var12);
                                 if(var1 != null) {
                                    if(!var19) {
                                       break label97;
                                    }

                                    this.field_2990.method_2054(var2 + class_1707.field_8947[var11], var3 + class_1707.field_8948[var11], var4 + class_1707.field_8949[var11], class_1192.field_6122, class_364.method_2549(var12, var7), 3);
                                 }

                                 this.method_4265();
                                 this.method_3851();
                                 if(var1 != null) {
                                    break label98;
                                 }
                              }

                              this.method_4329();
                           }

                           if(var1 != null) {
                              return;
                           }
                        }
                     }

                     var20 = this;
                     if(var1 == null) {
                        break label242;
                     }

                     var14 = this.field_3433;
                  }
               }

               if(var14 == null) {
                  return;
               }

               var20 = this;
            }

            if(var1 == null) {
               break label228;
            }

            var13 = var20.method_4333();
         }

         if(var13 != 0) {
            return;
         }

         var20 = this;
      }

      var20.field_3433 = null;
   }

   // $FF: renamed from: b (int, int, int) float
   public float method_4331(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      class_787 var10000 = this;
      if(var4 != null) {
         if(this.field_2990.getBlock(var1, var2 - 1, var3) == class_1192.field_6026) {
            return 10.0F;
         }

         var10000 = this;
      }

      return var10000.method_4331(var1, var2, var3);
   }

   // $FF: renamed from: a () boolean
   protected boolean method_4501() {
      return true;
   }

   // $FF: renamed from: by () boolean
   public boolean method_4274() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = super.method_4274();
      if(var1 != null) {
         if(var10000) {
            class_792 var2 = this.field_2990.method_2174(this, 5.0D);
            return var2 == null;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: bd () at
   public class_923 method_4213() {
      return class_923.field_4665;
   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      // $FF: Couldn't be decompiled
   }
}
