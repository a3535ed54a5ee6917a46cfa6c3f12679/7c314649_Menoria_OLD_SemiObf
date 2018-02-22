import java.util.List;

// $FF: renamed from: f7
public class class_421 extends aji {

   // $FF: renamed from: <init> () void
   protected void method_2692() {
      super.method_2427(awt.field_4187);
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
      this.method_2440(true);
      this.method_2521(class_872.field_4245);
      this.method_2693(0);
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      return class_1192.field_6062.method_2448(var1, var2);
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      byte var5 = 0;
      float var6 = 0.0625F;
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
      this.method_2693(0);
   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      this.method_2693(var1.method_33(var2, var3, var4));
   }

   // $FF: renamed from: c (int) void
   protected void method_2693(int var1) {
      byte var2 = 0;
      float var3 = (float)(1 * (1 + var2)) / 16.0F;
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, var3, 1.0F);
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      boolean var10000;
      label24: {
         String[] var5 = class_752.method_4253();
         var10000 = super.method_2480(var1, var2, var3, var4);
         if(var5 != null) {
            if(!var10000) {
               break label24;
            }

            var10000 = this.method_2505(var1, var2, var3, var4);
         }

         if(var5 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      this.method_2694(var1, var2, var3, var4);
   }

   // $FF: renamed from: h (ahb, int, int, int) boolean
   private boolean method_2694(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = this.method_2505(var1, var2, var3, var4);
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

   // $FF: renamed from: j (ahb, int, int, int) boolean
   public boolean method_2505(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      boolean var10000 = var1.method_34(var2, var3 - 1, var4);
      if(var5 != null) {
         var10000 = !var10000;
      }

      return var10000;
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

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      return var1;
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void method_2519(adb var1, class_872 var2, List var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var4 = var10000;

      while(var5 < 16) {
         add var10001 = new add;
         var10001.method_3726(var1, 1, var5);
         var3.add(var10001);
         ++var5;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {}
}
