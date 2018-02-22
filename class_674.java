
// $FF: renamed from: Ax
public class class_674 extends class_671 {

   // $FF: renamed from: i gk
   private class_596 field_2888;
   // $FF: renamed from: l a3
   private final class_501 field_2889;
   // $FF: renamed from: m int
   private int field_2890;
   // $FF: renamed from: n int
   private int field_2891;
   // $FF: renamed from: o int
   private int field_2892;
   // $FF: renamed from: p java.lang.String
   private static final String field_2893 = "CL_00001735";


   // $FF: renamed from: <init> (Af, gk) void
   public void method_3685(class_666 var1, class_596 var2) {
      String[] var10000 = class_752.method_4253();
      super.method_3645();
      this.field_2888 = var2;
      class_501 var10003 = new class_501;
      var10003.method_2901(this, var2, 0, 136, 110);
      this.method_3646(this.field_2889 = var10003);
      byte var4 = 36;
      short var5 = 137;
      int var6 = 0;
      String[] var3 = var10000;

      class_492 var10001;
      byte var8;
      while(true) {
         if(var6 < 3) {
            var8 = 0;
            if(var3 == null) {
               break;
            }

            int var7 = 0;

            while(true) {
               if(var7 < 9) {
                  var10001 = new class_492;
                  var10001.method_2869(var1, var7 + var6 * 9 + 9, var4 + var7 * 18, var5 + var6 * 18);
                  this.method_3646(var10001);
                  ++var7;
                  if(var3 == null) {
                     break;
                  }

                  if(var3 != null) {
                     continue;
                  }
               }

               ++var6;
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         var8 = 0;
         break;
      }

      var6 = var8;

      while(true) {
         if(var6 < 9) {
            var10001 = new class_492;
            var10001.method_2869(var1, var6, var4 + var6 * 18, 58 + var5);
            this.method_3646(var10001);
            ++var6;
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         this.field_2890 = var2.method_3179();
         this.field_2891 = var2.method_3177();
         this.field_2892 = var2.method_3178();
         break;
      }

   }

   // $FF: renamed from: b (aN) void
   public void method_3647(class_16 var1) {
      super.method_3647(var1);
      var1.method_52(this, 0, this.field_2890);
      var1.method_52(this, 1, this.field_2891);
      var1.method_52(this, 2, this.field_2892);
   }

   // $FF: renamed from: a (int, int) void
   public void method_3662(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 == 0) {
            this.field_2888.method_3180(var2);
         }

         var10000 = var1;
      }

      byte var10001 = 1;
      if(var3 != null) {
         if(var10000 == 1) {
            this.field_2888.method_3181(var2);
         }

         var10000 = var1;
         var10001 = 2;
      }

      if(var10000 == var10001) {
         this.field_2888.method_3182(var2);
      }

   }

   // $FF: renamed from: a () gk
   public class_596 method_3686() {
      return this.field_2888;
   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3666(class_792 var1) {
      return this.field_2888.method_92(var1);
   }

   // $FF: renamed from: c (yz, int) add
   public add method_3654(class_792 var1, int var2) {
      String[] var10000 = class_752.method_4253();
      add var4 = null;
      class_492 var5 = (class_492)this.field_2869.get(var2);
      String[] var3 = var10000;
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
      label115: {
         label129: {
            var6 = var7.method_2875();
            var4 = var6.method_3754();
            var8 = var2;
            if(var3 != null) {
               if(var2 == 0) {
                  if(!this.method_3667(var6, 1, 37, true)) {
                     return null;
                  }

                  var5.method_2870(var6, var4);
                  if(var3 != null) {
                     break label129;
                  }
               }

               var8 = this.field_2889.method_2876();
            }

            byte var10001;
            label106: {
               if(var3 != null) {
                  label104: {
                     if(var8 == 0) {
                        var8 = this.field_2889.method_2874(var6);
                        if(var3 == null) {
                           break label104;
                        }

                        if(var8 != 0) {
                           var8 = var6.field_2958;
                           var10001 = 1;
                           if(var3 == null) {
                              break label106;
                           }

                           if(var6.field_2958 == 1) {
                              var8 = this.method_3667(var6, 0, 1, false);
                              if(var3 == null) {
                                 break label115;
                              }

                              if(var8 == 0) {
                                 return null;
                              }
                              break label129;
                           }
                        }
                     }

                     var8 = var2;
                  }
               }

               var10001 = 1;
            }

            label130: {
               if(var3 != null) {
                  label131: {
                     if(var8 >= var10001) {
                        var8 = var2;
                        var10001 = 28;
                        if(var3 == null) {
                           break label131;
                        }

                        if(var2 < 28) {
                           var8 = this.method_3667(var6, 28, 37, false);
                           if(var3 == null) {
                              break label115;
                           }

                           if(var8 == 0) {
                              return null;
                           }
                           break label129;
                        }
                     }

                     var8 = var2;
                     if(var3 == null) {
                        break label130;
                     }

                     var10001 = 28;
                  }
               }

               if(var8 >= var10001) {
                  var8 = var2;
                  if(var3 == null) {
                     break label130;
                  }

                  if(var2 < 37) {
                     var8 = this.method_3667(var6, 1, 28, false);
                     if(var3 == null) {
                        break label115;
                     }

                     if(var8 == 0) {
                        return null;
                     }
                     break label129;
                  }
               }

               var8 = this.method_3667(var6, 1, 37, false);
            }

            if(var3 == null) {
               break label115;
            }

            if(var8 == 0) {
               return null;
            }
         }

         var8 = var6.field_2958;
      }

      label64: {
         if(var8 == 0) {
            var5.method_2877((add)null);
            if(var3 != null) {
               break label64;
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

   // $FF: renamed from: <clinit> () void
   static void method_3678() {
      boolean var10000 = true;
      char[] var10003 = "r[ç/Ö  æâ".toCharArray();
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
            field_2893 = (new String((char[])var4)).intern();
            String var2 = field_2893;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 224;
            break;
         case 1:
            var10009 = 198;
            break;
         case 2:
            var10009 = 4;
            break;
         case 3:
            var10009 = 6;
            break;
         case 4:
            var10009 = 206;
            break;
         case 5:
            var10009 = 55;
            break;
         default:
            var10009 = 120;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
