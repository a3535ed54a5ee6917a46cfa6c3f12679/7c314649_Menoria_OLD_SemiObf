import java.util.List;
import java.util.Random;

// $FF: renamed from: ec
public class class_482 extends class_473 {

   // $FF: renamed from: M boolean
   public static boolean field_2258;
   // $FF: renamed from: N java.lang.String[]
   private static final String[] field_2259;


   // $FF: renamed from: <init> (awt) void
   protected void method_2427(awt var1) {
      super.method_2427(var1);
      this.method_2430(1.0F);
   }

   // $FF: renamed from: a (ahb, int) gi
   public class_580 method_124(ahb var1, int var2) {
      class_599 var10000 = new class_599;
      var10000.getBlock88();
      return var10000;
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      float var5 = 0.0625F;
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, var5, 1.0F);
   }

   // $FF: renamed from: a (ahl, int, int, int, int) boolean
   public boolean method_2445(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5;
      if(var6 != null) {
         if(var5 != 0) {
            return false;
         }

         var10000 = super.method_2445(var1, var2, var3, var4, var5);
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, kg, java.util.List, sa) void
   public void method_2451(ahb var1, int var2, int var3, int var4, class_1343 var5, List var6, class_689 var7) {}

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 0;
   }

   // $FF: renamed from: a (ahb, int, int, int, sa) void
   public void method_2498(ahb var1, int var2, int var3, int var4, class_689 var5) {
      String[] var6 = class_752.method_4253();
      class_689 var10000 = var5.field_2988;
      if(var6 != null) {
         if(var5.field_2988 != null) {
            return;
         }

         var10000 = var5.field_2987;
      }

      if(var10000 == null && !var1.field_1832) {
         var5.method_3964(1);
      }

   }

   // $FF: renamed from: b (ahb, int, int, int, java.util.Random) void
   public void method_2457(ahb var1, int var2, int var3, int var4, Random var5) {
      double var6 = (double)((float)var2 + var5.nextFloat());
      double var8 = (double)((float)var3 + 0.8F);
      double var10 = (double)((float)var4 + var5.nextFloat());
      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = 0.0D;
      String[] var10001 = field_2259;
      var1.method_2087("smoke", var6, var8, var10, var12, var14, var16);
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return -1;
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = field_2258;
      if(var5 != null) {
         if(field_2258) {
            return;
         }

         var10000 = var1.field_1820.field_5738;
      }

      if(var5 != null && var10000 != 0) {
         var1.method_2056(var2, var3, var4);
      }

   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return adb.method_2919(0);
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var10002 = field_2259;
      this.field_2010 = var1.method_375("portal");
   }

   // $FF: renamed from: f (int) jj
   public class_1319 method_2425(int var1) {
      return class_1319.field_6781;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "R»kQ¦oö";
      int var4 = "R»kQ¦oö".length();
      char var1 = 5;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2259 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 51;
               break;
            case 1:
               var10009 = 252;
               break;
            case 2:
               var10009 = 198;
               break;
            case 3:
               var10009 = 241;
               break;
            case 4:
               var10009 = 28;
               break;
            case 5:
               var10009 = 136;
               break;
            default:
               var10009 = 187;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
