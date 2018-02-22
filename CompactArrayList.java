import java.util.ArrayList;

public class CompactArrayList {

   private ArrayList list;
   private int initialCapacity;
   private float loadFactor;
   private int countValid;


   // $FF: renamed from: <init> () void
   public void method_3205() {
      this.method_3207(10, 0.75F);
   }

   // $FF: renamed from: <init> (int) void
   public void method_3206(int var1) {
      this.method_3207(var1, 0.75F);
   }

   // $FF: renamed from: <init> (int, float) void
   public void method_3207(int var1, float var2) {
      super();
      this.list = null;
      this.initialCapacity = 0;
      this.loadFactor = 1.0F;
      this.countValid = 0;
      this.list = new ArrayList(var1);
      this.initialCapacity = var1;
      this.loadFactor = var2;
   }

   public void add(int var1, Object var2) {
      String[] var3 = class_752.method_4253();
      if(var3 != null) {
         if(var2 != null) {
            ++this.countValid;
         }

         this.list.add(var1, var2);
      }

   }

   public boolean add(Object var1) {
      if(var1 != null) {
         ++this.countValid;
      }

      return this.list.add(var1);
   }

   public Object set(int var1, Object var2) {
      String[] var10000 = class_752.method_4253();
      Object var4 = this.list.set(var1, var2);
      String[] var3 = var10000;
      Object var5 = var2;
      if(var3 != null) {
         if(var2 != var4) {
            var5 = var4;
            if(var3 != null) {
               if(var4 == null) {
                  ++this.countValid;
               }

               var5 = var2;
            }

            if(var3 == null) {
               return var5;
            }

            if(var5 == null) {
               --this.countValid;
            }
         }

         var5 = var4;
      }

      return var5;
   }

   public Object remove(int var1) {
      String[] var10000 = class_752.method_4253();
      Object var3 = this.list.remove(var1);
      String[] var2 = var10000;
      Object var4 = var3;
      if(var2 != null) {
         if(var3 != null) {
            --this.countValid;
         }

         var4 = var3;
      }

      return var4;
   }

   public void clear() {
      this.list.clear();
      this.countValid = 0;
   }

   public void compact() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.countValid;
      if(var1 != null) {
         label71: {
            if(this.countValid <= 0) {
               var10000 = this.list.size();
               if(var1 == null) {
                  break label71;
               }

               if(var10000 <= 0) {
                  this.clear();
                  return;
               }
            }

            var10000 = this.list.size();
         }
      }

      if(var1 != null) {
         if(var10000 <= this.initialCapacity) {
            return;
         }

         var10000 = this.countValid;
      }

      float var2 = (float)var10000 * 1.0F / (float)this.list.size();
      float var6;
      var10000 = (var6 = var2 - this.loadFactor) == 0.0F?0:(var6 < 0.0F?-1:1);
      if(var1 != null) {
         if(var10000 > 0) {
            return;
         }

         var10000 = 0;
      }

      int var3 = var10000;
      int var4 = 0;

      while(true) {
         if(var4 < this.list.size()) {
            Object var5 = this.list.get(var4);
            if(var1 == null) {
               --var4;
               if(var1 == null) {
                  return;
               }
               break;
            }

            if(var5 != null || var1 == null) {
               if(var4 != var3) {
                  this.list.set(var3, var5);
               }

               ++var3;
            }

            ++var4;
            if(var1 != null) {
               continue;
            }
         }

         var4 = this.list.size() - 1;
         break;
      }

      while(var4 >= var3) {
         this.list.remove(var4);
         --var4;
         if(var1 == null) {
            break;
         }
      }

   }

   public boolean contains(Object var1) {
      return this.list.contains(var1);
   }

   public Object get(int var1) {
      return this.list.get(var1);
   }

   public boolean isEmpty() {
      return this.list.isEmpty();
   }

   public int size() {
      return this.list.size();
   }

   public int getCountValid() {
      return this.countValid;
   }
}
