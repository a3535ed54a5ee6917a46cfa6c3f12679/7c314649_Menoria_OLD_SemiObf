import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

// $FF: renamed from: x9
public class class_1722 extends class_1721 {

   // $FF: renamed from: a java.util.Set
   private final Set field_9025;
   // $FF: renamed from: d java.util.Map
   protected final Map field_9026;
   // $FF: renamed from: e java.lang.String
   private static final String field_9027;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_9028;


   // $FF: renamed from: <init> () void
   public void method_9614() {
      super.method_9614();
      this.field_9025 = Sets.newHashSet();
      class_1705 var10001 = new class_1705;
      var10001.method_9470();
      this.field_9026 = var10001;
   }

   // $FF: renamed from: a (x3) x_
   public class_1789 method_9622(class_79 var1) {
      return (class_1789)super.method_9615(var1);
   }

   // $FF: renamed from: a (java.lang.String) x_
   public class_1789 method_9623(String var1) {
      class_80 var3 = super.method_9616(var1);
      String[] var2 = class_752.method_4253();

      class_80 var10000;
      label20: {
         try {
            var10000 = var3;
            if(var2 == null) {
               return (class_1789)var10000;
            }

            if(var3 != null) {
               break label20;
            }
         } catch (IllegalArgumentException var4) {
            throw method_9626(var4);
         }

         var3 = (class_80)this.field_9026.get(var1);
      }

      var10000 = var3;
      return (class_1789)var10000;
   }

   // $FF: renamed from: c (x3) x4
   public class_80 method_9617(class_79 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (x_) void
   public void method_9619(class_1789 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () java.util.Set
   public Set method_9624() {
      return this.field_9025;
   }

   // $FF: renamed from: d () java.util.Collection
   public Collection method_9625() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_9626(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9627() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "H-\b©:Ta  J#ëLLÍwðVÙg2øAWy0ðVZÝy3¸";
      int var4 = "H-\b©:Ta  J#ëLLÍwðVÙg2øAWy0ðVZÝy3¸".length();
      char var1 = 11;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_9028 = var5;
                  String[] var10 = field_9028;
                  field_9027 = "CL_00001569";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 14;
               break;
            case 1:
               var10009 = 100;
               break;
            case 2:
               var10009 = 82;
               break;
            case 3:
               var10009 = 156;
               break;
            case 4:
               var10009 = 32;
               break;
            case 5:
               var10009 = 43;
               break;
            default:
               var10009 = 189;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
