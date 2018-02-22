import org.lwjgl.opengl.GL11;

// $FF: renamed from: os
public class class_835 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3872;
   // $FF: renamed from: k int
   private int field_3873;


   // $FF: renamed from: <init> () void
   public void method_4727() {
      class_1231 var10001 = new class_1231;
      var10001.method_6510();
      super.method_4798(var10001, 0.25F);
      this.field_3873 = ((class_1231)this.field_3844).drawRect8();
   }

   // $FF: renamed from: b (xc, double, double, double, float, float) void
   public void method_4853(class_757 var1, double var2, double var4, double var6, float var8, float var9) {
      String[] var10000 = class_752.method_4253();
      int var11 = ((class_1231)this.field_3844).drawRect8();
      String[] var10 = var10000;
      if(var10 != null) {
         if(var11 != this.field_3873) {
            this.field_3873 = var11;
            class_1231 var10001 = new class_1231;
            var10001.method_6510();
            this.field_3844 = var10001;
         }

         super.method_4830(var1, var2, var4, var6, var8, var9);
      }

   }

   // $FF: renamed from: b (xc) bqx
   protected bqx method_4854(class_757 var1) {
      return field_3872;
   }

   // $FF: renamed from: b (xc, float) void
   protected void method_4855(class_757 var1, float var2) {
      GL11.glScalef(0.35F, 0.35F, 0.35F);
   }

   // $FF: renamed from: b (xc, double, double, double) void
   protected void method_4856(class_757 var1, double var2, double var4, double var6) {
      super.method_4803(var1, var2, var4, var6);
   }

   // $FF: renamed from: b (xc, float, float, float) void
   protected void method_4857(class_757 var1, float var2, float var3, float var4) {
      label11: {
         String[] var5 = class_752.method_4253();
         if(!var1.method_4314()) {
            GL11.glTranslatef(0.0F, class_1715.method_9556(var2 * 0.3F) * 0.1F, 0.0F);
            if(var5 != null) {
               break label11;
            }
         }

         GL11.glTranslatef(0.0F, -0.1F, 0.0F);
      }

      super.method_4804(var1, var2, var3, var4);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      boolean var10000 = true;
      char[] var10003 = "]1õÛÝZ{èÚÆP{ïÚG3".toCharArray();
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
            field_3872 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 157;
            break;
         case 1:
            var10009 = 224;
            break;
         case 2:
            var10009 = 57;
            break;
         case 3:
            var10009 = 72;
            break;
         case 4:
            var10009 = 26;
            break;
         case 5:
            var10009 = 27;
            break;
         default:
            var10009 = 92;
         }

         ((Object[])var5)[var1] = (char)(var10007 ^ var6 ^ var10009);
         ++var1;
      }
   }
}
