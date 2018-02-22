import java.util.List;

// $FF: renamed from: eF
public class class_453 extends class_446 {

   // $FF: renamed from: <init> () void
   protected void method_2770() {
      super.method_2770();
      float var1 = 0.5F;
      float var2 = 0.015625F;
      this.method_2443(0.5F - var1, 0.0F, 0.5F - var1, 0.5F + var1, var2, 0.5F + var1);
      this.method_2521(class_872.field_4245);
   }

   // $FF: renamed from: b () int
   public int method_2436() {
      return 23;
   }

   // $FF: renamed from: a (ahb, int, int, int, kg, java.util.List, sa) void
   public void method_2451(ahb var1, int var2, int var3, int var4, class_1343 var5, List var6, class_689 var7) {
      label16: {
         String[] var8 = class_752.method_4253();
         class_689 var10000 = var7;
         if(var8 != null) {
            if(var7 == null) {
               break label16;
            }

            var10000 = var7;
         }

         if(var10000 instanceof class_701) {
            return;
         }
      }

      super.method_2451(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      return class_1343.method_7093((double)var2 + this.field_1999, (double)var3 + this.field_2000, (double)var4 + this.field_2001, (double)var2 + this.field_2002, (double)var3 + this.field_2003, (double)var4 + this.field_2004);
   }

   // $FF: renamed from: D () int
   public int method_2493() {
      return 2129968;
   }

   // $FF: renamed from: i (int) int
   public int method_2494(int var1) {
      return 2129968;
   }

   // $FF: renamed from: d (ahl, int, int, int) int
   public int method_2495(ahl var1, int var2, int var3, int var4) {
      return 2129968;
   }

   // $FF: renamed from: d (aji) boolean
   protected boolean method_2771(aji var1) {
      return var1 == class_1192.field_6034;
   }

   // $FF: renamed from: j (ahb, int, int, int) boolean
   public boolean method_2505(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = var3;
      if(var5 != null) {
         if(var3 >= 0) {
            var10000 = var3;
            if(var5 == null) {
               return (boolean)var10000;
            }

            if(var3 < 256) {
               label38: {
                  ahb var6 = var1;
                  int var10001 = var2;
                  int var10002 = var3 - 1;
                  int var10003 = var4;
                  if(var5 != null) {
                     if(var1.getBlock(var2, var10002, var4).method_2424() != awt.field_4177) {
                        break label38;
                     }

                     var6 = var1;
                     var10001 = var2;
                     var10002 = var3 - 1;
                     var10003 = var4;
                  }

                  var10000 = var6.method_33(var10001, var10002, var10003);
                  if(var5 == null) {
                     return (boolean)var10000;
                  }

                  if(var10000 == 0) {
                     var10000 = 1;
                     return (boolean)var10000;
                  }
               }

               var10000 = 0;
               return (boolean)var10000;
            }
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }
}
