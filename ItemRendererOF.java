import java.lang.reflect.Field;

public class ItemRendererOF extends bly {

   // $FF: renamed from: mc bao
   private bao field_2598;
   private blm renderBlocksIr;
   private static final bqx RES_ITEM_GLINT;
   private static Field ItemRenderer_renderBlockInstance;
   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_2599;


   // $FF: renamed from: <init> (bao) void
   public void method_3230(bao param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (sv, add, int) void
   public void method_3231(class_752 param1, add param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_3241() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "sË^öW^Ü|âÑWUZÊMSÂZÞ]&NÖGÑ\\IYÃZ×_Í[ÅM_ñZÐTeÂZÊJÉ";
      int var4 = "sË^öW^Ü|âÑWUZÊMSÂZÞ]&NÖGÑ\\IYÃZ×_Í[ÅM_ñZÐTeÂZÊJÉ".length();
      char var1 = 28;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         String[] var10 = true;
         char[] var9 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var9;
            var9 = var10001;
            var10001 = var10003;
            char[] var11 = var9;
            var9 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var10)).intern();
               if((var0 += var1) >= var4) {
                  field_2599 = var5;
                  bqx var8 = new bqx;
                  var10 = field_2599;
                  var8.method_8227("textures/misc/enchanted_item_glint.png");
                  RES_ITEM_GLINT = var8;
                  ItemRenderer_renderBlockInstance = Reflector.getFieldByType(bly.class, blm.class);
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)var10[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 221;
               break;
            case 1:
               var10009 = 145;
               break;
            case 2:
               var10009 = 73;
               break;
            case 3:
               var10009 = 212;
               break;
            case 4:
               var10009 = 67;
               break;
            case 5:
               var10009 = 22;
               break;
            default:
               var10009 = 222;
            }

            var10[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_3242(Exception var0) {
      return var0;
   }
}
