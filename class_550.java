import com.google.common.collect.HashMultimap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// $FF: renamed from: b8
public class class_550 extends adb {

   // $FF: renamed from: n java.util.HashMap
   private HashMap field_2409;
   // $FF: renamed from: o java.util.Map
   private static final Map field_2410;
   // $FF: renamed from: p vL
   private class_73 field_2411;
   // $FF: renamed from: q vL
   private class_73 field_2412;
   // $FF: renamed from: r vL
   private class_73 field_2413;
   // $FF: renamed from: s java.lang.String[]
   private static final String[] field_2414;


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.field_2409 = new HashMap();
      this.method_2922(1);
      this.method_2933(true);
      this.method_2935(0);
      this.method_2974(class_872.fontRendererInstance3);
   }

   // $FF: renamed from: b (add) java.util.List
   public List getBlock28(add var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = var1;
      if(var2 != null) {
         label42: {
            if(var1.method_3766()) {
               var10000 = var1.method_3767();
               if(var2 == null) {
                  break label42;
               }

               String[] var8 = field_2414;
               if(((class_1583)var10000).initGui8("CustomPotionEffects", 9)) {
                  ArrayList var3 = new ArrayList();
                  class_1583 var10 = var1.method_3767();
                  String[] var10001 = field_2414;
                  class_1580 var4 = var10.method_8689("CustomPotionEffects", 10);
                  int var5 = 0;

                  while(var5 < var4.method_8658()) {
                     class_1583 var6 = var4.method_8653(var5);
                     class_1645 var7 = class_1645.method_9026(var6);
                     if(var2 != null) {
                        if(var7 != null) {
                           var3.add(var7);
                        }

                        ++var5;
                     }

                     if(var2 == null) {
                        break;
                     }
                  }

                  return var3;
               }
            }

            var10000 = this.field_2409.get(Integer.valueOf(var1.method_3745()));
         }
      }

      List var9 = (List)var10000;
      List var11 = var9;
      if(var2 != null) {
         if(var9 == null) {
            var9 = class_1011.method_5765(var1.method_3745(), false);
            this.field_2409.put(Integer.valueOf(var1.method_3745()), var9);
         }

         var11 = var9;
      }

      return var11;
   }

   // $FF: renamed from: b (int) java.util.List
   public List getBlock29(int var1) {
      String[] var10000 = class_752.method_4253();
      List var3 = (List)this.field_2409.get(Integer.valueOf(var1));
      String[] var2 = var10000;
      List var4 = var3;
      if(var2 != null) {
         if(var3 == null) {
            var3 = class_1011.method_5765(var1, false);
            this.field_2409.put(Integer.valueOf(var1), var3);
         }

         var4 = var3;
      }

      return var4;
   }

   // $FF: renamed from: b (add, ahb, yz) add
   public add method_2929(add var1, ahb var2, class_792 var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var3.field_3640.field_2839;
      if(var4 != null) {
         if(!var3.field_3640.field_2839) {
            --var1.field_2958;
         }

         var10000 = var2.field_1832;
      }

      if(var4 != null) {
         if(var10000 == 0) {
            label61: {
               List var5 = this.getBlock28(var1);
               List var8 = var5;
               if(var4 != null) {
                  if(var5 == null) {
                     break label61;
                  }

                  var8 = var5;
               }

               Iterator var6 = var8.iterator();

               while(var6.hasNext()) {
                  class_1645 var7 = (class_1645)var6.next();
                  class_1645 var10001 = new class_1645;
                  var10001.method_9014(var7);
                  var3.method_4179(var10001);
                  if(var4 == null) {
                     return var1;
                  }

                  if(var4 == null) {
                     break;
                  }
               }
            }
         }

         var10000 = var3.field_3640.field_2839;
      }

      if(var4 != null) {
         if(var10000 != 0) {
            return var1;
         }

         var10000 = var1.field_2958;
      }

      if(var4 != null) {
         if(var10000 <= 0) {
            add var11 = new add;
            var11.method_3724(class_1010.field_5231);
            return var11;
         }

         class_666 var10 = var3.field_3616;
         add var9 = new add;
         var9.method_3724(class_1010.field_5231);
         var10.method_3607(var9);
      }

      return var1;
   }

   // $FF: renamed from: d_ (add) int
   public int method_2958(add var1) {
      return 32;
   }

   // $FF: renamed from: d (add) A
   public class_92 method_2957(add var1) {
      return class_92.field_25;
   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add var1, ahb var2, class_792 var3) {
      String[] var4 = class_752.method_4253();
      add var10000 = var1;
      if(var4 != null) {
         if(getBlock30(var1.method_3745())) {
            boolean var5 = var3.field_3640.field_2839;
            if(var4 != null) {
               if(!var3.field_3640.field_2839) {
                  --var1.field_2958;
               }

               String[] var10002 = field_2414;
               var2.method_2082(var3, "random.bow", 0.5F, 0.4F / (field_2332.nextFloat() * 0.4F + 0.8F));
               var5 = var2.field_1832;
            }

            if(var4 != null && !var5) {
               class_798 var10001 = new class_798;
               var10001.method_4691(var2, var3, var1);
               var2.method_2089(var10001);
            }

            return var1;
         }

         var3.method_4626(var1, this.method_2958(var1));
         var10000 = var1;
      }

      return var10000;
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      return false;
   }

   // $FF: renamed from: b_ (int) vL
   public class_73 getIconFromDamage(int var1) {
      return getBlock30(var1)?this.field_2411:this.field_2412;
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2971(int var1, int var2) {
      return var2 == 0?this.field_2413:super.method_2971(var1, var2);
   }

   // $FF: renamed from: c (int) boolean
   public static boolean getBlock30(int var0) {
      String[] var1 = class_752.method_4253();
      int var10000 = var0 & 16384;
      if(var1 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: g (int) int
   public int getBlock31(int var1) {
      return class_1011.method_5760(var1, false);
   }

   // $FF: renamed from: a (add, int) int
   public int method_2953(add var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var2;
      if(var3 != null) {
         if(var2 > 0) {
            return 16777215;
         }

         var10000 = this.getBlock31(var1.method_3745());
      }

      return var10000;
   }

   // $FF: renamed from: b () boolean
   public boolean method_2970() {
      return true;
   }

   // $FF: renamed from: h (int) boolean
   public boolean getBlock32(int var1) {
      String[] var10000 = class_752.method_4253();
      List var3 = this.getBlock29(var1);
      String[] var2 = var10000;
      List var6 = var3;
      if(var2 != null) {
         if(var3 == null) {
            return false;
         }

         var6 = var3;
      }

      if(var2 != null) {
         if(var6.isEmpty()) {
            return false;
         }

         var6 = var3;
      }

      Iterator var4 = var6.iterator();

      boolean var7;
      while(true) {
         if(var4.hasNext()) {
            label48: {
               class_1645 var5 = (class_1645)var4.next();
               var7 = class_1635.field_8489[var5.method_9016()].method_8969();
               if(var2 == null) {
                  break;
               }

               if(var2 != null) {
                  if(!var7) {
                     if(var2 != null) {
                        continue;
                     }
                     break label48;
                  }

                  var7 = true;
               }

               return var7;
            }
         }

         var7 = false;
         break;
      }

      return var7;
   }

   // $FF: renamed from: n (add) java.lang.String
   public String method_2964(add var1) {
      String[] var2 = class_752.method_4253();
      String[] var6;
      if(var1.method_3745() == 0) {
         var6 = field_2414;
         return class_1563.method_8581("item.emptyPotion.name").trim();
      } else {
         String var3 = "";
         StringBuilder var10000;
         if(getBlock30(var1.method_3745())) {
            var10000 = new StringBuilder();
            var6 = field_2414;
            var3 = var10000.append(class_1563.method_8581("potion.prefix.grenade").trim()).append(" ").toString();
         }

         String var5;
         int var8;
         label26: {
            label32: {
               List var4 = class_1010.field_5230.getBlock28(var1);
               List var7 = var4;
               if(var2 != null) {
                  if(var4 == null) {
                     break label32;
                  }

                  var7 = var4;
               }

               var8 = var7.isEmpty();
               if(var2 == null) {
                  break label26;
               }

               if(var8 == 0) {
                  var5 = ((class_1645)var4.get(0)).method_9024();
                  var10000 = (new StringBuilder()).append(var5);
                  String[] var10001 = field_2414;
                  var5 = var10000.append(".postfix").toString();
                  return var3 + class_1563.method_8581(var5).trim();
               }
            }

            var8 = var1.method_3745();
         }

         var5 = class_1011.method_5761(var8);
         return class_1563.method_8581(var5).trim() + " " + super.method_2964(var1);
      }
   }

   // $FF: renamed from: a (add, yz, java.util.List, boolean) void
   public void method_2963(add var1, class_792 var2, List var3, boolean var4) {
      String[] var5 = class_752.method_4253();
      if(var1.method_3745() != 0) {
         Iterator var8;
         StringBuilder var10001;
         String[] var17;
         Object var23;
         int var24;
         class_1716 var25;
         label176: {
            HashMultimap var7;
            label170: {
               label177: {
                  List var6 = class_1010.field_5230.getBlock28(var1);
                  var7 = HashMultimap.create();
                  List var10000 = var6;
                  if(var5 != null) {
                     if(var6 == null) {
                        break label177;
                     }

                     var10000 = var6;
                  }

                  if(var5 != null) {
                     if(var10000.isEmpty()) {
                        break label177;
                     }

                     var8 = var6.iterator();
                  } else {
                     var8 = var10000.iterator();
                  }

                  while(var8.hasNext()) {
                     class_1645 var9 = (class_1645)var8.next();
                     String var10 = class_1563.method_8581(var9.method_9024()).trim();
                     class_1635 var11 = class_1635.field_8489[var9.method_9016()];
                     Map var12 = var11.method_8982();
                     var23 = var12;
                     if(var5 == null) {
                        break label176;
                     }

                     StringBuilder var26;
                     label125: {
                        label180: {
                           label123: {
                              label181: {
                                 if(var5 != null) {
                                    if(var12 == null) {
                                       break label181;
                                    }

                                    var23 = var12;
                                 }

                                 var24 = ((Map)var23).size();
                                 if(var5 == null) {
                                    break label123;
                                 }

                                 if(var24 > 0) {
                                    Iterator var13 = var12.entrySet().iterator();

                                    while(var13.hasNext()) {
                                       Entry var14 = (Entry)var13.next();
                                       class_1716 var15 = (class_1716)var14.getValue();
                                       var25 = new class_1716;
                                       var25.method_9592(var15.method_9595(), var11.method_8985(var9.method_9018(), var15), var15.method_9596());
                                       class_1716 var16 = var25;
                                       var7.put(((class_79)var14.getKey()).method_384(), var16);
                                       if(var5 == null) {
                                          break label180;
                                       }

                                       if(var5 == null) {
                                          break;
                                       }
                                    }
                                 }
                              }

                              var24 = var9.method_9018();
                           }

                           if(var5 == null) {
                              break label125;
                           }

                           if(var24 > 0) {
                              var26 = (new StringBuilder()).append(var10).append(" ");
                              var10001 = new StringBuilder();
                              var17 = field_2414;
                              var10 = var26.append(class_1563.method_8581(var10001.append("potion.potency.").append(var9.method_9018()).toString()).trim()).toString();
                           }
                        }

                        var24 = var9.method_9017();
                     }

                     if(var5 != null) {
                        if(var24 > 20) {
                           var26 = (new StringBuilder()).append(var10);
                           var17 = field_2414;
                           var10 = var26.append(" (").append(class_1635.method_8976(var9)).append(")").toString();
                        }

                        var24 = var11.method_8975();
                     }

                     if(var5 != null) {
                        label98: {
                           if(var24 != 0) {
                              var3.add(class_130.field_288 + var10);
                              if(var5 != null) {
                                 break label98;
                              }
                           }

                           var3.add(class_130.field_283 + var10);
                        }
                     }

                     if(var5 == null) {
                        break;
                     }
                  }

                  if(var5 != null) {
                     break label170;
                  }
               }

               var17 = field_2414;
               String var18 = class_1563.method_8581("potion.empty").trim();
               var3.add(class_130.field_283 + var18);
            }

            boolean var27 = var7.isEmpty();
            if(var5 != null) {
               if(var27) {
                  return;
               }

               var3.add("");
               var10001 = (new StringBuilder()).append(class_130.field_281);
               var17 = field_2414;
               var3.add(var10001.append(class_1563.method_8581("potion.effects.whenDrank")).toString());
            }

            var8 = var7.entries().iterator();
            if(!var8.hasNext()) {
               return;
            }

            var23 = var8.next();
         }

         while(true) {
            Entry var19;
            double var20;
            class_1716 var21;
            double var22;
            label93: {
               label92: {
                  label91: {
                     var19 = (Entry)var23;
                     var21 = (class_1716)var19.getValue();
                     var20 = var21.method_9597();
                     var25 = var21;
                     if(var5 != null) {
                        if(var21.method_9596() != 1) {
                           var25 = var21;
                           if(var5 == null) {
                              break label92;
                           }

                           if(var21.method_9596() != 2) {
                              break label91;
                           }
                        }

                        var25 = var21;
                     }

                     var22 = var25.method_9597() * 100.0D;
                     if(var5 != null) {
                        break label93;
                     }
                  }

                  var25 = var21;
               }

               var22 = var25.method_9597();
            }

            label184: {
               double var28;
               var24 = (var28 = var20 - 0.0D) == 0.0D?0:(var28 < 0.0D?-1:1);
               StringBuilder var10002;
               if(var5 != null) {
                  if(var24 > 0) {
                     var10001 = (new StringBuilder()).append(class_130.field_285);
                     var10002 = new StringBuilder();
                     var17 = field_2414;
                     var3.add(var10001.append(class_1563.method_8582(var10002.append("attribute.modifier.plus.").append(var21.method_9596()).toString(), new Object[]{add.field_2957.format(var22), class_1563.method_8581("attribute.name." + (String)var19.getKey())})).toString());
                     if(var5 != null) {
                        break label184;
                     }
                  }

                  double var29;
                  var24 = (var29 = var20 - 0.0D) == 0.0D?0:(var29 < 0.0D?-1:1);
               }

               if(var5 != null && var24 < 0) {
                  var22 *= -1.0D;
                  var10001 = (new StringBuilder()).append(class_130.field_288);
                  var10002 = new StringBuilder();
                  var17 = field_2414;
                  var3.add(var10001.append(class_1563.method_8582(var10002.append("attribute.modifier.take.").append(var21.method_9596()).toString(), new Object[]{add.field_2957.format(var22), class_1563.method_8581("attribute.name." + (String)var19.getKey())})).toString());
               }
            }

            if(var5 == null || !var8.hasNext()) {
               return;
            }

            var23 = var8.next();
         }
      }
   }

   // $FF: renamed from: e (add) boolean
   public boolean method_2965(add var1) {
      boolean var5;
      label24: {
         String[] var10000 = class_752.method_4253();
         List var3 = this.getBlock28(var1);
         String[] var2 = var10000;
         List var4 = var3;
         if(var2 != null) {
            if(var3 == null) {
               break label24;
            }

            var4 = var3;
         }

         var5 = var4.isEmpty();
         if(var2 == null) {
            return var5;
         }

         if(!var5) {
            var5 = true;
            return var5;
         }
      }

      var5 = false;
      return var5;
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void getSubItems(adb var1, class_872 var2, List var3) {
      String[] var10000 = class_752.method_4253();
      super.getSubItems(var1, var2, var3);
      String[] var4 = var10000;
      Map var12 = field_2410;
      int var6;
      if(var4 != null) {
         if(field_2410.isEmpty()) {
            int var5 = 0;

            label115:
            do {
               int var13 = var5;

               label112:
               while(true) {
                  if(var13 > 15) {
                     break label115;
                  }

                  var6 = 0;

                  while(true) {
                     var13 = var6;

                     label108:
                     while(true) {
                        if(var13 > 1) {
                           break label112;
                        }

                        int var7 = var5;
                        var13 = var6;
                        if(var4 == null) {
                           continue label112;
                        }

                        label70: {
                           if(var4 != null) {
                              if(var6 == 0) {
                                 var7 = var5 | 8192;
                                 if(var4 != null) {
                                    break label70;
                                 }
                              }

                              var13 = var7 | 16384;
                           }

                           var7 = var13;
                        }

                        int var8 = 0;

                        while(var8 <= 2) {
                           int var9 = var7;
                           var13 = var8;
                           if(var4 == null) {
                              continue label108;
                           }

                           byte var10001;
                           label87: {
                              label126: {
                                 if(var4 != null) {
                                    if(var8 == 0) {
                                       break label126;
                                    }

                                    var13 = var8;
                                 }

                                 var10001 = 1;
                                 if(var4 != null) {
                                    if(var13 == 1) {
                                       var9 = var7 | 32;
                                       if(var4 != null) {
                                          break label126;
                                       }
                                    }

                                    var13 = var8;
                                    var10001 = 2;
                                 }

                                 if(var4 == null) {
                                    break label87;
                                 }

                                 if(var13 == var10001) {
                                    var9 |= 64;
                                 }
                              }

                              var13 = var9;
                              var10001 = 0;
                           }

                           List var10 = class_1011.method_5765(var13, (boolean)var10001);
                           if(var4 != null) {
                              if(var10 != null && var4 != null && !var10.isEmpty()) {
                                 field_2410.put(var10, Integer.valueOf(var9));
                              }

                              ++var8;
                           }

                           if(var4 == null) {
                              break;
                           }
                        }

                        ++var6;
                        if(var4 == null) {
                           break label112;
                        }
                        break;
                     }
                  }
               }

               ++var5;
            } while(var4 != null);
         }

         var12 = field_2410;
      }

      Iterator var11 = var12.values().iterator();

      while(var11.hasNext()) {
         var6 = ((Integer)var11.next()).intValue();
         add var14 = new add;
         var14.method_3726(var1, 1, var6);
         var3.add(var14);
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (vM) void
   public void registerIcons(class_74 var1) {
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2980()).append("_");
      String[] var2 = field_2414;
      this.field_2412 = var1.method_375(var10002.append("bottle_drinkable").toString());
      this.field_2411 = var1.method_375(this.method_2980() + "_" + "bottle_splash");
      this.field_2413 = var1.method_375(this.method_2980() + "_" + "overlay");
   }

   // $FF: renamed from: a (java.lang.String) vL
   public static class_73 getBlock33(String var0) {
      String[] var1 = class_752.method_4253();
      String[] var2 = field_2414;
      boolean var10000 = var0.equals("bottle_drinkable");
      if(var1 != null) {
         if(var10000) {
            return class_1010.field_5230.field_2412;
         }

         var2 = field_2414;
         var10000 = var0.equals("bottle_splash");
      }

      if(var1 != null) {
         if(var10000) {
            return class_1010.field_5230.field_2411;
         }

         String[] var10001 = field_2414;
         var10000 = var0.equals("overlay");
      }

      return var10000?class_1010.field_5230.field_2413:null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      // $FF: Couldn't be decompiled
   }
}
