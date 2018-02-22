
// $FF: renamed from: ev
public class class_452 extends class_450 {

   // $FF: renamed from: O vL[]
   private IIcon[] field_2203;
   // $FF: renamed from: P java.lang.String
   private static final String field_2204 = "_stage_";


   // $FF: renamed from: <init> () void
   public void method_2770() {
      super.method_2770();
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      int var10000;
      label25: {
         String[] var3 = class_752.method_4253();
         var10000 = var2;
         byte var10001 = 7;
         if(var3 != null) {
            if(var2 >= 7) {
               return this.field_2203[3];
            }

            var10000 = var2;
            if(var3 == null) {
               break label25;
            }

            var10001 = 6;
         }

         if(var10000 != var10001) {
            return this.field_2203[var2 >> 1];
         }

         var10000 = 5;
      }

      var2 = var10000;
      return this.field_2203[var2 >> 1];
   }

   // $FF: renamed from: e () adb
   protected adb method_2784() {
      return class_1010.field_5247;
   }

   // $FF: renamed from: i () adb
   protected adb method_2785() {
      return class_1010.field_5247;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_2203 = new IIcon[4];
      String[] var2 = var10000;
      int var3 = 0;

      while(var3 < this.field_2203.length) {
         this.field_2203[var3] = var1.method_375(this.method_2533() + "_stage_" + var3);
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "[º9®7e".toCharArray();
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
            field_2204 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 73;
            break;
         case 1:
            var10009 = 41;
            break;
         case 2:
            var10009 = 131;
            break;
         case 3:
            var10009 = 21;
            break;
         case 4:
            var10009 = 132;
            break;
         case 5:
            var10009 = 31;
            break;
         default:
            var10009 = 119;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
