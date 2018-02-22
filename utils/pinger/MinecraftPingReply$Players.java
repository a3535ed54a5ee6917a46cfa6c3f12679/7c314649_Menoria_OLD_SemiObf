package utils.pinger;

import java.util.List;
import utils.pinger.MinecraftPingReply;
import utils.pinger.MinecraftPingReply$Player;

public class MinecraftPingReply$Players {

   private int max;
   private int online;
   private List<MinecraftPingReply$Player> sample;
   final MinecraftPingReply this$0;


   // $FF: renamed from: <init> (utils.pinger.MinecraftPingReply) void
   public void method_3246(MinecraftPingReply var1) {
      this.this$0 = var1;
      super();
   }

   public int getMax() {
      return this.max;
   }

   public int getOnline() {
      return this.online;
   }

   public List<MinecraftPingReply$Player> getSample() {
      return this.sample;
   }
}
