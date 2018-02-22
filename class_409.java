import java.util.List;

// $FF: renamed from: fH
public class class_409 extends class_408 {

   // $FF: renamed from: P java.lang.String[]
   public static final String[] field_2115;
   // $FF: renamed from: Q java.lang.String[]
   private static final String[] field_2116;


   // $FF: renamed from: <init> () void
   public void method_2651() {
      super.method_2651();
   }

   // $FF: renamed from: a (adb, a5, java.util.List) void
   public void method_2519(adb var1, class_872 var2, List var3) {
      add var10001 = new add;
      var10001.method_3726(var1, 1, 0);
      var3.add(var10001);
      var10001 = new add;
      var10001.method_3726(var1, 1, 1);
      var3.add(var10001);
      var10001 = new add;
      var10001.method_3726(var1, 1, 2);
      var3.add(var10001);
      var10001 = new add;
      var10001.method_3726(var1, 1, 3);
      var3.add(var10001);
   }

   // $FF: renamed from: a (vM) void
   public void method_2535(class_74 var1) {
      this.field_2113 = new class_73[field_2115.length];
      String[] var10000 = class_752.method_4253();
      this.field_2114 = new class_73[field_2115.length];
      String[] var2 = var10000;
      int var3 = 0;

      while(var3 < this.field_2113.length) {
         this.field_2113[var3] = var1.method_375(this.method_2533() + "_" + field_2115[var3]);
         class_73[] var4 = this.field_2114;
         StringBuilder var10003 = (new StringBuilder()).append(this.method_2533()).append("_").append(field_2115[var3]);
         String[] var10004 = field_2116;
         var4[var3] = var1.method_375(var10003.append("_top").toString());
         ++var3;
         if(var2 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: <clinit> () void
   static void method_2537() {
      // $FF: Couldn't be decompiled
   }
}
