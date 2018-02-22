import com.google.common.collect.Maps;
import java.util.Map;

// $FF: renamed from: vd
public class class_1699 {

   // $FF: renamed from: b java.util.Map
   protected final Map field_8914;


   // $FF: renamed from: <init> () void
   public void method_9396() {
      super();
      this.field_8914 = Maps.newConcurrentMap();
   }

   // $FF: renamed from: b (u3) boolean
   public boolean method_9397(class_1604 var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.method_9402(var1);
      if(var2 != null) {
         var10000 = var10000 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: c (u3) boolean
   public boolean method_9398(class_1604 var1) {
      String[] var2 = class_752.method_4253();
      boolean var10000;
      if(var1.field_8381 != null) {
         var10000 = this.method_9397(var1.field_8381);
         if(var2 == null) {
            return var10000;
         }

         if(!var10000) {
            var10000 = false;
            return var10000;
         }
      }

      var10000 = true;
      return var10000;
   }

   // $FF: renamed from: d (u3) int
   public int method_9399(class_1604 var1) {
      String[] var2 = class_752.method_4253();
      byte var10000 = this.method_9397(var1);
      if(var2 != null) {
         if(var10000 != 0) {
            return 0;
         }

         var10000 = 0;
      }

      int var3 = var10000;
      class_1604 var4 = var1.field_8381;

      int var5;
      while(true) {
         if(var4 != null) {
            var5 = this.method_9397(var4);
            if(var2 == null || var2 == null) {
               break;
            }

            if(var5 == 0) {
               var4 = var4.field_8381;
               ++var3;
               if(var2 != null) {
                  continue;
               }
            }
         }

         var5 = var3;
         break;
      }

      return var5;
   }

   // $FF: renamed from: a (yz, u2, int) void
   public void method_9400(class_792 var1, class_1601 var2, int var3) {
      class_1699 var5;
      label21: {
         label20: {
            String[] var4 = class_752.method_4253();
            boolean var10000 = var2.method_8751();
            if(var4 != null) {
               if(!var10000) {
                  break label20;
               }

               var5 = this;
               if(var4 == null) {
                  break label21;
               }

               var10000 = this.method_9398((class_1604)var2);
            }

            if(!var10000) {
               return;
            }
         }

         var5 = this;
      }

      var5.method_9401(var1, var2, this.method_9402(var2) + var3);
   }

   // $FF: renamed from: b (yz, u2, int) void
   public void method_9401(class_792 var1, class_1601 var2, int var3) {
      String[] var10000 = class_752.method_4253();
      class_1697 var5 = (class_1697)this.field_8914.get(var2);
      String[] var4 = var10000;
      class_1697 var6 = var5;
      if(var4 != null) {
         if(var5 == null) {
            var6 = new class_1697;
            var6.method_9379();
            var5 = var6;
            this.field_8914.put(var2, var5);
         }

         var6 = var5;
      }

      var6.method_9381(var3);
   }

   // $FF: renamed from: b (u2) int
   public int method_9402(class_1601 var1) {
      String[] var10000 = class_752.method_4253();
      class_1697 var3 = (class_1697)this.field_8914.get(var1);
      String[] var2 = var10000;
      class_1697 var4 = var3;
      int var5;
      if(var2 != null) {
         if(var3 == null) {
            var5 = 0;
            return var5;
         }

         var4 = var3;
      }

      var5 = var4.method_9380();
      return var5;
   }

   // $FF: renamed from: c (u2) vb
   public class_76 method_9403(class_1601 var1) {
      class_1697 var3 = (class_1697)this.field_8914.get(var1);
      String[] var2 = class_752.method_4253();
      class_1697 var10000 = var3;
      if(var2 != null) {
         if(var3 == null) {
            return null;
         }

         var10000 = var3;
      }

      return var10000.method_9382();
   }

   // $FF: renamed from: b (u2, vb) vb
   public class_76 method_9404(class_1601 var1, class_76 var2) {
      String[] var10000 = class_752.method_4253();
      class_1697 var4 = (class_1697)this.field_8914.get(var1);
      String[] var3 = var10000;
      class_1697 var5 = var4;
      if(var3 != null) {
         if(var4 == null) {
            var5 = new class_1697;
            var5.method_9379();
            var4 = var5;
            this.field_8914.put(var1, var4);
         }

         var5 = var4;
      }

      var5.method_9383(var2);
      return var2;
   }
}
