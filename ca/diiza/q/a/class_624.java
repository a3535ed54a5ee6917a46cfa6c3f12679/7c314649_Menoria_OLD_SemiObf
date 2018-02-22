package ca.diiza.q.a;

import ca.diiza.t.class_600;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: ca.diiza.q.a.a
public class class_624 extends class_614 {

   // $FF: renamed from: a bqx
   private static final bqx field_2696;
   // $FF: renamed from: c mS
   private class_1226 field_2697;
   // $FF: renamed from: d java.lang.String[]
   private static String[] field_2698;


   // $FF: renamed from: <init> () void
   public void method_3391() {
      super.method_3391();
      class_1226 var10001 = new class_1226;
      var10001.method_6510();
      this.field_2697 = var10001;
   }

   // $FF: renamed from: a (ca.diiza.t.a, double, double, double, float) void
   public void method_3417(class_600 var1, double var2, double var4, double var6, float var8) {
      String[] var9;
      int var11;
      class_600 var10000;
      label121: {
         var9 = method_3420();
         var10000 = var1;
         if(var9 != null) {
            if(!var1.getBlock91()) {
               var11 = 0;
               if(var9 != null) {
                  break label121;
               }

               int var10 = class_689.method_3976();
               ++var10;
               class_689.method_3975(var10);
            }

            var10000 = var1;
         }

         aji var12 = var10000.getBlock99();
         var11 = var1.getBlock96();
      }

      var10000 = var1.field_2571;
      if(var9 != null) {
         if(var1.field_2571 != null) {
            return;
         }

         var10000 = var1.field_2573;
      }

      if(var10000 == null) {
         class_1226 var16 = this.field_2697;
         this.method_3393(field_2696);
         GL11.glPushMatrix();
         GL11.glEnable('\u803a');
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glTranslatef((float)var2, (float)var4 + 1.0F, (float)var6 + 1.0F);
         GL11.glScalef(1.0F, -1.0F, -1.0F);
         GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         short var13 = 0;
         int var17 = var11;
         byte var10001 = 2;
         if(var9 != null) {
            if(var11 == 2) {
               var13 = 180;
            }

            var17 = var11;
            var10001 = 3;
         }

         if(var9 != null) {
            if(var17 == var10001) {
               var13 = 0;
            }

            var17 = var11;
            var10001 = 4;
         }

         if(var9 != null) {
            if(var17 == var10001) {
               var13 = 90;
            }

            var17 = var11;
            var10001 = 5;
         }

         if(var9 != null) {
            if(var17 == var10001) {
               var13 = -90;
            }

            var17 = var11;
            var10001 = 2;
         }

         label100: {
            label125: {
               if(var9 != null) {
                  if(var17 == var10001 && var1.field_2572 != null) {
                     GL11.glTranslatef(1.0F, 0.0F, 0.0F);
                  }

                  var17 = var11;
                  if(var9 == null) {
                     break label125;
                  }

                  var10001 = 5;
               }

               if(var17 == var10001) {
                  var10000 = var1.field_2574;
                  if(var9 == null) {
                     break label100;
                  }

                  if(var1.field_2574 != null) {
                     GL11.glTranslatef(0.0F, 0.0F, -1.0F);
                  }
               }

               var17 = var13;
            }

            GL11.glRotatef((float)var17, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
            var10000 = var1;
         }

         float var14 = var10000.field_2576 + (var1.field_2575 - var1.field_2576) * var8;
         var10000 = var1.field_2571;
         float var15;
         if(var9 != null) {
            label86: {
               if(var1.field_2571 != null) {
                  var10000 = var1.field_2571;
                  if(var9 == null) {
                     break label86;
                  }

                  var15 = var1.field_2571.field_2576 + (var1.field_2571.field_2575 - var1.field_2571.field_2576) * var8;
                  if(var15 > var14) {
                     var14 = var15;
                  }
               }

               var10000 = var1.field_2573;
            }
         }

         label80: {
            label127: {
               if(var9 != null) {
                  if(var10000 == null) {
                     break label127;
                  }

                  var10000 = var1.field_2573;
               }

               var15 = var10000.field_2576 + (var1.field_2573.field_2575 - var1.field_2573.field_2576) * var8;
               float var18;
               var17 = (var18 = var15 - var14) == 0.0F?0:(var18 < 0.0F?-1:1);
               if(var9 == null) {
                  break label80;
               }

               if(var17 > 0) {
                  var14 = var15;
               }
            }

            var14 = 1.0F - var14;
            var14 = 1.0F - var14 * var14 * var14;
            var16.field_6369.field_6548 = -(var14 * 3.1415927F / 2.0F);
            var16.drawRect3();
            var17 = '\u803a';
         }

         GL11.glDisable(var17);
         GL11.glPopMatrix();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   // $FF: renamed from: b (gi, double, double, double, float) void
   public void method_3392(class_580 var1, double var2, double var4, double var6, float var8) {
      method_3420();
      this.method_3417((class_600)var1, var2, var4, var6, var8);
      if(class_689.method_3976() != 0) {
         method_3419(new String[2]);
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_3418() {
      method_3419(new String[1]);
      boolean var10000 = true;
      char[] var10003 = "ì¹N*>ë^¤O1/á^¢^+/·¨Z6>¶¯".toCharArray();
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
            field_2696 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var1];
         short var10009;
         switch(var1 % 7) {
         case 0:
            var10009 = 179;
            break;
         case 1:
            var10009 = 90;
            break;
         case 2:
            var10009 = 234;
            break;
         case 3:
            var10009 = 196;
            break;
         case 4:
            var10009 = 16;
            break;
         case 5:
            var10009 = 115;
            break;
         default:
            var10009 = 112;
         }

         ((Object[])var5)[var1] = (char)(var10007 ^ var6 ^ var10009);
         ++var1;
      }
   }

   // $FF: renamed from: b (java.lang.String[]) void
   public static void method_3419(String[] var0) {
      field_2698 = var0;
   }

   // $FF: renamed from: b () java.lang.String[]
   public static String[] method_3420() {
      return field_2698;
   }
}
