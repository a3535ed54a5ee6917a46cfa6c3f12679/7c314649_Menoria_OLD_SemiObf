import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.Logger;

public class WorldServerOF extends class_354 {

   private NextTickHashSet pendingTickListEntriesHashSet;
   private TreeSet pendingTickListEntriesTreeSet;
   private List pendingTickListEntriesThisTick;
   private int lastViewDistance;
   private boolean allChunksTicked;
   public Set setChunkCoordsToTickOnce;
   private Set limitedChunkSet;
   private static final Logger logger;
   // $FF: renamed from: cb java.lang.String[]
   private static final String[] field_1870;


   // $FF: renamed from: <init> (net.minecraft.server.MinecraftServer, j9, java.lang.String, int, dt, qi) void
   public void method_2239(MinecraftServer var1, class_29 var2, String var3, int var4, class_1045 var5, class_1535 var6) {
      super.method_2239(var1, var2, var3, var4, var5, var6);
      this.pendingTickListEntriesThisTick = new ArrayList();
      this.lastViewDistance = 0;
      this.allChunksTicked = false;
      this.setChunkCoordsToTickOnce = new HashSet();
      this.limitedChunkSet = new HashSet();
      this.fixSetNextTicks();
   }

   // $FF: renamed from: a (dt) void
   protected void method_2045(class_1045 var1) {
      super.method_2045(var1);
      this.fixSetNextTicks();
   }

   private void fixSetNextTicks() {
      // $FF: Couldn't be decompiled
   }

   private int findField(Field[] var1, Class var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var3;
      if(var4 != null) {
         if(var3 < 0) {
            return -1;
         }

         var10000 = var3;
      }

      int var5 = var10000;

      while(var5 < var1.length) {
         Field var6 = var1[var5];
         if(var4 != null) {
            if(var6.getType() == var2) {
               return var5;
            }

            ++var5;
         }

         if(var4 == null) {
            break;
         }
      }

      return -1;
   }

   // $FF: renamed from: a (gI, boolean) java.util.List
   public List method_2154(class_1069 var1, boolean var2) {
      String[] var3 = class_752.method_4253();
      WorldServerOF var10000 = this;
      List var17;
      if(var3 != null) {
         label150: {
            if(this.pendingTickListEntriesHashSet != null) {
               var10000 = this;
               if(var3 == null) {
                  break label150;
               }

               if(this.pendingTickListEntriesTreeSet != null) {
                  var17 = this.pendingTickListEntriesThisTick;
                  if(var3 == null) {
                     return var17;
                  }

                  if(this.pendingTickListEntriesThisTick != null) {
                     ArrayList var4 = null;
                     class_1035 var5 = var1.method_6055();
                     int var6 = (var5.field_5475 << 4) - 2;
                     int var7 = var6 + 16 + 2;
                     int var8 = (var5.field_5476 << 4) - 2;
                     int var9 = var8 + 16 + 2;
                     int var10 = 0;

                     do {
                        int var18 = var10;

                        label135:
                        while(true) {
                           int var10001 = 2;

                           while(var18 < var10001) {
                              Iterator var11;
                              boolean var20;
                              label130: {
                                 if(var10 == 0) {
                                    TreeSet var12 = new TreeSet();
                                    int var13 = -1;

                                    while(var13 <= 1) {
                                       var18 = -1;
                                       if(var3 == null) {
                                          continue label135;
                                       }

                                       int var14 = -1;

                                       while(true) {
                                          if(var14 <= 1) {
                                             HashSet var15 = this.pendingTickListEntriesHashSet.getNextTickEntriesSet(var5.field_5475 + var13, var5.field_5476 + var14);
                                             var12.addAll(var15);
                                             ++var14;
                                             if(var3 == null) {
                                                break;
                                             }

                                             if(var3 != null) {
                                                continue;
                                             }
                                          }

                                          ++var13;
                                          break;
                                       }

                                       if(var3 == null) {
                                          break;
                                       }
                                    }

                                    var11 = var12.iterator();
                                    if(var3 != null) {
                                       var20 = var11.hasNext();
                                       break label130;
                                    }
                                 }

                                 var11 = this.pendingTickListEntriesThisTick.iterator();
                                 var20 = this.pendingTickListEntriesThisTick.isEmpty();
                                 if(var3 != null) {
                                    if(!var20) {
                                       Logger var21 = logger;
                                       StringBuilder var19 = new StringBuilder();
                                       String[] var10002 = field_1870;
                                       var21.debug(var19.append("toBeTicked = ").append(this.pendingTickListEntriesThisTick.size()).toString());
                                    }

                                    var20 = var11.hasNext();
                                 }
                              }

                              while(true) {
                                 if(!var20) {
                                    break label135;
                                 }

                                 class_1050 var16 = (class_1050)var11.next();
                                 var18 = var16.field_5556;
                                 var10001 = var6;
                                 if(var3 == null) {
                                    break;
                                 }

                                 label160: {
                                    if(var3 != null) {
                                       if(var16.field_5556 < var6) {
                                          break label160;
                                       }

                                       var18 = var16.field_5556;
                                       var10001 = var7;
                                    }

                                    if(var3 != null) {
                                       if(var18 >= var10001) {
                                          break label160;
                                       }

                                       var18 = var16.field_5558;
                                       var10001 = var8;
                                    }

                                    label161: {
                                       if(var3 != null) {
                                          if(var18 < var10001) {
                                             break label160;
                                          }

                                          var18 = var16.field_5558;
                                          if(var3 == null) {
                                             break label161;
                                          }

                                          var10001 = var9;
                                       }

                                       if(var18 >= var10001) {
                                          break label160;
                                       }

                                       var18 = var2;
                                    }

                                    label70: {
                                       if(var3 != null) {
                                          if(var18 == 0) {
                                             break label70;
                                          }

                                          this.pendingTickListEntriesHashSet.remove(var16);
                                          this.pendingTickListEntriesTreeSet.remove(var16);
                                       }

                                       var11.remove();
                                    }

                                    ArrayList var22 = var4;
                                    if(var3 != null) {
                                       if(var4 == null) {
                                          var4 = new ArrayList();
                                       }

                                       var22 = var4;
                                    }

                                    var22.add(var16);
                                 }

                                 if(var3 == null) {
                                    break label135;
                                 }

                                 var20 = var11.hasNext();
                              }
                           }

                           return var4;
                        }

                        ++var10;
                     } while(var3 != null);

                     return var4;
                  }
               }
            }

            var10000 = this;
         }
      }

      var17 = var10000.method_2154(var1, (boolean)var2);
      return var17;
   }

   // $FF: renamed from: b () void
   public void method_2139() {
      String[] var10000 = class_752.method_4253();
      super.method_2139();
      String[] var1 = var10000;
      boolean var2 = Config.isTimeDefault();
      if(var1 != null) {
         if(!var2) {
            this.fixWorldTime();
         }

         var2 = Config.waterOpacityChanged;
      }

      if(var1 != null) {
         if(!var2) {
            return;
         }

         var2 = false;
      }

      Config.waterOpacityChanged = var2;
      this.updateWaterOpacity();
   }

   // $FF: renamed from: o () void
   protected void method_2141() {
      String[] var1 = class_752.method_4253();
      if(var1 != null) {
         if(!Config.isWeatherEnabled()) {
            this.fixWorldWeather();
         }

         super.method_2141();
      }

   }

   private void fixWorldWeather() {
      String[] var1 = class_752.method_4253();
      class_1303 var10000 = this.field_1824;
      if(var1 != null) {
         label17: {
            if(!this.field_1824.method_6860()) {
               var10000 = this.field_1824;
               if(var1 == null) {
                  break label17;
               }

               if(!this.field_1824.method_6856()) {
                  return;
               }
            }

            this.field_1824.method_6863(0);
            this.field_1824.method_6861(false);
            this.method_2201(0.0F);
            this.field_1824.method_6859(0);
            var10000 = this.field_1824;
         }
      }

      var10000.method_6857(false);
      this.method_2199(0.0F);
      class_1627 var2 = this.method_2255().method_2383();
      class_281 var10001 = new class_281;
      var10001.method_1621(2, 0.0F);
      var2.method_8889(var10001);
      var2 = this.method_2255().method_2383();
      var10001 = new class_281;
      var10001.method_1621(7, 0.0F);
      var2.method_8889(var10001);
      var2 = this.method_2255().method_2383();
      var10001 = new class_281;
      var10001.method_1621(8, 0.0F);
      var2.method_8889(var10001);
   }

   private void fixWorldTime() {
      String[] var1 = class_752.method_4253();
      WorldServerOF var10000 = this;
      if(var1 != null) {
         if(this.field_1824.method_6864().method_443() != 1) {
            return;
         }

         var10000 = this;
      }

      long var2 = var10000.method_2185();
      long var4 = var2 % 24000L;
      int var6 = Config.isTimeDayOnly();
      if(var1 != null) {
         label46: {
            if(var6 != 0) {
               long var7;
               var6 = (var7 = var4 - 1000L) == 0L?0:(var7 < 0L?-1:1);
               if(var1 != null) {
                  if(var6 <= 0) {
                     this.method_2186(var2 - var4 + 1001L);
                  }

                  long var8;
                  var6 = (var8 = var4 - 11000L) == 0L?0:(var8 < 0L?-1:1);
               }

               if(var1 == null) {
                  break label46;
               }

               if(var6 >= 0) {
                  this.method_2186(var2 - var4 + 24001L);
               }
            }

            var6 = Config.isTimeNightOnly();
         }
      }

      if(var1 != null) {
         if(var6 == 0) {
            return;
         }

         long var9;
         var6 = (var9 = var4 - 14000L) == 0L?0:(var9 < 0L?-1:1);
      }

      if(var1 != null) {
         if(var6 <= 0) {
            this.method_2186(var2 - var4 + 14001L);
         }

         long var10;
         var6 = (var10 = var4 - 22000L) == 0L?0:(var10 < 0L?-1:1);
      }

      if(var6 >= 0) {
         this.method_2186(var2 - var4 + 24000L + 14001L);
      }

   }

   public void updateWaterOpacity() {
      String[] var10000 = class_752.method_4253();
      byte var2 = 3;
      String[] var1 = var10000;
      if(var1 != null) {
         if(Config.isClearWater()) {
            var2 = 1;
         }

         BlockUtils.setLightOpacity(class_1192.field_6034, var2);
         BlockUtils.setLightOpacity(class_1192.field_6033, var2);
      }

      class_25 var3 = this.field_1822;
      if(var3 != null) {
         int var4 = -512;

         do {
            int var13 = var4;

            label98:
            while(true) {
               if(var13 >= 512) {
                  return;
               }

               int var5 = -512;

               while(true) {
                  if(var5 >= 512) {
                     break label98;
                  }

                  label93: {
                     label110: {
                        class_25 var14 = var3;
                        int var10001 = var4;
                        int var10002 = var5;
                        if(var1 != null) {
                           var13 = var3.method_103(var4, var5);
                           if(var1 == null) {
                              break;
                           }

                           if(var13 == 0) {
                              break label110;
                           }

                           var14 = var3;
                           var10001 = var4;
                           var10002 = var5;
                        }

                        class_1069 var6 = var14.method_104(var10001, var10002);
                        if(var1 == null) {
                           break label93;
                        }

                        if(var6 != null) {
                           label112: {
                              class_1069 var15 = var6;
                              if(var1 != null) {
                                 if(var6 instanceof class_1070) {
                                    break label112;
                                 }

                                 var15 = var6;
                              }

                              class_1072[] var7 = var15.method_6019();
                              int var8 = 0;

                              while(var8 < var7.length) {
                                 class_1072 var9 = var7[var8];
                                 if(var1 == null) {
                                    break label93;
                                 }

                                 if(var1 != null) {
                                    label66: {
                                       if(var9 != null) {
                                          class_1068 var10 = var9.method_6090();
                                          if(var1 == null) {
                                             break label66;
                                          }

                                          if(var10 != null) {
                                             byte[] var11 = var10.field_5619;
                                             int var12 = 0;

                                             while(var12 < var11.length) {
                                                var11[var12] = 0;
                                                ++var12;
                                                if(var1 == null) {
                                                   break label66;
                                                }

                                                if(var1 == null) {
                                                   break;
                                                }
                                             }
                                          }
                                       }

                                       ++var8;
                                    }
                                 }

                                 if(var1 == null) {
                                    break;
                                 }
                              }

                              var6.method_6021();
                           }
                        }
                     }

                     ++var5;
                  }

                  if(var1 == null) {
                     break label98;
                  }
               }
            }

            ++var4;
         } while(var1 != null);
      }

   }

   // $FF: renamed from: g (sa) void
   public void method_2115(class_689 var1) {
      label58: {
         String[] var2 = class_752.method_4253();
         boolean var10000 = this.canSkipEntityUpdate(var1);
         if(var2 != null) {
            label59: {
               if(var10000) {
                  var10000 = var1 instanceof class_752;
                  if(var2 == null) {
                     break label59;
                  }

                  if(var10000) {
                     label39: {
                        class_752 var8;
                        label60: {
                           class_752 var3 = (class_752)var1;
                           int var4 = EntityUtils.getEntityAge(var3);
                           ++var4;
                           int var7 = var3 instanceof class_779;
                           if(var2 != null) {
                              label61: {
                                 if(var7 != 0) {
                                    float var5 = var3.method_3884(1.0F);
                                    float var9;
                                    var7 = (var9 = var5 - 0.5F) == 0.0F?0:(var9 < 0.0F?-1:1);
                                    if(var2 == null) {
                                       break label61;
                                    }

                                    if(var7 > 0) {
                                       var4 += 2;
                                    }
                                 }

                                 EntityUtils.setEntityAge(var3, var4);
                                 var8 = var3;
                                 if(var2 == null) {
                                    break label60;
                                 }

                                 var7 = var3 instanceof class_753;
                              }
                           }

                           if(var7 == 0) {
                              break label39;
                           }

                           var8 = var3;
                        }

                        class_753 var6 = (class_753)var8;
                        EntityUtils.despawnEntity(var6);
                     }

                     if(var2 != null) {
                        return;
                     }
                  }
               }

               super.method_2115(var1);
               if(var2 == null) {
                  break label58;
               }

               var10000 = Config.isSmoothWorld();
            }
         }

         if(!var10000) {
            return;
         }

         Thread.currentThread();
      }

      Thread.yield();
   }

   private boolean canSkipEntityUpdate(class_689 var1) {
      String[] var2 = class_752.method_4253();
      class_689 var10000 = var1;
      if(var2 != null) {
         if(!(var1 instanceof class_752)) {
            return false;
         }

         var10000 = var1;
      }

      class_752 var3 = (class_752)var10000;
      int var11 = var3.method_4159();
      if(var2 != null) {
         if(var11 != 0) {
            return false;
         }

         var11 = var3.field_3315;
      }

      if(var2 != null) {
         if(var11 > 0) {
            return false;
         }

         var11 = var1.field_3029;
      }

      Object var12;
      label56: {
         byte var10001 = 20;
         if(var2 != null) {
            if(var11 < 20) {
               return false;
            }

            var12 = this.field_1807;
            if(var2 == null) {
               break label56;
            }

            var11 = this.field_1807.size();
            var10001 = 1;
         }

         if(var11 != var10001) {
            return false;
         }

         var12 = this.field_1807.get(0);
      }

      class_689 var4 = (class_689)var12;
      double var5 = Math.abs(var1.field_2994 - var4.field_2994) - 16.0D;
      double var7 = Math.abs(var1.field_2996 - var4.field_2996) - 16.0D;
      double var9 = var5 * var5 + var7 * var7;
      boolean var13 = var1.method_3901(var9);
      if(var2 != null) {
         var13 = !var13;
      }

      return var13;
   }

   // $FF: renamed from: C () void
   protected void method_2142() {
      String[] var1;
      int var10;
      label91: {
         String[] var10000 = class_752.method_4253();
         super.method_2142();
         var1 = var10000;
         this.limitedChunkSet.clear();
         int var2 = this.method_2143();
         var10 = var2;
         int var10001 = 10;
         if(var1 != null) {
            if(var2 <= 10) {
               return;
            }

            var10 = var2;
            if(var1 == null) {
               break label91;
            }

            var10001 = this.lastViewDistance;
         }

         if(var10 != var10001) {
            this.lastViewDistance = var2;
            this.allChunksTicked = false;
            if(var1 != null) {
               return;
            }
         }

         var10 = this.allChunksTicked;
      }

      if(var1 != null) {
         if(var10 == 0) {
            this.allChunksTicked = true;
            if(var1 != null) {
               return;
            }
         }

         var10 = 0;
      }

      int var3 = var10;

      label68:
      while(true) {
         var10 = var3;

         label65:
         while(var10 < this.field_1807.size()) {
            class_792 var4 = (class_792)this.field_1807.get(var3);
            int var5 = class_1715.method_9561(var4.field_2994 / 16.0D);
            int var6 = class_1715.method_9561(var4.field_2996 / 16.0D);
            byte var7 = 10;
            var10 = -var7;
            if(var1 == null) {
               break label68;
            }

            int var8 = var10;

            while(var8 <= var7) {
               var10 = -var7;
               if(var1 == null) {
                  continue label65;
               }

               int var9 = var10;

               while(true) {
                  if(var9 <= var7) {
                     Set var12 = this.limitedChunkSet;
                     class_1035 var11 = new class_1035;
                     var11.method_5856(var8 + var5, var9 + var6);
                     var12.add(var11);
                     ++var9;
                     if(var1 == null) {
                        break;
                     }

                     if(var1 != null) {
                        continue;
                     }
                  }

                  ++var8;
                  break;
               }

               if(var1 == null) {
                  break;
               }
            }

            ++var3;
            if(var1 != null) {
               continue label68;
            }
            break;
         }

         var10 = this.setChunkCoordsToTickOnce.size();
         break;
      }

      if(var1 != null) {
         if(var10 <= 0) {
            return;
         }

         this.limitedChunkSet.addAll(this.setChunkCoordsToTickOnce);
      }

      this.setChunkCoordsToTickOnce.clear();
   }

   public void addChunkToTickOnce(int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = this.method_2143();
      String[] var3 = var10000;
      if(var3 != null && var4 > 10) {
         Set var5 = this.setChunkCoordsToTickOnce;
         class_1035 var10001 = new class_1035;
         var10001.method_5856(var1, var2);
         var5.add(var10001);
      }

   }

   // $FF: renamed from: g () void
   protected void method_2145() {
      String[] var10000 = class_752.method_4253();
      Set var2 = this.field_1833;
      String[] var1 = var10000;
      WorldServerOF var3 = this;
      if(var1 != null) {
         if(this.limitedChunkSet.size() > 0) {
            this.field_1833 = this.limitedChunkSet;
         }

         super.method_2145();
         var3 = this;
      }

      var3.field_1833 = var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2226() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_2263(Exception var0) {
      return var0;
   }
}
