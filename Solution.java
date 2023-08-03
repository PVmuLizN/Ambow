public class Solution {
    public static void main(String[] args) {
        // input two parameters from shell
        int time = 9;
        String gender = "female";
        result(time, gender);
    }

    private static boolean result(int time, String gender){
        if (time <= 10){
            if (gender.equals("mail")){
                System.out.println("男子组");
            }else if(gender.equals("female")){
                System.out.println("女子组");
            }
        }else{
            return false;
        }
        return true;
    }
}