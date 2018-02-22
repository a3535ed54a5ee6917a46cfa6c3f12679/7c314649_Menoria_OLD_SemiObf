import java.util.List;
import java.util.Random;

public class bkn {

   // $FF: renamed from: b bqx
   private static final bqx field_6803;
   // $FF: renamed from: a ahb
   protected ahb field_6804;
   // $FF: renamed from: c java.util.List[]
   private List[] field_6805;
   // $FF: renamed from: d bqf
   private bqf field_6806;
   // $FF: renamed from: e java.util.Random
   private Random field_6807;
   private static final String __OBFID;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6808;


   // $FF: renamed from: <init> (ahb, bqf) void
   public void method_6967(ahb param1, bqf param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (v7) void
   public void method_6968(class_716 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () void
   public void method_6969() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (sa, float) void
   public void method_6970(class_689 param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sa, float) void
   public void method_6971(class_689 var1, float var2) {
      float var4 = 0.017453292F;
      float var5 = class_1715.method_9556(var1.field_3000 * 0.017453292F);
      float var6 = class_1715.method_9555(var1.field_3000 * 0.017453292F);
      float var7 = -var6 * class_1715.method_9555(var1.field_3001 * 0.017453292F);
      float var8 = var5 * class_1715.method_9555(var1.field_3001 * 0.017453292F);
      String[] var10000 = class_752.method_4253();
      float var9 = class_1715.method_9556(var1.field_3001 * 0.017453292F);
      String[] var3 = var10000;
      byte var10 = 3;
      List var11 = this.field_6805[var10];
      if(!var11.isEmpty()) {
         bmh var12 = bmh.instance;
         int var13 = 0;

         while(var13 < var11.size()) {
            class_716 var14 = (class_716)var11.get(var13);
            var12.setVisible5(var14.method_3883(var2));
            var14.method_4101(var12, var2, var5, var9, var6, var7, var8);
            ++var13;
            if(var3 == null) {
               break;
            }
         }
      }

   }

   // $FF: renamed from: a (ahb) void
   public void method_6972(ahb var1) {
      String[] var10000 = class_752.method_4253();
      this.field_6804 = var1;
      String[] var2 = var10000;
      int var3 = 0;

      while(var3 < 4) {
         this.field_6805[var3].clear();
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (int, int, int, aji, int) void
   public void method_6973(int var1, int var2, int var3, aji var4, int var5) {
      String[] var6 = class_752.method_4253();
      if(var4.method_2424() != awt.field_4170) {
         byte var7 = 4;
         int var8 = 0;

         do {
            int var10000 = var8;

            label48:
            while(true) {
               if(var10000 >= var7) {
                  return;
               }

               int var9 = 0;

               while(true) {
                  if(var9 >= var7) {
                     break label48;
                  }

                  var10000 = 0;
                  if(var6 == null) {
                     break;
                  }

                  int var10 = 0;

                  while(true) {
                     if(var10 < var7) {
                        double var11 = (double)var1 + ((double)var8 + 0.5D) / (double)var7;
                        double var13 = (double)var2 + ((double)var9 + 0.5D) / (double)var7;
                        double var15 = (double)var3 + ((double)var10 + 0.5D) / (double)var7;

                        try {
                           class_718 var10001 = new class_718;
                           var10001.method_4108(this.field_6804, var11, var13, var15, var11 - (double)var1 - 0.5D, var13 - (double)var2 - 0.5D, var15 - (double)var3 - 0.5D, var4, var5);
                           this.method_6968(var10001.method_4109(var1, var2, var3));
                           ++var10;
                           if(var6 == null) {
                              break;
                           }

                           if(var6 != null) {
                              continue;
                           }
                        } catch (class_643 var17) {
                           throw method_6977(var17);
                        }
                     }

                     ++var9;
                     break;
                  }

                  if(var6 == null) {
                     break label48;
                  }
               }
            }

            ++var8;
         } while(var6 != null);
      }

   }

   // $FF: renamed from: a (int, int, int, int) void
   public void method_6974(int var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      aji var6 = this.field_6804.getBlock(var1, var2, var3);
      String[] var5 = var10000;
      if(var6.method_2424() != awt.field_4170) {
         float var7 = 0.1F;
         double var8 = (double)var1 + this.field_6807.nextDouble() * (var6.method_2488() - var6.method_2487() - (double)(var7 * 2.0F)) + (double)var7 + var6.method_2487();
         double var10 = (double)var2 + this.field_6807.nextDouble() * (var6.method_2490() - var6.method_2489() - (double)(var7 * 2.0F)) + (double)var7 + var6.method_2489();
         double var12 = (double)var3 + this.field_6807.nextDouble() * (var6.method_2492() - var6.method_2491() - (double)(var7 * 2.0F)) + (double)var7 + var6.method_2491();

         int var20;
         label103: {
            label102: {
               try {
                  var20 = var4;
                  if(var5 == null) {
                     break label103;
                  }

                  if(var4 != 0) {
                     break label102;
                  }
               } catch (class_643 var19) {
                  throw method_6977(var19);
               }

               var10 = (double)var2 + var6.method_2489() - (double)var7;
            }

            var20 = var4;
         }

         byte var10001;
         label94: {
            label93: {
               try {
                  var10001 = 1;
                  if(var5 == null) {
                     break label94;
                  }

                  if(var20 != 1) {
                     break label93;
                  }
               } catch (class_643 var18) {
                  throw method_6977(var18);
               }

               var10 = (double)var2 + var6.method_2490() + (double)var7;
            }

            var20 = var4;
            var10001 = 2;
         }

         label85: {
            label84: {
               try {
                  if(var5 == null) {
                     break label85;
                  }

                  if(var20 != var10001) {
                     break label84;
                  }
               } catch (class_643 var17) {
                  throw method_6977(var17);
               }

               var12 = (double)var3 + var6.method_2491() - (double)var7;
            }

            var20 = var4;
            var10001 = 3;
         }

         label76: {
            label75: {
               try {
                  if(var5 == null) {
                     break label76;
                  }

                  if(var20 != var10001) {
                     break label75;
                  }
               } catch (class_643 var16) {
                  throw method_6977(var16);
               }

               var12 = (double)var3 + var6.method_2492() + (double)var7;
            }

            var20 = var4;
            var10001 = 4;
         }

         label67: {
            label109: {
               label65: {
                  label64: {
                     try {
                        if(var5 == null) {
                           break label65;
                        }

                        if(var20 != var10001) {
                           break label64;
                        }
                     } catch (class_643 var15) {
                        throw method_6977(var15);
                     }

                     var8 = (double)var1 + var6.method_2487() - (double)var7;
                  }

                  try {
                     var20 = var4;
                     if(var5 == null) {
                        break label109;
                     }

                     var10001 = 5;
                  } catch (class_643 var14) {
                     throw method_6977(var14);
                  }
               }

               if(var20 != var10001) {
                  break label67;
               }

               var20 = var1;
            }

            var8 = (double)var20 + var6.method_2488() + (double)var7;
         }

         class_718 var21 = new class_718;
         var21.method_4108(this.field_6804, var8, var10, var12, 0.0D, 0.0D, 0.0D, var6, this.field_6804.method_33(var1, var2, var3));
         this.method_6968(var21.method_4109(var1, var2, var3).method_4094(0.2F).method_4095(0.6F));
      }

   }

   // $FF: renamed from: b () java.lang.String
   public String method_6975() {
      return "" + (this.field_6805[0].size() + this.field_6805[1].size() + this.field_6805[2].size());
   }

   // $FF: renamed from: <clinit> () void
   static void method_6976() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_6977(Throwable var0) {
      return var0;
   }
}
