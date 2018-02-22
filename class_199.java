import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import net.minecraft.realms.RealmsBridge;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.Project;

// $FF: renamed from: lB
public class class_199 extends bdw implements class_35 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_870;
   // $FF: renamed from: i java.util.Random
   private static final Random field_871;
   // $FF: renamed from: r float
   private float field_872;
   // $FF: renamed from: s java.lang.String
   private String field_873;
   // $FF: renamed from: t bcb
   private bcb field_874;
   // $FF: renamed from: u int
   private int field_875;
   // $FF: renamed from: v bpq
   private bpq field_876;
   // $FF: renamed from: w java.lang.Object
   private final Object field_877;
   // $FF: renamed from: x java.lang.String
   private String field_878;
   // $FF: renamed from: y java.lang.String
   private String field_879;
   // $FF: renamed from: z java.lang.String
   private String field_880;
   // $FF: renamed from: A bqx
   private static final bqx field_881;
   // $FF: renamed from: B bqx
   private static final bqx field_882;
   // $FF: renamed from: C bqx[]
   private static final bqx[] field_883;
   // $FF: renamed from: D java.lang.String
   public static final String field_884;
   // $FF: renamed from: E int
   private int field_885;
   // $FF: renamed from: F int
   private int field_886;
   // $FF: renamed from: G int
   private int field_887;
   // $FF: renamed from: H int
   private int field_888;
   // $FF: renamed from: I int
   private int field_889;
   // $FF: renamed from: J int
   private int field_890;
   // $FF: renamed from: K bqx
   private bqx field_891;
   // $FF: renamed from: L java.lang.String
   private static final String field_892;
   // $FF: renamed from: M java.lang.String[]
   private static final String[] field_893;


   // $FF: renamed from: <init> () void
   public void method_651() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () void
   public void method_871() {
      ++this.field_875;
   }

   // $FF: renamed from: d () boolean
   public boolean method_876() {
      return false;
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {}

   // $FF: renamed from: b () void
   public void initGui() {
      String[] var1;
      String[] var9;
      label103: {
         label106: {
            bpq var10001 = new bpq;
            var10001.method_7980(256, 256);
            this.field_876 = var10001;
            bqf var12 = this.field_557.method_5288();
            var9 = field_893;
            this.field_891 = var12.method_8122("background", this.field_876);
            Calendar var2 = Calendar.getInstance();
            String[] var10000 = class_752.method_4253();
            var2.setTime(new Date());
            var1 = var10000;
            int var11 = var2.get(2) + 1;
            byte var13 = 11;
            if(var1 != null) {
               label100: {
                  if(var11 == 11) {
                     var11 = var2.get(5);
                     var13 = 9;
                     if(var1 == null) {
                        break label100;
                     }

                     if(var11 == 9) {
                        this.field_873 = "Happy birthday, ez!";
                        if(var1 != null) {
                           break label106;
                        }
                     }
                  }

                  var11 = var2.get(2) + 1;
                  var13 = 6;
               }
            }

            if(var1 != null) {
               label90: {
                  if(var11 == var13) {
                     var11 = var2.get(5);
                     var13 = 1;
                     if(var1 == null) {
                        break label90;
                     }

                     if(var11 == 1) {
                        var9 = field_893;
                        this.field_873 = "Happy birthday, Notch!";
                        if(var1 != null) {
                           break label106;
                        }
                     }
                  }

                  var11 = var2.get(2) + 1;
                  var13 = 12;
               }
            }

            if(var1 != null) {
               label80: {
                  if(var11 == var13) {
                     var11 = var2.get(5);
                     var13 = 24;
                     if(var1 == null) {
                        break label80;
                     }

                     if(var11 == 24) {
                        var9 = field_893;
                        this.field_873 = "Merry X-mas!";
                        if(var1 != null) {
                           break label106;
                        }
                     }
                  }

                  var11 = var2.get(2) + 1;
                  var13 = 1;
               }
            }

            if(var1 != null) {
               label107: {
                  if(var11 == var13) {
                     var11 = var2.get(5);
                     var13 = 1;
                     if(var1 == null) {
                        break label107;
                     }

                     if(var11 == 1) {
                        var9 = field_893;
                        this.field_873 = "Happy new year!";
                        if(var1 != null) {
                           break label106;
                        }
                     }
                  }

                  var11 = var2.get(2) + 1;
                  if(var1 == null) {
                     break label103;
                  }

                  var13 = 10;
               }
            }

            if(var11 == var13) {
               var11 = var2.get(5);
               if(var1 == null) {
                  break label103;
               }

               if(var11 == 31) {
                  var9 = field_893;
                  this.field_873 = "OOoooOOOoooo! Spooky!";
               }
            }
         }

         boolean var14 = true;
      }

      int var4;
      label55: {
         var4 = this.height / 4 + 48;
         class_199 var15 = this;
         if(var1 != null) {
            if(this.field_557.method_5266()) {
               this.method_1081(var4, 24);
               if(var1 != null) {
                  break label55;
               }
            }

            var15 = this;
         }

         var15.method_1080(var4, 24);
      }

      List var17 = this.buttonList;
      bcb var16 = new bcb;
      int var10004 = this.width / 2 - 100;
      int var10005 = var4 + 72 + 12;
      var9 = field_893;
      var16.method_748(0, var10004, var10005, 98, 20, class_1450.method_7896("menu.options", new Object[0]));
      var17.add(var16);
      var17 = this.buttonList;
      var16 = new bcb;
      var16.method_748(4, this.width / 2 + 2, var4 + 72 + 12, 98, 20, class_1450.method_7896("menu.quit", new Object[0]));
      var17.add(var16);
      var17 = this.buttonList;
      class_142 var18 = new class_142;
      var18.method_762(5, this.width / 2 - 124, var4 + 72 + 12);
      var17.add(var18);
      Object var5 = this.field_877;
      Object var6 = this.field_877;
      synchronized(this.field_877) {
         this.field_886 = this.fontRendererObj.getCharWidth(this.field_878);
         this.field_885 = this.fontRendererObj.getCharWidth(this.field_879);
         int var7 = Math.max(this.field_886, this.field_885);
         this.field_887 = (this.width - var7) / 2;
         this.field_888 = ((bcb)this.buttonList.get(0)).field_448 - 24;
         this.field_889 = this.field_887 + var7;
         this.field_890 = this.field_888 + 24;
      }
   }

   // $FF: renamed from: a (int, int) void
   private void method_1080(int var1, int var2) {
      List var10000 = this.buttonList;
      bcb var10001 = new bcb;
      int var10004 = this.width / 2 - 100;
      String[] var3 = field_893;
      var10001.method_747(1, var10004, var1, class_1450.method_7896("menu.singleplayer", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_747(2, this.width / 2 - 100, var1 + var2 * 1, class_1450.method_7896("menu.multiplayer", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new bcb;
      var10001.method_747(14, this.width / 2 - 100, var1 + var2 * 2, class_1450.method_7896("menu.online", new Object[0]));
      var10000.add(var10001);
   }

   // $FF: renamed from: b (int, int) void
   private void method_1081(int var1, int var2) {
      List var10000 = this.buttonList;
      bcb var10001 = new bcb;
      int var10004 = this.width / 2 - 100;
      String[] var5 = field_893;
      var10001.method_747(11, var10004, var1, class_1450.method_7896("menu.playdemo", new Object[0]));
      var10000.add(var10001);
      var10000 = this.buttonList;
      bcb var10002 = new bcb;
      var10002.method_747(12, this.width / 2 - 100, var1 + var2 * 1, class_1450.method_7896("menu.resetdemo", new Object[0]));
      var10000.add(this.field_874 = var10002);
      class_30 var3 = this.field_557.method_5235();
      class_1303 var4 = var3.method_139("Demo_World");
      if(var4 == null) {
         this.field_874.field_451 = false;
      }

   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.field_450;
      bao var8;
      if(var2 != null) {
         if(var1.field_450 == 0) {
            var8 = this.field_557;
            bdm var10001 = new bdm;
            var10001.method_1114(this, this.field_557.canLoseFocus7);
            var8.method_5236(var10001);
         }

         var10000 = var1.field_450;
      }

      byte var9 = 5;
      if(var2 != null) {
         if(var10000 == 5) {
            var8 = this.field_557;
            class_173 var10 = new class_173;
            var10.method_926(this, this.field_557.canLoseFocus7, this.field_557.method_5291());
            var8.method_5236(var10);
         }

         var10000 = var1.field_450;
         var9 = 1;
      }

      if(var2 != null) {
         if(var10000 == var9) {
            var8 = this.field_557;
            class_166 var11 = new class_166;
            var11.method_887(this);
            var8.method_5236(var11);
         }

         var10000 = var1.field_450;
         var9 = 2;
      }

      if(var2 != null) {
         if(var10000 == var9) {
            var8 = this.field_557;
            class_190 var12 = new class_190;
            var12.method_1008(this);
            var8.method_5236(var12);
         }

         var10000 = var1.field_450;
         var9 = 14;
      }

      if(var2 != null) {
         if(var10000 == var9) {
            this.method_1082();
         }

         var10000 = var1.field_450;
         var9 = 4;
      }

      if(var2 != null) {
         if(var10000 == var9) {
            this.field_557.method_5247();
         }

         var10000 = var1.field_450;
         var9 = 11;
      }

      if(var2 != null) {
         if(var10000 == var9) {
            String[] var6 = field_893;
            this.field_557.method_5258("Demo_World", "Demo_World", class_356.field_1869);
         }

         var10000 = var1.field_450;
         var9 = 12;
      }

      if(var10000 == var9) {
         class_30 var3 = this.field_557.method_5235();
         String[] var7 = field_893;
         class_1303 var4 = var3.method_139("Demo_World");
         if(var4 != null) {
            class_183 var5 = class_166.method_893(this, var4.method_6851(), 12);
            this.field_557.method_5236(var5);
         }
      }

   }

   // $FF: renamed from: f () void
   private void method_1082() {
      RealmsBridge var10000 = new RealmsBridge;
      var10000.method_3791();
      RealmsBridge var1 = var10000;
      var1.switchToRealms(this);
   }

   // $FF: renamed from: a (boolean, int) void
   public void method_160(boolean param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int, int, float) void
   private void method_1083(int var1, int var2, float var3) {
      bmh var5 = bmh.instance;
      GL11.glMatrixMode(5889);
      GL11.glPushMatrix();
      String[] var10000 = class_752.method_4253();
      GL11.glLoadIdentity();
      Project.gluPerspective(120.0F, 1.0F, 0.05F, 10.0F);
      GL11.glMatrixMode(5888);
      GL11.glPushMatrix();
      String[] var4 = var10000;
      GL11.glLoadIdentity();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
      GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
      GL11.glEnable(3042);
      GL11.glDisable(3008);
      GL11.glDisable(2884);
      GL11.glDepthMask(false);
      buu.method_9081(770, 771, 1, 0);
      byte var6 = 8;
      int var7 = 0;

      short var13;
      while(true) {
         if(var7 < var6 * var6) {
            GL11.glPushMatrix();
            float var8 = ((float)(var7 % var6) / (float)var6 - 0.5F) / 64.0F;
            float var9 = ((float)(var7 / var6) / (float)var6 - 0.5F) / 64.0F;
            float var10 = 0.0F;
            GL11.glTranslatef(var8, var9, var10);
            GL11.glRotatef(class_1715.method_9555(((float)this.field_875 + var3) / 400.0F) * 25.0F + 20.0F, 1.0F, 0.0F, 0.0F);
            GL11.glRotatef(-((float)this.field_875 + var3) * 0.1F, 0.0F, 1.0F, 0.0F);
            var13 = 0;
            if(var4 == null) {
               break;
            }

            int var11 = 0;

            int var14;
            byte var10001;
            while(true) {
               if(var11 < 6) {
                  GL11.glPushMatrix();
                  var14 = var11;
                  var10001 = 1;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     if(var11 == 1) {
                        GL11.glRotatef(90.0F, 0.0F, 1.0F, 0.0F);
                     }

                     var14 = var11;
                     var10001 = 2;
                  }

                  if(var4 != null) {
                     if(var14 == var10001) {
                        GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
                     }

                     var14 = var11;
                     var10001 = 3;
                  }

                  if(var4 != null) {
                     if(var14 == var10001) {
                        GL11.glRotatef(-90.0F, 0.0F, 1.0F, 0.0F);
                     }

                     var14 = var11;
                     var10001 = 4;
                  }

                  if(var4 != null) {
                     if(var14 == var10001) {
                        GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
                     }

                     var14 = var11;
                     var10001 = 5;
                  }

                  if(var14 == var10001) {
                     GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
                  }

                  this.field_557.method_5288().bindTexture(field_883[var11]);
                  var5.setVisible2();
                  var5.method_7464(16777215, 255 / (var7 + 1));
                  float var12 = 0.0F;
                  var5.addVertexWithUV(-1.0D, -1.0D, 1.0D, (double)(0.0F + var12), (double)(0.0F + var12));
                  var5.addVertexWithUV(1.0D, -1.0D, 1.0D, (double)(1.0F - var12), (double)(0.0F + var12));
                  var5.addVertexWithUV(1.0D, 1.0D, 1.0D, (double)(1.0F - var12), (double)(1.0F - var12));
                  var5.addVertexWithUV(-1.0D, 1.0D, 1.0D, (double)(0.0F + var12), (double)(1.0F - var12));
                  var5.getVisible8();
                  GL11.glPopMatrix();
                  ++var11;
                  if(var4 != null) {
                     continue;
                  }
               }

               GL11.glPopMatrix();
               var14 = 1;
               var10001 = 1;
               break;
            }

            GL11.glColorMask((boolean)var14, (boolean)var10001, true, false);
            ++var7;
            if(var4 != null) {
               continue;
            }
         }

         var5.method_7467(0.0D, 0.0D, 0.0D);
         GL11.glColorMask(true, true, true, true);
         GL11.glMatrixMode(5889);
         GL11.glPopMatrix();
         GL11.glMatrixMode(5888);
         GL11.glPopMatrix();
         GL11.glDepthMask(true);
         GL11.glEnable(2884);
         var13 = 2929;
         break;
      }

      GL11.glEnable(var13);
   }

   // $FF: renamed from: b (float) void
   private void method_1084(float var1) {
      this.field_557.method_5288().bindTexture(this.field_891);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, 256, 256);
      GL11.glEnable(3042);
      buu.method_9081(770, 771, 1, 0);
      String[] var10000 = class_752.method_4253();
      GL11.glColorMask(true, true, true, false);
      bmh var3 = bmh.instance;
      var3.setVisible2();
      GL11.glDisable(3008);
      String[] var2 = var10000;
      byte var4 = 3;
      int var5 = 0;

      while(true) {
         if(var5 < var4) {
            var3.setVisible7(1.0F, 1.0F, 1.0F, 1.0F / (float)(var5 + 1));
            int var6 = this.width;
            int var7 = this.height;
            float var8 = (float)(var5 - var4 / 2) / 256.0F;
            var3.addVertexWithUV((double)var6, (double)var7, (double)this.field_372, (double)(0.0F + var8), 1.0D);
            var3.addVertexWithUV((double)var6, 0.0D, (double)this.field_372, (double)(1.0F + var8), 1.0D);
            var3.addVertexWithUV(0.0D, 0.0D, (double)this.field_372, (double)(1.0F + var8), 0.0D);
            var3.addVertexWithUV(0.0D, (double)var7, (double)this.field_372, (double)(0.0F + var8), 0.0D);
            ++var5;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         var3.getVisible8();
         GL11.glEnable(3008);
         GL11.glColorMask(true, true, true, true);
         break;
      }

   }

   // $FF: renamed from: d (int, int, float) void
   private void method_1085(int var1, int var2, float var3) {
      this.field_557.method_5222().method_7493();
      GL11.glViewport(0, 0, 256, 256);
      this.method_1083(var1, var2, var3);
      this.method_1084(var3);
      this.method_1084(var3);
      this.method_1084(var3);
      this.method_1084(var3);
      this.method_1084(var3);
      this.method_1084(var3);
      this.method_1084(var3);
      this.field_557.method_5222().method_7492(true);
      GL11.glViewport(0, 0, this.field_557.cursorCounter2, this.field_557.cursorCounter3);
      bmh var4 = bmh.instance;
      var4.setVisible2();
      float var5 = this.width > this.height?120.0F / (float)this.width:120.0F / (float)this.height;
      float var6 = (float)this.height * var5 / 256.0F;
      float var7 = (float)this.width * var5 / 256.0F;
      var4.setVisible7(1.0F, 1.0F, 1.0F, 1.0F);
      int var8 = this.width;
      int var9 = this.height;
      var4.addVertexWithUV(0.0D, (double)var9, (double)this.field_372, (double)(0.5F - var6), (double)(0.5F + var7));
      var4.addVertexWithUV((double)var8, (double)var9, (double)this.field_372, (double)(0.5F - var6), (double)(0.5F - var7));
      var4.addVertexWithUV((double)var8, 0.0D, (double)this.field_372, (double)(0.5F + var6), (double)(0.5F - var7));
      var4.addVertexWithUV(0.0D, 0.0D, (double)this.field_372, (double)(0.5F + var6), (double)(0.5F + var7));
      var4.getVisible8();
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      String[] var4;
      bmh var5;
      class_199 var13;
      String[] var10000;
      label37: {
         GL11.glDisable(3008);
         this.method_1085(var1, var2, var3);
         var10000 = class_752.method_4253();
         GL11.glEnable(3008);
         var4 = var10000;
         var5 = bmh.instance;
         short var6 = 274;
         int var7 = this.width / 2 - var6 / 2;
         byte var8 = 30;
         this.drawGradientRect(0, 0, this.width, this.height, -2130706433, 16777215);
         this.drawGradientRect(0, 0, this.width, this.height, 0, Integer.MIN_VALUE);
         this.field_557.method_5288().bindTexture(field_882);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         var13 = this;
         if(var4 != null) {
            if((double)this.field_872 < 1.0E-4D) {
               this.method_658(var7 + 0, var8 + 0, 0, 0, 99, 44);
               this.method_658(var7 + 99, var8 + 0, 129, 0, 27, 44);
               this.method_658(var7 + 99 + 26, var8 + 0, 126, 0, 3, 44);
               this.method_658(var7 + 99 + 26 + 3, var8 + 0, 99, 0, 26, 44);
               this.method_658(var7 + 155, var8 + 0, 0, 45, 155, 44);
               if(var4 != null) {
                  break label37;
               }
            }

            this.method_658(var7 + 0, var8 + 0, 0, 0, 155, 44);
            var13 = this;
         }

         var13.method_658(var7 + 155, var8 + 0, 0, 45, 155, 44);
      }

      var5.method_7463(-1);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.width / 2 + 90), 70.0F, 0.0F);
      GL11.glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
      float var9 = 1.8F - class_1715.method_9564(class_1715.method_9555((float)(bao.method_5283() % 1000L) / 1000.0F * 3.1415927F * 2.0F) * 0.1F);
      var9 = var9 * 100.0F / (float)(this.fontRendererObj.getCharWidth(this.field_873) + 32);
      GL11.glScalef(var9, var9, var9);
      this.drawCenteredString(this.fontRendererObj, this.field_873, 0, -8, -256);
      GL11.glPopMatrix();
      String[] var12 = field_893;
      String var10 = "Minecraft 1.7.10";
      var13 = this;
      if(var4 != null) {
         if(this.field_557.method_5266()) {
            var10 = var10 + " Demo";
         }

         var13 = this;
      }

      var13.method_657(this.fontRendererObj, var10, 2, this.height - 10, -1);
      var10000 = field_893;
      String var11 = "Copyright Mojang AB. Do not distribute!";
      this.method_657(this.fontRendererObj, var11, this.width - this.fontRendererObj.getCharWidth(var11) - 2, this.height - 10, -1);
      var13 = this;
      if(var4 != null) {
         label28: {
            if(this.field_878 != null) {
               var13 = this;
               if(var4 == null) {
                  break label28;
               }

               if(this.field_878.length() > 0) {
                  drawRect(this.field_887 - 2, this.field_888 - 2, this.field_889 + 2, this.field_890 - 1, 1428160512);
                  this.method_657(this.fontRendererObj, this.field_878, this.field_887, this.field_888, -1);
                  this.method_657(this.fontRendererObj, this.field_879, (this.width - this.field_885) / 2, ((bcb)this.buttonList.get(0)).field_448 - 12, -1);
               }
            }

            var13 = this;
         }
      }

      var13.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: a (int, int, int) void
   protected void method_862(int var1, int var2, int var3) {
      super.method_862(var1, var2, var3);
      Object var5 = this.field_877;
      String[] var4 = class_752.method_4253();
      Object var6 = this.field_877;
      synchronized(this.field_877) {
         int var10000 = this.field_878.length();
         if(var4 != null) {
            if(var10000 <= 0) {
               return;
            }

            var10000 = var1;
         }

         int var10001 = this.field_887;
         if(var4 != null) {
            if(var10000 < this.field_887) {
               return;
            }

            var10000 = var1;
            var10001 = this.field_889;
         }

         if(var4 != null) {
            if(var10000 > var10001) {
               return;
            }

            var10000 = var2;
            var10001 = this.field_888;
         }

         if(var4 != null) {
            if(var10000 < var10001) {
               return;
            }

            var10000 = var2;
            var10001 = this.field_890;
         }

         if(var10000 <= var10001) {
            class_184 var10 = new class_184;
            var10.method_973(this, this.field_880, 13, true);
            class_184 var7 = var10;
            var7.method_975();
            this.field_557.method_5236(var7);
         }

      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_1086() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_1087(Throwable var0) {
      return var0;
   }
}
