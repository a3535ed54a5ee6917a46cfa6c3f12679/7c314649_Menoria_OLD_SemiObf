import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// $FF: renamed from: kv
public class class_1357 implements Comparable {

   // $FF: renamed from: b java.util.List
   private static final List field_7060;
   // $FF: renamed from: c vl
   private static final class_1706 field_7061;
   // $FF: renamed from: d java.util.Set
   private static final Set field_7062;
   // $FF: renamed from: e java.lang.String
   private final String field_7063;
   // $FF: renamed from: f int
   private final int field_7064;
   // $FF: renamed from: g java.lang.String
   private final String field_7065;
   // $FF: renamed from: h int
   private int field_7066;
   // $FF: renamed from: i boolean
   private boolean field_7067;
   // $FF: renamed from: j int
   private int field_7068;


   // $FF: renamed from: b (int) void
   public static void getCursorPosition6(int var0) {
      String[] var1 = class_752.method_4253();
      if(var0 != 0) {
         class_1357 var2 = (class_1357)field_7061.method_9475(var0);
         class_1357 var10000 = var2;
         if(var1 != null) {
            if(var2 == null) {
               return;
            }

            var10000 = var2;
         }

         ++var10000.field_7068;
      }
   }

   // $FF: renamed from: b (int, boolean) void
   public static void getCursorPosition7(int var0, boolean var1) {
      String[] var2 = class_752.method_4253();
      if(var0 != 0) {
         class_1357 var3 = (class_1357)field_7061.method_9475(var0);
         class_1357 var10000 = var3;
         if(var2 != null) {
            if(var3 == null) {
               return;
            }

            var10000 = var3;
         }

         var10000.field_7067 = var1;
      }
   }

   // $FF: renamed from: b () void
   public static void getCursorPosition8() {
      String[] var10000 = class_752.method_4253();
      Iterator var1 = field_7060.iterator();
      String[] var0 = var10000;

      while(var1.hasNext()) {
         class_1357 var2 = (class_1357)var1.next();
         var2.getEnableBackgroundDrawing5();
         if(var0 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: c () void
   public static void getCursorPosition9() {
      field_7061.method_9483();
      String[] var0 = class_752.method_4253();
      Iterator var1 = field_7060.iterator();

      while(var1.hasNext()) {
         class_1357 var2 = (class_1357)var1.next();
         field_7061.method_9478(var2.field_7066, var2);
         if(var0 == null) {
            break;
         }
      }

   }

   // $FF: renamed from: d () java.util.Set
   public static Set getEnableBackgroundDrawing0() {
      return field_7062;
   }

   // $FF: renamed from: <init> (java.lang.String, int, java.lang.String) void
   public void getEnableBackgroundDrawing1(String var1, int var2, String var3) {
      super();
      this.field_7063 = var1;
      this.field_7066 = var2;
      this.field_7064 = var2;
      this.field_7065 = var3;
      field_7060.add(this);
      field_7061.method_9478(var2, this);
      field_7062.add(var3);
   }

   // $FF: renamed from: e () boolean
   public boolean getEnableBackgroundDrawing2() {
      return this.field_7067;
   }

   // $FF: renamed from: f () java.lang.String
   public String getEnableBackgroundDrawing3() {
      return this.field_7065;
   }

   // $FF: renamed from: g () boolean
   public boolean getEnableBackgroundDrawing4() {
      String[] var1 = class_752.method_4253();
      int var10000 = this.field_7068;
      if(var1 != null) {
         if(this.field_7068 == 0) {
            return false;
         }

         --this.field_7068;
         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: h () void
   private void getEnableBackgroundDrawing5() {
      this.field_7068 = 0;
      this.field_7067 = false;
   }

   // $FF: renamed from: i () java.lang.String
   public String getEnableBackgroundDrawing6() {
      return this.field_7063;
   }

   // $FF: renamed from: j () int
   public int getEnableBackgroundDrawing7() {
      return this.field_7064;
   }

   // $FF: renamed from: k () int
   public int getEnableBackgroundDrawing8() {
      return this.field_7066;
   }

   // $FF: renamed from: c (int) void
   public void getEnableBackgroundDrawing9(int var1) {
      this.field_7066 = var1;
   }

   // $FF: renamed from: b (kv) int
   public int setEnableBackgroundDrawing0(class_1357 var1) {
      int var3 = class_1450.method_7896(this.field_7065, new Object[0]).compareTo(class_1450.method_7896(var1.field_7065, new Object[0]));
      String[] var2 = class_752.method_4253();
      int var10000 = var3;
      if(var2 != null) {
         if(var3 == 0) {
            var3 = class_1450.method_7896(this.field_7063, new Object[0]).compareTo(class_1450.method_7896(var1.field_7063, new Object[0]));
         }

         var10000 = var3;
      }

      return var10000;
   }

   // $FF: synthetic method
   public int compareTo(Object var1) {
      return this.setEnableBackgroundDrawing0((class_1357)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void setEnableBackgroundDrawing1() {
      field_7060 = new ArrayList();
      class_1706 var10000 = new class_1706;
      var10000.method_9472();
      field_7061 = var10000;
      field_7062 = new HashSet();
   }
}
