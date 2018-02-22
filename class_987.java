import java.util.List;
import java.util.Random;

// $FF: renamed from: dT
public class class_987 extends class_985 {

   // $FF: renamed from: aF hj
   private static final class_1169 field_5057;
   // $FF: renamed from: aG hm
   private static final class_1166 field_5058;
   // $FF: renamed from: aH hi
   private static final class_1171 field_5059;
   // $FF: renamed from: aI hi
   private static final class_1171 field_5060;
   // $FF: renamed from: aJ hq
   private static final class_1161 field_5061;
   // $FF: renamed from: aK int
   private int field_5062;
   // $FF: renamed from: aL java.lang.String
   private static final String field_5063;
   // $FF: renamed from: cb java.lang.String[]
   private static final String[] field_5064;


   // $FF: renamed from: <init> (int, int) void
   public void method_5728(int var1, int var2) {
      super.method_5691(var1);
      this.field_5062 = var2;
      List var10000 = this.field_5045;
      class_1653 var10001 = new class_1653;
      var10001.method_9099(class_777.class, 8, 4, 4);
      var10000.add(var10001);
      this.field_5043.field_5444 = 10;
      if(var2 != 1 && var2 != 2) {
         this.field_5043.field_5446 = 1;
         this.field_5043.field_5448 = 1;
      } else {
         this.field_5043.field_5446 = 7;
         this.field_5043.field_5447 = 1;
         this.field_5043.field_5448 = 3;
      }

   }

   // $FF: renamed from: b (java.util.Random) hd
   public class_1162 method_5696(Random var1) {
      int var10000;
      Object var3;
      label44: {
         label47: {
            String[] var2 = class_752.method_4253();
            var10000 = this.field_5062;
            if(var2 != null) {
               if(this.field_5062 != 1) {
                  var10000 = this.field_5062;
                  if(var2 == null) {
                     break label44;
                  }

                  if(this.field_5062 != 2) {
                     break label47;
                  }
               }

               var10000 = var1.nextInt(3);
            }

            if(var2 == null) {
               break label44;
            }

            if(var10000 == 0) {
               label29: {
                  var10000 = this.field_5062;
                  if(var2 != null) {
                     if(this.field_5062 == 2) {
                        break label29;
                     }

                     var10000 = var1.nextInt(13);
                  }

                  if(var10000 != 0) {
                     var3 = field_5059;
                     return (class_1162)var3;
                  }
               }

               var3 = field_5060;
               return (class_1162)var3;
            }
         }

         var10000 = var1.nextInt(3);
      }

      var3 = var10000 == 0?field_5057:field_5058;
      return (class_1162)var3;
   }

   // $FF: renamed from: c (java.util.Random) hb
   public class_1151 method_5697(Random var1) {
      class_1177 var10000;
      if(var1.nextInt(5) > 0) {
         var10000 = new class_1177;
         var10000.method_6397(class_1192.field_6058, 2);
      } else {
         var10000 = new class_1177;
         var10000.method_6397(class_1192.field_6058, 1);
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int) void
   public void method_5714(ahb var1, Random var2, int var3, int var4) {
      int var10000;
      String[] var5;
      int var6;
      int var7;
      int var8;
      int var9;
      label49: {
         label48: {
            label52: {
               var5 = class_752.method_4253();
               var10000 = this.field_5062;
               if(var5 != null) {
                  if(this.field_5062 != 1) {
                     var10000 = this.field_5062;
                     if(var5 == null) {
                        break label49;
                     }

                     if(this.field_5062 != 2) {
                        break label52;
                     }
                  }

                  var10000 = var2.nextInt(3);
               }

               var6 = var10000;
               var7 = 0;

               while(var7 < var6) {
                  var8 = var3 + var2.nextInt(16) + 8;
                  var9 = var4 + var2.nextInt(16) + 8;
                  int var10 = var1.method_2071(var8, var9);
                  field_5061.method_6351(var1, var2, var8, var10, var9);
                  ++var7;
                  if(var5 == null) {
                     break label48;
                  }

                  if(var5 == null) {
                     break;
                  }
               }
            }

            field_5030.method_6357(3);
         }

         var10000 = 0;
      }

      var6 = var10000;

      while(true) {
         if(var6 < 7) {
            var7 = var3 + var2.nextInt(16) + 8;
            var8 = var4 + var2.nextInt(16) + 8;
            var9 = var2.nextInt(var1.method_2071(var7, var8) + 32);
            field_5030.method_6351(var1, var2, var7, var9, var8);
            ++var6;
            if(var5 == null) {
               break;
            }

            if(var5 != null) {
               continue;
            }
         }

         super.method_5714(var1, var2, var3, var4);
         break;
      }

   }

   // $FF: renamed from: b (ahb, java.util.Random, aji[], byte[], int, int, double) void
   public void method_5718(ahb var1, Random var2, aji[] var3, byte[] var4, int var5, int var6, double var7) {
      class_987 var10;
      label33: {
         label35: {
            String[] var9 = class_752.method_4253();
            int var10000 = this.field_5062;
            if(var9 != null) {
               if(this.field_5062 != 1) {
                  var10 = this;
                  if(var9 == null) {
                     break label33;
                  }

                  if(this.field_5062 != 2) {
                     break label35;
                  }
               }

               this.field_5034 = class_1192.field_6027;
               this.field_5035 = 0;
               this.field_5036 = class_1192.field_6028;
               double var11;
               var10000 = (var11 = var7 - 1.75D) == 0.0D?0:(var11 < 0.0D?-1:1);
            }

            if(var9 != null) {
               if(var10000 > 0) {
                  this.field_5034 = class_1192.field_6028;
                  this.field_5035 = 1;
                  if(var9 != null) {
                     break label35;
                  }
               }

               double var12;
               var10000 = (var12 = var7 - -0.95D) == 0.0D?0:(var12 < 0.0D?-1:1);
            }

            if(var10000 > 0) {
               this.field_5034 = class_1192.field_6028;
               this.field_5035 = 2;
            }
         }

         var10 = this;
      }

      var10.method_5719(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: l () dz
   protected class_985 method_5720() {
      String[] var1 = class_752.method_4253();
      class_987 var10000 = this;
      class_985 var2;
      if(var1 != null) {
         if(this.field_5050 == class_985.field_5020.field_5050) {
            var10000 = new class_987;
            var10000.method_5728(this.field_5050 + 128, 2);
            var2 = var10000.method_5704(5858897, true);
            String[] var10001 = field_5064;
            var2 = var2.method_5700("Mega Spruce Taiga").method_5701(5159473).method_5693(0.25F, 0.8F);
            class_1019 var3 = new class_1019;
            var3.method_5793(this.field_5038, this.field_5039);
            var2 = var2.method_5694(var3);
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.method_5720();
      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5726() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "hî¤>Vé¢f½Öõ]Y­ÒñZB¿Ð";
      int var4 = "hî¤>Vé¢f½Öõ]Y­ÒñZB¿Ð".length();
      char var1 = 11;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var11 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var14 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var11)).intern();
               if((var0 += var1) >= var4) {
                  field_5064 = var5;
                  String[] var13 = field_5064;
                  field_5063 = "CL_00000186";
                  class_1169 var7 = new class_1169;
                  var7.method_6349();
                  field_5057 = var7;
                  class_1166 var9 = new class_1166;
                  var9.method_6350(false);
                  field_5058 = var9;
                  class_1171 var10 = new class_1171;
                  var10.method_6377(false, false);
                  field_5059 = var10;
                  var10 = new class_1171;
                  var10.method_6377(false, true);
                  field_5060 = var10;
                  class_1161 var12 = new class_1161;
                  var12.method_6361(class_1192.field_6075, 0);
                  field_5061 = var12;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var11)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 83;
               break;
            case 1:
               var10009 = 160;
               break;
            case 2:
               var10009 = 201;
               break;
            case 3:
               var10009 = 236;
               break;
            case 4:
               var10009 = 90;
               break;
            case 5:
               var10009 = 118;
               break;
            default:
               var10009 = 30;
            }

            ((Object[])var11)[var6] = (char)(var10007 ^ var14 ^ var10009);
            ++var6;
         }
      }
   }
}
