import java.util.Random;

// $FF: renamed from: i3
public class class_1204 extends class_1199 {

   // $FF: renamed from: <init> () void
   public void method_6448() {
      super.method_6448();
   }

   // $FF: renamed from: <init> (ahb, java.util.Random, int, int) void
   public void method_6468(ahb var1, Random var2, int var3, int var4) {
      super.method_6449(var3, var4);
      class_1145 var10000 = new class_1145;
      var10000.method_6331(0, var2, (var3 << 4) + 2, (var4 << 4) + 2);
      class_1145 var5 = var10000;
      this.field_6230.add(var5);
      var5.method_6197(var5, this.field_6230, var2);
      this.method_6453();
      this.method_6458(var1, var2, 10);
   }
}
