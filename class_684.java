
// $FF: renamed from: An
public class class_684 extends class_671 {

   // $FF: renamed from: i aO
   public class_897 field_2934;
   // $FF: renamed from: l vI
   public class_22 field_2935;
   // $FF: renamed from: m ahb
   private ahb field_2936;
   // $FF: renamed from: n int
   private int field_2937;
   // $FF: renamed from: o int
   private int field_2938;
   // $FF: renamed from: p int
   private int field_2939;


   // $FF: renamed from: <init> (Af, ahb, int, int, int) void
   public void method_3704(class_666 var1, ahb var2, int var3, int var4, int var5) {
      super.method_3645();
      class_897 var10001 = new class_897;
      var10001.method_5202(this, 3, 3);
      this.field_2934 = var10001;
      class_899 var10 = new class_899;
      var10.method_5218();
      this.field_2935 = var10;
      String[] var10000 = class_752.method_4253();
      this.field_2936 = var2;
      String[] var6 = var10000;
      this.field_2937 = var3;
      this.field_2938 = var4;
      this.field_2939 = var5;
      class_504 var11 = new class_504;
      var11.method_2908(var1.field_2848, this.field_2934, this.field_2935, 0, 124, 35);
      this.method_3646(var11);
      int var7 = 0;

      int var8;
      byte var9;
      class_492 var12;
      while(true) {
         if(var7 < 3) {
            var9 = 0;
            if(var6 == null) {
               break;
            }

            var8 = 0;

            while(true) {
               if(var8 < 3) {
                  var12 = new class_492;
                  var12.method_2869(this.field_2934, var8 + var7 * 3, 30 + var8 * 18, 17 + var7 * 18);
                  this.method_3646(var12);
                  ++var8;
                  if(var6 == null) {
                     break;
                  }

                  if(var6 != null) {
                     continue;
                  }
               }

               ++var7;
               break;
            }

            if(var6 != null) {
               continue;
            }
         }

         var9 = 0;
         break;
      }

      var7 = var9;

      while(true) {
         if(var7 < 3) {
            var9 = 0;
            if(var6 == null) {
               break;
            }

            var8 = 0;

            while(true) {
               if(var8 < 9) {
                  var12 = new class_492;
                  var12.method_2869(var1, var8 + var7 * 9 + 9, 8 + var8 * 18, 84 + var7 * 18);
                  this.method_3646(var12);
                  ++var8;
                  if(var6 == null) {
                     break;
                  }

                  if(var6 != null) {
                     continue;
                  }
               }

               ++var7;
               break;
            }

            if(var6 != null) {
               continue;
            }
         }

         var9 = 0;
         break;
      }

      var7 = var9;

      while(true) {
         if(var7 < 9) {
            var12 = new class_492;
            var12.method_2869(var1, var7, 8 + var7 * 18, 142);
            this.method_3646(var12);
            ++var7;
            if(var6 == null) {
               break;
            }

            if(var6 != null) {
               continue;
            }
         }

         this.method_3659(this.field_2934);
         break;
      }

   }

   // $FF: renamed from: b (vI) void
   public void method_3659(class_22 var1) {
      this.field_2935.method_87(0, class_1031.method_5835().method_5839(this.field_2934, this.field_2936));
   }

   // $FF: renamed from: a (yz) void
   public void method_3658(class_792 var1) {
      super.method_3658(var1);
      String[] var2 = class_752.method_4253();
      byte var10000 = this.field_2936.field_1832;
      if(var2 != null) {
         if(this.field_2936.field_1832) {
            return;
         }

         var10000 = 0;
      }

      int var3 = var10000;

      while(var3 < 9) {
         add var4 = this.field_2934.method_86(var3);
         if(var2 != null) {
            if(var4 != null) {
               var1.method_4570(var4, false);
            }

            ++var3;
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3666(class_792 var1) {
      String[] var2 = class_752.method_4253();
      if(this.field_2936.getBlock(this.field_2937, this.field_2938, this.field_2939) != class_1192.field_6085) {
         return false;
      } else {
         double var3;
         int var10000 = (var3 = var1.method_3889((double)this.field_2937 + 0.5D, (double)this.field_2938 + 0.5D, (double)this.field_2939 + 0.5D) - 64.0D) == 0.0D?0:(var3 < 0.0D?-1:1);
         if(var2 != null) {
            if(var10000 > 0) {
               return false;
            }

            var10000 = 1;
         }

         return (boolean)var10000;
      }
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
      label87: {
         label101: {
            var6 = var7.method_2875();
            var4 = var6.method_3754();
            var8 = var2;
            if(var3 != null) {
               if(var2 == 0) {
                  if(!this.method_3667(var6, 10, 46, true)) {
                     return null;
                  }

                  var5.method_2870(var6, var4);
                  if(var3 != null) {
                     break label101;
                  }
               }

               var8 = var2;
            }

            label102: {
               byte var10001 = 10;
               if(var3 != null) {
                  label103: {
                     if(var8 >= 10) {
                        var8 = var2;
                        var10001 = 37;
                        if(var3 == null) {
                           break label103;
                        }

                        if(var2 < 37) {
                           var8 = this.method_3667(var6, 37, 46, false);
                           if(var3 == null) {
                              break label87;
                           }

                           if(var8 == 0) {
                              return null;
                           }
                           break label101;
                        }
                     }

                     var8 = var2;
                     if(var3 == null) {
                        break label102;
                     }

                     var10001 = 37;
                  }
               }

               if(var8 >= var10001) {
                  var8 = var2;
                  if(var3 == null) {
                     break label102;
                  }

                  if(var2 < 46) {
                     var8 = this.method_3667(var6, 10, 37, false);
                     if(var3 == null) {
                        break label87;
                     }

                     if(var8 == 0) {
                        return null;
                     }
                     break label101;
                  }
               }

               var8 = this.method_3667(var6, 10, 46, false);
            }

            if(var3 == null) {
               break label87;
            }

            if(var8 == 0) {
               return null;
            }
         }

         var8 = var6.field_2958;
      }

      label52: {
         if(var8 == 0) {
            var5.method_2877((add)null);
            if(var3 != null) {
               break label52;
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

   // $FF: renamed from: b (add, aR) boolean
   public boolean method_3656(add var1, class_492 var2) {
      String[] var3 = class_752.method_4253();
      boolean var10000;
      if(var2.field_2286 != this.field_2935) {
         var10000 = super.method_3656(var1, var2);
         if(var3 == null) {
            return var10000;
         }

         if(var10000) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }
}
