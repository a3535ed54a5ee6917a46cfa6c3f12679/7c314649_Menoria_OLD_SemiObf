import java.io.DataInput;
import java.io.DataOutput;

// $FF: renamed from: rs
public class class_1579 extends class_1571 {

   // $FF: renamed from: a java.lang.String
   private String field_8268;
   // $FF: renamed from: d java.lang.String
   private static final String field_8269;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_8270;


   // $FF: renamed from: <init> () void
   public void method_8628() {
      super.method_8628();
      this.field_8268 = "";
   }

   // $FF: renamed from: <init> (java.lang.String) void
   public void method_8648(String var1) {
      super.method_8628();
      this.field_8268 = var1;
      if(var1 == null) {
         IllegalArgumentException var10000 = new IllegalArgumentException("Empty string not allowed");
         String[] var10002 = field_8270;
         throw var10000;
      }
   }

   // $FF: renamed from: b (java.io.DataOutput) void
   void method_8629(DataOutput var1) {
      var1.writeUTF(this.field_8268);
   }

   // $FF: renamed from: b (java.io.DataInput, int, ri) void
   void method_8630(DataInput var1, int var2, class_1567 var3) {
      this.field_8268 = var1.readUTF();
      var3.method_8604((long)(16 * this.field_8268.length()));
   }

   // $FF: renamed from: b () byte
   public byte method_8631() {
      return (byte)8;
   }

   public String toString() {
      return "\"" + this.field_8268 + "\"";
   }

   // $FF: renamed from: c () rm
   public class_1571 method_8633() {
      class_1579 var10000 = new class_1579;
      var10000.method_8648(this.field_8268);
      return var10000;
   }

   public boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public int hashCode() {
      return super.hashCode() ^ this.field_8268.hashCode();
   }

   // $FF: renamed from: d () java.lang.String
   public String method_8634() {
      return this.field_8268;
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_8649(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_8635() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "fq]÷×ÉnWnDíÉÉsLh\râÂrTyI`Pr³Ù-.»";
      int var4 = "fq]÷×ÉnWnDíÉÉsLh\râÂrTyI`Pr³Ù-.»".length();
      char var1 = 24;
      int var0 = -1;

      while(true) {
         ++var0;
         String var10002 = var2.substring(var0, var0 + var1);
         boolean var10000 = true;
         char[] var10003 = var10002.toCharArray();
         Object var10004 = var10003.length;
         Object var9 = true;
         char[] var8 = var10003;
         char[] var10001 = (char[])var10004;
         int var6 = 0;

         while(true) {
            var10003 = var8;
            var8 = var10001;
            var10001 = var10003;
            char[] var11 = var8;
            var8 = var10003;
            if(var10003 <= var6) {
               var5[var3++] = (new String((char[])var9)).intern();
               if((var0 += var1) >= var4) {
                  field_8270 = var5;
                  String[] var10 = field_8270;
                  field_8269 = "CL_00001228";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 234;
               break;
            case 1:
               var10009 = 213;
               break;
            case 2:
               var10009 = 228;
               break;
            case 3:
               var10009 = 74;
               break;
            case 4:
               var10009 = 103;
               break;
            case 5:
               var10009 = 32;
               break;
            default:
               var10009 = 212;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
