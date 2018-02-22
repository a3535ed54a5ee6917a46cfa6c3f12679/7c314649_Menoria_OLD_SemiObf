import java.util.List;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: lT
public class class_217 extends class_215 {

   // $FF: renamed from: S org.apache.logging.log4j.Logger
   private static final Logger field_1136;
   // $FF: renamed from: T bqx
   private static final bqx field_1137;
   // $FF: renamed from: U c5
   private class_18 field_1138;
   // $FF: renamed from: V k9
   private class_143 field_1139;
   // $FF: renamed from: W k9
   private class_143 field_1140;
   // $FF: renamed from: X int
   private int field_1141;
   // $FF: renamed from: Y java.lang.String
   private String field_1142;
   // $FF: renamed from: Z java.lang.String
   private static final String field_1143;
   // $FF: renamed from: ab java.lang.String[]
   private static final String[] field_1144;


   // $FF: renamed from: <init> (Af, c5, ahb, java.lang.String) void
   public void method_1205(class_666 var1, class_18 var2, ahb var3, String var4) {
      String var6;
      label20: {
         class_679 var10001 = new class_679;
         var10001.method_3697(var1, var2, var3);
         super.method_1192(var10001);
         String[] var5 = class_752.method_4253();
         this.field_1138 = var2;
         var6 = var4;
         if(var5 != null) {
            label18: {
               if(var4 != null) {
                  var6 = var4;
                  if(var5 == null) {
                     break label18;
                  }

                  if(var4.length() >= 1) {
                     var6 = var4;
                     break label20;
                  }
               }

               String[] var7 = field_1144;
               var6 = "entity.Villager.name";
            }
         }

         var6 = class_1450.method_7896(var6, new Object[0]);
      }

      this.field_1142 = var6;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      super.initGui();
      int var1 = (this.width - this.field_1105) / 2;
      int var2 = (this.height - this.field_1106) / 2;
      List var10000 = this.buttonList;
      class_143 var10002 = new class_143;
      var10002.method_763(1, var1 + 120 + 27, var2 + 24 - 1, true);
      var10000.add(this.field_1139 = var10002);
      var10000 = this.buttonList;
      var10002 = new class_143;
      var10002.method_763(2, var1 + 36 - 19, var2 + 24 - 1, false);
      var10000.add(this.field_1140 = var10002);
      this.field_1139.field_451 = false;
      this.field_1140.field_451 = false;
   }

   // $FF: renamed from: a (int, int) void
   protected void method_1194(int var1, int var2) {
      this.fontRendererObj.method_7020(this.field_1142, this.field_1105 / 2 - this.fontRendererObj.getCharWidth(this.field_1142) / 2, 6, 4210752);
      String[] var10001 = field_1144;
      this.fontRendererObj.method_7020(class_1450.method_7896("container.inventory", new Object[0]), 8, this.field_1106 - 96 + 2, 4210752);
   }

   // $FF: renamed from: e () void
   public void method_871() {
      String[] var10000 = class_752.method_4253();
      super.method_871();
      String[] var1 = var10000;
      class_658 var2 = this.field_1138.method_56(this.field_557.cursorCounter8);
      if(var2 != null) {
         int var10001 = this.field_1141;
         if(var1 != null) {
            var10001 = this.field_1141 < var2.size() - 1?1:0;
         }

         this.field_1139.field_451 = (boolean)var10001;
         var10001 = this.field_1141;
         if(var1 != null) {
            var10001 = this.field_1141 > 0?1:0;
         }

         this.field_1140.field_451 = (boolean)var10001;
      }

   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (float, int, int) void
   protected void method_1195(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      String[] var10000 = class_752.method_4253();
      this.field_557.method_5288().bindTexture(field_1137);
      String[] var4 = var10000;
      int var5 = (this.width - this.field_1105) / 2;
      int var6 = (this.height - this.field_1106) / 2;
      this.method_658(var5, var6, 0, 0, this.field_1105, this.field_1106);
      class_658 var7 = this.field_1138.method_56(this.field_557.cursorCounter8);
      class_658 var10 = var7;
      if(var4 != null) {
         if(var7 == null) {
            return;
         }

         var10 = var7;
      }

      int var11 = var10.isEmpty();
      if(var4 != null) {
         if(var11 != 0) {
            return;
         }

         var11 = this.field_1141;
      }

      int var8 = var11;
      class_924 var9 = (class_924)var7.get(var8);
      short var12 = var9.method_5426();
      if(var4 != null) {
         if(var12 == 0) {
            return;
         }

         this.field_557.method_5288().bindTexture(field_1137);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var12 = 2896;
      }

      GL11.glDisable(var12);
      this.method_658(this.field_1108 + 83, this.field_1109 + 21, 212, 0, 28, 21);
      this.method_658(this.field_1108 + 83, this.field_1109 + 51, 212, 0, 28, 21);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      super.drawScreen(var1, var2, var3);
      String[] var4 = class_752.method_4253();
      class_658 var5 = this.field_1138.method_56(this.field_557.cursorCounter8);
      class_658 var10000 = var5;
      if(var4 != null) {
         if(var5 == null) {
            return;
         }

         var10000 = var5;
      }

      int var13 = var10000.isEmpty();
      if(var4 != null) {
         if(var13 != 0) {
            return;
         }

         var13 = (this.width - this.field_1105) / 2;
      }

      int var6 = var13;
      int var7 = (this.height - this.field_1106) / 2;
      int var8 = this.field_1141;
      class_924 var9 = (class_924)var5.get(var8);
      GL11.glPushMatrix();
      add var10 = var9.method_5418();
      add var11 = var9.method_5419();
      add var12 = var9.method_5421();
      bam.method_5216();
      GL11.glDisable(2896);
      GL11.glEnable('\u803a');
      GL11.glEnable(2903);
      GL11.glEnable(2896);
      field_556.field_3806 = 100.0F;
      field_556.method_4756(this.fontRendererObj, this.field_557.method_5288(), var10, var6 + 36, var7 + 24);
      field_556.method_4758(this.fontRendererObj, this.field_557.method_5288(), var10, var6 + 36, var7 + 24);
      if(var4 != null) {
         if(var11 != null) {
            field_556.method_4756(this.fontRendererObj, this.field_557.method_5288(), var11, var6 + 62, var7 + 24);
            field_556.method_4758(this.fontRendererObj, this.field_557.method_5288(), var11, var6 + 62, var7 + 24);
         }

         field_556.method_4756(this.fontRendererObj, this.field_557.method_5288(), var12, var6 + 120, var7 + 24);
         field_556.method_4758(this.fontRendererObj, this.field_557.method_5288(), var12, var6 + 120, var7 + 24);
         field_556.field_3806 = 0.0F;
         GL11.glDisable(2896);
      }

      short var15;
      label53: {
         label68: {
            label51: {
               class_217 var14 = this;
               if(var4 != null) {
                  if(!this.method_1200(36, 24, 16, 16, var1, var2)) {
                     break label51;
                  }

                  var14 = this;
               }

               var14.method_859(var10, var1, var2);
               if(var4 != null) {
                  break label68;
               }
            }

            label43: {
               if(var11 != null) {
                  var15 = this.method_1200(62, 24, 16, 16, var1, var2);
                  if(var4 == null) {
                     break label43;
                  }

                  if(var15 != 0) {
                     this.method_859(var11, var1, var2);
                     if(var4 != null) {
                        break label68;
                     }
                  }
               }

               var15 = this.method_1200(120, 24, 16, 16, var1, var2);
            }

            if(var4 == null) {
               break label53;
            }

            if(var15 != 0) {
               this.method_859(var12, var1, var2);
            }
         }

         GL11.glPopMatrix();
         GL11.glEnable(2896);
         var15 = 2929;
      }

      GL11.glEnable(var15);
      bam.method_5213();
   }

   // $FF: renamed from: g () c5
   public class_18 method_1206() {
      return this.field_1138;
   }

   // $FF: renamed from: h () bqx
   static bqx method_1207() {
      return field_1137;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1203() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (java.lang.Exception) java.lang.Exception
   private static Exception method_1208(Exception var0) {
      return var0;
   }
}
