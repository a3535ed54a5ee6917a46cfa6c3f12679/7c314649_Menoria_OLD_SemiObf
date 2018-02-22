
// $FF: renamed from: np
public class class_1428 {

   // $FF: renamed from: b nq[]
   public class_1429[] field_7581;
   // $FF: renamed from: c int
   public int field_7582;
   // $FF: renamed from: d boolean
   private boolean field_7583;


   // $FF: renamed from: <init> (nq[]) void
   public void method_7779(class_1429[] var1) {
      super();
      this.field_7581 = var1;
      this.field_7582 = var1.length;
   }

   // $FF: renamed from: <init> (nq[], int, int, int, int, float, float) void
   public void method_7780(class_1429[] var1, int var2, int var3, int var4, int var5, float var6, float var7) {
      this.method_7779(var1);
      float var8 = 0.0F / var6;
      float var9 = 0.0F / var7;
      var1[0] = var1[0].method_7784((float)var4 / var6 - var8, (float)var3 / var7 + var9);
      var1[1] = var1[1].method_7784((float)var2 / var6 + var8, (float)var3 / var7 + var9);
      var1[2] = var1[2].method_7784((float)var2 / var6 + var8, (float)var5 / var7 - var9);
      var1[3] = var1[3].method_7784((float)var4 / var6 - var8, (float)var5 / var7 - var9);
   }

   // $FF: renamed from: b () void
   public void method_7781() {
      class_1429[] var1 = new class_1429[this.field_7581.length];

      for(int var2 = 0; var2 < this.field_7581.length; ++var2) {
         var1[var2] = this.field_7581[this.field_7581.length - var2 - 1];
      }

      this.field_7581 = var1;
   }

   // $FF: renamed from: b (bmh, float) void
   public void method_7782(bmh var1, float var2) {
      String[] var3;
      label29: {
         azw var4 = this.field_7581[1].field_7584.method_5089(this.field_7581[0].field_7584);
         azw var5 = this.field_7581[1].field_7584.method_5089(this.field_7581[2].field_7584);
         String[] var10000 = class_752.method_4253();
         azw var6 = var5.method_5092(var4).method_5090();
         var3 = var10000;
         bmh var9 = var1;
         if(var3 != null) {
            var1.setVisible2();
            if(this.field_7583) {
               var1.method_7466(-((float)var6.field_4220), -((float)var6.field_4221), -((float)var6.field_4222));
               if(var3 != null) {
                  break label29;
               }
            }

            var9 = var1;
         }

         var9.method_7466((float)var6.field_4220, (float)var6.field_4221, (float)var6.field_4222);
      }

      int var7 = 0;

      while(true) {
         if(var7 < 4) {
            class_1429 var8 = this.field_7581[var7];
            var1.addVertexWithUV((double)((float)var8.field_7584.field_4220 * var2), (double)((float)var8.field_7584.field_4221 * var2), (double)((float)var8.field_7584.field_4222 * var2), (double)var8.field_7585, (double)var8.field_7586);
            ++var7;
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         var1.getVisible8();
         break;
      }

   }
}
