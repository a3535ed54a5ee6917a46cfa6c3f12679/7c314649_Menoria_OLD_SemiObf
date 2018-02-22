import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

// $FF: renamed from: pS
public class class_1479 {

   // $FF: renamed from: b q9
   private final class_49 field_7786;
   // $FF: renamed from: c com.google.gson.GsonBuilder
   private final GsonBuilder field_7787;
   // $FF: renamed from: d com.google.gson.Gson
   private Gson field_7788;
   // $FF: renamed from: e java.lang.String
   private static final String field_7789;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7790;


   // $FF: renamed from: <init> () void
   public void method_7983() {
      super();
      class_1022 var10001 = new class_1022;
      var10001.method_5804();
      this.field_7786 = var10001;
      this.field_7787 = new GsonBuilder();
      GsonBuilder var10000 = this.field_7787;
      class_1556 var10002 = new class_1556;
      var10002.method_8478();
      var10000.registerTypeHierarchyAdapter(class_66.class, var10002);
      var10000 = this.field_7787;
      class_1507 var2 = new class_1507;
      var2.method_8183();
      var10000.registerTypeHierarchyAdapter(class_1560.class, var2);
      var10000 = this.field_7787;
      class_1714 var1 = new class_1714;
      var1.method_9550();
      var10000.registerTypeAdapterFactory(var1);
   }

   // $FF: renamed from: b (pR, java.lang.Class) void
   public void method_7984(class_43 var1, Class var2) {
      class_49 var10000 = this.field_7786;
      String var10001 = var1.method_178();
      class_1482 var10002 = new class_1482;
      var10002.method_7996(this, var1, var2, (Object)null);
      var10000.method_189(var10001, var10002);
      this.field_7787.registerTypeAdapter(var2, var1);
      this.field_7788 = null;
   }

   // $FF: renamed from: b (java.lang.String, com.google.gson.JsonObject) pQ
   public class_42 method_7985(String param1, JsonObject param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () com.google.gson.Gson
   private Gson method_7986() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_7987(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7988() {
      // $FF: Couldn't be decompiled
   }
}
