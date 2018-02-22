
// $FF: renamed from: bo
public class class_570 extends class_569 {

   // $FF: renamed from: p java.lang.String
   private static final String field_2447 = "CL_00000074";


   // $FF: renamed from: <init> (aji) void
   public void getBlock51(aji var1) {
      super.getBlock59(var1, false);
   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add var1, ahb var2, class_792 var3) {
      azu var5 = this.method_2968(var2, var3, true);
      String[] var4 = class_752.method_4253();
      azu var10000 = var5;
      if(var4 != null) {
         if(var5 == null) {
            return var1;
         }

         var10000 = var5;
      }

      if(var4 != null) {
         if(var10000.field_4212 != class_100.field_85) {
            return var1;
         }

         var10000 = var5;
      }

      int var6 = var10000.field_4213;
      int var7 = var5.field_4214;
      int var8 = var5.field_4215;
      boolean var9 = var2.method_2190(var3, var6, var7, var8);
      if(var4 != null) {
         if(!var9) {
            return var1;
         }

         var9 = var3.method_4628(var6, var7, var8, var5.field_4216, var1);
      }

      if(!var9) {
         return var1;
      } else {
         ahb var10 = var2;
         int var10001 = var6;
         int var10002 = var7;
         int var10003 = var8;
         if(var4 != null) {
            if(var2.getBlock(var6, var7, var8).method_2424() != awt.field_4177) {
               return var1;
            }

            var10 = var2;
            var10001 = var6;
            var10002 = var7;
            var10003 = var8;
         }

         int var11 = var10.method_33(var10001, var10002, var10003);
         if(var4 != null) {
            if(var11 != 0) {
               return var1;
            }

            var11 = var2.method_34(var6, var7 + 1, var8);
         }

         if(var4 != null) {
            if(var11 == 0) {
               return var1;
            }

            var2.method_2058(var6, var7 + 1, var8, class_1192.field_6136);
            var11 = var3.field_3640.field_2839;
         }

         if(var11 == 0) {
            --var1.field_2958;
         }

         return var1;
      }
   }

   // $FF: renamed from: a (add, int) int
   public int method_2953(add var1, int var2) {
      return class_1192.field_6136.method_2494(var1.method_3745());
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      boolean var10000 = true;
      char[] var10003 = "1¬i&¢BÐ\"".toCharArray();
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
            field_2447 = (new String((char[])var4)).intern();
            String var2 = field_2447;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 150;
            break;
         case 1:
            var10009 = 4;
            break;
         case 2:
            var10009 = 210;
            break;
         case 3:
            var10009 = 242;
            break;
         case 4:
            var10009 = 118;
            break;
         case 5:
            var10009 = 219;
            break;
         default:
            var10009 = 211;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
