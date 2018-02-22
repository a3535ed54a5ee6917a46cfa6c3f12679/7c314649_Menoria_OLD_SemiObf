import java.lang.reflect.Array;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// $FF: renamed from: vo
public class class_1709 {

   // $FF: renamed from: b java.lang.Object[]
   private final Object[] field_8956;
   // $FF: renamed from: c java.lang.Class
   private final Class field_8957;
   // $FF: renamed from: d java.util.concurrent.locks.ReadWriteLock
   private final ReadWriteLock field_8958;
   // $FF: renamed from: e int
   private int field_8959;
   // $FF: renamed from: f int
   private int field_8960;


   // $FF: renamed from: <init> (java.lang.Class, int) void
   public void method_9492(Class var1, int var2) {
      super();
      this.field_8958 = new ReentrantReadWriteLock();
      this.field_8957 = var1;
      this.field_8956 = (Object[])((Object[])Array.newInstance(var1, var2));
   }

   // $FF: renamed from: b (java.lang.Object) java.lang.Object
   public Object method_9493(Object var1) {
      this.field_8958.writeLock().lock();
      this.field_8956[this.field_8960] = var1;
      this.field_8960 = (this.field_8960 + 1) % this.method_9494();
      String[] var2 = class_752.method_4253();
      Object var10000 = this;
      if(var2 != null) {
         if(this.field_8959 < this.method_9494()) {
            ++this.field_8959;
         }

         this.field_8958.writeLock().unlock();
         var10000 = var1;
      }

      return var10000;
   }

   // $FF: renamed from: a () int
   public int method_9494() {
      this.field_8958.readLock().lock();
      int var1 = this.field_8956.length;
      this.field_8958.readLock().unlock();
      return var1;
   }

   // $FF: renamed from: b () java.lang.Object[]
   public Object[] method_9495() {
      Object[] var2 = (Object[])((Object[])Array.newInstance(this.field_8957, this.field_8959));
      String[] var10000 = class_752.method_4253();
      this.field_8958.readLock().lock();
      String[] var1 = var10000;
      int var3 = 0;

      while(true) {
         if(var3 < this.field_8959) {
            int var4 = (this.field_8960 - this.field_8959 + var3) % this.method_9494();
            if(var1 == null) {
               break;
            }

            if(var1 != null) {
               if(var4 < 0) {
                  var4 += this.method_9494();
               }

               var2[var3] = this.field_8956[var4];
               ++var3;
            }

            if(var1 != null) {
               continue;
            }
         }

         this.field_8958.readLock().unlock();
         break;
      }

      return var2;
   }
}
