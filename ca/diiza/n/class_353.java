package ca.diiza.n;

import ca.diiza.n.class_350;

// $FF: renamed from: ca.diiza.n.a
public class class_353 extends class_250 {

   // $FF: renamed from: c boolean
   private boolean field_1792;
   // $FF: renamed from: d int
   private int field_1793;
   // $FF: renamed from: e ro[]
   private class_1583[] field_1794;
   // $FF: renamed from: f java.lang.String
   private static final String field_1795 = "CL_00001508";


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (boolean, int, ro[]) void
   public void method_2033(boolean var1, int var2, class_1583[] var3) {
      super.method_1449();
      this.field_1792 = var1;
      this.field_1793 = var2;
      this.field_1794 = var3;
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      boolean var10000 = class_350.method_2022();
      this.field_1792 = var1.readBoolean();
      boolean var2 = var10000;
      this.field_1793 = var1.readInt();
      this.field_1794 = new class_1583[this.field_1793];
      int var4 = 0;

      while(var4 < this.field_1793) {
         this.field_1794[var4] = var1.method_521();
         ++var4;
         if(!var2) {
            int var3 = class_689.method_3977();
            ++var3;
            class_689.method_3975(var3);
            break;
         }
      }

   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      boolean var10000 = class_350.method_2022();
      var1.writeBoolean(this.field_1792);
      boolean var2 = var10000;
      var1.writeInt(this.field_1793);
      int var3 = 0;

      while(var3 < this.field_1793) {
         var1.method_520(this.field_1794[var3]);
         ++var3;
         if(!var2) {
            break;
         }
      }

   }

   // $FF: renamed from: a () ro[]
   public class_1583[] method_2034() {
      return this.field_1794;
   }

   // $FF: renamed from: e () boolean
   public boolean method_2035() {
      return this.field_1792;
   }

   // $FF: renamed from: a (tF) void
   public void method_2036(class_64 var1) {
      var1.method_333(this);
   }

   // $FF: renamed from: b (rP) void
   public void method_1455(class_57 var1) {
      this.method_2036((class_64)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      boolean var10000 = true;
      char[] var10003 = "àðþÒò\rëö".toCharArray();
      Object var10004 = var10003.length;
      Object var4 = true;
      char[] var10002 = var10003;
      char[] var10001 = (char[])var10004;
      int var0 = 0;

      while(true) {
         var10003 = var10002;
         var10002 = var10001;
         var10001 = var10003;
         char[] var5 = var10002;
         var10002 = var10003;
         if(var10003 <= var0) {
            field_1795 = (new String((char[])var4)).intern();
            String var2 = field_1795;
            return;
         }

         char var10007 = (char)((Object[])var4)[var0];
         short var10009;
         switch(var0 % 7) {
         case 0:
            var10009 = 146;
            break;
         case 1:
            var10009 = 228;
            break;
         case 2:
            var10009 = 231;
            break;
         case 3:
            var10009 = 134;
            break;
         case 4:
            var10009 = 170;
            break;
         case 5:
            var10009 = 138;
            break;
         default:
            var10009 = 117;
         }

         ((Object[])var4)[var0] = (char)(var10007 ^ var5 ^ var10009);
         ++var0;
      }
   }
}
