import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

// $FF: renamed from: r_
public class class_331 extends class_250 {

   // $FF: renamed from: c java.util.Map
   private Map field_1677;
   // $FF: renamed from: i java.lang.String
   private static final String field_1678 = "count=%d";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (java.util.Map) void
   public void method_1882(Map var1) {
      super.method_1449();
      this.field_1677 = var1;
   }

   // $FF: renamed from: b (tF) void
   public void method_1883(class_64 var1) {
      var1.method_279(this);
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      int var3 = var1.method_518();
      String[] var2 = class_752.method_4253();
      this.field_1677 = Maps.newHashMap();
      int var4 = 0;

      while(var4 < var3) {
         class_1601 var5 = class_1698.method_9394(var1.method_524(32767));
         int var6 = var1.method_518();
         if(var2 != null) {
            if(var5 != null) {
               this.field_1677.put(var5, Integer.valueOf(var6));
            }

            ++var4;
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      String[] var10000 = class_752.method_4253();
      var1.method_519(this.field_1677.size());
      String[] var2 = var10000;
      Iterator var3 = this.field_1677.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         var1.method_525(((class_1601)var4.getKey()).field_8364);
         var1.method_519(((Integer)var4.getValue()).intValue());
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      return String.format("count=%d", new Object[]{Integer.valueOf(this.field_1677.size())});
   }

   // $FF: renamed from: a () java.util.Map
   public Map method_1884() {
      return this.field_1677;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "Azy;tQF".toCharArray();
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
            field_1678 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 229;
            break;
         case 1:
            var10009 = 210;
            break;
         case 2:
            var10009 = 203;
            break;
         case 3:
            var10009 = 146;
            break;
         case 4:
            var10009 = 172;
            break;
         case 5:
            var10009 = 142;
            break;
         default:
            var10009 = 179;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
