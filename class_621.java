import org.lwjgl.opengl.GL11;

// $FF: renamed from: n7
public class class_621 extends class_614 {

   // $FF: renamed from: a bqx
   private static final bqx field_2681;
   // $FF: renamed from: d mR
   private class_1228 field_2682;
   // $FF: renamed from: e java.lang.String
   private static final String field_2683;


   // $FF: renamed from: <init> () void
   public void method_3391() {
      super.method_3391();
      class_1228 var10001 = new class_1228;
      var10001.method_6510();
      this.field_2682 = var10001;
   }

   // $FF: renamed from: b (gs, double, double, double, float) void
   public void method_3411(class_588 var1, double var2, double var4, double var6, float var8) {
      GL11.glPushMatrix();
      String[] var10000 = class_752.method_4253();
      GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 0.75F, (float)var6 + 0.5F);
      float var10 = (float)var1.field_2502 + var8;
      GL11.glTranslatef(0.0F, 0.1F + class_1715.method_9555(var10 * 0.1F) * 0.01F, 0.0F);
      String[] var9 = var10000;
      float var11 = var1.field_2509 - var1.field_2510;

      float var16;
      label62: {
         label61:
         while(true) {
            if(var11 >= 3.1415927F) {
               var11 -= 6.2831855F;
               if(var9 == null) {
                  break;
               }

               if(var9 != null) {
                  continue;
               }
            }

            while(true) {
               if(var11 >= -3.1415927F) {
                  break label61;
               }

               var16 = var11 + 6.2831855F;
               if(var9 == null) {
                  break label62;
               }

               var11 = var16;
               if(var9 == null) {
                  break label61;
               }
            }
         }

         var16 = var1.field_2510 + var11 * var8;
      }

      float var12 = var16;
      GL11.glRotatef(-var12 * 180.0F / 3.1415927F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(80.0F, 0.0F, 0.0F, 1.0F);
      this.method_3393(field_2681);
      float var13 = var1.field_2504 + (var1.field_2503 - var1.field_2504) * var8 + 0.25F;
      float var14 = var1.field_2504 + (var1.field_2503 - var1.field_2504) * var8 + 0.75F;
      var13 = (var13 - (float)class_1715.method_9560((double)var13)) * 1.6F - 0.3F;
      var14 = (var14 - (float)class_1715.method_9560((double)var14)) * 1.6F - 0.3F;
      float var18;
      int var17 = (var18 = var13 - 0.0F) == 0.0F?0:(var18 < 0.0F?-1:1);
      if(var9 != null) {
         if(var17 < 0) {
            var13 = 0.0F;
         }

         float var19;
         var17 = (var19 = var14 - 0.0F) == 0.0F?0:(var19 < 0.0F?-1:1);
      }

      if(var9 != null) {
         if(var17 < 0) {
            var14 = 0.0F;
         }

         float var20;
         var17 = (var20 = var13 - 1.0F) == 0.0F?0:(var20 < 0.0F?-1:1);
      }

      float var10001;
      label67: {
         if(var9 != null) {
            if(var17 > 0) {
               var13 = 1.0F;
            }

            var16 = var14;
            var10001 = 1.0F;
            if(var9 == null) {
               break label67;
            }

            float var21;
            var17 = (var21 = var14 - 1.0F) == 0.0F?0:(var21 < 0.0F?-1:1);
         }

         if(var17 > 0) {
            var14 = 1.0F;
         }

         var16 = var1.field_2508;
         var10001 = (var1.field_2507 - var1.field_2508) * var8;
      }

      float var15 = var16 + var10001;
      GL11.glEnable(2884);
      this.field_2682.method_6511((class_689)null, var10, var13, var14, var15, 0.0F, 0.0625F);
      GL11.glPopMatrix();
   }

   // $FF: renamed from: b (gi, double, double, double, float) void
   public void method_3392(class_580 var1, double var2, double var4, double var6, float var8) {
      this.method_3411((class_588)var1, var2, var4, var6, var8);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3412() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "]«xeÙ­.Þc)j_!ÄømÈB;ßégÈB;ÞüpN;ééK0¶Ôòq\t%Ñ";
      int var5 = "]«xeÙ­.Þc)j_!ÄømÈB;ßégÈB;ÞüpN;ééK0¶Ôòq\t%Ñ".length();
      char var2 = 11;
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
                  field_2683 = "CL_00000966";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/enchanting_table_book.png");
                  field_2681 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 12;
               break;
            case 1:
               var10009 = 245;
               break;
            case 2:
               var10009 = 53;
               break;
            case 3:
               var10009 = 71;
               break;
            case 4:
               var10009 = 251;
               break;
            case 5:
               var10009 = 164;
               break;
            default:
               var10009 = 143;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
