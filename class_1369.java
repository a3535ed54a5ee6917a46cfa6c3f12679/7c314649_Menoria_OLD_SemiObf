import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: mG
public class Gui9 implements class_31 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_7235;
   // $FF: renamed from: c java.util.concurrent.ThreadPoolExecutor
   private static final ThreadPoolExecutor field_7236;
   // $FF: renamed from: d lY
   private final class_190 field_7237;
   // $FF: renamed from: e bao
   private final bao field_7238;
   // $FF: renamed from: f nF
   private final class_1386 field_7239;
   // $FF: renamed from: g long
   private long field_7240;
   // $FF: renamed from: h java.lang.String
   private String field_7241;
   // $FF: renamed from: i bpq
   private bpq field_7242;
   // $FF: renamed from: j bqx
   private bqx field_7243;
   // $FF: renamed from: k java.lang.String
   private static final String field_7244;
   // $FF: renamed from: l java.lang.String[]
   private static final String[] field_7245;


   // $FF: renamed from: <init> (lY, nF) void
   protected void setCanLoseFocus7(class_190 var1, class_1386 var2) {
      super();
      this.field_7237 = var1;
      this.field_7239 = var2;
      this.field_7238 = bao.method_5273();
      bqx var10001 = new bqx;
      StringBuilder var10003 = new StringBuilder();
      String[] var3 = field_7245;
      var10001.method_8227(var10003.append("servers/").append(var2.field_7362).append("/icon").toString());
      this.field_7243 = var10001;
      this.field_7242 = (bpq)this.field_7238.method_5288().method_8121(this.field_7243);
   }

   // $FF: renamed from: b (int, int, int, int, int, bmh, int, int, boolean) void
   public void method_147(int var1, int var2, int var3, int var4, int var5, bmh var6, int var7, int var8, boolean var9) {
      String[] var10 = class_752.method_4253();
      int var10000 = this.field_7239.field_7368;
      if(var10 != null) {
         if(!this.field_7239.field_7368) {
            this.field_7239.field_7368 = true;
            this.field_7239.field_7365 = -2L;
            this.field_7239.field_7364 = "";
            this.field_7239.field_7363 = "";
            ThreadPoolExecutor var25 = field_7236;
            class_1370 var10001 = new class_1370;
            var10001.getVisible4(this);
            var25.submit(var10001);
         }

         var10000 = this.field_7239.field_7366;
      }

      if(var10 != null) {
         var10000 = var10000 > 5?1:0;
      }

      int var11 = var10000;
      var10000 = this.field_7239.field_7366;
      if(var10 != null) {
         var10000 = this.field_7239.field_7366 < 5?1:0;
      }

      int var12 = var10000;
      var10000 = var11;
      if(var10 != null) {
         label237: {
            if(var11 == 0) {
               var10000 = var12;
               if(var10 == null) {
                  break label237;
               }

               if(var12 == 0) {
                  var10000 = 0;
                  break label237;
               }
            }

            var10000 = 1;
         }
      }

      int var13 = var10000;
      this.field_7238.enableBackgroundDrawing4.method_7020(this.field_7239.field_7361, var2 + 32 + 3, var3 + 1, 16777215);
      List var14 = this.field_7238.enableBackgroundDrawing4.listFormattedStringToWidth(this.field_7239.field_7364, var4 - 32 - 2);
      int var15 = 0;

      String var27;
      label229: {
         while(true) {
            if(var15 < Math.min(var14.size(), 2)) {
               this.field_7238.enableBackgroundDrawing4.method_7020((String)var14.get(var15), var2 + 32 + 3, var3 + 12 + this.field_7238.enableBackgroundDrawing4.FONT_HEIGHT * var15, 8421504);
               ++var15;
               if(var10 == null) {
                  break;
               }

               if(var10 != null) {
                  continue;
               }
            }

            if(var13 != 0) {
               var27 = class_130.field_280 + this.field_7239.field_7367;
               break label229;
            }
            break;
         }

         var27 = this.field_7239.field_7363;
      }

      int var16;
      byte var17;
      String var18;
      int var19;
      String var20;
      int var26;
      label245: {
         String var24 = var27;
         var16 = this.field_7238.enableBackgroundDrawing4.getCharWidth(var24);
         this.field_7238.enableBackgroundDrawing4.method_7020(var24, var2 + var4 - var16 - 15 - 2, var3 + 1, 8421504);
         var17 = 0;
         var18 = null;
         var10000 = var13;
         String[] var23;
         if(var10 != null) {
            if(var13 != 0) {
               var19 = 5;
               if(var11 != 0) {
                  var23 = field_7245;
                  var27 = "Client out of date!";
               } else {
                  var23 = field_7245;
                  var27 = "Server out of date!";
               }

               var20 = var27;
               var18 = this.field_7239.field_7369;
               break label245;
            }

            var10000 = this.field_7239.field_7368;
         }

         if(var10 != null) {
            label211: {
               if(var10000 != 0) {
                  long var31;
                  var10000 = (var31 = this.field_7239.field_7365 - -2L) == 0L?0:(var31 < 0L?-1:1);
                  if(var10 == null) {
                     break label211;
                  }

                  if(var10000 != 0) {
                     label247: {
                        long var32;
                        var10000 = (var32 = this.field_7239.field_7365 - 0L) == 0L?0:(var32 < 0L?-1:1);
                        if(var10 != null) {
                           if(var10000 < 0) {
                              var19 = 5;
                              if(var10 != null) {
                                 break label247;
                              }
                           }

                           long var33;
                           var10000 = (var33 = this.field_7239.field_7365 - 150L) == 0L?0:(var33 < 0L?-1:1);
                        }

                        if(var10 != null) {
                           if(var10000 < 0) {
                              var19 = 0;
                              if(var10 != null) {
                                 break label247;
                              }
                           }

                           long var34;
                           var10000 = (var34 = this.field_7239.field_7365 - 300L) == 0L?0:(var34 < 0L?-1:1);
                        }

                        if(var10 != null) {
                           if(var10000 < 0) {
                              var19 = 1;
                              if(var10 != null) {
                                 break label247;
                              }
                           }

                           long var35;
                           var10000 = (var35 = this.field_7239.field_7365 - 600L) == 0L?0:(var35 < 0L?-1:1);
                        }

                        if(var10 != null) {
                           if(var10000 < 0) {
                              var19 = 2;
                              if(var10 != null) {
                                 break label247;
                              }
                           }

                           long var36;
                           var10000 = (var36 = this.field_7239.field_7365 - 1000L) == 0L?0:(var36 < 0L?-1:1);
                        }

                        if(var10 != null) {
                           if(var10000 < 0) {
                              var19 = 3;
                              if(var10 != null) {
                                 break label247;
                              }
                           }

                           var10000 = 4;
                        }

                        var19 = var10000;
                     }

                     if(this.field_7239.field_7365 < 0L) {
                        var23 = field_7245;
                        var20 = "(no connection)";
                        if(var10 != null) {
                           break label245;
                        }
                     }

                     StringBuilder var28 = (new StringBuilder()).append(this.field_7239.field_7365);
                     var23 = field_7245;
                     var20 = var28.append("ms").toString();
                     var18 = this.field_7239.field_7369;
                     break label245;
                  }
               }

               var17 = 1;
               var10000 = (int)(bao.method_5283() / 100L + (long)(var1 * 2) & 7L);
            }
         }

         label168: {
            var19 = var10000;
            var10000 = var19;
            var26 = 4;
            if(var10 != null) {
               if(var19 <= 4) {
                  break label168;
               }

               var10000 = 8;
               var26 = var19;
            }

            var19 = var10000 - var26;
         }

         String[] var29 = field_7245;
         var20 = "Pinging...";
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_7238.method_5288().bindTexture(Gui.field_371);
      Gui.method_660(var2 + var4 - 15, var3, (float)(var17 * 10), (float)(176 + var19 * 8), 10, 8, 256.0F, 256.0F);
      Gui9 var30 = this;
      if(var10 != null) {
         label161: {
            if(this.field_7239.method_7564() != null) {
               var30 = this;
               if(var10 == null) {
                  break label161;
               }

               if(!this.field_7239.method_7564().equals(this.field_7241)) {
                  this.field_7241 = this.field_7239.method_7564();
                  this.setCanLoseFocus8();
                  this.field_7237.method_1016().method_7571();
               }
            }

            var30 = this;
         }
      }

      label155: {
         if(var10 != null) {
            if(var30.field_7242 == null) {
               break label155;
            }

            var30 = this;
         }

         var30.field_7238.method_5288().bindTexture(this.field_7243);
         Gui.method_660(var2, var3, 0.0F, 0.0F, 32, 32, 32.0F, 32.0F);
      }

      int var21 = var7 - var2;
      int var22 = var8 - var3;
      var10000 = var21;
      var26 = var4 - 15;
      if(var10 != null) {
         label147: {
            label146: {
               if(var21 >= var26) {
                  var10000 = var21;
                  var26 = var4 - 5;
                  if(var10 == null) {
                     break label147;
                  }

                  if(var21 <= var26) {
                     var10000 = var22;
                     if(var10 == null) {
                        break label146;
                     }

                     if(var22 >= 0) {
                        var10000 = var22;
                        var26 = 8;
                        if(var10 == null) {
                           break label147;
                        }

                        if(var22 <= 8) {
                           this.field_7237.method_1015(var20);
                           if(var10 != null) {
                              return;
                           }
                        }
                     }
                  }
               }

               var10000 = var21;
            }

            var26 = var4 - var16 - 15 - 2;
         }
      }

      label249: {
         if(var10 != null) {
            if(var10000 < var26) {
               return;
            }

            var10000 = var21;
            if(var10 == null) {
               break label249;
            }

            var26 = var4 - 15 - 2;
         }

         if(var10000 > var26) {
            return;
         }

         var10000 = var22;
      }

      if(var10 != null) {
         if(var10000 < 0) {
            return;
         }

         var10000 = var22;
      }

      if(var10000 <= 8) {
         this.field_7237.method_1015(var18);
      }

   }

   // $FF: renamed from: a () void
   private void setCanLoseFocus8() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int, int, int, int, int) boolean
   public boolean method_148(int var1, int var2, int var3, int var4, int var5, int var6) {
      String[] var10000 = class_752.method_4253();
      this.field_7237.method_1013(var1);
      String[] var7 = var10000;
      long var9;
      int var8 = (var9 = bao.method_5283() - this.field_7240 - 250L) == 0L?0:(var9 < 0L?-1:1);
      if(var7 != null) {
         if(var8 < 0) {
            this.field_7237.method_1011();
         }

         this.field_7240 = bao.method_5283();
         var8 = 0;
      }

      return (boolean)var8;
   }

   // $FF: renamed from: c (int, int, int, int, int, int) void
   public void method_149(int var1, int var2, int var3, int var4, int var5, int var6) {}

   // $FF: renamed from: b () nF
   public class_1386 setCanLoseFocus9() {
      return this.field_7239;
   }

   // $FF: renamed from: b (mG) nF
   static class_1386 getVisible0(Gui9 var0) {
      return var0.field_7239;
   }

   // $FF: renamed from: c (mG) lY
   static class_190 getVisible1(Gui9 var0) {
      return var0.field_7237;
   }

   // $FF: renamed from: <clinit> () void
   static void getVisible2() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception getVisible3(Exception var0) {
      return var0;
   }
}
