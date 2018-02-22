import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

// $FF: renamed from: tC
public class class_300 extends class_250 {

   // $FF: renamed from: c com.google.gson.Gson
   private static final Gson field_1559;
   // $FF: renamed from: d tS
   private class_1606 field_1560;
   // $FF: renamed from: e java.lang.String
   private static final String field_1561 = "CL_00001384";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (tS) void
   public void method_1717(class_1606 var1) {
      super.method_1449();
      this.field_1560 = var1;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      this.field_1560 = (class_1606)field_1559.fromJson(var1.method_524(32767), class_1606.class);
   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      var1.method_525(field_1559.toJson(this.field_1560));
   }

   // $FF: renamed from: b (tQ) void
   public void method_1718(class_59 var1) {
      var1.method_242(this);
   }

   // $FF: renamed from: a () tS
   public class_1606 method_1719() {
      return this.field_1560;
   }

   // $FF: renamed from: b () boolean
   public boolean method_1456() {
      return true;
   }

   // $FF: renamed from: b (rP) void
   public void method_1455(class_57 var1) {
      this.method_1718((class_59)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "Z÷ô/ö(ëð".toCharArray();
      Object var10004 = var10003.length;
      class_1614 var9 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var10 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_1561 = (new String((char[])var9)).intern();
            String var6 = field_1561;
            GsonBuilder var7 = new GsonBuilder();
            var9 = new class_1614;
            var9.method_8821();
            var7 = var7.registerTypeAdapter(class_1612.class, var9);
            class_1608 var1 = new class_1608;
            var1.method_8803();
            var7 = var7.registerTypeAdapter(class_1607.class, var1);
            class_1610 var3 = new class_1610;
            var3.method_8809();
            var7 = var7.registerTypeAdapter(class_1606.class, var3);
            class_1556 var4 = new class_1556;
            var4.method_8478();
            var7 = var7.registerTypeHierarchyAdapter(class_66.class, var4);
            class_1507 var5 = new class_1507;
            var5.method_8183();
            var7 = var7.registerTypeHierarchyAdapter(class_1560.class, var5);
            class_1714 var8 = new class_1714;
            var8.method_9550();
            field_1559 = var7.registerTypeAdapterFactory(var8).create();
            return;
         }

         char var10007 = (char)((Object[])var9)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 231;
            break;
         case 1:
            var10009 = 38;
            break;
         case 2:
            var10009 = 86;
            break;
         case 3:
            var10009 = 58;
            break;
         case 4:
            var10009 = 225;
            break;
         case 5:
            var10009 = 86;
            break;
         default:
            var10009 = 56;
         }

         ((Object[])var9)[var0] = (char)(var10007 ^ var10 ^ var10009);
         ++var0;
      }
   }
}
