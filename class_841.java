import org.lwjgl.opengl.GL11;

// $FF: renamed from: oM
public class class_841 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3895;


   // $FF: renamed from: <init> (bhr, float) void
   public void method_4798(bhr var1, float var2) {
      super.method_4798(var1, var2);
   }

   // $FF: renamed from: b (wZ, double, double, double, float, float) void
   public void method_4881(class_763 var1, double var2, double var4, double var6, float var8, float var9) {
      super.method_4830(var1, var2, var4, var6, var8, var9);
   }

   // $FF: renamed from: b (wZ) bqx
   protected bqx method_4882(class_763 var1) {
      return field_3895;
   }

   // $FF: renamed from: b (wZ, float, float, float) void
   protected void method_4883(class_763 var1, float var2, float var3, float var4) {
      float var5 = var1.field_3443 + (var1.field_3442 - var1.field_3443) * var4;
      float var6 = var1.field_3445 + (var1.field_3444 - var1.field_3445) * var4;
      GL11.glTranslatef(0.0F, 0.5F, 0.0F);
      GL11.glRotatef(180.0F - var3, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(var5, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(var6, 0.0F, 1.0F, 0.0F);
      GL11.glTranslatef(0.0F, -1.2F, 0.0F);
   }

   // $FF: renamed from: b (wZ, float) float
   protected float method_4884(class_763 var1, float var2) {
      return var1.field_3449 + (var1.field_3448 - var1.field_3449) * var2;
   }

   // $FF: renamed from: b (sv, float) float
   // $FF: synthetic method
   protected float method_4806(class_752 var1, float var2) {
      return this.method_4884((class_763)var1, var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "ÀÄAÒ­>Ç\\È¶/ÍJ×¶?ÑWÁ".toCharArray();
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
            field_3895 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 153;
            break;
         case 1:
            var10009 = 140;
            break;
         case 2:
            var10009 = 20;
            break;
         case 3:
            var10009 = 139;
            break;
         case 4:
            var10009 = 208;
            break;
         case 5:
            var10009 = 242;
            break;
         default:
            var10009 = 118;
         }

         ((Object[])var5)[var1] = (char)(var10007 ^ var6 ^ var10009);
         ++var1;
      }
   }
}
