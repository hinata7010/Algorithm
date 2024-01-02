import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String subject = "자바 네트워크 프로그래밍";
        String str = "";
        int index;

        index = subject.indexOf("프로그래밍");
        if(index == -1)
        {
            System.out.println("존재하지 않는 문자열입니다.");
        }
        else
        {
            System.out.println(index + "번째에 존재함");
        }


        /*for (int i = 3; i < 7; i++) {
            str += subject.charAt(i);
            System.out.println(str);
        }*/
        /*
        StringBuilder sb = new StringBuilder("");
        for (int i = 3; i < 7; i++) {
            sb.append(subject.charAt(i));
        }

        String temp = sb.toString();

        System.out.println(temp);

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 3; i < 7; i++) {
            arrayList.add(String.valueOf(subject.charAt(i)));
        }

        for (String s : arrayList) {
            System.out.print(s);
        }*/
        /*String oldStr = "자바 문자열은 불변의 특징이 있다. 자바 문자열은 String타입이다.";
        String newStr;
        newStr = oldStr.replaceAll("자바", "Java");
        System.out.println(newStr);

        String ssn = "030123-4234567";
        int birthyear = Integer.parseInt(ssn.substring(0, 2));
        int whatgender = Integer.parseInt(ssn.substring(7, 8));
        String[] gender = {"남자", "여자"};
        int gennum = 0;
        int age = 0;
        switch (whatgender)
        {
            case 1 :
                age = 100 - birthyear + 24;
                gennum = 0;
                break;
            case 2 :
                age = 100 - birthyear + 24;
                gennum = 1;
                break;
            case 3 :
                age = 23 - birthyear + 1;
                gennum = 0;
                break;
            case 4:
                age = 23 - birthyear + 1;
                gennum = 1;
        }


        System.out.println("현재 나이는 " + age);
        System.out.println("성별은 " + gender[gennum]);*/
    }
}
