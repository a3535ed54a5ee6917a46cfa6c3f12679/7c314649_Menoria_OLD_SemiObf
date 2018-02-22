import ca.diiza.q.a.class_624;
import ca.diiza.t.class_600;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// $FF: renamed from: n3
public class class_1380 {

   // $FF: renamed from: a java.util.Map
   private Map field_7327;
   // $FF: renamed from: b n3
   public static class_1380 field_7328;
   // $FF: renamed from: c kU
   private FontRenderer field_7329;
   // $FF: renamed from: d double
   public static double field_7330;
   // $FF: renamed from: e double
   public static double field_7331;
   // $FF: renamed from: f double
   public static double field_7332;
   // $FF: renamed from: g bqf
   public bqf field_7333;
   // $FF: renamed from: h ahb
   public ahb field_7334;
   // $FF: renamed from: i sv
   public class_752 field_7335;
   // $FF: renamed from: j float
   public float field_7336;
   // $FF: renamed from: k float
   public float field_7337;
   // $FF: renamed from: l double
   public double field_7338;
   // $FF: renamed from: m double
   public double field_7339;
   // $FF: renamed from: n double
   public double field_7340;
   // $FF: renamed from: o java.lang.String
   private static final String field_7341;
   // $FF: renamed from: p java.lang.String[]
   private static final String[] field_7342;


   // $FF: renamed from: <init> () void
   private void method_7527() {
      super();
      this.field_7327 = new HashMap();
      Map var10000 = this.field_7327;
      class_624 var10002 = new class_624;
      var10002.method_3391();
      var10000.put(class_600.class, var10002);
      var10000 = this.field_7327;
      class_617 var4 = new class_617;
      var4.method_3391();
      var10000.put(class_582.class, var4);
      var10000 = this.field_7327;
      class_619 var5 = new class_619;
      var5.method_3391();
      var10000.put(class_584.class, var5);
      var10000 = this.field_7327;
      class_618 var6 = new class_618;
      var6.method_3391();
      var10000.put(class_598.class, var6);
      var10000 = this.field_7327;
      class_622 var7 = new class_622;
      var7.method_3391();
      var10000.put(class_594.class, var7);
      var10000 = this.field_7327;
      class_620 var8 = new class_620;
      var8.method_3391();
      var10000.put(class_587.class, var8);
      var10000 = this.field_7327;
      class_621 var9 = new class_621;
      var9.method_3391();
      var10000.put(class_588.class, var9);
      var10000 = this.field_7327;
      class_615 var10 = new class_615;
      var10.method_3391();
      var10000.put(class_599.class, var10);
      var10000 = this.field_7327;
      class_623 var11 = new class_623;
      var11.method_3391();
      var10000.put(class_596.class, var11);
      var10000 = this.field_7327;
      class_616 var3 = new class_616;
      var3.method_3391();
      var10000.put(class_581.class, var3);
      Iterator var1 = this.field_7327.values().iterator();

      while(var1.hasNext()) {
         class_614 var2 = (class_614)var1.next();
         var2.method_3394(this);
      }

   }

   // $FF: renamed from: b (java.lang.Class) n4
   public class_614 method_7528(Class param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (gi) boolean
   public boolean method_7529(class_580 var1) {
      boolean var10000;
      try {
         if(this.method_7530(var1) != null) {
            var10000 = true;
            return var10000;
         }
      } catch (class_643 var2) {
         throw method_7537(var2);
      }

      var10000 = false;
      return var10000;
   }

   // $FF: renamed from: c (gi) n4
   public class_614 method_7530(class_580 var1) {
      class_614 var10000;
      try {
         if(var1 == null) {
            var10000 = null;
            return var10000;
         }
      } catch (class_643 var2) {
         throw method_7537(var2);
      }

      var10000 = this.method_7528(var1.getClass());
      return var10000;
   }

   // $FF: renamed from: b (ahb, bqf, kU, sv, float) void
   public void method_7531(ahb param1, bqf param2, FontRenderer param3, class_752 param4, float param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (gi, float) void
   public void method_7532(class_580 param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (gi, double, double, double, float) void
   public void method_7533(class_580 param1, double param2, double param4, double param6, float param8) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (ahb) void
   public void method_7534(ahb var1) {
      this.field_7334 = var1;
      String[] var10000 = class_752.method_4253();
      Iterator var3 = this.field_7327.values().iterator();
      String[] var2 = var10000;

      while(var3.hasNext()) {
         class_614 var4 = (class_614)var3.next();

         label28: {
            class_614 var6;
            label27: {
               try {
                  var6 = var4;
                  if(var2 == null) {
                     break label27;
                  }

                  if(var4 == null) {
                     break label28;
                  }
               } catch (class_643 var5) {
                  throw method_7537(var5);
               }

               var6 = var4;
            }

            var6.method_3395(var1);
         }

         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b () kU
   public FontRenderer method_7535() {
      return this.field_7329;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7536() {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "P@GØ¸lB\t)Ñ²ilÉ¥{Aiv[Òá2X@IF\bÖÂlQ@ÄÂgQHÑ";
      int var4 = "P@GØ¸lB\t)Ñ²ilÉ¥{Aiv[Òá2X@IF\bÖÂlQ@ÄÂgQHÑ".length();
      char var1 = 22;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var10 = true;
         char[] var9 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var9;
            var9 = var10001;
            var10001 = var10003;
            char[] var12 = var9;
            var9 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var10)).intern();
               if((var0 += var1) >= var4) {
                  field_7342 = var5;
                  String[] var11 = field_7342;
                  field_7341 = "CL_00000963";
                  class_1380 var8 = new class_1380;
                  var8.method_7527();
                  field_7328 = var8;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var10)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 67;
               break;
            case 1:
               var10009 = 100;
               break;
            case 2:
               var10009 = 104;
               break;
            case 3:
               var10009 = 42;
               break;
            case 4:
               var10009 = 252;
               break;
            case 5:
               var10009 = 163;
               break;
            default:
               var10009 = 144;
            }

            ((Object[])var10)[var6] = (char)(var10007 ^ var12 ^ var10009);
            ++var6;
         }
      }
   }

   // $FF: renamed from: b (java.lang.Throwable) java.lang.Throwable
   private static Throwable method_7537(Throwable var0) {
      return var0;
   }
}
