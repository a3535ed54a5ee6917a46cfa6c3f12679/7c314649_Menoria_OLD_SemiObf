package ca.diiza.l;

import ca.diiza.l.class_862;

// $FF: renamed from: ca.diiza.l.k
public class class_859 {

   // $FF: renamed from: a float
   static final float field_3982 = 0.003921569F;
   // $FF: renamed from: b boolean
   public boolean field_3983;
   // $FF: renamed from: c float
   public float field_3984;
   // $FF: renamed from: d float
   public float field_3985;
   // $FF: renamed from: e float
   public float field_3986;
   // $FF: renamed from: f float
   public float field_3987;


   // $FF: renamed from: <init> () void
   public void method_4962() {
      this.method_4963(true);
   }

   // $FF: renamed from: <init> (boolean) void
   public void method_4963(boolean var1) {
      super();
      this.field_3983 = var1;
   }

   // $FF: renamed from: a () void
   public void method_4964() {
      this.field_3984 = this.field_3985 = this.field_3986 = this.field_3987 = 0.0F;
   }

   // $FF: renamed from: a (int) void
   public void method_4965(int var1) {
      this.method_4966(var1, 1.0F);
   }

   // $FF: renamed from: a (int, float) void
   public void method_4966(int var1, float var2) {
      int var3 = class_862.method_5031();
      class_859 var10000 = this;
      if(var3 == 0) {
         if(this.field_3983) {
            float var4 = (float)(var1 >> 24 & 255) * 0.003921569F;
            float var5 = (float)(var1 >> 16 & 255) * 0.003921569F * var2;
            float var6 = (float)(var1 >> 8 & 255) * 0.003921569F * var2;
            float var7 = (float)(var1 >> 0 & 255) * 0.003921569F * var2;
            this.field_3984 += (var5 - this.field_3984) * var4;
            this.field_3985 += (var6 - this.field_3985) * var4;
            this.field_3986 += (var7 - this.field_3986) * var4;
            this.field_3987 += (1.0F - this.field_3987) * var4;
            if(var3 == 0) {
               return;
            }
         }

         this.field_3987 = (float)(var1 >> 24 & 255) * 0.003921569F;
         this.field_3984 = (float)(var1 >> 16 & 255) * 0.003921569F * var2;
         this.field_3985 = (float)(var1 >> 8 & 255) * 0.003921569F * var2;
         var10000 = this;
      }

      var10000.field_3986 = (float)(var1 >> 0 & 255) * 0.003921569F * var2;
   }

   // $FF: renamed from: a (float, int, float) void
   public void method_4967(float var1, int var2, float var3) {
      int var4 = class_862.method_5030();
      class_859 var10000 = this;
      if(var4 != 0) {
         if(this.field_3983) {
            float var5 = (float)(var2 >> 16 & 255) * 0.003921569F * var3;
            float var6 = (float)(var2 >> 8 & 255) * 0.003921569F * var3;
            float var7 = (float)(var2 >> 0 & 255) * 0.003921569F * var3;
            this.field_3984 += (var5 - this.field_3984) * var1;
            this.field_3985 += (var6 - this.field_3985) * var1;
            this.field_3986 += (var7 - this.field_3986) * var1;
            this.field_3987 += (1.0F - this.field_3987) * var1;
            if(var4 != 0) {
               return;
            }
         }

         this.field_3987 = (float)(var2 >> 24 & 255) * 0.003921569F;
         this.field_3984 = (float)(var2 >> 16 & 255) * 0.003921569F * var3;
         this.field_3985 = (float)(var2 >> 8 & 255) * 0.003921569F * var3;
         var10000 = this;
      }

      var10000.field_3986 = (float)(var2 >> 0 & 255) * 0.003921569F * var3;
   }

   // $FF: renamed from: a (float, int, float, float, float) void
   public void method_4968(float var1, int var2, float var3, float var4, float var5) {
      int var6 = class_862.method_5031();
      class_859 var10000 = this;
      if(var6 == 0) {
         if(this.field_3983) {
            float var7 = (float)(var2 >> 16 & 255) * 0.003921569F * var3;
            float var8 = (float)(var2 >> 8 & 255) * 0.003921569F * var4;
            float var9 = (float)(var2 >> 0 & 255) * 0.003921569F * var5;
            this.field_3984 += (var7 - this.field_3984) * var1;
            this.field_3985 += (var8 - this.field_3985) * var1;
            this.field_3986 += (var9 - this.field_3986) * var1;
            this.field_3987 += (1.0F - this.field_3987) * var1;
            if(var6 == 0) {
               return;
            }
         }

         this.field_3987 = (float)(var2 >> 24 & 255) * 0.003921569F;
         this.field_3984 = (float)(var2 >> 16 & 255) * 0.003921569F * var3;
         this.field_3985 = (float)(var2 >> 8 & 255) * 0.003921569F * var4;
         var10000 = this;
      }

      var10000.field_3986 = (float)(var2 >> 0 & 255) * 0.003921569F * var5;
   }

   // $FF: renamed from: a (float, float, float, float) void
   public void method_4969(float var1, float var2, float var3, float var4) {
      int var5 = class_862.method_5031();
      class_859 var10000 = this;
      if(var5 == 0) {
         if(this.field_3983) {
            this.field_3984 += (var2 - this.field_3984) * var1;
            this.field_3985 += (var3 - this.field_3985) * var1;
            this.field_3986 += (var4 - this.field_3986) * var1;
            this.field_3987 += (1.0F - this.field_3987) * var1;
            if(var5 == 0) {
               return;
            }
         }

         this.field_3987 = var1;
         this.field_3984 = var2;
         this.field_3985 = var3;
         var10000 = this;
      }

      var10000.field_3986 = var4;
   }

   // $FF: renamed from: a (float, float, float, float, float) void
   public void method_4970(float var1, float var2, float var3, float var4, float var5) {
      int var6 = class_862.method_5030();
      class_859 var10000 = this;
      if(var6 != 0) {
         if(this.field_3983) {
            this.field_3984 += (var2 * var5 - this.field_3984) * var1;
            this.field_3985 += (var3 * var5 - this.field_3985) * var1;
            this.field_3986 += (var4 * var5 - this.field_3986) * var1;
            this.field_3987 += (1.0F - this.field_3987) * var1;
            if(var6 != 0) {
               return;
            }
         }

         this.field_3987 = var1;
         this.field_3984 = var2 * var5;
         this.field_3985 = var3 * var5;
         var10000 = this;
      }

      var10000.field_3986 = var4 * var5;
   }
}
