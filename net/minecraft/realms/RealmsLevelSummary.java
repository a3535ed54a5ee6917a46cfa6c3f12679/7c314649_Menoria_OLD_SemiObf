package net.minecraft.realms;

import net.minecraft.realms.RealmsScreen;

public class RealmsLevelSummary implements Comparable {

   private class_1339 levelSummary;


   // $FF: renamed from: <init> (ka) void
   public void method_6818(class_1339 var1) {
      super();
      this.levelSummary = var1;
   }

   public int getGameMode() {
      return this.levelSummary.method_7073().method_443();
   }

   public String getLevelId() {
      return this.levelSummary.method_7067();
   }

   public boolean hasCheats() {
      return this.levelSummary.method_7075();
   }

   public boolean isHardcore() {
      return this.levelSummary.method_7074();
   }

   public boolean isRequiresConversion() {
      return this.levelSummary.method_7070();
   }

   public String getLevelName() {
      return this.levelSummary.method_7068();
   }

   public long getLastPlayed() {
      return this.levelSummary.method_7071();
   }

   public int compareTo(class_1339 var1) {
      return this.levelSummary.method_7072(var1);
   }

   public long getSizeOnDisk() {
      return this.levelSummary.method_7069();
   }

   public int compareTo(RealmsLevelSummary var1) {
      boolean var2 = RealmsScreen.method_3793();
      long var3;
      int var10000 = (var3 = this.levelSummary.method_7071() - var1.getLastPlayed()) == 0L?0:(var3 < 0L?-1:1);
      if(var2) {
         if(var10000 < 0) {
            return 1;
         }

         long var4;
         var10000 = (var4 = this.levelSummary.method_7071() - var1.getLastPlayed()) == 0L?0:(var4 < 0L?-1:1);
      }

      if(var2) {
         if(var10000 > 0) {
            return -1;
         }

         var10000 = this.levelSummary.method_7067().compareTo(var1.getLevelId());
      }

      return var10000;
   }
}
