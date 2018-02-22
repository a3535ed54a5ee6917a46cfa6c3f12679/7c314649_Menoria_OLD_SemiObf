
// $FF: renamed from: bB
public class class_548 extends adb {

   // $FF: renamed from: n aji
   private aji field_2404;
   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_2405;


   // $FF: renamed from: <init> (aji) void
   public void getBlock22(aji var1) {
      super.method_2917();
      this.field_2333 = 1;
      this.field_2404 = var1;
      this.method_2974(class_872.field_4248);
   }

   // $FF: renamed from: a (add, ahb, yz) add
   public add method_2928(add var1, ahb var2, class_792 var3) {
      String[] var4 = class_752.method_4253();
      boolean var5 = this.field_2404 == class_1192.field_6025;
      azu var6 = this.method_2968(var2, var3, var5);
      azu var10000 = var6;
      if(var4 != null) {
         if(var6 == null) {
            return var1;
         }

         var10000 = var6;
      }

      if(var4 != null) {
         if(var10000.field_4212 != class_100.field_85) {
            return var1;
         }

         var10000 = var6;
      }

      int var7 = var10000.field_4213;
      int var8 = var6.field_4214;
      int var9 = var6.field_4215;
      boolean var13 = var2.method_2190(var3, var7, var8, var9);
      if(var4 != null) {
         if(!var13) {
            return var1;
         }

         var13 = var5;
      }

      label156: {
         if(var4 != null) {
            if(!var13) {
               break label156;
            }

            var13 = var3.method_4628(var7, var8, var9, var6.field_4216, var1);
         }

         if(!var13) {
            return var1;
         }

         awt var10 = var2.getBlock(var7, var8, var9).method_2424();
         int var11 = var2.method_33(var7, var8, var9);
         awt var15 = var10;
         awt var10001 = awt.field_4177;
         if(var4 != null) {
            if(var10 == awt.field_4177) {
               label130: {
                  if(var4 != null) {
                     if(var11 != 0) {
                        break label130;
                     }

                     var2.method_2056(var7, var8, var9);
                  }

                  return this.getBlock23(var1, var3, class_1010.field_5184);
               }
            }

            var15 = var10;
            var10001 = awt.field_4178;
         }

         if(var15 == var10001) {
            label124: {
               if(var4 != null) {
                  if(var11 != 0) {
                     break label124;
                  }

                  var2.method_2056(var7, var8, var9);
               }

               return this.getBlock23(var1, var3, class_1010.field_5185);
            }
         }

         if(var4 != null) {
            return var1;
         }
      }

      add var12;
      if(this.field_2404 == class_1192.field_6025) {
         var12 = new add;
         var12.method_3724(class_1010.field_5183);
         return var12;
      } else {
         int var16 = var6.field_4216;
         if(var4 != null) {
            if(var6.field_4216 == 0) {
               --var8;
            }

            var16 = var6.field_4216;
         }

         byte var14 = 1;
         if(var4 != null) {
            if(var16 == 1) {
               ++var8;
            }

            var16 = var6.field_4216;
            var14 = 2;
         }

         if(var4 != null) {
            if(var16 == var14) {
               --var9;
            }

            var16 = var6.field_4216;
            var14 = 3;
         }

         if(var4 != null) {
            if(var16 == var14) {
               ++var9;
            }

            var16 = var6.field_4216;
            var14 = 4;
         }

         label157: {
            if(var4 != null) {
               if(var16 == var14) {
                  --var7;
               }

               var16 = var6.field_4216;
               if(var4 == null) {
                  break label157;
               }

               var14 = 5;
            }

            if(var16 == var14) {
               ++var7;
            }

            var16 = var3.method_4628(var7, var8, var9, var6.field_4216, var1);
         }

         if(var4 != null) {
            if(var16 == 0) {
               return var1;
            }

            var16 = this.getBlock24(var2, var7, var8, var9);
         }

         if(var4 != null) {
            if(var16 == 0) {
               return var1;
            }

            var16 = var3.field_3640.field_2839;
         }

         if(var16 == 0) {
            var12 = new add;
            var12.method_3724(class_1010.field_5183);
            return var12;
         } else {
            return var1;
         }
      }
   }

   // $FF: renamed from: b (add, yz, adb) add
   private add getBlock23(add var1, class_792 var2, adb var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = var2.field_3640.field_2839;
      if(var4 != null) {
         if(var2.field_3640.field_2839) {
            return var1;
         }

         var10000 = --var1.field_2958;
      }

      add var10001;
      class_792 var5;
      label34: {
         if(var4 != null) {
            if(var10000 <= 0) {
               add var7 = new add;
               var7.method_3724(var3);
               return var7;
            }

            var5 = var2;
            if(var4 == null) {
               break label34;
            }

            class_666 var6 = var2.field_3616;
            var10001 = new add;
            var10001.method_3724(var3);
            var10000 = var6.method_3607(var10001);
         }

         if(var10000 != 0) {
            return var1;
         }

         var5 = var2;
      }

      var10001 = new add;
      var10001.method_3726(var3, 1, 0);
      var5.method_4570(var10001, false);
      return var1;
   }

   // $FF: renamed from: b (ahb, int, int, int) boolean
   public boolean getBlock24(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      aji var10000 = this.field_2404;
      if(var5 != null) {
         if(this.field_2404 == class_1192.field_6025) {
            return false;
         }

         var10000 = var1.getBlock(var2, var3, var4);
      }

      awt var6 = var10000.method_2424();
      boolean var10 = var6.method_5063();
      if(var5 != null) {
         var10 = !var10;
      }

      boolean var7 = var10;
      var10 = var1.method_34(var2, var3, var4);
      if(var5 != null) {
         if(!var10) {
            label76: {
               var10 = var7;
               if(var5 != null) {
                  if(var7) {
                     break label76;
                  }

                  var10 = false;
               }

               return var10;
            }
         }

         var10 = var1.field_1820.field_5735;
      }

      if(var5 != null) {
         if(var10 && this.field_2404 == class_1192.field_6033) {
            double var10001 = (double)((float)var2 + 0.5F);
            double var10002 = (double)((float)var3 + 0.5F);
            double var10003 = (double)((float)var4 + 0.5F);
            String[] var9 = field_2405;
            var1.method_2084(var10001, var10002, var10003, "random.fizz", 0.5F, 2.6F + (var1.field_1819.nextFloat() - var1.field_1819.nextFloat()) * 0.8F);
            int var8 = 0;

            while(var8 < 8) {
               String[] var11 = field_2405;
               var1.method_2087("largesmoke", (double)var2 + Math.random(), (double)var3 + Math.random(), (double)var4 + Math.random(), 0.0D, 0.0D, 0.0D);
               ++var8;
               if(var5 == null) {
                  return true;
               }

               if(var5 == null) {
                  break;
               }
            }

            if(var5 != null) {
               return true;
            }
         }

         var10 = var1.field_1832;
      }

      if(var5 != null) {
         if(!var10) {
            if(var5 == null) {
               return true;
            }

            if(var7) {
               var10 = var6.method_5062();
               if(var5 == null) {
                  return true;
               }

               if(!var10) {
                  var1.method_2057(var2, var3, var4, true);
               }
            }
         }

         var1.method_2054(var2, var3, var4, this.field_2404, 0, 3);
      }

      return true;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2981() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\\6\r´ÎH(\nB5ªA";
      int var4 = "\\6\r´ÎH(\nB5ªA".length();
      char var1 = 11;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2405 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 231;
               break;
            case 1:
               var10009 = 179;
               break;
            case 2:
               var10009 = 181;
               break;
            case 3:
               var10009 = 155;
               break;
            case 4:
               var10009 = 171;
               break;
            case 5:
               var10009 = 16;
               break;
            default:
               var10009 = 41;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
