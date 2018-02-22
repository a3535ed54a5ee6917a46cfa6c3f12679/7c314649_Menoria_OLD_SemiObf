import java.util.List;

// $FF: renamed from: fZ
public class class_383 extends class_382 {

   // $FF: renamed from: Q java.lang.String[][]
   public static final String[][] field_2062;
   // $FF: renamed from: R java.lang.String[]
   public static final String[] field_2063;


   // $FF: renamed from: <init> () void
   public void method_2589() {
      super.method_2589();
   }

   // $FF: renamed from: i (int) int
   public int method_2494(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1 & 3;
      byte var10001 = 1;
      if(var2 != null) {
         if(var10000 == 1) {
            return class_1037.method_5870();
         }

         var10000 = var1 & 3;
         if(var2 == null) {
            return var10000;
         }

         var10001 = 2;
      }

      if(var10000 == var10001) {
         return class_1037.method_5871();
      } else {
         var10000 = super.method_2494(var1);
         return var10000;
      }
   }

   // $FF: renamed from: d (ahl, int, int, int) int
   public int method_2495(ahl var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var1.method_33(var2, var3, var4);
      String[] var5 = var10000;
      int var7 = var6 & 3;
      byte var10001 = 1;
      if(var5 != null) {
         if(var7 == 1) {
            return class_1037.method_5870();
         }

         var7 = var6 & 3;
         if(var5 == null) {
            return var7;
         }

         var10001 = 2;
      }

      if(var7 == var10001) {
         return class_1037.method_5871();
      } else {
         var7 = super.method_2495(var1, var2, var3, var4);
         return var7;
      }
   }

   // $FF: renamed from: d (ahb, int, int, int, int, int) void
   protected void method_2591(ahb var1, int var2, int var3, int var4, int var5, int var6) {
      String[] var7 = class_752.method_4253();
      int var10000 = var5 & 3;
      if(var7 != null) {
         if(var10000 != 0) {
            return;
         }

         var10000 = var1.field_1819.nextInt(var6);
      }

      if(var10000 == 0) {
         add var10005 = new add;
         var10005.method_3726(class_1010.field_5118, 1, 0);
         this.method_2468(var1, var2, var3, var4, var10005);
      }

   }

   // $FF: renamed from: c (int) int
   protected int method_2592(int var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = super.method_2592(var1);
      String[] var2 = var10000;
      int var4 = var1 & 3;
      if(var2 != null) {
         if(var4 == 3) {
            var3 = 40;
         }

         var4 = var3;
      }

      return var4;
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var2 & 3;
      byte var10001 = 1;
      if(var3 != null) {
         if(var10000 == 1) {
            return this.field_2060[this.field_2059][1];
         }

         var10000 = var2 & 3;
         var10001 = 3;
      }

      if(var3 != null) {
         if(var10000 == var10001) {
            return this.field_2060[this.field_2059][3];
         }

         var10000 = var2 & 3;
         var10001 = 2;
      }

      return var10000 == var10001?this.field_2060[this.field_2059][2]:this.field_2060[this.field_2059][0];
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
      var10001 = new add;
      var10001.method_3726(var1, 1, 3);
      var3.add(var10001);
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < field_2062.length) {
         this.field_2060[var3] = new class_73[field_2062[var3].length];
         int var4 = 0;

         while(true) {
            if(var4 < field_2062[var3].length) {
               this.field_2060[var3][var4] = var1.method_375(field_2062[var3][var4]);
               ++var4;
               if(var2 == null) {
                  break;
               }

               if(var2 != null) {
                  continue;
               }
            }

            ++var3;
            break;
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: i () java.lang.String[]
   public String[] method_2594() {
      return field_2063;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
