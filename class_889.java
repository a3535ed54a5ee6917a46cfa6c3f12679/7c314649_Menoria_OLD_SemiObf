import java.util.Comparator;
import org.lwjgl.opengl.DisplayMode;

// $FF: renamed from: aE
final class class_889 implements Comparator {

   // $FF: renamed from: <init> () void
   void method_5176() {
      super();
   }

   public int compare(Object var1, Object var2) {
      DisplayMode var4 = (DisplayMode)var1;
      String[] var10000 = class_752.method_4253();
      DisplayMode var5 = (DisplayMode)var2;
      String[] var3 = var10000;
      int var6 = var4.getWidth();
      int var10001 = var5.getWidth();
      if(var3 != null) {
         if(var6 != var10001) {
            return var5.getWidth() - var4.getWidth();
         }

         var6 = var4.getHeight();
         if(var3 == null) {
            return var6;
         }

         var10001 = var5.getHeight();
      }

      if(var6 != var10001) {
         return var5.getHeight() - var4.getHeight();
      } else {
         var6 = 0;
         return var6;
      }
   }
}
