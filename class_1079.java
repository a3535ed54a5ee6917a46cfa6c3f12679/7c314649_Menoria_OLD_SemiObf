import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.zip.DeflaterOutputStream;

// $FF: renamed from: gQ
public class class_1079 {

   // $FF: renamed from: b byte[]
   private static final byte[] field_5686;
   // $FF: renamed from: c java.io.File
   private final File field_5687;
   // $FF: renamed from: d java.io.RandomAccessFile
   private RandomAccessFile field_5688;
   // $FF: renamed from: e int[]
   private final int[] field_5689;
   // $FF: renamed from: f int[]
   private final int[] field_5690;
   // $FF: renamed from: g java.util.ArrayList
   private ArrayList field_5691;
   // $FF: renamed from: h int
   private int field_5692;
   // $FF: renamed from: i long
   private long field_5693;
   // $FF: renamed from: j java.lang.String
   private static final String field_5694;
   // $FF: renamed from: k java.lang.String[]
   private static final String[] field_5695;


   // $FF: renamed from: <init> (java.io.File) void
   public void method_6110(File param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, int) java.io.DataInputStream
   public synchronized DataInputStream method_6111(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: c (int, int) java.io.DataOutputStream
   public DataOutputStream method_6112(int var1, int var2) {
      DataOutputStream var10000;
      if(this.method_6115(var1, var2)) {
         var10000 = null;
      } else {
         var10000 = new DataOutputStream;
         DeflaterOutputStream var10002 = new DeflaterOutputStream;
         class_127 var10004 = new class_127;
         var10004.method_586(this, var1, var2);
         var10002.<init>(var10004);
         var10000.<init>(var10002);
      }

      return var10000;
   }

   // $FF: renamed from: b (int, int, byte[], int) void
   protected synchronized void method_6113(int param1, int param2, byte[] param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (int, byte[], int) void
   private void method_6114(int var1, byte[] var2, int var3) {
      this.field_5688.seek((long)(var1 * 4096));
      this.field_5688.writeInt(var3 + 1);
      this.field_5688.writeByte(2);
      this.field_5688.write(var2, 0, var3);
   }

   // $FF: renamed from: e (int, int) boolean
   private boolean method_6115(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = var1;
      if(var3 != null) {
         if(var1 >= 0) {
            var10000 = var1;
            if(var3 == null) {
               return (boolean)var10000;
            }

            if(var1 < 32) {
               var10000 = var2;
               if(var3 == null) {
                  return (boolean)var10000;
               }

               if(var2 >= 0) {
                  var10000 = var2;
                  if(var3 == null) {
                     return (boolean)var10000;
                  }

                  if(var2 < 32) {
                     var10000 = 0;
                     return (boolean)var10000;
                  }
               }
            }
         }

         var10000 = 1;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: f (int, int) int
   private int method_6116(int var1, int var2) {
      return this.field_5689[var1 + var2 * 32];
   }

   // $FF: renamed from: g (int, int) boolean
   public boolean method_6117(int var1, int var2) {
      String[] var3 = class_752.method_4253();
      int var10000 = this.method_6116(var1, var2);
      if(var3 != null) {
         var10000 = var10000 != 0?1:0;
      }

      return (boolean)var10000;
   }

   // $FF: renamed from: b (int, int, int) void
   private void method_6118(int var1, int var2, int var3) {
      this.field_5689[var1 + var2 * 32] = var3;
      this.field_5688.seek((long)((var1 + var2 * 32) * 4));
      this.field_5688.writeInt(var3);
   }

   // $FF: renamed from: c (int, int, int) void
   private void method_6119(int var1, int var2, int var3) {
      this.field_5690[var1 + var2 * 32] = var3;
      this.field_5688.seek((long)(4096 + (var1 + var2 * 32) * 4));
      this.field_5688.writeInt(var3);
   }

   // $FF: renamed from: a () void
   public void method_6120() {
      String[] var1 = class_752.method_4253();
      RandomAccessFile var10000 = this.field_5688;
      if(var1 != null) {
         if(this.field_5688 == null) {
            return;
         }

         var10000 = this.field_5688;
      }

      var10000.close();
   }

   // $FF: renamed from: <clinit> () void
   static void method_6121() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\b\tÅ¦§{v¢§92";
      int var4 = "\b\tÅ¦§{v¢§92".length();
      char var1 = 11;
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
                  field_5695 = var5;
                  String[] var10 = field_5695;
                  field_5694 = "CL_00000381";
                  field_5686 = new byte[4096];
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 175;
               break;
            case 1:
               var10009 = 161;
               break;
            case 2:
               var10009 = 126;
               break;
            case 3:
               var10009 = 114;
               break;
            case 4:
               var10009 = 91;
               break;
            case 5:
               var10009 = 115;
               break;
            default:
               var10009 = 78;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }

   // $FF: renamed from: b (java.io.IOException) java.io.IOException
   private static IOException method_6122(IOException var0) {
      return var0;
   }
}
