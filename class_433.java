import java.util.Random;

// $FF: renamed from: eT
public class class_433 extends class_431 implements class_28 {

   // $FF: renamed from: N java.lang.String
   private static final String field_2161 = "random.click";


   // $FF: renamed from: <init> (boolean) void
   public void method_2715(boolean var1) {
      super.method_2715(var1);
      this.field_1998 = true;
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return class_1010.field_5260;
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return class_1010.field_5260;
   }

   // $FF: renamed from: m (int) int
   protected int method_2730(int var1) {
      return 2;
   }

   // $FF: renamed from: i () eS
   protected class_431 method_2731() {
      return class_1192.field_6174;
   }

   // $FF: renamed from: P () eS
   protected class_431 method_2732() {
      return class_1192.field_6173;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 37;
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.field_2157;
      if(var3 != null) {
         label41: {
            if(!this.field_2157) {
               var10000 = var2 & 8;
               if(var3 == null) {
                  break label41;
               }

               if(var10000 == 0) {
                  var10000 = 0;
                  break label41;
               }
            }

            var10000 = 1;
         }
      }

      int var4 = var10000;
      var10000 = var1;
      if(var3 != null) {
         if(var1 == 0) {
            if(var4 != 0) {
               return class_1192.field_6102.getBlockTextureFromSide(var1);
            }

            return class_1192.field_6101.getBlockTextureFromSide(var1);
         }

         var10000 = var1;
      }

      if(var3 != null) {
         if(var10000 != 1) {
            return class_1192.field_6070.getBlockTextureFromSide(1);
         }

         var10000 = var4;
      }

      return var10000 != 0?class_1192.field_6174.field_2010:this.field_2010;
   }

   // $FF: renamed from: d (int) boolean
   protected boolean method_2716(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_2157;
      if(var2 != null) {
         if(!this.field_2157) {
            var10000 = var1 & 8;
            if(var2 == null) {
               return (boolean)var10000;
            }

            if(var10000 == 0) {
               var10000 = 0;
               return (boolean)var10000;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: i (ahl, int, int, int, int) int
   protected int method_2725(ahl var1, int var2, int var3, int var4, int var5) {
      return this.method_2735(var1, var2, var3, var4).method_3158();
   }

   // $FF: renamed from: a (ahb, int, int, int, int) int
   private int method_2733(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = this.method_2734(var5);
      if(var6 != null) {
         if(var10000 == 0) {
            return this.method_2720(var1, var2, var3, var4, var5);
         }

         var10000 = Math.max(this.method_2720(var1, var2, var3, var4, var5) - this.method_2721(var1, var2, var3, var4, var5), 0);
      }

      return var10000;
   }

   // $FF: renamed from: c (int) boolean
   public boolean method_2734(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1 & 4;
      if(var2 != null) {
         var10000 = var10000 == 4?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: h (ahb, int, int, int, int) boolean
   protected boolean method_2719(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = this.method_2720(var1, var2, var3, var4, var5);
      String[] var6 = var10000;
      int var9 = var7;
      if(var6 != null) {
         if(var7 >= 15) {
            return true;
         }

         var9 = var7;
      }

      if(var6 != null) {
         if(var9 == 0) {
            return false;
         }

         var9 = this.method_2721(var1, var2, var3, var4, var5);
      }

      int var8 = var9;
      var9 = var8;
      if(var6 != null) {
         if(var8 == 0) {
            return true;
         }

         var9 = var7;
      }

      if(var6 != null) {
         var9 = var9 >= var8?1:0;
      }

      return (boolean)var9;
   }

   // $FF: renamed from: i (ahb, int, int, int, int) int
   protected int method_2720(ahb var1, int var2, int var3, int var4, int var5) {
      int var7;
      int var12;
      label35: {
         var7 = super.method_2720(var1, var2, var3, var4, var5);
         String[] var10000 = class_752.method_4253();
         int var8 = method_2711(var5);
         int var9 = var2 + class_1649.field_8587[var8];
         int var10 = var4 + class_1649.field_8588[var8];
         String[] var6 = var10000;
         aji var11 = var1.getBlock(var9, var3, var10);
         var12 = var11.method_2530();
         if(var6 != null) {
            if(var12 != 0) {
               var7 = var11.method_2531(var1, var9, var3, var10, class_1649.field_8592[var8]);
               if(var6 != null) {
                  break label35;
               }
            }

            var12 = var7;
         }

         if(var6 == null) {
            return var12;
         }

         if(var12 < 15) {
            var12 = var11.method_2433();
            if(var6 == null) {
               return var12;
            }

            if(var12 != 0) {
               var9 += class_1649.field_8587[var8];
               var10 += class_1649.field_8588[var8];
               var11 = var1.getBlock(var9, var3, var10);
               var12 = var11.method_2530();
               if(var6 == null) {
                  return var12;
               }

               if(var12 != 0) {
                  var7 = var11.method_2531(var1, var9, var3, var10, class_1649.field_8592[var8]);
               }
            }
         }
      }

      var12 = var7;
      return var12;
   }

   // $FF: renamed from: f (ahl, int, int, int) go
   public class_592 method_2735(ahl var1, int var2, int var3, int var4) {
      return (class_592)var1.method_31(var2, var3, var4);
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      String[] var10000 = class_752.method_4253();
      int var11 = var1.method_33(var2, var3, var4);
      String[] var10 = var10000;
      int var10001 = var11 & 8;
      if(var10 != null) {
         var10001 = var10001 != 0?1:0;
      }

      int var12 = this.field_2157 | var10001;
      int var15 = this.method_2734(var11);
      if(var10 != null) {
         var15 = var15 == 0?1:0;
      }

      int var13 = var15;
      var15 = var13;
      if(var10 != null) {
         var15 = var13 != 0?4:0;
      }

      int var14 = var15;
      var10001 = var12;
      if(var10 != null) {
         var10001 = var12 != 0?8:0;
      }

      var14 |= var10001;
      var1.method_2084((double)var2 + 0.5D, (double)var3 + 0.5D, (double)var4 + 0.5D, "random.click", 0.3F, var13 != 0?0.55F:0.5F);
      var1.method_2055(var2, var3, var4, var14 | var11 & 3, 2);
      this.method_2736(var1, var2, var3, var4, var1.field_1819);
      return true;
   }

   // $FF: renamed from: c (ahb, int, int, int, aji) void
   protected void method_2717(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.method_2066(var2, var3, var4, this);
      if(var6 != null) {
         if(var10000 != 0) {
            return;
         }

         var10000 = var1.method_33(var2, var3, var4);
      }

      int var7 = var10000;
      int var8 = this.method_2733(var1, var2, var3, var4, var7);
      int var9 = this.method_2735(var1, var2, var3, var4).method_3158();
      var10000 = var8;
      if(var6 != null) {
         label26: {
            if(var8 == var9) {
               var10000 = this.method_2716(var7);
               if(var6 == null) {
                  break label26;
               }

               if(var10000 == this.method_2719(var1, var2, var3, var4, var7)) {
                  return;
               }
            }

            var10000 = this.method_2728(var1, var2, var3, var4, var7);
         }
      }

      if(var10000 != 0) {
         var1.method_2111(var2, var3, var4, this, this.method_2730(0), -1);
         if(var6 != null) {
            return;
         }
      }

      var1.method_2111(var2, var3, var4, this, this.method_2730(0), 0);
   }

   // $FF: renamed from: d (ahb, int, int, int, java.util.Random) void
   private void method_2736(ahb var1, int var2, int var3, int var4, Random var5) {
      int var7 = var1.method_33(var2, var3, var4);
      int var8 = this.method_2733(var1, var2, var3, var4, var7);
      String[] var10000 = class_752.method_4253();
      int var9 = this.method_2735(var1, var2, var3, var4).method_3158();
      String[] var6 = var10000;
      this.method_2735(var1, var2, var3, var4).method_3159(var8);
      int var12 = var9;
      if(var6 != null) {
         label66: {
            if(var9 == var8) {
               var12 = this.method_2734(var7);
               if(var6 == null) {
                  break label66;
               }

               if(var12 != 0) {
                  return;
               }
            }

            var12 = this.method_2719(var1, var2, var3, var4, var7);
         }
      }

      int var10 = var12;
      var12 = this.field_2157;
      if(var6 != null) {
         label57: {
            if(!this.field_2157) {
               var12 = var7 & 8;
               if(var6 == null) {
                  break label57;
               }

               if(var12 == 0) {
                  var12 = 0;
                  break label57;
               }
            }

            var12 = 1;
         }
      }

      label71: {
         int var11 = var12;
         var12 = var11;
         if(var6 != null) {
            label48: {
               if(var11 != 0) {
                  var12 = var10;
                  if(var6 == null) {
                     break label48;
                  }

                  if(var10 == 0) {
                     var1.method_2055(var2, var3, var4, var7 & -9, 2);
                     if(var6 != null) {
                        break label71;
                     }
                  }
               }

               var12 = var11;
            }
         }

         if(var6 != null) {
            if(var12 != 0) {
               break label71;
            }

            var12 = var10;
         }

         if(var6 != null && var12 != 0) {
            var1.method_2055(var2, var3, var4, var7 | 8, 2);
         }
      }

      this.method_2723(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      class_433 var10000 = this;
      if(var6 != null) {
         if(this.field_2157) {
            int var7 = var1.method_33(var2, var3, var4);
            var1.method_2054(var2, var3, var4, this.method_2732(), var7 | 8, 4);
         }

         var10000 = this;
      }

      var10000.method_2736(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      super.method_2461(var1, var2, var3, var4);
      var1.method_2131(var2, var3, var4, this.method_124(var1, 0));
   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      super.method_2462(var1, var2, var3, var4, var5, var6);
      var1.method_2132(var2, var3, var4);
      this.method_2723(var1, var2, var3, var4);
   }

   // $FF: renamed from: a (ahb, int, int, int, int, int) boolean
   public boolean method_2511(ahb var1, int var2, int var3, int var4, int var5, int var6) {
      super.method_2511(var1, var2, var3, var4, var5, var6);
      String[] var10000 = class_752.method_4253();
      class_580 var8 = var1.method_31(var2, var3, var4);
      String[] var7 = var10000;
      class_580 var9 = var8;
      if(var7 != null) {
         if(var8 == null) {
            return false;
         }

         var9 = var8;
      }

      return var9.method_3104(var5, var6);
   }

   // $FF: renamed from: a (ahb, int) gi
   public class_580 method_124(ahb var1, int var2) {
      class_592 var10000 = new class_592;
      var10000.getBlock88();
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "î_Â¨éXÆ".toCharArray();
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
            field_2161 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 96;
            break;
         case 1:
            var10009 = 106;
            break;
         case 2:
            var10009 = 145;
            break;
         case 3:
            var10009 = 42;
            break;
         case 4:
            var10009 = 188;
            break;
         case 5:
            var10009 = 246;
            break;
         default:
            var10009 = 151;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
