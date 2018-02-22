import java.util.List;

// $FF: renamed from: gl
public class class_595 extends class_580 implements class_23 {

   // $FF: renamed from: m int[]
   private static final int[] field_2539;
   // $FF: renamed from: n int[]
   private static final int[] field_2540;
   // $FF: renamed from: o add[]
   private add[] field_2541;
   // $FF: renamed from: p int
   private int field_2542;
   // $FF: renamed from: q int
   private int field_2543;
   // $FF: renamed from: r adb
   private adb field_2544;
   // $FF: renamed from: s java.lang.String
   private String field_2545;
   // $FF: renamed from: t java.lang.String[]
   private static final String[] field_2546;


   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super.getBlock88();
      this.field_2541 = new add[4];
   }

   // $FF: renamed from: i () java.lang.String
   public String method_88() {
      String[] var1 = class_752.method_4253();
      class_595 var10000 = this;
      String var2;
      if(var1 != null) {
         if(!this.method_89()) {
            String[] var3 = field_2546;
            var2 = "container.brewing";
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.field_2545;
      return var2;
   }

   // $FF: renamed from: j () boolean
   public boolean method_89() {
      int var2;
      label24: {
         String[] var1 = class_752.method_4253();
         String var10000 = this.field_2545;
         if(var1 != null) {
            if(this.field_2545 == null) {
               break label24;
            }

            var10000 = this.field_2545;
         }

         var2 = var10000.length();
         if(var1 == null) {
            return (boolean)var2;
         }

         if(var2 > 0) {
            var2 = 1;
            return (boolean)var2;
         }
      }

      var2 = 0;
      return (boolean)var2;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_3167(String var1) {
      this.field_2545 = var1;
   }

   // $FF: renamed from: f () int
   public int method_83() {
      return this.field_2541.length;
   }

   // $FF: renamed from: g () void
   public void getBlock94() {
      int var10000;
      String[] var1;
      label60: {
         class_595 var3;
         label59: {
            label63: {
               var1 = class_752.method_4253();
               var10000 = this.field_2542;
               if(var1 != null) {
                  if(this.field_2542 > 0) {
                     label65: {
                        --this.field_2542;
                        var10000 = this.field_2542;
                        if(var1 != null) {
                           if(this.field_2542 == 0) {
                              this.method_3170();
                              this.method_91();
                              if(var1 != null) {
                                 break label63;
                              }
                           }

                           var3 = this;
                           if(var1 == null) {
                              break label65;
                           }

                           var10000 = this.method_3169();
                        }

                        if(var10000 == 0) {
                           this.field_2542 = 0;
                           this.method_91();
                           if(var1 != null) {
                              break label63;
                           }
                        }

                        var3 = this;
                     }

                     if(var1 == null) {
                        break label59;
                     }

                     if(var3.field_2544 == this.field_2541[3].method_3730()) {
                        break label63;
                     }

                     this.field_2542 = 0;
                     this.method_91();
                     if(var1 != null) {
                        break label63;
                     }
                  }

                  var10000 = this.method_3169();
               }

               if(var1 == null) {
                  break label60;
               }

               if(var10000 != 0) {
                  this.field_2542 = 400;
                  this.field_2544 = this.field_2541[3].method_3730();
               }
            }

            var3 = this;
         }

         var10000 = var3.method_3173();
      }

      int var2 = var10000;
      if(var1 != null) {
         if(var2 != this.field_2543) {
            this.field_2543 = var2;
            this.field_2464.method_2055(this.field_2465, this.field_2466, this.field_2467, var2, 2);
         }

         super.getBlock94();
      }

   }

   // $FF: renamed from: b () int
   public int method_3168() {
      return this.field_2542;
   }

   // $FF: renamed from: d () boolean
   private boolean method_3169() {
      String[] var1 = class_752.method_4253();
      add var10000 = this.field_2541[3];
      if(var1 != null) {
         if(var10000 == null) {
            return false;
         }

         var10000 = this.field_2541[3];
      }

      if(var1 != null) {
         if(var10000.field_2958 <= 0) {
            return false;
         }

         var10000 = this.field_2541[3];
      }

      add var2 = var10000;
      byte var11 = var2.method_3730().method_2962(var2);
      if(var1 != null) {
         if(var11 == 0) {
            return false;
         }

         var11 = 0;
      }

      int var3 = var11;
      int var4 = 0;

      while(var4 < 3) {
         label121: {
            var10000 = this.field_2541[var4];
            if(var1 != null) {
               if(var10000 == null) {
                  break label121;
               }

               var10000 = this.field_2541[var4];
            }

            if(var1 != null) {
               if(var10000.method_3730() != class_1010.field_5230) {
                  break label121;
               }

               var10000 = this.field_2541[var4];
            }

            int var5;
            int var6;
            label122: {
               var5 = var10000.method_3745();
               var6 = this.method_3171(var5, var2);
               var11 = class_550.getBlock30(var5);
               if(var1 != null) {
                  if(var11 != 0) {
                     break label122;
                  }

                  var11 = class_550.getBlock30(var6);
               }

               if(var1 != null) {
                  if(var11 == 0) {
                     break label122;
                  }

                  var11 = 1;
               }

               var3 = var11;
               if(var1 != null) {
                  break;
               }
            }

            List var7;
            List var8;
            List var9;
            label80: {
               var7 = class_1010.field_5230.getBlock29(var5);
               var8 = class_1010.field_5230.getBlock29(var6);
               if(var5 > 0) {
                  var9 = var7;
                  if(var1 == null) {
                     break label80;
                  }

                  if(var7 == var8) {
                     break label121;
                  }
               }

               var9 = var7;
            }

            label123: {
               if(var1 != null) {
                  if(var9 == null) {
                     break label123;
                  }

                  var9 = var7;
               }

               if(var1 != null) {
                  if(var9.equals(var8)) {
                     break label121;
                  }

                  var9 = var8;
               }

               if(var9 == null) {
                  break label121;
               }
            }

            int var10 = var5;
            if(var1 != null) {
               if(var5 == var6) {
                  break label121;
               }

               var10 = 1;
            }

            var3 = var10;
            if(var1 != null) {
               break;
            }
         }

         ++var4;
         if(var1 == null) {
            break;
         }
      }

      return (boolean)var3;
   }

   // $FF: renamed from: e () void
   private void method_3170() {
      String[] var1 = class_752.method_4253();
      class_595 var10000 = this;
      if(var1 != null) {
         if(!this.method_3169()) {
            return;
         }

         var10000 = this;
      }

      add var2 = var10000.field_2541[3];
      int var3 = 0;

      add var10;
      while(true) {
         if(var3 < 3) {
            var10 = this.field_2541[var3];
            if(var1 == null) {
               break;
            }

            label115: {
               if(var1 != null) {
                  if(var10 == null) {
                     break label115;
                  }

                  var10 = this.field_2541[var3];
               }

               if(var1 != null) {
                  if(var10.method_3730() != class_1010.field_5230) {
                     break label115;
                  }

                  var10 = this.field_2541[var3];
               }

               int var4;
               int var5;
               label116: {
                  boolean var12;
                  label93: {
                     label117: {
                        List var6;
                        List var7;
                        List var11;
                        label91: {
                           var4 = var10.method_3745();
                           var5 = this.method_3171(var4, var2);
                           var6 = class_1010.field_5230.getBlock29(var4);
                           var7 = class_1010.field_5230.getBlock29(var5);
                           if(var4 > 0) {
                              var11 = var6;
                              if(var1 == null) {
                                 break label91;
                              }

                              if(var6 == var7) {
                                 break label117;
                              }
                           }

                           var11 = var6;
                        }

                        if(var1 != null) {
                           if(var11 == null) {
                              break label116;
                           }

                           var11 = var6;
                        }

                        var12 = var11.equals(var7);
                        if(var1 == null) {
                           break label93;
                        }

                        if(!var12 && var7 != null) {
                           break label116;
                        }
                     }

                     var12 = class_550.getBlock30(var4);
                  }

                  if(var1 != null) {
                     if(var12) {
                        break label115;
                     }

                     var12 = class_550.getBlock30(var5);
                  }

                  if(!var12) {
                     break label115;
                  }

                  this.field_2541[var3].method_3746(var5);
                  if(var1 != null) {
                     break label115;
                  }
               }

               if(var4 != var5) {
                  this.field_2541[var3].method_3746(var5);
               }
            }

            ++var3;
            if(var1 != null) {
               continue;
            }
         }

         var10 = var2;
         break;
      }

      add[] var9;
      byte var10001;
      label118: {
         int var8 = var10.method_3730().method_2952();
         if(var1 != null) {
            if(var8 != 0) {
               var9 = this.field_2541;
               add var10002 = new add;
               var10002.method_3724(var2.method_3730().method_2951());
               var9[3] = var10002;
               if(var1 != null) {
                  return;
               }
            }

            --this.field_2541[3].field_2958;
            var9 = this.field_2541;
            var10001 = 3;
            if(var1 == null) {
               break label118;
            }

            var8 = this.field_2541[3].field_2958;
         }

         if(var8 > 0) {
            return;
         }

         var9 = this.field_2541;
         var10001 = 3;
      }

      var9[var10001] = null;
   }

   // $FF: renamed from: a (int, add) int
   private int method_3171(int var1, add var2) {
      String[] var3 = class_752.method_4253();
      add var10000 = var2;
      if(var3 != null) {
         if(var2 == null) {
            return var1;
         }

         var10000 = var2;
      }

      int var4 = var10000.method_3730().method_2962(var2);
      if(var3 != null) {
         if(var4 != 0) {
            return class_1011.method_5767(var1, var2.method_3730().method_2961(var2));
         }

         var4 = var1;
      }

      return var4;
   }

   // $FF: renamed from: b (ro) void
   public void getBlock92(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.getBlock92(var1);
      String[] var2 = var10000;
      String[] var7 = field_2546;
      class_1580 var3 = var1.method_8689("Items", 10);
      this.field_2541 = new add[this.method_83()];
      int var4 = 0;

      class_595 var9;
      class_1583 var10001;
      String var10002;
      label42: {
         byte var8;
         while(true) {
            if(var4 < var3.method_8658()) {
               class_1583 var5 = var3.method_8653(var4);
               var7 = field_2546;
               byte var6 = var5.initGui9("Slot");
               if(var2 != null) {
                  var8 = var6;
                  if(var2 == null) {
                     break;
                  }

                  if(var6 >= 0 && var6 < this.field_2541.length) {
                     this.field_2541[var6] = add.method_3727(var5);
                  }

                  ++var4;
               }

               if(var2 != null) {
                  continue;
               }
            }

            var9 = this;
            var10001 = var1;
            var7 = field_2546;
            var10002 = "BrewTime";
            if(var2 == null) {
               break label42;
            }

            this.field_2542 = var1.method_8680("BrewTime");
            var8 = var1.initGui8("CustomName", 8);
            break;
         }

         if(var8 == 0) {
            return;
         }

         var9 = this;
         var10001 = var1;
         String[] var10 = field_2546;
         var10002 = "CustomName";
      }

      var9.field_2545 = var10001.method_8685(var10002);
   }

   // $FF: renamed from: c (ro) void
   public void getBlock93(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      super.getBlock93(var1);
      String[] var6 = field_2546;
      var1.method_8666("BrewTime", (short)this.field_2542);
      class_1580 var10001 = new class_1580;
      var10001.method_8628();
      class_1580 var3 = var10001;
      int var4 = 0;
      String[] var2 = var10000;

      class_1583 var8;
      String var9;
      label36: {
         class_595 var7;
         while(true) {
            if(var4 < this.field_2541.length) {
               var7 = this;
               if(var2 == null) {
                  break;
               }

               if(this.field_2541[var4] != null) {
                  var8 = new class_1583;
                  var8.method_8628();
                  class_1583 var5 = var8;
                  var6 = field_2546;
                  var5.method_8665("Slot", (byte)var4);
                  this.field_2541[var4].method_3737(var5);
                  var3.method_8650(var5);
               }

               ++var4;
               if(var2 != null) {
                  continue;
               }
            }

            var8 = var1;
            var6 = field_2546;
            var9 = "Items";
            if(var2 == null) {
               break label36;
            }

            var1.method_8664("Items", var3);
            var7 = this;
            break;
         }

         if(!var7.method_89()) {
            return;
         }

         var8 = var1;
         String[] var10 = field_2546;
         var9 = "CustomName";
      }

      var8.initGui1(var9, this.field_2545);
   }

   // $FF: renamed from: c (int) add
   public add method_84(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         if(var1 < 0) {
            return null;
         }

         var10000 = var1;
      }

      if(var10000 < this.field_2541.length) {
         return this.field_2541[var1];
      } else {
         return null;
      }
   }

   // $FF: renamed from: b (int, int) add
   public add method_85(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 < 0) {
            return null;
         }

         var10000 = var1;
      }

      if(var10000 < this.field_2541.length) {
         add var4 = this.field_2541[var1];
         this.field_2541[var1] = null;
         return var4;
      } else {
         return null;
      }
   }

   // $FF: renamed from: j (int) add
   public add method_86(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         if(var1 < 0) {
            return null;
         }

         var10000 = var1;
      }

      if(var10000 < this.field_2541.length) {
         add var3 = this.field_2541[var1];
         this.field_2541[var1] = null;
         return var3;
      } else {
         return null;
      }
   }

   // $FF: renamed from: b (int, add) void
   public void method_87(int var1, add var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 < 0) {
            return;
         }

         var10000 = var1;
      }

      if(var10000 < this.field_2541.length) {
         this.field_2541[var1] = var2;
      }

   }

   // $FF: renamed from: k () int
   public int method_90() {
      return 64;
   }

   // $FF: renamed from: b (yz) boolean
   public boolean method_92(class_792 var1) {
      String[] var2 = class_752.method_4253();
      if(this.field_2464.method_31(this.field_2465, this.field_2466, this.field_2467) != this) {
         return false;
      } else {
         double var3;
         int var10000 = (var3 = var1.method_3889((double)this.field_2465 + 0.5D, (double)this.field_2466 + 0.5D, (double)this.field_2467 + 0.5D) - 64.0D) == 0.0D?0:(var3 < 0.0D?-1:1);
         if(var2 != null) {
            if(var10000 > 0) {
               return false;
            }

            var10000 = 1;
         }

         return (boolean)var10000;
      }
   }

   // $FF: renamed from: m () void
   public void method_93() {}

   // $FF: renamed from: n () void
   public void method_94() {}

   // $FF: renamed from: d (int, add) boolean
   public boolean method_95(int var1, add var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 != 3) {
            boolean var5;
            label21: {
               adb var4 = var2.method_3730();
               Object var10001 = class_1010.field_5230;
               if(var3 != null) {
                  if(var4 == class_1010.field_5230) {
                     break label21;
                  }

                  var4 = var2.method_3730();
                  var10001 = class_1010.field_5231;
               }

               if(var4 != var10001) {
                  var5 = false;
                  return var5;
               }
            }

            var5 = true;
            return var5;
         }

         var10000 = var2.method_3730().method_2962(var2);
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (int) void
   public void method_3172(int var1) {
      this.field_2542 = var1;
   }

   // $FF: renamed from: r () int
   public int method_3173() {
      int var2 = 0;
      String[] var1 = class_752.method_4253();
      int var3 = 0;

      while(var3 < 3) {
         if(this.field_2541[var3] != null) {
            var2 |= 1 << var3;
         }

         ++var3;
         if(var1 == null) {
            break;
         }
      }

      return var2;
   }

   // $FF: renamed from: a (int) int[]
   public int[] method_96(int var1) {
      return var1 == 1?field_2539:field_2540;
   }

   // $FF: renamed from: b (int, add, int) boolean
   public boolean method_97(int var1, add var2, int var3) {
      return this.method_95(var1, var2);
   }

   // $FF: renamed from: c (int, add, int) boolean
   public boolean method_98(int var1, add var2, int var3) {
      return true;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3108() {
      // $FF: Couldn't be decompiled
   }
}
