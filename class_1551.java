import com.google.common.base.Function;
import java.util.Iterator;

// $FF: renamed from: rS
final class class_1551 implements Function {

   // $FF: renamed from: a java.lang.String
   private static final String field_8121 = "CL_00001258";


   // $FF: renamed from: <init> () void
   void method_8419() {
      super();
   }

   // $FF: renamed from: b (rV) java.util.Iterator
   public Iterator method_8420(class_66 var1) {
      return var1.iterator();
   }

   public Object apply(Object var1) {
      return this.method_8420((class_66)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_8421() {
      boolean var10000 = true;
      char[] var10003 = "Ô?iÖDöªU".toCharArray();
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
            field_8121 = (new String((char[])var4)).intern();
            String var2 = field_8121;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 250;
            break;
         case 1:
            var10009 = 165;
            break;
         case 2:
            var10009 = 93;
            break;
         case 3:
            var10009 = 18;
            break;
         case 4:
            var10009 = 100;
            break;
         case 5:
            var10009 = 219;
            break;
         default:
            var10009 = 73;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
