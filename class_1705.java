import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

// $FF: renamed from: vk
public class class_1705 implements Map {

   // $FF: renamed from: b java.util.Map
   private final Map field_8938;


   // $FF: renamed from: <init> () void
   public void method_9470() {
      super();
      this.field_8938 = new LinkedHashMap();
   }

   public int size() {
      return this.field_8938.size();
   }

   public boolean isEmpty() {
      return this.field_8938.isEmpty();
   }

   public boolean containsKey(Object var1) {
      return this.field_8938.containsKey(var1.toString().toLowerCase());
   }

   public boolean containsValue(Object var1) {
      return this.field_8938.containsKey(var1);
   }

   public Object get(Object var1) {
      return this.field_8938.get(var1.toString().toLowerCase());
   }

   // $FF: renamed from: b (java.lang.String, java.lang.Object) java.lang.Object
   public Object method_9471(String var1, Object var2) {
      return this.field_8938.put(var1.toLowerCase(), var2);
   }

   public Object remove(Object var1) {
      return this.field_8938.remove(var1.toString().toLowerCase());
   }

   public void putAll(Map var1) {
      String[] var10000 = class_752.method_4253();
      Iterator var3 = var1.entrySet().iterator();
      String[] var2 = var10000;

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         this.method_9471((String)var4.getKey(), var4.getValue());
         if(var2 == null) {
            break;
         }
      }

   }

   public void clear() {
      this.field_8938.clear();
   }

   public Set keySet() {
      return this.field_8938.keySet();
   }

   public Collection values() {
      return this.field_8938.values();
   }

   public Set entrySet() {
      return this.field_8938.entrySet();
   }

   // $FF: synthetic method
   public Object put(Object var1, Object var2) {
      return this.method_9471((String)var1, var2);
   }
}
