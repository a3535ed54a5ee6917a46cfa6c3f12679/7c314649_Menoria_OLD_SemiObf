import java.util.List;
import java.util.Random;

// $FF: renamed from: iF
public class class_1139 extends class_1131 {

   // $FF: renamed from: d vD[]
   private static final class_1652[] field_5879;
   // $FF: renamed from: g int
   protected int field_5880;
   // $FF: renamed from: h java.lang.String
   private static final String field_5881;
   // $FF: renamed from: j java.lang.String[]
   private static final String[] field_5882;


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6321(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5753 = var4;
      this.field_5851 = this.method_6303(var2);
      this.field_5752 = var3;
      this.field_5880 = var2.nextInt(5);
   }

   // $FF: renamed from: b (ro) void
   protected void method_6194(class_1583 var1) {
      super.method_6194(var1);
      String[] var10001 = field_5882;
      var1.method_8667("Type", this.field_5880);
   }

   // $FF: renamed from: c (ro) void
   protected void method_6196(class_1583 var1) {
      super.method_6196(var1);
      String[] var10002 = field_5882;
      this.field_5880 = var1.method_8681("Type");
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      this.method_6304((class_1138)var1, var2, var3, 4, 1);
      this.method_6305((class_1138)var1, var2, var3, 1, 4);
      this.method_6306((class_1138)var1, var2, var3, 1, 4);
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) iF
   public static class_1139 method_6322(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      class_1206 var7 = class_1206.method_6479(var2, var3, var4, -4, -1, 0, 11, 7, 11, var5);
      class_1139 var10000;
      if(method_6307(var7) && class_1094.method_6201(var0, var7) == null) {
         var10000 = new class_1139;
         var10000.method_6321(var6, var1, var7, var5);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.method_6203(var1, var3);
      if(var4 != null) {
         if(var10000 != 0) {
            return false;
         }

         this.method_6213(var1, var3, 0, 0, 0, 10, 6, 10, true, var2, class_1252.method_6598());
         this.method_6302(var1, var2, var3, this.field_5851, 4, 1, 0);
         this.method_6211(var1, var3, 4, 1, 10, 6, 3, 10, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6211(var1, var3, 0, 1, 4, 0, 3, 6, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6211(var1, var3, 10, 1, 4, 10, 3, 6, class_1192.field_6025, class_1192.field_6025, false);
         var10000 = this.field_5880;
      }

      if(var4 != null) {
         int var5;
         switch(var10000) {
         case 0:
            this.method_6208(var1, class_1192.field_6123, 0, 5, 1, 5, var3);
            this.method_6208(var1, class_1192.field_6123, 0, 5, 2, 5, var3);
            this.method_6208(var1, class_1192.field_6123, 0, 5, 3, 5, var3);
            this.method_6208(var1, class_1192.field_6077, 0, 4, 3, 5, var3);
            this.method_6208(var1, class_1192.field_6077, 0, 6, 3, 5, var3);
            this.method_6208(var1, class_1192.field_6077, 0, 5, 3, 4, var3);
            this.method_6208(var1, class_1192.field_6077, 0, 5, 3, 6, var3);
            this.method_6208(var1, class_1192.field_6071, 0, 4, 1, 4, var3);
            this.method_6208(var1, class_1192.field_6071, 0, 4, 1, 5, var3);
            this.method_6208(var1, class_1192.field_6071, 0, 4, 1, 6, var3);
            this.method_6208(var1, class_1192.field_6071, 0, 6, 1, 4, var3);
            this.method_6208(var1, class_1192.field_6071, 0, 6, 1, 5, var3);
            this.method_6208(var1, class_1192.field_6071, 0, 6, 1, 6, var3);
            this.method_6208(var1, class_1192.field_6071, 0, 5, 1, 4, var3);
            this.method_6208(var1, class_1192.field_6071, 0, 5, 1, 6, var3);
            if(var4 != null) {
               break;
            }
         case 1:
            var5 = 0;

            while(true) {
               if(var5 < 5) {
                  this.method_6208(var1, class_1192.field_6123, 0, 3, 1, 3 + var5, var3);
                  this.method_6208(var1, class_1192.field_6123, 0, 7, 1, 3 + var5, var3);
                  this.method_6208(var1, class_1192.field_6123, 0, 3 + var5, 1, 3, var3);
                  this.method_6208(var1, class_1192.field_6123, 0, 3 + var5, 1, 7, var3);
                  ++var5;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               this.method_6208(var1, class_1192.field_6123, 0, 5, 1, 5, var3);
               this.method_6208(var1, class_1192.field_6123, 0, 5, 2, 5, var3);
               this.method_6208(var1, class_1192.field_6123, 0, 5, 3, 5, var3);
               this.method_6208(var1, class_1192.field_6033, 0, 5, 4, 5, var3);
               break;
            }

            if(var4 != null) {
               break;
            }
         case 2:
            var5 = 1;

            while(true) {
               if(var5 <= 9) {
                  this.method_6208(var1, class_1192.field_6029, 0, 1, 3, var5, var3);
                  this.method_6208(var1, class_1192.field_6029, 0, 9, 3, var5, var3);
                  ++var5;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               var5 = 1;
               break;
            }

            while(true) {
               if(var5 <= 9) {
                  this.method_6208(var1, class_1192.field_6029, 0, var5, 3, 1, var3);
                  this.method_6208(var1, class_1192.field_6029, 0, var5, 3, 9, var3);
                  ++var5;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               this.method_6208(var1, class_1192.field_6029, 0, 5, 1, 4, var3);
               this.method_6208(var1, class_1192.field_6029, 0, 5, 1, 6, var3);
               this.method_6208(var1, class_1192.field_6029, 0, 5, 3, 4, var3);
               this.method_6208(var1, class_1192.field_6029, 0, 5, 3, 6, var3);
               this.method_6208(var1, class_1192.field_6029, 0, 4, 1, 5, var3);
               this.method_6208(var1, class_1192.field_6029, 0, 6, 1, 5, var3);
               this.method_6208(var1, class_1192.field_6029, 0, 4, 3, 5, var3);
               this.method_6208(var1, class_1192.field_6029, 0, 6, 3, 5, var3);
               break;
            }

            var5 = 1;

            while(true) {
               if(var5 <= 3) {
                  this.method_6208(var1, class_1192.field_6029, 0, 4, var5, 4, var3);
                  this.method_6208(var1, class_1192.field_6029, 0, 6, var5, 4, var3);
                  this.method_6208(var1, class_1192.field_6029, 0, 4, var5, 6, var3);
                  this.method_6208(var1, class_1192.field_6029, 0, 6, var5, 6, var3);
                  ++var5;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               this.method_6208(var1, class_1192.field_6077, 0, 5, 3, 5, var3);
               break;
            }

            var5 = 2;

            while(true) {
               if(var5 <= 8) {
                  label56: {
                     this.method_6208(var1, class_1192.field_6030, 0, 2, 3, var5, var3);
                     this.method_6208(var1, class_1192.field_6030, 0, 3, 3, var5, var3);
                     if(var4 != null) {
                        if(var4 == null) {
                           break;
                        }

                        if(var5 > 3 && var5 < 7) {
                           break label56;
                        }

                        this.method_6208(var1, class_1192.field_6030, 0, 4, 3, var5, var3);
                        this.method_6208(var1, class_1192.field_6030, 0, 5, 3, var5, var3);
                     }

                     this.method_6208(var1, class_1192.field_6030, 0, 6, 3, var5, var3);
                  }

                  this.method_6208(var1, class_1192.field_6030, 0, 7, 3, var5, var3);
                  this.method_6208(var1, class_1192.field_6030, 0, 8, 3, var5, var3);
                  ++var5;
                  if(var4 != null) {
                     continue;
                  }
               }

               this.method_6208(var1, class_1192.field_6091, this.method_6207(class_1192.field_6091, 4), 9, 1, 3, var3);
               this.method_6208(var1, class_1192.field_6091, this.method_6207(class_1192.field_6091, 4), 9, 2, 3, var3);
               this.method_6208(var1, class_1192.field_6091, this.method_6207(class_1192.field_6091, 4), 9, 3, 3, var3);
               this.method_6219(var1, var3, var2, 3, 4, 8, class_1652.method_9098(field_5879, new class_1652[]{class_1010.field_5259.getBlock06(var2)}), 1 + var2.nextInt(4));
               break;
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "Yá¼NÔ¨é®H=¬Îï";
      int var4 = "Yá¼NÔ¨é®H=¬Îï".length();
      char var1 = 4;
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
                  field_5882 = var5;
                  String[] var10 = field_5882;
                  field_5881 = "CL_00000496";
                  class_1652[] var7 = new class_1652[7];
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5123, 0, 1, 5, 10);
                  var7[0] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5124, 0, 1, 3, 5);
                  var7[1] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5189, 0, 4, 9, 5);
                  var7[2] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5121, 0, 3, 8, 10);
                  var7[3] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5155, 0, 1, 3, 15);
                  var7[4] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5118, 0, 1, 3, 15);
                  var7[5] = var10004;
                  var10004 = new class_1652;
                  var10004.method_9094(class_1010.field_5115, 0, 1, 1, 1);
                  var7[6] = var10004;
                  field_5879 = var7;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 91;
               break;
            case 1:
               var10009 = 206;
               break;
            case 2:
               var10009 = 161;
               break;
            case 3:
               var10009 = 143;
               break;
            case 4:
               var10009 = 200;
               break;
            case 5:
               var10009 = 46;
               break;
            default:
               var10009 = 98;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
