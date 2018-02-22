
// $FF: renamed from: wP
public class class_773 extends class_769 {

   // $FF: renamed from: bG java.lang.String
   private static final String field_3530;
   // $FF: renamed from: ib java.lang.String[]
   private static final String[] field_3531;


   // $FF: renamed from: <init> (ahb) void
   public void method_3847(ahb var1) {
      super.method_3847(var1);
      this.method_3852(0.9F, 1.3F);
      this.method_4257().method_9784(true);
      class_1776 var10000 = this.field_3373;
      class_1734 var10002 = new class_1734;
      var10002.method_9665(this);
      var10000.method_9766(0, var10002);
      var10000 = this.field_3373;
      class_1756 var2 = new class_1756;
      var2.method_9710(this, 2.0D);
      var10000.method_9766(1, var2);
      var10000 = this.field_3373;
      class_1741 var3 = new class_1741;
      var3.method_9681(this, 1.0D);
      var10000.method_9766(2, var3);
      var10000 = this.field_3373;
      class_1745 var4 = new class_1745;
      var4.method_9691(this, 1.25D, class_1010.field_5154, false);
      var10000.method_9766(3, var4);
      var10000 = this.field_3373;
      class_1732 var5 = new class_1732;
      var5.method_9662(this, 1.25D);
      var10000.method_9766(4, var5);
      var10000 = this.field_3373;
      class_1753 var6 = new class_1753;
      var6.method_9705(this, 1.0D);
      var10000.method_9766(5, var6);
      var10000 = this.field_3373;
      class_1728 var7 = new class_1728;
      var7.method_9657(this, class_792.class, 6.0F);
      var10000.method_9766(6, var7);
      var10000 = this.field_3373;
      class_1754 var8 = new class_1754;
      var8.method_9706(this);
      var10000.method_9766(7, var8);
   }

   // $FF: renamed from: bk () boolean
   public boolean method_4225() {
      return true;
   }

   // $FF: renamed from: aD () void
   protected void method_4157() {
      super.method_4157();
      this.method_4211(class_1840.field_9390).method_390(10.0D);
      this.method_4211(class_1840.field_9393).method_390(0.20000000298023224D);
   }

   // $FF: renamed from: t () java.lang.String
   protected String method_4266() {
      String[] var10000 = field_3531;
      return "mob.cow.say";
   }

   // $FF: renamed from: aT () java.lang.String
   protected String method_4193() {
      String[] var10000 = field_3531;
      return "mob.cow.hurt";
   }

   // $FF: renamed from: aU () java.lang.String
   protected String method_4194() {
      String[] var10000 = field_3531;
      return "mob.cow.hurt";
   }

   // $FF: renamed from: a (int, int, int, aji) void
   protected void method_3867(int var1, int var2, int var3, aji var4) {
      String[] var10001 = field_3531;
      this.method_3868("mob.cow.step", 0.15F, 1.0F);
   }

   // $FF: renamed from: bf () float
   protected float method_4216() {
      return 0.4F;
   }

   // $FF: renamed from: u () adb
   protected adb method_4267() {
      return class_1010.field_5192;
   }

   // $FF: renamed from: b (boolean, int) void
   protected void method_4196(boolean var1, int var2) {
      int var4 = this.field_3028.nextInt(3) + this.field_3028.nextInt(1 + var2);
      String[] var3 = class_752.method_4253();
      int var5 = 0;

      while(true) {
         if(var5 < var4) {
            this.method_3914(class_1010.field_5192, 1);
            ++var5;
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         var4 = this.field_3028.nextInt(3) + 1 + this.field_3028.nextInt(1 + var2);
         break;
      }

      var5 = 0;

      while(var5 < var4) {
         label26: {
            class_773 var10000 = this;
            if(var3 != null) {
               if(this.method_3936()) {
                  this.method_3914(class_1010.field_5221, 1);
                  if(var3 != null) {
                     break label26;
                  }
               }

               var10000 = this;
            }

            var10000.method_3914(class_1010.field_5220, 1);
         }

         ++var5;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (yz) boolean
   public boolean method_4295(class_792 var1) {
      boolean var6;
      label89: {
         String[] var10000 = class_752.method_4253();
         add var3 = var1.field_3616.method_3593();
         String[] var2 = var10000;
         add var4 = var3;
         if(var2 != null) {
            if(var3 == null) {
               break label89;
            }

            var4 = var3;
         }

         adb var5;
         adb var10001;
         label80: {
            var5 = var4.method_3730();
            var10001 = class_1010.field_5183;
            if(var2 != null) {
               if(var5 == class_1010.field_5183) {
                  break label80;
               }

               var5 = var3.method_3730();
               var10001 = class_1010.field_5231;
            }

            if(var5 != var10001) {
               break label89;
            }
         }

         var6 = var1.field_3640.field_2839;
         if(var2 == null) {
            return var6;
         }

         if(!var1.field_3640.field_2839) {
            int var10;
            label90: {
               int var8;
               add var9;
               class_666 var11;
               add var10002;
               label91: {
                  var5 = var3.method_3730();
                  var10001 = class_1010.field_5183;
                  if(var2 != null) {
                     if(var5 == class_1010.field_5183) {
                        var10 = var3.field_2958--;
                        if(var2 != null) {
                           if(var10 == 1) {
                              var11 = var1.field_3616;
                              var8 = var1.field_3616.field_2846;
                              var10002 = new add;
                              var10002.method_3724(class_1010.field_5193);
                              var11.method_87(var8, var10002);
                              if(var2 != null) {
                                 break label90;
                              }
                           }

                           var11 = var1.field_3616;
                           var9 = new add;
                           var9.method_3724(class_1010.field_5193);
                           var10 = var11.method_3607(var9);
                        }

                        if(var2 == null) {
                           return (boolean)var10;
                        }

                        if(var10 != 0) {
                           break label90;
                        }

                        var9 = new add;
                        var9.method_3726(class_1010.field_5193, 1, 0);
                        var1.method_4570(var9, false);
                        if(var2 != null) {
                           break label90;
                        }
                     }

                     var4 = var3;
                     if(var2 == null) {
                        break label91;
                     }

                     var5 = var3.method_3730();
                     var10001 = class_1010.field_5231;
                  }

                  if(var5 != var10001) {
                     break label90;
                  }

                  var4 = var3;
               }

               var10 = var4.field_2958--;
               if(var2 != null) {
                  if(var10 == 1) {
                     var11 = var1.field_3616;
                     var8 = var1.field_3616.field_2846;
                     var10002 = new add;
                     var10002.method_3724(class_1010.field_5344);
                     var11.method_87(var8, var10002);
                     if(var2 != null) {
                        break label90;
                     }
                  }

                  var11 = var1.field_3616;
                  var9 = new add;
                  var9.method_3724(class_1010.field_5344);
                  var10 = var11.method_3607(var9);
               }

               if(var2 == null) {
                  return (boolean)var10;
               }

               if(var10 == 0) {
                  var9 = new add;
                  var9.method_3726(class_1010.field_5344, 1, 0);
                  var1.method_4570(var9, false);
               }
            }

            var10 = 1;
            return (boolean)var10;
         }
      }

      var6 = super.method_4295(var1);
      return var6;
   }

   // $FF: renamed from: a (wJ) wP
   public class_773 method_4470(class_767 var1) {
      class_773 var10000 = new class_773;
      var10000.method_3847(this.field_2990);
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_4384() {
      // $FF: Couldn't be decompiled
   }
}
