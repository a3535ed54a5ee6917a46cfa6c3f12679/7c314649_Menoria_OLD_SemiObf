import org.apache.commons.lang3.StringUtils;

// $FF: renamed from: yW
public abstract class class_1766 extends class_1727 {

   // $FF: renamed from: a wI
   protected class_761 field_9236;
   // $FF: renamed from: c boolean
   protected boolean field_9237;
   // $FF: renamed from: d boolean
   private boolean field_9238;
   // $FF: renamed from: e int
   private int field_9239;
   // $FF: renamed from: f int
   private int field_9240;
   // $FF: renamed from: g int
   private int field_9241;


   // $FF: renamed from: <init> (wI, boolean) void
   public void method_9732(class_761 var1, boolean var2) {
      this.method_9733(var1, var2, false);
   }

   // $FF: renamed from: <init> (wI, boolean, boolean) void
   public void method_9733(class_761 var1, boolean var2, boolean var3) {
      super.method_9648();
      this.field_9236 = var1;
      this.field_9237 = var2;
      this.field_9238 = var3;
   }

   // $FF: renamed from: c () boolean
   public boolean method_9650() {
      String[] var10000 = class_752.method_4253();
      class_752 var2 = this.field_9236.method_4259();
      String[] var1 = var10000;
      class_752 var5 = var2;
      if(var1 != null) {
         if(var2 == null) {
            return false;
         }

         var5 = var2;
      }

      boolean var6 = var5.method_3917();
      if(var1 != null) {
         if(var6) {
            double var3 = this.method_9734();
            double var8;
            int var7 = (var8 = this.field_9236.method_3891(var2) - var3 * var3) == 0.0D?0:(var8 < 0.0D?-1:1);
            if(var1 != null) {
               if(var7 > 0) {
                  return false;
               }

               var7 = this.field_9237;
            }

            if(var1 != null) {
               label58: {
                  if(var7 != 0) {
                     label69: {
                        var7 = this.field_9236.method_4258().method_9814(var2);
                        if(var1 != null) {
                           if(var7 != 0) {
                              this.field_9241 = 0;
                              if(var1 != null) {
                                 break label69;
                              }
                           }

                           var7 = ++this.field_9241;
                        }

                        if(var1 == null) {
                           break label58;
                        }

                        if(var7 > 60) {
                           return false;
                        }
                     }
                  }

                  var7 = var2 instanceof class_793;
               }
            }

            if(var1 != null) {
               if(var7 != 0) {
                  var7 = ((class_793)var2).field_3656.method_9201();
                  if(var1 == null) {
                     return (boolean)var7;
                  }

                  if(var7 != 0) {
                     return false;
                  }
               }

               var7 = 1;
            }

            return (boolean)var7;
         }

         var6 = false;
      }

      return var6;
   }

   // $FF: renamed from: a () double
   protected double method_9734() {
      String[] var10000 = class_752.method_4253();
      class_80 var2 = this.field_9236.method_4211(class_1840.field_9391);
      String[] var1 = var10000;
      class_80 var3 = var2;
      double var4;
      if(var1 != null) {
         if(var2 == null) {
            var4 = 16.0D;
            return var4;
         }

         var3 = var2;
      }

      var4 = var3.method_396();
      return var4;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9239 = 0;
      this.field_9240 = 0;
      this.field_9241 = 0;
   }

   // $FF: renamed from: f () void
   public void method_9653() {
      this.field_9236.method_4260((class_752)null);
   }

   // $FF: renamed from: b (sv, boolean) boolean
   protected boolean method_9735(class_752 var1, boolean var2) {
      String[] var3 = class_752.method_4253();
      class_752 var10000 = var1;
      if(var3 != null) {
         if(var1 == null) {
            return false;
         }

         var10000 = var1;
      }

      if(var3 != null) {
         if(var10000 == this.field_9236) {
            return false;
         }

         var10000 = var1;
      }

      int var4 = var10000.method_3917();
      if(var3 != null) {
         if(var4 == 0) {
            return false;
         }

         var4 = this.field_9236.method_4261(var1.getClass());
      }

      if(var3 != null) {
         if(var4 == 0) {
            return false;
         }

         var4 = this.field_9236 instanceof class_78;
      }

      label142: {
         label151: {
            if(var3 != null) {
               label139: {
                  if(var4 != 0) {
                     var4 = StringUtils.isNotEmpty(((class_78)this.field_9236).method_382());
                     if(var3 == null) {
                        break label139;
                     }

                     if(var4 != 0) {
                        Object var5 = var1;
                        if(var3 != null) {
                           label121: {
                              if(var1 instanceof class_78) {
                                 var5 = this.field_9236;
                                 if(var3 == null) {
                                    break label121;
                                 }

                                 if(((class_78)this.field_9236).method_382().equals(((class_78)var1).method_382())) {
                                    return false;
                                 }
                              }

                              var5 = var1;
                           }
                        }

                        if(var5 == ((class_78)this.field_9236).method_383()) {
                           return false;
                        }
                        break label151;
                     }
                  }

                  var4 = var1 instanceof class_792;
               }
            }

            if(var3 == null) {
               break label142;
            }

            if(var4 != 0) {
               var4 = var2;
               if(var3 == null) {
                  break label142;
               }

               if(var2 == 0) {
                  var4 = ((class_792)var1).field_3640.field_2836;
                  if(var3 == null) {
                     break label142;
                  }

                  if(((class_792)var1).field_3640.field_2836) {
                     return false;
                  }
               }
            }
         }

         var4 = this.field_9236.method_4338(class_1715.method_9561(var1.field_2994), class_1715.method_9561(var1.field_2995), class_1715.method_9561(var1.field_2996));
      }

      if(var3 != null) {
         if(var4 == 0) {
            return false;
         }

         var4 = this.field_9237;
      }

      if(var3 != null) {
         label113: {
            if(var4 != 0) {
               var4 = this.field_9236.method_4258().method_9814(var1);
               if(var3 == null) {
                  break label113;
               }

               if(var4 == 0) {
                  return false;
               }
            }

            var4 = this.field_9238;
         }
      }

      if(var3 != null) {
         if(var4 != 0) {
            var4 = --this.field_9240;
            if(var3 != null) {
               if(var4 <= 0) {
                  this.field_9239 = 0;
               }

               var4 = this.field_9239;
            }

            if(var3 != null) {
               if(var4 == 0) {
                  int var10001 = this.method_9736(var1);
                  if(var3 != null) {
                     var10001 = var10001 != 0?1:2;
                  }

                  this.field_9239 = var10001;
               }

               var4 = this.field_9239;
            }

            if(var3 == null) {
               return (boolean)var4;
            }

            if(var4 == 2) {
               return false;
            }
         }

         var4 = 1;
      }

      return (boolean)var4;
   }

   // $FF: renamed from: b (sv) boolean
   private boolean method_9736(class_752 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_9240 = 10 + this.field_9236.method_4165().nextInt(5);
      String[] var2 = var10000;
      class_1289 var3 = this.field_9236.method_4257().method_9795(var1);
      class_1289 var7 = var3;
      if(var2 != null) {
         if(var3 == null) {
            return false;
         }

         var7 = var3;
      }

      class_1288 var4 = var7.method_6742();
      class_1288 var8 = var4;
      if(var2 != null) {
         if(var4 == null) {
            return false;
         }

         var8 = var4;
      }

      int var5 = var8.field_6599 - class_1715.method_9561(var1.field_2994);
      int var6 = var4.field_6601 - class_1715.method_9561(var1.field_2996);
      double var10;
      int var9 = (var10 = (double)(var5 * var5 + var6 * var6) - 2.25D) == 0.0D?0:(var10 < 0.0D?-1:1);
      if(var2 != null) {
         var9 = var9 <= 0?1:0;
      }

      return (boolean)var9;
   }
}
