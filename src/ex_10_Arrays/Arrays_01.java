package ex_10_Arrays;

public class Arrays_01 {
    public static void main(String[] args) {
        int[] a = {2,3,4,5,6};

        int b[] = new int[5]; //Fixed size
        b[0] = 3;
        b[2]=4;
        System.out.println(b[0]);

        String[] names = {"naveen", "sangavi", "ithanya"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        String conatiners[] = new String[4];
        conatiners[0] = "abc";
        conatiners[1] = "def";
        conatiners[2] = "yui";
        conatiners[3] = "uio";
        System.out.println(conatiners[0] );
        System.out.println(conatiners[1] );
        System.out.println(conatiners[2] );
        System.out.println(conatiners[3] );

        boolean[] is_male_data = new boolean[2];
        is_male_data[0] =  true;
        is_male_data[1] =  false;
        System.out.println(is_male_data[0]);
        System.out.println(is_male_data[1]);

    }
}
