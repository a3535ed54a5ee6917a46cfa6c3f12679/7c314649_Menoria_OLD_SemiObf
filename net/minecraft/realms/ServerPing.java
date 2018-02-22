package net.minecraft.realms;


public class ServerPing {

   public volatile String nrOfPlayers;
   public volatile long lastPingSnapshot;


   // $FF: renamed from: <init> () void
   public void getBlock78() {
      super();
      this.nrOfPlayers = "0";
      this.lastPingSnapshot = 0L;
   }
}
