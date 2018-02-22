
// $FF: renamed from: b2
public class class_556 extends adb {

   // $FF: renamed from: n java.lang.Class
   private final Class field_2420;
   // $FF: renamed from: o java.lang.String
   private static final String field_2421 = "CL_00000038";


   // $FF: renamed from: <init> (java.lang.Class) void
   public void getBlock38(Class var1) {
      super.method_2917();
      this.field_2420 = var1;
      this.method_2974(class_872.field_4245);
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var11 = class_752.method_4253();
      int var10000 = var7;
      if(var11 != null) {
         if(var7 == 0) {
            return false;
         }

         var10000 = var7;
      }

      if(var11 != null) {
         if(var10000 == 1) {
            return false;
         }

         var10000 = class_1649.field_8591[var7];
      }

      int var12 = var10000;
      class_748 var13 = this.getBlock39(var3, var4, var5, var6, var12);
      boolean var14 = var2.method_4628(var4, var5, var6, var7, var1);
      if(var11 != null) {
         if(var14) {
            label58: {
               class_748 var15 = var13;
               if(var11 != null) {
                  if(var13 == null) {
                     break label58;
                  }

                  var15 = var13;
               }

               var14 = var15.method_4142();
               if(var11 == null) {
                  return var14;
               }

               if(var14) {
                  if(var11 != null && !var3.field_1832) {
                     var3.method_2089(var13);
                  }

                  --var1.field_2958;
               }
            }

            var14 = true;
            return var14;
         }

         var14 = false;
      }

      return var14;
   }

   // $FF: renamed from: b (ahb, int, int, int, int) wD
   private class_748 getBlock39(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      Class var10000 = this.field_2420;
      Class var10001 = class_749.class;
      Object var7;
      if(var6 != null) {
         if(this.field_2420 == class_749.class) {
            var7 = new class_749;
            ((class_749)var7).method_4139(var1, var2, var3, var4, var5);
            return (class_748)var7;
         }

         var10000 = this.field_2420;
         var10001 = class_751.class;
      }

      if(var10000 == var10001) {
         var7 = new class_751;
         ((class_751)var7).method_4139(var1, var2, var3, var4, var5);
      } else {
         var7 = null;
      }

      return (class_748)var7;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      boolean var10000 = true;
      char[] var10003 = "l\fE¿[¿p)·".toCharArray();
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
            field_2421 = (new String((char[])var4)).intern();
            String var2 = field_2421;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 165;
            break;
         case 1:
            var10009 = 202;
            break;
         case 2:
            var10009 = 144;
            break;
         case 3:
            var10009 = 5;
            break;
         case 4:
            var10009 = 225;
            break;
         case 5:
            var10009 = 5;
            break;
         default:
            var10009 = 42;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
