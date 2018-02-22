import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.util.HashMap;

// $FF: renamed from: c
class class_111 extends TypeAdapter {

   // $FF: renamed from: a java.lang.String
   private static final String field_203 = "CL_00001495";
   // $FF: renamed from: b java.util.HashMap
   final HashMap field_204;
   // $FF: renamed from: c vr
   final class_1714 field_205;


   // $FF: renamed from: <init> (vr, java.util.HashMap) void
   void method_514(class_1714 var1, HashMap var2) {
      this.field_205 = var1;
      this.field_204 = var2;
      super();
   }

   public void write(JsonWriter var1, Object var2) {
      label16: {
         String[] var3 = class_752.method_4253();
         if(var3 != null) {
            if(var2 != null) {
               break label16;
            }

            var1.nullValue();
         }

         if(var3 != null) {
            return;
         }
      }

      var1.value(class_1714.method_9552(this.field_205, var2));
   }

   public Object read(JsonReader var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = var1.peek();
      if(var2 != null) {
         if(var10000 == JsonToken.NULL) {
            var1.nextNull();
            return null;
         }

         var10000 = this.field_204.get(var1.nextString());
      }

      return var10000;
   }

   // $FF: renamed from: <clinit> () void
   static void method_515() {
      boolean var10000 = true;
      char[] var10003 = "ËÓv)Ýêú³µs".toCharArray();
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
            field_203 = (new String((char[])var4)).intern();
            String var2 = field_203;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 122;
            break;
         case 1:
            var10009 = 54;
            break;
         case 2:
            var10009 = 61;
            break;
         case 3:
            var10009 = 247;
            break;
         case 4:
            var10009 = 168;
            break;
         case 5:
            var10009 = 92;
            break;
         default:
            var10009 = 107;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
