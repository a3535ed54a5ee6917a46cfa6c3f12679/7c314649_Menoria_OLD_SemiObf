import org.lwjgl.opengl.GL11;

// $FF: renamed from: oR
public class class_836 extends class_827 {

   // $FF: renamed from: h bqx
   private static final bqx field_3874;
   // $FF: renamed from: k bqx
   private static final bqx field_3875;
   // $FF: renamed from: l bqx
   private static final bqx field_3876;
   // $FF: renamed from: m bqx
   private static final bqx field_3877;


   // $FF: renamed from: <init> (bhr, bhr, float) void
   public void method_4858(bhr var1, bhr var2, float var3) {
      super.method_4798(var1, var3);
      this.method_4799(var2);
   }

   // $FF: renamed from: b (wN, float) float
   protected float method_4859(class_777 var1, float var2) {
      return var1.method_4490();
   }

   // $FF: renamed from: b (wN, int, float) int
   protected int method_4860(class_777 var1, int var2, float var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var2;
      if(var4 != null) {
         label30: {
            if(var2 == 0) {
               var10000 = var1.method_4486();
               if(var4 == null) {
                  break label30;
               }

               if(var10000 != 0) {
                  float var5 = var1.method_3884(var3) * var1.method_4487(var3);
                  this.method_4732(field_3874);
                  GL11.glColor3f(var5, var5, var5);
                  return 1;
               }
            }

            var10000 = var2;
         }
      }

      if(var4 != null) {
         if(var10000 == 1) {
            var10000 = var1.method_4476();
            if(var4 == null) {
               return var10000;
            }

            if(var10000 != 0) {
               this.method_4732(field_3877);
               int var6 = var1.method_4493();
               GL11.glColor3f(class_770.field_3491[var6][0], class_770.field_3491[var6][1], class_770.field_3491[var6][2]);
               return 1;
            }
         }

         var10000 = -1;
      }

      return var10000;
   }

   // $FF: renamed from: b (wN) bqx
   protected bqx method_4861(class_777 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = var1.method_4476();
      if(var2 != null) {
         if(var10000) {
            return field_3875;
         }

         var10000 = var1.method_4491();
      }

      return var10000?field_3876:field_3874;
   }

   // $FF: renamed from: b (sv, float) float
   // $FF: synthetic method
   protected float method_4806(class_752 var1, float var2) {
      return this.method_4859((class_777)var1, var2);
   }

   // $FF: renamed from: <clinit> () void
   static void method_4744() {
      // $FF: Couldn't be decompiled
   }
}
