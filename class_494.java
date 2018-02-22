
// $FF: renamed from: aY
class class_494 extends class_492 {

   // $FF: renamed from: a java.lang.String
   private static final String field_2294 = "CL_00001755";
   // $FF: renamed from: g int
   final int field_2295;
   // $FF: renamed from: h Ar
   final class_680 field_2296;


   // $FF: renamed from: <init> (Ar, vI, int, int, int, int) void
   void method_2887(class_680 var1, class_22 var2, int var3, int var4, int var5, int var6) {
      this.field_2296 = var1;
      this.field_2295 = var6;
      super.method_2869(var2, var3, var4, var5);
   }

   // $FF: renamed from: d () int
   public int method_2879() {
      return 1;
   }

   // $FF: renamed from: b (add) boolean
   public boolean method_2874(add var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = var1;
      int var4;
      if(var2 != null) {
         if(var1 == null) {
            var4 = 0;
            return (boolean)var4;
         }

         var10000 = var1;
      }

      adb var3 = var10000.method_3730();
      if(var2 != null) {
         if(var3 instanceof class_525) {
            var4 = ((class_525)var1.method_3730()).field_2365;
            if(var2 != null) {
               var4 = var4 == this.field_2295?1:0;
            }

            return (boolean)var4;
         }

         var3 = var1.method_3730();
      }

      label37: {
         adb var10001 = adb.method_2920(class_1192.field_6112);
         if(var2 != null) {
            if(var3 == var10001) {
               break label37;
            }

            var3 = var1.method_3730();
            var10001 = class_1010.field_5253;
         }

         if(var3 != var10001) {
            var4 = 0;
            return (boolean)var4;
         }
      }

      var4 = this.field_2295;
      if(var2 != null) {
         var4 = this.field_2295 == 0?1:0;
      }

      return (boolean)var4;
   }

   // $FF: renamed from: e () vL
   public IIcon method_2880() {
      return class_525.method_2996(this.field_2295);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2888() {
      boolean var10000 = true;
      char[] var10003 = "·o4à[}Ìlj".toCharArray();
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
            field_2294 = (new String((char[])var4)).intern();
            String var2 = field_2294;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 12;
            break;
         case 1:
            var10009 = 187;
            break;
         case 2:
            var10009 = 25;
            break;
         case 3:
            var10009 = 31;
            break;
         case 4:
            var10009 = 68;
            break;
         case 5:
            var10009 = 144;
            break;
         default:
            var10009 = 43;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
