import java.text.DecimalFormat;
import java.text.NumberFormat;

// $FF: renamed from: u2
public class class_1601 {

   // $FF: renamed from: a java.lang.String
   public final String field_8364;
   // $FF: renamed from: b rV
   private final class_66 field_8365;
   // $FF: renamed from: c boolean
   public boolean field_8366;
   // $FF: renamed from: d u_
   private final class_71 field_8367;
   // $FF: renamed from: e ks
   private final class_34 field_8368;
   // $FF: renamed from: f java.lang.Class
   private Class field_8369;
   // $FF: renamed from: g java.text.NumberFormat
   private static NumberFormat field_8370;
   // $FF: renamed from: h u_
   public static class_71 field_8371;
   // $FF: renamed from: i java.text.DecimalFormat
   private static DecimalFormat field_8372;
   // $FF: renamed from: j u_
   public static class_71 field_8373;
   // $FF: renamed from: k u_
   public static class_71 field_8374;
   // $FF: renamed from: l u_
   public static class_71 field_8375;
   // $FF: renamed from: m java.lang.String
   private static final String field_8376;
   // $FF: renamed from: n java.lang.String[]
   private static final String[] field_8377;


   // $FF: renamed from: <init> (java.lang.String, rV, u_) void
   public void method_8747(String var1, class_66 var2, class_71 var3) {
      super();
      this.field_8364 = var1;
      this.field_8365 = var2;
      this.field_8367 = var3;
      class_1353 var10001 = new class_1353;
      var10001.getMaxStringLength6(this);
      this.field_8368 = var10001;
      class_34.field_1.put(this.field_8368.method_154(), this.field_8368);
   }

   // $FF: renamed from: <init> (java.lang.String, rV) void
   public void method_8748(String var1, class_66 var2) {
      this.method_8747(var1, var2, field_8371);
   }

   // $FF: renamed from: a () u2
   public class_1601 method_8749() {
      this.field_8366 = true;
      return this;
   }

   // $FF: renamed from: b () u2
   public class_1601 method_8750() {
      try {
         if(class_1698.field_8880.containsKey(this.field_8364)) {
            RuntimeException var10000 = new RuntimeException;
            StringBuilder var10002 = new StringBuilder();
            String[] var1 = field_8377;
            var10000.<init>(var10002.append("Duplicate stat id: \"").append(((class_1601)class_1698.field_8880.get(this.field_8364)).field_8365).append("\" and \"").append(this.field_8365).append("\" at id ").append(this.field_8364).toString());
            throw var10000;
         }
      } catch (RuntimeException var2) {
         throw method_8761(var2);
      }

      class_1698.field_8881.add(this);
      class_1698.field_8880.put(this.field_8364, this);
      return this;
   }

   // $FF: renamed from: c () boolean
   public boolean method_8751() {
      return false;
   }

   // $FF: renamed from: b (int) java.lang.String
   public String method_8752(int var1) {
      return this.field_8367.method_364(var1);
   }

   // $FF: renamed from: d () rV
   public class_66 method_8753() {
      class_66 var1 = this.field_8365.method_345();
      var1.method_338().method_8524(class_130.field_283);
      class_1560 var10000 = var1.method_338();
      class_1558 var10001 = new class_1558;
      class_912 var10003 = class_912.field_4590;
      class_1082 var10004 = new class_1082;
      var10004.method_6134(this.field_8364);
      var10001.method_8508(var10003, var10004);
      var10000.method_8531(var10001);
      return var1;
   }

   // $FF: renamed from: e () rV
   public class_66 method_8754() {
      class_66 var1 = this.method_8753();
      class_1082 var10000 = new class_1082;
      var10000.method_6134("[");
      class_66 var2 = var10000.method_340(var1).method_339("]");
      var2.method_337(var1.method_338());
      return var2;
   }

   public boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public int hashCode() {
      return this.field_8364.hashCode();
   }

   public String toString() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_8377;
      return var10000.append("Stat{id=").append(this.field_8364).append(", nameId=").append(this.field_8365).append(", awardLocallyOnly=").append(this.field_8366).append(", formatter=").append(this.field_8367).append(", objectiveCriteria=").append(this.field_8368).append('}').toString();
   }

   // $FF: renamed from: f () ks
   public class_34 method_8755() {
      return this.field_8368;
   }

   // $FF: renamed from: g () java.lang.Class
   public Class method_8756() {
      return this.field_8369;
   }

   // $FF: renamed from: a (java.lang.Class) u2
   public class_1601 method_8757(Class var1) {
      this.field_8369 = var1;
      return this;
   }

   // $FF: renamed from: h () java.text.NumberFormat
   static NumberFormat method_8758() {
      return field_8370;
   }

   // $FF: renamed from: i () java.text.DecimalFormat
   static DecimalFormat method_8759() {
      return field_8372;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8760() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.RuntimeException) java.lang.RuntimeException
   private static RuntimeException method_8761(RuntimeException var0) {
      return var0;
   }
}
