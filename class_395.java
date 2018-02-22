import java.util.List;
import java.util.Random;

// $FF: renamed from: ep
public class class_395 extends class_392 {

   // $FF: renamed from: O vL[]
   private IIcon[] field_2091;
   // $FF: renamed from: P java.lang.String
   private static final String field_2092;
   // $FF: renamed from: Q java.lang.String[]
   private static final String[] field_2093;


   // $FF: renamed from: <init> () void
   public void method_2622() {
      super.method_2614(true);
      this.method_2440(true);
   }

   // $FF: renamed from: a (ahb) int
   public int method_2460(ahb var1) {
      return 20;
   }

   // $FF: renamed from: f () boolean
   public boolean method_2497() {
      return true;
   }

   // $FF: renamed from: a (ahb, int, int, int, sa) void
   public void method_2498(ahb var1, int var2, int var3, int var4, class_689 var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var1.method_33(var2, var3, var4);
      }

      int var7 = var10000;
      if((var7 & 8) == 0) {
         this.method_2623(var1, var2, var3, var4, var7);
      }

   }

   // $FF: renamed from: a (ahb, int, int, int, java.util.Random) void
   public void method_2456(ahb var1, int var2, int var3, int var4, Random var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.field_1832;
      if(var6 != null) {
         if(var1.field_1832) {
            return;
         }

         var10000 = var1.method_33(var2, var3, var4);
      }

      int var7 = var10000;
      if((var7 & 8) != 0) {
         this.method_2623(var1, var2, var3, var4, var7);
      }

   }

   // $FF: renamed from: b (ahl, int, int, int, int) int
   public int method_2496(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.method_33(var2, var3, var4) & 8;
      if(var6 != null) {
         var10000 = var10000 != 0?15:0;
      }

      return var10000;
   }

   // $FF: renamed from: c (ahl, int, int, int, int) int
   public int method_2499(ahl var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.method_33(var2, var3, var4) & 8;
      if(var6 != null) {
         if(var10000 == 0) {
            var10000 = 0;
            return var10000;
         }

         var10000 = var5;
      }

      if(var6 != null) {
         var10000 = var10000 == 1?15:0;
      }

      return var10000;
   }

   // $FF: renamed from: h (ahb, int, int, int, int) void
   private void method_2623(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var5 & 8;
      if(var6 != null) {
         var10000 = var10000 != 0?1:0;
      }

      int var7 = var10000;
      byte var8 = 0;
      float var9 = 0.125F;
      List var10 = var1.method_2157(class_690.class, class_1343.method_7093((double)((float)var2 + var9), (double)var3, (double)((float)var4 + var9), (double)((float)(var2 + 1) - var9), (double)((float)(var3 + 1) - var9), (double)((float)(var4 + 1) - var9)));
      var10000 = var10.isEmpty();
      if(var6 != null) {
         if(var10000 == 0) {
            var8 = 1;
         }

         var10000 = var8;
      }

      if(var6 != null) {
         label47: {
            if(var10000 != 0) {
               var10000 = var7;
               if(var6 == null) {
                  break label47;
               }

               if(var7 == 0) {
                  var1.method_2055(var2, var3, var4, var5 | 8, 3);
                  var1.method_2063(var2, var3, var4, this);
                  var1.method_2063(var2, var3 - 1, var4, this);
                  var1.method_2062(var2, var3, var4, var2, var3, var4);
               }
            }

            var10000 = var8;
         }
      }

      if(var6 != null) {
         label40: {
            if(var10000 == 0) {
               var10000 = var7;
               if(var6 == null) {
                  break label40;
               }

               if(var7 != 0) {
                  var1.method_2055(var2, var3, var4, var5 & 7, 3);
                  var1.method_2063(var2, var3, var4, this);
                  var1.method_2063(var2, var3 - 1, var4, this);
                  var1.method_2062(var2, var3, var4, var2, var3, var4);
               }
            }

            var10000 = var8;
         }
      }

      if(var10000 != 0) {
         var1.method_2110(var2, var3, var4, this, this.method_2460(var1));
      }

      var1.method_2221(var2, var3, var4, this);
   }

   // $FF: renamed from: b (ahb, int, int, int) void
   public void method_2461(ahb var1, int var2, int var3, int var4) {
      super.method_2461(var1, var2, var3, var4);
      this.method_2623(var1, var2, var3, var4, var1.method_33(var2, var3, var4));
   }

   // $FF: renamed from: M () boolean
   public boolean method_2530() {
      return true;
   }

   // $FF: renamed from: g (ahb, int, int, int, int) int
   public int method_2531(ahb var1, int var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();
      int var10000 = var1.method_33(var2, var3, var4) & 8;
      if(var6 != null) {
         if(var10000 > 0) {
            float var7 = 0.125F;
            List var8 = var1.method_2157(class_698.class, class_1343.method_7093((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var7), (double)((float)(var2 + 1) - var7), (double)((float)(var3 + 1) - var7), (double)((float)(var4 + 1) - var7)));
            List var10 = var8;
            if(var6 != null) {
               if(var8.size() > 0) {
                  return ((class_698)var8.get(0)).method_4022().method_5434();
               }

               var10 = var1.method_2158(class_690.class, class_1343.method_7093((double)((float)var2 + var7), (double)var3, (double)((float)var4 + var7), (double)((float)(var2 + 1) - var7), (double)((float)(var3 + 1) - var7), (double)((float)(var4 + 1) - var7)), class_82.field_11);
            }

            List var9 = var10;
            var10000 = var9.size();
            if(var6 == null) {
               return var10000;
            }

            if(var10000 > 0) {
               return class_671.method_3676((class_22)var9.get(0));
            }
         }

         var10000 = 0;
      }

      return var10000;
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      this.field_2091 = new IIcon[2];
      this.field_2091[0] = var1.method_375(this.method_2533());
      IIcon[] var10000 = this.field_2091;
      StringBuilder var10003 = (new StringBuilder()).append(this.method_2533());
      String[] var10004 = field_2093;
      var10000[1] = var1.method_375(var10003.append("_powered").toString());
   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      return (var2 & 8) != 0?this.field_2091[1]:this.field_2091[0];
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "éWîaEé5Õg©4¼a«\n¬";
      int var4 = "éWîaEé5Õg©4¼a«\n¬".length();
      char var1 = 8;
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
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_2093 = var5;
                  String[] var10 = field_2093;
                  field_2092 = "CL_00000225";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 130;
               break;
            case 1:
               var10009 = 74;
               break;
            case 2:
               var10009 = 235;
               break;
            case 3:
               var10009 = 74;
               break;
            case 4:
               var10009 = 215;
               break;
            case 5:
               var10009 = 228;
               break;
            default:
               var10009 = 95;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
