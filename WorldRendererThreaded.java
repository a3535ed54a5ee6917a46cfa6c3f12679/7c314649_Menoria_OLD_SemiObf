import java.util.HashSet;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class WorldRendererThreaded extends blo {

   private int glRenderListWork;
   private int glRenderListBoundingBox;
   public boolean[] tempSkipRenderPass;
   public bmi tempVertexState;
   private bmh tessellatorWork;


   // $FF: renamed from: <init> (ahb, java.util.List, int, int, int, int) void
   public void method_2293(ahb var1, List var2, int var3, int var4, int var5, int var6) {
      super.method_2293(var1, var2, var3, var4, var5, var6);
      this.tempSkipRenderPass = new boolean[2];
      this.tessellatorWork = null;
      bma var7 = bao.method_5273().cursorCounter7;
      this.glRenderListWork = var7.displayListAllocator.allocateDisplayLists(2);
      this.glRenderListBoundingBox = this.field_1885 + 2;
   }

   // $FF: renamed from: a (int, int, int) void
   public void method_2294(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      WorldRendererThreaded var10000 = this;
      if(var4 != null) {
         if(this.isUpdating) {
            WrUpdates.finishCurrentUpdate();
         }

         var10000 = this;
      }

      var10000.method_2294(var1, var2, var3);
   }

   public void updateRenderer() {
      String[] var1 = class_752.method_4253();
      WorldRendererThreaded var10000 = this;
      if(var1 != null) {
         if(this.field_1884 == null) {
            return;
         }

         this.updateRenderer((IWrUpdateListener)null);
         var10000 = this;
      }

      var10000.finishUpdate();
   }

   public void updateRenderer(IWrUpdateListener var1) {
      String[] var2 = class_752.method_4253();
      WorldRendererThreaded var10000 = this;
      if(var2 != null) {
         if(this.field_1884 == null) {
            return;
         }

         this.field_1902 = false;
         var10000 = this;
      }

      int var3 = var10000.field_1888;
      int var4 = this.field_1889;
      int var5 = this.field_1890;
      int var6 = this.field_1888 + 16;
      int var7 = this.field_1889 + 16;
      int var8 = this.field_1890 + 16;
      int var9 = 0;

      while(true) {
         if(var9 < this.tempSkipRenderPass.length) {
            this.tempSkipRenderPass[var9] = true;
            ++var9;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         class_1069.field_5623 = false;
         break;
      }

      HashSet var31;
      label264: {
         var31 = new HashSet();
         var31.addAll(this.field_1910);
         this.field_1910.clear();
         bao var10 = bao.method_5273();
         class_752 var11 = var10.cursorCounter9;
         int var12 = class_1715.method_9561(var11.field_2994);
         int var13 = class_1715.method_9561(var11.field_2995);
         int var14 = class_1715.method_9561(var11.field_2996);
         byte var15 = 1;
         class_1049 var32 = new class_1049;
         var32.method_5949(this.field_1884, var3 - var15, var4 - var15, var5 - var15, var6 + var15, var7 + var15, var8 + var15, var15);
         class_1049 var16 = var32;
         int var33 = var16.method_37();
         if(var2 != null) {
            if(var33 != 0) {
               break label264;
            }

            var33 = field_1887 + 1;
         }

         field_1887 = var33;
         blm var35 = new blm;
         var35.method_7202(var16);
         blm var17 = var35;
         Reflector.callVoid(Reflector.ForgeHooksClient_setWorldRendererRB, new Object[]{var17});
         this.field_1912 = 0;
         this.tempVertexState = null;
         this.field_1886 = bmh.instance;
         byte var18 = Reflector.ForgeHooksClient.exists();
         WrUpdateControl var36 = new WrUpdateControl;
         var36.method_3720();
         WrUpdateControl var19 = var36;
         int var20 = 0;

         while(true) {
            if(var20 < 2) {
               var19.setRenderPass(var20);
               boolean var21 = false;
               int var22 = 0;
               byte var23 = 0;
               if(var2 == null) {
                  break;
               }

               int var24 = var4;

               IWrUpdateListener var37;
               boolean var38;
               label235:
               while(true) {
                  var33 = var24;

                  label232:
                  while(var33 < var7) {
                     var33 = var22;
                     if(var2 == null) {
                        break label235;
                     }

                     if(var2 != null) {
                        if(var22 != 0) {
                           label226: {
                              var37 = var1;
                              if(var2 != null) {
                                 if(var1 == null) {
                                    break label226;
                                 }

                                 var37 = var1;
                              }

                              var37.updating(var19);
                              this.field_1886 = bmh.instance;
                           }
                        }

                        var33 = var5;
                     }

                     int var25 = var33;

                     while(var25 < var8) {
                        var33 = var3;
                        if(var2 == null) {
                           continue label232;
                        }

                        int var26 = var3;

                        while(true) {
                           if(var26 < var6) {
                              aji var27 = var16.getBlock(var26, var24, var25);
                              if(var2 == null) {
                                 break;
                              }

                              if(var2 != null) {
                                 label210: {
                                    if(var27.method_2424() != awt.field_4170) {
                                       label280: {
                                          if(var2 != null) {
                                             if(var23 == 0) {
                                                var23 = 1;
                                                this.preRenderBlocksThreaded(var20);
                                             }

                                             var38 = false;
                                          }

                                          byte var28;
                                          label197: {
                                             byte var39 = var18;
                                             if(var2 != null) {
                                                if(var18 != 0) {
                                                   var28 = Reflector.callBoolean(var27, Reflector.ForgeBlock_hasTileEntity, new Object[]{Integer.valueOf(var16.method_33(var26, var24, var25))});
                                                   if(var2 != null) {
                                                      break label197;
                                                   }
                                                }

                                                var39 = var27.method_2442();
                                             }

                                             var28 = var39;
                                          }

                                          var33 = var20;
                                          if(var2 != null) {
                                             label277: {
                                                if(var20 == 0) {
                                                   var33 = var28;
                                                   if(var2 == null) {
                                                      break label277;
                                                   }

                                                   if(var28 != 0) {
                                                      class_580 var29 = var16.method_31(var26, var24, var25);
                                                      var33 = class_1380.field_7328.method_7529(var29);
                                                      if(var2 == null) {
                                                         break label277;
                                                      }

                                                      if(var33 != 0) {
                                                         this.field_1910.add(var29);
                                                      }
                                                   }
                                                }

                                                var33 = var27.method_2477();
                                             }
                                          }

                                          int var10001;
                                          label178: {
                                             int var40 = var33;
                                             var33 = var40;
                                             var10001 = var20;
                                             if(var2 != null) {
                                                if(var40 > var20) {
                                                   var21 = true;
                                                }

                                                var33 = var40;
                                                if(var2 == null) {
                                                   break label178;
                                                }

                                                var10001 = var20;
                                             }

                                             var33 = var33 == var10001?1:0;
                                          }

                                          int var30 = var33;
                                          var33 = Reflector.ForgeBlock_canRenderInPass.exists();
                                          if(var2 != null) {
                                             if(var33 != 0) {
                                                var30 = Reflector.callBoolean(var27, Reflector.ForgeBlock_canRenderInPass, new Object[]{Integer.valueOf(var20)});
                                             }

                                             var33 = var30;
                                          }

                                          if(var2 != null) {
                                             if(var33 == 0) {
                                                break label280;
                                             }

                                             var22 |= var17.method_7215(var27, var26, var24, var25);
                                             if(var2 == null) {
                                                break label210;
                                             }

                                             var33 = var27.method_2436();
                                          }

                                          if(var33 == 0) {
                                             label274: {
                                                var33 = var26;
                                                var10001 = var12;
                                                if(var2 != null) {
                                                   if(var26 != var12) {
                                                      break label274;
                                                   }

                                                   var33 = var24;
                                                   var10001 = var13;
                                                }

                                                label275: {
                                                   if(var2 != null) {
                                                      if(var33 != var10001) {
                                                         break label274;
                                                      }

                                                      var33 = var25;
                                                      if(var2 == null) {
                                                         break label275;
                                                      }

                                                      var10001 = var14;
                                                   }

                                                   if(var33 != var10001) {
                                                      break label274;
                                                   }

                                                   var17.method_7207(true);
                                                   var17.method_7208(true);
                                                   var17.method_7215(var27, var26, var24, var25);
                                                }

                                                var17.method_7207(false);
                                                var17.method_7208(false);
                                             }
                                          }
                                       }
                                    }

                                    ++var26;
                                 }
                              }

                              if(var2 != null) {
                                 continue;
                              }
                           }

                           ++var25;
                           break;
                        }

                        if(var2 == null) {
                           break;
                        }
                     }

                     ++var24;
                     if(var2 != null) {
                        continue label235;
                     }
                     break;
                  }

                  var33 = var22;
                  break;
               }

               if(var2 != null) {
                  if(var33 != 0) {
                     this.tempSkipRenderPass[var20] = false;
                  }

                  var33 = var23;
               }

               if(var2 != null) {
                  label136: {
                     if(var33 != 0) {
                        label131: {
                           var37 = var1;
                           if(var2 != null) {
                              if(var1 == null) {
                                 break label131;
                              }

                              var37 = var1;
                           }

                           var37.updating(var19);
                        }

                        this.field_1886 = bmh.instance;
                        this.postRenderBlocksThreaded(var20, this.renderGlobal.renderViewEntity);
                        if(var2 != null) {
                           break label136;
                        }
                     }

                     var38 = false;
                  }
               }

               if(var21 || var2 == null) {
                  ++var20;
                  if(var2 != null) {
                     continue;
                  }
               }
            }

            Reflector.callVoid(Reflector.ForgeHooksClient_setWorldRendererRB, new Object[]{(blm)null});
            break;
         }
      }

      HashSet var34 = new HashSet();
      var34.addAll(this.field_1910);
      var34.removeAll(var31);
      this.field_1911.addAll(var34);
      var31.removeAll(this.field_1910);
      this.field_1911.removeAll(var31);
      this.field_1908 = class_1069.field_5623;
      this.field_1909 = true;
   }

   protected void preRenderBlocksThreaded(int var1) {
      String[] var10000 = class_752.method_4253();
      GL11.glNewList(this.glRenderListWork + var1, 4864);
      String[] var2 = var10000;
      this.field_1886.setRenderingChunk(true);
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

   protected void postRenderBlocksThreaded(int var1, class_752 var2) {
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
                  var10000 = this.tempSkipRenderPass[var1];
                  if(var3 == null) {
                     break label35;
                  }

                  if(var10000 == 0) {
                     this.tempVertexState = this.field_1886.getVisible9((float)var2.field_2994, (float)var2.field_2995, (float)var2.field_2996);
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

   public void finishUpdate() {
      String[] var10000 = class_752.method_4253();
      int var2 = this.field_1885;
      String[] var1 = var10000;
      this.field_1885 = this.glRenderListWork;
      this.glRenderListWork = var2;
      int var3 = 0;

      int var5;
      while(true) {
         if(var3 < 2) {
            var5 = this.field_1898[var3];
            if(var1 == null) {
               break;
            }

            label78: {
               if(var1 != null) {
                  if(var5 != 0) {
                     break label78;
                  }

                  var5 = this.glRenderListWork + var3;
               }

               GL11.glNewList(var5, 4864);
               GL11.glEndList();
            }

            ++var3;
            if(var1 != null) {
               continue;
            }
         }

         var5 = 0;
         break;
      }

      var3 = var5;

      while(true) {
         if(var3 < 2) {
            this.field_1898[var3] = this.tempSkipRenderPass[var3];
            ++var3;
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               continue;
            }
         }

         boolean var10001;
         label60: {
            label89: {
               var10001 = this.field_1898[0];
               if(var1 != null) {
                  if(!var10001) {
                     break label89;
                  }

                  var10001 = this.field_1898[1];
               }

               if(var1 == null) {
                  break label60;
               }

               if(var10001) {
                  var10001 = true;
                  break label60;
               }
            }

            var10001 = false;
         }

         this.skipAllRenderPasses = var10001;
         break;
      }

      boolean var6 = this.needsBoxUpdate;
      if(var1 != null) {
         label91: {
            if(this.needsBoxUpdate) {
               var6 = this.method_2306();
               if(var1 == null) {
                  break label91;
               }

               if(!var6) {
                  GL11.glNewList(this.glRenderListBoundingBox, 4864);
                  class_811.method_4738(class_1343.method_7093((double)this.field_1894, (double)this.field_1895, (double)this.field_1896, (double)(this.field_1894 + 16), (double)(this.field_1895 + 16), (double)(this.field_1896 + 16)));
                  GL11.glEndList();
                  this.needsBoxUpdate = false;
               }
            }

            this.field_1883 = this.tempVertexState;
            this.field_1905 = true;
            this.isVisibleFromPosition = false;
            if(var1 == null) {
               return;
            }

            var6 = Reflector.LightCache.exists();
         }
      }

      if(var6) {
         Object var4 = Reflector.getFieldValue(Reflector.LightCache_cache);
         Reflector.callVoid(var4, Reflector.LightCache_clear, new Object[0]);
         Reflector.callVoid(Reflector.BlockCoord_resetPool, new Object[0]);
      }

      this.updateFinished();
   }

   // $FF: renamed from: c () void
   public void method_2305() {
      GL11.glCallList(this.glRenderListBoundingBox);
   }
}
