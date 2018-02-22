import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// $FF: renamed from: kl
public class class_1348 {

   // $FF: renamed from: b java.util.Map
   private final Map field_6942;
   // $FF: renamed from: c java.util.Map
   private final Map field_6943;
   // $FF: renamed from: d java.util.Map
   private final Map field_6944;
   // $FF: renamed from: e kh[]
   private final class_1344[] field_6945;
   // $FF: renamed from: f java.util.Map
   private final Map field_6946;
   // $FF: renamed from: g java.util.Map
   private final Map field_6947;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6948;


   // $FF: renamed from: <init> () void
   public void method_7159() {
      super();
      this.field_6942 = new HashMap();
      this.field_6943 = new HashMap();
      this.field_6944 = new HashMap();
      this.field_6945 = new class_1344[3];
      this.field_6946 = new HashMap();
      this.field_6947 = new HashMap();
   }

   // $FF: renamed from: a (java.lang.String) kh
   public class_1344 method_7160(String var1) {
      return (class_1344)this.field_6942.get(var1);
   }

   // $FF: renamed from: b (java.lang.String, ks) kh
   public class_1344 method_7161(String param1, class_34 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (ks) java.util.Collection
   public Collection method_7162(class_34 var1) {
      Collection var2 = (Collection)this.field_6943.get(var1);

      ArrayList var10000;
      try {
         if(var2 == null) {
            var10000 = new ArrayList();
            return var10000;
         }
      } catch (IllegalArgumentException var3) {
         throw method_7192(var3);
      }

      var10000 = new ArrayList(var2);
      return var10000;
   }

   // $FF: renamed from: b (java.lang.String, kh) ki
   public class_1345 method_7163(String var1, class_1344 var2) {
      Object var4 = (Map)this.field_6944.get(var1);
      String[] var3 = class_752.method_4253();

      Object var10000;
      label39: {
         label38: {
            try {
               var10000 = var4;
               if(var3 == null) {
                  break label39;
               }

               if(var4 != null) {
                  break label38;
               }
            } catch (IllegalArgumentException var7) {
               throw method_7192(var7);
            }

            var4 = new HashMap();
            this.field_6944.put(var1, var4);
         }

         var10000 = ((Map)var4).get(var2);
      }

      class_1345 var5 = (class_1345)var10000;

      class_1345 var8;
      label28: {
         try {
            var8 = var5;
            if(var3 == null) {
               return var8;
            }

            if(var5 != null) {
               break label28;
            }
         } catch (IllegalArgumentException var6) {
            throw method_7192(var6);
         }

         var8 = new class_1345;
         var8.method_7128(this, var2, var1);
         var5 = var8;
         ((Map)var4).put(var2, var5);
      }

      var8 = var5;
      return var8;
   }

   // $FF: renamed from: a (kh) java.util.Collection
   public Collection method_7164(class_1344 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () java.util.Collection
   public Collection method_7165() {
      return this.field_6942.values();
   }

   // $FF: renamed from: b () java.util.Collection
   public Collection method_7166() {
      return this.field_6944.keySet();
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_7167(String var1) {
      Map var2 = (Map)this.field_6944.remove(var1);

      try {
         if(var2 != null) {
            this.method_7186(var1);
         }

      } catch (IllegalArgumentException var3) {
         throw method_7192(var3);
      }
   }

   // $FF: renamed from: c () java.util.Collection
   public Collection method_7168() {
      String[] var10000 = class_752.method_4253();
      Collection var2 = this.field_6944.values();
      String[] var1 = var10000;
      ArrayList var3 = new ArrayList();
      Iterator var4 = var2.iterator();

      ArrayList var7;
      while(true) {
         if(var4.hasNext()) {
            Map var5 = (Map)var4.next();

            try {
               var7 = var3;
               if(var1 == null) {
                  break;
               }

               var3.addAll(var5.values());
               if(var1 != null) {
                  continue;
               }
            } catch (IllegalArgumentException var6) {
               throw method_7192(var6);
            }
         }

         var7 = var3;
         break;
      }

      return var7;
   }

   // $FF: renamed from: c (java.lang.String) java.util.Map
   public Map method_7169(String var1) {
      String[] var10000 = class_752.method_4253();
      Object var3 = (Map)this.field_6944.get(var1);
      String[] var2 = var10000;

      Object var5;
      label20: {
         try {
            var5 = var3;
            if(var2 == null) {
               return (Map)var5;
            }

            if(var3 != null) {
               break label20;
            }
         } catch (IllegalArgumentException var4) {
            throw method_7192(var4);
         }

         var3 = new HashMap();
      }

      var5 = var3;
      return (Map)var5;
   }

   // $FF: renamed from: b (kh) void
   public void method_7170(class_1344 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, kh) void
   public void method_7171(int var1, class_1344 var2) {
      this.field_6945[var1] = var2;
   }

   // $FF: renamed from: b (int) kh
   public class_1344 method_7172(int var1) {
      return this.field_6945[var1];
   }

   // $FF: renamed from: d (java.lang.String) ko
   public class_1351 method_7173(String var1) {
      return (class_1351)this.field_6946.get(var1);
   }

   // $FF: renamed from: e (java.lang.String) ko
   public class_1351 method_7174(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (ko) void
   public void method_7175(class_1351 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_6946.remove(var1.method_7296());
      Iterator var3 = var1.setMaxStringLength3().iterator();
      String[] var2 = var10000;

      while(true) {
         if(var3.hasNext()) {
            String var4 = (String)var3.next();

            try {
               this.field_6947.remove(var4);
               if(var2 == null) {
                  break;
               }

               if(var2 != null) {
                  continue;
               }
            } catch (IllegalArgumentException var5) {
               throw method_7192(var5);
            }
         }

         this.method_7189(var1);
         break;
      }

   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) boolean
   public boolean method_7176(String param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: f (java.lang.String) boolean
   public boolean method_7177(String param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String, ko) void
   public void method_7178(String param1, class_1351 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: d () java.util.Collection
   public Collection method_7179() {
      return this.field_6946.keySet();
   }

   // $FF: renamed from: e () java.util.Collection
   public Collection method_7180() {
      return this.field_6946.values();
   }

   // $FF: renamed from: g (java.lang.String) ko
   public class_1351 method_7181(String var1) {
      return (class_1351)this.field_6947.get(var1);
   }

   // $FF: renamed from: c (kh) void
   public void method_7182(class_1344 var1) {}

   // $FF: renamed from: d (kh) void
   public void method_7183(class_1344 var1) {}

   // $FF: renamed from: e (kh) void
   public void method_7184(class_1344 var1) {}

   // $FF: renamed from: b (ki) void
   public void method_7185(class_1345 var1) {}

   // $FF: renamed from: h (java.lang.String) void
   public void method_7186(String var1) {}

   // $FF: renamed from: b (ko) void
   public void method_7187(class_1351 var1) {}

   // $FF: renamed from: c (ko) void
   public void method_7188(class_1351 var1) {}

   // $FF: renamed from: d (ko) void
   public void method_7189(class_1351 var1) {}

   // $FF: renamed from: c (int) java.lang.String
   public static String method_7190(int var0) {
      String[] var1;
      label20: {
         try {
            switch(var0) {
            case 0:
               var1 = field_6948;
               return "list";
            case 1:
               break label20;
            case 2:
               break;
            default:
               return null;
            }
         } catch (IllegalArgumentException var2) {
            throw method_7192(var2);
         }

         String[] var10000 = field_6948;
         return "belowName";
      }

      var1 = field_6948;
      return "sidebar";
   }

   // $FF: renamed from: i (java.lang.String) int
   public static int method_7191(String param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_7192(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7193() {
      // $FF: Couldn't be decompiled
   }
}
