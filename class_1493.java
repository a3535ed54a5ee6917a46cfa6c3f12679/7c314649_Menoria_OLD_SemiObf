import com.google.common.collect.Maps;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.core.helpers.Strings;
import org.lwjgl.opengl.GL11;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.GameInfo;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.VideoParams;
import tv.twitch.chat.ChatMessage;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.ChatUserMode;
import tv.twitch.chat.ChatUserSubscription;

// $FF: renamed from: qD
public class class_1493 implements class_67, class_68, class_50, class_51 {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_7842;
   // $FF: renamed from: b org.apache.logging.log4j.Marker
   public static final Marker field_7843;
   // $FF: renamed from: d qt
   private final class_1553 field_7844;
   // $FF: renamed from: e qw
   private final class_1557 field_7845;
   // $FF: renamed from: f bao
   private final bao field_7846;
   // $FF: renamed from: g rV
   private final class_66 field_7847;
   // $FF: renamed from: h java.util.Map
   private final Map field_7848;
   // $FF: renamed from: i bmg
   private bmg field_7849;
   // $FF: renamed from: j boolean
   private boolean field_7850;
   // $FF: renamed from: k int
   private int field_7851;
   // $FF: renamed from: l long
   private long field_7852;
   // $FF: renamed from: m boolean
   private boolean field_7853;
   // $FF: renamed from: n boolean
   private boolean field_7854;
   // $FF: renamed from: o boolean
   private boolean field_7855;
   // $FF: renamed from: p boolean
   private boolean field_7856;
   // $FF: renamed from: q ae
   private class_904 field_7857;
   // $FF: renamed from: r boolean
   private static boolean field_7858;
   // $FF: renamed from: s java.lang.String
   private static final String field_7859;
   // $FF: renamed from: t java.lang.String[]
   private static final String[] field_7860;


   // $FF: renamed from: <init> (bao, java.lang.String) void
   public void method_8056(bao var1, String var2) {
      String[] var10000 = class_752.method_4253();
      super();
      class_1082 var10002 = new class_1082;
      String[] var5 = field_7860;
      var10002.method_6134("Twitch");
      this.field_7847 = var10002;
      this.field_7848 = Maps.newHashMap();
      String[] var3 = var10000;
      this.field_7851 = 30;
      this.field_7852 = 0L;
      this.field_7853 = false;
      this.field_7857 = class_904.field_4440;
      this.field_7846 = var1;
      class_1553 var10001 = new class_1553;
      var10001.method_8443();
      this.field_7844 = var10001;
      class_1557 var7 = new class_1557;
      var7.method_8492();
      this.field_7845 = var7;
      this.field_7844.method_8425(this);
      this.field_7845.method_8486(this);
      this.field_7844.method_8427("nmt37qblda36pvonovdkbopzfzw3wlq");
      this.field_7845.method_8489("nmt37qblda36pvonovdkbopzfzw3wlq");
      this.field_7847.method_338().method_8524(class_130.field_281);
      boolean var6 = Strings.isNotEmpty(var2);
      if(var3 != null) {
         if(!var6) {
            return;
         }

         var6 = buu.field_8569;
      }

      if(var6) {
         class_650 var8 = new class_650;
         String[] var10003 = field_7860;
         var8.method_3544(this, "Twitch authenticator", var2);
         class_650 var4 = var8;
         var4.setDaemon(true);
         var4.start();
      }

   }

   // $FF: renamed from: e () void
   public void method_191() {
      String[] var10002 = field_7860;
      field_7842.debug(field_7843, "Shutdown streaming");
      this.field_7844.method_8446();
      this.field_7845.method_8496();
   }

   // $FF: renamed from: h () void
   public void method_192() {
      class_1493 var9;
      label91: {
         class_1553 var8;
         label90: {
            label89: {
               String[] var1;
               class_902 var3;
               String[] var4;
               int var5;
               class_902 var6;
               class_902 var7;
               label93: {
                  int var2 = this.field_7846.canLoseFocus7.field_4529;
                  String[] var10000 = class_752.method_4253();
                  var3 = this.field_7845.method_8491();
                  var1 = var10000;
                  var5 = var2;
                  byte var10001 = 2;
                  if(var1 != null) {
                     if(var2 == 2) {
                        if(var3 != class_902.visible4) {
                           break label89;
                        }

                        var4 = field_7860;
                        field_7842.debug(field_7843, "Disconnecting from twitch chat per user options");
                        this.field_7845.method_8494();
                        if(var1 != null) {
                           break label89;
                        }
                     }

                     var5 = var2;
                     if(var1 == null) {
                        break label93;
                     }

                     var10001 = 1;
                  }

                  if(var5 == var10001) {
                     label79: {
                        var6 = var3;
                        var7 = class_902.visible5;
                        if(var1 != null) {
                           if(var3 == class_902.visible5) {
                              break label79;
                           }

                           var6 = var3;
                           var7 = class_902.visible1;
                        }

                        if(var6 != var7) {
                           break label89;
                        }
                     }

                     var8 = this.field_7844;
                     if(var1 == null) {
                        break label90;
                     }

                     if(!this.field_7844.method_8434()) {
                        break label89;
                     }

                     var4 = field_7860;
                     field_7842.debug(field_7843, "Connecting to twitch chat per user options");
                     this.method_8057();
                     if(var1 != null) {
                        break label89;
                     }
                  }

                  var5 = var2;
               }

               if(var5 == 0) {
                  label61: {
                     label60: {
                        label96: {
                           label97: {
                              var6 = var3;
                              var7 = class_902.visible5;
                              if(var1 != null) {
                                 if(var3 == class_902.visible5) {
                                    break label97;
                                 }

                                 var6 = var3;
                                 var7 = class_902.visible1;
                              }

                              if(var1 == null) {
                                 break label60;
                              }

                              if(var6 != var7) {
                                 break label96;
                              }
                           }

                           var9 = this;
                           if(var1 != null) {
                              if(!this.method_196()) {
                                 break label96;
                              }

                              var4 = field_7860;
                              field_7842.debug(field_7843, "Connecting to twitch chat as user is streaming");
                              var9 = this;
                           }

                           var9.method_8057();
                           if(var1 != null) {
                              break label61;
                           }
                        }

                        var6 = var3;
                        var7 = class_902.visible4;
                     }

                     if(var6 == var7) {
                        var9 = this;
                        if(var1 == null) {
                           break label91;
                        }

                        if(!this.method_196()) {
                           String[] var10002 = field_7860;
                           field_7842.debug(field_7843, "Disconnecting from twitch chat as user is no longer streaming");
                           this.field_7845.method_8494();
                        }
                     }
                  }
               }
            }

            var8 = this.field_7844;
         }

         var8.method_8458();
         var9 = this;
      }

      var9.field_7845.method_8497();
   }

   // $FF: renamed from: F () void
   protected void method_8057() {
      class_902 var2 = this.field_7845.method_8491();
      String[] var10000 = class_752.method_4253();
      String var3 = this.field_7844.method_8429().name;
      String[] var1 = var10000;
      class_902 var4 = var2;
      class_902 var10001 = class_902.visible1;
      if(var1 != null) {
         if(var2 == class_902.visible1) {
            this.field_7845.method_8495(var3);
            this.field_7845.field_8168 = var3;
            if(var1 != null) {
               return;
            }
         }

         var4 = var2;
         var10001 = class_902.visible5;
      }

      if(var4 == var10001) {
         this.field_7845.method_8493(var3);
         if(var1 != null) {
            return;
         }
      }

      String[] var5 = field_7860;
      field_7842.warn("Invalid twitch chat state {}", new Object[]{var2});
   }

   // $FF: renamed from: i () void
   public void method_193() {
      String[] var1 = class_752.method_4253();
      boolean var10000 = this.field_7844.method_8430();
      if(var1 != null) {
         if(!var10000) {
            return;
         }

         var10000 = this.field_7844.method_8433();
      }

      if(!var10000) {
         long var2 = System.nanoTime();
         long var4 = (long)(1000000000 / this.field_7851);
         long var6 = var2 - this.field_7852;
         long var17;
         int var16 = (var17 = var6 - var4) == 0L?0:(var17 < 0L?-1:1);
         if(var1 != null) {
            var16 = var16 >= 0?1:0;
         }

         int var8 = var16;
         if(var8 != 0) {
            FrameBuffer var9 = this.field_7844.method_8463();
            bmg var10 = this.field_7846.method_5222();
            this.field_7849.method_7492(true);
            GL11.glMatrixMode(5889);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glOrtho(0.0D, (double)this.field_7849.field_7287, (double)this.field_7849.field_7288, 0.0D, 1000.0D, 3000.0D);
            GL11.glMatrixMode(5888);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glViewport(0, 0, this.field_7849.field_7287, this.field_7849.field_7288);
            GL11.glEnable(3553);
            GL11.glDisable(3008);
            GL11.glDisable(3042);
            float var11 = (float)this.field_7849.field_7287;
            float var12 = (float)this.field_7849.field_7288;
            float var13 = (float)var10.field_7287 / (float)var10.field_7285;
            float var14 = (float)var10.field_7288 / (float)var10.field_7286;
            var10.method_7490();
            GL11.glTexParameterf(3553, 10241, 9729.0F);
            GL11.glTexParameterf(3553, 10240, 9729.0F);
            bmh var15 = bmh.instance;
            var15.setVisible2();
            var15.addVertexWithUV(0.0D, (double)var12, 0.0D, 0.0D, (double)var14);
            var15.addVertexWithUV((double)var11, (double)var12, 0.0D, (double)var13, (double)var14);
            var15.addVertexWithUV((double)var11, 0.0D, 0.0D, (double)var13, 0.0D);
            var15.addVertexWithUV(0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
            var15.getVisible8();
            var10.method_7491();
            GL11.glPopMatrix();
            GL11.glMatrixMode(5889);
            GL11.glPopMatrix();
            GL11.glMatrixMode(5888);
            this.field_7844.method_8464(var9);
            this.field_7849.method_7493();
            this.field_7844.method_8465(var9);
            this.field_7852 = var2;
         }
      }

   }

   // $FF: renamed from: j () boolean
   public boolean method_194() {
      return this.field_7844.method_8434();
   }

   // $FF: renamed from: k () boolean
   public boolean method_195() {
      return this.field_7844.method_8431();
   }

   // $FF: renamed from: l () boolean
   public boolean method_196() {
      return this.field_7844.method_8430();
   }

   // $FF: renamed from: b (qr, long) void
   public void method_197(class_1549 var1, long var2) {
      String[] var4;
      class_1493 var8;
      label37: {
         var4 = class_752.method_4253();
         boolean var10000 = this.method_196();
         if(var4 != null) {
            if(!var10000) {
               return;
            }

            var8 = this;
            if(var4 == null) {
               break label37;
            }

            var10000 = this.field_7850;
         }

         if(!var10000) {
            return;
         }

         var8 = this;
      }

      long var5;
      label22: {
         var5 = var8.field_7844.method_8441();
         if(var4 != null) {
            if(this.field_7844.method_8456(var1.method_8415(), var5 + var2, var1.method_8412(), var1.method_8414())) {
               break label22;
            }

            String[] var7 = field_7860;
            field_7842.warn(field_7843, "Couldn\'t send stream metadata action at {}: {}", new Object[]{Long.valueOf(var5 + var2), var1});
         }

         if(var4 != null) {
            return;
         }
      }

      String[] var10002 = field_7860;
      field_7842.debug(field_7843, "Sent stream metadata action at {}: {}", new Object[]{Long.valueOf(var5 + var2), var1});
   }

   // $FF: renamed from: m () boolean
   public boolean method_198() {
      return this.field_7844.method_8433();
   }

   // $FF: renamed from: n () void
   public void method_199() {
      label16: {
         String[] var1 = class_752.method_4253();
         if(var1 != null) {
            if(!this.field_7844.method_8450()) {
               break label16;
            }

            String[] var2 = field_7860;
            field_7842.debug(field_7843, "Requested commercial from Twitch");
         }

         if(var1 != null) {
            return;
         }
      }

      String[] var10002 = field_7860;
      field_7842.warn(field_7843, "Could not request commercial from Twitch");
   }

   // $FF: renamed from: o () void
   public void method_200() {
      this.field_7844.method_8454();
      this.field_7855 = true;
      this.method_202();
   }

   // $FF: renamed from: p () void
   public void method_201() {
      this.field_7844.method_8455();
      this.field_7855 = false;
      this.method_202();
   }

   // $FF: renamed from: q () void
   public void method_202() {
      String[] var1 = class_752.method_4253();
      class_1493 var10000 = this;
      if(var1 != null) {
         if(!this.method_196()) {
            return;
         }

         var10000 = this;
      }

      float var2 = var10000.field_7846.canLoseFocus7.field_4523;
      int var4 = this.field_7855;
      if(var1 != null) {
         label37: {
            if(!this.field_7855) {
               float var6;
               var4 = (var6 = var2 - 0.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
               if(var1 == null) {
                  break label37;
               }

               if(var4 > 0) {
                  var4 = 0;
                  break label37;
               }
            }

            var4 = 1;
         }
      }

      float var5;
      label29: {
         int var3 = var4;
         this.field_7844.method_8439(var3 != 0?0.0F:var2);
         class_1493 var10001 = this;
         if(var1 != null) {
            if(this.method_218()) {
               var5 = 0.0F;
               break label29;
            }

            var10001 = this;
         }

         var5 = var10001.field_7846.canLoseFocus7.field_4522;
      }

      this.field_7844.method_8438(var5);
   }

   // $FF: renamed from: r () void
   public void method_203() {
      String[] var1;
      bbj var2;
      VideoParams var3;
      label76: {
         label75: {
            label74: {
               var2 = this.field_7846.canLoseFocus7;
               var1 = class_752.method_4253();
               var3 = this.field_7844.method_8451(method_8059(var2.field_4524), method_8058(var2.field_4525), method_8060(var2.field_4521), (float)this.field_7846.cursorCounter2 / (float)this.field_7846.cursorCounter3);
               if(var1 != null) {
                  switch(var2.field_4526) {
                  case 0:
                     var3.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_LOW;
                     break;
                  case 1:
                     break label74;
                  case 2:
                     break label75;
                  default:
                     break label76;
                  }
               }

               if(var1 != null) {
                  break label76;
               }
            }

            var3.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_MEDIUM;
            if(var1 != null) {
               break label76;
            }
         }

         var3.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
      }

      label59: {
         bmg var10000 = this.field_7849;
         if(var1 != null) {
            if(this.field_7849 == null) {
               bmg var10001 = new bmg;
               var10001.method_7484(var3.outputWidth, var3.outputHeight, false);
               this.field_7849 = var10001;
               if(var1 != null) {
                  break label59;
               }
            }

            var10000 = this.field_7849;
         }

         var10000.method_7485(var3.outputWidth, var3.outputHeight);
      }

      label79: {
         String var9 = var2.field_4528;
         if(var1 != null) {
            if(var2.field_4528 == null) {
               break label79;
            }

            var9 = var2.field_4528;
         }

         int var10 = var9.length();
         if(var1 == null) {
            return;
         }

         if(var10 > 0) {
            IngestServer[] var4 = this.method_205();
            int var5 = var4.length;
            int var6 = 0;

            while(var6 < var5) {
               IngestServer var7 = var4[var6];
               if(var1 != null) {
                  boolean var11 = var7.serverUrl.equals(var2.field_4528);
                  if(var1 == null) {
                     return;
                  }

                  if(var11) {
                     this.field_7844.method_8436(var7);
                     if(var1 != null) {
                        break;
                     }
                  }

                  ++var6;
               }

               if(var1 == null) {
                  break;
               }
            }
         }
      }

      this.field_7851 = var3.targetFps;
      this.field_7850 = var2.field_4527;
      this.field_7844.method_8452(var3);
      String[] var8 = field_7860;
      field_7842.info(field_7843, "Streaming at {}/{} at {} kbps to {}", new Object[]{Integer.valueOf(var3.outputWidth), Integer.valueOf(var3.outputHeight), Integer.valueOf(var3.maxKbps), this.field_7844.method_8435().serverUrl});
      this.field_7844.method_8449((String)null, "Minecraft", (String)null);
   }

   // $FF: renamed from: s () void
   public void method_204() {
      label16: {
         String[] var1 = class_752.method_4253();
         if(var1 != null) {
            if(!this.field_7844.method_8453()) {
               break label16;
            }

            String[] var2 = field_7860;
            field_7842.info(field_7843, "Stopped streaming to Twitch");
         }

         if(var1 != null) {
            return;
         }
      }

      String[] var10002 = field_7860;
      field_7842.warn(field_7843, "Could not stop streaming to Twitch");
   }

   // $FF: renamed from: b (tv.twitch.ErrorCode, tv.twitch.AuthToken) void
   public void method_346(ErrorCode var1, AuthToken var2) {}

   // $FF: renamed from: b (tv.twitch.ErrorCode) void
   public void method_347(ErrorCode var1) {
      String[] var2 = class_752.method_4253();
      if(var2 != null) {
         if(ErrorCode.succeeded(var1)) {
            String[] var3 = field_7860;
            field_7842.debug(field_7843, "Login attempt successful");
            this.field_7854 = true;
            if(var2 != null) {
               return;
            }
         }

         String[] var10002 = field_7860;
         field_7842.warn(field_7843, "Login attempt unsuccessful: {} (error code {})", new Object[]{ErrorCode.getString(var1), Integer.valueOf(var1.getValue())});
      }

      this.field_7854 = false;
   }

   // $FF: renamed from: b (tv.twitch.ErrorCode, tv.twitch.broadcast.GameInfo[]) void
   public void method_348(ErrorCode var1, GameInfo[] var2) {}

   // $FF: renamed from: b (ab) void
   public void method_349(class_901 var1) {
      String[] var10002 = field_7860;
      field_7842.debug(field_7843, "Broadcast state changed to {}", new Object[]{var1});
      if(var1 == class_901.enabledColor5) {
         this.field_7844.method_8457(class_901.enabledColor7);
      }

   }

   // $FF: renamed from: b () void
   public void method_350() {
      String[] var10002 = field_7860;
      field_7842.info(field_7843, "Logged out of twitch");
   }

   // $FF: renamed from: b (tv.twitch.broadcast.StreamInfo) void
   public void method_351(StreamInfo var1) {
      String[] var10002 = field_7860;
      field_7842.debug(field_7843, "Stream info updated; {} viewers on stream ID {}", new Object[]{Integer.valueOf(var1.viewers), Long.valueOf(var1.streamId)});
   }

   // $FF: renamed from: b (tv.twitch.broadcast.IngestList) void
   public void method_352(IngestList var1) {}

   // $FF: renamed from: c (tv.twitch.ErrorCode) void
   public void method_353(ErrorCode var1) {
      String[] var2 = field_7860;
      field_7842.warn(field_7843, "Issue submitting frame: {} (Error code {})", new Object[]{ErrorCode.getString(var1), Integer.valueOf(var1.getValue())});
      bcc var10000 = this.field_7846.canLoseFocus4.method_707();
      class_1082 var10001 = new class_1082;
      var10001.method_6134("Issue streaming frame: " + var1 + " (" + ErrorCode.getString(var1) + ")");
      var10000.method_676(var10001, 2);
   }

   // $FF: renamed from: c () void
   public void method_354() {
      this.method_202();
      String[] var10002 = field_7860;
      field_7842.info(field_7843, "Broadcast to Twitch has started");
   }

   // $FF: renamed from: d () void
   public void method_355() {
      String[] var10002 = field_7860;
      field_7842.info(field_7843, "Broadcast to Twitch has stopped");
   }

   // $FF: renamed from: d (tv.twitch.ErrorCode) void
   public void method_356(ErrorCode var1) {
      String[] var2 = class_752.method_4253();
      class_1081 var10000;
      class_1081 var3;
      if(var1 == ErrorCode.TTV_EC_SOUNDFLOWER_NOT_INSTALLED) {
         var10000 = new class_1081;
         String[] var5 = field_7860;
         var10000.method_6126("stream.unavailable.soundflower.chat.link", new Object[0]);
         var3 = var10000;
         class_1560 var6 = var3.method_338();
         class_1554 var10001 = new class_1554;
         var10001.method_8472(class_911.field_4578, "https://help.mojang.com/customer/portal/articles/1374877-configuring-soundflower-for-streaming-on-apple-computers");
         var6.method_8530(var10001);
         var3.method_338().method_8528(Boolean.valueOf(true));
         var10000 = new class_1081;
         var10000.method_6126("stream.unavailable.soundflower.chat", new Object[]{var3});
         class_1081 var4 = var10000;
         var4.method_338().method_8524(class_130.field_280);
         this.field_7846.canLoseFocus4.method_707().method_675(var4);
         if(var2 != null) {
            return;
         }
      }

      var10000 = new class_1081;
      String[] var10002 = field_7860;
      var10000.method_6126("stream.unavailable.unknown.chat", new Object[]{ErrorCode.getString(var1)});
      var3 = var10000;
      var3.method_338().method_8524(class_130.field_280);
      this.field_7846.canLoseFocus4.method_707().method_675(var3);
   }

   // $FF: renamed from: b (qz, ad) void
   public void method_190(class_1562 var1, class_903 var2) {
      String[] var10002 = field_7860;
      field_7842.debug(field_7843, "Ingest test state changed to {}", new Object[]{var2});
      if(var2 == class_903.field_4434) {
         this.field_7853 = true;
      }

   }

   // $FF: renamed from: b (float) int
   public static int method_8058(float var0) {
      return class_1715.method_9559(10.0F + var0 * 50.0F);
   }

   // $FF: renamed from: c (float) int
   public static int method_8059(float var0) {
      return class_1715.method_9559(230.0F + var0 * 3270.0F);
   }

   // $FF: renamed from: d (float) float
   public static float method_8060(float var0) {
      return 0.1F + var0 * 0.1F;
   }

   // $FF: renamed from: t () tv.twitch.broadcast.IngestServer[]
   public IngestServer[] method_205() {
      return this.field_7844.method_8437().getServers();
   }

   // $FF: renamed from: u () void
   public void method_206() {
      String[] var10000 = class_752.method_4253();
      class_1562 var2 = this.field_7844.method_8460();
      String[] var1 = var10000;
      class_1562 var3 = var2;
      if(var1 != null) {
         if(var2 == null) {
            return;
         }

         var3 = var2;
      }

      var3.drawScreen4(this);
   }

   // $FF: renamed from: v () qz
   public class_1562 method_207() {
      return this.field_7844.method_8440();
   }

   // $FF: renamed from: w () boolean
   public boolean method_208() {
      return this.field_7844.method_8432();
   }

   // $FF: renamed from: x () int
   public int method_209() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.method_196();
      if(var1 != null) {
         var10000 = var10000 != 0?this.field_7844.method_8428().viewers:0;
      }

      return var10000;
   }

   // $FF: renamed from: b (tv.twitch.chat.ChatMessage[]) void
   public void method_357(ChatMessage[] var1) {
      ChatMessage[] var3 = var1;
      String[] var2 = class_752.method_4253();
      int var4 = var1.length;
      int var5 = 0;

      while(var5 < var4) {
         ChatMessage var6 = var3[var5];
         this.method_8061(var6.userName, var6);
         if(var2 != null) {
            if(this.method_8062(var6.modes, var6.subscriptions, this.field_7846.canLoseFocus7.field_4530)) {
               class_1082 var10000 = new class_1082;
               var10000.method_6134(var6.userName);
               class_1082 var7 = var10000;
               class_1081 var13 = new class_1081;
               StringBuilder var10002 = new StringBuilder();
               String[] var12 = field_7860;
               var10002 = var10002.append("chat.stream.");
               String var10003;
               if(var6.action) {
                  var10003 = "emote";
               } else {
                  var12 = field_7860;
                  var10003 = "text";
               }

               var13.method_6126(var10002.append(var10003).toString(), new Object[]{this.field_7847, var7, class_130.method_602(var6.message)});
               class_1081 var8 = var13;
               if(var6.action) {
                  var8.method_338().method_8526(Boolean.valueOf(true));
               }

               var10000 = new class_1082;
               var10000.method_6134("");
               class_1082 var9 = var10000;
               class_1081 var10001 = new class_1081;
               String[] var17 = field_7860;
               var10001.method_6126("stream.userinfo.chatTooltip", new Object[0]);
               var9.method_340(var10001);
               Iterator var10 = class_201.method_1093(var6.modes, var6.subscriptions, (class_51)null).iterator();

               while(true) {
                  if(var10.hasNext()) {
                     class_66 var11 = (class_66)var10.next();
                     var9.method_339("\n");
                     var9.method_340(var11);
                     if(var2 == null) {
                        break;
                     }

                     if(var2 != null) {
                        continue;
                     }
                  }

                  class_1560 var14 = var7.method_338();
                  class_1558 var15 = new class_1558;
                  var15.method_8508(class_912.field_4589, var9);
                  var14.method_8531(var15);
                  var14 = var7.method_338();
                  class_1554 var16 = new class_1554;
                  var16.method_8472(class_911.field_4581, var6.userName);
                  var14.method_8530(var16);
                  break;
               }

               this.field_7846.canLoseFocus4.method_707().method_675(var8);
            }

            ++var5;
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (java.lang.String, tv.twitch.chat.ChatMessage) void
   private void method_8061(String var1, ChatMessage var2) {
      ChatUserInfo var4 = (ChatUserInfo)this.field_7848.get(var1);
      String[] var3 = class_752.method_4253();
      ChatUserInfo var10000 = var4;
      if(var3 != null) {
         if(var4 == null) {
            var4 = new ChatUserInfo();
            var4.displayName = var1;
            this.field_7848.put(var1, var4);
         }

         var4.subscriptions = var2.subscriptions;
         var4.modes = var2.modes;
         var4.emoticonSet = var2.emoticonSet;
         var10000 = var4;
      }

      var10000.nameColorARGB = var2.nameColorARGB;
   }

   // $FF: renamed from: b (java.util.HashSet, java.util.HashSet, int) boolean
   private boolean method_8062(HashSet var1, HashSet var2, int var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var1.contains(ChatUserMode.TTV_CHAT_USERMODE_BANNED);
      if(var4 != null) {
         if(var10000 != 0) {
            var10000 = 0;
            return (boolean)var10000;
         }

         var10000 = var1.contains(ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR);
      }

      if(var4 != null) {
         if(var10000 != 0) {
            var10000 = 1;
            return (boolean)var10000;
         }

         var10000 = var1.contains(ChatUserMode.TTV_CHAT_USERMODE_MODERATOR);
      }

      if(var4 != null) {
         if(var10000 != 0) {
            var10000 = 1;
            return (boolean)var10000;
         }

         var10000 = var1.contains(ChatUserMode.TTV_CHAT_USERMODE_STAFF);
      }

      if(var4 != null) {
         if(var10000 != 0) {
            var10000 = 1;
            return (boolean)var10000;
         }

         var10000 = var3;
      }

      if(var4 != null) {
         if(var10000 == 0) {
            var10000 = 1;
            return (boolean)var10000;
         }

         var10000 = var3;
      }

      if(var4 != null) {
         var10000 = var10000 == 1?var2.contains(ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER):0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (tv.twitch.chat.ChatUserInfo[], tv.twitch.chat.ChatUserInfo[], tv.twitch.chat.ChatUserInfo[]) void
   public void method_358(ChatUserInfo[] var1, ChatUserInfo[] var2, ChatUserInfo[] var3) {
      ChatUserInfo[] var5 = var2;
      String[] var10000 = class_752.method_4253();
      int var6 = var2.length;
      int var7 = 0;
      String[] var4 = var10000;

      ChatUserInfo var8;
      while(true) {
         if(var7 < var6) {
            var8 = var5[var7];
            this.field_7848.remove(var8.displayName);
            ++var7;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var5 = var3;
         var6 = var3.length;
         break;
      }

      var7 = 0;

      while(true) {
         if(var7 < var6) {
            var8 = var5[var7];
            this.field_7848.put(var8.displayName, var8);
            ++var7;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var5 = var1;
         var6 = var1.length;
         break;
      }

      var7 = 0;

      while(var7 < var6) {
         var8 = var5[var7];
         this.field_7848.put(var8.displayName, var8);
         ++var7;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a () void
   public void method_359() {
      String[] var10002 = field_7860;
      field_7842.debug(field_7843, "Chat connected");
   }

   // $FF: renamed from: f () void
   public void method_360() {
      String[] var10002 = field_7860;
      field_7842.debug(field_7843, "Chat disconnected");
      this.field_7848.clear();
   }

   // $FF: renamed from: g () void
   public void method_361() {}

   // $FF: renamed from: y () boolean
   public boolean method_210() {
      boolean var10000;
      label24: {
         String[] var1 = class_752.method_4253();
         var10000 = this.field_7845.method_8487();
         if(var1 != null) {
            if(!var10000) {
               break label24;
            }

            var10000 = this.field_7845.field_8168.equals(this.field_7844.method_8429().name);
         }

         if(var1 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: z () java.lang.String
   public String method_211() {
      return this.field_7845.field_8168;
   }

   // $FF: renamed from: b (java.lang.String) tv.twitch.chat.ChatUserInfo
   public ChatUserInfo method_212(String var1) {
      return (ChatUserInfo)this.field_7848.get(var1);
   }

   // $FF: renamed from: c (java.lang.String) void
   public void method_213(String var1) {
      this.field_7845.method_8498(var1);
   }

   // $FF: renamed from: A () boolean
   public boolean method_214() {
      boolean var10000;
      label24: {
         String[] var1 = class_752.method_4253();
         var10000 = field_7858;
         if(var1 != null) {
            if(!field_7858) {
               break label24;
            }

            var10000 = this.field_7844.method_8426();
         }

         if(var1 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: B () tv.twitch.ErrorCode
   public ErrorCode method_215() {
      return !field_7858?ErrorCode.TTV_EC_OS_TOO_OLD:this.field_7844.method_8469();
   }

   // $FF: renamed from: C () boolean
   public boolean method_216() {
      return this.field_7854;
   }

   // $FF: renamed from: b (boolean) void
   public void method_217(boolean var1) {
      this.field_7856 = var1;
      this.method_202();
   }

   // $FF: renamed from: D () boolean
   public boolean method_218() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_7846.canLoseFocus7.field_4531;
      if(var1 != null) {
         var10000 = this.field_7846.canLoseFocus7.field_4531 == 1?1:0;
      }

      int var2 = var10000;
      var10000 = this.field_7855;
      if(var1 != null) {
         if(!this.field_7855) {
            float var3;
            var10000 = (var3 = this.field_7846.canLoseFocus7.field_4522 - 0.0F) == 0.0F?0:(var3 < 0.0F?-1:1);
            if(var1 == null) {
               return (boolean)var10000;
            }

            if(var10000 > 0) {
               var10000 = var2;
               if(var1 == null) {
                  return (boolean)var10000;
               }

               if(var2 == this.field_7856) {
                  var10000 = 0;
                  return (boolean)var10000;
               }
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: E () ae
   public class_904 method_219() {
      return this.field_7857;
   }

   // $FF: renamed from: G () org.apache.logging.log4j.Logger
   static Logger method_8063() {
      return field_7842;
   }

   // $FF: renamed from: b (qD) qt
   static class_1553 method_8064(class_1493 var0) {
      return var0.field_7844;
   }

   // $FF: renamed from: c (qD) qw
   static class_1557 method_8065(class_1493 var0) {
      return var0.field_7845;
   }

   // $FF: renamed from: b (qD, ae) ae
   static class_904 method_8066(class_1493 var0, class_904 var1) {
      return var0.field_7857 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8067() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_8068(Throwable var0) {
      return var0;
   }
}
