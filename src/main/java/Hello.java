public class Hello {
    public String say(String name) {
        if("".equals(name)){
            throw new InputInvalidException();
        }

        if("xxx".equals(name)) {
            throw new InputInvalidException();
        }

        return String.format("Hello %s", name);
    }
}
