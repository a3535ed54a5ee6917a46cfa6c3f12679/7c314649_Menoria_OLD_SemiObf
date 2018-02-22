import java.awt.Dimension;
import java.nio.IntBuffer;
import java.util.ArrayList;
import org.lwjgl.opengl.GL11;

public class Mipmaps {

   private final String iconName;
   private final int width;
   private final int height;
   private final int[] data;
   private final boolean direct;
   private int[][] mipmapDatas;
   private IntBuffer[] mipmapBuffers;
   private Dimension[] mipmapDimensions;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2769;


   // $FF: renamed from: <init> (java.lang.String, int, int, int[], boolean) void
   public void method_3510(String var1, int var2, int var3, int[] var4, boolean var5) {
      super();
      this.iconName = var1;
      String[] var6 = class_752.method_4253();
      this.width = var2;
      this.height = var3;
      this.data = var4;
      this.direct = var5;
      this.mipmapDimensions = makeMipmapDimensions(var2, var3, var1);
      Mipmaps var10000 = this;
      if(var6 != null) {
         this.mipmapDatas = generateMipMapData(var4, var2, var3, this.mipmapDimensions);
         if(!var5) {
            return;
         }

         var10000 = this;
      }

      var10000.mipmapBuffers = makeMipmapBuffers(this.mipmapDimensions, this.mipmapDatas);
   }

   public static Dimension[] makeMipmapDimensions(int var0, int var1, String var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = TextureUtils.ceilPowerOfTwo(var0);
      String[] var3 = var10000;
      int var5 = TextureUtils.ceilPowerOfTwo(var1);
      int var12 = var4;
      if(var3 != null) {
         if(var4 == var0) {
            var12 = var5;
            if(var3 == null) {
               return new Dimension[var12];
            }

            if(var5 == var1) {
               ArrayList var6 = new ArrayList();
               int var7 = var4;
               int var8 = var5;

               do {
                  label42: {
                     var7 /= 2;
                     var8 /= 2;
                     if(var7 <= 0) {
                        var12 = var8;
                        if(var3 == null || var3 == null) {
                           break label42;
                        }

                        if(var8 <= 0) {
                           Dimension[] var9 = (Dimension[])((Dimension[])((Dimension[])var6.toArray(new Dimension[var6.size()])));
                           return var9;
                        }
                     }

                     var12 = var7;
                  }

                  if(var3 != null) {
                     if(var12 <= 0) {
                        var7 = 1;
                     }

                     var12 = var8;
                  }

                  if(var3 != null) {
                     if(var12 <= 0) {
                        var8 = 1;
                     }

                     var12 = var7 * var8 * 4;
                  }

                  Dimension var10 = new Dimension(var7, var8);
                  var6.add(var10);
               } while(var3 != null);
            }
         }

         StringBuilder var13 = new StringBuilder();
         String[] var11 = field_2769;
         Config.warn(var13.append("Mipmaps not possible (power of 2 dimensions needed), texture: ").append(var2).append(", dim: ").append(var0).append("x").append(var1).toString());
         var12 = 0;
      }

      return new Dimension[var12];
   }

   public static int[][] generateMipMapData(int[] var0, int var1, int var2, Dimension[] var3) {
      String[] var10000 = class_752.method_4253();
      int[] var5 = var0;
      int var6 = var1;
      String[] var4 = var10000;
      int var7 = 1;
      int[][] var8 = new int[var3.length][];
      int var9 = 0;

      int[][] var22;
      while(true) {
         if(var9 < var3.length) {
            Dimension var10 = var3[var9];
            int var11 = var10.width;
            int var12 = var10.height;
            int[] var13 = new int[var11 * var12];
            var22 = var8;
            if(var4 == null) {
               break;
            }

            var8[var9] = var13;
            int var14 = var9 + 1;
            int var23 = var7;
            if(var4 != null) {
               label60: {
                  if(var7 != 0) {
                     int var15 = 0;

                     while(var15 < var11) {
                        var23 = 0;
                        if(var4 == null) {
                           break label60;
                        }

                        int var16 = 0;

                        while(true) {
                           if(var16 < var12) {
                              int var17 = var5[var15 * 2 + 0 + (var16 * 2 + 0) * var6];
                              int var18 = var5[var15 * 2 + 1 + (var16 * 2 + 0) * var6];
                              int var19 = var5[var15 * 2 + 1 + (var16 * 2 + 1) * var6];
                              int var20 = var5[var15 * 2 + 0 + (var16 * 2 + 1) * var6];
                              int var21 = alphaBlend(var17, var18, var19, var20);
                              var13[var15 + var16 * var11] = var21;
                              ++var16;
                              if(var4 == null) {
                                 break;
                              }

                              if(var4 != null) {
                                 continue;
                              }
                           }

                           ++var15;
                           break;
                        }

                        if(var4 == null) {
                           break;
                        }
                     }
                  }

                  var5 = var13;
                  var6 = var11;
                  var23 = var11;
               }
            }

            label39: {
               if(var4 != null) {
                  label37: {
                     if(var23 > 1) {
                        var23 = var12;
                        if(var4 == null) {
                           break label37;
                        }

                        if(var12 > 1) {
                           break label39;
                        }
                     }

                     var23 = 0;
                  }
               }

               var7 = var23;
            }

            ++var9;
            if(var4 != null) {
               continue;
            }
         }

         var22 = var8;
         break;
      }

      return var22;
   }

   public static int alphaBlend(int var0, int var1, int var2, int var3) {
      int var4 = alphaBlend(var0, var1);
      int var5 = alphaBlend(var2, var3);
      int var6 = alphaBlend(var4, var5);
      return var6;
   }

   private static int alphaBlend(int var0, int var1) {
      int var3;
      int var4;
      int var5;
      int var15;
      label37: {
         label39: {
            String[] var10000 = class_752.method_4253();
            var3 = (var0 & -16777216) >> 24 & 255;
            String[] var2 = var10000;
            var4 = (var1 & -16777216) >> 24 & 255;
            var5 = (var3 + var4) / 2;
            var15 = var3;
            if(var2 != null) {
               label34: {
                  if(var3 == 0) {
                     var15 = var4;
                     if(var2 == null) {
                        break label34;
                     }

                     if(var4 == 0) {
                        var3 = 1;
                        var4 = 1;
                        if(var2 != null) {
                           break label39;
                        }
                     }
                  }

                  var15 = var3;
               }
            }

            if(var2 != null) {
               if(var15 == 0) {
                  var0 = var1;
                  var5 /= 2;
               }

               var15 = var4;
            }

            if(var2 == null) {
               break label37;
            }

            if(var15 == 0) {
               var1 = var0;
               var5 /= 2;
            }
         }

         var15 = (var0 >> 16 & 255) * var3;
      }

      int var6 = var15;
      int var7 = (var0 >> 8 & 255) * var3;
      int var8 = (var0 & 255) * var3;
      int var9 = (var1 >> 16 & 255) * var4;
      int var10 = (var1 >> 8 & 255) * var4;
      int var11 = (var1 & 255) * var4;
      int var12 = (var6 + var9) / (var3 + var4);
      int var13 = (var7 + var10) / (var3 + var4);
      int var14 = (var8 + var11) / (var3 + var4);
      return var5 << 24 | var12 << 16 | var13 << 8 | var14;
   }

   private int averageColor(int var1, int var2) {
      int var3 = (var1 & -16777216) >> 24 & 255;
      int var4 = (var2 & -16777216) >> 24 & 255;
      return (var3 + var4 >> 1 << 24) + ((var1 & 16711422) + (var2 & 16711422) >> 1);
   }

   public static IntBuffer[] makeMipmapBuffers(Dimension[] var0, int[][] var1) {
      String[] var2 = class_752.method_4253();
      Dimension[] var10000 = var0;
      if(var2 != null) {
         if(var0 == null) {
            return null;
         }

         var10000 = var0;
      }

      IntBuffer[] var3 = new IntBuffer[var10000.length];
      int var4 = 0;

      IntBuffer[] var9;
      while(true) {
         if(var4 < var0.length) {
            Dimension var5 = var0[var4];
            int var6 = var5.width * var5.height;
            IntBuffer var7 = ban.method_5199(var6);
            int[] var8 = var1[var4];
            var7.clear();
            var7.put(var8);
            var7.clear();
            var9 = var3;
            if(var2 == null) {
               break;
            }

            var3[var4] = var7;
            ++var4;
            if(var2 != null) {
               continue;
            }
         }

         var9 = var3;
         break;
      }

      return var9;
   }

   public static void allocateMipmapTextures(int var0, int var1, String var2) {
      Dimension[] var4 = makeMipmapDimensions(var0, var1, var2);
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var3 = var10000;

      while(var5 < var4.length) {
         Dimension var6 = var4[var5];
         int var7 = var6.width;
         int var8 = var6.height;
         int var9 = var5 + 1;
         GL11.glTexImage2D(3553, var9, 6408, var7, var8, 0, '\u80e1', '\u8367', (IntBuffer)null);
         ++var5;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_3511() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Ï³(,Í9ôÈ¬1mÍ%§Õª\'!ØjüÖ¬2(Ïj»ÀãwmÙ#¹Ã­6$Ò$§­ (Ù/°ïe9Ø2 Ó± wø§, j";
      int var4 = "Ï³(,Í9ôÈ¬1mÍ%§Õª\'!ØjüÖ¬2(Ïj»ÀãwmÙ#¹Ã­6$Ò$§­ (Ù/°ïe9Ø2 Ó± wø§, j".length();
      char var1 = 62;
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
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2769 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 144;
               break;
            case 1:
               var10009 = 226;
               break;
            case 2:
               var10009 = 135;
               break;
            case 3:
               var10009 = 1;
               break;
            case 4:
               var10009 = 9;
               break;
            case 5:
               var10009 = 249;
               break;
            default:
               var10009 = 14;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
