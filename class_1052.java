import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

// $FF: renamed from: g4
public abstract class class_1052 extends class_1051 {

   // $FF: renamed from: a jP
   private class_1297 field_5567;
   // $FF: renamed from: e java.util.Map
   protected Map field_5568;
   // $FF: renamed from: f java.lang.String
   private static final String field_5569;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5570;


   // $FF: renamed from: <init> () void
   public void method_5960() {
      super.method_5960();
      this.field_5568 = new HashMap();
   }

   // $FF: renamed from: b () java.lang.String
   public abstract String method_5963();

   // $FF: renamed from: b (ahb, int, int, int, int, aji[]) void
   protected final void method_5962(ahb param1, int param2, int param3, int param4, int param5, aji[] param6) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int) boolean
   public boolean method_5964(ahb param1, Random param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int, int) boolean
   public boolean method_5965(int var1, int var2, int var3) {
      boolean var10000;
      try {
         this.method_5970(this.field_5566);
         if(this.method_5966(var1, var2, var3) != null) {
            var10000 = true;
            return var10000;
         }
      } catch (class_643 var4) {
         throw method_5974(var4);
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: b (int, int, int) i2
   protected class_1199 method_5966(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int, int, int) boolean
   public boolean method_5967(int var1, int var2, int var3) {
      this.method_5970(this.field_5566);
      String[] var10000 = class_752.method_4253();
      Iterator var5 = this.field_5568.values().iterator();
      String[] var4 = var10000;

      boolean var7;
      while(true) {
         if(!var5.hasNext()) {
            var7 = false;
            break;
         }

         class_1199 var6 = (class_1199)var5.next();
         if(var6.method_6460()) {
            var7 = var6.method_6450().method_6484(var1, var3, var1, var3);
            if(var4 != null) {
               return var7;
            }
            break;
         }
      }

      return var7;
   }

   // $FF: renamed from: b (ahb, int, int, int) dd
   public class_1034 method_5968(ahb param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () java.util.List
   protected List method_5969() {
      return null;
   }

   // $FF: renamed from: b (ahb) void
   private void method_5970(ahb param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int, i2) void
   private void method_5971(int var1, int var2, class_1199 var3) {
      this.field_5567.method_6808(var3.method_6454(var1, var2), var1, var2);
      this.field_5567.method_6771();
   }

   // $FF: renamed from: b (int, int) boolean
   protected abstract boolean method_5972(int var1, int var2);

   // $FF: renamed from: c (int, int) i2
   protected abstract class_1199 method_5973(int var1, int var2);

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_5974(Throwable var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5975() {
      // $FF: Couldn't be decompiled
   }
}
