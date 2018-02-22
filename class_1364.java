
// $FF: renamed from: mB
public class Gui4 implements class_31 {

   // $FF: renamed from: a kv
   private final class_1357 field_7155;
   // $FF: renamed from: b java.lang.String
   private final String field_7156;
   // $FF: renamed from: c bcb
   private final bcb field_7157;
   // $FF: renamed from: d bcb
   private final bcb field_7158;
   // $FF: renamed from: e java.lang.String
   private static final String field_7159;
   // $FF: renamed from: f mc
   final class_977 field_7160;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7161;


   // $FF: renamed from: <init> (mc, kv) void
   private void setEnabled6(class_977 var1, class_1357 var2) {
      this.field_7160 = var1;
      super();
      this.field_7155 = var2;
      this.field_7156 = class_1450.method_7896(var2.getEnableBackgroundDrawing6(), new Object[0]);
      bcb var10001 = new bcb;
      var10001.method_748(0, 0, 0, 75, 18, class_1450.method_7896(var2.getEnableBackgroundDrawing6(), new Object[0]));
      this.field_7157 = var10001;
      var10001 = new bcb;
      String[] var10008 = field_7161;
      var10001.method_748(0, 0, 0, 50, 18, class_1450.method_7896("controls.reset", new Object[0]));
      this.field_7158 = var10001;
   }

   // $FF: renamed from: b (int, int, int, int, int, bmh, int, int, boolean) void
   public void method_147(int var1, int var2, int var3, int var4, int var5, bmh var6, int var7, int var8, boolean var9) {
      String[] var10 = class_752.method_4253();
      int var11 = class_977.method_5621(this.field_7160).field_811 == this.field_7155?1:0;
      class_977.method_5620(this.field_7160).enableBackgroundDrawing4.method_7020(this.field_7156, var2 + 90 - class_977.method_5622(this.field_7160), var3 + var5 / 2 - class_977.method_5620(this.field_7160).enableBackgroundDrawing4.FONT_HEIGHT / 2, 16777215);
      this.field_7158.field_447 = var2 + 190;
      this.field_7158.field_448 = var3;
      bcb var10000 = this.field_7158;
      int var10001 = this.field_7155.getEnableBackgroundDrawing8();
      if(var10 != null) {
         var10001 = var10001 != this.field_7155.getEnableBackgroundDrawing7()?1:0;
      }

      label68: {
         int var18;
         label67: {
            int var12;
            label72: {
               var10000.field_451 = (boolean)var10001;
               this.field_7158.method_750(class_977.method_5620(this.field_7160), var7, var8);
               this.field_7157.field_447 = var2 + 105;
               this.field_7157.field_448 = var3;
               this.field_7157.field_449 = bbj.method_5347(this.field_7155.getEnableBackgroundDrawing8());
               var12 = 0;
               var18 = this.field_7155.getEnableBackgroundDrawing8();
               if(var10 != null) {
                  if(var18 != 0) {
                     class_1357[] var13 = class_977.method_5620(this.field_7160).canLoseFocus7.field_4556;
                     int var14 = var13.length;
                     int var15 = 0;

                     while(var15 < var14) {
                        class_1357 var16 = var13[var15];
                        if(var10 == null) {
                           break label72;
                        }

                        if(var10 != null) {
                           if(var16 != this.field_7155) {
                              label55: {
                                 var18 = var16.getEnableBackgroundDrawing8();
                                 if(var10 != null) {
                                    if(var18 != this.field_7155.getEnableBackgroundDrawing8()) {
                                       break label55;
                                    }

                                    var18 = 1;
                                 }

                                 var12 = var18;
                                 if(var10 != null) {
                                    break;
                                 }
                              }
                           }

                           ++var15;
                        }

                        if(var10 == null) {
                           break;
                        }
                     }
                  }

                  var18 = var11;
               }

               if(var10 == null) {
                  break label67;
               }

               if(var18 != 0) {
                  var10000 = this.field_7157;
                  StringBuilder var19 = (new StringBuilder()).append(class_130.field_291);
                  String[] var17 = field_7161;
                  var10000.field_449 = var19.append("> ").append(class_130.field_290).append(this.field_7157.field_449).append(class_130.field_291).append(" <").toString();
                  if(var10 != null) {
                     break label68;
                  }
               }
            }

            var18 = var12;
         }

         if(var18 != 0) {
            this.field_7157.field_449 = class_130.field_288 + this.field_7157.field_449;
         }
      }

      this.field_7157.method_750(class_977.method_5620(this.field_7160), var7, var8);
   }

   // $FF: renamed from: b (int, int, int, int, int, int) boolean
   public boolean method_148(int var1, int var2, int var3, int var4, int var5, int var6) {
      String[] var7 = class_752.method_4253();
      boolean var10000 = this.field_7157.method_753(class_977.method_5620(this.field_7160), var2, var3);
      if(var7 != null) {
         if(var10000) {
            class_977.method_5621(this.field_7160).field_811 = this.field_7155;
            return true;
         }

         var10000 = this.field_7158.method_753(class_977.method_5620(this.field_7160), var2, var3);
      }

      if(var7 != null) {
         if(var10000) {
            class_977.method_5620(this.field_7160).canLoseFocus7.method_5349(this.field_7155, this.field_7155.getEnableBackgroundDrawing7());
            class_1357.getCursorPosition9();
            return true;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: c (int, int, int, int, int, int) void
   public void method_149(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_7157.method_752(var2, var3);
      this.field_7158.method_752(var2, var3);
   }

   // $FF: renamed from: <init> (mc, kv, java.lang.Object) void
   void setEnabled7(class_977 var1, class_1357 var2, Object var3) {
      this.setEnabled6(var1, var2);
   }

   // $FF: renamed from: <clinit> () void
   static void setEnabled8() {
      // $FF: Couldn't be decompiled
   }
}
