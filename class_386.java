import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

// $FF: renamed from: fV
public class class_386 extends class_385 {

   // $FF: renamed from: M boolean
   private boolean field_2067;
   // $FF: renamed from: N java.util.Map
   private static Map field_2068;
   // $FF: renamed from: O java.lang.String[]
   private static final String[] field_2069;


   // $FF: renamed from: b (ahb, int, int, int, boolean) boolean
   private boolean method_2599(ahb var1, int var2, int var3, int var4, boolean var5) {
      String[] var6 = class_752.method_4253();
      Map var10000 = field_2068;
      ahb var10001 = var1;
      if(var6 != null) {
         if(!field_2068.containsKey(var1)) {
            field_2068.put(var1, new ArrayList());
         }

         var10000 = field_2068;
         var10001 = var1;
      }

      List var7 = (List)var10000.get(var10001);
      byte var11 = var5;
      if(var6 != null) {
         if(var5 != 0) {
            class_1194 var12 = new class_1194;
            var12.method_6421(var2, var3, var4, var1.method_2184());
            var7.add(var12);
         }

         var11 = 0;
      }

      int var8 = var11;
      int var9 = 0;

      int var13;
      while(true) {
         if(var9 < var7.size()) {
            class_1194 var10 = (class_1194)var7.get(var9);
            if(var6 != null) {
               label66: {
                  var13 = var10.field_6215;
                  if(var6 == null) {
                     break;
                  }

                  if(var10.field_6215 == var2) {
                     label67: {
                        var13 = var10.field_6216;
                        int var14 = var3;
                        if(var6 != null) {
                           if(var10.field_6216 != var3) {
                              break label67;
                           }

                           var13 = var10.field_6217;
                           var14 = var4;
                        }

                        if(var6 != null) {
                           if(var13 != var14) {
                              break label67;
                           }

                           ++var8;
                           if(var6 == null) {
                              break label66;
                           }

                           var13 = var8;
                           var14 = 8;
                        }

                        if(var13 >= var14) {
                           return true;
                        }
                     }
                  }

                  ++var9;
               }
            }

            if(var6 != null) {
               continue;
            }
         }

         var13 = 0;
         break;
      }

      return (boolean)var13;
   }

   // $FF: renamed from: <init> (boolean) void
   protected void method_2600(boolean var1) {
      super.method_2595();
      this.field_2067 = var1;
      this.method_2440(true);
      this.method_2521((class_872)null);
   }

   // $FF: renamed from: a (ahb) int
   public int method_2460(ahb var1) {
      return 2;
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      String[] var5 = class_752.method_4253();
      int var10000 = var1.method_33(var2, var3, var4);
      if(var5 != null) {
         if(var10000 == 0) {
            super.method_2461(var1, var2, var3, var4);
         }

         var10000 = this.field_2067;
      }

      if(var10000 != 0) {
         var1.method_2063(var2, var3 - 1, var4, this);
         var1.method_2063(var2, var3 + 1, var4, this);
         var1.method_2063(var2 - 1, var3, var4, this);
         var1.method_2063(var2 + 1, var3, var4, this);
         var1.method_2063(var2, var3, var4 - 1, this);
         var1.method_2063(var2, var3, var4 + 1, this);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      if(this.field_2067) {
         var1.method_2063(var2, var3 - 1, var4, this);
         var1.method_2063(var2, var3 + 1, var4, this);
         var1.method_2063(var2 - 1, var3, var4, this);
         var1.method_2063(var2 + 1, var3, var4, this);
         var1.method_2063(var2, var3, var4 - 1, this);
         var1.method_2063(var2, var3, var4 + 1, this);
      }

   }

   // $FF: renamed from: b (ahl, int, int, int, int) int
   public int method_2496(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = this.field_2067;
      if(var6 != null) {
         if(!this.field_2067) {
            return 0;
         }

         var10000 = var1.method_33(var2, var3, var4);
      }

      int var7 = var10000;
      var10000 = var7;
      byte var10001 = 5;
      if(var6 != null) {
         label81: {
            if(var7 == 5) {
               var10000 = var5;
               var10001 = 1;
               if(var6 == null) {
                  break label81;
               }

               if(var5 == 1) {
                  return 0;
               }
            }

            var10000 = var7;
            var10001 = 3;
         }
      }

      if(var6 != null) {
         label74: {
            if(var10000 == var10001) {
               var10000 = var5;
               var10001 = 3;
               if(var6 == null) {
                  break label74;
               }

               if(var5 == 3) {
                  return 0;
               }
            }

            var10000 = var7;
            var10001 = 4;
         }
      }

      if(var6 != null) {
         label67: {
            if(var10000 == var10001) {
               var10000 = var5;
               var10001 = 2;
               if(var6 == null) {
                  break label67;
               }

               if(var5 == 2) {
                  return 0;
               }
            }

            var10000 = var7;
            var10001 = 1;
         }
      }

      if(var6 != null) {
         label87: {
            if(var10000 == var10001) {
               var10000 = var5;
               var10001 = 5;
               if(var6 == null) {
                  break label87;
               }

               if(var5 == 5) {
                  return 0;
               }
            }

            var10000 = var7;
            if(var6 == null) {
               return var10000;
            }

            var10001 = 2;
         }
      }

      if(var10000 == var10001) {
         var10000 = var5;
         if(var6 == null) {
            return var10000;
         }

         if(var5 == 4) {
            return 0;
         }
      }

      var10000 = 15;
      return var10000;
   }

   // $FF: renamed from: i (ahb, int, int, int) boolean
   private boolean method_2601(ahb var1, int var2, int var3, int var4) {
      int var6 = var1.method_33(var2, var3, var4);
      String[] var5 = class_752.method_4253();
      int var10000 = var6;
      byte var10001 = 5;
      if(var5 != null) {
         label81: {
            if(var6 == 5) {
               var10000 = var1.method_2170(var2, var3 - 1, var4, 0);
               if(var5 == null) {
                  break label81;
               }

               if(var10000 != 0) {
                  return true;
               }
            }

            var10000 = var6;
         }

         var10001 = 3;
      }

      if(var5 != null) {
         label73: {
            if(var10000 == var10001) {
               var10000 = var1.method_2170(var2, var3, var4 - 1, 2);
               if(var5 == null) {
                  break label73;
               }

               if(var10000 != 0) {
                  return true;
               }
            }

            var10000 = var6;
         }

         var10001 = 4;
      }

      if(var5 != null) {
         label65: {
            if(var10000 == var10001) {
               var10000 = var1.method_2170(var2, var3, var4 + 1, 3);
               if(var5 == null) {
                  break label65;
               }

               if(var10000 != 0) {
                  return true;
               }
            }

            var10000 = var6;
         }

         var10001 = 1;
      }

      if(var5 != null) {
         label53: {
            if(var10000 == var10001) {
               var10000 = var1.method_2170(var2 - 1, var3, var4, 4);
               if(var5 == null) {
                  break label53;
               }

               if(var10000 != 0) {
                  return true;
               }
            }

            var10000 = var6;
         }

         if(var5 == null) {
            return (boolean)var10000;
         }

         var10001 = 2;
      }

      if(var10000 == var10001) {
         var10000 = var1.method_2170(var2 + 1, var3, var4, 5);
         if(var5 == null) {
            return (boolean)var10000;
         }

         if(var10000 != 0) {
            return true;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      byte var7 = this.method_2601(var1, var2, var3, var4);
      String[] var10000 = class_752.method_4253();
      List var8 = (List)field_2068.get(var1);
      String[] var6 = var10000;

      int var17;
      while(true) {
         if(var8 != null) {
            var17 = var8.isEmpty();
            if(var6 == null || var6 == null) {
               break;
            }

            if(var17 == 0) {
               long var20;
               var17 = (var20 = var1.method_2184() - ((class_1194)var8.get(0)).field_6218 - 60L) == 0L?0:(var20 < 0L?-1:1);
               if(var6 == null) {
                  break;
               }

               if(var17 > 0) {
                  var8.remove(0);
                  if(var6 != null) {
                     continue;
                  }
               }
            }
         }

         var17 = this.field_2067;
         break;
      }

      if(var6 != null) {
         if(var17 != 0) {
            byte var19 = var7;
            if(var6 != null) {
               if(var7 == 0) {
                  return;
               }

               var1.method_2054(var2, var3, var4, class_1192.field_6101, var1.method_33(var2, var3, var4), 3);
               var19 = this.method_2599(var1, var2, var3, var4, true);
            }

            if(var6 != null) {
               if(var19 == 0) {
                  return;
               }

               double var10001 = (double)((float)var2 + 0.5F);
               double var10002 = (double)((float)var3 + 0.5F);
               double var10003 = (double)((float)var4 + 0.5F);
               String[] var16 = field_2069;
               var1.method_2084(var10001, var10002, var10003, "random.fizz", 0.5F, 2.6F + (var1.field_1819.nextFloat() - var1.field_1819.nextFloat()) * 0.8F);
               var19 = 0;
            }

            int var9 = var19;

            while(var9 < 5) {
               double var10 = (double)var2 + var5.nextDouble() * 0.6D + 0.2D;
               double var12 = (double)var3 + var5.nextDouble() * 0.6D + 0.2D;
               double var14 = (double)var4 + var5.nextDouble() * 0.6D + 0.2D;
               String[] var18 = field_2069;
               var1.method_2087("smoke", var10, var12, var14, 0.0D, 0.0D, 0.0D);
               ++var9;
               if(var6 == null) {
                  return;
               }

               if(var6 == null) {
                  break;
               }
            }

            if(var6 != null) {
               return;
            }
         }

         var17 = var7;
      }

      if(var6 != null) {
         if(var17 != 0) {
            return;
         }

         var17 = this.method_2599(var1, var2, var3, var4, false);
      }

      if(var6 != null && var17 == 0) {
         var1.method_2054(var2, var3, var4, class_1192.field_6102, var1.method_33(var2, var3, var4), 3);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var6 = class_752.method_4253();
      boolean var10000 = this.method_2597(var1, var2, var3, var4, var5);
      if(var6 != null) {
         if(var10000) {
            return;
         }

         var10000 = this.method_2601(var1, var2, var3, var4);
      }

      label41: {
         boolean var7 = var10000;
         var10000 = this.field_2067;
         if(var6 != null) {
            label34: {
               if(this.field_2067) {
                  var10000 = var7;
                  if(var6 == null) {
                     break label34;
                  }

                  if(var7) {
                     break label41;
                  }
               }

               var10000 = this.field_2067;
            }
         }

         if(var6 != null) {
            if(var10000) {
               return;
            }

            var10000 = var7;
         }

         if(var10000) {
            return;
         }
      }

      var1.method_2110(var2, var3, var4, this, this.method_2460(var1));
   }

   // $FF: renamed from: c (ahl, int, int, int, int) int
   public int method_2499(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5;
      if(var6 != null) {
         if(var5 == 0) {
            return this.method_2496(var1, var2, var3, var4, var5);
         }

         var10000 = 0;
      }

      return var10000;
   }

   // $FF: renamed from: a (int, java.util.Random, int) adb
   public adb method_2464(int var1, Random var2, int var3) {
      return adb.method_2920(class_1192.field_6102);
   }

   // $FF: renamed from: f () boolean
   public boolean method_2497() {
      return true;
   }

   // $FF: renamed from: b (ahb, int, int, int, java.util.Random) void
   public void method_2457(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = this.field_2067;
      if(var6 != null) {
         if(!this.field_2067) {
            return;
         }

         var10000 = var1.method_33(var2, var3, var4);
      }

      int var7 = var10000;
      double var8 = (double)((float)var2 + 0.5F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
      double var10 = (double)((float)var3 + 0.7F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
      double var12 = (double)((float)var4 + 0.5F) + (double)(var5.nextFloat() - 0.5F) * 0.2D;
      double var14 = 0.2199999988079071D;
      double var16 = 0.27000001072883606D;
      var10000 = var7;
      byte var10001 = 1;
      String[] var18;
      if(var6 != null) {
         if(var7 == 1) {
            var18 = field_2069;
            var1.method_2087("reddust", var8 - var16, var10 + var14, var12, 0.0D, 0.0D, 0.0D);
            if(var6 != null) {
               return;
            }
         }

         var10000 = var7;
         var10001 = 2;
      }

      if(var6 != null) {
         if(var10000 == var10001) {
            var18 = field_2069;
            var1.method_2087("reddust", var8 + var16, var10 + var14, var12, 0.0D, 0.0D, 0.0D);
            if(var6 != null) {
               return;
            }
         }

         var10000 = var7;
         var10001 = 3;
      }

      if(var6 != null) {
         if(var10000 == var10001) {
            var18 = field_2069;
            var1.method_2087("reddust", var8, var10 + var14, var12 - var16, 0.0D, 0.0D, 0.0D);
            if(var6 != null) {
               return;
            }
         }

         var10000 = var7;
         var10001 = 4;
      }

      if(var10000 == var10001) {
         var18 = field_2069;
         var1.method_2087("reddust", var8, var10 + var14, var12 + var16, 0.0D, 0.0D, 0.0D);
         if(var6 != null) {
            return;
         }
      }

      String[] var19 = field_2069;
      var1.method_2087("reddust", var8, var10, var12, 0.0D, 0.0D, 0.0D);
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      return adb.method_2920(class_1192.field_6102);
   }

   // $FF: renamed from: c (aji) boolean
   public boolean method_2528(aji var1) {
      boolean var3;
      label17: {
         String[] var2 = class_752.method_4253();
         aji var10000 = var1;
         aji var10001 = class_1192.field_6101;
         if(var2 != null) {
            if(var1 == class_1192.field_6101) {
               break label17;
            }

            var10000 = var1;
            var10001 = class_1192.field_6102;
         }

         if(var10000 != var10001) {
            var3 = false;
            return var3;
         }
      }

      var3 = true;
      return var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "²ÁWºÊGjO¾À]t\r¶Ô";
      int var4 = "²ÁWºÊGjO¾À]t\r¶Ô".length();
      char var1 = 5;
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
                  field_2069 = var5;
                  field_2068 = new HashMap();
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 254;
               break;
            case 1:
               var10009 = 74;
               break;
            case 2:
               var10009 = 59;
               break;
            case 3:
               var10009 = 250;
               break;
            case 4:
               var10009 = 167;
               break;
            case 5:
               var10009 = 140;
               break;
            default:
               var10009 = 174;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
