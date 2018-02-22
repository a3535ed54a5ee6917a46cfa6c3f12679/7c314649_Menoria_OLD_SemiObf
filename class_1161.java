import java.util.Random;

// $FF: renamed from: hq
public class class_1161 extends class_1151 {

   // $FF: renamed from: c aji
   private aji field_5976;
   // $FF: renamed from: d int
   private int field_5977;


   // $FF: renamed from: <init> (aji, int) void
   public void method_6361(aji var1, int var2) {
      super.method_6350(false);
      this.field_5976 = var1;
      this.field_5977 = var2;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();

      int var20;
      while(true) {
         if(var4 > 3) {
            label128: {
               label135: {
                  ahb var10000 = var1;
                  int var10001 = var3;
                  int var10002 = var4 - 1;
                  int var10003 = var5;
                  if(var6 != null) {
                     var20 = var1.method_34(var3, var10002, var5);
                     if(var6 == null) {
                        break;
                     }

                     if(var20 != 0) {
                        break label135;
                     }

                     var10000 = var1;
                     var10001 = var3;
                     var10002 = var4 - 1;
                     var10003 = var5;
                  }

                  aji var7 = var10000.getBlock(var10001, var10002, var10003);
                  aji var21 = var7;
                  Object var22 = class_1192.field_6027;
                  if(var6 != null) {
                     if(var7 == class_1192.field_6027) {
                        break label128;
                     }

                     var21 = var7;
                     var22 = class_1192.field_6028;
                  }

                  if(var6 != null) {
                     if(var21 == var22) {
                        break label128;
                     }

                     var21 = var7;
                     var22 = class_1192.field_6026;
                  }

                  if(var21 == var22 && var6 != null) {
                     break label128;
                  }
               }

               --var4;
               if(var6 != null) {
                  continue;
               }
            }
         }

         var20 = var4;
         break;
      }

      if(var6 != null) {
         if(var20 <= 3) {
            return false;
         }

         var20 = this.field_5977;
      }

      int var19 = var20;
      int var8 = 0;

      while(true) {
         if(var19 >= 0) {
            var20 = var8;
            if(var6 == null || var6 == null) {
               break;
            }

            if(var8 < 3) {
               int var9 = var19 + var2.nextInt(2);
               int var10 = var19 + var2.nextInt(2);
               int var11 = var19 + var2.nextInt(2);
               float var12 = (float)(var9 + var10 + var11) * 0.333F + 0.5F;
               int var13 = var3 - var9;

               label98:
               while(true) {
                  var20 = var13;

                  label95:
                  while(var20 <= var3 + var9) {
                     var20 = var5 - var11;
                     if(var6 == null) {
                        break label98;
                     }

                     int var14 = var20;

                     label92:
                     do {
                        var20 = var14;

                        label89:
                        while(true) {
                           if(var20 > var5 + var11) {
                              break label92;
                           }

                           var20 = var4 - var10;
                           if(var6 == null) {
                              continue label95;
                           }

                           int var15 = var20;

                           while(true) {
                              if(var15 > var4 + var10) {
                                 break label89;
                              }

                              float var16 = (float)(var13 - var3);
                              float var17 = (float)(var14 - var5);
                              float var18 = (float)(var15 - var4);
                              float var23;
                              var20 = (var23 = var16 * var16 + var17 * var17 + var18 * var18 - var12 * var12) == 0.0F?0:(var23 < 0.0F?-1:1);
                              if(var6 == null) {
                                 break;
                              }

                              if(var6 != null && var20 <= 0) {
                                 var1.method_2054(var13, var15, var14, this.field_5976, 0, 4);
                              }

                              ++var15;
                              if(var6 == null) {
                                 break label89;
                              }
                           }
                        }

                        ++var14;
                     } while(var6 != null);

                     ++var13;
                     if(var6 != null) {
                        continue label98;
                     }
                     break;
                  }

                  var3 += -(var19 + 1) + var2.nextInt(2 + var19 * 2);
                  var5 += -(var19 + 1) + var2.nextInt(2 + var19 * 2);
                  var20 = var4 + (0 - var2.nextInt(2));
                  break;
               }

               var4 = var20;
               ++var8;
               if(var6 != null) {
                  continue;
               }
            }
         }

         var20 = 1;
         break;
      }

      return (boolean)var20;
   }
}
