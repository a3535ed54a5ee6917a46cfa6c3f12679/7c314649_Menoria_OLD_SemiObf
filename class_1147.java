import java.util.List;
import java.util.Random;

// $FF: renamed from: h8
public class class_1147 extends class_1094 {

   // $FF: renamed from: d boolean
   private boolean field_5900;
   // $FF: renamed from: e boolean
   private boolean field_5901;
   // $FF: renamed from: f boolean
   private boolean field_5902;
   // $FF: renamed from: g int
   private int field_5903;
   // $FF: renamed from: h java.lang.String
   private static final String field_5904;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_5905;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      String[] var2 = field_5905;
      var1.initGui4("hr", this.field_5900);
      var1.initGui4("sc", this.field_5901);
      var1.initGui4("hps", this.field_5902);
      var1.method_8667("Num", this.field_5903);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      String[] var2 = field_5905;
      this.field_5900 = var1.method_8690("hr");
      this.field_5901 = var1.method_8690("sc");
      this.field_5902 = var1.method_8690("hps");
      this.field_5903 = var1.method_8681("Num");
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6334(int var1, Random var2, class_1206 var3, int var4) {
      String[] var10000 = class_752.method_4253();
      super.method_6192(var1);
      this.field_5753 = var4;
      String[] var5 = var10000;
      this.field_5752 = var3;
      int var10001 = var2.nextInt(3);
      if(var5 != null) {
         var10001 = var10001 == 0?1:0;
      }

      label47: {
         label51: {
            this.field_5900 = (boolean)var10001;
            var10001 = this.field_5900;
            if(var5 != null) {
               if(this.field_5900) {
                  break label51;
               }

               var10001 = var2.nextInt(23);
            }

            if(var5 == null) {
               break label47;
            }

            if(var10001 == 0) {
               var10001 = 1;
               break label47;
            }
         }

         var10001 = 0;
      }

      this.field_5901 = (boolean)var10001;
      class_1147 var6 = this;
      if(var5 != null) {
         label34: {
            if(this.field_5753 != 2) {
               var6 = this;
               if(var5 == null) {
                  break label34;
               }

               if(this.field_5753 != 0) {
                  this.field_5903 = var3.method_6488() / 5;
                  if(var5 != null) {
                     return;
                  }
               }
            }

            var6 = this;
         }
      }

      var6.field_5903 = var3.method_6490() / 5;
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int) hS
   public static class_1206 method_6335(List var0, Random var1, int var2, int var3, int var4, int var5) {
      class_1206 var10000 = new class_1206;
      var10000.method_6481(var2, var3, var4, var2, var3 + 2, var4);
      class_1206 var7 = var10000;
      String[] var10 = class_752.method_4253();
      int var8 = var1.nextInt(3) + 2;
      String[] var6 = var10;

      int var11;
      while(true) {
         if(var8 > 0) {
            label52: {
               int var9;
               label51: {
                  label50: {
                     label49: {
                        var9 = var8 * 5;
                        if(var6 != null) {
                           var11 = var5;
                           if(var6 == null) {
                              break;
                           }

                           switch(var5) {
                           case 0:
                              var7.field_6247 = var2 + 2;
                              var7.field_6249 = var4 + (var9 - 1);
                              break;
                           case 1:
                              break label49;
                           case 2:
                              break label50;
                           case 3:
                              break label51;
                           default:
                              break label52;
                           }
                        }

                        if(var6 != null) {
                           break label52;
                        }
                     }

                     var7.field_6244 = var2 - (var9 - 1);
                     var7.field_6249 = var4 + 2;
                     if(var6 != null) {
                        break label52;
                     }
                  }

                  var7.field_6247 = var2 + 2;
                  var7.field_6246 = var4 - (var9 - 1);
                  if(var6 != null) {
                     break label52;
                  }
               }

               var7.field_6247 = var2 + (var9 - 1);
               var7.field_6249 = var4 + 2;
            }

            if(class_1094.method_6201(var0, var7) != null || var6 == null) {
               --var8;
               if(var6 != null) {
                  continue;
               }
            }
         }

         var11 = var8;
         break;
      }

      return var11 > 0?var7:null;
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      int var5 = this.method_6200();
      int var6 = var3.nextInt(4);
      String[] var4 = class_752.method_4253();
      int var10000 = this.field_5753;
      byte var10001;
      if(var4 != null) {
         switch(this.field_5753) {
         case 0:
            var10000 = var6;
            var10001 = 1;
            if(var4 != null) {
               if(var6 <= 1) {
                  class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244, this.field_5752.field_6245 - 1 + var3.nextInt(3), this.field_5752.field_6249 + 1, this.field_5753, var5);
                  if(var4 != null) {
                     break;
                  }
               }

               var10000 = var6;
               var10001 = 2;
            }

            if(var10000 == var10001) {
               class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245 - 1 + var3.nextInt(3), this.field_5752.field_6249 - 3, 1, var5);
               if(var4 != null) {
                  break;
               }
            }

            class_1207.method_6500(var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245 - 1 + var3.nextInt(3), this.field_5752.field_6249 - 3, 3, var5);
            if(var4 != null) {
               break;
            }
         case 1:
            var10000 = var6;
            var10001 = 1;
            if(var4 != null) {
               if(var6 <= 1) {
                  class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245 - 1 + var3.nextInt(3), this.field_5752.field_6246, this.field_5753, var5);
                  if(var4 != null) {
                     break;
                  }
               }

               var10000 = var6;
               var10001 = 2;
            }

            if(var10000 == var10001) {
               class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244, this.field_5752.field_6245 - 1 + var3.nextInt(3), this.field_5752.field_6246 - 1, 2, var5);
               if(var4 != null) {
                  break;
               }
            }

            class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244, this.field_5752.field_6245 - 1 + var3.nextInt(3), this.field_5752.field_6249 + 1, 0, var5);
            if(var4 != null) {
               break;
            }
         case 2:
            var10000 = var6;
            var10001 = 1;
            if(var4 != null) {
               if(var6 <= 1) {
                  class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244, this.field_5752.field_6245 - 1 + var3.nextInt(3), this.field_5752.field_6246 - 1, this.field_5753, var5);
                  if(var4 != null) {
                     break;
                  }
               }

               var10000 = var6;
               var10001 = 2;
            }

            if(var10000 == var10001) {
               class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245 - 1 + var3.nextInt(3), this.field_5752.field_6246, 1, var5);
               if(var4 != null) {
                  break;
               }
            }

            class_1207.method_6500(var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245 - 1 + var3.nextInt(3), this.field_5752.field_6246, 3, var5);
            if(var4 != null) {
               break;
            }
         case 3:
            label152: {
               var10000 = var6;
               var10001 = 1;
               if(var4 != null) {
                  if(var6 <= 1) {
                     class_1207.method_6500(var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245 - 1 + var3.nextInt(3), this.field_5752.field_6246, this.field_5753, var5);
                     if(var4 != null) {
                        break label152;
                     }
                  }

                  var10000 = var6;
                  var10001 = 2;
               }

               if(var10000 == var10001) {
                  class_1207.method_6500(var1, var2, var3, this.field_5752.field_6247 - 3, this.field_5752.field_6245 - 1 + var3.nextInt(3), this.field_5752.field_6246 - 1, 2, var5);
                  if(var4 != null) {
                     break label152;
                  }
               }

               class_1207.method_6500(var1, var2, var3, this.field_5752.field_6247 - 3, this.field_5752.field_6245 - 1 + var3.nextInt(3), this.field_5752.field_6249 + 1, 0, var5);
            }
         }

         var10000 = var5;
      }

      var10001 = 8;
      if(var4 != null) {
         if(var10000 >= 8) {
            return;
         }

         var10000 = this.field_5753;
         var10001 = 2;
      }

      int var7;
      int var8;
      label99: {
         if(var4 != null) {
            if(var10000 != var10001) {
               var10000 = this.field_5753;
               if(var4 == null) {
                  break label99;
               }

               if(this.field_5753 != 0) {
                  var7 = this.field_5752.field_6244 + 3;

                  do {
                     if(var7 + 3 > this.field_5752.field_6247) {
                        return;
                     }

                     label83: {
                        var8 = var3.nextInt(5);
                        var10000 = var8;
                        if(var4 != null) {
                           if(var8 == 0) {
                              class_1207.method_6500(var1, var2, var3, var7, this.field_5752.field_6245, this.field_5752.field_6246 - 1, 2, var5 + 1);
                              if(var4 != null) {
                                 break label83;
                              }
                           }

                           var10000 = var8;
                        }

                        if(var10000 == 1) {
                           class_1207.method_6500(var1, var2, var3, var7, this.field_5752.field_6245, this.field_5752.field_6249 + 1, 0, var5 + 1);
                        }
                     }

                     var7 += 5;
                  } while(var4 != null);
               }
            }

            var10000 = this.field_5752.field_6246;
            var10001 = 3;
         }

         var10000 += var10001;
      }

      var7 = var10000;

      while(var7 + 3 <= this.field_5752.field_6249) {
         label73: {
            var8 = var3.nextInt(5);
            var10000 = var8;
            if(var4 != null) {
               if(var8 == 0) {
                  class_1207.method_6500(var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245, var7, 1, var5 + 1);
                  if(var4 != null) {
                     break label73;
                  }
               }

               var10000 = var8;
            }

            if(var10000 == 1) {
               class_1207.method_6500(var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245, var7, 3, var5 + 1);
            }
         }

         var7 += 5;
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (ahb, hS, java.util.Random, int, int, int, vD[], int) boolean
   protected boolean method_6219(ahb var1, class_1206 var2, Random var3, int var4, int var5, int var6, class_1652[] var7, int var8) {
      int var10 = this.method_6204(var4, var6);
      String[] var10000 = class_752.method_4253();
      int var11 = this.method_6205(var5);
      int var12 = this.method_6206(var4, var6);
      String[] var9 = var10000;
      boolean var15 = var2.method_6487(var10, var11, var12);
      if(var9 != null) {
         if(var15 && var1.getBlock(var10, var11, var12).method_2424() == awt.field_4170) {
            int var16 = var3.nextBoolean();
            if(var9 != null) {
               var16 = var16 != 0?1:0;
            }

            int var13 = var16;
            var1.method_2054(var10, var11, var12, class_1192.field_6092, this.method_6207(class_1192.field_6092, var13), 2);
            class_697 var17 = new class_697;
            var17.method_3980(var1, (double)((float)var10 + 0.5F), (double)((float)var11 + 0.5F), (double)((float)var12 + 0.5F));
            class_697 var14 = var17;
            class_1652.method_9096(var3, var7, var14, var8);
            var1.method_2089(var14);
            return true;
         }

         var15 = false;
      }

      return var15;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      boolean var10000 = this.method_6203(var1, var3);
      if(var4 != null) {
         if(var10000) {
            return false;
         }

         var10000 = false;
      }

      boolean var6 = true;
      boolean var7 = false;
      boolean var8 = true;
      int var9 = this.field_5903 * 5 - 1;
      this.method_6211(var1, var3, 0, 0, 0, 2, 1, var9, class_1192.field_6025, class_1192.field_6025, false);
      this.method_6214(var1, var3, var2, 0.8F, 0, 2, 0, 2, 2, var9, class_1192.field_6025, class_1192.field_6025, false);
      byte var20 = this.field_5901;
      if(var4 != null) {
         if(this.field_5901) {
            this.method_6214(var1, var3, var2, 0.6F, 0, 0, 0, 2, 1, var9, class_1192.field_6057, class_1192.field_6025, false);
         }

         var20 = 0;
      }

      int var10 = var20;

      int var11;
      int var22;
      while(true) {
         if(var10 < this.field_5903) {
            label167: {
               var11 = 2 + var10 * 5;
               this.method_6211(var1, var3, 0, 0, var11, 0, 1, var11, class_1192.field_6111, class_1192.field_6025, false);
               class_1147 var21 = this;
               ahb var10001 = var1;
               class_1206 var10002 = var3;
               byte var10003 = 2;
               byte var10004 = 0;
               int var10005 = var11;
               byte var10006 = 2;
               byte var10007 = 1;
               int var10008 = var11;
               aji var10009 = class_1192.field_6111;
               aji var10010 = class_1192.field_6025;
               boolean var10011 = false;
               if(var4 != null) {
                  this.method_6211(var1, var3, 2, 0, var11, 2, 1, var11, class_1192.field_6111, class_1192.field_6025, false);
                  var22 = var2.nextInt(4);
                  if(var4 == null) {
                     break;
                  }

                  if(var22 == 0) {
                     this.method_6211(var1, var3, 0, 2, var11, 0, 2, var11, class_1192.field_6030, class_1192.field_6025, false);
                     this.method_6211(var1, var3, 2, 2, var11, 2, 2, var11, class_1192.field_6030, class_1192.field_6025, false);
                     if(var4 != null) {
                        break label167;
                     }
                  }

                  var21 = this;
                  var10001 = var1;
                  var10002 = var3;
                  var10003 = 0;
                  var10004 = 2;
                  var10005 = var11;
                  var10006 = 2;
                  var10007 = 2;
                  var10008 = var11;
                  var10009 = class_1192.field_6030;
                  var10010 = class_1192.field_6025;
                  var10011 = false;
               }

               var21.method_6211(var10001, var10002, var10003, var10004, var10005, var10006, var10007, var10008, var10009, var10010, var10011);
            }

            this.method_6215(var1, var3, var2, 0.1F, 0, 2, var11 - 1, class_1192.field_6057, 0);
            this.method_6215(var1, var3, var2, 0.1F, 2, 2, var11 - 1, class_1192.field_6057, 0);
            this.method_6215(var1, var3, var2, 0.1F, 0, 2, var11 + 1, class_1192.field_6057, 0);
            this.method_6215(var1, var3, var2, 0.1F, 2, 2, var11 + 1, class_1192.field_6057, 0);
            this.method_6215(var1, var3, var2, 0.05F, 0, 2, var11 - 2, class_1192.field_6057, 0);
            this.method_6215(var1, var3, var2, 0.05F, 2, 2, var11 - 2, class_1192.field_6057, 0);
            this.method_6215(var1, var3, var2, 0.05F, 0, 2, var11 + 2, class_1192.field_6057, 0);
            this.method_6215(var1, var3, var2, 0.05F, 2, 2, var11 + 2, class_1192.field_6057, 0);
            this.method_6215(var1, var3, var2, 0.05F, 1, 2, var11 - 1, class_1192.field_6077, 0);
            this.method_6215(var1, var3, var2, 0.05F, 1, 2, var11 + 1, class_1192.field_6077, 0);
            var22 = var2.nextInt(100);
            if(var4 != null) {
               if(var22 == 0) {
                  this.method_6219(var1, var3, var2, 2, 0, var11 - 1, class_1652.method_9098(class_1207.method_6501(), new class_1652[]{class_1010.field_5259.getBlock06(var2)}), 3 + var2.nextInt(4));
               }

               var22 = var2.nextInt(100);
            }

            if(var4 != null) {
               if(var22 == 0) {
                  this.method_6219(var1, var3, var2, 0, 0, var11 + 1, class_1652.method_9098(class_1207.method_6501(), new class_1652[]{class_1010.field_5259.getBlock06(var2)}), 3 + var2.nextInt(4));
               }

               var22 = this.field_5901;
            }

            label156: {
               label177: {
                  if(var4 != null) {
                     if(var22 == 0) {
                        break label177;
                     }

                     var22 = this.field_5902;
                  }

                  if(var4 != null) {
                     if(var22 != 0) {
                        break label177;
                     }

                     var22 = this.method_6205(0);
                  }

                  int var12 = var22;
                  int var13 = var11 - 1 + var2.nextInt(3);
                  int var14 = this.method_6204(1, var13);
                  var13 = this.method_6206(1, var13);
                  if(var4 == null) {
                     break label156;
                  }

                  if(var3.method_6487(var14, var12, var13)) {
                     this.field_5902 = true;
                     var1.method_2054(var14, var12, var13, class_1192.field_6079, 0, 2);
                     class_584 var15 = (class_584)var1.method_31(var14, var12, var13);
                     if(var4 == null) {
                        break label156;
                     }

                     if(var15 != null) {
                        class_982 var24 = var15.method_3123();
                        String[] var23 = field_5905;
                        var24.method_5672("CaveSpider");
                     }
                  }
               }

               ++var10;
            }

            if(var4 != null) {
               continue;
            }
         }

         var22 = 0;
         break;
      }

      var10 = var22;

      label133: {
         aji var25;
         label132:
         while(true) {
            if(var10 <= 2) {
               var10000 = false;
               if(var4 != null) {
                  var11 = 0;

                  while(true) {
                     if(var11 <= var9) {
                        byte var16 = -1;
                        aji var18 = this.method_6209(var1, var10, var16, var11, var3);
                        if(var4 != null) {
                           var25 = var18;
                           if(var4 == null) {
                              break label132;
                           }

                           if(var18.method_2424() == awt.field_4170) {
                              byte var19 = -1;
                              this.method_6208(var1, class_1192.field_6030, 0, var10, var19, var11, var3);
                           }

                           ++var11;
                        }

                        if(var4 != null) {
                           continue;
                        }

                        ++var10;
                        if(var4 != null) {
                           continue label132;
                        }

                        var10000 = this.field_5900;
                        break;
                     }

                     ++var10;
                     if(var4 != null) {
                        continue label132;
                     }

                     var10000 = this.field_5900;
                     break;
                  }
               }
            } else {
               var10000 = this.field_5900;
            }

            if(var4 == null) {
               return var10000;
            }

            if(!var10000) {
               break label133;
            }

            var10 = 0;
            if(var10 > var9) {
               break label133;
            }

            var25 = this.method_6209(var1, 1, -1, var10, var3);
            break;
         }

         while(true) {
            aji var17 = var25;
            if(var4 != null) {
               if(var17.method_2424() != awt.field_4170 && var17.method_2419()) {
                  this.method_6215(var1, var3, var2, 0.7F, 1, 0, var10, class_1192.field_6092, this.method_6207(class_1192.field_6092, 0));
               }

               ++var10;
            }

            if(var4 == null || var10 > var9) {
               break;
            }

            var25 = this.method_6209(var1, 1, -1, var10, var3);
         }
      }

      var10000 = true;
      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      // $FF: Couldn't be decompiled
   }
}
