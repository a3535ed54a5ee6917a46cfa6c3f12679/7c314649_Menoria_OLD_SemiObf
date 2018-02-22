import java.util.List;
import java.util.Random;

// $FF: renamed from: f9
public class class_418 extends aji {

   // $FF: renamed from: M vL
   private IIcon field_2137;
   // $FF: renamed from: N java.lang.String[]
   private static final String[] field_2138;


   // $FF: renamed from: <init> () void
   public void method_2675() {
      super.method_2427(awt.field_4203);
      this.method_2428(field_1980);
      this.method_2437(0.5F);
   }

   // $FF: renamed from: b (vL) void
   public void method_2676(IIcon var1) {
      this.field_2137 = var1;
   }

   // $FF: renamed from: i () void
   public void method_2677() {
      this.field_2137 = null;
   }

   // $FF: renamed from: a (ahb, int, int, int, int, yz) void
   public void method_2522(ahb var1, int var2, int var3, int var4, int var5, class_792 var6) {
      label27: {
         String[] var7 = class_752.method_4253();
         int var10000 = var6.field_3640.field_2839;
         if(var7 != null) {
            if(!var6.field_3640.field_2839) {
               break label27;
            }

            var10000 = method_2678(var5);
         }

         int var8;
         label19: {
            var8 = var10000;
            aji var9 = var1.getBlock(var2 - class_1707.field_8947[var8], var3 - class_1707.field_8948[var8], var4 - class_1707.field_8949[var8]);
            aji var10 = var9;
            class_420 var10001 = class_1192.field_6060;
            if(var7 != null) {
               if(var9 == class_1192.field_6060) {
                  break label19;
               }

               var10 = var9;
               var10001 = class_1192.field_6056;
            }

            if(var10 != var10001) {
               break label27;
            }
         }

         var1.method_2056(var2 - class_1707.field_8947[var8], var3 - class_1707.field_8948[var8], var4 - class_1707.field_8949[var8]);
      }

      super.method_2522(var1, var2, var3, var4, var5, var6);
   }

   // $FF: renamed from: a (ahb, int, int, int, aji, int) void
   public void method_2462(ahb var1, int var2, int var3, int var4, aji var5, int var6) {
      super.method_2462(var1, var2, var3, var4, var5, var6);
      int var8 = class_1707.field_8946[method_2678(var6)];
      String[] var10000 = class_752.method_4253();
      var2 += class_1707.field_8947[var8];
      String[] var7 = var10000;
      var3 += class_1707.field_8948[var8];
      var4 += class_1707.field_8949[var8];
      aji var9 = var1.getBlock(var2, var3, var4);
      if(var7 != null) {
         if(var9 != class_1192.field_6060 && var9 != class_1192.field_6056) {
            return;
         }

         var6 = var1.method_33(var2, var3, var4);
      }

      if(var7 != null && class_420.method_2687(var6)) {
         var9.method_2466(var1, var2, var3, var4, var6, 0);
         var1.method_2056(var2, var3, var4);
      }

   }

   // $FF: renamed from: a (int, int) vL
   public IIcon method_2448(int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = method_2678(var2);
      String[] var3 = var10000;
      int var6 = var1;
      int var10001 = var4;
      String[] var5;
      if(var3 != null) {
         if(var1 == var4) {
            IIcon var7 = this.field_2137;
            if(var3 != null) {
               if(this.field_2137 == null) {
                  if((var2 & 8) != 0) {
                     var5 = field_2138;
                     return class_420.method_2683("piston_top_sticky");
                  }

                  var5 = field_2138;
                  return class_420.method_2683("piston_top_normal");
               }

               var7 = this.field_2137;
            }

            return var7;
         }

         var6 = var4;
         var10001 = 6;
      }

      label34: {
         if(var3 != null) {
            if(var6 >= var10001) {
               break label34;
            }

            var6 = var1;
            var10001 = class_1707.field_8946[var4];
         }

         if(var6 == var10001) {
            var5 = field_2138;
            return class_420.method_2683("piston_top_normal");
         }
      }

      var10000 = field_2138;
      return class_420.method_2683("piston_side");
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {}

   // $FF: renamed from: b () int
   public int method_2436() {
      return 17;
   }

   // $FF: renamed from: c () boolean
   public boolean method_2453() {
      return false;
   }

   // $FF: renamed from: d () boolean
   public boolean method_2434() {
      return false;
   }

   // $FF: renamed from: c (ahb, int, int, int) boolean
   public boolean method_2480(ahb var1, int var2, int var3, int var4) {
      return false;
   }

   // $FF: renamed from: d (ahb, int, int, int, int) boolean
   public boolean method_2479(ahb var1, int var2, int var3, int var4, int var5) {
      return false;
   }

   // $FF: renamed from: a (java.util.Random) int
   public int method_2463(Random var1) {
      return 0;
   }

   // $FF: renamed from: a (ahb, int, int, int, kg, java.util.List, sa) void
   public void method_2451(ahb var1, int var2, int var3, int var4, class_1343 var5, List var6, class_689 var7) {
      int var9 = var1.method_33(var2, var3, var4);
      float var10 = 0.25F;
      float var11 = 0.375F;
      String[] var10000 = class_752.method_4253();
      float var12 = 0.625F;
      float var13 = 0.25F;
      String[] var8 = var10000;
      float var14 = 0.75F;
      if(var8 != null) {
         switch(method_2678(var9)) {
         case 0:
            this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
            super.method_2451(var1, var2, var3, var4, var5, var6, var7);
            this.method_2443(0.375F, 0.25F, 0.375F, 0.625F, 1.0F, 0.625F);
            super.method_2451(var1, var2, var3, var4, var5, var6, var7);
            if(var8 != null) {
               break;
            }
         case 1:
            this.method_2443(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.method_2451(var1, var2, var3, var4, var5, var6, var7);
            this.method_2443(0.375F, 0.0F, 0.375F, 0.625F, 0.75F, 0.625F);
            super.method_2451(var1, var2, var3, var4, var5, var6, var7);
            if(var8 != null) {
               break;
            }
         case 2:
            this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
            super.method_2451(var1, var2, var3, var4, var5, var6, var7);
            this.method_2443(0.25F, 0.375F, 0.25F, 0.75F, 0.625F, 1.0F);
            super.method_2451(var1, var2, var3, var4, var5, var6, var7);
            if(var8 != null) {
               break;
            }
         case 3:
            this.method_2443(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
            super.method_2451(var1, var2, var3, var4, var5, var6, var7);
            this.method_2443(0.25F, 0.375F, 0.0F, 0.75F, 0.625F, 0.75F);
            super.method_2451(var1, var2, var3, var4, var5, var6, var7);
            if(var8 != null) {
               break;
            }
         case 4:
            this.method_2443(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
            super.method_2451(var1, var2, var3, var4, var5, var6, var7);
            this.method_2443(0.375F, 0.25F, 0.25F, 0.625F, 0.75F, 1.0F);
            super.method_2451(var1, var2, var3, var4, var5, var6, var7);
            if(var8 != null) {
               break;
            }
         case 5:
            this.method_2443(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
            super.method_2451(var1, var2, var3, var4, var5, var6, var7);
            this.method_2443(0.0F, 0.375F, 0.25F, 0.75F, 0.625F, 0.75F);
            super.method_2451(var1, var2, var3, var4, var5, var6, var7);
         }

         this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      }

   }

   // $FF: renamed from: a (ahl, int, int, int) void
   public void method_2486(ahl var1, int var2, int var3, int var4) {
      label43: {
         String[] var5;
         label42: {
            label41: {
               label40: {
                  label39: {
                     int var6 = var1.method_33(var2, var3, var4);
                     String[] var10000 = class_752.method_4253();
                     float var7 = 0.25F;
                     var5 = var10000;
                     if(var5 != null) {
                        switch(method_2678(var6)) {
                        case 0:
                           this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
                           break;
                        case 1:
                           break label39;
                        case 2:
                           break label40;
                        case 3:
                           break label41;
                        case 4:
                           break label42;
                        case 5:
                           break label43;
                        default:
                           return;
                        }
                     }

                     if(var5 != null) {
                        return;
                     }
                  }

                  this.method_2443(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
                  if(var5 != null) {
                     return;
                  }
               }

               this.method_2443(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
               if(var5 != null) {
                  return;
               }
            }

            this.method_2443(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
            if(var5 != null) {
               return;
            }
         }

         this.method_2443(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
         if(var5 != null) {
            return;
         }
      }

      this.method_2443(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   // $FF: renamed from: a (ahb, int, int, int, aji) void
   public void method_2459(ahb var1, int var2, int var3, int var4, aji var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = method_2678(var1.method_33(var2, var3, var4));
      String[] var6 = var10000;
      aji var8 = var1.getBlock(var2 - class_1707.field_8947[var7], var3 - class_1707.field_8948[var7], var4 - class_1707.field_8949[var7]);
      aji var9 = var8;
      if(var6 != null) {
         label19: {
            if(var8 != class_1192.field_6060) {
               var9 = var8;
               if(var6 == null) {
                  break label19;
               }

               if(var8 != class_1192.field_6056) {
                  var1.method_2056(var2, var3, var4);
                  if(var6 != null) {
                     return;
                  }
               }
            }

            var9 = var8;
         }
      }

      var9.method_2459(var1, var2 - class_1707.field_8947[var7], var3 - class_1707.field_8948[var7], var4 - class_1707.field_8949[var7], var5);
   }

   // $FF: renamed from: c (int) int
   public static int method_2678(int var0) {
      return class_1715.method_9568(var0 & 7, 0, class_1707.field_8947.length - 1);
   }

   // $FF: renamed from: d (ahb, int, int, int) adb
   public adb method_2517(ahb var1, int var2, int var3, int var4) {
      int var5 = var1.method_33(var2, var3, var4);
      return (var5 & 8) != 0?adb.method_2920(class_1192.field_6056):adb.method_2920(class_1192.field_6060);
   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "{y\bp3¢[/¸0h{{y\bp3¢[2£+fq{y\bp3¢xya";
      int var4 = "{y\bp3¢[/¸0h{{y\bp3¢[2£+fq{y\bp3¢xya".length();
      char var1 = 17;
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
                  field_2138 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 251;
               break;
            case 1:
               var10009 = 224;
               break;
            case 2:
               var10009 = 139;
               break;
            case 3:
               var10009 = 244;
               break;
            case 4:
               var10009 = 172;
               break;
            case 5:
               var10009 = 60;
               break;
            default:
               var10009 = 169;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
