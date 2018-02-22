
// $FF: renamed from: ew
public class class_451 extends class_450 {

   // $FF: renamed from: O vL[]
   private class_73[] field_2201;
   // $FF: renamed from: P java.lang.String
   private static final String field_2202 = "_stage_";


   // $FF: renamed from: <init> () void
   public void method_2770() {
      super.method_2770();
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      int var10000;
      label25: {
         String[] var3 = class_752.method_4253();
         var10000 = var2;
         byte var10001 = 7;
         if(var3 != null) {
            if(var2 >= 7) {
               return this.field_2201[3];
            }

            var10000 = var2;
            if(var3 == null) {
               break label25;
            }

            var10001 = 6;
         }

         if(var10000 != var10001) {
            return this.field_2201[var2 >> 1];
         }

         var10000 = 5;
      }

      var2 = var10000;
      return this.field_2201[var2 >> 1];
   }

   // $FF: renamed from: e () adb
   protected adb method_2784() {
      return class_1010.field_5248;
   }

   // $FF: renamed from: i () adb
   protected adb method_2785() {
      return class_1010.field_5248;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, int) void
   public void method_2467(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      String[] var10000 = class_752.method_4253();
      super.method_2467(var1, var2, var3, var4, var5, var6, var7);
      String[] var8 = var10000;
      int var9 = var1.field_1832;
      if(var8 != null) {
         if(var1.field_1832) {
            return;
         }

         var9 = var5;
      }

      if(var8 != null) {
         if(var9 < 7) {
            return;
         }

         var9 = var1.field_1819.nextInt(50);
      }

      if(var9 == 0) {
         add var10005 = new add;
         var10005.method_3724(class_1010.field_5250);
         this.method_2468(var1, var2, var3, var4, var10005);
      }

   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_2201 = new class_73[4];
      String[] var2 = var10000;
      int var3 = 0;

      while(var3 < this.field_2201.length) {
         this.field_2201[var3] = var1.method_375(this.method_2533() + "_stage_" + var3);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "JhE«\b".toCharArray();
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
            field_2202 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 71;
            break;
         case 1:
            var10009 = 190;
            break;
         case 2:
            var10009 = 155;
            break;
         case 3:
            var10009 = 163;
            break;
         case 4:
            var10009 = 75;
            break;
         case 5:
            var10009 = 243;
            break;
         default:
            var10009 = 208;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
