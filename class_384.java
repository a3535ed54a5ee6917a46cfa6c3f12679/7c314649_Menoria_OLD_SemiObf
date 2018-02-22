import java.util.List;

// $FF: renamed from: fY
public class class_384 extends class_382 {

   // $FF: renamed from: Q java.lang.String[][]
   public static final String[][] field_2064;
   // $FF: renamed from: R java.lang.String[]
   public static final String[] field_2065;


   // $FF: renamed from: <init> () void
   public void method_2589() {
      super.method_2589();
   }

   // $FF: renamed from: d (ahb, int, int, int, int, int) void
   protected void method_2591(ahb var1, int var2, int var3, int var4, int var5, int var6) {
      String[] var7 = class_752.method_4253();
      int var10000 = var5 & 3;
      if(var7 != null) {
         if(var10000 != 1) {
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

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      return super.method_2470(var1) + 4;
   }

   // $FF: renamed from: k (ahb, int, int, int) int
   public int method_2518(ahb var1, int var2, int var3, int var4) {
      return var1.method_33(var2, var3, var4) & 3;
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      return (var2 & 3) == 1?this.field_2060[this.field_2059][1]:this.field_2060[this.field_2059][0];
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void method_2519(adb var1, class_872 var2, List var3) {
      add var10001 = new add;
      var10001.method_3726(var1, 1, 0);
      var3.add(var10001);
      var10001 = new add;
      var10001.method_3726(var1, 1, 1);
      var3.add(var10001);
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < field_2064.length) {
         this.field_2060[var3] = new class_73[field_2064[var3].length];
         int var4 = 0;

         while(true) {
            if(var4 < field_2064[var3].length) {
               this.field_2060[var3][var4] = var1.method_375(field_2064[var3][var4]);
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
      return field_2065;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
