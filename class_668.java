import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.Logger;

// $FF: renamed from: Ah
public class class_668 implements class_14 {

   // $FF: renamed from: b org.apache.logging.log4j.Logger
   private static final Logger field_2856;
   // $FF: renamed from: c java.util.Map
   private final Map field_2857;
   // $FF: renamed from: d java.util.Set
   private final Set field_2858;
   // $FF: renamed from: e java.lang.String
   private static final String field_2859;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_2860;


   // $FF: renamed from: <init> () void
   public void method_3625() {
      super();
      this.field_2857 = new HashMap();
      this.field_2858 = new HashSet();
   }

   // $FF: renamed from: b (bh, java.lang.String) int
   public int method_39(class_20 param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (aM) aM
   public class_15 method_3626(class_15 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String[]) java.lang.String[]
   private static String[] method_3627(String[] var0) {
      String[] var2 = new String[var0.length - 1];
      String[] var10000 = class_752.method_4253();
      int var3 = 1;
      String[] var1 = var10000;

      while(true) {
         if(var3 < var0.length) {
            try {
               var10000 = var2;
               if(var1 == null) {
                  break;
               }

               var2[var3 - 1] = var0[var3];
               ++var3;
               if(var1 != null) {
                  continue;
               }
            } catch (class_637 var4) {
               throw method_3630(var4);
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   // $FF: renamed from: c (bh, java.lang.String) java.util.List
   public List method_40(class_20 param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (bh) java.util.List
   public List method_41(class_20 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b () java.util.Map
   public Map method_42() {
      return this.field_2857;
   }

   // $FF: renamed from: b (aM, java.lang.String[]) int
   private int method_3628(class_15 param1, String[] param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: <clinit> () void
   static void method_3629() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (AA) AA
   private static class_637 method_3630(class_637 var0) {
      return var0;
   }
}
