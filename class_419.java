import java.util.List;

// $FF: renamed from: eX
public class class_419 extends aji {

   // $FF: renamed from: M java.lang.String[]
   public static final String[] field_2139;
   // $FF: renamed from: N vL
   private class_73 field_2140;
   // $FF: renamed from: O vL
   private class_73 field_2141;
   // $FF: renamed from: P java.lang.String[]
   private static final String[] field_2142;


   // $FF: renamed from: <init> () void
   protected void method_2679() {
      super.method_2427(awt.field_4172);
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      int var10000;
      label27: {
         String[] var3 = class_752.method_4253();
         var10000 = var2;
         byte var10001 = 2;
         if(var3 != null) {
            if(var2 != 2) {
               return this.field_2010;
            }

            var10000 = var1;
            if(var3 == null) {
               break label27;
            }

            var10001 = 1;
         }

         if(var10000 == var10001) {
            return this.field_2140;
         }

         var10000 = var1;
      }

      if(var10000 != 0) {
         return this.field_2141;
      } else {
         return this.field_2010;
      }
   }

   // $FF: renamed from: e (ahl, int, int, int, int) vL
   public class_73 method_2447(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6;
      int var10;
      label50: {
         String[] var10000 = class_752.method_4253();
         int var7 = var1.method_33(var2, var3, var4);
         var6 = var10000;
         var10 = var7;
         byte var10001 = 2;
         if(var6 != null) {
            if(var7 != 2) {
               return this.field_2010;
            }

            var10 = var5;
            if(var6 == null) {
               break label50;
            }

            var10001 = 1;
         }

         if(var10 == var10001) {
            return this.field_2140;
         }

         var10 = var5;
      }

      if(var10 != 0) {
         awt var8 = var1.getBlock(var2, var3 + 1, var4).method_2424();
         awt var11 = var8;
         awt var12 = awt.field_4194;
         if(var6 != null) {
            if(var8 == awt.field_4194) {
               return class_1192.field_6027.method_2447(var1, var2, var3, var4, var5);
            }

            var11 = var8;
            var12 = awt.field_4195;
         }

         if(var11 != var12) {
            aji var9 = var1.getBlock(var2, var3 + 1, var4);
            aji var13 = var9;
            if(var6 != null) {
               if(var9 == class_1192.field_6028) {
                  return this.field_2010;
               }

               var13 = var9;
            }

            if(var13 != class_1192.field_6027) {
               return this.field_2141;
            } else {
               return this.field_2010;
            }
         } else {
            return class_1192.field_6027.method_2447(var1, var2, var3, var4, var5);
         }
      } else {
         return this.field_2010;
      }
   }

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      return 0;
   }

   // $FF: renamed from: j (int) add
   protected add method_2503(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         if(var1 != 1) {
            return super.method_2503(var1);
         }

         var10000 = 0;
      }

      var1 = var10000;
      return super.method_2503(var1);
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void method_2519(adb var1, class_872 var2, List var3) {
      add var10001 = new add;
      var10001.method_3723(this, 1, 0);
      var3.add(var10001);
      var10001 = new add;
      var10001.method_3723(this, 1, 2);
      var3.add(var10001);
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      super.method_2535(var1);
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2533()).append("_");
      String[] var2 = field_2142;
      this.field_2140 = var1.method_375(var10002.append("podzol_top").toString());
      this.field_2141 = var1.method_375(this.method_2533() + "_" + "podzol_side");
   }

   // $FF: renamed from: k (ahb, int, int, int) int
   public int method_2518(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1.method_33(var2, var3, var4);
      String[] var5 = var10000;
      int var7 = var6;
      if(var5 != null) {
         if(var6 == 1) {
            var6 = 0;
         }

         var7 = var6;
      }

      return var7;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
