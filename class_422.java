import java.util.List;

// $FF: renamed from: f6
public class class_422 extends aji {

   // $FF: renamed from: M java.lang.String[]
   public static final String[] field_2149;
   // $FF: renamed from: N vL[]
   private class_73[] field_2150;


   // $FF: renamed from: <init> () void
   public void method_2695() {
      super.method_2427(awt.field_4173);
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

               if(var2 < this.field_2150.length) {
                  return this.field_2150[var2];
               }
            }

            var10000 = 0;
         }
      }

      var2 = var10000;
      return this.field_2150[var2];
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
      var10001 = new add;
      var10001.method_3726(var1, 1, 3);
      var3.add(var10001);
      var10001 = new add;
      var10001.method_3726(var1, 1, 4);
      var3.add(var10001);
      var10001 = new add;
      var10001.method_3726(var1, 1, 5);
      var3.add(var10001);
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_2150 = new class_73[field_2149.length];
      String[] var2 = var10000;
      int var3 = 0;

      while(var3 < this.field_2150.length) {
         this.field_2150[var3] = var1.method_375(this.method_2533() + "_" + field_2149[var3]);
         ++var3;
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
