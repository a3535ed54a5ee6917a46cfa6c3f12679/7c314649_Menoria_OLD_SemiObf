import com.google.common.collect.Lists;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// $FF: renamed from: t3
public class class_1588 {

   // $FF: renamed from: b java.lang.String
   private String field_8289;
   // $FF: renamed from: c java.util.List
   private final List field_8290;
   // $FF: renamed from: d java.lang.String
   private static final String field_8291;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8292;


   // $FF: renamed from: <init> () void
   private void method_8706() {
      super();
      this.field_8289 = null;
      this.field_8290 = Lists.newArrayList();
   }

   // $FF: renamed from: b (java.lang.String) void
   private void method_8707(String var1) {
      this.field_8290.add(0, var1);
   }

   // $FF: renamed from: a () java.lang.String
   public String method_8708() {
      String[] var10001 = field_8292;
      return StringUtils.join(this.field_8290, "->");
   }

   public String toString() {
      String[] var1 = class_752.method_4253();
      class_1588 var10000 = this;
      String var4;
      if(var1 != null) {
         if(this.field_8289 != null) {
            var10000 = this;
            if(var1 != null) {
               if(!this.field_8290.isEmpty()) {
                  var4 = this.field_8289 + " " + this.method_8708();
                  return var4;
               }

               var10000 = this;
            }

            var4 = var10000.field_8289;
            return var4;
         }

         var10000 = this;
      }

      if(!var10000.field_8290.isEmpty()) {
         StringBuilder var3 = new StringBuilder();
         String[] var2 = field_8292;
         var4 = var3.append("(Unknown file) ").append(this.method_8708()).toString();
      } else {
         String[] var5 = field_8292;
         var4 = "(Unknown file)";
      }

      return var4;
   }

   // $FF: renamed from: <init> (java.lang.Object) void
   void method_8709(Object var1) {
      this.method_8706();
   }

   // $FF: renamed from: b (t3, java.lang.String) void
   static void method_8710(class_1588 var0, String var1) {
      var0.method_8707(var1);
   }

   // $FF: renamed from: c (t3, java.lang.String) java.lang.String
   static String method_8711(class_1588 var0, String var1) {
      return var0.field_8289 = var1;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8712() {
      // $FF: Couldn't be decompiled
   }
}
