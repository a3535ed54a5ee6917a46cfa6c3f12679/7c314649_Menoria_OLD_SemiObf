import org.lwjgl.opengl.GL11;

// $FF: renamed from: oH
public class class_846 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3905;
   // $FF: renamed from: k bqx
   private static final bqx field_3906;
   // $FF: renamed from: l java.lang.String[]
   private static final String[] field_3907;


   // $FF: renamed from: <init> (bhr, bhr, float) void
   public void method_4900(bhr var1, bhr var2, float var3) {
      super.method_4798(var1, var3);
      this.method_4799(var2);
   }

   // $FF: renamed from: b (wT, int, float) int
   protected int method_4901(class_770 var1, int var2, float var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var2;
      if(var4 != null) {
         if(var2 == 0) {
            var10000 = var1.method_4389();
            if(var4 == null) {
               return var10000;
            }

            if(var10000 == 0) {
               this.method_4732(field_3905);
               var10000 = var1.method_4288();
               if(var4 != null) {
                  label25: {
                     if(var10000 != 0) {
                        String[] var11 = field_3907;
                        var10000 = "jeb_".equals(var1.method_4287());
                        if(var4 == null) {
                           break label25;
                        }

                        if(var10000 != 0) {
                           boolean var5 = true;
                           int var6 = var1.field_3029 / 25 + var1.method_3845();
                           int var7 = var6 % class_770.field_3491.length;
                           int var8 = (var6 + 1) % class_770.field_3491.length;
                           float var9 = ((float)(var1.field_3029 % 25) + var3) / 25.0F;
                           GL11.glColor3f(class_770.field_3491[var7][0] * (1.0F - var9) + class_770.field_3491[var8][0] * var9, class_770.field_3491[var7][1] * (1.0F - var9) + class_770.field_3491[var8][1] * var9, class_770.field_3491[var7][2] * (1.0F - var9) + class_770.field_3491[var8][2] * var9);
                           if(var4 != null) {
                              return 1;
                           }
                        }
                     }

                     var10000 = var1.method_4387();
                  }
               }

               int var10 = var10000;
               GL11.glColor3f(class_770.field_3491[var10][0], class_770.field_3491[var10][1], class_770.field_3491[var10][2]);
               return 1;
            }
         }

         var10000 = -1;
      }

      return var10000;
   }

   // $FF: renamed from: b (wT) bqx
   protected bqx method_4902(class_770 var1) {
      return field_3906;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "¨¿¶óª±Üò\f»»Ü\rã ¿íãá²#¶óª±Üò\f»»Ü\rã ¿íã¤\fÎö¨";
      int var4 = "¨¿¶óª±Üò\f»»Ü\rã ¿íãá²#¶óª±Üò\f»»Ü\rã ¿íã¤\fÎö¨".length();
      char var1 = 4;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var11 = true;
         char[] var10 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var10;
            var10 = var10001;
            var10001 = var10003;
            char[] var12 = var10;
            var10 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var11)).intern();
               if((var0 += var1) >= var4) {
                  field_3907 = var5;
                  bqx var9 = new bqx;
                  String[] var8 = field_3907;
                  var9.method_8227("textures/entity/sheep/sheep_fur.png");
                  field_3905 = var9;
                  var9 = new bqx;
                  var9.method_8227("textures/entity/sheep/sheep.png");
                  field_3906 = var9;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var11)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 72;
               break;
            case 1:
               var10009 = 121;
               break;
            case 2:
               var10009 = 244;
               break;
            case 3:
               var10009 = 106;
               break;
            case 4:
               var10009 = 12;
               break;
            case 5:
               var10009 = 239;
               break;
            default:
               var10009 = 69;
            }

            ((Object[])var11)[var6] = (char)(var10007 ^ var12 ^ var10009);
            ++var6;
         }
      }
   }
}
