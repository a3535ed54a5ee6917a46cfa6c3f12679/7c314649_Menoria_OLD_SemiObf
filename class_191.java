import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: lX
public class class_191 extends bdw {

   // $FF: renamed from: b gy
   private class_582 field_773;
   // $FF: renamed from: i int
   private int field_774;
   // $FF: renamed from: r int
   private int field_775;
   // $FF: renamed from: s bcb
   private bcb field_776;
   // $FF: renamed from: t java.lang.String[]
   private static final String[] field_777;


   // $FF: renamed from: <init> (gy) void
   public void method_1019(class_582 var1) {
      super.method_651();
      this.field_773 = var1;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      this.buttonList.clear();
      Keyboard.enableRepeatEvents(true);
      List var10000 = this.buttonList;
      bcb var10002 = new bcb;
      int var10005 = this.width / 2 - 100;
      int var10006 = this.height / 4 + 120;
      String[] var10007 = field_777;
      var10002.method_747(0, var10005, var10006, class_1450.method_7896("gui.done", new Object[0]));
      var10000.add(this.field_776 = var10002);
      this.field_773.method_3118(false);
   }

   // $FF: renamed from: m () void
   public void method_872() {
      String[] var10000 = class_752.method_4253();
      Keyboard.enableRepeatEvents(false);
      class_1436 var2 = this.field_557.method_5267();
      String[] var1 = var10000;
      if(var1 != null) {
         if(var2 != null) {
            class_257 var10001 = new class_257;
            var10001.method_1487(this.field_773.field_2465, this.field_773.field_2466, this.field_773.field_2467, this.field_773.field_2478);
            var2.method_7821(var10001);
         }

         this.field_773.method_3118(true);
      }

   }

   // $FF: renamed from: e () void
   public void method_871() {
      ++this.field_774;
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.field_451;
      if(var2 != null) {
         if(!var1.field_451) {
            return;
         }

         var10000 = var1.field_450;
      }

      if(var10000 == 0) {
         this.field_773.method_91();
         this.field_557.method_5236((bdw)null);
      }

   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var2;
      short var10001 = 200;
      if(var3 != null) {
         if(var2 == 200) {
            this.field_775 = this.field_775 - 1 & 3;
         }

         var10000 = var2;
         var10001 = 208;
      }

      label78: {
         label79: {
            label72: {
               label80: {
                  if(var3 != null) {
                     if(var10000 == var10001) {
                        break label80;
                     }

                     var10000 = var2;
                     var10001 = 28;
                  }

                  if(var3 != null) {
                     if(var10000 == var10001) {
                        break label80;
                     }

                     var10000 = var2;
                     var10001 = 156;
                  }

                  if(var3 == null) {
                     break label79;
                  }

                  if(var10000 != var10001) {
                     break label72;
                  }
               }

               this.field_775 = this.field_775 + 1 & 3;
            }

            var10000 = var2;
            if(var3 == null) {
               break label78;
            }

            var10001 = 14;
         }

         if(var10000 == var10001) {
            var10000 = this.field_773.field_2478[this.field_775].length();
            if(var3 == null) {
               break label78;
            }

            if(var10000 > 0) {
               this.field_773.field_2478[this.field_775] = this.field_773.field_2478[this.field_775].substring(0, this.field_773.field_2478[this.field_775].length() - 1);
            }
         }

         var10000 = class_1788.method_9823(var1);
      }

      byte var4;
      label47: {
         if(var3 != null) {
            if(var10000 != 0) {
               var10000 = this.field_773.field_2478[this.field_775].length();
               var4 = 15;
               if(var3 == null) {
                  break label47;
               }

               if(var10000 < 15) {
                  this.field_773.field_2478[this.field_775] = this.field_773.field_2478[this.field_775] + var1;
               }
            }

            var10000 = var2;
         }

         var4 = 1;
      }

      if(var10000 == var4) {
         this.method_865(this.field_776);
      }

   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      String[] var4;
      label42: {
         this.method_873();
         String[] var10000 = class_752.method_4253();
         String[] var10003 = field_777;
         this.drawCenteredString(this.fontRendererObj, class_1450.method_7896("sign.edit", new Object[0]), this.width / 2, 40, 16777215);
         GL11.glPushMatrix();
         GL11.glTranslatef((float)(this.width / 2), 0.0F, 50.0F);
         var4 = var10000;
         float var5 = 93.75F;
         GL11.glScalef(-var5, -var5, -var5);
         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         aji var6 = this.field_773.getBlock99();
         if(var6 == class_1192.field_6089) {
            float var7 = (float)(this.field_773.getBlock96() * 360) / 16.0F;
            GL11.glRotatef(var7, 0.0F, 1.0F, 0.0F);
            GL11.glTranslatef(0.0F, -1.0625F, 0.0F);
            if(var4 != null) {
               break label42;
            }
         }

         int var9 = this.field_773.getBlock96();
         float var8 = 0.0F;
         int var10 = var9;
         byte var10001 = 2;
         if(var4 != null) {
            if(var9 == 2) {
               var8 = 180.0F;
            }

            var10 = var9;
            var10001 = 4;
         }

         if(var4 != null) {
            if(var10 == var10001) {
               var8 = 90.0F;
            }

            var10 = var9;
            var10001 = 5;
         }

         if(var10 == var10001) {
            var8 = -90.0F;
         }

         GL11.glRotatef(var8, 0.0F, 1.0F, 0.0F);
         GL11.glTranslatef(0.0F, -1.0625F, 0.0F);
      }

      class_191 var11 = this;
      if(var4 != null) {
         if(this.field_774 / 6 % 2 == 0) {
            this.field_773.field_2479 = this.field_775;
         }

         class_1380.field_7328.method_7533(this.field_773, -0.5D, -0.75D, -0.5D, 0.0F);
         this.field_773.field_2479 = -1;
         GL11.glPopMatrix();
         var11 = this;
      }

      var11.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1020() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\bM\"ÊFP\bQbL";
      int var4 = "\bM\"ÊFP\bQbL".length();
      char var1 = 9;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_777 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 140;
               break;
            case 1:
               var10009 = 211;
               break;
            case 2:
               var10009 = 142;
               break;
            case 3:
               var10009 = 187;
               break;
            case 4:
               var10009 = 19;
               break;
            case 5:
               var10009 = 212;
               break;
            default:
               var10009 = 134;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
