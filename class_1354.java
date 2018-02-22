import java.util.Iterator;
import java.util.List;

// $FF: renamed from: kq
public class class_1354 extends class_1352 {

   // $FF: renamed from: <init> (java.lang.String) void
   public void getMaxStringLength5(String var1) {
      super.getMaxStringLength5(var1);
   }

   // $FF: renamed from: b (java.util.List) int
   public int method_155(List var1) {
      String[] var10000 = class_752.method_4253();
      float var3 = 0.0F;
      String[] var2 = var10000;
      Iterator var4 = var1.iterator();

      int var6;
      while(true) {
         if(var4.hasNext()) {
            class_792 var5 = (class_792)var4.next();
            var3 += var5.method_406() + var5.method_4245();
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         var6 = var1.size();
         if(var2 == null) {
            return var6;
         }

         if(var6 > 0) {
            var3 /= (float)var1.size();
         }
         break;
      }

      var6 = class_1715.method_9566(var3);
      return var6;
   }

   // $FF: renamed from: c () boolean
   public boolean method_156() {
      return true;
   }
}
