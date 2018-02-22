import java.util.Random;

// $FF: renamed from: fe
public class class_377 extends class_373 {

   // $FF: renamed from: O java.lang.String
   private static final String field_2051 = "glass";


   // $FF: renamed from: <init> (awt, boolean) void
   public void method_2582(awt var1, boolean var2) {
      super.method_2576("glass", var1, var2);
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 0;
   }

   // $FF: renamed from: w () int
   public int method_2477() {
      return 0;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: E () boolean
   protected boolean method_2502() {
      return true;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "ô »".toCharArray();
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
            field_2051 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 251;
            break;
         case 1:
            var10009 = 112;
            break;
         case 2:
            var10009 = 154;
            break;
         case 3:
            var10009 = 92;
            break;
         case 4:
            var10009 = 199;
            break;
         case 5:
            var10009 = 114;
            break;
         default:
            var10009 = 62;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
