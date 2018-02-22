import java.util.List;
import java.util.Random;

// $FF: renamed from: iC
public class class_1142 extends class_1131 {

   // $FF: renamed from: d vD[]
   private static final class_1652[] field_5887;
   // $FF: renamed from: g boolean
   private boolean field_5888;
   // $FF: renamed from: h java.lang.String
   private static final String field_5889;
   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_5890;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6327(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5753 = var4;
      this.field_5851 = this.method_6303(var2);
      String[] var10000 = class_752.method_4253();
      this.field_5752 = var3;
      String[] var5 = var10000;
      int var10001 = var3.method_6489();
      if(var5 != null) {
         var10001 = var10001 > 6?1:0;
      }

      this.field_5888 = (boolean)var10001;
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      String[] var10001 = field_5890;
      var1.initGui4("Tall", this.field_5888);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      String[] var10002 = field_5890;
      this.field_5888 = var1.method_8690("Tall");
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) iC
   public static class_1142 method_6328(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      class_1206 var8;
      label23: {
         String[] var10000 = class_752.method_4253();
         var8 = class_1206.method_6479(var2, var3, var4, -4, -1, 0, 14, 11, 15, var5);
         String[] var7 = var10000;
         boolean var9 = method_6307(var8);
         if(var7 != null) {
            if(var9 && class_1094.method_6201(var0, var8) == null) {
               break label23;
            }

            var8 = class_1206.method_6479(var2, var3, var4, -4, -1, 0, 14, 6, 15, var5);
            var9 = method_6307(var8);
         }

         if(!var9 || class_1094.method_6201(var0, var8) != null) {
            return null;
         }
      }

      class_1142 var10 = new class_1142;
      var10.method_6327(var6, var1, var8, var5);
      return var10;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      byte var10000 = this.method_6203(var1, var3);
      if(var4 != null) {
         if(var10000 != 0) {
            return false;
         }

         var10000 = 11;
      }

      byte var5 = var10000;
      boolean var11 = this.field_5888;
      if(var4 != null) {
         if(!this.field_5888) {
            var5 = 6;
         }

         this.method_6213(var1, var3, 0, 0, 0, 13, var5 - 1, 14, true, var2, class_1252.method_6598());
         this.method_6302(var1, var2, var3, this.field_5851, 4, 1, 0);
         this.method_6214(var1, var3, var2, 0.07F, 2, 1, 1, 11, 4, 13, class_1192.field_6057, class_1192.field_6057, false);
         var11 = true;
      }

      boolean var7 = true;
      int var8 = 1;

      int var12;
      while(true) {
         if(var8 <= 13) {
            var12 = (var8 - 1) % 4;
            if(var4 == null) {
               break;
            }

            label85: {
               label84: {
                  if(var4 != null) {
                     if(var12 == 0) {
                        this.method_6211(var1, var3, 1, 1, var8, 1, 4, var8, class_1192.field_6030, class_1192.field_6030, false);
                        this.method_6211(var1, var3, 12, 1, var8, 12, 4, var8, class_1192.field_6030, class_1192.field_6030, false);
                        this.method_6208(var1, class_1192.field_6077, 0, 2, 3, var8, var3);
                        this.method_6208(var1, class_1192.field_6077, 0, 11, 3, var8, var3);
                        if(var4 == null) {
                           break label85;
                        }

                        if(!this.field_5888) {
                           break label84;
                        }

                        this.method_6211(var1, var3, 1, 6, var8, 1, 9, var8, class_1192.field_6030, class_1192.field_6030, false);
                        this.method_6211(var1, var3, 12, 6, var8, 12, 9, var8, class_1192.field_6030, class_1192.field_6030, false);
                        if(var4 != null) {
                           break label84;
                        }
                     }

                     this.method_6211(var1, var3, 1, 1, var8, 1, 4, var8, class_1192.field_6074, class_1192.field_6074, false);
                     this.method_6211(var1, var3, 12, 1, var8, 12, 4, var8, class_1192.field_6074, class_1192.field_6074, false);
                     if(var4 == null) {
                        break label85;
                     }

                     var12 = this.field_5888;
                  }

                  if(var12 != 0) {
                     this.method_6211(var1, var3, 1, 6, var8, 1, 9, var8, class_1192.field_6074, class_1192.field_6074, false);
                     this.method_6211(var1, var3, 12, 6, var8, 12, 9, var8, class_1192.field_6074, class_1192.field_6074, false);
                  }
               }

               ++var8;
            }

            if(var4 != null) {
               continue;
            }
         }

         var12 = 3;
         break;
      }

      var8 = var12;

      label66: {
         while(true) {
            if(var8 < 12) {
               this.method_6211(var1, var3, 3, 1, var8, 4, 3, var8, class_1192.field_6074, class_1192.field_6074, false);
               this.method_6211(var1, var3, 6, 1, var8, 7, 3, var8, class_1192.field_6074, class_1192.field_6074, false);
               this.method_6211(var1, var3, 9, 1, var8, 10, 3, var8, class_1192.field_6074, class_1192.field_6074, false);
               var8 += 2;
               if(var4 == null) {
                  break;
               }

               if(var4 != null) {
                  continue;
               }
            }

            var11 = this.field_5888;
            if(var4 == null) {
               break label66;
            }

            if(this.field_5888) {
               this.method_6211(var1, var3, 1, 5, 1, 3, 5, 13, class_1192.field_6030, class_1192.field_6030, false);
               this.method_6211(var1, var3, 10, 5, 1, 12, 5, 13, class_1192.field_6030, class_1192.field_6030, false);
               this.method_6211(var1, var3, 4, 5, 1, 9, 5, 2, class_1192.field_6030, class_1192.field_6030, false);
               this.method_6211(var1, var3, 4, 5, 12, 9, 5, 13, class_1192.field_6030, class_1192.field_6030, false);
               this.method_6208(var1, class_1192.field_6030, 0, 9, 5, 11, var3);
               this.method_6208(var1, class_1192.field_6030, 0, 8, 5, 11, var3);
               this.method_6208(var1, class_1192.field_6030, 0, 9, 5, 10, var3);
               this.method_6211(var1, var3, 3, 6, 2, 3, 6, 12, class_1192.field_6111, class_1192.field_6111, false);
               this.method_6211(var1, var3, 10, 6, 2, 10, 6, 10, class_1192.field_6111, class_1192.field_6111, false);
               this.method_6211(var1, var3, 4, 6, 2, 9, 6, 2, class_1192.field_6111, class_1192.field_6111, false);
               this.method_6211(var1, var3, 4, 6, 12, 8, 6, 12, class_1192.field_6111, class_1192.field_6111, false);
               this.method_6208(var1, class_1192.field_6111, 0, 9, 6, 11, var3);
               this.method_6208(var1, class_1192.field_6111, 0, 8, 6, 11, var3);
               this.method_6208(var1, class_1192.field_6111, 0, 9, 6, 10, var3);
               var8 = this.method_6207(class_1192.field_6091, 3);
               this.method_6208(var1, class_1192.field_6091, var8, 10, 1, 13, var3);
               this.method_6208(var1, class_1192.field_6091, var8, 10, 2, 13, var3);
               this.method_6208(var1, class_1192.field_6091, var8, 10, 3, 13, var3);
               this.method_6208(var1, class_1192.field_6091, var8, 10, 4, 13, var3);
               this.method_6208(var1, class_1192.field_6091, var8, 10, 5, 13, var3);
               this.method_6208(var1, class_1192.field_6091, var8, 10, 6, 13, var3);
               this.method_6208(var1, class_1192.field_6091, var8, 10, 7, 13, var3);
               byte var9 = 7;
               byte var10 = 7;
               this.method_6208(var1, class_1192.field_6111, 0, var9 - 1, 9, var10, var3);
               this.method_6208(var1, class_1192.field_6111, 0, var9, 9, var10, var3);
               this.method_6208(var1, class_1192.field_6111, 0, var9 - 1, 8, var10, var3);
               this.method_6208(var1, class_1192.field_6111, 0, var9, 8, var10, var3);
               this.method_6208(var1, class_1192.field_6111, 0, var9 - 1, 7, var10, var3);
               this.method_6208(var1, class_1192.field_6111, 0, var9, 7, var10, var3);
               this.method_6208(var1, class_1192.field_6111, 0, var9 - 2, 7, var10, var3);
               this.method_6208(var1, class_1192.field_6111, 0, var9 + 1, 7, var10, var3);
               this.method_6208(var1, class_1192.field_6111, 0, var9 - 1, 7, var10 - 1, var3);
               this.method_6208(var1, class_1192.field_6111, 0, var9 - 1, 7, var10 + 1, var3);
               this.method_6208(var1, class_1192.field_6111, 0, var9, 7, var10 - 1, var3);
               this.method_6208(var1, class_1192.field_6111, 0, var9, 7, var10 + 1, var3);
               this.method_6208(var1, class_1192.field_6077, 0, var9 - 2, 8, var10, var3);
               this.method_6208(var1, class_1192.field_6077, 0, var9 + 1, 8, var10, var3);
               this.method_6208(var1, class_1192.field_6077, 0, var9 - 1, 8, var10 - 1, var3);
               this.method_6208(var1, class_1192.field_6077, 0, var9 - 1, 8, var10 + 1, var3);
               this.method_6208(var1, class_1192.field_6077, 0, var9, 8, var10 - 1, var3);
               this.method_6208(var1, class_1192.field_6077, 0, var9, 8, var10 + 1, var3);
            }

            this.method_6219(var1, var3, var2, 3, 3, 5, class_1652.method_9098(field_5887, new class_1652[]{class_1010.field_5259.getBlock07(var2, 1, 5, 2)}), 1 + var2.nextInt(4));
            break;
         }

         var11 = this.field_5888;
      }

      if(var4 != null) {
         if(var11) {
            this.method_6208(var1, class_1192.field_6025, 0, 12, 9, 1, var3);
            this.method_6219(var1, var3, var2, 12, 8, 1, class_1652.method_9098(field_5887, new class_1652[]{class_1010.field_5259.getBlock07(var2, 1, 5, 2)}), 1 + var2.nextInt(4));
         }

         var11 = true;
      }

      return var11;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "´`a&ÛÇk`£>S=";
      int var4 = "´`a&ÛÇk`£>S=".length();
      char var1 = 11;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         class_1652 var10004 = var10003.length;
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
                  field_5890 = var5;
                  String[] var10 = field_5890;
                  field_5889 = "CL_00000491";
                  class_1652[] var7 = new class_1652[4];
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5198, 0, 1, 3, 20);
                  var7[0] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5197, 0, 2, 7, 20);
                  var7[1] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5251, 0, 1, 1, 1);
                  var7[2] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5202, 0, 1, 1, 1);
                  var7[3] = var10004;
                  field_5887 = var7;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 93;
               break;
            case 1:
               var10009 = 245;
               break;
            case 2:
               var10009 = 149;
               break;
            case 3:
               var10009 = 251;
               break;
            case 4:
               var10009 = 188;
               break;
            case 5:
               var10009 = 158;
               break;
            default:
               var10009 = 65;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
