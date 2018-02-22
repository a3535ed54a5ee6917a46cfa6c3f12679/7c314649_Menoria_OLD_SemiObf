import java.util.Iterator;
import java.util.List;

// $FF: renamed from: yY
public class class_1767 extends class_1766 {

   // $FF: renamed from: h boolean
   boolean field_9242;
   // $FF: renamed from: i int
   private int field_9243;


   // $FF: renamed from: <init> (wI, boolean) void
   public void method_9732(class_761 var1, boolean var2) {
      super.method_9732(var1, false);
      this.field_9242 = var2;
      this.method_9655(1);
   }

   // $FF: renamed from: b () boolean
   public boolean method_9649() {
      int var3;
      label24: {
         String[] var10000 = class_752.method_4253();
         int var2 = this.field_9236.method_4167();
         String[] var1 = var10000;
         var3 = var2;
         if(var1 != null) {
            if(var2 == this.field_9243) {
               break label24;
            }

            var3 = this.method_9735(this.field_9236.method_4166(), false);
         }

         if(var1 == null) {
            return (boolean)var3;
         }

         if(var3 != 0) {
            var3 = 1;
            return (boolean)var3;
         }
      }

      var3 = 0;
      return (boolean)var3;
   }

   // $FF: renamed from: e () void
   public void method_9652() {
      this.field_9236.method_4260(this.field_9236.method_4166());
      String[] var10000 = class_752.method_4253();
      this.field_9243 = this.field_9236.method_4167();
      String[] var1 = var10000;
      class_1767 var7 = this;
      if(var1 != null) {
         label48: {
            if(this.field_9242) {
               double var2 = this.method_9734();
               List var4 = this.field_9236.field_2990.method_2157(this.field_9236.getClass(), class_1343.method_7093(this.field_9236.field_2994, this.field_9236.field_2995, this.field_9236.field_2996, this.field_9236.field_2994 + 1.0D, this.field_9236.field_2995 + 1.0D, this.field_9236.field_2996 + 1.0D).method_7097(var2, 10.0D, var2));
               Iterator var5 = var4.iterator();

               while(var5.hasNext()) {
                  class_761 var6 = (class_761)var5.next();
                  var7 = this;
                  if(var1 == null) {
                     break label48;
                  }

                  class_761 var9;
                  label52: {
                     Object var8 = this.field_9236;
                     if(var1 != null) {
                        if(this.field_9236 == var6) {
                           continue;
                        }

                        var9 = var6;
                        if(var1 == null) {
                           break label52;
                        }

                        var8 = var6.method_4259();
                     }

                     if(var8 != null) {
                        continue;
                     }

                     var9 = var6;
                  }

                  class_752 var10001 = this.field_9236.method_4166();
                  if(var1 != null) {
                     if(var9.method_4248(var10001)) {
                        continue;
                     }

                     var9 = var6;
                     var10001 = this.field_9236.method_4166();
                  }

                  var9.method_4260(var10001);
                  if(var1 == null) {
                     break;
                  }
               }
            }

            var7 = this;
         }
      }

      var7.method_9652();
   }
}
