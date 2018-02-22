
// $FF: renamed from: ch
public class class_513 extends adb {

   // $FF: renamed from: o java.lang.String
   private static final String field_2351 = "random.bow";


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.field_2333 = 16;
      this.method_2974(class_872.field_4248);
   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add var1, ahb var2, class_792 var3) {
      String[] var4 = class_752.method_4253();
      boolean var10000 = var3.field_3640.field_2839;
      if(var4 != null) {
         if(!var3.field_3640.field_2839) {
            --var1.field_2958;
         }

         var2.method_2082(var3, "random.bow", 0.5F, 0.4F / (field_2332.nextFloat() * 0.4F + 0.8F));
         var10000 = var2.field_1832;
      }

      if(var4 != null && !var10000) {
         class_802 var10001 = new class_802;
         var10001.method_4682(var2, var3);
         var2.method_2089(var10001);
      }

      return var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      boolean var10000 = true;
      char[] var10003 = "º¯håÌª¡q".toCharArray();
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
            field_2351 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 83;
            break;
         case 1:
            var10009 = 85;
            break;
         case 2:
            var10009 = 157;
            break;
         case 3:
            var10009 = 125;
            break;
         case 4:
            var10009 = 17;
            break;
         case 5:
            var10009 = 58;
            break;
         default:
            var10009 = 164;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
