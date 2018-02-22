import java.util.Random;

// $FF: renamed from: hO
public class class_1177 extends class_1151 {

   // $FF: renamed from: c aji
   private aji field_6007;
   // $FF: renamed from: d int
   private int field_6008;


   // $FF: renamed from: <init> (aji, int) void
   public void method_6397(aji var1, int var2) {
      super.method_6349();
      this.field_6007 = var1;
      this.field_6008 = var2;
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int, int) boolean
   public boolean method_6351(ahb var1, Random var2, int var3, int var4, int var5) {
      String[] var6 = class_752.method_4253();

      int var10000;
      label52: {
         aji var7;
         while((var7 = var1.getBlock(var3, var4, var5)).method_2424() == awt.field_4170 || var7.method_2424() == awt.field_4179) {
            var10000 = var4;
            if(var6 == null) {
               break label52;
            }

            if(var4 > 0) {
               --var4;
               if(var6 != null) {
                  continue;
               }
            }
            break;
         }

         var10000 = 0;
      }

      int var8 = var10000;

      boolean var12;
      while(true) {
         if(var8 < 128) {
            int var9 = var3 + var2.nextInt(8) - var2.nextInt(8);
            int var10 = var4 + var2.nextInt(4) - var2.nextInt(4);
            int var11 = var5 + var2.nextInt(8) - var2.nextInt(8);
            if(var6 != null) {
               var12 = var1.method_34(var9, var10, var11);
               if(var6 == null) {
                  break;
               }

               if(var12 && var6 != null && this.field_6007.method_2505(var1, var9, var10, var11)) {
                  var1.method_2054(var9, var10, var11, this.field_6007, this.field_6008, 2);
               }

               ++var8;
            }

            if(var6 != null) {
               continue;
            }
         }

         var12 = true;
         break;
      }

      return var12;
   }
}
