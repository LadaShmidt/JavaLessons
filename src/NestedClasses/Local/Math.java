package NestedClasses.Local;
/*
    Local inner class располагается в блоках кода, таких как метод или конструктор.
    Local inner class не может быть static.
    Область видимости local inner class - это блок, в котором он находится.
    Local inner class может обращаться даже к private элементам внешнего класса.
    Local inner class может обращаться к элементам блока в котором она написан при условии что они final или effectively final.
    Effectively final элементы, это элементы значение которых мы не изменяем после их объявления.
*/
public class Math {
    public void getResult() {
        class Division {
            private int dividend;
            private int divider;
            public int getDividend() {
                return dividend;
            }
            public void setDividend(int dividend) {
                this.dividend = dividend;
            }
            public int getDivider() {
                return divider;
            }
            public void setDivider(int divider) {
                this.divider = divider;
            }
            public int getQuotient() {
                return dividend/divider;
            }
            public int getRemainder() {
                return dividend%divider;
            }
        }

        Division division = new Division();
        division.setDividend(21);
        division.setDivider(4);
        System.out.println("Dividend = " + division.getDividend());
        System.out.println("Divider = " + division.getDivider());
        System.out.println("Quotient = " + division.getQuotient());
        System.out.println("Remainder = " + division.getRemainder());
    }

}
