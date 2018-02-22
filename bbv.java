import ca.diiza.f.class_232;
import ca.diiza.f.x;
import ca.diiza.k.class_601;
import ca.diiza.k.class_602;
import ca.diiza.k.class_603;
import ca.diiza.v.a.class_1008;
import ca.diiza.v.a.class_1009;
import ca.diiza.v.b.class_135;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import net.minecraft.item.ItemSuperBow;
import org.lwjgl.opengl.GL11;

public class bbv extends Gui {

   // $FF: renamed from: f bqx
   private static final bqx field_409;
   // $FF: renamed from: g bqx
   private static final bqx field_410;
   // $FF: renamed from: h bqx
   private static final bqx field_411;
   // $FF: renamed from: i on
   private static final class_811 field_412;
   // $FF: renamed from: j java.util.Random
   private final Random field_413;
   // $FF: renamed from: k bao
   private final bao field_414;
   private static String textForHUD;
   private String displayedCenterMessage;
   private int centerMessageTimer;
   private ArrayList<x> messages;
   public String currentClaim;
   public String announceMsg;
   public long lastAnnounceMsg;
   // $FF: renamed from: l bcc
   private final bcc field_415;
   // $FF: renamed from: m mt
   private final class_1407 field_416;
   // $FF: renamed from: n int
   private int field_417;
   // $FF: renamed from: o java.lang.String
   private String field_418;
   // $FF: renamed from: p int
   private int field_419;
   // $FF: renamed from: q boolean
   private boolean field_420;
   // $FF: renamed from: a float
   public float field_421;
   // $FF: renamed from: r int
   private int field_422;
   // $FF: renamed from: s add
   private add field_423;
   private static final String __OBFID;
   // $FF: renamed from: t java.lang.String[]
   private static final String[] field_424;


   // $FF: renamed from: <init> (bao) void
   public void method_694(bao var1) {
      super.method_651();
      this.field_413 = new Random();
      this.displayedCenterMessage = null;
      this.centerMessageTimer = 0;
      this.messages = new ArrayList();
      String[] var10001 = field_424;
      this.currentClaim = "???";
      this.announceMsg = null;
      this.lastAnnounceMsg = 0L;
      this.field_418 = "";
      this.field_421 = 1.0F;
      ItemSuperBow.arrowType = class_1009.NORMAL;
      this.field_414 = var1;
      bcc var2 = new bcc;
      var2.method_672(var1);
      this.field_415 = var2;
      class_1407 var3 = new class_1407;
      var3.method_7682(this.field_414);
      this.field_416 = var3;
      this.clearMessages();
   }

   // $FF: renamed from: a (float, boolean, int, int) void
   public void method_695(float param1, boolean param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (float, float) void
   public void method_696(float var1, float var2) {
      this.field_416.method_7683((int)(var1 - 10.0F), 10);
   }

   // $FF: renamed from: a (kh, int, int, kU) void
   private void method_697(class_1344 var1, int var2, int var3, FontRenderer var4) {
      class_1348 var6 = var1.GuiTextField6();
      String[] var10000 = class_752.method_4253();
      Collection var7 = var6.method_7164(var1);
      String[] var5 = var10000;
      int var26 = var7.size();
      if(var5 != null) {
         if(var26 > 15) {
            return;
         }

         var26 = var4.getCharWidth(var1.GuiTextField9());
      }

      int var8 = var26;
      Iterator var10 = var7.iterator();

      while(true) {
         if(var10.hasNext()) {
            class_1345 var11 = (class_1345)var10.next();
            class_1351 var12 = var6.method_7181(var11.writeText5());
            StringBuilder var27 = (new StringBuilder()).append(class_1351.setMaxStringLength8(var12, var11.writeText5()));
            String[] var10001 = field_424;
            String var9 = var27.append(": ").append(class_130.field_288).append(var11.writeText2()).toString();
            var8 = Math.max(var8, var4.getCharWidth(var9));
            if(var5 == null) {
               return;
            }

            if(var5 != null) {
               continue;
            }
         }

         int var23 = var7.size() * var4.FONT_HEIGHT;
         int var24 = var2 / 2 + var23 / 3;
         byte var25 = 3;
         int var13 = var3 - var8 - var25;
         int var14 = 0;
         Iterator var15 = var7.iterator();

         do {
            if(!var15.hasNext()) {
               return;
            }

            class_1345 var16 = (class_1345)var15.next();
            ++var14;
            class_1351 var17 = var6.method_7181(var16.writeText5());
            String var18 = class_1351.setMaxStringLength8(var17, var16.writeText5());
            String var19 = class_130.field_288 + "" + var16.writeText2();
            int var20 = var24 - var14 * var4.FONT_HEIGHT;
            int var21 = var3 - var25 + 2;
            drawRect(var13 - 2, var20, var21, var20 + var4.FONT_HEIGHT, 1342177280);
            var4.method_7020(var18, var13, var20, 553648127);
            var4.method_7020(var19, var21 - var4.getCharWidth(var19), var20, 553648127);
            if(var14 == var7.size()) {
               String var22 = var1.GuiTextField9();
               drawRect(var13 - 2, var20 - var4.FONT_HEIGHT - 1, var21, var20 - 1, 1610612736);
               drawRect(var13 - 2, var20 - 1, var21, var20, 1342177280);
               var4.method_7020(var22, var13 + var8 / 2 - var4.getCharWidth(var22) / 2, var20 - var4.FONT_HEIGHT, 553648127);
            }
         } while(var5 != null);

         return;
      }
   }

   // $FF: renamed from: a (int, int) void
   private void method_698(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.field_414.cursorCounter8.field_3033 / 3 % 2;
      if(var3 != null) {
         var10000 = var10000 == 1?1:0;
      }

      int var4 = var10000;
      var10000 = this.field_414.cursorCounter8.field_3033;
      if(var3 != null) {
         if(this.field_414.cursorCounter8.field_3033 < 10) {
            var4 = 0;
         }

         var10000 = class_1715.method_9566(this.field_414.cursorCounter8.method_406());
      }

      int var5 = var10000;
      int var6 = class_1715.method_9566(this.field_414.cursorCounter8.field_3314);
      this.field_413.setSeed((long)(this.field_417 * 312871));
      byte var7 = 0;
      class_670 var8 = this.field_414.cursorCounter8.method_4623();
      int var9 = var8.method_3637();
      int var10 = var8.method_3638();
      class_80 var11 = this.field_414.cursorCounter8.method_4211(class_1840.field_9390);
      int var12 = var1 / 2 - 91;
      int var13 = var1 / 2 + 91;
      int var14 = var2 - 39;
      float var15 = (float)var11.method_396();
      float var16 = this.field_414.cursorCounter8.method_4245();
      int var17 = class_1715.method_9566((var15 + var16) / 2.0F / 10.0F);
      int var18 = Math.max(10 - (var17 - 2), 3);
      int var19 = var14 - (var17 - 1) * var18 - 10;
      float var20 = var16;
      int var21 = this.field_414.cursorCounter8.method_4199();
      int var22 = -1;
      byte var41 = this.field_414.cursorCounter8.method_4177(class_1635.field_8500);
      String[] var38;
      if(var3 != null) {
         if(var41 != 0) {
            var22 = this.field_417 % class_1715.method_9566(var15 + 5.0F);
         }

         var38 = field_424;
         this.field_414.isEnabled6.method_8332("armor");
         var41 = 0;
      }

      int var23 = var41;

      int var10001;
      int var24;
      while(true) {
         if(var23 < 10) {
            var10000 = var21;
            if(var3 == null) {
               break;
            }

            label432: {
               if(var3 != null) {
                  if(var21 <= 0) {
                     break label432;
                  }

                  var10000 = var12 + var23 * 8;
               }

               var24 = var10000;
               var10000 = var23 * 2 + 1;
               var10001 = var21;
               if(var3 != null) {
                  if(var10000 < var21) {
                     this.method_658(var24, var19, 34, 9, 9, 9);
                  }

                  var10000 = var23 * 2 + 1;
                  var10001 = var21;
               }

               if(var3 != null) {
                  if(var10000 == var10001) {
                     this.method_658(var24, var19, 25, 9, 9, 9);
                  }

                  var10000 = var23 * 2 + 1;
                  var10001 = var21;
               }

               if(var10000 > var10001) {
                  this.method_658(var24, var19, 16, 9, 9, 9);
               }
            }

            ++var23;
            if(var3 != null) {
               continue;
            }
         }

         var10000 = 0;
         break;
      }

      var23 = var10000;

      while(true) {
         if(var23 < 10) {
            var10000 = var21;
            if(var3 == null) {
               break;
            }

            label434: {
               if(var3 != null) {
                  if(var21 <= 0) {
                     break label434;
                  }

                  var10000 = var12 + var23 * 8;
               }

               var24 = var10000;
               var10000 = var23 * 2 + 1 + 20;
               var10001 = var21;
               if(var3 != null) {
                  if(var10000 < var21) {
                     this.method_658(var24, var19 - 9, 34, 9, 9, 9);
                  }

                  var10000 = var23 * 2 + 1 + 20;
                  var10001 = var21;
               }

               if(var3 != null) {
                  if(var10000 == var10001) {
                     this.method_658(var24, var19 - 9, 25, 9, 9, 9);
                  }

                  var10000 = var23 * 2 + 1 + 20;
                  var10001 = var21;
               }

               if(var10000 > var10001) {
                  this.method_658(var24, var19 - 9, 16, 9, 9, 9);
               }
            }

            ++var23;
            if(var3 != null) {
               continue;
            }
         }

         var38 = field_424;
         this.field_414.isEnabled6.method_8335("health");
         var10000 = class_1715.method_9566((var15 + var16) / 2.0F) - 1;
         break;
      }

      var23 = var10000;

      int var25;
      int var26;
      int var27;
      int var29;
      Object var42;
      while(true) {
         if(var23 >= 0) {
            var24 = 16;
            var42 = this.field_414.cursorCounter8;
            if(var3 == null) {
               break;
            }

            label392: {
               label436: {
                  var41 = this.field_414.cursorCounter8.method_4177(class_1635.field_8509);
                  if(var3 != null) {
                     if(var41 != 0) {
                        var24 += 36;
                        if(var3 != null) {
                           break label436;
                        }
                     }

                     var41 = this.field_414.cursorCounter8.method_4177(class_1635.field_8510);
                  }

                  if(var3 == null) {
                     break label392;
                  }

                  if(var41 != 0) {
                     var24 += 72;
                  }
               }

               var41 = 0;
            }

            byte var28 = var41;
            var10000 = var4;
            if(var3 != null) {
               if(var4 != 0) {
                  var28 = 1;
               }

               var10000 = class_1715.method_9566((float)(var23 + 1) / 10.0F) - 1;
            }

            label437: {
               var25 = var10000;
               var26 = var12 + var23 % 10 * 8;
               var27 = var14 - var25 * var18;
               var10000 = var5;
               var10001 = 4;
               if(var3 != null) {
                  if(var5 <= 4) {
                     var27 += this.field_413.nextInt(2);
                  }

                  var10000 = var23;
                  if(var3 == null) {
                     break label437;
                  }

                  var10001 = var22;
               }

               if(var10000 == var10001) {
                  var27 -= 2;
               }

               var10000 = 0;
            }

            var29 = var10000;
            var10000 = this.field_414.cursorCounter6.method_2195().method_6867();
            if(var3 != null) {
               if(var10000 != 0) {
                  var29 = 5;
               }

               this.method_658(var26, var27, 16 + var28 * 9, 9 * var29, 9, 9);
               var10000 = var4;
            }

            if(var3 != null) {
               label371: {
                  if(var10000 != 0) {
                     var10000 = var23 * 2 + 1;
                     var10001 = var6;
                     if(var3 != null) {
                        if(var10000 < var6) {
                           this.method_658(var26, var27, var24 + 54, 9 * var29, 9, 9);
                        }

                        var10000 = var23 * 2 + 1;
                        if(var3 == null) {
                           break label371;
                        }

                        var10001 = var6;
                     }

                     if(var10000 == var10001) {
                        this.method_658(var26, var27, var24 + 63, 9 * var29, 9, 9);
                     }
                  }

                  float var45;
                  var10000 = (var45 = var20 - 0.0F) == 0.0F?0:(var45 < 0.0F?-1:1);
               }
            }

            label440: {
               if(var3 != null) {
                  if(var10000 > 0) {
                     label355: {
                        label354: {
                           float var46;
                           var10000 = (var46 = var20 - var16) == 0.0F?0:(var46 < 0.0F?-1:1);
                           if(var3 != null) {
                              if(var10000 != 0) {
                                 break label354;
                              }

                              float var47;
                              var10000 = (var47 = var16 % 2.0F - 1.0F) == 0.0F?0:(var47 < 0.0F?-1:1);
                           }

                           if(var10000 == 0) {
                              this.method_658(var26, var27, var24 + 153, 9 * var29, 9, 9);
                              if(var3 != null) {
                                 break label355;
                              }
                           }
                        }

                        this.method_658(var26, var27, var24 + 144, 9 * var29, 9, 9);
                     }

                     var20 -= 2.0F;
                     if(var3 != null) {
                        break label440;
                     }
                  }

                  var10000 = var23 * 2 + 1;
               }

               var10001 = var5;
               if(var3 != null) {
                  if(var10000 < var5) {
                     this.method_658(var26, var27, var24 + 36, 9 * var29, 9, 9);
                  }

                  var10000 = var23 * 2 + 1;
                  var10001 = var5;
               }

               if(var10000 == var10001) {
                  this.method_658(var26, var27, var24 + 45, 9 * var29, 9, 9);
               }
            }

            --var23;
            if(var3 != null) {
               continue;
            }
         }

         var42 = this.field_414.cursorCounter8.field_2988;
         break;
      }

      bao var44;
      label441: {
         label442: {
            label443: {
               Object var39 = var42;
               var42 = var39;
               if(var3 != null) {
                  if(var39 == null) {
                     var38 = field_424;
                     this.field_414.isEnabled6.method_8335("food");
                     var24 = 0;

                     do {
                        if(var24 >= 10) {
                           break label443;
                        }

                        var29 = var14;
                        var25 = 16;
                        byte var30 = 0;
                        var10000 = this.field_414.cursorCounter8.method_4177(class_1635.field_8507);
                        if(var3 == null) {
                           break label442;
                        }

                        if(var3 != null) {
                           if(var10000 != 0) {
                              var25 += 36;
                              var30 = 13;
                           }

                           float var48;
                           var10000 = (var48 = this.field_414.cursorCounter8.method_4623().method_3641() - 0.0F) == 0.0F?0:(var48 < 0.0F?-1:1);
                        }

                        if(var3 != null) {
                           label456: {
                              if(var10000 <= 0) {
                                 var10000 = this.field_417 % (var9 * 3 + 1);
                                 if(var3 == null) {
                                    break label456;
                                 }

                                 if(var10000 == 0) {
                                    var29 = var14 + (this.field_413.nextInt(3) - 1);
                                 }
                              }

                              var10000 = var7;
                           }
                        }

                        if(var3 != null) {
                           if(var10000 != 0) {
                              var30 = 1;
                           }

                           var10000 = var13 - var24 * 8 - 9;
                        }

                        label274: {
                           var27 = var10000;
                           this.method_658(var27, var29, 16 + var30 * 9, 27, 9, 9);
                           var10000 = var7;
                           if(var3 != null) {
                              if(var7 != 0) {
                                 var10000 = var24 * 2 + 1;
                                 var10001 = var10;
                                 if(var3 != null) {
                                    if(var10000 < var10) {
                                       this.method_658(var27, var29, var25 + 54, 27, 9, 9);
                                    }

                                    var10000 = var24 * 2 + 1;
                                    var10001 = var10;
                                 }

                                 if(var3 == null) {
                                    break label274;
                                 }

                                 if(var10000 == var10001) {
                                    this.method_658(var27, var29, var25 + 63, 27, 9, 9);
                                 }
                              }

                              var10000 = var24 * 2 + 1;
                           }

                           var10001 = var9;
                        }

                        if(var3 != null) {
                           if(var10000 < var10001) {
                              this.method_658(var27, var29, var25 + 36, 27, 9, 9);
                           }

                           var10000 = var24 * 2 + 1;
                           var10001 = var9;
                        }

                        if(var10000 == var10001) {
                           this.method_658(var27, var29, var25 + 45, 27, 9, 9);
                        }

                        ++var24;
                     } while(var3 != null);
                  }

                  var42 = var39;
               }

               var10000 = var42 instanceof class_752;
               if(var3 == null) {
                  break label442;
               }

               if(var10000 != 0) {
                  var38 = field_424;
                  this.field_414.isEnabled6.method_8335("mountHealth");
                  class_752 var40 = (class_752)var39;
                  var29 = (int)Math.ceil((double)var40.method_406());
                  float var31 = var40.method_405();
                  var26 = (int)(var31 + 0.5F) / 2;
                  var10000 = var26;
                  if(var3 != null) {
                     if(var26 > 30) {
                        var26 = 30;
                     }

                     var10000 = var14;
                  }

                  var27 = var10000;
                  int var32 = 0;

                  label324:
                  do {
                     var10000 = var26;

                     label321:
                     while(true) {
                        if(var10000 <= 0) {
                           break label324;
                        }

                        int var33 = Math.min(var26, 10);
                        var26 -= var33;
                        var10000 = 0;
                        if(var3 == null) {
                           break label442;
                        }

                        int var34 = 0;

                        while(true) {
                           if(var34 >= var33) {
                              break label321;
                           }

                           byte var35 = 52;
                           byte var36 = 0;
                           var10000 = var7;
                           if(var3 == null) {
                              break;
                           }

                           if(var3 != null) {
                              if(var7 != 0) {
                                 var36 = 1;
                              }

                              var10000 = var13 - var34 * 8 - 9;
                           }

                           int var37 = var10000;
                           this.method_658(var37, var27, var35 + var36 * 9, 9, 9, 9);
                           var10000 = var34 * 2 + 1 + var32;
                           var10001 = var29;
                           if(var3 != null) {
                              if(var10000 < var29) {
                                 this.method_658(var37, var27, var35 + 36, 9, 9, 9);
                              }

                              var10000 = var34 * 2 + 1 + var32;
                              var10001 = var29;
                           }

                           if(var10000 == var10001) {
                              this.method_658(var37, var27, var35 + 45, 9, 9, 9);
                           }

                           ++var34;
                           if(var3 == null) {
                              break label321;
                           }
                        }
                     }

                     var27 -= 10;
                     var32 += 20;
                  } while(var3 != null);
               }
            }

            String[] var43 = field_424;
            this.field_414.isEnabled6.method_8335("air");
            var44 = this.field_414;
            if(var3 == null) {
               break label441;
            }

            var10000 = this.field_414.cursorCounter8.method_3879(awt.field_4177);
         }

         if(var10000 != 0) {
            var24 = this.field_414.cursorCounter8.method_3949();
            var29 = class_1715.method_9567((double)(var24 - 2) * 10.0D / 300.0D);
            var25 = class_1715.method_9567((double)var24 * 10.0D / 300.0D) - var29;
            var26 = 0;

            while(var26 < var29 + var25) {
               if(var3 == null) {
                  return;
               }

               label257: {
                  if(var26 < var29) {
                     this.method_658(var13 - var26 * 8 - 9, var19, 16, 18, 9, 9);
                     if(var3 != null) {
                        break label257;
                     }
                  }

                  this.method_658(var13 - var26 * 8 - 9, var19, 25, 18, 9, 9);
               }

               ++var26;
               if(var3 == null) {
                  break;
               }
            }
         }

         var44 = this.field_414;
      }

      var44.isEnabled6.method_8333();
   }

   // $FF: renamed from: d () void
   private void method_699() {
      String[] var1 = class_752.method_4253();
      FontRenderer var2;
      class_1338 var3;
      int var4;
      short var5;
      int var6;
      double var7;
      int var9;
      byte var10;
      String var11;
      class_1338 var14;
      int var15;
      int var10000;
      double var17;
      byte var10002;
      bbv var19;
      byte var10003;
      byte var10004;
      int var10005;
      byte var10006;
      if(class_135.field_359 != null) {
         long var13;
         label197: {
            label207: {
               long var23;
               var10000 = (var23 = class_135.field_363 - 0L) == 0L?0:(var23 < 0L?-1:1);
               if(var1 != null) {
                  if(var10000 == 0) {
                     break label197;
                  }

                  var13 = class_135.field_363 + 7000L;
                  if(var1 == null) {
                     break label207;
                  }

                  long var24;
                  var10000 = (var24 = var13 - System.currentTimeMillis()) == 0L?0:(var24 < 0L?-1:1);
               }

               if(var10000 >= 0) {
                  break label197;
               }

               class_135.field_359 = null;
               var13 = 0L;
            }

            class_135.field_363 = var13;
            return;
         }

         class_1008 var16;
         class_1008 var10001;
         label164: {
            var2 = this.field_414.enableBackgroundDrawing4;
            var14 = new class_1338;
            var14.method_7060(this.field_414, this.field_414.cursorCounter2, this.field_414.cursorCounter3);
            var3 = var14;
            var4 = var3.method_7061();
            var5 = 182;
            var6 = var4 / 2 - var5 / 2;
            var16 = class_135.field_359;
            var10001 = class_1008.COUNTDOWN;
            if(var1 != null) {
               if(class_135.field_359 == class_1008.COUNTDOWN) {
                  var17 = class_135.field_362 / class_135.field_361;
                  break label164;
               }

               var16 = class_135.field_359;
               var10001 = class_1008.ENDED;
            }

            var17 = var16 == var10001?(double)(class_135.field_363 + 7000L) / (double)System.currentTimeMillis():1.0D;
         }

         label158: {
            var7 = var17;
            var9 = (int)(var7 * (double)((float)(var5 + 1)));
            var10 = 12;
            this.method_658(var6, var10, 0, 74, var5, 5);
            var19 = this;
            var15 = var6;
            var10002 = var10;
            var10003 = 0;
            var10004 = 74;
            var10005 = var5;
            var10006 = 5;
            if(var1 != null) {
               this.method_658(var6, var10, 0, 74, var5, 5);
               if(var9 <= 0) {
                  break label158;
               }

               var19 = this;
               var15 = var6;
               var10002 = var10;
               var10003 = 0;
               var10004 = 79;
               var10005 = var9;
               var10006 = 5;
            }

            var19.method_658(var15, var10002, var10003, var10004, var10005, var10006);
         }

         label153: {
            label209: {
               label210: {
                  var11 = class_135.field_360;
                  var16 = class_135.field_359;
                  var10001 = class_1008.COUNTDOWN;
                  if(var1 != null) {
                     if(class_135.field_359 == class_1008.COUNTDOWN) {
                        String[] var12 = field_424;
                        var11 = var11.replace("%TIME%", class_135.method_638((int)class_135.field_362));
                     }

                     var10000 = var2.drawStringWithShadow(var11, var4 / 2 - var2.getCharWidth(var11) / 2, var10 - 10, 16777215);
                     if(var1 == null) {
                        break label210;
                     }

                     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                     this.field_414.method_5288().bindTexture(field_371);
                     var16 = class_135.field_359;
                     var10001 = class_1008.ENDED;
                  }

                  if(var16 != var10001) {
                     break label153;
                  }

                  var13 = class_135.field_363;
                  if(var1 == null) {
                     break label209;
                  }

                  long var25;
                  var10000 = (var25 = class_135.field_363 - 0L) == 0L?0:(var25 < 0L?-1:1);
               }

               if(var10000 != 0) {
                  break label153;
               }

               var13 = System.currentTimeMillis();
            }

            class_135.field_363 = var13;
         }

         if(var1 != null) {
            return;
         }
      }

      label212: {
         class_602 var21 = class_602.method_3252();
         if(var1 != null) {
            if(var21 == null) {
               break label212;
            }

            var21 = class_602.method_3252();
         }

         label177: {
            label213: {
               label175: {
                  long var26;
                  var10000 = (var26 = var21.method_3272() - 0L) == 0L?0:(var26 < 0L?-1:1);
                  if(var1 != null) {
                     if(var10000 == 0) {
                        break label175;
                     }

                     var21 = class_602.method_3252();
                     if(var1 == null) {
                        break label213;
                     }

                     long var27;
                     var10000 = (var27 = var21.method_3272() + 7000L - System.currentTimeMillis()) == 0L?0:(var27 < 0L?-1:1);
                  }

                  if(var10000 < 0) {
                     var21 = class_602.method_3252();
                     break label213;
                  }
               }

               class_601 var18;
               class_601 var22;
               label136: {
                  label215: {
                     var2 = this.field_414.enableBackgroundDrawing4;
                     var14 = new class_1338;
                     var14.method_7060(this.field_414, this.field_414.cursorCounter2, this.field_414.cursorCounter3);
                     var3 = var14;
                     var4 = var3.method_7061();
                     var5 = 182;
                     var6 = var4 / 2 - var5 / 2;
                     var22 = class_602.method_3252().method_3266();
                     var18 = class_601.COUNTDOWN;
                     if(var1 != null) {
                        if(var22 == class_601.COUNTDOWN) {
                           var17 = (double)(class_602.method_3252().method_3256() / class_602.method_3252().method_3258());
                           break label136;
                        }

                        var21 = class_602.method_3252();
                        if(var1 == null) {
                           break label215;
                        }

                        var22 = var21.method_3266();
                        var18 = class_601.ENDED;
                     }

                     if(var22 != var18) {
                        var17 = 1.0D;
                        break label136;
                     }

                     var21 = class_602.method_3252();
                  }

                  var17 = (double)(var21.method_3272() + 7000L) / (double)System.currentTimeMillis();
               }

               label124: {
                  var7 = var17;
                  var9 = (int)(var7 * (double)((float)(var5 + 1)));
                  var10 = 12;
                  this.method_658(var6, var10, 0, 74, var5, 5);
                  var19 = this;
                  var15 = var6;
                  var10002 = var10;
                  var10003 = 0;
                  var10004 = 74;
                  var10005 = var5;
                  var10006 = 5;
                  if(var1 != null) {
                     this.method_658(var6, var10, 0, 74, var5, 5);
                     if(var9 <= 0) {
                        break label124;
                     }

                     var19 = this;
                     var15 = var6;
                     var10002 = var10;
                     var10003 = 0;
                     var10004 = 79;
                     var10005 = var9;
                     var10006 = 5;
                  }

                  var19.method_658(var15, var10002, var10003, var10004, var10005, var10006);
               }

               label217: {
                  var11 = class_602.method_3252().method_3254();
                  var22 = class_602.method_3252().method_3266();
                  var18 = class_601.COUNTDOWN;
                  if(var1 != null) {
                     if(var22 == class_601.COUNTDOWN) {
                        String[] var20 = field_424;
                        var11 = var11.replace("%TIME%", class_135.method_638(class_602.method_3252().method_3256()));
                     }

                     var2.drawStringWithShadow(var11, var4 / 2 - var2.getCharWidth(var11) / 2, var10 - 10, 16777215);
                     GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                     this.field_414.method_5288().bindTexture(field_371);
                     var21 = class_602.method_3252();
                     if(var1 == null) {
                        break label217;
                     }

                     var22 = var21.method_3266();
                     var18 = class_601.ENDED;
                  }

                  if(var22 != var18) {
                     break label177;
                  }

                  var21 = class_602.method_3252();
               }

               if(var1 != null) {
                  if(var21.method_3272() != 0L) {
                     break label177;
                  }

                  var21 = class_602.method_3252();
               }

               var21.method_3273(System.currentTimeMillis());
               break label177;
            }

            var21.method_3273(0L);
            class_602.method_3253((class_602)null);
            return;
         }

         if(var1 != null) {
            return;
         }
      }

      var19 = this;
      if(var1 != null) {
         if(this.announceMsg == null) {
            return;
         }

         var19 = this;
      }

      if(var1 != null) {
         label97: {
            if(var19.lastAnnounceMsg != 0L) {
               var19 = this;
               if(var1 == null) {
                  break label97;
               }

               if(this.lastAnnounceMsg < System.currentTimeMillis()) {
                  this.lastAnnounceMsg = 0L;
                  this.announceMsg = null;
                  return;
               }
            }

            var19 = this;
         }
      }

      var2 = var19.field_414.enableBackgroundDrawing4;
      var14 = new class_1338;
      var14.method_7060(this.field_414, this.field_414.cursorCounter2, this.field_414.cursorCounter3);
      var3 = var14;
      var4 = var3.method_7061();
      var5 = 182;
      var6 = var4 / 2 - var5 / 2;
      var7 = (double)((int)System.currentTimeMillis() / (int)this.lastAnnounceMsg);
      var9 = (int)(var7 * (double)((float)(var5 + 1)));
      var10 = 12;
      this.method_658(var6, var10, 0, 74, var5, 5);
      var19 = this;
      if(var1 != null) {
         this.method_658(var6, var10, 0, 74, var5, 5);
         if(var9 > 0) {
            this.method_658(var6, var10, 0, 79, var9, 5);
         }

         var19 = this;
      }

      var11 = var19.announceMsg;
      var2.drawStringWithShadow(var11, var4 / 2 - var2.getCharWidth(var11) / 2, var10 - 10, 16777215);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_414.method_5288().bindTexture(field_371);
   }

   // $FF: renamed from: b (int, int) void
   private void method_700(int var1, int var2) {
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      buu.method_9081(770, 771, 1, 0);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(3008);
      this.field_414.method_5288().bindTexture(field_411);
      bmh var3 = bmh.instance;
      var3.setVisible2();
      var3.addVertexWithUV(0.0D, (double)var2, -90.0D, 0.0D, 1.0D);
      var3.addVertexWithUV((double)var1, (double)var2, -90.0D, 1.0D, 1.0D);
      var3.addVertexWithUV((double)var1, 0.0D, -90.0D, 1.0D, 0.0D);
      var3.addVertexWithUV(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
      var3.getVisible8();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glEnable(3008);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: a (float, int, int) void
   private void method_701(float var1, int var2, int var3) {
      var1 = 1.0F - var1;
      String[] var4 = class_752.method_4253();
      float var6;
      int var10000 = (var6 = var1 - 0.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
      if(var4 != null) {
         if(var10000 < 0) {
            var1 = 0.0F;
         }

         float var7;
         var10000 = (var7 = var1 - 1.0F) == 0.0F?0:(var7 < 0.0F?-1:1);
      }

      if(var4 != null) {
         if(var10000 > 0) {
            var1 = 1.0F;
         }

         this.field_421 = (float)((double)this.field_421 + (double)(var1 - this.field_421) * 0.01D);
         GL11.glDisable(2929);
         GL11.glDepthMask(false);
         var10000 = 0;
      }

      buu.method_9081(var10000, 769, 1, 0);
      GL11.glColor4f(this.field_421, this.field_421, this.field_421, 1.0F);
      this.field_414.method_5288().bindTexture(field_409);
      bmh var5 = bmh.instance;
      var5.setVisible2();
      var5.addVertexWithUV(0.0D, (double)var3, -90.0D, 0.0D, 1.0D);
      var5.addVertexWithUV((double)var2, (double)var3, -90.0D, 1.0D, 1.0D);
      var5.addVertexWithUV((double)var2, 0.0D, -90.0D, 1.0D, 0.0D);
      var5.addVertexWithUV(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
      var5.getVisible8();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      buu.method_9081(770, 771, 1, 0);
   }

   // $FF: renamed from: b (float, int, int) void
   private void method_702(float var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      float var11;
      int var10000 = (var11 = var1 - 1.0F) == 0.0F?0:(var11 < 0.0F?-1:1);
      if(var4 != null) {
         if(var10000 < 0) {
            var1 *= var1;
            var1 *= var1;
            var1 = var1 * 0.8F + 0.2F;
         }

         GL11.glDisable(3008);
         GL11.glDisable(2929);
         GL11.glDepthMask(false);
         var10000 = 770;
      }

      buu.method_9081(var10000, 771, 1, 0);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, var1);
      class_73 var5 = class_1192.field_6116.getBlockTextureFromSide(1);
      this.field_414.method_5288().bindTexture(bpz.field_7757);
      float var6 = var5.method_368();
      float var7 = var5.method_371();
      float var8 = var5.method_369();
      float var9 = var5.method_372();
      bmh var10 = bmh.instance;
      var10.setVisible2();
      var10.addVertexWithUV(0.0D, (double)var3, -90.0D, (double)var6, (double)var9);
      var10.addVertexWithUV((double)var2, (double)var3, -90.0D, (double)var8, (double)var9);
      var10.addVertexWithUV((double)var2, 0.0D, -90.0D, (double)var8, (double)var7);
      var10.addVertexWithUV(0.0D, 0.0D, -90.0D, (double)var6, (double)var7);
      var10.getVisible8();
      GL11.glDepthMask(true);
      GL11.glEnable(2929);
      GL11.glEnable(3008);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: a (int, int, int, float) void
   private void method_703(int var1, int var2, int var3, float var4) {
      String[] var10000 = class_752.method_4253();
      add var6 = this.field_414.cursorCounter8.field_3616.field_2844[var1];
      String[] var5 = var10000;
      add var9 = var6;
      if(var5 != null) {
         if(var6 == null) {
            return;
         }

         var9 = var6;
      }

      class_811 var11;
      FontRenderer var10001;
      bqf var10002;
      add var10003;
      int var10004;
      int var10005;
      label34: {
         float var7 = (float)var9.field_2959 - var4;
         float var12;
         int var10 = (var12 = var7 - 0.0F) == 0.0F?0:(var12 < 0.0F?-1:1);
         if(var5 != null) {
            if(var10 > 0) {
               GL11.glPushMatrix();
               float var8 = 1.0F + var7 / 5.0F;
               GL11.glTranslatef((float)(var2 + 8), (float)(var3 + 12), 0.0F);
               GL11.glScalef(1.0F / var8, (var8 + 1.0F) / 2.0F, 1.0F);
               GL11.glTranslatef((float)(-(var2 + 8)), (float)(-(var3 + 12)), 0.0F);
            }

            var11 = field_412;
            var10001 = this.field_414.enableBackgroundDrawing4;
            var10002 = this.field_414.method_5288();
            var10003 = var6;
            var10004 = var2;
            var10005 = var3;
            if(var5 == null) {
               break label34;
            }

            var11.method_4756(var10001, var10002, var6, var2, var3);
            float var13;
            var10 = (var13 = var7 - 0.0F) == 0.0F?0:(var13 < 0.0F?-1:1);
         }

         if(var10 > 0) {
            GL11.glPopMatrix();
         }

         var11 = field_412;
         var10001 = this.field_414.enableBackgroundDrawing4;
         var10002 = this.field_414.method_5288();
         var10003 = var6;
         var10004 = var2;
         var10005 = var3;
      }

      var11.method_4758(var10001, var10002, var10003, var10004, var10005);
   }

   // $FF: renamed from: a () void
   public void method_704() {
      String[] var1;
      int var13;
      bbv var10000;
      label181: {
         var1 = class_752.method_4253();
         var10000 = this;
         if(var1 != null) {
            if(this.field_414.cursorCounter6 != null) {
               int var2 = class_1715.method_9561(this.field_414.cursorCounter8.field_2994);
               int var3 = class_1715.method_9561(this.field_414.cursorCounter8.field_2995);
               int var4 = class_1715.method_9561(this.field_414.cursorCounter8.field_2996);
               var13 = this.field_414.cursorCounter6.method_2048(var2, var3, var4);
               if(var1 == null) {
                  break label181;
               }

               if(var13 != 0) {
                  class_1069 var5 = this.field_414.cursorCounter6.method_2052(var2, var4);
                  var13 = this.field_414.method_5279();
                  if(var1 == null) {
                     break label181;
                  }

                  if(var13 == 0 && class_602.method_3252() != null) {
                     var13 = var5.method_6059(var2 & 15, var4 & 15, this.field_414.cursorCounter6.method_2041()).field_5031.equals(class_602.method_3252().method_3250());
                     if(var1 == null) {
                        break label181;
                     }

                     if(var13 != 0) {
                        label184: {
                           var13 = class_603.field_2616;
                           if(var1 != null) {
                              label168: {
                                 if(!class_603.field_2616) {
                                    var13 = class_603.method_3278(var2, var3, var4);
                                    if(var1 == null) {
                                       break label168;
                                    }

                                    if(var13 != 0) {
                                       class_603.field_2616 = true;
                                       String[] var6 = field_424;
                                       this.field_414.cursorCounter8.method_4676("event:koth:action:enter:pwd:muif13hurf120148f");
                                       if(var1 != null) {
                                          break label184;
                                       }
                                    }
                                 }

                                 var13 = class_603.field_2616;
                              }
                           }

                           if(var1 == null) {
                              break label181;
                           }

                           if(var13 == 1) {
                              var13 = class_603.method_3278(var2, var3, var4);
                              if(var1 == null) {
                                 break label181;
                              }

                              if(var13 == 0) {
                                 class_603.field_2616 = false;
                                 String[] var10001 = field_424;
                                 this.field_414.cursorCounter8.method_4676("event:koth:action:leave:pwd:muif13hurf120148f");
                              }
                           }
                        }
                     }
                  }
               }
            }

            var10000 = this;
         }

         var13 = var10000.centerMessageTimer;
      }

      label150: {
         label185: {
            if(var1 != null) {
               label186: {
                  if(var13 > 0) {
                     --this.centerMessageTimer;
                     var13 = this.centerMessageTimer;
                     if(var1 == null) {
                        break label186;
                     }

                     if(this.centerMessageTimer == 0) {
                        this.displayedCenterMessage = null;
                     }
                  }

                  var10000 = this;
                  if(var1 == null) {
                     break label185;
                  }

                  var13 = this.field_419;
               }
            }

            if(var13 <= 0) {
               break label150;
            }

            var10000 = this;
         }

         --var10000.field_419;
      }

      ArrayList var9 = new ArrayList();
      Iterator var10 = this.messages.iterator();

      while(true) {
         if(var10.hasNext()) {
            class_232 var11 = (class_232)var10.next();
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               label127: {
                  if(var11.field_1255 > 0) {
                     --var11.field_1255;
                     ++var11.field_1256;
                     if(var1 != null) {
                        break label127;
                     }
                  }

                  var9.add(var11);
               }
            }

            if(var1 != null) {
               continue;
            }
         }

         this.messages.removeAll(var9);
         break;
      }

      ++this.field_417;
      this.field_416.method_7687();
      bjk var7 = this.field_414.cursorCounter8;
      if(var1 != null) {
         if(this.field_414.cursorCounter8 == null) {
            return;
         }

         var7 = this.field_414.cursorCounter8;
      }

      add var12;
      label113: {
         label112: {
            label189: {
               var12 = var7.field_3616.method_3593();
               add var8 = var12;
               if(var1 != null) {
                  if(var12 == null) {
                     this.field_422 = 0;
                     if(var1 != null) {
                        break label112;
                     }
                  }

                  var10000 = this;
                  if(var1 == null) {
                     break label189;
                  }

                  var8 = this.field_423;
               }

               if(var8 != null) {
                  label191: {
                     var8 = var12;
                     if(var1 != null) {
                        if(var12.method_3730() != this.field_423.method_3730()) {
                           break label191;
                        }

                        var8 = var12;
                     }

                     var13 = add.method_3755(var8, this.field_423);
                     if(var1 != null) {
                        if(var13 == 0) {
                           break label191;
                        }

                        var13 = var12.method_3741();
                     }

                     if(var1 != null) {
                        label192: {
                           if(var13 == 0) {
                              var13 = var12.method_3745();
                              if(var1 == null) {
                                 break label192;
                              }

                              if(var13 != this.field_423.method_3745()) {
                                 break label191;
                              }
                           }

                           var10000 = this;
                           if(var1 == null) {
                              break label113;
                           }

                           var13 = this.field_422;
                        }
                     }

                     if(var13 <= 0) {
                        break label112;
                     }

                     --this.field_422;
                     if(var1 != null) {
                        break label112;
                     }
                  }
               }

               var10000 = this;
            }

            var10000.field_422 = 40;
         }

         var10000 = this;
      }

      var10000.field_423 = var12;
   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_705(String var1) {
      String[] var10001 = field_424;
      this.method_706(class_1450.method_7896("record.nowPlaying", new Object[]{var1}), true);
   }

   // $FF: renamed from: a (java.lang.String, boolean) void
   public void method_706(String var1, boolean var2) {
      this.field_418 = var1;
      this.field_419 = 60;
      this.field_420 = var2;
   }

   // $FF: renamed from: b () bcc
   public bcc method_707() {
      return this.field_415;
   }

   // $FF: renamed from: c () int
   public int method_708() {
      return this.field_417;
   }

   private void renderItem(add var1, int var2, int var3, float var4) {
      String[] var5 = class_752.method_4253();
      add var10000 = var1;
      if(var5 != null) {
         if(var1 == null) {
            return;
         }

         var10000 = var1;
      }

      float var6 = (float)var10000.field_2959 - var4;
      float var9;
      int var8 = (var9 = var6 - 0.0F) == 0.0F?0:(var9 < 0.0F?-1:1);
      if(var5 != null) {
         if(var8 > 0) {
            GL11.glPushMatrix();
            float var7 = 1.0F + var6 / 5.0F;
            GL11.glTranslatef((float)(var2 + 8), (float)(var3 + 12), 0.0F);
            GL11.glScalef(1.0F / var7, (var7 + 1.0F) / 2.0F, 1.0F);
            GL11.glTranslatef((float)(-(var2 + 8)), (float)(-(var3 + 12)), 0.0F);
         }

         field_412.method_4756(this.field_414.enableBackgroundDrawing4, this.field_414.method_5288(), var1, var2, var3);
         float var10;
         var8 = (var10 = var6 - 0.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
      }

      if(var8 > 0) {
         GL11.glPopMatrix();
      }

   }

   public void displayMessage(class_232 var1) {
      String[] var10000 = class_752.method_4253();
      Iterator var3 = this.messages.iterator();
      String[] var2 = var10000;

      while(true) {
         if(!var3.hasNext()) {
            this.messages.add(var1);
            break;
         }

         class_232 var4 = (class_232)var3.next();
         if(var4.field_1253.equalsIgnoreCase(var1.field_1253)) {
            var4.field_1256 = var1.field_1256;
            var4.field_1255 = var1.field_1255;
            var4.field_1251 = var1.field_1251;
            var4.field_1264 = var1.field_1264;
            var4.field_1263 = var1.field_1263;
            var4.field_1252 = var1.field_1252;
            var4.field_1265 = var1.field_1265;
            var4.field_1259 = var1.field_1259;
            var4.field_1257 = var1.field_1257;
            var4.field_1260 = var1.field_1260;
            var4.field_1258 = var1.field_1258;
            var4.field_1261 = var1.field_1261;
            var4.field_1262 = 0;
            var4.field_1254 = var1.field_1254;
            if(var2 != null) {
               return;
            }
            break;
         }
      }

   }

   public static void SetHUDText(String var0) {
      textForHUD = var0;
   }

   public void showCenterMessage(String var1) {
      this.displayedCenterMessage = var1;
      this.centerMessageTimer = 100;
   }

   public void clearMessages() {
      this.messages.clear();
   }

   // $FF: renamed from: <clinit> () void
   static void method_709() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_710(Exception var0) {
      return var0;
   }
}
