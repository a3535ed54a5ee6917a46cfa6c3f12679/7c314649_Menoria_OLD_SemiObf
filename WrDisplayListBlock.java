
public class WrDisplayListBlock {

   private int start;
   private int used;
   private int end;
   public static final int BLOCK_LENGTH = 16384;


   // $FF: renamed from: <init> () void
   public void method_6652() {
      super();
      this.start = -1;
      this.used = -1;
      this.end = -1;
      this.start = ban.method_5195(16384);
      this.used = this.start;
      this.end = this.start + 16384;
   }

   public boolean canAllocate(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.used + var1;
      if(var2 != null) {
         var10000 = var10000 < this.end?1:0;
      }

      return (boolean)var10000;
   }

   public int allocate(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.canAllocate(var1);
      if(var2 != null) {
         if(var10000 == 0) {
            return -1;
         }

         var10000 = this.used;
      }

      int var3 = var10000;
      this.used += var1;
      return var3;
   }

   public void reset() {
      this.used = this.start;
   }

   public void deleteDisplayLists() {
      ban.method_5196(this.start);
   }

   public int getStart() {
      return this.start;
   }

   public int getUsed() {
      return this.used;
   }

   public int getEnd() {
      return this.end;
   }
}
