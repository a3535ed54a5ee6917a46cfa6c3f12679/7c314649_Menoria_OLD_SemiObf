import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// $FF: renamed from: uM
public abstract class class_1632 extends class_1629 {

   // $FF: renamed from: c java.text.SimpleDateFormat
   public static final SimpleDateFormat field_8479;
   // $FF: renamed from: d java.util.Date
   protected final Date field_8480;
   // $FF: renamed from: e java.lang.String
   protected final String field_8481;
   // $FF: renamed from: f java.util.Date
   protected final Date field_8482;
   // $FF: renamed from: g java.lang.String
   protected final String field_8483;
   // $FF: renamed from: h java.lang.String
   private static final String field_8484;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_8485;


   // $FF: renamed from: <init> (java.lang.Object, java.util.Date, java.lang.String, java.util.Date, java.lang.String) void
   public void method_8950(Object var1, Date var2, String var3, Date var4, String var5) {
      String[] var10000 = class_752.method_4253();
      super.method_8934(var1);
      String[] var6 = var10000;
      Date var10001 = var2;
      if(var6 != null) {
         var10001 = var2 == null?new Date():var2;
      }

      this.field_8480 = var10001;
      String var8 = var3;
      if(var6 != null) {
         if(var3 == null) {
            String[] var7 = field_8485;
            var8 = "(Unknown)";
         } else {
            var8 = var3;
         }
      }

      this.field_8481 = var8;
      this.field_8482 = var4;
      var8 = var5;
      if(var6 != null) {
         if(var5 == null) {
            String[] var9 = field_8485;
            var8 = "Banned by an operator.";
         } else {
            var8 = var5;
         }
      }

      this.field_8483 = var8;
   }

   // $FF: renamed from: <init> (java.lang.Object, com.google.gson.JsonObject) void
   protected void method_8935(Object param1, JsonObject param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () java.util.Date
   public Date method_8951() {
      return this.field_8482;
   }

   // $FF: renamed from: e () java.lang.String
   public String method_8952() {
      return this.field_8483;
   }

   // $FF: renamed from: b () boolean
   boolean method_8937() {
      String[] var1 = class_752.method_4253();
      Date var10000 = this.field_8482;
      boolean var2;
      if(var1 != null) {
         if(this.field_8482 == null) {
            var2 = false;
            return var2;
         }

         var10000 = this.field_8482;
      }

      var2 = var10000.before(new Date());
      return var2;
   }

   // $FF: renamed from: b (com.google.gson.JsonObject) void
   protected void method_8938(JsonObject var1) {
      JsonObject var10000;
      String var10001;
      String var5;
      label14: {
         String[] var2 = class_752.method_4253();
         var10000 = var1;
         String[] var3 = field_8485;
         var10001 = "created";
         SimpleDateFormat var10002 = field_8479;
         Date var10003 = this.field_8480;
         if(var2 != null) {
            var1.addProperty("created", field_8479.format(this.field_8480));
            var1.addProperty("source", this.field_8481);
            var10000 = var1;
            var10001 = "expires";
            if(this.field_8482 == null) {
               var5 = "forever";
               break label14;
            }

            var10002 = field_8479;
            var10003 = this.field_8482;
         }

         var5 = var10002.format(var10003);
      }

      var10000.addProperty(var10001, var5);
      String[] var4 = field_8485;
      var1.addProperty("reason", this.field_8483);
   }

   // $FF: renamed from: <clinit> () void
   static void method_8953() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.text.ParseException) java.text.ParseException
   private static ParseException method_8954(ParseException var0) {
      return var0;
   }
}
