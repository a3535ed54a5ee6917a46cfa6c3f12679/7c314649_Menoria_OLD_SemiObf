import java.util.List;

public class WrUpdates {

   private static IWrUpdater wrUpdater;


   // $FF: renamed from: <init> () void
   public void method_3336() {
      super();
   }

   public static void setWrUpdater(IWrUpdater param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean hasWrUpdater() {
      return wrUpdater != null;
   }

   public static IWrUpdater getWrUpdater() {
      return wrUpdater;
   }

   public static blo makeWorldRenderer(ahb var0, List var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      IWrUpdater var10000 = wrUpdater;
      if(var6 != null) {
         if(wrUpdater == null) {
            blo var7 = new blo;
            var7.method_2293(var0, var1, var2, var3, var4, var5);
            return var7;
         }

         var10000 = wrUpdater;
      }

      return var10000.makeWorldRenderer(var0, var1, var2, var3, var4, var5);
   }

   public static boolean updateRenderers(bma var0, class_752 var1, boolean var2) {
      try {
         return wrUpdater.updateRenderers(var0, var1, var2);
      } catch (Exception var4) {
         var4.printStackTrace();
         setWrUpdater((IWrUpdater)null);
         return false;
      }
   }

   public static void resumeBackgroundUpdates() {
      String[] var0 = class_752.method_4253();
      IWrUpdater var10000 = wrUpdater;
      if(var0 != null) {
         if(wrUpdater == null) {
            return;
         }

         var10000 = wrUpdater;
      }

      var10000.resumeBackgroundUpdates();
   }

   public static void pauseBackgroundUpdates() {
      String[] var0 = class_752.method_4253();
      IWrUpdater var10000 = wrUpdater;
      if(var0 != null) {
         if(wrUpdater == null) {
            return;
         }

         var10000 = wrUpdater;
      }

      var10000.pauseBackgroundUpdates();
   }

   public static void finishCurrentUpdate() {
      String[] var0 = class_752.method_4253();
      IWrUpdater var10000 = wrUpdater;
      if(var0 != null) {
         if(wrUpdater == null) {
            return;
         }

         var10000 = wrUpdater;
      }

      var10000.finishCurrentUpdate();
   }

   public static void preRender(bma var0, class_752 var1) {
      String[] var2 = class_752.method_4253();
      IWrUpdater var10000 = wrUpdater;
      if(var2 != null) {
         if(wrUpdater == null) {
            return;
         }

         var10000 = wrUpdater;
      }

      var10000.preRender(var0, var1);
   }

   public static void postRender() {
      String[] var0 = class_752.method_4253();
      IWrUpdater var10000 = wrUpdater;
      if(var0 != null) {
         if(wrUpdater == null) {
            return;
         }

         var10000 = wrUpdater;
      }

      var10000.postRender();
   }

   public static void clearAllUpdates() {
      String[] var0 = class_752.method_4253();
      IWrUpdater var10000 = wrUpdater;
      if(var0 != null) {
         if(wrUpdater == null) {
            return;
         }

         var10000 = wrUpdater;
      }

      var10000.clearAllUpdates();
   }

   // $FF: renamed from: <clinit> () void
   static void method_3337() {
      wrUpdater = null;
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_3338(Exception var0) {
      return var0;
   }
}
