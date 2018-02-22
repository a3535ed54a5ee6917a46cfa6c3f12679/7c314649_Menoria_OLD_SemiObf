
// $FF: renamed from: b6
public class class_552 extends adb {

   // $FF: renamed from: n q1
   private static final class_41 field_2415;
   // $FF: renamed from: o int
   public int field_2416;
   // $FF: renamed from: p java.lang.String
   private static final String field_2417 = "CL_00000049";


   // $FF: renamed from: <init> (int) void
   public void getBlock34(int var1) {
      super.method_2917();
      this.field_2333 = 1;
      this.field_2416 = var1;
      this.method_2974(class_872.field_4247);
      class_484.field_2263.method_189(this, field_2415);
   }

   // $FF: renamed from: a (add, yz, ahb, int, int, int, int, float, float, float) boolean
   public boolean method_2926(add var1, class_792 var2, ahb var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
      String[] var11 = class_752.method_4253();
      boolean var10000 = class_392.method_2613(var3.getBlock(var4, var5, var6));
      if(var11 != null) {
         if(var10000) {
            var10000 = var3.field_1832;
            if(var11 != null) {
               if(!var3.field_1832) {
                  class_690 var12 = class_690.method_3979(var3, (double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), this.field_2416);
                  var10000 = var1.method_3773();
                  if(var11 != null) {
                     if(var10000) {
                        var12.method_4006(var1.method_3770());
                     }

                     var3.method_2089(var12);
                  }
               }

               --var1.field_2958;
               var10000 = true;
            }

            return var10000;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      boolean var10000 = true;
      char[] var10003 = "2¥D[doñY¬".toCharArray();
      Object var10004 = var10003.length;
      Object var5 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var6 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_2417 = (new String((char[])var5)).intern();
            String var2 = field_2417;
            class_1475 var3 = new class_1475;
            var3.method_7939();
            field_2415 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 63;
            break;
         case 1:
            var10009 = 161;
            break;
         case 2:
            var10009 = 13;
            break;
         case 3:
            var10009 = 245;
            break;
         case 4:
            var10009 = 20;
            break;
         case 5:
            var10009 = 11;
            break;
         default:
            var10009 = 52;
         }

         ((Object[])var5)[var0] = (char)(var10007 ^ var6 ^ var10009);
         ++var0;
      }
   }
}
