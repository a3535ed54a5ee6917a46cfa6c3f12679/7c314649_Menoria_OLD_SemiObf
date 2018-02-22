import java.util.ArrayList;
import java.util.Random;

// $FF: renamed from: i4
public class class_1203 extends class_1199 {

   // $FF: renamed from: a java.lang.String
   private static final String field_6239 = "CL_00000452";


   // $FF: renamed from: <init> () void
   public void method_6448() {
      super.method_6448();
   }

   // $FF: renamed from: <init> (ahb, java.util.Random, int, int) void
   public void method_6467(ahb var1, Random var2, int var3, int var4) {
      super.method_6449(var3, var4);
      class_1114 var10000 = new class_1114;
      var10000.method_6262(var2, (var3 << 4) + 2, (var4 << 4) + 2);
      class_1114 var6 = var10000;
      this.field_6230.add(var6);
      String[] var10 = class_752.method_4253();
      var6.method_6197(var6, this.field_6230, var2);
      ArrayList var7 = var6.field_5805;
      String[] var5 = var10;

      while(true) {
         if(!var7.isEmpty()) {
            int var8 = var2.nextInt(var7.size());
            class_1094 var9 = (class_1094)var7.remove(var8);
            var9.method_6197(var6, this.field_6230, var2);
            if(var5 == null) {
               break;
            }

            if(var5 != null) {
               continue;
            }
         }

         this.method_6453();
         this.method_6459(var1, var2, 48, 70);
         break;
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_6463() {
      boolean var10000 = true;
      char[] var10003 = "À4©/¿b¸ï6".toCharArray();
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
            field_6239 = (new String((char[])var4)).intern();
            String var2 = field_6239;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 198;
            break;
         case 1:
            var10009 = 24;
            break;
         case 2:
            var10009 = 78;
            break;
         case 3:
            var10009 = 144;
            break;
         case 4:
            var10009 = 13;
            break;
         case 5:
            var10009 = 139;
            break;
         default:
            var10009 = 27;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
