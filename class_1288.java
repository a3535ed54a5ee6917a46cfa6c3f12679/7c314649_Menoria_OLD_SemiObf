
// $FF: renamed from: jJ
public class class_1288 {

   // $FF: renamed from: b int
   public final int field_6599;
   // $FF: renamed from: c int
   public final int field_6600;
   // $FF: renamed from: d int
   public final int field_6601;
   // $FF: renamed from: e int
   private final int field_6602;
   // $FF: renamed from: f int
   int field_6603;
   // $FF: renamed from: g float
   float field_6604;
   // $FF: renamed from: h float
   float field_6605;
   // $FF: renamed from: i float
   float field_6606;
   // $FF: renamed from: j jJ
   class_1288 field_6607;
   // $FF: renamed from: k boolean
   public boolean field_6608;
   // $FF: renamed from: l java.lang.String
   private static final String field_6609;
   // $FF: renamed from: m java.lang.String[]
   private static final String[] field_6610;


   // $FF: renamed from: <init> (int, int, int) void
   public void method_6733(int var1, int var2, int var3) {
      super();
      this.field_6603 = -1;
      this.field_6599 = var1;
      this.field_6600 = var2;
      this.field_6601 = var3;
      this.field_6602 = method_6734(var1, var2, var3);
   }

   // $FF: renamed from: b (int, int, int) int
   public static int method_6734(int var0, int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1 & 255 | (var0 & 32767) << 8 | (var2 & 32767) << 24;
      int var10001 = var0;
      if(var3 != null) {
         var10001 = var0 < 0?Integer.MIN_VALUE:0;
      }

      var10000 |= var10001;
      var10001 = var2;
      if(var3 != null) {
         var10001 = var2 < 0?'\u8000':0;
      }

      return var10000 | var10001;
   }

   // $FF: renamed from: b (jJ) float
   public float method_6735(class_1288 var1) {
      float var2 = (float)(var1.field_6599 - this.field_6599);
      float var3 = (float)(var1.field_6600 - this.field_6600);
      float var4 = (float)(var1.field_6601 - this.field_6601);
      return class_1715.method_9557(var2 * var2 + var3 * var3 + var4 * var4);
   }

   // $FF: renamed from: c (jJ) float
   public float method_6736(class_1288 var1) {
      float var2 = (float)(var1.field_6599 - this.field_6599);
      float var3 = (float)(var1.field_6600 - this.field_6600);
      float var4 = (float)(var1.field_6601 - this.field_6601);
      return var2 * var2 + var3 * var3 + var4 * var4;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = var1;
      if(var2 != null) {
         if(!(var1 instanceof class_1288)) {
            return false;
         }

         var10000 = var1;
      }

      int var4;
      label49: {
         class_1288 var3 = (class_1288)var10000;
         var4 = this.field_6602;
         int var10001 = var3.field_6602;
         if(var2 != null) {
            if(this.field_6602 != var3.field_6602) {
               break label49;
            }

            var4 = this.field_6599;
            var10001 = var3.field_6599;
         }

         if(var2 != null) {
            if(var4 != var10001) {
               break label49;
            }

            var4 = this.field_6600;
            var10001 = var3.field_6600;
         }

         if(var2 != null) {
            if(var4 != var10001) {
               break label49;
            }

            var4 = this.field_6601;
            if(var2 == null) {
               return (boolean)var4;
            }

            var10001 = var3.field_6601;
         }

         if(var4 == var10001) {
            var4 = 1;
            return (boolean)var4;
         }
      }

      var4 = 0;
      return (boolean)var4;
   }

   public int hashCode() {
      return this.field_6602;
   }

   // $FF: renamed from: b () boolean
   public boolean method_6737() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_6603;
      if(var1 != null) {
         var10000 = this.field_6603 >= 0?1:0;
      }

      return (boolean)var10000;
   }

   public String toString() {
      StringBuilder var10000 = (new StringBuilder()).append(this.field_6599);
      String[] var1 = field_6610;
      return var10000.append(", ").append(this.field_6600).append(", ").append(this.field_6601).toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6738() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "À®v+Üµ³×/¯Â";
      int var4 = "À®v+Üµ³×/¯Â".length();
      char var1 = 11;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_6610 = var5;
                  String[] var10 = field_6610;
                  field_6609 = "CL_00000574";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 15;
               break;
            case 1:
               var10009 = 110;
               break;
            case 2:
               var10009 = 165;
               break;
            case 3:
               var10009 = 151;
               break;
            case 4:
               var10009 = 96;
               break;
            case 5:
               var10009 = 169;
               break;
            default:
               var10009 = 9;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
