import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;

// $FF: renamed from: mN
class class_1376 implements ParameterizedType {

   // $FF: renamed from: a java.lang.String
   private static final String field_7308 = "CL_00001836";
   // $FF: renamed from: b mM
   final class_1375 field_7309;


   // $FF: renamed from: <init> (mM) void
   void method_7512(class_1375 var1) {
      this.field_7309 = var1;
      super();
   }

   public Type[] getActualTypeArguments() {
      return new Type[]{String.class};
   }

   public Type getRawType() {
      return Collection.class;
   }

   public Type getOwnerType() {
      return null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7513() {
      boolean var10000 = true;
      char[] var10003 = "^Dh;ÓqU,0=".toCharArray();
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
            field_7308 = (new String((char[])var4)).intern();
            String var2 = field_7308;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 177;
            break;
         case 1:
            var10009 = 164;
            break;
         case 2:
            var10009 = 155;
            break;
         case 3:
            var10009 = 167;
            break;
         case 4:
            var10009 = 79;
            break;
         case 5:
            var10009 = 237;
            break;
         default:
            var10009 = 201;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
