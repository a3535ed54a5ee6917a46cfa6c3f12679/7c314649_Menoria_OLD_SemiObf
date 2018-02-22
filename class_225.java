import java.util.List;
import org.apache.commons.io.Charsets;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: lI
public class class_225 extends class_215 implements class_16 {

   // $FF: renamed from: S bqx
   private static final bqx field_1186;
   // $FF: renamed from: T Aw
   private class_675 field_1187;
   // $FF: renamed from: U k_
   private GuiTextField field_1188;
   // $FF: renamed from: V Af
   private class_666 field_1189;
   // $FF: renamed from: W java.lang.String
   private static final String field_1190;
   // $FF: renamed from: X java.lang.String[]
   private static final String[] field_1191;


   // $FF: renamed from: <init> (Af, ahb, int, int, int) void
   public void method_1222(class_666 var1, ahb var2, int var3, int var4, int var5) {
      class_675 var10001 = new class_675;
      var10001.method_3687(var1, var2, var3, var4, var5, bao.method_5273().cursorCounter8);
      super.method_1192(var10001);
      this.field_1189 = var1;
      this.field_1187 = (class_675)this.field_1107;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      super.initGui();
      Keyboard.enableRepeatEvents(true);
      int var1 = (this.width - this.field_1105) / 2;
      int var2 = (this.height - this.field_1106) / 2;
      GuiTextField var10001 = new GuiTextField;
      var10001.GuiTextField(this.fontRendererObj, var1 + 62, var2 + 24, 103, 12);
      this.field_1188 = var10001;
      this.field_1188.setTextColor(-1);
      this.field_1188.setDisabledTextColour(-1);
      this.field_1188.setEnableBackgroundDrawing(false);
      this.field_1188.setMaxStringLength(40);
      this.field_1107.method_3648(this);
      this.field_1107.method_3647(this);
   }

   // $FF: renamed from: m () void
   public void method_872() {
      super.method_872();
      Keyboard.enableRepeatEvents(false);
      this.field_1107.method_3648(this);
   }

   // $FF: renamed from: a (int, int) void
   protected void method_1194(int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      GL11.glDisable(2896);
      GL11.glDisable(3042);
      String[] var3 = var10000;
      String[] var10 = field_1191;
      this.fontRendererObj.method_7020(class_1450.method_7896("container.repair", new Object[0]), 60, 6, 4210752);
      int var11 = this.field_1187.field_2901;
      if(var3 != null) {
         label64: {
            if(this.field_1187.field_2901 > 0) {
               int var4;
               String var6;
               label58: {
                  byte var5;
                  label68: {
                     var4 = 8453920;
                     var5 = 1;
                     var6 = class_1450.method_7896("container.repair.cost", new Object[]{Integer.valueOf(this.field_1187.field_2901)});
                     var11 = this.field_1187.field_2901;
                     if(var3 != null) {
                        label55: {
                           if(this.field_1187.field_2901 >= 40) {
                              var11 = this.field_557.cursorCounter8.field_3640.field_2839;
                              if(var3 == null) {
                                 break label55;
                              }

                              if(!this.field_557.cursorCounter8.field_3640.field_2839) {
                                 var6 = class_1450.method_7896("container.repair.expensive", new Object[0]);
                                 var4 = 16736352;
                                 if(var3 != null) {
                                    break label68;
                                 }
                              }
                           }

                           var11 = this.field_1187.method_3653(2).method_2876();
                        }
                     }

                     if(var3 != null) {
                        if(var11 == 0) {
                           var5 = 0;
                           if(var3 != null) {
                              break label68;
                           }
                        }

                        var11 = this.field_1187.method_3653(2).method_2883(this.field_1189.field_2848);
                     }

                     if(var3 == null) {
                        break label58;
                     }

                     if(var11 == 0) {
                        var4 = 16736352;
                     }
                  }

                  var11 = var5;
               }

               if(var3 == null) {
                  break label64;
               }

               if(var11 != 0) {
                  int var7 = -16777216 | (var4 & 16579836) >> 2 | var4 & -16777216;
                  int var8 = this.field_1105 - 8 - this.fontRendererObj.getCharWidth(var6);
                  byte var9 = 67;
                  boolean var12 = this.fontRendererObj.getUnicodeFlag();
                  if(var3 != null) {
                     label34: {
                        if(var12) {
                           drawRect(var8 - 3, var9 - 2, this.field_1105 - 7, var9 + 10, -16777216);
                           drawRect(var8 - 2, var9 - 1, this.field_1105 - 8, var9 + 9, -12895429);
                           if(var3 != null) {
                              break label34;
                           }
                        }

                        this.fontRendererObj.method_7020(var6, var8, var9 + 1, var7);
                        this.fontRendererObj.method_7020(var6, var8 + 1, var9, var7);
                        this.fontRendererObj.method_7020(var6, var8 + 1, var9 + 1, var7);
                     }
                  }

                  this.fontRendererObj.method_7020(var6, var8, var9, var4);
               }
            }

            var11 = 2896;
         }
      }

      GL11.glEnable(var11);
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      String[] var3 = class_752.method_4253();
      class_225 var10000 = this;
      if(var3 != null) {
         if(this.field_1188.method_726(var1, var2)) {
            this.method_1223();
            if(var3 != null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.method_856(var1, var2);
   }

   // $FF: renamed from: g () void
   private void method_1223() {
      String[] var10000 = class_752.method_4253();
      String var2 = this.field_1188.method_714();
      String[] var1 = var10000;
      class_492 var3 = this.field_1187.method_3653(0);
      if(var1 != null) {
         if(var3 != null) {
            label38: {
               boolean var4 = var3.method_2876();
               if(var1 != null) {
                  if(!var4) {
                     break label38;
                  }

                  var4 = var3.method_2875().method_3773();
               }

               String var5;
               label39: {
                  if(var1 != null) {
                     if(var4) {
                        break label38;
                     }

                     var5 = var2;
                     if(var1 == null) {
                        break label39;
                     }

                     var4 = var2.equals(var3.method_2875().method_3770());
                  }

                  if(!var4) {
                     break label38;
                  }

                  var5 = "";
               }

               var2 = var5;
            }
         }

         this.field_1187.method_3689(var2);
         class_1436 var6 = this.field_557.cursorCounter8.field_3707;
         class_270 var10001 = new class_270;
         String[] var10003 = field_1191;
         var10001.method_1555("MC|ItemName", var2.getBytes(Charsets.UTF_8));
         var6.method_7821(var10001);
      }

   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int var1, int var2, int var3) {
      super.method_862(var1, var2, var3);
      this.field_1188.method_727(var1, var2, var3);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      super.drawScreen(var1, var2, var3);
      GL11.glDisable(2896);
      GL11.glDisable(3042);
      this.field_1188.drawTextBox();
   }

   // $FF: renamed from: b (float, int, int) void
   protected void method_1195(float var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      String[] var4 = var10000;
      this.field_557.method_5288().bindTexture(field_1186);
      int var5 = (this.width - this.field_1105) / 2;
      int var6 = (this.height - this.field_1106) / 2;
      this.method_658(var5, var6, 0, 0, this.field_1105, this.field_1106);
      int var10001 = var5 + 59;
      int var10002 = var6 + 20;
      int var10004 = this.field_1106;
      int var10005 = this.field_1187.method_3653(0).method_2876();
      if(var4 != null) {
         var10005 = var10005 != 0?0:16;
      }

      class_225 var8;
      label39: {
         this.method_658(var10001, var10002, 0, var10004 + var10005, 110, 16);
         boolean var7 = this.field_1187.method_3653(0).method_2876();
         if(var4 != null) {
            label40: {
               if(!var7) {
                  var7 = this.field_1187.method_3653(1).method_2876();
                  if(var4 == null) {
                     break label40;
                  }

                  if(!var7) {
                     return;
                  }
               }

               var8 = this;
               if(var4 == null) {
                  break label39;
               }

               var7 = this.field_1187.method_3653(2).method_2876();
            }
         }

         if(var7) {
            return;
         }

         var8 = this;
      }

      var8.method_658(var5 + 99, var6 + 45, this.field_1105, 0, 28, 21);
   }

   // $FF: renamed from: b (Al, java.util.List) void
   public void method_50(class_671 var1, List var2) {
      this.method_51(var1, 0, var1.method_3653(0).method_2875());
   }

   // $FF: renamed from: b (Al, int, add) void
   public void method_51(class_671 var1, int var2, add var3) {
      String[] var4 = class_752.method_4253();
      if(var2 == 0) {
         String var5;
         label23: {
            add var10001 = var3;
            if(var4 != null) {
               if(var3 == null) {
                  var5 = "";
                  break label23;
               }

               var10001 = var3;
            }

            var5 = var10001.method_3770();
         }

         this.field_1188.writeText(var5);
         this.field_1188.setEnabled(var3 != null);
         if(var3 != null) {
            this.method_1223();
         }
      }

   }

   // $FF: renamed from: b (Al, int, int) void
   public void method_52(class_671 var1, int var2, int var3) {}

   // $FF: renamed from: <clinit> () void
   static void method_1203() {
      // $FF: Couldn't be decompiled
   }
}
