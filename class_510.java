
// $FF: renamed from: ck
public class class_510 extends adb {

   // $FF: renamed from: o java.lang.String
   private static final String field_2345 = "pages";


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.method_2922(1);
   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add var1, ahb var2, class_792 var3) {
      var3.method_4591(var1);
      return var1;
   }

   // $FF: renamed from: s () boolean
   public boolean method_2950() {
      return true;
   }

   // $FF: renamed from: b (ro) boolean
   public static boolean method_2983(class_1583 var0) {
      String[] var1 = class_752.method_4253();
      class_1583 var10000 = var0;
      if(var1 != null) {
         if(var0 == null) {
            return false;
         }

         var10000 = var0;
      }

      String var10001 = "pages";
      byte var10002 = 9;
      if(var1 != null) {
         if(!var10000.initGui8("pages", 9)) {
            return false;
         }

         var10000 = var0;
         var10001 = "pages";
         var10002 = 8;
      }

      class_1580 var2 = var10000.method_8689(var10001, var10002);
      int var3 = 0;

      while(true) {
         if(var3 < var2.method_8658()) {
            String var4 = var2.method_8657(var3);
            String var5 = var4;
            if(var1 != null) {
               if(var4 == null) {
                  return false;
               }

               var5 = var4;
            }

            int var6 = var5.length();
            if(var1 != null) {
               if(var6 <= 256) {
                  ++var3;
                  if(var1 != null) {
                     continue;
                  }

                  return true;
               }

               var6 = 0;
            }

            return (boolean)var6;
         }

         return true;
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      boolean var10000 = true;
      char[] var10003 = " Õô?".toCharArray();
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
            field_2345 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 225;
            break;
         case 1:
            var10009 = 133;
            break;
         case 2:
            var10009 = 194;
            break;
         case 3:
            var10009 = 160;
            break;
         case 4:
            var10009 = 125;
            break;
         case 5:
            var10009 = 82;
            break;
         default:
            var10009 = 249;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
