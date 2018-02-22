import org.lwjgl.opengl.GL11;

// $FF: renamed from: ox
public class class_830 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3862;
   // $FF: renamed from: k bqx
   private static final bqx field_3863;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      class_1223 var10001 = new class_1223;
      var10001.method_6510();
      super.method_4798(var10001, 0.5F);
   }

   // $FF: renamed from: b (wH) bqx
   protected bqx method_4840(class_760 var1) {
      return var1.method_4326()?field_3863:field_3862;
   }

   // $FF: renamed from: b (wH, float) void
   protected void method_4841(class_760 var1, float var2) {
      String[] var3 = class_752.method_4253();
      float var5 = ((float)var1.field_3425 + (float)(var1.field_3426 - var1.field_3425) * var2) / 20.0F;
      float var10000 = var5;
      float var10001 = 0.0F;
      if(var3 != null) {
         if(var5 < 0.0F) {
            var5 = 0.0F;
         }

         var5 = 1.0F / (var5 * var5 * var5 * var5 * var5 * 2.0F + 1.0F);
         var10000 = 8.0F + var5;
         var10001 = 2.0F;
      }

      float var6 = var10000 / var10001;
      float var7 = (8.0F + 1.0F / var5) / 2.0F;
      GL11.glScalef(var7, var6, var7);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "ÕNµ½²Ò¨¼£Øª©£L¥\r»ÒC¢¼¹Æ½¯ÕNµ½²Ò¨¼£Øª©£L¥\r»ùÑEª";
      int var5 = "ÕNµ½²Ò¨¼£Øª©£L¥\r»ÒC¢¼¹Æ½¯ÕNµ½²Ò¨¼£Øª©£L¥\r»ùÑEª".length();
      char var2 = 40;
      int var1 = -1;

      while(true) {
         ++var1;
         String var10002 = var3.substring(var1, var1 + var2);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var11 = true;
         char[] var10 = var10003;
         char[] var10001 = (char[])var10004;
         int var7 = 0;

         while(true) {
            var10003 = var10;
            var10 = var10001;
            var10001 = var10003;
            char[] var12 = var10;
            var10 = var10003;
            if(var10003 <= var7) {
               var6[var4++] = (new String((char[])var11)).intern();
               if((var1 += var2) >= var5) {
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/ghast/ghast.png");
                  field_3862 = var9;
                  var9 = new bqx;
                  var9.method_8227("textures/entity/ghast/ghast_shooting.png");
                  field_3863 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 155;
               break;
            case 1:
               var10009 = 17;
               break;
            case 2:
               var10009 = 247;
               break;
            case 3:
               var10009 = 86;
               break;
            case 4:
               var10009 = 242;
               break;
            case 5:
               var10009 = 203;
               break;
            default:
               var10009 = 237;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
