import java.util.Random;

// $FF: renamed from: hI
public class class_1183 extends class_1151 {

   // $FF: renamed from: c aji
   private aji field_6013;
   // $FF: renamed from: d int
   private int field_6014;
   // $FF: renamed from: e aji
   private aji field_6015;
   // $FF: renamed from: f java.lang.String
   private static final String field_6016 = "CL_00000426";


   // $FF: renamed from: <init> (aji, int) void
   public void method_6401(aji var1, int var2) {
      this.method_6402(var1, var2, class_1192.field_6026);
   }

   // $FF: renamed from: <init> (aji, int, aji) void
   public void method_6402(aji var1, int var2, aji var3) {
      super.method_6349();
      this.field_6013 = var1;
      this.field_6014 = var2;
      this.field_6015 = var3;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      float var7 = var2.nextFloat() * 3.1415927F;
      double var8 = (double)((float)(var3 + 8) + class_1715.method_9555(var7) * (float)this.field_6014 / 8.0F);
      String[] var6 = var10000;
      double var10 = (double)((float)(var3 + 8) - class_1715.method_9555(var7) * (float)this.field_6014 / 8.0F);
      double var12 = (double)((float)(var5 + 8) + class_1715.method_9556(var7) * (float)this.field_6014 / 8.0F);
      double var14 = (double)((float)(var5 + 8) - class_1715.method_9556(var7) * (float)this.field_6014 / 8.0F);
      double var16 = (double)(var4 + var2.nextInt(3) - 2);
      double var18 = (double)(var4 + var2.nextInt(3) - 2);
      int var20 = 0;

      label98:
      while(true) {
         int var48 = var20;

         label95:
         while(var48 <= this.field_6014) {
            double var21 = var8 + (var10 - var8) * (double)var20 / (double)this.field_6014;
            double var23 = var16 + (var18 - var16) * (double)var20 / (double)this.field_6014;
            double var25 = var12 + (var14 - var12) * (double)var20 / (double)this.field_6014;
            double var27 = var2.nextDouble() * (double)this.field_6014 / 16.0D;
            double var29 = (double)(class_1715.method_9555((float)var20 * 3.1415927F / (float)this.field_6014) + 1.0F) * var27 + 1.0D;
            double var31 = (double)(class_1715.method_9555((float)var20 * 3.1415927F / (float)this.field_6014) + 1.0F) * var27 + 1.0D;
            int var33 = class_1715.method_9561(var21 - var29 / 2.0D);
            int var34 = class_1715.method_9561(var23 - var31 / 2.0D);
            int var35 = class_1715.method_9561(var25 - var29 / 2.0D);
            int var36 = class_1715.method_9561(var21 + var29 / 2.0D);
            int var37 = class_1715.method_9561(var23 + var31 / 2.0D);
            int var38 = class_1715.method_9561(var25 + var29 / 2.0D);
            var48 = var33;
            if(var6 == null) {
               return (boolean)var48;
            }

            int var39 = var33;

            label92:
            do {
               var48 = var39;

               label89:
               while(true) {
                  if(var48 > var36) {
                     break label92;
                  }

                  double var40 = ((double)var39 + 0.5D - var21) / (var29 / 2.0D);
                  if(var6 == null) {
                     break;
                  }

                  double var50;
                  var48 = (var50 = var40 * var40 - 1.0D) == 0.0D?0:(var50 < 0.0D?-1:1);
                  if(var6 == null) {
                     continue label95;
                  }

                  if(var48 < 0) {
                     int var42 = var34;

                     label84:
                     do {
                        var48 = var42;

                        label81:
                        while(true) {
                           if(var48 > var37) {
                              break label84;
                           }

                           double var43 = ((double)var42 + 0.5D - var23) / (var31 / 2.0D);
                           if(var6 == null) {
                              break;
                           }

                           double var51;
                           var48 = (var51 = var40 * var40 + var43 * var43 - 1.0D) == 0.0D?0:(var51 < 0.0D?-1:1);
                           if(var6 == null) {
                              continue label89;
                           }

                           if(var48 < 0) {
                              int var45 = var35;

                              while(var45 <= var38) {
                                 double var46 = ((double)var45 + 0.5D - var25) / (var29 / 2.0D);
                                 if(var6 != null) {
                                    double var52;
                                    var48 = (var52 = var40 * var40 + var43 * var43 + var46 * var46 - 1.0D) == 0.0D?0:(var52 < 0.0D?-1:1);
                                    if(var6 == null) {
                                       continue label81;
                                    }

                                    if(var48 < 0) {
                                       label69: {
                                          ahb var49 = var1;
                                          int var10001 = var39;
                                          int var10002 = var42;
                                          int var10003 = var45;
                                          if(var6 != null) {
                                             if(var1.getBlock(var39, var42, var45) != this.field_6015) {
                                                break label69;
                                             }

                                             var49 = var1;
                                             var10001 = var39;
                                             var10002 = var42;
                                             var10003 = var45;
                                          }

                                          var49.method_2054(var10001, var10002, var10003, this.field_6013, 0, 2);
                                       }
                                    }

                                    ++var45;
                                 }

                                 if(var6 == null) {
                                    break;
                                 }
                              }
                           }

                           ++var42;
                           break;
                        }
                     } while(var6 != null);
                  }

                  ++var39;
                  break;
               }
            } while(var6 != null);

            ++var20;
            if(var6 != null) {
               continue label98;
            }
            break;
         }

         var48 = 1;
         return (boolean)var48;
      }
   }

   // $FF: renamed from: <clinit> () void
   static void method_6403() {
      boolean var10000 = true;
      char[] var10003 = "4(}¡dèLE{".toCharArray();
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
            field_6016 = (new String((char[])var4)).intern();
            String var2 = field_6016;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 252;
            break;
         case 1:
            var10009 = 92;
            break;
         case 2:
            var10009 = 83;
            break;
         case 3:
            var10009 = 105;
            break;
         case 4:
            var10009 = 181;
            break;
         case 5:
            var10009 = 3;
            break;
         default:
            var10009 = 112;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
