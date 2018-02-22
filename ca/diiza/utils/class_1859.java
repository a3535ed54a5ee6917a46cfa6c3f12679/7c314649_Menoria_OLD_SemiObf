package ca.diiza.utils;

import ca.diiza.g.a.class_871;
import ca.diiza.utils.MP3Player;
import java.util.Iterator;
import net.minecraft.item.ItemSuperBow;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: ca.diiza.utils.d
public class class_1859 {

   // $FF: renamed from: a bqx
   private static final bqx field_9495;
   // $FF: renamed from: b bao
   private bao field_9496;
   // $FF: renamed from: c on
   private class_811 field_9497;
   // $FF: renamed from: d kX
   private Gui field_9498;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_9499;


   // $FF: renamed from: <init> (bao, on, kX) void
   public void method_10066(bao var1, class_811 var2, Gui var3) {
      super();
      this.field_9496 = var1;
      this.field_9497 = var2;
      this.field_9498 = var3;
      this.method_10067(this.field_9496.enableBackgroundDrawing4);
   }

   // $FF: renamed from: a (kU) void
   private void method_10067(FontRenderer var1) {
      int[] var10000 = MP3Player.method_3212();
      add var3 = this.field_9496.cursorCounter8.field_3616.method_3612(3);
      add var4 = this.field_9496.cursorCounter8.field_3616.method_3612(2);
      int[] var2 = var10000;
      add var5 = this.field_9496.cursorCounter8.field_3616.method_3612(1);
      add var6 = this.field_9496.cursorCounter8.field_3616.method_3612(0);
      add var7 = this.field_9496.cursorCounter8.field_3616.method_3593();
      int var8 = 0;
      if(!this.field_9496.canLoseFocus7.field_4562) {
         add var18 = var3;
         int var9;
         int var10;
         String var11;
         String var12;
         String[] var17;
         boolean var19;
         if(var2 == null) {
            if(var3 != null) {
               var9 = (int)((float)(var3.method_3747() - var3.method_3744()) / (float)var3.method_3747() * 100.0F);
               var10 = this.field_9496.cursorCounter8.field_3616.method_3612(3).method_3747() - this.field_9496.cursorCounter8.field_3616.method_3612(3).method_3744();
               var11 = "" + var10;
               var12 = var9 + "%";
               var17 = field_9499;
               var19 = class_871.method_5138("hud.pourcent").equals("Oui");
               if(var2 == null) {
                  label182: {
                     if(var19) {
                        var1.method_7020(var12, 20, 7, 16777215);
                        if(var2 == null) {
                           break label182;
                        }
                     }

                     var1.method_7020(var11, 20, 7, 16777215);
                  }
               }

               this.field_9497.method_4755(var1, this.field_9496.method_5288(), var3, 2, 2 + 18 * var8);
               GL11.glDisable(2896);
               ++var8;
            }

            var18 = var4;
         }

         if(var2 == null) {
            if(var18 != null) {
               var9 = (int)((float)(var4.method_3747() - var4.method_3744()) / (float)var4.method_3747() * 100.0F);
               var10 = this.field_9496.cursorCounter8.field_3616.method_3612(2).method_3747() - this.field_9496.cursorCounter8.field_3616.method_3612(2).method_3744();
               var11 = "" + var10;
               var12 = "" + var9 + "%";
               var17 = field_9499;
               var19 = class_871.method_5138("hud.pourcent").equals("Oui");
               if(var2 == null) {
                  label171: {
                     if(var19) {
                        var1.method_7020(var12, 20, 7 + 18 * var8, 16777215);
                        if(var2 == null) {
                           break label171;
                        }
                     }

                     var1.method_7020(var11, 20, 7 + 18 * var8, 16777215);
                  }
               }

               this.field_9497.method_4755(var1, this.field_9496.method_5288(), var4, 2, 2 + 18 * var8);
               GL11.glDisable(2896);
               ++var8;
            }

            var18 = var5;
         }

         if(var2 == null) {
            if(var18 != null) {
               var9 = (int)((float)(var5.method_3747() - var5.method_3744()) / (float)var5.method_3747() * 100.0F);
               var10 = this.field_9496.cursorCounter8.field_3616.method_3612(1).method_3747() - this.field_9496.cursorCounter8.field_3616.method_3612(1).method_3744();
               var11 = "" + var10;
               var12 = "" + var9 + "%";
               var17 = field_9499;
               var19 = class_871.method_5138("hud.pourcent").equals("Oui");
               if(var2 == null) {
                  label160: {
                     if(var19) {
                        var1.method_7020(var12, 20, 7 + 18 * var8, 16777215);
                        if(var2 == null) {
                           break label160;
                        }
                     }

                     var1.method_7020(var11, 20, 7 + 18 * var8, 16777215);
                  }
               }

               this.field_9497.method_4755(var1, this.field_9496.method_5288(), var5, 2, 2 + 18 * var8);
               GL11.glDisable(2896);
               ++var8;
            }

            var18 = var6;
         }

         if(var2 == null) {
            if(var18 != null) {
               var9 = (int)((float)(var6.method_3747() - var6.method_3744()) / (float)var6.method_3747() * 100.0F);
               var10 = this.field_9496.cursorCounter8.field_3616.method_3612(0).method_3747() - this.field_9496.cursorCounter8.field_3616.method_3612(0).method_3744();
               var11 = "" + var10;
               var12 = var9 + "%";
               var17 = field_9499;
               var19 = class_871.method_5138("hud.pourcent").equals("Oui");
               if(var2 == null) {
                  label149: {
                     if(var19) {
                        var1.method_7020(var12, 20, 7 + 18 * var8, 16777215);
                        if(var2 == null) {
                           break label149;
                        }
                     }

                     var1.method_7020(var11, 20, 7 + 18 * var8, 16777215);
                  }
               }

               this.field_9497.method_4755(var1, this.field_9496.method_5288(), var6, 2, 2 + 18 * var8);
               GL11.glDisable(2896);
               ++var8;
            }

            var18 = var7;
         }

         int var22;
         short var24;
         label144: {
            label199: {
               if(var2 == null) {
                  if(var18 == null) {
                     break label199;
                  }

                  var18 = var7;
               }

               var22 = var18.method_3730() instanceof class_511;
               if(var2 == null) {
                  label136: {
                     if(var22 == 0) {
                        var22 = var7.method_3730() instanceof class_573;
                        if(var2 != null) {
                           break label136;
                        }

                        if(var22 == 0) {
                           var22 = var7.method_3730() instanceof ItemSuperBow;
                           if(var2 != null) {
                              break label136;
                           }

                           if(var22 == 0) {
                              var22 = var7.method_3730() instanceof class_539;
                              if(var2 != null) {
                                 break label136;
                              }

                              if(var22 == 0) {
                                 var22 = var7.method_3730() instanceof class_527;
                                 if(var2 != null) {
                                    break label136;
                                 }

                                 if(var22 == 0) {
                                    var22 = var7.method_3730() instanceof class_517;
                                    if(var2 != null) {
                                       break label136;
                                    }

                                    if(var22 == 0) {
                                       var24 = var7.method_3730() instanceof class_528;
                                       if(var2 != null) {
                                          break label144;
                                       }

                                       if(var24 == 0) {
                                          break label199;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }

                     var22 = (int)((float)(var7.method_3747() - var7.method_3744()) / (float)var7.method_3747() * 100.0F);
                  }
               }

               var9 = var22;
               var10 = this.field_9496.cursorCounter8.field_3616.method_3593().method_3747() - this.field_9496.cursorCounter8.field_3616.method_3593().method_3744();
               var11 = "" + var10;
               var12 = var9 + "%";
               var17 = field_9499;
               var19 = class_871.method_5138("hud.pourcent").equals("Oui");
               if(var2 == null) {
                  label110: {
                     if(var19) {
                        var1.method_7020(var12, 20, 7 + 18 * var8, 16777215);
                        if(var2 == null) {
                           break label110;
                        }
                     }

                     var1.method_7020(var11, 20, 7 + 18 * var8, 16777215);
                  }
               }

               String var25 = var7.method_3730().getUnlocalizedName();
               String[] var10001 = field_9499;
               var24 = var25.equals("item.ambrer_bow");
               if(var2 == null) {
                  if(var24 != 0) {
                     StringBuilder var20 = new StringBuilder();
                     class_666 var10002 = this.field_9496.cursorCounter8.field_3616;
                     add var10003 = new add;
                     var10003.method_3724(ItemSuperBow.arrowType.method_5745());
                     var1.method_7020(var20.append(method_10068(var10002, var10003)).append("").toString(), 63, 7 + 18 * var8, 16777215);
                     class_811 var26 = this.field_9497;
                     bqf var21 = this.field_9496.method_5288();
                     var10003 = new add;
                     adb var10005 = ItemSuperBow.arrowType.method_5745();
                     int var23;
                     if(this.field_9496.cursorCounter8.field_3616.method_3606(ItemSuperBow.arrowType.method_5745())) {
                        class_666 var10006 = this.field_9496.cursorCounter8.field_3616;
                        add var10007 = new add;
                        var10007.method_3724(ItemSuperBow.arrowType.method_5745());
                        var23 = method_10068(var10006, var10007);
                     } else {
                        var23 = 0;
                     }

                     var10003.method_3725(var10005, var23);
                     var26.method_4755(var1, var21, var10003, 45, 2 + 18 * var8);
                  }

                  this.field_9497.method_4755(var1, this.field_9496.method_5288(), var7, 2, 2 + 18 * var8);
                  var24 = 2896;
               }

               GL11.glDisable(var24);
               ++var8;
            }

            var24 = this.field_9496.cursorCounter8.method_4175().isEmpty();
         }

         if(var2 == null) {
            if(var24 != 0) {
               return;
            }

            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            var24 = 2896;
         }

         GL11.glDisable(var24);
         Iterator var13 = this.field_9496.cursorCounter8.method_4175().iterator();

         while(var13.hasNext()) {
            class_1645 var14;
            label97: {
               var14 = (class_1645)var13.next();
               class_1635 var15 = class_1635.field_8489[var14.method_9016()];
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
               this.field_9496.method_5288().bindTexture(field_9495);
               var22 = var15.method_8973();
               if(var2 == null) {
                  if(var22 == 0) {
                     break label97;
                  }

                  var22 = var15.method_8974();
               }

               int var16 = var22;
               this.field_9498.method_658(1, 2 + 18 * var8, 0 + var16 % 8 * 18, 198 + var16 / 8 * 18, 18, 18);
            }

            var12 = class_1635.method_8976(var14);
            var1.method_7020(var12, 21, 8 + 18 * var8, 16777215);
            ++var8;
            if(var2 != null) {
               break;
            }
         }
      }

   }

   // $FF: renamed from: a (Af, add) int
   private static int method_10068(class_666 var0, add var1) {
      int var3 = 0;
      add[] var4 = var0.field_2844;
      int var5 = var4.length;
      int[] var10000 = MP3Player.method_3212();
      int var6 = 0;
      int[] var2 = var10000;

      while(var6 < var5) {
         add var7 = var4[var6];
         if(var2 == null) {
            if(var7 != null) {
               label22: {
                  int var8 = var7.method_3759().equals(var1.method_3759());
                  if(var2 == null) {
                     if(var8 == 0) {
                        break label22;
                     }

                     var8 = var3 + var7.field_2958;
                  }

                  var3 = var8;
               }
            }

            ++var6;
         }

         if(var2 != null) {
            break;
         }
      }

      return var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_10069() {
      // $FF: Couldn't be decompiled
   }
}
