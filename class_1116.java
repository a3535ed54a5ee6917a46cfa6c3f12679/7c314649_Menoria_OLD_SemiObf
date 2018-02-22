import java.util.List;
import java.util.Random;

// $FF: renamed from: iK
abstract class class_1116 extends class_1094 {

   // $FF: renamed from: d int
   protected int field_5808;
   // $FF: renamed from: e int
   private int field_5809;
   // $FF: renamed from: f boolean
   private boolean field_5810;
   // $FF: renamed from: g java.lang.String
   private static final String field_5811;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_5812;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
      this.field_5808 = -1;
   }

   // $FF: renamed from: <init> (iY, int) void
   protected void method_6266(class_1118 var1, int var2) {
      super.method_6192(var2);
      String[] var3 = class_752.method_4253();
      this.field_5808 = -1;
      Object var10000 = var1;
      if(var3 != null) {
         if(var1 == null) {
            return;
         }

         var10000 = this;
      }

      ((class_1116)var10000).field_5810 = var1.field_5815;
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      String[] var2 = field_5812;
      var1.method_8667("HPos", this.field_5808);
      var1.method_8667("VCount", this.field_5809);
      var1.initGui4("Desert", this.field_5810);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      String[] var2 = field_5812;
      this.field_5808 = var1.method_8681("HPos");
      this.field_5809 = var1.method_8681("VCount");
      this.field_5810 = var1.method_8690("Desert");
   }

   // $FF: renamed from: b (iY, java.util.List, java.util.Random, int, int) h7
   protected class_1094 method_6267(class_1118 var1, List var2, Random var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      Object var10000 = this;
      if(var6 != null) {
         switch(this.field_5753) {
         case 0:
            var10000 = class_1249.method_6585(var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245 + var4, this.field_5752.field_6246 + var5, 1, this.method_6200());
            break;
         case 1:
            return class_1249.method_6585(var1, var2, var3, this.field_5752.field_6244 + var5, this.field_5752.field_6245 + var4, this.field_5752.field_6246 - 1, 2, this.method_6200());
         case 2:
            return class_1249.method_6585(var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6245 + var4, this.field_5752.field_6246 + var5, 1, this.method_6200());
         case 3:
            return class_1249.method_6585(var1, var2, var3, this.field_5752.field_6244 + var5, this.field_5752.field_6245 + var4, this.field_5752.field_6246 - 1, 2, this.method_6200());
         default:
            return null;
         }
      }

      return (class_1094)var10000;
   }

   // $FF: renamed from: c (iY, java.util.List, java.util.Random, int, int) h7
   protected class_1094 method_6268(class_1118 var1, List var2, Random var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      Object var10000 = this;
      if(var6 != null) {
         switch(this.field_5753) {
         case 0:
            var10000 = class_1249.method_6585(var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245 + var4, this.field_5752.field_6246 + var5, 3, this.method_6200());
            break;
         case 1:
            return class_1249.method_6585(var1, var2, var3, this.field_5752.field_6244 + var5, this.field_5752.field_6245 + var4, this.field_5752.field_6249 + 1, 0, this.method_6200());
         case 2:
            return class_1249.method_6585(var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6245 + var4, this.field_5752.field_6246 + var5, 3, this.method_6200());
         case 3:
            return class_1249.method_6585(var1, var2, var3, this.field_5752.field_6244 + var5, this.field_5752.field_6245 + var4, this.field_5752.field_6249 + 1, 0, this.method_6200());
         default:
            return null;
         }
      }

      return (class_1094)var10000;
   }

   // $FF: renamed from: a (ahb, hS) int
   protected int method_6269(ahb var1, class_1206 var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = 0;
      int var5 = 0;
      String[] var3 = var10000;
      int var6 = this.field_5752.field_6246;

      int var8;
      label52:
      while(true) {
         var8 = var6;

         label49:
         while(var8 <= this.field_5752.field_6249) {
            var8 = this.field_5752.field_6244;
            if(var3 == null) {
               break label52;
            }

            int var7 = this.field_5752.field_6244;

            while(var7 <= this.field_5752.field_6247) {
               var8 = var2.method_6487(var7, 64, var6);
               if(var3 == null) {
                  continue label49;
               }

               label43: {
                  if(var3 != null) {
                     if(var8 == 0) {
                        break label43;
                     }

                     var8 = var4 + Math.max(var1.method_2108(var7, var6), var1.field_1820.method_6176());
                  }

                  var4 = var8;
                  ++var5;
               }

               ++var7;
               if(var3 == null) {
                  break;
               }
            }

            ++var6;
            if(var3 != null) {
               continue label52;
            }
            break;
         }

         var8 = var5;
         break;
      }

      if(var3 != null) {
         if(var8 == 0) {
            return -1;
         }

         var8 = var4 / var5;
      }

      return var8;
   }

   // $FF: renamed from: b (hS) boolean
   protected static boolean method_6270(class_1206 var0) {
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

   // $FF: renamed from: b (ahb, hS, int, int, int, int) void
   protected void method_6271(ahb var1, class_1206 var2, int var3, int var4, int var5, int var6) {
      String[] var7 = class_752.method_4253();
      int var10000 = this.field_5809;
      if(var7 != null) {
         if(this.field_5809 >= var6) {
            return;
         }

         var10000 = this.field_5809;
      }

      int var8 = var10000;

      while(var8 < var6) {
         int var9 = this.method_6204(var3 + var8, var5);
         int var10 = this.method_6205(var4);
         int var11 = this.method_6206(var3 + var8, var5);
         if(var7 != null) {
            if(!var2.method_6487(var9, var10, var11) && var7 != null) {
               break;
            }

            ++this.field_5809;
         }

         class_768 var13 = new class_768;
         var13.method_4359(var1, this.method_6272(var8));
         class_768 var12 = var13;
         var12.method_3887((double)var9 + 0.5D, (double)var10, (double)var11 + 0.5D, 0.0F, 0.0F);
         var1.method_2089(var12);
         ++var8;
         if(var7 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (int) int
   protected int method_6272(int var1) {
      return 0;
   }

   // $FF: renamed from: a (aji, int) aji
   protected aji method_6273(aji var1, int var2) {
      String[] var3 = class_752.method_4253();
      aji var10000;
      if(this.field_5810) {
         aji var10001;
         label57: {
            var10000 = var1;
            if(var3 != null) {
               if(var1 != class_1192.field_6042) {
                  label73: {
                     var10000 = var1;
                     var10001 = class_1192.field_6043;
                     if(var3 != null) {
                        if(var1 == class_1192.field_6043) {
                           break label73;
                        }

                        var10000 = var1;
                        var10001 = class_1192.field_6029;
                     }

                     if(var3 != null) {
                        if(var10000 == var10001) {
                           return class_1192.field_6051;
                        }

                        var10000 = var1;
                        var10001 = class_1192.field_6030;
                     }

                     if(var3 != null) {
                        if(var10000 == var10001) {
                           return class_1192.field_6051;
                        }

                        var10000 = var1;
                        var10001 = class_1192.field_6080;
                     }

                     if(var3 != null) {
                        if(var10000 == var10001) {
                           return class_1192.field_6152;
                        }

                        var10000 = var1;
                        var10001 = class_1192.field_6093;
                     }
                     break label57;
                  }
               }

               var10000 = class_1192.field_6051;
            }

            return var10000;
         }

         if(var3 != null) {
            if(var10000 == var10001) {
               return class_1192.field_6152;
            }

            var10000 = var1;
            if(var3 == null) {
               return var10000;
            }

            var10001 = class_1192.field_6038;
         }

         if(var10000 == var10001) {
            return class_1192.field_6051;
         }
      }

      var10000 = var1;
      return var10000;
   }

   // $FF: renamed from: d (aji, int) int
   protected int method_6274(aji var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.field_5810;
      if(var3 != null) {
         if(this.field_5810) {
            aji var4 = var1;
            aji var10001 = class_1192.field_6042;
            if(var3 != null) {
               if(var1 == class_1192.field_6042) {
                  return 0;
               }

               var4 = var1;
               var10001 = class_1192.field_6043;
            }

            if(var3 != null) {
               if(var4 == var10001) {
                  return 0;
               }

               var4 = var1;
               var10001 = class_1192.field_6029;
            }

            if(var3 != null) {
               if(var4 == var10001) {
                  return 0;
               }

               var4 = var1;
               var10001 = class_1192.field_6030;
            }

            if(var4 == var10001) {
               return 2;
            }
         }

         var10000 = var2;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, aji, int, int, int, int, hS) void
   protected void method_6208(ahb var1, aji var2, int var3, int var4, int var5, int var6, class_1206 var7) {
      aji var8 = this.method_6273(var2, var3);
      int var9 = this.method_6274(var2, var3);
      super.method_6208(var1, var8, var9, var4, var5, var6, var7);
   }

   // $FF: renamed from: b (ahb, hS, int, int, int, int, int, int, aji, aji, boolean) void
   protected void method_6211(ahb var1, class_1206 var2, int var3, int var4, int var5, int var6, int var7, int var8, aji var9, aji var10, boolean var11) {
      aji var12 = this.method_6273(var9, 0);
      int var13 = this.method_6274(var9, 0);
      aji var14 = this.method_6273(var10, 0);
      int var15 = this.method_6274(var10, 0);
      super.method_6212(var1, var2, var3, var4, var5, var6, var7, var8, var12, var13, var14, var15, var11);
   }

   // $FF: renamed from: c (ahb, aji, int, int, int, int, hS) void
   protected void method_6218(ahb var1, aji var2, int var3, int var4, int var5, int var6, class_1206 var7) {
      aji var8 = this.method_6273(var2, var3);
      int var9 = this.method_6274(var2, var3);
      super.method_6218(var1, var8, var9, var4, var5, var6, var7);
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      // $FF: Couldn't be decompiled
   }
}
