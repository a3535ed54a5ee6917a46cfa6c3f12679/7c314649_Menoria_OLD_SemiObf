import java.util.List;

// $FF: renamed from: e2
public class class_467 extends class_464 {

   // $FF: renamed from: M java.lang.String[]
   public static final String[] field_2234;
   // $FF: renamed from: O java.lang.String[]
   private static final String[] field_2235;
   // $FF: renamed from: P int
   public int field_2236;
   // $FF: renamed from: Q vL[]
   private class_73[] field_2237;
   // $FF: renamed from: R java.lang.String[]
   private static final String[] field_2238;


   // $FF: renamed from: <init> () void
   protected void method_2812() {
      super.method_2427(awt.field_4176);
      this.method_2429(0);
      this.method_2521(class_872.field_4245);
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      class_467 var10000 = this;
      if(var3 != null) {
         if(this.field_2236 == 3) {
            label16: {
               int var5 = var1;
               int var10001 = 1;
               if(var3 != null) {
                  if(var1 != 1) {
                     break label16;
                  }

                  var5 = var2 >> 2;
                  var10001 = this.field_2237.length;
               }

               int var4 = var5 % var10001;
               return this.field_2237[var4];
            }
         }

         var10000 = this;
      }

      return var10000.field_2010;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var10002 = field_2238;
      this.field_2010 = var1.method_375("anvil_base");
      String[] var2 = class_752.method_4253();
      this.field_2237 = new class_73[field_2235.length];
      int var3 = 0;

      while(var3 < this.field_2237.length) {
         this.field_2237[var3] = var1.method_375(field_2235[var3]);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, sv, add) void
   public void method_2506(ahb var1, int var2, int var3, int var4, class_752 var5, add var6) {
      String[] var10000 = class_752.method_4253();
      int var8 = class_1715.method_9561((double)(var5.field_3000 * 4.0F / 360.0F) + 0.5D) & 3;
      String[] var7 = var10000;
      int var9 = var1.method_33(var2, var3, var4) >> 2;
      ++var8;
      var8 %= 4;
      int var10 = var8;
      if(var7 != null) {
         if(var8 == 0) {
            var1.method_2055(var2, var3, var4, 2 | var9 << 2, 2);
         }

         var10 = var8;
      }

      byte var10001 = 1;
      if(var7 != null) {
         if(var10 == 1) {
            var1.method_2055(var2, var3, var4, 3 | var9 << 2, 2);
         }

         var10 = var8;
         var10001 = 2;
      }

      if(var7 != null) {
         if(var10 == var10001) {
            var1.method_2055(var2, var3, var4, 0 | var9 << 2, 2);
         }

         var10 = var8;
         if(var7 == null) {
            return;
         }

         var10001 = 3;
      }

      if(var10 == var10001) {
         var1.method_2055(var2, var3, var4, 1 | var9 << 2, 2);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, yz, int, float, float, float) boolean
   public boolean method_2481(ahb var1, int var2, int var3, int var4, class_792 var5, int var6, float var7, float var8, float var9) {
      String[] var10 = class_752.method_4253();
      boolean var10000 = var1.field_1832;
      if(var10 != null) {
         if(var1.field_1832) {
            return true;
         }

         var5.method_4580(var2, var3, var4);
         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 35;
   }

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      return var1 >> 2;
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      label18: {
         String[] var10000 = class_752.method_4253();
         int var6 = var1.method_33(var2, var3, var4) & 3;
         String[] var5 = var10000;
         if(var5 != null) {
            if(var6 != 3 && var6 != 1) {
               break label18;
            }

            this.method_2443(0.0F, 0.0F, 0.125F, 1.0F, 1.0F, 0.875F);
         }

         if(var5 != null) {
            return;
         }
      }

      this.method_2443(0.125F, 0.0F, 0.0F, 0.875F, 1.0F, 1.0F);
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void method_2519(adb var1, class_872 var2, List var3) {
      add var10001 = new add;
      var10001.method_3726(var1, 1, 0);
      var3.add(var10001);
      var10001 = new add;
      var10001.method_3726(var1, 1, 1);
      var3.add(var10001);
      var10001 = new add;
      var10001.method_3726(var1, 1, 2);
      var3.add(var10001);
   }

   // $FF: renamed from: b (xp) void
   protected void method_2814(class_700 var1) {
      var1.method_4040(true);
   }

   // $FF: renamed from: h (ahb, int, int, int, int) void
   public void method_2816(ahb var1, int var2, int var3, int var4, int var5) {
      var1.method_2210(1022, var2, var3, var4, 0);
   }

   // $FF: renamed from: a (ahl, int, int, int, int) boolean
   public boolean method_2445(ahl var1, int var2, int var3, int var4, int var5) {
      return true;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
