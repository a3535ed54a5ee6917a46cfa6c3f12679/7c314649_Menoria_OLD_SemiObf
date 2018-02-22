
// $FF: renamed from: gM
public class class_1073 {

   // $FF: renamed from: b byte[]
   public final byte[] field_5661;
   // $FF: renamed from: c int
   private final int field_5662;
   // $FF: renamed from: d int
   private final int field_5663;


   // $FF: renamed from: <init> (byte[], int) void
   public void method_6097(byte[] var1, int var2) {
      super();
      this.field_5661 = var1;
      this.field_5662 = var2;
      this.field_5663 = var2 + 4;
   }

   // $FF: renamed from: b (int, int, int) int
   public int method_6098(int var1, int var2, int var3) {
      String[] var10000 = class_752.method_4253();
      int var5 = var1 << this.field_5663 | var3 << this.field_5662 | var2;
      int var6 = var5 >> 1;
      String[] var4 = var10000;
      int var7 = var5 & 1;
      int var8 = var7;
      if(var4 != null) {
         if(var7 == 0) {
            return this.field_5661[var6] & 15;
         }

         var8 = this.field_5661[var6] >> 4 & 15;
      }

      return var8;
   }
}
