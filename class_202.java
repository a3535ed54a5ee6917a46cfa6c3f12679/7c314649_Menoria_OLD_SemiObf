import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import tv.twitch.ErrorCode;

// $FF: renamed from: l2
public class class_202 extends bdw {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_909;
   // $FF: renamed from: i rV
   private final class_66 field_910;
   // $FF: renamed from: r bdw
   private final bdw field_911;
   // $FF: renamed from: s T
   private final class_104 field_912;
   // $FF: renamed from: t java.util.List
   private final List field_913;
   // $FF: renamed from: u java.util.List
   private final List field_914;
   // $FF: renamed from: v java.lang.String
   private static final String field_915;
   // $FF: renamed from: w java.lang.String[]
   private static final String[] field_916;


   // $FF: renamed from: <init> (bdw, T) void
   public void method_1097(bdw var1, class_104 var2) {
      this.method_1098(var1, var2, (List)null);
   }

   // $FF: renamed from: <init> (bdw, T, java.util.List) void
   public void method_1098(bdw var1, class_104 var2, List var3) {
      super.method_651();
      class_1081 var10001 = new class_1081;
      String[] var10003 = field_916;
      var10001.method_6126("stream.unavailable.title", new Object[0]);
      this.field_910 = var10001;
      this.field_914 = Lists.newArrayList();
      this.field_911 = var1;
      this.field_912 = var2;
      this.field_913 = var3;
   }

   // $FF: renamed from: b () void
   public void initGui() {
      class_202 var10000;
      bcb var10001;
      int var10004;
      List var5;
      int var10005;
      label42: {
         label45: {
            String[] var1 = class_752.method_4253();
            var10000 = this;
            if(var1 != null) {
               label39: {
                  if(this.field_914.isEmpty()) {
                     this.field_914.addAll(this.fontRendererObj.listFormattedStringToWidth(this.field_912.method_492().method_343(), (int)((float)this.width * 0.75F)));
                     var10000 = this;
                     if(var1 == null) {
                        break label39;
                     }

                     if(this.field_913 != null) {
                        this.field_914.add("");
                        Iterator var2 = this.field_913.iterator();

                        while(var2.hasNext()) {
                           class_1081 var3 = (class_1081)var2.next();
                           this.field_914.add(var3.method_341());
                           if(var1 == null) {
                              break label45;
                           }

                           if(var1 == null) {
                              break;
                           }
                        }
                     }
                  }

                  var10000 = this;
               }
            }

            if(var1 == null) {
               break label42;
            }

            if(var10000.field_912.method_493() != null) {
               var5 = this.buttonList;
               var10001 = new bcb;
               var10004 = this.width / 2 - 155;
               var10005 = this.height - 50;
               String[] var4 = field_916;
               var10001.method_748(0, var10004, var10005, 150, 20, class_1450.method_7896("gui.cancel", new Object[0]));
               var5.add(var10001);
               var5 = this.buttonList;
               var10001 = new bcb;
               var10001.method_748(1, this.width / 2 - 155 + 160, this.height - 50, 150, 20, class_1450.method_7896(this.field_912.method_493().method_343(), new Object[0]));
               var5.add(var10001);
               if(var1 != null) {
                  return;
               }
            }
         }

         var10000 = this;
      }

      var5 = var10000.buttonList;
      var10001 = new bcb;
      var10004 = this.width / 2 - 75;
      var10005 = this.height - 50;
      String[] var10008 = field_916;
      var10001.method_748(0, var10004, var10005, 150, 20, class_1450.method_7896("gui.cancel", new Object[0]));
      var5.add(var10001);
   }

   // $FF: renamed from: m () void
   public void method_872() {}

   // $FF: renamed from: a (int, int, float) void
   public void drawScreen(int var1, int var2, float var3) {
      String[] var10000 = class_752.method_4253();
      this.method_873();
      String[] var4 = var10000;
      int var5 = Math.max((int)((double)this.height * 0.85D / 2.0D - (double)((float)(this.field_914.size() * this.fontRendererObj.FONT_HEIGHT) / 2.0F)), 50);
      this.drawCenteredString(this.fontRendererObj, this.field_910.method_343(), this.width / 2, var5 - this.fontRendererObj.FONT_HEIGHT * 2, 16777215);
      Iterator var6 = this.field_914.iterator();

      while(true) {
         if(var6.hasNext()) {
            String var7 = (String)var6.next();
            this.drawCenteredString(this.fontRendererObj, var7, this.width / 2, var5, 10526880);
            var5 += this.fontRendererObj.FONT_HEIGHT;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         super.drawScreen(var1, var2, var3);
         break;
      }

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

      label28: {
         if(var2 != null) {
            if(var10000 != 1) {
               break label28;
            }

            var10000 = class_1374.field_7296[this.field_912.ordinal()];
         }

         String[] var3;
         switch(var10000) {
         case 1:
         case 2:
            var3 = field_916;
            this.method_1099("https://account.mojang.com/me/settings");
            if(var2 != null) {
               break;
            }
         case 3:
            var3 = field_916;
            this.method_1099("https://account.mojang.com/migrate");
            if(var2 != null) {
               break;
            }
         case 4:
            var3 = field_916;
            this.method_1099("http://www.apple.com/osx/");
            if(var2 != null) {
               break;
            }
         case 5:
         case 6:
         case 7:
            String[] var10001 = field_916;
            this.method_1099("http://bugs.mojang.com/browse/MC");
         }
      }

      this.field_557.method_5236(this.field_911);
   }

   // $FF: renamed from: b (java.lang.String) void
   private void method_1099(String var1) {
      try {
         String[] var4 = field_916;
         Class var2 = Class.forName("java.awt.Desktop");
         Object var3 = var2.getMethod("getDesktop", new Class[0]).invoke((Object)null, new Object[0]);
         var2.getMethod("browse", new Class[]{URI.class}).invoke(var3, new Object[]{new URI(var1)});
      } catch (Throwable var5) {
         String[] var10001 = field_916;
         field_909.error("Couldn\'t open link", var5);
      }

   }

   // $FF: renamed from: b (bdw) void
   public static void method_1100(bdw var0) {
      String[] var10000 = class_752.method_4253();
      bao var2 = bao.method_5273();
      String[] var1 = var10000;
      class_51 var3 = var2.method_5297();
      boolean var8 = buu.field_8569;
      String[] var5;
      class_202 var10;
      if(var1 != null) {
         if(!buu.field_8569) {
            ArrayList var4 = Lists.newArrayList();
            class_1081 var10001 = new class_1081;
            var5 = field_916;
            var10001.method_6126("stream.unavailable.no_fbo.version", new Object[]{GL11.glGetString(7938)});
            var4.add(var10001);
            var10001 = new class_1081;
            var10001.method_6126("stream.unavailable.no_fbo.blend", new Object[]{Boolean.valueOf(GLContext.getCapabilities().GL_EXT_blend_func_separate)});
            var4.add(var10001);
            var10001 = new class_1081;
            var10001.method_6126("stream.unavailable.no_fbo.arb", new Object[]{Boolean.valueOf(GLContext.getCapabilities().GL_ARB_framebuffer_object)});
            var4.add(var10001);
            var10001 = new class_1081;
            var10001.method_6126("stream.unavailable.no_fbo.ext", new Object[]{Boolean.valueOf(GLContext.getCapabilities().GL_EXT_framebuffer_object)});
            var4.add(var10001);
            var10 = new class_202;
            var10.method_1098(var0, class_104.field_154, var4);
            var2.method_5236(var10);
            if(var1 != null) {
               return;
            }
         }

         var8 = var3 instanceof class_1495;
      }

      if(var1 != null) {
         if(var8) {
            String var9 = ((class_1495)var3).method_8075().getMessage();
            var5 = field_916;
            if(var9.contains("Can\'t load AMD 64-bit .dll on a IA 32-bit platform")) {
               var10 = new class_202;
               var10.method_1097(var0, class_104.field_155);
               var2.method_5236(var10);
               if(var1 != null) {
                  return;
               }
            }

            var10 = new class_202;
            var10.method_1097(var0, class_104.field_156);
            var2.method_5236(var10);
            if(var1 != null) {
               return;
            }
         }

         var8 = var3.method_214();
      }

      if(var1 != null) {
         if(!var8 && var3.method_215() == ErrorCode.TTV_EC_OS_TOO_OLD) {
            switch(class_1374.field_7297[class_1847.method_9989().ordinal()]) {
            case 1:
               var10 = new class_202;
               var10.method_1097(var0, class_104.field_157);
               var2.method_5236(var10);
               if(var1 != null) {
                  return;
               }
            case 2:
               var10 = new class_202;
               var10.method_1097(var0, class_104.field_158);
               var2.method_5236(var10);
               if(var1 != null) {
                  return;
               }
            default:
               var10 = new class_202;
               var10.method_1097(var0, class_104.field_159);
               var2.method_5236(var10);
               if(var1 != null) {
                  return;
               }
            }
         }

         Multimap var11 = var2.method_5286();
         var5 = field_916;
         var8 = var11.containsKey("twitch_access_token");
      }

      class_51 var13;
      label91: {
         if(var1 != null) {
            if(!var8) {
               bao var12 = var2;
               if(var1 != null) {
                  if(var2.method_5285().method_6998() == class_103.field_147) {
                     var10 = new class_202;
                     var10.method_1097(var0, class_104.field_160);
                     var2.method_5236(var10);
                     if(var1 != null) {
                        return;
                     }
                  }

                  var12 = var2;
               }

               var10 = new class_202;
               var10.method_1097(var0, class_104.field_161);
               var12.method_5236(var10);
               if(var1 != null) {
                  return;
               }
            }

            var13 = var3;
            if(var1 == null) {
               break label91;
            }

            var8 = var3.method_216();
         }

         if(!var8) {
            switch(class_1374.field_7298[var3.method_219().ordinal()]) {
            case 1:
               var10 = new class_202;
               var10.method_1097(var0, class_104.field_162);
               var2.method_5236(var10);
               if(var1 != null) {
                  return;
               }
            case 2:
            default:
               var10 = new class_202;
               var10.method_1097(var0, class_104.field_163);
               var2.method_5236(var10);
               if(var1 != null) {
                  return;
               }
            }
         }

         var13 = var3;
      }

      if(var13.method_215() != null) {
         class_1081[] var6 = new class_1081[1];
         class_1081 var10003 = new class_1081;
         String[] var10005 = field_916;
         var10003.method_6126("stream.unavailable.initialization_failure.extra", new Object[]{ErrorCode.getString(var3.method_215())});
         var6[0] = var10003;
         List var7 = Arrays.asList(var6);
         var10 = new class_202;
         var10.method_1098(var0, class_104.field_164, var7);
         var2.method_5236(var10);
         if(var1 != null) {
            return;
         }
      }

      var10 = new class_202;
      var10.method_1097(var0, class_104.field_165);
      var2.method_5236(var10);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1101() {
      // $FF: Couldn't be decompiled
   }
}
