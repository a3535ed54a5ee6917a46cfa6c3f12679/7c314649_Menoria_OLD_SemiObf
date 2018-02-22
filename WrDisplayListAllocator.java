import java.util.ArrayList;
import java.util.List;

public class WrDisplayListAllocator {

   private List<WrDisplayListBlock> listBlocks;
   private WrDisplayListBlock currentBlock;
   private int blockIndex;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6590;


   // $FF: renamed from: <init> () void
   public void method_6714() {
      super();
      this.listBlocks = new ArrayList();
      this.currentBlock = null;
      this.blockIndex = -1;
   }

   public int allocateDisplayLists(int param1) {
      // $FF: Couldn't be decompiled
   }

   public void resetAllocatedLists() {
      this.currentBlock = null;
      String[] var10000 = class_752.method_4253();
      this.blockIndex = -1;
      int var2 = 0;
      String[] var1 = var10000;

      while(var2 < this.listBlocks.size()) {
         WrDisplayListBlock var3 = (WrDisplayListBlock)this.listBlocks.get(var2);
         var3.reset();
         ++var2;
         if(var1 == null) {
            break;
         }
      }

   }

   public void deleteDisplayLists() {
      String[] var10000 = class_752.method_4253();
      int var2 = 0;
      String[] var1 = var10000;

      while(true) {
         if(var2 < this.listBlocks.size()) {
            WrDisplayListBlock var3 = (WrDisplayListBlock)this.listBlocks.get(var2);

            try {
               var3.deleteDisplayLists();
               ++var2;
               if(var1 == null) {
                  break;
               }

               if(var1 != null) {
                  continue;
               }
            } catch (IllegalArgumentException var4) {
               throw method_6715(var4);
            }
         }

         this.listBlocks.clear();
         this.currentBlock = null;
         this.blockIndex = -1;
         break;
      }

   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_6715(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6716() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ë¨º}wA¢¥okDÛæ uhÎ£¢{oá§¢<uQ§ ptDÖ£ö<";
      int var4 = "ë¨º}wA¢¥okDÛæ uhÎ£¢{oá§¢<uQ§ ptDÖ£ö<".length();
      char var1 = 29;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var10 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_6590 = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 79;
               break;
            case 1:
               var10009 = 43;
               break;
            case 2:
               var10009 = 33;
               break;
            case 3:
               var10009 = 241;
               break;
            case 4:
               var10009 = 246;
               break;
            case 5:
               var10009 = 2;
               break;
            default:
               var10009 = 200;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var10 ^ var10009);
            ++var6;
         }
      }
   }
}
