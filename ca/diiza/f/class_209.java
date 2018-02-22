package ca.diiza.f;

import ca.diiza.f.class_162;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import utils.pinger.MinecraftPing;
import utils.pinger.MinecraftPingOptions;
import utils.pinger.MinecraftPingReply;

// $FF: renamed from: ca.diiza.f.t
public class class_209 extends bdw implements class_35 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_992;
   // $FF: renamed from: i bqx
   private final bqx field_993;
   // $FF: renamed from: r bqx
   private final bqx field_994;
   // $FF: renamed from: s utils.pinger.MinecraftPingReply
   private MinecraftPingReply field_995;
   // $FF: renamed from: t java.util.Random
   private static final Random field_996;
   // $FF: renamed from: u int
   private static int field_997;
   // $FF: renamed from: v java.lang.String[]
   private static final String[] field_998;


   // $FF: renamed from: <init> () void
   public void method_651() {
      super.method_651();
      bqx var10001 = new bqx;
      String[] var2 = field_998;
      var10001.method_8227("textures/gui/menoria/bg.png");
      this.field_993 = var10001;
      var10001 = new bqx;
      var10001.method_8227("textures/gui/menoria/logo_meno.png");
      this.field_994 = var10001;
      this.field_995 = null;

      try {
         MinecraftPing var4 = new MinecraftPing;
         var4.method_2309();
         MinecraftPingOptions var10002 = new MinecraftPingOptions;
         var10002.method_5958();
         this.field_995 = var4.getPing(var10002.setHostname("play.menoria.com").setPort(25565));
      } catch (IOException var3) {
         var3.printStackTrace();
      }

   }

   // $FF: renamed from: d () boolean
   public boolean method_876() {
      return false;
   }

   // $FF: renamed from: a (char, int) void
   protected void method_856(char var1, int var2) {}

   // $FF: renamed from: b () void
   public void initGui() {
      boolean var1 = true;
      int var2 = this.height / 4 + 48;
      List var10000 = this.buttonList;
      class_162 var10001 = new class_162;
      int var10004 = this.width / 2 - 60;
      int var10005 = this.height / 2 + 5;
      String[] var3 = field_998;
      var10001.method_849(201, var10004, var10005, 120, 40, "", "jouer_normal.png", "jouer_hover.png");
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new class_162;
      var10001.method_849(1, this.width / 2 - 50, this.height / 2 + 51, 100, 12, "", "solo_normal.png", "solo_hover.png");
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new class_162;
      var10001.method_849(20, this.width / 2 - 43, this.height / 2 + 66, 86, 11, "", "website_normal.png", "website_hover.png");
      var10000.add(var10001);
      var10000 = this.buttonList;
      var10001 = new class_162;
      var10001.method_849(0, this.width / 2 - 40, this.height / 2 + 81, 80, 11, "", "option_normal.png", "option_hover.png");
      var10000.add(var10001);
   }

   // $FF: renamed from: a (bcb) void
   protected void method_865(bcb param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      this.method_1155();
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable(3042);
      this.method_1156(this.width / 2 - 89 - 5, this.height / 2 - 110, 0, 0, 178, 100);
      GL11.glDisable(3042);
      int var10000 = method_1159();
      int var5 = this.height / 4 + 48;
      int var4 = var10000;
      boolean var6 = true;
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.width / 2 + 90), 70.0F, 0.0F);
      GL11.glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
      GL11.glPopMatrix();
      var10000 = 0;
      if(var4 != 0) {
         drawRect(0, 0, this.width, 12, 1711276032);
         var10000 = this.field_995 != null?1:0;
      }

      int var7 = var10000;
      var10000 = var7;
      if(var4 != 0) {
         var10000 = var7 != 0?this.field_995.getPlayers().getOnline():-1;
      }

      int var8 = var10000;
      var10000 = var7;
      if(var4 != 0) {
         var10000 = var7 != 0?this.field_995.getPlayers().getMax():-1;
      }

      int var9;
      class_130 var11;
      label124: {
         var9 = var10000;
         int var10 = var8 * 100 / var9;
         var11 = class_130.field_286;
         var10000 = var7;
         if(var4 != 0) {
            if(var7 == 0) {
               var11 = class_130.field_280;
               if(var4 != 0) {
                  break label124;
               }
            }

            var10000 = var10;
         }

         if(var4 != 0) {
            label109: {
               if(var10000 >= 0) {
                  var10000 = var10;
                  if(var4 == 0) {
                     break label109;
                  }

                  if(var10 >= 25) {
                     var10000 = var10;
                     if(var4 == 0) {
                        break label109;
                     }

                     if(var10 < 50) {
                        var11 = class_130.field_290;
                        if(var4 != 0) {
                           break label124;
                        }
                     }
                  }
               }

               var10000 = var10;
            }
         }

         if(var4 != 0) {
            label96: {
               if(var10000 >= 0) {
                  var10000 = var10;
                  if(var4 == 0) {
                     break label96;
                  }

                  if(var10 >= 50) {
                     var10000 = var10;
                     if(var4 == 0) {
                        break label96;
                     }

                     if(var10 < 75) {
                        var11 = class_130.field_282;
                        if(var4 != 0) {
                           break label124;
                        }
                     }
                  }
               }

               var10000 = var10;
            }
         }

         if(var4 != 0) {
            label83: {
               if(var10000 >= 0) {
                  var10000 = var10;
                  if(var4 == 0) {
                     break label83;
                  }

                  if(var10 >= 75) {
                     var10000 = var10;
                     if(var4 == 0) {
                        break label83;
                     }

                     if(var10 < 90) {
                        var11 = class_130.field_288;
                        if(var4 != 0) {
                           break label124;
                        }
                     }
                  }
               }

               var10000 = var10;
            }
         }

         label71: {
            if(var4 != 0) {
               if(var10000 < 0) {
                  break label71;
               }

               var10000 = var10;
            }

            if(var10000 >= 90) {
               var11 = class_130.field_280;
               if(var4 != 0) {
                  break label124;
               }
            }
         }

         var11 = class_130.field_286;
      }

      StringBuilder var14 = (new StringBuilder()).append(var11);
      String var10001;
      if(var7 != 0) {
         var10001 = var8 + "/" + var9;
      } else {
         String[] var13 = field_998;
         var10001 = "Fermé";
      }

      String var12 = var14.append(var10001).toString();
      this.method_657(this.fontRendererObj, var12, this.width / 2 - 10, 3, -1);
      super.drawScreen(var1, var2, var3);
   }

   // $FF: renamed from: a () void
   private void method_1155() {
      this.field_557.method_5288().bindTexture(this.field_993);
      bmh var1 = bmh.instance;
      var1.setVisible2();
      var1.setVisible7(1.0F, 1.0F, 1.0F, 1.0F);
      int var2 = this.width;
      int var3 = this.height;
      var1.addVertexWithUV(0.0D, 0.0D, (double)this.field_372, 0.0D, 0.0D);
      var1.addVertexWithUV(0.0D, (double)var3, (double)this.field_372, 0.0D, 1.0D);
      var1.addVertexWithUV((double)var2, (double)var3, (double)this.field_372, 1.0D, 1.0D);
      var1.addVertexWithUV((double)var2, 0.0D, (double)this.field_372, 1.0D, 0.0D);
      var1.getVisible8();
   }

   // $FF: renamed from: a (int, int, int, int, int, int) void
   private void method_1156(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field_557.method_5288().bindTexture(this.field_994);
      float var7 = 1.0F / (float)var5;
      float var8 = 1.0F / (float)var6;
      bmh var9 = bmh.instance;
      var9.setVisible2();
      var9.addVertexWithUV((double)(var1 + 0), (double)(var2 + var6), (double)this.field_372, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + var6) * var8));
      var9.addVertexWithUV((double)(var1 + var5), (double)(var2 + var6), (double)this.field_372, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + var6) * var8));
      var9.addVertexWithUV((double)(var1 + var5), (double)(var2 + 0), (double)this.field_372, (double)((float)(var3 + var5) * var7), (double)((float)(var4 + 0) * var8));
      var9.addVertexWithUV((double)(var1 + 0), (double)(var2 + 0), (double)this.field_372, (double)((float)(var3 + 0) * var7), (double)((float)(var4 + 0) * var8));
      var9.getVisible8();
   }

   // $FF: renamed from: m () void
   public void method_872() {
      super.method_872();
   }

   // $FF: renamed from: <clinit> () void
   static void method_1157() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int) void
   public static void method_1158(int var0) {
      field_997 = var0;
   }

   // $FF: renamed from: f () int
   public static int method_1159() {
      return field_997;
   }

   // $FF: renamed from: g () int
   public static int method_1160() {
      int var0 = method_1159();
      return var0 == 0?27:0;
   }

   // $FF: renamed from: c (java.lang.Exception) java.lang.Exception
   private static Exception method_1161(Exception var0) {
      return var0;
   }
}
