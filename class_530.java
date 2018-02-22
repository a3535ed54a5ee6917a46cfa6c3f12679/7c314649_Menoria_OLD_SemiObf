import java.util.List;

// $FF: renamed from: bT
public class class_530 extends adb {

   // $FF: renamed from: n vL
   private IIcon field_2377;
   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_2378;


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2971(int var1, int var2) {
      return var2 > 0?this.field_2377:super.method_2971(var1, var2);
   }

   // $FF: renamed from: a (add, int) int
   public int method_2953(add var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var2;
      if(var3 != null) {
         if(var2 == 1) {
            label53: {
               String[] var10001 = field_2378;
               class_1571 var4 = getBlock00(var1, "Colors");
               class_1571 var14 = var4;
               if(var3 != null) {
                  if(var4 == null) {
                     break label53;
                  }

                  var14 = var4;
               }

               var10000 = var14 instanceof class_1581;
               if(var3 == null) {
                  return var10000;
               }

               if(var10000 != 0) {
                  class_1581 var5 = (class_1581)var4;
                  int[] var6 = var5.method_8662();
                  var10000 = var6.length;
                  if(var3 != null) {
                     if(var10000 == 1) {
                        return var6[0];
                     }

                     var10000 = 0;
                  }

                  int var7 = var10000;
                  int var8 = 0;
                  int var9 = 0;
                  int[] var10 = var6;
                  int var11 = var6.length;
                  int var12 = 0;

                  while(true) {
                     if(var12 < var11) {
                        int var13 = var10[var12];
                        var7 += (var13 & 16711680) >> 16;
                        var8 += (var13 & '\uff00') >> 8;
                        var9 += (var13 & 255) >> 0;
                        ++var12;
                        if(var3 == null) {
                           break;
                        }

                        if(var3 != null) {
                           continue;
                        }
                     }

                     var7 /= var6.length;
                     var8 /= var6.length;
                     var9 /= var6.length;
                     break;
                  }

                  return var7 << 16 | var8 << 8 | var9;
               }
            }

            var10000 = 9079434;
            return var10000;
         }

         var10000 = super.method_2953(var1, var2);
      }

      return var10000;
   }

   // $FF: renamed from: b () boolean
   public boolean method_2970() {
      return true;
   }

   // $FF: renamed from: b (add, java.lang.String) rm
   public static class_1571 getBlock00(add var0, String var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = var0;
      if(var2 != null) {
         if(!var0.method_3766()) {
            return null;
         }

         var10000 = var0;
      }

      class_1583 var4 = var10000.method_3767();
      String[] var10001 = field_2378;
      class_1583 var3 = var4.method_8688("Explosion");
      Object var5 = var3;
      if(var2 != null) {
         if(var3 == null) {
            return null;
         }

         var5 = var3.initGui5(var1);
      }

      return (class_1571)var5;
   }

   // $FF: renamed from: a (add, yz, java.util.List, boolean) void
   public void method_2963(add var1, class_792 var2, List var3, boolean var4) {
      String[] var5 = class_752.method_4253();
      add var10000 = var1;
      if(var5 != null) {
         if(!var1.method_3766()) {
            return;
         }

         var10000 = var1;
      }

      class_1583 var7 = var10000.method_3767();
      String[] var10001 = field_2378;
      class_1583 var6 = var7.method_8688("Explosion");
      var7 = var6;
      if(var5 != null) {
         if(var6 == null) {
            return;
         }

         var7 = var6;
      }

      getBlock01(var7, var3);
   }

   // $FF: renamed from: b (ro, java.util.List) void
   public static void getBlock01(class_1583 var0, List var1) {
      String[] var10000 = class_752.method_4253();
      String[] var14 = field_2378;
      byte var3 = var0.initGui9("Type");
      String[] var2 = var10000;
      if(var2 != null) {
         label163: {
            if(var3 >= 0) {
               if(var2 == null) {
                  break label163;
               }

               if(var3 <= 4) {
                  var1.add(class_1563.method_8581("item.fireworksCharge.type." + var3).trim());
                  if(var2 != null) {
                     break label163;
                  }
               }
            }

            var14 = field_2378;
            var1.add(class_1563.method_8581("item.fireworksCharge.type").trim());
         }
      }

      var14 = field_2378;
      int[] var4 = var0.method_8687("Colors");
      int[] var21 = var4;
      int var9;
      int var10;
      int var11;
      int var12;
      int var10001;
      int var22;
      byte var23;
      StringBuilder var24;
      StringBuilder var25;
      if(var2 != null) {
         if(var4.length > 0) {
            byte var5 = 1;
            String var6 = "";
            int[] var7 = var4;
            int var8 = var4.length;
            var9 = 0;

            label149:
            while(true) {
               var22 = var9;
               var10001 = var8;

               label146:
               while(var22 < var10001) {
                  var10 = var7[var9];
                  var23 = var5;
                  if(var2 == null) {
                     break label149;
                  }

                  if(var2 != null) {
                     if(var5 == 0) {
                        var24 = (new StringBuilder()).append(var6);
                        var14 = field_2378;
                        var6 = var24.append(", ").toString();
                     }

                     var5 = 0;
                     var23 = 0;
                  }

                  var11 = var23;
                  var12 = 0;

                  while(var12 < 16) {
                     label140: {
                        var22 = var10;
                        if(var2 != null) {
                           var10001 = class_537.field_2387[var12];
                           if(var2 == null) {
                              continue label146;
                           }

                           if(var10 != var10001) {
                              break label140;
                           }

                           var22 = 1;
                        }

                        var11 = var22;
                        var24 = (new StringBuilder()).append(var6);
                        var25 = new StringBuilder();
                        var14 = field_2378;
                        var6 = var24.append(class_1563.method_8581(var25.append("item.fireworksCharge.").append(class_537.field_2385[var12]).toString())).toString();
                        if(var2 != null) {
                           break;
                        }
                     }

                     ++var12;
                     if(var2 == null) {
                        break;
                     }
                  }

                  if(var11 == 0) {
                     var24 = (new StringBuilder()).append(var6);
                     var14 = field_2378;
                     var6 = var24.append(class_1563.method_8581("item.fireworksCharge.customColor")).toString();
                  }

                  ++var9;
                  if(var2 != null) {
                     continue label149;
                  }
                  break;
               }

               var1.add(var6);
               break;
            }
         }

         var14 = field_2378;
         var21 = var0.method_8687("FadeColors");
      }

      int[] var15 = var21;
      var22 = var15.length;
      if(var2 != null) {
         if(var22 > 0) {
            byte var17 = 1;
            var24 = new StringBuilder();
            var14 = field_2378;
            String var16 = var24.append(class_1563.method_8581("item.fireworksCharge.fadeTo")).append(" ").toString();
            int[] var18 = var15;
            var9 = var15.length;
            var10 = 0;

            label115:
            while(true) {
               var22 = var10;
               var10001 = var9;

               label112:
               while(var22 < var10001) {
                  var11 = var18[var10];
                  var23 = var17;
                  if(var2 == null) {
                     break label115;
                  }

                  if(var2 != null) {
                     if(var17 == 0) {
                        var24 = (new StringBuilder()).append(var16);
                        var14 = field_2378;
                        var16 = var24.append(", ").toString();
                     }

                     var17 = 0;
                     var23 = 0;
                  }

                  var12 = var23;
                  int var13 = 0;

                  while(var13 < 16) {
                     label106: {
                        var22 = var11;
                        if(var2 != null) {
                           var10001 = class_537.field_2387[var13];
                           if(var2 == null) {
                              continue label112;
                           }

                           if(var11 != var10001) {
                              break label106;
                           }

                           var22 = 1;
                        }

                        var12 = var22;
                        var24 = (new StringBuilder()).append(var16);
                        var25 = new StringBuilder();
                        var14 = field_2378;
                        var16 = var24.append(class_1563.method_8581(var25.append("item.fireworksCharge.").append(class_537.field_2385[var13]).toString())).toString();
                        if(var2 != null) {
                           break;
                        }
                     }

                     ++var13;
                     if(var2 == null) {
                        break;
                     }
                  }

                  if(var12 == 0) {
                     var24 = (new StringBuilder()).append(var16);
                     var14 = field_2378;
                     var16 = var24.append(class_1563.method_8581("item.fireworksCharge.customColor")).toString();
                  }

                  ++var10;
                  if(var2 != null) {
                     continue label115;
                  }
                  break;
               }

               var1.add(var16);
               break;
            }
         }

         var14 = field_2378;
         var22 = var0.method_8690("Trail");
      }

      int var19 = var22;
      var22 = var19;
      if(var2 != null) {
         if(var19 != 0) {
            var14 = field_2378;
            var1.add(class_1563.method_8581("item.fireworksCharge.trail"));
         }

         var14 = field_2378;
         var22 = var0.method_8690("Flicker");
      }

      int var20 = var22;
      if(var2 != null && var20 != 0) {
         String[] var26 = field_2378;
         var1.add(class_1563.method_8581("item.fireworksCharge.flicker"));
      }

   }

   // $FF: renamed from: a (vM) void
   public void registerIcons(class_74 var1) {
      super.registerIcons(var1);
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2980());
      String[] var10003 = field_2378;
      this.field_2377 = var1.method_375(var10002.append("_overlay").toString());
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      // $FF: Couldn't be decompiled
   }
}
