import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.tuple.ImmutablePair;

// $FF: renamed from: ft
public class class_364 extends aji {

   // $FF: renamed from: M java.lang.String[]
   public static final String[] field_2026;


   // $FF: renamed from: <init> () void
   public void method_2547() {
      super.method_2427(awt.field_4197);
      this.method_2437(0.0F);
      this.method_2521(class_872.field_4245);
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      switch(var2) {
      case 1:
         return class_1192.field_6029.getBlockTextureFromSide(var1);
      case 2:
         return class_1192.field_6123.getBlockTextureFromSide(var1);
      case 3:
         return class_1192.field_6123.method_2448(var1, 1);
      case 4:
         return class_1192.field_6123.method_2448(var1, 2);
      case 5:
         return class_1192.field_6123.method_2448(var1, 3);
      default:
         return class_1192.field_6026.getBlockTextureFromSide(var1);
      }
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {}

   // $FF: renamed from: b (ahb, int, int, int, int) void
   public void method_2458(ahb var1, int var2, int var3, int var4, int var5) {
      if(!var1.field_1832) {
         class_787 var10000 = new class_787;
         var10000.method_3847(var1);
         class_787 var6 = var10000;
         var6.method_3887((double)var2 + 0.5D, (double)var3, (double)var4 + 0.5D, 0.0F, 0.0F);
         var1.method_2089(var6);
         var6.method_4265();
      }

      super.method_2458(var1, var2, var3, var4, var5);
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 0;
   }

   // $FF: renamed from: d (aji) boolean
   public static boolean method_2548(aji var0) {
      boolean var2;
      label28: {
         String[] var1 = class_752.method_4253();
         aji var10000 = var0;
         aji var10001 = class_1192.field_6026;
         if(var1 != null) {
            if(var0 == class_1192.field_6026) {
               break label28;
            }

            var10000 = var0;
            var10001 = class_1192.field_6029;
         }

         if(var1 != null) {
            if(var10000 == var10001) {
               break label28;
            }

            var10000 = var0;
            var10001 = class_1192.field_6123;
         }

         if(var10000 != var10001) {
            var2 = false;
            return var2;
         }
      }

      var2 = true;
      return var2;
   }

   // $FF: renamed from: b (aji, int) int
   public static int method_2549(aji var0, int var1) {
      String[] var2 = class_752.method_4253();
      int var3;
      if(var1 == 0) {
         aji var10000 = var0;
         aji var10001 = class_1192.field_6029;
         if(var2 != null) {
            if(var0 == class_1192.field_6029) {
               return 1;
            }

            var10000 = var0;
            var10001 = class_1192.field_6123;
         }

         if(var10000 == var10001) {
            return 2;
         }
      } else if(var0 == class_1192.field_6123) {
         var3 = var1;
         if(var2 == null) {
            return var3;
         }

         switch(var1) {
         case 1:
            return 3;
         case 2:
            return 4;
         case 3:
            return 5;
         }
      }

      var3 = 0;
      return var3;
   }

   // $FF: renamed from: c (int) org.apache.commons.lang3.tuple.ImmutablePair
   public static ImmutablePair method_2550(int var0) {
      switch(var0) {
      case 1:
         return new ImmutablePair(class_1192.field_6029, Integer.valueOf(0));
      case 2:
         return new ImmutablePair(class_1192.field_6123, Integer.valueOf(0));
      case 3:
         return new ImmutablePair(class_1192.field_6123, Integer.valueOf(1));
      case 4:
         return new ImmutablePair(class_1192.field_6123, Integer.valueOf(2));
      case 5:
         return new ImmutablePair(class_1192.field_6123, Integer.valueOf(3));
      default:
         return new ImmutablePair(class_1192.field_6026, Integer.valueOf(0));
      }
   }

   // $FF: renamed from: j (int) add
   protected add method_2503(int var1) {
      add var10000;
      switch(var1) {
      case 1:
         var10000 = new add;
         var10000.method_3721(class_1192.field_6029);
         return var10000;
      case 2:
         var10000 = new add;
         var10000.method_3721(class_1192.field_6123);
         return var10000;
      case 3:
         var10000 = new add;
         var10000.method_3723(class_1192.field_6123, 1, 1);
         return var10000;
      case 4:
         var10000 = new add;
         var10000.method_3723(class_1192.field_6123, 1, 2);
         return var10000;
      case 5:
         var10000 = new add;
         var10000.method_3723(class_1192.field_6123, 1, 3);
         return var10000;
      default:
         var10000 = new add;
         var10000.method_3721(class_1192.field_6026);
         return var10000;
      }
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, int) void
   public void method_2467(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      if(!var1.field_1832) {
         class_787 var10000 = new class_787;
         var10000.method_3847(var1);
         class_787 var8 = var10000;
         var8.method_3887((double)var2 + 0.5D, (double)var3, (double)var4 + 0.5D, 0.0F, 0.0F);
         var1.method_2089(var8);
         var8.method_4265();
      }

   }

   // $FF: renamed from: k (ahb, int, int, int) int
   public int method_2518(ahb var1, int var2, int var3, int var4) {
      return var1.method_33(var2, var3, var4);
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void method_2519(adb var1, class_872 var2, List var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var4 = var10000;

      while(var5 < field_2026.length) {
         add var10001 = new add;
         var10001.method_3726(var1, 1, var5);
         var3.add(var10001);
         ++var5;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
