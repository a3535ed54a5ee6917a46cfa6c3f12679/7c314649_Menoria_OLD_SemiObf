import java.util.List;
import java.util.Random;

// $FF: renamed from: i6
public class class_1201 extends class_1199 {

   // $FF: renamed from: a java.lang.String
   private static final String field_6237 = "CL_00000482";


   // $FF: renamed from: <init> () void
   public void method_6448() {
      super.method_6448();
   }

   // $FF: renamed from: <init> (ahb, java.util.Random, int, int) void
   public void method_6465(ahb var1, Random var2, int var3, int var4) {
      super.method_6449(var3, var4);
      String[] var10000 = class_752.method_4253();
      class_1252.method_6593();
      String[] var5 = var10000;
      class_1138 var10 = new class_1138;
      var10.method_6318(0, var2, (var3 << 4) + 2, (var4 << 4) + 2);
      class_1138 var6 = var10;
      this.field_6230.add(var6);
      var6.method_6197(var6, this.field_6230, var2);
      List var7 = var6.field_5877;

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
         this.method_6458(var1, var2, 10);
         break;
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_6463() {
      boolean var10000 = true;
      char[] var10003 = "&p$ÓÐáU\bCÑ".toCharArray();
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
            field_6237 = (new String((char[])var4)).intern();
            String var2 = field_6237;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 18;
            break;
         case 1:
            var10009 = 75;
            break;
         case 2:
            var10009 = 12;
            break;
         case 3:
            var10009 = 148;
            break;
         case 4:
            var10009 = 151;
            break;
         case 5:
            var10009 = 84;
            break;
         default:
            var10009 = 166;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
