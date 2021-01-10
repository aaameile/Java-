package Array;

public class PhoneNumber {
    public static void main(String[] args) {
        int[] arr = new int[] {1,8,0,4,6,7,5};
        int[] index = new int[]{0,1,1,2,3,4,2,1,5,3,6};
//        String tel = "";
//        for (int i = 0;i < index.length;i++){
//            tel +=arr[index[i]];
//        }
        //18382878925
        StringBuilder tel = new StringBuilder();
        for (int i : index) {
            tel.append(arr[i]);
        }

        System.out.println("联系方式" + tel);



        int[] arr1 = new int[] {1,8,2,9,3,7,5};
        int[] index1 = new int[]{0,1,4,1,2,1,5,1,3,2,6};
        StringBuilder telL = new StringBuilder();
        for (int value : index1) {
            //for (int i : arr1){
            telL.append(arr1[value]);
        }
        System.out.println("雒菲的联系方式 " + telL);


    }
}
