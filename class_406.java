import java.util.List;

// $FF: renamed from: fI
public class class_406 extends aji {

   // $FF: renamed from: M java.lang.String[]
   public static final String[] field_2106;
   // $FF: renamed from: N java.lang.String[]
   private static final String[] field_2107;
   // $FF: renamed from: O vL[]
   private class_73[] field_2108;
   // $FF: renamed from: P vL
   private class_73 field_2109;
   // $FF: renamed from: Q vL
   private class_73 field_2110;
   // $FF: renamed from: R java.lang.String[]
   private static final String[] field_2111;


   // $FF: renamed from: <init> () void
   public void method_2647() {
      super.method_2427(awt.field_4174);
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 == 1) {
            return this.field_2109;
         }

         var10000 = var1;
      }

      if(var3 != null) {
         label51: {
            if(var10000 == 0) {
               var10000 = var2;
               byte var10001 = 1;
               if(var3 != null) {
                  if(var2 == 1) {
                     return this.field_2109;
                  }

                  var10000 = var2;
                  if(var3 == null) {
                     break label51;
                  }

                  var10001 = 2;
               }

               if(var10000 == var10001) {
                  return this.field_2109;
               }
            }

            var10000 = var1;
         }
      }

      if(var3 != null) {
         if(var10000 == 0) {
            return this.field_2110;
         }

         var10000 = var2;
      }

      if(var3 != null) {
         label36: {
            if(var10000 >= 0) {
               var10000 = var2;
               if(var3 == null) {
                  break label36;
               }

               if(var2 < this.field_2108.length) {
                  return this.field_2108[var2];
               }
            }

            var10000 = 0;
         }
      }

      var2 = var10000;
      return this.field_2108[var2];
   }

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      return var1;
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

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_2108 = new class_73[field_2107.length];
      int var3 = 0;
      String[] var2 = var10000;

      while(true) {
         if(var3 < this.field_2108.length) {
            this.field_2108[var3] = var1.method_375(this.method_2533() + "_" + field_2107[var3]);
            ++var3;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         StringBuilder var10002 = (new StringBuilder()).append(this.method_2533());
         String[] var4 = field_2111;
         this.field_2109 = var1.method_375(var10002.append("_top").toString());
         this.field_2110 = var1.method_375(this.method_2533() + "_bottom");
         break;
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
