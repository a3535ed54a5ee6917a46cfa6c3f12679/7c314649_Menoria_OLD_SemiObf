import java.util.List;
import java.util.Random;

// $FF: renamed from: dD
public class class_1003 extends class_985 {

   // $FF: renamed from: aG int
   private int field_5095;
   // $FF: renamed from: aH hf
   protected static final class_1173 field_5096;
   // $FF: renamed from: aI hf
   protected static final class_1173 field_5097;
   // $FF: renamed from: aJ hk
   protected static final class_1168 field_5098;
   // $FF: renamed from: aK java.lang.String
   private static final String field_5099;
   // $FF: renamed from: cb java.lang.String[]
   private static final String[] field_5100;


   // $FF: renamed from: <init> (int, int) void
   public void method_5737(int var1, int var2) {
      super.method_5691(var1);
      this.field_5095 = var2;
      this.field_5043.field_5444 = 10;
      this.field_5043.field_5446 = 2;
      if(this.field_5095 == 1) {
         this.field_5043.field_5444 = 6;
         this.field_5043.field_5445 = 100;
         this.field_5043.field_5446 = 1;
      }

      this.method_5701(5159473);
      this.method_5693(0.7F, 0.8F);
      if(this.field_5095 == 2) {
         this.field_5033 = 353825;
         this.field_5032 = 3175492;
         this.method_5693(0.6F, 0.6F);
      }

      if(this.field_5095 == 0) {
         List var10000 = this.field_5045;
         class_1653 var10001 = new class_1653;
         var10001.method_9099(class_777.class, 5, 4, 4);
         var10000.add(var10001);
      }

      if(this.field_5095 == 3) {
         this.field_5043.field_5444 = -999;
      }

   }

   // $FF: renamed from: b (int, boolean) dz
   protected class_985 method_5704(int var1, boolean var2) {
      String[] var3 = class_752.method_4253();
      Object var10000 = this;
      if(var3 != null) {
         if(this.field_5095 == 2) {
            this.field_5033 = 353825;
            class_1003 var4 = this;
            if(var3 != null) {
               this.field_5032 = var1;
               if(var2) {
                  this.field_5033 = (this.field_5033 & 16711422) >> 1;
               }

               var4 = this;
            }

            return var4;
         }

         var10000 = super.method_5704(var1, var2);
      }

      return (class_985)var10000;
   }

   // $FF: renamed from: b (java.util.Random) hd
   public class_1162 method_5696(Random var1) {
      Object var3;
      label35: {
         int var10000;
         label38: {
            String[] var2 = class_752.method_4253();
            var10000 = this.field_5095;
            byte var10001 = 3;
            if(var2 != null) {
               label25: {
                  if(this.field_5095 == 3) {
                     var10000 = var1.nextInt(3);
                     if(var2 == null) {
                        break label25;
                     }

                     if(var10000 > 0) {
                        var3 = field_5098;
                        return (class_1162)var3;
                     }
                  }

                  var10000 = this.field_5095;
               }

               if(var2 == null) {
                  break label38;
               }

               var10001 = 2;
            }

            if(var10000 == var10001) {
               break label35;
            }

            var10000 = var1.nextInt(5);
         }

         if(var10000 != 0) {
            var3 = this.field_5051;
            return (class_1162)var3;
         }
      }

      var3 = field_5097;
      return (class_1162)var3;
   }

   // $FF: renamed from: b (java.util.Random, int, int, int) java.lang.String
   public String method_5698(Random var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      class_1003 var10000 = this;
      if(var5 != null) {
         if(this.field_5095 == 1) {
            double var6 = class_1715.method_9570((1.0D + field_5029.method_6900((double)var2 / 48.0D, (double)var4 / 48.0D)) / 2.0D, 0.0D, 0.9999D);
            int var8 = (int)(var6 * (double)class_447.field_2190.length);
            int var9 = var8;
            if(var5 != null) {
               if(var8 != 1) {
                  return class_447.field_2190[var8];
               }

               var9 = 0;
            }

            var8 = var9;
            return class_447.field_2190[var8];
         }

         var10000 = this;
      }

      return var10000.method_5698(var1, var2, var3, var4);
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int) void
   public void method_5714(ahb var1, Random var2, int var3, int var4) {
      String[] var5;
      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      int var10000;
      byte var10001;
      label133: {
         var5 = class_752.method_4253();
         var10000 = this.field_5095;
         var10001 = 3;
         if(var5 != null) {
            if(this.field_5095 == 3) {
               var6 = 0;

               label128:
               do {
                  var10000 = var6;

                  label125:
                  while(true) {
                     if(var10000 >= 4) {
                        break label128;
                     }

                     var10000 = 0;
                     if(var5 == null) {
                        break label133;
                     }

                     var7 = 0;

                     while(true) {
                        if(var7 >= 4) {
                           break label125;
                        }

                        var8 = var3 + var6 * 4 + 1 + 8 + var2.nextInt(3);
                        var9 = var4 + var7 * 4 + 1 + 8 + var2.nextInt(3);
                        var10 = var1.method_2071(var8, var9);
                        var10000 = var2.nextInt(20);
                        if(var5 == null) {
                           break;
                        }

                        label108: {
                           label139: {
                              if(var10000 == 0) {
                                 class_1190 var15 = new class_1190;
                                 var15.method_6349();
                                 class_1190 var11 = var15;
                                 var11.method_6351(var1, var2, var8, var10, var9);
                                 if(var5 != null) {
                                    break label139;
                                 }
                              }

                              class_1162 var13 = this.method_5696(var2);
                              var13.method_6352(1.0D, 1.0D, 1.0D);
                              if(var5 == null) {
                                 break label108;
                              }

                              if(var13.method_6351(var1, var2, var8, var10, var9)) {
                                 var13.method_6363(var1, var2, var8, var10, var9);
                              }
                           }

                           ++var7;
                        }

                        if(var5 == null) {
                           break label125;
                        }
                     }
                  }

                  ++var6;
               } while(var5 != null);
            }

            var10000 = var2.nextInt(5);
            var10001 = 3;
         }

         var6 = var10000 - var10001;
         var10000 = this.field_5095;
      }

      if(var5 != null) {
         if(var10000 == 1) {
            var6 += 2;
         }

         var10000 = 0;
      }

      var7 = var10000;

      label98:
      while(true) {
         var10000 = var7;

         label95:
         while(var10000 < var6) {
            var8 = var2.nextInt(3);
            if(var5 == null) {
               return;
            }

            label92: {
               label142: {
                  var10000 = var8;
                  if(var5 != null) {
                     if(var8 == 0) {
                        field_5030.method_6357(1);
                        if(var5 != null) {
                           break label142;
                        }
                     }

                     var10000 = var8;
                  }

                  var10001 = 1;
                  if(var5 != null) {
                     if(var10000 == 1) {
                        field_5030.method_6357(4);
                        if(var5 != null) {
                           break label142;
                        }
                     }

                     var10000 = var8;
                     if(var5 == null) {
                        break label92;
                     }

                     var10001 = 2;
                  }

                  if(var10000 == var10001) {
                     field_5030.method_6357(5);
                  }
               }

               var10000 = 0;
            }

            var9 = var10000;

            while(true) {
               if(var9 < 5) {
                  var10 = var3 + var2.nextInt(16) + 8;
                  int var14 = var4 + var2.nextInt(16) + 8;
                  int var12 = var2.nextInt(var1.method_2071(var10, var14) + 32);
                  if(var5 == null) {
                     break;
                  }

                  var10000 = field_5030.method_6351(var1, var2, var10, var12, var14);
                  if(var5 == null) {
                     continue label95;
                  }

                  if(var10000 == 0) {
                     ++var9;
                     if(var5 != null) {
                        continue;
                     }
                  }
               }

               ++var7;
               break;
            }

            if(var5 != null) {
               continue label98;
            }
            break;
         }

         super.method_5714(var1, var2, var3, var4);
         return;
      }
   }

   // $FF: renamed from: c (int, int, int) int
   public int method_5715(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = super.method_5715(var1, var2, var3);
      String[] var4 = var10000;
      int var6 = this.field_5095;
      byte var10001 = 3;
      if(var4 != null) {
         if(this.field_5095 != 3) {
            var6 = var5;
            return var6;
         }

         var6 = (var5 & 16711422) + 2634762;
         var10001 = 1;
      }

      var6 >>= var10001;
      return var6;
   }

   // $FF: renamed from: l () dz
   protected class_985 method_5720() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_5050;
      int var10001 = class_985.field_4992.field_5050;
      if(var1 != null) {
         if(this.field_5050 == class_985.field_4992.field_5050) {
            class_1003 var4 = new class_1003;
            var4.method_5737(this.field_5050 + 128, 1);
            class_1003 var2 = var4;
            class_1019 var5 = new class_1019;
            var5.method_5793(this.field_5038, this.field_5039 + 0.2F);
            var2.method_5694(var5);
            String[] var6 = field_5100;
            var2.method_5700("Flower Forest");
            var2.method_5704(6976549, true);
            var2.method_5701(8233509);
            return var2;
         }

         var10000 = this.field_5050;
         var10001 = class_985.field_5015.field_5050;
      }

      Object var3;
      label24: {
         if(var1 != null) {
            if(var10000 == var10001) {
               break label24;
            }

            var10000 = this.field_5050;
            var10001 = class_985.field_5016.field_5050;
         }

         if(var10000 != var10001) {
            var3 = new class_996;
            ((class_996)var3).method_5730(this, this.field_5050 + 128, this);
            return (class_985)var3;
         }
      }

      var3 = new class_997;
      ((class_997)var3).method_5731(this, this.field_5050 + 128, this);
      return (class_985)var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5726() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "·¿OzÓ8-·¼RhÅ>²=z=Áâ=";
      int var4 = "·¿OzÓ8-·¼RhÅ>²=z=Áâ=".length();
      char var1 = 13;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var11 = true;
         char[] var9 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var9;
            var9 = var10001;
            var10001 = var10003;
            char[] var13 = var9;
            var9 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var11)).intern();
               if((var0 += var1) >= var4) {
                  field_5100 = var5;
                  String[] var12 = field_5100;
                  field_5099 = "CL_00000170";
                  class_1173 var8 = new class_1173;
                  var8.method_6383(false, true);
                  field_5096 = var8;
                  var8 = new class_1173;
                  var8.method_6383(false, false);
                  field_5097 = var8;
                  class_1168 var10 = new class_1168;
                  var10.method_6350(false);
                  field_5098 = var10;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var11)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 149;
               break;
            case 1:
               var10009 = 183;
               break;
            case 2:
               var10009 = 68;
               break;
            case 3:
               var10009 = 105;
               break;
            case 4:
               var10009 = 210;
               break;
            case 5:
               var10009 = 46;
               break;
            default:
               var10009 = 105;
            }

            ((Object[])var11)[var6] = (char)(var10007 ^ var13 ^ var10009);
            ++var6;
         }
      }
   }
}
