
// $FF: renamed from: bF
public class class_545 extends class_543 {

   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_2401;


   // $FF: renamed from: <init> () void
   protected void method_2917() {
      super.method_2917();
      this.method_2974(class_872.field_4248);
   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add var1, ahb var2, class_792 var3) {
      add var5;
      class_792 var12;
      label25: {
         add var10000 = new add;
         String[] var9 = field_2401;
         var10000.method_3726(class_1010.field_5215, 1, var2.method_2208("map"));
         var5 = var10000;
         String[] var10 = class_752.method_4253();
         String var6 = "map_" + var5.method_3745();
         class_1296 var10001 = new class_1296;
         var10001.method_6768(var6);
         class_1296 var7 = var10001;
         var2.method_2206(var6, var7);
         var7.field_6654 = 0;
         String[] var4 = var10;
         int var8 = 128 * (1 << var7.field_6654);
         var7.field_6651 = (int)(Math.round(var3.field_2994 / (double)var8) * (long)var8);
         var7.field_6652 = (int)(Math.round(var3.field_2996 / (double)var8) * (long)var8);
         var7.field_6653 = (byte)var2.field_1820.field_5738;
         var7.method_6771();
         --var1.field_2958;
         int var11 = var1.field_2958;
         if(var4 != null) {
            if(var1.field_2958 <= 0) {
               return var5;
            }

            var12 = var3;
            if(var4 == null) {
               break label25;
            }

            var11 = var3.field_3616.method_3607(var5.method_3754());
         }

         if(var11 != 0) {
            return var1;
         }

         var12 = var3;
      }

      var12.method_4570(var5, false);
      return var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "aKaK";
      int var4 = "aKaK".length();
      char var1 = 3;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2401 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 116;
               break;
            case 1:
               var10009 = 5;
               break;
            case 2:
               var10009 = 62;
               break;
            case 3:
               var10009 = 217;
               break;
            case 4:
               var10009 = 4;
               break;
            case 5:
               var10009 = 17;
               break;
            default:
               var10009 = 87;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
