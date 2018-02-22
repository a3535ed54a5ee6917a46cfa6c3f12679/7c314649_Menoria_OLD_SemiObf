import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: z9
public class class_1840 {

   // $FF: renamed from: a org.apache.logging.log4j.Logger
   private static final Logger field_9389;
   // $FF: renamed from: b x3
   public static final class_79 field_9390;
   // $FF: renamed from: c x3
   public static final class_79 field_9391;
   // $FF: renamed from: d x3
   public static final class_79 field_9392;
   // $FF: renamed from: e x3
   public static final class_79 field_9393;
   // $FF: renamed from: f x3
   public static final class_79 field_9394;
   // $FF: renamed from: g java.lang.String
   private static final String field_9395;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_9396;


   // $FF: renamed from: <init> () void
   public void method_9950() {
      super();
   }

   // $FF: renamed from: b (x8) rr
   public static class_1580 method_9951(class_1721 var0) {
      String[] var10000 = class_752.method_4253();
      class_1580 var10001 = new class_1580;
      var10001.method_8628();
      class_1580 var2 = var10001;
      String[] var1 = var10000;
      Iterator var3 = var0.method_9618().iterator();

      class_1580 var5;
      while(true) {
         if(var3.hasNext()) {
            class_80 var4 = (class_80)var3.next();
            var5 = var2;
            if(var1 == null) {
               break;
            }

            var2.method_8650(method_9952(var4));
            if(var1 != null) {
               continue;
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   // $FF: renamed from: b (x4) ro
   private static class_1583 method_9952(class_80 var0) {
      class_1583 var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var2 = var10000;
      String[] var9 = class_752.method_4253();
      class_79 var3 = var0.method_388();
      String[] var8 = field_9396;
      var2.initGui1("Name", var3.method_384());
      String[] var1 = var9;
      var2.initGui0("Base", var0.method_389());
      Collection var4 = var0.method_391();
      Collection var10 = var4;
      if(var1 != null) {
         if(var4 == null) {
            return var2;
         }

         var10 = var4;
      }

      if(!var10.isEmpty()) {
         class_1580 var11 = new class_1580;
         var11.method_8628();
         class_1580 var5 = var11;
         Iterator var6 = var4.iterator();

         while(true) {
            if(var6.hasNext()) {
               class_1716 var7 = (class_1716)var6.next();
               if(var1 == null) {
                  break;
               }

               if(var7.method_9598()) {
                  var5.method_8650(method_9953(var7));
               }

               if(var1 != null) {
                  continue;
               }
            }

            String[] var10001 = field_9396;
            var2.method_8664("Modifiers", var5);
            break;
         }
      }

      return var2;
   }

   // $FF: renamed from: b (x5) ro
   private static class_1583 method_9953(class_1716 var0) {
      class_1583 var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var1 = var10000;
      String[] var2 = field_9396;
      var1.initGui1("Name", var0.method_9595());
      var1.initGui0("Amount", var0.method_9597());
      var1.method_8667("Operation", var0.method_9596());
      var1.method_8668("UUIDMost", var0.method_9594().getMostSignificantBits());
      var1.method_8668("UUIDLeast", var0.method_9594().getLeastSignificantBits());
      return var1;
   }

   // $FF: renamed from: b (x8, rr) void
   public static void method_9954(class_1721 var0, class_1580 var1) {
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var2 = var10000;

      while(var3 < var1.method_8658()) {
         label23: {
            class_1583 var4;
            String[] var6;
            label22: {
               var4 = var1.method_8653(var3);
               var6 = field_9396;
               class_80 var5 = var0.method_9616(var4.method_8685("Name"));
               class_80 var7 = var5;
               if(var2 != null) {
                  if(var5 == null) {
                     break label22;
                  }

                  var7 = var5;
               }

               method_9955(var7, var4);
               if(var2 != null) {
                  break label23;
               }
            }

            Logger var8 = field_9389;
            StringBuilder var10001 = new StringBuilder();
            var6 = field_9396;
            var8.warn(var10001.append("Ignoring unknown attribute \'").append(var4.method_8685("Name")).append("\'").toString());
         }

         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (x4, ro) void
   private static void method_9955(class_80 var0, class_1583 var1) {
      String[] var10000 = class_752.method_4253();
      String[] var7 = field_9396;
      var0.method_390(var1.method_8684("Base"));
      String[] var2 = var10000;
      class_1583 var8 = var1;
      String var10001 = "Modifiers";
      byte var10002 = 9;
      if(var2 != null) {
         if(!var1.initGui8("Modifiers", 9)) {
            return;
         }

         var8 = var1;
         var10001 = "Modifiers";
         var10002 = 10;
      }

      class_1580 var3 = var8.method_8689(var10001, var10002);
      int var4 = 0;

      while(var4 < var3.method_8658()) {
         class_1716 var5 = method_9956(var3.method_8653(var4));
         class_1716 var6 = var0.method_392(var5.method_9594());
         if(var2 != null) {
            if(var6 != null) {
               var0.method_394(var6);
            }

            var0.method_393(var5);
            ++var4;
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (ro) x5
   public static class_1716 method_9956(class_1583 var0) {
      UUID var10000 = new UUID(var0.method_8682("UUIDMost"), var0.method_8682("UUIDLeast"));
      String[] var2 = field_9396;
      UUID var1 = var10000;
      class_1716 var3 = new class_1716;
      var3.method_9593(var1, var0.method_8685("Name"), var0.method_8684("Amount"), var0.method_8681("Operation"));
      return var3;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9957() {
      // $FF: Couldn't be decompiled
   }
}
