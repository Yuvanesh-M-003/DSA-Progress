// class Solution {
//     public boolean completePrime(int num) {
//         if (num < 2) return false;
//         int temp = num;
//         while (temp > 0) {
//             int dig = temp % 10;
//             if (dig != 2 && dig != 3 && dig != 5 && dig != 7) {
//                 return false;
//             }
//             temp /= 10;
//         }
//         while (num > 0) {
//             if (!isPrime(num)) {
//                 return false;
//             }
//             num /= 10;
//         }
        
//         return true;
//     }
//     public boolean isPrime(int n) {
//         if (n < 2) return false;
//         for (int i = 2; i * i <= n; i++) {
//             if (n % i == 0) return false;
//         }
//         return true;
//     }

// }



class Solution {
    private boolean isPrime(long n) {
        if (n < 2) return false;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public boolean completePrime(int num) {
        if (num < 2) return false;

        String s = String.valueOf(num);
        int len = s.length();

        for (int i = 1; i <= len; i++) {
            long prefix = Long.parseLong(s.substring(0, i));
            if (!isPrime(prefix)) {
                return false;
            }
        }

        for (int i = 0; i < len; i++) {
            long suffix = Long.parseLong(s.substring(i));
            if (!isPrime(suffix)) {
                return false;
            }
        }

        return true;
    }
}
