import org.lwjgl.opengl.GL11;

// $FF: renamed from: lK
public class class_223 extends class_215 {

   // $FF: renamed from: S bqx
   private static final bqx field_1176;
   // $FF: renamed from: T gl
   private class_595 field_1177;
   // $FF: renamed from: U java.lang.String[]
   private static final String[] field_1178;


   // $FF: renamed from: <init> (Af, gl) void
   public void method_1215(class_666 var1, class_595 var2) {
      class_673 var10001 = new class_673;
      var10001.method_3684(var1, var2);
      super.method_1192(var10001);
      this.field_1177 = var2;
   }

   // $FF: renamed from: a (int, int) void
   protected void method_1194(int var1, int var2) {
      String var5;
      label14: {
         String[] var3 = class_752.method_4253();
         class_595 var10000 = this.field_1177;
         if(var3 != null) {
            if(this.field_1177.method_89()) {
               var5 = this.field_1177.method_88();
               break label14;
            }

            var10000 = this.field_1177;
         }

         var5 = class_1450.method_7896(var10000.method_88(), new Object[0]);
      }

      String var4 = var5;
      this.fontRendererObj.method_7020(var4, this.field_1105 / 2 - this.fontRendererObj.getCharWidth(var4) / 2, 6, 4210752);
      String[] var10001 = field_1178;
      this.fontRendererObj.method_7020(class_1450.method_7896("container.inventory", new Object[0]), 8, this.field_1106 - 96 + 2, 4210752);
   }

   // $FF: renamed from: b (float, int, int) void
   protected void method_1195(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      String[] var10000 = class_752.method_4253();
      this.field_557.method_5288().bindTexture(field_1176);
      int var5 = (this.width - this.field_1105) / 2;
      String[] var4 = var10000;
      int var6 = (this.height - this.field_1106) / 2;
      this.method_658(var5, var6, 0, 0, this.field_1105, this.field_1106);
      int var7 = this.field_1177.method_3168();
      int var10 = var7;
      if(var4 != null) {
         if(var7 <= 0) {
            return;
         }

         var10 = (int)(28.0F * (1.0F - (float)var7 / 400.0F));
      }

      int var8 = var10;
      var10 = var8;
      if(var4 != null) {
         if(var8 > 0) {
            this.method_658(var5 + 97, var6 + 16, 176, 0, 9, var8);
         }

         var10 = var7 / 2 % 7;
      }

      int var9 = var10;
      var10 = var9;
      if(var4 != null) {
         switch(var9) {
         case 6:
            var8 = 0;
            if(var4 != null) {
               break;
            }
         case 5:
            var8 = 6;
            if(var4 != null) {
               break;
            }
         case 4:
            var8 = 11;
            if(var4 != null) {
               break;
            }
         case 3:
            var8 = 16;
            if(var4 != null) {
               break;
            }
         case 2:
            var8 = 20;
            if(var4 != null) {
               break;
            }
         case 1:
            var8 = 24;
            if(var4 != null) {
               break;
            }
         case 0:
            var8 = 29;
         }

         var10 = var8;
      }

      if(var10 > 0) {
         this.method_658(var5 + 65, var6 + 14 + 29 - var8, 185, 29 - var8, 12, var8);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_1203() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "3 ¤ìL?4[¿¥ð9(¬±ðP?5[º¢üI3)£í_4#Z¨¾þ$¶¤øW4\"ö¹÷H?) ·¢à";
      int var4 = "3 ¤ìL?4[¿¥ð9(¬±ðP?5[º¢üI3)£í_4#Z¨¾þ$¶¤øW4\"ö¹÷H?) ·¢à".length();
      char var1 = 40;
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
                  field_1178 = var5;
                  bqx var8 = new bqx;
                  var10 = field_1178;
                  var8.method_8227("textures/gui/container/brewing_stand.png");
                  field_1176 = var8;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)var10[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 42;
               break;
            case 1:
               var10009 = 25;
               break;
            case 2:
               var10009 = 181;
               break;
            case 3:
               var10009 = 189;
               break;
            case 4:
               var10009 = 244;
               break;
            case 5:
               var10009 = 83;
               break;
            default:
               var10009 = 55;
            }

            var10[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
