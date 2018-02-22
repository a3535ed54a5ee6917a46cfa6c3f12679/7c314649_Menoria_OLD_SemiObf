import java.util.List;
import org.lwjgl.opengl.Drawable;
import org.lwjgl.opengl.Pbuffer;
import org.lwjgl.opengl.PixelFormat;

public class WrUpdaterThreaded implements IWrUpdater {

   private WrUpdateThread updateThread;
   private float timePerUpdateMs;
   private long updateStartTimeNs;
   private boolean firstUpdate;
   private int updateTargetNum;
   // $FF: renamed from: h java.lang.String
   private static final String field_30 = "UpdateThread is already existing";


   // $FF: renamed from: <init> () void
   public void method_436() {
      super();
      this.updateThread = null;
      this.timePerUpdateMs = 10.0F;
      this.updateStartTimeNs = 0L;
      this.firstUpdate = true;
      this.updateTargetNum = 0;
   }

   public void terminate() {
      // $FF: Couldn't be decompiled
   }

   public void initialize() {}

   private void delayedInit() {
      // $FF: Couldn't be decompiled
   }

   public blo makeWorldRenderer(ahb var1, List var2, int var3, int var4, int var5, int var6) {
      WorldRendererThreaded var10000 = new WorldRendererThreaded;
      var10000.method_2293(var1, var2, var3, var4, var5, var6);
      return var10000;
   }

   public WrUpdateThread createUpdateThread(Drawable var1) {
      try {
         if(this.updateThread != null) {
            throw new IllegalStateException("UpdateThread is already existing");
         }
      } catch (Exception var4) {
         throw method_437(var4);
      }

      try {
         Pbuffer var2 = new Pbuffer(1, 1, new PixelFormat(), var1);
         WrUpdateThread var10001 = new WrUpdateThread;
         var10001.method_7008(var2);
         this.updateThread = var10001;
         this.updateThread.setPriority(1);
         this.updateThread.start();
         this.updateThread.pause();
         return this.updateThread;
      } catch (Exception var3) {
         throw new RuntimeException(var3);
      }
   }

   public boolean isUpdateThread() {
      boolean var10000;
      try {
         if(Thread.currentThread() == this.updateThread) {
            var10000 = true;
            return var10000;
         }
      } catch (IllegalStateException var1) {
         throw method_437(var1);
      }

      var10000 = false;
      return var10000;
   }

   public static boolean isBackgroundChunkLoading() {
      return true;
   }

   public void preRender(bma param1, class_752 param2) {
      // $FF: Couldn't be decompiled
   }

   public void postRender() {
      // $FF: Couldn't be decompiled
   }

   public boolean updateRenderers(bma param1, class_752 param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   private void updateRenderer(blo param1, class_752 param2) {
      // $FF: Couldn't be decompiled
   }

   public void finishCurrentUpdate() {
      // $FF: Couldn't be decompiled
   }

   public void resumeBackgroundUpdates() {
      // $FF: Couldn't be decompiled
   }

   public void pauseBackgroundUpdates() {
      // $FF: Couldn't be decompiled
   }

   public void clearAllUpdates() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_437(Exception var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_438() {
      boolean var10000 = true;
      char[] var10003 = "ïüHL<ïì\rq\'ÎâúHy0ÅëðDk é".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_30 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 78;
            break;
         case 1:
            var10009 = 244;
            break;
         case 2:
            var10009 = 255;
            break;
         case 3:
            var10009 = 148;
            break;
         case 4:
            var10009 = 146;
            break;
         case 5:
            var10009 = 55;
            break;
         default:
            var10009 = 2;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
