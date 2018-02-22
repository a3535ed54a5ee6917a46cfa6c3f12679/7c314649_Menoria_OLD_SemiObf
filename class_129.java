import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

// $FF: renamed from: u
public class class_129 extends IOException {

   // $FF: renamed from: b java.util.List
   private final List field_272;
   // $FF: renamed from: c java.lang.String
   private final String field_273;
   // $FF: renamed from: d java.lang.String
   private static final String field_274;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_275;


   // $FF: renamed from: <init> (java.lang.String) void
   public void method_590(String var1) {
      super();
      this.field_272 = Lists.newArrayList();
      List var10000 = this.field_272;
      class_1588 var10001 = new class_1588;
      var10001.method_8709((Object)null);
      var10000.add(var10001);
      this.field_273 = var1;
   }

   // $FF: renamed from: <init> (java.lang.String, java.lang.Throwable) void
   public void method_591(String var1, Throwable var2) {
      super(var2);
      this.field_272 = Lists.newArrayList();
      List var10000 = this.field_272;
      class_1588 var10001 = new class_1588;
      var10001.method_8709((Object)null);
      var10000.add(var10001);
      this.field_273 = var1;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_592(String var1) {
      class_1588.method_8710((class_1588)this.field_272.get(0), var1);
   }

   // $FF: renamed from: c (java.lang.String) void
   public void method_593(String var1) {
      class_1588.method_8711((class_1588)this.field_272.get(0), var1);
      List var10000 = this.field_272;
      class_1588 var10002 = new class_1588;
      var10002.method_8709((Object)null);
      var10000.add(0, var10002);
   }

   public String getMessage() {
      StringBuilder var10000 = new StringBuilder();
      String[] var1 = field_275;
      return var10000.append("Invalid ").append(((class_1588)this.field_272.get(this.field_272.size() - 1)).toString()).append(": ").append(this.field_273).toString();
   }

   // $FF: renamed from: b (java.lang.Exception) u
   public static class_129 method_594(Exception var0) {
      String[] var1 = class_752.method_4253();
      Exception var10000 = var0;
      if(var1 != null) {
         if(var0 instanceof class_129) {
            return (class_129)var0;
         }

         var10000 = var0;
      }

      String var2 = var10000.getMessage();
      if(var0 instanceof FileNotFoundException) {
         String[] var3 = field_275;
         var2 = "File not found";
      }

      class_129 var4 = new class_129;
      var4.method_591(var2, var0);
      return var4;
   }

   // $FF: renamed from: <clinit> () void
   static void method_595() {
      // $FF: Couldn't be decompiled
   }
}
