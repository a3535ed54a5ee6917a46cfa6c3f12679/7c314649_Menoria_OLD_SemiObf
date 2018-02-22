import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;

// $FF: renamed from: nN
final class GuiTextField4 {

   // $FF: renamed from: b int[]
   static final int[] field_7404;
   // $FF: renamed from: c java.lang.String
   private static final String field_7405 = "CL_00001832";


   // $FF: renamed from: <init> () void
   void method_7605() {
      super();
   }

   // $FF: renamed from: <clinit> () void
   static void method_7606() {
      boolean var10000 = true;
      char[] var10003 = "~\t·É3ð\f}æµ".toCharArray();
      Object var10004 = var10003.length;
      Object var7 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var8 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_7405 = (new String((char[])var7)).intern();
            String var5 = field_7405;
            field_7404 = new int[MinecraftProfileTexture$Type.values().length];

            try {
               field_7404[MinecraftProfileTexture$Type.SKIN.ordinal()] = 1;
            } catch (NoSuchFieldError var3) {
               ;
            }

            try {
               field_7404[MinecraftProfileTexture$Type.CAPE.ordinal()] = 2;
            } catch (NoSuchFieldError var2) {
               ;
            }

            return;
         }

         char var10007 = (char)((Object[])var7)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 17;
            break;
         case 1:
            var10009 = 105;
            break;
         case 2:
            var10009 = 249;
            break;
         case 3:
            var10009 = 171;
            break;
         case 4:
            var10009 = 213;
            break;
         case 5:
            var10009 = 47;
            break;
         default:
            var10009 = 236;
         }

         ((Object[])var7)[var0] = (char)(var10007 ^ var8 ^ var10009);
         ++var0;
      }
   }
}
