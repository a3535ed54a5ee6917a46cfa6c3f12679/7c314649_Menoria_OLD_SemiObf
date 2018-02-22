import java.util.UUID;
import org.apache.commons.lang3.Validate;

// $FF: renamed from: x5
public class class_1716 {

   // $FF: renamed from: b double
   private final double field_9002;
   // $FF: renamed from: c int
   private final int field_9003;
   // $FF: renamed from: d java.lang.String
   private final String field_9004;
   // $FF: renamed from: e java.util.UUID
   private final UUID field_9005;
   // $FF: renamed from: f boolean
   private boolean field_9006;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_9007;


   // $FF: renamed from: <init> (java.lang.String, double, int) void
   public void method_9592(String var1, double var2, int var4) {
      this.method_9593(UUID.randomUUID(), var1, var2, var4);
   }

   // $FF: renamed from: <init> (java.util.UUID, java.lang.String, double, int) void
   public void method_9593(UUID var1, String var2, double var3, int var5) {
      super();
      this.field_9006 = true;
      this.field_9005 = var1;
      this.field_9004 = var2;
      this.field_9002 = var3;
      this.field_9003 = var5;
      String[] var6 = field_9007;
      Validate.notEmpty(var2, "Modifier name cannot be empty", new Object[0]);
      Validate.inclusiveBetween(Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(var5), "Invalid operation", new Object[0]);
   }

   // $FF: renamed from: b () java.util.UUID
   public UUID method_9594() {
      return this.field_9005;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_9595() {
      return this.field_9004;
   }

   // $FF: renamed from: d () int
   public int method_9596() {
      return this.field_9003;
   }

   // $FF: renamed from: e () double
   public double method_9597() {
      return this.field_9002;
   }

   // $FF: renamed from: f () boolean
   public boolean method_9598() {
      return this.field_9006;
   }

   // $FF: renamed from: b (boolean) x5
   public class_1716 method_9599(boolean var1) {
      this.field_9006 = var1;
      return this;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = this;
      if(var2 != null) {
         if(this == var1) {
            return true;
         }

         var10000 = var1;
      }

      if(var10000 != null) {
         var10000 = this.getClass();
         if(var2 != null) {
            if(var10000 != var1.getClass()) {
               return false;
            }

            var10000 = var1;
         }

         boolean var5;
         label37: {
            class_1716 var3 = (class_1716)var10000;
            UUID var4 = this.field_9005;
            if(var2 != null) {
               if(this.field_9005 != null) {
                  var5 = this.field_9005.equals(var3.field_9005);
                  if(var2 == null) {
                     return var5;
                  }

                  if(!var5) {
                     return false;
                  }
                  break label37;
               }

               var4 = var3.field_9005;
            }

            if(var4 != null) {
               return false;
            }
         }

         var5 = true;
         return var5;
      } else {
         return false;
      }
   }

   public int hashCode() {
      String[] var1 = class_752.method_4253();
      UUID var10000 = this.field_9005;
      int var2;
      if(var1 != null) {
         if(this.field_9005 == null) {
            var2 = 0;
            return var2;
         }

         var10000 = this.field_9005;
      }

      var2 = var10000.hashCode();
      return var2;
   }

   public String toString() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_9007;
      return var10000.append("AttributeModifier{amount=").append(this.field_9002).append(", operation=").append(this.field_9003).append(", name=\'").append(this.field_9004).append('\'').append(", id=").append(this.field_9005).append(", serialize=").append(this.field_9006).append('}').toString();
   }

   // $FF: renamed from: <clinit> () void
   static void method_9600() {
      // $FF: Couldn't be decompiled
   }
}
