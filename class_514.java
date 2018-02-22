import com.mojang.authlib.GameProfile;
import java.util.List;
import java.util.UUID;

// $FF: renamed from: cg
public class class_514 extends adb {

   // $FF: renamed from: n java.lang.String[]
   private static final String[] field_2352;
   // $FF: renamed from: o java.lang.String[]
   public static final String[] field_2353;
   // $FF: renamed from: p vL[]
   private class_73[] field_2354;
   // $FF: renamed from: q java.lang.String[]
   private static final String[] field_2355;


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.method_2974(class_872.field_4245);
      this.method_2935(0);
      this.method_2933(true);
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var11 = class_752.method_4253();
      int var10000 = var7;
      if(var11 != null) {
         if(var7 == 0) {
            return false;
         }

         var10000 = var3.getBlock(var4, var5, var6).method_2424().method_5063();
      }

      if(var11 != null) {
         if(var10000 == 0) {
            return false;
         }

         var10000 = var7;
      }

      byte var10001 = 1;
      if(var11 != null) {
         if(var10000 == 1) {
            ++var5;
         }

         var10000 = var7;
         var10001 = 2;
      }

      if(var11 != null) {
         if(var10000 == var10001) {
            --var6;
         }

         var10000 = var7;
         var10001 = 3;
      }

      if(var11 != null) {
         if(var10000 == var10001) {
            ++var6;
         }

         var10000 = var7;
         var10001 = 4;
      }

      label137: {
         if(var11 != null) {
            if(var10000 == var10001) {
               --var4;
            }

            var10000 = var7;
            if(var11 == null) {
               break label137;
            }

            var10001 = 5;
         }

         if(var10000 == var10001) {
            ++var4;
         }

         var10000 = var3.field_1832;
      }

      if(var11 != null) {
         if(var10000 == 0) {
            int var12;
            label116: {
               var3.method_2054(var4, var5, var6, class_1192.field_6168, var7, 2);
               var12 = 0;
               var10000 = var7;
               var10001 = 1;
               if(var11 != null) {
                  if(var7 != 1) {
                     break label116;
                  }

                  var10000 = class_1715.method_9561((double)(var2.field_3000 * 16.0F / 360.0F) + 0.5D);
                  var10001 = 15;
               }

               var12 = var10000 & var10001;
            }

            label140: {
               class_580 var13 = var3.method_31(var4, var5, var6);
               class_580 var17 = var13;
               if(var11 != null) {
                  if(var13 == null) {
                     break label140;
                  }

                  var17 = var13;
               }

               var10000 = var17 instanceof class_581;
               if(var11 != null) {
                  if(var10000 == 0) {
                     break label140;
                  }

                  var10000 = var1.method_3745();
               }

               label99: {
                  if(var10000 == 3) {
                     GameProfile var14;
                     label141: {
                        var14 = null;
                        add var18 = var1;
                        if(var11 != null) {
                           if(!var1.method_3766()) {
                              break label141;
                           }

                           var18 = var1;
                        }

                        class_1583 var15 = var18.method_3767();
                        String[] var16 = field_2355;
                        var10000 = var15.initGui8("SkullOwner", 10);
                        if(var11 != null) {
                           if(var10000 != 0) {
                              var14 = class_1570.method_8624(var15.method_8688("SkullOwner"));
                              break label141;
                           }

                           var16 = field_2355;
                           var10000 = var15.initGui8("SkullOwner", 8);
                        }

                        if(var11 != null) {
                           if(var10000 == 0) {
                              break label141;
                           }

                           var16 = field_2355;
                           var10000 = var15.method_8685("SkullOwner").length();
                        }

                        if(var10000 > 0) {
                           GameProfile var19 = new GameProfile;
                           String[] var10004 = field_2355;
                           var19.method_1305((UUID)null, var15.method_8685("SkullOwner"));
                           var14 = var19;
                        }
                     }

                     ((class_581)var13).method_3112(var14);
                     if(var11 != null) {
                        break label99;
                     }
                  }

                  ((class_581)var13).method_3111(var1.method_3745());
               }

               ((class_581)var13).method_3116(var12);
               ((class_475)class_1192.field_6168).method_2827(var3, var4, var5, var6, (class_581)var13);
            }

            --var1.field_2958;
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void getSubItems(adb var1, class_872 var2, List var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var4 = var10000;

      while(var5 < field_2352.length) {
         add var10001 = new add;
         var10001.method_3726(var1, 1, var5);
         var3.add(var10001);
         ++var5;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b_ (int) vL
   public class_73 getIconFromDamage(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         label17: {
            if(var1 >= 0) {
               var10000 = var1;
               if(var2 == null) {
                  break label17;
               }

               if(var1 < field_2352.length) {
                  return this.field_2354[var1];
               }
            }

            var10000 = 0;
         }
      }

      var1 = var10000;
      return this.field_2354[var1];
   }

   // $FF: renamed from: a (int) int
   public int method_2931(int var1) {
      return var1;
   }

   // $FF: renamed from: a (add) java.lang.String
   public String getUnlocalizedName(add var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = var1.method_3745();
      String[] var2 = var10000;
      int var4 = var3;
      if(var2 != null) {
         label17: {
            if(var3 >= 0) {
               var4 = var3;
               if(var2 == null) {
                  break label17;
               }

               if(var3 < field_2352.length) {
                  return super.getUnlocalizedName() + "." + field_2352[var3];
               }
            }

            var4 = 0;
         }
      }

      var3 = var4;
      return super.getUnlocalizedName() + "." + field_2352[var3];
   }

   // $FF: renamed from: n (add) java.lang.String
   public String method_2964(add var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.method_3745();
      if(var2 != null) {
         if(var10000 != 3) {
            return super.method_2964(var1);
         }

         var10000 = var1.method_3766();
      }

      String[] var3;
      class_1583 var4;
      if(var2 != null) {
         if(var10000 == 0) {
            return super.method_2964(var1);
         }

         var4 = var1.method_3767();
         var3 = field_2355;
         var10000 = var4.initGui8("SkullOwner", 10);
      }

      if(var2 != null) {
         if(var10000 != 0) {
            var3 = field_2355;
            return class_1563.method_8582("item.skull.player.name", new Object[]{class_1570.method_8624(var1.method_3767().method_8688("SkullOwner")).getName()});
         }

         var4 = var1.method_3767();
         var3 = field_2355;
         var10000 = var4.initGui8("SkullOwner", 8);
      }

      if(var10000 != 0) {
         var3 = field_2355;
         return class_1563.method_8582("item.skull.player.name", new Object[]{var1.method_3767().method_8685("SkullOwner")});
      } else {
         return super.method_2964(var1);
      }
   }

   // $FF: renamed from: a (vM) void
   public void registerIcons(class_74 var1) {
      this.field_2354 = new class_73[field_2353.length];
      String[] var2 = class_752.method_4253();
      int var3 = 0;

      while(var3 < field_2353.length) {
         this.field_2354[var3] = var1.method_375(this.method_2980() + "_" + field_2353[var3]);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      // $FF: Couldn't be decompiled
   }
}
