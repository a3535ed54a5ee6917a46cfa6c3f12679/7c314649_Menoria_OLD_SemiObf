
// $FF: renamed from: As
public class class_679 extends class_671 {

   // $FF: renamed from: i c5
   private class_18 field_2912;
   // $FF: renamed from: l aP
   private class_898 field_2913;
   // $FF: renamed from: m ahb
   private final ahb field_2914;


   // $FF: renamed from: <init> (Af, c5, ahb) void
   public void method_3697(class_666 var1, class_18 var2, ahb var3) {
      String[] var10000 = class_752.method_4253();
      super.method_3645();
      String[] var4 = var10000;
      this.field_2912 = var2;
      this.field_2914 = var3;
      class_898 var10001 = new class_898;
      var10001.method_5205(var1.field_2848, var2);
      this.field_2913 = var10001;
      class_492 var8 = new class_492;
      var8.method_2869(this.field_2913, 0, 36, 53);
      this.method_3646(var8);
      var8 = new class_492;
      var8.method_2869(this.field_2913, 1, 62, 53);
      this.method_3646(var8);
      class_493 var9 = new class_493;
      var9.method_2885(var1.field_2848, var2, this.field_2913, 2, 120, 53);
      this.method_3646(var9);
      int var5 = 0;

      byte var7;
      while(true) {
         if(var5 < 3) {
            var7 = 0;
            if(var4 == null) {
               break;
            }

            int var6 = 0;

            while(true) {
               if(var6 < 9) {
                  var8 = new class_492;
                  var8.method_2869(var1, var6 + var5 * 9 + 9, 8 + var6 * 18, 84 + var5 * 18);
                  this.method_3646(var8);
                  ++var6;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               ++var5;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var7 = 0;
         break;
      }

      var5 = var7;

      while(var5 < 9) {
         var8 = new class_492;
         var8.method_2869(var1, var5, 8 + var5 * 18, 142);
         this.method_3646(var8);
         ++var5;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a () aP
   public class_898 method_3698() {
      return this.field_2913;
   }

   // $FF: renamed from: b (aN) void
   public void method_3647(class_16 var1) {
      super.method_3647(var1);
   }

   // $FF: renamed from: c () void
   public void method_3650() {
      super.method_3650();
   }

   // $FF: renamed from: b (vI) void
   public void method_3659(class_22 var1) {
      this.field_2913.method_5207();
      super.method_3659(var1);
   }

   // $FF: renamed from: a (int) void
   public void method_3699(int var1) {
      this.field_2913.method_5209(var1);
   }

   // $FF: renamed from: a (int, int) void
   public void method_3662(int var1, int var2) {}

   // $FF: renamed from: c (yz) boolean
   public boolean method_3666(class_792 var1) {
      return this.field_2912.method_55() == var1;
   }

   // $FF: renamed from: c (yz, int) add
   public add method_3654(class_792 var1, int var2) {
      String[] var10000 = class_752.method_4253();
      add var4 = null;
      String[] var3 = var10000;
      class_492 var5 = (class_492)this.field_2869.get(var2);
      class_492 var7 = var5;
      if(var3 != null) {
         if(var5 == null) {
            return var4;
         }

         var7 = var5;
      }

      if(var3 != null) {
         if(!var7.method_2876()) {
            return var4;
         }

         var7 = var5;
      }

      add var6;
      int var8;
      label98: {
         label112: {
            var6 = var7.method_2875();
            var4 = var6.method_3754();
            var8 = var2;
            if(var3 != null) {
               if(var2 == 2) {
                  if(!this.method_3667(var6, 3, 39, true)) {
                     return null;
                  }

                  var5.method_2870(var6, var4);
                  if(var3 != null) {
                     break label112;
                  }
               }

               var8 = var2;
            }

            if(var3 != null) {
               if(var8 != 0) {
                  label113: {
                     var8 = var2;
                     byte var10001 = 1;
                     if(var3 != null) {
                        if(var2 == 1) {
                           break label113;
                        }

                        var8 = var2;
                        var10001 = 3;
                     }

                     if(var3 != null) {
                        label114: {
                           if(var8 >= var10001) {
                              var8 = var2;
                              var10001 = 30;
                              if(var3 == null) {
                                 break label114;
                              }

                              if(var2 < 30) {
                                 var8 = this.method_3667(var6, 30, 39, false);
                                 if(var3 == null) {
                                    break label98;
                                 }

                                 if(var8 == 0) {
                                    return null;
                                 }
                                 break label112;
                              }
                           }

                           var8 = var2;
                           if(var3 == null) {
                              break label98;
                           }

                           var10001 = 30;
                        }
                     }

                     if(var8 >= var10001) {
                        var8 = var2;
                        if(var3 == null) {
                           break label98;
                        }

                        if(var2 < 39) {
                           var8 = this.method_3667(var6, 3, 30, false);
                           if(var3 == null) {
                              break label98;
                           }

                           if(var8 == 0) {
                              return null;
                           }
                        }
                     }
                     break label112;
                  }
               }

               var8 = this.method_3667(var6, 3, 39, false);
            }

            if(var3 == null) {
               break label98;
            }

            if(var8 == 0) {
               return null;
            }
         }

         var8 = var6.field_2958;
      }

      label57: {
         if(var8 == 0) {
            var5.method_2877((add)null);
            if(var3 != null) {
               break label57;
            }
         }

         var5.method_2878();
      }

      if(var6.field_2958 == var4.field_2958) {
         return null;
      } else {
         var5.method_2873(var1, var6);
         return var4;
      }
   }

   // $FF: renamed from: a (yz) void
   public void method_3658(class_792 var1) {
      super.method_3658(var1);
      String[] var10000 = class_752.method_4253();
      this.field_2912.method_54((class_792)null);
      String[] var2 = var10000;
      super.method_3658(var1);
      class_679 var4 = this;
      if(var2 != null) {
         if(this.field_2914.field_1832) {
            return;
         }

         var4 = this;
      }

      add var3 = var4.field_2913.method_86(0);
      add var5 = var3;
      if(var2 != null) {
         if(var3 != null) {
            var1.method_4570(var3, false);
         }

         var3 = this.field_2913.method_86(1);
         var5 = var3;
      }

      if(var5 != null) {
         var1.method_4570(var3, false);
      }

   }
}
