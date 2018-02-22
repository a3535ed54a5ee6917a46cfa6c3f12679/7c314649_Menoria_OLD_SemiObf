import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;

// $FF: renamed from: sw
public abstract class class_753 extends class_752 {

   // $FF: renamed from: a_ int
   public int field_3366;
   // $FF: renamed from: b int
   protected int field_3367;
   // $FF: renamed from: h yd
   private class_1844 field_3368;
   // $FF: renamed from: i ye
   private class_1845 field_3369;
   // $FF: renamed from: bm yc
   private class_1843 field_3370;
   // $FF: renamed from: bn yb
   private class_1842 field_3371;
   // $FF: renamed from: bo y7
   private class_1783 field_3372;
   // $FF: renamed from: c y3
   protected final class_1776 field_3373;
   // $FF: renamed from: d y3
   protected final class_1776 field_3374;
   // $FF: renamed from: bp sv
   private class_752 field_3375;
   // $FF: renamed from: bq y8
   private class_1785 field_3376;
   // $FF: renamed from: br add[]
   private add[] field_3377;
   // $FF: renamed from: e float[]
   protected float[] field_3378;
   // $FF: renamed from: bs boolean
   private boolean field_3379;
   // $FF: renamed from: bt boolean
   private boolean field_3380;
   // $FF: renamed from: f float
   protected float field_3381;
   // $FF: renamed from: bu sa
   private class_689 field_3382;
   // $FF: renamed from: g int
   protected int field_3383;
   // $FF: renamed from: bv boolean
   private boolean field_3384;
   // $FF: renamed from: bw sa
   private class_689 field_3385;
   // $FF: renamed from: bx ro
   private class_1583 field_3386;
   private static final String __OBFID;
   // $FF: renamed from: db java.lang.String[]
   private static final String[] field_3387;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      String[] var2 = class_752.method_4253();
      this.field_3377 = new add[5];
      this.field_3378 = new float[5];
      class_1776 var10001 = new class_1776;
      var10001.method_9765(var1 != null && var1.field_1829 != null?var1.field_1829:null);
      this.field_3373 = var10001;
      var10001 = new class_1776;
      var10001.method_9765(var1 != null && var1.field_1829 != null?var1.field_1829:null);
      this.field_3374 = var10001;
      class_1844 var4 = new class_1844;
      var4.method_9974(this);
      this.field_3368 = var4;
      class_1845 var5 = new class_1845;
      var5.method_9980(this);
      this.field_3369 = var5;
      class_1843 var6 = new class_1843;
      var6.method_9971(this);
      this.field_3370 = var6;
      class_1842 var7 = new class_1842;
      var7.method_9968(this);
      this.field_3371 = var7;
      class_1783 var8 = new class_1783;
      var8.method_9783(this, var1);
      this.field_3372 = var8;
      class_1785 var9 = new class_1785;
      var9.method_9812(this);
      this.field_3376 = var9;
      int var3 = 0;

      while(var3 < this.field_3378.length) {
         this.field_3378[var3] = 0.085F;
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4212().method_9617(class_1840.field_9391).method_390(16.0D);
   }

   // $FF: renamed from: j () yd
   public class_1844 method_4254() {
      return this.field_3368;
   }

   // $FF: renamed from: k () ye
   public class_1845 method_4255() {
      return this.field_3369;
   }

   // $FF: renamed from: l () yc
   public class_1843 method_4256() {
      return this.field_3370;
   }

   // $FF: renamed from: m () y7
   public class_1783 method_4257() {
      return this.field_3372;
   }

   // $FF: renamed from: n () y8
   public class_1785 method_4258() {
      return this.field_3376;
   }

   // $FF: renamed from: o () sv
   public class_752 method_4259() {
      return this.field_3375;
   }

   // $FF: renamed from: d (sv) void
   public void method_4260(class_752 var1) {
      this.field_3375 = var1;
   }

   // $FF: renamed from: a (java.lang.Class) boolean
   public boolean method_4261(Class var1) {
      boolean var3;
      label17: {
         String[] var2 = class_752.method_4253();
         Class var10000 = class_789.class;
         Class var10001 = var1;
         if(var2 != null) {
            if(class_789.class == var1) {
               break label17;
            }

            var10000 = class_760.class;
            var10001 = var1;
         }

         if(var10000 != var10001) {
            var3 = true;
            return var3;
         }
      }

      var3 = false;
      return var3;
   }

   // $FF: renamed from: p () void
   public void method_4262() {}

   // $FF: renamed from: c () void
   protected void method_3848() {
      super.method_3848();
      this.field_3036.method_9497(11, Byte.valueOf((byte)0));
      this.field_3036.method_9497(10, "");
   }

   // $FF: renamed from: q () int
   public int method_4263() {
      return 80;
   }

   // $FF: renamed from: r () void
   public void method_4264() {
      String var1 = this.method_4266();
      if(var1 != null) {
         this.method_3868(var1, this.method_4216(), this.method_4217());
      }

   }

   // $FF: renamed from: C () void
   public void method_3857() {
      super.method_3857();
      String[] var10000 = class_752.method_4253();
      String[] var10002 = field_3387;
      this.field_2990.field_1829.method_8332("mobBaseTick");
      String[] var1 = var10000;
      class_753 var2 = this;
      if(var1 != null) {
         label16: {
            if(this.method_3917()) {
               var2 = this;
               if(var1 == null) {
                  break label16;
               }

               if(this.field_3028.nextInt(1000) < this.field_3366++) {
                  this.field_3366 = -this.method_4263();
                  this.method_4264();
               }
            }

            var2 = this;
         }
      }

      var2.field_2990.field_1829.method_8333();
   }

   // $FF: renamed from: e (yz) int
   protected int method_4163(class_792 var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_3367;
      if(var2 != null) {
         if(this.field_3367 > 0) {
            int var3 = this.field_3367;
            add[] var4 = this.method_3934();
            int var5 = 0;

            while(var5 < var4.length) {
               if(var4[var5] != null) {
                  label24: {
                     float var6;
                     var10000 = (var6 = this.field_3378[var5] - 1.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
                     if(var2 != null) {
                        if(var10000 > 0) {
                           break label24;
                        }

                        var10000 = var3 + 1 + this.field_3028.nextInt(3);
                     }

                     var3 = var10000;
                  }
               }

               ++var5;
               if(var2 == null) {
                  break;
               }
            }

            return var3;
         }

         var10000 = this.field_3367;
      }

      return var10000;
   }

   // $FF: renamed from: s () void
   public void method_4265() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;

      while(var2 < 20) {
         double var3 = this.field_3028.nextGaussian() * 0.02D;
         double var5 = this.field_3028.nextGaussian() * 0.02D;
         double var7 = this.field_3028.nextGaussian() * 0.02D;
         double var9 = 10.0D;
         String[] var10001 = field_3387;
         this.field_2990.method_2087("explode", this.field_2994 + (double)(this.field_3028.nextFloat() * this.field_3014 * 2.0F) - (double)this.field_3014 - var3 * var9, this.field_2995 + (double)(this.field_3028.nextFloat() * this.field_3015) - var5 * var9, this.field_2996 + (double)(this.field_3028.nextFloat() * this.field_3014 * 2.0F) - (double)this.field_3014 - var7 * var9, var3, var5, var7);
         ++var2;
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: h () void
   public void method_3856() {
      super.method_3856();
      String[] var1 = class_752.method_4253();
      class_753 var10000 = this;
      if(var1 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var10000 = this;
      }

      var10000.method_4296();
   }

   // $FF: renamed from: f (float, float) float
   protected float method_4230(float var1, float var2) {
      String[] var3 = class_752.method_4253();
      class_753 var10000 = this;
      if(var3 != null) {
         if(this.method_4225()) {
            this.field_3371.method_9969();
            return var2;
         }

         var10000 = this;
      }

      return var10000.method_4230(var1, var2);
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      return null;
   }

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      return adb.method_2919(0);
   }

   // $FF: renamed from: b (boolean, int) void
   protected void method_4196(boolean var1, int var2) {
      String[] var10000 = class_752.method_4253();
      adb var4 = this.method_4267();
      String[] var3 = var10000;
      if(var4 != null) {
         int var5 = this.field_3028.nextInt(3);
         int var7 = var2;
         if(var3 != null) {
            if(var2 > 0) {
               var5 += this.field_3028.nextInt(var2 + 1);
            }

            var7 = 0;
         }

         int var6 = var7;

         while(var6 < var5) {
            this.method_3914(var4, 1);
            ++var6;
            if(var3 == null) {
               break;
            }
         }
      }

   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_3909(var1);
      String[] var2 = var10000;
      String[] var7 = field_3387;
      var1.initGui4("CanPickUpLoot", this.method_4292());
      var1.initGui4("PersistenceRequired", this.field_3380);
      class_1580 var9 = new class_1580;
      var9.method_8628();
      class_1580 var3 = var9;
      int var5 = 0;

      class_1583 var4;
      class_1583 var10;
      while(true) {
         if(var5 < this.field_3377.length) {
            var10 = new class_1583;
            var10.method_8628();
            var4 = var10;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               if(this.field_3377[var5] != null) {
                  this.field_3377[var5].method_3737(var4);
               }

               var3.method_8650(var4);
               ++var5;
            }

            if(var2 != null) {
               continue;
            }
         }

         var7 = field_3387;
         var1.method_8664("Equipment", var3);
         break;
      }

      var9 = new class_1580;
      var9.method_8628();
      class_1580 var8 = var9;
      int var6 = 0;

      label77: {
         while(true) {
            if(var6 < this.field_3378.length) {
               class_1576 var10001 = new class_1576;
               var10001.method_8645(this.field_3378[var6]);
               var8.method_8650(var10001);
               ++var6;
               if(var2 == null) {
                  break;
               }

               if(var2 != null) {
                  continue;
               }
            }

            var7 = field_3387;
            var1.method_8664("DropChances", var8);
            var1.initGui1("CustomName", this.method_4287());
            var1.initGui4("CustomNameVisible", this.method_4290());
            var10 = var1;
            if(var2 == null) {
               break label77;
            }

            var1.initGui4("Leashed", this.field_3384);
            break;
         }

         if(this.field_3385 == null) {
            return;
         }

         var10 = new class_1583;
         var10.method_8628();
      }

      label45: {
         class_689 var14;
         label79: {
            var4 = var10;
            boolean var13 = this.field_3385 instanceof class_752;
            if(var2 != null) {
               if(var13) {
                  var7 = field_3387;
                  var4.method_8668("UUIDMost", this.field_3385.method_3972().getMostSignificantBits());
                  var4.method_8668("UUIDLeast", this.field_3385.method_3972().getLeastSignificantBits());
                  if(var2 != null) {
                     break label45;
                  }
               }

               var14 = this.field_3385;
               if(var2 == null) {
                  break label79;
               }

               var13 = this.field_3385 instanceof class_748;
            }

            if(!var13) {
               break label45;
            }

            var14 = this.field_3385;
         }

         class_748 var11 = (class_748)var14;
         var4.method_8667("X", var11.field_3295);
         var4.method_8667("Y", var11.field_3296);
         var4.method_8667("Z", var11.field_3297);
      }

      String[] var12 = field_3387;
      var1.method_8664("Leash", var4);
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.method_3908(var1);
      String[] var2 = var10000;
      String[] var5 = field_3387;
      this.method_4293(var1.method_8690("CanPickUpLoot"));
      this.field_3380 = var1.method_8690("PersistenceRequired");
      int var6 = var1.initGui8("CustomName", 8);
      if(var2 != null) {
         label72: {
            if(var6 != 0) {
               var6 = var1.method_8685("CustomName").length();
               if(var2 == null) {
                  break label72;
               }

               if(var6 > 0) {
                  this.method_4286(var1.method_8685("CustomName"));
               }
            }

            var5 = field_3387;
            this.method_4289(var1.method_8690("CustomNameVisible"));
            var6 = var1.initGui8("Equipment", 9);
         }
      }

      label66: {
         label76: {
            class_1580 var3;
            int var4;
            if(var2 != null) {
               if(var6 != 0) {
                  var5 = field_3387;
                  var3 = var1.method_8689("Equipment", 10);
                  var4 = 0;

                  while(var4 < this.field_3377.length) {
                     this.field_3377[var4] = add.method_3727(var3.method_8653(var4));
                     ++var4;
                     if(var2 == null) {
                        break label76;
                     }

                     if(var2 == null) {
                        break;
                     }
                  }
               }

               var5 = field_3387;
               var6 = var1.initGui8("DropChances", 9);
            }

            if(var2 == null) {
               break label66;
            }

            if(var6 != 0) {
               var5 = field_3387;
               var3 = var1.method_8689("DropChances", 5);
               var4 = 0;

               while(var4 < var3.method_8658()) {
                  this.field_3378[var4] = var3.method_8656(var4);
                  ++var4;
                  if(var2 == null) {
                     break label76;
                  }

                  if(var2 == null) {
                     break;
                  }
               }
            }

            var5 = field_3387;
            this.field_3384 = var1.method_8690("Leashed");
         }

         var6 = this.field_3384;
      }

      if(var2 != null) {
         if(var6 == 0) {
            return;
         }

         var5 = field_3387;
         var6 = var1.initGui8("Leash", 10);
      }

      if(var6 != 0) {
         String[] var10002 = field_3387;
         this.field_3386 = var1.method_8688("Leash");
      }

   }

   // $FF: renamed from: n (float) void
   public void method_4268(float var1) {
      this.field_3348 = var1;
   }

   // $FF: renamed from: i (float) void
   public void method_4227(float var1) {
      super.method_4227(var1);
      this.method_4268(var1);
   }

   // $FF: renamed from: e () void
   public void method_4231() {
      String[] var10000 = class_752.method_4253();
      super.method_4231();
      String[] var1 = var10000;
      String[] var11 = field_3387;
      this.field_2990.field_1829.method_8332("looting");
      ahb var15 = this.field_2990;
      if(var1 != null) {
         label274: {
            class_753 var16;
            label273: {
               if(!this.field_2990.field_1832) {
                  var16 = this;
                  if(var1 == null) {
                     break label273;
                  }

                  if(this.method_4292()) {
                     var16 = this;
                     if(var1 == null) {
                        break label273;
                     }

                     if(!this.field_3337) {
                        var15 = this.field_2990;
                        if(var1 == null) {
                           break label274;
                        }

                        if(this.field_2990.method_2196().method_5878("mobGriefing")) {
                           List var2 = this.field_2990.method_2157(class_699.class, this.field_3004.method_7097(1.0D, 0.0D, 1.0D));
                           Iterator var3 = var2.iterator();

                           while(var3.hasNext()) {
                              class_699 var4 = (class_699)var3.next();
                              if(var1 == null) {
                                 return;
                              }

                              label279: {
                                 class_699 var17 = var4;
                                 if(var1 != null) {
                                    if(var4.field_3012) {
                                       break label279;
                                    }

                                    var17 = var4;
                                 }

                                 add var18 = var17.method_4030();
                                 if(var1 != null) {
                                    if(var18 == null) {
                                       break label279;
                                    }

                                    var18 = var4.method_4030();
                                 }

                                 add var5 = var18;
                                 int var6 = method_4279(var5);
                                 int var19 = var6;
                                 if(var1 != null) {
                                    if(var6 <= -1) {
                                       break label279;
                                    }

                                    var19 = 1;
                                 }

                                 int var7 = var19;
                                 add var8 = this.method_4215(var6);
                                 if(var8 != null) {
                                    label280: {
                                       var19 = var6;
                                       if(var1 != null) {
                                          if(var6 == 0) {
                                             byte var20 = var5.method_3730() instanceof class_511;
                                             if(var1 != null) {
                                                label227: {
                                                   if(var20 != 0) {
                                                      var20 = var8.method_3730() instanceof class_511;
                                                      if(var1 == null) {
                                                         break label227;
                                                      }

                                                      if(var20 == 0) {
                                                         var7 = 1;
                                                         if(var1 != null) {
                                                            break label280;
                                                         }
                                                      }
                                                   }

                                                   var20 = var5.method_3730() instanceof class_511;
                                                }
                                             }

                                             if(var1 != null) {
                                                label220: {
                                                   if(var20 != 0) {
                                                      var20 = var8.method_3730() instanceof class_511;
                                                      if(var1 == null) {
                                                         break label220;
                                                      }

                                                      if(var20 != 0) {
                                                         label282: {
                                                            class_511 var9 = (class_511)var5.method_3730();
                                                            class_511 var10 = (class_511)var8.method_3730();
                                                            float var21;
                                                            var19 = (var21 = var9.method_2985() - var10.method_2985()) == 0.0F?0:(var21 < 0.0F?-1:1);
                                                            if(var1 != null) {
                                                               if(var19 == 0) {
                                                                  var19 = var5.method_3745();
                                                                  if(var1 != null) {
                                                                     label200: {
                                                                        if(var19 <= var8.method_3745()) {
                                                                           label198: {
                                                                              label283: {
                                                                                 var19 = var5.method_3766();
                                                                                 if(var1 != null) {
                                                                                    if(var19 == 0) {
                                                                                       break label283;
                                                                                    }

                                                                                    var19 = var8.method_3766();
                                                                                 }

                                                                                 if(var1 == null) {
                                                                                    break label200;
                                                                                 }

                                                                                 if(var19 == 0) {
                                                                                    break label198;
                                                                                 }
                                                                              }

                                                                              var19 = 0;
                                                                              break label200;
                                                                           }
                                                                        }

                                                                        var19 = 1;
                                                                     }
                                                                  }

                                                                  var7 = var19;
                                                                  if(var1 != null) {
                                                                     break label282;
                                                                  }
                                                               }

                                                               float var22;
                                                               var19 = (var22 = var9.method_2985() - var10.method_2985()) == 0.0F?0:(var22 < 0.0F?-1:1);
                                                            }

                                                            if(var1 != null) {
                                                               var19 = var19 > 0?1:0;
                                                            }

                                                            var7 = var19;
                                                         }

                                                         if(var1 != null) {
                                                            break label280;
                                                         }
                                                      }
                                                   }

                                                   var20 = 0;
                                                }
                                             }

                                             var7 = var20;
                                             if(var1 != null) {
                                                break label280;
                                             }
                                          }

                                          var19 = var5.method_3730() instanceof class_525;
                                       }

                                       if(var1 != null) {
                                          label185: {
                                             if(var19 != 0) {
                                                var19 = var8.method_3730() instanceof class_525;
                                                if(var1 == null) {
                                                   break label185;
                                                }

                                                if(var19 == 0) {
                                                   var7 = 1;
                                                   if(var1 != null) {
                                                      break label280;
                                                   }
                                                }
                                             }

                                             var19 = var5.method_3730() instanceof class_525;
                                          }
                                       }

                                       if(var1 != null) {
                                          label175: {
                                             if(var19 != 0) {
                                                var19 = var8.method_3730() instanceof class_525;
                                                if(var1 == null) {
                                                   break label175;
                                                }

                                                if(var19 != 0) {
                                                   label166: {
                                                      label165: {
                                                         class_525 var12 = (class_525)var5.method_3730();
                                                         class_525 var14 = (class_525)var8.method_3730();
                                                         var19 = var12.field_2366;
                                                         int var10001 = var14.field_2366;
                                                         if(var1 != null) {
                                                            if(var12.field_2366 == var14.field_2366) {
                                                               var19 = var5.method_3745();
                                                               if(var1 != null) {
                                                                  label154: {
                                                                     if(var19 <= var8.method_3745()) {
                                                                        label152: {
                                                                           label285: {
                                                                              var19 = var5.method_3766();
                                                                              if(var1 != null) {
                                                                                 if(var19 == 0) {
                                                                                    break label285;
                                                                                 }

                                                                                 var19 = var8.method_3766();
                                                                              }

                                                                              if(var1 == null) {
                                                                                 break label154;
                                                                              }

                                                                              if(var19 == 0) {
                                                                                 break label152;
                                                                              }
                                                                           }

                                                                           var19 = 0;
                                                                           break label154;
                                                                        }
                                                                     }

                                                                     var19 = 1;
                                                                  }
                                                               }

                                                               var7 = var19;
                                                               if(var1 != null) {
                                                                  break label166;
                                                               }
                                                            }

                                                            var19 = var12.field_2366;
                                                            if(var1 == null) {
                                                               break label165;
                                                            }

                                                            var10001 = var14.field_2366;
                                                         }

                                                         var19 = var19 > var10001?1:0;
                                                      }

                                                      var7 = var19;
                                                   }

                                                   if(var1 != null) {
                                                      break label280;
                                                   }
                                                }
                                             }

                                             var19 = 0;
                                          }
                                       }

                                       var7 = var19;
                                    }
                                 }

                                 if(var7 != 0) {
                                    var18 = var8;
                                    if(var1 != null) {
                                       if(var8 != null) {
                                          label136: {
                                             var16 = this;
                                             if(var1 != null) {
                                                if(this.field_3028.nextFloat() - 0.1F >= this.field_3378[var6]) {
                                                   break label136;
                                                }

                                                var16 = this;
                                             }

                                             var16.method_3916(var8, 0.0F);
                                          }
                                       }

                                       var18 = var5;
                                    }

                                    label130: {
                                       label129: {
                                          if(var18.method_3730() == class_1010.field_5122) {
                                             var17 = var4;
                                             if(var1 == null) {
                                                break label130;
                                             }

                                             if(var4.method_4034() != null) {
                                                class_792 var13 = this.field_2990.method_2178(var4.method_4034());
                                                if(var1 == null) {
                                                   break label129;
                                                }

                                                if(var13 != null) {
                                                   var13.method_4614(class_1600.field_8348);
                                                }
                                             }
                                          }

                                          this.method_3935(var6, var5);
                                          this.field_3378[var6] = 2.0F;
                                          this.field_3380 = true;
                                          this.method_4238(var4, 1);
                                       }

                                       var17 = var4;
                                    }

                                    var17.method_3851();
                                 }
                              }

                              if(var1 == null) {
                                 break;
                              }
                           }
                        }
                     }
                  }
               }

               var16 = this;
            }

            var15 = var16.field_2990;
         }
      }

      var15.field_1829.method_8333();
   }

   // $FF: renamed from: bk () boolean
   protected boolean method_4225() {
      return false;
   }

   // $FF: renamed from: v () boolean
   protected boolean method_4269() {
      return true;
   }

   // $FF: renamed from: w () void
   public void method_4270() {
      String[] var1 = class_752.method_4253();
      class_753 var10000 = this;
      if(var1 != null) {
         if(this.field_3380) {
            this.field_3338 = 0;
            if(var1 != null) {
               return;
            }
         }

         var10000 = this;
      }

      class_792 var2 = var10000.field_2990.method_2174(this, -1.0D);
      class_792 var11 = var2;
      if(var1 != null) {
         if(var2 == null) {
            return;
         }

         var11 = var2;
      }

      double var3 = var11.field_2994 - this.field_2994;
      double var5 = var2.field_2995 - this.field_2995;
      double var7 = var2.field_2996 - this.field_2996;
      double var9 = var3 * var3 + var5 * var5 + var7 * var7;
      int var12 = this.method_4269();
      if(var1 != null) {
         label52: {
            if(var12 != 0) {
               double var13;
               var12 = (var13 = var9 - 16384.0D) == 0.0D?0:(var13 < 0.0D?-1:1);
               if(var1 == null) {
                  break label52;
               }

               if(var12 > 0) {
                  this.method_3851();
               }
            }

            var12 = this.field_3338;
         }
      }

      if(var1 != null) {
         label45: {
            if(var12 > 600) {
               var12 = this.field_3028.nextInt(800);
               if(var1 == null) {
                  break label45;
               }

               if(var12 == 0) {
                  double var14;
                  var12 = (var14 = var9 - 1024.0D) == 0.0D?0:(var14 < 0.0D?-1:1);
                  if(var1 == null) {
                     break label45;
                  }

                  if(var12 > 0) {
                     var12 = this.method_4269();
                     if(var1 == null) {
                        break label45;
                     }

                     if(var12 != 0) {
                        this.method_3851();
                        if(var1 != null) {
                           return;
                        }
                     }
                  }
               }
            }

            double var15;
            var12 = (var15 = var9 - 1024.0D) == 0.0D?0:(var15 < 0.0D?-1:1);
         }
      }

      if(var12 < 0) {
         this.field_3338 = 0;
      }

   }

   // $FF: renamed from: bn () void
   protected void method_4232() {
      ++this.field_3338;
      String[] var1 = field_3387;
      this.field_2990.field_1829.method_8332("checkDespawn");
      this.method_4270();
      this.field_2990.field_1829.method_8333();
      this.field_2990.field_1829.method_8332("sensing");
      this.field_3376.method_9813();
      this.field_2990.field_1829.method_8333();
      this.field_2990.field_1829.method_8332("targetSelector");
      this.field_3374.method_9768();
      this.field_2990.field_1829.method_8333();
      this.field_2990.field_1829.method_8332("goalSelector");
      this.field_3373.method_9768();
      this.field_2990.field_1829.method_8333();
      this.field_2990.field_1829.method_8332("navigation");
      this.field_3372.method_9799();
      this.field_2990.field_1829.method_8333();
      this.field_2990.field_1829.method_8332("mob tick");
      this.method_4235();
      this.field_2990.field_1829.method_8333();
      this.field_2990.field_1829.method_8332("controls");
      this.field_2990.field_1829.method_8332("move");
      this.field_3369.method_9984();
      this.field_2990.field_1829.method_8335("look");
      this.field_3368.method_9977();
      this.field_2990.field_1829.method_8335("jump");
      this.field_3370.method_9973();
      this.field_2990.field_1829.method_8333();
      this.field_2990.field_1829.method_8333();
   }

   // $FF: renamed from: bq () void
   protected void method_4236() {
      String[] var1;
      int var8;
      label88: {
         label91: {
            class_753 var7;
            label92: {
               String[] var10000 = class_752.method_4253();
               super.method_4236();
               var1 = var10000;
               this.field_3347 = 0.0F;
               this.field_3348 = 0.0F;
               this.method_4270();
               float var2 = 8.0F;
               Object var6 = this;
               if(var1 != null) {
                  if(this.field_3028.nextFloat() < 0.02F) {
                     label63: {
                        label62: {
                           class_792 var3 = this.field_2990.method_2174(this, (double)var2);
                           if(var1 != null) {
                              if(var3 == null) {
                                 break label62;
                              }

                              this.field_3382 = var3;
                              this.field_3383 = 10 + this.field_3028.nextInt(20);
                           }

                           if(var1 != null) {
                              break label63;
                           }
                        }

                        this.field_3349 = (this.field_3028.nextFloat() - 0.5F) * 20.0F;
                     }
                  }

                  var7 = this;
                  if(var1 == null) {
                     break label92;
                  }

                  var6 = this.field_3382;
               }

               if(var6 != null) {
                  this.method_4272(this.field_3382, 10.0F, (float)this.method_4271());
                  var7 = this;
                  if(var1 != null) {
                     label76: {
                        if(this.field_3383-- > 0) {
                           var7 = this;
                           if(var1 == null) {
                              break label76;
                           }

                           if(!this.field_3382.field_3012) {
                              double var9;
                              var8 = (var9 = this.field_3382.method_3891(this) - (double)(var2 * var2)) == 0.0D?0:(var9 < 0.0D?-1:1);
                              if(var1 == null) {
                                 break label88;
                              }

                              if(var8 <= 0) {
                                 break label91;
                              }
                           }
                        }

                        var7 = this;
                     }
                  }

                  var7.field_3382 = null;
                  if(var1 != null) {
                     break label91;
                  }
               }

               var7 = this;
            }

            if(var1 != null) {
               if(var7.field_3028.nextFloat() < 0.05F) {
                  this.field_3349 = (this.field_3028.nextFloat() - 0.5F) * 20.0F;
               }

               this.field_3000 += this.field_3349;
               var7 = this;
            }

            var7.field_3001 = this.field_3381;
         }

         var8 = this.method_3876();
      }

      label53: {
         int var5 = var8;
         byte var4 = this.method_3881();
         var8 = var5;
         if(var1 != null) {
            if(var5 != 0) {
               break label53;
            }

            var8 = var4;
         }

         if(var8 == 0) {
            return;
         }
      }

      float var10;
      int var10001 = (var10 = this.field_3028.nextFloat() - 0.8F) == 0.0F?0:(var10 < 0.0F?-1:1);
      if(var1 != null) {
         var10001 = var10001 < 0?1:0;
      }

      this.field_3346 = (boolean)var10001;
   }

   // $FF: renamed from: x () int
   public int method_4271() {
      return 40;
   }

   // $FF: renamed from: a (sa, float, float) void
   public void method_4272(class_689 var1, float var2, float var3) {
      double var5;
      double var7;
      double var9;
      label15: {
         String[] var10000 = class_752.method_4253();
         var5 = var1.field_2994 - this.field_2994;
         String[] var4 = var10000;
         var7 = var1.field_2996 - this.field_2996;
         class_689 var16 = var1;
         if(var4 != null) {
            if(var1 instanceof class_752) {
               class_752 var11 = (class_752)var1;
               var9 = var11.field_2995 + (double)var11.method_3880() - (this.field_2995 + (double)this.method_3880());
               if(var4 != null) {
                  break label15;
               }
            }

            var16 = var1;
         }

         var9 = (var16.field_3004.field_6910 + var1.field_3004.field_6913) / 2.0D - (this.field_2995 + (double)this.method_3880());
      }

      double var15 = (double)class_1715.method_9558(var5 * var5 + var7 * var7);
      float var13 = (float)(Math.atan2(var7, var5) * 180.0D / 3.141592653589793D) - 90.0F;
      float var14 = (float)(-(Math.atan2(var9, var15) * 180.0D / 3.141592653589793D));
      this.field_3001 = this.method_4273(this.field_3001, var14, var3);
      this.field_3000 = this.method_4273(this.field_3000, var13, var2);
   }

   // $FF: renamed from: b (float, float, float) float
   private float method_4273(float var1, float var2, float var3) {
      String[] var10000 = class_752.method_4253();
      float var5 = class_1715.method_9579(var2 - var1);
      String[] var4 = var10000;
      float var8;
      int var6 = (var8 = var5 - var3) == 0.0F?0:(var8 < 0.0F?-1:1);
      float var10001;
      float var7;
      if(var4 != null) {
         if(var6 > 0) {
            var5 = var3;
         }

         var7 = var5;
         var10001 = -var3;
         if(var4 == null) {
            return var7 + var10001;
         }

         float var9;
         var6 = (var9 = var5 - var10001) == 0.0F?0:(var9 < 0.0F?-1:1);
      }

      if(var6 < 0) {
         var5 = -var3;
      }

      var7 = var1;
      var10001 = var5;
      return var7 + var10001;
   }

   // $FF: renamed from: by () boolean
   public boolean method_4274() {
      boolean var10000;
      label32: {
         String[] var1 = class_752.method_4253();
         var10000 = this.field_2990.method_2117(this.field_3004);
         if(var1 != null) {
            if(!var10000) {
               break label32;
            }

            var10000 = this.field_2990.method_2096(this, this.field_3004).isEmpty();
         }

         if(var1 != null) {
            if(!var10000) {
               break label32;
            }

            var10000 = this.field_2990.method_2120(this.field_3004);
         }

         if(var1 == null) {
            return var10000;
         }

         if(!var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: bz () float
   public float method_4275() {
      return 1.0F;
   }

   // $FF: renamed from: bB () int
   public int method_4276() {
      return 4;
   }

   // $FF: renamed from: ax () int
   public int method_3967() {
      String[] var1 = class_752.method_4253();
      class_753 var10000 = this;
      if(var1 != null) {
         if(this.method_4259() == null) {
            return 3;
         }

         var10000 = this;
      }

      int var2 = (int)(var10000.method_406() - this.method_405() * 0.33F);
      var2 -= (3 - this.field_2990.field_1818.method_5392()) * 4;
      int var3 = var2;
      if(var1 != null) {
         if(var2 < 0) {
            var2 = 0;
         }

         var3 = var2 + 3;
      }

      return var3;
   }

   // $FF: renamed from: be () add
   public add method_4214() {
      return this.field_3377[0];
   }

   // $FF: renamed from: q (int) add
   public add method_4215(int var1) {
      return this.field_3377[var1];
   }

   // $FF: renamed from: r (int) add
   public add method_4277(int var1) {
      return this.field_3377[var1 + 1];
   }

   // $FF: renamed from: c (int, add) void
   public void method_3935(int var1, add var2) {
      this.field_3377[var1] = var2;
   }

   // $FF: renamed from: ak () add[]
   public add[] method_3934() {
      return this.field_3377;
   }

   // $FF: renamed from: a (boolean, int) void
   protected void method_4191(boolean var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = 0;
      String[] var3 = var10000;

      while(var4 < this.method_3934().length) {
         add var5 = this.method_4215(var4);
         float var10;
         int var9 = (var10 = this.field_3378[var4] - 1.0F) == 0.0F?0:(var10 < 0.0F?-1:1);
         if(var3 != null) {
            var9 = var9 > 0?1:0;
         }

         int var6 = var9;
         if(var3 != null) {
            if(var5 != null) {
               label93: {
                  var9 = var1;
                  if(var3 != null) {
                     label80: {
                        if(var1 == 0) {
                           var9 = var6;
                           if(var3 == null) {
                              break label80;
                           }

                           if(var6 == 0) {
                              break label93;
                           }
                        }

                        float var11;
                        var9 = (var11 = this.field_3028.nextFloat() - (float)var2 * 0.01F - this.field_3378[var4]) == 0.0F?0:(var11 < 0.0F?-1:1);
                     }
                  }

                  if(var3 != null) {
                     if(var9 >= 0) {
                        break label93;
                     }

                     var9 = var6;
                  }

                  label94: {
                     if(var3 != null) {
                        if(var9 != 0) {
                           break label94;
                        }

                        var9 = var5.method_3741();
                     }

                     if(var3 != null) {
                        if(var9 == 0) {
                           break label94;
                        }

                        var9 = Math.max(var5.method_3747() - 25, 1);
                     }

                     int var8;
                     label56: {
                        label95: {
                           int var7 = var9;
                           var8 = var5.method_3747() - this.field_3028.nextInt(this.field_3028.nextInt(var7) + 1);
                           var9 = var8;
                           int var10001 = var7;
                           if(var3 != null) {
                              if(var8 > var7) {
                                 var8 = var7;
                              }

                              var9 = var8;
                              if(var3 == null) {
                                 break label95;
                              }

                              var10001 = 1;
                           }

                           if(var9 >= var10001) {
                              break label56;
                           }

                           var9 = 1;
                        }

                        var8 = var9;
                     }

                     var5.method_3746(var8);
                  }

                  this.method_3916(var5, 0.0F);
               }
            }

            ++var4;
         }

         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: bC () void
   protected void method_4278() {
      String[] var1 = class_752.method_4253();
      float var7;
      int var10000 = (var7 = this.field_3028.nextFloat() - 0.15F * this.field_2990.method_2222(this.field_2994, this.field_2995, this.field_2996)) == 0.0F?0:(var7 < 0.0F?-1:1);
      if(var1 != null) {
         if(var10000 >= 0) {
            return;
         }

         var10000 = this.field_3028.nextInt(2);
      }

      int var2 = var10000;
      float var3 = this.field_2990.field_1818 == class_918.field_4630?0.1F:0.25F;
      float var8;
      var10000 = (var8 = this.field_3028.nextFloat() - 0.095F) == 0.0F?0:(var8 < 0.0F?-1:1);
      if(var1 != null) {
         if(var10000 < 0) {
            ++var2;
         }

         float var9;
         var10000 = (var9 = this.field_3028.nextFloat() - 0.095F) == 0.0F?0:(var9 < 0.0F?-1:1);
      }

      if(var1 != null) {
         if(var10000 < 0) {
            ++var2;
         }

         float var10;
         var10000 = (var10 = this.field_3028.nextFloat() - 0.095F) == 0.0F?0:(var10 < 0.0F?-1:1);
      }

      if(var1 != null) {
         if(var10000 < 0) {
            ++var2;
         }

         var10000 = 3;
      }

      int var4 = var10000;

      while(var4 >= 0) {
         add var5;
         label66: {
            var5 = this.method_4277(var4);
            var10000 = var4;
            if(var1 != null) {
               if(var4 >= 3) {
                  break label66;
               }

               float var11;
               var10000 = (var11 = this.field_3028.nextFloat() - var3) == 0.0F?0:(var11 < 0.0F?-1:1);
            }

            if(var10000 < 0 && var1 != null) {
               break;
            }
         }

         label60: {
            if(var5 == null) {
               adb var6 = method_4280(var4 + 1, var2);
               if(var1 == null) {
                  break label60;
               }

               if(var6 != null) {
                  int var10001 = var4 + 1;
                  add var10002 = new add;
                  var10002.method_3724(var6);
                  this.method_3935(var10001, var10002);
               }
            }

            --var4;
         }

         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (add) int
   public static int method_4279(add var0) {
      adb var10000;
      String[] var1;
      label44: {
         var1 = class_752.method_4253();
         var10000 = var0.method_3730();
         adb var10001 = adb.method_2920(class_1192.field_6112);
         if(var1 != null) {
            if(var10000 == var10001) {
               return 4;
            }

            var10000 = var0.method_3730();
            if(var1 == null) {
               break label44;
            }

            var10001 = class_1010.field_5253;
         }

         if(var10000 == var10001) {
            return 4;
         }

         var10000 = var0.method_3730();
      }

      int var2 = var10000 instanceof class_525;
      if(var1 != null) {
         if(var2 != 0) {
            var2 = ((class_525)var0.method_3730()).field_2365;
            if(var1 == null) {
               return var2;
            }

            switch(var2) {
            case 0:
               return 4;
            case 1:
               return 3;
            case 2:
               return 2;
            case 3:
               return 1;
            }
         }

         var2 = 0;
      }

      return var2;
   }

   // $FF: renamed from: a (int, int) adb
   public static adb method_4280(int var0, int var1) {
      int var10000;
      byte var10001;
      String[] var2;
      label366: {
         label400: {
            label364: {
               label401: {
                  label362: {
                     label402: {
                        var2 = class_752.method_4253();
                        var10000 = var0;
                        if(var2 != null) {
                           switch(var0) {
                           case 1:
                              break label400;
                           case 2:
                              break label401;
                           case 3:
                              break label402;
                           case 4:
                              var10000 = var1;
                              break;
                           default:
                              return null;
                           }
                        }

                        if(var2 != null) {
                           if(var10000 == 0) {
                              return class_1010.field_5156;
                           }

                           var10000 = var1;
                        }

                        var10001 = 1;
                        if(var2 != null) {
                           if(var10000 == 1) {
                              return class_1010.field_5172;
                           }

                           var10000 = var1;
                           var10001 = 2;
                        }

                        if(var2 != null) {
                           if(var10000 == var10001) {
                              return class_1010.field_5160;
                           }

                           var10000 = var1;
                           var10001 = 3;
                        }

                        if(var2 != null) {
                           if(var10000 == var10001) {
                              return class_1010.field_5164;
                           }

                           var10000 = var1;
                           var10001 = 4;
                        }

                        if(var2 != null) {
                           if(var10000 == var10001) {
                              return class_1010.field_5168;
                           }

                           var10000 = var1;
                           var10001 = 5;
                        }

                        if(var2 != null) {
                           if(var10000 == var10001) {
                              return class_1010.field_5290;
                           }

                           var10000 = var1;
                           var10001 = 6;
                        }

                        if(var2 != null) {
                           if(var10000 == var10001) {
                              return class_1010.field_5294;
                           }

                           var10000 = var1;
                           var10001 = 7;
                        }

                        if(var2 != null) {
                           if(var10000 == var10001) {
                              return class_1010.field_5298;
                           }

                           var10000 = var1;
                           var10001 = 8;
                        }

                        if(var2 != null) {
                           if(var10000 == var10001) {
                              return class_1010.field_5306;
                           }

                           var10000 = var1;
                           if(var2 == null) {
                              break label362;
                           }

                           var10001 = 9;
                        }

                        if(var10000 == var10001) {
                           return class_1010.field_5345;
                        }
                     }

                     var10000 = var1;
                  }

                  if(var2 != null) {
                     if(var10000 == 0) {
                        return class_1010.field_5157;
                     }

                     var10000 = var1;
                  }

                  var10001 = 1;
                  if(var2 != null) {
                     if(var10000 == 1) {
                        return class_1010.field_5173;
                     }

                     var10000 = var1;
                     var10001 = 2;
                  }

                  if(var2 != null) {
                     if(var10000 == var10001) {
                        return class_1010.field_5161;
                     }

                     var10000 = var1;
                     var10001 = 3;
                  }

                  if(var2 != null) {
                     if(var10000 == var10001) {
                        return class_1010.field_5165;
                     }

                     var10000 = var1;
                     var10001 = 4;
                  }

                  if(var2 != null) {
                     if(var10000 == var10001) {
                        return class_1010.field_5169;
                     }

                     var10000 = var1;
                     var10001 = 5;
                  }

                  if(var2 != null) {
                     if(var10000 == var10001) {
                        return class_1010.field_5291;
                     }

                     var10000 = var1;
                     var10001 = 6;
                  }

                  if(var2 != null) {
                     if(var10000 == var10001) {
                        return class_1010.field_5295;
                     }

                     var10000 = var1;
                     var10001 = 7;
                  }

                  if(var2 != null) {
                     if(var10000 == var10001) {
                        return class_1010.field_5299;
                     }

                     var10000 = var1;
                     var10001 = 8;
                  }

                  if(var2 != null) {
                     if(var10000 == var10001) {
                        return class_1010.field_5307;
                     }

                     var10000 = var1;
                     if(var2 == null) {
                        break label364;
                     }

                     var10001 = 9;
                  }

                  if(var10000 == var10001) {
                     return class_1010.field_5346;
                  }
               }

               var10000 = var1;
            }

            if(var2 != null) {
               if(var10000 == 0) {
                  return class_1010.field_5158;
               }

               var10000 = var1;
            }

            var10001 = 1;
            if(var2 != null) {
               if(var10000 == 1) {
                  return class_1010.field_5174;
               }

               var10000 = var1;
               var10001 = 2;
            }

            if(var2 != null) {
               if(var10000 == var10001) {
                  return class_1010.field_5162;
               }

               var10000 = var1;
               var10001 = 3;
            }

            if(var2 != null) {
               if(var10000 == var10001) {
                  return class_1010.field_5166;
               }

               var10000 = var1;
               var10001 = 4;
            }

            if(var2 != null) {
               if(var10000 == var10001) {
                  return class_1010.field_5170;
               }

               var10000 = var1;
               var10001 = 5;
            }

            if(var2 != null) {
               if(var10000 == var10001) {
                  return class_1010.field_5292;
               }

               var10000 = var1;
               var10001 = 6;
            }

            if(var2 != null) {
               if(var10000 == var10001) {
                  return class_1010.field_5296;
               }

               var10000 = var1;
               var10001 = 7;
            }

            if(var2 != null) {
               if(var10000 == var10001) {
                  return class_1010.field_5300;
               }

               var10000 = var1;
               var10001 = 8;
            }

            if(var2 != null) {
               if(var10000 == var10001) {
                  return class_1010.field_5308;
               }

               var10000 = var1;
               if(var2 == null) {
                  break label366;
               }

               var10001 = 9;
            }

            if(var10000 == var10001) {
               return class_1010.field_5347;
            }
         }

         var10000 = var1;
      }

      if(var2 != null) {
         if(var10000 == 0) {
            return class_1010.field_5159;
         }

         var10000 = var1;
      }

      var10001 = 1;
      if(var2 != null) {
         if(var10000 == 1) {
            return class_1010.field_5175;
         }

         var10000 = var1;
         var10001 = 2;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            return class_1010.field_5163;
         }

         var10000 = var1;
         var10001 = 3;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            return class_1010.field_5167;
         }

         var10000 = var1;
         var10001 = 4;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            return class_1010.field_5171;
         }

         var10000 = var1;
         var10001 = 5;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            return class_1010.field_5293;
         }

         var10000 = var1;
         var10001 = 6;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            return class_1010.field_5297;
         }

         var10000 = var1;
         var10001 = 7;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            return class_1010.field_5301;
         }

         var10000 = var1;
         var10001 = 8;
      }

      if(var2 != null) {
         if(var10000 == var10001) {
            return class_1010.field_5309;
         }

         var10000 = var1;
         var10001 = 9;
      }

      if(var10000 == var10001) {
         return class_1010.field_5348;
      } else {
         return null;
      }
   }

   // $FF: renamed from: bD () void
   protected void method_4281() {
      String[] var1;
      float var2;
      int var6;
      label47: {
         label50: {
            String[] var10000 = class_752.method_4253();
            var2 = this.field_2990.method_2222(this.field_2994, this.field_2995, this.field_2996);
            var1 = var10000;
            class_753 var5 = this;
            if(var1 != null) {
               if(this.method_4214() == null) {
                  break label50;
               }

               var5 = this;
            }

            float var8;
            var6 = (var8 = var5.field_3028.nextFloat() - 0.25F * var2) == 0.0F?0:(var8 < 0.0F?-1:1);
            if(var1 == null) {
               break label47;
            }

            if(var6 < 0) {
               class_980.method_5663(this.field_3028, this.method_4214(), (int)(5.0F + var2 * (float)this.field_3028.nextInt(18)));
            }
         }

         var6 = 0;
      }

      int var3 = var6;

      while(var3 < 4) {
         add var4 = this.method_4277(var3);
         if(var1 != null) {
            if(var4 != null) {
               label30: {
                  Random var7 = this.field_3028;
                  if(var1 != null) {
                     if(this.field_3028.nextFloat() >= 0.5F * var2) {
                        break label30;
                     }

                     var7 = this.field_3028;
                  }

                  class_980.method_5663(var7, var4, (int)(5.0F + var2 * (float)this.field_3028.nextInt(18)));
               }
            }

            ++var3;
         }

         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (xY) xY
   public class_83 method_4282(class_83 var1) {
      class_80 var10000 = this.method_4211(class_1840.field_9391);
      class_1716 var10001 = new class_1716;
      String[] var10003 = field_3387;
      var10001.method_9592("Random spawn bonus", this.field_3028.nextGaussian() * 0.05D, 1);
      var10000.method_393(var10001);
      return var1;
   }

   // $FF: renamed from: bE () boolean
   public boolean method_4283() {
      return false;
   }

   // $FF: renamed from: b_ () java.lang.String
   public String method_4284() {
      String[] var1 = class_752.method_4253();
      class_753 var10000 = this;
      String var2;
      if(var1 != null) {
         if(this.method_4288()) {
            var2 = this.method_4287();
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.method_64();
      return var2;
   }

   // $FF: renamed from: bF () void
   public void method_4285() {
      this.field_3380 = true;
   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_4286(String var1) {
      this.field_3036.method_9506(10, var1);
   }

   // $FF: renamed from: bG () java.lang.String
   public String method_4287() {
      return this.field_3036.method_9503(10);
   }

   // $FF: renamed from: bH () boolean
   public boolean method_4288() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3036.method_9503(10).length();
      if(var1 != null) {
         var10000 = var10000 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: g (boolean) void
   public void method_4289(boolean var1) {
      String[] var2 = class_752.method_4253();
      int var10002 = var1;
      if(var2 != null) {
         var10002 = var1 != 0?1:0;
      }

      this.field_3036.method_9506(11, Byte.valueOf((byte)var10002));
   }

   // $FF: renamed from: bI () boolean
   public boolean method_4290() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_3036.method_9499(11);
      if(var1 != null) {
         var10000 = var10000 == 1?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: bi () boolean
   public boolean method_4221() {
      return this.method_4290();
   }

   // $FF: renamed from: a (int, float) void
   public void method_4291(int var1, float var2) {
      this.field_3378[var1] = var2;
   }

   // $FF: renamed from: bJ () boolean
   public boolean method_4292() {
      return this.field_3379;
   }

   // $FF: renamed from: h (boolean) void
   public void method_4293(boolean var1) {
      this.field_3379 = var1;
   }

   // $FF: renamed from: bK () boolean
   public boolean method_4294() {
      return this.field_3380;
   }

   // $FF: renamed from: c (yz) boolean
   public final boolean method_3919(class_792 var1) {
      String[] var2;
      class_753 var4;
      label97: {
         label83: {
            var2 = class_752.method_4253();
            Object var10000 = this;
            if(var2 != null) {
               if(!this.method_4299()) {
                  break label83;
               }

               var4 = this;
               if(var2 == null) {
                  break label97;
               }

               var10000 = this.method_4300();
            }

            if(var10000 == var1) {
               var4 = this;
               break label97;
            }
         }

         class_792 var10001;
         boolean var6;
         label89: {
            label90: {
               label70: {
                  add var3 = var1.field_3616.method_3593();
                  add var5 = var3;
                  if(var2 != null) {
                     if(var3 == null) {
                        break label70;
                     }

                     var5 = var3;
                  }

                  if(var5.method_3730() == class_1010.field_5268) {
                     var6 = this.method_4298();
                     if(var2 == null) {
                        break label90;
                     }

                     if(var6) {
                        label51: {
                           var6 = this instanceof class_776;
                           if(var2 != null) {
                              if(var6) {
                                 var6 = ((class_776)this).method_4476();
                                 if(var2 == null) {
                                    break label51;
                                 }

                                 if(var6) {
                                    var6 = ((class_776)this).method_4482(var1);
                                    break label51;
                                 }
                              }

                              this.method_4301(var1, true);
                              --var3.field_2958;
                              var6 = true;
                           }

                           return var6;
                        }

                        if(var2 == null) {
                           break label90;
                        }

                        if(var6) {
                           this.method_4301(var1, true);
                           --var3.field_2958;
                           return true;
                        }
                     }
                  }
               }

               var4 = this;
               var10001 = var1;
               if(var2 == null) {
                  break label89;
               }

               var6 = this.method_4295(var1);
            }

            if(var6) {
               var6 = true;
               return var6;
            }

            var4 = this;
            var10001 = var1;
         }

         var6 = var4.method_3919(var10001);
         return var6;
      }

      boolean var10002 = var1.field_3640.field_2839;
      if(var2 != null) {
         var10002 = !var1.field_3640.field_2839;
      }

      var4.method_4297(true, var10002);
      return true;
   }

   // $FF: renamed from: a (yz) boolean
   protected boolean method_4295(class_792 var1) {
      return false;
   }

   // $FF: renamed from: bL () void
   protected void method_4296() {
      String[] var1 = class_752.method_4253();
      Object var10000 = this;
      if(var1 != null) {
         if(this.field_3386 != null) {
            this.method_4302();
         }

         var10000 = this;
      }

      class_753 var2;
      label39: {
         if(var1 != null) {
            if(!((class_753)var10000).field_3384) {
               return;
            }

            var2 = this;
            if(var1 == null) {
               break label39;
            }

            var10000 = this.field_3385;
         }

         if(var10000 != null) {
            var2 = this;
            if(var1 == null) {
               break label39;
            }

            if(!this.field_3385.field_3012) {
               return;
            }
         }

         var2 = this;
      }

      var2.method_4297(true, true);
   }

   // $FF: renamed from: a (boolean, boolean) void
   public void method_4297(boolean var1, boolean var2) {
      String[] var3 = class_752.method_4253();
      boolean var10000 = this.field_3384;
      if(var3 != null) {
         if(!this.field_3384) {
            return;
         }

         this.field_3384 = false;
         this.field_3385 = null;
         var10000 = this.field_2990.field_1832;
      }

      if(var3 != null) {
         label45: {
            if(!var10000) {
               var10000 = var2;
               if(var3 == null) {
                  break label45;
               }

               if(var2) {
                  this.method_3914(class_1010.field_5268, 1);
               }
            }

            var10000 = this.field_2990.field_1832;
         }
      }

      if(var3 != null) {
         if(var10000) {
            return;
         }

         var10000 = var1;
      }

      ahb var4;
      label55: {
         if(var3 != null) {
            if(!var10000) {
               return;
            }

            var4 = this.field_2990;
            if(var3 == null) {
               break label55;
            }

            var10000 = this.field_2990 instanceof class_354;
         }

         if(!var10000) {
            return;
         }

         var4 = this.field_2990;
      }

      class_1657 var5 = ((class_354)var4).method_2256();
      class_311 var10002 = new class_311;
      var10002.method_1775(1, this, (class_689)null);
      var5.method_9119(this, var10002);
   }

   // $FF: renamed from: bM () boolean
   public boolean method_4298() {
      boolean var10000;
      label24: {
         String[] var1 = class_752.method_4253();
         var10000 = this.method_4299();
         if(var1 != null) {
            if(var10000) {
               break label24;
            }

            var10000 = this instanceof class_10;
         }

         if(var1 == null) {
            return var10000;
         }

         if(!var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: bN () boolean
   public boolean method_4299() {
      return this.field_3384;
   }

   // $FF: renamed from: bO () sa
   public class_689 method_4300() {
      return this.field_3385;
   }

   // $FF: renamed from: b (sa, boolean) void
   public void method_4301(class_689 var1, boolean var2) {
      this.field_3384 = true;
      String[] var10000 = class_752.method_4253();
      this.field_3385 = var1;
      String[] var3 = var10000;
      boolean var4 = this.field_2990.field_1832;
      if(var3 != null) {
         if(this.field_2990.field_1832) {
            return;
         }

         var4 = var2;
      }

      ahb var5;
      label33: {
         if(var3 != null) {
            if(!var4) {
               return;
            }

            var5 = this.field_2990;
            if(var3 == null) {
               break label33;
            }

            var4 = this.field_2990 instanceof class_354;
         }

         if(!var4) {
            return;
         }

         var5 = this.field_2990;
      }

      class_1657 var6 = ((class_354)var5).method_2256();
      class_311 var10002 = new class_311;
      var10002.method_1775(1, this, this.field_3385);
      var6.method_9119(this, var10002);
   }

   // $FF: renamed from: bP () void
   private void method_4302() {
      String[] var1 = class_752.method_4253();
      class_753 var10000 = this;
      if(var1 != null) {
         label88: {
            if(this.field_3384) {
               var10000 = this;
               if(var1 == null) {
                  break label88;
               }

               if(this.field_3386 != null) {
                  label82: {
                     label92: {
                        String[] var6 = field_3387;
                        boolean var11 = this.field_3386.initGui8("UUIDMost", 4);
                        if(var1 != null) {
                           label93: {
                              if(var11) {
                                 var11 = this.field_3386.initGui8("UUIDLeast", 4);
                                 if(var1 == null) {
                                    break label93;
                                 }

                                 if(var11) {
                                    UUID var2 = new UUID(this.field_3386.method_8682("UUIDMost"), this.field_3386.method_8682("UUIDLeast"));
                                    List var3 = this.field_2990.method_2157(class_752.class, this.field_3004.method_7097(10.0D, 10.0D, 10.0D));
                                    Iterator var4 = var3.iterator();

                                    while(var4.hasNext()) {
                                       class_752 var5 = (class_752)var4.next();
                                       if(var1 == null) {
                                          return;
                                       }

                                       label52: {
                                          if(var1 != null) {
                                             if(!var5.method_3972().equals(var2)) {
                                                break label52;
                                             }

                                             this.field_3385 = var5;
                                          }

                                          if(var1 != null) {
                                             break;
                                          }
                                       }

                                       if(var1 == null) {
                                          break;
                                       }
                                    }

                                    if(var1 != null) {
                                       break label82;
                                    }
                                 }
                              }

                              var10000 = this;
                              if(var1 == null) {
                                 break label92;
                              }

                              var11 = this.field_3386.initGui8("X", 99);
                           }
                        }

                        if(var11) {
                           var10000 = this;
                           if(var1 == null) {
                              break label92;
                           }

                           if(this.field_3386.initGui8("Y", 99)) {
                              var10000 = this;
                              if(var1 == null) {
                                 break label92;
                              }

                              if(this.field_3386.initGui8("Z", 99)) {
                                 int var7 = this.field_3386.method_8681("X");
                                 int var8 = this.field_3386.method_8681("Y");
                                 int var9 = this.field_3386.method_8681("Z");
                                 class_750 var10 = class_750.method_4150(this.field_2990, var7, var8, var9);
                                 if(var1 != null) {
                                    if(var10 == null) {
                                       var10 = class_750.method_4149(this.field_2990, var7, var8, var9);
                                    }

                                    this.field_3385 = var10;
                                 }

                                 if(var1 != null) {
                                    break label82;
                                 }
                              }
                           }
                        }

                        var10000 = this;
                     }

                     var10000.method_4297(false, true);
                  }
               }
            }

            var10000 = this;
         }
      }

      var10000.field_3386 = null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_28() {
      // $FF: Couldn't be decompiled
   }
}
