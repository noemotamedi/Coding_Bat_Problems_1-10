public class Runner {

    //your main containing tests and output
    public static void main(String[] args) {
        System.out.println(sleepIn(true, false));
        System.out.println(stringTimes("hi", 8));
        System.out.println(helloName("carlos Matos"));
        System.out.println(cigarParty(6,true));
        System.out.println(makeBricks(4,34,34));
        System.out.println(doubleChar("fadasd"));
        System.out.println(countYZ("daisuhhdiuh az z a0udsa"));
        int[] ouyoukahhsvda={4,4,4,4,1352,245425};
        System.out.println(modThree(ouyoukahhsvda));
        int[] ouyoukahhsvd={4,4,4,4,1352,245425};
        System.out.println(canBalance(ouyoukahhsvd));
    }


    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public static String stringTimes(String str, int n) {
        String result = "";
        for (float i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars >= 40 && (cigars <= 60 || isWeekend)) {
            return true;
        }
        return false;
    }

    public static boolean makeBricks(int small, int big, int goal) {
        float sgoal = (goal - goal % 5) / 5;
        while (small >= goal % 5 + 5) {
            small -= 5;
            big++;
        }
        if (big >= sgoal) {
            if (small >= goal % 5) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            result += str.charAt(i);
        }
        return result;
    }

    public static int countYZ(String str) {
        int result=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length()-1;i++){
            if((str.charAt(i)=='y'||str.charAt(i)=='z')&&!Character.isLetter(str.charAt(i+1))){
                result++;
            }
        }
        if(str.charAt(str.length()-1)=='y'||str.charAt(str.length()-1)=='z'){
            result++;
        }
        return result;
    }

    public static boolean modThree(int[] nums) {
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]%2==nums[i+1]%2&&nums[i+1]%2==nums[i+2]%2){
                return true;
            }
        }
        return false;
    }

    public static boolean canBalance(int[] nums) {
        float total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        float currentTotal=total;
        for(int j=0;j<nums.length;j++){
            currentTotal-=nums[j];
            if(total/2==currentTotal){
                return true;
            }
        }
        return false;
    }
}