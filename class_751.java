import java.util.Map;

// $FF: renamed from: st
public class class_751 extends class_748 {

   // $FF: renamed from: e float
   private float field_3303;
   // $FF: renamed from: eb java.lang.String[]
   private static final String[] field_3304;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.field_3303 = 1.0F;
   }

   // $FF: renamed from: <init> (ahb, int, int, int, int) void
   public void method_4139(ahb var1, int var2, int var3, int var4, int var5) {
      super.method_4139(var1, var2, var3, var4, var5);
      this.field_3303 = 1.0F;
      this.method_4140(var5);
   }

   // $FF: renamed from: c () void
   protected void method_3848() {
      this.method_3849().method_9498(2, 5);
      this.method_3849().method_9497(3, Byte.valueOf((byte)0));
   }

   // $FF: renamed from: a (vX, float) boolean
   public boolean method_3896(class_1691 var1, float var2) {
      String[] var3 = class_752.method_4253();
      class_751 var10000 = this;
      if(var3 != null) {
         if(this.method_3961()) {
            return false;
         }

         var10000 = this;
      }

      if(var3 != null) {
         if(var10000.method_4153() != null) {
            boolean var4 = this.field_2990.field_1832;
            if(var3 != null) {
               if(!this.field_2990.field_1832) {
                  this.method_4151(var1.method_9345(), false);
                  this.method_4154((add)null);
               }

               var4 = true;
            }

            return var4;
         }

         var10000 = this;
      }

      return var10000.method_3896(var1, var2);
   }

   // $FF: renamed from: f () int
   public int method_4143() {
      return 9;
   }

   // $FF: renamed from: i () int
   public int method_4144() {
      return 9;
   }

   // $FF: renamed from: a (double) boolean
   public boolean method_3901(double var1) {
      String[] var10000 = class_752.method_4253();
      double var4 = 16.0D;
      var4 *= 64.0D * this.field_2985;
      String[] var3 = var10000;
      double var7;
      int var6 = (var7 = var1 - var4 * var4) == 0.0D?0:(var7 < 0.0D?-1:1);
      if(var3 != null) {
         var6 = var6 < 0?1:0;
      }

      return (boolean)var6;
   }

   // $FF: renamed from: b (sa) void
   public void method_4145(class_689 var1) {
      this.method_4151(var1, true);
   }

   // $FF: renamed from: b (sa, boolean) void
   public void method_4151(class_689 var1, boolean var2) {
      String[] var10000 = class_752.method_4253();
      add var4 = this.method_4153();
      String[] var3 = var10000;
      boolean var6 = var1 instanceof class_792;
      if(var3 != null) {
         label32: {
            if(var6) {
               class_792 var5 = (class_792)var1;
               var6 = var5.field_3640.field_2839;
               if(var3 == null) {
                  break label32;
               }

               if(var5.field_3640.field_2839) {
                  this.method_4152(var4);
                  return;
               }
            }

            var6 = var2;
         }
      }

      if(var6) {
         add var10001 = new add;
         var10001.method_3724(class_1010.field_5245);
         this.method_3916(var10001, 0.0F);
      }

      if(var4 != null) {
         class_751 var7 = this;
         if(var3 != null) {
            if(this.field_3028.nextFloat() >= this.field_3303) {
               return;
            }

            var4 = var4.method_3754();
            this.method_4152(var4);
            var7 = this;
         }

         var7.method_3916(var4, 0.0F);
      }

   }

   // $FF: renamed from: b (add) void
   private void method_4152(add var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = var1;
      if(var2 != null) {
         if(var1 == null) {
            return;
         }

         var10000 = var1;
      }

      if(var2 != null) {
         if(var10000.method_3730() == class_1010.field_5215) {
            class_1296 var3 = ((class_544)var1.method_3730()).getBlock20(var1, this.field_2990);
            Map var4 = var3.field_6658;
            StringBuilder var10001 = new StringBuilder();
            String[] var10002 = field_3304;
            var4.remove(var10001.append("frame-").append(this.method_3845()).toString());
         }

         var10000 = var1;
      }

      var10000.method_3783((class_751)null);
   }

   // $FF: renamed from: j () add
   public add method_4153() {
      return this.method_3849().method_9504(2);
   }

   // $FF: renamed from: a (add) void
   public void method_4154(add var1) {
      label13: {
         String[] var2 = class_752.method_4253();
         add var10000 = var1;
         if(var2 != null) {
            if(var1 == null) {
               break label13;
            }

            var1 = var1.method_3754();
            var1.field_2958 = 1;
            var10000 = var1;
         }

         var10000.method_3783(this);
      }

      this.method_3849().method_9506(2, var1);
      this.method_3849().method_9507(2);
   }

   // $FF: renamed from: k () int
   public int method_4155() {
      return this.method_3849().method_9499(3);
   }

   // $FF: renamed from: c (int) void
   public void method_4156(int var1) {
      this.method_3849().method_9506(3, Byte.valueOf((byte)(var1 % 4)));
   }

   // $FF: renamed from: b (ro) void
   public void method_3909(class_1583 var1) {
      String[] var2 = class_752.method_4253();
      class_751 var10000 = this;
      if(var2 != null) {
         if(this.method_4153() != null) {
            String[] var3 = field_3304;
            add var10002 = this.method_4153();
            class_1583 var10003 = new class_1583;
            var10003.method_8628();
            var1.method_8664("Item", var10002.method_3737(var10003));
            var1.method_8665("ItemRotation", (byte)this.method_4155());
            var1.method_8669("ItemDropChance", this.field_3303);
         }

         var10000 = this;
      }

      var10000.method_3909(var1);
   }

   // $FF: renamed from: a (ro) void
   public void method_3908(class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      String[] var4 = field_3304;
      class_1583 var3 = var1.method_8688("Item");
      String[] var2 = var10000;
      if(var2 != null) {
         if(var3 != null) {
            label22: {
               boolean var5 = var3.method_8692();
               if(var2 != null) {
                  if(var5) {
                     break label22;
                  }

                  this.method_4154(add.method_3727(var3));
                  this.method_4156(var1.initGui9("ItemRotation"));
                  if(var2 == null) {
                     return;
                  }

                  var5 = var1.initGui8("ItemDropChance", 99);
               }

               if(var5) {
                  String[] var10002 = field_3304;
                  this.field_3303 = var1.method_8683("ItemDropChance");
               }
            }
         }

         super.method_3908(var1);
      }

   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3919(class_792 var1) {
      boolean var5;
      label47: {
         String[] var2 = class_752.method_4253();
         class_751 var10000 = this;
         if(var2 != null) {
            if(this.method_4153() == null) {
               add var3 = var1.method_4214();
               if(var3 != null) {
                  label48: {
                     int var4 = this.field_2990.field_1832;
                     if(var2 != null) {
                        if(this.field_2990.field_1832) {
                           break label48;
                        }

                        this.method_4154(var3);
                        var4 = var1.field_3640.field_2839;
                     }

                     if(var2 != null) {
                        if(var4 != 0) {
                           break label48;
                        }

                        var4 = --var3.field_2958;
                     }

                     if(var4 <= 0) {
                        var1.field_3616.method_87(var1.field_3616.field_2846, (add)null);
                     }
                  }
               }

               if(var2 != null) {
                  break label47;
               }
            }

            var10000 = this;
         }

         var5 = var10000.field_2990.field_1832;
         if(var2 == null) {
            return var5;
         }

         if(!var10000.field_2990.field_1832) {
            this.method_4156(this.method_4155() + 1);
         }
      }

      var5 = true;
      return var5;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4146() {
      // $FF: Couldn't be decompiled
   }
}
