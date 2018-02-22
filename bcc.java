import ca.diiza.f.class_237;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class bcc extends Gui {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_401;
   // $FF: renamed from: f bao
   private final bao field_402;
   // $FF: renamed from: g java.util.List
   private final List field_403;
   // $FF: renamed from: h java.util.List
   private final List field_404;
   // $FF: renamed from: i java.util.List
   private final List field_405;
   // $FF: renamed from: j int
   private int field_406;
   // $FF: renamed from: k boolean
   private boolean field_407;
   private static final String __OBFID;
   // $FF: renamed from: l java.lang.String[]
   private static final String[] field_408;


   // $FF: renamed from: <init> (bao) void
   public void method_672(bao var1) {
      super.method_651();
      this.field_403 = new ArrayList();
      this.field_404 = new ArrayList();
      this.field_405 = new ArrayList();
      this.field_402 = var1;
   }

   // $FF: renamed from: a (int) void
   public void method_673(int var1) {
      String[] var2 = class_752.method_4253();
      bcc var10000 = this;
      if(var2 != null) {
         if(this.field_402.canLoseFocus7.field_4497 == class_932.field_4756) {
            return;
         }

         var10000 = this;
      }

      int var3;
      byte var4;
      int var5;
      int var6;
      float var7;
      int var30;
      label196: {
         var3 = var10000.method_692();
         var4 = 0;
         var5 = 0;
         var6 = this.field_405.size();
         var7 = this.field_402.canLoseFocus7.field_4501 * 0.9F + 0.1F;
         var30 = var6;
         if(var2 != null) {
            if(var6 <= 0) {
               return;
            }

            var10000 = this;
            if(var2 == null) {
               break label196;
            }

            var30 = this.method_685();
         }

         if(var30 != 0) {
            var4 = 1;
         }

         var10000 = this;
      }

      float var8 = var10000.method_689();
      int var9 = class_1715.method_9566((float)this.method_687() / var8);
      GL11.glPushMatrix();
      GL11.glTranslatef(2.0F, 20.0F, 0.0F);
      GL11.glScalef(var8, var8, 1.0F);
      int var10 = 0;
      int var11 = 0;

      label198: {
         int var12;
         int var13;
         label176: {
            int var10001;
            label199: {
               while(true) {
                  if(var11 + this.field_406 < this.field_405.size()) {
                     var30 = var11;
                     if(var2 == null) {
                        break;
                     }

                     var10001 = var3;
                     if(var2 == null) {
                        break label199;
                     }

                     if(var11 < var3) {
                        Object var35 = this.field_405.get(var11 + this.field_406);

                        label159:
                        while(true) {
                           class_1356 var14 = (class_1356)var35;
                           if(var2 == null) {
                              break;
                           }

                           if(var14 != null) {
                              label203: {
                                 var12 = var1 - var14.getCursorPosition4();
                                 var30 = var12;
                                 if(var2 != null) {
                                    label153: {
                                       if(var12 >= 200) {
                                          var30 = var4;
                                          if(var2 == null) {
                                             break label153;
                                          }

                                          if(var4 == 0) {
                                             break label203;
                                          }
                                       }

                                       var30 = var12;
                                    }
                                 }

                                 double var15 = (double)var30 / 200.0D;
                                 var15 = 1.0D - var15;
                                 var15 *= 10.0D;
                                 double var38;
                                 var30 = (var38 = var15 - 0.0D) == 0.0D?0:(var38 < 0.0D?-1:1);
                                 if(var2 != null) {
                                    if(var30 < 0) {
                                       var15 = 0.0D;
                                    }

                                    double var39;
                                    var30 = (var39 = var15 - 1.0D) == 0.0D?0:(var39 < 0.0D?-1:1);
                                 }

                                 if(var2 != null) {
                                    if(var30 > 0) {
                                       var15 = 1.0D;
                                    }

                                    var15 *= var15;
                                    var30 = (int)(255.0D * var15);
                                 }

                                 var13 = var30;
                                 var30 = var4;
                                 if(var2 != null) {
                                    if(var4 != 0) {
                                       var13 = 255;
                                    }

                                    var13 = (int)((float)var13 * var7);
                                    ++var5;
                                    if(var2 == null) {
                                       break;
                                    }

                                    var30 = var13;
                                 }

                                 if(var30 > 3) {
                                    byte var17 = 0;
                                    int var18 = -var11 * 9;
                                    drawRect(var17, var18 - 9, var17 + var9 + 4, var18, var13 / 2 << 24);
                                    String var19 = var14.getCursorPosition3().method_343();
                                    bqf var36 = this.field_402.method_5288();
                                    bqx var32 = new bqx;
                                    String[] var28 = field_408;
                                    var32.method_8227("textures/gui/menoria/emotes.png");
                                    var36.bindTexture(var32);
                                    byte var20 = 0;
                                    class_237[] var21 = class_237.values();
                                    int var22 = var21.length;
                                    int var23 = 0;

                                    label140:
                                    do {
                                       var30 = var23;

                                       label137:
                                       while(true) {
                                          if(var30 >= var22) {
                                             break label140;
                                          }

                                          var35 = var21[var23];
                                          if(var2 == null) {
                                             continue label159;
                                          }

                                          Object var24 = var35;

                                          while(true) {
                                             int var25;
                                             if((var25 = var19.toLowerCase().indexOf(((class_237)var24).expr)) < 0) {
                                                break label137;
                                             }

                                             String var26 = var19.substring(0, var25);
                                             int var27 = this.field_402.enableBackgroundDrawing4.getCharWidth(var26);
                                             StringBuilder var37 = (new StringBuilder()).append(var26);
                                             String[] var34 = field_408;
                                             var19 = var37.append("  ").append(var19.substring(var25 + ((class_237)var24).expr.length())).toString();
                                             GL11.glPushMatrix();
                                             GL11.glEnable(3042);
                                             GL11.glTranslatef((float)(var17 + var27), (float)(var18 - 8), 0.0F);
                                             GL11.glColor4f(1.0F, 1.0F, 1.0F, (float)var13 / 255.0F);
                                             GL11.glScalef(0.5F, 0.5F, 1.0F);
                                             this.method_658(0, -(((class_237)var24).height - 16), ((class_237)var24).method_1289(), ((class_237)var24).method_1290(), ((class_237)var24).width, ((class_237)var24).height);
                                             GL11.glPopMatrix();
                                             var30 = var20;
                                             if(var2 == null) {
                                                break;
                                             }

                                             label209: {
                                                if(var2 != null) {
                                                   if(var20 != 0) {
                                                      break label209;
                                                   }

                                                   var30 = ((class_237)var24).height;
                                                }

                                                var10001 = 16;
                                                if(var2 != null) {
                                                   if(var30 <= 16) {
                                                      break label209;
                                                   }

                                                   var20 = 1;
                                                   var30 = var10;
                                                   var10001 = (((class_237)var24).height - 16) / 16 * 9;
                                                }

                                                var10 = var30 + var10001;
                                             }

                                             if(var2 == null) {
                                                break label137;
                                             }
                                          }
                                       }

                                       ++var23;
                                    } while(var2 != null);

                                    this.field_402.enableBackgroundDrawing4.drawStringWithShadow(var19, var17, var18 - 8, 16777215 + (var13 << 24));
                                    GL11.glDisable(3008);
                                 }
                              }
                           }

                           ++var11;
                           break;
                        }

                        if(var2 != null) {
                           continue;
                        }
                     }
                  }

                  var30 = var4;
                  break;
               }

               if(var2 == null) {
                  break label176;
               }

               if(var30 == 0) {
                  break label198;
               }

               var11 = this.field_402.enableBackgroundDrawing4.FONT_HEIGHT;
               GL11.glTranslatef(-3.0F, 0.0F, 0.0F);
               var30 = var6 * var11;
               var10001 = var6;
            }

            var30 += var10001;
         }

         int var29 = var30;
         var12 = var5 * var11 + var5;
         int var33 = this.field_406 * var12 / var6;
         int var16 = var12 * var12 / var29;
         var30 = var29;
         if(var2 != null) {
            if(var29 == var12) {
               break label198;
            }

            var30 = var33;
         }

         if(var2 != null) {
            var30 = var30 > 0?170:96;
         }

         var13 = var30;
         var30 = this.field_407;
         if(var2 != null) {
            var30 = this.field_407?13382451:3355562;
         }

         int var31 = var30;
         drawRect(0, -var33, 2, -var33 - var16, var31 + (var13 << 24));
         drawRect(2, -var33, 1, -var33 - var16, 13421772 + (var13 << 24));
      }

      GL11.glPopMatrix();
   }

   // $FF: renamed from: a () void
   public void method_674() {
      this.field_405.clear();
      this.field_404.clear();
      this.field_403.clear();
   }

   // $FF: renamed from: a (rV) void
   public void method_675(class_66 var1) {
      this.method_676(var1, 0);
   }

   // $FF: renamed from: a (rV, int) void
   public void method_676(class_66 var1, int var2) {
      this.method_678(var1, var2, this.field_402.canLoseFocus4.method_708(), false);
      Logger var10000 = field_401;
      StringBuilder var10001 = new StringBuilder();
      String[] var10002 = field_408;
      var10000.info(var10001.append("[CHAT] ").append(var1.method_342()).toString());
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   private String method_677(String var1) {
      return bao.method_5273().canLoseFocus7.field_4498?var1:class_130.method_602(var1);
   }

   // $FF: renamed from: a (rV, int, int, boolean) void
   private void method_678(class_66 var1, int var2, int var3, boolean var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = var2;
      if(var5 != null) {
         if(var2 != 0) {
            this.method_686(var2);
         }

         var10000 = class_1715.method_9559((float)this.method_687() / this.method_689());
      }

      int var6 = var10000;
      int var7 = 0;
      class_1082 var22 = new class_1082;
      var22.method_6134("");
      class_1082 var8 = var22;
      ArrayList var9 = Lists.newArrayList();
      ArrayList var10 = Lists.newArrayList(var1);
      int var12 = 0;

      class_66 var11;
      while(true) {
         if(var12 < var10.size()) {
            var11 = (class_66)var10.get(var12);
            String var13 = this.method_677(var11.method_338().method_8533() + var11.method_341());
            int var14 = this.field_402.enableBackgroundDrawing4.getCharWidth(var13);
            var22 = new class_1082;
            var22.method_6134(var13);
            class_1082 var15 = var22;
            var15.method_337(var11.method_338().method_8535());
            int var16 = 0;
            var10000 = var7 + var14;
            if(var5 == null) {
               break;
            }

            label149: {
               label159: {
                  int var10001 = var6;
                  if(var5 != null) {
                     if(var10000 > var6) {
                        String var17 = this.field_402.enableBackgroundDrawing4.trimStringToWidth(var13, var6 - var7, false);
                        String var23 = var17;
                        if(var5 != null) {
                           var23 = var17.length() < var13.length()?var13.substring(var17.length()):null;
                        }

                        label135: {
                           String var18 = var23;
                           if(var5 != null) {
                              if(var18 != null) {
                                 var10000 = var18.length();
                                 if(var5 == null) {
                                    break label135;
                                 }

                                 if(var10000 > 0) {
                                    label126: {
                                       int var19 = var17.lastIndexOf(" ");
                                       var10000 = var19;
                                       if(var5 != null) {
                                          if(var19 < 0) {
                                             break label126;
                                          }

                                          var10000 = this.field_402.enableBackgroundDrawing4.getCharWidth(var13.substring(0, var19));
                                       }

                                       if(var10000 > 0) {
                                          var17 = var13.substring(0, var19);
                                          var18 = var13.substring(var19);
                                       }
                                    }

                                    var22 = new class_1082;
                                    var22.method_6134(var18);
                                    class_1082 var20 = var22;
                                    var20.method_337(var11.method_338().method_8535());
                                    var10.add(var12 + 1, var20);
                                 }
                              }

                              var14 = this.field_402.enableBackgroundDrawing4.getCharWidth(var17);
                              var22 = new class_1082;
                              var22.method_6134(var17);
                              var15 = var22;
                              var15.method_337(var11.method_338().method_8535());
                           }

                           var10000 = 1;
                        }

                        var16 = var10000;
                     }

                     var10000 = var7 + var14;
                     if(var5 == null) {
                        break label159;
                     }

                     var10001 = var6;
                  }

                  if(var10000 <= var10001) {
                     var7 += var14;
                     var8.method_340(var15);
                     if(var5 != null) {
                        break label149;
                     }
                  }

                  var10000 = 1;
               }

               var16 = var10000;
            }

            label120: {
               var10000 = var16;
               if(var5 != null) {
                  if(var16 == 0) {
                     break label120;
                  }

                  var9.add(var8);
                  var10000 = 0;
               }

               var7 = var10000;
               var22 = new class_1082;
               var22.method_6134("");
               var8 = var22;
            }

            ++var12;
            if(var5 != null) {
               continue;
            }
         }

         var9.add(var8);
         var10000 = this.method_685();
         break;
      }

      var12 = var10000;
      Iterator var21 = var9.iterator();

      class_1356 var10002;
      List var25;
      label109:
      while(true) {
         if(var21.hasNext()) {
            label106: {
               var11 = (class_66)var21.next();
               if(var5 != null) {
                  var10000 = var12;
                  if(var5 == null) {
                     break label106;
                  }

                  bcc var24;
                  label85: {
                     if(var12 != 0) {
                        var24 = this;
                        if(var5 == null) {
                           break label85;
                        }

                        if(this.field_406 > 0) {
                           this.field_407 = true;
                           this.method_683(1);
                        }
                     }

                     var24 = this;
                  }

                  var25 = var24.field_405;
                  var10002 = new class_1356;
                  var10002.getCursorPosition2(var3, var11, var2);
                  var25.add(0, var10002);
                  if(var5 != null) {
                     continue;
                  }
               } else if(var5 != null) {
                  continue;
               }

               var10000 = this.field_405.size();
            }
         } else {
            var10000 = this.field_405.size();
         }

         while(true) {
            if(var10000 <= 100) {
               break label109;
            }

            this.field_405.remove(this.field_405.size() - 1);
            if(var5 == null) {
               return;
            }

            if(var5 == null) {
               break label109;
            }

            var10000 = this.field_405.size();
         }
      }

      if(!var4) {
         var25 = this.field_404;
         var10002 = new class_1356;
         var10002.getCursorPosition2(var3, var1, var2);
         var25.add(0, var10002);

         while(this.field_404.size() > 100) {
            this.field_404.remove(this.field_404.size() - 1);
            if(var5 == null) {
               break;
            }
         }
      }

   }

   // $FF: renamed from: b () void
   public void method_679() {
      this.field_405.clear();
      String[] var10000 = class_752.method_4253();
      this.method_682();
      String[] var1 = var10000;
      int var2 = this.field_404.size() - 1;

      while(var2 >= 0) {
         class_1356 var3 = (class_1356)this.field_404.get(var2);
         this.method_678(var3.getCursorPosition3(), var3.getCursorPosition5(), var3.getCursorPosition4(), true);
         --var2;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c () java.util.List
   public List method_680() {
      return this.field_403;
   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_681(String var1) {
      String[] var2 = class_752.method_4253();
      if(var2 != null && (this.field_403.isEmpty() || var2 != null && !((String)this.field_403.get(this.field_403.size() - 1)).equals(var1))) {
         this.field_403.add(var1);
      }

   }

   // $FF: renamed from: d () void
   public void method_682() {
      this.field_406 = 0;
      this.field_407 = false;
   }

   // $FF: renamed from: b (int) void
   public void method_683(int var1) {
      bcc var5;
      label25: {
         String[] var10000 = class_752.method_4253();
         this.field_406 += var1;
         String[] var2 = var10000;
         int var3 = this.field_405.size();
         int var4 = this.field_406;
         if(var2 != null) {
            if(this.field_406 > var3 - this.method_692()) {
               this.field_406 = var3 - this.method_692();
            }

            var5 = this;
            if(var2 == null) {
               break label25;
            }

            var4 = this.field_406;
         }

         if(var4 > 0) {
            return;
         }

         this.field_406 = 0;
         var5 = this;
      }

      var5.field_407 = false;
   }

   // $FF: renamed from: a (int, int) rV
   public class_66 method_684(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      if(!this.method_685()) {
         return null;
      } else {
         class_1338 var10000 = new class_1338;
         var10000.method_7060(this.field_402, this.field_402.cursorCounter2, this.field_402.cursorCounter3);
         class_1338 var4 = var10000;
         int var5 = var4.method_7065();
         float var6 = this.method_689();
         int var7 = var1 / var5 - 3;
         int var8 = var2 / var5 - 27;
         var7 = class_1715.method_9559((float)var7 / var6);
         var8 = class_1715.method_9559((float)var8 / var6);
         int var15 = var7;
         if(var3 != null) {
            if(var7 < 0) {
               return null;
            }

            var15 = var8;
         }

         if(var3 != null) {
            if(var15 < 0) {
               return null;
            }

            var15 = Math.min(this.method_692(), this.field_405.size());
         }

         int var9 = var15;
         var15 = var7;
         int var10001 = class_1715.method_9559((float)this.method_687() / this.method_689());
         if(var3 != null) {
            if(var7 > var10001) {
               return null;
            }

            var15 = var8;
            var10001 = this.field_402.enableBackgroundDrawing4.FONT_HEIGHT * var9 + var9;
         }

         if(var3 != null) {
            if(var15 >= var10001) {
               return null;
            }

            var15 = var8 / this.field_402.enableBackgroundDrawing4.FONT_HEIGHT;
            var10001 = this.field_406;
         }

         int var10 = var15 + var10001;
         var15 = var10;
         if(var3 != null) {
            if(var10 < 0) {
               return null;
            }

            var15 = var10;
         }

         if(var15 < this.field_405.size()) {
            class_1356 var11 = (class_1356)this.field_405.get(var10);
            int var12 = 0;
            Iterator var13 = var11.getCursorPosition3().iterator();

            while(var13.hasNext()) {
               label42: {
                  class_66 var14 = (class_66)var13.next();
                  var15 = var14 instanceof class_1082;
                  if(var3 != null) {
                     if(var15 == 0) {
                        break label42;
                     }

                     var12 += this.field_402.enableBackgroundDrawing4.getCharWidth(this.method_677(((class_1082)var14).method_6135()));
                     var15 = var12;
                  }

                  if(var15 > var7) {
                     return var14;
                  }
               }

               if(var3 == null) {
                  break;
               }
            }
         }

         return null;
      }
   }

   // $FF: renamed from: e () boolean
   public boolean method_685() {
      return this.field_402.enableBackgroundDrawing6 instanceof class_185;
   }

   // $FF: renamed from: c (int) void
   public void method_686(int var1) {
      String[] var10000 = class_752.method_4253();
      Iterator var3 = this.field_405.iterator();
      String[] var2 = var10000;

      while(true) {
         int var10001;
         class_1356 var4;
         int var5;
         if(var3.hasNext()) {
            var4 = (class_1356)var3.next();
            if(var2 != null) {
               var5 = var4.getCursorPosition5();
               var10001 = var1;
               if(var2 != null) {
                  if(var5 != var1) {
                     continue;
                  }

                  var3.remove();
                  if(var2 != null) {
                     continue;
                  }

                  var3 = this.field_404.iterator();
               } else {
                  while(var5 == var10001) {
                     var3.remove();
                     if(var2 != null) {
                        return;
                     }

                     var5 = var4.getCursorPosition5();
                     var10001 = var1;
                  }
               }
            } else {
               if(var2 != null) {
                  continue;
               }

               var3 = this.field_404.iterator();
            }
         } else {
            var3 = this.field_404.iterator();
         }

         while(var3.hasNext()) {
            var4 = (class_1356)var3.next();
            var5 = var4.getCursorPosition5();

            for(var10001 = var1; var5 == var10001; var10001 = var1) {
               var3.remove();
               if(var2 != null) {
                  return;
               }

               var5 = var4.getCursorPosition5();
            }
         }

         return;
      }
   }

   // $FF: renamed from: f () int
   public int method_687() {
      return method_690(this.field_402.canLoseFocus7.field_4514);
   }

   // $FF: renamed from: g () int
   public int method_688() {
      String[] var1 = class_752.method_4253();
      bcc var10000 = this;
      float var2;
      if(var1 != null) {
         if(this.method_685()) {
            var2 = this.field_402.canLoseFocus7.field_4516;
            return method_691(var2);
         }

         var10000 = this;
      }

      var2 = var10000.field_402.canLoseFocus7.field_4515;
      return method_691(var2);
   }

   // $FF: renamed from: h () float
   public float method_689() {
      return this.field_402.canLoseFocus7.field_4513;
   }

   // $FF: renamed from: a (float) int
   public static int method_690(float var0) {
      short var1 = 320;
      byte var2 = 40;
      return class_1715.method_9559(var0 * (float)(var1 - var2) + (float)var2);
   }

   // $FF: renamed from: b (float) int
   public static int method_691(float var0) {
      short var1 = 180;
      byte var2 = 20;
      return class_1715.method_9559(var0 * (float)(var1 - var2) + (float)var2);
   }

   // $FF: renamed from: i () int
   public int method_692() {
      return this.method_688() / 9;
   }

   // $FF: renamed from: <clinit> () void
   static void method_693() {
      // $FF: Couldn't be decompiled
   }
}
