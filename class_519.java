
// $FF: renamed from: cb
public class class_519 extends adb {

   // $FF: renamed from: o java.lang.String
   private static final String field_2358 = "mob.horse.leather";


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.field_2333 = 1;
      this.method_2974(class_872.field_4247);
   }

   // $FF: renamed from: a (add, yz, sv) boolean
   public boolean method_2940(add var1, class_792 var2, class_752 var3) {
      String[] var4 = class_752.method_4253();
      boolean var10000 = var3 instanceof class_771;
      if(var4 != null) {
         if(var10000) {
            class_771 var5 = (class_771)var3;
            var10000 = var5.method_4395();
            if(var4 != null) {
               if(!var10000) {
                  var10000 = var5.method_4159();
                  if(var4 == null) {
                     return var10000;
                  }

                  if(!var10000) {
                     var5.method_4396(true);
                     var5.field_2990.method_2082(var5, "mob.horse.leather", 0.5F, 1.0F);
                     --var1.field_2958;
                  }
               }

               var10000 = true;
            }

            return var10000;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: a (add, sv, sv) boolean
   public boolean method_2937(add var1, class_752 var2, class_752 var3) {
      this.method_2940(var1, (class_792)null, var2);
      return true;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      boolean var10000 = true;
      char[] var10003 = " e*yúÇ)htôÁu".toCharArray();
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
            field_2358 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 222;
            break;
         case 1:
            var10009 = 193;
            break;
         case 2:
            var10009 = 180;
            break;
         case 3:
            var10009 = 183;
            break;
         case 4:
            var10009 = 162;
            break;
         case 5:
            var10009 = 38;
            break;
         default:
            var10009 = 6;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
