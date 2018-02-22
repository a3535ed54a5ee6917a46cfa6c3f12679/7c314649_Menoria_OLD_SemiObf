
// $FF: renamed from: Aq
public class class_681 extends class_671 {

   // $FF: renamed from: i vI
   private class_22 field_2920;
   // $FF: renamed from: l wR
   private class_772 field_2921;
   // $FF: renamed from: m java.lang.String
   private static final String field_2922 = "CL_00001751";


   // $FF: renamed from: <init> (vI, vI, wR) void
   public void method_3701(class_22 var1, class_22 var2, class_772 var3) {
      super.method_3645();
      String[] var10000 = class_752.method_4253();
      this.field_2920 = var2;
      this.field_2921 = var3;
      String[] var4 = var10000;
      byte var5 = 3;
      var2.method_93();
      int var6 = (var5 - 4) * 18;
      class_496 var10001 = new class_496;
      var10001.method_2891(this, var2, 0, 8, 18);
      this.method_3646(var10001);
      class_495 var10 = new class_495;
      var10.method_2889(this, var2, 1, 8, 36, var3);
      this.method_3646(var10);
      byte var9 = var3.method_4414();
      int var7;
      int var8;
      class_492 var11;
      if(var4 != null) {
         label74: {
            if(var9 != 0) {
               var7 = 0;

               while(var7 < var5) {
                  var9 = 0;
                  if(var4 == null) {
                     break label74;
                  }

                  var8 = 0;

                  while(true) {
                     if(var8 < 5) {
                        var11 = new class_492;
                        var11.method_2869(var2, 2 + var8 + var7 * 5, 80 + var8 * 18, 18 + var7 * 18);
                        this.method_3646(var11);
                        ++var8;
                        if(var4 == null) {
                           break;
                        }

                        if(var4 != null) {
                           continue;
                        }
                     }

                     ++var7;
                     break;
                  }

                  if(var4 == null) {
                     break;
                  }
               }
            }

            var9 = 0;
         }
      }

      var7 = var9;

      while(true) {
         if(var7 < 3) {
            var9 = 0;
            if(var4 == null) {
               break;
            }

            var8 = 0;

            while(true) {
               if(var8 < 9) {
                  var11 = new class_492;
                  var11.method_2869(var1, var8 + var7 * 9 + 9, 8 + var8 * 18, 102 + var7 * 18 + var6);
                  this.method_3646(var11);
                  ++var8;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               ++var7;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var9 = 0;
         break;
      }

      var7 = var9;

      while(var7 < 9) {
         var11 = new class_492;
         var11.method_2869(var1, var7, 8 + var7 * 18, 160 + var6);
         this.method_3646(var11);
         ++var7;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (yz) boolean
   public boolean method_3666(class_792 var1) {
      int var10000;
      label32: {
         String[] var2 = class_752.method_4253();
         var10000 = this.field_2920.method_92(var1);
         if(var2 != null) {
            if(var10000 == 0) {
               break label32;
            }

            var10000 = this.field_2921.method_3917();
         }

         if(var2 != null) {
            if(var10000 == 0) {
               break label32;
            }

            float var3;
            var10000 = (var3 = this.field_2921.method_3888(var1) - 8.0F) == 0.0F?0:(var3 < 0.0F?-1:1);
         }

         if(var2 == null) {
            return (boolean)var10000;
         }

         if(var10000 < 0) {
            var10000 = 1;
            return (boolean)var10000;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
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

      int var8;
      label83: {
         add var6;
         label99: {
            var6 = var7.method_2875();
            var4 = var6.method_3754();
            var8 = var2;
            if(var3 != null) {
               if(var2 < this.field_2920.method_83()) {
                  var8 = this.method_3667(var6, this.field_2920.method_83(), this.field_2869.size(), true);
                  if(var3 == null) {
                     break label83;
                  }

                  if(var8 == 0) {
                     return null;
                  }
                  break label99;
               }

               var8 = this.method_3653(1).method_2874(var6);
            }

            if(var3 != null) {
               label75: {
                  if(var8 != 0) {
                     var8 = this.method_3653(1).method_2876();
                     if(var3 == null) {
                        break label75;
                     }

                     if(var8 == 0) {
                        var8 = this.method_3667(var6, 1, 2, false);
                        if(var3 == null) {
                           break label83;
                        }

                        if(var8 == 0) {
                           return null;
                        }
                        break label99;
                     }
                  }

                  var8 = this.method_3653(0).method_2874(var6);
               }
            }

            if(var3 != null) {
               if(var8 != 0) {
                  var8 = this.method_3667(var6, 0, 1, false);
                  if(var3 == null) {
                     break label83;
                  }

                  if(var8 == 0) {
                     return null;
                  }
                  break label99;
               }

               var8 = this.field_2920.method_83();
            }

            if(var3 != null) {
               if(var8 <= 2) {
                  return null;
               }

               var8 = this.method_3667(var6, 2, this.field_2920.method_83(), false);
            }

            if(var3 == null) {
               break label83;
            }

            if(var8 == 0) {
               return null;
            }
         }

         var8 = var6.field_2958;
      }

      if(var8 == 0) {
         var5.method_2877((add)null);
         if(var3 != null) {
            return var4;
         }
      }

      var5.method_2878();
      return var4;
   }

   // $FF: renamed from: a (yz) void
   public void method_3658(class_792 var1) {
      super.method_3658(var1);
      this.field_2920.method_94();
   }

   // $FF: renamed from: <clinit> () void
   static void method_3678() {
      boolean var10000 = true;
      char[] var10003 = "0@½·¾FB;×¶".toCharArray();
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
            field_2922 = (new String((char[])var4)).intern();
            String var2 = field_2922;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 218;
            break;
         case 1:
            var10009 = 165;
            break;
         case 2:
            var10009 = 75;
            break;
         case 3:
            var10009 = 46;
            break;
         case 4:
            var10009 = 39;
            break;
         case 5:
            var10009 = 223;
            break;
         default:
            var10009 = 17;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
