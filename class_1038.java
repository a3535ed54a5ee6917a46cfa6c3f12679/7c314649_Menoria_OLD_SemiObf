import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

// $FF: renamed from: dh
public class class_1038 {

   // $FF: renamed from: b java.util.TreeMap
   private TreeMap field_5494;
   // $FF: renamed from: c java.lang.String
   private static final String field_5495;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5496;


   // $FF: renamed from: <init> () void
   public void method_5874() {
      super();
      this.field_5494 = new TreeMap();
      String[] var1 = field_5496;
      this.method_5875("doFireTick", "true");
      this.method_5875("mobGriefing", "true");
      this.method_5875("keepInventory", "false");
      this.method_5875("doMobSpawning", "true");
      this.method_5875("doMobLoot", "true");
      this.method_5875("doTileDrops", "true");
      this.method_5875("commandBlockOutput", "true");
      this.method_5875("naturalRegeneration", "true");
      this.method_5875("doDaylightCycle", "true");
   }

   // $FF: renamed from: b (java.lang.String, java.lang.String) void
   public void method_5875(String var1, String var2) {
      TreeMap var10000 = this.field_5494;
      class_1039 var10002 = new class_1039;
      var10002.method_5884(var2);
      var10000.put(var1, var10002);
   }

   // $FF: renamed from: c (java.lang.String, java.lang.String) void
   public void method_5876(String var1, String var2) {
      label16: {
         String[] var10000 = class_752.method_4253();
         class_1039 var4 = (class_1039)this.field_5494.get(var1);
         String[] var3 = var10000;
         class_1039 var5 = var4;
         if(var3 != null) {
            if(var4 == null) {
               break label16;
            }

            var5 = var4;
         }

         var5.method_5885(var2);
         if(var3 != null) {
            return;
         }
      }

      this.method_5875(var1, var2);
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   public String method_5877(String var1) {
      String[] var10000 = class_752.method_4253();
      class_1039 var3 = (class_1039)this.field_5494.get(var1);
      String[] var2 = var10000;
      class_1039 var4 = var3;
      String var5;
      if(var2 != null) {
         if(var3 == null) {
            var5 = "";
            return var5;
         }

         var4 = var3;
      }

      var5 = var4.method_5886();
      return var5;
   }

   // $FF: renamed from: c (java.lang.String) boolean
   public boolean method_5878(String var1) {
      String[] var10000 = class_752.method_4253();
      class_1039 var3 = (class_1039)this.field_5494.get(var1);
      String[] var2 = var10000;
      class_1039 var4 = var3;
      boolean var5;
      if(var2 != null) {
         if(var3 == null) {
            var5 = false;
            return var5;
         }

         var4 = var3;
      }

      var5 = var4.method_5887();
      return var5;
   }

   // $FF: renamed from: b () ro
   public class_1583 method_5879() {
      class_1583 var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var2 = var10000;
      String[] var6 = class_752.method_4253();
      Iterator var3 = this.field_5494.keySet().iterator();
      String[] var1 = var6;

      while(true) {
         if(var3.hasNext()) {
            String var4 = (String)var3.next();
            class_1039 var5 = (class_1039)this.field_5494.get(var4);
            var10000 = var2;
            if(var1 == null) {
               break;
            }

            var2.initGui1(var4, var5.method_5886());
            if(var1 != null) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   // $FF: renamed from: b (ro) void
   public void method_5880(class_1583 var1) {
      Set var3 = var1.method_8663();
      String[] var2 = class_752.method_4253();
      Iterator var4 = var3.iterator();

      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         String var6 = var1.method_8685(var5);
         this.method_5876(var5, var6);
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c () java.lang.String[]
   public String[] method_5881() {
      return (String[])((String[])((String[])this.field_5494.keySet().toArray(new String[0])));
   }

   // $FF: renamed from: d (java.lang.String) boolean
   public boolean method_5882(String var1) {
      return this.field_5494.containsKey(var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_5883() {
      // $FF: Couldn't be decompiled
   }
}
