import java.util.Random;
import org.lwjgl.opengl.GL11;

// $FF: renamed from: mW
public class class_1223 extends bhr {

   // $FF: renamed from: b bix
   bix field_6350;
   // $FF: renamed from: c bix[]
   bix[] field_6351;


   // $FF: renamed from: <init> () void
   public void method_6510() {
      super.method_6510();
      this.field_6351 = new bix[9];
      byte var1 = -16;
      bix var10001 = new bix;
      var10001.method_6639(this, 0, 0);
      this.field_6350 = var10001;
      this.field_6350.method_6643(-8.0F, -8.0F, -8.0F, 16, 16, 16);
      this.field_6350.field_6546 += (float)(24 + var1);
      Random var2 = new Random(1660L);

      for(int var3 = 0; var3 < this.field_6351.length; ++var3) {
         bix[] var10000 = this.field_6351;
         bix var10002 = new bix;
         var10002.method_6639(this, 0, 0);
         var10000[var3] = var10002;
         float var4 = (((float)(var3 % 3) - (float)(var3 / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
         float var5 = ((float)(var3 / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
         int var6 = var2.nextInt(7) + 8;
         this.field_6351[var3].method_6643(-1.0F, 0.0F, -1.0F, 2, var6, 2);
         this.field_6351[var3].field_6545 = var4;
         this.field_6351[var3].field_6547 = var5;
         this.field_6351[var3].field_6546 = (float)(31 + var1);
      }

   }

   // $FF: renamed from: a (float, float, float, float, float, float, sa) void
   public void method_6512(float var1, float var2, float var3, float var4, float var5, float var6, class_689 var7) {
      String[] var10000 = class_752.method_4253();
      int var9 = 0;
      String[] var8 = var10000;

      while(var9 < this.field_6351.length) {
         this.field_6351[var9].field_6548 = 0.2F * class_1715.method_9555(var3 * 0.3F + (float)var9) + 0.4F;
         ++var9;
         if(var8 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: a (sa, float, float, float, float, float, float) void
   public void method_6511(class_689 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.method_6512(var2, var3, var4, var5, var6, var7, var1);
      String[] var10000 = class_752.method_4253();
      GL11.glPushMatrix();
      GL11.glTranslatef(0.0F, 0.6F, 0.0F);
      this.field_6350.method_6646(var7);
      bix[] var9 = this.field_6351;
      int var10 = var9.length;
      String[] var8 = var10000;
      int var11 = 0;

      while(true) {
         if(var11 < var10) {
            bix var12 = var9[var11];
            var12.method_6646(var7);
            ++var11;
            if(var8 == null) {
               break;
            }

            if(var8 != null) {
               continue;
            }
         }

         GL11.glPopMatrix();
         break;
      }

   }
}
