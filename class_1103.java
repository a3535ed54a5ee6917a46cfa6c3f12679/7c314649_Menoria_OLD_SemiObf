import java.util.List;
import java.util.Random;

// $FF: renamed from: io
public class class_1103 extends class_1099 {

   // $FF: renamed from: f java.lang.String
   private static final String field_5785 = "CL_00000464";


   // $FF: renamed from: <init> () void
   public void method_6191() {
      super.method_6191();
   }

   // $FF: renamed from: <init> (int, java.util.Random, hS, int) void
   public void method_6241(int var1, Random var2, class_1206 var3, int var4) {
      super.method_6192(var1);
      this.field_5753 = var4;
      this.field_5752 = var3;
   }

   // $FF: renamed from: b (h7, java.util.List, java.util.Random) void
   public void method_6197(class_1094 var1, List var2, Random var3) {
      this.method_6231((class_1114)var1, var2, var3, 5, 3, true);
      this.method_6231((class_1114)var1, var2, var3, 5, 11, true);
   }

   // $FF: renamed from: b (java.util.List, java.util.Random, int, int, int, int, int) io
   public static class_1103 method_6242(List var0, Random var1, int var2, int var3, int var4, int var5, int var6) {
      class_1206 var7 = class_1206.method_6479(var2, var3, var4, -5, -3, 0, 13, 14, 13, var5);
      class_1103 var10000;
      if(method_6234(var7) && class_1094.method_6201(var0, var7) == null) {
         var10000 = new class_1103;
         var10000.method_6241(var6, var1, var7, var5);
      } else {
         var10000 = null;
      }

      return var10000;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) boolean
   public boolean method_6198(ahb var1, Random var2, class_1206 var3) {
      String[] var10000 = class_752.method_4253();
      this.method_6211(var1, var3, 0, 3, 0, 12, 4, 12, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 0, 5, 0, 12, 13, 12, class_1192.field_6025, class_1192.field_6025, false);
      this.method_6211(var1, var3, 0, 5, 0, 1, 12, 12, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 11, 5, 0, 12, 12, 12, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 2, 5, 11, 4, 12, 12, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 8, 5, 11, 10, 12, 12, class_1192.field_6137, class_1192.field_6137, false);
      String[] var4 = var10000;
      this.method_6211(var1, var3, 5, 9, 11, 7, 12, 12, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 2, 5, 0, 4, 12, 1, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 8, 5, 0, 10, 12, 1, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 5, 9, 0, 7, 12, 1, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 2, 11, 2, 10, 12, 10, class_1192.field_6137, class_1192.field_6137, false);
      int var5 = 1;

      while(true) {
         if(var5 <= 11) {
            this.method_6211(var1, var3, var5, 10, 0, var5, 11, 0, class_1192.field_6138, class_1192.field_6138, false);
            this.method_6211(var1, var3, var5, 10, 12, var5, 11, 12, class_1192.field_6138, class_1192.field_6138, false);
            this.method_6211(var1, var3, 0, 10, var5, 0, 11, var5, class_1192.field_6138, class_1192.field_6138, false);
            this.method_6211(var1, var3, 12, 10, var5, 12, 11, var5, class_1192.field_6138, class_1192.field_6138, false);
            this.method_6208(var1, class_1192.field_6137, 0, var5, 13, 0, var3);
            this.method_6208(var1, class_1192.field_6137, 0, var5, 13, 12, var3);
            this.method_6208(var1, class_1192.field_6137, 0, 0, 13, var5, var3);
            this.method_6208(var1, class_1192.field_6137, 0, 12, 13, var5, var3);
            this.method_6208(var1, class_1192.field_6138, 0, var5 + 1, 13, 0, var3);
            this.method_6208(var1, class_1192.field_6138, 0, var5 + 1, 13, 12, var3);
            this.method_6208(var1, class_1192.field_6138, 0, 0, 13, var5 + 1, var3);
            this.method_6208(var1, class_1192.field_6138, 0, 12, 13, var5 + 1, var3);
            var5 += 2;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         this.method_6208(var1, class_1192.field_6138, 0, 0, 13, 0, var3);
         this.method_6208(var1, class_1192.field_6138, 0, 0, 13, 12, var3);
         this.method_6208(var1, class_1192.field_6138, 0, 0, 13, 0, var3);
         this.method_6208(var1, class_1192.field_6138, 0, 12, 13, 0, var3);
         break;
      }

      var5 = 3;

      while(true) {
         if(var5 <= 9) {
            this.method_6211(var1, var3, 1, 7, var5, 1, 8, var5, class_1192.field_6138, class_1192.field_6138, false);
            this.method_6211(var1, var3, 11, 7, var5, 11, 8, var5, class_1192.field_6138, class_1192.field_6138, false);
            var5 += 2;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var5 = this.method_6207(class_1192.field_6139, 3);
         break;
      }

      int var6 = 0;

      int var7;
      int var8;
      byte var10;
      while(true) {
         if(var6 <= 6) {
            var7 = var6 + 4;
            var10 = 5;
            if(var4 == null) {
               break;
            }

            var8 = 5;

            int var11;
            byte var10001;
            label139: {
               label167: {
                  label137: {
                     while(true) {
                        if(var8 <= 7) {
                           this.method_6208(var1, class_1192.field_6139, var5, var8, 5 + var6, var7, var3);
                           ++var8;
                           if(var4 == null) {
                              break;
                           }

                           if(var4 != null) {
                              continue;
                           }
                        }

                        var11 = var7;
                        var10001 = 5;
                        if(var4 == null) {
                           break label137;
                        }

                        if(var7 >= 5) {
                           var11 = var7;
                           var10001 = 8;
                           if(var4 == null) {
                              break label137;
                           }

                           if(var7 <= 8) {
                              this.method_6211(var1, var3, 5, 5, var7, 7, var6 + 4, var7, class_1192.field_6137, class_1192.field_6137, false);
                              if(var4 != null) {
                                 break label167;
                              }
                           }
                        }
                        break;
                     }

                     var11 = var7;
                     var10001 = 9;
                  }

                  if(var4 == null) {
                     break label139;
                  }

                  if(var11 >= var10001) {
                     var11 = var7;
                     var10001 = 10;
                     if(var4 == null) {
                        break label139;
                     }

                     if(var7 <= 10) {
                        this.method_6211(var1, var3, 5, 8, var7, 7, var6 + 4, var7, class_1192.field_6137, class_1192.field_6137, false);
                     }
                  }
               }

               var11 = var6;
               var10001 = 1;
            }

            if(var11 >= var10001) {
               this.method_6211(var1, var3, 5, 6 + var6, var7, 7, 9 + var6, var7, class_1192.field_6025, class_1192.field_6025, false);
            }

            ++var6;
            if(var4 != null) {
               continue;
            }
         }

         var10 = 5;
         break;
      }

      var6 = var10;

      while(true) {
         if(var6 <= 7) {
            this.method_6208(var1, class_1192.field_6139, var5, var6, 12, 11, var3);
            ++var6;
            if(var4 == null) {
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         this.method_6211(var1, var3, 5, 6, 7, 5, 7, 7, class_1192.field_6138, class_1192.field_6138, false);
         this.method_6211(var1, var3, 7, 6, 7, 7, 7, 7, class_1192.field_6138, class_1192.field_6138, false);
         this.method_6211(var1, var3, 5, 13, 12, 7, 13, 12, class_1192.field_6025, class_1192.field_6025, false);
         this.method_6211(var1, var3, 2, 5, 2, 3, 5, 3, class_1192.field_6137, class_1192.field_6137, false);
         this.method_6211(var1, var3, 2, 5, 9, 3, 5, 10, class_1192.field_6137, class_1192.field_6137, false);
         this.method_6211(var1, var3, 2, 5, 4, 2, 5, 8, class_1192.field_6137, class_1192.field_6137, false);
         this.method_6211(var1, var3, 9, 5, 2, 10, 5, 3, class_1192.field_6137, class_1192.field_6137, false);
         this.method_6211(var1, var3, 9, 5, 9, 10, 5, 10, class_1192.field_6137, class_1192.field_6137, false);
         this.method_6211(var1, var3, 10, 5, 4, 10, 5, 8, class_1192.field_6137, class_1192.field_6137, false);
         var6 = this.method_6207(class_1192.field_6139, 0);
         break;
      }

      var7 = this.method_6207(class_1192.field_6139, 1);
      this.method_6208(var1, class_1192.field_6139, var7, 4, 5, 2, var3);
      this.method_6208(var1, class_1192.field_6139, var7, 4, 5, 3, var3);
      this.method_6208(var1, class_1192.field_6139, var7, 4, 5, 9, var3);
      this.method_6208(var1, class_1192.field_6139, var7, 4, 5, 10, var3);
      this.method_6208(var1, class_1192.field_6139, var6, 8, 5, 2, var3);
      this.method_6208(var1, class_1192.field_6139, var6, 8, 5, 3, var3);
      this.method_6208(var1, class_1192.field_6139, var6, 8, 5, 9, var3);
      this.method_6208(var1, class_1192.field_6139, var6, 8, 5, 10, var3);
      this.method_6211(var1, var3, 3, 4, 4, 4, 4, 8, class_1192.field_6114, class_1192.field_6114, false);
      this.method_6211(var1, var3, 8, 4, 4, 9, 4, 8, class_1192.field_6114, class_1192.field_6114, false);
      this.method_6211(var1, var3, 3, 5, 4, 4, 5, 8, class_1192.field_6140, class_1192.field_6140, false);
      this.method_6211(var1, var3, 8, 5, 4, 9, 5, 8, class_1192.field_6140, class_1192.field_6140, false);
      this.method_6211(var1, var3, 4, 2, 0, 8, 2, 12, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 0, 2, 4, 12, 2, 8, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 4, 0, 0, 8, 1, 3, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 4, 0, 9, 8, 1, 12, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 0, 0, 4, 3, 1, 8, class_1192.field_6137, class_1192.field_6137, false);
      this.method_6211(var1, var3, 9, 0, 4, 12, 1, 8, class_1192.field_6137, class_1192.field_6137, false);
      var8 = 4;

      int var9;
      while(true) {
         if(var8 <= 8) {
            var10 = 0;
            if(var4 == null) {
               break;
            }

            var9 = 0;

            while(true) {
               if(var9 <= 2) {
                  this.method_6218(var1, class_1192.field_6137, 0, var8, -1, var9, var3);
                  this.method_6218(var1, class_1192.field_6137, 0, var8, -1, 12 - var9, var3);
                  ++var9;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               ++var8;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var10 = 0;
         break;
      }

      var8 = var10;

      boolean var12;
      while(true) {
         if(var8 <= 2) {
            var12 = true;
            if(var4 == null) {
               break;
            }

            var9 = 4;

            while(true) {
               if(var9 <= 8) {
                  this.method_6218(var1, class_1192.field_6137, 0, var8, -1, var9, var3);
                  this.method_6218(var1, class_1192.field_6137, 0, 12 - var8, -1, var9, var3);
                  ++var9;
                  if(var4 == null) {
                     break;
                  }

                  if(var4 != null) {
                     continue;
                  }
               }

               ++var8;
               break;
            }

            if(var4 != null) {
               continue;
            }
         }

         var12 = true;
         break;
      }

      return var12;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6222() {
      boolean var10000 = true;
      char[] var10003 = "vüH93û!=".toCharArray();
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
            field_5785 = (new String((char[])var4)).intern();
            String var2 = field_5785;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 205;
            break;
         case 1:
            var10009 = 72;
            break;
         case 2:
            var10009 = 239;
            break;
         case 3:
            var10009 = 241;
            break;
         case 4:
            var10009 = 251;
            break;
         case 5:
            var10009 = 51;
            break;
         default:
            var10009 = 219;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
