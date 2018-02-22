import java.util.Random;

// $FF: renamed from: ek
public class class_474 extends class_473 {

   // $FF: renamed from: N java.lang.String
   private static final String field_2244 = "piston_top_normal";


   // $FF: renamed from: <init> () void
   public void method_2822() {
      super.method_2427(awt.field_4203);
      this.method_2437(-1.0F);
   }

   // $FF: renamed from: a (ahb, int) gi
   public class_580 method_124(ahb var1, int var2) {
      return null;
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {}

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      label16: {
         String[] var10000 = class_752.method_4253();
         class_580 var8 = var1.method_31(var2, var3, var4);
         String[] var7 = var10000;
         class_580 var9 = var8;
         if(var7 != null) {
            if(!(var8 instanceof class_598)) {
               break label16;
            }

            var9 = var8;
         }

         ((class_598)var9).method_3196();
         if(var7 != null) {
            return;
         }
      }

      super.method_2462(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      return false;
   }

   // $FF: renamed from: d (ahb, int, int, int, int) boolean
   public boolean method_2479(ahb var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return -1;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      String[] var10 = class_752.method_4253();
      boolean var10000 = var1.field_1832;
      if(var10 != null) {
         if(!var1.field_1832) {
            label16: {
               ahb var11 = var1;
               int var10001 = var2;
               int var10002 = var3;
               int var10003 = var4;
               if(var10 != null) {
                  if(var1.method_31(var2, var3, var4) != null) {
                     break label16;
                  }

                  var11 = var1;
                  var10001 = var2;
                  var10002 = var3;
                  var10003 = var4;
               }

               var11.method_2056(var10001, var10002, var10003);
               return true;
            }
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return null;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, int) void
   public void method_2467(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      String[] var8 = class_752.method_4253();
      if(!var1.field_1832) {
         class_598 var9 = this.method_2825(var1, var2, var3, var4);
         class_598 var10000 = var9;
         if(var8 != null) {
            if(var9 == null) {
               return;
            }

            var10000 = var9;
         }

         var10000.method_3187().method_2466(var1, var2, var3, var4, var9.getBlock96(), 0);
      }
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      ahb var10000 = var1;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var1;
      }

      var10000.method_31(var2, var3, var4);
   }

   // $FF: renamed from: b (aji, int, int, boolean, boolean) gi
   public static class_580 method_2823(aji var0, int var1, int var2, boolean var3, boolean var4) {
      class_598 var10000 = new class_598;
      var10000.method_3186(var0, var1, var2, var3, var4);
      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      class_598 var6 = this.method_2825(var1, var2, var3, var4);
      String[] var5 = var10000;
      class_598 var8 = var6;
      if(var5 != null) {
         if(var6 == null) {
            return null;
         }

         var8 = var6;
      }

      float var7 = var8.method_3191(0.0F);
      if(var6.method_3188()) {
         var7 = 1.0F - var7;
      }

      return this.method_2824(var1, var2, var3, var4, var6.method_3187(), var7, var6.method_3189());
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      class_598 var6 = this.method_2825(var1, var2, var3, var4);
      String[] var5 = var10000;
      class_598 var10 = var6;
      if(var5 != null) {
         if(var6 == null) {
            return;
         }

         var10 = var6;
      }

      aji var7 = var10.method_3187();
      aji var11 = var7;
      if(var5 != null) {
         if(var7 == this) {
            return;
         }

         var11 = var7;
      }

      if(var5 != null) {
         if(var11.method_2424() == awt.field_4170) {
            return;
         }

         var11 = var7;
      }

      var11.method_2486(var1, var2, var3, var4);
      float var8 = var6.method_3191(0.0F);
      int var12 = var6.method_3188();
      if(var5 != null) {
         if(var12 != 0) {
            var8 = 1.0F - var8;
         }

         var12 = var6.method_3189();
      }

      int var9 = var12;
      this.field_1999 = var7.method_2487() - (double)((float)class_1707.field_8947[var9] * var8);
      this.field_2000 = var7.method_2489() - (double)((float)class_1707.field_8948[var9] * var8);
      this.field_2001 = var7.method_2491() - (double)((float)class_1707.field_8949[var9] * var8);
      this.field_2002 = var7.method_2488() - (double)((float)class_1707.field_8947[var9] * var8);
      this.field_2003 = var7.method_2490() - (double)((float)class_1707.field_8948[var9] * var8);
      this.field_2004 = var7.method_2492() - (double)((float)class_1707.field_8949[var9] * var8);
   }

   // $FF: renamed from: b (ahb, int, int, int, aji, float, int) kg
   public class_1343 method_2824(ahb var1, int var2, int var3, int var4, aji var5, float var6, int var7) {
      String[] var8 = class_752.method_4253();
      aji var10000 = var5;
      if(var8 != null) {
         if(var5 == this) {
            return null;
         }

         var10000 = var5;
      }

      if(var8 != null) {
         if(var10000.method_2424() == awt.field_4170) {
            return null;
         }

         var10000 = var5;
      }

      class_1343 var9 = var10000.method_2452(var1, var2, var3, var4);
      if(var9 == null) {
         return null;
      } else {
         label37: {
            if(class_1707.field_8947[var7] < 0) {
               var9.field_6909 -= (double)((float)class_1707.field_8947[var7] * var6);
               if(var8 != null) {
                  break label37;
               }
            }

            var9.field_6912 -= (double)((float)class_1707.field_8947[var7] * var6);
         }

         label32: {
            if(class_1707.field_8948[var7] < 0) {
               var9.field_6910 -= (double)((float)class_1707.field_8948[var7] * var6);
               if(var8 != null) {
                  break label32;
               }
            }

            var9.field_6913 -= (double)((float)class_1707.field_8948[var7] * var6);
         }

         if(class_1707.field_8949[var7] < 0) {
            var9.field_6911 -= (double)((float)class_1707.field_8949[var7] * var6);
            if(var8 != null) {
               return var9;
            }
         }

         var9.field_6914 -= (double)((float)class_1707.field_8949[var7] * var6);
         return var9;
      }
   }

   // $FF: renamed from: f (ahl, int, int, int) gB
   private class_598 method_2825(ahl var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      class_580 var6 = var1.method_31(var2, var3, var4);
      String[] var5 = var10000;
      class_580 var7 = var6;
      if(var5 != null) {
         if(!(var6 instanceof class_598)) {
            return null;
         }

         var7 = var6;
      }

      return (class_598)var7;
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return adb.method_2919(0);
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      this.field_2010 = var1.method_375("piston_top_normal");
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "©aòa8/­gÙ`9´i".toCharArray();
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
            field_2244 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 194;
            break;
         case 1:
            var10009 = 19;
            break;
         case 2:
            var10009 = 243;
            break;
         case 3:
            var10009 = 157;
            break;
         case 4:
            var10009 = 21;
            break;
         case 5:
            var10009 = 77;
            break;
         default:
            var10009 = 107;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
