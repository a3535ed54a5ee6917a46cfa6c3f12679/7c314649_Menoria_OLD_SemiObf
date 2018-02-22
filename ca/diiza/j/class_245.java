package ca.diiza.j;

import ca.diiza.j.class_244;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// $FF: renamed from: ca.diiza.j.d
public class class_245 {

   // $FF: renamed from: a java.lang.String
   private String field_1344;
   // $FF: renamed from: b java.util.List
   List field_1345;


   // $FF: renamed from: <init> () void
   public void method_1356() {
      super();
      this.field_1344 = ",";
      this.field_1345 = new ArrayList();
   }

   // $FF: renamed from: <init> (java.lang.String) void
   public void method_1357(String var1) {
      super();
      this.field_1344 = ",";
      this.field_1345 = new ArrayList();
      this.method_1363(var1, this.field_1344, this.field_1345);
   }

   // $FF: renamed from: <init> (java.lang.String, java.lang.String) void
   public void method_1358(String var1, String var2) {
      super();
      this.field_1344 = ",";
      this.field_1345 = new ArrayList();
      this.field_1344 = var1;
      this.method_1363(var1, var2, this.field_1345);
   }

   // $FF: renamed from: <init> (java.lang.String, java.lang.String, boolean) void
   public void method_1359(String var1, String var2, boolean var3) {
      super();
      this.field_1344 = ",";
      this.field_1345 = new ArrayList();
      this.method_1362(var1, var2, this.field_1345, var3);
   }

   // $FF: renamed from: a () java.util.List
   public List method_1360() {
      return this.field_1345;
   }

   // $FF: renamed from: b () java.lang.String[]
   public String[] method_1361() {
      return (String[])((String[])this.field_1345.toArray());
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.util.List, boolean) void
   public void method_1362(String var1, String var2, List var3, boolean var4) {
      String var5 = class_244.method_1346();
      String var10000 = var1;
      if(var5 == null) {
         if(var1 == null) {
            return;
         }

         var10000 = var2;
      }

      if(var10000 != null) {
         if(var4) {
            StringTokenizer var6 = new StringTokenizer(var1, var2);

            while(var6.hasMoreTokens()) {
               var3.add(var6.nextToken().trim());
               if(var5 != null) {
                  return;
               }

               if(var5 != null) {
                  break;
               }
            }

            if(var5 == null) {
               return;
            }
         }

         this.method_1363(var1, var2, var3);
      }

   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, java.util.List) void
   public void method_1363(String var1, String var2, List var3) {
      String var4 = class_244.method_1346();
      String var10000 = var1;
      if(var4 == null) {
         if(var1 == null) {
            return;
         }

         var10000 = var2;
      }

      if(var10000 != null) {
         int var5 = 0;
         boolean var6 = false;

         int var7;
         do {
            var7 = var5;
            var5 = var1.indexOf(var2, var5);
            if(var5 == -1 && var4 == null) {
               break;
            }

            var3.add(var1.substring(var7, var5).trim());
            var5 += var2.length();
         } while(var5 != -1);

         var3.add(var1.substring(var7).trim());
      }

   }

   // $FF: renamed from: a (java.lang.String) void
   public void method_1364(String var1) {
      this.field_1344 = var1;
   }

   // $FF: renamed from: a (int, java.lang.String) void
   public void method_1365(int var1, String var2) {
      if(var2 != null) {
         this.field_1345.add(var1, var2.trim());
      }

   }

   // $FF: renamed from: b (java.lang.String) void
   public void method_1366(String var1) {
      if(var1 != null) {
         this.field_1345.add(var1.trim());
      }

   }

   // $FF: renamed from: a (ca.diiza.j.d) void
   public void method_1367(class_245 var1) {
      this.field_1345.addAll(var1.field_1345);
   }

   // $FF: renamed from: c (java.lang.String) void
   public void method_1368(String var1) {
      this.method_1363(var1, this.field_1344, this.field_1345);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) void
   public void method_1369(String var1, String var2) {
      this.method_1363(var1, var2, this.field_1345);
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String, boolean) void
   public void method_1370(String var1, String var2, boolean var3) {
      this.method_1362(var1, var2, this.field_1345, var3);
   }

   // $FF: renamed from: a (int) java.lang.String
   public String method_1371(int var1) {
      return (String)this.field_1345.get(var1);
   }

   // $FF: renamed from: c () int
   public int method_1372() {
      return this.field_1345.size();
   }

   public String toString() {
      return this.method_1373(this.field_1344);
   }

   // $FF: renamed from: d (java.lang.String) java.lang.String
   public String method_1373(String var1) {
      StringBuffer var3 = new StringBuffer();
      String var10000 = class_244.method_1346();
      int var4 = 0;
      String var2 = var10000;

      while(var4 < this.field_1345.size()) {
         label17: {
            if(var4 == 0) {
               var3.append(this.field_1345.get(var4));
               if(var2 == null) {
                  break label17;
               }
            }

            var3.append(var1);
            var3.append(this.field_1345.get(var4));
         }

         ++var4;
         if(var2 != null) {
            break;
         }
      }

      return var3.toString();
   }

   // $FF: renamed from: d () void
   public void method_1374() {
      this.field_1345.clear();
   }

   // $FF: renamed from: e () void
   public void method_1375() {
      this.field_1344 = ",";
      this.field_1345.clear();
   }
}
