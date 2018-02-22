import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class bsa implements class_42 {

   // $FF: renamed from: a java.util.List
   private final List field_8230;
   // $FF: renamed from: b int
   private final int field_8231;
   // $FF: renamed from: c int
   private final int field_8232;
   // $FF: renamed from: d int
   private final int field_8233;


   // $FF: renamed from: <init> (java.util.List, int, int, int) void
   public void method_8571(List var1, int var2, int var3, int var4) {
      super();
      this.field_8230 = var1;
      this.field_8231 = var2;
      this.field_8232 = var3;
      this.field_8233 = var4;
   }

   // $FF: renamed from: a () int
   public int method_8572() {
      return this.field_8232;
   }

   // $FF: renamed from: b () int
   public int method_8573() {
      return this.field_8231;
   }

   // $FF: renamed from: c () int
   public int method_8574() {
      return this.field_8230.size();
   }

   // $FF: renamed from: d () int
   public int method_8575() {
      return this.field_8233;
   }

   // $FF: renamed from: d (int) pV
   private class_1483 method_8576(int var1) {
      return (class_1483)this.field_8230.get(var1);
   }

   // $FF: renamed from: a (int) int
   public int method_8577(int var1) {
      String[] var10000 = class_752.method_4253();
      class_1483 var3 = this.method_8576(var1);
      String[] var2 = var10000;
      int var4 = var3.method_8000();
      if(var2 != null) {
         if(var4 != 0) {
            return this.field_8233;
         }

         var4 = var3.method_8001();
      }

      return var4;
   }

   // $FF: renamed from: b (int) boolean
   public boolean method_8578(int var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000 = ((class_1483)this.field_8230.get(var1)).method_8000();
      if(var2 != null) {
         var10000 = !var10000;
      }

      return var10000;
   }

   // $FF: renamed from: c (int) int
   public int method_8579(int var1) {
      return ((class_1483)this.field_8230.get(var1)).method_8002();
   }

   // $FF: renamed from: e () java.util.Set
   public Set method_8580() {
      String[] var10000 = class_752.method_4253();
      HashSet var2 = Sets.newHashSet();
      String[] var1 = var10000;
      Iterator var3 = this.field_8230.iterator();

      HashSet var5;
      while(true) {
         if(var3.hasNext()) {
            class_1483 var4 = (class_1483)var3.next();
            var5 = var2;
            if(var1 == null) {
               break;
            }

            var2.add(Integer.valueOf(var4.method_8002()));
            if(var1 != null) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }
}
