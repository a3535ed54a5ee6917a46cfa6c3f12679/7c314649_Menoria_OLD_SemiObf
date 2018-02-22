import java.util.List;

public class WrUpdaterSmooth implements IWrUpdater {

   private long lastUpdateStartTimeNs;
   private long updateStartTimeNs;
   private long updateTimeNs;
   private WorldRendererSmooth currentUpdateRenderer;
   private int renderersUpdated;
   private int renderersFound;


   // $FF: renamed from: <init> () void
   public void method_10046() {
      super();
      this.lastUpdateStartTimeNs = 0L;
      this.updateStartTimeNs = 0L;
      this.updateTimeNs = 10000000L;
      this.currentUpdateRenderer = null;
      this.renderersUpdated = 0;
      this.renderersFound = 0;
   }

   public void initialize() {}

   public void terminate() {}

   public blo makeWorldRenderer(ahb var1, List var2, int var3, int var4, int var5, int var6) {
      WorldRendererSmooth var10000 = new WorldRendererSmooth;
      var10000.method_2293(var1, var2, var3, var4, var5, var6);
      return var10000;
   }

   public boolean updateRenderers(bma var1, class_752 var2, boolean var3) {
      String[] var4;
      long var5;
      int var7;
      int var10;
      label91: {
         String[] var10000 = class_752.method_4253();
         this.lastUpdateStartTimeNs = this.updateStartTimeNs;
         var4 = var10000;
         this.updateStartTimeNs = System.nanoTime();
         var5 = this.updateStartTimeNs + this.updateTimeNs;
         var7 = Config.getUpdatesPerFrame();
         var10 = Config.isDynamicUpdates();
         if(var4 != null) {
            if(var10 == 0) {
               break label91;
            }

            var10 = var1.isMoving(var2);
         }

         if(var4 != null) {
            if(var10 != 0) {
               break label91;
            }

            var10 = var7 * 3;
         }

         var7 = var10;
      }

      this.renderersUpdated = 0;

      label76: {
         WrUpdaterSmooth var11;
         label75:
         while(true) {
            this.renderersFound = 0;
            this.updateRenderersImpl(var1, var2, var3);
            if(this.renderersFound <= 0 || System.nanoTime() - var5 >= 0L) {
               while(true) {
                  var11 = this;
                  if(var4 == null) {
                     break label75;
                  }

                  if(var4 != null) {
                     if(this.renderersFound > 0) {
                        label56: {
                           long var8;
                           label93: {
                              var7 = Math.min(var7, this.renderersFound);
                              var8 = 400000L;
                              var10 = this.renderersUpdated;
                              int var10001 = var7;
                              if(var4 != null) {
                                 if(this.renderersUpdated > var7) {
                                    this.updateTimeNs -= 2L * var8;
                                 }

                                 var11 = this;
                                 if(var4 == null) {
                                    break label93;
                                 }

                                 var10 = this.renderersUpdated;
                                 var10001 = var7;
                              }

                              if(var10 >= var10001) {
                                 break label56;
                              }

                              var11 = this;
                           }

                           var11.updateTimeNs += var8;
                        }

                        if(var4 != null) {
                           break label76;
                        }
                     }

                     this.updateTimeNs = 0L;
                     var11 = this;
                     break label75;
                  }

                  if(this.renderersFound < 0) {
                     break;
                  }
               }
            }
         }

         var11.updateTimeNs -= 200000L;
      }

      long var12;
      var10 = (var12 = this.updateTimeNs - 0L) == 0L?0:(var12 < 0L?-1:1);
      if(var4 != null) {
         if(var10 < 0) {
            this.updateTimeNs = 0L;
         }

         var10 = this.renderersUpdated;
      }

      if(var4 != null) {
         var10 = var10 > 0?1:0;
      }

      return (boolean)var10;
   }

   private void updateRenderersImpl(bma param1, class_752 param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   private boolean updateRenderer(WorldRendererSmooth var1) {
      String[] var10000 = class_752.method_4253();
      long var3 = this.updateStartTimeNs + this.updateTimeNs;
      String[] var2 = var10000;
      var1.field_1902 = false;
      boolean var5 = var1.updateRenderer(var3);
      boolean var6 = var5;
      if(var2 != null) {
         if(!var5) {
            this.currentUpdateRenderer = var1;
            return false;
         }

         var1.finishUpdate();
         this.currentUpdateRenderer = null;
         var6 = true;
      }

      return var6;
   }

   public void finishCurrentUpdate() {
      String[] var1 = class_752.method_4253();
      WorldRendererSmooth var10000 = this.currentUpdateRenderer;
      if(var1 != null) {
         if(this.currentUpdateRenderer == null) {
            return;
         }

         var10000 = this.currentUpdateRenderer;
      }

      var10000.updateRenderer();
      this.currentUpdateRenderer = null;
   }

   public void resumeBackgroundUpdates() {}

   public void pauseBackgroundUpdates() {}

   public void preRender(bma var1, class_752 var2) {}

   public void postRender() {}

   public void clearAllUpdates() {
      this.finishCurrentUpdate();
   }
}
