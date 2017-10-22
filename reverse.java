class reverseInt {
    public int reverse(int x) {
        int y = 1;
        int soln = 0;
        int chop = 10;
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
        }
        
        while (x > 0) {
            int newDigit = (x % chop) / y;
            soln = soln * 10 + newDigit;
            x -= x % chop;
            y *= 10;
            chop *= 10;
        }
        
        if (isNegative) {
            soln *= -1;
        }
        
        return soln;
    }

    public static void main(String[] args) {
        reverseInt backwards = new reverseInt();
        System.out.println(backwards.reverse(123));
    }
}