package ca.diiza.l;

import ca.diiza.l.class_860;
import ca.diiza.l.class_862;
import ca.diiza.l.class_863;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: ca.diiza.l.h
public class class_857 extends bno {

   // $FF: renamed from: g ca.diiza.l.l
   static final class_860 field_3951;
   // $FF: renamed from: h bao
   final bao field_3952;
   // $FF: renamed from: i double
   double field_3953;
   // $FF: renamed from: j double
   double field_3954;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_3955;


   // $FF: renamed from: <init> (bao) void
   public void method_4951(bao var1) {
      super.method_4727();
      this.field_3953 = 1.0D;
      this.field_3954 = 1.0D;
      this.field_3952 = var1;
   }

   // $FF: renamed from: a (sa, double, double, double, float, float) void
   public void method_4728(class_689 var1, double var2, double var4, double var6, float var8, float var9) {
      this.field_3953 = (double)this.field_3952.canLoseFocus7.field_4487 * 12.8D;
      this.field_3954 = 1.6D / this.field_3953;
      int var10000 = class_862.method_5030();
      double var11 = field_3951.method_4994();
      int var10 = var10000;
      ArrayList var13 = new ArrayList();
      class_860 var20 = field_3951;
      if(var10 != 0) {
         if(!field_3951.method_5005()) {
            return;
         }

         var20 = field_3951;
      }

      Iterator var14 = var20.method_4980().iterator();

      while(true) {
         if(var14.hasNext()) {
            class_862 var15 = (class_862)var14.next();
            var10000 = var15.field_4148;
            if(var10 == 0) {
               break;
            }

            if(var10 != 0 && var15.field_4148) {
               class_863 var10001 = new class_863;
               var10001.method_5033(this, var15, var11);
               var13.add(var10001);
            }

            if(var10 != 0) {
               continue;
            }
         }

         var10000 = var13.isEmpty();
         break;
      }

      if(var10 != 0) {
         if(var10000 != 0) {
            return;
         }

         Collections.sort(var13);
         this.field_3952.enableBackgroundDrawing8.setTextColor7(0.0D);
         GL11.glDisable(2896);
         GL11.glDisable(2912);
         var10000 = GL11.glGetInteger(3009);
      }

      int var19 = var10000;
      float var16 = GL11.glGetFloat(3010);
      GL11.glAlphaFunc(516, 0.0F);
      Iterator var17 = var13.iterator();

      while(true) {
         if(var17.hasNext()) {
            class_863 var18 = (class_863)var17.next();
            this.method_4952(var18, var8, var9);
            if(var10 == 0) {
               break;
            }

            if(var10 != 0) {
               continue;
            }
         }

         GL11.glAlphaFunc(var19, var16);
         GL11.glEnable(2912);
         GL11.glEnable(2896);
         this.field_3952.enableBackgroundDrawing8.setTextColor8(0.0D);
         break;
      }

      this.field_3790 = 0.0F;
   }

   // $FF: renamed from: a (ca.diiza.l.o, float, float) void
   void method_4952(class_863 var1, float var2, float var3) {
      int var4;
      float var5;
      FontRenderer var6;
      int var10000;
      String var16;
      label94: {
         StringBuilder var17;
         label93: {
            var5 = (float)Math.max(0.0D, 1.0D - var1.field_4159 * this.field_3954);
            var6 = this.method_4741();
            var10000 = class_862.method_5031();
            GL11.glPushMatrix();
            var4 = var10000;
            StringBuilder var7 = new StringBuilder();
            if(field_3951.method_5007() < 2) {
               var16 = var1.field_4144;
               if(var4 != 0) {
                  break label94;
               }

               if(var1.field_4144 != null) {
                  var17 = var7.append(var1.field_4144);
                  if(var4 != 0) {
                     break label93;
                  }

                  if(field_3951.method_5009()) {
                     label97: {
                        var10000 = var7.length();
                        if(var4 == 0) {
                           if(var10000 != 0) {
                              var7.append(" ");
                           }

                           double var20;
                           var10000 = (var20 = var1.field_4159 - 100000.0D) == 0.0D?0:(var20 < 0.0D?-1:1);
                        }

                        if(var10000 >= 0) {
                           String[] var15 = field_3955;
                           var7.append(String.format("[%1.2fkm]", new Object[]{Double.valueOf(var1.field_4159 * 0.001D)}));
                           if(var4 == 0) {
                              break label97;
                           }
                        }

                        String[] var10001 = field_3955;
                        var7.append(String.format("[%1.2fm]", new Object[]{Double.valueOf(var1.field_4159)}));
                     }
                  }
               }
            }

            var17 = var7;
         }

         var16 = var17.toString();
      }

      String var8 = var16;
      double var9 = (var1.field_4158 * 0.1D + 1.0D) * 0.02666666666666667D;
      var10000 = field_3951.method_5006();
      if(var4 == 0) {
         var10000 = var10000 != 0?-16:0;
      }

      int var11;
      float var19;
      label76: {
         var11 = var10000;
         GL11.glTranslated(var1.field_4155, var1.field_4156, var1.field_4157);
         GL11.glRotatef(-this.field_3788.field_7428, 0.0F, 1.0F, 0.0F);
         class_857 var18 = this;
         if(var4 == 0) {
            if(this.field_3952.canLoseFocus7.field_4561 == 2) {
               var19 = -this.field_3788.field_7429;
               break label76;
            }

            var18 = this;
         }

         var19 = var18.field_3788.field_7429;
      }

      GL11.glRotatef(var19, 1.0F, 0.0F, 0.0F);
      GL11.glScaled(-var9, -var9, var9);
      GL11.glEnable(3042);
      GL11.glBlendFunc(770, 771);
      bmh var12 = bmh.instance;
      var10000 = field_3951.method_5006();
      if(var4 == 0) {
         if(var10000 != 0) {
            GL11.glEnable(3553);
            GL11.glDisable(2929);
            GL11.glDepthMask(false);
            class_862.field_4142[var1.field_4152].method_4956();
            var12.setVisible2();
            var12.setVisible7(var1.field_4149, var1.field_4150, var1.field_4151, 0.4F);
            var12.addVertexWithUV(-8.0D, -8.0D, 0.0D, 0.0D, 0.0D);
            var12.addVertexWithUV(-8.0D, 8.0D, 0.0D, 0.0D, 1.0D);
            var12.addVertexWithUV(8.0D, 8.0D, 0.0D, 1.0D, 1.0D);
            var12.addVertexWithUV(8.0D, -8.0D, 0.0D, 1.0D, 0.0D);
            var12.getVisible8();
            GL11.glEnable(2929);
            GL11.glDepthMask(true);
            var12.setVisible2();
            var12.setVisible7(var1.field_4149, var1.field_4150, var1.field_4151, var5);
            var12.addVertexWithUV(-8.0D, -8.0D, 0.0D, 0.0D, 0.0D);
            var12.addVertexWithUV(-8.0D, 8.0D, 0.0D, 0.0D, 1.0D);
            var12.addVertexWithUV(8.0D, 8.0D, 0.0D, 1.0D, 1.0D);
            var12.addVertexWithUV(8.0D, -8.0D, 0.0D, 1.0D, 0.0D);
            var12.getVisible8();
         }

         var10000 = var6.getCharWidth(var8) >> 1;
      }

      int var13 = var10000;
      var10000 = var13;
      if(var4 == 0) {
         label68: {
            if(var13 != 0) {
               GL11.glDisable(3553);
               GL11.glDisable(2929);
               GL11.glDepthMask(false);
               var12.setVisible2();
               var12.setVisible7(0.0F, 0.0F, 0.0F, 0.6275F);
               var12.method_7462((double)(-var13 - 1), (double)(var11 - 1), 0.0D);
               var12.method_7462((double)(-var13 - 1), (double)(var11 + 8), 0.0D);
               var12.method_7462((double)(var13 + 1), (double)(var11 + 8), 0.0D);
               var12.method_7462((double)(var13 + 1), (double)(var11 - 1), 0.0D);
               var12.getVisible8();
               GL11.glEnable(3553);
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
               int var10002 = -var13;
               int var10004 = var1.field_4152;
               if(var4 == 0) {
                  var10004 = var1.field_4152 == 0?1627389951:1627324416;
               }

               var6.method_7020(var8, var10002, var11, var10004);
               GL11.glEnable(2929);
               GL11.glDepthMask(true);
               int var14 = (int)(255.0F * var5);
               var10000 = var14;
               if(var4 != 0) {
                  break label68;
               }

               if(var14 > 8) {
                  var10002 = -var13;
                  var10004 = var1.field_4152;
                  if(var4 == 0) {
                     var10004 = var1.field_4152 == 0?16777215:16711680;
                  }

                  var6.method_7020(var8, var10002, var11, var10004 | var14 << 24);
               }
            }

            GL11.glDisable(3042);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            var10000 = 3553;
         }
      }

      GL11.glEnable(var10000);
      GL11.glPopMatrix();
   }

   // $FF: renamed from: a (sa) bqx
   protected bqx method_4729(class_689 var1) {
      return null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "T¡BËVcR\tT¡BËVcbÙ";
      int var4 = "T¡BËVcR\tT¡BËVcbÙ".length();
      char var1 = 8;
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
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_3955 = var5;
                  field_3951 = class_860.field_3998;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 249;
               break;
            case 1:
               var10009 = 114;
               break;
            case 2:
               var10009 = 133;
               break;
            case 3:
               var10009 = 19;
               break;
            case 4:
               var10009 = 146;
               break;
            case 5:
               var10009 = 243;
               break;
            default:
               var10009 = 7;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
