import java.util.HashSet;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class WorldRendererSmooth extends blo {

   private WrUpdateState updateState;
   public int activeSet;
   public int[] activeListIndex;
   public int[][][] glWorkLists;
   public boolean[] tempSkipRenderPass;
   public bmi tempVertexState;


   // $FF: renamed from: <init> (ahb, java.util.List, int, int, int, int) void
   public void method_2293(ahb var1, List var2, int var3, int var4, int var5, int var6) {
      super.method_2293(var1, var2, var3, var4, var5, var6);
      WrUpdateState var10001 = new WrUpdateState;
      var10001.method_10047();
      this.updateState = var10001;
      this.activeSet = 0;
      this.activeListIndex = new int[]{0, 0};
      this.glWorkLists = new int[2][2][16];
      this.tempSkipRenderPass = new boolean[2];
   }

   private void checkGlWorkLists() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.glWorkLists[0][0][0];
      if(var1 != null) {
         if(var10000 > 0) {
            return;
         }

         var10000 = this.renderGlobal.displayListAllocator.allocateDisplayLists(64);
      }

      int var2 = var10000;
      int var3 = 0;

      do {
         var10000 = var3;

         label43:
         while(true) {
            if(var10000 >= 2) {
               return;
            }

            int var4 = var2 + var3 * 2 * 16;
            int var5 = 0;

            while(true) {
               if(var5 >= 2) {
                  break label43;
               }

               int var6 = var4 + var5 * 16;
               var10000 = 0;
               if(var1 == null) {
                  break;
               }

               int var7 = 0;

               while(true) {
                  if(var7 < 16) {
                     this.glWorkLists[var3][var5][var7] = var6 + var7;
                     ++var7;
                     if(var1 == null) {
                        break;
                     }

                     if(var1 != null) {
                        continue;
                     }
                  }

                  ++var5;
                  break;
               }

               if(var1 == null) {
                  break label43;
               }
            }
         }

         ++var3;
      } while(var1 != null);

   }

   // $FF: renamed from: a (int, int, int) void
   public void method_2294(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      WorldRendererSmooth var10000 = this;
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
      WorldRendererSmooth var10000 = this;
      if(var1 != null) {
         if(this.field_1884 == null) {
            return;
         }

         this.updateRenderer(0L);
         var10000 = this;
      }

      var10000.finishUpdate();
   }

   public boolean updateRenderer(long var1) {
      String[] var3 = class_752.method_4253();
      WorldRendererSmooth var10000 = this;
      if(var3 != null) {
         if(this.field_1884 == null) {
            return true;
         }

         this.field_1902 = false;
         var10000 = this;
      }

      int var30 = var10000.isUpdating;
      boolean var32;
      if(var3 != null) {
         if(!var10000.isUpdating) {
            var32 = this.needsBoxUpdate;
            if(var3 != null) {
               if(this.needsBoxUpdate) {
                  GL11.glNewList(this.field_1885 + 2, 4864);
                  class_811.method_4738(class_1343.method_7093((double)this.field_1894, (double)this.field_1895, (double)this.field_1896, (double)(this.field_1894 + 16), (double)(this.field_1895 + 16), (double)(this.field_1896 + 16)));
                  GL11.glEndList();
                  this.needsBoxUpdate = false;
               }

               var32 = Reflector.LightCache.exists();
            }

            if(var3 != null) {
               if(var32) {
                  Object var4 = Reflector.getFieldValue(Reflector.LightCache_cache);
                  Reflector.callVoid(var4, Reflector.LightCache_clear, new Object[0]);
                  Reflector.callVoid(Reflector.BlockCoord_resetPool, new Object[0]);
               }

               var32 = false;
            }

            class_1069.field_5623 = var32;
         }

         var30 = this.field_1888;
      }

      int var5;
      int var6;
      int var7;
      int var8;
      int var9;
      class_1049 var10;
      blm var11;
      HashSet var12;
      int var13;
      int var14;
      int var15;
      int var28;
      byte var36;
      label345: {
         var28 = var30;
         var5 = this.field_1889;
         var6 = this.field_1890;
         var7 = this.field_1888 + 16;
         var8 = this.field_1889 + 16;
         var9 = this.field_1890 + 16;
         var10 = null;
         var11 = null;
         var12 = null;
         var13 = 0;
         var14 = 0;
         var15 = 0;
         var36 = this.isUpdating;
         if(var3 != null) {
            if(this.isUpdating) {
               break label345;
            }

            var36 = 0;
         }

         int var16 = var36;

         while(true) {
            if(var16 < 2) {
               this.tempSkipRenderPass[var16] = true;
               ++var16;
               if(var3 == null) {
                  break;
               }

               if(var3 != null) {
                  continue;
               }
            }

            this.tempVertexState = null;
            break;
         }

         bao var29 = bao.method_5273();
         class_752 var17 = var29.cursorCounter9;
         var13 = class_1715.method_9561(var17.field_2994);
         var14 = class_1715.method_9561(var17.field_2995);
         var15 = class_1715.method_9561(var17.field_2996);
         byte var18 = 1;
         class_1049 var38 = new class_1049;
         var38.method_5949(this.field_1884, var28 - var18, var5 - var18, var6 - var18, var7 + var18, var8 + var18, var9 + var18, var18);
         var10 = var38;
         blm var39 = new blm;
         var39.method_7202(var10);
         var11 = var39;
         Reflector.callVoid(Reflector.ForgeHooksClient_setWorldRendererRB, new Object[]{var11});
         var12 = new HashSet();
         var12.addAll(this.field_1910);
         this.field_1910.clear();
      }

      label346: {
         var36 = this.isUpdating;
         if(var3 != null) {
            label321: {
               if(!this.isUpdating) {
                  var36 = var10.method_37();
                  if(var3 == null) {
                     break label321;
                  }

                  if(var36 != 0) {
                     break label346;
                  }
               }

               this.field_1912 = 0;
               this.field_1886 = bmh.instance;
               var36 = Reflector.ForgeHooksClient.exists();
            }
         }

         byte var31 = var36;
         this.checkGlWorkLists();
         int var33 = 0;

         while(true) {
            if(var33 < 2) {
               boolean var35 = false;
               int var19 = 0;
               byte var20 = 0;
               if(var3 == null) {
                  break;
               }

               int var21 = var5;

               label308:
               while(true) {
                  var30 = var21;

                  label305:
                  while(var30 < var8) {
                     var30 = this.isUpdating;
                     if(var3 == null) {
                        break label308;
                     }

                     label302: {
                        label350: {
                           if(var3 != null) {
                              if(this.isUpdating) {
                                 this.isUpdating = false;
                                 var10 = this.updateState.chunkcache;
                                 var11 = this.updateState.renderblocks;
                                 Reflector.callVoid(Reflector.ForgeHooksClient_setWorldRendererRB, new Object[]{var11});
                                 var12 = this.updateState.setOldEntityRenders;
                                 var13 = this.updateState.viewEntityPosX;
                                 var14 = this.updateState.viewEntityPosY;
                                 var15 = this.updateState.viewEntityPosZ;
                                 var33 = this.updateState.renderPass;
                                 var21 = this.updateState.field_9465;
                                 var35 = this.updateState.flag;
                                 var19 = this.updateState.hasRenderedBlocks;
                                 var20 = this.updateState.hasGlList;
                                 var30 = var20;
                                 if(var3 == null) {
                                    break label302;
                                 }

                                 if(var20 == 0) {
                                    break label350;
                                 }

                                 this.preRenderBlocksSmooth(var33);
                                 if(var3 != null) {
                                    break label350;
                                 }
                              }

                              var30 = var20;
                           }

                           if(var3 == null) {
                              break label302;
                           }

                           if(var30 != 0) {
                              long var41;
                              var30 = (var41 = var1 - 0L) == 0L?0:(var41 < 0L?-1:1);
                              if(var3 == null) {
                                 break label302;
                              }

                              if(var30 != 0) {
                                 long var42;
                                 var30 = (var42 = System.nanoTime() - var1 - 0L) == 0L?0:(var42 < 0L?-1:1);
                                 if(var3 == null) {
                                    break label302;
                                 }

                                 if(var30 > 0) {
                                    var30 = this.activeListIndex[var33];
                                    if(var3 == null) {
                                       break label302;
                                    }

                                    if(var30 < 15) {
                                       var30 = var19;
                                       if(var3 != null) {
                                          if(var19 != 0) {
                                             this.tempSkipRenderPass[var33] = false;
                                          }

                                          this.postRenderBlocksSmooth(var33, this.renderGlobal.renderViewEntity, false);
                                          ++this.activeListIndex[var33];
                                          this.updateState.chunkcache = var10;
                                          this.updateState.renderblocks = var11;
                                          this.updateState.setOldEntityRenders = var12;
                                          this.updateState.viewEntityPosX = var13;
                                          this.updateState.viewEntityPosY = var14;
                                          this.updateState.viewEntityPosZ = var15;
                                          this.updateState.renderPass = var33;
                                          this.updateState.field_9465 = var21;
                                          this.updateState.flag = var35;
                                          this.updateState.hasRenderedBlocks = (boolean)var19;
                                          this.updateState.hasGlList = (boolean)var20;
                                          this.isUpdating = true;
                                          var30 = 0;
                                       }

                                       return (boolean)var30;
                                    }
                                 }
                              }
                           }
                        }

                        var30 = var6;
                     }

                     int var22 = var30;

                     while(var22 < var9) {
                        var30 = var28;
                        if(var3 == null) {
                           continue label305;
                        }

                        int var23 = var28;

                        while(true) {
                           if(var23 < var7) {
                              aji var24 = var10.getBlock(var23, var21, var22);
                              if(var3 == null) {
                                 break;
                              }

                              if(var3 != null) {
                                 label268: {
                                    if(var24.method_2424() != awt.field_4170) {
                                       label365: {
                                          if(var3 != null) {
                                             if(var20 == 0) {
                                                var20 = 1;
                                                this.preRenderBlocksSmooth(var33);
                                             }

                                             var32 = false;
                                          }

                                          byte var25;
                                          label255: {
                                             var36 = var31;
                                             if(var3 != null) {
                                                if(var31 != 0) {
                                                   var25 = Reflector.callBoolean(var24, Reflector.ForgeBlock_hasTileEntity, new Object[]{Integer.valueOf(var10.method_33(var23, var21, var22))});
                                                   if(var3 != null) {
                                                      break label255;
                                                   }
                                                }

                                                var36 = var24.method_2442();
                                             }

                                             var25 = var36;
                                          }

                                          var30 = var33;
                                          if(var3 != null) {
                                             label362: {
                                                if(var33 == 0) {
                                                   var30 = var25;
                                                   if(var3 == null) {
                                                      break label362;
                                                   }

                                                   if(var25 != 0) {
                                                      class_580 var26 = var10.method_31(var23, var21, var22);
                                                      var30 = class_1380.field_7328.method_7529(var26);
                                                      if(var3 == null) {
                                                         break label362;
                                                      }

                                                      if(var30 != 0) {
                                                         this.field_1910.add(var26);
                                                      }
                                                   }
                                                }

                                                var30 = var24.method_2477();
                                             }
                                          }

                                          int var10001;
                                          label236: {
                                             int var40 = var30;
                                             var30 = var40;
                                             var10001 = var33;
                                             if(var3 != null) {
                                                if(var40 > var33) {
                                                   var35 = true;
                                                }

                                                var30 = var40;
                                                if(var3 == null) {
                                                   break label236;
                                                }

                                                var10001 = var33;
                                             }

                                             var30 = var30 == var10001?1:0;
                                          }

                                          int var27 = var30;
                                          var30 = Reflector.ForgeBlock_canRenderInPass.exists();
                                          if(var3 != null) {
                                             if(var30 != 0) {
                                                var27 = Reflector.callBoolean(var24, Reflector.ForgeBlock_canRenderInPass, new Object[]{Integer.valueOf(var33)});
                                             }

                                             var30 = var27;
                                          }

                                          if(var3 != null) {
                                             if(var30 == 0) {
                                                break label365;
                                             }

                                             var19 |= var11.method_7215(var24, var23, var21, var22);
                                             if(var3 == null) {
                                                break label268;
                                             }

                                             var30 = var24.method_2436();
                                          }

                                          if(var30 == 0) {
                                             label358: {
                                                var30 = var23;
                                                var10001 = var13;
                                                if(var3 != null) {
                                                   if(var23 != var13) {
                                                      break label358;
                                                   }

                                                   var30 = var21;
                                                   var10001 = var14;
                                                }

                                                label359: {
                                                   if(var3 != null) {
                                                      if(var30 != var10001) {
                                                         break label358;
                                                      }

                                                      var30 = var22;
                                                      if(var3 == null) {
                                                         break label359;
                                                      }

                                                      var10001 = var15;
                                                   }

                                                   if(var30 != var10001) {
                                                      break label358;
                                                   }

                                                   var11.method_7207(true);
                                                   var11.method_7208(true);
                                                   var11.method_7215(var24, var23, var21, var22);
                                                }

                                                var11.method_7207(false);
                                                var11.method_7208(false);
                                             }
                                          }
                                       }
                                    }

                                    ++var23;
                                 }
                              }

                              if(var3 != null) {
                                 continue;
                              }
                           }

                           ++var22;
                           break;
                        }

                        if(var3 == null) {
                           break;
                        }
                     }

                     ++var21;
                     if(var3 != null) {
                        continue label308;
                     }
                     break;
                  }

                  var30 = var19;
                  break;
               }

               if(var3 != null) {
                  if(var30 != 0) {
                     this.tempSkipRenderPass[var33] = false;
                  }

                  var30 = var20;
               }

               if(var3 != null) {
                  label194: {
                     if(var30 != 0) {
                        this.postRenderBlocksSmooth(var33, this.renderGlobal.renderViewEntity, true);
                        if(var3 != null) {
                           break label194;
                        }
                     }

                     var32 = false;
                  }
               }

               if(var35 || var3 == null) {
                  ++var33;
                  if(var3 != null) {
                     continue;
                  }
               }
            }

            Reflector.callVoid(Reflector.ForgeHooksClient_setWorldRendererRB, new Object[]{(blm)null});
            break;
         }
      }

      boolean var37;
      label181: {
         label361: {
            HashSet var34 = new HashSet();
            var34.addAll(this.field_1910);
            var34.removeAll(var12);
            this.field_1911.addAll(var34);
            var12.removeAll(this.field_1910);
            this.field_1911.removeAll(var12);
            this.field_1908 = class_1069.field_5623;
            this.field_1909 = true;
            ++field_1887;
            this.field_1905 = true;
            this.isVisibleFromPosition = false;
            this.field_1898[0] = this.tempSkipRenderPass[0];
            this.field_1898[1] = this.tempSkipRenderPass[1];
            var37 = this.field_1898[0];
            if(var3 != null) {
               if(!var37) {
                  break label361;
               }

               var37 = this.field_1898[1];
            }

            if(var3 == null) {
               break label181;
            }

            if(var37) {
               var37 = true;
               break label181;
            }
         }

         var37 = false;
      }

      this.skipAllRenderPasses = var37;
      this.field_1883 = this.tempVertexState;
      this.isUpdating = false;
      this.updateFinished();
      return true;
   }

   protected void preRenderBlocksSmooth(int var1) {
      String[] var10000 = class_752.method_4253();
      GL11.glNewList(this.glWorkLists[this.activeSet][var1][this.activeListIndex[var1]], 4864);
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

   protected void postRenderBlocksSmooth(int var1, class_752 var2, boolean var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = Config.isTranslucentBlocksFancy();
      if(var4 != null) {
         label45: {
            if(var10000 != 0) {
               var10000 = var1;
               if(var4 == null) {
                  break label45;
               }

               if(var1 == 1) {
                  var10000 = this.tempSkipRenderPass[var1];
                  if(var4 == null) {
                     break label45;
                  }

                  if(var10000 == 0) {
                     label28: {
                        bmi var5 = this.field_1886.getVisible9((float)var2.field_2994, (float)var2.field_2995, (float)var2.field_2996);
                        bmi var6 = this.tempVertexState;
                        if(var4 != null) {
                           if(this.tempVertexState == null) {
                              this.tempVertexState = var5;
                              if(var4 != null) {
                                 break label28;
                              }
                           }

                           var6 = this.tempVertexState;
                        }

                        var6.addTessellatorVertexState(var5);
                     }
                  }
               }
            }

            this.field_1912 += this.field_1886.getVisible8();
            Reflector.callVoid(Reflector.ForgeHooksClient_onPostRenderWorld, new Object[]{this, Integer.valueOf(var1)});
            this.field_1886.setRenderingChunk(false);
            if(var4 == null) {
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
      int var2 = 0;
      String[] var1 = var10000;

      int var3;
      int var4;
      label104: {
         WorldRendererSmooth var6;
         label108: {
            int var5;
            while(true) {
               if(var2 < 2) {
                  var5 = this.field_1898[var2];
                  if(var1 == null) {
                     break;
                  }

                  label92: {
                     label111: {
                        if(var1 != null) {
                           if(var5 != 0) {
                              break label111;
                           }

                           GL11.glNewList(this.field_1885 + var2, 4864);
                           var5 = 0;
                        }

                        var3 = var5;

                        while(var3 <= this.activeListIndex[var2]) {
                           var4 = this.glWorkLists[this.activeSet][var2][var3];
                           GL11.glCallList(var4);
                           ++var3;
                           if(var1 == null) {
                              break label92;
                           }

                           if(var1 == null) {
                              break;
                           }
                        }

                        GL11.glEndList();
                     }

                     ++var2;
                  }

                  if(var1 != null) {
                     continue;
                  }
               }

               var6 = this;
               if(var1 == null) {
                  break label108;
               }

               var5 = this.activeSet;
               break;
            }

            if(var5 == 0) {
               this.activeSet = 1;
               if(var1 != null) {
                  break label104;
               }
            }

            var6 = this;
         }

         var6.activeSet = 0;
      }

      var2 = 0;

      byte var7;
      while(true) {
         if(var2 < 2) {
            var7 = this.field_1898[var2];
            if(var1 == null) {
               break;
            }

            label64: {
               label114: {
                  if(var1 != null) {
                     if(var7 != 0) {
                        break label114;
                     }

                     var7 = 0;
                  }

                  var3 = var7;

                  while(var3 <= this.activeListIndex[var2]) {
                     var4 = this.glWorkLists[this.activeSet][var2][var3];
                     GL11.glNewList(var4, 4864);
                     GL11.glEndList();
                     ++var3;
                     if(var1 == null) {
                        break label64;
                     }

                     if(var1 == null) {
                        break;
                     }
                  }
               }

               ++var2;
            }

            if(var1 != null) {
               continue;
            }
         }

         var7 = 0;
         break;
      }

      var2 = var7;

      while(var2 < 2) {
         this.activeListIndex[var2] = 0;
         ++var2;
         if(var1 == null) {
            break;
         }
      }

   }
}
