
// $FF: renamed from: du
public class class_1046 {

   // $FF: renamed from: b du[]
   public static final class_1046[] field_5526;
   // $FF: renamed from: c du
   public static final class_1046 field_5527;
   // $FF: renamed from: d du
   public static final class_1046 field_5528;
   // $FF: renamed from: e du
   public static final class_1046 field_5529;
   // $FF: renamed from: f du
   public static final class_1046 field_5530;
   // $FF: renamed from: g du
   public static final class_1046 field_5531;
   // $FF: renamed from: h int
   private final int field_5532;
   // $FF: renamed from: i java.lang.String
   private final String field_5533;
   // $FF: renamed from: j int
   private final int field_5534;
   // $FF: renamed from: k boolean
   private boolean field_5535;
   // $FF: renamed from: l boolean
   private boolean field_5536;
   // $FF: renamed from: m boolean
   private boolean field_5537;
   // $FF: renamed from: n java.lang.String[]
   private static final String[] field_5538;


   // $FF: renamed from: <init> (int, java.lang.String) void
   private void method_5920(int var1, String var2) {
      this.method_5921(var1, var2, 0);
   }

   // $FF: renamed from: <init> (int, java.lang.String, int) void
   private void method_5921(int var1, String var2, int var3) {
      super();
      this.field_5533 = var2;
      this.field_5534 = var3;
      this.field_5535 = true;
      this.field_5532 = var1;
      field_5526[var1] = this;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_5922() {
      return this.field_5533;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_5923() {
      StringBuilder var10000 = new StringBuilder();
      String[] var10001 = field_5538;
      return var10000.append("generator.").append(this.field_5533).toString();
   }

   // $FF: renamed from: d () java.lang.String
   public String method_5924() {
      StringBuilder var10000 = (new StringBuilder()).append(this.method_5923());
      String[] var10001 = field_5538;
      return var10000.append(".info").toString();
   }

   // $FF: renamed from: e () int
   public int method_5925() {
      return this.field_5534;
   }

   // $FF: renamed from: b (int) du
   public class_1046 method_5926(int var1) {
      String[] var2 = class_752.method_4253();
      class_1046 var10000 = this;
      if(var2 != null) {
         if(this == field_5527 && var1 == 0) {
            return field_5531;
         }

         var10000 = this;
      }

      return var10000;
   }

   // $FF: renamed from: b (boolean) du
   private class_1046 method_5927(boolean var1) {
      this.field_5535 = var1;
      return this;
   }

   // $FF: renamed from: f () boolean
   public boolean method_5928() {
      return this.field_5535;
   }

   // $FF: renamed from: g () du
   private class_1046 method_5929() {
      this.field_5536 = true;
      return this;
   }

   // $FF: renamed from: h () boolean
   public boolean method_5930() {
      return this.field_5536;
   }

   // $FF: renamed from: b (java.lang.String) du
   public static class_1046 method_5931(String var0) {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;

      while(true) {
         if(var2 < field_5526.length) {
            label32: {
               class_1046 var3 = field_5526[var2];
               if(var1 != null) {
                  if(var3 == null) {
                     break label32;
                  }

                  var3 = field_5526[var2];
               }

               if(var1 != null) {
                  if(!var3.field_5533.equalsIgnoreCase(var0)) {
                     break label32;
                  }

                  var3 = field_5526[var2];
               }

               return var3;
            }

            ++var2;
            if(var1 != null) {
               continue;
            }
         }

         return null;
      }
   }

   // $FF: renamed from: i () int
   public int method_5932() {
      return this.field_5532;
   }

   // $FF: renamed from: j () boolean
   public boolean method_5933() {
      return this.field_5537;
   }

   // $FF: renamed from: k () du
   private class_1046 method_5934() {
      this.field_5537 = true;
      return this;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5935() {
      // $FF: Couldn't be decompiled
   }
}
