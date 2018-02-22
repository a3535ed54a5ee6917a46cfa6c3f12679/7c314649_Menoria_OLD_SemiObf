import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: gB
public class class_598 extends class_580 {

   // $FF: renamed from: m aji
   private aji field_2560;
   // $FF: renamed from: n int
   private int field_2561;
   // $FF: renamed from: o int
   private int field_2562;
   // $FF: renamed from: p boolean
   private boolean field_2563;
   // $FF: renamed from: q boolean
   private boolean field_2564;
   // $FF: renamed from: r float
   private float field_2565;
   // $FF: renamed from: s float
   private float field_2566;
   // $FF: renamed from: t java.util.List
   private List field_2567;
   // $FF: renamed from: u java.lang.String[]
   private static final String[] field_2568;


   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super.getBlock88();
      this.field_2567 = new ArrayList();
   }

   // $FF: renamed from: <init> (aji, int, int, boolean, boolean) void
   public void method_3186(aji var1, int var2, int var3, boolean var4, boolean var5) {
      super.getBlock88();
      this.field_2567 = new ArrayList();
      this.field_2560 = var1;
      this.field_2561 = var2;
      this.field_2562 = var3;
      this.field_2563 = var4;
      this.field_2564 = var5;
   }

   // $FF: renamed from: b () aji
   public aji method_3187() {
      return this.field_2560;
   }

   // $FF: renamed from: h () int
   public int getBlock96() {
      return this.field_2561;
   }

   // $FF: renamed from: d () boolean
   public boolean method_3188() {
      return this.field_2563;
   }

   // $FF: renamed from: e () int
   public int method_3189() {
      return this.field_2562;
   }

   // $FF: renamed from: f () boolean
   public boolean method_3190() {
      return this.field_2564;
   }

   // $FF: renamed from: b (float) float
   public float method_3191(float var1) {
      String[] var2 = class_752.method_4253();
      float var10000 = var1;
      float var10001 = 1.0F;
      if(var2 != null) {
         if(var1 > 1.0F) {
            var1 = 1.0F;
         }

         var10000 = this.field_2566;
         var10001 = (this.field_2565 - this.field_2566) * var1;
      }

      return var10000 + var10001;
   }

   // $FF: renamed from: c (float) float
   public float method_3192(float var1) {
      String[] var2 = class_752.method_4253();
      class_598 var10000 = this;
      if(var2 != null) {
         if(!this.field_2563) {
            return (1.0F - this.method_3191(var1)) * (float)class_1707.field_8947[this.field_2562];
         }

         var10000 = this;
      }

      return (var10000.method_3191(var1) - 1.0F) * (float)class_1707.field_8947[this.field_2562];
   }

   // $FF: renamed from: d (float) float
   public float method_3193(float var1) {
      String[] var2 = class_752.method_4253();
      class_598 var10000 = this;
      if(var2 != null) {
         if(!this.field_2563) {
            return (1.0F - this.method_3191(var1)) * (float)class_1707.field_8948[this.field_2562];
         }

         var10000 = this;
      }

      return (var10000.method_3191(var1) - 1.0F) * (float)class_1707.field_8948[this.field_2562];
   }

   // $FF: renamed from: e (float) float
   public float method_3194(float var1) {
      String[] var2 = class_752.method_4253();
      class_598 var10000 = this;
      if(var2 != null) {
         if(!this.field_2563) {
            return (1.0F - this.method_3191(var1)) * (float)class_1707.field_8949[this.field_2562];
         }

         var10000 = this;
      }

      return (var10000.method_3191(var1) - 1.0F) * (float)class_1707.field_8949[this.field_2562];
   }

   // $FF: renamed from: b (float, float) void
   private void method_3195(float var1, float var2) {
      String[] var3;
      label35: {
         var3 = class_752.method_4253();
         if(this.field_2563) {
            var1 = 1.0F - var1;
            if(var3 != null) {
               break label35;
            }
         }

         --var1;
      }

      class_1343 var4 = class_1192.field_6063.method_2824(this.field_2464, this.field_2465, this.field_2466, this.field_2467, this.field_2560, var1, this.field_2562);
      if(var4 != null) {
         List var5 = this.field_2464.method_2155((class_689)null, var4);
         boolean var10000 = var5.isEmpty();
         if(var3 != null) {
            if(var10000) {
               return;
            }

            this.field_2567.addAll(var5);
         }

         Iterator var6 = this.field_2567.iterator();

         while(true) {
            if(var6.hasNext()) {
               class_689 var7 = (class_689)var6.next();
               var7.method_3864((double)(var2 * (float)class_1707.field_8947[this.field_2562]), (double)(var2 * (float)class_1707.field_8948[this.field_2562]), (double)(var2 * (float)class_1707.field_8949[this.field_2562]));
               if(var3 == null) {
                  break;
               }

               if(var3 != null) {
                  continue;
               }
            }

            this.field_2567.clear();
            break;
         }
      }

   }

   // $FF: renamed from: i () void
   public void method_3196() {
      String[] var1 = class_752.method_4253();
      class_598 var10000 = this;
      if(var1 != null) {
         if(this.field_2566 >= 1.0F) {
            return;
         }

         var10000 = this;
      }

      ahb var2 = var10000.field_2464;
      if(var1 != null) {
         if(var2 == null) {
            return;
         }

         this.field_2566 = this.field_2565 = 1.0F;
         this.field_2464.method_2132(this.field_2465, this.field_2466, this.field_2467);
         this.method_3102();
         var2 = this.field_2464;
      }

      int var10001 = this.field_2465;
      int var10002 = this.field_2466;
      int var10003 = this.field_2467;
      if(var1 != null) {
         if(var2.getBlock(this.field_2465, this.field_2466, this.field_2467) != class_1192.field_6063) {
            return;
         }

         this.field_2464.method_2054(this.field_2465, this.field_2466, this.field_2467, this.field_2560, this.field_2561, 3);
         var2 = this.field_2464;
         var10001 = this.field_2465;
         var10002 = this.field_2466;
         var10003 = this.field_2467;
      }

      var2.method_2065(var10001, var10002, var10003, this.field_2560);
   }

   // $FF: renamed from: g () void
   public void getBlock94() {
      String[] var10000 = class_752.method_4253();
      this.field_2566 = this.field_2565;
      String[] var1 = var10000;
      float var5;
      int var2 = (var5 = this.field_2566 - 1.0F) == 0.0F?0:(var5 < 0.0F?-1:1);
      if(var1 != null) {
         if(var2 >= 0) {
            this.method_3195(1.0F, 0.25F);
            this.field_2464.method_2132(this.field_2465, this.field_2466, this.field_2467);
            this.method_3102();
            ahb var4 = this.field_2464;
            int var10001 = this.field_2465;
            int var10002 = this.field_2466;
            int var10003 = this.field_2467;
            if(var1 != null) {
               if(this.field_2464.getBlock(this.field_2465, this.field_2466, this.field_2467) != class_1192.field_6063) {
                  return;
               }

               this.field_2464.method_2054(this.field_2465, this.field_2466, this.field_2467, this.field_2560, this.field_2561, 3);
               var4 = this.field_2464;
               var10001 = this.field_2465;
               var10002 = this.field_2466;
               var10003 = this.field_2467;
            }

            var4.method_2065(var10001, var10002, var10003, this.field_2560);
            return;
         }

         this.field_2565 += 0.5F;
         float var6;
         var2 = (var6 = this.field_2565 - 1.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
      }

      class_598 var3;
      label44: {
         if(var1 != null) {
            if(var2 >= 0) {
               this.field_2565 = 1.0F;
            }

            var3 = this;
            if(var1 == null) {
               break label44;
            }

            var2 = this.field_2563;
         }

         if(var2 == 0) {
            return;
         }

         var3 = this;
      }

      var3.method_3195(this.field_2565, this.field_2565 - this.field_2566 + 0.0625F);
   }

   // $FF: renamed from: b (ro) void
   public void getBlock92(class_1583 var1) {
      super.getBlock92(var1);
      String[] var2 = field_2568;
      this.field_2560 = aji.method_2416(var1.method_8681("blockId"));
      this.field_2561 = var1.method_8681("blockData");
      this.field_2562 = var1.method_8681("facing");
      this.field_2566 = this.field_2565 = var1.method_8683("progress");
      this.field_2563 = var1.method_8690("extending");
   }

   // $FF: renamed from: c (ro) void
   public void getBlock93(class_1583 var1) {
      super.getBlock93(var1);
      String[] var2 = field_2568;
      var1.method_8667("blockId", aji.method_2415(this.field_2560));
      var1.method_8667("blockData", this.field_2561);
      var1.method_8667("facing", this.field_2562);
      var1.method_8669("progress", this.field_2566);
      var1.initGui4("extending", this.field_2563);
   }

   // $FF: renamed from: <clinit> () void
   static void method_3108() {
      // $FF: Couldn't be decompiled
   }
}
