class Solution {
   public static  String defangIPaddr(String address) {
        return  address.replace(".","[.]");
    }
}