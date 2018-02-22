
// $FF: renamed from: bW
public class class_527 extends adb {

   // $FF: renamed from: o java.lang.String
   private static final String field_2373 = "fire.ignite";


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.field_2333 = 1;
      this.method_2935(64);
      this.method_2974(class_872.fontRendererInstance1);
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var11 = class_752.method_4253();
      int var10000 = var7;
      if(var11 != null) {
         if(var7 == 0) {
            --var5;
         }

         var10000 = var7;
      }

      byte var10001 = 1;
      if(var11 != null) {
         if(var10000 == 1) {
            ++var5;
         }

         var10000 = var7;
         var10001 = 2;
      }

      if(var11 != null) {
         if(var10000 == var10001) {
            --var6;
         }

         var10000 = var7;
         var10001 = 3;
      }

      if(var11 != null) {
         if(var10000 == var10001) {
            ++var6;
         }

         var10000 = var7;
         var10001 = 4;
      }

      label74: {
         if(var11 != null) {
            if(var10000 == var10001) {
               --var4;
            }

            var10000 = var7;
            if(var11 == null) {
               break label74;
            }

            var10001 = 5;
         }

         if(var10000 == var10001) {
            ++var4;
         }

         var10000 = var2.method_4628(var4, var5, var6, var7, var1);
      }

      if(var11 != null) {
         if(var10000 != 0) {
            label54: {
               ahb var12 = var3;
               int var13 = var4;
               int var10002 = var5;
               int var10003 = var6;
               if(var11 != null) {
                  if(var3.getBlock(var4, var5, var6).method_2424() != awt.field_4170) {
                     break label54;
                  }

                  var3.method_2084((double)var4 + 0.5D, (double)var5 + 0.5D, (double)var6 + 0.5D, "fire.ignite", 1.0F, field_2332.nextFloat() * 0.4F + 0.8F);
                  var12 = var3;
                  var13 = var4;
                  var10002 = var5;
                  var10003 = var6;
               }

               var12.method_2058(var13, var10002, var10003, class_1192.field_6078);
            }

            var1.method_3749(1, var2);
            return true;
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      boolean var10000 = true;
      char[] var10003 = "«øeà¤Á£øcà".toCharArray();
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
            field_2373 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 1;
            break;
         case 1:
            var10009 = 93;
            break;
         case 2:
            var10009 = 219;
            break;
         case 3:
            var10009 = 73;
            break;
         case 4:
            var10009 = 102;
            break;
         case 5:
            var10009 = 1;
            break;
         default:
            var10009 = 106;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
