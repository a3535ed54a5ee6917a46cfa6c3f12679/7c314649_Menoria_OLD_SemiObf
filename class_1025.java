import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.Iterator;
import java.util.Map;

// $FF: renamed from: cw
public class class_1025 extends class_1022 implements class_44 {

   // $FF: renamed from: a q4
   protected final class_1480 field_5401;
   // $FF: renamed from: b java.util.Map
   protected final Map field_5402;
   // $FF: renamed from: i java.lang.String
   private static final String field_5403 = "minecraft:";


   // $FF: renamed from: <init> () void
   public void method_5804() {
      super.method_5804();
      class_1480 var10001 = new class_1480;
      var10001.method_7989();
      this.field_5401 = var10001;
      this.field_5402 = ((BiMap)this.field_5397).inverse();
   }

   // $FF: renamed from: a (int, java.lang.String, java.lang.Object) void
   public void method_5812(int var1, String var2, Object var3) {
      this.field_5401.method_7990(var3, var1);
      this.method_189(method_5819(var2), var3);
   }

   // $FF: renamed from: a () java.util.Map
   protected Map method_5805() {
      return HashBiMap.create();
   }

   // $FF: renamed from: a (java.lang.String) java.lang.Object
   public Object method_5813(String var1) {
      return super.method_188(method_5819(var1));
   }

   // $FF: renamed from: c (java.lang.Object) java.lang.String
   public String method_5814(Object var1) {
      return (String)this.field_5402.get(var1);
   }

   // $FF: renamed from: b (java.lang.String) boolean
   public boolean method_5815(String var1) {
      return super.method_5807(method_5819(var1));
   }

   // $FF: renamed from: b (java.lang.Object) int
   public int method_5816(Object var1) {
      return this.field_5401.method_7991(var1);
   }

   // $FF: renamed from: a (int) java.lang.Object
   public Object method_5817(int var1) {
      return this.field_5401.method_7992(var1);
   }

   public Iterator iterator() {
      return this.field_5401.iterator();
   }

   // $FF: renamed from: b (int) boolean
   public boolean method_5818(int var1) {
      return this.field_5401.method_7993(var1);
   }

   // $FF: renamed from: c (java.lang.String) java.lang.String
   private static String method_5819(String var0) {
      return var0.indexOf(58) == -1?"minecraft:" + var0:var0;
   }

   // $FF: renamed from: d (java.lang.Object) boolean
   // $FF: synthetic method
   public boolean method_5807(Object var1) {
      return this.method_5815((String)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5808() {
      boolean var10000 = true;
      char[] var10003 = ",.·þÝ\' z".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_5403 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 125;
            break;
         case 1:
            var10009 = 72;
            break;
         case 2:
            var10009 = 124;
            break;
         case 3:
            var10009 = 238;
            break;
         case 4:
            var10009 = 161;
            break;
         case 5:
            var10009 = 202;
            break;
         default:
            var10009 = 128;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
