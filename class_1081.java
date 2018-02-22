import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

// $FF: renamed from: rR
public class class_1081 extends class_1080 {

   // $FF: renamed from: a java.lang.String
   private final String field_5700;
   // $FF: renamed from: f java.lang.Object[]
   private final Object[] field_5701;
   // $FF: renamed from: g java.lang.Object
   private final Object field_5702;
   // $FF: renamed from: h long
   private long field_5703;
   // $FF: renamed from: i java.util.List
   List field_5704;
   // $FF: renamed from: j java.util.regex.Pattern
   public static final Pattern field_5705;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_5706;


   // $FF: renamed from: <init> (java.lang.String, java.lang.Object[]) void
   public void method_6126(String var1, Object ... var2) {
      super.method_6123();
      this.field_5702 = new Object();
      this.field_5703 = -1L;
      this.field_5704 = Lists.newArrayList();
      this.field_5700 = var1;
      this.field_5701 = var2;
      Object[] var3 = var2;
      int var4 = var2.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Object var6 = var3[var5];

         try {
            if(var6 instanceof class_66) {
               ((class_66)var6).method_338().method_8532(this.method_338());
            }
         } catch (class_888 var7) {
            throw method_6133(var7);
         }
      }

   }

   // $FF: renamed from: h () void
   synchronized void method_6127() {
      String[] var10000 = class_752.method_4253();
      Object var2 = this.field_5702;
      synchronized(this.field_5702){}
      String[] var1 = var10000;
      boolean var9 = false;

      try {
         var9 = true;
         long var3 = class_1563.method_8585();
         if(var1 != null) {
            if(var3 == this.field_5703) {
               return;
            }

            this.field_5703 = var3;
            this.field_5704.clear();
         }

         var9 = false;
      } finally {
         if(var9) {
            ;
         }
      }

      try {
         this.method_6128(class_1563.method_8581(this.field_5700));
      } catch (class_888 var11) {
         this.field_5704.clear();

         try {
            this.method_6128(class_1563.method_8583(this.field_5700));
         } catch (class_888 var10) {
            throw var11;
         }
      }

   }

   // $FF: renamed from: a (java.lang.String) void
   protected void method_6128(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int) rV
   private class_66 method_6129(int param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (rY) rV
   public class_66 method_337(class_1560 param1) {
      // $FF: Couldn't be decompiled
   }

   public Iterator iterator() {
      this.method_6127();
      return Iterators.concat(method_6124(this.field_5704), method_6124(this.field_5696));
   }

   // $FF: renamed from: e () java.lang.String
   public String method_341() {
      this.method_6127();
      StringBuilder var2 = new StringBuilder();
      String[] var1 = class_752.method_4253();
      Iterator var3 = this.field_5704.iterator();

      StringBuilder var10000;
      while(true) {
         if(var3.hasNext()) {
            class_66 var4 = (class_66)var3.next();

            try {
               var10000 = var2.append(var4.method_341());
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  continue;
               }
            } catch (class_888 var5) {
               throw method_6133(var5);
            }
         }

         var10000 = var2;
         break;
      }

      return var10000.toString();
   }

   // $FF: renamed from: i () rR
   public class_1081 method_6130() {
      // $FF: Couldn't be decompiled
   }

   public boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public int hashCode() {
      int var1 = super.hashCode();
      var1 = 31 * var1 + this.field_5700.hashCode();
      var1 = 31 * var1 + Arrays.hashCode(this.field_5701);
      return var1;
   }

   public String toString() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_5706;
      return var10000.append("TranslatableComponent{key=\'").append(this.field_5700).append('\'').append(", args=").append(Arrays.toString(this.field_5701)).append(", siblings=").append(this.field_5696).append(", style=").append(this.method_338()).append('}').toString();
   }

   // $FF: renamed from: j () java.lang.String
   public String method_6131() {
      return this.field_5700;
   }

   // $FF: renamed from: k () java.lang.Object[]
   public Object[] method_6132() {
      return this.field_5701;
   }

   // $FF: renamed from: f () rV
   // $FF: synthetic method
   public class_66 method_345() {
      return this.method_6130();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6125() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_6133(IllegalArgumentException var0) {
      return var0;
   }
}
