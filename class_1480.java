import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

// $FF: renamed from: q4
public class class_1480 implements class_44 {

   // $FF: renamed from: b java.util.IdentityHashMap
   private IdentityHashMap field_7791;
   // $FF: renamed from: c java.util.List
   private List field_7792;
   // $FF: renamed from: d java.lang.String
   private static final String field_7793 = "CL_00001203";


   // $FF: renamed from: <init> () void
   public void method_7989() {
      super();
      this.field_7791 = new IdentityHashMap(512);
      this.field_7792 = Lists.newArrayList();
   }

   // $FF: renamed from: b (java.lang.Object, int) void
   public void method_7990(Object var1, int var2) {
      String[] var10000 = class_752.method_4253();
      this.field_7791.put(var1, Integer.valueOf(var2));
      String[] var3 = var10000;

      while(true) {
         if(this.field_7792.size() <= var2) {
            this.field_7792.add((Object)null);
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         this.field_7792.set(var2, var1);
         break;
      }

   }

   // $FF: renamed from: a (java.lang.Object) int
   public int method_7991(Object var1) {
      Integer var2 = (Integer)this.field_7791.get(var1);
      return var2 == null?-1:var2.intValue();
   }

   // $FF: renamed from: b (int) java.lang.Object
   public Object method_7992(int var1) {
      return var1 >= 0 && var1 < this.field_7792.size()?this.field_7792.get(var1):null;
   }

   public Iterator iterator() {
      return Iterators.filter(this.field_7792.iterator(), Predicates.notNull());
   }

   // $FF: renamed from: c (int) boolean
   public boolean method_7993(int var1) {
      return this.method_7992(var1) != null;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7994() {
      boolean var10000 = true;
      char[] var10003 = "%FkCWeéE".toCharArray();
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
            field_7793 = (new String((char[])var4)).intern();
            String var2 = field_7793;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 82;
            break;
         case 1:
            var10009 = 99;
            break;
         case 2:
            var10009 = 237;
            break;
         case 3:
            var10009 = 66;
            break;
         case 4:
            var10009 = 111;
            break;
         case 5:
            var10009 = 71;
            break;
         default:
            var10009 = 137;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
