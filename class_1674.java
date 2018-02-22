import java.util.ArrayList;
import java.util.List;

// $FF: renamed from: vN
public class class_1674 implements class_22 {

   // $FF: renamed from: b java.lang.String
   private String field_8742;
   // $FF: renamed from: c int
   private int field_8743;
   // $FF: renamed from: d add[]
   private add[] field_8744;
   // $FF: renamed from: e java.util.List
   private List field_8745;
   // $FF: renamed from: f boolean
   private boolean field_8746;


   // $FF: renamed from: <init> (java.lang.String, boolean, int) void
   public void method_9235(String var1, boolean var2, int var3) {
      super();
      this.field_8742 = var1;
      this.field_8746 = var2;
      this.field_8743 = var3;
      this.field_8744 = new add[var3];
   }

   // $FF: renamed from: b (vJ) void
   public void method_9236(class_72 var1) {
      String[] var2 = class_752.method_4253();
      List var10000 = this.field_8745;
      if(var2 != null) {
         if(this.field_8745 == null) {
            this.field_8745 = new ArrayList();
         }

         var10000 = this.field_8745;
      }

      var10000.add(var1);
   }

   // $FF: renamed from: c (vJ) void
   public void method_9237(class_72 var1) {
      this.field_8745.remove(var1);
   }

   // $FF: renamed from: c (int) add
   public add method_84(int var1) {
      String[] var2 = class_752.method_4253();
      int var10000 = var1;
      if(var2 != null) {
         if(var1 < 0) {
            return null;
         }

         var10000 = var1;
      }

      if(var10000 < this.field_8744.length) {
         return this.field_8744[var1];
      } else {
         return null;
      }
   }

   // $FF: renamed from: b (int, int) add
   public add method_85(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      add var10000 = this.field_8744[var1];
      if(var3 != null) {
         if(var10000 == null) {
            return null;
         }

         var10000 = this.field_8744[var1];
      }

      add var4;
      if(var3 != null) {
         if(var10000.field_2958 <= var2) {
            var4 = this.field_8744[var1];
            this.field_8744[var1] = null;
            this.method_91();
            return var4;
         }

         var10000 = this.field_8744[var1].method_3729(var2);
      }

      var4 = var10000;
      var10000 = this.field_8744[var1];
      if(var3 != null) {
         if(var10000.field_2958 == 0) {
            this.field_8744[var1] = null;
         }

         this.method_91();
         var10000 = var4;
      }

      return var10000;
   }

   // $FF: renamed from: j (int) add
   public add method_86(int var1) {
      String[] var2 = class_752.method_4253();
      add var10000 = this.field_8744[var1];
      if(var2 != null) {
         if(var10000 == null) {
            return null;
         }

         var10000 = this.field_8744[var1];
      }

      add var3 = var10000;
      this.field_8744[var1] = null;
      return var3;
   }

   // $FF: renamed from: b (int, add) void
   public void method_87(int var1, add var2) {
      String[] var10000 = class_752.method_4253();
      this.field_8744[var1] = var2;
      String[] var3 = var10000;
      if(var3 != null) {
         if(var2 != null) {
            label16: {
               add var4 = var2;
               if(var3 != null) {
                  if(var2.field_2958 <= this.method_90()) {
                     break label16;
                  }

                  var4 = var2;
               }

               var4.field_2958 = this.method_90();
            }
         }

         this.method_91();
      }

   }

   // $FF: renamed from: f () int
   public int method_83() {
      return this.field_8743;
   }

   // $FF: renamed from: i () java.lang.String
   public String method_88() {
      return this.field_8742;
   }

   // $FF: renamed from: j () boolean
   public boolean method_89() {
      return this.field_8746;
   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_9238(String var1) {
      this.field_8746 = true;
      this.field_8742 = var1;
   }

   // $FF: renamed from: k () int
   public int method_90() {
      return 64;
   }

   // $FF: renamed from: l () void
   public void method_91() {
      String[] var1 = class_752.method_4253();
      if(this.field_8745 != null) {
         int var2 = 0;

         while(var2 < this.field_8745.size()) {
            ((class_72)this.field_8745.get(var2)).method_365(this);
            ++var2;
            if(var1 == null) {
               break;
            }
         }
      }

   }

   // $FF: renamed from: b (yz) boolean
   public boolean method_92(class_792 var1) {
      return true;
   }

   // $FF: renamed from: m () void
   public void method_93() {}

   // $FF: renamed from: n () void
   public void method_94() {}

   // $FF: renamed from: d (int, add) boolean
   public boolean method_95(int var1, add var2) {
      return true;
   }
}
