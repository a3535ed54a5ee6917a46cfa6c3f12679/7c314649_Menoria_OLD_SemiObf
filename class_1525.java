import java.util.ArrayList;
import java.util.Iterator;

// $FF: renamed from: rD
class class_1525 extends class_1522 {

   // $FF: renamed from: a java.util.ArrayList
   protected ArrayList field_8010;
   // $FF: renamed from: d java.lang.String
   private static final String field_8011 = "CL_00001234";


   // $FF: renamed from: <init> (java.lang.String) void
   public void method_8268(String var1) {
      super.method_8262();
      this.field_8010 = new ArrayList();
      this.field_8003 = var1;
   }

   // $FF: renamed from: b () rm
   public class_1571 method_8263() {
      class_1583 var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var2 = var10000;
      String[] var1 = class_752.method_4253();
      Iterator var3 = this.field_8010.iterator();

      while(true) {
         if(var3.hasNext()) {
            class_1522 var4 = (class_1522)var3.next();
            var10000 = var2;
            if(var1 == null) {
               break;
            }

            var2.method_8664(var4.field_8003, var4.method_8263());
            if(var1 != null) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8264() {
      boolean var10000 = true;
      char[] var10003 = "\\vý4.\b".toCharArray();
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
            field_8011 = (new String((char[])var4)).intern();
            String var2 = field_8011;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 6;
            break;
         case 1:
            var10009 = 35;
            break;
         case 2:
            var10009 = 187;
            break;
         case 3:
            var10009 = 174;
            break;
         case 4:
            var10009 = 29;
            break;
         case 5:
            var10009 = 57;
            break;
         default:
            var10009 = 166;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
