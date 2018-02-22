
// $FF: renamed from: aS
class class_500 extends class_492 {

   // $FF: renamed from: a java.lang.String
   private static final String field_2308 = "CL_00001738";
   // $FF: renamed from: g Ay
   final class_673 field_2309;


   // $FF: renamed from: <init> (Ay, vI, int, int, int) void
   public void method_2899(class_673 var1, class_22 var2, int var3, int var4, int var5) {
      this.field_2309 = var1;
      super.method_2869(var2, var3, var4, var5);
   }

   // $FF: renamed from: b (add) boolean
   public boolean method_2874(add var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = var1;
      boolean var3;
      if(var2 != null) {
         if(var1 == null) {
            var3 = false;
            return var3;
         }

         var10000 = var1;
      }

      var3 = var10000.method_3730().method_2962(var1);
      return var3;
   }

   // $FF: renamed from: d () int
   public int method_2879() {
      return 64;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2900() {
      boolean var10000 = true;
      char[] var10003 = "¿Á^ô@Íº2".toCharArray();
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
            field_2308 = (new String((char[])var4)).intern();
            String var2 = field_2308;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 186;
            break;
         case 1:
            var10009 = 203;
            break;
         case 2:
            var10009 = 71;
            break;
         case 3:
            var10009 = 240;
            break;
         case 4:
            var10009 = 130;
            break;
         case 5:
            var10009 = 54;
            break;
         default:
            var10009 = 121;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
