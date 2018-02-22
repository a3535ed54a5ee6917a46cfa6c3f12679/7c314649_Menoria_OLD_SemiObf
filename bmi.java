
public class bmi {

   // $FF: renamed from: a int[]
   private int[] field_7300;
   // $FF: renamed from: b int
   private int field_7301;
   // $FF: renamed from: c int
   private int field_7302;
   // $FF: renamed from: d boolean
   private boolean field_7303;
   // $FF: renamed from: e boolean
   private boolean field_7304;
   // $FF: renamed from: f boolean
   private boolean field_7305;
   // $FF: renamed from: g boolean
   private boolean field_7306;
   private static final String __OBFID;
   // $FF: renamed from: h java.lang.String[]
   private static final String[] field_7307;


   // $FF: renamed from: <init> (int[], int, int, boolean, boolean, boolean, boolean) void
   public void method_7501(int[] var1, int var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      super();
      this.field_7300 = var1;
      this.field_7301 = var2;
      this.field_7302 = var3;
      this.field_7303 = var4;
      this.field_7304 = var5;
      this.field_7305 = var6;
      this.field_7306 = var7;
   }

   // $FF: renamed from: a () int[]
   public int[] method_7502() {
      return this.field_7300;
   }

   // $FF: renamed from: b () int
   public int method_7503() {
      return this.field_7301;
   }

   // $FF: renamed from: c () int
   public int method_7504() {
      return this.field_7302;
   }

   // $FF: renamed from: d () boolean
   public boolean method_7505() {
      return this.field_7303;
   }

   // $FF: renamed from: e () boolean
   public boolean method_7506() {
      return this.field_7304;
   }

   // $FF: renamed from: f () boolean
   public boolean method_7507() {
      return this.field_7305;
   }

   // $FF: renamed from: g () boolean
   public boolean method_7508() {
      return this.field_7306;
   }

   public void addTessellatorVertexState(bmi param1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: b (java.lang.IllegalArgumentException) java.lang.IllegalArgumentException
   private static IllegalArgumentException method_7509(IllegalArgumentException var0) {
      return var0;
   }

   // $FF: renamed from: <clinit> () void
   static void method_7510() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "u¾mUù.r¿nî?i©gë.z©gW2[¨j\"ë3";
      int var4 = "u¾mUù.r¿nî?i©gë.z©gW2[¨j\"ë3".length();
      char var1 = 26;
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
                  field_7307 = var5;
                  String[] var10 = field_7307;
                  __OBFID = "CL_00000961";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 208;
               break;
            case 1:
               var10009 = 145;
               break;
            case 2:
               var10009 = 87;
               break;
            case 3:
               var10009 = 136;
               break;
            case 4:
               var10009 = 225;
               break;
            case 5:
               var10009 = 175;
               break;
            default:
               var10009 = 18;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
