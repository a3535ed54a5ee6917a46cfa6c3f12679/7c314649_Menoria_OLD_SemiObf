import java.util.Random;

// $FF: renamed from: dC
public class class_1004 extends class_985 {

   // $FF: renamed from: aF hb
   private class_1151 field_5101;
   // $FF: renamed from: aG hm
   private class_1166 field_5102;
   // $FF: renamed from: aH int
   private int field_5103;
   // $FF: renamed from: aI int
   private int field_5104;
   // $FF: renamed from: aJ int
   private int field_5105;
   // $FF: renamed from: aK int
   private int field_5106;
   // $FF: renamed from: cb java.lang.String
   private static final String field_5107 = " M";


   // $FF: renamed from: <init> (int, boolean) void
   protected void method_5738(int var1, boolean var2) {
      super.method_5691(var1);
      class_1183 var10001 = new class_1183;
      var10001.method_6401(class_1192.field_6122, 8);
      this.field_5101 = var10001;
      class_1166 var3 = new class_1166;
      var3.method_6350(false);
      this.field_5102 = var3;
      this.field_5103 = 0;
      this.field_5104 = 1;
      this.field_5105 = 2;
      this.field_5106 = this.field_5103;
      if(var2) {
         this.field_5043.field_5444 = 3;
         this.field_5106 = this.field_5104;
      }

   }

   // $FF: renamed from: b (java.util.Random) hd
   public class_1162 method_5696(Random var1) {
      return (class_1162)(var1.nextInt(3) > 0?this.field_5102:super.method_5696(var1));
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int) void
   public void method_5714(ahb var1, Random var2, int var3, int var4) {
      String[] var10000 = class_752.method_4253();
      super.method_5714(var1, var2, var3, var4);
      int var6 = 3 + var2.nextInt(6);
      String[] var5 = var10000;
      int var7 = 0;

      int var8;
      int var9;
      while(true) {
         if(var7 < var6) {
            var8 = var3 + var2.nextInt(16);
            var9 = var2.nextInt(28) + 4;
            int var10 = var4 + var2.nextInt(16);
            if(var5 == null) {
               break;
            }

            if(var5 != null) {
               if(var1.getBlock(var8, var9, var10) == class_1192.field_6026) {
                  var1.method_2054(var8, var9, var10, class_1192.field_6153, 0, 2);
               }

               ++var7;
            }

            if(var5 != null) {
               continue;
            }
         }

         var6 = 0;
         break;
      }

      while(var6 < 7) {
         var7 = var3 + var2.nextInt(16);
         var8 = var2.nextInt(64);
         var9 = var4 + var2.nextInt(16);
         this.field_5101.method_6351(var1, var2, var7, var8, var9);
         ++var6;
         if(var5 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (ahb, java.util.Random, aji[], byte[], int, int, double) void
   public void method_5718(ahb var1, Random var2, aji[] var3, byte[] var4, int var5, int var6, double var7) {
      class_1004 var10;
      label46: {
         label48: {
            String[] var9;
            int var10000;
            label44: {
               label49: {
                  this.field_5034 = class_1192.field_6027;
                  this.field_5035 = 0;
                  var9 = class_752.method_4253();
                  this.field_5036 = class_1192.field_6028;
                  double var11;
                  var10000 = (var11 = var7 - -1.0D) == 0.0D?0:(var11 < 0.0D?-1:1);
                  if(var9 != null) {
                     if(var10000 >= 0) {
                        double var12;
                        var10000 = (var12 = var7 - 2.0D) == 0.0D?0:(var12 < 0.0D?-1:1);
                        if(var9 == null) {
                           break label44;
                        }

                        if(var10000 <= 0) {
                           break label49;
                        }
                     }

                     var10000 = this.field_5106;
                  }

                  if(var9 == null) {
                     break label44;
                  }

                  if(var10000 == this.field_5105) {
                     this.field_5034 = class_1192.field_6038;
                     this.field_5036 = class_1192.field_6038;
                     if(var9 != null) {
                        break label48;
                     }
                  }
               }

               double var13;
               var10000 = (var13 = var7 - 1.0D) == 0.0D?0:(var13 < 0.0D?-1:1);
            }

            if(var9 != null) {
               if(var10000 <= 0) {
                  break label48;
               }

               var10 = this;
               if(var9 == null) {
                  break label46;
               }

               var10000 = this.field_5106;
            }

            if(var10000 != this.field_5104) {
               this.field_5034 = class_1192.field_6026;
               this.field_5036 = class_1192.field_6026;
            }
         }

         var10 = this;
      }

      var10.method_5719(var1, var2, var3, var4, var5, var6, var7);
   }

   // $FF: renamed from: a (dz) dC
   private class_1004 method_5739(class_985 var1) {
      this.field_5106 = this.field_5105;
      this.method_5704(var1.field_5032, true);
      this.method_5700(var1.field_5031 + " M");
      class_1019 var10001 = new class_1019;
      var10001.method_5793(var1.field_5038, var1.field_5039);
      this.method_5694(var10001);
      this.method_5693(var1.field_5040, var1.field_5041);
      return this;
   }

   // $FF: renamed from: l () dz
   protected class_985 method_5720() {
      class_1004 var10000 = new class_1004;
      var10000.method_5738(this.field_5050 + 128, false);
      return var10000.method_5739(this);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5726() {
      boolean var10000 = true;
      char[] var10003 = "S".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_5107 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 141;
            break;
         case 1:
            var10009 = 168;
            break;
         case 2:
            var10009 = 166;
            break;
         case 3:
            var10009 = 26;
            break;
         case 4:
            var10009 = 54;
            break;
         case 5:
            var10009 = 95;
            break;
         default:
            var10009 = 54;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
