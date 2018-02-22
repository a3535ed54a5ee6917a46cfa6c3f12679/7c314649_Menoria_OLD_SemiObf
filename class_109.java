import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;
import java.util.Map;

// $FF: renamed from: a
class class_109 extends CacheLoader {

   // $FF: renamed from: a java.lang.String
   private static final String field_200 = "CL_00001829";
   // $FF: renamed from: b pB
   final class_1444 field_201;


   // $FF: renamed from: <init> (pB) void
   void method_510(class_1444 var1) {
      this.field_201 = var1;
      super();
   }

   // $FF: renamed from: b (com.mojang.authlib.GameProfile) java.util.Map
   public Map method_511(GameProfile var1) {
      return bao.method_5273().method_5302().getTextures(var1, false);
   }

   public Object load(Object var1) {
      return this.method_511((GameProfile)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_512() {
      boolean var10000 = true;
      char[] var10003 = "ý£^\"Îè×3".toCharArray();
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
            field_200 = (new String((char[])var4)).intern();
            String var2 = field_200;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 27;
            break;
         case 1:
            var10009 = 74;
            break;
         case 2:
            var10009 = 164;
            break;
         case 3:
            var10009 = 24;
            break;
         case 4:
            var10009 = 183;
            break;
         case 5:
            var10009 = 91;
            break;
         default:
            var10009 = 125;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
