import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// $FF: renamed from: x1
public class class_1710 {

   // $FF: renamed from: b sa
   private final class_689 field_8961;
   // $FF: renamed from: c boolean
   private boolean field_8962;
   // $FF: renamed from: d java.util.HashMap
   private static final HashMap field_8963;
   // $FF: renamed from: e java.util.Map
   private final Map field_8964;
   // $FF: renamed from: f boolean
   private boolean field_8965;
   // $FF: renamed from: g java.util.concurrent.locks.ReadWriteLock
   private ReadWriteLock field_8966;
   // $FF: renamed from: h java.lang.String
   private static final String field_8967;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_8968;


   // $FF: renamed from: <init> (sa) void
   public void method_9496(class_689 var1) {
      super();
      this.field_8962 = true;
      this.field_8964 = new HashMap();
      this.field_8966 = new ReentrantReadWriteLock();
      this.field_8961 = var1;
   }

   // $FF: renamed from: b (int, java.lang.Object) void
   public void method_9497(int param1, Object param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int) void
   public void method_9498(int var1, int var2) {
      class_1712 var10000 = new class_1712;
      var10000.method_9537(var2, var1, (Object)null);
      class_1712 var3 = var10000;
      this.field_8966.writeLock().lock();
      this.field_8964.put(Integer.valueOf(var1), var3);
      this.field_8966.writeLock().unlock();
      this.field_8962 = false;
   }

   // $FF: renamed from: b (int) byte
   public byte method_9499(int var1) {
      return ((Byte)this.method_9505(var1).method_9540()).byteValue();
   }

   // $FF: renamed from: c (int) short
   public short method_9500(int var1) {
      return ((Short)this.method_9505(var1).method_9540()).shortValue();
   }

   // $FF: renamed from: d (int) int
   public int method_9501(int var1) {
      return ((Integer)this.method_9505(var1).method_9540()).intValue();
   }

   // $FF: renamed from: e (int) float
   public float method_9502(int var1) {
      return ((Float)this.method_9505(var1).method_9540()).floatValue();
   }

   // $FF: renamed from: f (int) java.lang.String
   public String method_9503(int var1) {
      return (String)this.method_9505(var1).method_9540();
   }

   // $FF: renamed from: g (int) add
   public add method_9504(int var1) {
      return (add)this.method_9505(var1).method_9540();
   }

   // $FF: renamed from: h (int) x2
   private class_1712 method_9505(int var1) {
      this.field_8966.readLock().lock();

      class_1712 var2;
      try {
         var2 = (class_1712)this.field_8964.get(Integer.valueOf(var1));
      } catch (Throwable var7) {
         String[] var6 = field_8968;
         class_1346 var4 = class_1346.method_7153(var7, "Getting synched entity data");
         class_1605 var5 = var4.method_7150("Synched entity data");
         var5.method_8778("Data ID", Integer.valueOf(var1));
         class_643 var10000 = new class_643;
         var10000.method_3525(var4);
         throw var10000;
      }

      this.field_8966.readLock().unlock();
      return var2;
   }

   // $FF: renamed from: c (int, java.lang.Object) void
   public void method_9506(int param1, Object param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: i (int) void
   public void method_9507(int var1) {
      class_1712.method_9544(this.method_9505(var1), true);
      this.field_8965 = true;
   }

   // $FF: renamed from: b () boolean
   public boolean method_9508() {
      return this.field_8965;
   }

   // $FF: renamed from: b (java.util.List, d) void
   public static void method_9509(List var0, class_112 var1) {
      String[] var2 = class_752.method_4253();

      label42: {
         try {
            if(var2 == null) {
               return;
            }

            if(var0 == null) {
               break label42;
            }
         } catch (IllegalArgumentException var6) {
            throw method_9519(var6);
         }

         Iterator var3 = var0.iterator();

         while(var3.hasNext()) {
            class_1712 var4 = (class_1712)var3.next();

            try {
               method_9513(var1, var4);
               if(var2 == null) {
                  return;
               }

               if(var2 == null) {
                  break;
               }
            } catch (IllegalArgumentException var5) {
               throw method_9519(var5);
            }
         }
      }

      var1.writeByte(127);
   }

   // $FF: renamed from: c () java.util.List
   public List method_9510() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (d) void
   public void method_9511(class_112 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_8966.readLock().lock();
      String[] var2 = var10000;
      Iterator var3 = this.field_8964.values().iterator();

      while(true) {
         if(var3.hasNext()) {
            class_1712 var4 = (class_1712)var3.next();

            try {
               method_9513(var1, var4);
               if(var2 == null) {
                  break;
               }

               if(var2 != null) {
                  continue;
               }
            } catch (IllegalArgumentException var5) {
               throw method_9519(var5);
            }
         }

         this.field_8966.readLock().unlock();
         var1.writeByte(127);
         break;
      }

   }

   // $FF: renamed from: d () java.util.List
   public List method_9512() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (d, x2) void
   private static void method_9513(class_112 param0, class_1712 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (d) java.util.List
   public static List method_9514(class_112 param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.util.List) void
   public void method_9515(List param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: e () boolean
   public boolean method_9516() {
      return this.field_8962;
   }

   // $FF: renamed from: f () void
   public void method_9517() {
      this.field_8965 = false;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9518() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_9519(IllegalArgumentException var0) {
      return var0;
   }
}
