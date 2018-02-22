
// $FF: renamed from: er
public class class_393 extends class_392 {

   // $FF: renamed from: O vL
   private class_73 field_2087;
   // $FF: renamed from: P java.lang.String
   private static final String field_2088 = "_turned";


   // $FF: renamed from: <init> () void
   protected void method_2618() {
      super.method_2614(false);
   }

   // $FF: renamed from: a (int, int) vL
   public class_73 method_2448(int var1, int var2) {
      return var2 >= 6?this.field_2087:this.field_2010;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      super.method_2535(var1);
      this.field_2087 = var1.method_375(this.method_2533() + "_turned");
   }

   // $FF: renamed from: b (ahb, int, int, int, int, int, aji) void
   protected void method_2616(ahb var1, int var2, int var3, int var4, int var5, int var6, aji var7) {
      String[] var8 = class_752.method_4253();
      int var10000 = var7.method_2497();
      if(var8 != null) {
         if(var10000 == 0) {
            return;
         }

         class_979 var9 = new class_979;
         var9.method_5626(this, var1, var2, var3, var4);
         var10000 = var9.method_5633();
      }

      if(var10000 == 3) {
         this.method_2617(var1, var2, var3, var4, false);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "y¹·Yó®".toCharArray();
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
            field_2088 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 154;
            break;
         case 1:
            var10009 = 93;
            break;
         case 2:
            var10009 = 156;
            break;
         case 3:
            var10009 = 149;
            break;
         case 4:
            var10009 = 103;
            break;
         case 5:
            var10009 = 198;
            break;
         default:
            var10009 = 154;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
