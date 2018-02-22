
// $FF: renamed from: a0
public class class_504 extends class_492 {

   // $FF: renamed from: g vI
   private final class_22 field_2321;
   // $FF: renamed from: h yz
   private class_792 field_2322;
   // $FF: renamed from: i int
   private int field_2323;


   // $FF: renamed from: <init> (yz, vI, vI, int, int, int) void
   public void method_2908(class_792 var1, class_22 var2, class_22 var3, int var4, int var5, int var6) {
      super.method_2869(var3, var4, var5, var6);
      this.field_2322 = var1;
      this.field_2321 = var2;
   }

   // $FF: renamed from: b (add) boolean
   public boolean method_2874(add var1) {
      return false;
   }

   // $FF: renamed from: b (int) add
   public add method_2881(int var1) {
      String[] var2 = class_752.method_4253();
      class_504 var10000 = this;
      if(var2 != null) {
         if(this.method_2876()) {
            this.field_2323 += Math.min(var1, this.method_2875().field_2958);
         }

         var10000 = this;
      }

      return var10000.method_2881(var1);
   }

   // $FF: renamed from: b (add, int) void
   protected void method_2871(add var1, int var2) {
      this.field_2323 += var2;
      this.method_2872(var1);
   }

   // $FF: renamed from: a (add) void
   protected void method_2872(add var1) {
      String[] var10000 = class_752.method_4253();
      var1.method_3762(this.field_2322.field_2990, this.field_2322, this.field_2323);
      String[] var2 = var10000;
      this.field_2323 = 0;
      adb var4 = var1.method_3730();
      if(var2 != null) {
         if(var4 == adb.method_2920(class_1192.field_6085)) {
            this.field_2322.method_4615(class_1600.field_8332, 1);
         }

         var4 = var1.method_3730();
      }

      if(var2 != null) {
         if(var4 instanceof class_541) {
            this.field_2322.method_4615(class_1600.field_8333, 1);
         }

         var4 = var1.method_3730();
      }

      if(var2 != null) {
         if(var4 == adb.method_2920(class_1192.field_6088)) {
            this.field_2322.method_4615(class_1600.field_8334, 1);
         }

         var4 = var1.method_3730();
      }

      if(var2 != null) {
         if(var4 instanceof class_555) {
            this.field_2322.method_4615(class_1600.field_8336, 1);
         }

         var4 = var1.method_3730();
      }

      adb var10001;
      label94: {
         var10001 = class_1010.field_5155;
         if(var2 != null) {
            if(var4 == class_1010.field_5155) {
               this.field_2322.method_4615(class_1600.field_8337, 1);
            }

            var4 = var1.method_3730();
            if(var2 == null) {
               break label94;
            }

            var10001 = class_1010.field_5211;
         }

         if(var4 == var10001) {
            this.field_2322.method_4615(class_1600.field_8338, 1);
         }

         var4 = var1.method_3730();
      }

      Object var3;
      label96: {
         boolean var5 = var4 instanceof class_541;
         if(var2 != null) {
            label72: {
               if(var5) {
                  var3 = (class_541)var1.method_3730();
                  if(var2 == null) {
                     break label72;
                  }

                  if(((class_541)var3).getBlock13() != class_133.field_336) {
                     this.field_2322.method_4615(class_1600.field_8339, 1);
                  }
               }

               var3 = var1.method_3730();
            }

            if(var2 == null) {
               break label96;
            }

            var5 = var3 instanceof class_511;
         }

         if(var5) {
            this.field_2322.method_4615(class_1600.field_8342, 1);
         }

         var3 = var1.method_3730();
      }

      var10001 = adb.method_2920(class_1192.field_6141);
      if(var2 != null) {
         if(var3 == var10001) {
            this.field_2322.method_4615(class_1600.field_8355, 1);
         }

         var3 = var1.method_3730();
         var10001 = adb.method_2920(class_1192.field_6074);
      }

      if(var3 == var10001) {
         this.field_2322.method_4615(class_1600.field_8357, 1);
      }

   }

   // $FF: renamed from: b (yz, add) void
   public void method_2873(class_792 var1, add var2) {
      String[] var10000 = class_752.method_4253();
      this.method_2872(var2);
      int var4 = 0;
      String[] var3 = var10000;

      while(var4 < this.field_2321.method_83()) {
         add var5 = this.field_2321.method_84(var4);
         if(var3 != null) {
            label51: {
               if(var5 != null) {
                  this.field_2321.method_85(var4, 1);
                  if(var3 == null) {
                     break label51;
                  }

                  if(var5.method_3730().method_2952()) {
                     label45: {
                        add var6;
                        class_504 var9;
                        label60: {
                           add var7 = new add;
                           var7.method_3724(var5.method_3730().method_2951());
                           var6 = var7;
                           var7 = var5;
                           if(var3 != null) {
                              Object var8;
                              label61: {
                                 if(var5.method_3730().method_2949(var5)) {
                                    var8 = this.field_2322.field_3616;
                                    if(var3 == null) {
                                       break label61;
                                    }

                                    if(this.field_2322.field_3616.method_3607(var6) && var3 != null) {
                                       break label45;
                                    }
                                 }

                                 var9 = this;
                                 if(var3 == null) {
                                    break label60;
                                 }

                                 var8 = this.field_2321;
                              }

                              var7 = ((class_22)var8).method_84(var4);
                           }

                           if(var7 == null) {
                              this.field_2321.method_87(var4, var6);
                              if(var3 != null) {
                                 break label45;
                              }
                           }

                           var9 = this;
                        }

                        var9.field_2322.method_4570(var6, false);
                     }
                  }
               }

               ++var4;
            }
         }

         if(var3 == null) {
            break;
         }
      }

   }
}
