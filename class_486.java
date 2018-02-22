import java.util.Random;

// $FF: renamed from: d9
public class class_486 extends class_473 {

   // $FF: renamed from: M vL[]
   private class_73[] field_2271;
   // $FF: renamed from: N java.lang.String
   private static final String field_2272;
   // $FF: renamed from: O java.lang.String[]
   private static final String[] field_2273;


   // $FF: renamed from: <init> () void
   public void method_2850() {
      super.method_2427(awt.field_4173);
      this.field_2271 = new class_73[2];
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
      this.method_2521(class_872.field_4246);
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
   }

   // $FF: renamed from: b (ahl, int, int, int, int) int
   public int method_2496(ahl var1, int var2, int var3, int var4, int var5) {
      return var1.method_33(var2, var3, var4);
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {}

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {}

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {}

   // $FF: renamed from: h (ahb, int, int, int) void
   public void method_2851(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = var1.field_1820.field_5736;
      if(var5 != null) {
         if(var1.field_1820.field_5736) {
            return;
         }

         var10000 = var1.method_33(var2, var3, var4);
      }

      int var6;
      int var7;
      float var8;
      label45: {
         var6 = var10000;
         var7 = var1.method_2074(class_95.field_53, var2, var3, var4) - var1.field_1810;
         var8 = var1.method_2104(1.0F);
         float var9 = var8;
         float var10001 = 3.1415927F;
         if(var5 != null) {
            if(var8 < 3.1415927F) {
               var8 += (0.0F - var8) * 0.2F;
               if(var5 != null) {
                  break label45;
               }
            }

            var9 = var8;
            var10001 = (6.2831855F - var8) * 0.2F;
         }

         var8 = var9 + var10001;
      }

      var7 = Math.round((float)var7 * class_1715.method_9556(var8));
      var10000 = var7;
      if(var5 != null) {
         if(var7 < 0) {
            var7 = 0;
         }

         var10000 = var7;
      }

      int var10 = 15;
      if(var5 != null) {
         if(var10000 > 15) {
            var7 = 15;
         }

         var10000 = var6;
         if(var5 == null) {
            return;
         }

         var10 = var7;
      }

      if(var10000 != var10) {
         var1.method_2055(var2, var3, var4, var7, 3);
      }

   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: f () boolean
   public boolean method_2497() {
      return true;
   }

   // $FF: renamed from: a (ahb, int) gi
   public class_580 method_124(ahb var1, int var2) {
      class_591 var10000 = new class_591;
      var10000.getBlock88();
      return var10000;
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      return var1 == 1?this.field_2271[0]:this.field_2271[1];
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      class_73[] var10000 = this.field_2271;
      StringBuilder var10003 = (new StringBuilder()).append(this.method_2533());
      String[] var2 = field_2273;
      var10000[0] = var1.method_375(var10003.append("_top").toString());
      this.field_2271[1] = var1.method_375(this.method_2533() + "_side");
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "!zìr\'=EÚ&ryºN;·%!}êf";
      int var4 = "!zìr\'=EÚ&ryºN;·%!}êf".length();
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2273 = var5;
                  String[] var10 = field_2273;
                  field_2272 = "CL_00000223";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 162;
               break;
            case 1:
               var10009 = 213;
               break;
            case 2:
               var10009 = 89;
               break;
            case 3:
               var10009 = 202;
               break;
            case 4:
               var10009 = 158;
               break;
            case 5:
               var10009 = 149;
               break;
            default:
               var10009 = 86;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
