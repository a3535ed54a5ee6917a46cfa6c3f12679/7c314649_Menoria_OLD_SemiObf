import java.util.Random;

// $FF: renamed from: i5
public class class_1202 extends class_1199 {

   // $FF: renamed from: a java.lang.String
   private static final String field_6238 = "CL_00000472";


   // $FF: renamed from: <init> () void
   public void method_6448() {
      super.method_6448();
   }

   // $FF: renamed from: <init> (ahb, java.util.Random, int, int) void
   public void method_6466(ahb var1, Random var2, int var3, int var4) {
      label30: {
         label32: {
            String[] var10000 = class_752.method_4253();
            super.method_6449(var3, var4);
            class_985 var6 = var1.method_35(var3 * 16 + 8, var4 * 16 + 8);
            String[] var5 = var10000;
            class_985 var10 = var6;
            class_985 var10001 = class_985.field_5009;
            if(var5 != null) {
               if(var6 == class_985.field_5009) {
                  break label32;
               }

               var10 = var6;
               var10001 = class_985.field_5010;
            }

            if(var5 != null) {
               if(var10 == var10001) {
                  break label32;
               }

               var10 = var6;
               var10001 = class_985.field_4994;
            }

            if(var10 == var10001) {
               class_1096 var11 = new class_1096;
               var11.method_6225(var2, var3 * 16, var4 * 16);
               class_1096 var7 = var11;
               this.field_6230.add(var7);
               if(var5 != null) {
                  break label30;
               }
            }

            class_1098 var12 = new class_1098;
            var12.method_6227(var2, var3 * 16, var4 * 16);
            class_1098 var8 = var12;
            this.field_6230.add(var8);
            if(var5 != null) {
               break label30;
            }
         }

         class_1097 var13 = new class_1097;
         var13.method_6226(var2, var3 * 16, var4 * 16);
         class_1097 var9 = var13;
         this.field_6230.add(var9);
      }

      this.method_6453();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6463() {
      boolean var10000 = true;
      char[] var10003 = "hÅéõé".toCharArray();
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
            field_6238 = (new String((char[])var4)).intern();
            String var2 = field_6238;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 45;
            break;
         case 1:
            var10009 = 53;
            break;
         case 2:
            var10009 = 42;
            break;
         case 3:
            var10009 = 217;
            break;
         case 4:
            var10009 = 172;
            break;
         case 5:
            var10009 = 1;
            break;
         default:
            var10009 = 198;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
