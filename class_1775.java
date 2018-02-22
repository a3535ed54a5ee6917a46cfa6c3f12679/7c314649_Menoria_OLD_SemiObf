import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: xR
public class class_1775 {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_9263;
   // $FF: renamed from: b java.util.Map
   private static Map field_9264;
   // $FF: renamed from: c java.util.Map
   private static Map field_9265;
   // $FF: renamed from: d java.util.Map
   private static Map field_9266;
   // $FF: renamed from: e java.util.Map
   private static Map field_9267;
   // $FF: renamed from: f java.util.Map
   private static Map field_9268;
   // $FF: renamed from: g java.util.HashMap
   public static HashMap field_9269;
   // $FF: renamed from: h java.lang.String
   private static final String field_9270;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_9271;


   // $FF: renamed from: <init> () void
   public void method_9751() {
      super();
   }

   // $FF: renamed from: b (java.lang.Class, java.lang.String, int) void
   private static void method_9752(Class var0, String var1, int var2) {
      IllegalArgumentException var10000;
      StringBuilder var10002;
      try {
         if(field_9264.containsKey(var1)) {
            var10000 = new IllegalArgumentException;
            var10002 = new StringBuilder();
            String[] var3 = field_9271;
            var10000.<init>(var10002.append("ID is already registered: ").append(var1).toString());
            throw var10000;
         }
      } catch (IllegalArgumentException var4) {
         throw method_9764(var4);
      }

      try {
         if(field_9266.containsKey(Integer.valueOf(var2))) {
            var10000 = new IllegalArgumentException;
            var10002 = new StringBuilder();
            String[] var10003 = field_9271;
            var10000.<init>(var10002.append("ID is already registered: ").append(var2).toString());
            throw var10000;
         }
      } catch (IllegalArgumentException var5) {
         throw method_9764(var5);
      }

      field_9264.put(var1, var0);
      field_9265.put(var0, var1);
      field_9266.put(Integer.valueOf(var2), var0);
      field_9267.put(var0, Integer.valueOf(var2));
      field_9268.put(var1, Integer.valueOf(var2));
   }

   // $FF: renamed from: b (java.lang.Class, java.lang.String, int, int, int) void
   private static void method_9753(Class var0, String var1, int var2, int var3, int var4) {
      method_9752(var0, var1, var2);
      HashMap var10000 = field_9269;
      Integer var10001 = Integer.valueOf(var2);
      class_1777 var10002 = new class_1777;
      var10002.method_9773(var2, var3, var4);
      var10000.put(var10001, var10002);
   }

   // $FF: renamed from: b (java.lang.String, ahb) sa
   public static class_689 method_9754(String param0, ahb param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (ro, ahb) sa
   public static class_689 method_9755(class_1583 param0, ahb param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, ahb) sa
   public static class_689 method_9756(int param0, ahb param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sa) int
   public static int method_9757(class_689 param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int) java.lang.Class
   public static Class method_9758(int var0) {
      return (Class)field_9266.get(Integer.valueOf(var0));
   }

   // $FF: renamed from: c (sa) java.lang.String
   public static String method_9759(class_689 var0) {
      return (String)field_9265.get(var0.getClass());
   }

   // $FF: renamed from: c (int) java.lang.String
   public static String method_9760(int var0) {
      Class var1 = method_9758(var0);

      String var10000;
      try {
         if(var1 != null) {
            var10000 = (String)field_9265.get(var1);
            return var10000;
         }
      } catch (IllegalArgumentException var2) {
         throw method_9764(var2);
      }

      var10000 = null;
      return var10000;
   }

   // $FF: renamed from: b () void
   public static void method_9761() {}

   // $FF: renamed from: c () java.util.Set
   public static Set method_9762() {
      return Collections.unmodifiableSet(field_9268.keySet());
   }

   // $FF: renamed from: <clinit> () void
   static void method_9763() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_9764(Exception var0) {
      return var0;
   }
}
