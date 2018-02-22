
// $FF: renamed from: nF
public class class_1386 {

   // $FF: renamed from: b java.lang.String
   public String field_7361;
   // $FF: renamed from: c java.lang.String
   public String field_7362;
   // $FF: renamed from: d java.lang.String
   public String field_7363;
   // $FF: renamed from: e java.lang.String
   public String field_7364;
   // $FF: renamed from: f long
   public long field_7365;
   // $FF: renamed from: g int
   public int field_7366;
   // $FF: renamed from: h java.lang.String
   public String field_7367;
   // $FF: renamed from: i boolean
   public boolean field_7368;
   // $FF: renamed from: j java.lang.String
   public String field_7369;
   // $FF: renamed from: k U
   private class_105 field_7370;
   // $FF: renamed from: l java.lang.String
   private String field_7371;
   // $FF: renamed from: m boolean
   private boolean field_7372;
   // $FF: renamed from: n java.lang.String
   private static final String field_7373;
   // $FF: renamed from: o java.lang.String[]
   private static final String[] field_7374;


   // $FF: renamed from: <init> (java.lang.String, java.lang.String) void
   public void method_7558(String var1, String var2) {
      super();
      this.field_7366 = 5;
      String[] var10001 = field_7374;
      this.field_7367 = "1.7.10";
      this.field_7370 = class_105.field_173;
      this.field_7361 = var1;
      this.field_7362 = var2;
   }

   // $FF: renamed from: <init> (java.lang.String, java.lang.String, boolean) void
   public void method_7559(String var1, String var2, boolean var3) {
      this.method_7558(var1, var2);
      this.field_7372 = var3;
   }

   // $FF: renamed from: b () ro
   public class_1583 method_7560() {
      class_1583 var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var2 = var10000;
      String[] var4 = class_752.method_4253();
      String[] var3 = field_7374;
      var2.initGui1("name", this.field_7361);
      var2.initGui1("ip", this.field_7362);
      String[] var1 = var4;
      class_1386 var5 = this;
      if(var1 != null) {
         if(this.field_7371 != null) {
            var2.initGui1("icon", this.field_7371);
         }

         var5 = this;
      }

      class_105 var6 = var5.field_7370;
      class_105 var10001 = class_105.field_171;
      if(var1 != null) {
         if(var6 == class_105.field_171) {
            var3 = field_7374;
            var2.initGui4("acceptTextures", true);
            if(var1 != null) {
               return var2;
            }
         }

         var6 = this.field_7370;
         var10001 = class_105.field_172;
      }

      if(var6 == var10001) {
         String[] var7 = field_7374;
         var2.initGui4("acceptTextures", false);
      }

      return var2;
   }

   // $FF: renamed from: c () U
   public class_105 method_7561() {
      return this.field_7370;
   }

   // $FF: renamed from: b (U) void
   public void method_7562(class_105 var1) {
      this.field_7370 = var1;
   }

   // $FF: renamed from: b (ro) nF
   public static class_1386 method_7563(class_1583 var0) {
      String[] var10000 = class_752.method_4253();
      class_1386 var10001 = new class_1386;
      String[] var3 = field_7374;
      var10001.method_7558(var0.method_8685("name"), var0.method_8685("ip"));
      class_1386 var2 = var10001;
      String[] var1 = var10000;
      boolean var4 = var0.initGui8("icon", 8);
      if(var1 != null) {
         if(var4) {
            var2.method_7565(var0.method_8685("icon"));
         }

         var3 = field_7374;
         var4 = var0.initGui8("acceptTextures", 1);
      }

      label33: {
         if(var1 != null) {
            if(!var4) {
               break label33;
            }

            String[] var5 = field_7374;
            var4 = var0.method_8690("acceptTextures");
         }

         if(var4) {
            var2.method_7562(class_105.field_171);
            if(var1 != null) {
               return var2;
            }
         }

         var2.method_7562(class_105.field_172);
         if(var1 != null) {
            return var2;
         }
      }

      var2.method_7562(class_105.field_173);
      return var2;
   }

   // $FF: renamed from: d () java.lang.String
   public String method_7564() {
      return this.field_7371;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_7565(String var1) {
      this.field_7371 = var1;
   }

   // $FF: renamed from: b (nF) void
   public void method_7566(class_1386 var1) {
      this.field_7362 = var1.field_7362;
      this.field_7361 = var1.field_7361;
      this.method_7562(var1.method_7561());
      this.field_7371 = var1.field_7371;
   }

   // $FF: renamed from: e () boolean
   public boolean method_7567() {
      return this.field_7372;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7568() {
      // $FF: Couldn't be decompiled
   }
}
