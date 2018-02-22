import tv.twitch.broadcast.IngestServer;

// $FF: renamed from: ms
class class_960 extends bcm {

   // $FF: renamed from: w java.lang.String
   private static final String field_4875;
   // $FF: renamed from: x l0
   final class_204 field_4876;
   // $FF: renamed from: y java.lang.String[]
   private static final String[] field_4877;


   // $FF: renamed from: <init> (l0) void
   public void method_5580(class_204 var1) {
      this.field_4876 = var1;
      super.method_5549(var1.field_557, var1.width, var1.height, 32, var1.height - 35, (int)((double)var1.field_557.enableBackgroundDrawing4.FONT_HEIGHT * 3.5D));
      this.method_5551(false);
   }

   // $FF: renamed from: b () int
   protected int method_5553() {
      return this.field_4876.field_557.method_5297().method_205().length;
   }

   // $FF: renamed from: a (int, boolean, int, int) void
   protected void method_5554(int var1, boolean var2, int var3, int var4) {
      this.field_4876.field_557.canLoseFocus7.field_4528 = this.field_4876.field_557.method_5297().method_205()[var1].serverUrl;
      this.field_4876.field_557.canLoseFocus7.method_5358();
   }

   // $FF: renamed from: a (int) boolean
   protected boolean method_5555(int var1) {
      return this.field_4876.field_557.method_5297().method_205()[var1].serverUrl.equals(this.field_4876.field_557.canLoseFocus7.field_4528);
   }

   // $FF: renamed from: a () void
   protected void method_5557() {}

   // $FF: renamed from: a (int, int, int, int, bmh, int, int) void
   protected void method_5558(int var1, int var2, int var3, int var4, bmh var5, int var6, int var7) {
      String[] var8;
      IngestServer var9;
      String var10;
      String var11;
      String var12;
      String[] var14;
      int var15;
      StringBuilder var17;
      label64: {
         label67: {
            var9 = this.field_4876.field_557.method_5297().method_205()[var1];
            var14 = field_4877;
            var10 = var9.serverUrl.replaceAll("\\{stream_key\\}", "");
            var11 = (int)var9.bitrateKbps + " kbps";
            String[] var10000 = class_752.method_4253();
            var12 = null;
            class_1562 var13 = this.field_4876.field_557.method_5297().method_207();
            var8 = var10000;
            if(var13 != null) {
               if(var9 == var13.drawScreen5()) {
                  var10 = class_130.field_286 + var10;
                  var11 = (int)(var13.drawScreen7() * 100.0F) + "%";
                  if(var8 != null) {
                     break label67;
                  }
               }

               label69: {
                  var15 = var1;
                  if(var8 != null) {
                     if(var1 >= var13.method_8569()) {
                        break label69;
                     }

                     float var19;
                     var15 = (var19 = var9.bitrateKbps - 0.0F) == 0.0F?0:(var19 < 0.0F?-1:1);
                  }

                  if(var8 == null) {
                     break label64;
                  }

                  if(var15 != 0) {
                     break label67;
                  }

                  var17 = (new StringBuilder()).append(class_130.field_288);
                  var14 = field_4877;
                  var11 = var17.append("Down!").toString();
                  if(var8 != null) {
                     break label67;
                  }
               }

               var17 = (new StringBuilder()).append(class_130.field_292);
               var14 = field_4877;
               var11 = var17.append("1234").append(class_130.field_297).append(" kbps").toString();
               if(var8 != null) {
                  break label67;
               }
            }

            float var20;
            var15 = (var20 = var9.bitrateKbps - 0.0F) == 0.0F?0:(var20 < 0.0F?-1:1);
            if(var8 == null) {
               break label64;
            }

            if(var15 == 0) {
               var17 = (new StringBuilder()).append(class_130.field_288);
               var14 = field_4877;
               var11 = var17.append("Down!").toString();
            }
         }

         var2 -= 15;
         var15 = this.method_5555(var1);
      }

      label41: {
         if(var8 != null) {
            if(var15 != 0) {
               var17 = (new StringBuilder()).append(class_130.field_285);
               var14 = field_4877;
               var12 = var17.append("(Preferred)").toString();
               break label41;
            }

            var15 = var9.defaultServer;
         }

         if(var15 != 0) {
            var17 = (new StringBuilder()).append(class_130.field_286);
            String[] var10001 = field_4877;
            var12 = var17.append("(Default)").toString();
         }
      }

      this.field_4876.method_657(class_204.method_1105(this.field_4876), var9.serverName, var2 + 2, var3 + 5, 16777215);
      this.field_4876.method_657(class_204.method_1106(this.field_4876), var10, var2 + 2, var3 + class_204.method_1107(this.field_4876).FONT_HEIGHT + 5 + 3, 3158064);
      class_204 var18 = this.field_4876;
      FontRenderer var16 = class_204.method_1108(this.field_4876);
      String var10002 = var11;
      int var10003 = this.method_5575() - 5 - class_204.method_1109(this.field_4876).getCharWidth(var11);
      int var10004 = var3 + 5;
      int var10005 = 8421504;
      if(var8 != null) {
         var18.method_657(var16, var11, var10003, var10004, 8421504);
         if(var12 == null) {
            return;
         }

         var18 = this.field_4876;
         var16 = class_204.method_1110(this.field_4876);
         var10002 = var12;
         var10003 = this.method_5575() - 5 - class_204.method_1111(this.field_4876).getCharWidth(var12);
         var10004 = var3 + 5 + 3 + class_204.method_1112(this.field_4876).FONT_HEIGHT;
         var10005 = 8421504;
      }

      var18.method_657(var16, var10002, var10003, var10004, var10005);
   }

   // $FF: renamed from: d () int
   protected int method_5575() {
      return super.method_5575() + 15;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5579() {
      // $FF: Couldn't be decompiled
   }
}
