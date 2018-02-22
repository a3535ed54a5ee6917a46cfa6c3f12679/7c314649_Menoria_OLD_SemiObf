import java.util.ArrayList;
import java.util.Properties;

public class ConnectedProperties {

   public String name;
   public String basePath;
   public int[] matchBlocks;
   public String[] matchTiles;
   public int method;
   public String[] tiles;
   public int connect;
   public int faces;
   public int[] metadatas;
   public class_985[] biomes;
   public int minHeight;
   public int maxHeight;
   public int renderPass;
   public boolean innerSeams;
   public int width;
   public int height;
   public int[] weights;
   public int symmetry;
   public int[] sumWeights;
   public int sumAllWeights;
   public class_73[] matchTileIcons;
   public class_73[] tileIcons;
   public static final int METHOD_NONE = 0;
   public static final int METHOD_CTM = 1;
   public static final int METHOD_HORIZONTAL = 2;
   public static final int METHOD_TOP = 3;
   public static final int METHOD_RANDOM = 4;
   public static final int METHOD_REPEAT = 5;
   public static final int METHOD_VERTICAL = 6;
   public static final int METHOD_FIXED = 7;
   public static final int METHOD_HORIZONTAL_VERTICAL = 8;
   public static final int METHOD_VERTICAL_HORIZONTAL = 9;
   public static final int CONNECT_NONE = 0;
   public static final int CONNECT_BLOCK = 1;
   public static final int CONNECT_TILE = 2;
   public static final int CONNECT_MATERIAL = 3;
   public static final int CONNECT_UNKNOWN = 128;
   public static final int FACE_BOTTOM = 1;
   public static final int FACE_TOP = 2;
   public static final int FACE_EAST = 4;
   public static final int FACE_WEST = 8;
   public static final int FACE_NORTH = 16;
   public static final int FACE_SOUTH = 32;
   public static final int FACE_SIDES = 60;
   public static final int FACE_ALL = 63;
   public static final int FACE_UNKNOWN = 128;
   public static final int SYMMETRY_NONE = 1;
   public static final int SYMMETRY_OPPOSITE = 2;
   public static final int SYMMETRY_ALL = 6;
   public static final int SYMMETRY_UNKNOWN = 128;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_4169;


   // $FF: renamed from: <init> (java.util.Properties, java.lang.String) void
   public void method_5059(Properties var1, String var2) {
      super();
      this.name = null;
      this.basePath = null;
      this.matchBlocks = null;
      this.matchTiles = null;
      this.method = 0;
      this.tiles = null;
      this.connect = 0;
      this.faces = 63;
      this.metadatas = null;
      this.biomes = null;
      this.minHeight = 0;
      this.maxHeight = 1024;
      this.renderPass = 0;
      this.innerSeams = false;
      this.width = 0;
      this.height = 0;
      this.weights = null;
      this.symmetry = 1;
      this.sumWeights = null;
      this.sumAllWeights = 0;
      this.matchTileIcons = null;
      this.tileIcons = null;
      this.name = parseName(var2);
      this.basePath = parseBasePath(var2);
      String[] var3 = field_4169;
      this.matchBlocks = parseInts(var1.getProperty("matchBlocks"));
      this.matchTiles = this.parseMatchTiles(var1.getProperty("matchTiles"));
      this.method = parseMethod(var1.getProperty("method"));
      this.tiles = this.parseTileNames(var1.getProperty("tiles"));
      this.connect = parseConnect(var1.getProperty("connect"));
      this.faces = parseFaces(var1.getProperty("faces"));
      this.metadatas = parseInts(var1.getProperty("metadata"));
      this.biomes = parseBiomes(var1.getProperty("biomes"));
      this.minHeight = parseInt(var1.getProperty("minHeight"), -1);
      this.maxHeight = parseInt(var1.getProperty("maxHeight"), 1024);
      this.renderPass = parseInt(var1.getProperty("renderPass"));
      this.innerSeams = parseBoolean(var1.getProperty("innerSeams"));
      this.width = parseInt(var1.getProperty("width"));
      this.height = parseInt(var1.getProperty("height"));
      this.weights = parseInts(var1.getProperty("weights"));
      this.symmetry = parseSymmetry(var1.getProperty("symmetry"));
   }

   private String[] parseMatchTiles(String var1) {
      String[] var2 = class_752.method_4253();
      String var10000 = var1;
      if(var2 != null) {
         if(var1 == null) {
            return null;
         }

         var10000 = var1;
      }

      String[] var3 = Config.tokenize(var10000, " ");
      int var4 = 0;

      String[] var6;
      while(true) {
         if(var4 < var3.length) {
            var6 = var3;
            if(var2 == null) {
               break;
            }

            String var5 = var3[var4];
            var10000 = var5;
            String[] var10001 = field_4169;
            String var7 = ".png";
            if(var2 != null) {
               if(var5.endsWith(".png")) {
                  var5 = var5.substring(0, var5.length() - 4);
               }

               var10000 = var5;
               var7 = this.basePath;
            }

            var5 = TextureUtils.fixResourcePath(var10000, var7);
            var3[var4] = var5;
            ++var4;
            if(var2 != null) {
               continue;
            }
         }

         var6 = var3;
         break;
      }

      return var6;
   }

   private static String parseName(String var0) {
      String var2 = var0;
      String[] var10000 = class_752.method_4253();
      int var3 = var0.lastIndexOf(47);
      String[] var1 = var10000;
      int var5 = var3;
      if(var1 != null) {
         if(var3 >= 0) {
            var2 = var0.substring(var3 + 1);
         }

         var5 = var2.lastIndexOf(46);
      }

      int var4 = var5;
      if(var4 >= 0) {
         var2 = var2.substring(0, var4);
      }

      return var2;
   }

   private static String parseBasePath(String var0) {
      int var1 = var0.lastIndexOf(47);
      return var1 < 0?"":var0.substring(0, var1);
   }

   private static class_985[] parseBiomes(String var0) {
      String[] var1 = class_752.method_4253();
      String var10000 = var0;
      if(var1 != null) {
         if(var0 == null) {
            return null;
         }

         var10000 = var0;
      }

      String[] var2 = Config.tokenize(var10000, " ");
      ArrayList var3 = new ArrayList();
      int var4 = 0;

      Object var8;
      while(true) {
         if(var4 < var2.length) {
            var8 = var2;
            if(var1 == null) {
               break;
            }

            label33: {
               class_985 var6;
               label32: {
                  String var5 = var2[var4];
                  var6 = findBiome(var5);
                  if(var1 != null) {
                     if(var6 != null) {
                        break label32;
                     }

                     StringBuilder var9 = new StringBuilder();
                     String[] var10001 = field_4169;
                     Config.warn(var9.append("Biome not found: ").append(var5).toString());
                  }

                  if(var1 != null) {
                     break label33;
                  }
               }

               var3.add(var6);
            }

            ++var4;
            if(var1 != null) {
               continue;
            }
         }

         var8 = var3.toArray(new class_985[var3.size()]);
         break;
      }

      class_985[] var7 = (class_985[])((class_985[])var8);
      return var7;
   }

   private static class_985 findBiome(String var0) {
      var0 = var0.toLowerCase();
      class_985[] var2 = class_985.method_5724();
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var1 = var10000;

      while(var3 < var2.length) {
         label29: {
            label37: {
               class_985 var4 = var2[var3];
               class_985 var6 = var4;
               if(var1 != null) {
                  if(var4 == null && var1 != null) {
                     break label37;
                  }

                  var6 = var4;
               }

               String var5 = var6.field_5031.replace(" ", "").toLowerCase();
               if(var1 == null) {
                  break label29;
               }

               if(var5.equals(var0)) {
                  return var4;
               }
            }

            ++var3;
         }

         if(var1 == null) {
            break;
         }
      }

      return null;
   }

   private String[] parseTileNames(String var1) {
      String[] var2 = class_752.method_4253();
      if(var1 == null) {
         return null;
      } else {
         ArrayList var3 = new ArrayList();
         String[] var11 = field_4169;
         String[] var4 = Config.tokenize(var1, " ,");
         int var5 = 0;

         String[] var10000;
         boolean var16;
         while(true) {
            if(var5 < var4.length) {
               var10000 = var4;
               if(var2 == null) {
                  break;
               }

               label149: {
                  String var6 = var4[var5];
                  var16 = var6.contains("-");
                  if(var2 != null) {
                     label128: {
                        if(var16) {
                           String[] var7 = Config.tokenize(var6, "-");
                           int var17 = var7.length;
                           if(var2 == null) {
                              break label128;
                           }

                           if(var17 == 2) {
                              int var8 = Config.parseInt(var7[0], -1);
                              int var9 = Config.parseInt(var7[1], -1);
                              if(var2 == null) {
                                 break label128;
                              }

                              if(var8 >= 0) {
                                 if(var2 == null) {
                                    break label128;
                                 }

                                 if(var9 >= 0) {
                                    var17 = var8;
                                    if(var2 != null) {
                                       if(var8 > var9) {
                                          StringBuilder var18 = new StringBuilder();
                                          var11 = field_4169;
                                          Config.warn(var18.append("Invalid interval: ").append(var6).append(", when parsing: ").append(var1).toString());
                                          if(var2 != null) {
                                             break label128;
                                          }
                                       }

                                       var17 = var8;
                                    }

                                    int var10 = var17;

                                    while(var10 <= var9) {
                                       var3.add(String.valueOf(var10));
                                       ++var10;
                                       if(var2 == null) {
                                          break label149;
                                       }

                                       if(var2 == null) {
                                          break;
                                       }
                                    }

                                    if(var2 != null) {
                                       break label128;
                                    }
                                 }
                              }
                           }
                        }

                        var3.add(var6);
                     }
                  }

                  ++var5;
               }

               if(var2 != null) {
                  continue;
               }
            }

            var10000 = (String[])((String[])var3.toArray(new String[var3.size()]));
            break;
         }

         String[] var12 = var10000;
         int var13 = 0;

         while(true) {
            if(var13 < var12.length) {
               var10000 = var12;
               if(var2 == null) {
                  break;
               }

               String var14;
               String var19;
               label144: {
                  var14 = var12[var13];
                  var14 = TextureUtils.fixResourcePath(var14, this.basePath);
                  var16 = var14.startsWith(this.basePath);
                  if(var2 != null) {
                     label145: {
                        if(!var16) {
                           var11 = field_4169;
                           var16 = var14.startsWith("textures/");
                           if(var2 == null) {
                              break label145;
                           }

                           if(!var16) {
                              var16 = var14.startsWith("mcpatcher/");
                              if(var2 == null) {
                                 break label145;
                              }

                              if(!var16) {
                                 var14 = this.basePath + "/" + var14;
                              }
                           }
                        }

                        var19 = var14;
                        if(var2 == null) {
                           break label144;
                        }

                        var11 = field_4169;
                        var16 = var14.endsWith(".png");
                     }
                  }

                  if(var16) {
                     var14 = var14.substring(0, var14.length() - 4);
                  }

                  var10000 = field_4169;
                  var19 = "textures/blocks/";
               }

               label75: {
                  label146: {
                     String var15 = var19;
                     var16 = var14.startsWith(var15);
                     if(var2 != null) {
                        if(var16) {
                           var14 = var14.substring(var15.length());
                        }

                        var19 = var14;
                        if(var2 == null) {
                           break label146;
                        }

                        var16 = var14.startsWith("/");
                     }

                     if(!var16) {
                        break label75;
                     }

                     var19 = var14.substring(1);
                  }

                  var14 = var19;
               }

               var12[var13] = var14;
               ++var13;
               if(var2 != null) {
                  continue;
               }
            }

            var10000 = var12;
            break;
         }

         return var10000;
      }
   }

   private static int parseInt(String var0) {
      String[] var1 = class_752.method_4253();
      String var10000 = var0;
      if(var1 != null) {
         if(var0 == null) {
            return -1;
         }

         var10000 = var0;
      }

      int var2 = Config.parseInt(var10000, -1);
      int var3 = var2;
      if(var1 != null) {
         if(var2 < 0) {
            StringBuilder var4 = new StringBuilder();
            String[] var10001 = field_4169;
            Config.warn(var4.append("Invalid number: ").append(var0).toString());
         }

         var3 = var2;
      }

      return var3;
   }

   private static int parseInt(String var0, int var1) {
      String[] var2 = class_752.method_4253();
      String var10000 = var0;
      if(var2 != null) {
         if(var0 == null) {
            return var1;
         }

         var10000 = var0;
      }

      int var3 = Config.parseInt(var10000, -1);
      int var4 = var3;
      if(var2 != null) {
         if(var3 < 0) {
            StringBuilder var5 = new StringBuilder();
            String[] var10001 = field_4169;
            Config.warn(var5.append("Invalid number: ").append(var0).toString());
            return var1;
         }

         var4 = var3;
      }

      return var4;
   }

   private static boolean parseBoolean(String var0) {
      String[] var1 = class_752.method_4253();
      String var10000 = var0;
      if(var1 != null) {
         if(var0 == null) {
            return false;
         }

         var10000 = var0.toLowerCase();
      }

      String[] var10001 = field_4169;
      return var10000.equals("true");
   }

   private static int parseSymmetry(String var0) {
      String[] var1 = class_752.method_4253();
      String var10000 = var0;
      if(var1 != null) {
         if(var0 == null) {
            return 1;
         }

         var10000 = var0;
      }

      String[] var2 = field_4169;
      byte var3 = var10000.equals("opposite");
      if(var1 != null) {
         if(var3 != 0) {
            return 2;
         }

         var2 = field_4169;
         var3 = var0.equals("all");
      }

      if(var1 != null) {
         if(var3 != 0) {
            return 6;
         }

         StringBuilder var4 = new StringBuilder();
         String[] var10001 = field_4169;
         Config.warn(var4.append("Unknown symmetry: ").append(var0).toString());
         var3 = 1;
      }

      return var3;
   }

   private static int parseFaces(String var0) {
      String[] var1 = class_752.method_4253();
      String var10000 = var0;
      if(var1 != null) {
         if(var0 == null) {
            return 63;
         }

         var10000 = var0;
      }

      String[] var10001 = field_4169;
      String[] var2 = Config.tokenize(var10000, " ,");
      int var3 = 0;
      int var4 = 0;

      int var7;
      while(true) {
         if(var4 < var2.length) {
            String var5 = var2[var4];
            int var6 = parseFace(var5);
            var7 = var3 | var6;
            if(var1 == null) {
               break;
            }

            var3 = var7;
            ++var4;
            if(var1 != null) {
               continue;
            }
         }

         var7 = var3;
         break;
      }

      return var7;
   }

   private static int parseFace(String var0) {
      String[] var10000 = class_752.method_4253();
      var0 = var0.toLowerCase();
      String[] var1 = var10000;
      String[] var2 = field_4169;
      short var4 = var0.equals("bottom");
      if(var1 != null) {
         if(var4 != 0) {
            return 1;
         }

         var2 = field_4169;
         var4 = var0.equals("top");
      }

      if(var1 != null) {
         if(var4 != 0) {
            return 2;
         }

         var2 = field_4169;
         var4 = var0.equals("north");
      }

      if(var1 != null) {
         if(var4 != 0) {
            return 4;
         }

         var2 = field_4169;
         var4 = var0.equals("south");
      }

      if(var1 != null) {
         if(var4 != 0) {
            return 8;
         }

         var2 = field_4169;
         var4 = var0.equals("east");
      }

      if(var1 != null) {
         if(var4 != 0) {
            return 32;
         }

         var2 = field_4169;
         var4 = var0.equals("west");
      }

      if(var1 != null) {
         if(var4 != 0) {
            return 16;
         }

         var2 = field_4169;
         var4 = var0.equals("sides");
      }

      if(var1 != null) {
         if(var4 != 0) {
            return 60;
         }

         var2 = field_4169;
         var4 = var0.equals("all");
      }

      if(var1 != null) {
         if(var4 != 0) {
            return 63;
         }

         StringBuilder var3 = new StringBuilder();
         String[] var10001 = field_4169;
         Config.warn(var3.append("Unknown face: ").append(var0).toString());
         var4 = 128;
      }

      return var4;
   }

   private static int parseConnect(String var0) {
      String[] var1 = class_752.method_4253();
      String var10000 = var0;
      if(var1 != null) {
         if(var0 == null) {
            return 0;
         }

         var10000 = var0;
      }

      String[] var2 = field_4169;
      short var3 = var10000.equals("block");
      if(var1 != null) {
         if(var3 != 0) {
            return 1;
         }

         var2 = field_4169;
         var3 = var0.equals("tile");
      }

      if(var1 != null) {
         if(var3 != 0) {
            return 2;
         }

         var2 = field_4169;
         var3 = var0.equals("material");
      }

      if(var1 != null) {
         if(var3 != 0) {
            return 3;
         }

         StringBuilder var4 = new StringBuilder();
         String[] var10001 = field_4169;
         Config.warn(var4.append("Unknown connect: ").append(var0).toString());
         var3 = 128;
      }

      return var3;
   }

   private static int[] parseInts(String var0) {
      String[] var1 = class_752.method_4253();
      if(var0 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();
         String[] var10 = field_4169;
         String[] var3 = Config.tokenize(var0, " ,");
         int var4 = 0;

         int var10000;
         while(true) {
            if(var4 < var3.length) {
               String var5 = var3[var4];
               var10000 = var5.contains("-");
               if(var1 == null) {
                  break;
               }

               label103: {
                  label113: {
                     StringBuilder var15;
                     if(var1 != null) {
                        if(var10000 != 0) {
                           String[] var6 = Config.tokenize(var5, "-");
                           var10000 = var6.length;
                           if(var1 != null) {
                              if(var10000 != 2) {
                                 var15 = new StringBuilder();
                                 var10 = field_4169;
                                 Config.warn(var15.append("Invalid interval: ").append(var5).append(", when parsing: ").append(var0).toString());
                                 if(var1 != null) {
                                    break label113;
                                 }
                              }

                              var10000 = Config.parseInt(var6[0], -1);
                           }

                           int var8;
                           label96: {
                              int var7;
                              label95: {
                                 var7 = var10000;
                                 var8 = Config.parseInt(var6[1], -1);
                                 if(var1 != null) {
                                    if(var7 >= 0) {
                                       label115: {
                                          var10000 = var8;
                                          if(var1 != null) {
                                             if(var8 < 0) {
                                                break label115;
                                             }

                                             var10000 = var7;
                                          }

                                          if(var1 == null) {
                                             break label96;
                                          }

                                          if(var10000 <= var8) {
                                             break label95;
                                          }
                                       }
                                    }

                                    var15 = new StringBuilder();
                                    var10 = field_4169;
                                    Config.warn(var15.append("Invalid interval: ").append(var5).append(", when parsing: ").append(var0).toString());
                                 }

                                 if(var1 != null) {
                                    break label113;
                                 }
                              }

                              var10000 = var7;
                           }

                           int var9 = var10000;

                           while(var9 <= var8) {
                              var2.add(Integer.valueOf(var9));
                              ++var9;
                              if(var1 == null) {
                                 break label103;
                              }

                              if(var1 == null) {
                                 break;
                              }
                           }

                           if(var1 != null) {
                              break label113;
                           }
                        }

                        var10000 = Config.parseInt(var5, -1);
                     }

                     int var14 = var10000;
                     if(var1 != null) {
                        label62: {
                           if(var14 < 0) {
                              var15 = new StringBuilder();
                              var10 = field_4169;
                              Config.warn(var15.append("Invalid number: ").append(var5).append(", when parsing: ").append(var0).toString());
                              if(var1 != null) {
                                 break label62;
                              }
                           }

                           var2.add(Integer.valueOf(var14));
                        }
                     }
                  }

                  ++var4;
               }

               if(var1 != null) {
                  continue;
               }
            }

            var10000 = var2.size();
            break;
         }

         int[] var12 = new int[var10000];
         int var13 = 0;

         int[] var11;
         while(true) {
            if(var13 < var12.length) {
               var11 = var12;
               if(var1 == null) {
                  break;
               }

               var12[var13] = ((Integer)var2.get(var13)).intValue();
               ++var13;
               if(var1 != null) {
                  continue;
               }
            }

            var11 = var12;
            break;
         }

         return var11;
      }
   }

   private static int parseMethod(String var0) {
      String[] var1 = class_752.method_4253();
      String var10000 = var0;
      if(var1 != null) {
         if(var0 == null) {
            return 1;
         }

         var10000 = var0;
      }

      String[] var2 = field_4169;
      byte var4 = var10000.equals("ctm");
      if(var1 != null) {
         if(var4 == 0) {
            label122: {
               var4 = var0.equals("glass");
               if(var1 != null) {
                  if(var4 != 0) {
                     break label122;
                  }

                  var2 = field_4169;
                  var4 = var0.equals("horizontal");
               }

               if(var1 != null) {
                  if(var4 == 0) {
                     label123: {
                        var2 = field_4169;
                        var4 = var0.equals("bookshelf");
                        if(var1 != null) {
                           if(var4 != 0) {
                              break label123;
                           }

                           var2 = field_4169;
                           var4 = var0.equals("vertical");
                        }

                        if(var1 != null) {
                           if(var4 != 0) {
                              return 6;
                           }

                           var2 = field_4169;
                           var4 = var0.equals("top");
                        }

                        if(var1 != null) {
                           if(var4 != 0) {
                              return 3;
                           }

                           var2 = field_4169;
                           var4 = var0.equals("random");
                        }

                        if(var1 != null) {
                           if(var4 != 0) {
                              return 4;
                           }

                           var2 = field_4169;
                           var4 = var0.equals("repeat");
                        }

                        if(var1 != null) {
                           if(var4 != 0) {
                              return 5;
                           }

                           var2 = field_4169;
                           var4 = var0.equals("fixed");
                        }

                        if(var1 != null) {
                           if(var4 != 0) {
                              return 7;
                           }

                           var2 = field_4169;
                           var4 = var0.equals("horizontal+vertical");
                        }

                        if(var1 != null) {
                           if(var4 == 0) {
                              label124: {
                                 var2 = field_4169;
                                 var4 = var0.equals("h+v");
                                 if(var1 != null) {
                                    if(var4 != 0) {
                                       break label124;
                                    }

                                    var2 = field_4169;
                                    var4 = var0.equals("vertical+horizontal");
                                 }

                                 if(var1 != null) {
                                    if(var4 == 0) {
                                       label78: {
                                          var2 = field_4169;
                                          var4 = var0.equals("v+h");
                                          if(var1 != null) {
                                             if(var4 != 0) {
                                                break label78;
                                             }

                                             StringBuilder var3 = new StringBuilder();
                                             String[] var10001 = field_4169;
                                             Config.warn(var3.append("Unknown method: ").append(var0).toString());
                                             var4 = 0;
                                          }

                                          return var4;
                                       }
                                    }

                                    var4 = 9;
                                 }

                                 return var4;
                              }
                           }

                           var4 = 8;
                        }

                        return var4;
                     }
                  }

                  var4 = 2;
               }

               return var4;
            }
         }

         var4 = 1;
      }

      return var4;
   }

   public boolean isValid(String var1) {
      String[] var2 = class_752.method_4253();
      String var10000 = this.name;
      if(var2 != null) {
         String[] var3;
         StringBuilder var7;
         if(this.name != null) {
            label153: {
               ConnectedProperties var6;
               label154: {
                  var10000 = this.name;
                  if(var2 != null) {
                     if(this.name.length() <= 0) {
                        break label153;
                     }

                     var6 = this;
                     if(var2 == null) {
                        break label154;
                     }

                     var10000 = this.basePath;
                  }

                  if(var10000 == null) {
                     var7 = new StringBuilder();
                     var3 = field_4169;
                     Config.warn(var7.append("No base path found: ").append(var1).toString());
                     return false;
                  }

                  var6 = this;
               }

               if(var2 != null) {
                  if(var6.matchBlocks == null) {
                     this.matchBlocks = this.detectMatchBlocks();
                  }

                  var6 = this;
               }

               label156: {
                  int[] var8;
                  label157: {
                     if(var2 != null) {
                        if(var6.matchTiles == null) {
                           var8 = this.matchBlocks;
                           if(var2 == null) {
                              break label157;
                           }

                           if(this.matchBlocks == null) {
                              this.matchTiles = this.detectMatchTiles();
                           }
                        }

                        var6 = this;
                     }

                     if(var2 == null) {
                        break label156;
                     }

                     var8 = var6.matchBlocks;
                  }

                  if(var8 == null) {
                     var6 = this;
                     if(var2 == null) {
                        break label156;
                     }

                     if(this.matchTiles == null) {
                        var7 = new StringBuilder();
                        var3 = field_4169;
                        Config.warn(var7.append("No matchBlocks or matchTiles specified: ").append(var1).toString());
                        return false;
                     }
                  }

                  var6 = this;
               }

               if(var2 != null) {
                  if(var6.method == 0) {
                     var7 = new StringBuilder();
                     var3 = field_4169;
                     Config.warn(var7.append("No method: ").append(var1).toString());
                     return false;
                  }

                  var6 = this;
               }

               label158: {
                  String[] var4 = var6.tiles;
                  if(var2 != null) {
                     if(var4 == null) {
                        break label158;
                     }

                     var4 = this.tiles;
                  }

                  int var5 = var4.length;
                  if(var2 != null) {
                     if(var5 <= 0) {
                        break label158;
                     }

                     var5 = this.connect;
                  }

                  if(var2 != null) {
                     if(var5 == 0) {
                        this.connect = this.detectConnect();
                     }

                     var5 = this.connect;
                  }

                  if(var2 != null) {
                     if(var5 == 128) {
                        var7 = new StringBuilder();
                        var3 = field_4169;
                        Config.warn(var7.append("Invalid connect in: ").append(var1).toString());
                        return false;
                     }

                     var5 = this.renderPass;
                  }

                  if(var2 != null) {
                     if(var5 > 0) {
                        var7 = new StringBuilder();
                        var3 = field_4169;
                        Config.warn(var7.append("Render pass not supported: ").append(this.renderPass).toString());
                        return false;
                     }

                     var5 = this.faces & 128;
                  }

                  if(var2 != null) {
                     if(var5 != 0) {
                        var7 = new StringBuilder();
                        var3 = field_4169;
                        Config.warn(var7.append("Invalid faces in: ").append(var1).toString());
                        return false;
                     }

                     var5 = this.symmetry & 128;
                  }

                  if(var2 != null) {
                     if(var5 != 0) {
                        var7 = new StringBuilder();
                        var3 = field_4169;
                        Config.warn(var7.append("Invalid symmetry in: ").append(var1).toString());
                        return false;
                     }

                     var5 = this.method;
                  }

                  if(var2 != null) {
                     switch(var5) {
                     case 1:
                        return this.isValidCtm(var1);
                     case 2:
                        return this.isValidHorizontal(var1);
                     case 3:
                        return this.isValidTop(var1);
                     case 4:
                        return this.isValidRandom(var1);
                     case 5:
                        return this.isValidRepeat(var1);
                     case 6:
                        return this.isValidVertical(var1);
                     case 7:
                        return this.isValidFixed(var1);
                     case 8:
                        return this.isValidHorizontalVertical(var1);
                     case 9:
                        return this.isValidVerticalHorizontal(var1);
                     default:
                        var7 = new StringBuilder();
                        String[] var10001 = field_4169;
                        Config.warn(var7.append("Unknown method: ").append(var1).toString());
                        var5 = 0;
                     }
                  }

                  return (boolean)var5;
               }

               var7 = new StringBuilder();
               var3 = field_4169;
               Config.warn(var7.append("No tiles specified: ").append(var1).toString());
               return false;
            }
         }

         var7 = new StringBuilder();
         var3 = field_4169;
         var10000 = var7.append("No name found: ").append(var1).toString();
      }

      Config.warn(var10000);
      return false;
   }

   private int detectConnect() {
      String[] var1 = class_752.method_4253();
      ConnectedProperties var10000 = this;
      if(var1 != null) {
         if(this.matchBlocks != null) {
            return 1;
         }

         var10000 = this;
      }

      return var10000.matchTiles != null?2:128;
   }

   private int[] detectMatchBlocks() {
      String[] var1 = class_752.method_4253();
      String[] var6 = field_4169;
      int var10000 = this.name.startsWith("block");
      if(var1 != null) {
         if(var10000 == 0) {
            return null;
         }

         String[] var8 = field_4169;
         var10000 = "block".length();
      }

      int var2 = var10000;
      int var3 = var2;

      int var10001;
      while(true) {
         if(var3 < this.name.length()) {
            char var4 = this.name.charAt(var3);
            var10000 = var4;
            var10001 = 48;
            if(var1 == null || var1 == null) {
               break;
            }

            if(var4 >= 48 && (var4 <= 57 || var1 == null)) {
               ++var3;
               if(var1 != null) {
                  continue;
               }
            }
         }

         var10000 = var3;
         var10001 = var2;
         break;
      }

      if(var10000 == var10001) {
         return null;
      } else {
         String var7 = this.name.substring(var2, var3);
         int var5 = Config.parseInt(var7, -1);
         var10000 = var5;
         if(var1 != null) {
            if(var5 < 0) {
               return null;
            }

            var10000 = 1;
         }

         int[] var9 = new int[var10000];
         var9[0] = var5;
         return var9;
      }
   }

   private String[] detectMatchTiles() {
      class_73 var1 = getIcon(this.name);
      return var1 == null?null:new String[]{this.name};
   }

   private static class_73 getIcon(String var0) {
      return bpz.textureMapBlocks.getIconSafe(var0);
   }

   private boolean isValidCtm(String var1) {
      String[] var2 = class_752.method_4253();
      String[] var10000 = this.tiles;
      if(var2 != null) {
         if(this.tiles == null) {
            String[] var3 = field_4169;
            this.tiles = this.parseTileNames("0-11 16-27 32-43 48-58");
         }

         var10000 = this.tiles;
      }

      int var4 = var10000.length;
      if(var2 != null) {
         if(var4 < 47) {
            StringBuilder var5 = new StringBuilder();
            String[] var10001 = field_4169;
            Config.warn(var5.append("Invalid tiles, must be at least 47: ").append(var1).toString());
            return false;
         }

         var4 = 1;
      }

      return (boolean)var4;
   }

   private boolean isValidHorizontal(String var1) {
      String[] var2 = class_752.method_4253();
      String[] var10000 = this.tiles;
      if(var2 != null) {
         if(this.tiles == null) {
            String[] var3 = field_4169;
            this.tiles = this.parseTileNames("12-15");
         }

         var10000 = this.tiles;
      }

      int var4 = var10000.length;
      if(var2 != null) {
         if(var4 != 4) {
            StringBuilder var5 = new StringBuilder();
            String[] var10001 = field_4169;
            Config.warn(var5.append("Invalid tiles, must be exactly 4: ").append(var1).toString());
            return false;
         }

         var4 = 1;
      }

      return (boolean)var4;
   }

   private boolean isValidVertical(String var1) {
      String[] var2 = class_752.method_4253();
      String[] var10000 = this.tiles;
      StringBuilder var5;
      if(var2 != null) {
         if(this.tiles == null) {
            var5 = new StringBuilder();
            String[] var3 = field_4169;
            Config.warn(var5.append("No tiles defined for vertical: ").append(var1).toString());
            return false;
         }

         var10000 = this.tiles;
      }

      int var4 = var10000.length;
      if(var2 != null) {
         if(var4 != 4) {
            var5 = new StringBuilder();
            String[] var10001 = field_4169;
            Config.warn(var5.append("Invalid tiles, must be exactly 4: ").append(var1).toString());
            return false;
         }

         var4 = 1;
      }

      return (boolean)var4;
   }

   private boolean isValidHorizontalVertical(String var1) {
      String[] var2 = class_752.method_4253();
      String[] var10000 = this.tiles;
      StringBuilder var5;
      if(var2 != null) {
         if(this.tiles == null) {
            var5 = new StringBuilder();
            String[] var3 = field_4169;
            Config.warn(var5.append("No tiles defined for horizontal+vertical: ").append(var1).toString());
            return false;
         }

         var10000 = this.tiles;
      }

      int var4 = var10000.length;
      if(var2 != null) {
         if(var4 != 7) {
            var5 = new StringBuilder();
            String[] var10001 = field_4169;
            Config.warn(var5.append("Invalid tiles, must be exactly 7: ").append(var1).toString());
            return false;
         }

         var4 = 1;
      }

      return (boolean)var4;
   }

   private boolean isValidVerticalHorizontal(String var1) {
      String[] var2 = class_752.method_4253();
      String[] var10000 = this.tiles;
      StringBuilder var5;
      if(var2 != null) {
         if(this.tiles == null) {
            var5 = new StringBuilder();
            String[] var3 = field_4169;
            Config.warn(var5.append("No tiles defined for vertical+horizontal: ").append(var1).toString());
            return false;
         }

         var10000 = this.tiles;
      }

      int var4 = var10000.length;
      if(var2 != null) {
         if(var4 != 7) {
            var5 = new StringBuilder();
            String[] var10001 = field_4169;
            Config.warn(var5.append("Invalid tiles, must be exactly 7: ").append(var1).toString());
            return false;
         }

         var4 = 1;
      }

      return (boolean)var4;
   }

   private boolean isValidRandom(String var1) {
      String[] var2 = class_752.method_4253();
      if(var2 != null) {
         String[] var6;
         StringBuilder var10;
         if(this.tiles != null) {
            label86: {
               ConnectedProperties var10000 = this;
               if(var2 != null) {
                  if(this.tiles.length <= 0) {
                     break label86;
                  }

                  var10000 = this;
               }

               int var4;
               label81: {
                  int[] var8 = var10000.weights;
                  if(var2 != null) {
                     label82: {
                        if(var10000.weights != null) {
                           int var9 = this.weights.length;
                           int var10001 = this.tiles.length;
                           int[] var3;
                           if(var2 != null) {
                              if(var9 > var10001) {
                                 var10 = new StringBuilder();
                                 var6 = field_4169;
                                 Config.warn(var10.append("More weights defined than tiles, trimming weights: ").append(var1).toString());
                                 var3 = new int[this.tiles.length];
                                 System.arraycopy(this.weights, 0, var3, 0, var3.length);
                                 this.weights = var3;
                              }

                              var8 = this.weights;
                              if(var2 == null) {
                                 break label82;
                              }

                              var9 = this.weights.length;
                              var10001 = this.tiles.length;
                           }

                           if(var9 < var10001) {
                              var10 = new StringBuilder();
                              String[] var11 = field_4169;
                              Config.warn(var10.append("Less weights defined than tiles, expanding weights: ").append(var1).toString());
                              var3 = new int[this.tiles.length];
                              System.arraycopy(this.weights, 0, var3, 0, this.weights.length);
                              var4 = this.getAverage(this.weights);
                              int var5 = this.weights.length;

                              while(true) {
                                 if(var5 < var3.length) {
                                    var3[var5] = var4;
                                    ++var5;
                                    if(var2 == null) {
                                       break;
                                    }

                                    if(var2 != null) {
                                       continue;
                                    }
                                 }

                                 this.weights = var3;
                                 break;
                              }
                           }
                        }

                        var10000 = this;
                        if(var2 == null) {
                           break label81;
                        }

                        var8 = this.weights;
                     }
                  }

                  if(var8 == null) {
                     return true;
                  }

                  var10000 = this;
               }

               var10000.sumWeights = new int[this.weights.length];
               int var7 = 0;
               var4 = 0;

               while(true) {
                  if(var4 < this.weights.length) {
                     var7 += this.weights[var4];
                     this.sumWeights[var4] = var7;
                     ++var4;
                     if(var2 == null) {
                        break;
                     }

                     if(var2 != null) {
                        continue;
                     }
                  }

                  this.sumAllWeights = var7;
                  break;
               }

               return true;
            }
         }

         var10 = new StringBuilder();
         var6 = field_4169;
         Config.warn(var10.append("Tiles not defined: ").append(var1).toString());
      }

      return false;
   }

   private int getAverage(int[] var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.length;
      if(var2 != null) {
         if(var10000 <= 0) {
            return 0;
         }

         var10000 = 0;
      }

      int var3 = var10000;
      int var4 = 0;

      while(true) {
         if(var4 < var1.length) {
            int var5 = var1[var4];
            var3 += var5;
            ++var4;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         var4 = var3 / var1.length;
         break;
      }

      return var4;
   }

   private boolean isValidRepeat(String var1) {
      String[] var2 = class_752.method_4253();
      ConnectedProperties var10000 = this;
      String[] var3;
      StringBuilder var6;
      if(var2 != null) {
         if(this.tiles == null) {
            var6 = new StringBuilder();
            var3 = field_4169;
            Config.warn(var6.append("Tiles not defined: ").append(var1).toString());
            return false;
         }

         var10000 = this;
      }

      int var4 = var10000.width;
      if(var2 != null) {
         if(var4 > 0) {
            label58: {
               var4 = this.width;
               if(var2 != null) {
                  if(this.width > 16) {
                     break label58;
                  }

                  var4 = this.height;
               }

               if(var2 != null) {
                  if(var4 > 0) {
                     label63: {
                        var4 = this.height;
                        int var10001 = 16;
                        if(var2 != null) {
                           if(this.height > 16) {
                              break label63;
                           }

                           var4 = this.tiles.length;
                           if(var2 == null) {
                              return (boolean)var4;
                           }

                           var10001 = this.width * this.height;
                        }

                        if(var4 != var10001) {
                           var6 = new StringBuilder();
                           String[] var5 = field_4169;
                           Config.warn(var6.append("Number of tiles does not equal width x height: ").append(var1).toString());
                           return false;
                        }

                        var4 = 1;
                        return (boolean)var4;
                     }
                  }

                  var6 = new StringBuilder();
                  var3 = field_4169;
                  Config.warn(var6.append("Invalid height: ").append(var1).toString());
                  var4 = 0;
               }

               return (boolean)var4;
            }
         }

         var6 = new StringBuilder();
         var3 = field_4169;
         Config.warn(var6.append("Invalid width: ").append(var1).toString());
         var4 = 0;
      }

      return (boolean)var4;
   }

   private boolean isValidFixed(String var1) {
      String[] var2 = class_752.method_4253();
      String[] var10000 = this.tiles;
      if(var2 != null) {
         if(this.tiles == null) {
            StringBuilder var5 = new StringBuilder();
            String[] var3 = field_4169;
            Config.warn(var5.append("Tiles not defined: ").append(var1).toString());
            return false;
         }

         var10000 = this.tiles;
      }

      int var4 = var10000.length;
      if(var2 != null) {
         if(var4 != 1) {
            var10000 = field_4169;
            Config.warn("Number of tiles should be 1 for method: fixed.");
            return false;
         }

         var4 = 1;
      }

      return (boolean)var4;
   }

   private boolean isValidTop(String var1) {
      String[] var2 = class_752.method_4253();
      String[] var10000 = this.tiles;
      if(var2 != null) {
         if(this.tiles == null) {
            String[] var3 = field_4169;
            this.tiles = this.parseTileNames("66");
         }

         var10000 = this.tiles;
      }

      int var4 = var10000.length;
      if(var2 != null) {
         if(var4 != 1) {
            StringBuilder var5 = new StringBuilder();
            String[] var10001 = field_4169;
            Config.warn(var5.append("Invalid tiles, must be exactly 1: ").append(var1).toString());
            return false;
         }

         var4 = 1;
      }

      return (boolean)var4;
   }

   public void updateIcons(bpz var1) {
      ConnectedProperties var3;
      label25: {
         String[] var2 = class_752.method_4253();
         String[] var10000 = this.matchTiles;
         if(var2 != null) {
            if(this.matchTiles != null) {
               this.matchTileIcons = registerIcons(this.matchTiles, var1);
            }

            var3 = this;
            if(var2 == null) {
               break label25;
            }

            var10000 = this.tiles;
         }

         if(var10000 == null) {
            return;
         }

         var3 = this;
      }

      var3.tileIcons = registerIcons(this.tiles, var1);
   }

   private static class_73[] registerIcons(String[] var0, bpz var1) {
      String[] var2 = class_752.method_4253();
      if(var0 == null) {
         return null;
      } else {
         ArrayList var3 = new ArrayList();
         int var4 = 0;

         Object var10000;
         while(true) {
            if(var4 < var0.length) {
               var10000 = var0;
               if(var2 == null) {
                  break;
               }

               String var5 = var0[var4];
               String var6 = var5;
               String var13 = var5;
               StringBuilder var14;
               if(var2 != null) {
                  String[] var11;
                  if(!var5.contains("/")) {
                     var14 = new StringBuilder();
                     var11 = field_4169;
                     var6 = var14.append("textures/blocks/").append(var5).toString();
                  }

                  var14 = (new StringBuilder()).append(var6);
                  var11 = field_4169;
                  var13 = var14.append(".png").toString();
               }

               String var7 = var13;
               bqx var15 = new bqx;
               var15.method_8227(var7);
               bqx var8 = var15;
               boolean var9 = Config.hasResource(var8);
               if(!var9) {
                  var14 = new StringBuilder();
                  String[] var10001 = field_4169;
                  Config.warn(var14.append("File not found: ").append(var7).toString());
               }

               class_73 var10 = var1.method_375(var5);
               var3.add(var10);
               ++var4;
               if(var2 != null) {
                  continue;
               }
            }

            var10000 = var3.toArray(new class_73[var3.size()]);
            break;
         }

         class_73[] var12 = (class_73[])((class_73[])var10000);
         return var12;
      }
   }

   public String toString() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_4169;
      return var10000.append("CTM name: ").append(this.name).append(", basePath: ").append(this.basePath).append(", matchBlocks: ").append(Config.arrayToString(this.matchBlocks)).append(", matchTiles: ").append(Config.arrayToString((Object[])this.matchTiles)).toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_5060() {
      // $FF: Couldn't be decompiled
   }
}
