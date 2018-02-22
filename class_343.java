import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// $FF: renamed from: r8
public class class_343 extends class_250 {

   // $FF: renamed from: c int
   private int field_1718;
   // $FF: renamed from: d com.mojang.authlib.GameProfile
   private GameProfile field_1719;
   // $FF: renamed from: e int
   private int field_1720;
   // $FF: renamed from: f int
   private int field_1721;
   // $FF: renamed from: g int
   private int field_1722;
   // $FF: renamed from: h byte
   private byte field_1723;
   // $FF: renamed from: i byte
   private byte field_1724;
   // $FF: renamed from: j int
   private int field_1725;
   // $FF: renamed from: k x1
   private class_1710 field_1726;
   // $FF: renamed from: l java.util.List
   private List field_1727;
   // $FF: renamed from: m java.lang.String
   private static final String field_1728;
   // $FF: renamed from: n java.lang.String[]
   private static final String[] field_1729;


   // $FF: renamed from: <init> () void
   public void method_1449() {
      super.method_1449();
   }

   // $FF: renamed from: <init> (yz) void
   public void method_1941(class_792 var1) {
      int var4;
      label14: {
         String[] var10000 = class_752.method_4253();
         super.method_1449();
         String[] var2 = var10000;
         this.field_1718 = var1.method_3845();
         this.field_1719 = var1.method_4599();
         this.field_1720 = class_1715.method_9561(var1.field_2994 * 32.0D);
         this.field_1721 = class_1715.method_9561(var1.field_2995 * 32.0D);
         this.field_1722 = class_1715.method_9561(var1.field_2996 * 32.0D);
         this.field_1723 = (byte)((int)(var1.field_3000 * 256.0F / 360.0F));
         this.field_1724 = (byte)((int)(var1.field_3001 * 256.0F / 360.0F));
         add var3 = var1.field_3616.method_3593();
         add var10001 = var3;
         if(var2 != null) {
            if(var3 == null) {
               var4 = 0;
               break label14;
            }

            var10001 = var3;
         }

         var4 = adb.method_2918(var10001.method_3730());
      }

      this.field_1725 = var4;
      this.field_1726 = var1.method_3849();
   }

   // $FF: renamed from: b (d) void
   public void method_1453(class_112 var1) {
      String[] var10000 = class_752.method_4253();
      this.field_1718 = var1.method_518();
      String[] var2 = var10000;
      UUID var3 = UUID.fromString(var1.method_524(36));
      GameProfile var10001 = new GameProfile;
      var10001.method_1305(var3, var1.method_524(16));
      this.field_1719 = var10001;
      int var4 = var1.method_518();
      int var5 = 0;

      while(true) {
         if(var5 < var4) {
            String var6 = var1.method_524(32767);
            String var7 = var1.method_524(32767);
            String var8 = var1.method_524(32767);
            PropertyMap var9 = this.field_1719.getProperties();
            Property var10002 = new Property;
            var10002.method_5531(var6, var7, var8);
            var9.put(var6, var10002);
            ++var5;
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         this.field_1720 = var1.readInt();
         this.field_1721 = var1.readInt();
         this.field_1722 = var1.readInt();
         this.field_1723 = var1.readByte();
         this.field_1724 = var1.readByte();
         this.field_1725 = var1.readShort();
         this.field_1727 = class_1710.method_9514(var1);
         break;
      }

   }

   // $FF: renamed from: c (d) void
   public void method_1454(class_112 var1) {
      String[] var2;
      String var6;
      label28: {
         var1.method_519(this.field_1718);
         UUID var3 = this.field_1719.getId();
         var2 = class_752.method_4253();
         UUID var10001 = var3;
         if(var2 != null) {
            if(var3 == null) {
               var6 = "";
               break label28;
            }

            var10001 = var3;
         }

         var6 = var10001.toString();
      }

      var1.method_525(var6);
      var1.method_525(this.field_1719.getName());
      var1.method_519(this.field_1719.getProperties().size());
      Iterator var4 = this.field_1719.getProperties().values().iterator();

      while(true) {
         if(var4.hasNext()) {
            Property var5 = (Property)var4.next();
            var1.method_525(var5.getName());
            var1.method_525(var5.getValue());
            var1.method_525(var5.getSignature());
            if(var2 == null) {
               break;
            }

            if(var2 != null) {
               continue;
            }
         }

         var1.writeInt(this.field_1720);
         var1.writeInt(this.field_1721);
         var1.writeInt(this.field_1722);
         var1.writeByte(this.field_1723);
         var1.writeByte(this.field_1724);
         var1.writeShort(this.field_1725);
         this.field_1726.method_9511(var1);
         break;
      }

   }

   // $FF: renamed from: b (tF) void
   public void method_1942(class_64 var1) {
      var1.method_277(this);
   }

   // $FF: renamed from: a () java.util.List
   public List method_1943() {
      String[] var1 = class_752.method_4253();
      List var10000 = this.field_1727;
      if(var1 != null) {
         if(this.field_1727 == null) {
            this.field_1727 = this.field_1726.method_9512();
         }

         var10000 = this.field_1727;
      }

      return var10000;
   }

   // $FF: renamed from: c () java.lang.String
   public String method_1457() {
      String[] var10000 = field_1729;
      return String.format("id=%d, gameProfile=\'%s\', x=%.2f, y=%.2f, z=%.2f, carried=%d", new Object[]{Integer.valueOf(this.field_1718), this.field_1719, Float.valueOf((float)this.field_1720 / 32.0F), Float.valueOf((float)this.field_1721 / 32.0F), Float.valueOf((float)this.field_1722 / 32.0F), Integer.valueOf(this.field_1725)});
   }

   // $FF: renamed from: e () int
   public int method_1944() {
      return this.field_1718;
   }

   // $FF: renamed from: f () com.mojang.authlib.GameProfile
   public GameProfile method_1945() {
      return this.field_1719;
   }

   // $FF: renamed from: g () int
   public int method_1946() {
      return this.field_1720;
   }

   // $FF: renamed from: h () int
   public int method_1947() {
      return this.field_1721;
   }

   // $FF: renamed from: i () int
   public int method_1948() {
      return this.field_1722;
   }

   // $FF: renamed from: j () byte
   public byte method_1949() {
      return this.field_1723;
   }

   // $FF: renamed from: k () byte
   public byte method_1950() {
      return this.field_1724;
   }

   // $FF: renamed from: l () int
   public int method_1951() {
      return this.field_1725;
   }

   // $FF: renamed from: b (rP) void
   public void method_1455(class_57 var1) {
      this.method_1942((class_64)var1);
   }

   // $FF: renamed from: <clinit> () void
   static void method_1458() {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "ëúø\\óë;Á¥î®äLÏ ¾VºÎ¨¿V÷ïIÛæÿ²õIóµê±QïáUæèäý¬äLË ¡A£­\bä·";
      int var4 = "ëúø\\óë;Á¥î®äLÏ ¾VºÎ¨¿V÷ïIÛæÿ²õIóµê±QïáUæèäý¬äLË ¡A£­\bä·".length();
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
                  field_1729 = var5;
                  String[] var10 = field_1729;
                  field_1728 = "CL_00001281";
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            }

            char var10007 = (char)((Object[])var9)[var6];
            short var10009;
            switch(var6 % 7) {
            case 0:
               var10009 = 45;
               break;
            case 1:
               var10009 = 68;
               break;
            case 2:
               var10009 = 86;
               break;
            case 3:
               var10009 = 182;
               break;
            case 4:
               var10009 = 79;
               break;
            case 5:
               var10009 = 77;
               break;
            default:
               var10009 = 233;
            }

            ((Object[])var9)[var6] = (char)(var10007 ^ var11 ^ var10009);
            ++var6;
         }
      }
   }
}
