import java.util.Random;

// $FF: renamed from: hC
public class class_1189 extends class_1151 {

   // $FF: renamed from: c aji
   private aji field_6020;
   // $FF: renamed from: d int
   private int field_6021;


   // $FF: renamed from: <init> (int) void
   public void method_6407(int var1) {
      super.method_6349();
      this.field_6020 = class_1192.field_6188;
      this.field_6021 = var1;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();

      int var10000;
      byte var10001;
      while(true) {
         if(var1.method_34(var3, var4, var5)) {
            var10000 = var4;
            var10001 = 2;
            if(var6 == null) {
               break;
            }

            if(var4 > 2) {
               --var4;
               if(var6 != null) {
                  continue;
               }
            }
         }

         if(var1.getBlock(var3, var4, var5) != class_1192.field_6106) {
            return false;
         }

         var10000 = var2.nextInt(this.field_6021 - 2);
         var10001 = 2;
         break;
      }

      int var7 = var10000 + var10001;
      byte var8 = 1;
      int var9 = var3 - var7;

      label91:
      while(true) {
         var10000 = var9;
         int var15 = var3 + var7;

         label88:
         while(var10000 <= var15) {
            var10000 = var5 - var7;
            if(var6 == null) {
               return (boolean)var10000;
            }

            int var10 = var10000;

            while(var10 <= var5 + var7) {
               int var11 = var9 - var3;
               int var12 = var10 - var5;
               var10000 = var11 * var11 + var12 * var12;
               var15 = var7 * var7;
               if(var6 == null) {
                  continue label88;
               }

               label82: {
                  label109: {
                     if(var6 != null) {
                        if(var10000 > var15) {
                           break label109;
                        }

                        var10000 = var4;
                        var15 = var8;
                     }

                     int var13 = var10000 - var15;

                     while(var13 <= var4 + var8) {
                        aji var14 = var1.getBlock(var9, var13, var10);
                        if(var6 == null) {
                           break label82;
                        }

                        label66: {
                           label111: {
                              aji var16 = var14;
                              aji var17 = class_1192.field_6028;
                              if(var6 != null) {
                                 if(var14 == class_1192.field_6028) {
                                    break label111;
                                 }

                                 var16 = var14;
                                 var17 = class_1192.field_6106;
                              }

                              if(var6 != null) {
                                 if(var16 == var17) {
                                    break label111;
                                 }

                                 var16 = var14;
                                 var17 = class_1192.field_6105;
                              }

                              if(var16 != var17) {
                                 break label66;
                              }
                           }

                           var1.method_2054(var9, var13, var10, this.field_6020, 0, 2);
                        }

                        ++var13;
                        if(var6 == null) {
                           break;
                        }
                     }
                  }

                  ++var10;
               }

               if(var6 == null) {
                  break;
               }
            }

            ++var9;
            if(var6 != null) {
               continue label91;
            }
            break;
         }

         var10000 = 1;
         return (boolean)var10000;
      }
   }
}
