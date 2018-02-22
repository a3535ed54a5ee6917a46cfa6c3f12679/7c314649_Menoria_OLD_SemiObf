import org.lwjgl.opengl.GL11;

// $FF: renamed from: lL
public class class_222 extends class_215 {

   // $FF: renamed from: S bqx
   private static final bqx field_1172;
   // $FF: renamed from: T vI
   private class_22 field_1173;
   // $FF: renamed from: U vI
   private class_22 field_1174;
   // $FF: renamed from: V int
   private int field_1175;


   // $FF: renamed from: <init> (vI, vI) void
   public void method_1214(class_22 var1, class_22 var2) {
      class_685 var10001 = new class_685;
      var10001.method_3705(var1, var2);
      super.method_1192(var10001);
      this.field_1173 = var1;
      this.field_1174 = var2;
      this.field_562 = false;
      short var3 = 222;
      int var4 = var3 - 108;
      this.field_1175 = var2.method_83() / 9;
      this.field_1106 = var4 + this.field_1175 * 18;
   }

   // $FF: renamed from: a (int, int) void
   protected void method_1194(int var1, int var2) {
      FontRenderer var10000;
      class_22 var10001;
      String[] var3;
      String var4;
      label25: {
         var3 = class_752.method_4253();
         var10000 = this.fontRendererObj;
         var10001 = this.field_1174;
         if(var3 != null) {
            if(this.field_1174.method_89()) {
               var4 = this.field_1174.method_88();
               break label25;
            }

            var10001 = this.field_1174;
         }

         var4 = class_1450.method_7896(var10001.method_88(), new Object[0]);
      }

      label19: {
         var10000.method_7020(var4, 8, 6, 4210752);
         var10000 = this.fontRendererObj;
         var10001 = this.field_1173;
         if(var3 != null) {
            if(this.field_1173.method_89()) {
               var4 = this.field_1173.method_88();
               break label19;
            }

            var10001 = this.field_1173;
         }

         var4 = class_1450.method_7896(var10001.method_88(), new Object[0]);
      }

      var10000.method_7020(var4, 8, this.field_1106 - 96 + 2, 4210752);
   }

   // $FF: renamed from: b (float, int, int) void
   protected void method_1195(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_557.method_5288().bindTexture(field_1172);
      int var4 = (this.width - this.field_1105) / 2;
      int var5 = (this.height - this.field_1106) / 2;
      this.method_658(var4, var5, 0, 0, this.field_1105, this.field_1175 * 18 + 17);
      this.method_658(var4, var5 + this.field_1175 * 18 + 17, 0, 126, this.field_1105, 96);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1203() {
      boolean var10000 = true;
      char[] var10003 = "ªµ¨Íq­ÿ·Ì@w±¾¤Øq¬ÿ·Ü\nf·³GAd°·".toCharArray();
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
            field_1172 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 62;
            break;
         case 1:
            var10009 = 48;
            break;
         case 2:
            var10009 = 48;
            break;
         case 3:
            var10009 = 89;
            break;
         case 4:
            var10009 = 147;
            break;
         case 5:
            var10009 = 143;
            break;
         default:
            var10009 = 244;
         }

         ((Object[])var5)[var1] = (char)(var10007 ^ var6 ^ var10009);
         ++var1;
      }
   }
}
