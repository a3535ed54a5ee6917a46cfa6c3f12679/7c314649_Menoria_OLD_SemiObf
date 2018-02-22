import java.util.concurrent.Callable;

// $FF: renamed from: o1
class GuiTextField8 implements Callable {

   // $FF: renamed from: a java.lang.String
   private static final String field_7414 = "CL_00001006";
   // $FF: renamed from: b add
   final add field_7415;
   // $FF: renamed from: c on
   final class_811 field_7416;


   // $FF: renamed from: <init> (on, add) void
   void method_7613(class_811 var1, add var2) {
      this.field_7416 = var1;
      this.field_7415 = var2;
      super();
   }

   // $FF: renamed from: b () java.lang.String
   public String method_7614() {
      return String.valueOf(this.field_7415.method_3767());
   }

   // $FF: renamed from: <clinit> () void
   static void method_7615() {
      boolean var10000 = true;
      char[] var10003 = "Èf­^§Aþ´\t«".toCharArray();
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
            field_7414 = (new String((char[])var4)).intern();
            String var2 = field_7414;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 104;
            break;
         case 1:
            var10009 = 35;
            break;
         case 2:
            var10009 = 158;
            break;
         case 3:
            var10009 = 58;
            break;
         case 4:
            var10009 = 201;
            break;
         case 5:
            var10009 = 48;
            break;
         default:
            var10009 = 214;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
