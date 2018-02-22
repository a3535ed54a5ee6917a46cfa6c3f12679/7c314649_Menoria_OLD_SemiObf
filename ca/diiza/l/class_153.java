package ca.diiza.l;

import ca.diiza.l.class_205;
import ca.diiza.l.class_206;
import ca.diiza.l.class_860;
import ca.diiza.l.class_862;

// $FF: renamed from: ca.diiza.l.e
class class_153 extends bcb {

   // $FF: renamed from: b int[]
   private static final int[] field_491;
   // $FF: renamed from: o int[]
   private static final int[] field_492;
   // $FF: renamed from: p int
   private static final int field_493 = 9;
   // $FF: renamed from: q int
   private static final int field_494 = 30;
   // $FF: renamed from: r int
   private static final int field_495 = 2;
   // $FF: renamed from: s int
   protected static final int field_496 = 45;
   // $FF: renamed from: t ca.diiza.l.g
   private class_205 field_497;
   // $FF: renamed from: u ca.diiza.l.n
   private class_862 field_498;
   // $FF: renamed from: v int
   private int field_499;
   // $FF: renamed from: w java.lang.String
   private String field_500;
   // $FF: renamed from: x int
   private int field_501;
   // $FF: renamed from: y int
   private int field_502;
   // $FF: renamed from: z int
   private int field_503;
   // $FF: renamed from: A int
   private int field_504;
   // $FF: renamed from: B int
   private int field_505;
   // $FF: renamed from: C int
   private int field_506;
   // $FF: renamed from: D int
   private int field_507;
   // $FF: renamed from: E int
   private int field_508;
   // $FF: renamed from: F int
   private int field_509;
   // $FF: renamed from: G int
   private int field_510;
   // $FF: renamed from: H int
   private int field_511;
   // $FF: renamed from: I int
   private int field_512;
   // $FF: renamed from: J long
   private long field_513;
   // $FF: renamed from: K java.lang.String[]
   private static final String[] field_514;


   // $FF: renamed from: <init> (int, ca.diiza.l.g) void
   protected void method_785(int var1, class_205 var2) {
      super.method_748(var1, 0, 0, 0, 0, (String)null);
      this.field_513 = System.nanoTime();
      this.field_497 = var2;
   }

   // $FF: renamed from: a (int, ca.diiza.l.n) void
   protected void method_786(int var1, class_862 var2) {
      this.field_499 = var1;
      this.field_498 = var2;
      this.field_500 = null;
   }

   // $FF: renamed from: a (bao, int, int) void
   public void method_750(bao var1, int var2, int var3) {
      int var4 = class_862.method_5031();
      if(this.field_498 != null) {
         FontRenderer var5 = var1.enableBackgroundDrawing4;
         class_153 var10000 = this;
         String[] var17;
         if(var4 == 0) {
            if(this.field_500 == null) {
               StringBuilder var10001 = (new StringBuilder()).append(this.field_499);
               var17 = field_514;
               this.field_500 = var10001.append(") ").append(this.field_498.field_4144).toString();

               while(var5.getCharWidth(this.field_500) > 160) {
                  this.field_500 = this.field_500.substring(0, this.field_500.length() - 1);
                  if(var4 != 0) {
                     return;
                  }

                  if(var4 != 0) {
                     break;
                  }
               }
            }

            var10000 = this;
         }

         byte var6;
         int var18;
         label80: {
            label100: {
               var6 = var10000.method_788(var2, var3);
               this.method_657(var5, this.field_500, this.field_447 + 1, this.field_448 + 1, (var6 != 0?field_491:field_492)[this.field_498.field_4152]);
               var18 = var6;
               if(var4 == 0) {
                  if(var6 == 0) {
                     break label100;
                  }

                  var18 = var2;
               }

               if(var4 != 0) {
                  break label80;
               }

               if(var18 < this.field_507) {
                  var18 = 1;
                  break label80;
               }
            }

            var18 = 0;
         }

         int var7;
         int var11;
         String var21;
         label69: {
            var7 = var18;
            int var8 = (int)(this.field_498.field_4149 * 255.0F) & 255;
            int var9 = (int)(this.field_498.field_4150 * 255.0F) & 255;
            int var10 = (int)(this.field_498.field_4151 * 255.0F) & 255;
            var11 = -16777216 | var8 << 16 | var9 << 8 | var10;
            drawRect(this.field_507, this.field_505, this.field_508, this.field_506, var11);
            var6 = this.method_790(var2, var3);
            boolean var20 = this.field_497.method_1120();
            if(var4 == 0) {
               if(var20) {
                  if(this.field_497.method_1121(this.field_498)) {
                     var21 = "X";
                  } else {
                     var17 = field_514;
                     var21 = "GARDER";
                  }
                  break label69;
               }

               var20 = this.field_498.field_4148;
            }

            if(var20) {
               var17 = field_514;
               var21 = "ON";
            } else {
               var17 = field_514;
               var21 = "OFF";
            }
         }

         String var12 = var21;
         var18 = var6;
         if(var4 == 0) {
            if(var6 != 0) {
               var18 = -2130706433;
            } else {
               label61: {
                  var21 = var12;
                  String var19 = "X";
                  if(var4 == 0) {
                     if(var12 == "X") {
                        var18 = -1593901056;
                        break label61;
                     }

                     var21 = var12;
                     var17 = field_514;
                     var19 = "GARDER";
                  }

                  if(var21 == var19) {
                     var18 = -1610547456;
                  } else {
                     var18 = this.field_498.field_4148;
                     if(var4 == 0) {
                        var18 = this.field_498.field_4148?-1610547456:-1593901056;
                     }
                  }
               }
            }
         }

         var11 = var18;
         drawRect(this.field_511, this.field_509, this.field_512, this.field_510, var11);
         this.drawCenteredString(var1.enableBackgroundDrawing4, var12, this.field_511 + this.field_512 >> 1, this.field_509 + 1, -1);
         if(var7 != 0) {
            var17 = field_514;
            String var13 = String.format("%+d, %+d", new Object[]{Integer.valueOf(this.field_498.field_4145), Integer.valueOf(this.field_498.field_4147)});
            int var14 = var5.getCharWidth(var13);
            int var15 = var2 - var14 / 2 - 2;
            int var16 = var15 + var14 + 3;
            drawRect(var15, var3 - 17, var16, var3 + 4, -1610612736);
            this.drawCenteredString(var5, var13, var2, var3 - 15, -1);
            this.drawCenteredString(var5, String.format("%d", new Object[]{Integer.valueOf(this.field_498.field_4146)}), var2, var3 - 5, -1);
         }
      }

   }

   // $FF: renamed from: c (bao, int, int) boolean
   public boolean method_753(bao var1, int var2, int var3) {
      int var4 = class_862.method_5031();
      class_153 var10000 = this;
      if(var4 == 0) {
         if(this.field_498 == null) {
            return false;
         }

         var10000 = this;
      }

      boolean var7 = var10000.method_788(var2, var3);
      if(var4 == 0) {
         if(var7) {
            label100: {
               int var8 = this.method_789(var2, var3);
               if(var4 == 0) {
                  label56: {
                     if(var8 != 0) {
                        var8 = this.method_791(var1);
                        if(var4 != 0) {
                           break label56;
                        }

                        if(var8 != 0) {
                           var8 = this.field_498.field_4146;
                           if(var4 != 0) {
                              break label56;
                           }

                           if(this.field_498.field_4146 > 0) {
                              return true;
                           }
                        }
                     }

                     var8 = this.method_790(var2, var3);
                  }
               }

               label92: {
                  if(var4 == 0) {
                     if(var8 == 0) {
                        long var5 = System.nanoTime();
                        var10000 = this;
                        if(var4 == 0) {
                           if(!this.field_497.method_1120()) {
                              label63: {
                                 long var11;
                                 var8 = (var11 = var5 - (this.field_513 + 300000000L)) == 0L?0:(var11 < 0L?-1:1);
                                 if(var4 == 0) {
                                    if(var8 >= 0) {
                                       break label63;
                                    }

                                    class_206 var9 = new class_206;
                                    var9.method_1131(this.field_497, this.field_498);
                                    var1.method_5236(var9);
                                    var8 = 1;
                                 }

                                 return (boolean)var8;
                              }
                           }

                           var10000 = this;
                        }

                        var10000.field_513 = var5;
                        break label100;
                     }

                     var10000 = this;
                     if(var4 != 0) {
                        break label92;
                     }

                     var8 = this.field_497.method_1120();
                  }

                  if(var8 != 0) {
                     this.field_497.method_1123(this.field_498);
                     if(var4 == 0) {
                        return true;
                     }
                  }

                  var10000 = this;
               }

               class_862 var10 = var10000.field_498;
               boolean var10001 = this.field_498.field_4148;
               if(var4 == 0) {
                  var10001 = !this.field_498.field_4148;
               }

               var10.field_4148 = var10001;
               this.field_497.method_1124(this.field_498);
               return true;
            }
         }

         var7 = false;
      }

      return var7;
   }

   // $FF: renamed from: a (int, int, int, int) void
   protected void method_787(int var1, int var2, int var3, int var4) {
      this.field_447 = var1;
      this.field_448 = var2;
      this.field_445 = var3;
      this.field_446 = var4;
      this.field_501 = var2;
      this.field_502 = var2 + var4;
      this.field_503 = var1;
      this.field_504 = var1 + var3;
      this.field_505 = this.field_501;
      this.field_506 = this.field_502;
      this.field_508 = this.field_504 - 2 - 30 - 2;
      this.field_507 = this.field_508 - 9;
      this.field_509 = this.field_501;
      this.field_510 = this.field_502;
      this.field_512 = this.field_504 - 2;
      this.field_511 = this.field_512 - 30;
   }

   // $FF: renamed from: c (int, int) boolean
   private boolean method_788(int var1, int var2) {
      int var10000;
      label40: {
         int var3 = class_862.method_5030();
         var10000 = var2;
         int var10001 = this.field_501;
         if(var3 != 0) {
            if(var2 < this.field_501) {
               break label40;
            }

            var10000 = var2;
            var10001 = this.field_502;
         }

         if(var3 != 0) {
            if(var10000 >= var10001) {
               break label40;
            }

            var10000 = var1;
            var10001 = this.field_503;
         }

         if(var3 != 0) {
            if(var10000 < var10001) {
               break label40;
            }

            var10000 = var1;
            if(var3 == 0) {
               return (boolean)var10000;
            }

            var10001 = this.field_504;
         }

         if(var10000 < var10001) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: d (int, int) boolean
   private boolean method_789(int var1, int var2) {
      int var10000;
      label40: {
         int var3 = class_862.method_5030();
         var10000 = var2;
         int var10001 = this.field_505;
         if(var3 != 0) {
            if(var2 < this.field_505) {
               break label40;
            }

            var10000 = var2;
            var10001 = this.field_506;
         }

         if(var3 != 0) {
            if(var10000 >= var10001) {
               break label40;
            }

            var10000 = var1;
            var10001 = this.field_507;
         }

         if(var3 != 0) {
            if(var10000 < var10001) {
               break label40;
            }

            var10000 = var1;
            if(var3 == 0) {
               return (boolean)var10000;
            }

            var10001 = this.field_508;
         }

         if(var10000 < var10001) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: e (int, int) boolean
   private boolean method_790(int var1, int var2) {
      int var10000;
      label40: {
         int var3 = class_862.method_5031();
         var10000 = var2;
         int var10001 = this.field_509;
         if(var3 == 0) {
            if(var2 < this.field_509) {
               break label40;
            }

            var10000 = var2;
            var10001 = this.field_510;
         }

         if(var3 == 0) {
            if(var10000 >= var10001) {
               break label40;
            }

            var10000 = var1;
            var10001 = this.field_511;
         }

         if(var3 == 0) {
            if(var10000 < var10001) {
               break label40;
            }

            var10000 = var1;
            if(var3 != 0) {
               return (boolean)var10000;
            }

            var10001 = this.field_512;
         }

         if(var10000 < var10001) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: a (bao) boolean
   private boolean method_791(bao var1) {
      int var2 = class_862.method_5031();
      int var10000 = var1.method_5278();
      if(var2 == 0) {
         if(var10000 != 0) {
            var10000 = var1.method_5280().field_1927[0].method_2195().method_6871();
            if(var2 == 0) {
               if(var10000 != 0) {
                  var10000 = var1.cursorCounter8.field_3051;
                  if(var2 != 0) {
                     return (boolean)var10000;
                  }

                  if(var1.cursorCounter8.field_3051 == class_860.field_3998.method_4991()) {
                     var10000 = 1;
                     return (boolean)var10000;
                  }
               }

               var10000 = 0;
            }

            return (boolean)var10000;
         }

         var10000 = var1.cursorCounter8.field_3051;
      }

      if(var2 == 0) {
         var10000 = var10000 == class_860.field_3998.method_4991()?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_759() {
      // $FF: Couldn't be decompiled
   }
}
