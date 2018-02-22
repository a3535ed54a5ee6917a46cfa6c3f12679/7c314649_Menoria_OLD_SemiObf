import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

// $FF: renamed from: _a
public class class_870 {

   // $FF: renamed from: k int
   private static int field_4226;
   // $FF: renamed from: a java.lang.String
   private static String field_4227;
   // $FF: renamed from: j java.lang.String
   private static String field_4228;
   // $FF: renamed from: b java.security.MessageDigest
   private static MessageDigest field_4229;
   // $FF: renamed from: c java.util.HashMap
   private static HashMap field_4230;
   // $FF: renamed from: d java.util.HashMap
   private static HashMap field_4231;
   // $FF: renamed from: e boolean
   private static final boolean field_4232 = false;
   // $FF: renamed from: f java.lang.String
   private static String field_4233;
   // $FF: renamed from: g java.util.HashMap
   private static HashMap field_4234;
   // $FF: renamed from: h java.util.HashMap
   private static HashMap field_4235;
   // $FF: renamed from: x java.lang.String
   private static final String field_4236 = "";
   private static PrintWriter writer;
   // $FF: renamed from: i java.lang.String[]
   private static final String[] field_4237;
   // $FF: renamed from: l java.lang.String[]
   private static final String[] field_4238;


   // $FF: renamed from: <init> () void
   public void method_5111() {
      super();
   }

   // $FF: renamed from: a (java.util.HashMap) void
   private static void method_5112(HashMap t) {
      method_5123(t, method_5135(-32607, 7838));
      method_5123(t, method_5135(-32588, 13529));
      method_5123(t, method_5135(-32584, 22047));
      method_5123(t, method_5135(-32591, -20393));
      method_5123(t, method_5135(-32581, 22633));
      method_5123(t, method_5135(-32589, -28042));
      method_5123(t, method_5135(-32592, 23939));
      method_5123(t, method_5135(-32598, 5573));
      method_5123(t, method_5135(-32583, -26552));
      method_5123(t, method_5135(-32582, 24310));
      method_5123(t, method_5135(-32595, -28792));
      method_5123(t, method_5135(-32586, 25538));
      method_5123(t, method_5135(-32579, -14000));
      method_5123(t, method_5135(-32605, 16405));
      method_5123(t, method_5135(-32597, -9591));
      method_5123(t, method_5135(-32585, -10987));
      method_5123(t, method_5135(-32604, 28941));
      method_5123(t, method_5135(-32593, -15184));
      method_5123(t, method_5135(-32590, -20437));
      method_5123(t, method_5135(-32596, 4754));
      method_5123(t, method_5135(-32606, -26433));
      method_5123(t, method_5135(-32602, -15315));
      method_5123(t, method_5135(-32600, 3848));
      method_5123(t, method_5135(-32577, 29813));
      method_5123(t, method_5135(-32580, 5216));
      method_5123(t, method_5135(-32594, -19662));
      method_5123(t, method_5135(-32608, -18656));
      method_5123(t, method_5135(-32599, 10679));
      method_5123(t, method_5135(-32601, -25633));
   }

   // $FF: renamed from: b (java.util.HashMap) void
   private static void method_5113(HashMap t) {}

   // $FF: renamed from: c (java.util.HashMap) void
   private static void method_5114(HashMap t) {}

   // $FF: renamed from: d (java.util.HashMap) void
   private static void method_5115(HashMap t) {}

   // $FF: renamed from: e (java.util.HashMap) void
   private static void method_5116(HashMap t) {}

   // $FF: renamed from: f (java.util.HashMap) void
   private static void method_5117(HashMap t) {}

   // $FF: renamed from: g (java.util.HashMap) void
   private static void method_5118(HashMap t) {}

   // $FF: renamed from: h (java.util.HashMap) void
   private static void method_5119(HashMap t) {}

   // $FF: renamed from: i (java.util.HashMap) void
   private static void method_5120(HashMap t) {}

   // $FF: renamed from: j (java.util.HashMap) void
   private static void method_5121(HashMap t) {}

   // $FF: renamed from: k (java.util.HashMap) void
   private static void method_5122(HashMap t) {}

   // $FF: renamed from: a (java.util.HashMap, java.lang.String) void
   private static void method_5123(HashMap table, String concatenatedString) {
      int concatStringLength = concatenatedString.length();
      int currentPos = 0;

      do {
         char currentStringLength = concatenatedString.charAt(currentPos++);
         String s0 = concatenatedString.substring(currentPos, currentPos + currentStringLength);
         currentPos += s0.length();
         currentStringLength = concatenatedString.charAt(currentPos++);
         String s1 = concatenatedString.substring(currentPos, currentPos + currentStringLength);
         currentPos += s1.length();
         table.put(new BigInteger(s1, 36), s0);
      } while(currentPos < concatStringLength);

   }

   // $FF: renamed from: a (java.lang.String) java.lang.String
   public static String method_5124(String originalName) {
      if(field_4229 == null) {
         return originalName;
      } else {
         try {
            int th = originalName.lastIndexOf("[") + 1;
            String simpleName = originalName.substring(th);
            if(th > 0 && simpleName.length() == 1) {
               return originalName;
            } else {
               boolean isDelimited = false;
               if(simpleName.charAt(0) == 76 && simpleName.charAt(simpleName.length() - 1) == 59) {
                  isDelimited = true;
                  simpleName = simpleName.substring(1, simpleName.length() - 1);
               }

               boolean isExternalFormat = simpleName.indexOf(46) > -1;
               if(isExternalFormat) {
                  simpleName = simpleName.replace('.', '/');
               }

               simpleName = simpleName + field_4233;
               String translatedName = method_5127(simpleName);
               if(translatedName == null) {
                  return originalName;
               } else {
                  if(isExternalFormat) {
                     translatedName = translatedName.replace('/', '.');
                  }

                  StringBuilder buffer = new StringBuilder();

                  for(int i = 0; i < th; ++i) {
                     buffer.append('[');
                  }

                  if(isDelimited) {
                     buffer.append('L');
                  }

                  buffer.append(translatedName);
                  if(isDelimited) {
                     buffer.append(';');
                  }

                  return buffer.toString();
               }
            }
         } catch (Throwable var8) {
            return originalName;
         }
      }
   }

   // $FF: renamed from: b (java.lang.String, java.lang.Class, java.lang.Class[]) java.lang.String
   public static String method_5125(String originalMethodName, Class clazz, Class[] classArray) {
      if(field_4229 != null && clazz != null) {
         try {
            String th = clazz.getName();
            String classInternalName = th.replace('.', '/');
            StringBuilder buffer = new StringBuilder();
            buffer.append(field_4233);
            buffer.append(originalMethodName);
            buffer.append(field_4233);
            if(classArray != null && classArray.length > 0) {
               for(int searchSuffix = 0; searchSuffix < classArray.length; ++searchSuffix) {
                  Class searchString = classArray[searchSuffix];
                  buffer.append(method_5130(searchString));
                  buffer.append(field_4233);
               }
            }

            String var10 = buffer.toString();
            String var11 = classInternalName + var10;
            String translatedName = method_5127(var11);
            if(translatedName != null) {
               return translatedName;
            } else {
               translatedName = method_5129(clazz, var10);
               return translatedName != null?translatedName:originalMethodName;
            }
         } catch (Throwable var9) {
            return originalMethodName;
         }
      } else {
         return originalMethodName;
      }
   }

   // $FF: renamed from: c (java.lang.Class, java.lang.String) java.lang.String
   public static String method_5126(Class clazz, String originalFieldName) {
      if(field_4229 != null && clazz != null) {
         try {
            String th = clazz.getName();
            String classInternalName = th.replace('.', '/');
            StringBuilder buffer = new StringBuilder();
            buffer.append(field_4233);
            buffer.append(originalFieldName);
            String searchSuffix = buffer.toString();
            String searchString = classInternalName + searchSuffix;
            String translatedName = method_5127(searchString);
            if(translatedName != null) {
               return translatedName;
            } else {
               translatedName = method_5129(clazz, searchSuffix);
               return translatedName != null?translatedName:originalFieldName;
            }
         } catch (Throwable var8) {
            return originalFieldName;
         }
      } else {
         return originalFieldName;
      }
   }

   // $FF: renamed from: b (java.lang.String) java.lang.String
   private static String method_5127(String searchString) {
      String translatedName = (String)field_4234.get(searchString);
      if(translatedName == null && translatedName != "") {
         field_4229.reset();

         try {
            field_4229.update(searchString.getBytes(field_4228));
         } catch (UnsupportedEncodingException var4) {
            ;
         }

         byte[] digestArray = field_4229.digest();
         BigInteger bi = new BigInteger(digestArray);
         translatedName = (String)field_4230.get(bi);
         if(translatedName != null) {
            translatedName = method_5128(searchString, translatedName);
            field_4234.put(searchString, translatedName);
         } else {
            field_4234.put(searchString, "");
         }
      }

      return translatedName == ""?null:translatedName;
   }

   // $FF: renamed from: a (java.lang.String, java.lang.String) java.lang.String
   private static String method_5128(String searchString, String encryptedNewName) {
      field_4229.reset();
      byte[] bytes = null;

      try {
         bytes = (searchString + field_4227).getBytes(field_4228);
      } catch (UnsupportedEncodingException var9) {
         ;
      }

      field_4229.update(bytes);
      byte[] digest = field_4229.digest();
      char[] encryptedCharArray = encryptedNewName.toCharArray();
      StringBuilder buffer = new StringBuilder(encryptedCharArray.length);

      for(int decryptedNewName = 0; decryptedNewName < encryptedCharArray.length; ++decryptedNewName) {
         char ch = encryptedCharArray[decryptedNewName];
         byte keyByte;
         if(decryptedNewName < digest.length - 1) {
            keyByte = digest[decryptedNewName];
         } else {
            keyByte = digest[decryptedNewName % digest.length];
         }

         buffer.append((char)(ch ^ (char)keyByte));
      }

      String var10 = buffer.toString();
      return var10;
   }

   // $FF: renamed from: a (java.lang.Class, java.lang.String) java.lang.String
   private static String method_5129(Class clazz, String searchSuffix) {
      ArrayList superiorClassInternalNames = method_5131(clazz);
      int size = superiorClassInternalNames.size();

      for(int i = 0; i < size; ++i) {
         String superiorClassInternalName = (String)superiorClassInternalNames.get(i);
         String searchString = superiorClassInternalName + searchSuffix;
         String translatedName = method_5127(searchString);
         if(translatedName != null) {
            return translatedName;
         }
      }

      return null;
   }

   // $FF: renamed from: a (java.lang.Class) java.lang.String
   private static String method_5130(Class clazz) {
      return field_4231.containsKey(clazz)?(String)field_4231.get(clazz):clazz.getName().replace('.', '/');
   }

   // $FF: renamed from: b (java.lang.Class) java.util.ArrayList
   private static ArrayList method_5131(Class clazz) {
      String className = clazz.getName();
      ArrayList cachedVec = (ArrayList)field_4235.get(className);
      if(cachedVec != null) {
         return cachedVec;
      } else {
         ArrayList returnVec = new ArrayList();
         HashMap processedClasses = new HashMap();
         method_5132(clazz, returnVec, processedClasses);
         field_4235.put(className, returnVec);
         return returnVec;
      }
   }

   // $FF: renamed from: b (java.lang.Class, java.util.ArrayList, java.util.HashMap) void
   private static void method_5132(Class clazz, ArrayList vec, HashMap processedClasses) {
      Class superClass = clazz.getSuperclass();
      if(superClass != null && !processedClasses.containsKey(superClass)) {
         vec.add(method_5133(superClass));
         processedClasses.put(superClass, superClass);
         method_5132(superClass, vec, processedClasses);
      }

      Class[] interfaces = clazz.getInterfaces();

      for(int i = 0; i < interfaces.length; ++i) {
         Class interfaceClass = interfaces[i];
         if(!processedClasses.containsKey(interfaceClass)) {
            vec.add(method_5133(interfaceClass));
            processedClasses.put(interfaceClass, interfaceClass);
            method_5132(interfaceClass, vec, processedClasses);
         }
      }

   }

   // $FF: renamed from: c (java.lang.Class) java.lang.String
   private static String method_5133(Class clazz) {
      return clazz.getName().replace('.', '/');
   }

   // $FF: renamed from: <clinit> () void
   static void method_5134() {
      // $FF: Couldn't be decompiled
   }

   // $FF: renamed from: a (int, int) java.lang.String
   private static String method_5135(int var0, int var1) {
      int var2 = (var0 ^ -32603) & '\uffff';
      if(field_4238[var2] == null) {
         char[] var3 = field_4237[var2].toCharArray();
         short var10000;
         switch(var3[0] & 255) {
         case 0:
            var10000 = 171;
            break;
         case 1:
            var10000 = 119;
            break;
         case 2:
            var10000 = 60;
            break;
         case 3:
            var10000 = 101;
            break;
         case 4:
            var10000 = 235;
            break;
         case 5:
            var10000 = 28;
            break;
         case 6:
            var10000 = 58;
            break;
         case 7:
            var10000 = 39;
            break;
         case 8:
            var10000 = 132;
            break;
         case 9:
            var10000 = 0;
            break;
         case 10:
            var10000 = 144;
            break;
         case 11:
            var10000 = 10;
            break;
         case 12:
            var10000 = 128;
            break;
         case 13:
            var10000 = 184;
            break;
         case 14:
            var10000 = 207;
            break;
         case 15:
            var10000 = 249;
            break;
         case 16:
            var10000 = 180;
            break;
         case 17:
            var10000 = 106;
            break;
         case 18:
            var10000 = 138;
            break;
         case 19:
            var10000 = 187;
            break;
         case 20:
            var10000 = 218;
            break;
         case 21:
            var10000 = 244;
            break;
         case 22:
            var10000 = 196;
            break;
         case 23:
            var10000 = 217;
            break;
         case 24:
            var10000 = 50;
            break;
         case 25:
            var10000 = 84;
            break;
         case 26:
            var10000 = 224;
            break;
         case 27:
            var10000 = 38;
            break;
         case 28:
            var10000 = 168;
            break;
         case 29:
            var10000 = 61;
            break;
         case 30:
            var10000 = 44;
            break;
         case 31:
            var10000 = 12;
            break;
         case 32:
            var10000 = 18;
            break;
         case 33:
            var10000 = 226;
            break;
         case 34:
            var10000 = 190;
            break;
         case 35:
            var10000 = 127;
            break;
         case 36:
            var10000 = 156;
            break;
         case 37:
            var10000 = 179;
            break;
         case 38:
            var10000 = 136;
            break;
         case 39:
            var10000 = 159;
            break;
         case 40:
            var10000 = 212;
            break;
         case 41:
            var10000 = 227;
            break;
         case 42:
            var10000 = 192;
            break;
         case 43:
            var10000 = 13;
            break;
         case 44:
            var10000 = 254;
            break;
         case 45:
            var10000 = 112;
            break;
         case 46:
            var10000 = 149;
            break;
         case 47:
            var10000 = 211;
            break;
         case 48:
            var10000 = 195;
            break;
         case 49:
            var10000 = 15;
            break;
         case 50:
            var10000 = 223;
            break;
         case 51:
            var10000 = 142;
            break;
         case 52:
            var10000 = 220;
            break;
         case 53:
            var10000 = 221;
            break;
         case 54:
            var10000 = 237;
            break;
         case 55:
            var10000 = 62;
            break;
         case 56:
            var10000 = 104;
            break;
         case 57:
            var10000 = 161;
            break;
         case 58:
            var10000 = 91;
            break;
         case 59:
            var10000 = 59;
            break;
         case 60:
            var10000 = 163;
            break;
         case 61:
            var10000 = 206;
            break;
         case 62:
            var10000 = 9;
            break;
         case 63:
            var10000 = 143;
            break;
         case 64:
            var10000 = 72;
            break;
         case 65:
            var10000 = 162;
            break;
         case 66:
            var10000 = 166;
            break;
         case 67:
            var10000 = 186;
            break;
         case 68:
            var10000 = 66;
            break;
         case 69:
            var10000 = 17;
            break;
         case 70:
            var10000 = 75;
            break;
         case 71:
            var10000 = 36;
            break;
         case 72:
            var10000 = 151;
            break;
         case 73:
            var10000 = 208;
            break;
         case 74:
            var10000 = 21;
            break;
         case 75:
            var10000 = 67;
            break;
         case 76:
            var10000 = 225;
            break;
         case 77:
            var10000 = 45;
            break;
         case 78:
            var10000 = 90;
            break;
         case 79:
            var10000 = 27;
            break;
         case 80:
            var10000 = 103;
            break;
         case 81:
            var10000 = 189;
            break;
         case 82:
            var10000 = 202;
            break;
         case 83:
            var10000 = 48;
            break;
         case 84:
            var10000 = 251;
            break;
         case 85:
            var10000 = 248;
            break;
         case 86:
            var10000 = 82;
            break;
         case 87:
            var10000 = 55;
            break;
         case 88:
            var10000 = 99;
            break;
         case 89:
            var10000 = 121;
            break;
         case 90:
            var10000 = 81;
            break;
         case 91:
            var10000 = 52;
            break;
         case 92:
            var10000 = 194;
            break;
         case 93:
            var10000 = 247;
            break;
         case 94:
            var10000 = 154;
            break;
         case 95:
            var10000 = 56;
            break;
         case 96:
            var10000 = 137;
            break;
         case 97:
            var10000 = 115;
            break;
         case 98:
            var10000 = 193;
            break;
         case 99:
            var10000 = 232;
            break;
         case 100:
            var10000 = 169;
            break;
         case 101:
            var10000 = 110;
            break;
         case 102:
            var10000 = 51;
            break;
         case 103:
            var10000 = 241;
            break;
         case 104:
            var10000 = 95;
            break;
         case 105:
            var10000 = 89;
            break;
         case 106:
            var10000 = 197;
            break;
         case 107:
            var10000 = 255;
            break;
         case 108:
            var10000 = 129;
            break;
         case 109:
            var10000 = 100;
            break;
         case 110:
            var10000 = 85;
            break;
         case 111:
            var10000 = 118;
            break;
         case 112:
            var10000 = 54;
            break;
         case 113:
            var10000 = 19;
            break;
         case 114:
            var10000 = 25;
            break;
         case 115:
            var10000 = 117;
            break;
         case 116:
            var10000 = 33;
            break;
         case 117:
            var10000 = 16;
            break;
         case 118:
            var10000 = 236;
            break;
         case 119:
            var10000 = 243;
            break;
         case 120:
            var10000 = 182;
            break;
         case 121:
            var10000 = 157;
            break;
         case 122:
            var10000 = 209;
            break;
         case 123:
            var10000 = 14;
            break;
         case 124:
            var10000 = 93;
            break;
         case 125:
            var10000 = 116;
            break;
         case 126:
            var10000 = 215;
            break;
         case 127:
            var10000 = 126;
            break;
         case 128:
            var10000 = 181;
            break;
         case 129:
            var10000 = 107;
            break;
         case 130:
            var10000 = 31;
            break;
         case 131:
            var10000 = 253;
            break;
         case 132:
            var10000 = 35;
            break;
         case 133:
            var10000 = 231;
            break;
         case 134:
            var10000 = 40;
            break;
         case 135:
            var10000 = 145;
            break;
         case 136:
            var10000 = 86;
            break;
         case 137:
            var10000 = 102;
            break;
         case 138:
            var10000 = 183;
            break;
         case 139:
            var10000 = 173;
            break;
         case 140:
            var10000 = 2;
            break;
         case 141:
            var10000 = 188;
            break;
         case 142:
            var10000 = 47;
            break;
         case 143:
            var10000 = 176;
            break;
         case 144:
            var10000 = 94;
            break;
         case 145:
            var10000 = 152;
            break;
         case 146:
            var10000 = 111;
            break;
         case 147:
            var10000 = 242;
            break;
         case 148:
            var10000 = 30;
            break;
         case 149:
            var10000 = 219;
            break;
         case 150:
            var10000 = 148;
            break;
         case 151:
            var10000 = 164;
            break;
         case 152:
            var10000 = 122;
            break;
         case 153:
            var10000 = 133;
            break;
         case 154:
            var10000 = 234;
            break;
         case 155:
            var10000 = 69;
            break;
         case 156:
            var10000 = 246;
            break;
         case 157:
            var10000 = 98;
            break;
         case 158:
            var10000 = 4;
            break;
         case 159:
            var10000 = 160;
            break;
         case 160:
            var10000 = 6;
            break;
         case 161:
            var10000 = 26;
            break;
         case 162:
            var10000 = 41;
            break;
         case 163:
            var10000 = 178;
            break;
         case 164:
            var10000 = 8;
            break;
         case 165:
            var10000 = 167;
            break;
         case 166:
            var10000 = 97;
            break;
         case 167:
            var10000 = 155;
            break;
         case 168:
            var10000 = 57;
            break;
         case 169:
            var10000 = 42;
            break;
         case 170:
            var10000 = 37;
            break;
         case 171:
            var10000 = 239;
            break;
         case 172:
            var10000 = 83;
            break;
         case 173:
            var10000 = 201;
            break;
         case 174:
            var10000 = 147;
            break;
         case 175:
            var10000 = 141;
            break;
         case 176:
            var10000 = 230;
            break;
         case 177:
            var10000 = 22;
            break;
         case 178:
            var10000 = 172;
            break;
         case 179:
            var10000 = 175;
            break;
         case 180:
            var10000 = 80;
            break;
         case 181:
            var10000 = 88;
            break;
         case 182:
            var10000 = 74;
            break;
         case 183:
            var10000 = 131;
            break;
         case 184:
            var10000 = 198;
            break;
         case 185:
            var10000 = 71;
            break;
         case 186:
            var10000 = 53;
            break;
         case 187:
            var10000 = 29;
            break;
         case 188:
            var10000 = 123;
            break;
         case 189:
            var10000 = 3;
            break;
         case 190:
            var10000 = 170;
            break;
         case 191:
            var10000 = 250;
            break;
         case 192:
            var10000 = 158;
            break;
         case 193:
            var10000 = 64;
            break;
         case 194:
            var10000 = 135;
            break;
         case 195:
            var10000 = 23;
            break;
         case 196:
            var10000 = 73;
            break;
         case 197:
            var10000 = 32;
            break;
         case 198:
            var10000 = 233;
            break;
         case 199:
            var10000 = 120;
            break;
         case 200:
            var10000 = 105;
            break;
         case 201:
            var10000 = 140;
            break;
         case 202:
            var10000 = 213;
            break;
         case 203:
            var10000 = 238;
            break;
         case 204:
            var10000 = 125;
            break;
         case 205:
            var10000 = 77;
            break;
         case 206:
            var10000 = 200;
            break;
         case 207:
            var10000 = 191;
            break;
         case 208:
            var10000 = 87;
            break;
         case 209:
            var10000 = 43;
            break;
         case 210:
            var10000 = 34;
            break;
         case 211:
            var10000 = 153;
            break;
         case 212:
            var10000 = 1;
            break;
         case 213:
            var10000 = 96;
            break;
         case 214:
            var10000 = 20;
            break;
         case 215:
            var10000 = 177;
            break;
         case 216:
            var10000 = 210;
            break;
         case 217:
            var10000 = 70;
            break;
         case 218:
            var10000 = 11;
            break;
         case 219:
            var10000 = 7;
            break;
         case 220:
            var10000 = 76;
            break;
         case 221:
            var10000 = 63;
            break;
         case 222:
            var10000 = 240;
            break;
         case 223:
            var10000 = 199;
            break;
         case 224:
            var10000 = 185;
            break;
         case 225:
            var10000 = 174;
            break;
         case 226:
            var10000 = 49;
            break;
         case 227:
            var10000 = 252;
            break;
         case 228:
            var10000 = 65;
            break;
         case 229:
            var10000 = 78;
            break;
         case 230:
            var10000 = 79;
            break;
         case 231:
            var10000 = 205;
            break;
         case 232:
            var10000 = 146;
            break;
         case 233:
            var10000 = 124;
            break;
         case 234:
            var10000 = 139;
            break;
         case 235:
            var10000 = 68;
            break;
         case 236:
            var10000 = 24;
            break;
         case 237:
            var10000 = 130;
            break;
         case 238:
            var10000 = 204;
            break;
         case 239:
            var10000 = 46;
            break;
         case 240:
            var10000 = 245;
            break;
         case 241:
            var10000 = 228;
            break;
         case 242:
            var10000 = 229;
            break;
         case 243:
            var10000 = 114;
            break;
         case 244:
            var10000 = 109;
            break;
         case 245:
            var10000 = 150;
            break;
         case 246:
            var10000 = 92;
            break;
         case 247:
            var10000 = 203;
            break;
         case 248:
            var10000 = 165;
            break;
         case 249:
            var10000 = 113;
            break;
         case 250:
            var10000 = 222;
            break;
         case 251:
            var10000 = 214;
            break;
         case 252:
            var10000 = 108;
            break;
         case 253:
            var10000 = 134;
            break;
         case 254:
            var10000 = 216;
            break;
         default:
            var10000 = 5;
         }

         short var4 = var10000;
         int var5 = (var1 & 255) - var4;
         if(var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & '\uffff') >>> 8) - var4;
         if(var6 < 0) {
            var6 += 256;
         }

         for(int var7 = 0; var7 < var3.length; ++var7) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if(var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 255;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 255;
            }
         }

         field_4238[var2] = (new String(var3)).intern();
      }

      return field_4238[var2];
   }
}
