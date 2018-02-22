
// $FF: renamed from: a3
class class_501 extends class_492 {

   // $FF: renamed from: a java.lang.String
   private static final String field_2310 = "CL_00001736";
   // $FF: renamed from: g Ax
   final class_674 field_2311;


   // $FF: renamed from: <init> (Ax, vI, int, int, int) void
   public void method_2901(class_674 var1, class_22 var2, int var3, int var4, int var5) {
      this.field_2311 = var1;
      super.method_2869(var2, var3, var4, var5);
   }

   // $FF: renamed from: b (add) boolean
   public boolean method_2874(add var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = var1;
      boolean var4;
      if(var2 != null) {
         if(var1 == null) {
            var4 = false;
            return var4;
         }

         var10000 = var1;
      }

      label46: {
         adb var3 = var10000.method_3730();
         adb var10001 = class_1010.field_5244;
         if(var2 != null) {
            if(var3 == class_1010.field_5244) {
               break label46;
            }

            var3 = var1.method_3730();
            var10001 = class_1010.field_5122;
         }

         if(var2 != null) {
            if(var3 == var10001) {
               break label46;
            }

            var3 = var1.method_3730();
            var10001 = class_1010.field_5124;
         }

         if(var2 != null) {
            if(var3 == var10001) {
               break label46;
            }

            var3 = var1.method_3730();
            var10001 = class_1010.field_5123;
         }

         if(var3 != var10001) {
            var4 = false;
            return var4;
         }
      }

      var4 = true;
      return var4;
   }

   // $FF: renamed from: d () int
   public int method_2879() {
      return 1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2902() {
      boolean var10000 = true;
      char[] var10003 = "¿O¨â-·úÍ4Ää".toCharArray();
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
            field_2310 = (new String((char[])var4)).intern();
            String var2 = field_2310;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 93;
            break;
         case 1:
            var10009 = 162;
            break;
         case 2:
            var10009 = 86;
            break;
         case 3:
            var10009 = 115;
            break;
         case 4:
            var10009 = 188;
            break;
         case 5:
            var10009 = 38;
            break;
         default:
            var10009 = 107;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
