package ca.diiza.i;

import ca.diiza.e.class_803;
import ca.diiza.i.class_576;

// $FF: renamed from: ca.diiza.i.f
public class class_508 extends adb {

   // $FF: renamed from: o java.lang.String
   private static final String field_2343 = "random.bow";


   // $FF: renamed from: <init> () void
   public void method_2917() {
      super.method_2917();
      this.field_2333 = 4;
      this.method_2974(class_872.field_4248);
   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add var1, ahb var2, class_792 var3) {
      boolean var4 = class_576.getBlock65();
      boolean var10000 = var3.field_3640.field_2839;
      if(var4) {
         if(!var3.field_3640.field_2839) {
            --var1.field_2958;
         }

         var2.method_2082(var3, "random.bow", 0.5F, 0.4F / (field_2332.nextFloat() * 0.4F + 0.8F));
         var10000 = var2.field_1832;
      }

      if(var4 && !var10000) {
         class_803 var10001 = new class_803;
         var10001.method_4682(var2, var3);
         var2.method_2089(var10001);
      }

      if(!var4) {
         int var5 = class_689.method_3977();
         ++var5;
         class_689.method_3975(var5);
      }

      return var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      boolean var10000 = true;
      char[] var10003 = "¨\bTáF;Æ¸M".toCharArray();
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
            field_2343 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 7;
            break;
         case 1:
            var10009 = 180;
            break;
         case 2:
            var10009 = 231;
            break;
         case 3:
            var10009 = 88;
            break;
         case 4:
            var10009 = 244;
            break;
         case 5:
            var10009 = 139;
            break;
         default:
            var10009 = 53;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
