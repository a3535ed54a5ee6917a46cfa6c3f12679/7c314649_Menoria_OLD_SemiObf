import java.util.List;
import java.util.Random;

// $FF: renamed from: fc
public class class_379 extends class_378 {

   // $FF: renamed from: N java.lang.String[]
   public static final String[] field_2053;


   // $FF: renamed from: <init> (boolean) void
   public void method_2586(boolean var1) {
      super.method_2583(var1, awt.field_4173);
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      return class_1192.field_6030.method_2448(var1, var2 & 7);
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return adb.method_2920(class_1192.field_6150);
   }

   // $FF: renamed from: j (int) add
   protected add method_2503(int var1) {
      add var10000 = new add;
      var10000.method_3726(adb.method_2920(class_1192.field_6150), 2, var1 & 7);
      return var10000;
   }

   // $FF: renamed from: c (int) java.lang.String
   public String method_2585(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         label17: {
            if(var1 >= 0) {
               var10000 = var1;
               if(var2 == null) {
                  break label17;
               }

               if(var1 < field_2053.length) {
                  return super.method_2510() + "." + field_2053[var1];
               }
            }

            var10000 = 0;
         }
      }

      var1 = var10000;
      return super.method_2510() + "." + field_2053[var1];
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void method_2519(adb var1, class_872 var2, List var3) {
      String[] var4 = class_752.method_4253();
      if(var1 != adb.method_2920(class_1192.field_6149)) {
         int var5 = 0;

         while(var5 < field_2053.length) {
            add var10001 = new add;
            var10001.method_3726(var1, 1, var5);
            var3.add(var10001);
            ++var5;
            if(var4 == null) {
               break;
            }
         }

      }
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {}

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
