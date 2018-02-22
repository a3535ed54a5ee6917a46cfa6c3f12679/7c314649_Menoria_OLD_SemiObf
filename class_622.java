import java.util.Calendar;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: n6
public class class_622 extends class_614 {

   // $FF: renamed from: a bqx
   private static final bqx field_2684;
   // $FF: renamed from: d bqx
   private static final bqx field_2685;
   // $FF: renamed from: e bqx
   private static final bqx field_2686;
   // $FF: renamed from: f bqx
   private static final bqx field_2687;
   // $FF: renamed from: g bqx
   private static final bqx field_2688;
   // $FF: renamed from: h bqx
   private static final bqx field_2689;
   // $FF: renamed from: i mS
   private class_1226 field_2690;
   // $FF: renamed from: j mS
   private class_1226 field_2691;
   // $FF: renamed from: k boolean
   private boolean field_2692;
   // $FF: renamed from: l java.lang.String
   private static final String field_2693;


   // $FF: renamed from: <init> () void
   public void method_3391() {
      super.method_3391();
      class_1226 var10001 = new class_1226;
      var10001.method_6510();
      this.field_2690 = var10001;
      class_1227 var2 = new class_1227;
      var2.method_6510();
      this.field_2691 = var2;
      Calendar var1 = Calendar.getInstance();
      if(var1.get(2) + 1 == 12 && var1.get(5) >= 24 && var1.get(5) <= 26) {
         this.field_2692 = true;
      }

   }

   // $FF: renamed from: b (gm, double, double, double, float) void
   public void method_3413(class_594 var1, double var2, double var4, double var6, float var8) {
      String[] var9;
      int var10;
      class_594 var10000;
      int var17;
      label203: {
         var9 = class_752.method_4253();
         var10000 = var1;
         if(var9 != null) {
            if(!var1.getBlock91()) {
               var10 = 0;
               if(var9 != null) {
                  break label203;
               }
            }

            var10000 = var1;
         }

         label204: {
            aji var11 = var10000.getBlock99();
            var10 = var1.getBlock96();
            var17 = var11 instanceof class_488;
            if(var9 != null) {
               if(var17 == 0) {
                  break label204;
               }

               var17 = var10;
            }

            if(var9 != null) {
               if(var17 != 0) {
                  break label204;
               }

               ((class_488)var11).method_2854(var1.method_99(), var1.field_2465, var1.field_2466, var1.field_2467);
               var17 = var1.getBlock96();
            }

            var10 = var17;
         }

         var1.method_3164();
      }

      var10000 = var1.field_2527;
      if(var9 != null) {
         if(var1.field_2527 != null) {
            return;
         }

         var10000 = var1.field_2529;
      }

      if(var9 != null) {
         if(var10000 != null) {
            return;
         }

         var10000 = var1.field_2528;
      }

      class_1226 var16;
      label206: {
         class_622 var15;
         label170: {
            if(var9 != null) {
               if(var10000 != null) {
                  break label170;
               }

               var10000 = var1.field_2530;
            }

            if(var10000 == null) {
               label207: {
                  var16 = this.field_2690;
                  var17 = var1.method_3166();
                  if(var9 != null) {
                     if(var17 == 1) {
                        this.method_3393(field_2687);
                        if(var9 != null) {
                           break label206;
                        }
                     }

                     var15 = this;
                     if(var9 == null) {
                        break label207;
                     }

                     var17 = this.field_2692;
                  }

                  if(var17 != 0) {
                     this.method_3393(field_2688);
                     if(var9 != null) {
                        break label206;
                     }
                  }

                  var15 = this;
               }

               var15.method_3393(field_2689);
               if(var9 != null) {
                  break label206;
               }
            }
         }

         label209: {
            var16 = this.field_2691;
            var17 = var1.method_3166();
            if(var9 != null) {
               if(var17 == 1) {
                  this.method_3393(field_2684);
                  if(var9 != null) {
                     break label206;
                  }
               }

               var15 = this;
               if(var9 == null) {
                  break label209;
               }

               var17 = this.field_2692;
            }

            if(var17 != 0) {
               this.method_3393(field_2685);
               if(var9 != null) {
                  break label206;
               }
            }

            var15 = this;
         }

         var15.method_3393(field_2686);
      }

      GL11.glPushMatrix();
      GL11.glEnable('\u803a');
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glTranslatef((float)var2, (float)var4 + 1.0F, (float)var6 + 1.0F);
      GL11.glScalef(1.0F, -1.0F, -1.0F);
      GL11.glTranslatef(0.5F, 0.5F, 0.5F);
      short var12 = 0;
      var17 = var10;
      byte var10001 = 2;
      if(var9 != null) {
         if(var10 == 2) {
            var12 = 180;
         }

         var17 = var10;
         var10001 = 3;
      }

      if(var9 != null) {
         if(var17 == var10001) {
            var12 = 0;
         }

         var17 = var10;
         var10001 = 4;
      }

      if(var9 != null) {
         if(var17 == var10001) {
            var12 = 90;
         }

         var17 = var10;
         var10001 = 5;
      }

      if(var9 != null) {
         if(var17 == var10001) {
            var12 = -90;
         }

         var17 = var10;
         var10001 = 2;
      }

      label130: {
         label211: {
            if(var9 != null) {
               if(var17 == var10001 && var1.field_2528 != null) {
                  GL11.glTranslatef(1.0F, 0.0F, 0.0F);
               }

               var17 = var10;
               if(var9 == null) {
                  break label211;
               }

               var10001 = 5;
            }

            if(var17 == var10001) {
               var10000 = var1.field_2530;
               if(var9 == null) {
                  break label130;
               }

               if(var1.field_2530 != null) {
                  GL11.glTranslatef(0.0F, 0.0F, -1.0F);
               }
            }

            var17 = var12;
         }

         GL11.glRotatef((float)var17, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
         var10000 = var1;
      }

      float var13 = var10000.field_2532 + (var1.field_2531 - var1.field_2532) * var8;
      var10000 = var1.field_2527;
      float var14;
      if(var9 != null) {
         label116: {
            if(var1.field_2527 != null) {
               var10000 = var1.field_2527;
               if(var9 == null) {
                  break label116;
               }

               var14 = var1.field_2527.field_2532 + (var1.field_2527.field_2531 - var1.field_2527.field_2532) * var8;
               if(var14 > var13) {
                  var13 = var14;
               }
            }

            var10000 = var1.field_2529;
         }
      }

      label110: {
         label213: {
            if(var9 != null) {
               if(var10000 == null) {
                  break label213;
               }

               var10000 = var1.field_2529;
            }

            var14 = var10000.field_2532 + (var1.field_2529.field_2531 - var1.field_2529.field_2532) * var8;
            float var18;
            var17 = (var18 = var14 - var13) == 0.0F?0:(var18 < 0.0F?-1:1);
            if(var9 == null) {
               break label110;
            }

            if(var17 > 0) {
               var13 = var14;
            }
         }

         var13 = 1.0F - var13;
         var13 = 1.0F - var13 * var13 * var13;
         var16.field_6369.field_6548 = -(var13 * 3.1415927F / 2.0F);
         var16.drawRect3();
         var17 = '\u803a';
      }

      GL11.glDisable(var17);
      GL11.glPopMatrix();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: b (gi, double, double, double, float) void
   public void method_3392(class_580 var1, double var2, double var4, double var6, float var8) {
      this.method_3413((class_594)var1, var2, var4, var6, var8);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3414() {
      // $FF: Couldn't be decompiled
   }
}
