import java.util.Iterator;
import java.util.List;
import java.util.Random;

// $FF: renamed from: ib
abstract class class_1099 extends class_1094 {

   // $FF: renamed from: d vD[]
   protected static final class_1652[] field_5778;
   // $FF: renamed from: e java.lang.String
   private static final String field_5779 = "CL_00000466";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int) void
   protected void method_6192(int var1) {
      super.method_6192(var1);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {}

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {}

   // $FF: renamed from: b (java.util.List) int
   private int method_6228(List var1) {
      byte var3 = 0;
      String[] var2 = class_752.method_4253();
      int var4 = 0;
      Iterator var6 = var1.iterator();

      int var10000;
      while(true) {
         if(var6.hasNext()) {
            class_1247 var5 = (class_1247)var6.next();
            var10000 = var5.field_6481;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               int var10001;
               label33: {
                  if(var5.field_6481 > 0) {
                     var10000 = var5.field_6480;
                     var10001 = var5.field_6481;
                     if(var2 == null) {
                        break label33;
                     }

                     if(var5.field_6480 < var5.field_6481) {
                        var3 = 1;
                     }
                  }

                  var10000 = var4;
                  var10001 = var5.field_6479;
               }

               var10000 += var10001;
            }

            var4 = var10000;
            if(var2 != null) {
               continue;
            }
         }

         var10000 = var3;
         break;
      }

      if(var2 != null) {
         var10000 = var10000 != 0?var4:-1;
      }

      return var10000;
   }

   // $FF: renamed from: b (id, java.util.List, java.util.List, java.util.Random, int, int, int, int, int) ib
   private class_1099 method_6229(class_1114 var1, List var2, List var3, Random var4, int var5, int var6, int var7, int var8, int var9) {
      String[] var10;
      int var11;
      int var19;
      label108: {
         label111: {
            String[] var10000 = class_752.method_4253();
            var11 = this.method_6228(var2);
            var10 = var10000;
            var19 = var11;
            if(var10 != null) {
               if(var11 <= 0) {
                  break label111;
               }

               var19 = var9;
            }

            if(var10 == null) {
               break label108;
            }

            if(var19 <= 30) {
               var19 = 1;
               break label108;
            }
         }

         var19 = 0;
      }

      int var12 = var19;
      int var13 = 0;

      label97:
      while(true) {
         var19 = var13;

         label95:
         while(true) {
            if(var19 < 5) {
               var19 = var12;
               if(var10 != null) {
                  if(var12 == 0) {
                     return class_1112.method_6260(var3, var4, var5, var6, var7, var8, var9);
                  }

                  ++var13;
                  var19 = var4.nextInt(var11);
               }

               int var14 = var19;
               Iterator var15 = var2.iterator();

               while(true) {
                  if(var15.hasNext()) {
                     label113: {
                        class_1247 var16 = (class_1247)var15.next();
                        var14 -= var16.field_6479;
                        var19 = var14;
                        if(var10 == null) {
                           continue label95;
                        }

                        label123: {
                           class_1247 var20;
                           label115: {
                              if(var10 != null) {
                                 if(var14 >= 0) {
                                    break label123;
                                 }

                                 var20 = var16;
                                 if(var10 == null) {
                                    break label115;
                                 }

                                 var19 = var16.method_6570(var9);
                              }

                              if(var19 == 0) {
                                 break label113;
                              }

                              var20 = var16;
                           }

                           if(var10 != null) {
                              label70: {
                                 if(var20 == var1.field_5802) {
                                    var20 = var16;
                                    if(var10 == null) {
                                       break label70;
                                    }

                                    if(!var16.field_6482 && var10 != null) {
                                       break label113;
                                    }
                                 }

                                 var20 = var16;
                              }
                           }

                           class_1099 var17 = class_1208.method_6506(var20, var3, var4, var5, var6, var7, var8, var9);
                           Object var18;
                           if(var10 != null) {
                              if(var17 == null) {
                                 break label123;
                              }

                              ++var16.field_6480;
                              var18 = var1;
                              if(var10 == null) {
                                 return (class_1099)var18;
                              }

                              var1.field_5802 = var16;
                           }

                           if(!var16.method_6571()) {
                              var2.remove(var16);
                           }

                           var18 = var17;
                           return (class_1099)var18;
                        }

                        if(var10 != null) {
                           continue;
                        }
                     }
                  }

                  if(var10 != null) {
                     continue label97;
                  }
                  break;
               }
            }

            return class_1112.method_6260(var3, var4, var5, var6, var7, var8, var9);
         }
      }
   }

   // $FF: renamed from: b (id, java.util.List, java.util.Random, int, int, int, int, int, boolean) h7
   private class_1094 method_6230(class_1114 var1, List var2, Random var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      String[] var10 = class_752.method_4253();
      int var10000 = Math.abs(var4 - var1.method_6199().field_6244);
      byte var10001 = 112;
      if(var10 != null) {
         if(var10000 > 112) {
            return class_1112.method_6260(var2, var3, var4, var5, var6, var7, var8);
         }

         var10000 = Math.abs(var6 - var1.method_6199().field_6246);
         var10001 = 112;
      }

      if(var10000 <= var10001) {
         List var11 = var1.field_5803;
         if(var9) {
            var11 = var1.field_5804;
         }

         class_1099 var12 = this.method_6229(var1, var11, var2, var3, var4, var5, var6, var7, var8 + 1);
         class_1099 var13 = var12;
         if(var10 != null) {
            if(var12 != null) {
               var2.add(var12);
               var1.field_5805.add(var12);
            }

            var13 = var12;
         }

         return var13;
      } else {
         return class_1112.method_6260(var2, var3, var4, var5, var6, var7, var8);
      }
   }

   // $FF: renamed from: b (id, java.util.List, java.util.Random, int, int, boolean) h7
   protected class_1094 method_6231(class_1114 var1, List var2, Random var3, int var4, int var5, boolean var6) {
      String[] var7 = class_752.method_4253();
      Object var10000 = this;
      if(var7 != null) {
         switch(this.field_5753) {
         case 0:
            var10000 = this.method_6230(var1, var2, var3, this.field_5752.field_6244 + var4, this.field_5752.field_6245 + var5, this.field_5752.field_6249 + 1, this.field_5753, this.method_6200(), var6);
            break;
         case 1:
            return this.method_6230(var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245 + var5, this.field_5752.field_6246 + var4, this.field_5753, this.method_6200(), var6);
         case 2:
            return this.method_6230(var1, var2, var3, this.field_5752.field_6244 + var4, this.field_5752.field_6245 + var5, this.field_5752.field_6246 - 1, this.field_5753, this.method_6200(), var6);
         case 3:
            return this.method_6230(var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245 + var5, this.field_5752.field_6246 + var4, this.field_5753, this.method_6200(), var6);
         default:
            return null;
         }
      }

      return (class_1094)var10000;
   }

   // $FF: renamed from: c (id, java.util.List, java.util.Random, int, int, boolean) h7
   protected class_1094 method_6232(class_1114 var1, List var2, Random var3, int var4, int var5, boolean var6) {
      String[] var7 = class_752.method_4253();
      Object var10000 = this;
      if(var7 != null) {
         switch(this.field_5753) {
         case 0:
            var10000 = this.method_6230(var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245 + var4, this.field_5752.field_6246 + var5, 1, this.method_6200(), var6);
            break;
         case 1:
            return this.method_6230(var1, var2, var3, this.field_5752.field_6244 + var5, this.field_5752.field_6245 + var4, this.field_5752.field_6246 - 1, 2, this.method_6200(), var6);
         case 2:
            return this.method_6230(var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245 + var4, this.field_5752.field_6246 + var5, 1, this.method_6200(), var6);
         case 3:
            return this.method_6230(var1, var2, var3, this.field_5752.field_6244 + var5, this.field_5752.field_6245 + var4, this.field_5752.field_6246 - 1, 2, this.method_6200(), var6);
         default:
            return null;
         }
      }

      return (class_1094)var10000;
   }

   // $FF: renamed from: d (id, java.util.List, java.util.Random, int, int, boolean) h7
   protected class_1094 method_6233(class_1114 var1, List var2, Random var3, int var4, int var5, boolean var6) {
      String[] var7 = class_752.method_4253();
      Object var10000 = this;
      if(var7 != null) {
         switch(this.field_5753) {
         case 0:
            var10000 = this.method_6230(var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245 + var4, this.field_5752.field_6246 + var5, 3, this.method_6200(), var6);
            break;
         case 1:
            return this.method_6230(var1, var2, var3, this.field_5752.field_6244 + var5, this.field_5752.field_6245 + var4, this.field_5752.field_6249 + 1, 0, this.method_6200(), var6);
         case 2:
            return this.method_6230(var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245 + var4, this.field_5752.field_6246 + var5, 3, this.method_6200(), var6);
         case 3:
            return this.method_6230(var1, var2, var3, this.field_5752.field_6244 + var5, this.field_5752.field_6245 + var4, this.field_5752.field_6249 + 1, 0, this.method_6200(), var6);
         default:
            return null;
         }
      }

      return (class_1094)var10000;
   }

   // $FF: renamed from: b (hS) boolean
   protected static boolean method_6234(class_1206 var0) {
      int var2;
      label24: {
         String[] var1 = class_752.method_4253();
         class_1206 var10000 = var0;
         if(var1 != null) {
            if(var0 == null) {
               break label24;
            }

            var10000 = var0;
         }

         var2 = var10000.field_6245;
         if(var1 == null) {
            return (boolean)var2;
         }

         if(var2 > 10) {
            var2 = 1;
            return (boolean)var2;
         }
      }

      var2 = 0;
      return (boolean)var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "1ícD´çjB\nB".toCharArray();
      class_1652 var10004 = var10003.length;
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
            field_5779 = (new String((char[])var4)).intern();
            String var1 = field_5779;
            class_1652[] var2 = new class_1652[11];
            var10004 = new class_1652;
            var10004.method_9094(class_1010.field_5122, 0, 1, 3, 5);
            var2[0] = var10004;
            var10004 = new class_1652;
            var10004.method_9094(class_1010.field_5123, 0, 1, 5, 5);
            var2[1] = var10004;
            var10004 = new class_1652;
            var10004.method_9094(class_1010.field_5124, 0, 1, 3, 15);
            var2[2] = var10004;
            var10004 = new class_1652;
            var10004.method_9094(class_1010.field_5141, 0, 1, 1, 5);
            var2[3] = var10004;
            var10004 = new class_1652;
            var10004.method_9094(class_1010.field_5173, 0, 1, 1, 5);
            var2[4] = var10004;
            var10004 = new class_1652;
            var10004.method_9094(class_1010.field_5117, 0, 1, 1, 5);
            var2[5] = var10004;
            var10004 = new class_1652;
            var10004.method_9094(class_1010.field_5229, 0, 3, 7, 5);
            var2[6] = var10004;
            var10004 = new class_1652;
            var10004.method_9094(class_1010.field_5187, 0, 1, 1, 10);
            var2[7] = var10004;
            var10004 = new class_1652;
            var10004.method_9094(class_1010.field_5266, 0, 1, 1, 8);
            var2[8] = var10004;
            var10004 = new class_1652;
            var10004.method_9094(class_1010.field_5265, 0, 1, 1, 5);
            var2[9] = var10004;
            var10004 = new class_1652;
            var10004.method_9094(class_1010.field_5267, 0, 1, 1, 3);
            var2[10] = var10004;
            field_5778 = var2;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 131;
            break;
         case 1:
            var10009 = 80;
            break;
         case 2:
            var10009 = 205;
            break;
         case 3:
            var10009 = 133;
            break;
         case 4:
            var10009 = 117;
            break;
         case 5:
            var10009 = 38;
            break;
         default:
            var10009 = 171;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
