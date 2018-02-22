import java.util.Random;

// $FF: renamed from: hx
public class class_1154 extends class_1151 {

   // $FF: renamed from: c aji
   private aji field_5968;
   // $FF: renamed from: d int
   private int field_5969;


   // $FF: renamed from: <init> (aji) void
   public void method_6355(aji var1) {
      super.method_6349();
      this.field_5968 = var1;
   }

   // $FF: renamed from: b (aji, int) void
   public void method_6356(aji var1, int var2) {
      this.field_5968 = var1;
      this.field_5969 = var2;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var10000 = class_752.method_4253();
      int var7 = 0;
      String[] var6 = var10000;

      boolean var11;
      while(true) {
         if(var7 < 64) {
            int var8 = var3 + var2.nextInt(8) - var2.nextInt(8);
            int var9 = var4 + var2.nextInt(4) - var2.nextInt(4);
            int var10 = var5 + var2.nextInt(8) - var2.nextInt(8);
            if(var6 != null) {
               var11 = var1.method_34(var8, var9, var10);
               if(var6 == null) {
                  break;
               }

               if(var11) {
                  label51: {
                     int var12 = var1.field_1820.field_5736;
                     if(var6 != null) {
                        label36: {
                           if(var1.field_1820.field_5736) {
                              var12 = var9;
                              if(var6 == null) {
                                 break label36;
                              }

                              if(var9 >= 255) {
                                 break label51;
                              }
                           }

                           var12 = this.field_5968.method_2505(var1, var8, var9, var10);
                        }
                     }

                     if(var6 != null && var12 != 0) {
                        var1.method_2054(var8, var9, var10, this.field_5968, this.field_5969, 2);
                     }
                  }
               }

               ++var7;
            }

            if(var6 != null) {
               continue;
            }
         }

         var11 = true;
         break;
      }

      return var11;
   }
}
