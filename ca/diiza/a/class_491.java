package ca.diiza.a;

import ca.diiza.t.class_600;
import java.util.Random;

// $FF: renamed from: ca.diiza.a.a
public class class_491 extends class_473 {

   // $FF: renamed from: M java.util.Random
   private final Random field_2281;
   // $FF: renamed from: N int
   public final int field_2282;
   // $FF: renamed from: O sa[]
   private static class_689[] field_2283;
   // $FF: renamed from: P java.lang.String
   private static final String field_2284;


   // $FF: renamed from: <init> (int) void
   public void method_2864(int var1) {
      super.method_2427(awt.field_4174);
      this.field_2281 = new Random();
      method_2868();
      this.field_2282 = var1;
      this.method_2521(class_872.field_4245);
      this.method_2443(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
      if(class_689.method_3976() != 0) {
         method_2867(new class_689[5]);
      }

   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 22;
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      class_689[] var5 = method_2868();
      aji var10000 = var1.getBlock(var2, var3, var4 - 1);
      class_491 var10001 = this;
      if(var5 == null) {
         if(var10000 == this) {
            this.method_2443(0.0625F, 0.0F, 0.0F, 0.9375F, 0.875F, 0.9375F);
            if(var5 == null) {
               return;
            }
         }

         var10000 = var1.getBlock(var2, var3, var4 + 1);
         var10001 = this;
      }

      if(var5 == null) {
         if(var10000 == var10001) {
            this.method_2443(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 1.0F);
            if(var5 == null) {
               return;
            }
         }

         var10000 = var1.getBlock(var2 - 1, var3, var4);
         var10001 = this;
      }

      if(var5 == null) {
         if(var10000 == var10001) {
            this.method_2443(0.0F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
            if(var5 == null) {
               return;
            }
         }

         var10000 = var1.getBlock(var2 + 1, var3, var4);
         var10001 = this;
      }

      if(var10000 == var10001) {
         this.method_2443(0.0625F, 0.0F, 0.0625F, 1.0F, 0.875F, 0.9375F);
         if(var5 == null) {
            return;
         }
      }

      this.method_2443(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      class_689[] var10000 = method_2868();
      var1.getBlock(var2, var3, var4 - 1);
      class_689[] var7 = var10000;
      var1.getBlock(var2, var3, var4 + 1);
      var1.getBlock(var2 - 1, var3, var4);
      var1.getBlock(var2 + 1, var3, var4);
      byte var9 = 0;
      int var10 = class_1715.method_9561((double)(var5.field_3000 * 4.0F / 360.0F) + 0.5D) & 3;
      int var11 = var10;
      if(var7 == null) {
         if(var10 == 0) {
            var9 = 2;
         }

         var11 = var10;
      }

      byte var10001 = 1;
      if(var7 == null) {
         if(var11 == 1) {
            var9 = 5;
         }

         var11 = var10;
         var10001 = 2;
      }

      label44: {
         if(var7 == null) {
            if(var11 == var10001) {
               var9 = 3;
            }

            var11 = var10;
            if(var7 != null) {
               break label44;
            }

            var10001 = 3;
         }

         if(var11 == var10001) {
            var9 = 4;
         }

         var1.method_2055(var2, var3, var4, var9, 0);
      }

      if(var7 != null) {
         int var8 = class_689.method_3977();
         ++var8;
         class_689.method_3975(var8);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      class_689[] var10000 = method_2868();
      super.method_2459(var1, var2, var3, var4, var5);
      class_600 var7 = (class_600)var1.method_31(var2, var3, var4);
      class_689[] var6 = var10000;
      class_600 var8 = var7;
      if(var6 == null) {
         if(var7 == null) {
            return;
         }

         var8 = var7;
      }

      var8.method_3105();
   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      class_689[] var10000 = method_2868();
      class_600 var8 = (class_600)var1.method_31(var2, var3, var4);
      class_689[] var7 = var10000;
      if(var7 == null) {
         if(var8 != null) {
            int var9 = 0;

            label60:
            do {
               int var17 = var9;
               int var10001 = var8.method_83();

               label57:
               while(true) {
                  if(var17 >= var10001) {
                     break label60;
                  }

                  add var10 = var8.method_84(var9);
                  if(var7 != null) {
                     return;
                  }

                  if(var7 != null) {
                     break;
                  }

                  if(var10 != null) {
                     float var11 = this.field_2281.nextFloat() * 0.8F + 0.1F;
                     float var12 = this.field_2281.nextFloat() * 0.8F + 0.1F;
                     float var14 = this.field_2281.nextFloat() * 0.8F + 0.1F;

                     while(var10.field_2958 > 0) {
                        int var15 = this.field_2281.nextInt(21) + 10;
                        if(var7 == null) {
                           var17 = var15;
                           var10001 = var10.field_2958;
                           if(var7 != null) {
                              continue label57;
                           }

                           if(var15 > var10.field_2958) {
                              var15 = var10.field_2958;
                           }

                           var10.field_2958 -= var15;
                        }

                        class_699 var18 = new class_699;
                        double var10003 = (double)((float)var2 + var11);
                        double var10004 = (double)((float)var3 + var12);
                        double var10005 = (double)((float)var4 + var14);
                        add var10006 = new add;
                        var10006.method_3726(var10.method_3730(), var15, var10.method_3745());
                        var18.method_4025(var1, var10003, var10004, var10005, var10006);
                        class_699 var13 = var18;
                        float var16 = 0.05F;
                        var13.field_2997 = (double)((float)this.field_2281.nextGaussian() * var16);
                        var13.field_2998 = (double)((float)this.field_2281.nextGaussian() * var16 + 0.2F);
                        var13.field_2999 = (double)((float)this.field_2281.nextGaussian() * var16);
                        boolean var19 = var10.method_3766();
                        if(var7 == null) {
                           if(var19) {
                              var13.method_4030().method_3769((class_1583)var10.method_3767().method_8633());
                           }

                           var1.method_2089(var13);
                        }

                        if(var7 != null) {
                           break;
                        }
                     }
                  }

                  ++var9;
                  break;
               }
            } while(var7 == null);

            var1.method_2221(var2, var3, var4, var5);
         }

         super.method_2462(var1, var2, var3, var4, var5, var6);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      class_689[] var10 = method_2868();
      boolean var10000 = var1.field_1832;
      if(var10 == null) {
         if(!var1.field_1832) {
            class_22 var11 = this.method_2865(var1, var2, var3, var4);
            if(var11 != null) {
               var5.method_4575(var11);
            }

            return true;
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: e (ahb, int, int, int) vI
   public class_22 method_2865(ahb var1, int var2, int var3, int var4) {
      class_689[] var10000 = method_2868();
      class_600 var6 = (class_600)var1.method_31(var2, var3, var4);
      class_689[] var5 = var10000;
      class_600 var7;
      if(var6 == null) {
         var7 = null;
      } else {
         boolean var8;
         ahb var9;
         int var10001;
         int var10002;
         int var10003;
         label135: {
            var8 = var1.getBlock(var2, var3 + 1, var4).method_2433();
            if(var5 == null) {
               if(var8) {
                  var7 = null;
                  return var7;
               }

               var9 = var1;
               var10001 = var2;
               var10002 = var3;
               var10003 = var4;
               if(var5 != null) {
                  break label135;
               }

               var8 = method_2866(var1, var2, var3, var4);
            }

            if(var8) {
               var7 = null;
               return var7;
            }

            var9 = var1;
            var10001 = var2 - 1;
            var10002 = var3;
            var10003 = var4;
         }

         aji var11 = var9.getBlock(var10001, var10002, var10003);
         class_491 var10 = this;
         if(var5 == null) {
            label117: {
               if(var11 == this) {
                  label161: {
                     label114: {
                        var8 = var1.getBlock(var2 - 1, var3 + 1, var4).method_2433();
                        if(var5 == null) {
                           if(var8) {
                              break label114;
                           }

                           var9 = var1;
                           var10001 = var2 - 1;
                           var10002 = var3;
                           var10003 = var4;
                           if(var5 != null) {
                              break label117;
                           }

                           var8 = method_2866(var1, var10001, var3, var4);
                        }

                        if(!var8) {
                           break label161;
                        }
                     }

                     var7 = null;
                     return var7;
                  }
               }

               var9 = var1;
               var10001 = var2 + 1;
               var10002 = var3;
               var10003 = var4;
            }

            var11 = var9.getBlock(var10001, var10002, var10003);
            var10 = this;
         }

         if(var5 == null) {
            label162: {
               label100: {
                  label99: {
                     if(var11 == var10) {
                        var8 = var1.getBlock(var2 + 1, var3 + 1, var4).method_2433();
                        if(var5 == null) {
                           if(var8) {
                              break label100;
                           }

                           var9 = var1;
                           var10001 = var2 + 1;
                           var10002 = var3;
                           var10003 = var4;
                           if(var5 != null) {
                              break label99;
                           }

                           var8 = method_2866(var1, var10001, var3, var4);
                        }

                        if(var8) {
                           break label100;
                        }
                     }

                     var9 = var1;
                     var10001 = var2;
                     var10002 = var3;
                     var10003 = var4 - 1;
                  }

                  var11 = var9.getBlock(var10001, var10002, var10003);
                  var10 = this;
                  break label162;
               }

               var7 = null;
               return var7;
            }
         }

         label163: {
            label140: {
               if(var5 == null) {
                  label75: {
                     if(var11 == var10) {
                        label164: {
                           label72: {
                              var8 = var1.getBlock(var2, var3 + 1, var4 - 1).method_2433();
                              if(var5 == null) {
                                 if(var8) {
                                    break label72;
                                 }

                                 var9 = var1;
                                 var10001 = var2;
                                 var10002 = var3;
                                 var10003 = var4 - 1;
                                 if(var5 != null) {
                                    break label75;
                                 }

                                 var8 = method_2866(var1, var2, var3, var10003);
                              }

                              if(!var8) {
                                 break label164;
                              }
                           }

                           var7 = null;
                           return var7;
                        }
                     }

                     var9 = var1;
                     var10001 = var2;
                     var10002 = var3;
                     var10003 = var4 + 1;
                  }

                  var11 = var9.getBlock(var10001, var10002, var10003);
                  if(var5 != null) {
                     break label140;
                  }

                  var10 = this;
               }

               if(var11 != var10) {
                  break label163;
               }

               var11 = var1.getBlock(var2, var3 + 1, var4 + 1);
            }

            label61: {
               var8 = var11.method_2433();
               if(var5 == null) {
                  if(var8) {
                     break label61;
                  }

                  var8 = method_2866(var1, var2, var3, var4 + 1);
               }

               if(!var8) {
                  break label163;
               }
            }

            var7 = null;
            return var7;
         }

         var7 = var6;
      }

      return var7;
   }

   // $FF: renamed from: a (ahb, int) gi
   public class_580 method_124(ahb var1, int var2) {
      class_600 var10000 = new class_600;
      var10000.getBlock88();
      class_600 var3 = var10000;
      return var3;
   }

   // $FF: renamed from: f () boolean
   public boolean method_2497() {
      class_689[] var1 = method_2868();
      int var10000 = this.field_2282;
      if(var1 == null) {
         var10000 = this.field_2282 == 1?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (ahl, int, int, int, int) int
   public int method_2496(ahl var1, int var2, int var3, int var4, int var5) {
      class_689[] var6 = method_2868();
      int var10000 = this.method_2497();
      if(var6 == null) {
         if(var10000 == 0) {
            return 0;
         }

         var10000 = ((class_600)var1.method_31(var2, var3, var4)).field_2577;
      }

      int var7 = var10000;
      return class_1715.method_9568(var7, 0, 15);
   }

   // $FF: renamed from: c (ahl, int, int, int, int) int
   public int method_2499(ahl var1, int var2, int var3, int var4, int var5) {
      class_689[] var6 = method_2868();
      int var10000 = var5;
      if(var6 == null) {
         var10000 = var5 == 1?this.method_2496(var1, var2, var3, var4, var5):0;
      }

      return var10000;
   }

   // $FF: renamed from: h (ahb, int, int, int) boolean
   private static boolean method_2866(ahb var0, int var1, int var2, int var3) {
      return false;
   }

   // $FF: renamed from: M () boolean
   public boolean method_2530() {
      return true;
   }

   // $FF: renamed from: g (ahb, int, int, int, int) int
   public int method_2531(ahb var1, int var2, int var3, int var4, int var5) {
      return class_671.method_3676(this.method_2865(var1, var2, var3, var4));
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      this.field_2010 = var1.method_375(field_2284);
   }

   // $FF: renamed from: b (sa[]) void
   public static void method_2867(class_689[] var0) {
      field_2283 = var0;
   }

   // $FF: renamed from: e () sa[]
   public static class_689[] method_2868() {
      return field_2283;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      method_2867((class_689[])null);
      boolean var10000 = true;
      char[] var10003 = ">¿d".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_2284 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 125;
            break;
         case 1:
            var10009 = 92;
            break;
         case 2:
            var10009 = 198;
            break;
         case 3:
            var10009 = 252;
            break;
         case 4:
            var10009 = 23;
            break;
         case 5:
            var10009 = 66;
            break;
         default:
            var10009 = 69;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
