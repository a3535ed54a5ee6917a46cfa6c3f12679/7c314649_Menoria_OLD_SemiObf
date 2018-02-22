import java.util.Random;

// $FF: renamed from: eS
public abstract class class_431 extends class_428 {

   // $FF: renamed from: M boolean
   protected final boolean field_2157;


   // $FF: renamed from: <init> (boolean) void
   protected void method_2715(boolean var1) {
      super.method_2427(awt.field_4186);
      this.field_2157 = var1;
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = ahb.method_2135(var1, var2, var3 - 1, var4);
      if(var5 != null) {
         if(!var10000) {
            return false;
         }

         var10000 = super.method_2480(var1, var2, var3, var4);
      }

      return var10000;
   }

   // $FF: renamed from: j (ahb, int, int, int) boolean
   public boolean method_2505(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = ahb.method_2135(var1, var2, var3 - 1, var4);
      if(var5 != null) {
         if(!var10000) {
            return false;
         }

         var10000 = super.method_2505(var1, var2, var3, var4);
      }

      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      int var7 = var1.method_33(var2, var3, var4);
      String[] var6 = class_752.method_4253();
      boolean var10000 = this.method_2718(var1, var2, var3, var4, var7);
      if(var6 != null) {
         if(var10000) {
            return;
         }

         var10000 = this.method_2719(var1, var2, var3, var4, var7);
      }

      boolean var8 = var10000;
      var10000 = this.field_2157;
      if(var6 != null) {
         label39: {
            if(this.field_2157) {
               var10000 = var8;
               if(var6 == null) {
                  break label39;
               }

               if(!var8) {
                  var1.method_2054(var2, var3, var4, this.method_2732(), var7, 2);
                  if(var6 != null) {
                     return;
                  }
               }
            }

            var10000 = this.field_2157;
         }
      }

      ahb var9;
      int var10001;
      int var10002;
      int var10003;
      class_431 var10004;
      int var10005;
      byte var10006;
      label49: {
         if(var6 != null) {
            if(var10000) {
               return;
            }

            var9 = var1;
            var10001 = var2;
            var10002 = var3;
            var10003 = var4;
            var10004 = this.method_2731();
            var10005 = var7;
            var10006 = 2;
            if(var6 == null) {
               break label49;
            }

            var1.method_2054(var2, var3, var4, var10004, var7, 2);
            var10000 = var8;
         }

         if(var10000) {
            return;
         }

         var9 = var1;
         var10001 = var2;
         var10002 = var3;
         var10003 = var4;
         var10004 = this.method_2731();
         var10005 = this.method_2729(var7);
         var10006 = -1;
      }

      var9.method_2111(var10001, var10002, var10003, var10004, var10005, var10006);
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 == 0) {
            Object var4 = this;
            if(var3 != null) {
               if(this.field_2157) {
                  return class_1192.field_6102.getBlockTextureFromSide(var1);
               }

               var4 = class_1192.field_6101;
            }

            return ((aji)var4).getBlockTextureFromSide(var1);
         }

         var10000 = var1;
      }

      return var10000 == 1?this.field_2010:class_1192.field_6070.getBlockTextureFromSide(1);
   }

   // $FF: renamed from: a (ahl, int, int, int, int) boolean
   public boolean method_2445(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5;
      if(var6 != null) {
         if(var5 != 0) {
            label16: {
               var10000 = var5;
               if(var6 != null) {
                  if(var5 == 1) {
                     break label16;
                  }

                  var10000 = 1;
               }

               return (boolean)var10000;
            }
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 36;
   }

   // $FF: renamed from: d (int) boolean
   protected boolean method_2716(int var1) {
      return this.field_2157;
   }

   // $FF: renamed from: c (ahl, int, int, int, int) int
   public int method_2499(ahl var1, int var2, int var3, int var4, int var5) {
      return this.method_2496(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: b (ahl, int, int, int, int) int
   public int method_2496(ahl var1, int var2, int var3, int var4, int var5) {
      int var7 = var1.method_33(var2, var3, var4);
      String[] var6 = class_752.method_4253();
      int var10000 = this.method_2716(var7);
      if(var6 != null) {
         if(var10000 == 0) {
            return 0;
         }

         var10000 = method_2711(var7);
      }

      byte var10001;
      int var8;
      label70: {
         var8 = var10000;
         var10000 = var8;
         if(var6 != null) {
            if(var8 == 0) {
               var10000 = var5;
               var10001 = 3;
               if(var6 == null) {
                  break label70;
               }

               if(var5 == 3) {
                  return this.method_2725(var1, var2, var3, var4, var7);
               }
            }

            var10000 = var8;
         }

         var10001 = 1;
      }

      if(var6 != null) {
         label61: {
            if(var10000 == var10001) {
               var10000 = var5;
               var10001 = 4;
               if(var6 == null) {
                  break label61;
               }

               if(var5 == 4) {
                  return this.method_2725(var1, var2, var3, var4, var7);
               }
            }

            var10000 = var8;
            var10001 = 2;
         }
      }

      if(var6 != null) {
         label75: {
            if(var10000 == var10001) {
               var10000 = var5;
               var10001 = 2;
               if(var6 == null) {
                  break label75;
               }

               if(var5 == 2) {
                  return this.method_2725(var1, var2, var3, var4, var7);
               }
            }

            var10000 = var8;
            if(var6 == null) {
               return var10000;
            }

            var10001 = 3;
         }
      }

      if(var10000 == var10001) {
         var10000 = var5;
         if(var6 == null) {
            return var10000;
         }

         if(var5 == 5) {
            return this.method_2725(var1, var2, var3, var4, var7);
         }
      }

      var10000 = 0;
      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      class_431 var10000 = this;
      ahb var10001 = var1;
      int var10002 = var2;
      int var10003 = var3;
      int var10004 = var4;
      if(var6 != null) {
         if(!this.method_2505(var1, var2, var3, var4)) {
            this.method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
            var1.method_2056(var2, var3, var4);
            var1.method_2063(var2 + 1, var3, var4, this);
            var1.method_2063(var2 - 1, var3, var4, this);
            var1.method_2063(var2, var3, var4 + 1, this);
            var1.method_2063(var2, var3, var4 - 1, this);
            var1.method_2063(var2, var3 - 1, var4, this);
            var1.method_2063(var2, var3 + 1, var4, this);
            return;
         }

         var10000 = this;
         var10001 = var1;
         var10002 = var2;
         var10003 = var3;
         var10004 = var4;
      }

      var10000.method_2717(var10001, var10002, var10003, var10004, var5);
   }

   // $FF: renamed from: c (ahb, int, int, int, aji) void
   protected void method_2717(ahb var1, int var2, int var3, int var4, aji var5) {
      int var7 = var1.method_33(var2, var3, var4);
      String[] var6 = class_752.method_4253();
      byte var10000 = this.method_2718(var1, var2, var3, var4, var7);
      if(var6 != null) {
         if(var10000 != 0) {
            return;
         }

         var10000 = this.method_2719(var1, var2, var3, var4, var7);
      }

      byte var10;
      label65: {
         label74: {
            byte var8 = var10000;
            var10 = this.field_2157;
            if(var6 != null) {
               if(this.field_2157) {
                  var10 = var8;
                  if(var6 == null) {
                     break label65;
                  }

                  if(var8 == 0) {
                     break label74;
                  }
               }

               var10 = this.field_2157;
            }

            if(var6 != null) {
               if(var10 != 0) {
                  return;
               }

               var10 = var8;
            }

            if(var6 == null) {
               break label65;
            }

            if(var10 == 0) {
               return;
            }
         }

         var10 = var1.method_2066(var2, var3, var4, this);
      }

      if(var6 != null) {
         if(var10 != 0) {
            return;
         }

         var10 = -1;
      }

      byte var9;
      label75: {
         var9 = var10;
         var10 = this.method_2728(var1, var2, var3, var4, var7);
         if(var6 != null) {
            if(var10 != 0) {
               var9 = -3;
               if(var6 != null) {
                  break label75;
               }
            }

            var10 = this.field_2157;
         }

         if(var6 != null) {
            if(var10 == 0) {
               break label75;
            }

            var10 = -2;
         }

         var9 = var10;
      }

      var1.method_2111(var2, var3, var4, this, this.method_2730(var7), var9);
   }

   // $FF: renamed from: f (ahl, int, int, int, int) boolean
   public boolean method_2718(ahl var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   // $FF: renamed from: h (ahb, int, int, int, int) boolean
   protected boolean method_2719(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = this.method_2720(var1, var2, var3, var4, var5);
      if(var6 != null) {
         var10000 = var10000 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: i (ahb, int, int, int, int) int
   protected int method_2720(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = method_2711(var5);
      int var8 = var2 + class_1649.field_8587[var7];
      String[] var6 = var10000;
      int var9 = var4 + class_1649.field_8588[var7];
      int var10 = var1.method_2171(var8, var3, var9, class_1649.field_8590[var7]);
      int var11 = var10;
      if(var6 != null) {
         if(var10 >= 15) {
            return var10;
         }

         var11 = var10;
      }

      ahb var10001 = var1;
      int var10002 = var8;
      int var10003 = var3;
      int var10004 = var9;
      int var12;
      if(var6 != null) {
         if(var1.getBlock(var8, var3, var9) != class_1192.field_6082) {
            var12 = 0;
            return Math.max(var11, var12);
         }

         var10001 = var1;
         var10002 = var8;
         var10003 = var3;
         var10004 = var9;
      }

      var12 = var10001.method_33(var10002, var10003, var10004);
      return Math.max(var11, var12);
   }

   // $FF: renamed from: g (ahl, int, int, int, int) int
   protected int method_2721(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = method_2711(var5);
      String[] var6 = var10000;
      int var8 = var7;
      if(var6 != null) {
         switch(var7) {
         case 0:
         case 2:
            return Math.max(this.method_2722(var1, var2 - 1, var3, var4, 4), this.method_2722(var1, var2 + 1, var3, var4, 5));
         case 1:
         case 3:
            return Math.max(this.method_2722(var1, var2, var3, var4 + 1, 3), this.method_2722(var1, var2, var3, var4 - 1, 2));
         default:
            var8 = 0;
         }
      }

      return var8;
   }

   // $FF: renamed from: h (ahl, int, int, int, int) int
   protected int method_2722(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      aji var7 = var1.getBlock(var2, var3, var4);
      String[] var6 = var10000;
      byte var8 = this.method_2724(var7);
      if(var6 != null) {
         if(var8 != 0) {
            if(var7 == class_1192.field_6082) {
               return var1.method_33(var2, var3, var4);
            }

            return var1.method_38(var2, var3, var4, var5);
         }

         var8 = 0;
      }

      return var8;
   }

   // $FF: renamed from: f () boolean
   public boolean method_2497() {
      return true;
   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      int var7 = ((class_1715.method_9561((double)(var5.field_3000 * 4.0F / 360.0F) + 0.5D) & 3) + 2) % 4;
      var1.method_2055(var2, var3, var4, var7, 3);
      boolean var8 = this.method_2719(var1, var2, var3, var4, var7);
      if(var8) {
         var1.method_2110(var2, var3, var4, this, 1);
      }

   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      this.method_2723(var1, var2, var3, var4);
   }

   // $FF: renamed from: h (ahb, int, int, int) void
   protected void method_2723(ahb var1, int var2, int var3, int var4) {
      int var6 = method_2711(var1.method_33(var2, var3, var4));
      String[] var5 = class_752.method_4253();
      int var10000 = var6;
      byte var10001 = 1;
      if(var5 != null) {
         if(var6 == 1) {
            var1.method_2065(var2 + 1, var3, var4, this);
            var1.method_2064(var2 + 1, var3, var4, this, 4);
         }

         var10000 = var6;
         var10001 = 3;
      }

      label36: {
         if(var5 != null) {
            if(var10000 == var10001) {
               var1.method_2065(var2 - 1, var3, var4, this);
               var1.method_2064(var2 - 1, var3, var4, this, 5);
            }

            var10000 = var6;
            if(var5 == null) {
               break label36;
            }

            var10001 = 2;
         }

         if(var10000 == var10001) {
            var1.method_2065(var2, var3, var4 + 1, this);
            var1.method_2064(var2, var3, var4 + 1, this, 2);
         }

         var10000 = var6;
      }

      if(var10000 == 0) {
         var1.method_2065(var2, var3, var4 - 1, this);
         var1.method_2064(var2, var3, var4 - 1, this, 3);
      }

   }

   // $FF: renamed from: b (ahb, int, int, int, int) void
   public void method_2458(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      class_431 var10000 = this;
      if(var6 != null) {
         if(this.field_2157) {
            var1.method_2063(var2 + 1, var3, var4, this);
            var1.method_2063(var2 - 1, var3, var4, this);
            var1.method_2063(var2, var3, var4 + 1, this);
            var1.method_2063(var2, var3, var4 - 1, this);
            var1.method_2063(var2, var3 - 1, var4, this);
            var1.method_2063(var2, var3 + 1, var4, this);
         }

         var10000 = this;
      }

      var10000.method_2458(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: d (aji) boolean
   protected boolean method_2724(aji var1) {
      return var1.method_2497();
   }

   // $FF: renamed from: i (ahl, int, int, int, int) int
   protected int method_2725(ahl var1, int var2, int var3, int var4, int var5) {
      return 15;
   }

   // $FF: renamed from: e (aji) boolean
   public static boolean method_2726(aji var0) {
      String[] var1 = class_752.method_4253();
      boolean var10000 = class_1192.field_6119.method_2727(var0);
      if(var1 != null) {
         if(!var10000) {
            var10000 = class_1192.field_6173.method_2727(var0);
            if(var1 == null) {
               return var10000;
            }

            if(!var10000) {
               var10000 = false;
               return var10000;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: f (aji) boolean
   public boolean method_2727(aji var1) {
      boolean var3;
      label17: {
         String[] var2 = class_752.method_4253();
         aji var10000 = var1;
         class_431 var10001 = this.method_2731();
         if(var2 != null) {
            if(var1 == var10001) {
               break label17;
            }

            var10000 = var1;
            var10001 = this.method_2732();
         }

         if(var10000 != var10001) {
            var3 = false;
            return var3;
         }
      }

      var3 = true;
      return var3;
   }

   // $FF: renamed from: j (ahb, int, int, int, int) boolean
   public boolean method_2728(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = method_2711(var5);
      String[] var6 = var10000;
      boolean var10 = method_2726(var1.getBlock(var2 - class_1649.field_8587[var7], var3, var4 - class_1649.field_8588[var7]));
      if(var6 != null) {
         if(var10) {
            int var8 = var1.method_33(var2 - class_1649.field_8587[var7], var3, var4 - class_1649.field_8588[var7]);
            int var9 = method_2711(var8);
            int var11 = var9;
            if(var6 != null) {
               var11 = var9 != var7?1:0;
            }

            return (boolean)var11;
         }

         var10 = false;
      }

      return var10;
   }

   // $FF: renamed from: l (int) int
   protected int method_2729(int var1) {
      return this.method_2730(var1);
   }

   // $FF: renamed from: m (int) int
   protected abstract int method_2730(int var1);

   // $FF: renamed from: i () eS
   protected abstract class_431 method_2731();

   // $FF: renamed from: P () eS
   protected abstract class_431 method_2732();

   // $FF: renamed from: c (aji) boolean
   public boolean method_2528(aji var1) {
      return this.method_2727(var1);
   }
}
