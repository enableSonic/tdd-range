public class Range {

    public boolean เริ่มต้นด้วยก้ามปูนะ(String set) {
        return set.startsWith("[");
    }

    public int หาค่าเริ่มต้น(String set) {
        if(เริ่มต้นด้วยก้ามปูนะ(set)) {
            return set.charAt(1) - 48;
        }
        return set.charAt(1) + 1 - 48;
    }
}
