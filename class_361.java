import java.util.Random;

// $FF: renamed from: fw
public class class_361 extends aji {

   // $FF: renamed from: M java.lang.String
   private static final String field_2022 = "CL_00000282";


   // $FF: renamed from: <init> () void
   public void method_2544() {
      super.method_2427(awt.field_4174);
      this.method_2521(class_872.field_4244);
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      String[] var4 = class_752.method_4253();
      class_361 var10000 = this;
      aji var10001 = class_1192.field_6041;
      adb var5;
      if(var4 != null) {
         if(this == class_1192.field_6041) {
            var5 = class_1010.field_5121;
            return var5;
         }

         var10000 = this;
         var10001 = class_1192.field_6083;
      }

      if(var4 != null) {
         if(var10000 == var10001) {
            var5 = class_1010.field_5122;
            return var5;
         }

         var10000 = this;
         var10001 = class_1192.field_6048;
      }

      if(var4 != null) {
         if(var10000 == var10001) {
            var5 = class_1010.field_5208;
            return var5;
         }

         var10000 = this;
         var10001 = class_1192.field_6153;
      }

      if(var4 != null) {
         if(var10000 == var10001) {
            var5 = class_1010.field_5244;
            return var5;
         }

         var10000 = this;
         var10001 = class_1192.field_6177;
      }

      if(var4 != null) {
         if(var10000 == var10001) {
            var5 = class_1010.field_5262;
            return var5;
         }

         var10000 = this;
         var10001 = class_1192.field_6194;
      }

      label72: {
         if(var4 != null) {
            if(var10000 == var10001) {
               var5 = class_1010.field_5285;
               return var5;
            }

            var10000 = this;
            if(var4 == null) {
               break label72;
            }

            var10001 = class_1192.field_6195;
         }

         if(var10000 == var10001) {
            var5 = class_1010.field_5286;
            return var5;
         }

         var10000 = this;
      }

      var5 = adb.method_2920(var10000);
      return var5;
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return this == class_1192.field_6048?4 + var1.nextInt(5):1;
   }

   // $FF: renamed from: a (int, java.util.Random) int
   public int method_2504(int var1, Random var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         class_361 var5;
         label25: {
            if(var1 > 0) {
               var5 = this;
               if(var3 == null) {
                  break label25;
               }

               if(adb.method_2920(this) != this.method_2464(0, var2, var1)) {
                  int var4 = var2.nextInt(var1 + 2) - 1;
                  var10000 = var4;
                  if(var3 != null) {
                     if(var4 < 0) {
                        var4 = 0;
                     }

                     var10000 = this.method_2463(var2) * (var4 + 1);
                  }

                  return var10000;
               }
            }

            var5 = this;
         }

         var10000 = var5.method_2463(var2);
      }

      return var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, float, int) void
   public void method_2467(ahb var1, int var2, int var3, int var4, int var5, float var6, int var7) {
      super.method_2467(var1, var2, var3, var4, var5, var6, var7);
      String[] var8 = class_752.method_4253();
      if(this.method_2464(var5, var1.field_1819, var7) != adb.method_2920(this)) {
         class_361 var10000;
         int var9;
         label75: {
            label79: {
               var9 = 0;
               var10000 = this;
               aji var10001 = class_1192.field_6041;
               if(var8 != null) {
                  if(this == class_1192.field_6041) {
                     var9 = class_1715.method_9575(var1.field_1819, 0, 2);
                     if(var8 != null) {
                        break label79;
                     }
                  }

                  var10000 = this;
                  var10001 = class_1192.field_6083;
               }

               if(var8 != null) {
                  if(var10000 == var10001) {
                     var9 = class_1715.method_9575(var1.field_1819, 3, 7);
                     if(var8 != null) {
                        break label79;
                     }
                  }

                  var10000 = this;
                  var10001 = class_1192.field_6153;
               }

               if(var8 != null) {
                  if(var10000 == var10001) {
                     var9 = class_1715.method_9575(var1.field_1819, 3, 7);
                     if(var8 != null) {
                        break label79;
                     }
                  }

                  var10000 = this;
                  var10001 = class_1192.field_6048;
               }

               if(var8 != null) {
                  if(var10000 == var10001) {
                     var9 = class_1715.method_9575(var1.field_1819, 2, 5);
                     if(var8 != null) {
                        break label79;
                     }
                  }

                  var10000 = this;
                  var10001 = class_1192.field_6177;
               }

               if(var8 != null) {
                  if(var10000 == var10001) {
                     var9 = class_1715.method_9575(var1.field_1819, 2, 5);
                     if(var8 != null) {
                        break label79;
                     }
                  }

                  var10000 = this;
                  var10001 = class_1192.field_6196;
               }

               if(var8 != null) {
                  if(var10000 == var10001) {
                     var9 = class_1715.method_9575(var1.field_1819, 2, 5);
                     if(var8 != null) {
                        break label79;
                     }
                  }

                  var10000 = this;
                  if(var8 == null) {
                     break label75;
                  }

                  var10001 = class_1192.field_6197;
               }

               if(var10000 == var10001) {
                  var9 = class_1715.method_9575(var1.field_1819, 2, 5);
               }
            }

            var10000 = this;
         }

         var10000.method_2469(var1, var2, var3, var4, var9);
      }

   }

   // $FF: renamed from: a (int) int
   public int method_2470(int var1) {
      return this == class_1192.field_6048?4:0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      boolean var10000 = true;
      char[] var10003 = "½v|r.¯Î\b".toCharArray();
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
            field_2022 = (new String((char[])var4)).intern();
            String var2 = field_2022;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 203;
            break;
         case 1:
            var10009 = 15;
            break;
         case 2:
            var10009 = 22;
            break;
         case 3:
            var10009 = 155;
            break;
         case 4:
            var10009 = 119;
            break;
         case 5:
            var10009 = 43;
            break;
         default:
            var10009 = 170;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
