import org.lwjgl.opengl.GL11;

// $FF: renamed from: l4
public class class_138 extends Gui {

   // $FF: renamed from: b bqx
   private static final bqx field_389;
   // $FF: renamed from: h bao
   private bao field_390;
   // $FF: renamed from: i int
   private int field_391;
   // $FF: renamed from: j int
   private int field_392;
   // $FF: renamed from: k java.lang.String
   private String field_393;
   // $FF: renamed from: l java.lang.String
   private String field_394;
   // $FF: renamed from: m u3
   private class_1604 field_395;
   // $FF: renamed from: n long
   private long field_396;
   // $FF: renamed from: o on
   private class_811 field_397;
   // $FF: renamed from: p boolean
   private boolean field_398;
   // $FF: renamed from: q java.lang.String
   private static final String field_399;
   // $FF: renamed from: r java.lang.String[]
   private static final String[] field_400;


   // $FF: renamed from: <init> (bao) void
   public void method_665(bao var1) {
      super.method_651();
      this.field_390 = var1;
      class_811 var10001 = new class_811;
      var10001.method_4727();
      this.field_397 = var10001;
   }

   // $FF: renamed from: b (u3) void
   public void method_666(class_1604 var1) {
      String[] var10001 = field_400;
      this.field_393 = class_1450.method_7896("achievement.get", new Object[0]);
      this.field_394 = var1.method_8753().method_342();
      this.field_396 = bao.method_5283();
      this.field_395 = var1;
      this.field_398 = false;
   }

   // $FF: renamed from: c (u3) void
   public void method_667(class_1604 var1) {
      this.field_393 = var1.method_8753().method_342();
      this.field_394 = var1.method_8771();
      this.field_396 = bao.method_5283() + 2500L;
      this.field_395 = var1;
      this.field_398 = true;
   }

   // $FF: renamed from: a () void
   private void method_668() {
      GL11.glViewport(0, 0, this.field_390.cursorCounter2, this.field_390.cursorCounter3);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      this.field_391 = this.field_390.cursorCounter2;
      this.field_392 = this.field_390.cursorCounter3;
      class_1338 var10000 = new class_1338;
      var10000.method_7060(this.field_390, this.field_390.cursorCounter2, this.field_390.cursorCounter3);
      class_1338 var1 = var10000;
      this.field_391 = var1.method_7061();
      this.field_392 = var1.method_7062();
      GL11.glClear(256);
      GL11.glMatrixMode(5889);
      GL11.glLoadIdentity();
      GL11.glOrtho(0.0D, (double)this.field_391, (double)this.field_392, 0.0D, 1000.0D, 3000.0D);
      GL11.glMatrixMode(5888);
      GL11.glLoadIdentity();
      GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
   }

   // $FF: renamed from: b () void
   public void method_669() {
      String[] var1 = class_752.method_4253();
      class_138 var10000 = this;
      if(var1 != null) {
         if(this.field_395 == null) {
            return;
         }

         var10000 = this;
      }

      if(var10000.field_396 != 0L && bao.method_5273().cursorCounter8 != null) {
         double var2;
         int var8;
         label71: {
            label70: {
               label82: {
                  var2 = (double)(bao.method_5283() - this.field_396) / 3000.0D;
                  var8 = this.field_398;
                  if(var1 != null) {
                     if(!this.field_398) {
                        double var9;
                        var8 = (var9 = var2 - 0.0D) == 0.0D?0:(var9 < 0.0D?-1:1);
                        if(var1 != null) {
                           if(var8 < 0) {
                              break label70;
                           }

                           double var10;
                           var8 = (var10 = var2 - 1.0D) == 0.0D?0:(var10 < 0.0D?-1:1);
                        }

                        if(var1 == null) {
                           break label71;
                        }

                        if(var8 > 0) {
                           break label70;
                        }
                        break label82;
                     }

                     double var11;
                     var8 = (var11 = var2 - 0.5D) == 0.0D?0:(var11 < 0.0D?-1:1);
                  }

                  if(var1 == null) {
                     break label71;
                  }

                  if(var8 > 0) {
                     var2 = 0.5D;
                  }
               }

               this.method_668();
               GL11.glDisable(2929);
               var8 = 0;
               break label71;
            }

            this.field_396 = 0L;
            return;
         }

         GL11.glDepthMask((boolean)var8);
         double var4 = var2 * 2.0D;
         double var12;
         var8 = (var12 = var4 - 1.0D) == 0.0D?0:(var12 < 0.0D?-1:1);
         if(var1 != null) {
            if(var8 > 0) {
               var4 = 2.0D - var4;
            }

            var4 *= 4.0D;
            var4 = 1.0D - var4;
            double var13;
            var8 = (var13 = var4 - 0.0D) == 0.0D?0:(var13 < 0.0D?-1:1);
         }

         if(var1 != null) {
            if(var8 < 0) {
               var4 = 0.0D;
            }

            var4 *= var4;
            var4 *= var4;
            var8 = this.field_391 - 160;
         }

         int var6 = var8;
         int var7 = 0 - (int)(var4 * 36.0D);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glEnable(3553);
         this.field_390.method_5288().bindTexture(field_389);
         GL11.glDisable(2896);
         this.method_658(var6, var7, 96, 202, 160, 32);
         if(var1 != null) {
            label46: {
               if(this.field_398) {
                  this.field_390.enableBackgroundDrawing4.drawSplitString(this.field_394, var6 + 30, var7 + 7, 120, -1);
                  if(var1 != null) {
                     break label46;
                  }
               }

               this.field_390.enableBackgroundDrawing4.method_7020(this.field_393, var6 + 30, var7 + 7, -256);
               this.field_390.enableBackgroundDrawing4.method_7020(this.field_394, var6 + 30, var7 + 18, -1);
            }
         }

         bam.method_5216();
         GL11.glDisable(2896);
         GL11.glEnable('\u803a');
         GL11.glEnable(2903);
         GL11.glEnable(2896);
         this.field_397.method_4756(this.field_390.enableBackgroundDrawing4, this.field_390.method_5288(), this.field_395.field_8384, var6 + 8, var7 + 8);
         GL11.glDisable(2896);
         GL11.glDepthMask(true);
         GL11.glEnable(2929);
      }

   }

   // $FF: renamed from: c () void
   public void method_670() {
      this.field_395 = null;
      this.field_396 = 0L;
   }

   // $FF: renamed from: <clinit> () void
   static void method_671() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "XýtÏîs+cuz7Ê-¨&v1Ì0Ñ¹&o3o1Ú0¬&h{Å1ñ\"x<Ë!».~:Ök½+r1Ô!»-oÀ%µ$i;×*ð3u3";
      int var4 = "XýtÏîs+cuz7Ê-¨&v1Ì0Ñ¹&o3o1Ú0¬&h{Å1ñ\"x<Ë!».~:Ök½+r1Ô!»-oÀ%µ$i;×*ð3u3".length();
      char var1 = 11;
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
            char[] var12 = var9;
            var9 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var10)).intern();
               if((var0 += var1) >= var4) {
                  field_400 = var5;
                  String[] var11 = field_400;
                  field_399 = "CL_00000721";
                  bqx var8 = new bqx;
                  var10 = field_400;
                  var8.method_8227("textures/gui/achievement/achievement_background.png");
                  field_389 = var8;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)var10[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 176;
               break;
            case 1:
               var10009 = 255;
               break;
            case 2:
               var10009 = 9;
               break;
            case 3:
               var10009 = 239;
               break;
            case 4:
               var10009 = 84;
               break;
            case 5:
               var10009 = 117;
               break;
            default:
               var10009 = 232;
            }

            var10[var6] = (char)(var10007 ^ var12 ^ var10009);
            ++var6;
         }
      }
   }
}
