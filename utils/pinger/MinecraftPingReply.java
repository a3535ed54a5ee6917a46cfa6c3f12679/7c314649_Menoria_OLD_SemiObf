package utils.pinger;

import utils.pinger.MinecraftPingReply$Players;
import utils.pinger.MinecraftPingReply$Version;

public class MinecraftPingReply {

   private String description;
   private MinecraftPingReply$Players players;
   private MinecraftPingReply$Version version;
   private String favicon;
   // $FF: renamed from: a int
   private static int field_21;


   // $FF: renamed from: <init> () void
   public void method_422() {
      super();
   }

   public String getDescription() {
      return this.description;
   }

   public MinecraftPingReply$Players getPlayers() {
      return this.players;
   }

   public MinecraftPingReply$Version getVersion() {
      return this.version;
   }

   public String getFavicon() {
      return this.favicon;
   }

   // $FF: renamed from: a (int) void
   public static void method_423(int var0) {
      field_21 = var0;
   }

   // $FF: renamed from: a () int
   public static int method_424() {
      return field_21;
   }

   // $FF: renamed from: b () int
   public static int method_425() {
      int var0 = method_424();
      return var0 == 0?89:0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_426() {
      if(method_425() == 0) {
         method_423(65);
      }

   }
}
