import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: ub
public class class_1657 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_8622;
   // $FF: renamed from: c dk
   private final class_354 field_8623;
   // $FF: renamed from: d java.util.Set
   private Set field_8624;
   // $FF: renamed from: e vl
   private class_1706 field_8625;
   // $FF: renamed from: f int
   private int field_8626;
   // $FF: renamed from: g java.lang.String
   private static final String field_8627;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8628;


   // $FF: renamed from: <init> (dk) void
   public void method_9113(class_354 var1) {
      super();
      this.field_8624 = new HashSet();
      class_1706 var10001 = new class_1706;
      var10001.method_9472();
      this.field_8625 = var10001;
      this.field_8623 = var1;
      this.field_8626 = var1.method_2255().method_2383().method_8877();
   }

   // $FF: renamed from: b (sa) void
   public void method_9114(class_689 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sa, int, int) void
   public void method_9115(class_689 var1, int var2, int var3) {
      this.method_9116(var1, var2, var3, false);
   }

   // $FF: renamed from: b (sa, int, int, boolean) void
   public void method_9116(class_689 param1, int param2, int param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (sa) void
   public void method_9117(class_689 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () void
   public void method_9118() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (sa, r1) void
   public void method_9119(class_689 var1, class_250 var2) {
      String[] var10000 = class_752.method_4253();
      class_1671 var4 = (class_1671)this.field_8625.method_9475(var1.method_3845());
      String[] var3 = var10000;

      class_1671 var6;
      label20: {
         try {
            var6 = var4;
            if(var3 == null) {
               break label20;
            }

            if(var4 == null) {
               return;
            }
         } catch (class_643 var5) {
            throw method_9124(var5);
         }

         var6 = var4;
      }

      var6.method_9218(var2);
   }

   // $FF: renamed from: c (sa, r1) void
   public void method_9120(class_689 var1, class_250 var2) {
      class_1671 var4 = (class_1671)this.field_8625.method_9475(var1.method_3845());
      String[] var3 = class_752.method_4253();

      class_1671 var10000;
      label20: {
         try {
            var10000 = var4;
            if(var3 == null) {
               break label20;
            }

            if(var4 == null) {
               return;
            }
         } catch (class_643 var5) {
            throw method_9124(var5);
         }

         var10000 = var4;
      }

      var10000.method_9219(var2);
   }

   // $FF: renamed from: b (xi) void
   public void method_9121(class_793 var1) {
      String[] var10000 = class_752.method_4253();
      Iterator var3 = this.field_8624.iterator();
      String[] var2 = var10000;

      while(var3.hasNext()) {
         class_1671 var4 = (class_1671)var3.next();
         var4.method_9226(var1);
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (xi, gI) void
   public void method_9122(class_793 param1, class_1069 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_9123() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_9124(Throwable var0) {
      return var0;
   }
}
