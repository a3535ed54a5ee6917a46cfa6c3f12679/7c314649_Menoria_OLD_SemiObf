import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ConnectedTextures {

   private static ConnectedProperties[][] blockProperties;
   private static ConnectedProperties[][] tileProperties;
   private static boolean multipass;
   private static final int BOTTOM = 0;
   private static final int TOP = 1;
   private static final int EAST = 2;
   private static final int WEST = 3;
   private static final int NORTH = 4;
   private static final int SOUTH = 5;
   private static final int Y_NEG = 0;
   private static final int Y_POS = 1;
   private static final int Z_NEG = 2;
   private static final int Z_POS = 3;
   private static final int X_NEG = 4;
   private static final int X_POS = 5;
   private static final int Y_AXIS = 0;
   private static final int Z_AXIS = 1;
   private static final int X_AXIS = 2;
   private static final String[] propSuffixes;
   private static final int[] ctmIndexes;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_9511;


   // $FF: renamed from: <init> () void
   public void method_10075() {
      super();
   }

   public static class_73 getConnectedTexture(ahl var0, aji var1, int var2, int var3, int var4, int var5, class_73 var6) {
      String[] var7 = class_752.method_4253();
      ahl var10000 = var0;
      if(var7 != null) {
         if(var0 == null) {
            return var6;
         }

         var10000 = var0;
      }

      class_73 var8 = getConnectedTextureSingle(var10000, var1, var2, var3, var4, var5, var6, true);
      if(!multipass) {
         return var8;
      } else {
         class_73 var12 = var8;
         if(var7 != null) {
            if(var8 == var6) {
               return var8;
            }

            var12 = var8;
         }

         class_73 var9 = var12;
         int var10 = 0;

         while(true) {
            if(var10 < 3) {
               label50: {
                  class_73 var11 = getConnectedTextureSingle(var0, var1, var2, var3, var4, var5, var9, false);
                  var12 = var11;
                  if(var7 == null) {
                     break;
                  }

                  if(var7 != null) {
                     if(var11 == var9 && var7 != null) {
                        break label50;
                     }

                     var12 = var11;
                  }

                  var9 = var12;
                  ++var10;
                  if(var7 != null) {
                     continue;
                  }
               }
            }

            var12 = var9;
            break;
         }

         return var12;
      }
   }

   public static class_73 getConnectedTextureSingle(ahl var0, aji var1, int var2, int var3, int var4, int var5, class_73 var6, boolean var7) {
      String[] var8 = class_752.method_4253();
      class_73 var10000 = var6;
      if(var8 != null) {
         if(!(var6 instanceof bqd)) {
            return var6;
         }

         var10000 = var6;
      }

      bqd var9 = (bqd)var10000;
      int var10 = var9.getIndexInMap();
      int var11 = -1;
      ConnectedProperties[][] var17 = tileProperties;
      int var18;
      if(var8 != null) {
         label102: {
            if(tileProperties != null) {
               label107: {
                  var18 = bmh.instance.defaultTexture;
                  if(var8 != null) {
                     if(!bmh.instance.defaultTexture) {
                        break label107;
                     }

                     var18 = var10;
                  }

                  if(var8 != null) {
                     if(var18 < 0) {
                        break label107;
                     }

                     var18 = var10;
                  }

                  if(var18 < tileProperties.length) {
                     var17 = tileProperties;
                     if(var8 == null) {
                        break label102;
                     }

                     ConnectedProperties[] var12 = tileProperties[var10];
                     if(var12 != null) {
                        label108: {
                           label78: {
                              var18 = var11;
                              if(var8 != null) {
                                 if(var11 >= 0) {
                                    break label78;
                                 }

                                 var18 = var0.method_33(var2, var3, var4);
                              }

                              var11 = var18;
                           }

                           class_73 var13 = getConnectedTexture(var12, var0, var1, var2, var3, var4, var5, var9, var11);
                           var10000 = var13;
                           if(var8 != null) {
                              if(var13 == null) {
                                 break label108;
                              }

                              var10000 = var13;
                           }

                           return var10000;
                        }
                     }
                  }
               }
            }

            var17 = blockProperties;
         }
      }

      if(var17 != null) {
         label109: {
            var18 = var7;
            if(var8 != null) {
               if(var7 == 0) {
                  break label109;
               }

               var18 = aji.method_2415(var1);
            }

            int var15 = var18;
            var18 = var15;
            if(var8 != null) {
               if(var15 < 0) {
                  break label109;
               }

               var18 = var15;
            }

            if(var18 < blockProperties.length) {
               ConnectedProperties[] var16 = blockProperties[var15];
               if(var16 != null) {
                  label54: {
                     var18 = var11;
                     if(var8 != null) {
                        if(var11 >= 0) {
                           break label54;
                        }

                        var18 = var0.method_33(var2, var3, var4);
                     }

                     var11 = var18;
                  }

                  class_73 var14 = getConnectedTexture(var16, var0, var1, var2, var3, var4, var5, var9, var11);
                  var10000 = var14;
                  if(var8 == null) {
                     return var10000;
                  }

                  if(var14 != null) {
                     return var14;
                  }
               }
            }
         }
      }

      var10000 = var6;
      return var10000;
   }

   public static ConnectedProperties getConnectedProperties(ahl var0, aji var1, int var2, int var3, int var4, int var5, class_73 var6) {
      String[] var7 = class_752.method_4253();
      if(var0 == null) {
         return null;
      } else {
         class_73 var10000 = var6;
         if(var7 != null) {
            if(!(var6 instanceof bqd)) {
               return null;
            }

            var10000 = var6;
         }

         bqd var8 = (bqd)var10000;
         int var9 = var8.getIndexInMap();
         int var10 = -1;
         ConnectedProperties[][] var16 = tileProperties;
         int var17;
         ConnectedProperties var18;
         if(var7 != null) {
            label97: {
               if(tileProperties != null) {
                  label104: {
                     var17 = bmh.instance.defaultTexture;
                     if(var7 != null) {
                        if(!bmh.instance.defaultTexture) {
                           break label104;
                        }

                        var17 = var9;
                     }

                     if(var7 != null) {
                        if(var17 < 0) {
                           break label104;
                        }

                        var17 = var9;
                     }

                     if(var17 < tileProperties.length) {
                        var16 = tileProperties;
                        if(var7 == null) {
                           break label97;
                        }

                        ConnectedProperties[] var11 = tileProperties[var9];
                        if(var11 != null) {
                           label105: {
                              label73: {
                                 var17 = var10;
                                 if(var7 != null) {
                                    if(var10 >= 0) {
                                       break label73;
                                    }

                                    var17 = var0.method_33(var2, var3, var4);
                                 }

                                 var10 = var17;
                              }

                              ConnectedProperties var12 = getConnectedProperties(var11, var0, var1, var2, var3, var4, var5, var8, var10);
                              var18 = var12;
                              if(var7 != null) {
                                 if(var12 == null) {
                                    break label105;
                                 }

                                 var18 = var12;
                              }

                              return var18;
                           }
                        }
                     }
                  }
               }

               var16 = blockProperties;
            }
         }

         if(var16 != null) {
            int var14 = aji.method_2415(var1);
            var17 = var14;
            if(var7 != null) {
               if(var14 < 0) {
                  return null;
               }

               var17 = var14;
            }

            if(var17 < blockProperties.length) {
               ConnectedProperties[] var15 = blockProperties[var14];
               if(var15 != null) {
                  label52: {
                     var17 = var10;
                     if(var7 != null) {
                        if(var10 >= 0) {
                           break label52;
                        }

                        var17 = var0.method_33(var2, var3, var4);
                     }

                     var10 = var17;
                  }

                  ConnectedProperties var13 = getConnectedProperties(var15, var0, var1, var2, var3, var4, var5, var8, var10);
                  var18 = var13;
                  if(var7 != null) {
                     if(var13 == null) {
                        return null;
                     }

                     var18 = var13;
                  }

                  return var18;
               }
            }
         }

         return null;
      }
   }

   private static class_73 getConnectedTexture(ConnectedProperties[] var0, ahl var1, aji var2, int var3, int var4, int var5, int var6, class_73 var7, int var8) {
      String[] var10000 = class_752.method_4253();
      int var10 = 0;
      String[] var9 = var10000;

      while(var10 < var0.length) {
         label29: {
            label37: {
               ConnectedProperties var11 = var0[var10];
               ConnectedProperties var13 = var11;
               if(var9 != null) {
                  if(var11 == null && var9 != null) {
                     break label37;
                  }

                  var13 = var11;
               }

               class_73 var12 = getConnectedTexture(var13, var1, var2, var3, var4, var5, var6, var7, var8);
               if(var9 == null) {
                  break label29;
               }

               if(var12 != null) {
                  return var12;
               }
            }

            ++var10;
         }

         if(var9 == null) {
            break;
         }
      }

      return null;
   }

   private static ConnectedProperties getConnectedProperties(ConnectedProperties[] var0, ahl var1, aji var2, int var3, int var4, int var5, int var6, class_73 var7, int var8) {
      String[] var10000 = class_752.method_4253();
      int var10 = 0;
      String[] var9 = var10000;

      while(var10 < var0.length) {
         label29: {
            label37: {
               ConnectedProperties var11 = var0[var10];
               ConnectedProperties var13 = var11;
               if(var9 != null) {
                  if(var11 == null && var9 != null) {
                     break label37;
                  }

                  var13 = var11;
               }

               class_73 var12 = getConnectedTexture(var13, var1, var2, var3, var4, var5, var6, var7, var8);
               if(var9 == null) {
                  break label29;
               }

               if(var12 != null) {
                  return var11;
               }
            }

            ++var10;
         }

         if(var9 == null) {
            break;
         }
      }

      return null;
   }

   private static class_73 getConnectedTexture(ConnectedProperties var0, ahl var1, aji var2, int var3, int var4, int var5, int var6, class_73 var7, int var8) {
      String[] var9 = class_752.method_4253();
      int var10000 = var4;
      int var10001 = var0.minHeight;
      if(var9 != null) {
         if(var4 < var0.minHeight) {
            return null;
         }

         var10000 = var4;
         var10001 = var0.maxHeight;
      }

      if(var10000 <= var10001) {
         int var12;
         byte var19;
         label151: {
            if(var0.biomes != null) {
               class_985 var10 = var1.method_35(var3, var5);
               byte var11 = 0;
               var12 = 0;

               while(true) {
                  if(var12 < var0.biomes.length) {
                     label162: {
                        class_985 var13 = var0.biomes[var12];
                        if(var9 == null) {
                           break;
                        }

                        if(var9 != null) {
                           if(var10 == var13) {
                              var11 = 1;
                              if(var9 != null) {
                                 break label162;
                              }
                           }

                           ++var12;
                        }

                        if(var9 != null) {
                           continue;
                        }
                     }
                  }

                  var19 = var11;
                  if(var9 == null) {
                     break label151;
                  }

                  if(var11 == 0) {
                     return null;
                  }
                  break;
               }
            }

            var19 = 0;
         }

         int var15 = var19;
         int var16 = var8;
         var10000 = var2 instanceof class_407;
         if(var9 != null) {
            if(var10000 != 0) {
               var15 = getWoodAxis(var6, var8);
               var16 = var8 & 3;
            }

            var10000 = var2 instanceof class_359;
         }

         if(var9 != null) {
            label129: {
               if(var10000 != 0) {
                  var15 = getQuartzAxis(var6, var8);
                  var10000 = var16;
                  if(var9 == null) {
                     break label129;
                  }

                  if(var16 > 2) {
                     var16 = 2;
                  }
               }

               var10000 = var6;
            }
         }

         ConnectedProperties var20;
         label123: {
            label122: {
               if(var9 != null) {
                  if(var10000 < 0) {
                     break label122;
                  }

                  var20 = var0;
                  if(var9 == null) {
                     break label123;
                  }

                  var10000 = var0.faces;
               }

               if(var10000 != 63) {
                  var12 = var6;
                  var10000 = var15;
                  if(var9 != null) {
                     if(var15 != 0) {
                        var12 = fixSideByAxis(var6, var15);
                     }

                     var10000 = 1 << var12 & var0.faces;
                  }

                  if(var10000 == 0) {
                     return null;
                  }
               }
            }

            var20 = var0;
         }

         label164: {
            if(var9 != null) {
               if(var20.metadatas != null) {
                  int[] var18 = var0.metadatas;
                  int var17 = 0;
                  int var14 = 0;

                  while(true) {
                     if(var14 < var18.length) {
                        label166: {
                           var10000 = var18[var14];
                           if(var9 == null) {
                              break;
                           }

                           label95: {
                              if(var9 != null) {
                                 if(var10000 != var16) {
                                    break label95;
                                 }

                                 var10000 = 1;
                              }

                              var17 = var10000;
                              if(var9 != null) {
                                 break label166;
                              }
                           }

                           ++var14;
                           if(var9 != null) {
                              continue;
                           }
                        }
                     }

                     var10000 = var17;
                     break;
                  }

                  if(var9 == null) {
                     break label164;
                  }

                  if(var10000 == 0) {
                     return null;
                  }
               }

               var20 = var0;
            }

            if(var9 == null) {
               return getConnectedTextureCtm(var20, var1, var2, var3, var4, var5, var6, var7, var8);
            }

            var10000 = var20.method;
         }

         switch(var10000) {
         case 1:
            var20 = var0;
            return getConnectedTextureCtm(var20, var1, var2, var3, var4, var5, var6, var7, var8);
         case 2:
            return getConnectedTextureHorizontal(var0, var1, var2, var3, var4, var5, var15, var6, var7, var8);
         case 3:
            return getConnectedTextureTop(var0, var1, var2, var3, var4, var5, var15, var6, var7, var8);
         case 4:
            return getConnectedTextureRandom(var0, var3, var4, var5, var6);
         case 5:
            return getConnectedTextureRepeat(var0, var3, var4, var5, var6);
         case 6:
            return getConnectedTextureVertical(var0, var1, var2, var3, var4, var5, var15, var6, var7, var8);
         case 7:
            return getConnectedTextureFixed(var0);
         case 8:
            return getConnectedTextureHorizontalVertical(var0, var1, var2, var3, var4, var5, var15, var6, var7, var8);
         case 9:
            return getConnectedTextureVerticalHorizontal(var0, var1, var2, var3, var4, var5, var15, var6, var7, var8);
         default:
            return null;
         }
      } else {
         return null;
      }
   }

   private static int fixSideByAxis(int var0, int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         switch(var1) {
         case 0:
            return var0;
         case 1:
            var10000 = var0;
            if(var2 != null) {
               switch(var0) {
               case 0:
                  return 2;
               case 1:
                  return 3;
               case 2:
                  return 1;
               case 3:
                  return 0;
               default:
                  var10000 = var0;
               }
            }

            return var10000;
         case 2:
            var10000 = var0;
            if(var2 != null) {
               switch(var0) {
               case 0:
                  return 4;
               case 1:
                  return 5;
               case 2:
               case 3:
               default:
                  var10000 = var0;
                  break;
               case 4:
                  return 1;
               case 5:
                  return 0;
               }
            }

            return var10000;
         default:
            var10000 = var0;
         }
      }

      return var10000;
   }

   private static int getWoodAxis(int var0, int var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = (var1 & 12) >> 2;
      String[] var2 = var10000;
      int var4 = var3;
      if(var2 != null) {
         switch(var3) {
         case 1:
            return 2;
         case 2:
            return 1;
         default:
            var4 = 0;
         }
      }

      return var4;
   }

   private static int getQuartzAxis(int var0, int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         switch(var1) {
         case 3:
            return 2;
         case 4:
            return 1;
         default:
            var10000 = 0;
         }
      }

      return var10000;
   }

   private static class_73 getConnectedTextureRandom(ConnectedProperties var0, int var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = var0.tileIcons.length;
      int var10001 = 1;
      if(var5 != null) {
         if(var10000 == 1) {
            return var0.tileIcons[0];
         }

         var10000 = var4 / var0.symmetry;
         var10001 = var0.symmetry;
      }

      int var7;
      int var8;
      label42: {
         int var6 = var10000 * var10001;
         var7 = Config.getRandom(var1, var2, var3, var6) & Integer.MAX_VALUE;
         var8 = 0;
         if(var5 != null) {
            if(var0.weights != null) {
               break label42;
            }

            var8 = var7 % var0.tileIcons.length;
         }

         if(var5 != null) {
            return var0.tileIcons[var8];
         }
      }

      int var9 = var7 % var0.sumAllWeights;
      int[] var10 = var0.sumWeights;
      int var11 = 0;

      while(var11 < var10.length) {
         label31: {
            var10000 = var9;
            if(var5 != null) {
               if(var9 >= var10[var11]) {
                  break label31;
               }

               var10000 = var11;
            }

            var8 = var10000;
            if(var5 != null) {
               break;
            }
         }

         ++var11;
         if(var5 == null) {
            break;
         }
      }

      return var0.tileIcons[var8];
   }

   private static class_73 getConnectedTextureFixed(ConnectedProperties var0) {
      return var0.tileIcons[0];
   }

   private static class_73 getConnectedTextureRepeat(ConnectedProperties var0, int var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = var0.tileIcons.length;
      if(var5 != null) {
         if(var10000 == 1) {
            return var0.tileIcons[0];
         }

         var10000 = 0;
      }

      int var6 = var10000;
      int var7 = 0;
      var10000 = var4;
      if(var5 != null) {
         switch(var4) {
         case 0:
            var6 = var1;
            var7 = var3;
            if(var5 != null) {
               break;
            }
         case 1:
            var6 = var1;
            var7 = var3;
            if(var5 != null) {
               break;
            }
         case 2:
            var6 = -var1 - 1;
            var7 = -var2;
            if(var5 != null) {
               break;
            }
         case 3:
            var6 = var1;
            var7 = -var2;
            if(var5 != null) {
               break;
            }
         case 4:
            var6 = var3;
            var7 = -var2;
            if(var5 != null) {
               break;
            }
         case 5:
            var6 = -var3 - 1;
            var7 = -var2;
         }

         var6 %= var0.width;
         var7 %= var0.height;
         var10000 = var6;
      }

      if(var5 != null) {
         if(var10000 < 0) {
            var6 += var0.width;
         }

         var10000 = var7;
      }

      if(var5 != null) {
         if(var10000 < 0) {
            var7 += var0.height;
         }

         var10000 = var7 * var0.width + var6;
      }

      int var8 = var10000;
      return var0.tileIcons[var8];
   }

   private static class_73 getConnectedTextureCtm(ConnectedProperties var0, ahl var1, aji var2, int var3, int var4, int var5, int var6, class_73 var7, int var8) {
      String[] var10000 = class_752.method_4253();
      boolean[] var10 = new boolean[6];
      String[] var9 = var10000;
      int var13 = var6;
      if(var9 != null) {
         switch(var6) {
         case 0:
         case 1:
            var10[0] = isNeighbour(var0, var1, var2, var3 - 1, var4, var5, var6, var7, var8);
            var10[1] = isNeighbour(var0, var1, var2, var3 + 1, var4, var5, var6, var7, var8);
            var10[2] = isNeighbour(var0, var1, var2, var3, var4, var5 + 1, var6, var7, var8);
            var10[3] = isNeighbour(var0, var1, var2, var3, var4, var5 - 1, var6, var7, var8);
            if(var9 != null) {
               break;
            }
         case 2:
            var10[0] = isNeighbour(var0, var1, var2, var3 + 1, var4, var5, var6, var7, var8);
            var10[1] = isNeighbour(var0, var1, var2, var3 - 1, var4, var5, var6, var7, var8);
            var10[2] = isNeighbour(var0, var1, var2, var3, var4 - 1, var5, var6, var7, var8);
            var10[3] = isNeighbour(var0, var1, var2, var3, var4 + 1, var5, var6, var7, var8);
            if(var9 != null) {
               break;
            }
         case 3:
            var10[0] = isNeighbour(var0, var1, var2, var3 - 1, var4, var5, var6, var7, var8);
            var10[1] = isNeighbour(var0, var1, var2, var3 + 1, var4, var5, var6, var7, var8);
            var10[2] = isNeighbour(var0, var1, var2, var3, var4 - 1, var5, var6, var7, var8);
            var10[3] = isNeighbour(var0, var1, var2, var3, var4 + 1, var5, var6, var7, var8);
            if(var9 != null) {
               break;
            }
         case 4:
            var10[0] = isNeighbour(var0, var1, var2, var3, var4, var5 - 1, var6, var7, var8);
            var10[1] = isNeighbour(var0, var1, var2, var3, var4, var5 + 1, var6, var7, var8);
            var10[2] = isNeighbour(var0, var1, var2, var3, var4 - 1, var5, var6, var7, var8);
            var10[3] = isNeighbour(var0, var1, var2, var3, var4 + 1, var5, var6, var7, var8);
            if(var9 != null) {
               break;
            }
         case 5:
            var10[0] = isNeighbour(var0, var1, var2, var3, var4, var5 + 1, var6, var7, var8);
            var10[1] = isNeighbour(var0, var1, var2, var3, var4, var5 - 1, var6, var7, var8);
            var10[2] = isNeighbour(var0, var1, var2, var3, var4 - 1, var5, var6, var7, var8);
            var10[3] = isNeighbour(var0, var1, var2, var3, var4 + 1, var5, var6, var7, var8);
         }

         var13 = 0;
      }

      int var11 = var13;
      byte var14 = var10[0];
      int var10001 = var10[1];
      if(var9 != null) {
         var10001 = var10001 == 0?1:0;
      }

      var13 = var14 & var10001;
      var10001 = var10[2];
      if(var9 != null) {
         var10001 = var10001 == 0?1:0;
      }

      var13 &= var10001;
      var10001 = var10[3];
      if(var9 != null) {
         var10001 = var10001 == 0?1:0;
      }

      label1463: {
         label1586: {
            var13 &= var10001;
            if(var9 != null) {
               if(var13 != 0) {
                  var11 = 3;
                  if(var9 != null) {
                     break label1586;
                  }
               }

               var13 = var10[0];
            }

            if(var9 != null) {
               var13 = var13 == 0?1:0;
            }

            var13 &= var10[1];
            var10001 = var10[2];
            if(var9 != null) {
               var10001 = var10001 == 0?1:0;
            }

            var13 &= var10001;
            var10001 = var10[3];
            if(var9 != null) {
               var10001 = var10001 == 0?1:0;
            }

            var13 &= var10001;
            if(var9 != null) {
               if(var13 != 0) {
                  var11 = 1;
                  if(var9 != null) {
                     break label1586;
                  }
               }

               var13 = var10[0];
            }

            if(var9 != null) {
               var13 = var13 == 0?1:0;
            }

            var10001 = var10[1];
            if(var9 != null) {
               var10001 = var10001 == 0?1:0;
            }

            var13 = var13 & var10001 & var10[2];
            var10001 = var10[3];
            if(var9 != null) {
               var10001 = var10001 == 0?1:0;
            }

            var13 &= var10001;
            if(var9 != null) {
               if(var13 != 0) {
                  var11 = 12;
                  if(var9 != null) {
                     break label1586;
                  }
               }

               var13 = var10[0];
            }

            if(var9 != null) {
               var13 = var13 == 0?1:0;
            }

            var10001 = var10[1];
            if(var9 != null) {
               var10001 = var10001 == 0?1:0;
            }

            var13 &= var10001;
            var10001 = var10[2];
            if(var9 != null) {
               var10001 = var10001 == 0?1:0;
            }

            var13 = var13 & var10001 & var10[3];
            if(var9 != null) {
               if(var13 != 0) {
                  var11 = 36;
                  if(var9 != null) {
                     break label1586;
                  }
               }

               var13 = var10[0] & var10[1];
            }

            var10001 = var10[2];
            if(var9 != null) {
               var10001 = var10001 == 0?1:0;
            }

            var13 &= var10001;
            var10001 = var10[3];
            if(var9 != null) {
               var10001 = var10001 == 0?1:0;
            }

            var13 &= var10001;
            if(var9 != null) {
               if(var13 != 0) {
                  var11 = 2;
                  if(var9 != null) {
                     break label1586;
                  }
               }

               var13 = var10[0];
            }

            if(var9 != null) {
               var13 = var13 == 0?1:0;
            }

            var10001 = var10[1];
            if(var9 != null) {
               var10001 = var10001 == 0?1:0;
            }

            var13 = var13 & var10001 & var10[2] & var10[3];
            if(var9 != null) {
               if(var13 != 0) {
                  var11 = 24;
                  if(var9 != null) {
                     break label1586;
                  }
               }

               var13 = var10[0];
            }

            var10001 = var10[1];
            if(var9 != null) {
               var10001 = var10001 == 0?1:0;
            }

            var13 = var13 & var10001 & var10[2];
            var10001 = var10[3];
            if(var9 != null) {
               var10001 = var10001 == 0?1:0;
            }

            var13 &= var10001;
            if(var9 != null) {
               if(var13 != 0) {
                  var11 = 15;
                  if(var9 != null) {
                     break label1586;
                  }
               }

               var13 = var10[0];
            }

            var10001 = var10[1];
            if(var9 != null) {
               var10001 = var10001 == 0?1:0;
            }

            var13 &= var10001;
            var10001 = var10[2];
            if(var9 != null) {
               var10001 = var10001 == 0?1:0;
            }

            var13 = var13 & var10001 & var10[3];
            if(var9 != null) {
               if(var13 != 0) {
                  var11 = 39;
                  if(var9 != null) {
                     break label1586;
                  }
               }

               var13 = var10[0];
            }

            if(var9 != null) {
               var13 = var13 == 0?1:0;
            }

            var13 = var13 & var10[1] & var10[2];
            var10001 = var10[3];
            if(var9 != null) {
               var10001 = var10001 == 0?1:0;
            }

            var13 &= var10001;
            if(var9 != null) {
               if(var13 != 0) {
                  var11 = 13;
                  if(var9 != null) {
                     break label1586;
                  }
               }

               var13 = var10[0];
            }

            if(var9 != null) {
               var13 = var13 == 0?1:0;
            }

            var13 &= var10[1];
            var10001 = var10[2];
            if(var9 != null) {
               var10001 = var10001 == 0?1:0;
            }

            var13 = var13 & var10001 & var10[3];
            if(var9 != null) {
               if(var13 != 0) {
                  var11 = 37;
                  if(var9 != null) {
                     break label1586;
                  }
               }

               var13 = var10[0];
            }

            if(var9 != null) {
               var13 = var13 == 0?1:0;
            }

            var13 = var13 & var10[1] & var10[2] & var10[3];
            if(var9 != null) {
               if(var13 != 0) {
                  var11 = 25;
                  if(var9 != null) {
                     break label1586;
                  }
               }

               var13 = var10[0];
            }

            var10001 = var10[1];
            if(var9 != null) {
               var10001 = var10001 == 0?1:0;
            }

            var13 = var13 & var10001 & var10[2] & var10[3];
            if(var9 != null) {
               if(var13 != 0) {
                  var11 = 27;
                  if(var9 != null) {
                     break label1586;
                  }
               }

               var13 = var10[0] & var10[1];
            }

            var10001 = var10[2];
            if(var9 != null) {
               var10001 = var10001 == 0?1:0;
            }

            var13 = var13 & var10001 & var10[3];
            if(var9 != null) {
               if(var13 != 0) {
                  var11 = 38;
                  if(var9 != null) {
                     break label1586;
                  }
               }

               var13 = var10[0] & var10[1] & var10[2];
            }

            var10001 = var10[3];
            if(var9 != null) {
               var10001 = var10001 == 0?1:0;
            }

            var13 &= var10001;
            if(var9 != null) {
               if(var13 != 0) {
                  var11 = 14;
                  if(var9 != null) {
                     break label1586;
                  }
               }

               var13 = var10[0] & var10[1] & var10[2] & var10[3];
            }

            if(var9 == null) {
               break label1463;
            }

            if(var13 != 0) {
               var11 = 26;
            }
         }

         var13 = var11;
      }

      if(var9 != null) {
         if(var13 == 0) {
            return var0.tileIcons[var11];
         }

         var13 = Config.isConnectedTexturesFancy();
      }

      if(var9 != null) {
         if(var13 == 0) {
            return var0.tileIcons[var11];
         }

         var13 = 6;
      }

      boolean[] var12 = new boolean[var13];
      var13 = var6;
      if(var9 != null) {
         boolean var10002;
         switch(var6) {
         case 0:
         case 1:
            var10002 = isNeighbour(var0, var1, var2, var3 + 1, var4, var5 + 1, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[0] = var10002;
            var10002 = isNeighbour(var0, var1, var2, var3 - 1, var4, var5 + 1, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[1] = var10002;
            var10002 = isNeighbour(var0, var1, var2, var3 + 1, var4, var5 - 1, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[2] = var10002;
            var10002 = isNeighbour(var0, var1, var2, var3 - 1, var4, var5 - 1, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[3] = var10002;
            if(var9 != null) {
               break;
            }
         case 2:
            var10002 = isNeighbour(var0, var1, var2, var3 - 1, var4 - 1, var5, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[0] = var10002;
            var10002 = isNeighbour(var0, var1, var2, var3 + 1, var4 - 1, var5, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[1] = var10002;
            var10002 = isNeighbour(var0, var1, var2, var3 - 1, var4 + 1, var5, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[2] = var10002;
            var10002 = isNeighbour(var0, var1, var2, var3 + 1, var4 + 1, var5, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[3] = var10002;
            if(var9 != null) {
               break;
            }
         case 3:
            var10002 = isNeighbour(var0, var1, var2, var3 + 1, var4 - 1, var5, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[0] = var10002;
            var10002 = isNeighbour(var0, var1, var2, var3 - 1, var4 - 1, var5, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[1] = var10002;
            var10002 = isNeighbour(var0, var1, var2, var3 + 1, var4 + 1, var5, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[2] = var10002;
            var10002 = isNeighbour(var0, var1, var2, var3 - 1, var4 + 1, var5, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[3] = var10002;
            if(var9 != null) {
               break;
            }
         case 4:
            var10002 = isNeighbour(var0, var1, var2, var3, var4 - 1, var5 + 1, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[0] = var10002;
            var10002 = isNeighbour(var0, var1, var2, var3, var4 - 1, var5 - 1, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[1] = var10002;
            var10002 = isNeighbour(var0, var1, var2, var3, var4 + 1, var5 + 1, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[2] = var10002;
            var10002 = isNeighbour(var0, var1, var2, var3, var4 + 1, var5 - 1, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[3] = var10002;
            if(var9 != null) {
               break;
            }
         case 5:
            var10002 = isNeighbour(var0, var1, var2, var3, var4 - 1, var5 - 1, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[0] = var10002;
            var10002 = isNeighbour(var0, var1, var2, var3, var4 - 1, var5 + 1, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[1] = var10002;
            var10002 = isNeighbour(var0, var1, var2, var3, var4 + 1, var5 - 1, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[2] = var10002;
            var10002 = isNeighbour(var0, var1, var2, var3, var4 + 1, var5 + 1, var6, var7, var8);
            if(var9 != null) {
               var10002 = !var10002;
            }

            var12[3] = var10002;
         }

         var13 = var11;
      }

      byte var15 = 13;
      if(var9 != null) {
         label1265: {
            if(var13 == 13) {
               var13 = var12[0];
               if(var9 == null) {
                  break label1265;
               }

               if(var13 != 0) {
                  var11 = 4;
                  if(var9 != null) {
                     return var0.tileIcons[var11];
                  }
               }
            }

            var13 = var11;
         }

         var15 = 15;
      }

      if(var9 != null) {
         label1254: {
            if(var13 == var15) {
               var13 = var12[1];
               if(var9 == null) {
                  break label1254;
               }

               if(var13 != 0) {
                  var11 = 5;
                  if(var9 != null) {
                     return var0.tileIcons[var11];
                  }
               }
            }

            var13 = var11;
         }

         var15 = 37;
      }

      if(var9 != null) {
         label1243: {
            if(var13 == var15) {
               var13 = var12[2];
               if(var9 == null) {
                  break label1243;
               }

               if(var13 != 0) {
                  var11 = 16;
                  if(var9 != null) {
                     return var0.tileIcons[var11];
                  }
               }
            }

            var13 = var11;
         }

         var15 = 39;
      }

      if(var9 != null) {
         label1232: {
            if(var13 == var15) {
               var13 = var12[3];
               if(var9 == null) {
                  break label1232;
               }

               if(var13 != 0) {
                  var11 = 17;
                  if(var9 != null) {
                     return var0.tileIcons[var11];
                  }
               }
            }

            var13 = var11;
         }

         var15 = 14;
      }

      if(var9 != null) {
         label1221: {
            if(var13 == var15) {
               var13 = var12[0];
               if(var9 == null) {
                  break label1221;
               }

               if(var13 != 0) {
                  var13 = var12[1];
                  if(var9 == null) {
                     break label1221;
                  }

                  if(var13 != 0) {
                     var11 = 7;
                     if(var9 != null) {
                        return var0.tileIcons[var11];
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 25;
      }

      if(var9 != null) {
         label1207: {
            if(var13 == var15) {
               var13 = var12[0];
               if(var9 == null) {
                  break label1207;
               }

               if(var13 != 0) {
                  var13 = var12[2];
                  if(var9 == null) {
                     break label1207;
                  }

                  if(var13 != 0) {
                     var11 = 6;
                     if(var9 != null) {
                        return var0.tileIcons[var11];
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 27;
      }

      if(var9 != null) {
         label1193: {
            if(var13 == var15) {
               var13 = var12[3];
               if(var9 == null) {
                  break label1193;
               }

               if(var13 != 0) {
                  var13 = var12[1];
                  if(var9 == null) {
                     break label1193;
                  }

                  if(var13 != 0) {
                     var11 = 19;
                     if(var9 != null) {
                        return var0.tileIcons[var11];
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 38;
      }

      if(var9 != null) {
         label1179: {
            if(var13 == var15) {
               var13 = var12[3];
               if(var9 == null) {
                  break label1179;
               }

               if(var13 != 0) {
                  var13 = var12[2];
                  if(var9 == null) {
                     break label1179;
                  }

                  if(var13 != 0) {
                     var11 = 18;
                     if(var9 != null) {
                        return var0.tileIcons[var11];
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 14;
      }

      if(var9 != null) {
         label1165: {
            if(var13 == var15) {
               var13 = var12[0];
               if(var9 == null) {
                  break label1165;
               }

               if(var13 == 0) {
                  var13 = var12[1];
                  if(var9 == null) {
                     break label1165;
                  }

                  if(var13 != 0) {
                     var11 = 31;
                     if(var9 != null) {
                        return var0.tileIcons[var11];
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 25;
      }

      if(var9 != null) {
         label1151: {
            if(var13 == var15) {
               var13 = var12[0];
               if(var9 == null) {
                  break label1151;
               }

               if(var13 != 0) {
                  var13 = var12[2];
                  if(var9 == null) {
                     break label1151;
                  }

                  if(var13 == 0) {
                     var11 = 30;
                     if(var9 != null) {
                        return var0.tileIcons[var11];
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 27;
      }

      if(var9 != null) {
         label1137: {
            if(var13 == var15) {
               var13 = var12[3];
               if(var9 == null) {
                  break label1137;
               }

               if(var13 == 0) {
                  var13 = var12[1];
                  if(var9 == null) {
                     break label1137;
                  }

                  if(var13 != 0) {
                     var11 = 41;
                     if(var9 != null) {
                        return var0.tileIcons[var11];
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 38;
      }

      if(var9 != null) {
         label1123: {
            if(var13 == var15) {
               var13 = var12[3];
               if(var9 == null) {
                  break label1123;
               }

               if(var13 != 0) {
                  var13 = var12[2];
                  if(var9 == null) {
                     break label1123;
                  }

                  if(var13 == 0) {
                     var11 = 40;
                     if(var9 != null) {
                        return var0.tileIcons[var11];
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 14;
      }

      if(var9 != null) {
         label1109: {
            if(var13 == var15) {
               var13 = var12[0];
               if(var9 == null) {
                  break label1109;
               }

               if(var13 != 0) {
                  var13 = var12[1];
                  if(var9 == null) {
                     break label1109;
                  }

                  if(var13 == 0) {
                     var11 = 29;
                     if(var9 != null) {
                        return var0.tileIcons[var11];
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 25;
      }

      if(var9 != null) {
         label1095: {
            if(var13 == var15) {
               var13 = var12[0];
               if(var9 == null) {
                  break label1095;
               }

               if(var13 == 0) {
                  var13 = var12[2];
                  if(var9 == null) {
                     break label1095;
                  }

                  if(var13 != 0) {
                     var11 = 28;
                     if(var9 != null) {
                        return var0.tileIcons[var11];
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 27;
      }

      if(var9 != null) {
         label1081: {
            if(var13 == var15) {
               var13 = var12[3];
               if(var9 == null) {
                  break label1081;
               }

               if(var13 != 0) {
                  var13 = var12[1];
                  if(var9 == null) {
                     break label1081;
                  }

                  if(var13 == 0) {
                     var11 = 43;
                     if(var9 != null) {
                        return var0.tileIcons[var11];
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 38;
      }

      if(var9 != null) {
         label1067: {
            if(var13 == var15) {
               var13 = var12[3];
               if(var9 == null) {
                  break label1067;
               }

               if(var13 == 0) {
                  var13 = var12[2];
                  if(var9 == null) {
                     break label1067;
                  }

                  if(var13 != 0) {
                     var11 = 42;
                     if(var9 != null) {
                        return var0.tileIcons[var11];
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 26;
      }

      if(var9 != null) {
         label1053: {
            if(var13 == var15) {
               var13 = var12[0];
               if(var9 == null) {
                  break label1053;
               }

               if(var13 != 0) {
                  var13 = var12[1];
                  if(var9 == null) {
                     break label1053;
                  }

                  if(var13 != 0) {
                     var13 = var12[2];
                     if(var9 == null) {
                        break label1053;
                     }

                     if(var13 != 0) {
                        var13 = var12[3];
                        if(var9 == null) {
                           break label1053;
                        }

                        if(var13 != 0) {
                           var11 = 46;
                           if(var9 != null) {
                              return var0.tileIcons[var11];
                           }
                        }
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 26;
      }

      if(var9 != null) {
         label1033: {
            if(var13 == var15) {
               var13 = var12[0];
               if(var9 == null) {
                  break label1033;
               }

               if(var13 == 0) {
                  var13 = var12[1];
                  if(var9 == null) {
                     break label1033;
                  }

                  if(var13 != 0) {
                     var13 = var12[2];
                     if(var9 == null) {
                        break label1033;
                     }

                     if(var13 != 0) {
                        var13 = var12[3];
                        if(var9 == null) {
                           break label1033;
                        }

                        if(var13 != 0) {
                           var11 = 9;
                           if(var9 != null) {
                              return var0.tileIcons[var11];
                           }
                        }
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 26;
      }

      if(var9 != null) {
         label1013: {
            if(var13 == var15) {
               var13 = var12[0];
               if(var9 == null) {
                  break label1013;
               }

               if(var13 != 0) {
                  var13 = var12[1];
                  if(var9 == null) {
                     break label1013;
                  }

                  if(var13 == 0) {
                     var13 = var12[2];
                     if(var9 == null) {
                        break label1013;
                     }

                     if(var13 != 0) {
                        var13 = var12[3];
                        if(var9 == null) {
                           break label1013;
                        }

                        if(var13 != 0) {
                           var11 = 21;
                           if(var9 != null) {
                              return var0.tileIcons[var11];
                           }
                        }
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 26;
      }

      if(var9 != null) {
         label993: {
            if(var13 == var15) {
               var13 = var12[0];
               if(var9 == null) {
                  break label993;
               }

               if(var13 != 0) {
                  var13 = var12[1];
                  if(var9 == null) {
                     break label993;
                  }

                  if(var13 != 0) {
                     var13 = var12[2];
                     if(var9 == null) {
                        break label993;
                     }

                     if(var13 == 0) {
                        var13 = var12[3];
                        if(var9 == null) {
                           break label993;
                        }

                        if(var13 != 0) {
                           var11 = 8;
                           if(var9 != null) {
                              return var0.tileIcons[var11];
                           }
                        }
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 26;
      }

      if(var9 != null) {
         label973: {
            if(var13 == var15) {
               var13 = var12[0];
               if(var9 == null) {
                  break label973;
               }

               if(var13 != 0) {
                  var13 = var12[1];
                  if(var9 == null) {
                     break label973;
                  }

                  if(var13 != 0) {
                     var13 = var12[2];
                     if(var9 == null) {
                        break label973;
                     }

                     if(var13 != 0) {
                        var13 = var12[3];
                        if(var9 == null) {
                           break label973;
                        }

                        if(var13 == 0) {
                           var11 = 20;
                           if(var9 != null) {
                              return var0.tileIcons[var11];
                           }
                        }
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 26;
      }

      if(var9 != null) {
         label953: {
            if(var13 == var15) {
               var13 = var12[0];
               if(var9 == null) {
                  break label953;
               }

               if(var13 != 0) {
                  var13 = var12[1];
                  if(var9 == null) {
                     break label953;
                  }

                  if(var13 != 0) {
                     var13 = var12[2];
                     if(var9 == null) {
                        break label953;
                     }

                     if(var13 == 0) {
                        var13 = var12[3];
                        if(var9 == null) {
                           break label953;
                        }

                        if(var13 == 0) {
                           var11 = 11;
                           if(var9 != null) {
                              return var0.tileIcons[var11];
                           }
                        }
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 26;
      }

      if(var9 != null) {
         label933: {
            if(var13 == var15) {
               var13 = var12[0];
               if(var9 == null) {
                  break label933;
               }

               if(var13 == 0) {
                  var13 = var12[1];
                  if(var9 == null) {
                     break label933;
                  }

                  if(var13 == 0) {
                     var13 = var12[2];
                     if(var9 == null) {
                        break label933;
                     }

                     if(var13 != 0) {
                        var13 = var12[3];
                        if(var9 == null) {
                           break label933;
                        }

                        if(var13 != 0) {
                           var11 = 22;
                           if(var9 != null) {
                              return var0.tileIcons[var11];
                           }
                        }
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 26;
      }

      if(var9 != null) {
         label913: {
            if(var13 == var15) {
               var13 = var12[0];
               if(var9 == null) {
                  break label913;
               }

               if(var13 == 0) {
                  var13 = var12[1];
                  if(var9 == null) {
                     break label913;
                  }

                  if(var13 != 0) {
                     var13 = var12[2];
                     if(var9 == null) {
                        break label913;
                     }

                     if(var13 == 0) {
                        var13 = var12[3];
                        if(var9 == null) {
                           break label913;
                        }

                        if(var13 != 0) {
                           var11 = 23;
                           if(var9 != null) {
                              return var0.tileIcons[var11];
                           }
                        }
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 26;
      }

      if(var9 != null) {
         label893: {
            if(var13 == var15) {
               var13 = var12[0];
               if(var9 == null) {
                  break label893;
               }

               if(var13 != 0) {
                  var13 = var12[1];
                  if(var9 == null) {
                     break label893;
                  }

                  if(var13 == 0) {
                     var13 = var12[2];
                     if(var9 == null) {
                        break label893;
                     }

                     if(var13 != 0) {
                        var13 = var12[3];
                        if(var9 == null) {
                           break label893;
                        }

                        if(var13 == 0) {
                           var11 = 10;
                           if(var9 != null) {
                              return var0.tileIcons[var11];
                           }
                        }
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 26;
      }

      if(var9 != null) {
         label873: {
            if(var13 == var15) {
               var13 = var12[0];
               if(var9 == null) {
                  break label873;
               }

               if(var13 != 0) {
                  var13 = var12[1];
                  if(var9 == null) {
                     break label873;
                  }

                  if(var13 == 0) {
                     var13 = var12[2];
                     if(var9 == null) {
                        break label873;
                     }

                     if(var13 == 0) {
                        var13 = var12[3];
                        if(var9 == null) {
                           break label873;
                        }

                        if(var13 != 0) {
                           var11 = 34;
                           if(var9 != null) {
                              return var0.tileIcons[var11];
                           }
                        }
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 26;
      }

      if(var9 != null) {
         label853: {
            if(var13 == var15) {
               var13 = var12[0];
               if(var9 == null) {
                  break label853;
               }

               if(var13 == 0) {
                  var13 = var12[1];
                  if(var9 == null) {
                     break label853;
                  }

                  if(var13 != 0) {
                     var13 = var12[2];
                     if(var9 == null) {
                        break label853;
                     }

                     if(var13 != 0) {
                        var13 = var12[3];
                        if(var9 == null) {
                           break label853;
                        }

                        if(var13 == 0) {
                           var11 = 35;
                           if(var9 != null) {
                              return var0.tileIcons[var11];
                           }
                        }
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 26;
      }

      if(var9 != null) {
         label833: {
            if(var13 == var15) {
               var13 = var12[0];
               if(var9 == null) {
                  break label833;
               }

               if(var13 != 0) {
                  var13 = var12[1];
                  if(var9 == null) {
                     break label833;
                  }

                  if(var13 == 0) {
                     var13 = var12[2];
                     if(var9 == null) {
                        break label833;
                     }

                     if(var13 == 0) {
                        var13 = var12[3];
                        if(var9 == null) {
                           break label833;
                        }

                        if(var13 == 0) {
                           var11 = 32;
                           if(var9 != null) {
                              return var0.tileIcons[var11];
                           }
                        }
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 26;
      }

      if(var9 != null) {
         label813: {
            if(var13 == var15) {
               var13 = var12[0];
               if(var9 == null) {
                  break label813;
               }

               if(var13 == 0) {
                  var13 = var12[1];
                  if(var9 == null) {
                     break label813;
                  }

                  if(var13 != 0) {
                     var13 = var12[2];
                     if(var9 == null) {
                        break label813;
                     }

                     if(var13 == 0) {
                        var13 = var12[3];
                        if(var9 == null) {
                           break label813;
                        }

                        if(var13 == 0) {
                           var11 = 33;
                           if(var9 != null) {
                              return var0.tileIcons[var11];
                           }
                        }
                     }
                  }
               }
            }

            var13 = var11;
         }

         var15 = 26;
      }

      label1488: {
         if(var9 != null) {
            label789: {
               if(var13 == var15) {
                  var13 = var12[0];
                  if(var9 == null) {
                     break label789;
                  }

                  if(var13 == 0) {
                     var13 = var12[1];
                     if(var9 == null) {
                        break label789;
                     }

                     if(var13 == 0) {
                        var13 = var12[2];
                        if(var9 == null) {
                           break label789;
                        }

                        if(var13 != 0) {
                           var13 = var12[3];
                           if(var9 == null) {
                              break label789;
                           }

                           if(var13 == 0) {
                              var11 = 44;
                              if(var9 != null) {
                                 return var0.tileIcons[var11];
                              }
                           }
                        }
                     }
                  }
               }

               var13 = var11;
            }

            if(var9 == null) {
               break label1488;
            }

            var15 = 26;
         }

         if(var13 != var15) {
            return var0.tileIcons[var11];
         }

         var13 = var12[0];
      }

      if(var9 != null) {
         if(var13 != 0) {
            return var0.tileIcons[var11];
         }

         var13 = var12[1];
      }

      if(var9 != null) {
         if(var13 != 0) {
            return var0.tileIcons[var11];
         }

         var13 = var12[2];
      }

      if(var9 != null) {
         if(var13 != 0) {
            return var0.tileIcons[var11];
         }

         var13 = var12[3];
      }

      if(var9 != null) {
         if(var13 == 0) {
            return var0.tileIcons[var11];
         }

         var13 = 45;
      }

      var11 = var13;
      return var0.tileIcons[var11];
   }

   private static boolean isNeighbour(ConnectedProperties var0, ahl var1, aji var2, int var3, int var4, int var5, int var6, class_73 var7, int var8) {
      String[] var10000 = class_752.method_4253();
      aji var10 = var1.getBlock(var3, var4, var5);
      String[] var9 = var10000;
      int var12 = var0.connect;
      byte var10001 = 2;
      if(var9 != null) {
         if(var0.connect == 2) {
            if(var10 == null) {
               return false;
            }

            class_73 var11;
            if(var6 >= 0) {
               var11 = var10.method_2448(var6, var8);
               if(var9 != null) {
                  return var11 == var7;
               }
            }

            var11 = var10.method_2448(1, var8);
            return var11 == var7;
         }

         var12 = var0.connect;
         var10001 = 3;
      }

      if(var12 == var10001) {
         aji var13 = var10;
         if(var9 != null) {
            if(var10 == null) {
               return false;
            }

            var13 = var10;
         }

         return var13.method_2424() == var2.method_2424();
      } else {
         if(var10 == var2) {
            var12 = var1.method_33(var3, var4, var5);
            if(var9 == null) {
               return (boolean)var12;
            }

            if(var12 == var8) {
               var12 = 1;
               return (boolean)var12;
            }
         }

         var12 = 0;
         return (boolean)var12;
      }
   }

   private static class_73 getConnectedTextureHorizontal(ConnectedProperties var0, ahl var1, aji var2, int var3, int var4, int var5, int var6, int var7, class_73 var8, int var9) {
      byte var11 = 0;
      String[] var10000 = class_752.method_4253();
      byte var12 = 0;
      String[] var10 = var10000;
      if(var10 != null) {
         label92: {
            switch(var6) {
            case 0:
               switch(var7) {
               case 0:
               case 1:
                  return null;
               case 2:
                  var11 = isNeighbour(var0, var1, var2, var3 + 1, var4, var5, var7, var8, var9);
                  var12 = isNeighbour(var0, var1, var2, var3 - 1, var4, var5, var7, var8, var9);
                  if(var10 != null) {
                     break;
                  }
               case 3:
                  var11 = isNeighbour(var0, var1, var2, var3 - 1, var4, var5, var7, var8, var9);
                  var12 = isNeighbour(var0, var1, var2, var3 + 1, var4, var5, var7, var8, var9);
                  if(var10 != null) {
                     break;
                  }
               case 4:
                  var11 = isNeighbour(var0, var1, var2, var3, var4, var5 - 1, var7, var8, var9);
                  var12 = isNeighbour(var0, var1, var2, var3, var4, var5 + 1, var7, var8, var9);
                  if(var10 != null) {
                     break;
                  }
               case 5:
                  var11 = isNeighbour(var0, var1, var2, var3, var4, var5 + 1, var7, var8, var9);
                  var12 = isNeighbour(var0, var1, var2, var3, var4, var5 - 1, var7, var8, var9);
               }

               if(var10 != null) {
                  break;
               }
            case 1:
               switch(var7) {
               case 0:
                  var11 = isNeighbour(var0, var1, var2, var3 + 1, var4, var5, var7, var8, var9);
                  var12 = isNeighbour(var0, var1, var2, var3 - 1, var4, var5, var7, var8, var9);
                  if(var10 != null) {
                     break;
                  }
               case 1:
                  var11 = isNeighbour(var0, var1, var2, var3 + 1, var4, var5, var7, var8, var9);
                  var12 = isNeighbour(var0, var1, var2, var3 - 1, var4, var5, var7, var8, var9);
                  if(var10 != null) {
                     break;
                  }
               case 2:
               case 3:
                  return null;
               case 4:
                  var11 = isNeighbour(var0, var1, var2, var3, var4 + 1, var5, var7, var8, var9);
                  var12 = isNeighbour(var0, var1, var2, var3, var4 - 1, var5, var7, var8, var9);
                  if(var10 != null) {
                     break;
                  }
               case 5:
                  var11 = isNeighbour(var0, var1, var2, var3, var4 + 1, var5, var7, var8, var9);
                  var12 = isNeighbour(var0, var1, var2, var3, var4 - 1, var5, var7, var8, var9);
               }

               if(var10 != null) {
                  break;
               }
            case 2:
               if(var10 == null) {
                  break label92;
               }

               switch(var7) {
               case 2:
                  var11 = isNeighbour(var0, var1, var2, var3, var4 + 1, var5, var7, var8, var9);
                  var12 = isNeighbour(var0, var1, var2, var3, var4 - 1, var5, var7, var8, var9);
                  if(var10 != null) {
                     break;
                  }
               case 3:
                  var11 = isNeighbour(var0, var1, var2, var3, var4 + 1, var5, var7, var8, var9);
                  var12 = isNeighbour(var0, var1, var2, var3, var4 - 1, var5, var7, var8, var9);
                  if(var10 != null) {
                     break;
                  }
               case 0:
                  var11 = isNeighbour(var0, var1, var2, var3, var4, var5 - 1, var7, var8, var9);
                  var12 = isNeighbour(var0, var1, var2, var3, var4, var5 + 1, var7, var8, var9);
                  if(var10 != null) {
                     break;
                  }
               case 1:
                  var11 = isNeighbour(var0, var1, var2, var3, var4, var5 - 1, var7, var8, var9);
                  var12 = isNeighbour(var0, var1, var2, var3, var4, var5 + 1, var7, var8, var9);
                  break;
               case 4:
               case 5:
                  return null;
               }
            }

            boolean var14 = true;
         }
      }

      byte var15 = var11;
      byte var13;
      if(var10 != null) {
         if(var11 != 0) {
            var15 = var12;
            if(var10 != null) {
               if(var12 != 0) {
                  var13 = 1;
                  if(var10 != null) {
                     return var0.tileIcons[var13];
                  }
               }

               var15 = 2;
            }

            var13 = var15;
            if(var10 != null) {
               return var0.tileIcons[var13];
            }
         }

         var15 = var12;
      }

      if(var10 != null) {
         if(var15 != 0) {
            var13 = 0;
            if(var10 != null) {
               return var0.tileIcons[var13];
            }
         }

         var15 = 3;
      }

      var13 = var15;
      return var0.tileIcons[var13];
   }

   private static class_73 getConnectedTextureVertical(ConnectedProperties var0, ahl var1, aji var2, int var3, int var4, int var5, int var6, int var7, class_73 var8, int var9) {
      String[] var10000 = class_752.method_4253();
      byte var11 = 0;
      String[] var10 = var10000;
      int var12 = 0;
      int var15;
      if(var10 != null) {
         byte var10001;
         switch(var6) {
         case 0:
            var15 = var7;
            if(var10 != null) {
               if(var7 == 1) {
                  return null;
               }

               var15 = var7;
            }

            if(var10 != null) {
               if(var15 == 0) {
                  return null;
               }

               var11 = isNeighbour(var0, var1, var2, var3, var4 - 1, var5, var7, var8, var9);
               var15 = isNeighbour(var0, var1, var2, var3, var4 + 1, var5, var7, var8, var9);
            }

            var12 = var15;
            if(var10 != null) {
               break;
            }
         case 1:
            label124: {
               var15 = var7;
               var10001 = 3;
               if(var10 != null) {
                  if(var7 == 3) {
                     return null;
                  }

                  var15 = var7;
                  if(var10 == null) {
                     break label124;
                  }

                  var10001 = 2;
               }

               if(var15 == var10001) {
                  return null;
               }

               var11 = isNeighbour(var0, var1, var2, var3, var4, var5 - 1, var7, var8, var9);
               var15 = isNeighbour(var0, var1, var2, var3, var4, var5 + 1, var7, var8, var9);
            }

            var12 = var15;
            if(var10 != null) {
               break;
            }
         case 2:
            label125: {
               var15 = var7;
               var10001 = 5;
               if(var10 != null) {
                  if(var7 == 5) {
                     return null;
                  }

                  var15 = var7;
                  if(var10 == null) {
                     break label125;
                  }

                  var10001 = 4;
               }

               if(var15 == var10001) {
                  return null;
               }

               var11 = isNeighbour(var0, var1, var2, var3 - 1, var4, var5, var7, var8, var9);
               var15 = isNeighbour(var0, var1, var2, var3 + 1, var4, var5, var7, var8, var9);
            }

            var12 = var15;
         }

         boolean var14 = true;
      }

      var15 = var11;
      int var13;
      if(var10 != null) {
         if(var11 != 0) {
            var15 = var12;
            if(var10 != null) {
               if(var12 != 0) {
                  var13 = 1;
                  if(var10 != null) {
                     return var0.tileIcons[var13];
                  }
               }

               var15 = 2;
            }

            var13 = var15;
            if(var10 != null) {
               return var0.tileIcons[var13];
            }
         }

         var15 = var12;
      }

      if(var10 != null) {
         if(var15 != 0) {
            var13 = 0;
            if(var10 != null) {
               return var0.tileIcons[var13];
            }
         }

         var15 = 3;
      }

      var13 = var15;
      return var0.tileIcons[var13];
   }

   private static class_73 getConnectedTextureHorizontalVertical(ConnectedProperties var0, ahl var1, aji var2, int var3, int var4, int var5, int var6, int var7, class_73 var8, int var9) {
      class_73[] var11 = var0.tileIcons;
      String[] var10000 = class_752.method_4253();
      class_73 var12 = getConnectedTextureHorizontal(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
      String[] var10 = var10000;
      class_73 var14 = var12;
      if(var10 != null) {
         label47: {
            if(var12 != null) {
               var14 = var12;
               if(var10 == null) {
                  break label47;
               }

               if(var12 != var8) {
                  var14 = var12;
                  if(var10 == null) {
                     break label47;
                  }

                  if(var12 != var11[3]) {
                     return var12;
                  }
               }
            }

            var14 = getConnectedTextureVertical(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
         }
      }

      class_73 var13 = var14;
      var14 = var13;
      class_73 var10001 = var11[0];
      if(var10 != null) {
         if(var13 == var10001) {
            return var11[4];
         }

         var14 = var13;
         var10001 = var11[1];
      }

      if(var10 != null) {
         if(var14 == var10001) {
            return var11[5];
         }

         var14 = var13;
         if(var10 == null) {
            return var14;
         }

         var10001 = var11[2];
      }

      if(var14 == var10001) {
         return var11[6];
      } else {
         var14 = var13;
         return var14;
      }
   }

   private static class_73 getConnectedTextureVerticalHorizontal(ConnectedProperties var0, ahl var1, aji var2, int var3, int var4, int var5, int var6, int var7, class_73 var8, int var9) {
      String[] var10000 = class_752.method_4253();
      class_73[] var11 = var0.tileIcons;
      String[] var10 = var10000;
      class_73 var12 = getConnectedTextureVertical(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
      class_73 var14 = var12;
      if(var10 != null) {
         label47: {
            if(var12 != null) {
               var14 = var12;
               if(var10 == null) {
                  break label47;
               }

               if(var12 != var8) {
                  var14 = var12;
                  if(var10 == null) {
                     break label47;
                  }

                  if(var12 != var11[3]) {
                     return var12;
                  }
               }
            }

            var14 = getConnectedTextureHorizontal(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
         }
      }

      class_73 var13 = var14;
      var14 = var13;
      class_73 var10001 = var11[0];
      if(var10 != null) {
         if(var13 == var10001) {
            return var11[4];
         }

         var14 = var13;
         var10001 = var11[1];
      }

      if(var10 != null) {
         if(var14 == var10001) {
            return var11[5];
         }

         var14 = var13;
         if(var10 == null) {
            return var14;
         }

         var10001 = var11[2];
      }

      if(var14 == var10001) {
         return var11[6];
      } else {
         var14 = var13;
         return var14;
      }
   }

   private static class_73 getConnectedTextureTop(ConnectedProperties var0, ahl var1, aji var2, int var3, int var4, int var5, int var6, int var7, class_73 var8, int var9) {
      String[] var10000 = class_752.method_4253();
      int var11 = 0;
      String[] var10 = var10000;
      int var12 = var6;
      if(var10 != null) {
         byte var10001;
         switch(var6) {
         case 0:
            var12 = var7;
            if(var10 != null) {
               if(var7 == 1) {
                  return null;
               }

               var12 = var7;
            }

            if(var10 != null) {
               if(var12 == 0) {
                  return null;
               }

               var12 = isNeighbour(var0, var1, var2, var3, var4 + 1, var5, var7, var8, var9);
            }

            var11 = var12;
            if(var10 != null) {
               break;
            }
         case 1:
            label93: {
               var12 = var7;
               var10001 = 3;
               if(var10 != null) {
                  if(var7 == 3) {
                     return null;
                  }

                  var12 = var7;
                  if(var10 == null) {
                     break label93;
                  }

                  var10001 = 2;
               }

               if(var12 == var10001) {
                  return null;
               }

               var12 = isNeighbour(var0, var1, var2, var3, var4, var5 + 1, var7, var8, var9);
            }

            var11 = var12;
            if(var10 != null) {
               break;
            }
         case 2:
            label92: {
               var12 = var7;
               var10001 = 5;
               if(var10 != null) {
                  if(var7 == 5) {
                     return null;
                  }

                  var12 = var7;
                  if(var10 == null) {
                     break label92;
                  }

                  var10001 = 4;
               }

               if(var12 == var10001) {
                  return null;
               }

               var12 = isNeighbour(var0, var1, var2, var3 + 1, var4, var5, var7, var8, var9);
            }

            var11 = var12;
         }

         var12 = var11;
      }

      return var12 != 0?var0.tileIcons[0]:null;
   }

   public static void updateIcons(bpz var0) {
      blockProperties = (ConnectedProperties[][])null;
      String[] var10000 = class_752.method_4253();
      tileProperties = (ConnectedProperties[][])null;
      String[] var1 = var10000;
      class_56[] var2 = Config.getResourcePacks();
      int var3 = var2.length - 1;

      while(true) {
         if(var3 >= 0) {
            class_56 var4 = var2[var3];
            updateIcons(var0, var4);
            --var3;
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         updateIcons(var0, Config.getDefaultResourcePack());
         break;
      }

   }

   public static void updateIcons(bpz param0, class_56 param1) {
      // $FF: Couldn't be decompiled
   }

   private static List makePropertyList(ConnectedProperties[][] var0) {
      String[] var10000 = class_752.method_4253();
      ArrayList var2 = new ArrayList();
      String[] var1 = var10000;
      if(var0 != null) {
         int var3 = 0;

         while(var3 < var0.length) {
            ConnectedProperties[] var4 = var0[var3];
            ArrayList var5 = null;
            if(var4 != null) {
               var5 = new ArrayList(Arrays.asList(var4));
            }

            var2.add(var5);
            ++var3;
            if(var1 == null) {
               break;
            }
         }
      }

      return var2;
   }

   private static boolean detectMultipass() {
      String[] var10000 = class_752.method_4253();
      ArrayList var1 = new ArrayList();
      String[] var0 = var10000;
      int var2 = 0;

      ConnectedProperties[] var9;
      label78:
      while(true) {
         ConnectedProperties[] var3;
         if(var2 < tileProperties.length) {
            var3 = tileProperties[var2];
            var9 = var3;
            if(var0 == null) {
               break;
            }

            if(var3 != null || var0 == null) {
               var1.addAll(Arrays.asList(var3));
            }

            ++var2;
            if(var0 != null) {
               continue;
            }
         }

         var2 = 0;

         while(true) {
            if(var2 < blockProperties.length) {
               var3 = blockProperties[var2];
               var9 = var3;
               if(var0 == null) {
                  break label78;
               }

               if(var3 != null || var0 == null) {
                  var1.addAll(Arrays.asList(var3));
               }

               ++var2;
               if(var0 != null) {
                  continue;
               }
            }

            var9 = (ConnectedProperties[])((ConnectedProperties[])var1.toArray(new ConnectedProperties[var1.size()]));
            break label78;
         }
      }

      ConnectedProperties[] var7 = var9;
      HashSet var8 = new HashSet();
      HashSet var4 = new HashSet();
      int var5 = 0;

      while(true) {
         if(var5 < var7.length) {
            ConnectedProperties var6 = var7[var5];
            if(var0 == null) {
               break;
            }

            class_73[] var10 = var6.matchTileIcons;
            if(var0 != null) {
               if(var6.matchTileIcons != null) {
                  var8.addAll(Arrays.asList(var6.matchTileIcons));
               }

               var10 = var6.tileIcons;
            }

            if(var10 != null) {
               var4.addAll(Arrays.asList(var6.tileIcons));
            }

            ++var5;
            if(var0 != null) {
               continue;
            }
         }

         var8.retainAll(var4);
         break;
      }

      boolean var11 = var8.isEmpty();
      if(var0 != null) {
         var11 = !var11;
      }

      return var11;
   }

   private static ConnectedProperties[][] propertyListToArray(List var0) {
      ConnectedProperties[][] var2 = new ConnectedProperties[var0.size()][];
      String[] var1 = class_752.method_4253();
      int var3 = 0;

      while(var3 < var0.size()) {
         label21: {
            List var4 = (List)var0.get(var3);
            List var10000 = var4;
            if(var1 != null) {
               if(var4 == null && var1 != null) {
                  break label21;
               }

               var10000 = var4;
            }

            ConnectedProperties[] var5 = (ConnectedProperties[])((ConnectedProperties[])var10000.toArray(new ConnectedProperties[var4.size()]));
            var2[var3] = var5;
         }

         ++var3;
         if(var1 == null) {
            break;
         }
      }

      return var2;
   }

   private static void addToTileList(ConnectedProperties var0, List var1) {
      String[] var2 = class_752.method_4253();
      if(var0.matchTileIcons != null) {
         int var3 = 0;

         while(var3 < var0.matchTileIcons.length) {
            label45: {
               class_73 var4 = var0.matchTileIcons[var3];
               class_73 var10000 = var4;
               String[] var7;
               StringBuilder var8;
               if(var2 != null) {
                  if(!(var4 instanceof bqd)) {
                     var8 = new StringBuilder();
                     var7 = field_9511;
                     Config.warn(var8.append("IIcon is not TextureAtlasSprite: ").append(var4).append(", name: ").append(var4.method_374()).toString());
                     if(var2 != null) {
                        break label45;
                     }
                  }

                  var10000 = var4;
               }

               int var6;
               label30: {
                  bqd var5 = (bqd)var10000;
                  var6 = var5.getIndexInMap();
                  if(var2 != null) {
                     if(var6 >= 0) {
                        break label30;
                     }

                     var8 = new StringBuilder();
                     var7 = field_9511;
                     Config.warn(var8.append("Invalid tile ID: ").append(var6).append(", icon: ").append(var5.method_374()).toString());
                  }

                  if(var2 != null) {
                     break label45;
                  }
               }

               addToList(var0, var1, var6);
            }

            ++var3;
            if(var2 == null) {
               break;
            }
         }

      }
   }

   private static void addToBlockList(ConnectedProperties var0, List var1) {
      String[] var2 = class_752.method_4253();
      if(var0.matchBlocks != null) {
         int var3 = 0;

         while(var3 < var0.matchBlocks.length) {
            label27: {
               int var4;
               label26: {
                  var4 = var0.matchBlocks[var3];
                  if(var2 != null) {
                     if(var4 >= 0) {
                        break label26;
                     }

                     StringBuilder var10000 = new StringBuilder();
                     String[] var10001 = field_9511;
                     Config.warn(var10000.append("Invalid block ID: ").append(var4).toString());
                  }

                  if(var2 != null) {
                     break label27;
                  }
               }

               addToList(var0, var1, var4);
            }

            ++var3;
            if(var2 == null) {
               break;
            }
         }

      }
   }

   private static void addToList(ConnectedProperties var0, List var1, int var2) {
      String[] var3 = class_752.method_4253();

      List var10000;
      while(true) {
         if(var2 >= var1.size()) {
            var10000 = var1;
            if(var3 == null) {
               break;
            }

            var1.add((Object)null);
            if(var3 != null) {
               continue;
            }
         }

         var10000 = (List)var1.get(var2);
         break;
      }

      Object var4 = var10000;
      Object var5 = var4;
      if(var3 != null) {
         if(var4 == null) {
            var4 = new ArrayList();
            var1.set(var2, var4);
         }

         var5 = var4;
      }

      ((List)var5).add(var0);
   }

   private static String[] collectFiles(class_56 var0, String var1, String var2) {
      String[] var3;
      class_56 var6;
      label48: {
         var3 = class_752.method_4253();
         boolean var10000 = var0 instanceof class_1506;
         if(var3 != null) {
            if(var10000) {
               return collectFilesDefault(var0);
            }

            var6 = var0;
            if(var3 == null) {
               break label48;
            }

            var10000 = var0 instanceof class_1502;
         }

         if(!var10000) {
            return new String[0];
         }

         var6 = var0;
      }

      class_1502 var4 = (class_1502)var6;
      File var5 = ResourceUtils.getResourcePackFile(var4);
      File var7 = var5;
      if(var3 != null) {
         if(var5 == null) {
            return new String[0];
         }

         var7 = var5;
      }

      byte var8 = var7.isDirectory();
      if(var3 != null) {
         if(var8 != 0) {
            return collectFilesFolder(var5, "", var1, var2);
         }

         var8 = var5.isFile();
      }

      if(var3 != null) {
         if(var8 != 0) {
            return collectFilesZIP(var5, var1, var2);
         }

         var8 = 0;
      }

      return new String[var8];
   }

   private static String[] collectFilesDefault(class_56 var0) {
      String[] var10000 = class_752.method_4253();
      ArrayList var2 = new ArrayList();
      String[] var1 = var10000;
      String[] var3 = getDefaultCtmPaths();
      int var4 = 0;

      while(true) {
         if(var4 < var3.length) {
            var10000 = var3;
            if(var1 == null) {
               break;
            }

            String var5 = var3[var4];
            bqx var8 = new bqx;
            var8.method_8227(var5);
            bqx var6 = var8;
            if(var1 != null) {
               if(var0.method_229(var6)) {
                  var2.add(var5);
               }

               ++var4;
            }

            if(var1 != null) {
               continue;
            }
         }

         var10000 = (String[])((String[])var2.toArray(new String[var2.size()]));
         break;
      }

      String[] var7 = var10000;
      return var7;
   }

   private static String[] getDefaultCtmPaths() {
      ArrayList var1 = new ArrayList();
      String[] var10000 = class_752.method_4253();
      String[] var6 = field_9511;
      String var2 = "mcpatcher/ctm/default/";
      String[] var0 = var10000;
      bqx var8 = new bqx;
      var8.method_8227("textures/blocks/glass.png");
      byte var9 = Config.isFromDefaultResourcePack(var8);
      if(var0 != null) {
         if(var9 != 0) {
            var1.add(var2 + "glass.properties");
            var1.add(var2 + "glasspane.properties");
         }

         var8 = new bqx;
         var6 = field_9511;
         var8.method_8227("textures/blocks/bookshelf.png");
         var9 = Config.isFromDefaultResourcePack(var8);
      }

      StringBuilder var10001;
      if(var0 != null) {
         if(var9 != 0) {
            var10001 = (new StringBuilder()).append(var2);
            var6 = field_9511;
            var1.add(var10001.append("bookshelf.properties").toString());
         }

         var8 = new bqx;
         var6 = field_9511;
         var8.method_8227("textures/blocks/sandstone_normal.png");
         var9 = Config.isFromDefaultResourcePack(var8);
      }

      if(var0 != null) {
         if(var9 != 0) {
            var10001 = (new StringBuilder()).append(var2);
            var6 = field_9511;
            var1.add(var10001.append("sandstone.properties").toString());
         }

         var9 = 16;
      }

      var10000 = new String[var9];
      var6 = field_9511;
      var10000[0] = "white";
      var10000[1] = "orange";
      var10000[2] = "magenta";
      var10000[3] = "light_blue";
      var10000[4] = "yellow";
      var10000[5] = "lime";
      var10000[6] = "pink";
      var10000[7] = "gray";
      var10000[8] = "silver";
      var10000[9] = "cyan";
      var10000[10] = "purple";
      var10000[11] = "blue";
      var10000[12] = "brown";
      var10000[13] = "green";
      var10000[14] = "red";
      var10000[15] = "black";
      String[] var3 = var10000;
      int var4 = 0;

      while(true) {
         if(var4 < var3.length) {
            var10000 = var3;
            if(var0 == null) {
               break;
            }

            String var5 = var3[var4];
            if(var0 != null) {
               var8 = new bqx;
               StringBuilder var10002 = new StringBuilder();
               var6 = field_9511;
               var8.method_8227(var10002.append("textures/blocks/glass_").append(var5).append(".png").toString());
               if(Config.isFromDefaultResourcePack(var8)) {
                  var1.add(var2 + var4 + "_glass_" + var5 + "/glass_" + var5 + ".properties");
                  var1.add(var2 + var4 + "_glass_" + var5 + "/glass_pane_" + var5 + ".properties");
               }

               ++var4;
            }

            if(var0 != null) {
               continue;
            }
         }

         var10000 = (String[])((String[])var1.toArray(new String[var1.size()]));
         break;
      }

      String[] var7 = var10000;
      return var7;
   }

   private static String[] collectFilesFolder(File var0, String var1, String var2, String var3) {
      String[] var10000 = class_752.method_4253();
      ArrayList var5 = new ArrayList();
      String[] var4 = var10000;
      var10000 = field_9511;
      String var6 = "assets/minecraft/";
      File[] var7 = var0.listFiles();
      if(var7 == null) {
         return new String[0];
      } else {
         int var8 = 0;

         Object var15;
         while(true) {
            if(var8 < var7.length) {
               var15 = var7;
               if(var4 == null) {
                  break;
               }

               label71: {
                  label70: {
                     File var9 = var7[var8];
                     boolean var16 = var9.isFile();
                     String var10;
                     if(var4 != null) {
                        if(var16) {
                           var10 = var1 + var9.getName();
                           var16 = var10.startsWith(var6);
                           if(var4 != null) {
                              if(!var16 && var4 != null) {
                                 break label70;
                              }

                              var10 = var10.substring(var6.length());
                              var16 = var10.startsWith(var2);
                           }

                           if(var4 != null) {
                              if(!var16 && var4 != null) {
                                 break label70;
                              }

                              var16 = var10.endsWith(var3);
                           }

                           if(var4 != null) {
                              if(!var16 && var4 != null) {
                                 break label70;
                              }

                              var5.add(var10);
                           }

                           if(var4 != null) {
                              break label70;
                           }
                        }

                        var16 = var9.isDirectory();
                     }

                     if(var16) {
                        var10 = var1 + var9.getName() + "/";
                        String[] var11 = collectFilesFolder(var9, var10, var2, var3);
                        int var12 = 0;

                        while(var12 < var11.length) {
                           String var13 = var11[var12];
                           var5.add(var13);
                           ++var12;
                           if(var4 == null) {
                              break label71;
                           }

                           if(var4 == null) {
                              break;
                           }
                        }
                     }
                  }

                  ++var8;
               }

               if(var4 != null) {
                  continue;
               }
            }

            var15 = var5.toArray(new String[var5.size()]);
            break;
         }

         String[] var14 = (String[])((String[])var15);
         return var14;
      }
   }

   private static String[] collectFilesZIP(File param0, String param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public static int getPaneTextureIndex(boolean var0, boolean var1, boolean var2, boolean var3) {
      String[] var4 = class_752.method_4253();
      byte var10000 = var1;
      if(var4 != null) {
         label140: {
            if(var1 != 0) {
               var10000 = var0;
               if(var4 == null) {
                  break label140;
               }

               if(var0 != 0) {
                  var10000 = var2;
                  if(var4 != null) {
                     if(var2 != 0) {
                        var10000 = var3;
                        if(var4 != null) {
                           if(var3 != 0) {
                              return 34;
                           }

                           var10000 = 50;
                        }

                        return var10000;
                     }

                     var10000 = var3;
                  }

                  if(var4 != null) {
                     if(var10000 != 0) {
                        return 18;
                     }

                     var10000 = 2;
                  }

                  return var10000;
               }
            }

            var10000 = var1;
         }
      }

      if(var4 != null) {
         label133: {
            if(var10000 != 0) {
               var10000 = var0;
               if(var4 == null) {
                  break label133;
               }

               if(var0 == 0) {
                  var10000 = var2;
                  if(var4 != null) {
                     if(var2 != 0) {
                        var10000 = var3;
                        if(var4 != null) {
                           if(var3 != 0) {
                              return 35;
                           }

                           var10000 = 51;
                        }

                        return var10000;
                     }

                     var10000 = var3;
                  }

                  if(var4 != null) {
                     if(var10000 != 0) {
                        return 19;
                     }

                     var10000 = 3;
                  }

                  return var10000;
               }
            }

            var10000 = var1;
         }
      }

      if(var4 != null) {
         label126: {
            if(var10000 == 0) {
               var10000 = var0;
               if(var4 == null) {
                  break label126;
               }

               if(var0 != 0) {
                  var10000 = var2;
                  if(var4 != null) {
                     if(var2 != 0) {
                        var10000 = var3;
                        if(var4 != null) {
                           if(var3 != 0) {
                              return 33;
                           }

                           var10000 = 49;
                        }

                        return var10000;
                     }

                     var10000 = var3;
                  }

                  if(var4 != null) {
                     if(var10000 != 0) {
                        return 17;
                     }

                     var10000 = 1;
                  }

                  return var10000;
               }
            }

            var10000 = var2;
         }
      }

      if(var4 != null) {
         if(var10000 != 0) {
            var10000 = var3;
            if(var4 != null) {
               if(var3 != 0) {
                  return 32;
               }

               var10000 = 48;
            }

            return var10000;
         }

         var10000 = var3;
      }

      if(var4 != null) {
         if(var10000 != 0) {
            return 16;
         }

         var10000 = 0;
      }

      return var10000;
   }

   public static int getReversePaneTextureIndex(int var0) {
      String[] var10000 = class_752.method_4253();
      int var2 = var0 % 16;
      String[] var1 = var10000;
      int var3 = var2;
      byte var10001 = 1;
      if(var1 != null) {
         if(var2 == 1) {
            return var0 + 2;
         }

         var3 = var2;
         if(var1 == null) {
            return var3;
         }

         var10001 = 3;
      }

      if(var3 == var10001) {
         return var0 - 2;
      } else {
         var3 = var0;
         return var3;
      }
   }

   public static class_73 getCtmTexture(ConnectedProperties var0, int var1, class_73 var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var0.method;
      if(var3 != null) {
         if(var0.method != 1) {
            return var2;
         }

         var10000 = var1;
      }

      if(var3 != null) {
         if(var10000 < 0) {
            return var2;
         }

         var10000 = var1;
      }

      if(var3 != null) {
         if(var10000 >= ctmIndexes.length) {
            return var2;
         }

         var10000 = ctmIndexes[var1];
      }

      int var4 = var10000;
      class_73[] var5 = var0.tileIcons;
      var10000 = var4;
      if(var3 != null) {
         if(var4 < 0) {
            return var2;
         }

         var10000 = var4;
      }

      if(var10000 < var5.length) {
         return var5[var4];
      } else {
         return var2;
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_10076() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.io.IOException) java.io.IOException
   private static IOException method_10077(IOException var0) {
      return var0;
   }
}
