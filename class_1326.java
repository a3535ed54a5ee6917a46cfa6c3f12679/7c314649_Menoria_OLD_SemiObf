import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

// $FF: renamed from: kO
final class class_1326 implements ParameterizedType {

   // $FF: renamed from: a java.lang.String
   private static final String field_6802 = "CL_00000651";


   // $FF: renamed from: <init> () void
   void method_6965() {
      super();
   }

   public Type[] getActualTypeArguments() {
      return new Type[]{String.class};
   }

   public Type getRawType() {
      return List.class;
   }

   public Type getOwnerType() {
      return null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6966() {
      boolean var10000 = true;
      char[] var10003 = "`ÇTsÓ~­U".toCharArray();
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
            field_6802 = (new String((char[])var4)).intern();
            String var2 = field_6802;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 61;
            break;
         case 1:
            var10009 = 86;
            break;
         case 2:
            var10009 = 134;
            break;
         case 3:
            var10009 = 122;
            break;
         case 4:
            var10009 = 186;
            break;
         case 5:
            var10009 = 93;
            break;
         default:
            var10009 = 253;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
