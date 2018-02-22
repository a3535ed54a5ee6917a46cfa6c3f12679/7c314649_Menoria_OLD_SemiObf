
// $FF: renamed from: gr
public class class_590 extends class_589 {

   // $FF: renamed from: p java.lang.String
   private static final String field_2520 = "container.dropper";


   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super.getBlock88();
   }

   // $FF: renamed from: i () java.lang.String
   public String method_88() {
      String[] var1 = class_752.method_4253();
      class_590 var10000 = this;
      String var2;
      if(var1 != null) {
         if(!this.method_89()) {
            var2 = "container.dropper";
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.field_2518;
      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3108() {
      boolean var10000 = true;
      char[] var10003 = "tÔòÍ.r\nâÞ0gÈ".toCharArray();
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
            field_2520 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 156;
            break;
         case 1:
            var10009 = 243;
            break;
         case 2:
            var10009 = 49;
            break;
         case 3:
            var10009 = 13;
            break;
         case 4:
            var10009 = 39;
            break;
         case 5:
            var10009 = 123;
            break;
         default:
            var10009 = 203;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
