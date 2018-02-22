
// $FF: renamed from: gH
public class class_1068 {

   // $FF: renamed from: b byte[]
   public final byte[] field_5619;
   // $FF: renamed from: c int
   private final int field_5620;
   // $FF: renamed from: d int
   private final int field_5621;


   // $FF: renamed from: <init> (int, int) void
   public void method_6009(int var1, int var2) {
      super();
      this.field_5619 = new byte[var1 >> 1];
      this.field_5620 = var2;
      this.field_5621 = var2 + 4;
   }

   // $FF: renamed from: <init> (byte[], int) void
   public void method_6010(byte[] var1, int var2) {
      super();
      this.field_5619 = var1;
      this.field_5620 = var2;
      this.field_5621 = var2 + 4;
   }

   // $FF: renamed from: b (int, int, int) int
   public int method_6011(int var1, int var2, int var3) {
      int var5 = var2 << this.field_5621 | var3 << this.field_5620 | var1;
      String[] var10000 = class_752.method_4253();
      int var6 = var5 >> 1;
      int var7 = var5 & 1;
      String[] var4 = var10000;
      int var8 = var7;
      if(var4 != null) {
         if(var7 == 0) {
            return this.field_5619[var6] & 15;
         }

         var8 = this.field_5619[var6] >> 4 & 15;
      }

      return var8;
   }

   // $FF: renamed from: b (int, int, int, int) void
   public void method_6012(int var1, int var2, int var3, int var4) {
      int var7;
      label16: {
         int var6 = var2 << this.field_5621 | var3 << this.field_5620 | var1;
         var7 = var6 >> 1;
         String[] var5 = class_752.method_4253();
         int var8 = var6 & 1;
         if(var5 != null) {
            if(var8 != 0) {
               break label16;
            }

            this.field_5619[var7] = (byte)(this.field_5619[var7] & 240 | var4 & 15);
         }

         if(var5 != null) {
            return;
         }
      }

      this.field_5619[var7] = (byte)(this.field_5619[var7] & 15 | (var4 & 15) << 4);
   }
}
