import java.util.List;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: lD
public class class_197 extends bdw {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_851;
   // $FF: renamed from: i bqx
   private static final bqx field_852;
   // $FF: renamed from: r bqx
   private static final bqx field_853;
   // $FF: renamed from: s int
   private int field_854;
   // $FF: renamed from: t java.util.List
   private List field_855;
   // $FF: renamed from: u int
   private int field_856;
   // $FF: renamed from: v float
   private float field_857;
   // $FF: renamed from: w java.lang.String
   private static final String field_858;
   // $FF: renamed from: x java.lang.String[]
   private static final String[] field_859;


   // $FF: renamed from: <init> () void
   public void method_651() {
      super.method_651();
      this.field_857 = 0.5F;
   }

   // $FF: renamed from: e () void
   public void method_871() {
      String[] var10000 = class_752.method_4253();
      ++this.field_854;
      String[] var1 = var10000;
      float var2 = (float)(this.field_856 + this.height + this.height + 24) / this.field_857;
      class_197 var3 = this;
      if(var1 != null) {
         if((float)this.field_854 <= var2) {
            return;
         }

         var3 = this;
      }

      var3.method_1069();
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      if(var2 == 1) {
         this.method_1069();
      }

   }

   // $FF: renamed from: f () void
   private void method_1069() {
      class_1436 var10000 = this.field_557.cursorCounter8.field_3707;
      class_276 var10001 = new class_276;
      var10001.method_1586(class_913.field_4598);
      var10000.method_7821(var10001);
      this.field_557.method_5236((bdw)null);
   }

   // $FF: renamed from: d () boolean
   public boolean method_876() {
      return true;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int, int, float) void
   private void method_1070(int var1, int var2, float var3) {
      bmh var5 = bmh.instance;
      this.field_557.method_5288().bindTexture(Gui.field_369);
      var5.setVisible2();
      String[] var10000 = class_752.method_4253();
      var5.setVisible7(1.0F, 1.0F, 1.0F, 1.0F);
      int var6 = this.width;
      float var7 = 0.0F - ((float)this.field_854 + var3) * 0.5F * this.field_857;
      String[] var4 = var10000;
      float var8 = (float)this.height - ((float)this.field_854 + var3) * 0.5F * this.field_857;
      float var9 = 0.015625F;
      float var10 = ((float)this.field_854 + var3 - 0.0F) * 0.02F;
      float var11 = (float)(this.field_856 + this.height + this.height + 24) / this.field_857;
      float var12 = (var11 - 20.0F - ((float)this.field_854 + var3)) * 0.005F;
      float var14;
      int var13 = (var14 = var12 - var10) == 0.0F?0:(var14 < 0.0F?-1:1);
      if(var4 != null) {
         if(var13 < 0) {
            var10 = var12;
         }

         float var15;
         var13 = (var15 = var10 - 1.0F) == 0.0F?0:(var15 < 0.0F?-1:1);
      }

      if(var4 != null) {
         if(var13 > 0) {
            var10 = 1.0F;
         }

         var10 *= var10;
         var10 = var10 * 96.0F / 255.0F;
         var5.setVisible6(var10, var10, var10);
         var5.addVertexWithUV(0.0D, (double)this.height, (double)this.field_372, 0.0D, (double)(var7 * var9));
         var5.addVertexWithUV((double)var6, (double)this.height, (double)this.field_372, (double)((float)var6 * var9), (double)(var7 * var9));
         var5.addVertexWithUV((double)var6, 0.0D, (double)this.field_372, (double)((float)var6 * var9), (double)(var8 * var9));
         var5.addVertexWithUV(0.0D, 0.0D, (double)this.field_372, 0.0D, (double)(var8 * var9));
         var5.getVisible8();
      }

   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_1070(var1, var2, var3);
      bmh var5 = bmh.instance;
      short var6 = 274;
      int var7 = this.width / 2 - var6 / 2;
      int var8 = this.height + 50;
      String[] var10000 = class_752.method_4253();
      float var9 = -((float)this.field_854 + var3) * this.field_857;
      GL11.glPushMatrix();
      String[] var4 = var10000;
      GL11.glTranslatef(0.0F, var9, 0.0F);
      this.field_557.method_5288().bindTexture(field_852);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.method_658(var7, var8, 0, 0, 155, 44);
      this.method_658(var7 + 155, var8, 0, 45, 155, 44);
      var5.method_7463(16777215);
      int var10 = var8 + 200;
      int var11 = 0;

      int var15;
      int var10001;
      while(true) {
         if(var11 < this.field_855.size()) {
            var15 = var11;
            if(var4 != null) {
               label57: {
                  var10001 = this.field_855.size() - 1;
                  if(var4 == null) {
                     break;
                  }

                  if(var11 == var10001) {
                     float var12 = (float)var10 + var9 - (float)(this.height / 2 - 6);
                     float var18;
                     var15 = (var18 = var12 - 0.0F) == 0.0F?0:(var18 < 0.0F?-1:1);
                     if(var4 == null) {
                        break label57;
                     }

                     if(var15 < 0) {
                        GL11.glTranslatef(0.0F, -var12, 0.0F);
                     }
                  }

                  float var19;
                  var15 = (var19 = (float)var10 + var9 + 12.0F + 8.0F - 0.0F) == 0.0F?0:(var19 < 0.0F?-1:1);
               }
            }

            label40: {
               if(var4 != null) {
                  if(var15 <= 0) {
                     break label40;
                  }

                  float var20;
                  var15 = (var20 = (float)var10 + var9 - (float)this.height) == 0.0F?0:(var20 < 0.0F?-1:1);
               }

               if(var15 < 0) {
                  String var13 = (String)this.field_855.get(var11);
                  String[] var16 = field_859;
                  boolean var17 = var13.startsWith("[C]");
                  if(var4 != null) {
                     label32: {
                        if(var17) {
                           this.fontRendererObj.drawStringWithShadow(var13.substring(3), var7 + (var6 - this.fontRendererObj.getCharWidth(var13.substring(3))) / 2, var10, 16777215);
                           if(var4 != null) {
                              break label32;
                           }
                        }

                        this.fontRendererObj.field_6849.setSeed((long)var11 * 4238972211L + (long)(this.field_854 / 4));
                        this.fontRendererObj.drawStringWithShadow(var13, var7, var10, 16777215);
                     }
                  }
               }
            }

            var10 += 12;
            ++var11;
            if(var4 != null) {
               continue;
            }
         }

         GL11.glPopMatrix();
         this.field_557.method_5288().bindTexture(field_853);
         GL11.glEnable(3042);
         var15 = 0;
         var10001 = 769;
         break;
      }

      GL11.glBlendFunc(var15, var10001);
      var5.setVisible2();
      var5.setVisible7(1.0F, 1.0F, 1.0F, 1.0F);
      var11 = this.width;
      int var14 = this.height;
      var5.addVertexWithUV(0.0D, (double)var14, (double)this.field_372, 0.0D, 1.0D);
      var5.addVertexWithUV((double)var11, (double)var14, (double)this.field_372, 1.0D, 1.0D);
      var5.addVertexWithUV((double)var11, 0.0D, (double)this.field_372, 1.0D, 0.0D);
      var5.addVertexWithUV(0.0D, 0.0D, (double)this.field_372, 0.0D, 0.0D);
      var5.getVisible8();
      GL11.glDisable(3042);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1071() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (java.lang.Exception) java.lang.Exception
   private static Exception method_1072(Exception var0) {
      return var0;
   }
}
