
// $FF: renamed from: vV
public class class_1687 {

   // $FF: renamed from: b vX
   private final class_1691 field_8808;
   // $FF: renamed from: c int
   private final int field_8809;
   // $FF: renamed from: d float
   private final float field_8810;
   // $FF: renamed from: e float
   private final float field_8811;
   // $FF: renamed from: f java.lang.String
   private final String field_8812;
   // $FF: renamed from: g float
   private final float field_8813;
   // $FF: renamed from: h java.lang.String
   private static final String field_8814 = "CL_00001519";


   // $FF: renamed from: <init> (vX, int, float, float, java.lang.String, float) void
   public void method_9301(class_1691 var1, int var2, float var3, float var4, String var5, float var6) {
      super();
      this.field_8808 = var1;
      this.field_8809 = var2;
      this.field_8810 = var4;
      this.field_8811 = var3;
      this.field_8812 = var5;
      this.field_8813 = var6;
   }

   // $FF: renamed from: b () vX
   public class_1691 method_9302() {
      return this.field_8808;
   }

   // $FF: renamed from: d () float
   public float method_9303() {
      return this.field_8810;
   }

   // $FF: renamed from: e () boolean
   public boolean method_9304() {
      return this.field_8808.method_9345() instanceof class_752;
   }

   // $FF: renamed from: f () java.lang.String
   public String method_9305() {
      return this.field_8812;
   }

   // $FF: renamed from: g () rV
   public class_66 method_9306() {
      String[] var1 = class_752.method_4253();
      class_689 var10000 = this.method_9302().method_9345();
      class_66 var2;
      if(var1 != null) {
         if(var10000 == null) {
            var2 = null;
            return var2;
         }

         var10000 = this.method_9302().method_9345();
      }

      var2 = var10000.method_407();
      return var2;
   }

   // $FF: renamed from: h () float
   public float method_9307() {
      String[] var1 = class_752.method_4253();
      class_1687 var10000 = this;
      float var2;
      if(var1 != null) {
         if(this.field_8808 == class_1691.field_8838) {
            var2 = Float.MAX_VALUE;
            return var2;
         }

         var10000 = this;
      }

      var2 = var10000.field_8813;
      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9308() {
      boolean var10000 = true;
      char[] var10003 = "z¶)þj9h\bÏG÷".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_8814 = (new String((char[])var4)).intern();
            String var2 = field_8814;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 159;
            break;
         case 1:
            var10009 = 92;
            break;
         case 2:
            var10009 = 208;
            break;
         case 3:
            var10009 = 104;
            break;
         case 4:
            var10009 = 252;
            break;
         case 5:
            var10009 = 175;
            break;
         default:
            var10009 = 254;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
