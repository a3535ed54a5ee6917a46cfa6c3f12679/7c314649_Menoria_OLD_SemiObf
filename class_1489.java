import tv.twitch.broadcast.StatType;

// $FF: renamed from: qA
final class class_1489 {

   // $FF: renamed from: b int[]
   static final int[] field_7822;
   // $FF: renamed from: c int[]
   static final int[] field_7823;
   // $FF: renamed from: d java.lang.String
   private static final String field_7824 = "CL_00001815";


   // $FF: renamed from: <init> () void
   void method_8033() {
      super();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8034() {
      boolean var10000 = true;
      char[] var10003 = "r×bTIH w¹g".toCharArray();
      Object var10004 = var10003.length;
      Object var15 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var16 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_7824 = (new String((char[])var15)).intern();
            String var13 = field_7824;
            field_7823 = new int[class_903.values().length];

            try {
               field_7823[class_903.field_4430.ordinal()] = 1;
            } catch (NoSuchFieldError var11) {
               ;
            }

            try {
               field_7823[class_903.field_4433.ordinal()] = 2;
            } catch (NoSuchFieldError var10) {
               ;
            }

            try {
               field_7823[class_903.field_4431.ordinal()] = 3;
            } catch (NoSuchFieldError var9) {
               ;
            }

            try {
               field_7823[class_903.field_4432.ordinal()] = 4;
            } catch (NoSuchFieldError var8) {
               ;
            }

            try {
               field_7823[class_903.visible9.ordinal()] = 5;
            } catch (NoSuchFieldError var7) {
               ;
            }

            try {
               field_7823[class_903.field_4434.ordinal()] = 6;
            } catch (NoSuchFieldError var6) {
               ;
            }

            try {
               field_7823[class_903.field_4435.ordinal()] = 7;
            } catch (NoSuchFieldError var5) {
               ;
            }

            try {
               field_7823[class_903.field_4436.ordinal()] = 8;
            } catch (NoSuchFieldError var4) {
               ;
            }

            field_7822 = new int[StatType.values().length];

            try {
               field_7822[StatType.TTV_ST_RTMPSTATE.ordinal()] = 1;
            } catch (NoSuchFieldError var3) {
               ;
            }

            try {
               field_7822[StatType.TTV_ST_RTMPDATASENT.ordinal()] = 2;
            } catch (NoSuchFieldError var2) {
               ;
            }

            return;
         }

         char var10007 = (char)((Object[])var15)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 32;
            break;
         case 1:
            var10009 = 94;
            break;
         case 2:
            var10009 = 153;
            break;
         case 3:
            var10009 = 67;
            break;
         case 4:
            var10009 = 117;
            break;
         case 5:
            var10009 = 104;
            break;
         default:
            var10009 = 105;
         }

         ((Object[])var15)[var0] = (char)(var10007 ^ var16 ^ var10009);
         ++var0;
      }
   }
}
