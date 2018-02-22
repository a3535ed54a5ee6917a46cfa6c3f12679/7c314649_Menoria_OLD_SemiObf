import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

// $FF: renamed from: x_
public class class_1789 implements class_80 {

   // $FF: renamed from: b x8
   private final class_1721 field_9320;
   // $FF: renamed from: c x3
   private final class_79 field_9321;
   // $FF: renamed from: d java.util.Map
   private final Map field_9322;
   // $FF: renamed from: e java.util.Map
   private final Map field_9323;
   // $FF: renamed from: f java.util.Map
   private final Map field_9324;
   // $FF: renamed from: g double
   private double field_9325;
   // $FF: renamed from: h boolean
   private boolean field_9326;
   // $FF: renamed from: i double
   private double field_9327;
   // $FF: renamed from: j java.lang.String
   private static final String field_9328 = "Modifier is already applied on this attribute!";


   // $FF: renamed from: <init> (x8, x3) void
   public void method_9826(class_1721 var1, class_79 var2) {
      super();
      String[] var10000 = class_752.method_4253();
      this.field_9322 = Maps.newHashMap();
      this.field_9323 = Maps.newHashMap();
      this.field_9324 = Maps.newHashMap();
      String[] var3 = var10000;
      this.field_9326 = true;
      this.field_9320 = var1;
      this.field_9321 = var2;
      this.field_9325 = var2.method_386();
      int var4 = 0;

      while(var4 < 3) {
         this.field_9322.put(Integer.valueOf(var4), new HashSet());
         ++var4;
         if(var3 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b () x3
   public class_79 method_388() {
      return this.field_9321;
   }

   // $FF: renamed from: c () double
   public double method_389() {
      return this.field_9325;
   }

   // $FF: renamed from: b (double) void
   public void method_390(double var1) {
      try {
         if(var1 == this.method_389()) {
            return;
         }
      } catch (IllegalArgumentException var3) {
         throw method_9830(var3);
      }

      this.field_9325 = var1;
      this.method_9828();
   }

   // $FF: renamed from: b (int) java.util.Collection
   public Collection method_9827(int var1) {
      return (Collection)this.field_9322.get(Integer.valueOf(var1));
   }

   // $FF: renamed from: d () java.util.Collection
   public Collection method_391() {
      HashSet var2 = new HashSet();
      String[] var10000 = class_752.method_4253();
      int var3 = 0;
      String[] var1 = var10000;

      HashSet var5;
      while(true) {
         if(var3 < 3) {
            try {
               var5 = var2;
               if(var1 == null) {
                  break;
               }

               var2.addAll(this.method_9827(var3));
               ++var3;
               if(var1 != null) {
                  continue;
               }
            } catch (IllegalArgumentException var4) {
               throw method_9830(var4);
            }
         }

         var5 = var2;
         break;
      }

      return var5;
   }

   // $FF: renamed from: b (java.util.UUID) x5
   public class_1716 method_392(UUID var1) {
      return (class_1716)this.field_9324.get(var1);
   }

   // $FF: renamed from: b (x5) void
   public void method_393(class_1716 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () void
   private void method_9828() {
      this.field_9326 = true;
      this.field_9320.method_9619(this);
   }

   // $FF: renamed from: c (x5) void
   public void method_394(class_1716 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () void
   public void method_395() {
      String[] var10000 = class_752.method_4253();
      Collection var2 = this.method_391();
      String[] var1 = var10000;

      try {
         if(var2 == null) {
            return;
         }
      } catch (IllegalArgumentException var5) {
         throw method_9830(var5);
      }

      ArrayList var6 = new ArrayList(var2);
      Iterator var3 = var6.iterator();

      while(var3.hasNext()) {
         class_1716 var4 = (class_1716)var3.next();
         this.method_394(var4);
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: f () double
   public double method_396() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: h () double
   private double method_9829() {
      String[] var10000 = class_752.method_4253();
      double var2 = this.method_389();
      String[] var1 = var10000;
      Iterator var4 = this.method_9827(0).iterator();

      double var10;
      while(true) {
         if(var4.hasNext()) {
            class_1716 var5 = (class_1716)var4.next();
            var10 = var2 + var5.method_9597();
            if(var1 == null) {
               break;
            }

            var2 = var10;
            if(var1 != null) {
               continue;
            }
         }

         var10 = var2;
         break;
      }

      double var9 = var10;
      Iterator var6 = this.method_9827(1).iterator();

      class_1716 var7;
      while(true) {
         if(var6.hasNext()) {
            var7 = (class_1716)var6.next();
            var9 += var2 * var7.method_9597();

            try {
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  continue;
               }
            } catch (IllegalArgumentException var8) {
               throw method_9830(var8);
            }
         }

         var6 = this.method_9827(2).iterator();
         break;
      }

      while(true) {
         if(var6.hasNext()) {
            var7 = (class_1716)var6.next();
            var10 = var9 * (1.0D + var7.method_9597());
            if(var1 == null) {
               break;
            }

            var9 = var10;
            if(var1 != null) {
               continue;
            }
         }

         var10 = this.field_9321.method_385(var9);
         break;
      }

      return var10;
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_9830(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9831() {
      boolean var10000 = true;
      char[] var10003 = "@LÐyÅÐÝcDÍÙFÕtÔ}SØyÈbMd\fÅÆ-BÀdÅ×xWÑ1".toCharArray();
      Object var10004 = var10003.length;
      Object var3 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var4 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_9328 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 93;
            break;
         case 1:
            var10009 = 115;
            break;
         case 2:
            var10009 = 228;
            break;
         case 3:
            var10009 = 64;
            break;
         case 4:
            var10009 = 52;
            break;
         case 5:
            var10009 = 252;
            break;
         default:
            var10009 = 229;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
