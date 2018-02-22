
// $FF: renamed from: bu
public class class_563 extends ItemBlock {

   // $FF: renamed from: n boolean
   private final boolean field_2439;
   // $FF: renamed from: o fa
   private final class_378 field_2440;
   // $FF: renamed from: p fa
   private final class_378 field_2441;


   // $FF: renamed from: <init> (aji, fa, fa, boolean) void
   public void getBlock54(aji var1, class_378 var2, class_378 var3, boolean var4) {
      super.getBlock51(var1);
      this.field_2440 = var2;
      this.field_2441 = var3;
      this.field_2439 = var4;
      this.method_2935(0);
      this.method_2933(true);
   }

   // $FF: renamed from: b_ (int) vL
   public IIcon getIconFromDamage(int var1) {
      return aji.method_2417(this).method_2448(2, var1);
   }

   // $FF: renamed from: a (int) int
   public int method_2931(int var1) {
      return var1;
   }

   // $FF: renamed from: a (add) java.lang.String
   public String getUnlocalizedName(add var1) {
      return this.field_2440.method_2585(var1.method_3745());
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var11 = class_752.method_4253();
      int var10000 = this.field_2439;
      if(var11 != null) {
         if(this.field_2439) {
            return super.method_2926(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
         }

         var10000 = var1.field_2958;
      }

      if(var11 != null) {
         if(var10000 == 0) {
            return false;
         }

         var10000 = var2.method_4628(var4, var5, var6, var7, var1);
      }

      if(var11 != null) {
         if(var10000 != 0) {
            aji var12 = var3.getBlock(var4, var5, var6);
            int var13 = var3.method_33(var4, var5, var6);
            int var14 = var13 & 7;
            var10000 = var13 & 8;
            if(var11 != null) {
               var10000 = var10000 != 0?1:0;
            }

            label88: {
               label87: {
                  label100: {
                     int var15 = var10000;
                     var10000 = var7;
                     if(var11 != null) {
                        label84: {
                           if(var7 == 1) {
                              var10000 = var15;
                              if(var11 == null) {
                                 break label84;
                              }

                              if(var15 == 0) {
                                 break label100;
                              }
                           }

                           var10000 = var7;
                        }
                     }

                     if(var11 == null) {
                        break label88;
                     }

                     if(var10000 != 0) {
                        break label87;
                     }

                     var10000 = var15;
                     if(var11 == null) {
                        break label88;
                     }

                     if(var15 == 0) {
                        break label87;
                     }
                  }

                  if(var12 == this.field_2440) {
                     var10000 = var14;
                     if(var11 == null) {
                        break label88;
                     }

                     if(var14 == var1.method_3745()) {
                        boolean var16 = var3.method_2117(this.field_2441.method_2452(var3, var4, var5, var6));
                        if(var11 != null) {
                           if(var16) {
                              var16 = var3.method_2054(var4, var5, var6, this.field_2441, var14, 3);
                              if(var11 == null) {
                                 return var16;
                              }

                              if(var16) {
                                 var3.method_2084((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.field_2441.field_2005.method_5996(), (this.field_2441.field_2005.method_5992() + 1.0F) / 2.0F, this.field_2441.field_2005.method_5993() * 0.8F);
                                 --var1.field_2958;
                              }
                           }

                           var16 = true;
                        }

                        return var16;
                     }
                  }
               }

               var10000 = this.getBlock55(var1, var2, var3, var4, var5, var6, var7);
            }

            if(var11 != null) {
               if(var10000 != 0) {
                  return true;
               }

               var10000 = super.method_2926(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
            }

            return (boolean)var10000;
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, yz, add) boolean
   public boolean getBlock53(ahb var1, int var2, int var3, int var4, int var5, class_792 var6, add var7) {
      int var9 = var2;
      int var10 = var3;
      int var11 = var4;
      String[] var10000 = class_752.method_4253();
      aji var12 = var1.getBlock(var2, var3, var4);
      String[] var8 = var10000;
      int var13 = var1.method_33(var2, var3, var4);
      int var14 = var13 & 7;
      int var18 = var13 & 8;
      if(var8 != null) {
         var18 = var18 != 0?1:0;
      }

      label107: {
         label106: {
            label111: {
               int var15 = var18;
               var18 = var5;
               if(var8 != null) {
                  label103: {
                     if(var5 == 1) {
                        var18 = var15;
                        if(var8 == null) {
                           break label103;
                        }

                        if(var15 == 0) {
                           break label111;
                        }
                     }

                     var18 = var5;
                  }
               }

               if(var8 == null) {
                  break label107;
               }

               if(var18 != 0) {
                  break label106;
               }

               var18 = var15;
               if(var8 == null) {
                  break label107;
               }

               if(var15 == 0) {
                  break label106;
               }
            }

            if(var12 == this.field_2440) {
               var18 = var14;
               if(var8 == null) {
                  break label107;
               }

               if(var14 == var7.method_3745()) {
                  return true;
               }
            }
         }

         var18 = var5;
      }

      if(var8 != null) {
         if(var18 == 0) {
            --var3;
         }

         var18 = var5;
      }

      byte var10001 = 1;
      if(var8 != null) {
         if(var18 == 1) {
            ++var3;
         }

         var18 = var5;
         var10001 = 2;
      }

      if(var8 != null) {
         if(var18 == var10001) {
            --var4;
         }

         var18 = var5;
         var10001 = 3;
      }

      if(var8 != null) {
         if(var18 == var10001) {
            ++var4;
         }

         var18 = var5;
         var10001 = 4;
      }

      if(var8 != null) {
         if(var18 == var10001) {
            --var2;
         }

         var18 = var5;
         var10001 = 5;
      }

      if(var18 == var10001) {
         ++var2;
      }

      aji var16 = var1.getBlock(var2, var3, var4);
      int var17 = var1.method_33(var2, var3, var4);
      var18 = var17 & 7;
      if(var8 != null) {
         var14 = var18;
         if(var16 == this.field_2440) {
            var18 = var14;
            if(var8 == null) {
               return (boolean)var18;
            }

            if(var14 == var7.method_3745()) {
               return true;
            }
         }

         var18 = super.getBlock53(var1, var9, var10, var11, var5, var6, var7);
      }

      return (boolean)var18;
   }

   // $FF: renamed from: b (add, yz, ahb, int, int, int, int) boolean
   private boolean getBlock55(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7) {
      String[] var8 = class_752.method_4253();
      int var10000 = var7;
      if(var8 != null) {
         if(var7 == 0) {
            --var5;
         }

         var10000 = var7;
      }

      byte var10001 = 1;
      if(var8 != null) {
         if(var10000 == 1) {
            ++var5;
         }

         var10000 = var7;
         var10001 = 2;
      }

      if(var8 != null) {
         if(var10000 == var10001) {
            --var6;
         }

         var10000 = var7;
         var10001 = 3;
      }

      if(var8 != null) {
         if(var10000 == var10001) {
            ++var6;
         }

         var10000 = var7;
         var10001 = 4;
      }

      if(var8 != null) {
         if(var10000 == var10001) {
            --var4;
         }

         var10000 = var7;
         var10001 = 5;
      }

      if(var10000 == var10001) {
         ++var4;
      }

      aji var9 = var3.getBlock(var4, var5, var6);
      int var10 = var3.method_33(var4, var5, var6);
      int var11 = var10 & 7;
      if(var9 == this.field_2440) {
         var10000 = var11;
         if(var8 == null) {
            return (boolean)var10000;
         }

         if(var11 == var1.method_3745()) {
            boolean var12 = var3.method_2117(this.field_2441.method_2452(var3, var4, var5, var6));
            if(var8 != null) {
               if(var12) {
                  var12 = var3.method_2054(var4, var5, var6, this.field_2441, var11, 3);
                  if(var8 == null) {
                     return var12;
                  }

                  if(var12) {
                     var3.method_2084((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.field_2441.field_2005.method_5996(), (this.field_2441.field_2005.method_5992() + 1.0F) / 2.0F, this.field_2441.field_2005.method_5993() * 0.8F);
                     --var1.field_2958;
                  }
               }

               var12 = true;
            }

            return var12;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }
}
