import java.util.Random;

// $FF: renamed from: hg
public abstract class class_1170 extends class_1162 {

   // $FF: renamed from: c int
   protected final int field_5984;
   // $FF: renamed from: d int
   protected final int field_5985;
   // $FF: renamed from: e int
   protected final int field_5986;
   // $FF: renamed from: f int
   protected int field_5987;


   // $FF: renamed from: <init> (boolean, int, int, int, int) void
   public void method_6370(boolean var1, int var2, int var3, int var4, int var5) {
      super.method_6350(var1);
      this.field_5984 = var2;
      this.field_5987 = var3;
      this.field_5985 = var4;
      this.field_5986 = var5;
   }

   // $FF: renamed from: b (java.util.Random) int
   protected int method_6371(Random var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = var1.nextInt(3) + this.field_5984;
      String[] var2 = var10000;
      int var4 = this.field_5987;
      if(var2 != null) {
         if(this.field_5987 > 1) {
            var3 += var1.nextInt(this.field_5987);
         }

         var4 = var3;
      }

      return var4;
   }

   // $FF: renamed from: a (ahb, java.util.Random, int, int, int, int) boolean
   private boolean method_6372(ahb var1, Random var2, int var3, int var4, int var5, int var6) {
      int var8 = 1;
      String[] var7 = class_752.method_4253();
      int var10000 = var4;
      if(var7 != null) {
         if(var4 >= 1) {
            label128: {
               var10000 = var4 + var6 + 1;
               if(var7 != null) {
                  if(var10000 > 256) {
                     break label128;
                  }

                  var10000 = var4;
               }

               int var9 = var10000;

               label116:
               while(true) {
                  var10000 = var9;

                  label113:
                  while(var10000 <= var4 + 1 + var6) {
                     byte var10 = 2;
                     var10000 = var9;
                     if(var7 == null) {
                        return (boolean)var10000;
                     }

                     int var10001 = var4;
                     if(var7 != null) {
                        if(var9 == var4) {
                           var10 = 1;
                        }

                        var10000 = var9;
                        var10001 = var4 + 1 + var6 - 2;
                     }

                     if(var7 != null) {
                        if(var10000 >= var10001) {
                           var10 = 2;
                        }

                        var10000 = var3;
                        var10001 = var10;
                     }

                     int var11 = var10000 - var10001;

                     label110:
                     do {
                        var10000 = var11;

                        label107:
                        while(true) {
                           if(var10000 > var3 + var10) {
                              break label110;
                           }

                           var10000 = var8;
                           if(var7 == null) {
                              continue label113;
                           }

                           if(var7 != null) {
                              if(var8 == 0) {
                                 break label110;
                              }

                              var10000 = var5 - var10;
                           }

                           int var12 = var10000;

                           while(true) {
                              if(var12 > var5 + var10) {
                                 break label107;
                              }

                              var10000 = var8;
                              if(var7 == null) {
                                 break;
                              }

                              if(var7 != null) {
                                 if(var8 == 0) {
                                    break label107;
                                 }

                                 var10000 = var9;
                              }

                              label102: {
                                 if(var7 != null) {
                                    label100: {
                                       if(var10000 >= 0) {
                                          var10000 = var9;
                                          if(var7 == null) {
                                             break label100;
                                          }

                                          if(var9 < 256) {
                                             label90: {
                                                aji var13 = var1.getBlock(var11, var9, var12);
                                                byte var14 = this.method_6362(var13);
                                                if(var7 != null) {
                                                   if(var14 != 0) {
                                                      break label90;
                                                   }

                                                   var14 = 0;
                                                }

                                                var8 = var14;
                                             }

                                             if(var7 != null) {
                                                break label102;
                                             }
                                          }
                                       }

                                       var10000 = 0;
                                    }
                                 }

                                 var8 = var10000;
                              }

                              ++var12;
                              if(var7 == null) {
                                 break label107;
                              }
                           }
                        }

                        ++var11;
                     } while(var7 != null);

                     ++var9;
                     if(var7 != null) {
                        continue label116;
                     }
                     break;
                  }

                  var10000 = var8;
                  return (boolean)var10000;
               }
            }
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: d (ahb, java.util.Random, int, int, int) boolean
   private boolean method_6373(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var6;
      label24: {
         String[] var10000 = class_752.method_4253();
         aji var7 = var1.getBlock(var3, var4 - 1, var5);
         var6 = var10000;
         aji var8 = var7;
         Object var10001 = class_1192.field_6027;
         if(var6 != null) {
            if(var7 == class_1192.field_6027) {
               break label24;
            }

            var8 = var7;
            var10001 = class_1192.field_6028;
         }

         if(var8 != var10001) {
            return false;
         }
      }

      int var9 = var4;
      if(var6 != null) {
         if(var4 < 2) {
            return false;
         }

         var1.method_2054(var3, var4 - 1, var5, class_1192.field_6028, 0, 2);
         var1.method_2054(var3 + 1, var4 - 1, var5, class_1192.field_6028, 0, 2);
         var1.method_2054(var3, var4 - 1, var5 + 1, class_1192.field_6028, 0, 2);
         var1.method_2054(var3 + 1, var4 - 1, var5 + 1, class_1192.field_6028, 0, 2);
         var9 = 1;
      }

      return (boolean)var9;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int, int) boolean
   protected boolean method_6374(ahb var1, Random var2, int var3, int var4, int var5, int var6) {
      boolean var10000;
      label24: {
         String[] var7 = class_752.method_4253();
         var10000 = this.method_6372(var1, var2, var3, var4, var5, var6);
         if(var7 != null) {
            if(!var10000) {
               break label24;
            }

            var10000 = this.method_6373(var1, var2, var3, var4, var5);
         }

         if(var7 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: b (ahb, int, int, int, int, java.util.Random) void
   protected void method_6375(ahb var1, int var2, int var3, int var4, int var5, Random var6) {
      String[] var10000 = class_752.method_4253();
      int var8 = var5 * var5;
      String[] var7 = var10000;
      int var9 = var2 - var5;

      do {
         int var16 = var9;
         int var10001 = var2 + var5 + 1;

         label70:
         while(true) {
            if(var16 > var10001) {
               return;
            }

            int var10 = var9 - var2;
            int var11 = var4 - var5;

            while(true) {
               if(var11 > var4 + var5 + 1) {
                  break label70;
               }

               int var12 = var11 - var4;
               int var13 = var10 - 1;
               int var14 = var12 - 1;
               var16 = var10 * var10 + var12 * var12;
               var10001 = var8;
               if(var7 == null) {
                  break;
               }

               label80: {
                  label81: {
                     if(var7 != null) {
                        if(var16 <= var8) {
                           break label81;
                        }

                        var16 = var13 * var13 + var14 * var14;
                        var10001 = var8;
                     }

                     if(var7 != null) {
                        if(var16 <= var10001) {
                           break label81;
                        }

                        var16 = var10 * var10 + var14 * var14;
                        var10001 = var8;
                     }

                     if(var7 != null) {
                        if(var16 <= var10001) {
                           break label81;
                        }

                        var16 = var13 * var13 + var12 * var12;
                        var10001 = var8;
                     }

                     if(var16 > var10001 && var7 != null) {
                        break label80;
                     }
                  }

                  label45: {
                     aji var15 = var1.getBlock(var9, var3, var11);
                     awt var17 = var15.method_2424();
                     awt var18 = awt.field_4170;
                     if(var7 != null) {
                        if(var17 == awt.field_4170) {
                           break label45;
                        }

                        var17 = var15.method_2424();
                        var18 = awt.field_4179;
                     }

                     if(var17 != var18) {
                        break label80;
                     }
                  }

                  this.method_6354(var1, var9, var3, var11, class_1192.field_6044, this.field_5986);
               }

               ++var11;
               if(var7 == null) {
                  break label70;
               }
            }
         }

         ++var9;
      } while(var7 != null);

   }

   // $FF: renamed from: c (ahb, int, int, int, int, java.util.Random) void
   protected void method_6376(ahb var1, int var2, int var3, int var4, int var5, Random var6) {
      int var8 = var5 * var5;
      String[] var10000 = class_752.method_4253();
      int var9 = var2 - var5;
      String[] var7 = var10000;

      do {
         int var14 = var9;
         int var10001 = var2 + var5;

         label46:
         while(true) {
            if(var14 > var10001) {
               return;
            }

            int var10 = var9 - var2;
            int var11 = var4 - var5;

            while(true) {
               if(var11 > var4 + var5) {
                  break label46;
               }

               int var12 = var11 - var4;
               var14 = var10 * var10 + var12 * var12;
               var10001 = var8;
               if(var7 == null) {
                  break;
               }

               if(var14 <= var8 || var7 == null) {
                  label57: {
                     label36: {
                        aji var13 = var1.getBlock(var9, var3, var11);
                        awt var15 = var13.method_2424();
                        awt var16 = awt.field_4170;
                        if(var7 != null) {
                           if(var15 == awt.field_4170) {
                              break label36;
                           }

                           var15 = var13.method_2424();
                           var16 = awt.field_4179;
                        }

                        if(var15 != var16) {
                           break label57;
                        }
                     }

                     this.method_6354(var1, var9, var3, var11, class_1192.field_6044, this.field_5986);
                  }
               }

               ++var11;
               if(var7 == null) {
                  break label46;
               }
            }
         }

         ++var9;
      } while(var7 != null);

   }
}
