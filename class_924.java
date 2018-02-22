
// $FF: renamed from: c6
public class class_924 {

   // $FF: renamed from: b add
   private add field_4668;
   // $FF: renamed from: c add
   private add field_4669;
   // $FF: renamed from: d add
   private add field_4670;
   // $FF: renamed from: e int
   private int field_4671;
   // $FF: renamed from: f int
   private int field_4672;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_4673;


   // $FF: renamed from: <init> (ro) void
   public void method_5414(class_1583 var1) {
      super();
      this.method_5428(var1);
   }

   // $FF: renamed from: <init> (add, add, add) void
   public void method_5415(add var1, add var2, add var3) {
      super();
      this.field_4668 = var1;
      this.field_4669 = var2;
      this.field_4670 = var3;
      this.field_4672 = 7;
   }

   // $FF: renamed from: <init> (add, add) void
   public void method_5416(add var1, add var2) {
      this.method_5415(var1, (add)null, var2);
   }

   // $FF: renamed from: <init> (add, adb) void
   public void method_5417(add var1, adb var2) {
      add var10002 = new add;
      var10002.method_3724(var2);
      this.method_5416(var1, var10002);
   }

   // $FF: renamed from: b () add
   public add method_5418() {
      return this.field_4668;
   }

   // $FF: renamed from: c () add
   public add method_5419() {
      return this.field_4669;
   }

   // $FF: renamed from: d () boolean
   public boolean method_5420() {
      return this.field_4669 != null;
   }

   // $FF: renamed from: e () add
   public add method_5421() {
      return this.field_4670;
   }

   // $FF: renamed from: b (c6) boolean
   public boolean method_5422(class_924 var1) {
      String[] var2;
      add var3;
      label72: {
         var2 = class_752.method_4253();
         adb var10000 = this.field_4668.method_3730();
         adb var10001 = var1.field_4668.method_3730();
         if(var2 != null) {
            if(var10000 != var10001) {
               return false;
            }

            var3 = this.field_4670;
            if(var2 == null) {
               break label72;
            }

            var10000 = this.field_4670.method_3730();
            var10001 = var1.field_4670.method_3730();
         }

         if(var10000 != var10001) {
            return false;
         }

         var3 = this.field_4669;
      }

      boolean var4;
      label73: {
         if(var2 != null) {
            label46: {
               if(var3 == null) {
                  var3 = var1.field_4669;
                  if(var2 == null) {
                     break label46;
                  }

                  if(var1.field_4669 == null) {
                     break label73;
                  }
               }

               var3 = this.field_4669;
            }
         }

         label65: {
            if(var2 != null) {
               if(var3 == null) {
                  break label65;
               }

               var3 = var1.field_4669;
            }

            if(var2 != null) {
               if(var3 == null) {
                  break label65;
               }

               var3 = this.field_4669;
            }

            if(var3.method_3730() == var1.field_4669.method_3730()) {
               break label73;
            }
         }

         var4 = false;
         return var4;
      }

      var4 = true;
      return var4;
   }

   // $FF: renamed from: c (c6) boolean
   public boolean method_5423(class_924 var1) {
      int var10000;
      label48: {
         String[] var2 = class_752.method_4253();
         var10000 = this.method_5422(var1);
         if(var2 != null) {
            if(var10000 == 0) {
               break label48;
            }

            var10000 = this.field_4668.field_2958;
         }

         if(var2 == null) {
            return (boolean)var10000;
         }

         if(var10000 >= var1.field_4668.field_2958) {
            add var3 = this.field_4669;
            if(var2 != null) {
               if(this.field_4669 == null) {
                  break label48;
               }

               var3 = this.field_4669;
            }

            var10000 = var3.field_2958;
            if(var2 == null) {
               return (boolean)var10000;
            }

            if(var10000 >= var1.field_4669.field_2958) {
               break label48;
            }
         }

         var10000 = 1;
         return (boolean)var10000;
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   // $FF: renamed from: g () void
   public void method_5424() {
      ++this.field_4671;
   }

   // $FF: renamed from: b (int) void
   public void method_5425(int var1) {
      this.field_4672 += var1;
   }

   // $FF: renamed from: h () boolean
   public boolean method_5426() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_4671;
      if(var1 != null) {
         var10000 = this.field_4671 >= this.field_4672?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: i () void
   public void method_5427() {
      this.field_4671 = this.field_4672;
   }

   // $FF: renamed from: b (ro) void
   public void method_5428(class_1583 var1) {
      String[] var5 = field_4673;
      class_1583 var3 = var1.method_8688("buy");
      this.field_4668 = add.method_3727(var3);
      class_1583 var4 = var1.method_8688("sell");
      this.field_4670 = add.method_3727(var4);
      String[] var2 = class_752.method_4253();
      boolean var10000 = var1.initGui8("buyB", 10);
      if(var2 != null) {
         if(var10000) {
            this.field_4669 = add.method_3727(var1.method_8688("buyB"));
         }

         var5 = field_4673;
         var10000 = var1.initGui8("uses", 99);
      }

      if(var2 != null) {
         if(var10000) {
            var5 = field_4673;
            this.field_4671 = var1.method_8681("uses");
         }

         var5 = field_4673;
         var10000 = var1.initGui8("maxUses", 99);
      }

      if(var10000) {
         String[] var10002 = field_4673;
         this.field_4672 = var1.method_8681("maxUses");
         if(var2 != null) {
            return;
         }
      }

      this.field_4672 = 7;
   }

   // $FF: renamed from: j () ro
   public class_1583 method_5429() {
      String[] var10000 = class_752.method_4253();
      class_1583 var10001 = new class_1583;
      var10001.method_8628();
      class_1583 var2 = var10001;
      String[] var1 = var10000;
      String[] var3 = field_4673;
      add var10002 = this.field_4668;
      class_1583 var10003 = new class_1583;
      var10003.method_8628();
      var2.method_8664("buy", var10002.method_3737(var10003));
      var10002 = this.field_4670;
      var10003 = new class_1583;
      var10003.method_8628();
      var2.method_8664("sell", var10002.method_3737(var10003));
      if(var1 != null) {
         if(this.field_4669 != null) {
            var10002 = this.field_4669;
            var10003 = new class_1583;
            var10003.method_8628();
            var2.method_8664("buyB", var10002.method_3737(var10003));
         }

         var3 = field_4673;
         var2.method_8667("uses", this.field_4671);
         var2.method_8667("maxUses", this.field_4672);
      }

      return var2;
   }

   // $FF: renamed from: <clinit> () void
   static void method_5430() {
      // $FF: Couldn't be decompiled
   }
}
