import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class blo {

   // $FF: renamed from: y bmi
   protected bmi field_1883;
   // $FF: renamed from: a ahb
   public ahb field_1884;
   // $FF: renamed from: z int
   protected int field_1885;
   // $FF: renamed from: A bmh
   protected bmh field_1886;
   // $FF: renamed from: b int
   public static volatile int field_1887;
   // $FF: renamed from: c int
   public int field_1888;
   // $FF: renamed from: d int
   public int field_1889;
   // $FF: renamed from: e int
   public int field_1890;
   // $FF: renamed from: f int
   public int field_1891;
   // $FF: renamed from: g int
   public int field_1892;
   // $FF: renamed from: h int
   public int field_1893;
   // $FF: renamed from: i int
   public int field_1894;
   // $FF: renamed from: j int
   public int field_1895;
   // $FF: renamed from: k int
   public int field_1896;
   // $FF: renamed from: l boolean
   public boolean field_1897;
   // $FF: renamed from: m boolean[]
   public boolean[] field_1898;
   // $FF: renamed from: n int
   public int field_1899;
   // $FF: renamed from: o int
   public int field_1900;
   // $FF: renamed from: p int
   public int field_1901;
   // $FF: renamed from: q boolean
   public volatile boolean field_1902;
   // $FF: renamed from: r kg
   public class_1343 field_1903;
   // $FF: renamed from: s int
   public int field_1904;
   // $FF: renamed from: t boolean
   public boolean field_1905;
   // $FF: renamed from: u boolean
   public boolean field_1906;
   // $FF: renamed from: v int
   public int field_1907;
   // $FF: renamed from: w boolean
   public boolean field_1908;
   // $FF: renamed from: B boolean
   protected boolean field_1909;
   // $FF: renamed from: x java.util.List
   public List field_1910;
   // $FF: renamed from: C java.util.List
   protected List field_1911;
   // $FF: renamed from: D int
   protected int field_1912;
   public boolean isVisibleFromPosition;
   public double visibleFromX;
   public double visibleFromY;
   public double visibleFromZ;
   public boolean isInFrustrumFully;
   protected boolean needsBoxUpdate;
   public volatile boolean isUpdating;
   public float sortDistanceToEntitySquared;
   protected boolean skipAllRenderPasses;
   public boolean inSortedWorldRenderers;
   public boolean needVertexStateResort;
   public bma renderGlobal;
   public static int globalChunkOffsetX;
   public static int globalChunkOffsetZ;
   private static final String __OBFID = "CL_00000942";


   // $FF: renamed from: <init> (ahb, java.util.List, int, int, int, int) void
   public void method_2293(ahb var1, List var2, int var3, int var4, int var5, int var6) {
      super();
      this.field_1886 = bmh.instance;
      this.field_1898 = new boolean[]{true, true};
      this.field_1910 = new ArrayList();
      this.isVisibleFromPosition = false;
      this.isInFrustrumFully = false;
      this.needsBoxUpdate = false;
      this.isUpdating = false;
      this.skipAllRenderPasses = true;
      this.renderGlobal = bao.method_5273().cursorCounter7;
      this.field_1885 = -1;
      this.field_1897 = false;
      this.field_1905 = true;
      this.field_1909 = false;
      this.field_1884 = var1;
      this.field_1883 = null;
      this.field_1911 = var2;
      this.field_1885 = var6;
      this.field_1888 = -999;
      this.method_2294(var3, var4, var5);
      this.field_1902 = false;
   }

   // $FF: renamed from: a (int, int, int) void
   public void method_2294(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      if(var4 != null) {
         if(var1 == this.field_1888) {
            label19: {
               int var10000 = var2;
               int var10001 = this.field_1889;
               if(var4 != null) {
                  if(var2 != this.field_1889) {
                     break label19;
                  }

                  var10000 = var3;
                  var10001 = this.field_1890;
               }

               if(var10000 == var10001) {
                  return;
               }
            }
         }

         this.method_2301();
         this.field_1888 = var1;
         this.field_1889 = var2;
         this.field_1890 = var3;
         this.field_1899 = var1 + 8;
         this.field_1900 = var2 + 8;
         this.field_1901 = var3 + 8;
         this.field_1894 = var1 & 1023;
         this.field_1895 = var2;
         this.field_1896 = var3 & 1023;
         this.field_1891 = var1 - this.field_1894;
         this.field_1892 = var2 - this.field_1895;
         this.field_1893 = var3 - this.field_1896;
         this.field_1903 = class_1343.method_7093((double)var1, (double)var2, (double)var3, (double)(var1 + 16), (double)(var2 + 16), (double)(var3 + 16));
         this.needsBoxUpdate = true;
         this.method_2307();
      }

      this.isVisibleFromPosition = false;
   }

   // $FF: renamed from: f () void
   protected void method_2295() {
      GL11.glTranslatef((float)this.field_1894, (float)this.field_1895, (float)this.field_1896);
   }

   // $FF: renamed from: a (sv) void
   public void method_2296(class_752 var1) {
      String[] var2 = class_752.method_4253();
      blo var10000 = this;
      if(var2 != null) {
         if(this.field_1884 == null) {
            return;
         }

         var10000 = this;
      }

      int var32 = var10000.needsBoxUpdate;
      if(var2 != null) {
         if(var10000.needsBoxUpdate) {
            GL11.glNewList(this.field_1885 + 2, 4864);
            class_811.method_4738(class_1343.method_7093((double)this.field_1894, (double)this.field_1895, (double)this.field_1896, (double)(this.field_1894 + 16), (double)(this.field_1895 + 16), (double)(this.field_1896 + 16)));
            GL11.glEndList();
            this.needsBoxUpdate = false;
         }

         this.field_1905 = true;
         this.isVisibleFromPosition = false;
         var32 = this.field_1902;
      }

      if(var2 != null) {
         if(var32 == 0) {
            return;
         }

         this.field_1902 = false;
         var32 = this.field_1888;
      }

      int var3 = var32;
      int var4 = this.field_1889;
      int var5 = this.field_1890;
      int var6 = this.field_1888 + 16;
      int var7 = this.field_1889 + 16;
      int var8 = this.field_1890 + 16;
      int var9 = 0;

      while(true) {
         if(var9 < 2) {
            this.field_1898[var9] = true;
            ++var9;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         this.skipAllRenderPasses = true;
         break;
      }

      boolean var34 = Reflector.LightCache.exists();
      if(var2 != null) {
         if(var34) {
            Object var30 = Reflector.getFieldValue(Reflector.LightCache_cache);
            Reflector.callVoid(var30, Reflector.LightCache_clear, new Object[0]);
            Reflector.callVoid(Reflector.BlockCoord_resetPool, new Object[0]);
         }

         var34 = false;
      }

      HashSet var31;
      label281: {
         class_1069.field_5623 = var34;
         var31 = new HashSet();
         var31.addAll(this.field_1910);
         this.field_1910.clear();
         bao var10 = bao.method_5273();
         class_752 var11 = var10.cursorCounter9;
         int var12 = class_1715.method_9561(var11.field_2994);
         int var13 = class_1715.method_9561(var11.field_2995);
         int var14 = class_1715.method_9561(var11.field_2996);
         byte var15 = 1;
         class_1049 var35 = new class_1049;
         var35.method_5949(this.field_1884, var3 - var15, var4 - var15, var5 - var15, var6 + var15, var7 + var15, var8 + var15, var15);
         class_1049 var16 = var35;
         var32 = var16.method_37();
         if(var2 != null) {
            if(var32 != 0) {
               break label281;
            }

            var32 = field_1887 + 1;
         }

         field_1887 = var32;
         blm var37 = new blm;
         var37.method_7202(var16);
         blm var17 = var37;
         Reflector.callVoid(Reflector.ForgeHooksClient_setWorldRendererRB, new Object[]{var17});
         this.field_1912 = 0;
         this.field_1883 = null;
         this.field_1886 = bmh.instance;
         byte var18 = Reflector.ForgeHooksClient.exists();
         int var19 = 0;

         while(true) {
            if(var19 < 2) {
               boolean var20 = false;
               int var21 = 0;
               byte var22 = 0;
               if(var2 == null) {
                  break;
               }

               int var23 = var4;

               label245:
               while(true) {
                  var32 = var23;

                  label242:
                  while(var32 < var7) {
                     var32 = var5;
                     if(var2 == null) {
                        break label245;
                     }

                     int var24 = var5;

                     while(var24 < var8) {
                        var32 = var3;
                        if(var2 == null) {
                           continue label242;
                        }

                        int var25 = var3;

                        while(true) {
                           if(var25 < var6) {
                              aji var26 = var16.getBlock(var25, var23, var24);
                              if(var2 == null) {
                                 break;
                              }

                              if(var2 != null) {
                                 label230: {
                                    if(var26.method_2424() != awt.field_4170) {
                                       label298: {
                                          if(var2 != null) {
                                             if(var22 == 0) {
                                                var22 = 1;
                                                this.method_2297(var19);
                                             }

                                             var34 = false;
                                          }

                                          byte var27;
                                          label217: {
                                             byte var38 = var18;
                                             if(var2 != null) {
                                                if(var18 != 0) {
                                                   var27 = Reflector.callBoolean(var26, Reflector.ForgeBlock_hasTileEntity, new Object[]{Integer.valueOf(var16.method_33(var25, var23, var24))});
                                                   if(var2 != null) {
                                                      break label217;
                                                   }
                                                }

                                                var38 = var26.method_2442();
                                             }

                                             var27 = var38;
                                          }

                                          var32 = var19;
                                          if(var2 != null) {
                                             label295: {
                                                if(var19 == 0) {
                                                   var32 = var27;
                                                   if(var2 == null) {
                                                      break label295;
                                                   }

                                                   if(var27 != 0) {
                                                      class_580 var28 = var16.method_31(var25, var23, var24);
                                                      var32 = class_1380.field_7328.method_7529(var28);
                                                      if(var2 == null) {
                                                         break label295;
                                                      }

                                                      if(var32 != 0) {
                                                         this.field_1910.add(var28);
                                                      }
                                                   }
                                                }

                                                var32 = var26.method_2477();
                                             }
                                          }

                                          int var10001;
                                          label198: {
                                             int var39 = var32;
                                             var32 = var39;
                                             var10001 = var19;
                                             if(var2 != null) {
                                                if(var39 > var19) {
                                                   var20 = true;
                                                }

                                                var32 = var39;
                                                if(var2 == null) {
                                                   break label198;
                                                }

                                                var10001 = var19;
                                             }

                                             var32 = var32 == var10001?1:0;
                                          }

                                          int var29 = var32;
                                          var32 = Reflector.ForgeBlock_canRenderInPass.exists();
                                          if(var2 != null) {
                                             if(var32 != 0) {
                                                var29 = Reflector.callBoolean(var26, Reflector.ForgeBlock_canRenderInPass, new Object[]{Integer.valueOf(var19)});
                                             }

                                             var32 = var29;
                                          }

                                          if(var2 != null) {
                                             if(var32 == 0) {
                                                break label298;
                                             }

                                             var21 |= var17.method_7215(var26, var25, var23, var24);
                                             if(var2 == null) {
                                                break label230;
                                             }

                                             var32 = var26.method_2436();
                                          }

                                          if(var32 == 0) {
                                             label291: {
                                                var32 = var25;
                                                var10001 = var12;
                                                if(var2 != null) {
                                                   if(var25 != var12) {
                                                      break label291;
                                                   }

                                                   var32 = var23;
                                                   var10001 = var13;
                                                }

                                                label292: {
                                                   if(var2 != null) {
                                                      if(var32 != var10001) {
                                                         break label291;
                                                      }

                                                      var32 = var24;
                                                      if(var2 == null) {
                                                         break label292;
                                                      }

                                                      var10001 = var14;
                                                   }

                                                   if(var32 != var10001) {
                                                      break label291;
                                                   }

                                                   var17.method_7207(true);
                                                   var17.method_7208(true);
                                                   var17.method_7215(var26, var25, var23, var24);
                                                }

                                                var17.method_7207(false);
                                                var17.method_7208(false);
                                             }
                                          }
                                       }
                                    }

                                    ++var25;
                                 }
                              }

                              if(var2 != null) {
                                 continue;
                              }
                           }

                           ++var24;
                           break;
                        }

                        if(var2 == null) {
                           break;
                        }
                     }

                     ++var23;
                     if(var2 != null) {
                        continue label245;
                     }
                     break;
                  }

                  var32 = var21;
                  break;
               }

               if(var2 != null) {
                  if(var32 != 0) {
                     this.field_1898[var19] = false;
                  }

                  var32 = var22;
               }

               if(var2 != null) {
                  label155: {
                     if(var32 != 0) {
                        this.method_2298(var19, var1);
                        if(var2 != null) {
                           break label155;
                        }
                     }

                     var34 = false;
                  }
               }

               if(var20 || var2 == null) {
                  ++var19;
                  if(var2 != null) {
                     continue;
                  }
               }
            }

            Reflector.callVoid(Reflector.ForgeHooksClient_setWorldRendererRB, new Object[]{(blm)null});
            break;
         }
      }

      boolean var36;
      label142: {
         label294: {
            HashSet var33 = new HashSet();
            var33.addAll(this.field_1910);
            var33.removeAll(var31);
            this.field_1911.addAll(var33);
            var31.removeAll(this.field_1910);
            this.field_1911.removeAll(var31);
            this.field_1908 = class_1069.field_5623;
            this.field_1909 = true;
            var36 = this.field_1898[0];
            if(var2 != null) {
               if(!var36) {
                  break label294;
               }

               var36 = this.field_1898[1];
            }

            if(var2 == null) {
               break label142;
            }

            if(var36) {
               var36 = true;
               break label142;
            }
         }

         var36 = false;
      }

      this.skipAllRenderPasses = var36;
      this.updateFinished();
   }

   // $FF: renamed from: b (int) void
   protected void method_2297(int var1) {
      String[] var10000 = class_752.method_4253();
      GL11.glNewList(this.field_1885 + var1, 4864);
      this.field_1886.setRenderingChunk(true);
      String[] var2 = var10000;
      if(var2 != null) {
         if(Config.isFastRender()) {
            Reflector.callVoid(Reflector.ForgeHooksClient_onPreRenderWorld, new Object[]{this, Integer.valueOf(var1)});
            this.field_1886.setVisible2();
            this.field_1886.method_7467((double)(-globalChunkOffsetX), 0.0D, (double)(-globalChunkOffsetZ));
            if(var2 != null) {
               return;
            }
         }

         GL11.glPushMatrix();
         this.method_2295();
      }

      float var3 = 1.000001F;
      GL11.glTranslatef(-8.0F, -8.0F, -8.0F);
      GL11.glScalef(var3, var3, var3);
      GL11.glTranslatef(8.0F, 8.0F, 8.0F);
      Reflector.callVoid(Reflector.ForgeHooksClient_onPreRenderWorld, new Object[]{this, Integer.valueOf(var1)});
      this.field_1886.setVisible2();
      this.field_1886.method_7467((double)(-this.field_1888), (double)(-this.field_1889), (double)(-this.field_1890));
   }

   // $FF: renamed from: a (int, sv) void
   protected void method_2298(int var1, class_752 var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = Config.isTranslucentBlocksFancy();
      if(var3 != null) {
         label35: {
            if(var10000 != 0) {
               var10000 = var1;
               if(var3 == null) {
                  break label35;
               }

               if(var1 == 1) {
                  var10000 = this.field_1898[var1];
                  if(var3 == null) {
                     break label35;
                  }

                  if(var10000 == 0) {
                     this.field_1883 = this.field_1886.getVisible9((float)var2.field_2994, (float)var2.field_2995, (float)var2.field_2996);
                  }
               }
            }

            this.field_1912 += this.field_1886.getVisible8();
            Reflector.callVoid(Reflector.ForgeHooksClient_onPostRenderWorld, new Object[]{this, Integer.valueOf(var1)});
            this.field_1886.setRenderingChunk(false);
            if(var3 == null) {
               return;
            }

            var10000 = Config.isFastRender();
         }
      }

      if(var10000 == 0) {
         GL11.glPopMatrix();
      }

      GL11.glEndList();
      this.field_1886.method_7467(0.0D, 0.0D, 0.0D);
   }

   // $FF: renamed from: b (sv) void
   public void method_2299(class_752 var1) {
      String[] var2 = class_752.method_4253();
      blo var10000 = this;
      if(var2 != null) {
         if(this.field_1883 == null) {
            return;
         }

         var10000 = this;
      }

      if(var2 != null) {
         if(var10000.field_1898[1]) {
            return;
         }

         this.field_1886 = bmh.instance;
         this.method_2297(1);
         this.field_1886.setVisible0(this.field_1883);
         var10000 = this;
      }

      var10000.method_2298(1, var1);
   }

   // $FF: renamed from: a (sa) float
   public float method_2300(class_689 var1) {
      float var2 = (float)(var1.field_2994 - (double)this.field_1899);
      float var3 = (float)(var1.field_2995 - (double)this.field_1900);
      float var4 = (float)(var1.field_2996 - (double)this.field_1901);
      return var2 * var2 + var3 * var3 + var4 * var4;
   }

   // $FF: renamed from: a () void
   public void method_2301() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;

      while(true) {
         if(var2 < 2) {
            this.field_1898[var2] = true;
            ++var2;
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         this.skipAllRenderPasses = true;
         this.field_1897 = false;
         this.field_1909 = false;
         this.field_1883 = null;
         break;
      }

   }

   // $FF: renamed from: b () void
   public void method_2302() {
      this.method_2301();
      this.field_1884 = null;
   }

   // $FF: renamed from: a (int) int
   public int method_2303(int var1) {
      return this.field_1885 + var1;
   }

   // $FF: renamed from: a (bmv) void
   public void method_2304(bmv var1) {
      String[] var10000 = class_752.method_4253();
      this.field_1897 = var1.method_158(this.field_1903);
      String[] var2 = var10000;
      blo var3 = this;
      if(var2 != null) {
         if(this.field_1897 && Config.isOcclusionFancy()) {
            this.isInFrustrumFully = var1.isBoundingBoxInFrustumFully(this.field_1903);
            if(var2 != null) {
               return;
            }
         }

         var3 = this;
      }

      var3.isInFrustrumFully = false;
   }

   // $FF: renamed from: c () void
   public void method_2305() {
      GL11.glCallList(this.field_1885 + 2);
   }

   // $FF: renamed from: d () boolean
   public boolean method_2306() {
      return this.skipAllRenderPasses;
   }

   // $FF: renamed from: e () void
   public void method_2307() {
      this.field_1902 = true;
   }

   protected void updateFinished() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.skipAllRenderPasses;
      if(var1 != null) {
         if(this.skipAllRenderPasses) {
            return;
         }

         var10000 = this.inSortedWorldRenderers;
      }

      if(!var10000) {
         bao.method_5273().cursorCounter7.addToSortedWorldRenderers(this);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2308() {
      boolean var10000 = true;
      char[] var10003 = ":,¯~cÈIwG­".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            __OBFID = (new String((char[])var4)).intern();
            String var2 = __OBFID;
            globalChunkOffsetX = 0;
            globalChunkOffsetZ = 0;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 141;
            break;
         case 1:
            var10009 = 186;
            break;
         case 2:
            var10009 = 135;
            break;
         case 3:
            var10009 = 107;
            break;
         case 4:
            var10009 = 186;
            break;
         case 5:
            var10009 = 167;
            break;
         default:
            var10009 = 12;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
