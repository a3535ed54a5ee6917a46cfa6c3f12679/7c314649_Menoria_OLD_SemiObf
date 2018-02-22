import java.util.Comparator;

// $FF: renamed from: n2
public class class_1379 implements Comparator {

   // $FF: renamed from: b float
   private float field_7323;
   // $FF: renamed from: c float
   private float field_7324;
   // $FF: renamed from: d float
   private float field_7325;
   // $FF: renamed from: e int[]
   private int[] field_7326;


   // $FF: renamed from: <init> (int[], float, float, float) void
   public void method_7525(int[] var1, float var2, float var3, float var4) {
      super();
      this.field_7326 = var1;
      this.field_7323 = var2;
      this.field_7324 = var3;
      this.field_7325 = var4;
   }

   // $FF: renamed from: b (java.lang.Integer, java.lang.Integer) int
   public int method_7526(Integer var1, Integer var2) {
      float var3 = Float.intBitsToFloat(this.field_7326[var1.intValue()]) - this.field_7323;
      float var4 = Float.intBitsToFloat(this.field_7326[var1.intValue() + 1]) - this.field_7324;
      float var5 = Float.intBitsToFloat(this.field_7326[var1.intValue() + 2]) - this.field_7325;
      float var6 = Float.intBitsToFloat(this.field_7326[var1.intValue() + 8]) - this.field_7323;
      float var7 = Float.intBitsToFloat(this.field_7326[var1.intValue() + 9]) - this.field_7324;
      float var8 = Float.intBitsToFloat(this.field_7326[var1.intValue() + 10]) - this.field_7325;
      float var9 = Float.intBitsToFloat(this.field_7326[var1.intValue() + 16]) - this.field_7323;
      float var10 = Float.intBitsToFloat(this.field_7326[var1.intValue() + 17]) - this.field_7324;
      float var11 = Float.intBitsToFloat(this.field_7326[var1.intValue() + 18]) - this.field_7325;
      float var12 = Float.intBitsToFloat(this.field_7326[var1.intValue() + 24]) - this.field_7323;
      float var13 = Float.intBitsToFloat(this.field_7326[var1.intValue() + 25]) - this.field_7324;
      float var14 = Float.intBitsToFloat(this.field_7326[var1.intValue() + 26]) - this.field_7325;
      float var15 = Float.intBitsToFloat(this.field_7326[var2.intValue()]) - this.field_7323;
      float var16 = Float.intBitsToFloat(this.field_7326[var2.intValue() + 1]) - this.field_7324;
      float var17 = Float.intBitsToFloat(this.field_7326[var2.intValue() + 2]) - this.field_7325;
      float var18 = Float.intBitsToFloat(this.field_7326[var2.intValue() + 8]) - this.field_7323;
      float var19 = Float.intBitsToFloat(this.field_7326[var2.intValue() + 9]) - this.field_7324;
      float var20 = Float.intBitsToFloat(this.field_7326[var2.intValue() + 10]) - this.field_7325;
      float var21 = Float.intBitsToFloat(this.field_7326[var2.intValue() + 16]) - this.field_7323;
      float var22 = Float.intBitsToFloat(this.field_7326[var2.intValue() + 17]) - this.field_7324;
      float var23 = Float.intBitsToFloat(this.field_7326[var2.intValue() + 18]) - this.field_7325;
      float var24 = Float.intBitsToFloat(this.field_7326[var2.intValue() + 24]) - this.field_7323;
      float var25 = Float.intBitsToFloat(this.field_7326[var2.intValue() + 25]) - this.field_7324;
      float var26 = Float.intBitsToFloat(this.field_7326[var2.intValue() + 26]) - this.field_7325;
      float var27 = (var3 + var6 + var9 + var12) * 0.25F;
      float var28 = (var4 + var7 + var10 + var13) * 0.25F;
      float var29 = (var5 + var8 + var11 + var14) * 0.25F;
      float var30 = (var15 + var18 + var21 + var24) * 0.25F;
      float var31 = (var16 + var19 + var22 + var25) * 0.25F;
      float var32 = (var17 + var20 + var23 + var26) * 0.25F;
      float var33 = var27 * var27 + var28 * var28 + var29 * var29;
      float var34 = var30 * var30 + var31 * var31 + var32 * var32;
      return Float.compare(var34, var33);
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.method_7526((Integer)var1, (Integer)var2);
   }
}
