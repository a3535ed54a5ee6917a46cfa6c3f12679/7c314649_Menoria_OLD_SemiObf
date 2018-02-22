package ca.diiza.f;

import ca.diiza.d.class_672;
import ca.diiza.f.class_209;
import ca.diiza.h.class_688;
import ca.diiza.utils.class_1855;
import java.util.Iterator;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: ca.diiza.f.n
public class class_229 extends class_226 {

   // $FF: renamed from: U vN
   private static class_1674 field_1212;
   // $FF: renamed from: V int
   private static int field_1213;
   // $FF: renamed from: W bcb
   bcb field_1214;
   // $FF: renamed from: X bcb
   bcb field_1215;
   // $FF: renamed from: Y bcb
   bcb field_1216;
   // $FF: renamed from: Z bcb
   bcb field_1217;
   // $FF: renamed from: aa ca.diiza.d.a
   public class_672 field_1218;
   // $FF: renamed from: ab float
   private float field_1219;
   // $FF: renamed from: ac boolean
   private boolean field_1220;
   // $FF: renamed from: ad int
   private int field_1221;
   // $FF: renamed from: ae boolean
   private boolean field_1222;
   // $FF: renamed from: af k_
   private GuiTextField field_1223;
   // $FF: renamed from: ag boolean
   private boolean field_1224;
   // $FF: renamed from: ah int
   public int field_1225;
   // $FF: renamed from: ai boolean
   public boolean field_1226;
   // $FF: renamed from: aj int
   public int field_1227;
   // $FF: renamed from: ak boolean
   public boolean field_1228;
   // $FF: renamed from: al int
   public int field_1229;
   // $FF: renamed from: am int
   public int field_1230;
   // $FF: renamed from: an int
   private int field_1231;
   // $FF: renamed from: ao int
   public int field_1232;
   // $FF: renamed from: ap yz
   private class_792 field_1233;
   // $FF: renamed from: bb java.lang.String[]
   private static final String[] field_1234;


   // $FF: renamed from: <init> (yz) void
   public void method_1238(class_792 var1) {
      class_672 var10001 = new class_672;
      var10001.method_3679(var1);
      super.method_1192(var10001);
      this.field_1219 = 0.0F;
      this.field_1220 = false;
      this.field_1224 = false;
      var1.field_3619 = this.field_1107;
      this.field_562 = false;
      this.field_1106 = 190;
      this.field_1105 = 195;
      this.field_1233 = var1;
      this.field_1221 = 25;
      this.field_1218 = var1.contCrafts;
      this.field_1225 = 0;
      this.field_1226 = true;
      this.field_1227 = 0;
      this.field_1228 = true;
      this.field_1229 = 0;
      this.field_1230 = 0;
      this.field_1231 = 0;
      this.field_1232 = 0;
   }

   // $FF: renamed from: e () void
   public void method_871() {
      int var1;
      class_229 var4;
      label78: {
         boolean var3;
         label79: {
            label73: {
               var1 = class_209.method_1159();
               class_792 var10000 = this.field_1233;
               if(var1 != 0) {
                  if(this.field_1233.method_3917()) {
                     var3 = this.field_1233.field_3012;
                     if(var1 == 0) {
                        break label79;
                     }

                     if(!this.field_1233.field_3012) {
                        break label73;
                     }
                  }

                  var10000 = this.field_1233;
               }

               var10000.method_4564();
            }

            var4 = this;
            if(var1 == 0) {
               break label78;
            }

            var3 = this.field_1226;
         }

         if(!var3) {
            this.field_1218.field_2881.method_3810();
            this.field_1226 = true;
         }

         var4 = this;
      }

      if(var1 != 0) {
         if(var4.field_1218.field_2880.method_3803() == null) {
            return;
         }

         var4 = this;
      }

      int var5 = var4.field_1225;
      short var10001 = 50;
      if(var1 != 0) {
         if(var5 >= 50) {
            this.field_1225 = 0;
         }

         ++this.field_1225;
         var5 = this.field_1229;
         var10001 = 425;
      }

      if(var1 != 0) {
         if(var5 >= var10001) {
            this.field_1229 = 1;
         }

         ++this.field_1229;
         var5 = this.field_1231;
         var10001 = 45;
      }

      label81: {
         if(var1 != 0) {
            if(var5 >= var10001) {
               this.field_1231 = 0;
            }

            ++this.field_1231;
            var4 = this;
            if(var1 == 0) {
               break label81;
            }

            var5 = this.field_1232;
            var10001 = 200;
         }

         if(var5 >= var10001) {
            this.field_1232 = 0;
         }

         ++this.field_1232;
         this.field_1230 = 0;
         var4 = this;
      }

      add var2 = var4.field_1218.field_2880.method_3803();
      class_1855.method_10050(this, var2);
   }

   // $FF: renamed from: b (aR, int, int, int) void
   protected void method_1201(class_492 var1, int var2, int var3, int var4) {
      int var5;
      int var10000;
      label99: {
         var10000 = class_209.method_1160();
         this.field_1224 = true;
         this.field_1228 = true;
         var5 = var10000;
         this.field_1229 = 0;
         class_229 var11 = this;
         if(var5 == 0) {
            if(this.field_1226) {
               break label99;
            }

            this.field_1218.field_2881.method_3810();
            var11 = this;
         }

         var11.field_1226 = true;
      }

      add var6;
      class_688 var7;
      label102: {
         class_492 var12 = var1;
         if(var5 == 0) {
            if(var1 == null) {
               break label102;
            }

            var12 = var1;
         }

         if(var12.field_2286 != field_1212) {
            return;
         }

         label103: {
            add var8;
            byte var9;
            add var13;
            label81: {
               var7 = this.field_1218.field_2880;
               var6 = var7.method_3808();
               var8 = var1.method_2875();
               var13 = var8;
               if(var5 == 0) {
                  if(var8 == null) {
                     break label81;
                  }

                  var13 = var6;
               }

               if(var13 == null) {
                  label104: {
                     var9 = 0;
                     var10000 = var9;
                     if(var5 == 0) {
                        if(var9 != 0) {
                           break label103;
                        }

                        var7.method_3807(add.method_3760(var8));
                        var6 = var7.method_3808();
                        if(var5 != 0) {
                           break label104;
                        }

                        var10000 = var4;
                     }

                     if(var10000 != 2) {
                        break label103;
                     }

                     var6.field_2958 = var6.method_3739();
                  }

                  if(var5 == 0) {
                     break label103;
                  }
               }
            }

            label106: {
               var9 = 0;
               var10000 = var9;
               if(var5 == 0) {
                  if(var9 != 0) {
                     break label103;
                  }

                  var7.method_3807(add.method_3760(var8));
                  var13 = var7.method_3808();
                  if(var5 != 0) {
                     break label106;
                  }

                  var6 = var13;
                  var10000 = var4;
               }

               if(var10000 != 3) {
                  break label103;
               }

               var13 = var6;
            }

            var13.field_2958 = var6.method_3739();
         }

         if(var5 == 0) {
            return;
         }
      }

      var7 = this.field_1218.field_2880;
      if(var7.method_3808() != null) {
         var10000 = var3;
         if(var5 == 0) {
            if(var3 == 0) {
               this.field_557.maxStringLength8.method_7858(var7.method_3808());
               var7.method_3807((add)null);
            }

            var10000 = var3;
         }

         if(var10000 == 1) {
            var6 = var7.method_3808().method_3729(1);
            this.field_557.maxStringLength8.method_7858(var6);
            class_688 var10 = var7;
            if(var5 == 0) {
               if(var7.method_3808().field_2958 != 0) {
                  return;
               }

               var10 = var7;
            }

            var10.method_3807((add)null);
         }
      }

   }

   // $FF: renamed from: b () void
   public void initGui() {
      super.initGui();
      int var1 = (this.width - this.field_1105) / 2;
      int var2 = (this.height - this.field_1106) / 2;
      this.buttonList.clear();
      Keyboard.enableRepeatEvents(true);
      GuiTextField var10001 = new GuiTextField;
      var10001.GuiTextField(this.fontRendererObj, var1 + 80, var2 + 5, 89, this.fontRendererObj.FONT_HEIGHT + 1);
      this.field_1223 = var10001;
      this.field_1223.setMaxStringLength(15);
      this.field_1223.setEnableBackgroundDrawing(true);
      this.field_1223.setVisible(true);
      this.field_1223.setTextColor(16777215);
      this.method_1241(class_872.field_4249);
   }

   // $FF: renamed from: m () void
   public void method_872() {
      super.method_872();
      Keyboard.enableRepeatEvents(false);
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      class_229 var4;
      label27: {
         int var3 = class_209.method_1159();
         boolean var10000 = this.field_1224;
         if(var3 != 0) {
            if(this.field_1224) {
               this.field_1224 = false;
               this.field_1223.writeText("");
            }

            var4 = this;
            if(var3 == 0) {
               break label27;
            }

            var10000 = this.field_1223.method_726(var1, var2);
         }

         if(var10000) {
            this.method_1239();
            if(var3 != 0) {
               return;
            }
         }

         var4 = this;
      }

      var4.method_856(var1, var2);
   }

   // $FF: renamed from: a () void
   private void method_1239() {
      int var10000 = class_209.method_1159();
      class_672 var2 = (class_672)this.field_1107;
      var2.field_2879.clear();
      int var1 = var10000;
      Iterator var3 = adb.field_2329.iterator();

      Iterator var11;
      while(true) {
         if(var3.hasNext()) {
            var11 = var3;
            if(var1 == 0) {
               break;
            }

            label79: {
               adb var4 = (adb)var3.next();
               adb var12 = var4;
               if(var1 != 0) {
                  if(var4 == null) {
                     break label79;
                  }

                  var12 = var4;
               }

               if(var1 != 0) {
                  if(var12.getCreativeTab() == null) {
                     break label79;
                  }

                  var12 = var4;
               }

               var12.getSubItems(var4, (class_872)null, var2.field_2879);
            }

            if(var1 != 0) {
               continue;
            }
         }

         var11 = var2.field_2879.iterator();
         break;
      }

      Iterator var10 = var11;
      String var5 = this.field_1223.method_714().toLowerCase();

      while(true) {
         if(var10.hasNext()) {
            add var6 = (add)var10.next();
            boolean var7 = false;
            if(var1 == 0) {
               break;
            }

            Iterator var8 = var6.method_3774(this.field_557.cursorCounter8, this.field_557.canLoseFocus7.field_4506).iterator();

            boolean var13;
            while(true) {
               if(var8.hasNext()) {
                  String var9 = (String)var8.next();
                  var13 = var9.toLowerCase().contains(var5);
                  if(var1 == 0) {
                     break;
                  }

                  if(var1 != 0) {
                     if(!var13 && var1 != 0) {
                        continue;
                     }

                     var13 = true;
                  }

                  var7 = var13;
               }

               var13 = var7;
               break;
            }

            if(!var13) {
               var10.remove();
            }

            if(var1 != 0) {
               continue;
            }
         }

         this.field_1219 = 0.0F;
         var2.method_3680(0.0F);
         break;
      }

   }

   // $FF: renamed from: a (int, int) void
   protected void method_1194(int var1, int var2) {
      int var10000 = class_209.method_1159();
      class_872 var4 = class_872.field_4249;
      int var3 = var10000;
      if(var3 != 0 && var4.method_5155()) {
         String[] var10001 = field_1234;
         this.fontRendererObj.method_7020("Recherche: ", 8, 6, 4210752);
      }

   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int var1, int var2, int var3) {
      super.method_862(var1, var2, var3);
   }

   // $FF: renamed from: h () boolean
   private boolean method_1240() {
      int var10000;
      label32: {
         int var1 = class_209.method_1160();
         var10000 = field_1213;
         if(var1 == 0) {
            if(field_1213 == class_872.fontRendererInstance5.method_5147()) {
               break label32;
            }

            var10000 = class_872.field_4243[field_1213].method_5157();
         }

         if(var1 == 0) {
            if(var10000 == 0) {
               break label32;
            }

            var10000 = ((class_672)this.field_1107).method_3681();
         }

         if(var1 != 0) {
            return (boolean)var10000;
         }

         if(var10000 != 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: a (a5) void
   private void method_1241(class_872 var1) {
      int var10000 = class_209.method_1160();
      int var3 = field_1213;
      int var2 = var10000;
      field_1213 = var1.method_5147();
      class_672 var4 = (class_672)this.field_1107;
      var4.field_2879.clear();
      var1.method_5164(var4.field_2879);
      class_229 var5 = this;
      if(var2 == 0) {
         if(this.field_1223 != null) {
            label14: {
               if(var1 == class_872.field_4249) {
                  this.field_1223.setVisible(true);
                  this.field_1223.setCanLoseFocus(false);
                  this.field_1223.setFocused(true);
                  this.field_1223.writeText("");
                  this.method_1239();
                  if(var2 == 0) {
                     break label14;
                  }
               }

               this.field_1223.setVisible(false);
               this.field_1223.setCanLoseFocus(true);
               this.field_1223.setFocused(false);
            }
         }

         var5 = this;
      }

      var5.field_1219 = 0.0F;
      var4.method_3680(0.0F);
   }

   // $FF: renamed from: k () void
   public void method_869() {
      super.method_869();
      int var10000 = class_209.method_1159();
      int var2 = Mouse.getEventDWheel();
      int var1 = var10000;
      var10000 = var2;
      if(var1 != 0) {
         if(var2 == 0) {
            return;
         }

         var10000 = this.method_1240();
      }

      if(var1 != 0) {
         if(var10000 == 0) {
            return;
         }

         var10000 = ((class_672)this.field_1107).field_2879.size() / 9 - 5 + 1;
      }

      int var3 = var10000;
      var10000 = var2;
      if(var1 != 0) {
         if(var2 > 0) {
            var2 = 1;
         }

         var10000 = var2;
      }

      if(var1 != 0) {
         if(var10000 < 0) {
            var2 = -1;
         }

         this.field_1219 = (float)((double)this.field_1219 - (double)var2 / (double)var3);
         float var5;
         var10000 = (var5 = this.field_1219 - 0.0F) == 0.0F?0:(var5 < 0.0F?-1:1);
      }

      class_229 var4;
      label58: {
         if(var1 != 0) {
            if(var10000 < 0) {
               this.field_1219 = 0.0F;
            }

            var4 = this;
            if(var1 == 0) {
               break label58;
            }

            float var6;
            var10000 = (var6 = this.field_1219 - 0.78F) == 0.0F?0:(var6 < 0.0F?-1:1);
         }

         if(var10000 > 0) {
            this.field_1219 = 0.78F;
         }

         var4 = this;
      }

      ((class_672)var4.field_1107).method_3680(this.field_1219);
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      int var10000 = class_209.method_1159();
      byte var5 = Mouse.isButtonDown(0);
      int var6 = this.field_1108;
      int var7 = this.field_1221;
      int var8 = var6 + 175;
      int var4 = var10000;
      int var9 = var7 + 18;
      int var10 = var8 + 14;
      int var11 = var9 + 112;
      var10000 = this.field_1222;
      if(var4 != 0) {
         label70: {
            if(!this.field_1222) {
               var10000 = var5;
               if(var4 == 0) {
                  break label70;
               }

               if(var5 != 0) {
                  var10000 = var1;
                  if(var4 == 0) {
                     break label70;
                  }

                  if(var1 >= var8) {
                     var10000 = var2;
                     if(var4 == 0) {
                        break label70;
                     }

                     if(var2 >= var9) {
                        var10000 = var1;
                        if(var4 == 0) {
                           break label70;
                        }

                        if(var1 < var10) {
                           var10000 = var2;
                           if(var4 == 0) {
                              break label70;
                           }

                           if(var2 < var11) {
                              this.field_1220 = this.method_1240();
                           }
                        }
                     }
                  }
               }
            }

            var10000 = var5;
         }
      }

      if(var4 != 0) {
         if(var10000 == 0) {
            this.field_1220 = false;
         }

         this.field_1222 = (boolean)var5;
         var10000 = this.field_1220;
      }

      if(var4 != 0) {
         if(var10000 != 0) {
            class_229 var12;
            label74: {
               this.field_1219 = ((float)(var2 - var9) - 7.5F) / ((float)(var11 - var9) - 15.0F);
               float var13;
               var10000 = (var13 = this.field_1219 - 0.0F) == 0.0F?0:(var13 < 0.0F?-1:1);
               if(var4 != 0) {
                  if(var10000 < 0) {
                     this.field_1219 = 0.0F;
                  }

                  var12 = this;
                  if(var4 == 0) {
                     break label74;
                  }

                  double var14;
                  var10000 = (var14 = (double)this.field_1219 - 0.78D) == 0.0D?0:(var14 < 0.0D?-1:1);
               }

               if(var10000 > 0) {
                  this.field_1219 = 0.78F;
               }

               var12 = this;
            }

            ((class_672)var12.field_1107).method_3680(this.field_1219);
         }

         super.drawScreen(var1, var2, var3);
         GL11.glEnable(2896);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var10000 = 2896;
      }

      GL11.glEnable(var10000);
   }

   // $FF: renamed from: b (float, int, int) void
   protected void method_1195(float var1, int var2, int var3) {
      int var4;
      bqx var5;
      class_872 var6;
      bqx var7;
      int var10000;
      label35: {
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var10000 = class_209.method_1160();
         bam.method_5216();
         var4 = var10000;
         bqx var14 = new bqx;
         String[] var13 = field_1234;
         var14.method_8227("textures/gui/container/creative_inventory/tabs.png");
         var5 = var14;
         var6 = class_872.field_4249;
         if(this.field_1230 == 1) {
            var14 = new bqx;
            var14.method_8227("textures/gui/container/craftsFour.png");
            var7 = var14;
            if(var4 == 0) {
               break label35;
            }
         }

         var14 = new bqx;
         String[] var10002 = field_1234;
         var14.method_8227("textures/gui/container/crafts.png");
         var7 = var14;
      }

      class_872 var8 = class_872.field_4249;
      class_872[] var9 = class_872.field_4243;
      int var10 = var9.length;
      this.method_1244(var8);
      this.field_1108 = (this.width - this.field_1105) / 2;
      this.field_1221 = (this.height - this.field_1106) / 2;
      this.field_557.maxStringLength6.bindTexture(var7);
      this.method_658(this.field_1108, this.field_1221, 0, 0, this.field_1105, this.field_1106);
      var10000 = this.field_1230;
      int var11;
      if(var4 == 0) {
         if(this.field_1230 != 0) {
            var11 = this.field_1231 / 2;
            this.method_658(this.field_1108 + 93, this.field_1221 + 139, this.field_1105, 15, var11 + 1, 167);
         }

         this.field_1223.drawTextBox();
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var10000 = this.field_1108 + 175;
      }

      var11 = var10000;
      var10 = this.field_1221 + 18;
      int var12 = var10 + 112;
      this.field_557.maxStringLength6.bindTexture(var5);
      short var15 = var6.method_5157();
      if(var4 == 0) {
         if(var15 != 0) {
            int var16 = var10 + (int)((float)(var12 - var10 - 17) * this.field_1219);
            int var10004 = this.method_1240();
            if(var4 == 0) {
               var10004 = var10004 != 0?0:12;
            }

            this.method_658(var11, var16, 232 + var10004, 0, 12, 15);
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var15 = 2896;
      }

      GL11.glEnable(var15);
      this.method_1244(var6);
   }

   // $FF: renamed from: a (a5, int, int) boolean
   protected boolean method_1242(class_872 var1, int var2, int var3) {
      int var10000;
      int var4;
      int var6;
      byte var7;
      label70: {
         label73: {
            int var5 = var1.method_5159();
            var10000 = class_209.method_1159();
            var6 = 28 * var5;
            var7 = 0;
            var4 = var10000;
            var10000 = var5;
            if(var4 != 0) {
               if(var5 == 5) {
                  var6 = this.field_1105 - 28 + 2;
                  if(var4 != 0) {
                     break label73;
                  }
               }

               var10000 = var5;
            }

            if(var4 == 0) {
               break label70;
            }

            if(var10000 > 0) {
               var6 += var5;
            }
         }

         var10000 = var1.method_5160();
      }

      int var8;
      label59: {
         if(var4 != 0) {
            if(var10000 != 0) {
               var8 = var7 - 32;
               if(var4 != 0) {
                  break label59;
               }
            }

            var10000 = var7 + this.field_1106;
         }

         var8 = var10000;
      }

      label74: {
         var10000 = var2;
         int var10001 = var6;
         if(var4 != 0) {
            if(var2 < var6) {
               break label74;
            }

            var10000 = var2;
            var10001 = var6 + 28;
         }

         if(var4 != 0) {
            if(var10000 > var10001) {
               break label74;
            }

            var10000 = var3;
            var10001 = var8;
         }

         if(var4 != 0) {
            if(var10000 < var10001) {
               break label74;
            }

            var10000 = var3;
            if(var4 == 0) {
               return (boolean)var10000;
            }

            var10001 = var8 + 32;
         }

         if(var10000 <= var10001) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: b (a5, int, int) boolean
   protected boolean method_1243(class_872 var1, int var2, int var3) {
      int var10000;
      int var4;
      int var6;
      byte var7;
      label43: {
         label46: {
            int var5 = var1.method_5159();
            var10000 = class_209.method_1159();
            var6 = 28 * var5;
            var7 = 0;
            var4 = var10000;
            var10000 = var5;
            if(var4 != 0) {
               if(var5 == 5) {
                  var6 = this.field_1105 - 28 + 2;
                  if(var4 != 0) {
                     break label46;
                  }
               }

               var10000 = var5;
            }

            if(var4 == 0) {
               break label43;
            }

            if(var10000 > 0) {
               var6 += var5;
            }
         }

         var10000 = var1.method_5160();
      }

      int var8;
      label32: {
         if(var4 != 0) {
            if(var10000 != 0) {
               var8 = var7 - 32;
               if(var4 != 0) {
                  break label32;
               }
            }

            var10000 = var7 + this.field_1106;
         }

         var8 = var10000;
      }

      boolean var9 = this.method_1200(var6 + 3, var8 + 3, 23, 27, var2, var3);
      if(var4 != 0) {
         if(var9) {
            this.method_860(var1.method_5149(), var2, var3);
            return true;
         }

         var9 = false;
      }

      return var9;
   }

   // $FF: renamed from: b (a5) void
   protected void method_1244(class_872 var1) {
      label15: {
         GL11.glDisable(2896);
         this.field_372 = 100.0F;
         field_556.field_3806 = 100.0F;
         int var10000 = class_209.method_1159();
         GL11.glEnable(2896);
         GL11.glEnable('\u803a');
         int var2 = var10000;
         int var3 = (this.width - this.field_1105) / 2;
         int var4 = (this.height - this.field_1106) / 2;
         add var6 = new add;
         var6.method_3721(class_1192.field_6085);
         add var5 = var6;
         if(var2 != 0) {
            if(this.field_1230 == 1) {
               var6 = new add;
               var6.method_3721(class_1192.field_6088);
               var5 = var6;
               field_556.method_4755(this.fontRendererObj, this.field_557.maxStringLength6, var5, var3 + 26, var4 + 139);
               field_556.method_4758(this.fontRendererObj, this.field_557.maxStringLength6, var5, var3 + 26, var4 + 139);
               if(var2 != 0) {
                  break label15;
               }
            }

            field_556.method_4755(this.fontRendererObj, this.field_557.maxStringLength6, var5, var3 + 10, var4 + 139);
         }

         field_556.method_4758(this.fontRendererObj, this.field_557.maxStringLength6, var5, var3 + 10, var4 + 139);
      }

      GL11.glDisable(2896);
      field_556.field_3806 = 0.0F;
      this.field_372 = 0.0F;
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {}

   // $FF: renamed from: i () int
   public int method_1245() {
      return field_1213;
   }

   // $FF: renamed from: j () vN
   public static class_1674 method_1246() {
      return field_1212;
   }

   // $FF: renamed from: n () add
   public add method_1247() {
      int var1 = class_209.method_1160();
      int var10000 = this.method_1249();
      if(var1 == 0) {
         if(var10000 > 21) {
            this.field_1225 = this.field_1229 = 0;
         }

         var10000 = 20;
      }

      add[] var3 = new add[var10000];
      add var10003 = new add;
      var10003.method_3724(class_1010.field_5121);
      var3[0] = var10003;
      var10003 = new add;
      var10003.method_3721(class_1192.field_6030);
      var3[1] = var10003;
      var10003 = new add;
      var10003.method_3721(class_1192.field_6030);
      var3[2] = var10003;
      var10003 = new add;
      var10003.method_3721(class_1192.field_6150);
      var3[3] = var10003;
      var10003 = new add;
      var10003.method_3721(class_1192.field_6031);
      var3[4] = var10003;
      var10003 = new add;
      var10003.method_3724(class_1010.field_5126);
      var3[5] = var10003;
      var10003 = new add;
      var10003.method_3721(class_1192.field_6098);
      var3[6] = var10003;
      var10003 = new add;
      var10003.method_3724(class_1010.field_5138);
      var3[7] = var10003;
      var10003 = new add;
      var10003.method_3721(class_1192.field_6111);
      var3[8] = var10003;
      var10003 = new add;
      var10003.method_3721(class_1192.field_6080);
      var3[9] = var10003;
      var10003 = new add;
      var10003.method_3721(class_1192.field_6121);
      var3[10] = var10003;
      var10003 = new add;
      var10003.method_3721(class_1192.field_6085);
      var3[11] = var10003;
      var10003 = new add;
      var10003.method_3721(class_1192.field_6074);
      var3[12] = var10003;
      var10003 = new add;
      var10003.method_3721(class_1192.field_6081);
      var3[13] = var10003;
      var10003 = new add;
      var10003.method_3721(class_1192.field_6110);
      var3[14] = var10003;
      var10003 = new add;
      var10003.method_3721(class_1192.field_6110);
      var3[15] = var10003;
      var10003 = new add;
      var10003.method_3721(class_1192.field_6124);
      var3[16] = var10003;
      var10003 = new add;
      var10003.method_3721(class_1192.field_6125);
      var3[17] = var10003;
      var10003 = new add;
      var10003.method_3724(class_1010.field_5226);
      var3[18] = var10003;
      var10003 = new add;
      var10003.method_3724(class_1010.field_5185);
      var3[19] = var10003;
      add[] var2 = var3;
      return var2[this.method_1249()];
   }

   // $FF: renamed from: s () int
   public int method_1248() {
      int var10000 = class_209.method_1160();
      byte var2 = 0;
      int var1 = var10000;
      var10000 = this.field_1229;
      short var10001 = 25;
      if(var1 == 0) {
         if(this.field_1229 <= 25) {
            var2 = 0;
         }

         var10000 = this.field_1229;
         var10001 = 25;
      }

      if(var1 == 0) {
         if(var10000 > var10001) {
            var2 = 1;
         }

         var10000 = this.field_1229;
         var10001 = 50;
      }

      if(var1 == 0) {
         if(var10000 > var10001) {
            var2 = 2;
         }

         var10000 = this.field_1229;
         var10001 = 75;
      }

      if(var1 == 0) {
         if(var10000 > var10001) {
            var2 = 3;
         }

         var10000 = this.field_1229;
         var10001 = 100;
      }

      if(var1 == 0) {
         if(var10000 > var10001) {
            var2 = 4;
         }

         var10000 = this.field_1229;
         var10001 = 125;
      }

      if(var1 == 0) {
         if(var10000 > var10001) {
            var2 = 5;
         }

         var10000 = this.field_1229;
         var10001 = 150;
      }

      if(var1 == 0) {
         if(var10000 > var10001) {
            var2 = 6;
         }

         var10000 = this.field_1229;
         var10001 = 175;
      }

      if(var1 == 0) {
         if(var10000 > var10001) {
            var2 = 7;
         }

         var10000 = this.field_1229;
         var10001 = 200;
      }

      if(var1 == 0) {
         if(var10000 > var10001) {
            var2 = 8;
         }

         var10000 = this.field_1229;
         var10001 = 225;
      }

      if(var1 == 0) {
         if(var10000 > var10001) {
            var2 = 9;
         }

         var10000 = this.field_1229;
         var10001 = 250;
      }

      if(var1 == 0) {
         if(var10000 > var10001) {
            var2 = 10;
         }

         var10000 = this.field_1229;
         var10001 = 275;
      }

      if(var1 == 0) {
         if(var10000 > var10001) {
            var2 = 11;
         }

         var10000 = this.field_1229;
         var10001 = 300;
      }

      if(var1 == 0) {
         if(var10000 > var10001) {
            var2 = 12;
         }

         var10000 = this.field_1229;
         var10001 = 325;
      }

      if(var1 == 0) {
         if(var10000 > var10001) {
            var2 = 13;
         }

         var10000 = this.field_1229;
         var10001 = 350;
      }

      if(var1 == 0) {
         if(var10000 > var10001) {
            var2 = 14;
         }

         var10000 = this.field_1229;
         if(var1 != 0) {
            return var10000;
         }

         var10001 = 400;
      }

      if(var10000 > var10001) {
         var2 = 15;
      }

      var10000 = var2;
      return var10000;
   }

   // $FF: renamed from: t () int
   private int method_1249() {
      int var10000 = class_209.method_1159();
      byte var2 = 0;
      int var1 = var10000;
      var10000 = this.field_1229;
      short var10001 = 12;
      if(var1 != 0) {
         if(this.field_1229 <= 12) {
            var2 = 0;
         }

         var10000 = this.field_1229;
         var10001 = 12;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 1;
         }

         var10000 = this.field_1229;
         var10001 = 25;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 2;
         }

         var10000 = this.field_1229;
         var10001 = 37;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 3;
         }

         var10000 = this.field_1229;
         var10001 = 50;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 4;
         }

         var10000 = this.field_1229;
         var10001 = 62;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 5;
         }

         var10000 = this.field_1229;
         var10001 = 75;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 6;
         }

         var10000 = this.field_1229;
         var10001 = 87;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 7;
         }

         var10000 = this.field_1229;
         var10001 = 100;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 8;
         }

         var10000 = this.field_1229;
         var10001 = 112;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 9;
         }

         var10000 = this.field_1229;
         var10001 = 125;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 10;
         }

         var10000 = this.field_1229;
         var10001 = 137;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 11;
         }

         var10000 = this.field_1229;
         var10001 = 150;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 12;
         }

         var10000 = this.field_1229;
         var10001 = 162;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 13;
         }

         var10000 = this.field_1229;
         var10001 = 175;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 14;
         }

         var10000 = this.field_1229;
         var10001 = 200;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 15;
         }

         var10000 = this.field_1229;
         var10001 = 212;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 16;
         }

         var10000 = this.field_1229;
         var10001 = 225;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 17;
         }

         var10000 = this.field_1229;
         var10001 = 237;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 18;
         }

         var10000 = this.field_1229;
         var10001 = 250;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 19;
         }

         var10000 = this.field_1229;
         var10001 = 262;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 20;
         }

         var10000 = this.field_1229;
         var10001 = 275;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 21;
         }

         var10000 = this.field_1229;
         var10001 = 287;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 22;
         }

         var10000 = this.field_1229;
         var10001 = 300;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 23;
         }

         var10000 = this.field_1229;
         var10001 = 312;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 24;
         }

         var10000 = this.field_1229;
         var10001 = 125;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 25;
         }

         var10000 = this.field_1229;
         var10001 = 337;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 26;
         }

         var10000 = this.field_1229;
         var10001 = 350;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 27;
         }

         var10000 = this.field_1229;
         var10001 = 362;
      }

      if(var1 != 0) {
         if(var10000 > var10001) {
            var2 = 28;
         }

         var10000 = this.field_1229;
         if(var1 == 0) {
            return var10000;
         }

         var10001 = 375;
      }

      if(var10000 > var10001) {
         var2 = 29;
      }

      var10000 = var2;
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1203() {
      // $FF: Couldn't be decompiled
   }
}
