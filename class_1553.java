import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.Logger;
import tv.twitch.AuthToken;
import tv.twitch.Core;
import tv.twitch.ErrorCode;
import tv.twitch.StandardCoreAPI;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.AudioDeviceType;
import tv.twitch.broadcast.AudioParams;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.DesktopStreamAPI;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.PixelFormat;
import tv.twitch.broadcast.StatType;
import tv.twitch.broadcast.Stream;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.UserInfo;
import tv.twitch.broadcast.VideoParams;

// $FF: renamed from: qt
public class class_1553 implements IStatCallbacks, IStreamCallbacks {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_8123;
   // $FF: renamed from: b int
   protected final int field_8124;
   // $FF: renamed from: c int
   protected final int field_8125;
   // $FF: renamed from: d vo
   private static final class_1709 field_8126;
   // $FF: renamed from: e java.lang.String
   private String field_8127;
   // $FF: renamed from: f qv
   protected class_67 field_8128;
   // $FF: renamed from: g java.lang.String
   protected String field_8129;
   // $FF: renamed from: h java.lang.String
   protected String field_8130;
   // $FF: renamed from: i java.lang.String
   protected String field_8131;
   // $FF: renamed from: j boolean
   protected boolean field_8132;
   // $FF: renamed from: k tv.twitch.Core
   protected Core field_8133;
   // $FF: renamed from: l tv.twitch.broadcast.Stream
   protected Stream field_8134;
   // $FF: renamed from: m java.util.List
   protected List field_8135;
   // $FF: renamed from: n java.util.List
   protected List field_8136;
   // $FF: renamed from: o boolean
   protected boolean field_8137;
   // $FF: renamed from: p boolean
   protected boolean field_8138;
   // $FF: renamed from: q boolean
   protected boolean field_8139;
   // $FF: renamed from: r ab
   protected class_901 field_8140;
   // $FF: renamed from: s java.lang.String
   protected String field_8141;
   // $FF: renamed from: t tv.twitch.broadcast.VideoParams
   protected VideoParams field_8142;
   // $FF: renamed from: u tv.twitch.broadcast.AudioParams
   protected AudioParams field_8143;
   // $FF: renamed from: v tv.twitch.broadcast.IngestList
   protected IngestList field_8144;
   // $FF: renamed from: w tv.twitch.broadcast.IngestServer
   protected IngestServer field_8145;
   // $FF: renamed from: x tv.twitch.AuthToken
   protected AuthToken field_8146;
   // $FF: renamed from: y tv.twitch.broadcast.ChannelInfo
   protected ChannelInfo field_8147;
   // $FF: renamed from: z tv.twitch.broadcast.UserInfo
   protected UserInfo field_8148;
   // $FF: renamed from: A tv.twitch.broadcast.StreamInfo
   protected StreamInfo field_8149;
   // $FF: renamed from: B tv.twitch.broadcast.ArchivingState
   protected ArchivingState field_8150;
   // $FF: renamed from: C long
   protected long field_8151;
   // $FF: renamed from: D qz
   protected class_1562 field_8152;
   // $FF: renamed from: F tv.twitch.ErrorCode
   private ErrorCode field_8153;
   // $FF: renamed from: G java.lang.String
   private static final String field_8154;
   // $FF: renamed from: E java.lang.String[]
   private static final String[] field_8155;


   public void requestAuthTokenCallback(ErrorCode param1, AuthToken param2) {
      // $FF: Couldn't be decompiled
   }

   public void loginCallback(ErrorCode param1, ChannelInfo param2) {
      // $FF: Couldn't be decompiled
   }

   public void getIngestServersCallback(ErrorCode param1, IngestList param2) {
      // $FF: Couldn't be decompiled
   }

   public void getUserInfoCallback(ErrorCode param1, UserInfo param2) {
      // $FF: Couldn't be decompiled
   }

   public void getStreamInfoCallback(ErrorCode param1, StreamInfo param2) {
      // $FF: Couldn't be decompiled
   }

   public void getArchivingStateCallback(ErrorCode var1, ArchivingState var2) {
      this.field_8150 = var2;
      if(ErrorCode.failed(var1)) {
         ;
      }

   }

   public void runCommercialCallback(ErrorCode param1) {
      // $FF: Couldn't be decompiled
   }

   public void setStreamInfoCallback(ErrorCode param1) {
      // $FF: Couldn't be decompiled
   }

   public void getGameNameListCallback(ErrorCode param1, GameInfoList param2) {
      // $FF: Couldn't be decompiled
   }

   public void bufferUnlockCallback(long var1) {
      FrameBuffer var3 = FrameBuffer.lookupBuffer(var1);
      this.field_8136.add(var3);
   }

   public void startCallback(ErrorCode param1) {
      // $FF: Couldn't be decompiled
   }

   public void stopCallback(ErrorCode param1) {
      // $FF: Couldn't be decompiled
   }

   public void sendActionMetaDataCallback(ErrorCode var1) {
      try {
         if(ErrorCode.failed(var1)) {
            StringBuilder var10001 = new StringBuilder();
            String[] var10002 = field_8155;
            this.method_8468(var10001.append("Failed sending action metadata: ").append(ErrorCode.getString(var1)).toString());
         }

      } catch (class_643 var2) {
         throw method_8471(var2);
      }
   }

   public void sendStartSpanMetaDataCallback(ErrorCode var1) {
      try {
         if(ErrorCode.failed(var1)) {
            StringBuilder var10001 = new StringBuilder();
            String[] var10002 = field_8155;
            this.method_8468(var10001.append("Failed sending span metadata start: ").append(ErrorCode.getString(var1)).toString());
         }

      } catch (class_643 var2) {
         throw method_8471(var2);
      }
   }

   public void sendEndSpanMetaDataCallback(ErrorCode var1) {
      try {
         if(ErrorCode.failed(var1)) {
            StringBuilder var10001 = new StringBuilder();
            String[] var10002 = field_8155;
            this.method_8468(var10001.append("Failed sending span metadata end: ").append(ErrorCode.getString(var1)).toString());
         }

      } catch (class_643 var2) {
         throw method_8471(var2);
      }
   }

   public void statCallback(StatType var1, long var2) {}

   // $FF: renamed from: b (qv) void
   public void method_8425(class_67 var1) {
      this.field_8128 = var1;
   }

   // $FF: renamed from: a () boolean
   public boolean method_8426() {
      return this.field_8137;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_8427(String var1) {
      this.field_8129 = var1;
   }

   // $FF: renamed from: b () tv.twitch.broadcast.StreamInfo
   public StreamInfo method_8428() {
      return this.field_8149;
   }

   // $FF: renamed from: c () tv.twitch.broadcast.ChannelInfo
   public ChannelInfo method_8429() {
      return this.field_8147;
   }

   // $FF: renamed from: d () boolean
   public boolean method_8430() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () boolean
   public boolean method_8431() {
      boolean var10000;
      try {
         if(this.field_8140 == class_901.disabledColor2) {
            var10000 = true;
            return var10000;
         }
      } catch (class_643 var1) {
         throw method_8471(var1);
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: f () boolean
   public boolean method_8432() {
      boolean var10000;
      try {
         if(this.field_8140 == class_901.disabledColor7) {
            var10000 = true;
            return var10000;
         }
      } catch (class_643 var1) {
         throw method_8471(var1);
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: g () boolean
   public boolean method_8433() {
      boolean var10000;
      try {
         if(this.field_8140 == class_901.disabledColor6) {
            var10000 = true;
            return var10000;
         }
      } catch (class_643 var1) {
         throw method_8471(var1);
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: h () boolean
   public boolean method_8434() {
      return this.field_8138;
   }

   // $FF: renamed from: i () tv.twitch.broadcast.IngestServer
   public IngestServer method_8435() {
      return this.field_8145;
   }

   // $FF: renamed from: b (tv.twitch.broadcast.IngestServer) void
   public void method_8436(IngestServer var1) {
      this.field_8145 = var1;
   }

   // $FF: renamed from: j () tv.twitch.broadcast.IngestList
   public IngestList method_8437() {
      return this.field_8144;
   }

   // $FF: renamed from: b (float) void
   public void method_8438(float var1) {
      this.field_8134.setVolume(AudioDeviceType.TTV_RECORDER_DEVICE, var1);
   }

   // $FF: renamed from: c (float) void
   public void method_8439(float var1) {
      this.field_8134.setVolume(AudioDeviceType.TTV_PLAYBACK_DEVICE, var1);
   }

   // $FF: renamed from: k () qz
   public class_1562 method_8440() {
      return this.field_8152;
   }

   // $FF: renamed from: l () long
   public long method_8441() {
      return this.field_8134.getStreamTime();
   }

   // $FF: renamed from: m () boolean
   protected boolean method_8442() {
      return true;
   }

   // $FF: renamed from: <init> () void
   public void method_8443() {
      super();
      this.field_8124 = 30;
      this.field_8125 = 3;
      this.field_8127 = null;
      this.field_8128 = null;
      this.field_8129 = "";
      this.field_8130 = "";
      this.field_8131 = "";
      this.field_8132 = true;
      this.field_8133 = null;
      this.field_8134 = null;
      this.field_8135 = new ArrayList();
      this.field_8136 = new ArrayList();
      this.field_8137 = false;
      this.field_8138 = false;
      this.field_8139 = false;
      this.field_8140 = class_901.enabledColor4;
      this.field_8141 = null;
      this.field_8142 = null;
      this.field_8143 = null;
      this.field_8144 = new IngestList(new IngestServer[0]);
      this.field_8145 = null;
      this.field_8146 = new AuthToken();
      this.field_8147 = new ChannelInfo();
      this.field_8148 = new UserInfo();
      this.field_8149 = new StreamInfo();
      this.field_8150 = new ArchivingState();
      this.field_8151 = 0L;
      this.field_8152 = null;
      this.field_8133 = new Core(new StandardCoreAPI());
      this.field_8134 = new Stream(new DesktopStreamAPI());
   }

   // $FF: renamed from: n () tv.twitch.broadcast.PixelFormat
   protected PixelFormat method_8444() {
      return PixelFormat.TTV_PF_RGBA;
   }

   // $FF: renamed from: o () boolean
   public boolean method_8445() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: p () boolean
   public boolean method_8446() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String, tv.twitch.AuthToken) boolean
   public boolean method_8447(String param1, AuthToken param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: q () boolean
   public boolean method_8448() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String, java.lang.String) boolean
   public boolean method_8449(String param1, String param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: r () boolean
   public boolean method_8450() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int, float, float) tv.twitch.broadcast.VideoParams
   public VideoParams method_8451(int var1, int var2, float var3, float var4) {
      int[] var5 = this.field_8134.getMaxResolution(var1, var2, var3, var4);
      VideoParams var6 = new VideoParams();
      var6.maxKbps = var1;
      var6.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
      var6.pixelFormat = this.method_8444();
      var6.targetFps = var2;
      var6.outputWidth = var5[0];
      var6.outputHeight = var5[1];
      var6.disableAdaptiveBitrate = false;
      var6.verticalFlip = false;
      return var6;
   }

   // $FF: renamed from: b (tv.twitch.broadcast.VideoParams) boolean
   public boolean method_8452(VideoParams param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: s () boolean
   public boolean method_8453() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: t () boolean
   public boolean method_8454() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: u () boolean
   public boolean method_8455() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String, long, java.lang.String, java.lang.String) boolean
   public boolean method_8456(String var1, long var2, String var4, String var5) {
      String[] var10000 = class_752.method_4253();
      ErrorCode var7 = this.field_8134.sendActionMetaData(this.field_8146, var1, var2, var4, var5);
      String[] var6 = var10000;

      label28: {
         boolean var10;
         try {
            var10 = ErrorCode.failed(var7);
            if(var6 == null) {
               return var10;
            }

            if(var10) {
               break label28;
            }
         } catch (class_643 var9) {
            throw method_8471(var9);
         }

         var10 = true;
         return var10;
      }

      String var8 = ErrorCode.getString(var7);
      String[] var10001 = field_8155;
      this.method_8467(String.format("Error while sending meta data: %s\n", new Object[]{var8}));
      return false;
   }

   // $FF: renamed from: b (ab) void
   protected void method_8457(class_901 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: v () void
   public void method_8458() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: w () void
   protected void method_8459() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: x () qz
   public class_1562 method_8460() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: y () boolean
   protected boolean method_8461() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: z () void
   protected void method_8462() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;

      while(true) {
         if(var2 < this.field_8135.size()) {
            FrameBuffer var3 = (FrameBuffer)this.field_8135.get(var2);

            try {
               var3.free();
               ++var2;
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  continue;
               }
            } catch (class_643 var4) {
               throw method_8471(var4);
            }
         }

         this.field_8136.clear();
         this.field_8135.clear();
         break;
      }

   }

   // $FF: renamed from: A () tv.twitch.broadcast.FrameBuffer
   public FrameBuffer method_8463() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (tv.twitch.broadcast.FrameBuffer) void
   public void method_8464(FrameBuffer var1) {
      try {
         this.field_8134.captureFrameBuffer_ReadPixels(var1);
      } catch (Throwable var6) {
         String[] var5 = field_8155;
         class_1346 var3 = class_1346.method_7153(var6, "Trying to submit a frame to Twitch");
         class_1605 var4 = var3.method_7150("Broadcast State");
         var4.method_8778("Last reported errors", Arrays.toString(field_8126.method_9495()));
         var4.method_8778("Buffer", var1);
         var4.method_8778("Free buffer count", Integer.valueOf(this.field_8136.size()));
         var4.method_8778("Capture buffer count", Integer.valueOf(this.field_8135.size()));
         class_643 var10000 = new class_643;
         var10000.method_3525(var3);
         throw var10000;
      }
   }

   // $FF: renamed from: c (tv.twitch.broadcast.FrameBuffer) tv.twitch.ErrorCode
   public ErrorCode method_8465(FrameBuffer param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (tv.twitch.ErrorCode) boolean
   protected boolean method_8466(ErrorCode param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (java.lang.String) void
   protected void method_8467(String var1) {
      this.field_8127 = var1;
      class_1709 var10000 = field_8126;
      StringBuilder var10001 = new StringBuilder();
      String[] var2 = field_8155;
      var10000.method_9493(var10001.append("<Error> ").append(var1).toString());
      field_8123.error(class_1493.field_7843, "[Broadcast controller] {}", new Object[]{var1});
   }

   // $FF: renamed from: d (java.lang.String) void
   protected void method_8468(String var1) {
      class_1709 var10000 = field_8126;
      StringBuilder var10001 = new StringBuilder();
      String[] var2 = field_8155;
      var10000.method_9493(var10001.append("<Warning> ").append(var1).toString());
      field_8123.warn(class_1493.field_7843, "[Broadcast controller] {}", new Object[]{var1});
   }

   // $FF: renamed from: B () tv.twitch.ErrorCode
   public ErrorCode method_8469() {
      return this.field_8153;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8470() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_8471(Exception var0) {
      return var0;
   }
}
