public class Main {

	public static String decode(String paramString) {
	    byte[] arrayOfByte1 = paramString.getBytes();
	    byte[] arrayOfByte2 = new byte[3];
	    for (byte b1 = 0; b1 < 3; b1++)
	      arrayOfByte2[b1] = (byte)(0x7F | paramString.length() & b1 ^ Main.class.getSimpleName().charAt(0) % Main.class.getSimpleName().length()); 
	    byte[] arrayOfByte3 = new byte[arrayOfByte1.length];
	    for (byte b2 = 0; b2 < arrayOfByte1.length; b2++)
	      arrayOfByte3[b2] = (byte)(arrayOfByte1[b2] ^ arrayOfByte2[b2 % arrayOfByte2.length]); 
	    return new String(arrayOfByte3);
	  }

	public static void main(String[] args) 
	{
	        System.out.println(decode("Here you put the encrypted string"));
	}
    }
	
}
