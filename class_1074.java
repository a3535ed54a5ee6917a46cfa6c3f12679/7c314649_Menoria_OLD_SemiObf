
// $FF: renamed from: gO
public class class_1074 {

   // $FF: renamed from: a java.lang.String
   private static final String field_5664;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_5665;


   // $FF: renamed from: <init> () void
   public void method_6099() {
      super();
   }

   // $FF: renamed from: b (ro) gP
   public static class_1078 method_6100(class_1583 var0) {
      String[] var5 = field_5665;
      int var1 = var0.method_8681("xPos");
      int var2 = var0.method_8681("zPos");
      class_1078 var10000 = new class_1078;
      var10000.method_6108(var1, var2);
      class_1078 var3 = var10000;
      var3.field_5679 = var0.method_8686("Blocks");
      class_1073 var10001 = new class_1073;
      var10001.method_6097(var0.method_8686("Data"), 7);
      var3.field_5678 = var10001;
      var10001 = new class_1073;
      var10001.method_6097(var0.method_8686("SkyLight"), 7);
      var3.field_5677 = var10001;
      var10001 = new class_1073;
      var10001.method_6097(var0.method_8686("BlockLight"), 7);
      var3.field_5676 = var10001;
      var3.field_5675 = var0.method_8686("HeightMap");
      var3.field_5674 = var0.method_8690("TerrainPopulated");
      var3.field_5680 = var0.method_8689("Entities", 10);
      var3.field_5681 = var0.method_8689("TileEntities", 10);
      var3.field_5682 = var0.method_8689("TileTicks", 10);

      try {
         var3.field_5673 = var0.method_8682("LastUpdate");
      } catch (ClassCastException var6) {
         String[] var10002 = field_5665;
         var3.field_5673 = (long)var0.method_8681("LastUpdate");
      }

      return var3;
   }

   // $FF: renamed from: b (gP, ro, d0) void
   public static void method_6101(class_1078 param0, class_1583 param1, class_958 param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.ClassCastException) java.lang.ClassCastException
   private static ClassCastException method_6102(ClassCastException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_6103() {
      // $FF: Couldn't be decompiled
   }
}
