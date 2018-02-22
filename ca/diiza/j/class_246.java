package ca.diiza.j;

import ca.diiza.j.class_1;
import ca.diiza.j.class_2;
import ca.diiza.j.class_241;
import ca.diiza.j.class_242;
import ca.diiza.j.class_249;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// $FF: renamed from: ca.diiza.j.f
public class class_246 {

   // $FF: renamed from: a int
   public static final int field_1346 = 0;
   // $FF: renamed from: b int
   public static final int field_1347 = 1;
   // $FF: renamed from: c int
   public static final int field_1348 = 2;
   // $FF: renamed from: d int
   public static final int field_1349 = 3;
   // $FF: renamed from: e int
   public static final int field_1350 = 4;
   // $FF: renamed from: f int
   public static final int field_1351 = 5;
   // $FF: renamed from: g int
   public static final int field_1352 = 6;
   // $FF: renamed from: h int
   public static final int field_1353 = -1;
   // $FF: renamed from: i java.util.LinkedList
   private LinkedList field_1354;
   // $FF: renamed from: j ca.diiza.j.j
   private class_241 field_1355;
   // $FF: renamed from: k ca.diiza.j.k
   private class_242 field_1356;
   // $FF: renamed from: l int
   private int field_1357;
   // $FF: renamed from: m java.lang.String[]
   private static final String[] field_1358;


   // $FF: renamed from: <init> () void
   public void method_1376() {
      super();
      class_241 var10001 = new class_241;
      var10001.method_1317((Reader)null);
      this.field_1355 = var10001;
      this.field_1356 = null;
      this.field_1357 = 0;
   }

   // $FF: renamed from: a (java.util.LinkedList) int
   private int method_1377(LinkedList param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a () void
   public void method_1378() {
      this.field_1356 = null;
      this.field_1357 = 0;
      this.field_1354 = null;
   }

   // $FF: renamed from: a (java.io.Reader) void
   public void method_1379(Reader var1) {
      this.field_1355.method_1322(var1);
      this.method_1378();
   }

   // $FF: renamed from: b () int
   public int method_1380() {
      return this.field_1355.method_1316();
   }

   // $FF: renamed from: a (java.lang.String) java.lang.Object
   public Object method_1381(String var1) {
      return this.method_1382(var1, (class_1)null);
   }

   // $FF: renamed from: a (java.lang.String, ca.diiza.j.b) java.lang.Object
   public Object method_1382(String var1, class_1 var2) {
      StringReader var3 = new StringReader(var1);

      try {
         return this.method_1384(var3, var2);
      } catch (IOException var5) {
         class_249 var10000 = new class_249;
         var10000.method_1419(-1, 2, var5);
         throw var10000;
      }
   }

   // $FF: renamed from: b (java.io.Reader) java.lang.Object
   public Object method_1383(Reader var1) {
      return this.method_1384(var1, (class_1)null);
   }

   // $FF: renamed from: a (java.io.Reader, ca.diiza.j.b) java.lang.Object
   public Object method_1384(Reader param1, class_1 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c () void
   private void method_1385() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (ca.diiza.j.b) java.util.Map
   private Map method_1386(class_1 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (ca.diiza.j.b) java.util.List
   private List method_1387(class_1 param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (java.lang.String, ca.diiza.j.c) void
   public void method_1388(String var1, class_2 var2) {
      this.method_1389(var1, var2, false);
   }

   // $FF: renamed from: a (java.lang.String, ca.diiza.j.c, boolean) void
   public void method_1389(String var1, class_2 var2, boolean var3) {
      StringReader var4 = new StringReader(var1);

      try {
         this.method_1391(var4, var2, var3);
      } catch (IOException var6) {
         class_249 var10000 = new class_249;
         var10000.method_1419(-1, 2, var6);
         throw var10000;
      }
   }

   // $FF: renamed from: a (java.io.Reader, ca.diiza.j.c) void
   public void method_1390(Reader var1, class_2 var2) {
      this.method_1391(var1, var2, false);
   }

   // $FF: renamed from: a (java.io.Reader, ca.diiza.j.c, boolean) void
   public void method_1391(Reader param1, class_2 param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.String) java.util.Date
   public static Date method_1392(String param0) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.Exception) java.lang.Exception
   private static Exception method_1393(Exception var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_1394() {
      // $FF: Couldn't be decompiled
   }
}
