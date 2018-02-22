import java.util.Random;

// $FF: renamed from: fK
public class class_404 extends aji {

   // $FF: renamed from: N java.lang.String
   private static final String field_2105 = "snow";


   // $FF: renamed from: <init> () void
   protected void method_2643() {
      super.method_2427(awt.field_4194);
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.method_2440(true);
      this.method_2521(class_872.field_4245);
      this.method_2644(0);
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      this.field_2010 = var1.method_375("snow");
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.method_33(var2, var3, var4) & 7;
      float var6 = 0.125F;
      return class_1343.method_7093((double)var2 + this.field_1999, (double)var3 + this.field_2000, (double)var4 + this.field_2001, (double)var2 + this.field_2002, (double)((float)var3 + (float)var5 * var6), (double)var4 + this.field_2004);
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: g () void
   public void method_2500() {
      this.method_2644(0);
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      this.method_2644(var1.method_33(var2, var3, var4));
   }

   // $FF: renamed from: c (int) void
   protected void method_2644(int var1) {
      int var2 = var1 & 7;
      float var3 = (float)(2 * (1 + var2)) / 16.0F;
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, var3, 1.0F);
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      aji var10000;
      String[] var5;
      aji var6;
      label68: {
         var6 = var1.getBlock(var2, var3 - 1, var4);
         var5 = class_752.method_4253();
         var10000 = var6;
         aji var10001 = class_1192.field_6105;
         if(var5 != null) {
            if(var6 == class_1192.field_6105) {
               return false;
            }

            var10000 = var6;
            if(var5 == null) {
               break label68;
            }

            var10001 = class_1192.field_6188;
         }

         if(var10000 == var10001) {
            return false;
         }

         var10000 = var6;
      }

      if(var5 != null) {
         if(var10000.method_2424() == awt.field_4179) {
            return true;
         }

         var10000 = var6;
      }

      int var7;
      label52: {
         if(var5 != null) {
            if(var10000 == this) {
               var7 = var1.method_33(var2, var3 - 1, var4) & 7;
               if(var5 == null) {
                  break label52;
               }

               if(var7 == 7) {
                  return true;
               }
            }

            var10000 = var6;
         }

         var7 = var10000.method_2453();
      }

      label70: {
         if(var5 != null) {
            if(var7 == 0) {
               break label70;
            }

            var7 = var6.field_2007.method_5065();
         }

         if(var5 == null) {
            return (boolean)var7;
         }

         if(var7 != 0) {
            var7 = 1;
            return (boolean)var7;
         }
      }

      var7 = 0;
      return (boolean)var7;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      this.method_2645(var1, var2, var3, var4);
   }

   // $FF: renamed from: e (ahb, int, int, int) boolean
   private boolean method_2645(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = this.method_2480(var1, var2, var3, var4);
      if(var5 != null) {
         if(!var10000) {
            this.method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
            var1.method_2056(var2, var3, var4);
            return false;
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: a (ahb, yz, int, int, int, int) void
   public void method_2501(ahb var1, class_792 var2, int var3, int var4, int var5, int var6) {
      int var7 = var6 & 7;
      add var10005 = new add;
      var10005.method_3726(class_1010.field_5190, var7 + 1, 0);
      this.method_2468(var1, var3, var4, var5, var10005);
      var1.method_2056(var3, var4, var5);
      var2.method_4615(class_1698.field_8908[aji.method_2415(this)], 1);
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return class_1010.field_5190;
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 0;
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      if(var6 != null && var1.method_2074(class_95.field_54, var2, var3, var4) > 11) {
         this.method_2466(var1, var2, var3, var4, var1.method_33(var2, var3, var4), 0);
         var1.method_2056(var2, var3, var4);
      }

   }

   // $FF: renamed from: a (ahl, int, int, int, int) boolean
   public boolean method_2445(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5;
      if(var6 != null) {
         if(var5 == 1) {
            return true;
         }

         var10000 = super.method_2445(var1, var2, var3, var4, var5);
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "µS\t".toCharArray();
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
            field_2105 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 105;
            break;
         case 1:
            var10009 = 209;
            break;
         case 2:
            var10009 = 147;
            break;
         case 3:
            var10009 = 209;
            break;
         case 4:
            var10009 = 90;
            break;
         case 5:
            var10009 = 156;
            break;
         default:
            var10009 = 159;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
