import java.awt.image.BufferedImage;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class bqi {

   // $FF: renamed from: c org.apache.logging.log4j.Logger
   private static final Logger field_7926;
   // $FF: renamed from: d java.nio.IntBuffer
   private static final IntBuffer field_7927;
   // $FF: renamed from: a bpq
   public static final bpq field_7928;
   // $FF: renamed from: b int[]
   public static final int[] field_7929;
   // $FF: renamed from: e int
   private static int field_7930;
   // $FF: renamed from: f int
   private static int field_7931;
   // $FF: renamed from: g float
   private static float field_7932;
   // $FF: renamed from: h int[]
   private static final int[] field_7933;
   private static final String __OBFID = "CL_00001067";


   // $FF: renamed from: <init> () void
   public void method_8142() {
      super();
   }

   // $FF: renamed from: a () int
   public static int method_8143() {
      return GL11.glGenTextures();
   }

   // $FF: renamed from: a (int) void
   public static void method_8144(int var0) {
      GL11.glDeleteTextures(var0);
   }

   // $FF: renamed from: a (int, java.awt.image.BufferedImage) int
   public static int method_8145(int var0, BufferedImage var1) {
      return method_8152(var0, var1, false, false);
   }

   // $FF: renamed from: a (int, int[], int, int) void
   public static void method_8146(int var0, int[] var1, int var2, int var3) {
      method_8166(var0);
      method_8151(0, var1, var2, var3, 0, 0, false, false, false);
   }

   // $FF: renamed from: a (int, int, int[][]) int[][]
   public static int[][] method_8147(int var0, int var1, int[][] var2) {
      String[] var10000 = class_752.method_4253();
      int[][] var4 = new int[var0 + 1][];
      String[] var3 = var10000;
      int[][] var15 = var4;
      if(var3 != null) {
         var4[0] = var2[0];
         if(var0 > 0) {
            int var5 = 0;
            int var6 = 0;

            int var16;
            while(true) {
               if(var6 < var2.length) {
                  label94: {
                     var16 = var2[0][var6] >> 24;
                     if(var3 == null) {
                        break;
                     }

                     label53: {
                        if(var3 != null) {
                           if(var16 != 0) {
                              break label53;
                           }

                           var16 = 1;
                        }

                        var5 = var16;
                        if(var3 != null) {
                           break label94;
                        }
                     }

                     ++var6;
                     if(var3 != null) {
                        continue;
                     }
                  }
               }

               var16 = 1;
               break;
            }

            var6 = var16;

            label87:
            do {
               var16 = var6;

               label84:
               while(true) {
                  if(var16 > var0) {
                     break label87;
                  }

                  var15 = var2;
                  if(var3 == null) {
                     return var15;
                  }

                  int[] var17 = var2[var6];
                  if(var3 != null) {
                     if(var17 != null) {
                        var4[var6] = var2[var6];
                        if(var3 != null) {
                           break;
                        }
                     }

                     var17 = var4[var6 - 1];
                  }

                  int[] var7 = var17;
                  int[] var8 = new int[var7.length >> 2];
                  int var9 = var1 >> var6;
                  int var10 = var8.length / var9;
                  int var11 = var9 << 1;
                  int var12 = 0;

                  while(var12 < var9) {
                     var16 = 0;
                     if(var3 == null) {
                        continue label84;
                     }

                     int var13 = 0;

                     while(true) {
                        if(var13 < var10) {
                           int var14 = 2 * (var12 + var13 * var11);
                           var8[var12 + var13 * var9] = method_8148(var7[var14 + 0], var7[var14 + 1], var7[var14 + 0 + var11], var7[var14 + 1 + var11], (boolean)var5);
                           ++var13;
                           if(var3 == null) {
                              break;
                           }

                           if(var3 != null) {
                              continue;
                           }
                        }

                        ++var12;
                        break;
                     }

                     if(var3 == null) {
                        break;
                     }
                  }

                  var4[var6] = var8;
                  break;
               }

               ++var6;
            } while(var3 != null);
         }

         var15 = var4;
      }

      return var15;
   }

   // $FF: renamed from: a (int, int, int, int, boolean) int
   private static int method_8148(int var0, int var1, int var2, int var3, boolean var4) {
      return Mipmaps.alphaBlend(var0, var1, var2, var3);
   }

   // $FF: renamed from: a (int, int, int, int, int) int
   private static int method_8149(int var0, int var1, int var2, int var3, int var4) {
      float var5 = (float)Math.pow((double)((float)(var0 >> var4 & 255) / 255.0F), 2.2D);
      float var6 = (float)Math.pow((double)((float)(var1 >> var4 & 255) / 255.0F), 2.2D);
      float var7 = (float)Math.pow((double)((float)(var2 >> var4 & 255) / 255.0F), 2.2D);
      float var8 = (float)Math.pow((double)((float)(var3 >> var4 & 255) / 255.0F), 2.2D);
      float var9 = (float)Math.pow((double)(var5 + var6 + var7 + var8) * 0.25D, 0.45454545454545453D);
      return (int)((double)var9 * 255.0D);
   }

   // $FF: renamed from: a (int[][], int, int, int, int, boolean, boolean) void
   public static void method_8150(int[][] var0, int var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      String[] var10000 = class_752.method_4253();
      int var8 = 0;
      String[] var7 = var10000;

      while(var8 < var0.length) {
         int[] var9 = var0[var8];
         int var10002 = var1 >> var8;
         int var10003 = var2 >> var8;
         int var10004 = var3 >> var8;
         int var10005 = var4 >> var8;
         int var10008 = var0.length;
         if(var7 != null) {
            var10008 = var10008 > 1?1:0;
         }

         method_8151(var8, var9, var10002, var10003, var10004, var10005, var5, var6, (boolean)var10008);
         ++var8;
         if(var7 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (int, int[], int, int, int, int, boolean, boolean, boolean) void
   private static void method_8151(int var0, int[] var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7, boolean var8) {
      int var9 = 4194304 / var2;
      method_8163(var6, var8);
      method_8157(var7);

      int var10;
      for(int var11 = 0; var11 < var2 * var3; var11 += var2 * var10) {
         int var12 = var11 / var2;
         var10 = Math.min(var9, var3 - var12);
         int var13 = var2 * var10;
         method_8165(var1, var11, var13);
         GL11.glTexSubImage2D(3553, var0, var4, var5 + var12, var2, var10, '\u80e1', '\u8367', field_7927);
      }

   }

   // $FF: renamed from: a (int, java.awt.image.BufferedImage, boolean, boolean) int
   public static int method_8152(int var0, BufferedImage var1, boolean var2, boolean var3) {
      method_8153(var0, var1.getWidth(), var1.getHeight());
      return method_8155(var0, var1, 0, 0, var2, var3);
   }

   // $FF: renamed from: a (int, int, int) void
   public static void method_8153(int var0, int var1, int var2) {
      method_8154(var0, 0, var1, var2, 1.0F);
   }

   // $FF: renamed from: a (int, int, int, int, float) void
   public static void method_8154(int var0, int var1, int var2, int var3, float var4) {
      method_8144(var0);
      method_8166(var0);
      if(buu.field_8576) {
         GL11.glTexParameterf(3553, '\u84fe', var4);
      }

      if(var1 > 0) {
         GL11.glTexParameteri(3553, '\u813d', var1);
         GL11.glTexParameterf(3553, '\u813a', 0.0F);
         GL11.glTexParameterf(3553, '\u813b', (float)var1);
         GL11.glTexParameterf(3553, '\u8501', 0.0F);
      }

      for(int var5 = 0; var5 <= var1; ++var5) {
         GL11.glTexImage2D(3553, var5, 6408, var2 >> var5, var3 >> var5, 0, '\u80e1', '\u8367', (IntBuffer)null);
      }

   }

   // $FF: renamed from: a (int, java.awt.image.BufferedImage, int, int, boolean, boolean) int
   public static int method_8155(int var0, BufferedImage var1, int var2, int var3, boolean var4, boolean var5) {
      method_8166(var0);
      method_8156(var1, var2, var3, var4, var5);
      return var0;
   }

   // $FF: renamed from: a (java.awt.image.BufferedImage, int, int, boolean, boolean) void
   private static void method_8156(BufferedImage var0, int var1, int var2, boolean var3, boolean var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var0.getWidth();
      int var7 = var0.getHeight();
      int var8 = 4194304 / var6;
      String[] var5 = var10000;
      int[] var9 = new int[var8 * var6];
      method_8158(var3);
      method_8157(var4);
      int var10 = 0;

      while(var10 < var6 * var7) {
         int var11 = var10 / var6;
         int var12 = Math.min(var8, var7 - var11);
         int var13 = var6 * var12;
         var0.getRGB(0, var11, var6, var12, var9, 0, var6);
         method_8164(var9, var13);
         GL11.glTexSubImage2D(3553, 0, var1, var2 + var11, var6, var12, '\u80e1', '\u8367', field_7927);
         var10 += var6 * var8;
         if(var5 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (boolean) void
   private static void method_8157(boolean var0) {
      if(var0) {
         GL11.glTexParameteri(3553, 10242, 10496);
         GL11.glTexParameteri(3553, 10243, 10496);
      } else {
         GL11.glTexParameteri(3553, 10242, 10497);
         GL11.glTexParameteri(3553, 10243, 10497);
      }

   }

   // $FF: renamed from: b (boolean) void
   private static void method_8158(boolean var0) {
      method_8163(var0, false);
   }

   // $FF: renamed from: a (boolean, boolean, float) void
   public static void method_8159(boolean var0, boolean var1, float var2) {
      field_7930 = GL11.glGetTexParameteri(3553, 10241);
      field_7931 = GL11.glGetTexParameteri(3553, 10240);
      field_7932 = GL11.glGetTexParameterf(3553, '\u84fe');
      method_8163(var0, var1);
      method_8162(var2);
   }

   // $FF: renamed from: b () void
   public static void method_8160() {
      String[] var0 = class_752.method_4253();
      int var10000 = field_7930;
      if(var0 != null) {
         if(field_7930 < 0) {
            return;
         }

         var10000 = field_7931;
      }

      if(var0 != null) {
         if(var10000 < 0) {
            return;
         }

         float var1;
         var10000 = (var1 = field_7932 - 0.0F) == 0.0F?0:(var1 < 0.0F?-1:1);
      }

      if(var0 != null) {
         if(var10000 < 0) {
            return;
         }

         method_8161(field_7930, field_7931);
         method_8162(field_7932);
         field_7932 = -1.0F;
         field_7930 = -1;
         var10000 = -1;
      }

      field_7931 = var10000;
   }

   // $FF: renamed from: b (int, int) void
   private static void method_8161(int var0, int var1) {
      GL11.glTexParameteri(3553, 10241, var0);
      GL11.glTexParameteri(3553, 10240, var1);
   }

   // $FF: renamed from: a (float) void
   private static void method_8162(float var0) {
      GL11.glTexParameterf(3553, '\u84fe', var0);
   }

   // $FF: renamed from: a (boolean, boolean) void
   private static void method_8163(boolean var0, boolean var1) {
      if(var0) {
         GL11.glTexParameteri(3553, 10241, var1?9987:9729);
         GL11.glTexParameteri(3553, 10240, 9729);
      } else {
         GL11.glTexParameteri(3553, 10241, var1?9986:9728);
         GL11.glTexParameteri(3553, 10240, 9728);
      }

   }

   // $FF: renamed from: a (int[], int) void
   private static void method_8164(int[] var0, int var1) {
      method_8165(var0, 0, var1);
   }

   // $FF: renamed from: b (int[], int, int) void
   private static void method_8165(int[] var0, int var1, int var2) {
      int[] var3 = var0;
      if(bao.method_5273().canLoseFocus7.field_4489) {
         var3 = method_8168(var0);
      }

      field_7927.clear();
      field_7927.put(var3, var1, var2);
      field_7927.position(0).limit(var2);
   }

   // $FF: renamed from: b (int) void
   static void method_8166(int var0) {
      GL11.glBindTexture(3553, var0);
   }

   // $FF: renamed from: a (bqy, bqx) int[]
   public static int[] method_8167(bqy var0, bqx var1) {
      BufferedImage var2 = ImageIO.read(var0.method_224(var1).method_234());
      int var3 = var2.getWidth();
      int var4 = var2.getHeight();
      int[] var5 = new int[var3 * var4];
      var2.getRGB(0, 0, var3, var4, var5, 0, var3);
      return var5;
   }

   // $FF: renamed from: a (int[]) int[]
   public static int[] method_8168(int[] var0) {
      int[] var1 = new int[var0.length];

      for(int var2 = 0; var2 < var0.length; ++var2) {
         int var3 = var0[var2] >> 24 & 255;
         int var4 = var0[var2] >> 16 & 255;
         int var5 = var0[var2] >> 8 & 255;
         int var6 = var0[var2] & 255;
         int var7 = (var4 * 30 + var5 * 59 + var6 * 11) / 100;
         int var8 = (var4 * 30 + var5 * 70) / 100;
         int var9 = (var4 * 30 + var6 * 70) / 100;
         var1[var2] = var3 << 24 | var7 << 16 | var8 << 8 | var9;
      }

      return var1;
   }

   // $FF: renamed from: a (int[], int, int, int) int[]
   public static int[] method_8169(int[] var0, int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = var1 + 2 * var3;
      String[] var4 = var10000;
      int var6 = var2 - 1;

      int var7;
      byte var11;
      while(true) {
         if(var6 >= 0) {
            var7 = var6 * var1;
            int var8 = var3 + (var6 + var3) * var5;
            var11 = 0;
            if(var4 == null) {
               break;
            }

            int var9 = 0;

            while(true) {
               if(var9 < var3) {
                  int var10 = Math.min(var1, var3 - var9);
                  System.arraycopy(var0, var7 + var1 - var10, var0, var8 - var9 - var10, var10);
                  var9 += var1;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               System.arraycopy(var0, var7, var0, var8, var1);
               break;
            }

            var9 = 0;

            while(true) {
               if(var9 < var3) {
                  System.arraycopy(var0, var7, var0, var8 + var1 + var9, Math.min(var1, var3 - var9));
                  var9 += var1;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               --var6;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var11 = 0;
         break;
      }

      var6 = var11;

      while(true) {
         if(var6 < var3) {
            var7 = Math.min(var2, var3 - var6);
            System.arraycopy(var0, (var3 + var2 - var7) * var5, var0, (var3 - var6 - var7) * var5, var5 * var7);
            var6 += var2;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var6 = 0;
         break;
      }

      int[] var12;
      while(true) {
         if(var6 < var3) {
            var7 = Math.min(var2, var3 - var6);
            var12 = var0;
            if(var4 == null) {
               break;
            }

            System.arraycopy(var0, var3 * var5, var0, (var2 + var3 + var6) * var5, var5 * var7);
            var6 += var2;
            if(var4 != null) {
               continue;
            }
         }

         var12 = var0;
         break;
      }

      return var12;
   }

   // $FF: renamed from: a (int[], int, int) void
   public static void method_8170(int[] var0, int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int[] var4 = new int[var1];
      String[] var3 = var10000;
      int var5 = var2 / 2;
      int var6 = 0;

      while(var6 < var5) {
         System.arraycopy(var0, var6 * var1, var4, 0, var1);
         System.arraycopy(var0, (var2 - 1 - var6) * var1, var0, var6 * var1, var1);
         System.arraycopy(var4, 0, var0, (var2 - 1 - var6) * var1, var1);
         ++var6;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_8171() {
      boolean var10000 = true;
      char[] var10003 = "ÕaKr<òØ§\"u".toCharArray();
      Object var10004 = var10003.length;
      Object var10 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var11 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            __OBFID = (new String((char[])var10)).intern();
            String var7 = __OBFID;
            field_7926 = LogManager.getLogger();
            field_7927 = ban.method_5199(4194304);
            bpq var8 = new bpq;
            var8.method_7980(16, 16);
            field_7928 = var8;
            field_7929 = field_7928.method_7982();
            field_7930 = -1;
            field_7931 = -1;
            field_7932 = -1.0F;
            int var1 = -16777216;
            int var2 = -524040;
            int[] var3 = new int[]{-524040, -524040, -524040, -524040, -524040, -524040, -524040, -524040};
            int[] var4 = new int[]{-16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216, -16777216};
            int var5 = var3.length;

            for(int var6 = 0; var6 < 16; ++var6) {
               System.arraycopy(var6 < var5?var3:var4, 0, field_7929, 16 * var6, var5);
               System.arraycopy(var6 < var5?var4:var3, 0, field_7929, 16 * var6 + var5, var5);
            }

            field_7928.method_7981();
            field_7933 = new int[4];
            return;
         }

         char var10007 = (char)((Object[])var10)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 86;
            break;
         case 1:
            var10009 = 237;
            break;
         case 2:
            var10009 = 212;
            break;
         case 3:
            var10009 = 130;
            break;
         case 4:
            var10009 = 204;
            break;
         case 5:
            var10009 = 2;
            break;
         default:
            var10009 = 40;
         }

         ((Object[])var10)[var0] = (char)(var10007 ^ var11 ^ var10009);
         ++var0;
      }
   }
}
