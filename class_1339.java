
// $FF: renamed from: ka
public class class_1339 implements Comparable {

   // $FF: renamed from: b java.lang.String
   private final String field_6888;
   // $FF: renamed from: c java.lang.String
   private final String field_6889;
   // $FF: renamed from: d long
   private final long field_6890;
   // $FF: renamed from: e long
   private final long field_6891;
   // $FF: renamed from: f boolean
   private final boolean field_6892;
   // $FF: renamed from: g G
   private final class_94 field_6893;
   // $FF: renamed from: h boolean
   private final boolean field_6894;
   // $FF: renamed from: i boolean
   private final boolean field_6895;


   // $FF: renamed from: <init> (java.lang.String, java.lang.String, long, long, G, boolean, boolean, boolean) void
   public void method_7066(String var1, String var2, long var3, long var5, class_94 var7, boolean var8, boolean var9, boolean var10) {
      super();
      this.field_6888 = var1;
      this.field_6889 = var2;
      this.field_6890 = var3;
      this.field_6891 = var5;
      this.field_6893 = var7;
      this.field_6892 = var8;
      this.field_6894 = var9;
      this.field_6895 = var10;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_7067() {
      return this.field_6888;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_7068() {
      return this.field_6889;
   }

   // $FF: renamed from: d () long
   public long method_7069() {
      return this.field_6891;
   }

   // $FF: renamed from: e () boolean
   public boolean method_7070() {
      return this.field_6892;
   }

   // $FF: renamed from: f () long
   public long method_7071() {
      return this.field_6890;
   }

   // $FF: renamed from: b (ka) int
   public int method_7072(class_1339 var1) {
      String[] var2 = class_752.method_4253();
      long var3;
      int var10000 = (var3 = this.field_6890 - var1.field_6890) == 0L?0:(var3 < 0L?-1:1);
      if(var2 != null) {
         if(var10000 < 0) {
            return 1;
         }

         long var4;
         var10000 = (var4 = this.field_6890 - var1.field_6890) == 0L?0:(var4 < 0L?-1:1);
      }

      if(var2 != null) {
         if(var10000 > 0) {
            return -1;
         }

         var10000 = this.field_6888.compareTo(var1.field_6888);
      }

      return var10000;
   }

   // $FF: renamed from: g () G
   public class_94 method_7073() {
      return this.field_6893;
   }

   // $FF: renamed from: h () boolean
   public boolean method_7074() {
      return this.field_6894;
   }

   // $FF: renamed from: i () boolean
   public boolean method_7075() {
      return this.field_6895;
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.method_7072((class_1339)var1);
   }
}
