import java.util.List;

public interface IWrUpdater {

   void initialize();

   blo makeWorldRenderer(ahb var1, List var2, int var3, int var4, int var5, int var6);

   void preRender(bma var1, class_752 var2);

   void postRender();

   boolean updateRenderers(bma var1, class_752 var2, boolean var3);

   void resumeBackgroundUpdates();

   void pauseBackgroundUpdates();

   void finishCurrentUpdate();

   void clearAllUpdates();

   void terminate();
}
