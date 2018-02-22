import java.util.List;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: lP
public class class_227 extends class_226 {

   // $FF: renamed from: U float
   private float field_1195;
   // $FF: renamed from: V float
   private float field_1196;
   // $FF: renamed from: W java.lang.String
   private static final String field_1197;
   // $FF: renamed from: X java.lang.String[]
   private static final String[] field_1198;


   // $FF: renamed from: <init> (yz) void
   public void method_1225(class_792 var1) {
      super.method_1192(var1.field_3618);
      this.field_562 = true;
   }

   // $FF: renamed from: e () void
   public void method_871() {
      String[] var1 = class_752.method_4253();
      bao var10000 = this.field_557;
      if(var1 != null) {
         if(!this.field_557.maxStringLength8.method_7862()) {
            return;
         }

         var10000 = this.field_557;
      }

      class_228 var10001 = new class_228;
      var10001.method_1228(this.field_557.cursorCounter8);
      var10000.method_5236(var10001);
   }

   // $FF: renamed from: b () void
   public void initGui() {
      String[] var1;
      int var2;
      label27: {
         String[] var10000 = class_752.method_4253();
         this.buttonList.clear();
         var1 = var10000;
         int var5 = this.field_557.cursorCounter8.method_4175().isEmpty();
         if(var1 != null) {
            if(var5 == 0) {
               var2 = 160 + (this.width - this.field_1106 - 200) / 2;
               if(var1 != null) {
                  break label27;
               }
            }

            var5 = (this.width - this.field_1106) / 2;
         }

         var2 = var5;
      }

      int var3 = (this.height - this.field_1105) / 2;
      List var6 = this.buttonList;
      bcb var10001 = new bcb;
      int var10004 = var2 + 175;
      int var10005 = var3 + 10;
      StringBuilder var10008 = (new StringBuilder()).append(class_130.field_288);
      String[] var4 = field_1198;
      var10001.method_748(400, var10004, var10005, 67, 20, class_1563.method_8581(var10008.append("Radio").toString()));
      var6.add(var10001);
      var6 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(401, var2 + 175, var3 + 33, 67, 20, class_1563.method_8581(class_130.field_290 + "Wiki"));
      var6.add(var10001);
      var6 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(402, var2 + 175, var3 + 55, 67, 20, class_1563.method_8581(class_130.field_287 + "Waypoints"));
      var6.add(var10001);
      var6 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(403, var2 + 175, var3 + 77, 67, 20, class_1563.method_8581(class_130.field_286 + "Macros"));
      var6.add(var10001);
      var6 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(404, var2 + 175, var3 + 99, 67, 20, class_1563.method_8581(class_130.field_282 + "ToggleMod"));
      var6.add(var10001);
      var6 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(405, var2 + 175, var3 + 121, 67, 20, class_1563.method_8581(class_130.field_289 + "Site"));
      var6.add(var10001);
      var6 = this.buttonList;
      var10001 = new bcb;
      var10001.method_748(406, var2 + 175, var3 + 143, 67, 20, class_1563.method_8581(class_130.field_285 + "Teamspeak"));
      var6.add(var10001);
      class_227 var8 = this;
      if(var1 != null) {
         if(this.field_557.maxStringLength8.method_7862()) {
            bao var9 = this.field_557;
            class_228 var7 = new class_228;
            var7.method_1228(this.field_557.cursorCounter8);
            var9.method_5236(var7);
            if(var1 != null) {
               return;
            }
         }

         var8 = this;
      }

      var8.initGui();
   }

   // $FF: renamed from: a (int, int) void
   protected void method_1194(int var1, int var2) {
      String[] var10001 = field_1198;
      this.fontRendererObj.method_7020(class_1450.method_7896("container.crafting", new Object[0]), 86, 16, 4210752);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      super.drawScreen(var1, var2, var3);
      this.field_1195 = (float)var1;
      this.field_1196 = (float)var2;
   }

   // $FF: renamed from: b (float, int, int) void
   protected void method_1195(float var1, int var2, int var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_557.method_5288().bindTexture(field_1104);
      int var4 = this.field_1108;
      int var5 = this.field_1109;
      this.method_658(var4, var5, 0, 0, this.field_1105, this.field_1106);
      method_1226(var4 + 51, var5 + 75, 30, (float)(var4 + 51) - this.field_1195, (float)(var5 + 75 - 50) - this.field_1196, this.field_557.cursorCounter8);
   }

   // $FF: renamed from: b (int, int, int, float, float, sv) void
   public static void method_1226(int var0, int var1, int var2, float var3, float var4, class_752 var5) {
      GL11.glEnable(2903);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)var0, (float)var1, 50.0F);
      GL11.glScalef((float)(-var2), (float)var2, (float)var2);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      float var6 = var5.field_3330;
      float var7 = var5.field_3000;
      float var8 = var5.field_3001;
      float var9 = var5.field_3333;
      float var10 = var5.field_3332;
      GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
      bam.method_5213();
      GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
      GL11.glRotatef(-((float)Math.atan((double)(var4 / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
      var5.field_3330 = (float)Math.atan((double)(var3 / 40.0F)) * 20.0F;
      var5.field_3000 = (float)Math.atan((double)(var3 / 40.0F)) * 40.0F;
      var5.field_3001 = -((float)Math.atan((double)(var4 / 40.0F))) * 20.0F;
      var5.field_3332 = var5.field_3000;
      var5.field_3333 = var5.field_3000;
      GL11.glTranslatef(0.0F, var5.field_3013, 0.0F);
      bnn.field_7418.field_7428 = 180.0F;
      bnn.field_7418.method_7622(var5, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
      var5.field_3330 = var6;
      var5.field_3000 = var7;
      var5.field_3001 = var8;
      var5.field_3333 = var9;
      var5.field_3332 = var10;
      GL11.glPopMatrix();
      bam.method_5212();
      GL11.glDisable('\u803a');
      buu.method_9078(buu.field_8557);
      GL11.glDisable(3553);
      buu.method_9078(buu.field_8556);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (java.lang.Exception) java.lang.Exception
   private static Exception method_1227(Exception var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1203() {
      // $FF: Couldn't be decompiled
   }
}
