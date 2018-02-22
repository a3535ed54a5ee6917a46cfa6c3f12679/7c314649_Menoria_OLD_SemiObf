import java.util.List;
import java.util.Random;

// $FF: renamed from: fh
public class class_374 extends class_373 {

   // $FF: renamed from: O vL[]
   private static final class_73[] field_2046;
   // $FF: renamed from: P java.lang.String
   private static final String field_2047 = "glass";


   // $FF: renamed from: <init> (awt) void
   public void method_2427(awt var1) {
      super.method_2576("glass", var1, false);
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      return field_2046[var2 % field_2046.length];
   }

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      return var1;
   }

   // $FF: renamed from: c (int) int
   public static int method_2577(int var0) {
      return ~var0 & 15;
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void method_2519(adb var1, class_872 var2, List var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var4 = var10000;

      while(var5 < field_2046.length) {
         add var10001 = new add;
         var10001.method_3726(var1, 1, var5);
         var3.add(var10001);
         ++var5;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: w () int
   public int method_2477() {
      return 1;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < field_2046.length) {
         field_2046[var3] = var1.method_375(this.method_2533() + "_" + class_537.field_2386[method_2577(var3)]);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 0;
   }

   // $FF: renamed from: E () boolean
   protected boolean method_2502() {
      return true;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "Í±(".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_2047 = (new String((char[])var3)).intern();
            field_2046 = new class_73[16];
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 20;
            break;
         case 1:
            var10009 = 99;
            break;
         case 2:
            var10009 = 247;
            break;
         case 3:
            var10009 = 85;
            break;
         case 4:
            var10009 = 76;
            break;
         case 5:
            var10009 = 249;
            break;
         default:
            var10009 = 88;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
