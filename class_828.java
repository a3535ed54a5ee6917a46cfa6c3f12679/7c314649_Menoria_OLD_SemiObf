import java.util.Map;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: oz
public class class_828 extends class_827 {

   // $FF: renamed from: h java.util.Map
   private static final Map field_3854;
   // $FF: renamed from: k bqx
   private static final bqx field_3855;
   // $FF: renamed from: l bqx
   private static final bqx field_3856;
   // $FF: renamed from: m bqx
   private static final bqx field_3857;
   // $FF: renamed from: n bqx
   private static final bqx field_3858;
   // $FF: renamed from: o bqx
   private static final bqx field_3859;


   // $FF: renamed from: <init> (bhr, float) void
   public void method_4798(bhr var1, float var2) {
      super.method_4798(var1, var2);
   }

   // $FF: renamed from: b (wR, float) void
   protected void method_4833(class_772 var1, float var2) {
      float var4;
      label17: {
         String[] var10000 = class_752.method_4253();
         var4 = 1.0F;
         String[] var3 = var10000;
         int var5 = var1.method_4400();
         int var6 = var5;
         byte var10001 = 1;
         if(var3 != null) {
            if(var5 == 1) {
               var4 *= 0.87F;
               if(var3 != null) {
                  break label17;
               }
            }

            var6 = var5;
            var10001 = 2;
         }

         if(var6 == var10001) {
            var4 *= 0.92F;
         }
      }

      GL11.glScalef(var4, var4, var4);
      super.method_4814(var1, var2);
   }

   // $FF: renamed from: b (wR, float, float, float, float, float, float) void
   protected void method_4834(class_772 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      String[] var8 = class_752.method_4253();
      if(var1.method_3942()) {
         this.field_3844.method_6512(var2, var3, var4, var5, var6, var7, var1);
         if(var8 != null) {
            return;
         }
      }

      this.method_4731(var1);
      this.field_3844.method_6511(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: b (wR) bqx
   protected bqx method_4835(class_772 var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1.method_4440();
      if(var2 != null) {
         if(var10000 != 0) {
            return this.method_4836(var1);
         }

         var10000 = var1.method_4400();
      }

      switch(var10000) {
      case 0:
      default:
         return field_3855;
      case 1:
         return field_3857;
      case 2:
         return field_3856;
      case 3:
         return field_3858;
      case 4:
         return field_3859;
      }
   }

   // $FF: renamed from: c (wR) bqx
   private bqx method_4836(class_772 var1) {
      String var3 = var1.method_4443();
      bqx var4 = (bqx)field_3854.get(var3);
      String[] var2 = class_752.method_4253();
      bqx var10000 = var4;
      if(var2 != null) {
         if(var4 == null) {
            var10000 = new bqx;
            var10000.method_8227(var3);
            var4 = var10000;
            bqf var5 = bao.method_5273().method_5288();
            bpt var10002 = new bpt;
            var10002.method_7964(var1.method_4444());
            var5.method_8120(var4, var10002);
            field_3854.put(var3, var4);
         }

         var10000 = var4;
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      // $FF: Couldn't be decompiled
   }
}
