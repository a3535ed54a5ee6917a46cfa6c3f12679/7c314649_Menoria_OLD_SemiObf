
public class bqm extends bqd {

   // $FF: renamed from: i double
   public double field_7882;
   // $FF: renamed from: j double
   public double field_7883;
   private static final String __OBFID = "CL_00001071";


   // $FF: renamed from: <init> (java.lang.String) void
   public void method_8076(String var1) {
      super.method_8076(var1);
   }

   // $FF: renamed from: j () void
   public void method_8081() {
      label18: {
         bao var2 = bao.method_5273();
         String[] var1 = class_752.method_4253();
         bao var10000 = var2;
         if(var1 != null) {
            if(var2.cursorCounter6 == null) {
               break label18;
            }

            var10000 = var2;
         }

         if(var10000.cursorCounter8 != null) {
            this.method_8098(var2.cursorCounter6, var2.cursorCounter8.field_2994, var2.cursorCounter8.field_2996, (double)var2.cursorCounter8.field_3000, false, false);
            if(var1 != null) {
               return;
            }
         }
      }

      this.method_8098((ahb)null, 0.0D, 0.0D, 0.0D, true, false);
   }

   // $FF: renamed from: a (ahb, double, double, double, boolean, boolean) void
   public void method_8098(ahb var1, double var2, double var4, double var6, boolean var8, boolean var9) {
      String[] var10 = class_752.method_4253();
      if(!this.field_7867.isEmpty()) {
         double var11;
         boolean var10000;
         label90: {
            var11 = 0.0D;
            if(var1 != null) {
               var10000 = var8;
               if(var10 == null) {
                  break label90;
               }

               if(!var8) {
                  class_1661 var13 = var1.method_2187();
                  double var14 = (double)var13.field_8646 - var2;
                  double var16 = (double)var13.field_8648 - var4;
                  var6 %= 360.0D;
                  var11 = -((var6 - 90.0D) * 3.141592653589793D / 180.0D - Math.atan2(var16, var14));
                  var10000 = var1.field_1820.method_6168();
                  if(var10 == null) {
                     break label90;
                  }

                  if(!var10000) {
                     var11 = Math.random() * 3.141592653589793D * 2.0D;
                  }
               }
            }

            var10000 = var9;
         }

         label95: {
            if(var10000) {
               this.field_7882 = var11;
               if(var10 != null) {
                  break label95;
               }
            }

            double var18 = var11 - this.field_7882;

            label75: {
               double var21;
               label96: {
                  int var20;
                  label97: {
                     label98: {
                        label71:
                        while(true) {
                           if(var18 < -3.141592653589793D) {
                              var18 += 6.283185307179586D;
                              if(var10 == null) {
                                 break;
                              }

                              if(var10 != null) {
                                 continue;
                              }
                           }

                           while(true) {
                              if(var18 < 3.141592653589793D) {
                                 break label71;
                              }

                              var18 -= 6.283185307179586D;
                              if(var10 == null) {
                                 break label98;
                              }

                              if(var10 == null) {
                                 break label71;
                              }
                           }
                        }

                        double var22;
                        var20 = (var22 = var18 - -1.0D) == 0.0D?0:(var22 < 0.0D?-1:1);
                        if(var10 == null) {
                           break label97;
                        }

                        if(var20 < 0) {
                           var18 = -1.0D;
                        }
                     }

                     var21 = var18;
                     if(var10 == null) {
                        break label96;
                     }

                     double var23;
                     var20 = (var23 = var18 - 1.0D) == 0.0D?0:(var23 < 0.0D?-1:1);
                  }

                  if(var20 <= 0) {
                     break label75;
                  }

                  var21 = 1.0D;
               }

               var18 = var21;
            }

            this.field_7883 += var18 * 0.1D;
            this.field_7883 *= 0.8D;
            this.field_7882 += this.field_7883;
         }

         int var19 = (int)((this.field_7882 / 6.283185307179586D + 1.0D) * (double)this.field_7867.size()) % this.field_7867.size();

         while(true) {
            if(var19 < 0) {
               var19 = (var19 + this.field_7867.size()) % this.field_7867.size();
               if(var10 == null) {
                  break;
               }

               if(var10 != null) {
                  continue;
               }
            }

            if(var19 != this.field_7879) {
               this.field_7879 = var19;
               bqi.method_8150((int[][])((int[][])this.field_7867.get(this.field_7879)), this.field_7873, this.field_7874, this.field_7871, this.field_7872, false, false);
            }
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_8097() {
      boolean var10000 = true;
      char[] var10003 = "ÕsF<Oø©G".toCharArray();
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
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 45;
            break;
         case 1:
            var10009 = 125;
            break;
         case 2:
            var10009 = 200;
            break;
         case 3:
            var10009 = 146;
            break;
         case 4:
            var10009 = 232;
            break;
         case 5:
            var10009 = 155;
            break;
         default:
            var10009 = 94;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
