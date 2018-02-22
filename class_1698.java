import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// $FF: renamed from: vc
public class class_1698 {

   // $FF: renamed from: b java.util.Map
   protected static Map field_8880;
   // $FF: renamed from: c java.util.List
   public static List field_8881;
   // $FF: renamed from: d java.util.List
   public static List field_8882;
   // $FF: renamed from: e java.util.List
   public static List field_8883;
   // $FF: renamed from: f java.util.List
   public static List field_8884;
   // $FF: renamed from: g u2
   public static class_1601 field_8885;
   // $FF: renamed from: h u2
   public static class_1601 field_8886;
   // $FF: renamed from: i u2
   public static class_1601 field_8887;
   // $FF: renamed from: j u2
   public static class_1601 field_8888;
   // $FF: renamed from: k u2
   public static class_1601 field_8889;
   // $FF: renamed from: l u2
   public static class_1601 field_8890;
   // $FF: renamed from: m u2
   public static class_1601 field_8891;
   // $FF: renamed from: n u2
   public static class_1601 field_8892;
   // $FF: renamed from: o u2
   public static class_1601 field_8893;
   // $FF: renamed from: p u2
   public static class_1601 field_8894;
   // $FF: renamed from: q u2
   public static class_1601 field_8895;
   // $FF: renamed from: r u2
   public static class_1601 field_8896;
   // $FF: renamed from: s u2
   public static class_1601 field_8897;
   // $FF: renamed from: t u2
   public static class_1601 field_8898;
   // $FF: renamed from: u u2
   public static class_1601 field_8899;
   // $FF: renamed from: v u2
   public static class_1601 field_8900;
   // $FF: renamed from: w u2
   public static class_1601 field_8901;
   // $FF: renamed from: x u2
   public static class_1601 field_8902;
   // $FF: renamed from: y u2
   public static class_1601 field_8903;
   // $FF: renamed from: z u2
   public static class_1601 field_8904;
   // $FF: renamed from: A u2
   public static class_1601 field_8905;
   // $FF: renamed from: B u2
   public static class_1601 field_8906;
   // $FF: renamed from: C u2
   public static class_1601 field_8907;
   // $FF: renamed from: D u2[]
   public static final class_1601[] field_8908;
   // $FF: renamed from: E u2[]
   public static final class_1601[] field_8909;
   // $FF: renamed from: F u2[]
   public static final class_1601[] field_8910;
   // $FF: renamed from: G u2[]
   public static final class_1601[] field_8911;
   // $FF: renamed from: H java.lang.String
   private static final String field_8912;
   // $FF: renamed from: I java.lang.String[]
   private static final String[] field_8913;


   // $FF: renamed from: <init> () void
   public void method_9384() {
      super();
   }

   // $FF: renamed from: b () void
   public static void method_9385() {
      method_9387();
      method_9388();
      method_9389();
      method_9386();
      class_1600.method_8745();
      class_1775.method_9761();
   }

   // $FF: renamed from: c () void
   private static void method_9386() {
      HashSet var1 = new HashSet();
      String[] var0 = class_752.method_4253();
      Iterator var2 = class_1031.method_5835().method_5840().iterator();

      label64: {
         Object var10000;
         while(true) {
            if(var2.hasNext()) {
               class_19 var3 = (class_19)var2.next();
               var10000 = var3.method_63();
               if(var0 == null) {
                  break;
               }

               if(var10000 != null) {
                  var1.add(var3.method_63().method_3730());
               }

               if(var0 != null) {
                  continue;
               }
            }

            var2 = class_1018.method_5783().method_5790().values().iterator();

            while(true) {
               if(var2.hasNext()) {
                  add var6 = (add)var2.next();
                  var1.add(var6.method_3730());
                  if(var0 == null) {
                     break;
                  }

                  if(var0 != null) {
                     continue;
                  }
               }

               var2 = var1.iterator();
               break;
            }

            if(!var2.hasNext()) {
               break label64;
            }

            var10000 = var2.next();
            break;
         }

         while(true) {
            adb var7 = (adb)var10000;
            if(var0 == null) {
               return;
            }

            label30: {
               adb var8 = var7;
               if(var0 != null) {
                  if(var7 == null) {
                     break label30;
                  }

                  var8 = var7;
               }

               int var4 = adb.method_2918(var8);
               class_1601[] var9 = field_8909;
               class_1602 var10002 = new class_1602;
               StringBuilder var10004 = new StringBuilder();
               String[] var5 = field_8913;
               String var10 = var10004.append("stat.craftItem.").append(var4).toString();
               class_1081 var10005 = new class_1081;
               Object[] var10008 = new Object[1];
               add var10011 = new add;
               var10011.method_3724(var7);
               var10008[0] = var10011.method_3789();
               var10005.method_6126("stat.craftItem", var10008);
               var10002.method_8762(var10, var10005, var7);
               var9[var4] = var10002.method_8750();
            }

            if(var0 == null || !var2.hasNext()) {
               break;
            }

            var10000 = var2.next();
         }
      }

      method_9390(field_8909);
   }

   // $FF: renamed from: d () void
   private static void method_9387() {
      String[] var10000 = class_752.method_4253();
      Iterator var1 = aji.field_1973.iterator();
      String[] var0 = var10000;

      while(true) {
         if(var1.hasNext()) {
            aji var2 = (aji)var1.next();
            if(var0 == null) {
               break;
            }

            label39: {
               aji var5 = var2;
               if(var0 != null) {
                  if(adb.method_2920(var2) == null) {
                     break label39;
                  }

                  var5 = var2;
               }

               int var3 = aji.method_2415(var5);
               if(var0 != null && var2.method_2512()) {
                  class_1601[] var6 = field_8908;
                  class_1602 var10002 = new class_1602;
                  StringBuilder var10004 = new StringBuilder();
                  String[] var4 = field_8913;
                  String var7 = var10004.append("stat.mineBlock.").append(var3).toString();
                  class_1081 var10005 = new class_1081;
                  Object[] var10008 = new Object[1];
                  add var10011 = new add;
                  var10011.method_3721(var2);
                  var10008[0] = var10011.method_3789();
                  var10005.method_6126("stat.mineBlock", var10008);
                  var10002.method_8762(var7, var10005, adb.method_2920(var2));
                  var6[var3] = var10002.method_8750();
                  field_8884.add((class_1602)field_8908[var3]);
               }
            }

            if(var0 != null) {
               continue;
            }
         }

         method_9390(field_8908);
         break;
      }

   }

   // $FF: renamed from: e () void
   private static void method_9388() {
      String[] var10000 = class_752.method_4253();
      Iterator var1 = adb.field_2329.iterator();
      String[] var0 = var10000;

      while(true) {
         if(var1.hasNext()) {
            adb var2 = (adb)var1.next();
            if(var0 == null) {
               break;
            }

            label39: {
               adb var5 = var2;
               if(var0 != null) {
                  if(var2 == null) {
                     break label39;
                  }

                  var5 = var2;
               }

               int var3 = adb.method_2918(var5);
               class_1601[] var6 = field_8910;
               class_1602 var10002 = new class_1602;
               StringBuilder var10004 = new StringBuilder();
               String[] var4 = field_8913;
               String var7 = var10004.append("stat.useItem.").append(var3).toString();
               class_1081 var10005 = new class_1081;
               Object[] var10008 = new Object[1];
               add var10011 = new add;
               var10011.method_3724(var2);
               var10008[0] = var10011.method_3789();
               var10005.method_6126("stat.useItem", var10008);
               var10002.method_8762(var7, var10005, var2);
               var6[var3] = var10002.method_8750();
               if(var0 != null && !(var2 instanceof abh)) {
                  field_8883.add((class_1602)field_8910[var3]);
               }
            }

            if(var0 != null) {
               continue;
            }
         }

         method_9390(field_8910);
         break;
      }

   }

   // $FF: renamed from: f () void
   private static void method_9389() {
      String[] var10000 = class_752.method_4253();
      Iterator var1 = adb.field_2329.iterator();
      String[] var0 = var10000;

      while(true) {
         if(var1.hasNext()) {
            adb var2 = (adb)var1.next();
            if(var0 == null) {
               break;
            }

            label23: {
               adb var5 = var2;
               if(var0 != null) {
                  if(var2 == null) {
                     break label23;
                  }

                  var5 = var2;
               }

               int var3 = adb.method_2918(var5);
               if(var2.method_2936()) {
                  class_1601[] var6 = field_8911;
                  class_1602 var10002 = new class_1602;
                  StringBuilder var10004 = new StringBuilder();
                  String[] var4 = field_8913;
                  String var7 = var10004.append("stat.breakItem.").append(var3).toString();
                  class_1081 var10005 = new class_1081;
                  Object[] var10008 = new Object[1];
                  add var10011 = new add;
                  var10011.method_3724(var2);
                  var10008[0] = var10011.method_3789();
                  var10005.method_6126("stat.breakItem", var10008);
                  var10002.method_8762(var7, var10005, var2);
                  var6[var3] = var10002.method_8750();
               }
            }

            if(var0 != null) {
               continue;
            }
         }

         method_9390(field_8911);
         break;
      }

   }

   // $FF: renamed from: b (u2[]) void
   private static void method_9390(class_1601[] var0) {
      method_9391(var0, class_1192.field_6034, class_1192.field_6033);
      method_9391(var0, class_1192.field_6036, class_1192.field_6035);
      method_9391(var0, class_1192.field_6117, class_1192.field_6112);
      method_9391(var0, class_1192.field_6100, class_1192.field_6099);
      method_9391(var0, class_1192.field_6120, class_1192.field_6119);
      method_9391(var0, class_1192.field_6174, class_1192.field_6173);
      method_9391(var0, class_1192.field_6102, class_1192.field_6101);
      method_9391(var0, class_1192.field_6148, class_1192.field_6147);
      method_9391(var0, class_1192.field_6067, class_1192.field_6066);
      method_9391(var0, class_1192.field_6070, class_1192.field_6071);
      method_9391(var0, class_1192.field_6149, class_1192.field_6150);
      method_9391(var0, class_1192.field_6027, class_1192.field_6028);
      method_9391(var0, class_1192.field_6087, class_1192.field_6028);
   }

   // $FF: renamed from: b (u2[], aji, aji) void
   private static void method_9391(class_1601[] var0, aji var1, aji var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = aji.method_2415(var1);
      String[] var3 = var10000;
      int var5 = aji.method_2415(var2);
      class_1601[] var6 = var0;
      int var10001 = var4;
      if(var3 != null) {
         label19: {
            if(var0[var4] != null) {
               var6 = var0;
               var10001 = var5;
               if(var3 == null) {
                  break label19;
               }

               if(var0[var5] == null) {
                  var0[var5] = var0[var4];
                  if(var3 != null) {
                     return;
                  }
               }
            }

            field_8881.remove(var0[var4]);
            field_8884.remove(var0[var4]);
            field_8882.remove(var0[var4]);
            var6 = var0;
            var10001 = var4;
         }
      }

      var6[var10001] = var0[var5];
   }

   // $FF: renamed from: b (xS) u2
   public static class_1601 method_9392(class_1777 var0) {
      String var1 = class_1775.method_9760(var0.field_9280);
      class_1601 var10000;
      if(var1 == null) {
         var10000 = null;
      } else {
         var10000 = new class_1601;
         StringBuilder var10002 = new StringBuilder();
         String[] var2 = field_8913;
         String var3 = var10002.append("stat.killEntity.").append(var1).toString();
         class_1081 var10003 = new class_1081;
         Object[] var10006 = new Object[1];
         class_1081 var10009 = new class_1081;
         var10009.method_6126("entity." + var1 + ".name", new Object[0]);
         var10006[0] = var10009;
         var10003.method_6126("stat.entityKill", var10006);
         var10000.method_8748(var3, var10003);
         var10000 = var10000.method_8750();
      }

      return var10000;
   }

   // $FF: renamed from: c (xS) u2
   public static class_1601 method_9393(class_1777 var0) {
      String var1 = class_1775.method_9760(var0.field_9280);
      class_1601 var10000;
      if(var1 == null) {
         var10000 = null;
      } else {
         var10000 = new class_1601;
         StringBuilder var10002 = new StringBuilder();
         String[] var2 = field_8913;
         String var3 = var10002.append("stat.entityKilledBy.").append(var1).toString();
         class_1081 var10003 = new class_1081;
         Object[] var10006 = new Object[1];
         class_1081 var10009 = new class_1081;
         var10009.method_6126("entity." + var1 + ".name", new Object[0]);
         var10006[0] = var10009;
         var10003.method_6126("stat.entityKilledBy", var10006);
         var10000.method_8748(var3, var10003);
         var10000 = var10000.method_8750();
      }

      return var10000;
   }

   // $FF: renamed from: b (java.lang.String) u2
   public static class_1601 method_9394(String var0) {
      return (class_1601)field_8880.get(var0);
   }

   // $FF: renamed from: <clinit> () void
   static void method_9395() {
      // $FF: Couldn't be decompiled
   }
}
