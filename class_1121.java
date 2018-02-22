import java.util.List;
import java.util.Random;

// $FF: renamed from: iU
public class class_1121 extends class_1116 {

   // $FF: renamed from: h java.lang.String
   private static final String field_5826 = "CL_00000530";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (iY, int, java.util.Random, hS, int) void
   public void method_6280(class_1118 var1, int var2, Random var3, class_1206 var4, int var5) {
      super.method_6266(var1, var2);
      this.field_5753 = var5;
      this.field_5752 = var4;
   }

   // $FF: renamed from: b (iY, java.util.List, java.util.Random, int, int, int, int, int) iU
   public static class_1121 method_6281(class_1118 var0, List var1, Random var2, int var3, int var4, int var5, int var6, int var7) {
      class_1206 var8 = class_1206.method_6479(var3, var4, var5, 0, 0, 0, 9, 7, 12, var6);
      class_1121 var10000;
      if(method_6270(var8) && class_1094.method_6201(var1, var8) == null) {
         var10000 = new class_1121;
         var10000.method_6280(var0, var7, var2, var8, var6);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.field_5808;
      class_1121 var11;
      if(var4 != null) {
         if(this.field_5808 < 0) {
            this.field_5808 = this.method_6269(var1, var3);
            var11 = this;
            if(var4 != null) {
               if(this.field_5808 < 0) {
                  return true;
               }

               var11 = this;
            }

            var11.field_5752.method_6486(0, this.field_5808 - this.field_5752.field_6248 + 7 - 1, 0);
         }

         this.method_6211(var1, var3, 1, 1, 1, 7, 4, 4, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6211(var1, var3, 2, 1, 6, 8, 4, 10, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6211(var1, var3, 2, 0, 5, 8, 0, 10, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 1, 0, 1, 7, 0, 4, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 0, 0, 0, 0, 3, 5, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 8, 0, 0, 8, 3, 10, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 1, 0, 0, 7, 2, 0, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 1, 0, 5, 2, 1, 5, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 2, 0, 6, 2, 3, 10, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 3, 0, 10, 7, 3, 10, class_1192.field_6029, class_1192.field_6029, false);
         this.method_6211(var1, var3, 1, 2, 0, 7, 3, 0, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 1, 2, 5, 2, 3, 5, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 0, 4, 1, 8, 4, 1, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 0, 4, 4, 3, 4, 4, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 0, 5, 2, 8, 5, 3, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6208(var1, class_1192.field_6030, 0, 0, 4, 2, var3);
         this.method_6208(var1, class_1192.field_6030, 0, 0, 4, 3, var3);
         this.method_6208(var1, class_1192.field_6030, 0, 8, 4, 2, var3);
         this.method_6208(var1, class_1192.field_6030, 0, 8, 4, 3, var3);
         this.method_6208(var1, class_1192.field_6030, 0, 8, 4, 4, var3);
         var10000 = this.method_6207(class_1192.field_6080, 3);
      }

      int var5 = var10000;
      int var6 = this.method_6207(class_1192.field_6080, 2);
      int var7 = -1;

      int var8;
      byte var13;
      label233:
      while(true) {
         var10000 = var7;
         byte var10001 = 2;

         label230:
         while(var10000 <= var10001) {
            var13 = 0;
            if(var4 == null) {
               break label233;
            }

            var8 = 0;

            while(var8 <= 8) {
               label240: {
                  this.method_6208(var1, class_1192.field_6080, var5, var8, 4 + var7, var7, var3);
                  var10000 = var7;
                  if(var4 != null) {
                     label241: {
                        var10001 = -1;
                        if(var4 == null) {
                           continue label230;
                        }

                        if(var7 <= -1) {
                           var10000 = var8;
                           if(var4 == null) {
                              break label241;
                           }

                           if(var8 > 1) {
                              break label240;
                           }
                        }

                        var10000 = var7;
                     }
                  }

                  byte var12;
                  label213: {
                     if(var4 != null) {
                        if(var10000 <= 0) {
                           var10000 = var8;
                           var12 = 3;
                           if(var4 == null) {
                              break label213;
                           }

                           if(var8 > 3) {
                              break label240;
                           }
                        }

                        var10000 = var7;
                     }

                     var12 = 1;
                  }

                  label242: {
                     if(var4 != null) {
                        if(var10000 > var12) {
                           break label242;
                        }

                        var10000 = var8;
                        var12 = 4;
                     }

                     if(var4 != null) {
                        if(var10000 <= var12) {
                           break label242;
                        }

                        var10000 = var8;
                        var12 = 6;
                     }

                     if(var10000 < var12) {
                        break label240;
                     }
                  }

                  this.method_6208(var1, class_1192.field_6080, var6, var8, 4 + var7, 5 - var7, var3);
               }

               ++var8;
               if(var4 == null) {
                  break;
               }
            }

            ++var7;
            if(var4 != null) {
               continue label233;
            }
            break;
         }

         this.method_6211(var1, var3, 3, 4, 5, 3, 4, 10, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 7, 4, 2, 7, 4, 10, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 4, 5, 4, 4, 5, 10, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 6, 5, 4, 6, 5, 10, class_1192.field_6030, class_1192.field_6030, false);
         this.method_6211(var1, var3, 5, 6, 3, 5, 6, 10, class_1192.field_6030, class_1192.field_6030, false);
         var7 = this.method_6207(class_1192.field_6080, 0);
         var13 = 4;
         break;
      }

      var8 = var13;

      int var9;
      while(true) {
         if(var8 >= 1) {
            this.method_6208(var1, class_1192.field_6030, 0, var8, 2 + var8, 7 - var8, var3);
            var10000 = 8 - var8;
            if(var4 == null) {
               break;
            }

            var9 = var10000;

            while(true) {
               if(var9 <= 10) {
                  this.method_6208(var1, class_1192.field_6080, var7, var8, 2 + var8, var9, var3);
                  ++var9;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               --var8;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var8 = this.method_6207(class_1192.field_6080, 1);
         this.method_6208(var1, class_1192.field_6030, 0, 6, 6, 3, var3);
         this.method_6208(var1, class_1192.field_6030, 0, 7, 5, 4, var3);
         this.method_6208(var1, class_1192.field_6080, var8, 6, 6, 4, var3);
         var10000 = 6;
         break;
      }

      var9 = var10000;

      int var10;
      while(true) {
         if(var9 <= 8) {
            var13 = 5;
            if(var4 == null) {
               break;
            }

            var10 = 5;

            while(true) {
               if(var10 <= 10) {
                  this.method_6208(var1, class_1192.field_6080, var8, var9, 12 - var9, var10, var3);
                  ++var10;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               ++var9;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         label143: {
            ahb var15;
            label246: {
               this.method_6208(var1, class_1192.field_6042, 0, 0, 2, 1, var3);
               this.method_6208(var1, class_1192.field_6042, 0, 0, 2, 4, var3);
               this.method_6208(var1, class_1192.field_6127, 0, 0, 2, 2, var3);
               this.method_6208(var1, class_1192.field_6127, 0, 0, 2, 3, var3);
               this.method_6208(var1, class_1192.field_6042, 0, 4, 2, 0, var3);
               this.method_6208(var1, class_1192.field_6127, 0, 5, 2, 0, var3);
               this.method_6208(var1, class_1192.field_6042, 0, 6, 2, 0, var3);
               this.method_6208(var1, class_1192.field_6042, 0, 8, 2, 1, var3);
               this.method_6208(var1, class_1192.field_6127, 0, 8, 2, 2, var3);
               this.method_6208(var1, class_1192.field_6127, 0, 8, 2, 3, var3);
               this.method_6208(var1, class_1192.field_6042, 0, 8, 2, 4, var3);
               this.method_6208(var1, class_1192.field_6030, 0, 8, 2, 5, var3);
               this.method_6208(var1, class_1192.field_6042, 0, 8, 2, 6, var3);
               this.method_6208(var1, class_1192.field_6127, 0, 8, 2, 7, var3);
               this.method_6208(var1, class_1192.field_6127, 0, 8, 2, 8, var3);
               this.method_6208(var1, class_1192.field_6042, 0, 8, 2, 9, var3);
               this.method_6208(var1, class_1192.field_6042, 0, 2, 2, 6, var3);
               this.method_6208(var1, class_1192.field_6127, 0, 2, 2, 7, var3);
               this.method_6208(var1, class_1192.field_6127, 0, 2, 2, 8, var3);
               this.method_6208(var1, class_1192.field_6042, 0, 2, 2, 9, var3);
               this.method_6208(var1, class_1192.field_6042, 0, 4, 4, 10, var3);
               this.method_6208(var1, class_1192.field_6127, 0, 5, 4, 10, var3);
               this.method_6208(var1, class_1192.field_6042, 0, 6, 4, 10, var3);
               this.method_6208(var1, class_1192.field_6030, 0, 5, 5, 10, var3);
               this.method_6208(var1, class_1192.field_6025, 0, 2, 1, 0, var3);
               this.method_6208(var1, class_1192.field_6025, 0, 2, 2, 0, var3);
               this.method_6208(var1, class_1192.field_6077, 0, 2, 3, 1, var3);
               this.method_6221(var1, var3, var2, 2, 1, 0, this.method_6207(class_1192.field_6090, 1));
               this.method_6211(var1, var3, 1, 0, -1, 3, 2, -1, class_1192.field_6025, class_1192.field_6025, false);
               awt var16 = this.method_6209(var1, 2, 0, -1, var3).method_2424();
               awt var14 = awt.field_4170;
               if(var4 != null) {
                  if(var16 != awt.field_4170) {
                     break label143;
                  }

                  var11 = this;
                  var15 = var1;
                  if(var4 == null) {
                     break label246;
                  }

                  var16 = this.method_6209(var1, 2, -1, -1, var3).method_2424();
                  var14 = awt.field_4170;
               }

               if(var16 == var14) {
                  break label143;
               }

               var11 = this;
               var15 = var1;
            }

            var11.method_6208(var15, class_1192.field_6093, this.method_6207(class_1192.field_6093, 3), 2, 0, -1, var3);
         }

         var13 = 0;
         break;
      }

      var9 = var13;

      while(true) {
         if(var9 < 5) {
            var13 = 0;
            if(var4 == null) {
               break;
            }

            var10 = 0;

            while(true) {
               if(var10 < 9) {
                  this.method_6217(var1, var10, 7, var9, var3);
                  this.method_6218(var1, class_1192.field_6029, 0, var10, -1, var9, var3);
                  ++var10;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               ++var9;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var13 = 5;
         break;
      }

      var9 = var13;

      boolean var17;
      while(true) {
         if(var9 < 11) {
            var17 = true;
            if(var4 == null) {
               break;
            }

            var10 = 2;

            while(true) {
               if(var10 < 9) {
                  this.method_6217(var1, var10, 7, var9, var3);
                  this.method_6218(var1, class_1192.field_6029, 0, var10, -1, var9, var3);
                  ++var10;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               ++var9;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         this.method_6271(var1, var3, 4, 1, 2, 2);
         var17 = true;
         break;
      }

      return var17;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "~V!Üé\r÷:!".toCharArray();
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
            field_5826 = (new String((char[])var4)).intern();
            String var2 = field_5826;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 141;
            break;
         case 1:
            var10009 = 114;
            break;
         case 2:
            var10009 = 185;
            break;
         case 3:
            var10009 = 161;
            break;
         case 4:
            var10009 = 92;
            break;
         case 5:
            var10009 = 22;
            break;
         default:
            var10009 = 105;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
