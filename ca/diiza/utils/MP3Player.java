package ca.diiza.utils;

import java.util.List;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;

public class MP3Player extends PlaybackListener implements Runnable {

   public static List<String> radioList;
   private static MP3Player mp3Player;
   private String streamURL;
   public AdvancedPlayer player;
   public Thread pThread;
   // $FF: renamed from: b int[]
   private static int[] field_2583;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2584;


   public static void init() {
      String[] var0 = field_2584;
      radioList.add("http://adwzg3.tdf-cdn.com/8470/nrj_165631.mp3");
      radioList.add("http://icecast.skyrock.net/s/natio_mp3_128k?tvr_name=radioline&tvr_section1=128mp3");
      radioList.add("http://streaming.radio.funradio.fr/fun-1-48-192");
      radioList.add("http://listen.radionomy.com:80/Ad0sStation");
      radioList.add("http://icecastsource2.amri.ca/ckmf-mp3");
   }

   // $FF: renamed from: <init> (java.lang.String) void
   public void method_3209(String var1) {
      super();
      mp3Player = this;

      try {
         this.streamURL = var1;
         this.pThread = new Thread(this);
         this.pThread.start();
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void setStreamUrl(String var1) {
      this.pThread.stop();

      try {
         this.streamURL = var1;
         this.pThread = new Thread(this);
         this.pThread.start();
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public void run() {
      // $FF: Couldn't be decompiled
   }

   public static MP3Player getPlayer() {
      return mp3Player;
   }

   public void playbackStarted(PlaybackEvent var1) {
      this.player.setVolume(bao.method_5273().canLoseFocus7.musicSound);
   }

   public void playbackFinished(PlaybackEvent var1) {}

   public boolean isPlaying() {
      return this.pThread.isAlive();
   }

   public void setVolume(float var1) {
      int[] var2 = method_3212();
      AdvancedPlayer var10000 = this.player;
      if(var2 == null) {
         if(this.player == null) {
            return;
         }

         var10000 = this.player;
      }

      var10000.setVolume(var1);
   }

   public float getVolume() {
      return this.player.getVolume();
   }

   // $FF: renamed from: <clinit> () void
   static void method_3210() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int[]) void
   public static void method_3211(int[] var0) {
      field_2583 = var0;
   }

   // $FF: renamed from: b () int[]
   public static int[] method_3212() {
      return field_2583;
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_3213(Exception var0) {
      return var0;
   }
}
