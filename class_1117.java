import java.util.List;
import java.util.Random;

// $FF: renamed from: iX
public class class_1117 extends class_1116 {

   // $FF: renamed from: h java.lang.String
   private static final String field_5813 = "CL_00000533";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (iY, int, java.util.Random, int, int) void
   public void method_6275(class_1118 var1, int var2, Random var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      super.method_6266(var1, var2);
      String[] var6 = var10000;
      this.field_5753 = var3.nextInt(4);
      class_1117 var7 = this;
      class_1206 var10001;
      if(var6 != null) {
         switch(this.field_5753) {
         case 0:
         case 2:
            var10001 = new class_1206;
            var10001.method_6481(var4, 64, var5, var4 + 6 - 1, 78, var5 + 6 - 1);
            this.field_5752 = var10001;
            if(var6 != null) {
               return;
            }
         default:
            var7 = this;
         }
      }

      var10001 = new class_1206;
      var10001.method_6481(var4, 64, var5, var4 + 6 - 1, 78, var5 + 6 - 1);
      var7.field_5752 = var10001;
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      class_1249.method_6584((class_1118)var1, var2, var3, this.field_5752.field_6244 - 1, this.field_5752.field_6248 - 4, this.field_5752.field_6246 + 1, 1, this.method_6200());
      class_1249.method_6584((class_1118)var1, var2, var3, this.field_5752.field_6247 + 1, this.field_5752.field_6248 - 4, this.field_5752.field_6246 + 1, 3, this.method_6200());
      class_1249.method_6584((class_1118)var1, var2, var3, this.field_5752.field_6244 + 1, this.field_5752.field_6248 - 4, this.field_5752.field_6246 - 1, 2, this.method_6200());
      class_1249.method_6584((class_1118)var1, var2, var3, this.field_5752.field_6244 + 1, this.field_5752.field_6248 - 4, this.field_5752.field_6249 + 1, 0, this.method_6200());
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var4 = class_752.method_4253();
      int var10000 = this.field_5808;
      if(var4 != null) {
         if(this.field_5808 < 0) {
            this.field_5808 = this.method_6269(var1, var3);
            class_1117 var7 = this;
            if(var4 != null) {
               if(this.field_5808 < 0) {
                  return true;
               }

               var7 = this;
            }

            var7.field_5752.method_6486(0, this.field_5808 - this.field_5752.field_6248 + 3, 0);
         }

         this.method_6211(var1, var3, 1, 0, 1, 4, 12, 4, class_1192.field_6029, class_1192.field_6033, false);
         this.method_6208(var1, class_1192.field_6025, 0, 2, 12, 2, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 3, 12, 2, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 2, 12, 3, var3);
         this.method_6208(var1, class_1192.field_6025, 0, 3, 12, 3, var3);
         this.method_6208(var1, class_1192.field_6111, 0, 1, 13, 1, var3);
         this.method_6208(var1, class_1192.field_6111, 0, 1, 14, 1, var3);
         this.method_6208(var1, class_1192.field_6111, 0, 4, 13, 1, var3);
         this.method_6208(var1, class_1192.field_6111, 0, 4, 14, 1, var3);
         this.method_6208(var1, class_1192.field_6111, 0, 1, 13, 4, var3);
         this.method_6208(var1, class_1192.field_6111, 0, 1, 14, 4, var3);
         this.method_6208(var1, class_1192.field_6111, 0, 4, 13, 4, var3);
         this.method_6208(var1, class_1192.field_6111, 0, 4, 14, 4, var3);
         this.method_6211(var1, var3, 1, 15, 1, 4, 15, 4, class_1192.field_6029, class_1192.field_6029, false);
         var10000 = 0;
      }

      int var5 = var10000;

      label80:
      while(true) {
         var10000 = var5;

         boolean var8;
         label77:
         while(var10000 <= 5) {
            var8 = false;
            if(var4 == null) {
               return var8;
            }

            int var6 = 0;

            while(var6 <= 5) {
               var10000 = var6;
               if(var4 == null) {
                  continue label77;
               }

               label71: {
                  label87: {
                     if(var4 != null) {
                        if(var6 == 0) {
                           break label87;
                        }

                        var10000 = var6;
                     }

                     if(var4 != null) {
                        if(var10000 == 5) {
                           break label87;
                        }

                        var10000 = var5;
                     }

                     if(var4 != null) {
                        if(var10000 == 0) {
                           break label87;
                        }

                        var10000 = var5;
                     }

                     if(var10000 != 5) {
                        break label71;
                     }
                  }

                  this.method_6208(var1, class_1192.field_6038, 0, var6, 11, var5, var3);
                  this.method_6217(var1, var6, 12, var5, var3);
               }

               ++var6;
               if(var4 == null) {
                  break;
               }
            }

            ++var5;
            if(var4 != null) {
               continue label80;
            }
            break;
         }

         var8 = true;
         return var8;
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "ùC£-¡ß°:Ï.".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_5813 = (new String((char[])var4)).intern();
            String var2 = field_5813;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 77;
            break;
         case 1:
            var10009 = 248;
            break;
         case 2:
            var10009 = 11;
            break;
         case 3:
            var10009 = 234;
            break;
         case 4:
            var10009 = 102;
            break;
         case 5:
            var10009 = 24;
            break;
         default:
            var10009 = 119;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
