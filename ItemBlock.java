import java.util.List;

public class ItemBlock extends Item {

   // $FF: renamed from: a Block
   protected final Block blockInstance;
   // $FF: renamed from: b vL
   private IIcon field_2438;
   private static final String __OBFID = "CL_00001772";


   // $FF: renamed from: <init> (Block) void
   public void getBlock51(Block var1) {
      super.method_2917();
      this.blockInstance = var1;
   }

   // $FF: renamed from: b (java.lang.String) abh
   public ItemBlock setUnlocalizedName(String var1) {
      super.setUnlocalizedName(var1);
      return this;
   }

   // $FF: renamed from: d () int
   public int getSpriteNumber() {
      return this.blockInstance.getItemIconName() != null?1:0;
   }

   // $FF: renamed from: b_ (int) vL
   public IIcon getIconFromDamage(int var1) {
      String[] var2 = class_752.method_4253();
      ItemBlock var10000 = this;
      IIcon var3;
      if(var2 != null) {
         if(this.field_2438 != null) {
            var3 = this.field_2438;
            return var3;
         }

         var10000 = this;
      }

      var3 = var10000.blockInstance.getBlockTextureFromSide(1);
      return var3;
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var11;
      int var16;
      label148: {
         label151: {
            Block var12;
            Block var15;
            label152: {
               String[] var10000 = class_752.method_4253();
               var12 = var3.getBlock(var4, var5, var6);
               var11 = var10000;
               var15 = var12;
               Block var10001 = class_1192.field_6104;
               if(var11 != null) {
                  if(var12 == class_1192.field_6104) {
                     label139: {
                        var16 = var3.method_33(var4, var5, var6) & 7;
                        if(var11 != null) {
                           if(var16 >= 1) {
                              break label139;
                           }

                           var16 = 1;
                        }

                        var7 = var16;
                        if(var11 != null) {
                           break label151;
                        }
                     }
                  }

                  var15 = var12;
                  if(var11 == null) {
                     break label152;
                  }

                  var10001 = class_1192.field_6131;
               }

               if(var15 == var10001) {
                  break label151;
               }

               var15 = var12;
            }

            if(var11 != null) {
               if(var15 == class_1192.field_6058) {
                  break label151;
               }

               var15 = var12;
            }

            if(var15 != class_1192.field_6059) {
               var16 = var7;
               if(var11 != null) {
                  if(var7 == 0) {
                     --var5;
                  }

                  var16 = var7;
               }

               byte var17 = 1;
               if(var11 != null) {
                  if(var16 == 1) {
                     ++var5;
                  }

                  var16 = var7;
                  var17 = 2;
               }

               if(var11 != null) {
                  if(var16 == var17) {
                     --var6;
                  }

                  var16 = var7;
                  var17 = 3;
               }

               if(var11 != null) {
                  if(var16 == var17) {
                     ++var6;
                  }

                  var16 = var7;
                  var17 = 4;
               }

               if(var11 != null) {
                  if(var16 == var17) {
                     --var4;
                  }

                  var16 = var7;
                  if(var11 == null) {
                     break label148;
                  }

                  var17 = 5;
               }

               if(var16 == var17) {
                  ++var4;
               }
            }
         }

         var16 = var1.field_2958;
      }

      if(var11 != null) {
         if(var16 == 0) {
            return false;
         }

         var16 = var2.method_4628(var4, var5, var6, var7, var1);
      }

      if(var11 != null) {
         if(var16 == 0) {
            return false;
         }

         var16 = var5;
      }

      if(var11 != null) {
         label103: {
            if(var16 == 255) {
               var16 = this.blockInstance.method_2424().method_5063();
               if(var11 == null) {
                  break label103;
               }

               if(var16 != 0) {
                  return false;
               }
            }

            var16 = var3.canPlaceEntityOnSide(this.blockInstance, var4, var5, var6, false, var7, var2, var1);
         }
      }

      if(var11 != null) {
         if(var16 != 0) {
            int var13 = this.method_2931(var1.method_3745());
            int var14 = this.blockInstance.method_2483(var3, var4, var5, var6, var7, var8, var9, var10, var13);
            boolean var19 = var3.method_2054(var4, var5, var6, this.blockInstance, var14, 3);
            if(var11 != null) {
               if(var19) {
                  ahb var20 = var3;
                  int var18 = var4;
                  if(var11 != null) {
                     if(var3.getBlock(var4, var5, var6) == this.blockInstance) {
                        this.blockInstance.method_2506(var3, var4, var5, var6, var2, var1);
                        this.blockInstance.method_2507(var3, var4, var5, var6, var14);
                     }

                     var20 = var3;
                     var18 = var4;
                  }

                  var20.method_2084((double)((float)var18 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.blockInstance.field_2005.method_5996(), (this.blockInstance.field_2005.method_5992() + 1.0F) / 2.0F, this.blockInstance.field_2005.method_5993() * 0.8F);
                  --var1.field_2958;
               }

               var19 = true;
            }

            return var19;
         }

         var16 = 0;
      }

      return (boolean)var16;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, yz, add) boolean
   public boolean getBlock53(World var1, int var2, int var3, int var4, int var5, class_792 var6, add var7) {
      int var12;
      label88: {
         String[] var8;
         Block var9;
         Block var10;
         label89: {
            String[] var10000 = class_752.method_4253();
            var9 = var1.getBlock(var2, var3, var4);
            var8 = var10000;
            var10 = var9;
            Block var10001 = class_1192.field_6104;
            if(var8 != null) {
               if(var9 == class_1192.field_6104) {
                  var5 = 1;
                  if(var8 != null) {
                     break label88;
                  }
               }

               var10 = var9;
               if(var8 == null) {
                  break label89;
               }

               var10001 = class_1192.field_6131;
            }

            if(var10 == var10001) {
               break label88;
            }

            var10 = var9;
         }

         if(var8 != null) {
            if(var10 == class_1192.field_6058) {
               break label88;
            }

            var10 = var9;
         }

         if(var10 != class_1192.field_6059) {
            var12 = var5;
            if(var8 != null) {
               if(var5 == 0) {
                  --var3;
               }

               var12 = var5;
            }

            byte var11 = 1;
            if(var8 != null) {
               if(var12 == 1) {
                  ++var3;
               }

               var12 = var5;
               var11 = 2;
            }

            if(var8 != null) {
               if(var12 == var11) {
                  --var4;
               }

               var12 = var5;
               var11 = 3;
            }

            if(var8 != null) {
               if(var12 == var11) {
                  ++var4;
               }

               var12 = var5;
               var11 = 4;
            }

            if(var8 != null) {
               if(var12 == var11) {
                  --var2;
               }

               var12 = var5;
               if(var8 == null) {
                  return (boolean)var12;
               }

               var11 = 5;
            }

            if(var12 == var11) {
               ++var2;
            }
         }
      }

      var12 = var1.canPlaceEntityOnSide(this.blockInstance, var2, var3, var4, false, var5, (class_689)null, var7);
      return (boolean)var12;
   }

   // $FF: renamed from: a (add) java.lang.String
   public String getUnlocalizedName(add var1) {
      return this.blockInstance.method_2510();
   }

   // $FF: renamed from: a () java.lang.String
   public String getUnlocalizedName() {
      return this.blockInstance.method_2510();
   }

   // $FF: renamed from: n_ () a5
   public class_872 getCreativeTab() {
      return this.blockInstance.method_2520();
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void getSubItems(adb var1, class_872 var2, List var3) {
      this.blockInstance.method_2519(var1, var2, var3);
   }

   // $FF: renamed from: a (vM) void
   public void registerIcons(class_74 var1) {
      String var2 = this.blockInstance.getItemIconName();
      if(var2 != null) {
         this.field_2438 = var1.method_375(var2);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      boolean var10000 = true;
      char[] var10003 = "øÓcw¨q".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            __OBFID = (new String((char[])var4)).intern();
            String var2 = __OBFID;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 154;
            break;
         case 1:
            var10009 = 190;
            break;
         case 2:
            var10009 = 103;
            break;
         case 3:
            var10009 = 131;
            break;
         case 4:
            var10009 = 114;
            break;
         case 5:
            var10009 = 139;
            break;
         default:
            var10009 = 102;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
