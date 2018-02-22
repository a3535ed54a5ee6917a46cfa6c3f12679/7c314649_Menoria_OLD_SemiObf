import org.lwjgl.opengl.GL11;

// $FF: renamed from: mi
class class_970 extends bcm {

   // $FF: renamed from: w int
   public int field_4911;
   // $FF: renamed from: x java.lang.String
   private static final String field_4912;
   // $FF: renamed from: y li
   final class_181 field_4913;
   // $FF: renamed from: z java.lang.String[]
   private static final String[] field_4914;


   // $FF: renamed from: <init> (li) void
   public void method_5596(class_181 var1) {
      this.field_4913 = var1;
      super.method_5549(var1.field_557, var1.width, var1.height, 43, var1.height - 60, 24);
      this.field_4911 = -1;
   }

   // $FF: renamed from: b (int, int, add) void
   private void method_5597(int var1, int var2, add var3) {
      this.method_5598(var1 + 1, var2 + 1);
      String[] var10000 = class_752.method_4253();
      GL11.glEnable('\u803a');
      String[] var4 = var10000;
      if(var4 != null) {
         if(var3 != null) {
            bam.method_5216();
            class_181.method_957().method_4755(this.field_4913.fontRendererObj, this.field_4913.field_557.method_5288(), var3, var1 + 2, var2 + 2);
            bam.method_5212();
         }

         GL11.glDisable('\u803a');
      }

   }

   // $FF: renamed from: f (int, int) void
   private void method_5598(int var1, int var2) {
      this.method_5599(var1, var2, 0, 0);
   }

   // $FF: renamed from: d (int, int, int, int) void
   private void method_5599(int var1, int var2, int var3, int var4) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_4913.field_557.method_5288().bindTexture(Gui.field_370);
      float var5 = 0.0078125F;
      float var6 = 0.0078125F;
      boolean var7 = true;
      boolean var8 = true;
      bmh var9 = bmh.instance;
      var9.setVisible2();
      var9.addVertexWithUV((double)(var1 + 0), (double)(var2 + 18), (double)this.field_4913.field_372, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var9.addVertexWithUV((double)(var1 + 18), (double)(var2 + 18), (double)this.field_4913.field_372, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 18) * 0.0078125F));
      var9.addVertexWithUV((double)(var1 + 18), (double)(var2 + 0), (double)this.field_4913.field_372, (double)((float)(var3 + 18) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var9.addVertexWithUV((double)(var1 + 0), (double)(var2 + 0), (double)this.field_4913.field_372, (double)((float)(var3 + 0) * 0.0078125F), (double)((float)(var4 + 0) * 0.0078125F));
      var9.getVisible8();
   }

   // $FF: renamed from: b () int
   protected int method_5553() {
      return class_181.method_958(this.field_4913).method_6440().size();
   }

   // $FF: renamed from: a (int, boolean, int, int) void
   protected void method_5554(int var1, boolean var2, int var3, int var4) {
      this.field_4911 = var1;
      this.field_4913.method_955();
   }

   // $FF: renamed from: a (int) boolean
   protected boolean method_5555(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         var10000 = var1 == this.field_4911?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: a () void
   protected void method_5557() {}

   // $FF: renamed from: a (int, int, int, int, bmh, int, int) void
   protected void method_5558(int var1, int var2, int var3, int var4, bmh var5, int var6, int var7) {
      String[] var10000 = class_752.method_4253();
      class_1205 var9 = (class_1205)class_181.method_958(this.field_4913).method_6440().get(class_181.method_958(this.field_4913).method_6440().size() - var1 - 1);
      String[] var8 = var10000;
      adb var10 = adb.method_2920(var9.method_6472());
      add var15;
      if(var9.method_6472() == class_1192.field_6025) {
         var15 = null;
      } else {
         var15 = new add;
         var15.method_3726(var10, 1, var9.method_6473());
      }

      add var11;
      String[] var14;
      String var17;
      label40: {
         var11 = var15;
         if(var11 != null) {
            label38: {
               adb var16 = var10;
               if(var8 != null) {
                  if(var10 == null) {
                     break label38;
                  }

                  var16 = var10;
               }

               var17 = var16.method_2964(var11);
               break label40;
            }
         }

         var14 = field_4914;
         var17 = "Air";
      }

      String var13;
      label44: {
         String var12 = var17;
         this.method_5597(var2, var3, var11);
         this.field_4913.fontRendererObj.method_7020(var12, var2 + 18 + 5, var3 + 3, 16777215);
         int var18 = var1;
         if(var8 != null) {
            if(var1 == 0) {
               var14 = field_4914;
               var13 = class_1450.method_7896("createWorld.customize.flat.layer.top", new Object[]{Integer.valueOf(var9.method_6471())});
               if(var8 != null) {
                  break label44;
               }
            }

            var18 = var1;
         }

         if(var18 == class_181.method_958(this.field_4913).method_6440().size() - 1) {
            var14 = field_4914;
            var13 = class_1450.method_7896("createWorld.customize.flat.layer.bottom", new Object[]{Integer.valueOf(var9.method_6471())});
            if(var8 != null) {
               break label44;
            }
         }

         var10000 = field_4914;
         var13 = class_1450.method_7896("createWorld.customize.flat.layer", new Object[]{Integer.valueOf(var9.method_6471())});
      }

      this.field_4913.fontRendererObj.method_7020(var13, var2 + 2 + 213 - this.field_4913.fontRendererObj.getCharWidth(var13), var3 + 3, 16777215);
   }

   // $FF: renamed from: d () int
   protected int method_5575() {
      return this.field_4854 - 70;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5579() {
      // $FF: Couldn't be decompiled
   }
}
