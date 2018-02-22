import java.util.Map;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: h6
public class class_1093 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_5745;
   // $FF: renamed from: c java.util.Map
   private static Map field_5746;
   // $FF: renamed from: d java.util.Map
   private static Map field_5747;
   // $FF: renamed from: e java.util.Map
   private static Map field_5748;
   // $FF: renamed from: f java.util.Map
   private static Map field_5749;
   // $FF: renamed from: g java.lang.String
   private static final String field_5750;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5751;


   // $FF: renamed from: <init> () void
   public void method_6182() {
      super();
   }

   // $FF: renamed from: a (java.lang.Class, java.lang.String) void
   private static void method_6183(Class var0, String var1) {
      field_5746.put(var1, var0);
      field_5747.put(var0, var1);
   }

   // $FF: renamed from: b (java.lang.Class, java.lang.String) void
   static void method_6184(Class var0, String var1) {
      field_5748.put(var1, var0);
      field_5749.put(var0, var1);
   }

   // $FF: renamed from: b (i2) java.lang.String
   public static String method_6185(class_1199 var0) {
      return (String)field_5747.get(var0.getClass());
   }

   // $FF: renamed from: b (h7) java.lang.String
   public static String method_6186(class_1094 var0) {
      return (String)field_5749.get(var0.getClass());
   }

   // $FF: renamed from: b (ro, ahb) i2
   public static class_1199 method_6187(class_1583 param0, ahb param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (ro, ahb) h7
   public static class_1094 method_6188(class_1583 param0, ahb param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_6189() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_6190(Exception var0) {
      return var0;
   }
}
