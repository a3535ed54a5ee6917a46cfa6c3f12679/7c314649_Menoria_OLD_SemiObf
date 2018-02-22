import org.lwjgl.opengl.GL11;

// $FF: renamed from: oy
public class class_829 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3860;
   // $FF: renamed from: k float
   private float field_3861;


   // $FF: renamed from: <init> (bhr, float, float) void
   public void method_4837(bhr var1, float var2, float var3) {
      super.method_4798(var1, var2 * var3);
      this.field_3861 = var3;
   }

   // $FF: renamed from: b (w4, float) void
   protected void method_4838(class_788 var1, float var2) {
      GL11.glScalef(this.field_3861, this.field_3861, this.field_3861);
   }

   // $FF: renamed from: b (w4) bqx
   protected bqx method_4839(class_788 var1) {
      return field_3860;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "ÉëÚø#§(Î¡Çâ\"¼9Ä¡Øã;·$Ø¡Øã;·$Ø Òâ1".toCharArray();
      Object var10004 = var10003.length;
      Object var5 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var1 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var6 = var10002;
         var10002 = var10003;
         if(var10003 <= var1) {
            String var0 = (new String((char[])var5)).intern();
            bqx var3 = new bqx;
            var3.method_8227(var0);
            field_3860 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 223;
            break;
         case 1:
            var10009 = 236;
            break;
         case 2:
            var10009 = 192;
            break;
         case 3:
            var10009 = 238;
            break;
         case 4:
            var10009 = 52;
            break;
         case 5:
            var10009 = 183;
            break;
         default:
            var10009 = 47;
         }

         ((Object[])var5)[var1] = (char)(var10007 ^ var6 ^ var10009);
         ++var1;
      }
   }
}
