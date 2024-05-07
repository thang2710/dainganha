package Java;

public class Main {

    public static void main(String[] args) {
        int so = 15;
        System.out.println(so);
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));       //Vị trí bắt đầu của chữ
        System.out.println(txt.toUpperCase());               //Chuyển thành chữ in hoa
        System.out.println(txt.toLowerCase());
        String firstName = "Vu";
        String lastName = "Thang";
        System.out .println(firstName.concat(lastName));    //Nối 2 string

        int x = 5;
        int y = 10;
        int z = Math.max(x, y);
        System.out.println(z);

        int abs1  = Math.abs(-8);                          //Giá trị tuyệt vời nhất của số
        System.out.println(abs1);

        int randomNum = (int)(Math.random() * 101);         // 0 to 100

        int time = 20;
        String result = (time < 18) ? "Good morning" : ((time >= 18 && time <= 24) ? "Good afternoon" : "Good evening");      //If.....else
        System.out.println(result);

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
        
        

    }
}