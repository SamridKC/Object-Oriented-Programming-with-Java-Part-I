public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {

        int difference = 0;
        if(!this.earlier(comparedDate)) {
            difference = differenceInYearsHelper(this, comparedDate);
        }
        else {
            difference = differenceInYearsHelper(comparedDate, this);
        }
        return difference;
    }

    public int differenceInYearsHelper(MyDate firstDate, MyDate secondDate) {

        int difference = firstDate.year - secondDate.year;

        if (((firstDate.month + 12) - secondDate.month) < 12) {
            difference = (difference - 1);
        }
        if (firstDate.month == secondDate.month) {
            if (firstDate.day < secondDate.day) {
                difference = (difference - 1);
            }
        }
        return difference;
    }


//
//        public int differenceInYears(MyDate comparedDate) {
//
//        int difference = 0;
//
//        difference = this.year - comparedDate.year;
//
//        if(((this.month + 12) - comparedDate.month) < 12) {
//            return (difference - 1);
//        }
//        else if (this.month == comparedDate.month) {
//            if(this.day < comparedDate.day) {
//                return (difference - 1);
//            }
//            else {
//                return difference;
//            }
//        }
//        else {
//            return difference;
//        }
//    }
}
