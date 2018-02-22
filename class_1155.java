import java.util.Random;

// $FF: renamed from: hw
public class class_1155 extends class_1151 {

   // $FF: renamed from: c int
   private int field_5970;


   // $FF: renamed from: <init> () void
   public void method_6349() {
      super.method_6349();
   }

   // $FF: renamed from: b (int) void
   public void method_6357(int var1) {
      this.field_5970 = var1;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = 0;
      String[] var6 = var10000;
      int var8 = 0;

      int var12;
      while(true) {
         if(var8 < 64) {
            int var9 = var3 + var2.nextInt(8) - var2.nextInt(8);
            int var10 = var4 + var2.nextInt(4) - var2.nextInt(4);
            int var11 = var5 + var2.nextInt(8) - var2.nextInt(8);
            if(var6 != null) {
               var12 = var1.method_34(var9, var10, var11);
               if(var6 == null) {
                  break;
               }

               if(var12 != 0) {
                  label51: {
                     var12 = var1.field_1820.field_5736;
                     if(var6 != null) {
                        label36: {
                           if(var1.field_1820.field_5736) {
                              var12 = var10;
                              if(var6 == null) {
                                 break label36;
                              }

                              if(var10 >= 254) {
                                 break label51;
                              }
                           }

                           var12 = class_1192.field_6191.method_2480(var1, var9, var10, var11);
                        }
                     }

                     if(var6 != null) {
                        if(var12 == 0) {
                           break label51;
                        }

                        class_1192.field_6191.method_2780(var1, var9, var10, var11, this.field_5970, 2);
                        var12 = 1;
                     }

                     var7 = var12;
                  }
               }

               ++var8;
            }

            if(var6 != null) {
               continue;
            }
         }

         var12 = var7;
         break;
      }

      return (boolean)var12;
   }
}
