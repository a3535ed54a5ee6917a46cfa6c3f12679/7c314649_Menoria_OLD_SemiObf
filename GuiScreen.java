import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class GuiScreen extends Gui {

   // $FF: renamed from: j on
   protected static class_811 field_556;
   // $FF: renamed from: k bao
   public bao field_557;
   // $FF: renamed from: l int
   public int width;
   // $FF: renamed from: m int
   public int height;
   // $FF: renamed from: n java.util.List
   protected List buttonList;
   // $FF: renamed from: o java.util.List
   protected List field_561;
   // $FF: renamed from: p boolean
   public boolean field_562;
   // $FF: renamed from: q kU
   protected FontRenderer fontRendererObj;
   // $FF: renamed from: a bcb
   private bcb field_564;
   // $FF: renamed from: f int
   private int field_565;
   // $FF: renamed from: g long
   private long field_566;
   // $FF: renamed from: h int
   private int field_567;
   private static final String __OBFID = "CL_00000710";


   // $FF: renamed from: <init> () void
   public void method_651() {
      super.method_651();
      this.buttonList = new ArrayList();
      this.field_561 = new ArrayList();
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = 0;
      String[] var4 = var10000;

      while(true) {
         if(var5 < this.buttonList.size()) {
            ((bcb)this.buttonList.get(var5)).method_750(this.field_557, var1, var2);
            ++var5;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var5 = 0;
         break;
      }

      while(var5 < this.field_561.size()) {
         ((class_137)this.field_561.get(var5)).method_662(this.field_557, var1, var2);
         ++var5;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      String[] var3 = class_752.method_4253();
      if(var3 != null) {
         if(var2 != 1) {
            return;
         }

         this.field_557.method_5236((bdw)null);
      }

      this.field_557.method_5248();
   }

   // $FF: renamed from: o () java.lang.String
   public static String method_857() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e (java.lang.String) void
   public static void method_858(String var0) {
      try {
         StringSelection var1 = new StringSelection(var0);
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(var1, (ClipboardOwner)null);
      } catch (Exception var2) {
         ;
      }

   }

   // $FF: renamed from: a (add, int, int) void
   protected void method_859(add var1, int var2, int var3) {
      List var5 = var1.method_3774(this.field_557.cursorCounter8, this.field_557.canLoseFocus7.field_4506);
      String[] var4 = class_752.method_4253();
      int var6 = 0;

      while(true) {
         if(var6 < var5.size()) {
            if(var4 == null) {
               break;
            }

            label19: {
               if(var6 == 0) {
                  var5.set(var6, var1.method_3776().field_354 + (String)var5.get(var6));
                  if(var4 != null) {
                     break label19;
                  }
               }

               var5.set(var6, class_130.field_283 + (String)var5.get(var6));
            }

            ++var6;
            if(var4 != null) {
               continue;
            }
         }

         this.method_861(var5, var2, var3);
         break;
      }

   }

   // $FF: renamed from: a (java.lang.String, int, int) void
   protected void method_860(String var1, int var2, int var3) {
      this.method_861(Arrays.asList(new String[]{var1}), var2, var3);
   }

   // $FF: renamed from: a (java.util.List, int, int) void
   protected void method_861(List var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      byte var10000 = var1.isEmpty();
      if(var4 != null) {
         if(var10000 != 0) {
            return;
         }

         GL11.glDisable('\u803a');
         bam.method_5212();
         GL11.glDisable(2896);
         GL11.glDisable(2929);
         var10000 = 0;
      }

      int var5 = var10000;
      Iterator var6 = var1.iterator();

      int var8;
      int var16;
      int var10001;
      while(true) {
         if(var6.hasNext()) {
            label74: {
               String var7 = (String)var6.next();
               var8 = this.fontRendererObj.getCharWidth(var7);
               var16 = var8;
               if(var4 != null) {
                  var10001 = var5;
                  if(var4 == null) {
                     break;
                  }

                  if(var8 <= var5) {
                     break label74;
                  }

                  var16 = var8;
               }

               var5 = var16;
            }

            if(var4 != null) {
               continue;
            }
         }

         var16 = var2;
         var10001 = 12;
         break;
      }

      int var15 = var16 + var10001;
      var8 = var3 - 12;
      int var9 = 8;
      var16 = var1.size();
      var10001 = 1;
      if(var4 != null) {
         if(var16 > 1) {
            var9 += 2 + (var1.size() - 1) * 10;
         }

         var16 = var15 + var5;
         var10001 = this.width;
      }

      label89: {
         if(var4 != null) {
            if(var16 > var10001) {
               var15 -= 28 + var5;
            }

            var16 = var8 + var9 + 6;
            if(var4 == null) {
               break label89;
            }

            var10001 = this.height;
         }

         if(var16 > var10001) {
            var8 = this.height - var9 - 6;
         }

         this.field_372 = 300.0F;
         field_556.field_3806 = 300.0F;
         var16 = -267386864;
      }

      int var10 = var16;
      this.drawGradientRect(var15 - 3, var8 - 4, var15 + var5 + 3, var8 - 3, var10, var10);
      this.drawGradientRect(var15 - 3, var8 + var9 + 3, var15 + var5 + 3, var8 + var9 + 4, var10, var10);
      this.drawGradientRect(var15 - 3, var8 - 3, var15 + var5 + 3, var8 + var9 + 3, var10, var10);
      this.drawGradientRect(var15 - 4, var8 - 3, var15 - 3, var8 + var9 + 3, var10, var10);
      this.drawGradientRect(var15 + var5 + 3, var8 - 3, var15 + var5 + 4, var8 + var9 + 3, var10, var10);
      int var11 = 1347420415;
      int var12 = (var11 & 16711422) >> 1 | var11 & -16777216;
      this.drawGradientRect(var15 - 3, var8 - 3 + 1, var15 - 3 + 1, var8 + var9 + 3 - 1, var11, var12);
      this.drawGradientRect(var15 + var5 + 2, var8 - 3 + 1, var15 + var5 + 3, var8 + var9 + 3 - 1, var11, var12);
      this.drawGradientRect(var15 - 3, var8 - 3, var15 + var5 + 3, var8 - 3 + 1, var11, var11);
      this.drawGradientRect(var15 - 3, var8 + var9 + 2, var15 + var5 + 3, var8 + var9 + 3, var12, var12);
      int var13 = 0;

      while(true) {
         if(var13 < var1.size()) {
            String var14 = (String)var1.get(var13);
            this.fontRendererObj.drawStringWithShadow(var14, var15, var8, -1);
            if(var4 != null) {
               var16 = var13;
               if(var4 == null) {
                  break;
               }

               if(var13 == 0) {
                  var8 += 2;
               }

               var8 += 10;
               ++var13;
            }

            if(var4 != null) {
               continue;
            }
         }

         this.field_372 = 0.0F;
         field_556.field_3806 = 0.0F;
         GL11.glEnable(2896);
         GL11.glEnable(2929);
         bam.method_5213();
         var16 = '\u803a';
         break;
      }

      GL11.glEnable(var16);
   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var3;
      if(var4 != null) {
         if(var3 != 0) {
            return;
         }

         var10000 = 0;
      }

      int var5 = var10000;

      while(var5 < this.buttonList.size()) {
         bcb var6 = (bcb)this.buttonList.get(var5);
         if(var4 != null) {
            if(var6.method_753(this.field_557, var1, var2)) {
               this.field_564 = var6;
               var6.method_756(this.field_557.method_5295());
               this.method_865(var6);
            }

            ++var5;
         }

         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (int, int, int) void
   protected void method_863(int var1, int var2, int var3) {
      if(this.field_564 != null && var3 == 0) {
         this.field_564.method_752(var1, var2);
         this.field_564 = null;
      }

   }

   // $FF: renamed from: a (int, int, int, long) void
   protected void method_864(int var1, int var2, int var3, long var4) {}

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {}

   // $FF: renamed from: a (bao, int, int) void
   public void method_866(bao var1, int var2, int var3) {
      this.field_557 = var1;
      this.fontRendererObj = var1.enableBackgroundDrawing4;
      this.width = var2;
      this.height = var3;
      this.buttonList.clear();
      this.initGui();
   }

   // $FF: renamed from: b () void
   public void initGui() {}

   // $FF: renamed from: p () void
   public void method_868() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = Mouse.isCreated();
      if(var1 != null) {
         if(var10000) {
            while(Mouse.next()) {
               this.method_869();
               if(var1 == null) {
                  return;
               }

               if(var1 == null) {
                  break;
               }
            }
         }

         var10000 = Keyboard.isCreated();
      }

      if(var1 != null) {
         if(!var10000) {
            return;
         }

         var10000 = Keyboard.next();
      }

      while(var10000) {
         this.method_870();
         if(var1 == null) {
            break;
         }

         var10000 = Keyboard.next();
      }

   }

   // $FF: renamed from: k () void
   public void method_869() {
      int var2 = Mouse.getEventX() * this.width / this.field_557.cursorCounter2;
      String[] var10000 = class_752.method_4253();
      int var3 = this.height - Mouse.getEventY() * this.height / this.field_557.cursorCounter3 - 1;
      String[] var1 = var10000;
      int var4 = Mouse.getEventButton();
      int var8 = Mouse.getEventButtonState();
      bdw var9;
      int var10001;
      if(var1 != null) {
         if(var8 != 0) {
            label68: {
               var9 = this;
               if(var1 != null) {
                  if(this.field_557.canLoseFocus7.field_4509) {
                     var9 = this;
                     var10001 = this.field_567;
                     if(var1 == null) {
                        break label68;
                     }

                     if(this.field_567++ > 0) {
                        return;
                     }
                  }

                  this.field_565 = var4;
                  this.field_566 = bao.method_5283();
                  var9 = this;
               }

               var10001 = var2;
            }

            var9.method_862(var10001, var3, this.field_565);
            if(var1 != null) {
               return;
            }
         }

         var8 = var4;
      }

      long var7;
      long var11;
      label78: {
         label79: {
            byte var10 = -1;
            if(var1 != null) {
               if(var8 != -1) {
                  label42: {
                     var9 = this;
                     if(var1 != null) {
                        if(this.field_557.canLoseFocus7.field_4509) {
                           var9 = this;
                           var10001 = this.field_567 - 1;
                           if(var1 == null) {
                              break label42;
                           }

                           if((this.field_567 = var10001) > 0) {
                              return;
                           }
                        }

                        this.field_565 = -1;
                        var9 = this;
                     }

                     var10001 = var2;
                  }

                  var9.method_863(var10001, var3, var4);
                  if(var1 != null) {
                     return;
                  }
               }

               var8 = this.field_565;
               if(var1 == null) {
                  break label79;
               }

               var10 = -1;
            }

            if(var8 == var10) {
               return;
            }

            var7 = this.field_566;
            var11 = 0L;
            if(var1 == null) {
               break label78;
            }

            long var12;
            var8 = (var12 = this.field_566 - 0L) == 0L?0:(var12 < 0L?-1:1);
         }

         if(var8 <= 0) {
            return;
         }

         var7 = bao.method_5283();
         var11 = this.field_566;
      }

      long var5 = var7 - var11;
      this.method_864(var2, var3, this.field_565, var5);
   }

   // $FF: renamed from: l () void
   public void method_870() {
      String[] var1 = class_752.method_4253();
      if(var1 != null) {
         if(Keyboard.getEventKeyState()) {
            this.method_856(Keyboard.getEventCharacter(), Keyboard.getEventKey());
         }

         this.field_557.method_5298();
      }

   }

   // $FF: renamed from: e () void
   public void method_871() {}

   // $FF: renamed from: m () void
   public void method_872() {}

   // $FF: renamed from: c () void
   public void method_873() {
      this.method_874(0);
   }

   // $FF: renamed from: c_ (int) void
   public void method_874(int var1) {
      String[] var2 = class_752.method_4253();
      bdw var10000 = this;
      if(var2 != null) {
         if(this.field_557.cursorCounter6 != null) {
            this.drawGradientRect(0, 0, this.width, this.height, -1072689136, -804253680);
            if(var2 != null) {
               return;
            }
         }

         var10000 = this;
      }

      var10000.method_875(var1);
   }

   // $FF: renamed from: c (int) void
   public void method_875(int var1) {
      GL11.glDisable(2896);
      GL11.glDisable(2912);
      bmh var2 = bmh.instance;
      this.field_557.method_5288().bindTexture(field_369);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var3 = 32.0F;
      var2.setVisible2();
      var2.method_7463(4210752);
      var2.addVertexWithUV(0.0D, (double)this.height, 0.0D, 0.0D, (double)((float)this.height / var3 + (float)var1));
      var2.addVertexWithUV((double)this.width, (double)this.height, 0.0D, (double)((float)this.width / var3), (double)((float)this.height / var3 + (float)var1));
      var2.addVertexWithUV((double)this.width, 0.0D, 0.0D, (double)((float)this.width / var3), (double)var1);
      var2.addVertexWithUV(0.0D, 0.0D, 0.0D, 0.0D, (double)var1);
      var2.getVisible8();
   }

   // $FF: renamed from: d () boolean
   public boolean method_876() {
      return true;
   }

   // $FF: renamed from: a (boolean, int) void
   public void method_160(boolean var1, int var2) {}

   // $FF: renamed from: q () boolean
   public static boolean method_877() {
      String[] var0 = class_752.method_4253();
      boolean var10000 = bao.maxStringLength0;
      if(var0 != null) {
         if(bao.maxStringLength0) {
            var10000 = Keyboard.isKeyDown(219);
            if(var0 != null) {
               if(!var10000) {
                  var10000 = Keyboard.isKeyDown(220);
                  if(var0 == null) {
                     return var10000;
                  }

                  if(!var10000) {
                     var10000 = false;
                     return var10000;
                  }
               }

               var10000 = true;
            }

            return var10000;
         }

         var10000 = Keyboard.isKeyDown(29);
      }

      if(var0 != null) {
         if(!var10000) {
            var10000 = Keyboard.isKeyDown(157);
            if(var0 == null) {
               return var10000;
            }

            if(!var10000) {
               var10000 = false;
               return var10000;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: r () boolean
   public static boolean method_878() {
      String[] var0 = class_752.method_4253();
      boolean var10000 = Keyboard.isKeyDown(42);
      if(var0 != null) {
         if(!var10000) {
            var10000 = Keyboard.isKeyDown(54);
            if(var0 == null) {
               return var10000;
            }

            if(!var10000) {
               var10000 = false;
               return var10000;
            }
         }

         var10000 = true;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_164() {
      boolean var10000 = true;
      char[] var10003 = "îÀ#\\]�?»M\\".toCharArray();
      Object var10004 = var10003.length;
      Object var5 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var6 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            __OBFID = (new String((char[])var5)).intern();
            String var2 = __OBFID;
            class_811 var3 = new class_811;
            var3.method_4727();
            field_556 = var3;
            return;
         }

         char var10007 = (char)((Object[])var5)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 250;
            break;
         case 1:
            var10009 = 219;
            break;
         case 2:
            var10009 = 43;
            break;
         case 3:
            var10009 = 59;
            break;
         case 4:
            var10009 = 228;
            break;
         case 5:
            var10009 = 58;
            break;
         default:
            var10009 = 239;
         }

         ((Object[])var5)[var0] = (char)(var10007 ^ var6 ^ var10009);
         ++var0;
      }
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_879(Exception var0) {
      return var0;
   }
}
