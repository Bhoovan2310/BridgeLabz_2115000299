public class OTPGenerator {

    public static void main(String[] args) {
        int[] otpNumbers = new int[10];

        for (int i = 0; i < 10; i++) {
            otpNumbers[i] = generateOTP();
        }

        boolean areUnique = areOTPsUnique(otpNumbers);
        System.out.println("Are all OTPs unique? " + areUnique);
    }

    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean areOTPsUnique(int[] otpNumbers) {
        for (int i = 0; i < otpNumbers.length; i++) {
            for (int j = i + 1; j < otpNumbers.length; j++) {
                if (otpNumbers[i] == otpNumbers[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
