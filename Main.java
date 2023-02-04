
public class Main {
    public static void main(String[] args) {
        final String[] BELOW_TWENTY = { "", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь",
                "девять", "десять", "одинадцать", "двенадцадь", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать" };
        final String[] TENS = { "", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто" };
        final String[] THOUSANDS = {"", "тысяча", "две тысячи", "три тысячи", "четыре тысячи", "пять тысяч", "шесть тысяч", "семь тысяч", "восемь тысяч", "девять тысяч"};
        final String[] HUNDREDS = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};

        int[] sequense = new int[10000];
        for (int i = 1; i < sequense.length; i++) {
            sequense[i] = (int) (Math.random() * 1000000);
            if ((sequense[i] % 2 == 0) && (sequense[i] != 0) && (sequense[i] <= 10000)) {
                if (i % 2 != 0) {
                    if (sequense[i] < 20) {
                        System.out.println(BELOW_TWENTY[sequense[i]] + " | индекс числа - " + i);
                    } else if (sequense[i] < 100) {
                        int high = sequense[i] / 10;
                        int low = sequense[i] % 10;
                        String text = TENS[high];
                        if (low != 0) {
                            text = text + " " + BELOW_TWENTY[low];
                        }
                        System.out.println(text + " | индекс чиса - " + i);
                    } else if (sequense[i] < 1000) {
                        int veryHigh = sequense[i] / 100;
                        int high = (sequense[i] % 100) / 10;
                        int low = sequense[i] % 10;
                        String text = HUNDREDS[veryHigh];
                        if (high == 1) {
                            String numberOfHelp =  Integer.toString(high) + Integer.toString(low);
                            text = text + " " + BELOW_TWENTY[Integer.parseInt(numberOfHelp)];
                        }
                        else {
                            if(high != 0)
                                text = text + " " + TENS[high];
                            if(low != 0)
                                text = text + " " + BELOW_TWENTY[low];
                        }
                        System.out.println(text + " | индекс чилса - " + i);
                    } else if (sequense[i] < 10000) {
                        int superHigh = sequense[i] / 1000;
                        int veryHigh = (sequense[i] % 1000) / 100;
                        int high = (sequense[i] % 100) / 10;
                        int low = sequense[i] % 10;
                        String text = THOUSANDS[superHigh];
                        if (veryHigh != 0) {
                            text = text + " " +HUNDREDS[veryHigh];
                        }
                        if (high == 1) {
                            String numberOfHelp =  Integer.toString(high) + Integer.toString(low);
                            text = text + " " + BELOW_TWENTY[Integer.parseInt(numberOfHelp)];
                        } else {
                            if(high != 0)
                                text = text + " " + TENS[high];
                            if(low != 0)
                                text = text + " " + BELOW_TWENTY[low];
                        }
                        System.out.println(text + " | индекс числа - " + i);
                    }

                } else {
                    System.out.println(sequense[i] + " | индекс числа - " + i);
                }
            }
        }

    }
}