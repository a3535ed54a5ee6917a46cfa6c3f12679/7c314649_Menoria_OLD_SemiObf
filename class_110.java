import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Iterator;
import java.util.Set;

// $FF: renamed from: b
public class class_110 extends ForwardingSet implements class_76 {

   // $FF: renamed from: b java.util.Set
   private final Set field_202;


   // $FF: renamed from: <init> () void
   public void method_513() {
      super();
      this.field_202 = Sets.newHashSet();
   }

   // $FF: renamed from: b (com.google.gson.JsonElement) void
   public void method_379(JsonElement var1) {
      String[] var2 = class_752.method_4253();
      JsonElement var10000 = var1;
      if(var2 != null) {
         if(!var1.isJsonArray()) {
            return;
         }

         var10000 = var1;
      }

      Iterator var3 = var10000.getAsJsonArray().iterator();

      while(var3.hasNext()) {
         JsonElement var4 = (JsonElement)var3.next();
         this.add(var4.getAsString());
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b () com.google.gson.JsonElement
   public JsonElement method_380() {
      String[] var10000 = class_752.method_4253();
      JsonArray var2 = new JsonArray();
      String[] var1 = var10000;
      Iterator var3 = this.iterator();

      JsonArray var5;
      while(true) {
         if(var3.hasNext()) {
            String var4 = (String)var3.next();
            var5 = var2;
            if(var1 == null) {
               break;
            }

            var2.add(new JsonPrimitive(var4));
            if(var1 != null) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   protected Set delegate() {
      return this.field_202;
   }
}
