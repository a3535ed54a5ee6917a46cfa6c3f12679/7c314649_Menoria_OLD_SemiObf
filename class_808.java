import java.util.Random;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: oq
public class class_808 extends bno {

   // $FF: renamed from: g java.lang.String
   private static final String field_3794 = "CL_00001011";


   // $FF: renamed from: <init> () void
   public void method_4727() {
      super.method_4727();
   }

   // $FF: renamed from: b (xn, double, double, double, float, float) void
   public void method_4745(class_703 var1, double var2, double var4, double var6, float var8, float var9) {
      bmh var11 = bmh.instance;
      GL11.glDisable(3553);
      GL11.glDisable(2896);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 1);
      String[] var10000 = class_752.method_4253();
      double[] var12 = new double[8];
      String[] var10 = var10000;
      double[] var13 = new double[8];
      double var14 = 0.0D;
      double var16 = 0.0D;
      Random var18 = new Random(var1.field_3124);
      int var19 = 7;

      while(true) {
         if(var19 >= 0) {
            var12[var19] = var14;
            var13[var19] = var16;
            var14 += (double)(var18.nextInt(11) - 5);
            var16 += (double)(var18.nextInt(11) - 5);
            --var19;
            if(var10 == null) {
               break;
            }

            if(var10 != null) {
               continue;
            }
         }

         var19 = 0;
         break;
      }

      short var48;
      label181:
      while(true) {
         int var47 = var19;

         label178:
         while(var47 < 4) {
            Random var20 = new Random(var1.field_3124);
            var48 = 0;
            if(var10 == null) {
               break label181;
            }

            int var21 = 0;

            label175:
            do {
               var47 = var21;

               label172:
               while(true) {
                  if(var47 >= 3) {
                     break label175;
                  }

                  int var22 = 7;
                  int var23 = 0;
                  var47 = var21;
                  if(var10 == null) {
                     continue label178;
                  }

                  if(var10 != null) {
                     if(var21 > 0) {
                        var22 = 7 - var21;
                     }

                     var47 = var21;
                  }

                  label141: {
                     if(var10 != null) {
                        if(var47 <= 0) {
                           break label141;
                        }

                        var47 = var22 - 2;
                     }

                     var23 = var47;
                  }

                  double var24 = var12[var22] - var14;
                  double var26 = var13[var22] - var16;
                  int var28 = var22;

                  while(true) {
                     var47 = var28;
                     int var10001 = var23;

                     label168:
                     while(true) {
                        if(var47 < var10001) {
                           break label172;
                        }

                        double var29;
                        double var31;
                        label154: {
                           var29 = var24;
                           var31 = var26;
                           if(var10 != null) {
                              var47 = var21;
                              if(var10 == null) {
                                 continue label172;
                              }

                              if(var21 == 0) {
                                 var24 += (double)(var20.nextInt(11) - 5);
                                 var26 += (double)(var20.nextInt(11) - 5);
                                 if(var10 != null) {
                                    break label154;
                                 }
                              }

                              var24 += (double)(var20.nextInt(31) - 15);
                           }

                           var26 += (double)(var20.nextInt(31) - 15);
                        }

                        var11.setVisible3(5);
                        float var33 = 0.5F;
                        var11.setVisible7(0.9F * var33, 0.9F * var33, 1.0F * var33, 0.3F);
                        double var34 = 0.1D + (double)var19 * 0.2D;
                        if(var21 == 0) {
                           var34 *= (double)var28 * 0.1D + 1.0D;
                        }

                        double var36 = 0.1D + (double)var19 * 0.2D;
                        var47 = var21;
                        if(var10 != null) {
                           if(var21 == 0) {
                              var36 *= (double)(var28 - 1) * 0.1D + 1.0D;
                           }

                           var47 = 0;
                        }

                        int var38 = var47;

                        while(var38 < 5) {
                           double var39 = var2 + 0.5D - var34;
                           double var41 = var6 + 0.5D - var34;
                           var47 = var38;
                           var10001 = 1;
                           if(var10 == null) {
                              continue label168;
                           }

                           label135: {
                              label134: {
                                 label200: {
                                    if(var10 != null) {
                                       if(var38 == 1) {
                                          break label200;
                                       }

                                       var47 = var38;
                                       var10001 = 2;
                                    }

                                    if(var10 == null) {
                                       break label135;
                                    }

                                    if(var47 != var10001) {
                                       break label134;
                                    }
                                 }

                                 var39 += var34 * 2.0D;
                              }

                              var47 = var38;
                              var10001 = 2;
                           }

                           label122: {
                              label121: {
                                 if(var10 != null) {
                                    if(var47 == var10001) {
                                       break label121;
                                    }

                                    var47 = var38;
                                    var10001 = 3;
                                 }

                                 if(var47 != var10001) {
                                    break label122;
                                 }
                              }

                              var41 += var34 * 2.0D;
                           }

                           double var43;
                           double var45;
                           byte var49;
                           label113: {
                              label112: {
                                 label201: {
                                    var43 = var2 + 0.5D - var36;
                                    var45 = var6 + 0.5D - var36;
                                    var47 = var38;
                                    var49 = 1;
                                    if(var10 != null) {
                                       if(var38 == 1) {
                                          break label201;
                                       }

                                       var47 = var38;
                                       var49 = 2;
                                    }

                                    if(var10 == null) {
                                       break label113;
                                    }

                                    if(var47 != var49) {
                                       break label112;
                                    }
                                 }

                                 var43 += var36 * 2.0D;
                              }

                              var47 = var38;
                              var49 = 2;
                           }

                           label101: {
                              label100: {
                                 if(var10 != null) {
                                    if(var47 == var49) {
                                       break label100;
                                    }

                                    var47 = var38;
                                    var49 = 3;
                                 }

                                 if(var47 != var49) {
                                    break label101;
                                 }
                              }

                              var45 += var36 * 2.0D;
                           }

                           var11.method_7462(var43 + var24, var4 + (double)(var28 * 16), var45 + var26);
                           var11.method_7462(var39 + var29, var4 + (double)((var28 + 1) * 16), var41 + var31);
                           ++var38;
                           if(var10 == null) {
                              break;
                           }
                        }

                        var11.getVisible8();
                        --var28;
                        if(var10 == null) {
                           break label172;
                        }
                        break;
                     }
                  }
               }

               ++var21;
            } while(var10 != null);

            ++var19;
            if(var10 != null) {
               continue label181;
            }
            break;
         }

         GL11.glDisable(3042);
         GL11.glEnable(2896);
         var48 = 3553;
         break;
      }

      GL11.glEnable(var48);
   }

   // $FF: renamed from: b (xn) bqx
   protected bqx method_4746(class_703 var1) {
      return null;
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return this.method_4746((class_703)var1);
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.method_4745((class_703)var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "½É>xÏ÷§".toCharArray();
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
            field_3794 = (new String((char[])var4)).intern();
            String var2 = field_3794;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 162;
            break;
         case 1:
            var10009 = 155;
            break;
         case 2:
            var10009 = 202;
            break;
         case 3:
            var10009 = 254;
            break;
         case 4:
            var10009 = 82;
            break;
         case 5:
            var10009 = 228;
            break;
         default:
            var10009 = 20;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
