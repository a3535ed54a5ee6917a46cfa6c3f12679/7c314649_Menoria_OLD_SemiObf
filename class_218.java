import org.lwjgl.opengl.GL11;

// $FF: renamed from: lS
public class class_218 extends class_215 {

   // $FF: renamed from: S bqx
   private static final bqx field_1145;
   // $FF: renamed from: T vI
   private class_22 field_1146;
   // $FF: renamed from: U vI
   private class_22 field_1147;
   // $FF: renamed from: V wR
   private class_772 field_1148;
   // $FF: renamed from: W float
   private float field_1149;
   // $FF: renamed from: X float
   private float field_1150;


   // $FF: renamed from: <init> (vI, vI, wR) void
   public void method_1209(class_22 var1, class_22 var2, class_772 var3) {
      class_681 var10001 = new class_681;
      var10001.method_3701(var1, var2, var3);
      super.method_1192(var10001);
      this.field_1146 = var1;
      this.field_1147 = var2;
      this.field_1148 = var3;
      this.field_562 = false;
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
         var10001 = this.field_1147;
         if(var3 != null) {
            if(this.field_1147.method_89()) {
               var4 = this.field_1147.method_88();
               break label25;
            }

            var10001 = this.field_1147;
         }

         var4 = class_1450.method_7896(var10001.method_88(), new Object[0]);
      }

      label19: {
         var10000.method_7020(var4, 8, 6, 4210752);
         var10000 = this.fontRendererObj;
         var10001 = this.field_1146;
         if(var3 != null) {
            if(this.field_1146.method_89()) {
               var4 = this.field_1146.method_88();
               break label19;
            }

            var10001 = this.field_1146;
         }

         var4 = class_1450.method_7896(var10001.method_88(), new Object[0]);
      }

      var10000.method_7020(var4, 8, this.field_1106 - 96 + 2, 4210752);
   }

   // $FF: renamed from: b (float, int, int) void
   protected void method_1195(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_557.method_5288().bindTexture(field_1145);
      String[] var10000 = class_752.method_4253();
      int var5 = (this.width - this.field_1105) / 2;
      int var6 = (this.height - this.field_1106) / 2;
      String[] var4 = var10000;
      this.method_658(var5, var6, 0, 0, this.field_1105, this.field_1106);
      int var7 = this.field_1148.method_4414();
      if(var4 != null) {
         if(var7 != 0) {
            this.method_658(var5 + 79, var6 + 17, 0, this.field_1106, 90, 54);
         }

         var7 = this.field_1148.method_4447();
      }

      if(var4 != null) {
         if(var7 != 0) {
            this.method_658(var5 + 7, var6 + 35, 0, this.field_1106 + 54, 18, 18);
         }

         var7 = var5 + 51;
      }

      class_227.method_1226(var7, var6 + 60, 17, (float)(var5 + 51) - this.field_1149, (float)(var6 + 75 - 50) - this.field_1150, this.field_1148);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.field_1149 = (float)var1;
      this.field_1150 = (float)var2;
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1203() {
      boolean var10000 = true;
      char[] var10003 = "tßÕfenbsÊgy3doÔÙsyrbrÅ}bob.ÊÃu".toCharArray();
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
            field_1145 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 89;
            break;
         case 1:
            var10009 = 227;
            break;
         case 2:
            var10009 = 244;
            break;
         case 3:
            var10009 = 75;
            break;
         case 4:
            var10009 = 73;
            break;
         case 5:
            var10009 = 69;
            break;
         default:
            var10009 = 94;
         }

         ((Object[])var5)[var1] = (char)(var10007 ^ var6 ^ var10009);
         ++var1;
      }
   }
}
