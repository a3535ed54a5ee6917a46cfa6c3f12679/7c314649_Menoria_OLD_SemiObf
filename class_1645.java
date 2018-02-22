
// $FF: renamed from: v5
public class class_1645 {

   // $FF: renamed from: b int
   private int field_8544;
   // $FF: renamed from: c int
   private int field_8545;
   // $FF: renamed from: d int
   private int field_8546;
   // $FF: renamed from: e boolean
   private boolean field_8547;
   // $FF: renamed from: f boolean
   private boolean field_8548;
   // $FF: renamed from: g boolean
   private boolean field_8549;
   // $FF: renamed from: h java.lang.String
   private static final String field_8550;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_8551;


   // $FF: renamed from: <init> (int, int) void
   public void method_9011(int var1, int var2) {
      this.method_9012(var1, var2, 0);
   }

   // $FF: renamed from: <init> (int, int, int) void
   public void method_9012(int var1, int var2, int var3) {
      this.method_9013(var1, var2, var3, false);
   }

   // $FF: renamed from: <init> (int, int, int, boolean) void
   public void method_9013(int var1, int var2, int var3, boolean var4) {
      super();
      this.field_8544 = var1;
      this.field_8545 = var2;
      this.field_8546 = var3;
      this.field_8548 = var4;
   }

   // $FF: renamed from: <init> (v5) void
   public void method_9014(class_1645 var1) {
      super();
      this.field_8544 = var1.field_8544;
      this.field_8545 = var1.field_8545;
      this.field_8546 = var1.field_8546;
   }

   // $FF: renamed from: b (v5) void
   public void method_9015(class_1645 var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_8544;
      int var10001 = var1.field_8544;
      if(var2 != null) {
         if(this.field_8544 != var1.field_8544) {
            String[] var3 = field_8551;
            System.err.println("This method should only be called for matching effects!");
         }

         var10000 = var1.field_8546;
         var10001 = this.field_8546;
      }

      label61: {
         if(var2 != null) {
            if(var10000 > var10001) {
               this.field_8546 = var1.field_8546;
               this.field_8545 = var1.field_8545;
               if(var2 != null) {
                  return;
               }
            }

            var10000 = var1.field_8546;
            if(var2 == null) {
               break label61;
            }

            var10001 = this.field_8546;
         }

         if(var10000 == var10001) {
            var10000 = this.field_8545;
            if(var2 == null) {
               break label61;
            }

            if(this.field_8545 < var1.field_8545) {
               this.field_8545 = var1.field_8545;
               if(var2 != null) {
                  return;
               }
            }
         }

         var10000 = var1.field_8548;
      }

      class_1645 var4;
      label63: {
         if(var2 != null) {
            if(var10000 != 0) {
               return;
            }

            var4 = this;
            if(var2 == null) {
               break label63;
            }

            var10000 = this.field_8548;
         }

         if(var10000 == 0) {
            return;
         }

         var4 = this;
      }

      var4.field_8548 = var1.field_8548;
   }

   // $FF: renamed from: b () int
   public int method_9016() {
      return this.field_8544;
   }

   // $FF: renamed from: c () int
   public int method_9017() {
      return this.field_8545;
   }

   // $FF: renamed from: d () int
   public int method_9018() {
      return this.field_8546;
   }

   // $FF: renamed from: b (boolean) void
   public void method_9019(boolean var1) {
      this.field_8547 = var1;
   }

   // $FF: renamed from: f () boolean
   public boolean method_9020() {
      return this.field_8548;
   }

   // $FF: renamed from: b (sv) boolean
   public boolean method_9021(class_752 var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = this.field_8545;
      if(var2 != null) {
         if(this.field_8545 > 0) {
            boolean var3 = class_1635.field_8489[this.field_8544].method_8970(this.field_8545, this.field_8546);
            if(var2 != null) {
               if(var3) {
                  this.method_9023(var1);
               }

               this.method_9022();
            }
         }

         var10000 = this.field_8545;
      }

      if(var2 != null) {
         var10000 = var10000 > 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: g () int
   private int method_9022() {
      return --this.field_8545;
   }

   // $FF: renamed from: c (sv) void
   public void method_9023(class_752 var1) {
      if(this.field_8545 > 0) {
         class_1635.field_8489[this.field_8544].method_8967(var1, this.field_8546);
      }

   }

   // $FF: renamed from: h () java.lang.String
   public String method_9024() {
      return class_1635.field_8489[this.field_8544].method_8972();
   }

   public int hashCode() {
      return this.field_8544;
   }

   public String toString() {
      String[] var1;
      String var2;
      StringBuilder var4;
      label30: {
         String[] var3;
         label29: {
            String[] var10000 = class_752.method_4253();
            var2 = "";
            var1 = var10000;
            if(var1 != null) {
               if(this.method_9018() <= 0) {
                  break label29;
               }

               var4 = (new StringBuilder()).append(this.method_9024());
               var3 = field_8551;
               var2 = var4.append(" x ").append(this.method_9018() + 1).append(", Duration: ").append(this.method_9017()).toString();
            }

            if(var1 != null) {
               break label30;
            }
         }

         var4 = (new StringBuilder()).append(this.method_9024());
         var3 = field_8551;
         var2 = var4.append(", Duration: ").append(this.method_9017()).toString();
      }

      boolean var5 = this.field_8547;
      if(var1 != null) {
         if(this.field_8547) {
            var4 = (new StringBuilder()).append(var2);
            String[] var10001 = field_8551;
            var2 = var4.append(", Splash: true").toString();
         }

         var5 = class_1635.field_8489[this.field_8544].method_8979();
      }

      return var5?"(" + var2 + ")":var2;
   }

   public boolean equals(Object var1) {
      String[] var2 = class_752.method_4253();
      Object var10000 = var1;
      if(var2 != null) {
         if(!(var1 instanceof class_1645)) {
            return false;
         }

         var10000 = var1;
      }

      int var4;
      label57: {
         class_1645 var3 = (class_1645)var10000;
         var4 = this.field_8544;
         int var10001 = var3.field_8544;
         if(var2 != null) {
            if(this.field_8544 != var3.field_8544) {
               break label57;
            }

            var4 = this.field_8546;
            var10001 = var3.field_8546;
         }

         if(var2 != null) {
            if(var4 != var10001) {
               break label57;
            }

            var4 = this.field_8545;
            var10001 = var3.field_8545;
         }

         if(var2 != null) {
            if(var4 != var10001) {
               break label57;
            }

            var4 = this.field_8547;
            var10001 = var3.field_8547;
         }

         if(var2 != null) {
            if(var4 != var10001) {
               break label57;
            }

            var4 = this.field_8548;
            if(var2 == null) {
               return (boolean)var4;
            }

            var10001 = var3.field_8548;
         }

         if(var4 == var10001) {
            var4 = 1;
            return (boolean)var4;
         }
      }

      var4 = 0;
      return (boolean)var4;
   }

   // $FF: renamed from: b (ro) ro
   public class_1583 method_9025(class_1583 var1) {
      String[] var2 = field_8551;
      var1.method_8665("Id", (byte)this.method_9016());
      var1.method_8665("Amplifier", (byte)this.method_9018());
      var1.method_8667("Duration", this.method_9017());
      var1.initGui4("Ambient", this.method_9020());
      return var1;
   }

   // $FF: renamed from: c (ro) v5
   public static class_1645 method_9026(class_1583 var0) {
      String[] var6 = field_8551;
      byte var2 = var0.initGui9("Id");
      String[] var1 = class_752.method_4253();
      byte var10000 = var2;
      if(var1 != null) {
         if(var2 < 0) {
            return null;
         }

         var10000 = var2;
      }

      if(var10000 < class_1635.field_8489.length && class_1635.field_8489[var2] != null) {
         var6 = field_8551;
         byte var3 = var0.initGui9("Amplifier");
         int var4 = var0.method_8681("Duration");
         boolean var5 = var0.method_8690("Ambient");
         class_1645 var7 = new class_1645;
         var7.method_9013(var2, var4, var3, var5);
         return var7;
      } else {
         return null;
      }
   }

   // $FF: renamed from: c (boolean) void
   public void method_9027(boolean var1) {
      this.field_8549 = var1;
   }

   // $FF: renamed from: i () boolean
   public boolean method_9028() {
      return this.field_8549;
   }

   // $FF: renamed from: <clinit> () void
   static void method_9029() {
      // $FF: Couldn't be decompiled
   }
}
