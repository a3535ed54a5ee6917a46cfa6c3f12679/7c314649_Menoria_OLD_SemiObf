import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Locale;

// $FF: renamed from: vr
public class class_1714 implements TypeAdapterFactory {

   // $FF: renamed from: a java.lang.String
   private static final String field_8985 = "CL_00001494";


   // $FF: renamed from: <init> () void
   public void method_9550() {
      super();
   }

   public TypeAdapter create(Gson var1, TypeToken var2) {
      String[] var10000 = class_752.method_4253();
      Class var4 = var2.getRawType();
      String[] var3 = var10000;
      if(!var4.isEnum()) {
         return null;
      } else {
         HashMap var5 = new HashMap();
         Object[] var6 = var4.getEnumConstants();
         int var7 = var6.length;
         int var8 = 0;

         while(var8 < var7) {
            Object var9 = var6[var8];
            var5.put(this.method_9551(var9), var9);
            ++var8;
            if(var3 == null) {
               break;
            }
         }

         class_111 var10 = new class_111;
         var10.method_514(this, var5);
         return var10;
      }
   }

   // $FF: renamed from: b (java.lang.Object) java.lang.String
   private String method_9551(Object var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = var1;
      String var3;
      if(var2 != null) {
         if(var1 instanceof Enum) {
            var3 = ((Enum)var1).name().toLowerCase(Locale.US);
            return var3;
         }

         var10000 = var1;
      }

      var3 = var10000.toString().toLowerCase(Locale.US);
      return var3;
   }

   // $FF: renamed from: b (vr, java.lang.Object) java.lang.String
   static String method_9552(class_1714 var0, Object var1) {
      return var0.method_9551(var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9553() {
      boolean var10000 = true;
      char[] var10003 = "|ÎE÷§íÊ".toCharArray();
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
            field_8985 = (new String((char[])var4)).intern();
            String var2 = field_8985;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 209;
            break;
         case 1:
            var10009 = 62;
            break;
         case 2:
            var10009 = 46;
            break;
         case 3:
            var10009 = 243;
            break;
         case 4:
            var10009 = 120;
            break;
         case 5:
            var10009 = 202;
            break;
         default:
            var10009 = 154;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
