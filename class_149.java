import org.lwjgl.opengl.GL11;

// $FF: renamed from: k3
class class_149 extends bcb {

   // $FF: renamed from: b aw
   private final class_930 field_476;
   // $FF: renamed from: o java.lang.String
   private final String field_477;
   // $FF: renamed from: p float
   public float field_478;
   // $FF: renamed from: q boolean
   public boolean field_479;
   // $FF: renamed from: r java.lang.String
   private static final String field_480;
   // $FF: renamed from: s lA
   final class_200 field_481;
   // $FF: renamed from: t java.lang.String[]
   private static final String[] field_482;


   // $FF: renamed from: <init> (lA, int, int, int, aw, boolean) void
   public void method_771(class_200 var1, int var2, int var3, int var4, class_930 var5, boolean var6) {
      this.field_481 = var1;
      super.method_748(var2, var3, var4, var6?310:150, 20, "");
      this.field_478 = 1.0F;
      this.field_476 = var5;
      StringBuilder var10001 = new StringBuilder();
      String[] var7 = field_482;
      this.field_477 = class_1450.method_7896(var10001.append("soundCategory.").append(var5.method_5452()).toString(), new Object[0]);
      this.field_449 = this.field_477 + ": " + var1.method_1089(var5);
      this.field_478 = class_200.method_1090(var1).method_5359(var5);
   }

   // $FF: renamed from: a (boolean) int
   public int method_749(boolean var1) {
      return 0;
   }

   // $FF: renamed from: b (bao, int, int) void
   protected void method_751(bao var1, int var2, int var3) {
      class_149 var5;
      label43: {
         String[] var4 = class_752.method_4253();
         boolean var10000 = this.field_452;
         if(var4 != null) {
            if(!this.field_452) {
               return;
            }

            var5 = this;
            if(var4 == null) {
               break label43;
            }

            var10000 = this.field_479;
         }

         if(var10000) {
            label45: {
               this.field_478 = (float)(var2 - (this.field_447 + 4)) / (float)(this.field_445 - 8);
               float var7;
               int var6 = (var7 = this.field_478 - 0.0F) == 0.0F?0:(var7 < 0.0F?-1:1);
               if(var4 != null) {
                  if(var6 < 0) {
                     this.field_478 = 0.0F;
                  }

                  var5 = this;
                  if(var4 == null) {
                     break label45;
                  }

                  float var8;
                  var6 = (var8 = this.field_478 - 1.0F) == 0.0F?0:(var8 < 0.0F?-1:1);
               }

               if(var6 > 0) {
                  this.field_478 = 1.0F;
               }

               var1.canLoseFocus7.method_5360(this.field_476, this.field_478);
               var1.canLoseFocus7.method_5358();
               var5 = this;
            }

            StringBuilder var10001 = (new StringBuilder()).append(this.field_477);
            String[] var10002 = field_482;
            var5.field_449 = var10001.append(": ").append(this.field_481.method_1089(this.field_476)).toString();
         }

         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.method_658(this.field_447 + (int)(this.field_478 * (float)(this.field_445 - 8)), this.field_448, 0, 66, 4, 20);
         var5 = this;
      }

      var5.method_658(this.field_447 + (int)(this.field_478 * (float)(this.field_445 - 8)) + 4, this.field_448, 196, 66, 4, 20);
   }

   // $FF: renamed from: c (bao, int, int) boolean
   public boolean method_753(bao var1, int var2, int var3) {
      String[] var4 = class_752.method_4253();
      boolean var10000 = super.method_753(var1, var2, var3);
      if(var4 != null) {
         if(var10000) {
            this.field_478 = (float)(var2 - (this.field_447 + 4)) / (float)(this.field_445 - 8);
            float var6;
            int var5 = (var6 = this.field_478 - 0.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
            if(var4 != null) {
               if(var5 < 0) {
                  this.field_478 = 0.0F;
               }

               float var7;
               var5 = (var7 = this.field_478 - 1.0F) == 0.0F?0:(var7 < 0.0F?-1:1);
            }

            if(var4 != null) {
               if(var5 > 0) {
                  this.field_478 = 1.0F;
               }

               var1.canLoseFocus7.method_5360(this.field_476, this.field_478);
               var1.canLoseFocus7.method_5358();
               StringBuilder var10001 = (new StringBuilder()).append(this.field_477);
               String[] var10002 = field_482;
               this.field_449 = var10001.append(": ").append(this.field_481.method_1089(this.field_476)).toString();
               this.field_479 = true;
               var5 = 1;
            }

            return (boolean)var5;
         }

         var10000 = false;
      }

      return var10000;
   }

   // $FF: renamed from: a (ql) void
   public void method_756(class_1541 var1) {}

   // $FF: renamed from: a (int, int) void
   public void method_752(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      class_149 var10000 = this;
      if(var3 != null) {
         if(this.field_479) {
            label19: {
               var10000 = this;
               if(var3 != null) {
                  if(this.field_476 == class_930.field_4729) {
                     float var4 = 1.0F;
                     if(var3 != null) {
                        break label19;
                     }
                  }

                  var10000 = this;
               }

               class_200.method_1090(var10000.field_481).method_5359(this.field_476);
            }

            class_1541 var5 = this.field_481.field_557.method_5295();
            bqx var10001 = new bqx;
            String[] var10003 = field_482;
            var10001.method_8227("gui.button.press");
            var5.method_8366(class_1424.method_7768(var10001, 1.0F));
         }

         var10000 = this;
      }

      var10000.field_479 = false;
   }

   // $FF: renamed from: <clinit> () void
   static void method_759() {
      // $FF: Couldn't be decompiled
   }
}
