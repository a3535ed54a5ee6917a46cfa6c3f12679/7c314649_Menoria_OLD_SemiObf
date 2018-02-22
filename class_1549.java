import com.google.common.base.Objects;
import com.google.common.base.Objects.ToStringHelper;
import com.google.gson.Gson;
import java.util.Map;

// $FF: renamed from: qr
public class class_1549 {

   // $FF: renamed from: b com.google.gson.Gson
   private static final Gson field_8114;
   // $FF: renamed from: c java.lang.String
   private final String field_8115;
   // $FF: renamed from: d java.lang.String
   private String field_8116;
   // $FF: renamed from: e java.util.Map
   private Map field_8117;
   // $FF: renamed from: f java.lang.String
   private static final String field_8118;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8119;


   // $FF: renamed from: <init> (java.lang.String, java.lang.String) void
   public void method_8409(String var1, String var2) {
      super();
      this.field_8115 = var1;
      this.field_8116 = var2;
   }

   // $FF: renamed from: <init> (java.lang.String) void
   public void method_8410(String var1) {
      this.method_8409(var1, (String)null);
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_8411(String var1) {
      this.field_8116 = var1;
   }

   // $FF: renamed from: b () java.lang.String
   public String method_8412() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) void
   public void method_8413(String param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () java.lang.String
   public String method_8414() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () java.lang.String
   public String method_8415() {
      return this.field_8115;
   }

   public String toString() {
      ToStringHelper var10000 = Objects.toStringHelper(this);
      String[] var1 = field_8119;
      return var10000.add("name", this.field_8115).add("description", this.field_8116).add("data", this.method_8414()).toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_8416() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_8417(IllegalArgumentException var0) {
      return var0;
   }
}
