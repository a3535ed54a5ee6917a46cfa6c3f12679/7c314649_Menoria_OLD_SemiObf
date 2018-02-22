import java.util.Comparator;

// $FF: renamed from: nR
public class class_1401 implements Comparator {

   // $FF: renamed from: b sv
   private class_752 field_7443;


   // $FF: renamed from: <init> (sv) void
   public void method_7635(class_752 var1) {
      super();
      this.field_7443 = var1;
   }

   // $FF: renamed from: b (blo, blo) int
   public int method_7636(blo var1, blo var2) {
      String[] var3;
      blo var8;
      label60: {
         var3 = class_752.method_4253();
         boolean var10000 = var1.field_1897;
         if(var3 != null) {
            label61: {
               if(var1.field_1897) {
                  var10000 = var2.field_1897;
                  if(var3 == null) {
                     break label61;
                  }

                  if(!var2.field_1897) {
                     return 1;
                  }
               }

               var8 = var2;
               if(var3 == null) {
                  break label60;
               }

               var10000 = var2.field_1897;
            }
         }

         if(var10000) {
            var8 = var1;
            if(var3 == null) {
               break label60;
            }

            if(!var1.field_1897) {
               return -1;
            }
         }

         var8 = var1;
      }

      double var4 = (double)var8.method_2300(this.field_7443);
      double var6 = (double)var2.method_2300(this.field_7443);
      double var10;
      int var9 = (var10 = var4 - var6) == 0.0D?0:(var10 < 0.0D?-1:1);
      if(var3 != null) {
         if(var9 < 0) {
            return 1;
         }

         double var11;
         var9 = (var11 = var4 - var6) == 0.0D?0:(var11 < 0.0D?-1:1);
      }

      if(var3 != null) {
         if(var9 > 0) {
            return -1;
         }

         var9 = var1.field_1904;
      }

      if(var3 != null) {
         var9 = var9 < var2.field_1904?1:-1;
      }

      return var9;
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.method_7636((blo)var1, (blo)var2);
   }
}
