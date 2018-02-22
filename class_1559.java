import tv.twitch.chat.ChatEvent;

// $FF: renamed from: qx
final class class_1559 {

   // $FF: renamed from: b int[]
   static final int[] field_8187;
   // $FF: renamed from: c int[]
   static final int[] field_8188;
   // $FF: renamed from: d java.lang.String
   private static final String field_8189 = "CL_00001818";


   // $FF: renamed from: <init> () void
   void method_8512() {
      super();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8513() {
      boolean var10000 = true;
      char[] var10003 = "%Õ3¶~W¡t;".toCharArray();
      Object var10004 = var10003.length;
      Object var12 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var13 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_8189 = (new String((char[])var12)).intern();
            String var10 = field_8189;
            field_8188 = new int[class_902.values().length];

            try {
               field_8188[class_902.visible1.ordinal()] = 1;
            } catch (NoSuchFieldError var8) {
               ;
            }

            try {
               field_8188[class_902.visible2.ordinal()] = 2;
            } catch (NoSuchFieldError var7) {
               ;
            }

            try {
               field_8188[class_902.visible3.ordinal()] = 3;
            } catch (NoSuchFieldError var6) {
               ;
            }

            try {
               field_8188[class_902.visible4.ordinal()] = 4;
            } catch (NoSuchFieldError var5) {
               ;
            }

            try {
               field_8188[class_902.visible5.ordinal()] = 5;
            } catch (NoSuchFieldError var4) {
               ;
            }

            field_8187 = new int[ChatEvent.values().length];

            try {
               field_8187[ChatEvent.TTV_CHAT_JOINED_CHANNEL.ordinal()] = 1;
            } catch (NoSuchFieldError var3) {
               ;
            }

            try {
               field_8187[ChatEvent.TTV_CHAT_LEFT_CHANNEL.ordinal()] = 2;
            } catch (NoSuchFieldError var2) {
               ;
            }

            return;
         }

         char var10007 = (char)((Object[])var12)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 215;
            break;
         case 1:
            var10009 = 40;
            break;
         case 2:
            var10009 = 244;
            break;
         case 3:
            var10009 = 178;
            break;
         case 4:
            var10009 = 55;
            break;
         case 5:
            var10009 = 255;
            break;
         default:
            var10009 = 158;
         }

         ((Object[])var12)[var0] = (char)(var10007 ^ var13 ^ var10009);
         ++var0;
      }
   }
}
