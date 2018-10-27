/*    */ package sha256;
/*    */ 
/*    */ import java.security.MessageDigest;
/*    */ 
/*    */ public class sha256
/*    */ {
/*    */   public static String get_SHA_512_SecurePassword(String passwordToHash, String salt) throws java.io.UnsupportedEncodingException
/*    */   {
/*  9 */     String generatedPassword = null;
/*    */     try {
/* 11 */       MessageDigest md = MessageDigest.getInstance("SHA-256");
/*    */       
/* 13 */       md.update(salt.getBytes("UTF-8"));
/*    */       
/*    */ 
/* 16 */       byte[] bytes = md.digest(passwordToHash.getBytes("UTF-8"));
/* 17 */       StringBuilder sb = new StringBuilder();
/* 18 */       for (int i = 0; i < bytes.length; i++) {
/* 19 */         sb.append(Integer.toString((bytes[i] & 0xFF) + 256, 16).substring(1));
/*    */       }
/* 21 */       generatedPassword = sb.toString();
/*    */     }
/*    */     catch (java.security.NoSuchAlgorithmException e) {
/* 24 */       e.printStackTrace();
/*    */     }
/* 26 */     return generatedPassword;
/*    */   }
/*    */   
/*    */   public static void mostrarResultado()
/*    */   {
/*    */     try {
/* 32 */       System.out.println(get_SHA_512_SecurePassword("pass", "sal"));
/*    */     } catch (java.io.UnsupportedEncodingException e) {
/* 34 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\denis\Desktop\Sha256.jar!\sha256\sha256.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */