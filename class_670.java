
// $FF: renamed from: Ak
public class class_670 {

   // $FF: renamed from: b int
   private int field_2862;
   // $FF: renamed from: c float
   private float field_2863;
   // $FF: renamed from: d float
   private float field_2864;
   // $FF: renamed from: e int
   private int field_2865;
   // $FF: renamed from: f int
   private int field_2866;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2867;


   // $FF: renamed from: <init> () void
   public void method_3631() {
      super();
      this.field_2862 = 20;
      this.field_2866 = 20;
      this.field_2863 = 5.0F;
   }

   // $FF: renamed from: b (int, float) void
   public void method_3632(int var1, float var2) {
      this.field_2862 = Math.min(var1 + this.field_2862, 20);
      this.field_2863 = Math.min(this.field_2863 + (float)var1 * var2 * 2.0F, (float)this.field_2862);
   }

   // $FF: renamed from: b (bX, add) void
   public void method_3633(class_557 var1, add var2) {
      this.method_3632(var1.getBlock43(var2), var1.getBlock44(var2));
   }

   // $FF: renamed from: b (yz) void
   public void method_3634(class_792 var1) {
      class_918 var3 = var1.field_2990.field_1818;
      String[] var2 = class_752.method_4253();
      this.field_2866 = this.field_2862;
      float var6;
      int var10000 = (var6 = this.field_2864 - 4.0F) == 0.0F?0:(var6 < 0.0F?-1:1);
      class_670 var4;
      if(var2 != null) {
         if(var10000 > 0) {
            label87: {
               label86: {
                  this.field_2864 -= 4.0F;
                  var4 = this;
                  if(var2 != null) {
                     if(this.field_2863 <= 0.0F) {
                        break label86;
                     }

                     var4 = this;
                  }

                  var4.field_2863 = Math.max(this.field_2863 - 1.0F, 0.0F);
                  if(var2 != null) {
                     break label87;
                  }
               }

               if(var3 != class_918.field_4627) {
                  this.field_2862 = Math.max(this.field_2862 - 1, 0);
               }
            }
         }

         class_1038 var5 = var1.field_2990.method_2196();
         String[] var10001 = field_2867;
         var10000 = var5.method_5878("naturalRegeneration");
      }

      label93: {
         if(var2 != null) {
            label94: {
               if(var10000 != 0) {
                  var10000 = this.field_2862;
                  if(var2 == null) {
                     break label94;
                  }

                  if(this.field_2862 >= 18) {
                     var10000 = var1.method_4625();
                     if(var2 == null) {
                        break label94;
                     }

                     if(var10000 != 0) {
                        ++this.field_2865;
                        var4 = this;
                        if(var2 != null) {
                           if(this.field_2865 < 80) {
                              return;
                           }

                           var1.method_4187(1.0F);
                           this.method_3640(3.0F);
                           var4 = this;
                        }

                        var4.field_2865 = 0;
                        if(var2 != null) {
                           return;
                        }
                     }
                  }
               }

               var4 = this;
               if(var2 == null) {
                  break label93;
               }

               var10000 = this.field_2862;
            }
         }

         if(var10000 <= 0) {
            ++this.field_2865;
            var10000 = this.field_2865;
            if(var2 != null) {
               if(this.field_2865 < 80) {
                  return;
               }

               float var7;
               var10000 = (var7 = var1.method_406() - 10.0F) == 0.0F?0:(var7 < 0.0F?-1:1);
            }

            if(var2 != null && (var10000 > 0 || var3 == class_918.field_4630 || var1.method_406() > 1.0F && var3 == class_918.field_4629)) {
               var1.method_3896(class_1691.field_8835, 1.0F);
            }

            this.field_2865 = 0;
            if(var2 != null) {
               return;
            }
         }

         var4 = this;
      }

      var4.field_2865 = 0;
   }

   // $FF: renamed from: b (ro) void
   public void method_3635(class_1583 var1) {
      String[] var2 = field_2867;
      if(var1.initGui8("foodLevel", 99)) {
         this.field_2862 = var1.method_8681("foodLevel");
         this.field_2865 = var1.method_8681("foodTickTimer");
         this.field_2863 = var1.method_8683("foodSaturationLevel");
         this.field_2864 = var1.method_8683("foodExhaustionLevel");
      }

   }

   // $FF: renamed from: c (ro) void
   public void method_3636(class_1583 var1) {
      String[] var2 = field_2867;
      var1.method_8667("foodLevel", this.field_2862);
      var1.method_8667("foodTickTimer", this.field_2865);
      var1.method_8669("foodSaturationLevel", this.field_2863);
      var1.method_8669("foodExhaustionLevel", this.field_2864);
   }

   // $FF: renamed from: b () int
   public int method_3637() {
      return this.field_2862;
   }

   // $FF: renamed from: c () int
   public int method_3638() {
      return this.field_2866;
   }

   // $FF: renamed from: d () boolean
   public boolean method_3639() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_2862;
      if(var1 != null) {
         var10000 = this.field_2862 < 20?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (float) void
   public void method_3640(float var1) {
      this.field_2864 = Math.min(this.field_2864 + var1, 40.0F);
   }

   // $FF: renamed from: f () float
   public float method_3641() {
      return this.field_2863;
   }

   // $FF: renamed from: b (int) void
   public void method_3642(int var1) {
      this.field_2862 = var1;
   }

   // $FF: renamed from: c (float) void
   public void method_3643(float var1) {
      this.field_2863 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3644() {
      // $FF: Couldn't be decompiled
   }
}
