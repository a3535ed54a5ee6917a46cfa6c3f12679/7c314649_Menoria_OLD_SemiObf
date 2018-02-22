import ca.diiza.e.class_804;
import ca.diiza.e.class_805;
import ca.diiza.e.class_806;

// $FF: renamed from: vX
public class class_1691 {

   // $FF: renamed from: b vX
   public static class_1691 field_8830;
   // $FF: renamed from: c vX
   public static class_1691 field_8831;
   // $FF: renamed from: d vX
   public static class_1691 field_8832;
   // $FF: renamed from: e vX
   public static class_1691 field_8833;
   // $FF: renamed from: f vX
   public static class_1691 field_8834;
   // $FF: renamed from: g vX
   public static class_1691 field_8835;
   // $FF: renamed from: h vX
   public static class_1691 field_8836;
   // $FF: renamed from: i vX
   public static class_1691 field_8837;
   // $FF: renamed from: j vX
   public static class_1691 field_8838;
   // $FF: renamed from: k vX
   public static class_1691 field_8839;
   // $FF: renamed from: l vX
   public static class_1691 field_8840;
   // $FF: renamed from: m vX
   public static class_1691 field_8841;
   // $FF: renamed from: n vX
   public static class_1691 field_8842;
   // $FF: renamed from: o vX
   public static class_1691 field_8843;
   // $FF: renamed from: q boolean
   private boolean field_8844;
   // $FF: renamed from: r boolean
   private boolean field_8845;
   // $FF: renamed from: s boolean
   private boolean field_8846;
   // $FF: renamed from: t float
   private float field_8847;
   // $FF: renamed from: u boolean
   private boolean field_8848;
   // $FF: renamed from: v boolean
   private boolean field_8849;
   // $FF: renamed from: w boolean
   private boolean field_8850;
   // $FF: renamed from: x boolean
   private boolean field_8851;
   // $FF: renamed from: y boolean
   private boolean field_8852;
   // $FF: renamed from: z java.lang.String
   public String field_8853;
   // $FF: renamed from: A java.lang.String
   private static final String field_8854;
   // $FF: renamed from: p java.lang.String[]
   private static final String[] field_8855;


   // $FF: renamed from: b (sv) vX
   public static class_1691 method_9324(class_752 var0) {
      class_1692 var10000 = new class_1692;
      String[] var10002 = field_8855;
      var10000.method_9358("mob", var0);
      return var10000;
   }

   // $FF: renamed from: b (yz) vX
   public static class_1691 method_9325(class_792 var0) {
      class_1692 var10000 = new class_1692;
      String[] var10002 = field_8855;
      var10000.method_9358("player", var0);
      return var10000;
   }

   // $FF: renamed from: b (xB, sa) vX
   public static class_1691 method_9326(class_713 var0, class_689 var1) {
      class_1693 var10000 = new class_1693;
      String[] var10002 = field_8855;
      var10000.method_9359("arrow", var0, var1);
      return var10000.method_9336();
   }

   // $FF: renamed from: a (ca.diiza.e.a, sa) vX
   public static class_1691 method_9327(class_806 var0, class_689 var1) {
      class_1693 var10000 = new class_1693;
      String[] var10002 = field_8855;
      var10000.method_9359("fire_arrow", var0, var1);
      return var10000.method_9336();
   }

   // $FF: renamed from: a (ca.diiza.e.c, sa) vX
   public static class_1691 method_9328(class_804 var0, class_689 var1) {
      class_1693 var10000 = new class_1693;
      String[] var10002 = field_8855;
      var10000.method_9359("slow_arrow", var0, var1);
      return var10000.method_9336();
   }

   // $FF: renamed from: a (ca.diiza.e.b, sa) vX
   public static class_1691 method_9329(class_805 var0, class_689 var1) {
      class_1693 var10000 = new class_1693;
      String[] var10002 = field_8855;
      var10000.method_9359("poison_arrow", var0, var1);
      return var10000.method_9336();
   }

   // $FF: renamed from: b (xD, sa) vX
   public static class_1691 method_9330(class_708 var0, class_689 var1) {
      class_1693 var10000;
      class_1691 var3;
      if(var1 == null) {
         var10000 = new class_1693;
         String[] var2 = field_8855;
         var10000.method_9359("onFire", var0, var0);
         var3 = var10000.method_9349().method_9336();
      } else {
         var10000 = new class_1693;
         String[] var10002 = field_8855;
         var10000.method_9359("fireball", var0, var1);
         var3 = var10000.method_9349().method_9336();
      }

      return var3;
   }

   // $FF: renamed from: b (sa, sa) vX
   public static class_1691 method_9331(class_689 var0, class_689 var1) {
      class_1693 var10000 = new class_1693;
      String[] var10002 = field_8855;
      var10000.method_9359("thrown", var0, var1);
      return var10000.method_9336();
   }

   // $FF: renamed from: c (sa, sa) vX
   public static class_1691 method_9332(class_689 var0, class_689 var1) {
      class_1693 var10000 = new class_1693;
      String[] var10002 = field_8855;
      var10000.method_9359("indirectMagic", var0, var1);
      return var10000.method_9346().method_9356();
   }

   // $FF: renamed from: b (sa) vX
   public static class_1691 method_9333(class_689 var0) {
      class_1692 var10000 = new class_1692;
      String[] var10002 = field_8855;
      var10000.method_9358("thorns", var0);
      return var10000.method_9356();
   }

   // $FF: renamed from: b (df) vX
   public static class_1691 method_9334(class_1036 var0) {
      class_1691 var4;
      label17: {
         String[] var1 = class_752.method_4253();
         class_1036 var10000 = var0;
         if(var1 != null) {
            if(var0 == null) {
               break label17;
            }

            var10000 = var0;
         }

         if(var10000.method_5866() != null) {
            class_1692 var3 = new class_1692;
            String[] var2 = field_8855;
            var3.method_9358("explosion.player", var0.method_5866());
            var4 = var3.method_9353().method_9338();
            return var4;
         }
      }

      var4 = new class_1691;
      String[] var10002 = field_8855;
      var4.method_9343("explosion");
      var4 = var4.method_9353().method_9338();
      return var4;
   }

   // $FF: renamed from: b () boolean
   public boolean method_9335() {
      return this.field_8849;
   }

   // $FF: renamed from: c () vX
   public class_1691 method_9336() {
      this.field_8849 = true;
      return this;
   }

   // $FF: renamed from: d () boolean
   public boolean method_9337() {
      return this.field_8852;
   }

   // $FF: renamed from: e () vX
   public class_1691 method_9338() {
      this.field_8852 = true;
      return this;
   }

   // $FF: renamed from: f () boolean
   public boolean method_9339() {
      return this.field_8844;
   }

   // $FF: renamed from: g () float
   public float method_9340() {
      return this.field_8847;
   }

   // $FF: renamed from: h () boolean
   public boolean method_9341() {
      return this.field_8845;
   }

   // $FF: renamed from: i () boolean
   public boolean method_9342() {
      return this.field_8846;
   }

   // $FF: renamed from: <init> (java.lang.String) void
   protected void method_9343(String var1) {
      super();
      this.field_8847 = 0.3F;
      this.field_8853 = var1;
   }

   // $FF: renamed from: j () sa
   public class_689 method_9344() {
      return this.method_9345();
   }

   // $FF: renamed from: k () sa
   public class_689 method_9345() {
      return null;
   }

   // $FF: renamed from: l () vX
   protected class_1691 method_9346() {
      this.field_8844 = true;
      this.field_8847 = 0.0F;
      return this;
   }

   // $FF: renamed from: m () vX
   protected class_1691 method_9347() {
      this.field_8845 = true;
      return this;
   }

   // $FF: renamed from: n () vX
   protected class_1691 method_9348() {
      this.field_8846 = true;
      this.field_8847 = 0.0F;
      return this;
   }

   // $FF: renamed from: o () vX
   protected class_1691 method_9349() {
      this.field_8848 = true;
      return this;
   }

   // $FF: renamed from: c (sv) rV
   public class_66 method_9350(class_752 var1) {
      class_752 var2 = var1.method_4205();
      StringBuilder var10000 = new StringBuilder();
      String[] var5 = field_8855;
      String var3 = var10000.append("death.attack.").append(this.field_8853).toString();
      String var4 = var3 + ".player";
      class_1081 var6;
      if(var2 != null && class_1563.method_8584(var4)) {
         var6 = new class_1081;
         var6.method_6126(var4, new Object[]{var1.method_407(), var2.method_407()});
      } else {
         var6 = new class_1081;
         var6.method_6126(var3, new Object[]{var1.method_407()});
      }

      return var6;
   }

   // $FF: renamed from: p () boolean
   public boolean method_9351() {
      return this.field_8848;
   }

   // $FF: renamed from: q () java.lang.String
   public String method_9352() {
      return this.field_8853;
   }

   // $FF: renamed from: r () vX
   public class_1691 method_9353() {
      this.field_8850 = true;
      return this;
   }

   // $FF: renamed from: s () boolean
   public boolean method_9354() {
      return this.field_8850;
   }

   // $FF: renamed from: t () boolean
   public boolean method_9355() {
      return this.field_8851;
   }

   // $FF: renamed from: u () vX
   public class_1691 method_9356() {
      this.field_8851 = true;
      return this;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9357() {
      // $FF: Couldn't be decompiled
   }
}
