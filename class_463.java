import java.util.Random;

// $FF: renamed from: e5
public class class_463 extends aji {

   // $FF: renamed from: M vL
   private IIcon field_2226;
   // $FF: renamed from: N vL
   private IIcon field_2227;
   // $FF: renamed from: O java.lang.String[]
   private static final String[] field_2228;


   // $FF: renamed from: <init> () void
   protected void method_2809() {
      super.method_2427(awt.field_4172);
      this.method_2440(true);
      this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
      this.method_2429(255);
   }

   // $FF: renamed from: a (ahb, int, int, int) kg
   public class_1343 method_2452(ahb var1, int var2, int var3, int var4) {
      return class_1343.method_7093((double)(var2 + 0), (double)(var3 + 0), (double)(var4 + 0), (double)(var2 + 1), (double)(var3 + 1), (double)(var4 + 1));
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 != 1) {
            return class_1192.field_6028.getBlockTextureFromSide(var1);
         }

         var10000 = var2;
      }

      return var10000 > 0?this.field_2226:this.field_2227;
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6;
      int var8;
      label42: {
         label41: {
            var6 = class_752.method_4253();
            boolean var10000 = this.method_2811(var1, var2, var3, var4);
            if(var6 != null) {
               if(!var10000) {
                  var8 = var1.method_2204(var2, var3 + 1, var4);
                  if(var6 == null) {
                     break label42;
                  }

                  if(var8 == 0) {
                     break label41;
                  }
               }

               var1.method_2055(var2, var3, var4, 7, 2);
            }

            if(var6 != null) {
               return;
            }
         }

         var8 = var1.method_33(var2, var3, var4);
      }

      int var7 = var8;
      var8 = var7;
      if(var6 != null) {
         if(var7 > 0) {
            var1.method_2055(var2, var3, var4, var7 - 1, 2);
            if(var6 != null) {
               return;
            }
         }

         var8 = this.method_2810(var1, var2, var3, var4);
      }

      if(var6 != null && var8 == 0) {
         var1.method_2058(var2, var3, var4, class_1192.field_6028);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, sa, float) void
   public void method_2516(ahb var1, int var2, int var3, int var4, class_689 var5, float var6) {
      String[] var7 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var7 != null) {
         if(var1.field_1832) {
            return;
         }

         float var10;
         var10000 = (var10 = var1.field_1819.nextFloat() - (var6 - 0.5F)) == 0.0F?0:(var10 < 0.0F?-1:1);
      }

      if(var7 != null) {
         if(var10000 >= 0) {
            return;
         }

         var10000 = var5 instanceof class_792;
      }

      if(var7 != null) {
         if(var10000 == 0) {
            class_1038 var8 = var1.method_2196();
            String[] var10001 = field_2228;
            boolean var9 = var8.method_5878("mobGriefing");
            if(var7 == null) {
               return;
            }

            if(!var9) {
               return;
            }
         }

         var1.method_2058(var2, var3, var4, class_1192.field_6028);
      }

   }

   // $FF: renamed from: h (ahb, int, int, int) boolean
   private boolean method_2810(ahb var1, int var2, int var3, int var4) {
      byte var6 = 0;
      String[] var5 = class_752.method_4253();
      int var7 = var2 - var6;

      int var10000;
      while(true) {
         if(var7 <= var2 + var6) {
            var10000 = var4 - var6;
            if(var5 == null) {
               break;
            }

            int var8 = var10000;

            while(true) {
               if(var8 <= var4 + var6) {
                  aji var9 = var1.getBlock(var7, var3 + 1, var8);
                  if(var5 == null) {
                     break;
                  }

                  aji var10 = var9;
                  aji var10001 = class_1192.field_6086;
                  if(var5 != null) {
                     if(var9 == class_1192.field_6086) {
                        return true;
                     }

                     var10 = var9;
                     var10001 = class_1192.field_6130;
                  }

                  if(var5 != null) {
                     if(var10 == var10001) {
                        return true;
                     }

                     var10 = var9;
                     var10001 = class_1192.field_6129;
                  }

                  if(var5 != null) {
                     if(var10 == var10001) {
                        return true;
                     }

                     var10 = var9;
                     var10001 = class_1192.field_6166;
                  }

                  if(var5 != null) {
                     if(var10 == var10001) {
                        return true;
                     }

                     var10 = var9;
                     var10001 = class_1192.field_6165;
                  }

                  if(var10 == var10001) {
                     return true;
                  }

                  ++var8;
                  if(var5 != null) {
                     continue;
                  }
               }

               ++var7;
               break;
            }

            if(var5 != null) {
               continue;
            }
         }

         var10000 = 0;
         break;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: i (ahb, int, int, int) boolean
   private boolean method_2811(ahb var1, int var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      int var6 = var2 - 4;
      String[] var5 = var10000;

      label52:
      while(true) {
         int var9 = var6;

         label49:
         while(var9 <= var2 + 4) {
            var9 = var3;
            if(var5 == null) {
               return (boolean)var9;
            }

            int var7 = var3;

            while(var7 <= var3 + 1) {
               var9 = var4 - 4;
               if(var5 == null) {
                  continue label49;
               }

               int var8 = var9;

               while(true) {
                  if(var8 <= var4 + 4) {
                     if(var5 == null) {
                        break;
                     }

                     if(var1.getBlock(var6, var7, var8).method_2424() == awt.field_4177) {
                        return true;
                     }

                     ++var8;
                     if(var5 != null) {
                        continue;
                     }
                  }

                  ++var7;
                  break;
               }

               if(var5 == null) {
                  break;
               }
            }

            ++var6;
            if(var5 != null) {
               continue label52;
            }
            break;
         }

         var9 = 0;
         return (boolean)var9;
      }
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var10000 = class_752.method_4253();
      super.method_2459(var1, var2, var3, var4, var5);
      String[] var6 = var10000;
      awt var7 = var1.getBlock(var2, var3 + 1, var4).method_2424();
      if(var6 != null && var7.method_5063()) {
         var1.method_2058(var2, var3, var4, class_1192.field_6028);
      }

   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return class_1192.field_6028.method_2464(0, var2, var3);
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return adb.method_2920(class_1192.field_6028);
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      StringBuilder var10002 = (new StringBuilder()).append(this.method_2533());
      String[] var2 = field_2228;
      this.field_2226 = var1.method_375(var10002.append("_wet").toString());
      this.field_2227 = var1.method_375(this.method_2533() + "_dry");
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "êioºáyQ ·±çuqù~b";
      int var4 = "êioºáyQ ·±çuqù~b".length();
      char var1 = 4;
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
                  field_2228 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 104;
               break;
            case 1:
               var10009 = 49;
               break;
            case 2:
               var10009 = 164;
               break;
            case 3:
               var10009 = 169;
               break;
            case 4:
               var10009 = 205;
               break;
            case 5:
               var10009 = 192;
               break;
            default:
               var10009 = 109;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
