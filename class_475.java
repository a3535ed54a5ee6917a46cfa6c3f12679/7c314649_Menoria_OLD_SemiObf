import java.util.Iterator;
import java.util.Random;

// $FF: renamed from: ej
public class class_475 extends class_473 {

   // $FF: renamed from: M java.lang.String
   private static final String field_2245;
   // $FF: renamed from: N java.lang.String[]
   private static final String[] field_2246;


   // $FF: renamed from: <init> () void
   protected void method_2826() {
      super.method_2427(awt.field_4186);
      this.method_2443(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return -1;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      label35: {
         String[] var5;
         label34: {
            label33: {
               label32: {
                  String[] var10000 = class_752.method_4253();
                  int var6 = var1.method_33(var2, var3, var4) & 7;
                  var5 = var10000;
                  if(var5 != null) {
                     switch(var6) {
                     case 1:
                     default:
                        this.method_2443(0.25F, 0.0F, 0.25F, 0.75F, 0.5F, 0.75F);
                        break;
                     case 2:
                        break label32;
                     case 3:
                        break label33;
                     case 4:
                        break label34;
                     case 5:
                        break label35;
                     }
                  }

                  if(var5 != null) {
                     return;
                  }
               }

               this.method_2443(0.25F, 0.25F, 0.5F, 0.75F, 0.75F, 1.0F);
               if(var5 != null) {
                  return;
               }
            }

            this.method_2443(0.25F, 0.25F, 0.0F, 0.75F, 0.75F, 0.5F);
            if(var5 != null) {
               return;
            }
         }

         this.method_2443(0.5F, 0.25F, 0.25F, 1.0F, 0.75F, 0.75F);
         if(var5 != null) {
            return;
         }
      }

      this.method_2443(0.0F, 0.25F, 0.25F, 0.5F, 0.75F, 0.75F);
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      this.method_2486(var1, var2, var3, var4);
      return super.method_2452(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      int var7 = class_1715.method_9561((double)(var5.field_3000 * 4.0F / 360.0F) + 2.5D) & 3;
      var1.method_2055(var2, var3, var4, var7, 2);
   }

   // $FF: renamed from: a (ahb, int) gi
   public class_580 method_124(ahb var1, int var2) {
      class_581 var10000 = new class_581;
      var10000.getBlock88();
      return var10000;
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return class_1010.field_5253;
   }

   // $FF: renamed from: k (ahb, int, int, int) int
   public int method_2518(ahb var1, int var2, int var3, int var4) {
      int var8;
      label24: {
         String[] var10000 = class_752.method_4253();
         class_580 var6 = var1.method_31(var2, var3, var4);
         String[] var5 = var10000;
         class_580 var7 = var6;
         if(var5 != null) {
            if(var6 == null) {
               break label24;
            }

            var7 = var6;
         }

         var8 = var7 instanceof class_581;
         if(var5 == null) {
            return var8;
         }

         if(var8 != 0) {
            var8 = ((class_581)var6).method_3114();
            return var8;
         }
      }

      var8 = super.method_2518(var1, var2, var3, var4);
      return var8;
   }

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      return var1;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, int) void
   public void method_2467(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {}

   // $FF: renamed from: a (ahb, int, int, int, int, yz) void
   public void method_2522(ahb var1, int var2, int var3, int var4, int var5, class_792 var6) {
      String[] var7 = class_752.method_4253();
      if(var7 != null) {
         if(var6.field_3640.field_2839) {
            var5 |= 8;
            var1.method_2055(var2, var3, var4, var5, 4);
         }

         super.method_2522(var1, var2, var3, var4, var5, var6);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      String[] var7 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var7 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var6 & 8;
      }

      if(var10000 == 0) {
         add var8;
         label21: {
            add var11 = new add;
            var11.method_3726(class_1010.field_5253, 1, this.method_2518(var1, var2, var3, var4));
            var8 = var11;
            class_581 var9 = (class_581)var1.method_31(var2, var3, var4);
            class_581 var12 = var9;
            if(var7 != null) {
               if(var9.method_3114() != 3) {
                  break label21;
               }

               var12 = var9;
            }

            if(var12.method_3110() != null) {
               class_1583 var10001 = new class_1583;
               var10001.method_8628();
               var8.method_3769(var10001);
               class_1583 var14 = new class_1583;
               var14.method_8628();
               class_1583 var10 = var14;
               class_1570.method_8625(var10, var9.method_3110());
               var14 = var8.method_3767();
               String[] var13 = field_2246;
               var14.method_8664("SkullOwner", var10);
            }
         }

         this.method_2468(var1, var2, var3, var4, var8);
      }

      super.method_2462(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return class_1010.field_5253;
   }

   // $FF: renamed from: b (ahb, int, int, int, gz) void
   public void method_2827(ahb var1, int var2, int var3, int var4, class_581 var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5.method_3114();
      byte var10001 = 1;
      if(var6 != null) {
         if(var10000 != 1) {
            return;
         }

         var10000 = var3;
         var10001 = 2;
      }

      if(var10000 >= var10001) {
         ahb var13 = var1;
         if(var6 != null) {
            if(var1.field_1818 == class_918.field_4627) {
               return;
            }

            var13 = var1;
         }

         byte var14 = var13.field_1832;
         if(var6 != null) {
            if(var13.field_1832 != 0) {
               return;
            }

            var14 = -2;
         }

         int var7 = var14;

         class_791 var8;
         Iterator var9;
         class_792 var10;
         int var11;
         aji var15;
         aji var16;
         byte var17;
         class_791 var19;
         while(true) {
            if(var7 <= 0) {
               var16 = var1.getBlock(var2, var3 - 1, var4 + var7);
               var15 = class_1192.field_6114;
               if(var6 == null) {
                  break;
               }

               label256: {
                  if(var6 != null) {
                     if(var16 != class_1192.field_6114) {
                        break label256;
                     }

                     var16 = var1.getBlock(var2, var3 - 1, var4 + var7 + 1);
                     var15 = class_1192.field_6114;
                  }

                  if(var6 != null) {
                     if(var16 != var15) {
                        break label256;
                     }

                     var16 = var1.getBlock(var2, var3 - 2, var4 + var7 + 1);
                     var15 = class_1192.field_6114;
                  }

                  if(var6 != null) {
                     if(var16 != var15) {
                        break label256;
                     }

                     var16 = var1.getBlock(var2, var3 - 1, var4 + var7 + 2);
                     var15 = class_1192.field_6114;
                  }

                  if(var16 == var15) {
                     label257: {
                        var17 = this.method_2828(var1, var2, var3, var4 + var7, 1);
                        if(var6 != null) {
                           if(var17 == 0) {
                              break label257;
                           }

                           var17 = this.method_2828(var1, var2, var3, var4 + var7 + 1, 1);
                        }

                        if(var6 != null) {
                           if(var17 == 0) {
                              break label257;
                           }

                           var17 = this.method_2828(var1, var2, var3, var4 + var7 + 2, 1);
                        }

                        if(var6 != null) {
                           if(var17 == 0) {
                              break label257;
                           }

                           var1.method_2055(var2, var3, var4 + var7, 8, 2);
                           var1.method_2055(var2, var3, var4 + var7 + 1, 8, 2);
                           var1.method_2055(var2, var3, var4 + var7 + 2, 8, 2);
                           var1.method_2054(var2, var3, var4 + var7, method_2416(0), 0, 2);
                           var1.method_2054(var2, var3, var4 + var7 + 1, method_2416(0), 0, 2);
                           var1.method_2054(var2, var3, var4 + var7 + 2, method_2416(0), 0, 2);
                           var1.method_2054(var2, var3 - 1, var4 + var7, method_2416(0), 0, 2);
                           var1.method_2054(var2, var3 - 1, var4 + var7 + 1, method_2416(0), 0, 2);
                           var1.method_2054(var2, var3 - 1, var4 + var7 + 2, method_2416(0), 0, 2);
                           var1.method_2054(var2, var3 - 2, var4 + var7 + 1, method_2416(0), 0, 2);
                           var17 = var1.field_1832;
                        }

                        if(var6 != null) {
                           if(var17 == 0) {
                              var19 = new class_791;
                              var19.method_3847(var1);
                              var8 = var19;
                              var8.method_3887((double)var2 + 0.5D, (double)var3 - 1.45D, (double)(var4 + var7) + 1.5D, 90.0F, 0.0F);
                              var8.field_3330 = 90.0F;
                              var8.method_4540();
                              if(var6 != null) {
                                 label114: {
                                    if(!var1.field_1832) {
                                       var9 = var1.method_2157(class_792.class, var8.field_3004.method_7097(50.0D, 50.0D, 50.0D)).iterator();

                                       while(var9.hasNext()) {
                                          var10 = (class_792)var9.next();
                                          var10.method_4614(class_1600.field_8359);
                                          if(var6 == null) {
                                             break label114;
                                          }

                                          if(var6 == null) {
                                             break;
                                          }
                                       }
                                    }

                                    var1.method_2089(var8);
                                 }
                              }
                           }

                           var17 = 0;
                        }

                        var11 = var17;

                        while(true) {
                           if(var11 < 120) {
                              String[] var12 = field_2246;
                              var1.method_2087("snowballpoof", (double)var2 + var1.field_1819.nextDouble(), (double)(var3 - 2) + var1.field_1819.nextDouble() * 3.9D, (double)(var4 + var7 + 1) + var1.field_1819.nextDouble(), 0.0D, 0.0D, 0.0D);
                              ++var11;
                              if(var6 == null) {
                                 break;
                              }

                              if(var6 != null) {
                                 continue;
                              }
                           }

                           var1.method_2060(var2, var3, var4 + var7, method_2416(0));
                           var1.method_2060(var2, var3, var4 + var7 + 1, method_2416(0));
                           var1.method_2060(var2, var3, var4 + var7 + 2, method_2416(0));
                           var1.method_2060(var2, var3 - 1, var4 + var7, method_2416(0));
                           var1.method_2060(var2, var3 - 1, var4 + var7 + 1, method_2416(0));
                           var1.method_2060(var2, var3 - 1, var4 + var7 + 2, method_2416(0));
                           var1.method_2060(var2, var3 - 2, var4 + var7 + 1, method_2416(0));
                           break;
                        }

                        return;
                     }
                  }
               }

               ++var7;
               if(var6 != null) {
                  continue;
               }

               var7 = -2;
            } else {
               var7 = -2;
            }

            if(var7 > 0) {
               return;
            }

            var16 = var1.getBlock(var2 + var7, var3 - 1, var4);
            var15 = class_1192.field_6114;
            break;
         }

         while(true) {
            label260: {
               if(var6 != null) {
                  if(var16 != var15) {
                     break label260;
                  }

                  var16 = var1.getBlock(var2 + var7 + 1, var3 - 1, var4);
                  var15 = class_1192.field_6114;
               }

               if(var6 != null) {
                  if(var16 != var15) {
                     break label260;
                  }

                  var16 = var1.getBlock(var2 + var7 + 1, var3 - 2, var4);
                  var15 = class_1192.field_6114;
               }

               if(var6 != null) {
                  if(var16 != var15) {
                     break label260;
                  }

                  var16 = var1.getBlock(var2 + var7 + 2, var3 - 1, var4);
                  var15 = class_1192.field_6114;
               }

               if(var16 == var15) {
                  label261: {
                     var17 = this.method_2828(var1, var2 + var7, var3, var4, 1);
                     if(var6 != null) {
                        if(var17 == 0) {
                           break label261;
                        }

                        var17 = this.method_2828(var1, var2 + var7 + 1, var3, var4, 1);
                     }

                     if(var6 != null) {
                        if(var17 == 0) {
                           break label261;
                        }

                        var17 = this.method_2828(var1, var2 + var7 + 2, var3, var4, 1);
                     }

                     if(var6 != null) {
                        if(var17 == 0) {
                           break label261;
                        }

                        var1.method_2055(var2 + var7, var3, var4, 8, 2);
                        var1.method_2055(var2 + var7 + 1, var3, var4, 8, 2);
                        var1.method_2055(var2 + var7 + 2, var3, var4, 8, 2);
                        var1.method_2054(var2 + var7, var3, var4, method_2416(0), 0, 2);
                        var1.method_2054(var2 + var7 + 1, var3, var4, method_2416(0), 0, 2);
                        var1.method_2054(var2 + var7 + 2, var3, var4, method_2416(0), 0, 2);
                        var1.method_2054(var2 + var7, var3 - 1, var4, method_2416(0), 0, 2);
                        var1.method_2054(var2 + var7 + 1, var3 - 1, var4, method_2416(0), 0, 2);
                        var1.method_2054(var2 + var7 + 2, var3 - 1, var4, method_2416(0), 0, 2);
                        var1.method_2054(var2 + var7 + 1, var3 - 2, var4, method_2416(0), 0, 2);
                        var17 = var1.field_1832;
                     }

                     if(var6 != null) {
                        if(var17 == 0) {
                           var19 = new class_791;
                           var19.method_3847(var1);
                           var8 = var19;
                           var8.method_3887((double)(var2 + var7) + 1.5D, (double)var3 - 1.45D, (double)var4 + 0.5D, 0.0F, 0.0F);
                           var8.method_4540();
                           if(var6 != null) {
                              label140: {
                                 if(!var1.field_1832) {
                                    var9 = var1.method_2157(class_792.class, var8.field_3004.method_7097(50.0D, 50.0D, 50.0D)).iterator();

                                    while(var9.hasNext()) {
                                       var10 = (class_792)var9.next();
                                       var10.method_4614(class_1600.field_8359);
                                       if(var6 == null) {
                                          break label140;
                                       }

                                       if(var6 == null) {
                                          break;
                                       }
                                    }
                                 }

                                 var1.method_2089(var8);
                              }
                           }
                        }

                        var17 = 0;
                     }

                     var11 = var17;

                     while(true) {
                        if(var11 < 120) {
                           String[] var18 = field_2246;
                           var1.method_2087("snowballpoof", (double)(var2 + var7 + 1) + var1.field_1819.nextDouble(), (double)(var3 - 2) + var1.field_1819.nextDouble() * 3.9D, (double)var4 + var1.field_1819.nextDouble(), 0.0D, 0.0D, 0.0D);
                           ++var11;
                           if(var6 == null) {
                              break;
                           }

                           if(var6 != null) {
                              continue;
                           }
                        }

                        var1.method_2060(var2 + var7, var3, var4, method_2416(0));
                        var1.method_2060(var2 + var7 + 1, var3, var4, method_2416(0));
                        var1.method_2060(var2 + var7 + 2, var3, var4, method_2416(0));
                        var1.method_2060(var2 + var7, var3 - 1, var4, method_2416(0));
                        var1.method_2060(var2 + var7 + 1, var3 - 1, var4, method_2416(0));
                        var1.method_2060(var2 + var7 + 2, var3 - 1, var4, method_2416(0));
                        var1.method_2060(var2 + var7 + 1, var3 - 2, var4, method_2416(0));
                        break;
                     }

                     return;
                  }
               }
            }

            ++var7;
            if(var6 == null || var7 > 0) {
               break;
            }

            var16 = var1.getBlock(var2 + var7, var3 - 1, var4);
            var15 = class_1192.field_6114;
         }
      }

   }

   // $FF: renamed from: h (ahb, int, int, int, int) boolean
   private boolean method_2828(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      ahb var10000 = var1;
      int var10001 = var2;
      int var10002 = var3;
      int var10003 = var4;
      if(var6 != null) {
         if(var1.getBlock(var2, var3, var4) != this) {
            return false;
         }

         var10000 = var1;
         var10001 = var2;
         var10002 = var3;
         var10003 = var4;
      }

      int var9;
      label48: {
         class_580 var7 = var10000.method_31(var10001, var10002, var10003);
         class_580 var8 = var7;
         if(var6 != null) {
            if(var7 == null) {
               break label48;
            }

            var8 = var7;
         }

         var9 = var8 instanceof class_581;
         if(var6 != null) {
            if(var9 == 0) {
               break label48;
            }

            var9 = ((class_581)var7).method_3114();
         }

         if(var6 != null) {
            var9 = var9 == var5?1:0;
         }

         return (boolean)var9;
      }

      var9 = 0;
      return (boolean)var9;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {}

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      return class_1192.field_6114.getBlockTextureFromSide(var1);
   }

   // $FF: renamed from: O () java.lang.String
   public String getItemIconName() {
      return this.method_2533() + "_" + class_514.field_2353[0];
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "f\\ºV¨Ñ4[R½\fFY M¦ÿ/YG U¢v{\nô®sÿ\r";
      int var4 = "f\\ºV¨Ñ4[R½\fFY M¦ÿ/YG U¢v{\nô®sÿ\r".length();
      char var1 = 10;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2246 = var5;
                  String[] var10 = field_2246;
                  field_2245 = "CL_00000307";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 221;
               break;
            case 1:
               var10009 = 223;
               break;
            case 2:
               var10009 = 39;
               break;
            case 3:
               var10009 = 210;
               break;
            case 4:
               var10009 = 44;
               break;
            case 5:
               var10009 = 118;
               break;
            default:
               var10009 = 171;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
