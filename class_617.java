import org.lwjgl.opengl.GL11;

// $FF: renamed from: oa
public class class_617 extends class_614 {

   // $FF: renamed from: a bqx
   private static final bqx field_2673;
   // $FF: renamed from: d nb
   private final class_1222 field_2674;
   // $FF: renamed from: e java.lang.String
   private static final String field_2675;


   // $FF: renamed from: <init> () void
   public void method_3391() {
      super.method_3391();
      class_1222 var10001 = new class_1222;
      var10001.method_6510();
      this.field_2674 = var10001;
   }

   // $FF: renamed from: b (gy, double, double, double, float) void
   public void method_3403(class_582 var1, double var2, double var4, double var6, float var8) {
      String[] var9;
      float var11;
      float var12;
      int var21;
      label115: {
         label111: {
            aji var10 = var1.getBlock99();
            GL11.glPushMatrix();
            String[] var10000 = class_752.method_4253();
            var11 = 0.6666667F;
            var9 = var10000;
            if(var9 != null) {
               if(var10 != class_1192.field_6089) {
                  break label111;
               }

               GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 0.75F * var11, (float)var6 + 0.5F);
            }

            float var13 = (float)(var1.getBlock96() * 360) / 16.0F;
            GL11.glRotatef(-var13, 0.0F, 1.0F, 0.0F);
            this.field_2674.field_6349.field_6554 = true;
            if(var9 != null) {
               break label115;
            }
         }

         int var19 = var1.getBlock96();
         var12 = 0.0F;
         var21 = var19;
         byte var10001 = 2;
         if(var9 != null) {
            if(var19 == 2) {
               var12 = 180.0F;
            }

            var21 = var19;
            var10001 = 4;
         }

         if(var9 != null) {
            if(var21 == var10001) {
               var12 = 90.0F;
            }

            var21 = var19;
            var10001 = 5;
         }

         if(var21 == var10001) {
            var12 = -90.0F;
         }

         GL11.glTranslatef((float)var2 + 0.5F, (float)var4 + 0.75F * var11, (float)var6 + 0.5F);
         GL11.glRotatef(-var12, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, -0.3125F, -0.4375F);
         this.field_2674.field_6349.field_6554 = false;
      }

      this.method_3393(field_2673);
      GL11.glPushMatrix();
      GL11.glScalef(var11, -var11, -var11);
      this.field_2674.method_6539();
      GL11.glPopMatrix();
      FontRenderer var20 = this.method_3396();
      var12 = 0.016666668F * var11;
      GL11.glTranslatef(0.0F, 0.5F * var11, 0.07F * var11);
      GL11.glDepthMask(false);
      boolean var14 = false;
      float var15 = var12;
      int var16 = var1.field_2478.length;

      while(true) {
         --var16;
         if(var16 <= 0 || var1.field_2478[var16].length() != 0) {
            while(true) {
               var21 = var1.field_2479;
               if(var9 != null) {
                  if(var9 != null) {
                     if(var1.field_2479 < 0) {
                        var21 = var16;
                        int var22 = 2;
                        if(var9 != null) {
                           label75: {
                              if(var16 < 2) {
                                 label117: {
                                    var21 = var1.field_2478[0].length();
                                    var22 = 9;
                                    if(var9 != null) {
                                       label71: {
                                          if(var21 < 9) {
                                             var21 = var1.field_2478[1].length();
                                             var22 = 9;
                                             if(var9 == null) {
                                                break label71;
                                             }

                                             if(var21 < 9) {
                                                var15 = var12 * 1.8F;
                                                if(var9 != null) {
                                                   break label117;
                                                }
                                             }
                                          }

                                          var21 = var1.field_2478[0].length();
                                          var22 = 11;
                                       }
                                    }

                                    if(var9 == null) {
                                       break label75;
                                    }

                                    if(var21 < var22) {
                                       var21 = var1.field_2478[1].length();
                                       var22 = 11;
                                       if(var9 == null) {
                                          break label75;
                                       }

                                       if(var21 < 11) {
                                          var15 = var12 * 1.4F;
                                       }
                                    }
                                 }
                              }

                              GL11.glScalef(var15, -var15, var15);
                              GL11.glNormal3f(0.0F, 0.0F, -var15);
                              ++var16;
                              var21 = -5;
                              var22 = var16;
                           }
                        }

                        int var17 = var21 * var22;
                        int var18 = 0;

                        while(var18 < var16) {
                           var20.method_7020(var1.field_2478[var18], -var20.getCharWidth(var1.field_2478[var18]) / 2, var17 + var18 * 10, 16777215);
                           ++var18;
                           if(var9 == null) {
                              return;
                           }

                           if(var9 == null) {
                              break;
                           }
                        }
                     }

                     var21 = 1;
                  }

                  GL11.glDepthMask((boolean)var21);
                  GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                  GL11.glPopMatrix();
                  return;
               }

               if(var1.field_2479 == 0) {
                  break;
               }
            }
         }
      }
   }

   // $FF: renamed from: b (gi, double, double, double, float) void
   public void method_3392(class_580 var1, double var2, double var4, double var6, float var8) {
      this.method_3403((class_582)var1, var2, var4, var6, var8);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3404() {
      String[] var6 = new String[2];
      int var4 = 0;
      String var3 = "¸î\"!¡¿¤ #:°µ¤0=ê¼åÇ:Agcôü²RA";
      int var5 = "¸î\"!¡¿¤ #:°µ¤0=ê¼åÇ:Agcôü²RA".length();
      char var2 = 24;
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
                  field_2675 = "CL_00000970";
                  bqx var9 = new bqx;
                  var9.method_8227("textures/entity/sign.png");
                  field_2673 = var9;
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            }

            char var10007 = (char)((Object[])var11)[var7];
            short var10009;
            switch(var7 % 7) {
            case 0:
               var10009 = 185;
               break;
            case 1:
               var10009 = 254;
               break;
            case 2:
               var10009 = 16;
               break;
            case 3:
               var10009 = 4;
               break;
            case 4:
               var10009 = 34;
               break;
            case 5:
               var10009 = 38;
               break;
            default:
               var10009 = 177;
            }

            ((Object[])var11)[var7] = (char)(var10007 ^ var12 ^ var10009);
            ++var7;
         }
      }
   }
}
