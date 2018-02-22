import java.util.Iterator;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: l7
class class_1336 {

   // $FF: renamed from: a jQ
   private final class_1296 field_6875;
   // $FF: renamed from: b bpq
   private final bpq field_6876;
   // $FF: renamed from: c bqx
   private final bqx field_6877;
   // $FF: renamed from: d int[]
   private final int[] field_6878;
   // $FF: renamed from: e java.lang.String
   private static final String field_6879;
   // $FF: renamed from: f l5
   final class_1332 field_6880;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6881;


   // $FF: renamed from: <init> (l5, jQ) void
   private void method_7051(class_1332 var1, class_1296 var2) {
      String[] var10000 = class_752.method_4253();
      this.field_6880 = var1;
      super();
      String[] var3 = var10000;
      this.field_6875 = var2;
      bpq var10001 = new bpq;
      var10001.method_7980(128, 128);
      this.field_6876 = var10001;
      this.field_6878 = this.field_6876.method_7982();
      bqf var5 = class_1332.method_7005(var1);
      StringBuilder var10002 = new StringBuilder();
      String[] var10003 = field_6881;
      this.field_6877 = var5.method_8122(var10002.append("map/").append(var2.field_6638).toString(), this.field_6876);
      int var4 = 0;

      while(var4 < this.field_6878.length) {
         this.field_6878[var4] = 0;
         ++var4;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b () void
   private void method_7052() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;

      while(true) {
         if(var2 < 16384) {
            int var3 = this.field_6875.field_6655[var2] & 255;
            if(var1 == null) {
               break;
            }

            label25: {
               label24: {
                  if(var1 != null) {
                     if(var3 / 4 != 0) {
                        break label24;
                     }

                     this.field_6878[var2] = (var2 + var2 / 128 & 1) * 8 + 16 << 24;
                  }

                  if(var1 != null) {
                     break label25;
                  }
               }

               this.field_6878[var2] = class_1319.field_6746[var3 / 4].method_6943(var3 & 3);
            }

            ++var2;
            if(var1 != null) {
               continue;
            }
         }

         this.field_6876.method_7981();
         break;
      }

   }

   // $FF: renamed from: b (boolean) void
   private void method_7053(boolean var1) {
      String[] var10000 = class_752.method_4253();
      byte var3 = 0;
      byte var4 = 0;
      bmh var5 = bmh.instance;
      String[] var2 = var10000;
      float var6 = 0.0F;
      class_1332.method_7005(this.field_6880).bindTexture(this.field_6877);
      GL11.glEnable(3042);
      buu.method_9081(1, 771, 0, 1);
      GL11.glDisable(3008);
      var5.setVisible2();
      var5.addVertexWithUV((double)((float)(var3 + 0) + var6), (double)((float)(var4 + 128) - var6), -0.009999999776482582D, 0.0D, 1.0D);
      var5.addVertexWithUV((double)((float)(var3 + 128) - var6), (double)((float)(var4 + 128) - var6), -0.009999999776482582D, 1.0D, 1.0D);
      var5.addVertexWithUV((double)((float)(var3 + 128) - var6), (double)((float)(var4 + 0) + var6), -0.009999999776482582D, 1.0D, 0.0D);
      var5.addVertexWithUV((double)((float)(var3 + 0) + var6), (double)((float)(var4 + 0) + var6), -0.009999999776482582D, 0.0D, 0.0D);
      var5.getVisible8();
      GL11.glEnable(3008);
      GL11.glDisable(3042);
      class_1332.method_7005(this.field_6880).bindTexture(class_1332.method_7006());
      int var7 = 0;
      Iterator var8 = this.field_6875.field_6658.values().iterator();

      while(true) {
         if(var8.hasNext()) {
            class_1292 var9 = (class_1292)var8.next();
            if(var2 == null) {
               break;
            }

            label29: {
               int var14 = var1;
               if(var2 != null) {
                  byte var10001;
                  label26: {
                     if(var1 != 0) {
                        var14 = var9.field_6632;
                        var10001 = 1;
                        if(var2 == null) {
                           break label26;
                        }

                        if(var9.field_6632 != 1) {
                           break label29;
                        }
                     }

                     GL11.glPushMatrix();
                     GL11.glTranslatef((float)var3 + (float)var9.field_6633 / 2.0F + 64.0F, (float)var4 + (float)var9.field_6634 / 2.0F + 64.0F, -0.02F);
                     GL11.glRotatef((float)(var9.field_6635 * 360) / 16.0F, 0.0F, 0.0F, 1.0F);
                     GL11.glScalef(4.0F, 4.0F, 3.0F);
                     GL11.glTranslatef(-0.125F, 0.125F, 0.0F);
                     var14 = var9.field_6632 % 4;
                     var10001 = 0;
                  }

                  var14 += var10001;
               }

               float var10 = (float)var14 / 4.0F;
               float var11 = (float)(var9.field_6632 / 4 + 0) / 4.0F;
               float var12 = (float)(var9.field_6632 % 4 + 1) / 4.0F;
               float var13 = (float)(var9.field_6632 / 4 + 1) / 4.0F;
               var5.setVisible2();
               var5.addVertexWithUV(-1.0D, 1.0D, (double)((float)var7 * 0.001F), (double)var10, (double)var11);
               var5.addVertexWithUV(1.0D, 1.0D, (double)((float)var7 * 0.001F), (double)var12, (double)var11);
               var5.addVertexWithUV(1.0D, -1.0D, (double)((float)var7 * 0.001F), (double)var12, (double)var13);
               var5.addVertexWithUV(-1.0D, -1.0D, (double)((float)var7 * 0.001F), (double)var10, (double)var13);
               var5.getVisible8();
               GL11.glPopMatrix();
               ++var7;
            }

            if(var2 != null) {
               continue;
            }
         }

         GL11.glPushMatrix();
         GL11.glTranslatef(0.0F, 0.0F, -0.04F);
         GL11.glScalef(1.0F, 1.0F, 1.0F);
         GL11.glPopMatrix();
         break;
      }

   }

   // $FF: renamed from: <init> (l5, jQ, java.lang.Object) void
   void method_7054(class_1332 var1, class_1296 var2, Object var3) {
      this.method_7051(var1, var2);
   }

   // $FF: renamed from: b (l7) void
   static void method_7055(class_1336 var0) {
      var0.method_7052();
   }

   // $FF: renamed from: b (l7, boolean) void
   static void method_7056(class_1336 var0, boolean var1) {
      var0.method_7053(var1);
   }

   // $FF: renamed from: c (l7) bqx
   static bqx method_7057(class_1336 var0) {
      return var0.field_6877;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7058() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "£øF$ÿåÐ/!Õi;";
      int var4 = "£øF$ÿåÐ/!Õi;".length();
      char var1 = 11;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_6881 = var5;
                  String[] var10 = field_6881;
                  field_6879 = "CL_00000665";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 108;
               break;
            case 1:
               var10009 = 56;
               break;
            case 2:
               var10009 = 149;
               break;
            case 3:
               var10009 = 152;
               break;
            case 4:
               var10009 = 54;
               break;
            case 5:
               var10009 = 67;
               break;
            default:
               var10009 = 89;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
