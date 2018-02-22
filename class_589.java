import java.util.Random;

// $FF: renamed from: gq
public class class_589 extends class_580 implements class_22 {

   // $FF: renamed from: a add[]
   private add[] field_2516;
   // $FF: renamed from: m java.util.Random
   private Random field_2517;
   // $FF: renamed from: n java.lang.String
   protected String field_2518;
   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_2519;


   // $FF: renamed from: <init> () void
   public void getBlock88() {
      super.getBlock88();
      this.field_2516 = new add[9];
      this.field_2517 = new Random();
   }

   // $FF: renamed from: f () int
   public int method_83() {
      return 9;
   }

   // $FF: renamed from: c (int) add
   public add method_84(int var1) {
      return this.field_2516[var1];
   }

   // $FF: renamed from: b (int, int) add
   public add method_85(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      add var10000 = this.field_2516[var1];
      if(var3 != null) {
         if(var10000 == null) {
            return null;
         }

         var10000 = this.field_2516[var1];
      }

      add var4;
      if(var3 != null) {
         if(var10000.field_2958 <= var2) {
            var4 = this.field_2516[var1];
            this.field_2516[var1] = null;
            this.method_91();
            return var4;
         }

         var10000 = this.field_2516[var1].method_3729(var2);
      }

      var4 = var10000;
      var10000 = this.field_2516[var1];
      if(var3 != null) {
         if(var10000.field_2958 == 0) {
            this.field_2516[var1] = null;
         }

         this.method_91();
         var10000 = var4;
      }

      return var10000;
   }

   // $FF: renamed from: j (int) add
   public add method_86(int var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = this.field_2516[var1];
      if(var2 != null) {
         if(var10000 == null) {
            return null;
         }

         var10000 = this.field_2516[var1];
      }

      add var3 = var10000;
      this.field_2516[var1] = null;
      return var3;
   }

   // $FF: renamed from: b () int
   public int method_3155() {
      int var2 = -1;
      String[] var10000 = class_752.method_4253();
      int var3 = 1;
      int var4 = 0;
      String[] var1 = var10000;

      while(var4 < this.field_2516.length) {
         label35: {
            class_589 var5 = this;
            if(var1 != null) {
               if(this.field_2516[var4] == null) {
                  break label35;
               }

               var5 = this;
            }

            int var7 = var5.field_2517.nextInt(var3++);
            if(var1 != null) {
               if(var7 != 0) {
                  break label35;
               }

               var7 = var4;
            }

            var2 = var7;
         }

         ++var4;
         if(var1 == null) {
            break;
         }
      }

      return var2;
   }

   // $FF: renamed from: b (int, add) void
   public void method_87(int var1, add var2) {
      String[] var10000 = class_752.method_4253();
      this.field_2516[var1] = var2;
      String[] var3 = var10000;
      if(var3 != null) {
         if(var2 != null) {
            label16: {
               add var4 = var2;
               if(var3 != null) {
                  if(var2.field_2958 <= this.method_90()) {
                     break label16;
                  }

                  var4 = var2;
               }

               var4.field_2958 = this.method_90();
            }
         }

         this.method_91();
      }

   }

   // $FF: renamed from: b (add) int
   public int method_3156(add var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(true) {
         if(var3 < this.field_2516.length) {
            class_589 var4 = this;
            if(var2 != null) {
               label22: {
                  if(this.field_2516[var3] != null) {
                     var4 = this;
                     if(var2 == null) {
                        break label22;
                     }

                     if(this.field_2516[var3].method_3730() != null) {
                        ++var3;
                        if(var2 != null) {
                           continue;
                        }

                        return -1;
                     }
                  }

                  var4 = this;
               }
            }

            var4.method_87(var3, var1);
            return var3;
         }

         return -1;
      }
   }

   // $FF: renamed from: i () java.lang.String
   public String method_88() {
      String[] var1 = class_752.method_4253();
      class_589 var10000 = this;
      String var2;
      if(var1 != null) {
         if(!this.method_89()) {
            String[] var3 = field_2519;
            var2 = "container.dispenser";
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.field_2518;
      return var2;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_3157(String var1) {
      this.field_2518 = var1;
   }

   // $FF: renamed from: j () boolean
   public boolean method_89() {
      return this.field_2518 != null;
   }

   // $FF: renamed from: b (ro) void
   public void getBlock92(class_1583 var1) {
      super.getBlock92(var1);
      String[] var7 = field_2519;
      class_1580 var3 = var1.method_8689("Items", 10);
      String[] var2 = class_752.method_4253();
      this.field_2516 = new add[this.method_83()];
      int var4 = 0;

      int var10000;
      while(true) {
         if(var4 < var3.method_8658()) {
            class_1583 var5 = var3.method_8653(var4);
            var7 = field_2519;
            int var6 = var5.initGui9("Slot") & 255;
            if(var2 != null) {
               var10000 = var6;
               if(var2 == null) {
                  break;
               }

               if(var6 >= 0 && var6 < this.field_2516.length) {
                  this.field_2516[var6] = add.method_3727(var5);
               }

               ++var4;
            }

            if(var2 != null) {
               continue;
            }
         }

         var7 = field_2519;
         var10000 = var1.initGui8("CustomName", 8);
         break;
      }

      if(var10000 != 0) {
         String[] var10002 = field_2519;
         this.field_2518 = var1.method_8685("CustomName");
      }

   }

   // $FF: renamed from: c (ro) void
   public void getBlock93(class_1583 var1) {
      super.getBlock93(var1);
      class_1580 var10000 = new class_1580;
      var10000.method_8628();
      class_1580 var3 = var10000;
      String[] var2 = class_752.method_4253();
      int var4 = 0;

      String var10001;
      class_1583 var8;
      label36: {
         class_589 var7;
         while(true) {
            String[] var6;
            if(var4 < this.field_2516.length) {
               var7 = this;
               if(var2 == null) {
                  break;
               }

               if(this.field_2516[var4] != null) {
                  var8 = new class_1583;
                  var8.method_8628();
                  class_1583 var5 = var8;
                  var6 = field_2519;
                  var5.method_8665("Slot", (byte)var4);
                  this.field_2516[var4].method_3737(var5);
                  var3.method_8650(var5);
               }

               ++var4;
               if(var2 != null) {
                  continue;
               }
            }

            var8 = var1;
            var6 = field_2519;
            var10001 = "Items";
            if(var2 == null) {
               break label36;
            }

            var1.method_8664("Items", var3);
            var7 = this;
            break;
         }

         if(!var7.method_89()) {
            return;
         }

         var8 = var1;
         String[] var9 = field_2519;
         var10001 = "CustomName";
      }

      var8.initGui1(var10001, this.field_2518);
   }

   // $FF: renamed from: k () int
   public int method_90() {
      return 64;
   }

   // $FF: renamed from: b (yz) boolean
   public boolean method_92(class_792 var1) {
      String[] var2 = class_752.method_4253();
      if(this.field_2464.method_31(this.field_2465, this.field_2466, this.field_2467) != this) {
         return false;
      } else {
         double var3;
         int var10000 = (var3 = var1.method_3889((double)this.field_2465 + 0.5D, (double)this.field_2466 + 0.5D, (double)this.field_2467 + 0.5D) - 64.0D) == 0.0D?0:(var3 < 0.0D?-1:1);
         if(var2 != null) {
            if(var10000 > 0) {
               return false;
            }

            var10000 = 1;
         }

         return (boolean)var10000;
      }
   }

   // $FF: renamed from: m () void
   public void method_93() {}

   // $FF: renamed from: n () void
   public void method_94() {}

   // $FF: renamed from: d (int, add) boolean
   public boolean method_95(int var1, add var2) {
      return true;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3108() {
      // $FF: Couldn't be decompiled
   }
}
