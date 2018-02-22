import org.lwjgl.opengl.GL11;

// $FF: renamed from: lU
public class class_216 extends class_215 {

   // $FF: renamed from: S bqx
   private static final bqx field_1133;
   // $FF: renamed from: T gq
   public class_589 field_1134;
   // $FF: renamed from: U java.lang.String[]
   private static final String[] field_1135;


   // $FF: renamed from: <init> (Af, gq) void
   public void method_1204(class_666 var1, class_589 var2) {
      class_678 var10001 = new class_678;
      var10001.method_3696(var1, var2);
      super.method_1192(var10001);
      this.field_1134 = var2;
   }

   // $FF: renamed from: a (int, int) void
   protected void method_1194(int var1, int var2) {
      String var5;
      label14: {
         String[] var3 = class_752.method_4253();
         class_589 var10000 = this.field_1134;
         if(var3 != null) {
            if(this.field_1134.method_89()) {
               var5 = this.field_1134.method_88();
               break label14;
            }

            var10000 = this.field_1134;
         }

         var5 = class_1450.method_7896(var10000.method_88(), new Object[0]);
      }

      String var4 = var5;
      this.fontRendererObj.method_7020(var4, this.field_1105 / 2 - this.fontRendererObj.getCharWidth(var4) / 2, 6, 4210752);
      String[] var10001 = field_1135;
      this.fontRendererObj.method_7020(class_1450.method_7896("container.inventory", new Object[0]), 8, this.field_1106 - 96 + 2, 4210752);
   }

   // $FF: renamed from: b (float, int, int) void
   protected void method_1195(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_557.method_5288().bindTexture(field_1133);
      int var4 = (this.width - this.field_1105) / 2;
      int var5 = (this.height - this.field_1106) / 2;
      this.method_658(var4, var5, 0, 0, this.field_1105, this.field_1106);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1203() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "8{Z\n.~>f1u5`[$/qL5u(;Shs4z@)u);P7u5gQE7~<";
      int var4 = "8{Z\n.~>f1u5`[$/qL5u(;Shs4z@)u);P7u5gQE7~<".length();
      char var1 = 19;
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
                  field_1135 = var5;
                  bqx var8 = new bqx;
                  var10 = field_1135;
                  var8.method_8227("textures/gui/container/dispenser.png");
                  field_1133 = var8;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)var10[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 192;
               break;
            case 1:
               var10009 = 143;
               break;
            case 2:
               var10009 = 175;
               break;
            case 3:
               var10009 = 98;
               break;
            case 4:
               var10009 = 240;
               break;
            case 5:
               var10009 = 220;
               break;
            default:
               var10009 = 139;
            }

            var10[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
