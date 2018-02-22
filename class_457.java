import java.util.Random;

// $FF: renamed from: eB
public class class_457 extends class_446 {

   // $FF: renamed from: N vL[]
   private class_73[] field_2212;
   // $FF: renamed from: O java.lang.String
   private static final String field_2213 = "_stage_";


   // $FF: renamed from: <init> () void
   protected void method_2770() {
      super.method_2770();
      this.method_2440(true);
      float var1 = 0.5F;
      this.method_2443(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, 0.25F, 0.5F + var1);
      this.method_2521((class_872)null);
   }

   // $FF: renamed from: d (aji) boolean
   protected boolean method_2771(aji var1) {
      return var1 == class_1192.field_6114;
   }

   // $FF: renamed from: j (ahb, int, int, int) boolean
   public boolean method_2505(ahb var1, int var2, int var3, int var4) {
      return this.method_2771(var1.getBlock(var2, var3 - 1, var4));
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = var1.method_33(var2, var3, var4);
      String[] var6 = var10000;
      if(var6 != null) {
         if(var7 < 3 && var6 != null && var5.nextInt(10) == 0) {
            ++var7;
            var1.method_2055(var2, var3, var4, var7, 2);
         }

         super.method_2456(var1, var2, var3, var4, var5);
      }

   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var2;
      if(var3 != null) {
         if(var2 >= 3) {
            return this.field_2212[2];
         }

         var10000 = var2;
      }

      return var10000 > 0?this.field_2212[1]:this.field_2212[0];
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 6;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, int) void
   public void method_2467(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      String[] var8 = class_752.method_4253();
      byte var10000 = var1.field_1832;
      if(var8 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = 1;
      }

      int var9 = var10000;
      int var11 = var5;
      if(var8 != null) {
         label33: {
            if(var5 >= 3) {
               var9 = 2 + var1.field_1819.nextInt(3);
               var11 = var7;
               if(var8 == null) {
                  break label33;
               }

               if(var7 > 0) {
                  var9 += var1.field_1819.nextInt(var7 + 1);
               }
            }

            var11 = 0;
         }
      }

      int var10 = var11;

      while(var10 < var9) {
         add var10005 = new add;
         var10005.method_3724(class_1010.field_5229);
         this.method_2468(var1, var2, var3, var4, var10005);
         ++var10;
         if(var8 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return null;
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 0;
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return class_1010.field_5229;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      this.field_2212 = new class_73[3];
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < this.field_2212.length) {
         this.field_2212[var3] = var1.method_375(this.method_2533() + "_stage_" + var3);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "OWÖAup".toCharArray();
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
            field_2213 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 177;
            break;
         case 1:
            var10009 = 133;
            break;
         case 2:
            var10009 = 74;
            break;
         case 3:
            var10009 = 22;
            break;
         case 4:
            var10009 = 135;
            break;
         case 5:
            var10009 = 177;
            break;
         default:
            var10009 = 142;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
