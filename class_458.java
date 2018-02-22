import java.util.Random;

// $FF: renamed from: eA
public class class_458 extends class_446 implements class_27 {

   // $FF: renamed from: <init> () void
   protected void method_2770() {
      super.method_2770();
      float var1 = 0.2F;
      this.method_2443(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, var1 * 2.0F, 0.5F + var1);
      this.method_2440(true);
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5.nextInt(25);
      if(var6 != null) {
         if(var10000 != 0) {
            return;
         }

         var10000 = 4;
      }

      int var7 = var10000;
      int var8 = 5;
      int var9 = var2 - var7;

      int var10;
      int var11;
      label108:
      while(true) {
         var10000 = var9;

         label105:
         while(var10000 <= var2 + var7) {
            var10000 = var4 - var7;
            if(var6 == null) {
               break label108;
            }

            var10 = var10000;

            while(var10 <= var4 + var7) {
               var10000 = var3 - 1;
               if(var6 == null) {
                  continue label105;
               }

               var11 = var10000;

               while(true) {
                  if(var11 <= var3 + 1) {
                     if(var6 == null) {
                        break;
                     }

                     label94: {
                        if(var1.getBlock(var9, var11, var10) == this) {
                           --var8;
                           if(var6 == null) {
                              break label94;
                           }

                           if(var8 <= 0) {
                              return;
                           }
                        }

                        ++var11;
                     }

                     if(var6 != null) {
                        continue;
                     }
                  }

                  ++var10;
                  break;
               }

               if(var6 == null) {
                  break;
               }
            }

            ++var9;
            if(var6 != null) {
               continue label108;
            }
            break;
         }

         var9 = var2 + var5.nextInt(3) - 1;
         var10000 = var3 + var5.nextInt(2) - var5.nextInt(2);
         break;
      }

      var10 = var10000;
      var11 = var4 + var5.nextInt(3) - 1;
      int var12 = 0;

      while(true) {
         if(var12 < 4) {
            var10000 = var1.method_34(var9, var10, var11);
            if(var6 == null) {
               break;
            }

            if(var6 != null) {
               label65: {
                  if(var10000 != 0) {
                     var10000 = this.method_2505(var1, var9, var10, var11);
                     if(var6 == null) {
                        break label65;
                     }

                     if(var10000 != 0) {
                        var2 = var9;
                        var3 = var10;
                        var4 = var11;
                     }
                  }

                  var9 = var2 + var5.nextInt(3) - 1;
                  var10 = var3 + var5.nextInt(2) - var5.nextInt(2);
                  var10000 = var4 + var5.nextInt(3) - 1;
               }
            }

            var11 = var10000;
            ++var12;
            if(var6 != null) {
               continue;
            }
         }

         var10000 = var1.method_34(var9, var10, var11);
         break;
      }

      if(var6 != null) {
         if(var10000 == 0) {
            return;
         }

         var10000 = this.method_2505(var1, var9, var10, var11);
      }

      if(var6 != null && var10000 != 0) {
         var1.method_2054(var9, var10, var11, this, 0, 2);
      }

   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      boolean var10000;
      label24: {
         String[] var5 = class_752.method_4253();
         var10000 = super.method_2480(var1, var2, var3, var4);
         if(var5 != null) {
            if(!var10000) {
               break label24;
            }

            var10000 = this.method_2505(var1, var2, var3, var4);
         }

         if(var5 == null) {
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

   // $FF: renamed from: d (aji) boolean
   protected boolean method_2771(aji var1) {
      return var1.method_2419();
   }

   // $FF: renamed from: j (ahb, int, int, int) boolean
   public boolean method_2505(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = var3;
      if(var5 != null) {
         if(var3 >= 0) {
            var10000 = var3;
            if(var5 == null) {
               return (boolean)var10000;
            }

            if(var3 < 256) {
               label69: {
                  aji var6 = var1.getBlock(var2, var3 - 1, var4);
                  aji var7 = var6;
                  Object var10001 = class_1192.field_6135;
                  if(var5 != null) {
                     if(var6 == class_1192.field_6135) {
                        break label69;
                     }

                     var7 = var6;
                     var10001 = class_1192.field_6028;
                  }

                  if(var7 == var10001) {
                     var10000 = var1.method_33(var2, var3 - 1, var4);
                     if(var5 == null) {
                        return (boolean)var10000;
                     }

                     if(var10000 == 2) {
                        break label69;
                     }
                  }

                  label58: {
                     var10000 = var1.method_2068(var2, var3, var4);
                     if(var5 != null) {
                        if(var10000 >= 13) {
                           break label58;
                        }

                        var10000 = this.method_2771(var6);
                     }

                     if(var5 == null) {
                        return (boolean)var10000;
                     }

                     if(var10000 != 0) {
                        break label69;
                     }
                  }

                  var10000 = 0;
                  return (boolean)var10000;
               }

               var10000 = 1;
               return (boolean)var10000;
            }
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: d (ahb, int, int, int, java.util.Random) boolean
   public boolean method_2794(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6;
      int var7;
      class_1190 var8;
      class_1190 var10;
      label35: {
         var7 = var1.method_33(var2, var3, var4);
         String[] var10000 = class_752.method_4253();
         var1.method_2056(var2, var3, var4);
         var6 = var10000;
         var8 = null;
         class_458 var9 = this;
         class_446 var10001 = class_1192.field_6066;
         if(var6 != null) {
            if(this == class_1192.field_6066) {
               var10 = new class_1190;
               var10.method_6408(0);
               var8 = var10;
               break label35;
            }

            var9 = this;
            var10001 = class_1192.field_6067;
         }

         if(var9 == var10001) {
            var10 = new class_1190;
            var10.method_6408(1);
            var8 = var10;
         }
      }

      label38: {
         var10 = var8;
         if(var6 != null) {
            if(var8 == null) {
               break label38;
            }

            var10 = var8;
         }

         boolean var11 = var10.method_6351(var1, var5, var2, var3, var4);
         if(var6 != null) {
            if(!var11) {
               break label38;
            }

            var11 = true;
         }

         return var11;
      }

      var1.method_2054(var2, var3, var4, this, var7, 3);
      return false;
   }

   // $FF: renamed from: b (ahb, int, int, int, boolean) boolean
   public boolean method_121(ahb var1, int var2, int var3, int var4, boolean var5) {
      return true;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_122(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      double var7;
      int var10000 = (var7 = (double)var2.nextFloat() - 0.4D) == 0.0D?0:(var7 < 0.0D?-1:1);
      if(var6 != null) {
         var10000 = var10000 < 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c (ahb, java.util.Random, int, int, int) void
   public void method_123(ahb var1, Random var2, int var3, int var4, int var5) {
      this.method_2794(var1, var3, var4, var5, var2);
   }
}
