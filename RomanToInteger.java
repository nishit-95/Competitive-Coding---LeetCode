    public class RomanToInteger {
        public int romanToInt(String s) {
            int sum = 0;
            char[] ch = s.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 'I') {
                    sum += 1;
                } else if (ch[i] == 'V') {
                    if (i > 0 && ch[i - 1] == 'I') {
                        sum -= 2;
                    }
                    sum += 5;
                } else if (ch[i] == 'X') {
                    if (i > 0 && ch[i - 1] == 'I') {
                        sum -= 2;
                    }
                    sum += 10;
                } else if (ch[i] == 'L') {
                    if (i > 0 && ch[i - 1] == 'X') {
                        sum -= 20;
                    }
                    sum += 50;
                } else if (ch[i] == 'C') {
                    if (i > 0 && ch[i - 1] == 'X') {
                        sum -= 20;
                    }
                    sum += 100;
                } else if (ch[i] == 'D') {
                    if (i > 0 && ch[i - 1] == 'C') {
                        sum -= 200;
                    }
                    sum += 500;
                } else if (ch[i] == 'M') {
                    if (i > 0 && ch[i - 1] == 'C') {
                        sum -= 200;
                    }
                    sum += 1000;
                } else {
                    return 0;
                }
            }
            return sum;
        }
    
        public static void main(String[] args) {
            RomanToInteger RomanToInteger = new RomanToInteger();
            
            String roman1 = "III";
            String roman2 = "IV";
            String roman3 = "IX";
            String roman4 = "LVIII";
            String roman5 = "MCMXCIV";
            
            System.out.println(roman1 + " converted to integer: " + RomanToInteger.romanToInt(roman1));
            System.out.println(roman2 + " converted to integer: " + RomanToInteger.romanToInt(roman2));
            System.out.println(roman3 + " converted to integer: " + RomanToInteger.romanToInt(roman3));
            System.out.println(roman4 + " converted to integer: " + RomanToInteger.romanToInt(roman4));
            System.out.println(roman5 + " converted to integer: " + RomanToInteger.romanToInt(roman5));
        }
    }
    

