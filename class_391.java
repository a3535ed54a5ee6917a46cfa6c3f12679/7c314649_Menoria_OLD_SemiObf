import java.util.List;

// $FF: renamed from: fQ
public class class_391 extends aji {

   // $FF: renamed from: M java.lang.String[]
   public static final String[] field_2082;
   // $FF: renamed from: N java.lang.String[]
   public static final String[] field_2083;
   // $FF: renamed from: O vL[]
   private class_73[] field_2084;


   // $FF: renamed from: <init> () void
   public void method_2611() {
      super.method_2427(awt.field_4174);
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var2;
      if(var3 != null) {
         label17: {
            if(var2 >= 0) {
               var10000 = var2;
               if(var3 == null) {
                  break label17;
               }

               if(var2 < field_2083.length) {
                  return this.field_2084[var2];
               }
            }

            var10000 = 0;
         }
      }

      var2 = var10000;
      return this.field_2084[var2];
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

      while(var5 < 4) {
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
   public void method_2535(class_74 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_2084 = new class_73[field_2083.length];
      String[] var2 = var10000;
      int var3 = 0;

      while(var3 < this.field_2084.length) {
         String var4 = this.method_2533();
         if(var2 != null) {
            if(field_2083[var3] != null) {
               var4 = var4 + "_" + field_2083[var3];
            }

            this.field_2084[var3] = var1.method_375(var4);
            ++var3;
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
