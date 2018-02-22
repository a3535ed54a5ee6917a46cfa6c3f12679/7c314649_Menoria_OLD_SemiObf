import java.util.List;

// $FF: renamed from: jl
public class class_1323 {

   // $FF: renamed from: b int
   private static int field_6794;
   // $FF: renamed from: c java.util.List
   private static List field_6795;
   // $FF: renamed from: d java.util.List
   private static List field_6796;
   // $FF: renamed from: e java.util.List
   private static List field_6797;
   // $FF: renamed from: f java.util.List
   private static List field_6798;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6799;


   // $FF: renamed from: b (int) int[]
   public static synchronized int[] method_6956(int var0) {
      int[] var2;
      Object var3;
      label41: {
         int var10000;
         label42: {
            String[] var1 = class_752.method_4253();
            var10000 = var0;
            int var10001 = 256;
            if(var1 != null) {
               if(var0 <= 256) {
                  var3 = field_6795;
                  if(var1 != null) {
                     if(field_6795.isEmpty()) {
                        var2 = new int[256];
                        field_6796.add(var2);
                        return var2;
                     }

                     var3 = field_6795.remove(field_6795.size() - 1);
                  }

                  var2 = (int[])var3;
                  field_6796.add(var2);
                  return var2;
               }

               var10000 = var0;
               if(var1 == null) {
                  break label42;
               }

               var10001 = field_6794;
            }

            if(var10000 > var10001) {
               field_6794 = var0;
               field_6797.clear();
               field_6798.clear();
               var2 = new int[field_6794];
               field_6798.add(var2);
               return var2;
            }

            var3 = field_6797;
            if(var1 == null) {
               break label41;
            }

            var10000 = field_6797.isEmpty();
         }

         if(var10000 != 0) {
            var2 = new int[field_6794];
            field_6798.add(var2);
            return var2;
         }

         var3 = field_6797.remove(field_6797.size() - 1);
      }

      var2 = (int[])var3;
      field_6798.add(var2);
      return var2;
   }

   // $FF: renamed from: b () void
   public static synchronized void method_6957() {
      String[] var0 = class_752.method_4253();
      boolean var10000 = field_6797.isEmpty();
      if(var0 != null) {
         if(!var10000) {
            field_6797.remove(field_6797.size() - 1);
         }

         var10000 = field_6795.isEmpty();
      }

      if(var0 != null) {
         if(!var10000) {
            field_6795.remove(field_6795.size() - 1);
         }

         field_6797.addAll(field_6798);
         field_6795.addAll(field_6796);
      }

      field_6798.clear();
      field_6796.clear();
   }

   // $FF: renamed from: c () java.lang.String
   public static synchronized String method_6958() {
      StringBuilder var10000 = new StringBuilder();
      String[] var0 = field_6799;
      return var10000.append("cache: ").append(field_6797.size()).append(", tcache: ").append(field_6795.size()).append(", allocated: ").append(field_6798.size()).append(", tallocated: ").append(field_6796.size()).toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6959() {
      // $FF: Couldn't be decompiled
   }
}
