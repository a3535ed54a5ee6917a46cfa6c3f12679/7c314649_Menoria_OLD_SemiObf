import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

// $FF: renamed from: i2
public abstract class class_1199 {

   // $FF: renamed from: b java.util.LinkedList
   protected LinkedList field_6230;
   // $FF: renamed from: c hS
   protected class_1206 field_6231;
   // $FF: renamed from: d int
   private int field_6232;
   // $FF: renamed from: e int
   private int field_6233;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_6234;


   // $FF: renamed from: <init> () void
   public void method_6448() {
      super();
      this.field_6230 = new LinkedList();
   }

   // $FF: renamed from: <init> (int, int) void
   public void method_6449(int var1, int var2) {
      super();
      this.field_6230 = new LinkedList();
      this.field_6232 = var1;
      this.field_6233 = var2;
   }

   // $FF: renamed from: b () hS
   public class_1206 method_6450() {
      return this.field_6231;
   }

   // $FF: renamed from: c () java.util.LinkedList
   public LinkedList method_6451() {
      return this.field_6230;
   }

   // $FF: renamed from: b (ahb, java.util.Random, hS) void
   public void method_6452(ahb var1, Random var2, class_1206 var3) {
      String[] var10000 = class_752.method_4253();
      Iterator var5 = this.field_6230.iterator();
      String[] var4 = var10000;

      while(var5.hasNext()) {
         label21: {
            class_1094 var6 = (class_1094)var5.next();
            boolean var7 = var6.method_6199().method_6483(var3);
            if(var4 != null) {
               if(!var7) {
                  break label21;
               }

               var7 = var6.method_6198(var1, var2, var3);
            }

            if(!var7) {
               var5.remove();
            }
         }

         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d () void
   protected void method_6453() {
      String[] var10000 = class_752.method_4253();
      this.field_6231 = class_1206.method_6478();
      Iterator var2 = this.field_6230.iterator();
      String[] var1 = var10000;

      while(var2.hasNext()) {
         class_1094 var3 = (class_1094)var2.next();
         this.field_6231.method_6485(var3.method_6199());
         if(var1 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (int, int) ro
   public class_1583 method_6454(int var1, int var2) {
      class_1583 var10000 = new class_1583;
      var10000.method_8628();
      class_1583 var4 = var10000;
      String[] var8 = field_6234;
      var4.initGui1("id", class_1093.method_6185(this));
      String[] var9 = class_752.method_4253();
      var4.method_8667("ChunkX", var1);
      String[] var3 = var9;
      var4.method_8667("ChunkZ", var2);
      var4.method_8664("BB", this.field_6231.method_6494());
      class_1580 var10 = new class_1580;
      var10.method_8628();
      class_1580 var5 = var10;
      Iterator var6 = this.field_6230.iterator();

      while(true) {
         if(var6.hasNext()) {
            class_1094 var7 = (class_1094)var6.next();
            var5.method_8650(var7.method_6193());
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         String[] var10001 = field_6234;
         var4.method_8664("Children", var5);
         this.method_6455(var4);
         break;
      }

      return var4;
   }

   // $FF: renamed from: b (ro) void
   public void method_6455(class_1583 var1) {}

   // $FF: renamed from: b (ahb, ro) void
   public void method_6456(ahb var1, class_1583 var2) {
      String[] var10000 = class_752.method_4253();
      String[] var6 = field_6234;
      this.field_6232 = var2.method_8681("ChunkX");
      String[] var3 = var10000;
      this.field_6233 = var2.method_8681("ChunkZ");
      class_1583 var7 = var2;
      String var10001 = "BB";
      if(var3 != null) {
         if(var2.initGui7("BB")) {
            class_1206 var8 = new class_1206;
            var8.method_6477(var2.method_8687("BB"));
            this.field_6231 = var8;
         }

         var7 = var2;
         String[] var9 = field_6234;
         var10001 = "Children";
      }

      class_1580 var4 = var7.method_8689(var10001, 10);
      int var5 = 0;

      while(true) {
         if(var5 < var4.method_8658()) {
            this.field_6230.add(class_1093.method_6188(var4.method_8653(var5), var1));
            ++var5;
            if(var3 == null) {
               break;
            }

            if(var3 != null) {
               continue;
            }
         }

         this.method_6457(var2);
         break;
      }

   }

   // $FF: renamed from: c (ro) void
   public void method_6457(class_1583 var1) {}

   // $FF: renamed from: b (ahb, java.util.Random, int) void
   protected void method_6458(ahb var1, Random var2, int var3) {
      int var5 = 63 - var3;
      String[] var4 = class_752.method_4253();
      int var6 = this.field_6231.method_6489() + 1;
      int var10000 = var6;
      int var10001 = var5;
      if(var4 != null) {
         if(var6 < var5) {
            var6 += var2.nextInt(var5 - var6);
         }

         var10000 = var6;
         var10001 = this.field_6231.field_6248;
      }

      int var7 = var10000 - var10001;
      this.field_6231.method_6486(0, var7, 0);
      Iterator var8 = this.field_6230.iterator();

      while(var8.hasNext()) {
         class_1094 var9 = (class_1094)var8.next();
         var9.method_6199().method_6486(0, var7, 0);
         if(var4 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: b (ahb, java.util.Random, int, int) void
   protected void method_6459(ahb var1, Random var2, int var3, int var4) {
      String[] var5;
      int var11;
      label25: {
         int var6 = var4 - var3 + 1 - this.field_6231.method_6489();
         boolean var7 = true;
         var5 = class_752.method_4253();
         int var10000 = var6;
         if(var5 != null) {
            if(var6 > 1) {
               var11 = var3 + var2.nextInt(var6);
               if(var5 != null) {
                  break label25;
               }
            }

            var10000 = var3;
         }

         var11 = var10000;
      }

      int var8 = var11 - this.field_6231.field_6245;
      this.field_6231.method_6486(0, var8, 0);
      Iterator var9 = this.field_6230.iterator();

      while(var9.hasNext()) {
         class_1094 var10 = (class_1094)var9.next();
         var10.method_6199().method_6486(0, var8, 0);
         if(var5 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: e () boolean
   public boolean method_6460() {
      return true;
   }

   // $FF: renamed from: f () int
   public int method_6461() {
      return this.field_6232;
   }

   // $FF: renamed from: g () int
   public int method_6462() {
      return this.field_6233;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6463() {
      // $FF: Couldn't be decompiled
   }
}
