import java.util.Random;

// $FF: renamed from: hi
public class class_1171 extends class_1170 {

   // $FF: renamed from: a boolean
   private boolean field_5988;


   // $FF: renamed from: <init> (boolean, boolean) void
   public void method_6377(boolean var1, boolean var2) {
      super.method_6370(var1, 13, 15, 1, 1);
      this.field_5988 = var2;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = this.method_6371(var2);
      String[] var6 = var10000;
      byte var10 = this.method_6374(var1, var2, var3, var4, var5, var7);
      if(var6 != null) {
         if(var10 == 0) {
            return false;
         }

         this.method_6378(var1, var3, var5, var4 + var7, 0, var2);
         var10 = 0;
      }

      int var8 = var10;

      while(var8 < var7) {
         aji var9;
         awt var11;
         awt var10001;
         label87: {
            label86: {
               var9 = var1.getBlock(var3, var4 + var8, var5);
               var11 = var9.method_2424();
               var10001 = awt.field_4170;
               if(var6 != null) {
                  if(var11 == awt.field_4170) {
                     break label86;
                  }

                  var11 = var9.method_2424();
                  var10001 = awt.field_4179;
               }

               if(var11 != var10001) {
                  break label87;
               }
            }

            this.method_6354(var1, var3, var4 + var8, var5, class_1192.field_6042, this.field_5985);
         }

         if(var8 < var7 - 1) {
            label95: {
               label76: {
                  label75: {
                     label96: {
                        var9 = var1.getBlock(var3 + 1, var4 + var8, var5);
                        var11 = var9.method_2424();
                        var10001 = awt.field_4170;
                        if(var6 != null) {
                           if(var11 == awt.field_4170) {
                              break label96;
                           }

                           var11 = var9.method_2424();
                           var10001 = awt.field_4179;
                        }

                        if(var6 == null) {
                           break label76;
                        }

                        if(var11 != var10001) {
                           break label75;
                        }
                     }

                     this.method_6354(var1, var3 + 1, var4 + var8, var5, class_1192.field_6042, this.field_5985);
                  }

                  var9 = var1.getBlock(var3 + 1, var4 + var8, var5 + 1);
                  var11 = var9.method_2424();
                  var10001 = awt.field_4170;
               }

               label63: {
                  label62: {
                     label97: {
                        if(var6 != null) {
                           if(var11 == var10001) {
                              break label97;
                           }

                           var11 = var9.method_2424();
                           var10001 = awt.field_4179;
                        }

                        if(var6 == null) {
                           break label63;
                        }

                        if(var11 != var10001) {
                           break label62;
                        }
                     }

                     this.method_6354(var1, var3 + 1, var4 + var8, var5 + 1, class_1192.field_6042, this.field_5985);
                  }

                  var9 = var1.getBlock(var3, var4 + var8, var5 + 1);
                  var11 = var9.method_2424();
                  var10001 = awt.field_4170;
               }

               label50: {
                  if(var6 != null) {
                     if(var11 == var10001) {
                        break label50;
                     }

                     var11 = var9.method_2424();
                     var10001 = awt.field_4179;
                  }

                  if(var11 != var10001) {
                     break label95;
                  }
               }

               this.method_6354(var1, var3, var4 + var8, var5 + 1, class_1192.field_6042, this.field_5985);
            }
         }

         ++var8;
         if(var6 == null) {
            break;
         }
      }

      return true;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, java.util.Random) void
   private void method_6378(ahb var1, int var2, int var3, int var4, int var5, Random var6) {
      String[] var7;
      int var8;
      label54: {
         label53: {
            var8 = var6.nextInt(5);
            var7 = class_752.method_4253();
            int var10000 = this.field_5988;
            if(var7 != null) {
               if(!this.field_5988) {
                  break label53;
               }

               var10000 = var8 + this.field_5984;
            }

            var8 = var10000;
            if(var7 != null) {
               break label54;
            }
         }

         var8 += 3;
      }

      int var9 = 0;
      int var10 = var4 - var8;

      while(var10 <= var4) {
         int var12;
         int var10006;
         label41: {
            label58: {
               int var11 = var4 - var10;
               var12 = var5 + class_1715.method_9559((float)var11 / (float)var8 * 3.5F);
               var10006 = var11;
               if(var7 != null) {
                  if(var11 <= 0) {
                     break label58;
                  }

                  var10006 = var12;
               }

               int var10007 = var9;
               if(var7 != null) {
                  if(var10006 != var9) {
                     break label58;
                  }

                  var10006 = var10;
                  var10007 = 1;
               }

               var10006 &= var10007;
               if(var7 == null) {
                  break label41;
               }

               if(var10006 == 0) {
                  var10006 = 1;
                  break label41;
               }
            }

            var10006 = 0;
         }

         this.method_6375(var1, var2, var10, var3, var12 + var10006, var6);
         var9 = var12;
         ++var10;
         if(var7 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (ahb, java.util.Random, int, int, int) void
   public void method_6363(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      this.method_6379(var1, var2, var3 - 1, var4, var5 - 1);
      this.method_6379(var1, var2, var3 + 2, var4, var5 - 1);
      this.method_6379(var1, var2, var3 - 1, var4, var5 + 2);
      String[] var6 = var10000;
      this.method_6379(var1, var2, var3 + 2, var4, var5 + 2);
      int var7 = 0;

      while(var7 < 5) {
         label39: {
            int var9;
            int var10;
            label47: {
               int var8 = var2.nextInt(64);
               var9 = var8 % 8;
               var10 = var8 / 8;
               int var11 = var9;
               if(var6 != null) {
                  if(var9 == 0) {
                     break label47;
                  }

                  var11 = var9;
               }

               if(var6 != null) {
                  if(var11 == 7) {
                     break label47;
                  }

                  var11 = var10;
               }

               if(var6 != null) {
                  if(var11 == 0) {
                     break label47;
                  }

                  var11 = var10;
               }

               if(var11 != 7) {
                  break label39;
               }
            }

            this.method_6379(var1, var2, var3 - 3 + var9, var4, var5 - 3 + var10);
         }

         ++var7;
         if(var6 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: e (ahb, java.util.Random, int, int, int) void
   private void method_6379(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = -2;
      String[] var6 = var10000;

      do {
         int var9 = var7;
         byte var10001 = 2;

         label40:
         while(true) {
            if(var9 > var10001) {
               return;
            }

            int var8 = -2;

            while(true) {
               if(var8 > 2) {
                  break label40;
               }

               var9 = Math.abs(var7);
               var10001 = 2;
               if(var6 == null) {
                  break;
               }

               label35: {
                  label34: {
                     if(var6 != null) {
                        if(var9 != 2) {
                           break label34;
                        }

                        var9 = Math.abs(var8);
                        var10001 = 2;
                     }

                     if(var9 == var10001) {
                        break label35;
                     }
                  }

                  this.method_6380(var1, var3 + var7, var4, var5 + var8);
               }

               ++var8;
               if(var6 == null) {
                  break label40;
               }
            }
         }

         ++var7;
      } while(var6 != null);

   }

   // $FF: renamed from: b (ahb, int, int, int) void
   private void method_6380(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var3 + 2;
      String[] var5 = var10000;

      while(var6 >= var3 - 3) {
         aji var8;
         label35: {
            aji var7;
            label34: {
               var7 = var1.getBlock(var2, var6, var4);
               if(var5 != null) {
                  if(var7 != class_1192.field_6027) {
                     var8 = var7;
                     if(var5 == null) {
                        break label35;
                     }

                     if(var7 != class_1192.field_6028) {
                        break label34;
                     }
                  }

                  this.method_6354(var1, var2, var6, var4, class_1192.field_6028, 2);
               }

               if(var5 != null) {
                  break;
               }
            }

            var8 = var7;
         }

         if(var8.method_2424() != awt.field_4170 && var6 < var3 && var5 != null) {
            break;
         }

         --var6;
         if(var5 == null) {
            break;
         }
      }

   }
}
