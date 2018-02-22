import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: jw
public class class_1269 extends class_1265 {

   // $FF: renamed from: f org.apache.logging.log4j.Logger
   private static final Logger field_6578;
   // $FF: renamed from: g jm
   private class_1265 field_6579;
   // $FF: renamed from: i java.lang.String
   private static final String field_6580 = "old! ";


   // $FF: renamed from: <init> (long, jm, jm) void
   public void method_6690(long var1, class_1265 var3, class_1265 var4) {
      super.method_6675(var1);
      this.field_6573 = var3;
      this.field_6579 = var4;
   }

   // $FF: renamed from: b (int, int, int, int) int[]
   public int[] method_6679(int var1, int var2, int var3, int var4) {
      int[] var6 = this.field_6573.method_6679(var1 - 1, var2 - 1, var3 + 2, var4 + 2);
      int[] var7 = this.field_6579.method_6679(var1 - 1, var2 - 1, var3 + 2, var4 + 2);
      String[] var10000 = class_752.method_4253();
      int[] var8 = class_1323.method_6956(var3 * var4);
      String[] var5 = var10000;
      int var9 = 0;

      do {
         int var20 = var9;

         label345:
         while(true) {
            if(var20 >= var4) {
               return var8;
            }

            int var10 = 0;

            while(true) {
               if(var10 >= var3) {
                  break label345;
               }

               this.method_6677((long)(var10 + var1), (long)(var9 + var2));
               int var11 = var6[var10 + 1 + (var9 + 1) * (var3 + 2)];
               int var12 = var7[var10 + 1 + (var9 + 1) * (var3 + 2)];
               var20 = (var12 - 2) % 29;
               if(var5 == null) {
                  break;
               }

               if(var5 != null) {
                  var20 = var20 == 0?1:0;
               }

               int var13 = var20;
               var20 = var11;
               if(var5 != null) {
                  if(var11 > 255) {
                     field_6578.debug("old! " + var11);
                  }

                  var20 = var11;
               }

               label355: {
                  if(var5 != null) {
                     label335: {
                        if(var20 != 0) {
                           var20 = var12;
                           if(var5 == null) {
                              break label335;
                           }

                           if(var12 >= 2) {
                              var20 = (var12 - 2) % 29;
                              if(var5 == null) {
                                 break label335;
                              }

                              if(var20 == 1) {
                                 var20 = var11;
                                 if(var5 == null) {
                                    break label335;
                                 }

                                 if(var11 < 128) {
                                    if(class_985.method_5725(var11 + 128) != null) {
                                       var8[var10 + var9 * var3] = var11 + 128;
                                       if(var5 != null) {
                                          break label355;
                                       }
                                    }

                                    var8[var10 + var9 * var3] = var11;
                                    if(var5 != null) {
                                       break label355;
                                    }
                                 }
                              }
                           }
                        }

                        var20 = this.method_6678(3);
                     }
                  }

                  label356: {
                     if(var5 != null) {
                        label315: {
                           if(var20 != 0) {
                              var20 = var13;
                              if(var5 == null) {
                                 break label315;
                              }

                              if(var13 == 0) {
                                 break label356;
                              }
                           }

                           var20 = var11;
                        }
                     }

                     int var14;
                     int var15;
                     int var10001;
                     label304: {
                        label357: {
                           var14 = var20;
                           var20 = var11;
                           var10001 = class_985.field_4990.field_5050;
                           if(var5 != null) {
                              if(var11 == class_985.field_4990.field_5050) {
                                 var14 = class_985.field_5005.field_5050;
                                 if(var5 != null) {
                                    break label357;
                                 }
                              }

                              var20 = var11;
                              var10001 = class_985.field_4992.field_5050;
                           }

                           if(var5 != null) {
                              if(var20 == var10001) {
                                 var14 = class_985.field_5006.field_5050;
                                 if(var5 != null) {
                                    break label357;
                                 }
                              }

                              var20 = var11;
                              var10001 = class_985.field_5015.field_5050;
                           }

                           if(var5 != null) {
                              if(var20 == var10001) {
                                 var14 = class_985.field_5016.field_5050;
                                 if(var5 != null) {
                                    break label357;
                                 }
                              }

                              var20 = var11;
                              var10001 = class_985.field_5017.field_5050;
                           }

                           if(var5 != null) {
                              if(var20 == var10001) {
                                 var14 = class_985.field_4989.field_5050;
                                 if(var5 != null) {
                                    break label357;
                                 }
                              }

                              var20 = var11;
                              var10001 = class_985.field_4993.field_5050;
                           }

                           if(var5 != null) {
                              if(var20 == var10001) {
                                 var14 = class_985.field_5007.field_5050;
                                 if(var5 != null) {
                                    break label357;
                                 }
                              }

                              var20 = var11;
                              var10001 = class_985.field_5020.field_5050;
                           }

                           if(var5 != null) {
                              if(var20 == var10001) {
                                 var14 = class_985.field_5021.field_5050;
                                 if(var5 != null) {
                                    break label357;
                                 }
                              }

                              var20 = var11;
                              var10001 = class_985.field_5018.field_5050;
                           }

                           if(var5 != null) {
                              if(var20 == var10001) {
                                 var14 = class_985.field_5019.field_5050;
                                 if(var5 != null) {
                                    break label357;
                                 }
                              }

                              var20 = var11;
                              var10001 = class_985.field_4989.field_5050;
                           }

                           if(var5 != null) {
                              if(var20 == var10001) {
                                 var20 = this.method_6678(3);
                                 if(var5 != null) {
                                    if(var20 == 0) {
                                       var14 = class_985.field_5006.field_5050;
                                       if(var5 != null) {
                                          break label357;
                                       }
                                    }

                                    var20 = class_985.field_4992.field_5050;
                                 }

                                 var14 = var20;
                                 if(var5 != null) {
                                    break label357;
                                 }
                              }

                              var20 = var11;
                              var10001 = class_985.field_5000.field_5050;
                           }

                           if(var5 != null) {
                              if(var20 == var10001) {
                                 var14 = class_985.field_5001.field_5050;
                                 if(var5 != null) {
                                    break label357;
                                 }
                              }

                              var20 = var11;
                              var10001 = class_985.field_5009.field_5050;
                           }

                           if(var5 != null) {
                              if(var20 == var10001) {
                                 var14 = class_985.field_5010.field_5050;
                                 if(var5 != null) {
                                    break label357;
                                 }
                              }

                              var20 = var11;
                              var10001 = class_985.field_4988.field_5050;
                           }

                           if(var5 != null) {
                              if(var20 == var10001) {
                                 var14 = class_985.field_5012.field_5050;
                                 if(var5 != null) {
                                    break label357;
                                 }
                              }

                              var20 = var11;
                              var10001 = class_985.field_4991.field_5050;
                           }

                           if(var5 != null) {
                              if(var20 == var10001) {
                                 var14 = class_985.field_5022.field_5050;
                                 if(var5 != null) {
                                    break label357;
                                 }
                              }

                              var20 = var11;
                              var10001 = class_985.field_5023.field_5050;
                           }

                           if(var5 != null) {
                              if(var20 == var10001) {
                                 var14 = class_985.field_5024.field_5050;
                                 if(var5 != null) {
                                    break label357;
                                 }
                              }

                              var20 = var11;
                              var10001 = class_985.field_5026.field_5050;
                           }

                           var20 = method_6680(var20, var10001);
                           if(var5 != null) {
                              if(var20 != 0) {
                                 var14 = class_985.field_5025.field_5050;
                                 if(var5 != null) {
                                    break label357;
                                 }
                              }

                              var20 = var11;
                           }

                           if(var5 == null) {
                              break label304;
                           }

                           if(var20 == class_985.field_5012.field_5050) {
                              var20 = this.method_6678(3);
                              if(var5 == null) {
                                 break label304;
                              }

                              if(var20 == 0) {
                                 label207: {
                                    var15 = this.method_6678(2);
                                    var20 = var15;
                                    if(var5 != null) {
                                       if(var15 == 0) {
                                          var14 = class_985.field_4989.field_5050;
                                          if(var5 != null) {
                                             break label207;
                                          }
                                       }

                                       var20 = class_985.field_4992.field_5050;
                                    }

                                    var14 = var20;
                                 }
                              }
                           }
                        }

                        var20 = var13;
                     }

                     label358: {
                        label359: {
                           label360: {
                              if(var5 != null) {
                                 if(var20 != 0) {
                                    var20 = var14;
                                    var10001 = var11;
                                    if(var5 == null) {
                                       break label360;
                                    }

                                    if(var14 != var11) {
                                       label184: {
                                          var20 = var14 + 128;
                                          if(var5 != null) {
                                             if(class_985.method_5725(var20) != null) {
                                                var14 += 128;
                                                if(var5 != null) {
                                                   break label184;
                                                }
                                             }

                                             var20 = var11;
                                          }

                                          var14 = var20;
                                       }
                                    }
                                 }

                                 var20 = var14;
                              }

                              if(var5 == null) {
                                 break label359;
                              }

                              var10001 = var11;
                           }

                           if(var20 == var10001) {
                              var8[var10 + var9 * var3] = var11;
                              if(var5 != null) {
                                 break label358;
                              }
                           }

                           var20 = var6[var10 + 1 + (var9 + 1 - 1) * (var3 + 2)];
                        }

                        var15 = var20;
                        int var16 = var6[var10 + 1 + 1 + (var9 + 1) * (var3 + 2)];
                        int var17 = var6[var10 + 1 - 1 + (var9 + 1) * (var3 + 2)];
                        int var18 = var6[var10 + 1 + (var9 + 1 + 1) * (var3 + 2)];
                        int var19 = 0;
                        var20 = method_6680(var15, var11);
                        if(var5 != null) {
                           if(var20 != 0) {
                              ++var19;
                           }

                           var20 = method_6680(var16, var11);
                        }

                        if(var5 != null) {
                           if(var20 != 0) {
                              ++var19;
                           }

                           var20 = method_6680(var17, var11);
                        }

                        if(var5 != null) {
                           if(var20 != 0) {
                              ++var19;
                           }

                           var20 = method_6680(var18, var11);
                        }

                        if(var5 != null) {
                           if(var20 != 0) {
                              ++var19;
                           }

                           var20 = var19;
                        }

                        if(var20 >= 3) {
                           var8[var10 + var9 * var3] = var14;
                           if(var5 != null) {
                              break label358;
                           }
                        }

                        var8[var10 + var9 * var3] = var11;
                     }

                     if(var5 != null) {
                        break label355;
                     }
                  }

                  var8[var10 + var9 * var3] = var11;
               }

               ++var10;
               if(var5 == null) {
                  break label345;
               }
            }
         }

         ++var9;
      } while(var5 != null);

      return var8;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6685() {
      boolean var10000 = true;
      char[] var10003 = "«ïüT".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_6580 = (new String((char[])var3)).intern();
            field_6578 = LogManager.getLogger();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 169;
            break;
         case 1:
            var10009 = 238;
            break;
         case 2:
            var10009 = 23;
            break;
         case 3:
            var10009 = 176;
            break;
         case 4:
            var10009 = 25;
            break;
         case 5:
            var10009 = 220;
            break;
         default:
            var10009 = 60;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
