
// $FF: renamed from: Ar
public class class_680 extends class_671 {

   // $FF: renamed from: i aO
   public class_897 field_2915;
   // $FF: renamed from: l vI
   public class_22 field_2916;
   // $FF: renamed from: m boolean
   public boolean field_2917;
   // $FF: renamed from: n yz
   private final class_792 field_2918;
   // $FF: renamed from: o java.lang.String
   private static final String field_2919 = "CL_00001754";


   // $FF: renamed from: <init> (Af, boolean, yz) void
   public void method_3700(class_666 var1, boolean var2, class_792 var3) {
      super.method_3645();
      String[] var10000 = class_752.method_4253();
      class_897 var10002 = new class_897;
      var10002.method_5202(this, 2, 2);
      this.field_2915 = var10002;
      class_899 var11 = new class_899;
      var11.method_5218();
      this.field_2916 = var11;
      this.field_2917 = var2;
      String[] var4 = var10000;
      this.field_2918 = var3;
      class_504 var10001 = new class_504;
      var10001.method_2908(var1.field_2848, this.field_2915, this.field_2916, 0, 144, 36);
      this.method_3646(var10001);
      int var5 = 0;

      int var6;
      byte var8;
      class_492 var9;
      while(true) {
         if(var5 < 2) {
            var8 = 0;
            if(var4 == null) {
               break;
            }

            var6 = 0;

            while(true) {
               if(var6 < 2) {
                  var9 = new class_492;
                  var9.method_2869(this.field_2915, var6 + var5 * 2, 88 + var6 * 18, 26 + var5 * 18);
                  this.method_3646(var9);
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

         var8 = 0;
         break;
      }

      var5 = var8;

      while(true) {
         if(var5 < 4) {
            class_494 var10 = new class_494;
            var10.method_2887(this, var1, var1.method_83() - 1 - var5, 8, 8 + var5 * 18, var5);
            this.method_3646(var10);
            ++var5;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var5 = 0;
         break;
      }

      while(true) {
         if(var5 < 3) {
            var8 = 0;
            if(var4 == null) {
               break;
            }

            var6 = 0;

            while(true) {
               if(var6 < 9) {
                  var9 = new class_492;
                  var9.method_2869(var1, var6 + (var5 + 1) * 9, 8 + var6 * 18, 84 + var5 * 18);
                  this.method_3646(var9);
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

         var8 = 0;
         break;
      }

      var5 = var8;

      while(true) {
         if(var5 < 9) {
            var9 = new class_492;
            var9.method_2869(var1, var5, 8 + var5 * 18, 142);
            this.method_3646(var9);
            ++var5;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         this.method_3659(this.field_2915);
         break;
      }

   }

   // $FF: renamed from: b (vI) void
   public void method_3659(class_22 var1) {
      this.field_2916.method_87(0, class_1031.method_5835().method_5839(this.field_2915, this.field_2918.field_2990));
   }

   // $FF: renamed from: a (yz) void
   public void method_3658(class_792 var1) {
      super.method_3658(var1);
      String[] var2 = class_752.method_4253();
      int var3 = 0;

      while(true) {
         if(var3 < 4) {
            add var4 = this.field_2915.method_86(var3);
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               if(var4 != null) {
                  var1.method_4570(var4, false);
               }

               ++var3;
            }

            if(var2 != null) {
               continue;
            }
         }

         this.field_2916.method_87(0, (add)null);
         break;
      }

   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3666(class_792 var1) {
      return true;
   }

   // $FF: renamed from: c (yz, int) add
   public add method_3654(class_792 var1, int var2) {
      add var4 = null;
      String[] var10000 = class_752.method_4253();
      class_492 var5 = (class_492)this.field_2869.get(var2);
      String[] var3 = var10000;
      class_492 var8 = var5;
      if(var3 != null) {
         if(var5 == null) {
            return var4;
         }

         var8 = var5;
      }

      if(var3 != null) {
         if(!var8.method_2876()) {
            return var4;
         }

         var8 = var5;
      }

      add var6;
      int var9;
      label148: {
         label162: {
            var6 = var8.method_2875();
            var4 = var6.method_3754();
            var9 = var2;
            if(var3 != null) {
               if(var2 == 0) {
                  if(!this.method_3667(var6, 9, 45, true)) {
                     return null;
                  }

                  var5.method_2870(var6, var4);
                  if(var3 != null) {
                     break label162;
                  }
               }

               var9 = var2;
            }

            byte var10001;
            label163: {
               var10001 = 1;
               if(var3 != null) {
                  label164: {
                     if(var9 >= 1) {
                        var9 = var2;
                        var10001 = 5;
                        if(var3 == null) {
                           break label164;
                        }

                        if(var2 < 5) {
                           var9 = this.method_3667(var6, 9, 45, false);
                           if(var3 == null) {
                              break label148;
                           }

                           if(var9 == 0) {
                              return null;
                           }
                           break label162;
                        }
                     }

                     var9 = var2;
                     if(var3 == null) {
                        break label163;
                     }

                     var10001 = 5;
                  }
               }

               if(var9 >= var10001) {
                  var9 = var2;
                  if(var3 == null) {
                     break label163;
                  }

                  if(var2 < 9) {
                     var9 = this.method_3667(var6, 9, 45, false);
                     if(var3 == null) {
                        break label148;
                     }

                     if(var9 == 0) {
                        return null;
                     }
                     break label162;
                  }
               }

               var9 = var4.method_3730() instanceof class_525;
            }

            if(var3 != null) {
               label119: {
                  if(var9 != 0) {
                     var9 = ((class_492)this.field_2869.get(5 + ((class_525)var4.method_3730()).field_2365)).method_2876();
                     if(var3 == null) {
                        break label119;
                     }

                     if(var9 == 0) {
                        int var7 = 5 + ((class_525)var4.method_3730()).field_2365;
                        if(!this.method_3667(var6, var7, var7 + 1, false)) {
                           return null;
                        }

                        if(var3 != null) {
                           break label162;
                        }
                     }
                  }

                  var9 = var2;
               }
            }

            label165: {
               var10001 = 9;
               if(var3 != null) {
                  label166: {
                     if(var9 >= 9) {
                        var9 = var2;
                        var10001 = 36;
                        if(var3 == null) {
                           break label166;
                        }

                        if(var2 < 36) {
                           var9 = this.method_3667(var6, 36, 45, false);
                           if(var3 == null) {
                              break label148;
                           }

                           if(var9 == 0) {
                              return null;
                           }
                           break label162;
                        }
                     }

                     var9 = var2;
                     if(var3 == null) {
                        break label165;
                     }

                     var10001 = 36;
                  }
               }

               if(var9 >= var10001) {
                  var9 = var2;
                  if(var3 == null) {
                     break label165;
                  }

                  if(var2 < 45) {
                     var9 = this.method_3667(var6, 9, 36, false);
                     if(var3 == null) {
                        break label148;
                     }

                     if(var9 == 0) {
                        return null;
                     }
                     break label162;
                  }
               }

               var9 = this.method_3667(var6, 9, 45, false);
            }

            if(var3 == null) {
               break label148;
            }

            if(var9 == 0) {
               return null;
            }
         }

         var9 = var6.field_2958;
      }

      label79: {
         if(var9 == 0) {
            var5.method_2877((add)null);
            if(var3 != null) {
               break label79;
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
      if(var2.field_2286 != this.field_2916) {
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

   // $FF: renamed from: <clinit> () void
   static void method_3678() {
      boolean var10000 = true;
      char[] var10003 = "úõ~¼Õú¸".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_2919 = (new String((char[])var4)).intern();
            String var2 = field_2919;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 190;
            break;
         case 1:
            var10009 = 190;
            break;
         case 2:
            var10009 = 38;
            break;
         case 3:
            var10009 = 139;
            break;
         case 4:
            var10009 = 181;
            break;
         case 5:
            var10009 = 226;
            break;
         default:
            var10009 = 205;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
