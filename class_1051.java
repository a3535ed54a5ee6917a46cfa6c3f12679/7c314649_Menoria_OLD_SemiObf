import java.util.Random;

// $FF: renamed from: g0
public class class_1051 {

   // $FF: renamed from: b int
   protected int field_5564;
   // $FF: renamed from: c java.util.Random
   protected Random field_5565;
   // $FF: renamed from: d ahb
   protected ahb field_5566;


   // $FF: renamed from: <init> () void
   public void method_5960() {
      super();
      this.field_5564 = 8;
      this.field_5565 = new Random();
   }

   // $FF: renamed from: b (gG, ahb, int, int, aji[]) void
   public void method_5961(class_25 var1, ahb var2, int var3, int var4, aji[] var5) {
      int var7 = this.field_5564;
      this.field_5566 = var2;
      this.field_5565.setSeed(var2.method_2183());
      long var8 = this.field_5565.nextLong();
      String[] var10000 = class_752.method_4253();
      long var10 = this.field_5565.nextLong();
      int var12 = var3 - var7;
      String[] var6 = var10000;

      while(var12 <= var3 + var7) {
         int var13 = var4 - var7;

         while(true) {
            if(var13 <= var4 + var7) {
               long var14 = (long)var12 * var8;
               long var16 = (long)var13 * var10;
               this.field_5565.setSeed(var14 ^ var16 ^ var2.method_2183());
               this.method_5962(var2, var12, var13, var3, var4, var5);
               ++var13;
               if(var6 == null) {
                  break;
               }

               if(var6 != null) {
                  continue;
               }
            }

            ++var12;
            break;
         }

         if(var6 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (ahb, int, int, int, int, aji[]) void
   protected void method_5962(ahb var1, int var2, int var3, int var4, int var5, aji[] var6) {}
}
