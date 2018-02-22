import org.lwjgl.opengl.GL11;

// $FF: renamed from: lM
public class class_221 extends class_215 {

   // $FF: renamed from: S bqx
   private static final bqx field_1170;
   // $FF: renamed from: T java.lang.String[]
   private static final String[] field_1171;


   // $FF: renamed from: <init> (Af, ahb, int, int, int) void
   public void method_1213(class_666 var1, ahb var2, int var3, int var4, int var5) {
      class_684 var10001 = new class_684;
      var10001.method_3704(var1, var2, var3, var4, var5);
      super.method_1192(var10001);
   }

   // $FF: renamed from: a (int, int) void
   protected void method_1194(int var1, int var2) {
      String[] var3 = field_1171;
      this.fontRendererObj.method_7020(class_1450.method_7896("container.crafting", new Object[0]), 28, 6, 4210752);
      this.fontRendererObj.method_7020(class_1450.method_7896("container.inventory", new Object[0]), 8, this.field_1106 - 96 + 2, 4210752);
   }

   // $FF: renamed from: b (float, int, int) void
   protected void method_1195(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_557.method_5288().bindTexture(field_1170);
      int var4 = (this.width - this.field_1105) / 2;
      int var5 = (this.height - this.field_1106) / 2;
      this.method_658(var4, var5, 0, 0, this.field_1105, this.field_1106);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1203() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "5Îæ\t.3Ó¦!\n8Õç6)\"Äð\t:\n%ï\b&Ø\f9Ïü&\n$ë.?Ïï\";\r:Ä¦\r!5Îæ\t.3Ó¦=\t\"Èæ";
      int var4 = "5Îæ\t.3Ó¦!\n8Õç6)\"Äð\t:\n%ï\b&Ø\f9Ïü&\n$ë.?Ïï\";\r:Ä¦\r!5Îæ\t.3Ó¦=\t\"Èæ".length();
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
                  field_1171 = var5;
                  bqx var8 = new bqx;
                  var10 = field_1171;
                  var8.method_8227("textures/gui/container/crafting_table.png");
                  field_1170 = var8;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)var10[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 181;
               break;
            case 1:
               var10009 = 66;
               break;
            case 2:
               var10009 = 107;
               break;
            case 3:
               var10009 = 158;
               break;
            case 4:
               var10009 = 172;
               break;
            case 5:
               var10009 = 20;
               break;
            default:
               var10009 = 140;
            }

            var10[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
