import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

// $FF: renamed from: x8
public abstract class class_1721 {

   // $FF: renamed from: b java.util.Map
   protected final Map field_9023;
   // $FF: renamed from: c java.util.Map
   protected final Map field_9024;


   // $FF: renamed from: <init> () void
   public void method_9614() {
      super();
      this.field_9023 = new HashMap();
      class_1705 var10001 = new class_1705;
      var10001.method_9470();
      this.field_9024 = var10001;
   }

   // $FF: renamed from: b (x3) x4
   public class_80 method_9615(class_79 var1) {
      return (class_80)this.field_9023.get(var1);
   }

   // $FF: renamed from: b (java.lang.String) x4
   public class_80 method_9616(String var1) {
      return (class_80)this.field_9024.get(var1);
   }

   // $FF: renamed from: c (x3) x4
   public abstract class_80 method_9617(class_79 var1);

   // $FF: renamed from: b () java.util.Collection
   public Collection method_9618() {
      return this.field_9024.values();
   }

   // $FF: renamed from: b (x_) void
   public void method_9619(class_1789 var1) {}

   // $FF: renamed from: b (com.google.common.collect.Multimap) void
   public void method_9620(Multimap var1) {
      String[] var10000 = class_752.method_4253();
      Iterator var3 = var1.entries().iterator();
      String[] var2 = var10000;

      while(var3.hasNext()) {
         label19: {
            Entry var4 = (Entry)var3.next();
            class_80 var5 = this.method_9616((String)var4.getKey());
            class_80 var6 = var5;
            if(var2 != null) {
               if(var5 == null) {
                  break label19;
               }

               var6 = var5;
            }

            var6.method_394((class_1716)var4.getValue());
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c (com.google.common.collect.Multimap) void
   public void method_9621(Multimap var1) {
      String[] var10000 = class_752.method_4253();
      Iterator var3 = var1.entries().iterator();
      String[] var2 = var10000;

      while(var3.hasNext()) {
         label19: {
            Entry var4 = (Entry)var3.next();
            class_80 var5 = this.method_9616((String)var4.getKey());
            class_80 var6 = var5;
            if(var2 != null) {
               if(var5 == null) {
                  break label19;
               }

               var5.method_394((class_1716)var4.getValue());
               var6 = var5;
            }

            var6.method_393((class_1716)var4.getValue());
         }

         if(var2 == null) {
            break;
         }
      }

   }
}
