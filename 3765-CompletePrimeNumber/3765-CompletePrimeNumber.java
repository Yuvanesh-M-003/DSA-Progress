// Last updated: 7/27/2026, 12:38:52 PM
1// class Solution {
2//     public boolean completePrime(int num) {
3//         if (num < 2) return false;
4//         int temp = num;
5//         while (temp > 0) {
6//             int dig = temp % 10;
7//             if (dig != 2 && dig != 3 && dig != 5 && dig != 7) {
8//                 return false;
9//             }
10//             temp /= 10;
11//         }
12//         while (num > 0) {
13//             if (!isPrime(num)) {
14//                 return false;
15//             }
16//             num /= 10;
17//         }
18        
19//         return true;
20//     }
21//     public boolean isPrime(int n) {
22//         if (n < 2) return false;
23//         for (int i = 2; i * i <= n; i++) {
24//             if (n % i == 0) return false;
25//         }
26//         return true;
27//     }
28
29// }
30
31
32
33class Solution {
34    private boolean isPrime(long n) {
35        if (n < 2) return false;
36        for (long i = 2; i * i <= n; i++) {
37            if (n % i == 0) return false;
38        }
39        return true;
40    }
41
42    public boolean completePrime(int num) {
43        if (num < 2) return false;
44
45        String s = String.valueOf(num);
46        int len = s.length();
47
48        for (int i = 1; i <= len; i++) {
49            long prefix = Long.parseLong(s.substring(0, i));
50            if (!isPrime(prefix)) {
51                return false;
52            }
53        }
54
55        for (int i = 0; i < len; i++) {
56            long suffix = Long.parseLong(s.substring(i));
57            if (!isPrime(suffix)) {
58                return false;
59            }
60        }
61
62        return true;
63    }
64}
65