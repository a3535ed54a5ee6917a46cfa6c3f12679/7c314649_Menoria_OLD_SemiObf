import java.util.ArrayList;
import java.util.List;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.AudioParams;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.PixelFormat;
import tv.twitch.broadcast.RTMPState;
import tv.twitch.broadcast.StartFlags;
import tv.twitch.broadcast.StatType;
import tv.twitch.broadcast.Stream;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.UserInfo;
import tv.twitch.broadcast.VideoParams;

// $FF: renamed from: qz
public class class_1562 implements IStatCallbacks, IStreamCallbacks {

   // $FF: renamed from: b boolean
   protected final boolean field_8204;
   // $FF: renamed from: c qB
   protected class_50 field_8205;
   // $FF: renamed from: d tv.twitch.broadcast.Stream
   protected Stream field_8206;
   // $FF: renamed from: e tv.twitch.broadcast.IngestList
   protected IngestList field_8207;
   // $FF: renamed from: f ad
   protected class_903 field_8208;
   // $FF: renamed from: g long
   protected long field_8209;
   // $FF: renamed from: h long
   protected long field_8210;
   // $FF: renamed from: i long
   protected long field_8211;
   // $FF: renamed from: j tv.twitch.broadcast.RTMPState
   protected RTMPState field_8212;
   // $FF: renamed from: k tv.twitch.broadcast.VideoParams
   protected VideoParams field_8213;
   // $FF: renamed from: l tv.twitch.broadcast.AudioParams
   protected AudioParams field_8214;
   // $FF: renamed from: m long
   protected long field_8215;
   // $FF: renamed from: n java.util.List
   protected List field_8216;
   // $FF: renamed from: o boolean
   protected boolean field_8217;
   // $FF: renamed from: p tv.twitch.broadcast.IStreamCallbacks
   protected IStreamCallbacks field_8218;
   // $FF: renamed from: q tv.twitch.broadcast.IStatCallbacks
   protected IStatCallbacks field_8219;
   // $FF: renamed from: r tv.twitch.broadcast.IngestServer
   protected IngestServer field_8220;
   // $FF: renamed from: s boolean
   protected boolean field_8221;
   // $FF: renamed from: t boolean
   protected boolean field_8222;
   // $FF: renamed from: u int
   protected int field_8223;
   // $FF: renamed from: v int
   protected int field_8224;
   // $FF: renamed from: w long
   protected long field_8225;
   // $FF: renamed from: x float
   protected float field_8226;
   // $FF: renamed from: y float
   protected float field_8227;
   // $FF: renamed from: z boolean
   protected boolean field_8228;
   // $FF: renamed from: A java.lang.String
   private static final String field_8229 = "CL_00001816";


   // $FF: renamed from: b (qB) void
   public void drawScreen4(class_50 var1) {
      this.field_8205 = var1;
   }

   // $FF: renamed from: a () tv.twitch.broadcast.IngestServer
   public IngestServer drawScreen5() {
      return this.field_8220;
   }

   // $FF: renamed from: b () boolean
   public boolean drawScreen6() {
      boolean var2;
      label28: {
         String[] var1 = class_752.method_4253();
         class_903 var10000 = this.field_8208;
         class_903 var10001 = class_903.field_4434;
         if(var1 != null) {
            if(this.field_8208 == class_903.field_4434) {
               break label28;
            }

            var10000 = this.field_8208;
            var10001 = class_903.field_4435;
         }

         if(var1 != null) {
            if(var10000 == var10001) {
               break label28;
            }

            var10000 = this.field_8208;
            var10001 = class_903.field_4436;
         }

         if(var10000 != var10001) {
            var2 = false;
            return var2;
         }
      }

      var2 = true;
      return var2;
   }

   // $FF: renamed from: c () float
   public float drawScreen7() {
      return this.field_8227;
   }

   public void requestAuthTokenCallback(ErrorCode var1, AuthToken var2) {}

   public void loginCallback(ErrorCode var1, ChannelInfo var2) {}

   public void getIngestServersCallback(ErrorCode var1, IngestList var2) {}

   public void getUserInfoCallback(ErrorCode var1, UserInfo var2) {}

   public void getStreamInfoCallback(ErrorCode var1, StreamInfo var2) {}

   public void getArchivingStateCallback(ErrorCode var1, ArchivingState var2) {}

   public void runCommercialCallback(ErrorCode var1) {}

   public void setStreamInfoCallback(ErrorCode var1) {}

   public void getGameNameListCallback(ErrorCode var1, GameInfoList var2) {}

   public void bufferUnlockCallback(long var1) {}

   public void startCallback(ErrorCode var1) {
      String[] var10000 = class_752.method_4253();
      this.field_8228 = false;
      String[] var2 = var10000;
      if(var2 != null) {
         if(ErrorCode.succeeded(var1)) {
            this.method_8568(class_903.field_4431);
            this.field_8215 = System.currentTimeMillis();
            if(var2 != null) {
               return;
            }
         }

         this.field_8217 = false;
      }

      this.method_8568(class_903.field_4433);
   }

   public void stopCallback(ErrorCode var1) {
      this.field_8228 = false;
      this.method_8568(class_903.field_4433);
   }

   public void sendActionMetaDataCallback(ErrorCode var1) {}

   public void sendStartSpanMetaDataCallback(ErrorCode var1) {}

   public void sendEndSpanMetaDataCallback(ErrorCode var1) {}

   public void statCallback(StatType var1, long var2) {
      label19: {
         String[] var4 = class_752.method_4253();
         if(var4 != null) {
            switch(class_1489.field_7822[var1.ordinal()]) {
            case 1:
               this.field_8212 = RTMPState.lookupValue((int)var2);
               break;
            case 2:
               break label19;
            default:
               return;
            }
         }

         if(var4 != null) {
            return;
         }
      }

      this.field_8211 = var2;
   }

   // $FF: renamed from: <init> (tv.twitch.broadcast.Stream, tv.twitch.broadcast.IngestList) void
   public void drawScreen8(Stream var1, IngestList var2) {
      super();
      this.field_8204 = true;
      this.field_8205 = null;
      this.field_8206 = null;
      this.field_8207 = null;
      this.field_8208 = class_903.visible9;
      this.field_8209 = 8000L;
      this.field_8210 = 1000L;
      this.field_8211 = 0L;
      this.field_8212 = RTMPState.Invalid;
      this.field_8213 = null;
      this.field_8214 = null;
      this.field_8215 = 0L;
      this.field_8216 = null;
      this.field_8217 = false;
      this.field_8218 = null;
      this.field_8219 = null;
      this.field_8220 = null;
      this.field_8221 = false;
      this.field_8222 = false;
      this.field_8223 = -1;
      this.field_8224 = 0;
      this.field_8225 = 0L;
      this.field_8226 = 0.0F;
      this.field_8227 = 0.0F;
      this.field_8228 = false;
      this.field_8206 = var1;
      this.field_8207 = var2;
   }

   protected void finalize() {
      String[] var1 = class_752.method_4253();
      class_1562 var10000 = this;
      if(var1 != null) {
         if(this.field_8220 != null) {
            this.method_8563(this.field_8220);
         }

         this.method_8567();
         var10000 = this;
      }

      var10000.finalize();
   }

   // $FF: renamed from: d () void
   public void drawScreen9() {
      String[] var1 = class_752.method_4253();
      class_1562 var10000 = this;
      if(var1 != null) {
         if(this.field_8208 != class_903.visible9) {
            return;
         }

         this.field_8223 = 0;
         this.field_8221 = false;
         this.field_8222 = false;
         this.field_8219 = this.field_8206.getStatCallbacks();
         this.field_8206.setStatCallbacks(this);
         this.field_8218 = this.field_8206.getStreamCallbacks();
         this.field_8206.setStreamCallbacks(this);
         this.field_8213 = new VideoParams();
         this.field_8213.targetFps = 60;
         this.field_8213.maxKbps = 3500;
         this.field_8213.outputWidth = 1280;
         this.field_8213.outputHeight = 720;
         this.field_8213.pixelFormat = PixelFormat.TTV_PF_BGRA;
         this.field_8213.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
         this.field_8213.disableAdaptiveBitrate = true;
         this.field_8213.verticalFlip = false;
         this.field_8206.getDefaultParams(this.field_8213);
         this.field_8214 = new AudioParams();
         this.field_8214.audioEnabled = false;
         var10000 = this;
      }

      var10000.field_8216 = new ArrayList();
      byte var2 = 3;
      int var3 = 0;

      while(true) {
         if(var3 < var2) {
            FrameBuffer var4 = this.field_8206.allocateFrameBuffer(this.field_8213.outputWidth * this.field_8213.outputHeight * 4);
            if(var1 == null) {
               break;
            }

            boolean var5 = var4.getIsValid();
            if(var1 != null) {
               if(!var5) {
                  this.method_8567();
                  this.method_8568(class_903.field_4436);
                  return;
               }

               this.field_8216.add(var4);
            }

            this.field_8206.randomizeFrameBuffer(var4);
            ++var3;
            if(var1 != null) {
               continue;
            }
         }

         this.method_8568(class_903.field_4430);
         break;
      }

      this.field_8215 = System.currentTimeMillis();
   }

   // $FF: renamed from: e () void
   public void method_8560() {
      String[] var1 = class_752.method_4253();
      class_1562 var10000 = this;
      if(var1 != null) {
         if(this.drawScreen6()) {
            return;
         }

         var10000 = this;
      }

      if(var1 != null) {
         if(var10000.field_8208 == class_903.visible9) {
            return;
         }

         var10000 = this;
      }

      int var2 = var10000.field_8228;
      if(var1 != null) {
         if(var10000.field_8228 != 0) {
            return;
         }

         var2 = this.field_8221;
      }

      if(var1 != null) {
         if(var2 != 0) {
            this.method_8568(class_903.field_4435);
         }

         var2 = class_1489.field_7823[this.field_8208.ordinal()];
      }

      label126: {
         switch(var2) {
         case 1:
         case 2:
            var10000 = this;
            if(var1 != null) {
               if(this.field_8220 != null) {
                  label99: {
                     var10000 = this;
                     if(var1 != null) {
                        label97: {
                           if(!this.field_8222) {
                              var10000 = this;
                              if(var1 == null) {
                                 break label97;
                              }

                              if(this.field_8217) {
                                 this.method_8563(this.field_8220);
                                 if(var1 != null) {
                                    break label99;
                                 }
                              }
                           }

                           this.field_8220.bitrateKbps = 0.0F;
                           this.field_8215 = 0L;
                           var10000 = this;
                        }
                     }

                     var10000.field_8228 = false;
                  }

                  this.field_8220 = null;
                  if(var1 != null) {
                     break;
                  }
               }

               var10000 = this;
            }

            if(var1 == null) {
               break label126;
            }

            if(var10000.field_8228) {
               break;
            }

            var10000 = this;
            if(var1 == null) {
               break label126;
            }

            if(this.method_8564() < this.field_8210) {
               break;
            }

            this.field_8215 = 0L;
            this.field_8222 = false;
            this.field_8217 = true;
            var10000 = this;
            if(var1 != null) {
               if(this.field_8208 != class_903.field_4430) {
                  ++this.field_8223;
               }

               var10000 = this;
            }

            if(var1 != null) {
               if(var10000.field_8223 < this.field_8207.getServers().length) {
                  this.field_8220 = this.field_8207.getServers()[this.field_8223];
                  this.method_8562(this.field_8220);
                  if(var1 != null) {
                     break;
                  }
               }

               var10000 = this;
            }

            var10000.method_8568(class_903.field_4434);
            if(var1 != null) {
               break;
            }
         case 3:
         case 4:
            this.method_8566(this.field_8220);
         }

         this.method_8565();
         var10000 = this;
      }

      if(var1 != null) {
         label87: {
            if(var10000.field_8208 != class_903.field_4435) {
               var10000 = this;
               if(var1 == null) {
                  break label87;
               }

               if(this.field_8208 != class_903.field_4434) {
                  return;
               }
            }

            var10000 = this;
         }
      }

      if(var1 != null) {
         if(var10000.field_8220 != null) {
            var10000 = this;
            if(var1 != null) {
               if(this.field_8208 == class_903.field_4435) {
                  this.field_8220.bitrateKbps = 0.0F;
               }

               this.method_8563(this.field_8220);
               var10000 = this;
            }

            var10000.field_8220 = null;
         }

         var10000 = this;
      }

      if(var1 != null) {
         if(var10000.field_8216 == null) {
            return;
         }

         var10000 = this;
      }

      var10000.method_8567();
   }

   // $FF: renamed from: f () void
   public void method_8561() {
      String[] var1 = class_752.method_4253();
      class_1562 var10000 = this;
      if(var1 != null) {
         if(this.drawScreen6()) {
            return;
         }

         var10000 = this;
      }

      var10000.field_8221 = true;
   }

   // $FF: renamed from: b (tv.twitch.broadcast.IngestServer) boolean
   protected boolean method_8562(IngestServer var1) {
      this.field_8217 = true;
      this.field_8211 = 0L;
      this.field_8212 = RTMPState.Idle;
      this.field_8220 = var1;
      this.method_8568(class_903.field_4431);
      String[] var10000 = class_752.method_4253();
      this.field_8228 = true;
      String[] var2 = var10000;
      ErrorCode var3 = this.field_8206.start(this.field_8213, this.field_8214, var1, StartFlags.TTV_Start_BandwidthTest, true);
      boolean var4 = ErrorCode.failed(var3);
      if(var2 != null) {
         if(var4) {
            this.field_8217 = false;
            this.method_8568(class_903.field_4433);
            return false;
         }

         this.field_8225 = this.field_8211;
         var1.bitrateKbps = 0.0F;
         this.field_8224 = 0;
         var4 = true;
      }

      return var4;
   }

   // $FF: renamed from: c (tv.twitch.broadcast.IngestServer) void
   protected void method_8563(IngestServer var1) {
      this.field_8228 = true;
      this.field_8206.stop(true);
      this.field_8206.pollStats();
   }

   // $FF: renamed from: g () long
   protected long method_8564() {
      return System.currentTimeMillis() - this.field_8215;
   }

   // $FF: renamed from: h () void
   protected void method_8565() {
      String[] var1;
      label31: {
         float var2;
         label30: {
            label29: {
               String[] var10000 = class_752.method_4253();
               var2 = (float)this.method_8564();
               var1 = var10000;
               if(var1 != null) {
                  switch(class_1489.field_7823[this.field_8208.ordinal()]) {
                  case 1:
                  case 3:
                  case 5:
                  case 6:
                  case 7:
                  case 8:
                     this.field_8227 = 0.0F;
                     break;
                  case 2:
                     break label29;
                  case 4:
                  default:
                     break label30;
                  }
               }

               if(var1 != null) {
                  break label31;
               }
            }

            this.field_8227 = 1.0F;
            if(var1 != null) {
               break label31;
            }
         }

         this.field_8227 = var2 / (float)this.field_8209;
      }

      switch(class_1489.field_7823[this.field_8208.ordinal()]) {
      case 6:
      case 7:
      case 8:
         this.field_8226 = 1.0F;
         if(var1 != null) {
            break;
         }
      default:
         this.field_8226 = (float)this.field_8223 / (float)this.field_8207.getServers().length;
         this.field_8226 += this.field_8227 / (float)this.field_8207.getServers().length;
      }

   }

   // $FF: renamed from: d (tv.twitch.broadcast.IngestServer) boolean
   protected boolean method_8566(IngestServer var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_8222;
      if(var2 != null) {
         if(!this.field_8222) {
            long var7;
            var10000 = (var7 = this.method_8564() - this.field_8209) == 0L?0:(var7 < 0L?-1:1);
            if(var2 == null) {
               return (boolean)var10000;
            }

            if(var10000 < 0) {
               class_1562 var6 = this;
               if(var2 != null) {
                  if(this.field_8228) {
                     return true;
                  }

                  var6 = this;
               }

               ErrorCode var3 = var6.field_8206.submitVideoFrame((FrameBuffer)this.field_8216.get(this.field_8224));
               if(var2 != null) {
                  if(ErrorCode.failed(var3)) {
                     this.field_8217 = false;
                     this.method_8568(class_903.field_4433);
                     return false;
                  }

                  this.field_8224 = (this.field_8224 + 1) % this.field_8216.size();
                  this.field_8206.pollStats();
               }

               label59: {
                  var6 = this;
                  if(var2 != null) {
                     if(this.field_8212 != RTMPState.SendVideo) {
                        break label59;
                     }

                     this.method_8568(class_903.field_4432);
                     var6 = this;
                  }

                  long var4 = var6.method_8564();
                  long var8;
                  var10000 = (var8 = var4 - 0L) == 0L?0:(var8 < 0L?-1:1);
                  if(var2 == null) {
                     return (boolean)var10000;
                  }

                  if(var10000 > 0) {
                     long var9;
                     var10000 = (var9 = this.field_8211 - this.field_8225) == 0L?0:(var9 < 0L?-1:1);
                     if(var2 == null) {
                        return (boolean)var10000;
                     }

                     if(var10000 > 0) {
                        var1.bitrateKbps = (float)(this.field_8211 * 8L) / (float)this.method_8564();
                        this.field_8225 = this.field_8211;
                     }
                  }
               }

               var10000 = 1;
               return (boolean)var10000;
            }
         }

         this.method_8568(class_903.field_4433);
         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: i () void
   protected void method_8567() {
      String[] var1;
      Stream var4;
      label46: {
         String[] var10000 = class_752.method_4253();
         this.field_8220 = null;
         var1 = var10000;
         Object var3 = this;
         if(var1 != null) {
            if(this.field_8216 != null) {
               int var2 = 0;

               while(true) {
                  if(var2 < this.field_8216.size()) {
                     ((FrameBuffer)this.field_8216.get(var2)).free();
                     ++var2;
                     if(var1 == null) {
                        break;
                     }

                     if(var1 != null) {
                        continue;
                     }
                  }

                  this.field_8216 = null;
                  break;
               }
            }

            var4 = this.field_8206;
            if(var1 == null) {
               break label46;
            }

            var3 = this.field_8206.getStatCallbacks();
         }

         if(var3 == this) {
            this.field_8206.setStatCallbacks(this.field_8219);
            this.field_8219 = null;
         }

         var4 = this.field_8206;
      }

      if(var1 != null) {
         if(var4.getStreamCallbacks() != this) {
            return;
         }

         var4 = this.field_8206;
      }

      var4.setStreamCallbacks(this.field_8218);
      this.field_8218 = null;
   }

   // $FF: renamed from: b (ad) void
   protected void method_8568(class_903 var1) {
      String[] var2 = class_752.method_4253();
      if(var2 != null) {
         if(var1 == this.field_8208) {
            return;
         }

         this.field_8208 = var1;
      }

      class_50 var10000 = this.field_8205;
      if(var2 != null) {
         if(this.field_8205 == null) {
            return;
         }

         var10000 = this.field_8205;
      }

      var10000.method_190(this, var1);
   }

   // $FF: renamed from: j () int
   public int method_8569() {
      return this.field_8223;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8570() {
      boolean var10000 = true;
      char[] var10003 = "üáñià".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_8229 = (new String((char[])var4)).intern();
            String var2 = field_8229;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 223;
            break;
         case 1:
            var10009 = 190;
            break;
         case 2:
            var10009 = 176;
            break;
         case 3:
            var10009 = 63;
            break;
         case 4:
            var10009 = 207;
            break;
         case 5:
            var10009 = 87;
            break;
         default:
            var10009 = 48;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
