
// $FF: renamed from: aX
class class_495 extends class_492 {

   // $FF: renamed from: a java.lang.String
   private static final String field_2297 = "CL_00001753";
   // $FF: renamed from: g wR
   final class_772 field_2298;
   // $FF: renamed from: h Aq
   final class_681 field_2299;


   // $FF: renamed from: <init> (Aq, vI, int, int, int, wR) void
   void method_2889(class_681 var1, class_22 var2, int var3, int var4, int var5, class_772 var6) {
      this.field_2299 = var1;
      this.field_2298 = var6;
      super.method_2869(var2, var3, var4, var5);
   }

   // $FF: renamed from: b (add) boolean
   public boolean method_2874(add var1) {
      boolean var10000;
      label32: {
         String[] var2 = class_752.method_4253();
         var10000 = super.method_2874(var1);
         if(var2 != null) {
            if(!var10000) {
               break label32;
            }

            var10000 = this.field_2298.method_4447();
         }

         if(var2 != null) {
            if(!var10000) {
               break label32;
            }

            var10000 = class_772.method_4469(var1.method_3730());
         }

         if(var2 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: f () boolean
   public boolean method_2884() {
      return this.field_2298.method_4447();
   }

   // $FF: renamed from: <clinit> () void
   static void method_2890() {
      boolean var10000 = true;
      char[] var10003 = "½û¶KW+Ïùµ".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_2297 = (new String((char[])var4)).intern();
            String var2 = field_2297;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 163;
            break;
         case 1:
            var10009 = 234;
            break;
         case 2:
            var10009 = 145;
            break;
         case 3:
            var10009 = 219;
            break;
         case 4:
            var10009 = 38;
            break;
         case 5:
            var10009 = 58;
            break;
         default:
            var10009 = 70;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
