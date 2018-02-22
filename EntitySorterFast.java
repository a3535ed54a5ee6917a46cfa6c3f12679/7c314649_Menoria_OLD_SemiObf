import java.util.Comparator;

public class EntitySorterFast implements Comparator {

   private class_689 entity;


   // $FF: renamed from: <init> (sa) void
   public void method_5054(class_689 var1) {
      super();
      this.entity = var1;
   }

   public void prepareToSort(blo[] var1, int var2) {
      String[] var10000 = class_752.method_4253();
      int var4 = 0;
      String[] var3 = var10000;

      while(var4 < var2) {
         blo var5 = var1[var4];
         var5.sortDistanceToEntitySquared = var5.method_2300(this.entity);
         ++var4;
         if(var3 == null) {
            break;
         }
      }

   }

   public int compare(blo var1, blo var2) {
      String[] var10000 = class_752.method_4253();
      float var4 = var1.sortDistanceToEntitySquared;
      String[] var3 = var10000;
      float var5 = var2.sortDistanceToEntitySquared;
      float var7;
      int var6 = (var7 = var4 - var5) == 0.0F?0:(var7 < 0.0F?-1:1);
      if(var3 != null) {
         if(var6 == 0) {
            return 0;
         }

         float var8;
         var6 = (var8 = var4 - var5) == 0.0F?0:(var8 < 0.0F?-1:1);
      }

      if(var3 != null) {
         if(var6 > 0) {
            return 1;
         }

         var6 = -1;
      }

      return var6;
   }

   public int compare(Object var1, Object var2) {
      return this.compare((blo)var1, (blo)var2);
   }
}
