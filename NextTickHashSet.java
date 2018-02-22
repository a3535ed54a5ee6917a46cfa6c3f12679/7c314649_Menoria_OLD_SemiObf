import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class NextTickHashSet extends AbstractSet {

   private class_1711 longHashMap;
   private int size;
   private HashSet emptySet;
   // $FF: renamed from: h java.lang.String
   private static final String field_2977 = "Not implemented";


   // $FF: renamed from: <init> (java.util.Set) void
   public void method_3826(Set var1) {
      super();
      class_1711 var10001 = new class_1711;
      var10001.method_9520();
      this.longHashMap = var10001;
      this.size = 0;
      this.emptySet = new HashSet();
      this.addAll(var1);
   }

   public int size() {
      return this.size;
   }

   public boolean contains(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean add(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean remove(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public Iterator getNextTickEntries(int var1, int var2) {
      HashSet var3 = this.getNextTickEntriesSet(var1, var2);
      return var3.iterator();
   }

   public HashSet getNextTickEntriesSet(int var1, int var2) {
      String[] var10000 = class_752.method_4253();
      long var4 = class_1035.method_5857(var1, var2);
      String[] var3 = var10000;
      HashSet var6 = (HashSet)this.longHashMap.method_9525(var4);

      HashSet var8;
      label20: {
         try {
            var8 = var6;
            if(var3 == null) {
               return var8;
            }

            if(var6 != null) {
               break label20;
            }
         } catch (UnsupportedOperationException var7) {
            throw method_3827(var7);
         }

         var6 = this.emptySet;
      }

      var8 = var6;
      return var8;
   }

   public Iterator iterator() {
      throw new UnsupportedOperationException("Not implemented");
   }

   // $FF: renamed from: b (java.lang.UnsupportedOperationException) java.lang.UnsupportedOperationException
   private static UnsupportedOperationException method_3827(UnsupportedOperationException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_3828() {
      boolean var10000 = true;
      char[] var10003 = "h¦¥ØJ¬Ø¢fÍB".toCharArray();
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
            field_2977 = (new String((char[])var3)).intern();
            return;
         }

         char var10007 = (char)((Object[])var3)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 20;
            break;
         case 1:
            var10009 = 251;
            break;
         case 2:
            var10009 = 94;
            break;
         case 3:
            var10009 = 143;
            break;
         case 4:
            var10009 = 254;
            break;
         case 5:
            var10009 = 32;
            break;
         default:
            var10009 = 154;
         }

         ((Object[])var3)[var0] = (char)(var10007 ^ var4 ^ var10009);
         ++var0;
      }
   }
}
